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

package com.amazonaws.services.simplesystemsmanagement.model.transform;

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
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * SendCommandRequest Marshaller
 */
public class SendCommandRequestMarshaller implements
        Marshaller<Request<SendCommandRequest>, SendCommandRequest> {

    public Request<SendCommandRequest> marshall(
            SendCommandRequest sendCommandRequest) {

        if (sendCommandRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SendCommandRequest> request = new DefaultRequest<SendCommandRequest>(
                sendCommandRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.SendCommand");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) sendCommandRequest
                    .getInstanceIds();
            if (!instanceIdsList.isEmpty()
                    || !instanceIdsList.isAutoConstruct()) {
                jsonWriter.key("InstanceIds");
                jsonWriter.array();
                for (String instanceIdsListValue : instanceIdsList) {
                    if (instanceIdsListValue != null) {
                        jsonWriter.value(instanceIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (sendCommandRequest.getDocumentName() != null) {
                jsonWriter.key("DocumentName").value(
                        sendCommandRequest.getDocumentName());
            }

            if (sendCommandRequest.getTimeoutSeconds() != null) {
                jsonWriter.key("TimeoutSeconds").value(
                        sendCommandRequest.getTimeoutSeconds());
            }

            if (sendCommandRequest.getComment() != null) {
                jsonWriter.key("Comment")
                        .value(sendCommandRequest.getComment());
            }

            java.util.Map<String, java.util.List<String>> parametersMap = sendCommandRequest
                    .getParameters();
            if (parametersMap != null) {
                jsonWriter.key("Parameters");
                jsonWriter.object();

                for (Map.Entry<String, java.util.List<String>> parametersMapValue : parametersMap
                        .entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonWriter.key(parametersMapValue.getKey());

                        jsonWriter.array();
                        for (String parametersMapValueList : parametersMapValue
                                .getValue()) {
                            if (parametersMapValueList != null) {
                                jsonWriter.value(parametersMapValueList);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }

            if (sendCommandRequest.getOutputS3BucketName() != null) {
                jsonWriter.key("OutputS3BucketName").value(
                        sendCommandRequest.getOutputS3BucketName());
            }

            if (sendCommandRequest.getOutputS3KeyPrefix() != null) {
                jsonWriter.key("OutputS3KeyPrefix").value(
                        sendCommandRequest.getOutputS3KeyPrefix());
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
