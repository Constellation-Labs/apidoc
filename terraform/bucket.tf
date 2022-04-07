resource "aws_s3_bucket" "apidoc" {
  bucket = var.bucket
}

resource "aws_s3_bucket_acl" "apidoc_acl" {
  bucket = aws_s3_bucket.apidoc.bucket
  acl    = "public-read"
}

resource "aws_s3_bucket_policy" "apidoc_policy" {
  bucket = aws_s3_bucket.apidoc.bucket

  policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "PublicReadGetObject",
            "Effect": "Allow",
            "Principal": "*",
            "Action": [
                "s3:GetObject"
            ],
            "Resource": [
                "arn:aws:s3:::${var.bucket}/*"
            ]
        }
    ]
}
EOF

}

resource "aws_s3_bucket_website_configuration" "apidoc_website" {
  bucket = aws_s3_bucket.apidoc.bucket

  index_document {
    suffix = "index.html"
  }

  error_document {
    key = "error.html"
  }
}
