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

package com.amazonaws.services.datapipeline.model.transform;

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
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DescribeObjectsRequest Marshaller
 */
public class DescribeObjectsRequestMarshaller implements
        Marshaller<Request<DescribeObjectsRequest>, DescribeObjectsRequest> {

    public Request<DescribeObjectsRequest> marshall(
            DescribeObjectsRequest describeObjectsRequest) {

        if (describeObjectsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeObjectsRequest> request = new DefaultRequest<DescribeObjectsRequest>(
                describeObjectsRequest, "DataPipeline");
        request.addHeader("X-Amz-Target", "DataPipeline.DescribeObjects");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (describeObjectsRequest.getPipelineId() != null) {
                jsonWriter.key("pipelineId").value(
                        describeObjectsRequest.getPipelineId());
            }

            com.amazonaws.internal.SdkInternalList<String> objectIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeObjectsRequest
                    .getObjectIds();
            if (!objectIdsList.isEmpty() || !objectIdsList.isAutoConstruct()) {
                jsonWriter.key("objectIds");
                jsonWriter.array();
                for (String objectIdsListValue : objectIdsList) {
                    if (objectIdsListValue != null) {
                        jsonWriter.value(objectIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (describeObjectsRequest.getEvaluateExpressions() != null) {
                jsonWriter.key("evaluateExpressions").value(
                        describeObjectsRequest.getEvaluateExpressions());
            }

            if (describeObjectsRequest.getMarker() != null) {
                jsonWriter.key("marker").value(
                        describeObjectsRequest.getMarker());
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
