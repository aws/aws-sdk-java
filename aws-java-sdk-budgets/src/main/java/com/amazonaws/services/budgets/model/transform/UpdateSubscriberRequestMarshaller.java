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
 * UpdateSubscriberRequest Marshaller
 */
public class UpdateSubscriberRequestMarshaller implements Marshaller<Request<UpdateSubscriberRequest>, UpdateSubscriberRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateSubscriberRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateSubscriberRequest> marshall(UpdateSubscriberRequest updateSubscriberRequest) {

        if (updateSubscriberRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateSubscriberRequest> request = new DefaultRequest<UpdateSubscriberRequest>(updateSubscriberRequest, "AWSBudgets");
        request.addHeader("X-Amz-Target", "AWSBudgetServiceGateway.UpdateSubscriber");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateSubscriberRequest.getAccountId() != null) {
                jsonGenerator.writeFieldName("AccountId").writeValue(updateSubscriberRequest.getAccountId());
            }
            if (updateSubscriberRequest.getBudgetName() != null) {
                jsonGenerator.writeFieldName("BudgetName").writeValue(updateSubscriberRequest.getBudgetName());
            }
            if (updateSubscriberRequest.getNotification() != null) {
                jsonGenerator.writeFieldName("Notification");
                NotificationJsonMarshaller.getInstance().marshall(updateSubscriberRequest.getNotification(), jsonGenerator);
            }
            if (updateSubscriberRequest.getOldSubscriber() != null) {
                jsonGenerator.writeFieldName("OldSubscriber");
                SubscriberJsonMarshaller.getInstance().marshall(updateSubscriberRequest.getOldSubscriber(), jsonGenerator);
            }
            if (updateSubscriberRequest.getNewSubscriber() != null) {
                jsonGenerator.writeFieldName("NewSubscriber");
                SubscriberJsonMarshaller.getInstance().marshall(updateSubscriberRequest.getNewSubscriber(), jsonGenerator);
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
