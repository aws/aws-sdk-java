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
 * ChildWorkflowExecutionFailedEventAttributesMarshaller
 */
public class ChildWorkflowExecutionFailedEventAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ChildWorkflowExecutionFailedEventAttributes childWorkflowExecutionFailedEventAttributes, StructuredJsonGenerator jsonGenerator) {

        if (childWorkflowExecutionFailedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (childWorkflowExecutionFailedEventAttributes.getWorkflowExecution() != null) {
                jsonGenerator.writeFieldName("workflowExecution");
                WorkflowExecutionJsonMarshaller.getInstance().marshall(childWorkflowExecutionFailedEventAttributes.getWorkflowExecution(), jsonGenerator);
            }
            if (childWorkflowExecutionFailedEventAttributes.getWorkflowType() != null) {
                jsonGenerator.writeFieldName("workflowType");
                WorkflowTypeJsonMarshaller.getInstance().marshall(childWorkflowExecutionFailedEventAttributes.getWorkflowType(), jsonGenerator);
            }
            if (childWorkflowExecutionFailedEventAttributes.getReason() != null) {
                jsonGenerator.writeFieldName("reason").writeValue(childWorkflowExecutionFailedEventAttributes.getReason());
            }
            if (childWorkflowExecutionFailedEventAttributes.getDetails() != null) {
                jsonGenerator.writeFieldName("details").writeValue(childWorkflowExecutionFailedEventAttributes.getDetails());
            }
            if (childWorkflowExecutionFailedEventAttributes.getInitiatedEventId() != null) {
                jsonGenerator.writeFieldName("initiatedEventId").writeValue(childWorkflowExecutionFailedEventAttributes.getInitiatedEventId());
            }
            if (childWorkflowExecutionFailedEventAttributes.getStartedEventId() != null) {
                jsonGenerator.writeFieldName("startedEventId").writeValue(childWorkflowExecutionFailedEventAttributes.getStartedEventId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ChildWorkflowExecutionFailedEventAttributesJsonMarshaller instance;

    public static ChildWorkflowExecutionFailedEventAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChildWorkflowExecutionFailedEventAttributesJsonMarshaller();
        return instance;
    }

}
