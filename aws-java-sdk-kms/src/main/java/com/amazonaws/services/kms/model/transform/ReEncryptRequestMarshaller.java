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
package com.amazonaws.services.kms.model.transform;

import java.io.ByteArrayInputStream;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * ReEncryptRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReEncryptRequestMarshaller implements Marshaller<Request<ReEncryptRequest>, ReEncryptRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ReEncryptRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ReEncryptRequest> marshall(ReEncryptRequest reEncryptRequest) {

        if (reEncryptRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReEncryptRequest> request = new DefaultRequest<ReEncryptRequest>(reEncryptRequest, "AWSKMS");
        request.addHeader("X-Amz-Target", "TrentService.ReEncrypt");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (reEncryptRequest.getCiphertextBlob() != null) {
                jsonGenerator.writeFieldName("CiphertextBlob").writeValue(reEncryptRequest.getCiphertextBlob());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> sourceEncryptionContextMap = (com.amazonaws.internal.SdkInternalMap<String, String>) reEncryptRequest
                    .getSourceEncryptionContext();
            if (!sourceEncryptionContextMap.isEmpty() || !sourceEncryptionContextMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SourceEncryptionContext");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> sourceEncryptionContextMapValue : sourceEncryptionContextMap.entrySet()) {
                    if (sourceEncryptionContextMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(sourceEncryptionContextMapValue.getKey());

                        jsonGenerator.writeValue(sourceEncryptionContextMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (reEncryptRequest.getDestinationKeyId() != null) {
                jsonGenerator.writeFieldName("DestinationKeyId").writeValue(reEncryptRequest.getDestinationKeyId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> destinationEncryptionContextMap = (com.amazonaws.internal.SdkInternalMap<String, String>) reEncryptRequest
                    .getDestinationEncryptionContext();
            if (!destinationEncryptionContextMap.isEmpty() || !destinationEncryptionContextMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DestinationEncryptionContext");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> destinationEncryptionContextMapValue : destinationEncryptionContextMap.entrySet()) {
                    if (destinationEncryptionContextMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(destinationEncryptionContextMapValue.getKey());

                        jsonGenerator.writeValue(destinationEncryptionContextMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalList<String> grantTokensList = (com.amazonaws.internal.SdkInternalList<String>) reEncryptRequest.getGrantTokens();
            if (!grantTokensList.isEmpty() || !grantTokensList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("GrantTokens");
                jsonGenerator.writeStartArray();
                for (String grantTokensListValue : grantTokensList) {
                    if (grantTokensListValue != null) {
                        jsonGenerator.writeValue(grantTokensListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
