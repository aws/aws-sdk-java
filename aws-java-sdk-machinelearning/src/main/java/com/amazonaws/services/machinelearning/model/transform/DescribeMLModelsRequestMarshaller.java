/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.machinelearning.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DescribeMLModelsRequest Marshaller
 */
public class DescribeMLModelsRequestMarshaller implements
        Marshaller<Request<DescribeMLModelsRequest>, DescribeMLModelsRequest> {

    public Request<DescribeMLModelsRequest> marshall(
            DescribeMLModelsRequest describeMLModelsRequest) {

        if (describeMLModelsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeMLModelsRequest> request = new DefaultRequest<DescribeMLModelsRequest>(
                describeMLModelsRequest, "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.DescribeMLModels");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (describeMLModelsRequest.getFilterVariable() != null) {
                jsonWriter.key("FilterVariable").value(
                        describeMLModelsRequest.getFilterVariable());
            }

            if (describeMLModelsRequest.getEQ() != null) {
                jsonWriter.key("EQ").value(describeMLModelsRequest.getEQ());
            }

            if (describeMLModelsRequest.getGT() != null) {
                jsonWriter.key("GT").value(describeMLModelsRequest.getGT());
            }

            if (describeMLModelsRequest.getLT() != null) {
                jsonWriter.key("LT").value(describeMLModelsRequest.getLT());
            }

            if (describeMLModelsRequest.getGE() != null) {
                jsonWriter.key("GE").value(describeMLModelsRequest.getGE());
            }

            if (describeMLModelsRequest.getLE() != null) {
                jsonWriter.key("LE").value(describeMLModelsRequest.getLE());
            }

            if (describeMLModelsRequest.getNE() != null) {
                jsonWriter.key("NE").value(describeMLModelsRequest.getNE());
            }

            if (describeMLModelsRequest.getPrefix() != null) {
                jsonWriter.key("Prefix").value(
                        describeMLModelsRequest.getPrefix());
            }

            if (describeMLModelsRequest.getSortOrder() != null) {
                jsonWriter.key("SortOrder").value(
                        describeMLModelsRequest.getSortOrder());
            }

            if (describeMLModelsRequest.getNextToken() != null) {
                jsonWriter.key("NextToken").value(
                        describeMLModelsRequest.getNextToken());
            }

            if (describeMLModelsRequest.getLimit() != null) {
                jsonWriter.key("Limit").value(
                        describeMLModelsRequest.getLimit());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
