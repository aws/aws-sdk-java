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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SignalExternalWorkflowExecutionDecisionAttributesMarshaller
 */
public class SignalExternalWorkflowExecutionDecisionAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes,
            StructuredJsonGenerator jsonGenerator) {

        if (signalExternalWorkflowExecutionDecisionAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (signalExternalWorkflowExecutionDecisionAttributes.getWorkflowId() != null) {
                jsonGenerator.writeFieldName("workflowId").writeValue(signalExternalWorkflowExecutionDecisionAttributes.getWorkflowId());
            }
            if (signalExternalWorkflowExecutionDecisionAttributes.getRunId() != null) {
                jsonGenerator.writeFieldName("runId").writeValue(signalExternalWorkflowExecutionDecisionAttributes.getRunId());
            }
            if (signalExternalWorkflowExecutionDecisionAttributes.getSignalName() != null) {
                jsonGenerator.writeFieldName("signalName").writeValue(signalExternalWorkflowExecutionDecisionAttributes.getSignalName());
            }
            if (signalExternalWorkflowExecutionDecisionAttributes.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(signalExternalWorkflowExecutionDecisionAttributes.getInput());
            }
            if (signalExternalWorkflowExecutionDecisionAttributes.getControl() != null) {
                jsonGenerator.writeFieldName("control").writeValue(signalExternalWorkflowExecutionDecisionAttributes.getControl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SignalExternalWorkflowExecutionDecisionAttributesJsonMarshaller instance;

    public static SignalExternalWorkflowExecutionDecisionAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SignalExternalWorkflowExecutionDecisionAttributesJsonMarshaller();
        return instance;
    }

}
