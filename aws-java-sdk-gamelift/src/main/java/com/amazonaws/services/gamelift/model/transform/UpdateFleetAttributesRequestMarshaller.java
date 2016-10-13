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
package com.amazonaws.services.gamelift.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UpdateFleetAttributesRequest Marshaller
 */
public class UpdateFleetAttributesRequestMarshaller implements Marshaller<Request<UpdateFleetAttributesRequest>, UpdateFleetAttributesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateFleetAttributesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateFleetAttributesRequest> marshall(UpdateFleetAttributesRequest updateFleetAttributesRequest) {

        if (updateFleetAttributesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateFleetAttributesRequest> request = new DefaultRequest<UpdateFleetAttributesRequest>(updateFleetAttributesRequest, "AmazonGameLift");
        request.addHeader("X-Amz-Target", "GameLift.UpdateFleetAttributes");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateFleetAttributesRequest.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(updateFleetAttributesRequest.getFleetId());
            }
            if (updateFleetAttributesRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(updateFleetAttributesRequest.getName());
            }
            if (updateFleetAttributesRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(updateFleetAttributesRequest.getDescription());
            }
            if (updateFleetAttributesRequest.getNewGameSessionProtectionPolicy() != null) {
                jsonGenerator.writeFieldName("NewGameSessionProtectionPolicy").writeValue(updateFleetAttributesRequest.getNewGameSessionProtectionPolicy());
            }
            if (updateFleetAttributesRequest.getResourceCreationLimitPolicy() != null) {
                jsonGenerator.writeFieldName("ResourceCreationLimitPolicy");
                ResourceCreationLimitPolicyJsonMarshaller.getInstance().marshall(updateFleetAttributesRequest.getResourceCreationLimitPolicy(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
