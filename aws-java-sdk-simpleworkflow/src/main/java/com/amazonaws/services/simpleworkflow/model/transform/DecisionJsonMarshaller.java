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
 * DecisionMarshaller
 */
public class DecisionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Decision decision, StructuredJsonGenerator jsonGenerator) {

        if (decision == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (decision.getDecisionType() != null) {
                jsonGenerator.writeFieldName("decisionType").writeValue(decision.getDecisionType());
            }
            if (decision.getScheduleActivityTaskDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("scheduleActivityTaskDecisionAttributes");
                ScheduleActivityTaskDecisionAttributesJsonMarshaller.getInstance()
                        .marshall(decision.getScheduleActivityTaskDecisionAttributes(), jsonGenerator);
            }
            if (decision.getRequestCancelActivityTaskDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("requestCancelActivityTaskDecisionAttributes");
                RequestCancelActivityTaskDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getRequestCancelActivityTaskDecisionAttributes(),
                        jsonGenerator);
            }
            if (decision.getCompleteWorkflowExecutionDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("completeWorkflowExecutionDecisionAttributes");
                CompleteWorkflowExecutionDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getCompleteWorkflowExecutionDecisionAttributes(),
                        jsonGenerator);
            }
            if (decision.getFailWorkflowExecutionDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("failWorkflowExecutionDecisionAttributes");
                FailWorkflowExecutionDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getFailWorkflowExecutionDecisionAttributes(),
                        jsonGenerator);
            }
            if (decision.getCancelWorkflowExecutionDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("cancelWorkflowExecutionDecisionAttributes");
                CancelWorkflowExecutionDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getCancelWorkflowExecutionDecisionAttributes(),
                        jsonGenerator);
            }
            if (decision.getContinueAsNewWorkflowExecutionDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("continueAsNewWorkflowExecutionDecisionAttributes");
                ContinueAsNewWorkflowExecutionDecisionAttributesJsonMarshaller.getInstance().marshall(
                        decision.getContinueAsNewWorkflowExecutionDecisionAttributes(), jsonGenerator);
            }
            if (decision.getRecordMarkerDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("recordMarkerDecisionAttributes");
                RecordMarkerDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getRecordMarkerDecisionAttributes(), jsonGenerator);
            }
            if (decision.getStartTimerDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("startTimerDecisionAttributes");
                StartTimerDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getStartTimerDecisionAttributes(), jsonGenerator);
            }
            if (decision.getCancelTimerDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("cancelTimerDecisionAttributes");
                CancelTimerDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getCancelTimerDecisionAttributes(), jsonGenerator);
            }
            if (decision.getSignalExternalWorkflowExecutionDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("signalExternalWorkflowExecutionDecisionAttributes");
                SignalExternalWorkflowExecutionDecisionAttributesJsonMarshaller.getInstance().marshall(
                        decision.getSignalExternalWorkflowExecutionDecisionAttributes(), jsonGenerator);
            }
            if (decision.getRequestCancelExternalWorkflowExecutionDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("requestCancelExternalWorkflowExecutionDecisionAttributes");
                RequestCancelExternalWorkflowExecutionDecisionAttributesJsonMarshaller.getInstance().marshall(
                        decision.getRequestCancelExternalWorkflowExecutionDecisionAttributes(), jsonGenerator);
            }
            if (decision.getStartChildWorkflowExecutionDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("startChildWorkflowExecutionDecisionAttributes");
                StartChildWorkflowExecutionDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getStartChildWorkflowExecutionDecisionAttributes(),
                        jsonGenerator);
            }
            if (decision.getScheduleLambdaFunctionDecisionAttributes() != null) {
                jsonGenerator.writeFieldName("scheduleLambdaFunctionDecisionAttributes");
                ScheduleLambdaFunctionDecisionAttributesJsonMarshaller.getInstance().marshall(decision.getScheduleLambdaFunctionDecisionAttributes(),
                        jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DecisionJsonMarshaller instance;

    public static DecisionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DecisionJsonMarshaller();
        return instance;
    }

}
