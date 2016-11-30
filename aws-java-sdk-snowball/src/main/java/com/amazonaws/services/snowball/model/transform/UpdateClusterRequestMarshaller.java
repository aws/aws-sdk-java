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
package com.amazonaws.services.snowball.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UpdateClusterRequest Marshaller
 */
public class UpdateClusterRequestMarshaller implements Marshaller<Request<UpdateClusterRequest>, UpdateClusterRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateClusterRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateClusterRequest> marshall(UpdateClusterRequest updateClusterRequest) {

        if (updateClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateClusterRequest> request = new DefaultRequest<UpdateClusterRequest>(updateClusterRequest, "AmazonSnowball");
        request.addHeader("X-Amz-Target", "AWSIESnowballJobManagementService.UpdateCluster");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateClusterRequest.getClusterId() != null) {
                jsonGenerator.writeFieldName("ClusterId").writeValue(updateClusterRequest.getClusterId());
            }
            if (updateClusterRequest.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(updateClusterRequest.getRoleARN());
            }
            if (updateClusterRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(updateClusterRequest.getDescription());
            }
            if (updateClusterRequest.getResources() != null) {
                jsonGenerator.writeFieldName("Resources");
                JobResourceJsonMarshaller.getInstance().marshall(updateClusterRequest.getResources(), jsonGenerator);
            }
            if (updateClusterRequest.getAddressId() != null) {
                jsonGenerator.writeFieldName("AddressId").writeValue(updateClusterRequest.getAddressId());
            }
            if (updateClusterRequest.getShippingOption() != null) {
                jsonGenerator.writeFieldName("ShippingOption").writeValue(updateClusterRequest.getShippingOption());
            }
            if (updateClusterRequest.getNotification() != null) {
                jsonGenerator.writeFieldName("Notification");
                NotificationJsonMarshaller.getInstance().marshall(updateClusterRequest.getNotification(), jsonGenerator);
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
