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
 * AutomationExecutionMetadataMarshaller
 */
public class AutomationExecutionMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AutomationExecutionMetadata automationExecutionMetadata, StructuredJsonGenerator jsonGenerator) {

        if (automationExecutionMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (automationExecutionMetadata.getAutomationExecutionId() != null) {
                jsonGenerator.writeFieldName("AutomationExecutionId").writeValue(automationExecutionMetadata.getAutomationExecutionId());
            }
            if (automationExecutionMetadata.getDocumentName() != null) {
                jsonGenerator.writeFieldName("DocumentName").writeValue(automationExecutionMetadata.getDocumentName());
            }
            if (automationExecutionMetadata.getDocumentVersion() != null) {
                jsonGenerator.writeFieldName("DocumentVersion").writeValue(automationExecutionMetadata.getDocumentVersion());
            }
            if (automationExecutionMetadata.getAutomationExecutionStatus() != null) {
                jsonGenerator.writeFieldName("AutomationExecutionStatus").writeValue(automationExecutionMetadata.getAutomationExecutionStatus());
            }
            if (automationExecutionMetadata.getExecutionStartTime() != null) {
                jsonGenerator.writeFieldName("ExecutionStartTime").writeValue(automationExecutionMetadata.getExecutionStartTime());
            }
            if (automationExecutionMetadata.getExecutionEndTime() != null) {
                jsonGenerator.writeFieldName("ExecutionEndTime").writeValue(automationExecutionMetadata.getExecutionEndTime());
            }
            if (automationExecutionMetadata.getExecutedBy() != null) {
                jsonGenerator.writeFieldName("ExecutedBy").writeValue(automationExecutionMetadata.getExecutedBy());
            }
            if (automationExecutionMetadata.getLogFile() != null) {
                jsonGenerator.writeFieldName("LogFile").writeValue(automationExecutionMetadata.getLogFile());
            }

            java.util.Map<String, java.util.List<String>> outputsMap = automationExecutionMetadata.getOutputs();
            if (outputsMap != null) {
                jsonGenerator.writeFieldName("Outputs");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> outputsMapValue : outputsMap.entrySet()) {
                    if (outputsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(outputsMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String outputsMapValueList : outputsMapValue.getValue()) {
                            if (outputsMapValueList != null) {
                                jsonGenerator.writeValue(outputsMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AutomationExecutionMetadataJsonMarshaller instance;

    public static AutomationExecutionMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutomationExecutionMetadataJsonMarshaller();
        return instance;
    }

}
