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
package com.amazonaws.services.servicecatalog.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DescribeProvisioningParametersRequest Marshaller
 */
public class DescribeProvisioningParametersRequestMarshaller implements
        Marshaller<Request<DescribeProvisioningParametersRequest>, DescribeProvisioningParametersRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeProvisioningParametersRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeProvisioningParametersRequest> marshall(DescribeProvisioningParametersRequest describeProvisioningParametersRequest) {

        if (describeProvisioningParametersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeProvisioningParametersRequest> request = new DefaultRequest<DescribeProvisioningParametersRequest>(
                describeProvisioningParametersRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.DescribeProvisioningParameters");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeProvisioningParametersRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(describeProvisioningParametersRequest.getAcceptLanguage());
            }
            if (describeProvisioningParametersRequest.getProductId() != null) {
                jsonGenerator.writeFieldName("ProductId").writeValue(describeProvisioningParametersRequest.getProductId());
            }
            if (describeProvisioningParametersRequest.getProvisioningArtifactId() != null) {
                jsonGenerator.writeFieldName("ProvisioningArtifactId").writeValue(describeProvisioningParametersRequest.getProvisioningArtifactId());
            }
            if (describeProvisioningParametersRequest.getPathId() != null) {
                jsonGenerator.writeFieldName("PathId").writeValue(describeProvisioningParametersRequest.getPathId());
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
