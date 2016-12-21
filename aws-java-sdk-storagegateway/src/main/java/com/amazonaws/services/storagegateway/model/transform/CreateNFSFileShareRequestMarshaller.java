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
package com.amazonaws.services.storagegateway.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateNFSFileShareRequest Marshaller
 */
public class CreateNFSFileShareRequestMarshaller implements Marshaller<Request<CreateNFSFileShareRequest>, CreateNFSFileShareRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateNFSFileShareRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateNFSFileShareRequest> marshall(CreateNFSFileShareRequest createNFSFileShareRequest) {

        if (createNFSFileShareRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNFSFileShareRequest> request = new DefaultRequest<CreateNFSFileShareRequest>(createNFSFileShareRequest, "AWSStorageGateway");
        request.addHeader("X-Amz-Target", "StorageGateway_20130630.CreateNFSFileShare");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createNFSFileShareRequest.getClientToken() != null) {
                jsonGenerator.writeFieldName("ClientToken").writeValue(createNFSFileShareRequest.getClientToken());
            }
            if (createNFSFileShareRequest.getNFSFileShareDefaults() != null) {
                jsonGenerator.writeFieldName("NFSFileShareDefaults");
                NFSFileShareDefaultsJsonMarshaller.getInstance().marshall(createNFSFileShareRequest.getNFSFileShareDefaults(), jsonGenerator);
            }
            if (createNFSFileShareRequest.getGatewayARN() != null) {
                jsonGenerator.writeFieldName("GatewayARN").writeValue(createNFSFileShareRequest.getGatewayARN());
            }
            if (createNFSFileShareRequest.getKMSEncrypted() != null) {
                jsonGenerator.writeFieldName("KMSEncrypted").writeValue(createNFSFileShareRequest.getKMSEncrypted());
            }
            if (createNFSFileShareRequest.getKMSKey() != null) {
                jsonGenerator.writeFieldName("KMSKey").writeValue(createNFSFileShareRequest.getKMSKey());
            }
            if (createNFSFileShareRequest.getRole() != null) {
                jsonGenerator.writeFieldName("Role").writeValue(createNFSFileShareRequest.getRole());
            }
            if (createNFSFileShareRequest.getLocationARN() != null) {
                jsonGenerator.writeFieldName("LocationARN").writeValue(createNFSFileShareRequest.getLocationARN());
            }
            if (createNFSFileShareRequest.getDefaultStorageClass() != null) {
                jsonGenerator.writeFieldName("DefaultStorageClass").writeValue(createNFSFileShareRequest.getDefaultStorageClass());
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
