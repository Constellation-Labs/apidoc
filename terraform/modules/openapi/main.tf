locals {
  acl = "private"
}

resource "null_resource" "openapi_static" {
  triggers = {
    s3_bucket_path = var.s3_bucket_name
  }

  provisioner "local-exec" {
    command = "aws s3 sync --acl ${local.acl} ${path.module}/templates/static s3://${var.s3_bucket_name}/${var.s3_prefix}"
  }
}

resource "null_resource" "openapi" {
  triggers = {
    s3_bucket_path = var.s3_bucket_name
    s3_prefix = var.s3_prefix
    openapi_spec_sha1 = sha1(file(join("/", [var.spec_path, var.s3_file_name])))
  }

  provisioner "local-exec" {
    command = templatefile("${path.module}/templates/copy.sh.tpl", {
      acl = local.acl
      module_path = path.module
      spec_path = var.spec_path
      s3_bucket_name = var.s3_bucket_name
      s3_prefix = var.s3_prefix
      s3_file_name = var.s3_file_name
    })
  }
}

// aws s3 rm s3://apidoc-dev.constellationnetwork.io --recursive
