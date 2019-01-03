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
 * CommandInvocation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommandInvocationJsonUnmarshaller implements Unmarshaller<CommandInvocation, JsonUnmarshallerContext> {

    public CommandInvocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        CommandInvocation commandInvocation = new CommandInvocation();

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
                if (context.testExpression("CommandId", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setCommandId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceName", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Comment", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestedDateTime", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setRequestedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TraceOutput", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setTraceOutput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardOutputUrl", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setStandardOutputUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardErrorUrl", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setStandardErrorUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CommandPlugins", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setCommandPlugins(new ListUnmarshaller<CommandPlugin>(CommandPluginJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationConfig", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setNotificationConfig(NotificationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchOutputConfig", targetDepth)) {
                    context.nextToken();
                    commandInvocation.setCloudWatchOutputConfig(CloudWatchOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return commandInvocation;
    }

    private static CommandInvocationJsonUnmarshaller instance;

    public static CommandInvocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommandInvocationJsonUnmarshaller();
        return instance;
    }
}
