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
package com.amazonaws.services.rekognition.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * IndexFacesRequest Marshaller
 */
public class IndexFacesRequestMarshaller implements Marshaller<Request<IndexFacesRequest>, IndexFacesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public IndexFacesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<IndexFacesRequest> marshall(IndexFacesRequest indexFacesRequest) {

        if (indexFacesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<IndexFacesRequest> request = new DefaultRequest<IndexFacesRequest>(indexFacesRequest, "AmazonRekognition");
        request.addHeader("X-Amz-Target", "RekognitionService.IndexFaces");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (indexFacesRequest.getCollectionId() != null) {
                jsonGenerator.writeFieldName("CollectionId").writeValue(indexFacesRequest.getCollectionId());
            }
            if (indexFacesRequest.getImage() != null) {
                jsonGenerator.writeFieldName("Image");
                ImageJsonMarshaller.getInstance().marshall(indexFacesRequest.getImage(), jsonGenerator);
            }
            if (indexFacesRequest.getExternalImageId() != null) {
                jsonGenerator.writeFieldName("ExternalImageId").writeValue(indexFacesRequest.getExternalImageId());
            }

            java.util.List<String> detectionAttributesList = indexFacesRequest.getDetectionAttributes();
            if (detectionAttributesList != null) {
                jsonGenerator.writeFieldName("DetectionAttributes");
                jsonGenerator.writeStartArray();
                for (String detectionAttributesListValue : detectionAttributesList) {
                    if (detectionAttributesListValue != null) {
                        jsonGenerator.writeValue(detectionAttributesListValue);
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
