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
 * ContinueAsNewWorkflowExecutionDecisionAttributesMarshaller
 */
public class ContinueAsNewWorkflowExecutionDecisionAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes,
            StructuredJsonGenerator jsonGenerator) {

        if (continueAsNewWorkflowExecutionDecisionAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (continueAsNewWorkflowExecutionDecisionAttributes.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(continueAsNewWorkflowExecutionDecisionAttributes.getInput());
            }
            if (continueAsNewWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("executionStartToCloseTimeout").writeValue(
                        continueAsNewWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout());
            }
            if (continueAsNewWorkflowExecutionDecisionAttributes.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(continueAsNewWorkflowExecutionDecisionAttributes.getTaskList(), jsonGenerator);
            }
            if (continueAsNewWorkflowExecutionDecisionAttributes.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(continueAsNewWorkflowExecutionDecisionAttributes.getTaskPriority());
            }
            if (continueAsNewWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("taskStartToCloseTimeout").writeValue(
                        continueAsNewWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout());
            }
            if (continueAsNewWorkflowExecutionDecisionAttributes.getChildPolicy() != null) {
                jsonGenerator.writeFieldName("childPolicy").writeValue(continueAsNewWorkflowExecutionDecisionAttributes.getChildPolicy());
            }

            java.util.List<String> tagListList = continueAsNewWorkflowExecutionDecisionAttributes.getTagList();
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
            if (continueAsNewWorkflowExecutionDecisionAttributes.getWorkflowTypeVersion() != null) {
                jsonGenerator.writeFieldName("workflowTypeVersion").writeValue(continueAsNewWorkflowExecutionDecisionAttributes.getWorkflowTypeVersion());
            }
            if (continueAsNewWorkflowExecutionDecisionAttributes.getLambdaRole() != null) {
                jsonGenerator.writeFieldName("lambdaRole").writeValue(continueAsNewWorkflowExecutionDecisionAttributes.getLambdaRole());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContinueAsNewWorkflowExecutionDecisionAttributesJsonMarshaller instance;

    public static ContinueAsNewWorkflowExecutionDecisionAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContinueAsNewWorkflowExecutionDecisionAttributesJsonMarshaller();
        return instance;
    }

}
