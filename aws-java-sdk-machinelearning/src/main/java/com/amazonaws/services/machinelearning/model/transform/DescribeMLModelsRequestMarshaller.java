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
 * DescribeMLModelsRequest Marshaller
 */
public class DescribeMLModelsRequestMarshaller implements Marshaller<Request<DescribeMLModelsRequest>, DescribeMLModelsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeMLModelsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeMLModelsRequest> marshall(DescribeMLModelsRequest describeMLModelsRequest) {

        if (describeMLModelsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeMLModelsRequest> request = new DefaultRequest<DescribeMLModelsRequest>(describeMLModelsRequest, "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.DescribeMLModels");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeMLModelsRequest.getFilterVariable() != null) {
                jsonGenerator.writeFieldName("FilterVariable").writeValue(describeMLModelsRequest.getFilterVariable());
            }
            if (describeMLModelsRequest.getEQ() != null) {
                jsonGenerator.writeFieldName("EQ").writeValue(describeMLModelsRequest.getEQ());
            }
            if (describeMLModelsRequest.getGT() != null) {
                jsonGenerator.writeFieldName("GT").writeValue(describeMLModelsRequest.getGT());
            }
            if (describeMLModelsRequest.getLT() != null) {
                jsonGenerator.writeFieldName("LT").writeValue(describeMLModelsRequest.getLT());
            }
            if (describeMLModelsRequest.getGE() != null) {
                jsonGenerator.writeFieldName("GE").writeValue(describeMLModelsRequest.getGE());
            }
            if (describeMLModelsRequest.getLE() != null) {
                jsonGenerator.writeFieldName("LE").writeValue(describeMLModelsRequest.getLE());
            }
            if (describeMLModelsRequest.getNE() != null) {
                jsonGenerator.writeFieldName("NE").writeValue(describeMLModelsRequest.getNE());
            }
            if (describeMLModelsRequest.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(describeMLModelsRequest.getPrefix());
            }
            if (describeMLModelsRequest.getSortOrder() != null) {
                jsonGenerator.writeFieldName("SortOrder").writeValue(describeMLModelsRequest.getSortOrder());
            }
            if (describeMLModelsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeMLModelsRequest.getNextToken());
            }
            if (describeMLModelsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(describeMLModelsRequest.getLimit());
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
