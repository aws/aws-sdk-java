/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3FileLocation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3FileLocationJsonUnmarshaller implements Unmarshaller<S3FileLocation, JsonUnmarshallerContext> {

    public S3FileLocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3FileLocation s3FileLocation = new S3FileLocation();

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
                if (context.testExpression("Bucket", targetDepth)) {
                    context.nextToken();
                    s3FileLocation.setBucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Key", targetDepth)) {
                    context.nextToken();
                    s3FileLocation.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionId", targetDepth)) {
                    context.nextToken();
                    s3FileLocation.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Etag", targetDepth)) {
                    context.nextToken();
                    s3FileLocation.setEtag(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3FileLocation;
    }

    private static S3FileLocationJsonUnmarshaller instance;

    public static S3FileLocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3FileLocationJsonUnmarshaller();
        return instance;
    }
}
