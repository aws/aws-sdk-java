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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CommandMarshaller
 */
public class CommandJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Command command, StructuredJsonGenerator jsonGenerator) {

        if (command == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (command.getCommandId() != null) {
                jsonGenerator.writeFieldName("CommandId").writeValue(command.getCommandId());
            }
            if (command.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(command.getInstanceId());
            }
            if (command.getDeploymentId() != null) {
                jsonGenerator.writeFieldName("DeploymentId").writeValue(command.getDeploymentId());
            }
            if (command.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(command.getCreatedAt());
            }
            if (command.getAcknowledgedAt() != null) {
                jsonGenerator.writeFieldName("AcknowledgedAt").writeValue(command.getAcknowledgedAt());
            }
            if (command.getCompletedAt() != null) {
                jsonGenerator.writeFieldName("CompletedAt").writeValue(command.getCompletedAt());
            }
            if (command.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(command.getStatus());
            }
            if (command.getExitCode() != null) {
                jsonGenerator.writeFieldName("ExitCode").writeValue(command.getExitCode());
            }
            if (command.getLogUrl() != null) {
                jsonGenerator.writeFieldName("LogUrl").writeValue(command.getLogUrl());
            }
            if (command.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(command.getType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommandJsonMarshaller instance;

    public static CommandJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandJsonMarshaller();
        return instance;
    }

}
