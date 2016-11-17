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
package com.amazonaws.services.servicecatalog.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateProductRequest Marshaller
 */
public class CreateProductRequestMarshaller implements Marshaller<Request<CreateProductRequest>, CreateProductRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateProductRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateProductRequest> marshall(CreateProductRequest createProductRequest) {

        if (createProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateProductRequest> request = new DefaultRequest<CreateProductRequest>(createProductRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.CreateProduct");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createProductRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(createProductRequest.getAcceptLanguage());
            }
            if (createProductRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createProductRequest.getName());
            }
            if (createProductRequest.getOwner() != null) {
                jsonGenerator.writeFieldName("Owner").writeValue(createProductRequest.getOwner());
            }
            if (createProductRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createProductRequest.getDescription());
            }
            if (createProductRequest.getDistributor() != null) {
                jsonGenerator.writeFieldName("Distributor").writeValue(createProductRequest.getDistributor());
            }
            if (createProductRequest.getSupportDescription() != null) {
                jsonGenerator.writeFieldName("SupportDescription").writeValue(createProductRequest.getSupportDescription());
            }
            if (createProductRequest.getSupportEmail() != null) {
                jsonGenerator.writeFieldName("SupportEmail").writeValue(createProductRequest.getSupportEmail());
            }
            if (createProductRequest.getSupportUrl() != null) {
                jsonGenerator.writeFieldName("SupportUrl").writeValue(createProductRequest.getSupportUrl());
            }
            if (createProductRequest.getProductType() != null) {
                jsonGenerator.writeFieldName("ProductType").writeValue(createProductRequest.getProductType());
            }

            java.util.List<Tag> tagsList = createProductRequest.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createProductRequest.getProvisioningArtifactParameters() != null) {
                jsonGenerator.writeFieldName("ProvisioningArtifactParameters");
                ProvisioningArtifactPropertiesJsonMarshaller.getInstance().marshall(createProductRequest.getProvisioningArtifactParameters(), jsonGenerator);
            }
            jsonGenerator.writeFieldName("IdempotencyToken").writeValue(IdempotentUtils.resolveString(createProductRequest.getIdempotencyToken()));

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
