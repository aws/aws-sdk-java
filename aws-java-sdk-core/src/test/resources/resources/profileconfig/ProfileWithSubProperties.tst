[source]
aws_access_key_id=defaultAccessKey
aws_secret_access_key=defaultSecretAccessKey
endpoint_url = https://global-endpoint-override.aws

[test]
source_profile=source
role_arn=arn:aws:iam::123456789012:role/testRole
role_session_name=testSessionName
external_id=testExternalId
s3 =
  endpoint_url = https://s3-endpoint-override.aws