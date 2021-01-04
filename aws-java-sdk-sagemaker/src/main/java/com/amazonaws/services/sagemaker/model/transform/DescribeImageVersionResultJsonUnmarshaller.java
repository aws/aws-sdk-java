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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeImageVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageVersionResultJsonUnmarshaller implements Unmarshaller<DescribeImageVersionResult, JsonUnmarshallerContext> {

    public DescribeImageVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeImageVersionResult describeImageVersionResult = new DescribeImageVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeImageVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("BaseImage", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setBaseImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContainerImage", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setContainerImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageArn", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setImageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageVersionArn", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setImageVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageVersionStatus", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setImageVersionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    describeImageVersionResult.setVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeImageVersionResult;
    }

    private static DescribeImageVersionResultJsonUnmarshaller instance;

    public static DescribeImageVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeImageVersionResultJsonUnmarshaller();
        return instance;
    }
}
