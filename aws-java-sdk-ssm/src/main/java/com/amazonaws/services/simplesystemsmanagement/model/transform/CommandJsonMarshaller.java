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
            if (command.getDocumentName() != null) {
                jsonGenerator.writeFieldName("DocumentName").writeValue(command.getDocumentName());
            }
            if (command.getComment() != null) {
                jsonGenerator.writeFieldName("Comment").writeValue(command.getComment());
            }
            if (command.getExpiresAfter() != null) {
                jsonGenerator.writeFieldName("ExpiresAfter").writeValue(command.getExpiresAfter());
            }

            java.util.Map<String, java.util.List<String>> parametersMap = command.getParameters();
            if (parametersMap != null) {
                jsonGenerator.writeFieldName("Parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String parametersMapValueList : parametersMapValue.getValue()) {
                            if (parametersMapValueList != null) {
                                jsonGenerator.writeValue(parametersMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) command.getInstanceIds();
            if (!instanceIdsList.isEmpty() || !instanceIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstanceIds");
                jsonGenerator.writeStartArray();
                for (String instanceIdsListValue : instanceIdsList) {
                    if (instanceIdsListValue != null) {
                        jsonGenerator.writeValue(instanceIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) command.getTargets();
            if (!targetsList.isEmpty() || !targetsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Targets");
                jsonGenerator.writeStartArray();
                for (Target targetsListValue : targetsList) {
                    if (targetsListValue != null) {

                        TargetJsonMarshaller.getInstance().marshall(targetsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (command.getRequestedDateTime() != null) {
                jsonGenerator.writeFieldName("RequestedDateTime").writeValue(command.getRequestedDateTime());
            }
            if (command.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(command.getStatus());
            }
            if (command.getStatusDetails() != null) {
                jsonGenerator.writeFieldName("StatusDetails").writeValue(command.getStatusDetails());
            }
            if (command.getOutputS3Region() != null) {
                jsonGenerator.writeFieldName("OutputS3Region").writeValue(command.getOutputS3Region());
            }
            if (command.getOutputS3BucketName() != null) {
                jsonGenerator.writeFieldName("OutputS3BucketName").writeValue(command.getOutputS3BucketName());
            }
            if (command.getOutputS3KeyPrefix() != null) {
                jsonGenerator.writeFieldName("OutputS3KeyPrefix").writeValue(command.getOutputS3KeyPrefix());
            }
            if (command.getMaxConcurrency() != null) {
                jsonGenerator.writeFieldName("MaxConcurrency").writeValue(command.getMaxConcurrency());
            }
            if (command.getMaxErrors() != null) {
                jsonGenerator.writeFieldName("MaxErrors").writeValue(command.getMaxErrors());
            }
            if (command.getTargetCount() != null) {
                jsonGenerator.writeFieldName("TargetCount").writeValue(command.getTargetCount());
            }
            if (command.getCompletedCount() != null) {
                jsonGenerator.writeFieldName("CompletedCount").writeValue(command.getCompletedCount());
            }
            if (command.getErrorCount() != null) {
                jsonGenerator.writeFieldName("ErrorCount").writeValue(command.getErrorCount());
            }
            if (command.getServiceRole() != null) {
                jsonGenerator.writeFieldName("ServiceRole").writeValue(command.getServiceRole());
            }
            if (command.getNotificationConfig() != null) {
                jsonGenerator.writeFieldName("NotificationConfig");
                NotificationConfigJsonMarshaller.getInstance().marshall(command.getNotificationConfig(), jsonGenerator);
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
