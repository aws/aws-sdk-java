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
 * StartChildWorkflowExecutionInitiatedEventAttributesMarshaller
 */
public class StartChildWorkflowExecutionInitiatedEventAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes,
            StructuredJsonGenerator jsonGenerator) {

        if (startChildWorkflowExecutionInitiatedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (startChildWorkflowExecutionInitiatedEventAttributes.getWorkflowId() != null) {
                jsonGenerator.writeFieldName("workflowId").writeValue(startChildWorkflowExecutionInitiatedEventAttributes.getWorkflowId());
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getWorkflowType() != null) {
                jsonGenerator.writeFieldName("workflowType");
                WorkflowTypeJsonMarshaller.getInstance().marshall(startChildWorkflowExecutionInitiatedEventAttributes.getWorkflowType(), jsonGenerator);
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getControl() != null) {
                jsonGenerator.writeFieldName("control").writeValue(startChildWorkflowExecutionInitiatedEventAttributes.getControl());
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(startChildWorkflowExecutionInitiatedEventAttributes.getInput());
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getExecutionStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("executionStartToCloseTimeout").writeValue(
                        startChildWorkflowExecutionInitiatedEventAttributes.getExecutionStartToCloseTimeout());
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(startChildWorkflowExecutionInitiatedEventAttributes.getTaskList(), jsonGenerator);
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(startChildWorkflowExecutionInitiatedEventAttributes.getTaskPriority());
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getDecisionTaskCompletedEventId() != null) {
                jsonGenerator.writeFieldName("decisionTaskCompletedEventId").writeValue(
                        startChildWorkflowExecutionInitiatedEventAttributes.getDecisionTaskCompletedEventId());
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getChildPolicy() != null) {
                jsonGenerator.writeFieldName("childPolicy").writeValue(startChildWorkflowExecutionInitiatedEventAttributes.getChildPolicy());
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("taskStartToCloseTimeout").writeValue(
                        startChildWorkflowExecutionInitiatedEventAttributes.getTaskStartToCloseTimeout());
            }

            java.util.List<String> tagListList = startChildWorkflowExecutionInitiatedEventAttributes.getTagList();
            if (tagListList != null) {
                jsonGenerator.writeFieldName("tagList");
                jsonGenerator.writeStartArray();
                for (String tagListListValue : tagListList) {
                    if (tagListListValue != null) {
                        jsonGenerator.writeValue(tagListListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (startChildWorkflowExecutionInitiatedEventAttributes.getLambdaRole() != null) {
                jsonGenerator.writeFieldName("lambdaRole").writeValue(startChildWorkflowExecutionInitiatedEventAttributes.getLambdaRole());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StartChildWorkflowExecutionInitiatedEventAttributesJsonMarshaller instance;

    public static StartChildWorkflowExecutionInitiatedEventAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StartChildWorkflowExecutionInitiatedEventAttributesJsonMarshaller();
        return instance;
    }

}
