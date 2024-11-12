terraform {
  backend "s3" {
    bucket = "constellationlabs-tf"
    key    = "apidoc"
    region = "us-west-1"
  }
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 4.8.0"
    }
    null-resource = {
      source  = "hashicorp/null"
      version = "~> 3.1.1"
    }
  }
}

provider "aws" {
  region = var.aws_region
}

module "bucket" {
  source = "./modules/bucket"
  bucket = var.bucket
}

module "openapi_block_explorer" {
  source = "./modules/openapi"

  s3_bucket_name  = module.bucket.bucket
  s3_prefix       = "block-explorer"
  s3_default_file = "v3.yml"
  spec_path       = "${path.cwd}/../block-explorer"
}
