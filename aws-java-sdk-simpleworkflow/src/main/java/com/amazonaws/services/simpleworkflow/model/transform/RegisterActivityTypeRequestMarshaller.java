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
 * RegisterActivityTypeRequest Marshaller
 */
public class RegisterActivityTypeRequestMarshaller implements Marshaller<Request<RegisterActivityTypeRequest>, RegisterActivityTypeRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RegisterActivityTypeRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterActivityTypeRequest> marshall(RegisterActivityTypeRequest registerActivityTypeRequest) {

        if (registerActivityTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterActivityTypeRequest> request = new DefaultRequest<RegisterActivityTypeRequest>(registerActivityTypeRequest, "AmazonSimpleWorkflow");
        request.addHeader("X-Amz-Target", "SimpleWorkflowService.RegisterActivityType");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (registerActivityTypeRequest.getDomain() != null) {
                jsonGenerator.writeFieldName("domain").writeValue(registerActivityTypeRequest.getDomain());
            }
            if (registerActivityTypeRequest.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(registerActivityTypeRequest.getName());
            }
            if (registerActivityTypeRequest.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(registerActivityTypeRequest.getVersion());
            }
            if (registerActivityTypeRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(registerActivityTypeRequest.getDescription());
            }
            if (registerActivityTypeRequest.getDefaultTaskStartToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskStartToCloseTimeout").writeValue(registerActivityTypeRequest.getDefaultTaskStartToCloseTimeout());
            }
            if (registerActivityTypeRequest.getDefaultTaskHeartbeatTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskHeartbeatTimeout").writeValue(registerActivityTypeRequest.getDefaultTaskHeartbeatTimeout());
            }
            if (registerActivityTypeRequest.getDefaultTaskList() != null) {
                jsonGenerator.writeFieldName("defaultTaskList");
                TaskListJsonMarshaller.getInstance().marshall(registerActivityTypeRequest.getDefaultTaskList(), jsonGenerator);
            }
            if (registerActivityTypeRequest.getDefaultTaskPriority() != null) {
                jsonGenerator.writeFieldName("defaultTaskPriority").writeValue(registerActivityTypeRequest.getDefaultTaskPriority());
            }
            if (registerActivityTypeRequest.getDefaultTaskScheduleToStartTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskScheduleToStartTimeout")
                        .writeValue(registerActivityTypeRequest.getDefaultTaskScheduleToStartTimeout());
            }
            if (registerActivityTypeRequest.getDefaultTaskScheduleToCloseTimeout() != null) {
                jsonGenerator.writeFieldName("defaultTaskScheduleToCloseTimeout")
                        .writeValue(registerActivityTypeRequest.getDefaultTaskScheduleToCloseTimeout());
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
