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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCommandInvocationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCommandInvocationResultJsonUnmarshaller implements Unmarshaller<GetCommandInvocationResult, JsonUnmarshallerContext> {

    public GetCommandInvocationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCommandInvocationResult getCommandInvocationResult = new GetCommandInvocationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCommandInvocationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CommandId", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setCommandId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Comment", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PluginName", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setPluginName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResponseCode", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setResponseCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionStartDateTime", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setExecutionStartDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionElapsedTime", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setExecutionElapsedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionEndDateTime", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setExecutionEndDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardOutputContent", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setStandardOutputContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardOutputUrl", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setStandardOutputUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardErrorContent", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setStandardErrorContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardErrorUrl", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setStandardErrorUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchOutputConfig", targetDepth)) {
                    context.nextToken();
                    getCommandInvocationResult.setCloudWatchOutputConfig(CloudWatchOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getCommandInvocationResult;
    }

    private static GetCommandInvocationResultJsonUnmarshaller instance;

    public static GetCommandInvocationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCommandInvocationResultJsonUnmarshaller();
        return instance;
    }
}
