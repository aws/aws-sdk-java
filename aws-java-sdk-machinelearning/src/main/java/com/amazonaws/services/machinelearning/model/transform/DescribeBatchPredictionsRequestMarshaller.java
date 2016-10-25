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
package com.amazonaws.services.machinelearning.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeBatchPredictionsRequest Marshaller
 */
public class DescribeBatchPredictionsRequestMarshaller implements Marshaller<Request<DescribeBatchPredictionsRequest>, DescribeBatchPredictionsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeBatchPredictionsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeBatchPredictionsRequest> marshall(DescribeBatchPredictionsRequest describeBatchPredictionsRequest) {

        if (describeBatchPredictionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeBatchPredictionsRequest> request = new DefaultRequest<DescribeBatchPredictionsRequest>(describeBatchPredictionsRequest,
                "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.DescribeBatchPredictions");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeBatchPredictionsRequest.getFilterVariable() != null) {
                jsonGenerator.writeFieldName("FilterVariable").writeValue(describeBatchPredictionsRequest.getFilterVariable());
            }
            if (describeBatchPredictionsRequest.getEQ() != null) {
                jsonGenerator.writeFieldName("EQ").writeValue(describeBatchPredictionsRequest.getEQ());
            }
            if (describeBatchPredictionsRequest.getGT() != null) {
                jsonGenerator.writeFieldName("GT").writeValue(describeBatchPredictionsRequest.getGT());
            }
            if (describeBatchPredictionsRequest.getLT() != null) {
                jsonGenerator.writeFieldName("LT").writeValue(describeBatchPredictionsRequest.getLT());
            }
            if (describeBatchPredictionsRequest.getGE() != null) {
                jsonGenerator.writeFieldName("GE").writeValue(describeBatchPredictionsRequest.getGE());
            }
            if (describeBatchPredictionsRequest.getLE() != null) {
                jsonGenerator.writeFieldName("LE").writeValue(describeBatchPredictionsRequest.getLE());
            }
            if (describeBatchPredictionsRequest.getNE() != null) {
                jsonGenerator.writeFieldName("NE").writeValue(describeBatchPredictionsRequest.getNE());
            }
            if (describeBatchPredictionsRequest.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(describeBatchPredictionsRequest.getPrefix());
            }
            if (describeBatchPredictionsRequest.getSortOrder() != null) {
                jsonGenerator.writeFieldName("SortOrder").writeValue(describeBatchPredictionsRequest.getSortOrder());
            }
            if (describeBatchPredictionsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeBatchPredictionsRequest.getNextToken());
            }
            if (describeBatchPredictionsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(describeBatchPredictionsRequest.getLimit());
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
