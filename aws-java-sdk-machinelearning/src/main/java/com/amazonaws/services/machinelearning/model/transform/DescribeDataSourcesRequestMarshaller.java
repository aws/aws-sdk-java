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
 * DescribeDataSourcesRequest Marshaller
 */
public class DescribeDataSourcesRequestMarshaller implements Marshaller<Request<DescribeDataSourcesRequest>, DescribeDataSourcesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeDataSourcesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeDataSourcesRequest> marshall(DescribeDataSourcesRequest describeDataSourcesRequest) {

        if (describeDataSourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDataSourcesRequest> request = new DefaultRequest<DescribeDataSourcesRequest>(describeDataSourcesRequest, "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.DescribeDataSources");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeDataSourcesRequest.getFilterVariable() != null) {
                jsonGenerator.writeFieldName("FilterVariable").writeValue(describeDataSourcesRequest.getFilterVariable());
            }
            if (describeDataSourcesRequest.getEQ() != null) {
                jsonGenerator.writeFieldName("EQ").writeValue(describeDataSourcesRequest.getEQ());
            }
            if (describeDataSourcesRequest.getGT() != null) {
                jsonGenerator.writeFieldName("GT").writeValue(describeDataSourcesRequest.getGT());
            }
            if (describeDataSourcesRequest.getLT() != null) {
                jsonGenerator.writeFieldName("LT").writeValue(describeDataSourcesRequest.getLT());
            }
            if (describeDataSourcesRequest.getGE() != null) {
                jsonGenerator.writeFieldName("GE").writeValue(describeDataSourcesRequest.getGE());
            }
            if (describeDataSourcesRequest.getLE() != null) {
                jsonGenerator.writeFieldName("LE").writeValue(describeDataSourcesRequest.getLE());
            }
            if (describeDataSourcesRequest.getNE() != null) {
                jsonGenerator.writeFieldName("NE").writeValue(describeDataSourcesRequest.getNE());
            }
            if (describeDataSourcesRequest.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(describeDataSourcesRequest.getPrefix());
            }
            if (describeDataSourcesRequest.getSortOrder() != null) {
                jsonGenerator.writeFieldName("SortOrder").writeValue(describeDataSourcesRequest.getSortOrder());
            }
            if (describeDataSourcesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeDataSourcesRequest.getNextToken());
            }
            if (describeDataSourcesRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(describeDataSourcesRequest.getLimit());
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
