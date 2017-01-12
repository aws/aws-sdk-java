/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model.transform;

import java.io.ByteArrayInputStream;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * SetVaultNotificationsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetVaultNotificationsRequestMarshaller implements Marshaller<Request<SetVaultNotificationsRequest>, SetVaultNotificationsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public SetVaultNotificationsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SetVaultNotificationsRequest> marshall(SetVaultNotificationsRequest setVaultNotificationsRequest) {

        if (setVaultNotificationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetVaultNotificationsRequest> request = new DefaultRequest<SetVaultNotificationsRequest>(setVaultNotificationsRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/notification-configuration";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "accountId",
                setVaultNotificationsRequest.getAccountId() == null ? "-" : setVaultNotificationsRequest.getAccountId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY
                .marshall(uriResourcePath, "vaultName", setVaultNotificationsRequest.getVaultName());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            VaultNotificationConfig vaultNotificationConfig = setVaultNotificationsRequest.getVaultNotificationConfig();
            if (vaultNotificationConfig != null) {
                jsonGenerator.writeStartObject();
                if (vaultNotificationConfig.getSNSTopic() != null) {
                    jsonGenerator.writeFieldName("SNSTopic").writeValue(vaultNotificationConfig.getSNSTopic());
                }

                java.util.List<String> eventsList = vaultNotificationConfig.getEvents();
                if (eventsList != null) {
                    jsonGenerator.writeFieldName("Events");
                    jsonGenerator.writeStartArray();
                    for (String eventsListValue : eventsList) {
                        if (eventsListValue != null) {
                            jsonGenerator.writeValue(eventsListValue);
                        }
                    }
                    jsonGenerator.writeEndArray();
                }
                jsonGenerator.writeEndObject();
            }

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
