[default]
region = us-west-2
endpoint_url = https://global-endpoint-override.aws
ignore_configured_endpoint_urls = false
services = my-services

[services my-services]
region = us-west-2
s3 =
  endpoint_url = https://s3-endpoint-override.aws

[profile reusing-my-services]
output = json
services = my-services