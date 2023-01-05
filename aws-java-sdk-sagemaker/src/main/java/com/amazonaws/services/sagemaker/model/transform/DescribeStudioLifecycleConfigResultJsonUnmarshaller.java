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
 * DescribeStudioLifecycleConfigResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStudioLifecycleConfigResultJsonUnmarshaller implements Unmarshaller<DescribeStudioLifecycleConfigResult, JsonUnmarshallerContext> {

    public DescribeStudioLifecycleConfigResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeStudioLifecycleConfigResult describeStudioLifecycleConfigResult = new DescribeStudioLifecycleConfigResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeStudioLifecycleConfigResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("StudioLifecycleConfigArn", targetDepth)) {
                    context.nextToken();
                    describeStudioLifecycleConfigResult.setStudioLifecycleConfigArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StudioLifecycleConfigName", targetDepth)) {
                    context.nextToken();
                    describeStudioLifecycleConfigResult.setStudioLifecycleConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeStudioLifecycleConfigResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeStudioLifecycleConfigResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StudioLifecycleConfigContent", targetDepth)) {
                    context.nextToken();
                    describeStudioLifecycleConfigResult.setStudioLifecycleConfigContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StudioLifecycleConfigAppType", targetDepth)) {
                    context.nextToken();
                    describeStudioLifecycleConfigResult.setStudioLifecycleConfigAppType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeStudioLifecycleConfigResult;
    }

    private static DescribeStudioLifecycleConfigResultJsonUnmarshaller instance;

    public static DescribeStudioLifecycleConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeStudioLifecycleConfigResultJsonUnmarshaller();
        return instance;
    }
}
