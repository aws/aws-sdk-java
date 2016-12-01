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
package com.amazonaws.services.appstream.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateFleetRequest Marshaller
 */
public class CreateFleetRequestMarshaller implements Marshaller<Request<CreateFleetRequest>, CreateFleetRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateFleetRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateFleetRequest> marshall(CreateFleetRequest createFleetRequest) {

        if (createFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFleetRequest> request = new DefaultRequest<CreateFleetRequest>(createFleetRequest, "AmazonAppStream");
        request.addHeader("X-Amz-Target", "PhotonAdminProxyService.CreateFleet");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createFleetRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createFleetRequest.getName());
            }
            if (createFleetRequest.getImageName() != null) {
                jsonGenerator.writeFieldName("ImageName").writeValue(createFleetRequest.getImageName());
            }
            if (createFleetRequest.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(createFleetRequest.getInstanceType());
            }
            if (createFleetRequest.getComputeCapacity() != null) {
                jsonGenerator.writeFieldName("ComputeCapacity");
                ComputeCapacityJsonMarshaller.getInstance().marshall(createFleetRequest.getComputeCapacity(), jsonGenerator);
            }
            if (createFleetRequest.getVpcConfig() != null) {
                jsonGenerator.writeFieldName("VpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(createFleetRequest.getVpcConfig(), jsonGenerator);
            }
            if (createFleetRequest.getMaxUserDurationInSeconds() != null) {
                jsonGenerator.writeFieldName("MaxUserDurationInSeconds").writeValue(createFleetRequest.getMaxUserDurationInSeconds());
            }
            if (createFleetRequest.getDisconnectTimeoutInSeconds() != null) {
                jsonGenerator.writeFieldName("DisconnectTimeoutInSeconds").writeValue(createFleetRequest.getDisconnectTimeoutInSeconds());
            }
            if (createFleetRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createFleetRequest.getDescription());
            }
            if (createFleetRequest.getDisplayName() != null) {
                jsonGenerator.writeFieldName("DisplayName").writeValue(createFleetRequest.getDisplayName());
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
