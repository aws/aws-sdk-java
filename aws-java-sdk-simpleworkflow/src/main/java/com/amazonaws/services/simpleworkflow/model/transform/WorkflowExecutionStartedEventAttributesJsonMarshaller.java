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
 * WorkflowExecutionStartedEventAttributesMarshaller
 */
public class WorkflowExecutionStartedEventAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WorkflowExecutionStartedEventAttributes workflowExecutionStartedEventAttributes, StructuredJsonGenerator jsonGenerator) {

        if (workflowExecutionStartedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workflowExecutionStartedEventAttributes.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(workflowExecutionStartedEventAttributes.getInput());
            }
            if (workflowExecutionStartedEventAttributes.getExecutionStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("executionStartToCloseTimeout").writeValue(
                        workflowExecutionStartedEventAttributes.getExecutionStartToCloseTimeout());
            }
            if (workflowExecutionStartedEventAttributes.getTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("taskStartToCloseTimeout").writeValue(workflowExecutionStartedEventAttributes.getTaskStartToCloseTimeout());
            }
            if (workflowExecutionStartedEventAttributes.getChildPolicy() != null) {
                jsonGenerator.writeFieldName("childPolicy").writeValue(workflowExecutionStartedEventAttributes.getChildPolicy());
            }
            if (workflowExecutionStartedEventAttributes.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(workflowExecutionStartedEventAttributes.getTaskList(), jsonGenerator);
            }
            if (workflowExecutionStartedEventAttributes.getWorkflowType() != null) {
                jsonGenerator.writeFieldName("workflowType");
                WorkflowTypeJsonMarshaller.getInstance().marshall(workflowExecutionStartedEventAttributes.getWorkflowType(), jsonGenerator);
            }

            java.util.List<String> tagListList = workflowExecutionStartedEventAttributes.getTagList();
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
            if (workflowExecutionStartedEventAttributes.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(workflowExecutionStartedEventAttributes.getTaskPriority());
            }
            if (workflowExecutionStartedEventAttributes.getContinuedExecutionRunId() != null) {
                jsonGenerator.writeFieldName("continuedExecutionRunId").writeValue(workflowExecutionStartedEventAttributes.getContinuedExecutionRunId());
            }
            if (workflowExecutionStartedEventAttributes.getParentWorkflowExecution() != null) {
                jsonGenerator.writeFieldName("parentWorkflowExecution");
                WorkflowExecutionJsonMarshaller.getInstance().marshall(workflowExecutionStartedEventAttributes.getParentWorkflowExecution(), jsonGenerator);
            }
            if (workflowExecutionStartedEventAttributes.getParentInitiatedEventId() != null) {
                jsonGenerator.writeFieldName("parentInitiatedEventId").writeValue(workflowExecutionStartedEventAttributes.getParentInitiatedEventId());
            }
            if (workflowExecutionStartedEventAttributes.getLambdaRole() != null) {
                jsonGenerator.writeFieldName("lambdaRole").writeValue(workflowExecutionStartedEventAttributes.getLambdaRole());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkflowExecutionStartedEventAttributesJsonMarshaller instance;

    public static WorkflowExecutionStartedEventAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowExecutionStartedEventAttributesJsonMarshaller();
        return instance;
    }

}
