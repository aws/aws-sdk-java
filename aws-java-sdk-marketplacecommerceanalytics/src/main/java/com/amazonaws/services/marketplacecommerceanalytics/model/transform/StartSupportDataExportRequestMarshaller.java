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
package com.amazonaws.services.marketplacecommerceanalytics.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.marketplacecommerceanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * StartSupportDataExportRequest Marshaller
 */
public class StartSupportDataExportRequestMarshaller implements Marshaller<Request<StartSupportDataExportRequest>, StartSupportDataExportRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public StartSupportDataExportRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<StartSupportDataExportRequest> marshall(StartSupportDataExportRequest startSupportDataExportRequest) {

        if (startSupportDataExportRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartSupportDataExportRequest> request = new DefaultRequest<StartSupportDataExportRequest>(startSupportDataExportRequest,
                "AWSMarketplaceCommerceAnalytics");
        request.addHeader("X-Amz-Target", "MarketplaceCommerceAnalytics20150701.StartSupportDataExport");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (startSupportDataExportRequest.getDataSetType() != null) {
                jsonGenerator.writeFieldName("dataSetType").writeValue(startSupportDataExportRequest.getDataSetType());
            }
            if (startSupportDataExportRequest.getFromDate() != null) {
                jsonGenerator.writeFieldName("fromDate").writeValue(startSupportDataExportRequest.getFromDate());
            }
            if (startSupportDataExportRequest.getRoleNameArn() != null) {
                jsonGenerator.writeFieldName("roleNameArn").writeValue(startSupportDataExportRequest.getRoleNameArn());
            }
            if (startSupportDataExportRequest.getDestinationS3BucketName() != null) {
                jsonGenerator.writeFieldName("destinationS3BucketName").writeValue(startSupportDataExportRequest.getDestinationS3BucketName());
            }
            if (startSupportDataExportRequest.getDestinationS3Prefix() != null) {
                jsonGenerator.writeFieldName("destinationS3Prefix").writeValue(startSupportDataExportRequest.getDestinationS3Prefix());
            }
            if (startSupportDataExportRequest.getSnsTopicArn() != null) {
                jsonGenerator.writeFieldName("snsTopicArn").writeValue(startSupportDataExportRequest.getSnsTopicArn());
            }

            java.util.Map<String, String> customerDefinedValuesMap = startSupportDataExportRequest.getCustomerDefinedValues();
            if (customerDefinedValuesMap != null) {
                jsonGenerator.writeFieldName("customerDefinedValues");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> customerDefinedValuesMapValue : customerDefinedValuesMap.entrySet()) {
                    if (customerDefinedValuesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(customerDefinedValuesMapValue.getKey());

                        jsonGenerator.writeValue(customerDefinedValuesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
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
