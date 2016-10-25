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
 * WorkflowExecutionContinuedAsNewEventAttributesMarshaller
 */
public class WorkflowExecutionContinuedAsNewEventAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WorkflowExecutionContinuedAsNewEventAttributes workflowExecutionContinuedAsNewEventAttributes, StructuredJsonGenerator jsonGenerator) {

        if (workflowExecutionContinuedAsNewEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workflowExecutionContinuedAsNewEventAttributes.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(workflowExecutionContinuedAsNewEventAttributes.getInput());
            }
            if (workflowExecutionContinuedAsNewEventAttributes.getDecisionTaskCompletedEventId() != null) {
                jsonGenerator.writeFieldName("decisionTaskCompletedEventId").writeValue(
                        workflowExecutionContinuedAsNewEventAttributes.getDecisionTaskCompletedEventId());
            }
            if (workflowExecutionContinuedAsNewEventAttributes.getNewExecutionRunId() != null) {
                jsonGenerator.writeFieldName("newExecutionRunId").writeValue(workflowExecutionContinuedAsNewEventAttributes.getNewExecutionRunId());
            }
            if (workflowExecutionContinuedAsNewEventAttributes.getExecutionStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("executionStartToCloseTimeout").writeValue(
                        workflowExecutionContinuedAsNewEventAttributes.getExecutionStartToCloseTimeout());
            }
            if (workflowExecutionContinuedAsNewEventAttributes.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(workflowExecutionContinuedAsNewEventAttributes.getTaskList(), jsonGenerator);
            }
            if (workflowExecutionContinuedAsNewEventAttributes.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(workflowExecutionContinuedAsNewEventAttributes.getTaskPriority());
            }
            if (workflowExecutionContinuedAsNewEventAttributes.getTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("taskStartToCloseTimeout").writeValue(workflowExecutionContinuedAsNewEventAttributes.getTaskStartToCloseTimeout());
            }
            if (workflowExecutionContinuedAsNewEventAttributes.getChildPolicy() != null) {
                jsonGenerator.writeFieldName("childPolicy").writeValue(workflowExecutionContinuedAsNewEventAttributes.getChildPolicy());
            }

            java.util.List<String> tagListList = workflowExecutionContinuedAsNewEventAttributes.getTagList();
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
            if (workflowExecutionContinuedAsNewEventAttributes.getWorkflowType() != null) {
                jsonGenerator.writeFieldName("workflowType");
                WorkflowTypeJsonMarshaller.getInstance().marshall(workflowExecutionContinuedAsNewEventAttributes.getWorkflowType(), jsonGenerator);
            }
            if (workflowExecutionContinuedAsNewEventAttributes.getLambdaRole() != null) {
                jsonGenerator.writeFieldName("lambdaRole").writeValue(workflowExecutionContinuedAsNewEventAttributes.getLambdaRole());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkflowExecutionContinuedAsNewEventAttributesJsonMarshaller instance;

    public static WorkflowExecutionContinuedAsNewEventAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowExecutionContinuedAsNewEventAttributesJsonMarshaller();
        return instance;
    }

}
