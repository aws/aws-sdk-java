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
 * Command JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommandJsonUnmarshaller implements Unmarshaller<Command, JsonUnmarshallerContext> {

    public Command unmarshall(JsonUnmarshallerContext context) throws Exception {
        Command command = new Command();

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
                    command.setCommandId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    context.nextToken();
                    command.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    command.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Comment", targetDepth)) {
                    context.nextToken();
                    command.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpiresAfter", targetDepth)) {
                    context.nextToken();
                    command.setExpiresAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    command.setParameters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("InstanceIds", targetDepth)) {
                    context.nextToken();
                    command.setInstanceIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    context.nextToken();
                    command.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RequestedDateTime", targetDepth)) {
                    context.nextToken();
                    command.setRequestedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    command.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    context.nextToken();
                    command.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3Region", targetDepth)) {
                    context.nextToken();
                    command.setOutputS3Region(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3BucketName", targetDepth)) {
                    context.nextToken();
                    command.setOutputS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3KeyPrefix", targetDepth)) {
                    context.nextToken();
                    command.setOutputS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    context.nextToken();
                    command.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    context.nextToken();
                    command.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetCount", targetDepth)) {
                    context.nextToken();
                    command.setTargetCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompletedCount", targetDepth)) {
                    context.nextToken();
                    command.setCompletedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ErrorCount", targetDepth)) {
                    context.nextToken();
                    command.setErrorCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryTimedOutCount", targetDepth)) {
                    context.nextToken();
                    command.setDeliveryTimedOutCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    command.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationConfig", targetDepth)) {
                    context.nextToken();
                    command.setNotificationConfig(NotificationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchOutputConfig", targetDepth)) {
                    context.nextToken();
                    command.setCloudWatchOutputConfig(CloudWatchOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return command;
    }

    private static CommandJsonUnmarshaller instance;

    public static CommandJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommandJsonUnmarshaller();
        return instance;
    }
}
