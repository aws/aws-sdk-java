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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SendCommandRequest Marshaller
 */
public class SendCommandRequestMarshaller implements Marshaller<Request<SendCommandRequest>, SendCommandRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SendCommandRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SendCommandRequest> marshall(SendCommandRequest sendCommandRequest) {

        if (sendCommandRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendCommandRequest> request = new DefaultRequest<SendCommandRequest>(sendCommandRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.SendCommand");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) sendCommandRequest
                    .getInstanceIds();
            if (!instanceIdsList.isEmpty() || !instanceIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstanceIds");
                jsonGenerator.writeStartArray();
                for (String instanceIdsListValue : instanceIdsList) {
                    if (instanceIdsListValue != null) {
                        jsonGenerator.writeValue(instanceIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (sendCommandRequest.getDocumentName() != null) {
                jsonGenerator.writeFieldName("DocumentName").writeValue(sendCommandRequest.getDocumentName());
            }
            if (sendCommandRequest.getDocumentHash() != null) {
                jsonGenerator.writeFieldName("DocumentHash").writeValue(sendCommandRequest.getDocumentHash());
            }
            if (sendCommandRequest.getDocumentHashType() != null) {
                jsonGenerator.writeFieldName("DocumentHashType").writeValue(sendCommandRequest.getDocumentHashType());
            }
            if (sendCommandRequest.getTimeoutSeconds() != null) {
                jsonGenerator.writeFieldName("TimeoutSeconds").writeValue(sendCommandRequest.getTimeoutSeconds());
            }
            if (sendCommandRequest.getComment() != null) {
                jsonGenerator.writeFieldName("Comment").writeValue(sendCommandRequest.getComment());
            }

            java.util.Map<String, java.util.List<String>> parametersMap = sendCommandRequest.getParameters();
            if (parametersMap != null) {
                jsonGenerator.writeFieldName("Parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String parametersMapValueList : parametersMapValue.getValue()) {
                            if (parametersMapValueList != null) {
                                jsonGenerator.writeValue(parametersMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (sendCommandRequest.getOutputS3BucketName() != null) {
                jsonGenerator.writeFieldName("OutputS3BucketName").writeValue(sendCommandRequest.getOutputS3BucketName());
            }
            if (sendCommandRequest.getOutputS3KeyPrefix() != null) {
                jsonGenerator.writeFieldName("OutputS3KeyPrefix").writeValue(sendCommandRequest.getOutputS3KeyPrefix());
            }
            if (sendCommandRequest.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(sendCommandRequest.getServiceRoleArn());
            }
            if (sendCommandRequest.getNotificationConfig() != null) {
                jsonGenerator.writeFieldName("NotificationConfig");
                NotificationConfigJsonMarshaller.getInstance().marshall(sendCommandRequest.getNotificationConfig(), jsonGenerator);
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
