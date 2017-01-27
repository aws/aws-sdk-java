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
 * CreateObjectRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateObjectRequestMarshaller implements Marshaller<Request<CreateObjectRequest>, CreateObjectRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateObjectRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateObjectRequest> marshall(CreateObjectRequest createObjectRequest) {

        if (createObjectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateObjectRequest> request = new DefaultRequest<CreateObjectRequest>(createObjectRequest, "AmazonCloudDirectory");

        request.setHttpMethod(HttpMethodName.PUT);

        if (createObjectRequest.getDirectoryArn() != null) {
            request.addHeader("x-amz-data-partition", StringUtils.fromString(createObjectRequest.getDirectoryArn()));
        }

        String uriResourcePath = "/amazonclouddirectory/2017-01-11/object";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.List<SchemaFacet> schemaFacetsList = createObjectRequest.getSchemaFacets();
            if (schemaFacetsList != null) {
                jsonGenerator.writeFieldName("SchemaFacets");
                jsonGenerator.writeStartArray();
                for (SchemaFacet schemaFacetsListValue : schemaFacetsList) {
                    if (schemaFacetsListValue != null) {

                        SchemaFacetJsonMarshaller.getInstance().marshall(schemaFacetsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<AttributeKeyAndValue> objectAttributeListList = createObjectRequest.getObjectAttributeList();
            if (objectAttributeListList != null) {
                jsonGenerator.writeFieldName("ObjectAttributeList");
                jsonGenerator.writeStartArray();
                for (AttributeKeyAndValue objectAttributeListListValue : objectAttributeListList) {
                    if (objectAttributeListListValue != null) {

                        AttributeKeyAndValueJsonMarshaller.getInstance().marshall(objectAttributeListListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createObjectRequest.getParentReference() != null) {
                jsonGenerator.writeFieldName("ParentReference");
                ObjectReferenceJsonMarshaller.getInstance().marshall(createObjectRequest.getParentReference(), jsonGenerator);
            }
            if (createObjectRequest.getLinkName() != null) {
                jsonGenerator.writeFieldName("LinkName").writeValue(createObjectRequest.getLinkName());
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
