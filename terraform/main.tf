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

module "openapi_block_explorer" {
  source = "./modules/openapi"

  s3_bucket_name  = var.bucket
  s3_prefix       = "block-explorer"
  s3_default_file = "v3.yml"
  spec_path       = "${path.cwd}/../block-explorer"
}

# DAG

module "openapi_node" {
  source = "./modules/openapi"

  s3_bucket_name  = var.bucket
  s3_prefix       = "node"
  s3_default_file = "l0-public-v2.yml"
  spec_path       = "${path.cwd}/../dag/node"
}

module "openapi_node_owner" {
  source = "./modules/openapi"

  s3_bucket_name  = var.bucket
  s3_prefix       = "node-owner"
  s3_default_file = "v1.yml"
  spec_path       = "${path.cwd}/../dag/node-owner"
}

module "openapi_node_public" {
  source = "./modules/openapi"

  s3_bucket_name  = var.bucket
  s3_prefix       = "node-public"
  s3_default_file = "v1.yml"
  spec_path       = "${path.cwd}/../dag/node-public"
}

# Currency

module "openapi_currency_node_public_l0" {
  source = "./modules/openapi"

  s3_bucket_name  = var.bucket
  s3_prefix       = "currency/v${var.currency_version}/l0/public"
  s3_default_file = "public.yml"
  spec_path       = "${path.cwd}/../currency/l0"
}

module "openapi_currency_node_public_l1" {
  source = "./modules/openapi"

  s3_bucket_name  = var.bucket
  s3_prefix       = "currency/v${var.currency_version}/l1/public"
  s3_default_file = "public.yml"
  spec_path       = "${path.cwd}/../currency/l1"
}

module "openapi_currency_node_owner" {
  source = "./modules/openapi"

  s3_bucket_name  = var.bucket
  s3_prefix       = "currency/v${var.currency_version}/cli"
  s3_default_file = "cli.yml"
  spec_path       = "${path.cwd}/../currency/cli"
}
