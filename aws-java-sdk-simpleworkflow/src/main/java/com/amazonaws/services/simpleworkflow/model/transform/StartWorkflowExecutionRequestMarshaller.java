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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * StartWorkflowExecutionRequest Marshaller
 */
public class StartWorkflowExecutionRequestMarshaller implements Marshaller<Request<StartWorkflowExecutionRequest>, StartWorkflowExecutionRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public StartWorkflowExecutionRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<StartWorkflowExecutionRequest> marshall(StartWorkflowExecutionRequest startWorkflowExecutionRequest) {

        if (startWorkflowExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartWorkflowExecutionRequest> request = new DefaultRequest<StartWorkflowExecutionRequest>(startWorkflowExecutionRequest,
                "AmazonSimpleWorkflow");
        request.addHeader("X-Amz-Target", "SimpleWorkflowService.StartWorkflowExecution");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (startWorkflowExecutionRequest.getDomain() != null) {
                jsonGenerator.writeFieldName("domain").writeValue(startWorkflowExecutionRequest.getDomain());
            }
            if (startWorkflowExecutionRequest.getWorkflowId() != null) {
                jsonGenerator.writeFieldName("workflowId").writeValue(startWorkflowExecutionRequest.getWorkflowId());
            }
            if (startWorkflowExecutionRequest.getWorkflowType() != null) {
                jsonGenerator.writeFieldName("workflowType");
                WorkflowTypeJsonMarshaller.getInstance().marshall(startWorkflowExecutionRequest.getWorkflowType(), jsonGenerator);
            }
            if (startWorkflowExecutionRequest.getTaskList() != null) {
                jsonGenerator.writeFieldName("taskList");
                TaskListJsonMarshaller.getInstance().marshall(startWorkflowExecutionRequest.getTaskList(), jsonGenerator);
            }
            if (startWorkflowExecutionRequest.getTaskPriority() != null) {
                jsonGenerator.writeFieldName("taskPriority").writeValue(startWorkflowExecutionRequest.getTaskPriority());
            }
            if (startWorkflowExecutionRequest.getInput() != null) {
                jsonGenerator.writeFieldName("input").writeValue(startWorkflowExecutionRequest.getInput());
            }
            if (startWorkflowExecutionRequest.getExecutionStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("executionStartToCloseTimeout").writeValue(startWorkflowExecutionRequest.getExecutionStartToCloseTimeout());
            }

            java.util.List<String> tagListList = startWorkflowExecutionRequest.getTagList();
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
            if (startWorkflowExecutionRequest.getTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("taskStartToCloseTimeout").writeValue(startWorkflowExecutionRequest.getTaskStartToCloseTimeout());
            }
            if (startWorkflowExecutionRequest.getChildPolicy() != null) {
                jsonGenerator.writeFieldName("childPolicy").writeValue(startWorkflowExecutionRequest.getChildPolicy());
            }
            if (startWorkflowExecutionRequest.getLambdaRole() != null) {
                jsonGenerator.writeFieldName("lambdaRole").writeValue(startWorkflowExecutionRequest.getLambdaRole());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
