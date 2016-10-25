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
 * StartChildWorkflowExecutionDecisionAttributesMarshaller
 */
public class StartChildWorkflowExecutionDecisionAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes, StructuredJsonGenerator jsonGenerator) {

        if (startChildWorkflowExecutionDecisionAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (startChildWorkflowExecutionDecisionAttributes.getWorkflowType() != null) {
                jsonGenerator.writeFieldName("workflowType");
                WorkflowTypeJsonMarshaller.getInstance().marshall(startChildWorkflowExecutionDecisionAttributes.getWorkflowType(), jsonGenerator);
            }
            if (startChildWorkflowExecutionDecisionAttributes.getWorkflowId() != null) {
                jsonGenerator.writeFieldName("workflowId").writeValue(startChildWorkflowExecutionDecisionAttributes.getWorkflowId());
            }
            if (startChildWorkflowExecutionDecisionAttributes.getControl() != null) {
                jsonGenerator.writeFieldName("control").writeValue(startChildWorkflowExecutionDecisionAttributes.getControl());
            }
            if (startChildWorkflowExecutionDecisionAttributes.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(startChildWorkflowExecutionDecisionAttributes.getInput());
            }
            if (startChildWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("executionStartToCloseTimeout").writeValue(
                        startChildWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout());
            }
            if (startChildWorkflowExecutionDecisionAttributes.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(startChildWorkflowExecutionDecisionAttributes.getTaskList(), jsonGenerator);
            }
            if (startChildWorkflowExecutionDecisionAttributes.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(startChildWorkflowExecutionDecisionAttributes.getTaskPriority());
            }
            if (startChildWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("taskStartToCloseTimeout").writeValue(startChildWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout());
            }
            if (startChildWorkflowExecutionDecisionAttributes.getChildPolicy() != null) {
                jsonGenerator.writeFieldName("childPolicy").writeValue(startChildWorkflowExecutionDecisionAttributes.getChildPolicy());
            }

            java.util.List<String> tagListList = startChildWorkflowExecutionDecisionAttributes.getTagList();
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
            if (startChildWorkflowExecutionDecisionAttributes.getLambdaRole() != null) {
                jsonGenerator.writeFieldName("lambdaRole").writeValue(startChildWorkflowExecutionDecisionAttributes.getLambdaRole());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StartChildWorkflowExecutionDecisionAttributesJsonMarshaller instance;

    public static StartChildWorkflowExecutionDecisionAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StartChildWorkflowExecutionDecisionAttributesJsonMarshaller();
        return instance;
    }

}
