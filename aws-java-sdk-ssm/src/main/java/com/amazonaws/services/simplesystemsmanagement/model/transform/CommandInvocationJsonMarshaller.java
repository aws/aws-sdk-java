/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CommandInvocationMarshaller
 */
public class CommandInvocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CommandInvocation commandInvocation, StructuredJsonGenerator jsonGenerator) {

        if (commandInvocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (commandInvocation.getCommandId() != null) {
                jsonGenerator.writeFieldName("CommandId").writeValue(commandInvocation.getCommandId());
            }
            if (commandInvocation.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(commandInvocation.getInstanceId());
            }
            if (commandInvocation.getComment() != null) {
                jsonGenerator.writeFieldName("Comment").writeValue(commandInvocation.getComment());
            }
            if (commandInvocation.getDocumentName() != null) {
                jsonGenerator.writeFieldName("DocumentName").writeValue(commandInvocation.getDocumentName());
            }
            if (commandInvocation.getRequestedDateTime() != null) {
                jsonGenerator.writeFieldName("RequestedDateTime").writeValue(commandInvocation.getRequestedDateTime());
            }
            if (commandInvocation.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(commandInvocation.getStatus());
            }
            if (commandInvocation.getTraceOutput() != null) {
                jsonGenerator.writeFieldName("TraceOutput").writeValue(commandInvocation.getTraceOutput());
            }

            com.amazonaws.internal.SdkInternalList<CommandPlugin> commandPluginsList = (com.amazonaws.internal.SdkInternalList<CommandPlugin>) commandInvocation
                    .getCommandPlugins();
            if (!commandPluginsList.isEmpty() || !commandPluginsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("CommandPlugins");
                jsonGenerator.writeStartArray();
                for (CommandPlugin commandPluginsListValue : commandPluginsList) {
                    if (commandPluginsListValue != null) {

                        CommandPluginJsonMarshaller.getInstance().marshall(commandPluginsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (commandInvocation.getServiceRole() != null) {
                jsonGenerator.writeFieldName("ServiceRole").writeValue(commandInvocation.getServiceRole());
            }
            if (commandInvocation.getNotificationConfig() != null) {
                jsonGenerator.writeFieldName("NotificationConfig");
                NotificationConfigJsonMarshaller.getInstance().marshall(commandInvocation.getNotificationConfig(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommandInvocationJsonMarshaller instance;

    public static CommandInvocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandInvocationJsonMarshaller();
        return instance;
    }

}
