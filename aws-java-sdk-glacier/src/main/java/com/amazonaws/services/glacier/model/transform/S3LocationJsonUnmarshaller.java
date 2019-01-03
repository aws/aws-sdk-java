/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3Location JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3LocationJsonUnmarshaller implements Unmarshaller<S3Location, JsonUnmarshallerContext> {

    public S3Location unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3Location s3Location = new S3Location();

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
                if (context.testExpression("BucketName", targetDepth)) {
                    context.nextToken();
                    s3Location.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    context.nextToken();
                    s3Location.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encryption", targetDepth)) {
                    context.nextToken();
                    s3Location.setEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CannedACL", targetDepth)) {
                    context.nextToken();
                    s3Location.setCannedACL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessControlList", targetDepth)) {
                    context.nextToken();
                    s3Location.setAccessControlList(new ListUnmarshaller<Grant>(GrantJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Tagging", targetDepth)) {
                    context.nextToken();
                    s3Location.setTagging(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("UserMetadata", targetDepth)) {
                    context.nextToken();
                    s3Location
                            .setUserMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("StorageClass", targetDepth)) {
                    context.nextToken();
                    s3Location.setStorageClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3Location;
    }

    private static S3LocationJsonUnmarshaller instance;

    public static S3LocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3LocationJsonUnmarshaller();
        return instance;
    }
}
