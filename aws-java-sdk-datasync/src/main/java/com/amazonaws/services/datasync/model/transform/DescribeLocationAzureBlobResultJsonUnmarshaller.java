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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeLocationAzureBlobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationAzureBlobResultJsonUnmarshaller implements Unmarshaller<DescribeLocationAzureBlobResult, JsonUnmarshallerContext> {

    public DescribeLocationAzureBlobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeLocationAzureBlobResult describeLocationAzureBlobResult = new DescribeLocationAzureBlobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeLocationAzureBlobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LocationArn", targetDepth)) {
                    context.nextToken();
                    describeLocationAzureBlobResult.setLocationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationUri", targetDepth)) {
                    context.nextToken();
                    describeLocationAzureBlobResult.setLocationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthenticationType", targetDepth)) {
                    context.nextToken();
                    describeLocationAzureBlobResult.setAuthenticationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlobType", targetDepth)) {
                    context.nextToken();
                    describeLocationAzureBlobResult.setBlobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessTier", targetDepth)) {
                    context.nextToken();
                    describeLocationAzureBlobResult.setAccessTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AgentArns", targetDepth)) {
                    context.nextToken();
                    describeLocationAzureBlobResult.setAgentArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeLocationAzureBlobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeLocationAzureBlobResult;
    }

    private static DescribeLocationAzureBlobResultJsonUnmarshaller instance;

    public static DescribeLocationAzureBlobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLocationAzureBlobResultJsonUnmarshaller();
        return instance;
    }
}
