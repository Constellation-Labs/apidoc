mkdir -p ${module_path}/tmp/${s3_prefix}
sed 's/--here--/\/${s3_prefix}\/${s3_file_name}/g' ${module_path}/templates/index.html > ${module_path}/tmp/${s3_prefix}/index.html
cp ${spec_path}/* ${module_path}/tmp/${s3_prefix}/
cp ${module_path}/templates/static/* ${module_path}/tmp/${s3_prefix}/
aws s3 sync --acl ${acl} ${module_path}/tmp/${s3_prefix}/ s3://${s3_bucket_name}/${s3_prefix}/
rm -r ${module_path}/tmp/${s3_prefix}
