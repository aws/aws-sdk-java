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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeHubResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHubResultJsonUnmarshaller implements Unmarshaller<DescribeHubResult, JsonUnmarshallerContext> {

    public DescribeHubResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeHubResult describeHubResult = new DescribeHubResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeHubResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HubName", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setHubName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubArn", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setHubArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubDisplayName", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setHubDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubDescription", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setHubDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubSearchKeywords", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setHubSearchKeywords(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("S3StorageConfig", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setS3StorageConfig(HubS3StorageConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HubStatus", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setHubStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeHubResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeHubResult;
    }

    private static DescribeHubResultJsonUnmarshaller instance;

    public static DescribeHubResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHubResultJsonUnmarshaller();
        return instance;
    }
}
