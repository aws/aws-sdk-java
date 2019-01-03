/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SendRawEmailRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendRawEmailRequestMarshaller implements Marshaller<Request<SendRawEmailRequest>, SendRawEmailRequest> {

    public Request<SendRawEmailRequest> marshall(SendRawEmailRequest sendRawEmailRequest) {

        if (sendRawEmailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendRawEmailRequest> request = new DefaultRequest<SendRawEmailRequest>(sendRawEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendRawEmail");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendRawEmailRequest.getSource() != null) {
            request.addParameter("Source", StringUtils.fromString(sendRawEmailRequest.getSource()));
        }

        if (!sendRawEmailRequest.getDestinations().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) sendRawEmailRequest.getDestinations()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> destinationsList = (com.amazonaws.internal.SdkInternalList<String>) sendRawEmailRequest
                    .getDestinations();
            int destinationsListIndex = 1;

            for (String destinationsListValue : destinationsList) {
                if (destinationsListValue != null) {
                    request.addParameter("Destinations.member." + destinationsListIndex, StringUtils.fromString(destinationsListValue));
                }
                destinationsListIndex++;
            }
        }

        {
            RawMessage rawMessage = sendRawEmailRequest.getRawMessage();
            if (rawMessage != null) {

                if (rawMessage.getData() != null) {
                    request.addParameter("RawMessage.Data", StringUtils.fromByteBuffer(rawMessage.getData()));
                }
            }
        }

        if (sendRawEmailRequest.getFromArn() != null) {
            request.addParameter("FromArn", StringUtils.fromString(sendRawEmailRequest.getFromArn()));
        }

        if (sendRawEmailRequest.getSourceArn() != null) {
            request.addParameter("SourceArn", StringUtils.fromString(sendRawEmailRequest.getSourceArn()));
        }

        if (sendRawEmailRequest.getReturnPathArn() != null) {
            request.addParameter("ReturnPathArn", StringUtils.fromString(sendRawEmailRequest.getReturnPathArn()));
        }

        if (!sendRawEmailRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<MessageTag>) sendRawEmailRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<MessageTag> tagsList = (com.amazonaws.internal.SdkInternalList<MessageTag>) sendRawEmailRequest.getTags();
            int tagsListIndex = 1;

            for (MessageTag tagsListValue : tagsList) {

                if (tagsListValue.getName() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Name", StringUtils.fromString(tagsListValue.getName()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        if (sendRawEmailRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName", StringUtils.fromString(sendRawEmailRequest.getConfigurationSetName()));
        }

        return request;
    }

}
