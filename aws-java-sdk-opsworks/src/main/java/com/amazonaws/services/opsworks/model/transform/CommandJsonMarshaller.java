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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CommandMarshaller
 */
public class CommandJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Command command, JSONWriter jsonWriter) {
        if (command == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (command.getCommandId() != null) {
                jsonWriter.key("CommandId").value(command.getCommandId());
            }

            if (command.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(command.getInstanceId());
            }

            if (command.getDeploymentId() != null) {
                jsonWriter.key("DeploymentId").value(command.getDeploymentId());
            }

            if (command.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(command.getCreatedAt());
            }

            if (command.getAcknowledgedAt() != null) {
                jsonWriter.key("AcknowledgedAt").value(
                        command.getAcknowledgedAt());
            }

            if (command.getCompletedAt() != null) {
                jsonWriter.key("CompletedAt").value(command.getCompletedAt());
            }

            if (command.getStatus() != null) {
                jsonWriter.key("Status").value(command.getStatus());
            }

            if (command.getExitCode() != null) {
                jsonWriter.key("ExitCode").value(command.getExitCode());
            }

            if (command.getLogUrl() != null) {
                jsonWriter.key("LogUrl").value(command.getLogUrl());
            }

            if (command.getType() != null) {
                jsonWriter.key("Type").value(command.getType());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommandJsonMarshaller instance;

    public static CommandJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandJsonMarshaller();
        return instance;
    }

}
