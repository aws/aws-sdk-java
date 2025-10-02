#!/bin/bash

#
# Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License").
# You may not use this file except in compliance with the License.
# A copy of the License is located at
#
#  http://aws.amazon.com/apache2.0
#
# or in the "license" file accompanying this file. This file is distributed
# on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
# express or implied. See the License for the specific language governing
# permissions and limitations under the License.
#

tm_dl='tm_download'
tm_ul='tm_upload'

key='48TB'
path="/mnt/raid0/$key"

test=$tm_ul

mvn test -pl :aws-java-sdk-s3 \
    -Dtest=com.amazonaws.service.s3.LargeObjectTest#$test \
    -Dtestpath=$path \
    -Dtestkey=$key
