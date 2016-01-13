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

package com.amazonaws.services.elastictranscoder.model.transform;

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
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TestRoleRequest Marshaller
 */
public class TestRoleRequestMarshaller implements
        Marshaller<Request<TestRoleRequest>, TestRoleRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<TestRoleRequest> marshall(TestRoleRequest testRoleRequest) {

        if (testRoleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<TestRoleRequest> request = new DefaultRequest<TestRoleRequest>(
                testRoleRequest, "AmazonElasticTranscoder");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2012-09-25/roleTests";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (testRoleRequest.getRole() != null) {
                jsonWriter.key("Role").value(testRoleRequest.getRole());
            }

            if (testRoleRequest.getInputBucket() != null) {
                jsonWriter.key("InputBucket").value(
                        testRoleRequest.getInputBucket());
            }

            if (testRoleRequest.getOutputBucket() != null) {
                jsonWriter.key("OutputBucket").value(
                        testRoleRequest.getOutputBucket());
            }

            com.amazonaws.internal.SdkInternalList<String> topicsList = (com.amazonaws.internal.SdkInternalList<String>) testRoleRequest
                    .getTopics();
            if (!topicsList.isEmpty() || !topicsList.isAutoConstruct()) {
                jsonWriter.key("Topics");
                jsonWriter.array();
                for (String topicsListValue : topicsList) {
                    if (topicsListValue != null) {
                        jsonWriter.value(topicsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
