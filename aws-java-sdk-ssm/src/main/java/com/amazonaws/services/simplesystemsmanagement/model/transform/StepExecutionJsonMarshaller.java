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
 * StepExecutionMarshaller
 */
public class StepExecutionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StepExecution stepExecution, StructuredJsonGenerator jsonGenerator) {

        if (stepExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (stepExecution.getStepName() != null) {
                jsonGenerator.writeFieldName("StepName").writeValue(stepExecution.getStepName());
            }
            if (stepExecution.getAction() != null) {
                jsonGenerator.writeFieldName("Action").writeValue(stepExecution.getAction());
            }
            if (stepExecution.getExecutionStartTime() != null) {
                jsonGenerator.writeFieldName("ExecutionStartTime").writeValue(stepExecution.getExecutionStartTime());
            }
            if (stepExecution.getExecutionEndTime() != null) {
                jsonGenerator.writeFieldName("ExecutionEndTime").writeValue(stepExecution.getExecutionEndTime());
            }
            if (stepExecution.getStepStatus() != null) {
                jsonGenerator.writeFieldName("StepStatus").writeValue(stepExecution.getStepStatus());
            }
            if (stepExecution.getResponseCode() != null) {
                jsonGenerator.writeFieldName("ResponseCode").writeValue(stepExecution.getResponseCode());
            }

            java.util.Map<String, String> inputsMap = stepExecution.getInputs();
            if (inputsMap != null) {
                jsonGenerator.writeFieldName("Inputs");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> inputsMapValue : inputsMap.entrySet()) {
                    if (inputsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(inputsMapValue.getKey());

                        jsonGenerator.writeValue(inputsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, java.util.List<String>> outputsMap = stepExecution.getOutputs();
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
            if (stepExecution.getResponse() != null) {
                jsonGenerator.writeFieldName("Response").writeValue(stepExecution.getResponse());
            }
            if (stepExecution.getFailureMessage() != null) {
                jsonGenerator.writeFieldName("FailureMessage").writeValue(stepExecution.getFailureMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StepExecutionJsonMarshaller instance;

    public static StepExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepExecutionJsonMarshaller();
        return instance;
    }

}
