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
 * WorkflowExecutionConfigurationMarshaller
 */
public class WorkflowExecutionConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WorkflowExecutionConfiguration workflowExecutionConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (workflowExecutionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workflowExecutionConfiguration.getTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("taskStartToCloseTimeout").writeValue(workflowExecutionConfiguration.getTaskStartToCloseTimeout());
            }
            if (workflowExecutionConfiguration.getExecutionStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("executionStartToCloseTimeout").writeValue(workflowExecutionConfiguration.getExecutionStartToCloseTimeout());
            }
            if (workflowExecutionConfiguration.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(workflowExecutionConfiguration.getTaskList(), jsonGenerator);
            }
            if (workflowExecutionConfiguration.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(workflowExecutionConfiguration.getTaskPriority());
            }
            if (workflowExecutionConfiguration.getChildPolicy() != null) {
                jsonGenerator.writeFieldName("childPolicy").writeValue(workflowExecutionConfiguration.getChildPolicy());
            }
            if (workflowExecutionConfiguration.getLambdaRole() != null) {
                jsonGenerator.writeFieldName("lambdaRole").writeValue(workflowExecutionConfiguration.getLambdaRole());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkflowExecutionConfigurationJsonMarshaller instance;

    public static WorkflowExecutionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowExecutionConfigurationJsonMarshaller();
        return instance;
    }

}
