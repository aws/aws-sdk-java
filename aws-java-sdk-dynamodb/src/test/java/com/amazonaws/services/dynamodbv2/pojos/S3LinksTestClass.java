/*
 * Copyright 2013-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.pojos;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.S3Link;

/**
 * Test domain class with a single string key, and two S3Links
 */
@DynamoDBTable(tableName = "aws-java-sdk-util")
public class S3LinksTestClass {

    private String key;
    private S3Link s3LinkWest;
    private S3Link s3LinkEast;

    @DynamoDBHashKey
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public S3LinksTestClass withKey(String key) {
        setKey(key);
        return this;
    }

    public S3Link getS3LinkWest() {
        return s3LinkWest;
    }

    public void setS3LinkWest(S3Link s3LinkAttribute) {
        this.s3LinkWest = s3LinkAttribute;
    }

    public S3Link getS3LinkEast() {
        return s3LinkEast;
    }

    public void setS3LinkEast(S3Link s3LinkEast) {
        this.s3LinkEast = s3LinkEast;
    }
}
