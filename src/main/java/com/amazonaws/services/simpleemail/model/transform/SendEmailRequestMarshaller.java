/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        Request<SendEmailRequest> request = new DefaultRequest<SendEmailRequest>(sendEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendEmail");
        request.addParameter("Version", "2010-12-01");
        if (sendEmailRequest != null) {
            if (sendEmailRequest.getSource() != null) {
                request.addParameter("Source", StringUtils.fromString(sendEmailRequest.getSource()));
            }
        }
        if (sendEmailRequest != null) {
            Destination destination = sendEmailRequest.getDestination();
            if (destination != null) {
                java.util.List<String> toAddressesList = destination.getToAddresses();
                int toAddressesListIndex = 1;

                for (String toAddressesListValue : toAddressesList) {
                    if (toAddressesListValue != null) {
                        request.addParameter("Destination.ToAddresses.member." + toAddressesListIndex, StringUtils.fromString(toAddressesListValue));
                    }
                    toAddressesListIndex++;
                }
            }
            if (destination != null) {
                java.util.List<String> ccAddressesList = destination.getCcAddresses();
                int ccAddressesListIndex = 1;

                for (String ccAddressesListValue : ccAddressesList) {
                    if (ccAddressesListValue != null) {
                        request.addParameter("Destination.CcAddresses.member." + ccAddressesListIndex, StringUtils.fromString(ccAddressesListValue));
                    }
                    ccAddressesListIndex++;
                }
            }
            if (destination != null) {
                java.util.List<String> bccAddressesList = destination.getBccAddresses();
                int bccAddressesListIndex = 1;

                for (String bccAddressesListValue : bccAddressesList) {
                    if (bccAddressesListValue != null) {
                        request.addParameter("Destination.BccAddresses.member." + bccAddressesListIndex, StringUtils.fromString(bccAddressesListValue));
                    }
                    bccAddressesListIndex++;
                }
            }
        }
        if (sendEmailRequest != null) {
            Message message = sendEmailRequest.getMessage();
            if (message != null) {
                Content subject = message.getSubject();
                if (subject != null) {
                    if (subject.getData() != null) {
                        request.addParameter("Message.Subject.Data", StringUtils.fromString(subject.getData()));
                    }
                }
                if (subject != null) {
                    if (subject.getCharset() != null) {
                        request.addParameter("Message.Subject.Charset", StringUtils.fromString(subject.getCharset()));
                    }
                }
            }
            if (message != null) {
                Body body = message.getBody();
                if (body != null) {
                    Content text = body.getText();
                    if (text != null) {
                        if (text.getData() != null) {
                            request.addParameter("Message.Body.Text.Data", StringUtils.fromString(text.getData()));
                        }
                    }
                    if (text != null) {
                        if (text.getCharset() != null) {
                            request.addParameter("Message.Body.Text.Charset", StringUtils.fromString(text.getCharset()));
                        }
                    }
                }
                if (body != null) {
                    Content html = body.getHtml();
                    if (html != null) {
                        if (html.getData() != null) {
                            request.addParameter("Message.Body.Html.Data", StringUtils.fromString(html.getData()));
                        }
                    }
                    if (html != null) {
                        if (html.getCharset() != null) {
                            request.addParameter("Message.Body.Html.Charset", StringUtils.fromString(html.getCharset()));
                        }
                    }
                }
            }
        }
        if (sendEmailRequest != null) {
            java.util.List<String> replyToAddressesList = sendEmailRequest.getReplyToAddresses();
            int replyToAddressesListIndex = 1;

            for (String replyToAddressesListValue : replyToAddressesList) {
                if (replyToAddressesListValue != null) {
                    request.addParameter("ReplyToAddresses.member." + replyToAddressesListIndex, StringUtils.fromString(replyToAddressesListValue));
                }
                replyToAddressesListIndex++;
            }
        }
        if (sendEmailRequest != null) {
            if (sendEmailRequest.getReturnPath() != null) {
                request.addParameter("ReturnPath", StringUtils.fromString(sendEmailRequest.getReturnPath()));
            }
        }


        return request;
    }
}
