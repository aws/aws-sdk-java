@ECHO OFF
SET input=%1
ECHO {
ECHO "Version": 1,
ECHO "AccessKeyId": "accessKeyId",
ECHO "SecretAccessKey": "secretAccessKey"
IF "%input%"=="SESSION_CREDENTIALS" (
    ECHO ,
    ECHO "SessionToken": "sessionToken",
    ECHO "Expiration": "2018-12-11T17:46:28Z"
)
echo }