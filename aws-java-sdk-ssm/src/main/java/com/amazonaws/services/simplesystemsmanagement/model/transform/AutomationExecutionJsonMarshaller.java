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
 * AutomationExecutionMarshaller
 */
public class AutomationExecutionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AutomationExecution automationExecution, StructuredJsonGenerator jsonGenerator) {

        if (automationExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (automationExecution.getAutomationExecutionId() != null) {
                jsonGenerator.writeFieldName("AutomationExecutionId").writeValue(automationExecution.getAutomationExecutionId());
            }
            if (automationExecution.getDocumentName() != null) {
                jsonGenerator.writeFieldName("DocumentName").writeValue(automationExecution.getDocumentName());
            }
            if (automationExecution.getDocumentVersion() != null) {
                jsonGenerator.writeFieldName("DocumentVersion").writeValue(automationExecution.getDocumentVersion());
            }
            if (automationExecution.getExecutionStartTime() != null) {
                jsonGenerator.writeFieldName("ExecutionStartTime").writeValue(automationExecution.getExecutionStartTime());
            }
            if (automationExecution.getExecutionEndTime() != null) {
                jsonGenerator.writeFieldName("ExecutionEndTime").writeValue(automationExecution.getExecutionEndTime());
            }
            if (automationExecution.getAutomationExecutionStatus() != null) {
                jsonGenerator.writeFieldName("AutomationExecutionStatus").writeValue(automationExecution.getAutomationExecutionStatus());
            }

            com.amazonaws.internal.SdkInternalList<StepExecution> stepExecutionsList = (com.amazonaws.internal.SdkInternalList<StepExecution>) automationExecution
                    .getStepExecutions();
            if (!stepExecutionsList.isEmpty() || !stepExecutionsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("StepExecutions");
                jsonGenerator.writeStartArray();
                for (StepExecution stepExecutionsListValue : stepExecutionsList) {
                    if (stepExecutionsListValue != null) {

                        StepExecutionJsonMarshaller.getInstance().marshall(stepExecutionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.Map<String, java.util.List<String>> parametersMap = automationExecution.getParameters();
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

            java.util.Map<String, java.util.List<String>> outputsMap = automationExecution.getOutputs();
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
            if (automationExecution.getFailureMessage() != null) {
                jsonGenerator.writeFieldName("FailureMessage").writeValue(automationExecution.getFailureMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AutomationExecutionJsonMarshaller instance;

    public static AutomationExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutomationExecutionJsonMarshaller();
        return instance;
    }

}
