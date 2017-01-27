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
 * CreateFacetRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFacetRequestMarshaller implements Marshaller<Request<CreateFacetRequest>, CreateFacetRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateFacetRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateFacetRequest> marshall(CreateFacetRequest createFacetRequest) {

        if (createFacetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFacetRequest> request = new DefaultRequest<CreateFacetRequest>(createFacetRequest, "AmazonCloudDirectory");

        request.setHttpMethod(HttpMethodName.PUT);

        if (createFacetRequest.getSchemaArn() != null) {
            request.addHeader("x-amz-data-partition", StringUtils.fromString(createFacetRequest.getSchemaArn()));
        }

        String uriResourcePath = "/amazonclouddirectory/2017-01-11/facet/create";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createFacetRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createFacetRequest.getName());
            }

            java.util.List<FacetAttribute> attributesList = createFacetRequest.getAttributes();
            if (attributesList != null) {
                jsonGenerator.writeFieldName("Attributes");
                jsonGenerator.writeStartArray();
                for (FacetAttribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        FacetAttributeJsonMarshaller.getInstance().marshall(attributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createFacetRequest.getObjectType() != null) {
                jsonGenerator.writeFieldName("ObjectType").writeValue(createFacetRequest.getObjectType());
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
