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
package com.amazonaws.services.marketplacemetering.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.marketplacemetering.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * MeterUsageRequest Marshaller
 */
public class MeterUsageRequestMarshaller implements Marshaller<Request<MeterUsageRequest>, MeterUsageRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public MeterUsageRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<MeterUsageRequest> marshall(MeterUsageRequest meterUsageRequest) {

        if (meterUsageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<MeterUsageRequest> request = new DefaultRequest<MeterUsageRequest>(meterUsageRequest, "AWSMarketplaceMetering");
        request.addHeader("X-Amz-Target", "AWSMPMeteringService.MeterUsage");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (meterUsageRequest.getProductCode() != null) {
                jsonGenerator.writeFieldName("ProductCode").writeValue(meterUsageRequest.getProductCode());
            }
            if (meterUsageRequest.getTimestamp() != null) {
                jsonGenerator.writeFieldName("Timestamp").writeValue(meterUsageRequest.getTimestamp());
            }
            if (meterUsageRequest.getUsageDimension() != null) {
                jsonGenerator.writeFieldName("UsageDimension").writeValue(meterUsageRequest.getUsageDimension());
            }
            if (meterUsageRequest.getUsageQuantity() != null) {
                jsonGenerator.writeFieldName("UsageQuantity").writeValue(meterUsageRequest.getUsageQuantity());
            }
            if (meterUsageRequest.getDryRun() != null) {
                jsonGenerator.writeFieldName("DryRun").writeValue(meterUsageRequest.getDryRun());
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
