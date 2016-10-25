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
 * RegisterWorkflowTypeRequest Marshaller
 */
public class RegisterWorkflowTypeRequestMarshaller implements Marshaller<Request<RegisterWorkflowTypeRequest>, RegisterWorkflowTypeRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RegisterWorkflowTypeRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterWorkflowTypeRequest> marshall(RegisterWorkflowTypeRequest registerWorkflowTypeRequest) {

        if (registerWorkflowTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterWorkflowTypeRequest> request = new DefaultRequest<RegisterWorkflowTypeRequest>(registerWorkflowTypeRequest, "AmazonSimpleWorkflow");
        request.addHeader("X-Amz-Target", "SimpleWorkflowService.RegisterWorkflowType");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (registerWorkflowTypeRequest.getDomain() != null) {
                jsonGenerator.writeFieldName("domain").writeValue(registerWorkflowTypeRequest.getDomain());
            }
            if (registerWorkflowTypeRequest.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(registerWorkflowTypeRequest.getName());
            }
            if (registerWorkflowTypeRequest.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(registerWorkflowTypeRequest.getVersion());
            }
            if (registerWorkflowTypeRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(registerWorkflowTypeRequest.getDescription());
            }
            if (registerWorkflowTypeRequest.getDefaultTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskStartToCloseTimeout").writeValue(registerWorkflowTypeRequest.getDefaultTaskStartToCloseTimeout());
            }
            if (registerWorkflowTypeRequest.getDefaultExecutionStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("defaultExecutionStartToCloseTimeout").writeValue(
                        registerWorkflowTypeRequest.getDefaultExecutionStartToCloseTimeout());
            }
            if (registerWorkflowTypeRequest.getDefaultTaskList() != null) {
                jsonGenerator.writeFieldName("defaultTaskList");
                TaskListJsonMarshaller.getInstance().marshall(registerWorkflowTypeRequest.getDefaultTaskList(), jsonGenerator);
            }
            if (registerWorkflowTypeRequest.getDefaultTaskPriority() != null) {
                jsonGenerator.writeFieldName("defaultTaskPriority").writeValue(registerWorkflowTypeRequest.getDefaultTaskPriority());
            }
            if (registerWorkflowTypeRequest.getDefaultChildPolicy() != null) {
                jsonGenerator.writeFieldName("defaultChildPolicy").writeValue(registerWorkflowTypeRequest.getDefaultChildPolicy());
            }
            if (registerWorkflowTypeRequest.getDefaultLambdaRole() != null) {
                jsonGenerator.writeFieldName("defaultLambdaRole").writeValue(registerWorkflowTypeRequest.getDefaultLambdaRole());
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
