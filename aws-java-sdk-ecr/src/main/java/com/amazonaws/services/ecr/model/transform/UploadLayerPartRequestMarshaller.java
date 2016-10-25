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
package com.amazonaws.services.ecr.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UploadLayerPartRequest Marshaller
 */
public class UploadLayerPartRequestMarshaller implements Marshaller<Request<UploadLayerPartRequest>, UploadLayerPartRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UploadLayerPartRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UploadLayerPartRequest> marshall(UploadLayerPartRequest uploadLayerPartRequest) {

        if (uploadLayerPartRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UploadLayerPartRequest> request = new DefaultRequest<UploadLayerPartRequest>(uploadLayerPartRequest, "AmazonECR");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerRegistry_V20150921.UploadLayerPart");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (uploadLayerPartRequest.getRegistryId() != null) {
                jsonGenerator.writeFieldName("registryId").writeValue(uploadLayerPartRequest.getRegistryId());
            }
            if (uploadLayerPartRequest.getRepositoryName() != null) {
                jsonGenerator.writeFieldName("repositoryName").writeValue(uploadLayerPartRequest.getRepositoryName());
            }
            if (uploadLayerPartRequest.getUploadId() != null) {
                jsonGenerator.writeFieldName("uploadId").writeValue(uploadLayerPartRequest.getUploadId());
            }
            if (uploadLayerPartRequest.getPartFirstByte() != null) {
                jsonGenerator.writeFieldName("partFirstByte").writeValue(uploadLayerPartRequest.getPartFirstByte());
            }
            if (uploadLayerPartRequest.getPartLastByte() != null) {
                jsonGenerator.writeFieldName("partLastByte").writeValue(uploadLayerPartRequest.getPartLastByte());
            }
            if (uploadLayerPartRequest.getLayerPartBlob() != null) {
                jsonGenerator.writeFieldName("layerPartBlob").writeValue(uploadLayerPartRequest.getLayerPartBlob());
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
