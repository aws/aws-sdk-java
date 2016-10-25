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
 * UpdateProvisionedProductRequest Marshaller
 */
public class UpdateProvisionedProductRequestMarshaller implements Marshaller<Request<UpdateProvisionedProductRequest>, UpdateProvisionedProductRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateProvisionedProductRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateProvisionedProductRequest> marshall(UpdateProvisionedProductRequest updateProvisionedProductRequest) {

        if (updateProvisionedProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateProvisionedProductRequest> request = new DefaultRequest<UpdateProvisionedProductRequest>(updateProvisionedProductRequest,
                "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.UpdateProvisionedProduct");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateProvisionedProductRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(updateProvisionedProductRequest.getAcceptLanguage());
            }
            if (updateProvisionedProductRequest.getProvisionedProductName() != null) {
                jsonGenerator.writeFieldName("ProvisionedProductName").writeValue(updateProvisionedProductRequest.getProvisionedProductName());
            }
            if (updateProvisionedProductRequest.getProvisionedProductId() != null) {
                jsonGenerator.writeFieldName("ProvisionedProductId").writeValue(updateProvisionedProductRequest.getProvisionedProductId());
            }
            if (updateProvisionedProductRequest.getProductId() != null) {
                jsonGenerator.writeFieldName("ProductId").writeValue(updateProvisionedProductRequest.getProductId());
            }
            if (updateProvisionedProductRequest.getProvisioningArtifactId() != null) {
                jsonGenerator.writeFieldName("ProvisioningArtifactId").writeValue(updateProvisionedProductRequest.getProvisioningArtifactId());
            }
            if (updateProvisionedProductRequest.getPathId() != null) {
                jsonGenerator.writeFieldName("PathId").writeValue(updateProvisionedProductRequest.getPathId());
            }

            java.util.List<UpdateProvisioningParameter> provisioningParametersList = updateProvisionedProductRequest.getProvisioningParameters();
            if (provisioningParametersList != null) {
                jsonGenerator.writeFieldName("ProvisioningParameters");
                jsonGenerator.writeStartArray();
                for (UpdateProvisioningParameter provisioningParametersListValue : provisioningParametersList) {
                    if (provisioningParametersListValue != null) {

                        UpdateProvisioningParameterJsonMarshaller.getInstance().marshall(provisioningParametersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            jsonGenerator.writeFieldName("UpdateToken").writeValue(IdempotentUtils.resolveString(updateProvisionedProductRequest.getUpdateToken()));

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
