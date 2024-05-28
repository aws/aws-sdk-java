/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pipes.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3LogDestination JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3LogDestinationJsonUnmarshaller implements Unmarshaller<S3LogDestination, JsonUnmarshallerContext> {

    public S3LogDestination unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3LogDestination s3LogDestination = new S3LogDestination();

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
                    s3LogDestination.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BucketOwner", targetDepth)) {
                    context.nextToken();
                    s3LogDestination.setBucketOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputFormat", targetDepth)) {
                    context.nextToken();
                    s3LogDestination.setOutputFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    context.nextToken();
                    s3LogDestination.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3LogDestination;
    }

    private static S3LogDestinationJsonUnmarshaller instance;

    public static S3LogDestinationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3LogDestinationJsonUnmarshaller();
        return instance;
    }
}
