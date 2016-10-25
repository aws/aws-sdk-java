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
package com.amazonaws.services.cognitoidp.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ConfirmDeviceRequest Marshaller
 */
public class ConfirmDeviceRequestMarshaller implements Marshaller<Request<ConfirmDeviceRequest>, ConfirmDeviceRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ConfirmDeviceRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ConfirmDeviceRequest> marshall(ConfirmDeviceRequest confirmDeviceRequest) {

        if (confirmDeviceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ConfirmDeviceRequest> request = new DefaultRequest<ConfirmDeviceRequest>(confirmDeviceRequest, "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.ConfirmDevice");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (confirmDeviceRequest.getAccessToken() != null) {
                jsonGenerator.writeFieldName("AccessToken").writeValue(confirmDeviceRequest.getAccessToken());
            }
            if (confirmDeviceRequest.getDeviceKey() != null) {
                jsonGenerator.writeFieldName("DeviceKey").writeValue(confirmDeviceRequest.getDeviceKey());
            }
            if (confirmDeviceRequest.getDeviceSecretVerifierConfig() != null) {
                jsonGenerator.writeFieldName("DeviceSecretVerifierConfig");
                DeviceSecretVerifierConfigTypeJsonMarshaller.getInstance().marshall(confirmDeviceRequest.getDeviceSecretVerifierConfig(), jsonGenerator);
            }
            if (confirmDeviceRequest.getDeviceName() != null) {
                jsonGenerator.writeFieldName("DeviceName").writeValue(confirmDeviceRequest.getDeviceName());
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
