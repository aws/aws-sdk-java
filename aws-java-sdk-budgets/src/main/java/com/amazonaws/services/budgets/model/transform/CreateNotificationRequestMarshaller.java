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
package com.amazonaws.services.budgets.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.budgets.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateNotificationRequest Marshaller
 */
public class CreateNotificationRequestMarshaller implements Marshaller<Request<CreateNotificationRequest>, CreateNotificationRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateNotificationRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateNotificationRequest> marshall(CreateNotificationRequest createNotificationRequest) {

        if (createNotificationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNotificationRequest> request = new DefaultRequest<CreateNotificationRequest>(createNotificationRequest, "AWSBudgets");
        request.addHeader("X-Amz-Target", "AWSBudgetServiceGateway.CreateNotification");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createNotificationRequest.getAccountId() != null) {
                jsonGenerator.writeFieldName("AccountId").writeValue(createNotificationRequest.getAccountId());
            }
            if (createNotificationRequest.getBudgetName() != null) {
                jsonGenerator.writeFieldName("BudgetName").writeValue(createNotificationRequest.getBudgetName());
            }
            if (createNotificationRequest.getNotification() != null) {
                jsonGenerator.writeFieldName("Notification");
                NotificationJsonMarshaller.getInstance().marshall(createNotificationRequest.getNotification(), jsonGenerator);
            }

            java.util.List<Subscriber> subscribersList = createNotificationRequest.getSubscribers();
            if (subscribersList != null) {
                jsonGenerator.writeFieldName("Subscribers");
                jsonGenerator.writeStartArray();
                for (Subscriber subscribersListValue : subscribersList) {
                    if (subscribersListValue != null) {

                        SubscriberJsonMarshaller.getInstance().marshall(subscribersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
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
