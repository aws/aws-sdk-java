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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeNotebookInstanceLifecycleConfigResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller implements
        Unmarshaller<DescribeNotebookInstanceLifecycleConfigResult, JsonUnmarshallerContext> {

    public DescribeNotebookInstanceLifecycleConfigResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfigResult = new DescribeNotebookInstanceLifecycleConfigResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeNotebookInstanceLifecycleConfigResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("NotebookInstanceLifecycleConfigArn", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceLifecycleConfigResult.setNotebookInstanceLifecycleConfigArn(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
                if (context.testExpression("NotebookInstanceLifecycleConfigName", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceLifecycleConfigResult.setNotebookInstanceLifecycleConfigName(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
                if (context.testExpression("OnCreate", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceLifecycleConfigResult.setOnCreate(new ListUnmarshaller<NotebookInstanceLifecycleHook>(
                            NotebookInstanceLifecycleHookJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("OnStart", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceLifecycleConfigResult.setOnStart(new ListUnmarshaller<NotebookInstanceLifecycleHook>(
                            NotebookInstanceLifecycleHookJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceLifecycleConfigResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(
                            context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeNotebookInstanceLifecycleConfigResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeNotebookInstanceLifecycleConfigResult;
    }

    private static DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller instance;

    public static DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller();
        return instance;
    }
}
