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
 * BatchGetImageRequest Marshaller
 */
public class BatchGetImageRequestMarshaller implements Marshaller<Request<BatchGetImageRequest>, BatchGetImageRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public BatchGetImageRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<BatchGetImageRequest> marshall(BatchGetImageRequest batchGetImageRequest) {

        if (batchGetImageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BatchGetImageRequest> request = new DefaultRequest<BatchGetImageRequest>(batchGetImageRequest, "AmazonECR");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerRegistry_V20150921.BatchGetImage");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (batchGetImageRequest.getRegistryId() != null) {
                jsonGenerator.writeFieldName("registryId").writeValue(batchGetImageRequest.getRegistryId());
            }
            if (batchGetImageRequest.getRepositoryName() != null) {
                jsonGenerator.writeFieldName("repositoryName").writeValue(batchGetImageRequest.getRepositoryName());
            }

            java.util.List<ImageIdentifier> imageIdsList = batchGetImageRequest.getImageIds();
            if (imageIdsList != null) {
                jsonGenerator.writeFieldName("imageIds");
                jsonGenerator.writeStartArray();
                for (ImageIdentifier imageIdsListValue : imageIdsList) {
                    if (imageIdsListValue != null) {

                        ImageIdentifierJsonMarshaller.getInstance().marshall(imageIdsListValue, jsonGenerator);
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
