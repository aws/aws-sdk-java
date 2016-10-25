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
 * WorkflowExecutionInfoMarshaller
 */
public class WorkflowExecutionInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WorkflowExecutionInfo workflowExecutionInfo, StructuredJsonGenerator jsonGenerator) {

        if (workflowExecutionInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workflowExecutionInfo.getExecution() != null) {
                jsonGenerator.writeFieldName("execution");
                WorkflowExecutionJsonMarshaller.getInstance().marshall(workflowExecutionInfo.getExecution(), jsonGenerator);
            }
            if (workflowExecutionInfo.getWorkflowType() != null) {
                jsonGenerator.writeFieldName("workflowType");
                WorkflowTypeJsonMarshaller.getInstance().marshall(workflowExecutionInfo.getWorkflowType(), jsonGenerator);
            }
            if (workflowExecutionInfo.getStartTimestamp() != null) {
                jsonGenerator.writeFieldName("startTimestamp").writeValue(workflowExecutionInfo.getStartTimestamp());
            }
            if (workflowExecutionInfo.getCloseTimestamp() != null) {
                jsonGenerator.writeFieldName("closeTimestamp").writeValue(workflowExecutionInfo.getCloseTimestamp());
            }
            if (workflowExecutionInfo.getExecutionStatus() != null) {
                jsonGenerator.writeFieldName("executionStatus").writeValue(workflowExecutionInfo.getExecutionStatus());
            }
            if (workflowExecutionInfo.getCloseStatus() != null) {
                jsonGenerator.writeFieldName("closeStatus").writeValue(workflowExecutionInfo.getCloseStatus());
            }
            if (workflowExecutionInfo.getParent() != null) {
                jsonGenerator.writeFieldName("parent");
                WorkflowExecutionJsonMarshaller.getInstance().marshall(workflowExecutionInfo.getParent(), jsonGenerator);
            }

            java.util.List<String> tagListList = workflowExecutionInfo.getTagList();
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
            if (workflowExecutionInfo.getCancelRequested() != null) {
                jsonGenerator.writeFieldName("cancelRequested").writeValue(workflowExecutionInfo.getCancelRequested());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkflowExecutionInfoJsonMarshaller instance;

    public static WorkflowExecutionInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowExecutionInfoJsonMarshaller();
        return instance;
    }

}
