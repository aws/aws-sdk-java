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
 * SendBulkTemplatedEmailRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendBulkTemplatedEmailRequestMarshaller implements Marshaller<Request<SendBulkTemplatedEmailRequest>, SendBulkTemplatedEmailRequest> {

    public Request<SendBulkTemplatedEmailRequest> marshall(SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest) {

        if (sendBulkTemplatedEmailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendBulkTemplatedEmailRequest> request = new DefaultRequest<SendBulkTemplatedEmailRequest>(sendBulkTemplatedEmailRequest,
                "AmazonSimpleEmailService");
        request.addParameter("Action", "SendBulkTemplatedEmail");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendBulkTemplatedEmailRequest.getSource() != null) {
            request.addParameter("Source", StringUtils.fromString(sendBulkTemplatedEmailRequest.getSource()));
        }

        if (sendBulkTemplatedEmailRequest.getSourceArn() != null) {
            request.addParameter("SourceArn", StringUtils.fromString(sendBulkTemplatedEmailRequest.getSourceArn()));
        }

        if (!sendBulkTemplatedEmailRequest.getReplyToAddresses().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) sendBulkTemplatedEmailRequest.getReplyToAddresses()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> replyToAddressesList = (com.amazonaws.internal.SdkInternalList<String>) sendBulkTemplatedEmailRequest
                    .getReplyToAddresses();
            int replyToAddressesListIndex = 1;

            for (String replyToAddressesListValue : replyToAddressesList) {
                if (replyToAddressesListValue != null) {
                    request.addParameter("ReplyToAddresses.member." + replyToAddressesListIndex, StringUtils.fromString(replyToAddressesListValue));
                }
                replyToAddressesListIndex++;
            }
        }

        if (sendBulkTemplatedEmailRequest.getReturnPath() != null) {
            request.addParameter("ReturnPath", StringUtils.fromString(sendBulkTemplatedEmailRequest.getReturnPath()));
        }

        if (sendBulkTemplatedEmailRequest.getReturnPathArn() != null) {
            request.addParameter("ReturnPathArn", StringUtils.fromString(sendBulkTemplatedEmailRequest.getReturnPathArn()));
        }

        if (sendBulkTemplatedEmailRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName", StringUtils.fromString(sendBulkTemplatedEmailRequest.getConfigurationSetName()));
        }

        if (!sendBulkTemplatedEmailRequest.getDefaultTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<MessageTag>) sendBulkTemplatedEmailRequest.getDefaultTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<MessageTag> defaultTagsList = (com.amazonaws.internal.SdkInternalList<MessageTag>) sendBulkTemplatedEmailRequest
                    .getDefaultTags();
            int defaultTagsListIndex = 1;

            for (MessageTag defaultTagsListValue : defaultTagsList) {

                if (defaultTagsListValue.getName() != null) {
                    request.addParameter("DefaultTags.member." + defaultTagsListIndex + ".Name", StringUtils.fromString(defaultTagsListValue.getName()));
                }

                if (defaultTagsListValue.getValue() != null) {
                    request.addParameter("DefaultTags.member." + defaultTagsListIndex + ".Value", StringUtils.fromString(defaultTagsListValue.getValue()));
                }
                defaultTagsListIndex++;
            }
        }

        if (sendBulkTemplatedEmailRequest.getTemplate() != null) {
            request.addParameter("Template", StringUtils.fromString(sendBulkTemplatedEmailRequest.getTemplate()));
        }

        if (sendBulkTemplatedEmailRequest.getTemplateArn() != null) {
            request.addParameter("TemplateArn", StringUtils.fromString(sendBulkTemplatedEmailRequest.getTemplateArn()));
        }

        if (sendBulkTemplatedEmailRequest.getDefaultTemplateData() != null) {
            request.addParameter("DefaultTemplateData", StringUtils.fromString(sendBulkTemplatedEmailRequest.getDefaultTemplateData()));
        }

        if (!sendBulkTemplatedEmailRequest.getDestinations().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<BulkEmailDestination>) sendBulkTemplatedEmailRequest.getDestinations()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<BulkEmailDestination> destinationsList = (com.amazonaws.internal.SdkInternalList<BulkEmailDestination>) sendBulkTemplatedEmailRequest
                    .getDestinations();
            int destinationsListIndex = 1;

            for (BulkEmailDestination destinationsListValue : destinationsList) {

                {
                    Destination destination = destinationsListValue.getDestination();
                    if (destination != null) {

                        if (!destination.getToAddresses().isEmpty()
                                || !((com.amazonaws.internal.SdkInternalList<String>) destination.getToAddresses()).isAutoConstruct()) {
                            com.amazonaws.internal.SdkInternalList<String> toAddressesList = (com.amazonaws.internal.SdkInternalList<String>) destination
                                    .getToAddresses();
                            int toAddressesListIndex = 1;

                            for (String toAddressesListValue : toAddressesList) {
                                if (toAddressesListValue != null) {
                                    request.addParameter("Destinations.member." + destinationsListIndex + ".Destination.ToAddresses.member."
                                            + toAddressesListIndex, StringUtils.fromString(toAddressesListValue));
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
                                    request.addParameter("Destinations.member." + destinationsListIndex + ".Destination.CcAddresses.member."
                                            + ccAddressesListIndex, StringUtils.fromString(ccAddressesListValue));
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
                                    request.addParameter("Destinations.member." + destinationsListIndex + ".Destination.BccAddresses.member."
                                            + bccAddressesListIndex, StringUtils.fromString(bccAddressesListValue));
                                }
                                bccAddressesListIndex++;
                            }
                        }
                    }
                }

                if (!destinationsListValue.getReplacementTags().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<MessageTag>) destinationsListValue.getReplacementTags()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<MessageTag> replacementTagsList = (com.amazonaws.internal.SdkInternalList<MessageTag>) destinationsListValue
                            .getReplacementTags();
                    int replacementTagsListIndex = 1;

                    for (MessageTag replacementTagsListValue : replacementTagsList) {

                        if (replacementTagsListValue.getName() != null) {
                            request.addParameter("Destinations.member." + destinationsListIndex + ".ReplacementTags.member." + replacementTagsListIndex
                                    + ".Name", StringUtils.fromString(replacementTagsListValue.getName()));
                        }

                        if (replacementTagsListValue.getValue() != null) {
                            request.addParameter("Destinations.member." + destinationsListIndex + ".ReplacementTags.member." + replacementTagsListIndex
                                    + ".Value", StringUtils.fromString(replacementTagsListValue.getValue()));
                        }
                        replacementTagsListIndex++;
                    }
                }

                if (destinationsListValue.getReplacementTemplateData() != null) {
                    request.addParameter("Destinations.member." + destinationsListIndex + ".ReplacementTemplateData",
                            StringUtils.fromString(destinationsListValue.getReplacementTemplateData()));
                }
                destinationsListIndex++;
            }
        }

        return request;
    }

}
