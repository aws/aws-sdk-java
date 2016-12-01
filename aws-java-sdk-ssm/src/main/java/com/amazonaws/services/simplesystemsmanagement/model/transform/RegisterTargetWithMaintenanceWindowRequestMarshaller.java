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
 * RegisterTargetWithMaintenanceWindowRequest Marshaller
 */
public class RegisterTargetWithMaintenanceWindowRequestMarshaller implements
        Marshaller<Request<RegisterTargetWithMaintenanceWindowRequest>, RegisterTargetWithMaintenanceWindowRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RegisterTargetWithMaintenanceWindowRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterTargetWithMaintenanceWindowRequest> marshall(RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest) {

        if (registerTargetWithMaintenanceWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterTargetWithMaintenanceWindowRequest> request = new DefaultRequest<RegisterTargetWithMaintenanceWindowRequest>(
                registerTargetWithMaintenanceWindowRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.RegisterTargetWithMaintenanceWindow");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (registerTargetWithMaintenanceWindowRequest.getWindowId() != null) {
                jsonGenerator.writeFieldName("WindowId").writeValue(registerTargetWithMaintenanceWindowRequest.getWindowId());
            }
            if (registerTargetWithMaintenanceWindowRequest.getResourceType() != null) {
                jsonGenerator.writeFieldName("ResourceType").writeValue(registerTargetWithMaintenanceWindowRequest.getResourceType());
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) registerTargetWithMaintenanceWindowRequest
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
            if (registerTargetWithMaintenanceWindowRequest.getOwnerInformation() != null) {
                jsonGenerator.writeFieldName("OwnerInformation").writeValue(registerTargetWithMaintenanceWindowRequest.getOwnerInformation());
            }
            jsonGenerator.writeFieldName("ClientToken").writeValue(IdempotentUtils.resolveString(registerTargetWithMaintenanceWindowRequest.getClientToken()));

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
