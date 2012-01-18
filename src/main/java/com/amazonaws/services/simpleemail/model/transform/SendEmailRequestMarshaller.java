/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Send Email Request Marshaller
 */
public class SendEmailRequestMarshaller implements Marshaller<Request<SendEmailRequest>, SendEmailRequest> {

    public Request<SendEmailRequest> marshall(SendEmailRequest sendEmailRequest) {

        if (sendEmailRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<SendEmailRequest> request = new DefaultRequest<SendEmailRequest>(sendEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendEmail");
        request.addParameter("Version", "2010-12-01");

        if (sendEmailRequest.getSource() != null) {
            request.addParameter("Source", StringUtils.fromString(sendEmailRequest.getSource()));
        }
        Destination destinationDestination = sendEmailRequest.getDestination();
        if (destinationDestination != null) {

            java.util.List<String> toAddressesList = destinationDestination.getToAddresses();
            int toAddressesListIndex = 1;

            for (String toAddressesListValue : toAddressesList) {
                if (toAddressesListValue != null) {
                    request.addParameter("Destination.ToAddresses.member." + toAddressesListIndex, StringUtils.fromString(toAddressesListValue));
                }

                toAddressesListIndex++;
            }

            java.util.List<String> ccAddressesList = destinationDestination.getCcAddresses();
            int ccAddressesListIndex = 1;

            for (String ccAddressesListValue : ccAddressesList) {
                if (ccAddressesListValue != null) {
                    request.addParameter("Destination.CcAddresses.member." + ccAddressesListIndex, StringUtils.fromString(ccAddressesListValue));
                }

                ccAddressesListIndex++;
            }

            java.util.List<String> bccAddressesList = destinationDestination.getBccAddresses();
            int bccAddressesListIndex = 1;

            for (String bccAddressesListValue : bccAddressesList) {
                if (bccAddressesListValue != null) {
                    request.addParameter("Destination.BccAddresses.member." + bccAddressesListIndex, StringUtils.fromString(bccAddressesListValue));
                }

                bccAddressesListIndex++;
            }
        }
        Message messageMessage = sendEmailRequest.getMessage();
        if (messageMessage != null) {
            Content contentSubject = messageMessage.getSubject();
            if (contentSubject != null) {
                if (contentSubject.getData() != null) {
                    request.addParameter("Message.Subject.Data", StringUtils.fromString(contentSubject.getData()));
                }
                if (contentSubject.getCharset() != null) {
                    request.addParameter("Message.Subject.Charset", StringUtils.fromString(contentSubject.getCharset()));
                }
            }
            Body bodyBody = messageMessage.getBody();
            if (bodyBody != null) {
                Content contentText = bodyBody.getText();
                if (contentText != null) {
                    if (contentText.getData() != null) {
                        request.addParameter("Message.Body.Text.Data", StringUtils.fromString(contentText.getData()));
                    }
                    if (contentText.getCharset() != null) {
                        request.addParameter("Message.Body.Text.Charset", StringUtils.fromString(contentText.getCharset()));
                    }
                }
                Content contentHtml = bodyBody.getHtml();
                if (contentHtml != null) {
                    if (contentHtml.getData() != null) {
                        request.addParameter("Message.Body.Html.Data", StringUtils.fromString(contentHtml.getData()));
                    }
                    if (contentHtml.getCharset() != null) {
                        request.addParameter("Message.Body.Html.Charset", StringUtils.fromString(contentHtml.getCharset()));
                    }
                }
            }
        }

        java.util.List<String> replyToAddressesList = sendEmailRequest.getReplyToAddresses();
        int replyToAddressesListIndex = 1;

        for (String replyToAddressesListValue : replyToAddressesList) {
            if (replyToAddressesListValue != null) {
                request.addParameter("ReplyToAddresses.member." + replyToAddressesListIndex, StringUtils.fromString(replyToAddressesListValue));
            }

            replyToAddressesListIndex++;
        }
        if (sendEmailRequest.getReturnPath() != null) {
            request.addParameter("ReturnPath", StringUtils.fromString(sendEmailRequest.getReturnPath()));
        }


        return request;
    }
}
