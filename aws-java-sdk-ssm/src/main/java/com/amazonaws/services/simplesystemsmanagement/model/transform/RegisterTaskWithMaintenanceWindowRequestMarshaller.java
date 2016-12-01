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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RegisterTaskWithMaintenanceWindowRequest Marshaller
 */
public class RegisterTaskWithMaintenanceWindowRequestMarshaller implements
        Marshaller<Request<RegisterTaskWithMaintenanceWindowRequest>, RegisterTaskWithMaintenanceWindowRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RegisterTaskWithMaintenanceWindowRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterTaskWithMaintenanceWindowRequest> marshall(RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest) {

        if (registerTaskWithMaintenanceWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterTaskWithMaintenanceWindowRequest> request = new DefaultRequest<RegisterTaskWithMaintenanceWindowRequest>(
                registerTaskWithMaintenanceWindowRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.RegisterTaskWithMaintenanceWindow");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (registerTaskWithMaintenanceWindowRequest.getWindowId() != null) {
                jsonGenerator.writeFieldName("WindowId").writeValue(registerTaskWithMaintenanceWindowRequest.getWindowId());
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) registerTaskWithMaintenanceWindowRequest
                    .getTargets();
            if (!targetsList.isEmpty() || !targetsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Targets");
                jsonGenerator.writeStartArray();
                for (Target targetsListValue : targetsList) {
                    if (targetsListValue != null) {

                        TargetJsonMarshaller.getInstance().marshall(targetsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (registerTaskWithMaintenanceWindowRequest.getTaskArn() != null) {
                jsonGenerator.writeFieldName("TaskArn").writeValue(registerTaskWithMaintenanceWindowRequest.getTaskArn());
            }
            if (registerTaskWithMaintenanceWindowRequest.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(registerTaskWithMaintenanceWindowRequest.getServiceRoleArn());
            }
            if (registerTaskWithMaintenanceWindowRequest.getTaskType() != null) {
                jsonGenerator.writeFieldName("TaskType").writeValue(registerTaskWithMaintenanceWindowRequest.getTaskType());
            }

            java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParametersMap = registerTaskWithMaintenanceWindowRequest
                    .getTaskParameters();
            if (taskParametersMap != null) {
                jsonGenerator.writeFieldName("TaskParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, MaintenanceWindowTaskParameterValueExpression> taskParametersMapValue : taskParametersMap.entrySet()) {
                    if (taskParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(taskParametersMapValue.getKey());

                        MaintenanceWindowTaskParameterValueExpressionJsonMarshaller.getInstance().marshall(taskParametersMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (registerTaskWithMaintenanceWindowRequest.getPriority() != null) {
                jsonGenerator.writeFieldName("Priority").writeValue(registerTaskWithMaintenanceWindowRequest.getPriority());
            }
            if (registerTaskWithMaintenanceWindowRequest.getMaxConcurrency() != null) {
                jsonGenerator.writeFieldName("MaxConcurrency").writeValue(registerTaskWithMaintenanceWindowRequest.getMaxConcurrency());
            }
            if (registerTaskWithMaintenanceWindowRequest.getMaxErrors() != null) {
                jsonGenerator.writeFieldName("MaxErrors").writeValue(registerTaskWithMaintenanceWindowRequest.getMaxErrors());
            }
            if (registerTaskWithMaintenanceWindowRequest.getLoggingInfo() != null) {
                jsonGenerator.writeFieldName("LoggingInfo");
                LoggingInfoJsonMarshaller.getInstance().marshall(registerTaskWithMaintenanceWindowRequest.getLoggingInfo(), jsonGenerator);
            }
            jsonGenerator.writeFieldName("ClientToken").writeValue(IdempotentUtils.resolveString(registerTaskWithMaintenanceWindowRequest.getClientToken()));

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
