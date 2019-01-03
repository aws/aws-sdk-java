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
 * SendTemplatedEmailRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendTemplatedEmailRequestMarshaller implements Marshaller<Request<SendTemplatedEmailRequest>, SendTemplatedEmailRequest> {

    public Request<SendTemplatedEmailRequest> marshall(SendTemplatedEmailRequest sendTemplatedEmailRequest) {

        if (sendTemplatedEmailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendTemplatedEmailRequest> request = new DefaultRequest<SendTemplatedEmailRequest>(sendTemplatedEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendTemplatedEmail");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendTemplatedEmailRequest.getSource() != null) {
            request.addParameter("Source", StringUtils.fromString(sendTemplatedEmailRequest.getSource()));
        }

        {
            Destination destination = sendTemplatedEmailRequest.getDestination();
            if (destination != null) {

                if (!destination.getToAddresses().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) destination.getToAddresses()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> toAddressesList = (com.amazonaws.internal.SdkInternalList<String>) destination
                            .getToAddresses();
                    int toAddressesListIndex = 1;

                    for (String toAddressesListValue : toAddressesList) {
                        if (toAddressesListValue != null) {
                            request.addParameter("Destination.ToAddresses.member." + toAddressesListIndex, StringUtils.fromString(toAddressesListValue));
                        }
                        toAddressesListIndex++;
                    }
                }

                if (!destination.getCcAddresses().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) destination.getCcAddresses()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> ccAddressesList = (com.amazonaws.internal.SdkInternalList<String>) destination
                            .getCcAddresses();
                    int ccAddressesListIndex = 1;

                    for (String ccAddressesListValue : ccAddressesList) {
                        if (ccAddressesListValue != null) {
                            request.addParameter("Destination.CcAddresses.member." + ccAddressesListIndex, StringUtils.fromString(ccAddressesListValue));
                        }
                        ccAddressesListIndex++;
                    }
                }

                if (!destination.getBccAddresses().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) destination.getBccAddresses()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> bccAddressesList = (com.amazonaws.internal.SdkInternalList<String>) destination
                            .getBccAddresses();
                    int bccAddressesListIndex = 1;

                    for (String bccAddressesListValue : bccAddressesList) {
                        if (bccAddressesListValue != null) {
                            request.addParameter("Destination.BccAddresses.member." + bccAddressesListIndex, StringUtils.fromString(bccAddressesListValue));
                        }
                        bccAddressesListIndex++;
                    }
                }
            }
        }

        if (!sendTemplatedEmailRequest.getReplyToAddresses().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) sendTemplatedEmailRequest.getReplyToAddresses()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> replyToAddressesList = (com.amazonaws.internal.SdkInternalList<String>) sendTemplatedEmailRequest
                    .getReplyToAddresses();
            int replyToAddressesListIndex = 1;

            for (String replyToAddressesListValue : replyToAddressesList) {
                if (replyToAddressesListValue != null) {
                    request.addParameter("ReplyToAddresses.member." + replyToAddressesListIndex, StringUtils.fromString(replyToAddressesListValue));
                }
                replyToAddressesListIndex++;
            }
        }

        if (sendTemplatedEmailRequest.getReturnPath() != null) {
            request.addParameter("ReturnPath", StringUtils.fromString(sendTemplatedEmailRequest.getReturnPath()));
        }

        if (sendTemplatedEmailRequest.getSourceArn() != null) {
            request.addParameter("SourceArn", StringUtils.fromString(sendTemplatedEmailRequest.getSourceArn()));
        }

        if (sendTemplatedEmailRequest.getReturnPathArn() != null) {
            request.addParameter("ReturnPathArn", StringUtils.fromString(sendTemplatedEmailRequest.getReturnPathArn()));
        }

        if (!sendTemplatedEmailRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<MessageTag>) sendTemplatedEmailRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<MessageTag> tagsList = (com.amazonaws.internal.SdkInternalList<MessageTag>) sendTemplatedEmailRequest
                    .getTags();
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

        if (sendTemplatedEmailRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName", StringUtils.fromString(sendTemplatedEmailRequest.getConfigurationSetName()));
        }

        if (sendTemplatedEmailRequest.getTemplate() != null) {
            request.addParameter("Template", StringUtils.fromString(sendTemplatedEmailRequest.getTemplate()));
        }

        if (sendTemplatedEmailRequest.getTemplateArn() != null) {
            request.addParameter("TemplateArn", StringUtils.fromString(sendTemplatedEmailRequest.getTemplateArn()));
        }

        if (sendTemplatedEmailRequest.getTemplateData() != null) {
            request.addParameter("TemplateData", StringUtils.fromString(sendTemplatedEmailRequest.getTemplateData()));
        }

        return request;
    }

}
