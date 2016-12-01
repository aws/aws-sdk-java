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
 * CreateMaintenanceWindowRequest Marshaller
 */
public class CreateMaintenanceWindowRequestMarshaller implements Marshaller<Request<CreateMaintenanceWindowRequest>, CreateMaintenanceWindowRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateMaintenanceWindowRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateMaintenanceWindowRequest> marshall(CreateMaintenanceWindowRequest createMaintenanceWindowRequest) {

        if (createMaintenanceWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateMaintenanceWindowRequest> request = new DefaultRequest<CreateMaintenanceWindowRequest>(createMaintenanceWindowRequest,
                "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.CreateMaintenanceWindow");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createMaintenanceWindowRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createMaintenanceWindowRequest.getName());
            }
            if (createMaintenanceWindowRequest.getSchedule() != null) {
                jsonGenerator.writeFieldName("Schedule").writeValue(createMaintenanceWindowRequest.getSchedule());
            }
            if (createMaintenanceWindowRequest.getDuration() != null) {
                jsonGenerator.writeFieldName("Duration").writeValue(createMaintenanceWindowRequest.getDuration());
            }
            if (createMaintenanceWindowRequest.getCutoff() != null) {
                jsonGenerator.writeFieldName("Cutoff").writeValue(createMaintenanceWindowRequest.getCutoff());
            }
            if (createMaintenanceWindowRequest.getAllowUnassociatedTargets() != null) {
                jsonGenerator.writeFieldName("AllowUnassociatedTargets").writeValue(createMaintenanceWindowRequest.getAllowUnassociatedTargets());
            }
            jsonGenerator.writeFieldName("ClientToken").writeValue(IdempotentUtils.resolveString(createMaintenanceWindowRequest.getClientToken()));

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
