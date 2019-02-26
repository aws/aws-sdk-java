/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling.marshallers;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.StringAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.S3Link;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A marshaller that marshals {@code S3Link} objects to DynamoDB Strings,
 * using a JSON encoding. For example: {"s3":{"region":"us-west-2",
 *  "bucket":"my-bucket-name", "key": "foo/bar/baz.txt"}}.
 */
public class S3LinkToStringMarshaller implements StringAttributeMarshaller {

    private static final S3LinkToStringMarshaller INSTANCE =
            new S3LinkToStringMarshaller();

    public static S3LinkToStringMarshaller instance() {
        return INSTANCE;
    }

    private S3LinkToStringMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        S3Link s3link = (S3Link) obj;

        if ( s3link.getBucketName() == null || s3link.getKey() == null ) {
            // insufficient S3 resource specification
            return null;
        }

        return new AttributeValue().withS(s3link.toJson());
    }
}
