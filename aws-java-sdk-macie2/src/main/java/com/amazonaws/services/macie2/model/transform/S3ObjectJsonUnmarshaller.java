/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3Object JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ObjectJsonUnmarshaller implements Unmarshaller<S3Object, JsonUnmarshallerContext> {

    public S3Object unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3Object s3Object = new S3Object();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("bucketArn", targetDepth)) {
                    context.nextToken();
                    s3Object.setBucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eTag", targetDepth)) {
                    context.nextToken();
                    s3Object.setETag(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("extension", targetDepth)) {
                    context.nextToken();
                    s3Object.setExtension(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    context.nextToken();
                    s3Object.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModified", targetDepth)) {
                    context.nextToken();
                    s3Object.setLastModified(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    context.nextToken();
                    s3Object.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publicAccess", targetDepth)) {
                    context.nextToken();
                    s3Object.setPublicAccess(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("serverSideEncryption", targetDepth)) {
                    context.nextToken();
                    s3Object.setServerSideEncryption(ServerSideEncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("size", targetDepth)) {
                    context.nextToken();
                    s3Object.setSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("storageClass", targetDepth)) {
                    context.nextToken();
                    s3Object.setStorageClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    s3Object.setTags(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("versionId", targetDepth)) {
                    context.nextToken();
                    s3Object.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3Object;
    }

    private static S3ObjectJsonUnmarshaller instance;

    public static S3ObjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ObjectJsonUnmarshaller();
        return instance;
    }
}
