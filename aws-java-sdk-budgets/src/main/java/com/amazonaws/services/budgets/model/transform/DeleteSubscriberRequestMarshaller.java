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
 * DeleteSubscriberRequest Marshaller
 */
public class DeleteSubscriberRequestMarshaller implements Marshaller<Request<DeleteSubscriberRequest>, DeleteSubscriberRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DeleteSubscriberRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteSubscriberRequest> marshall(DeleteSubscriberRequest deleteSubscriberRequest) {

        if (deleteSubscriberRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteSubscriberRequest> request = new DefaultRequest<DeleteSubscriberRequest>(deleteSubscriberRequest, "AWSBudgets");
        request.addHeader("X-Amz-Target", "AWSBudgetServiceGateway.DeleteSubscriber");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (deleteSubscriberRequest.getAccountId() != null) {
                jsonGenerator.writeFieldName("AccountId").writeValue(deleteSubscriberRequest.getAccountId());
            }
            if (deleteSubscriberRequest.getBudgetName() != null) {
                jsonGenerator.writeFieldName("BudgetName").writeValue(deleteSubscriberRequest.getBudgetName());
            }
            if (deleteSubscriberRequest.getNotification() != null) {
                jsonGenerator.writeFieldName("Notification");
                NotificationJsonMarshaller.getInstance().marshall(deleteSubscriberRequest.getNotification(), jsonGenerator);
            }
            if (deleteSubscriberRequest.getSubscriber() != null) {
                jsonGenerator.writeFieldName("Subscriber");
                SubscriberJsonMarshaller.getInstance().marshall(deleteSubscriberRequest.getSubscriber(), jsonGenerator);
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
