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

package com.amazonaws.services.logs.model.transform;

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
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * FilterLogEventsRequest Marshaller
 */
public class FilterLogEventsRequestMarshaller implements
        Marshaller<Request<FilterLogEventsRequest>, FilterLogEventsRequest> {

    public Request<FilterLogEventsRequest> marshall(
            FilterLogEventsRequest filterLogEventsRequest) {

        if (filterLogEventsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<FilterLogEventsRequest> request = new DefaultRequest<FilterLogEventsRequest>(
                filterLogEventsRequest, "AWSLogs");
        request.addHeader("X-Amz-Target", "Logs_20140328.FilterLogEvents");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (filterLogEventsRequest.getLogGroupName() != null) {
                jsonWriter.key("logGroupName").value(
                        filterLogEventsRequest.getLogGroupName());
            }

            com.amazonaws.internal.SdkInternalList<String> logStreamNamesList = (com.amazonaws.internal.SdkInternalList<String>) filterLogEventsRequest
                    .getLogStreamNames();
            if (!logStreamNamesList.isEmpty()
                    || !logStreamNamesList.isAutoConstruct()) {
                jsonWriter.key("logStreamNames");
                jsonWriter.array();
                for (String logStreamNamesListValue : logStreamNamesList) {
                    if (logStreamNamesListValue != null) {
                        jsonWriter.value(logStreamNamesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (filterLogEventsRequest.getStartTime() != null) {
                jsonWriter.key("startTime").value(
                        filterLogEventsRequest.getStartTime());
            }

            if (filterLogEventsRequest.getEndTime() != null) {
                jsonWriter.key("endTime").value(
                        filterLogEventsRequest.getEndTime());
            }

            if (filterLogEventsRequest.getFilterPattern() != null) {
                jsonWriter.key("filterPattern").value(
                        filterLogEventsRequest.getFilterPattern());
            }

            if (filterLogEventsRequest.getNextToken() != null) {
                jsonWriter.key("nextToken").value(
                        filterLogEventsRequest.getNextToken());
            }

            if (filterLogEventsRequest.getLimit() != null) {
                jsonWriter.key("limit")
                        .value(filterLogEventsRequest.getLimit());
            }

            if (filterLogEventsRequest.getInterleaved() != null) {
                jsonWriter.key("interleaved").value(
                        filterLogEventsRequest.getInterleaved());
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
