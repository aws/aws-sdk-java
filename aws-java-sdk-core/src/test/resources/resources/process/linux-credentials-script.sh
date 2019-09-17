#!/usr/bin/env bash
echo '{';
echo '"Version": 1,';
echo '"AccessKeyId": "accessKeyId",';
echo '"SecretAccessKey": "secretAccessKey"';
if [ $1 == 'SESSION_CREDENTIALS' ]; then
    echo ','
    echo '"SessionToken": "sessionToken",';
    echo '"Expiration": "2018-12-11T17:46:28Z"';
fi;
echo '}';