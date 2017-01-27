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
package com.amazonaws.services.clouddirectory.model.transform;

import java.io.ByteArrayInputStream;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * UpdateFacetRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFacetRequestMarshaller implements Marshaller<Request<UpdateFacetRequest>, UpdateFacetRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateFacetRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateFacetRequest> marshall(UpdateFacetRequest updateFacetRequest) {

        if (updateFacetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateFacetRequest> request = new DefaultRequest<UpdateFacetRequest>(updateFacetRequest, "AmazonCloudDirectory");

        request.setHttpMethod(HttpMethodName.PUT);

        if (updateFacetRequest.getSchemaArn() != null) {
            request.addHeader("x-amz-data-partition", StringUtils.fromString(updateFacetRequest.getSchemaArn()));
        }

        String uriResourcePath = "/amazonclouddirectory/2017-01-11/facet";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (updateFacetRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(updateFacetRequest.getName());
            }

            java.util.List<FacetAttributeUpdate> attributeUpdatesList = updateFacetRequest.getAttributeUpdates();
            if (attributeUpdatesList != null) {
                jsonGenerator.writeFieldName("AttributeUpdates");
                jsonGenerator.writeStartArray();
                for (FacetAttributeUpdate attributeUpdatesListValue : attributeUpdatesList) {
                    if (attributeUpdatesListValue != null) {

                        FacetAttributeUpdateJsonMarshaller.getInstance().marshall(attributeUpdatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (updateFacetRequest.getObjectType() != null) {
                jsonGenerator.writeFieldName("ObjectType").writeValue(updateFacetRequest.getObjectType());
            }

            jsonGenerator.writeEndObject();

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
