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
 * UpdateFleetRequest Marshaller
 */
public class UpdateFleetRequestMarshaller implements Marshaller<Request<UpdateFleetRequest>, UpdateFleetRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateFleetRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateFleetRequest> marshall(UpdateFleetRequest updateFleetRequest) {

        if (updateFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateFleetRequest> request = new DefaultRequest<UpdateFleetRequest>(updateFleetRequest, "AmazonAppStream");
        request.addHeader("X-Amz-Target", "PhotonAdminProxyService.UpdateFleet");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateFleetRequest.getImageName() != null) {
                jsonGenerator.writeFieldName("ImageName").writeValue(updateFleetRequest.getImageName());
            }
            if (updateFleetRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(updateFleetRequest.getName());
            }
            if (updateFleetRequest.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(updateFleetRequest.getInstanceType());
            }
            if (updateFleetRequest.getComputeCapacity() != null) {
                jsonGenerator.writeFieldName("ComputeCapacity");
                ComputeCapacityJsonMarshaller.getInstance().marshall(updateFleetRequest.getComputeCapacity(), jsonGenerator);
            }
            if (updateFleetRequest.getVpcConfig() != null) {
                jsonGenerator.writeFieldName("VpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(updateFleetRequest.getVpcConfig(), jsonGenerator);
            }
            if (updateFleetRequest.getMaxUserDurationInSeconds() != null) {
                jsonGenerator.writeFieldName("MaxUserDurationInSeconds").writeValue(updateFleetRequest.getMaxUserDurationInSeconds());
            }
            if (updateFleetRequest.getDisconnectTimeoutInSeconds() != null) {
                jsonGenerator.writeFieldName("DisconnectTimeoutInSeconds").writeValue(updateFleetRequest.getDisconnectTimeoutInSeconds());
            }
            if (updateFleetRequest.getDeleteVpcConfig() != null) {
                jsonGenerator.writeFieldName("DeleteVpcConfig").writeValue(updateFleetRequest.getDeleteVpcConfig());
            }
            if (updateFleetRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(updateFleetRequest.getDescription());
            }
            if (updateFleetRequest.getDisplayName() != null) {
                jsonGenerator.writeFieldName("DisplayName").writeValue(updateFleetRequest.getDisplayName());
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
