/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simplesystemsmanagement.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CommandInvocationMarshaller
 */
public class CommandInvocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(CommandInvocation commandInvocation,
            JSONWriter jsonWriter) {
        if (commandInvocation == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (commandInvocation.getCommandId() != null) {
                jsonWriter.key("CommandId").value(
                        commandInvocation.getCommandId());
            }

            if (commandInvocation.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(
                        commandInvocation.getInstanceId());
            }

            if (commandInvocation.getComment() != null) {
                jsonWriter.key("Comment").value(commandInvocation.getComment());
            }

            if (commandInvocation.getDocumentName() != null) {
                jsonWriter.key("DocumentName").value(
                        commandInvocation.getDocumentName());
            }

            if (commandInvocation.getRequestedDateTime() != null) {
                jsonWriter.key("RequestedDateTime").value(
                        commandInvocation.getRequestedDateTime());
            }

            if (commandInvocation.getStatus() != null) {
                jsonWriter.key("Status").value(commandInvocation.getStatus());
            }

            if (commandInvocation.getTraceOutput() != null) {
                jsonWriter.key("TraceOutput").value(
                        commandInvocation.getTraceOutput());
            }

            com.amazonaws.internal.SdkInternalList<CommandPlugin> commandPluginsList = (com.amazonaws.internal.SdkInternalList<CommandPlugin>) commandInvocation
                    .getCommandPlugins();
            if (!commandPluginsList.isEmpty()
                    || !commandPluginsList.isAutoConstruct()) {
                jsonWriter.key("CommandPlugins");
                jsonWriter.array();
                for (CommandPlugin commandPluginsListValue : commandPluginsList) {
                    if (commandPluginsListValue != null) {

                        CommandPluginJsonMarshaller.getInstance().marshall(
                                commandPluginsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommandInvocationJsonMarshaller instance;

    public static CommandInvocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandInvocationJsonMarshaller();
        return instance;
    }

}
