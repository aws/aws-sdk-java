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
 * SendBounceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendBounceRequestMarshaller implements Marshaller<Request<SendBounceRequest>, SendBounceRequest> {

    public Request<SendBounceRequest> marshall(SendBounceRequest sendBounceRequest) {

        if (sendBounceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendBounceRequest> request = new DefaultRequest<SendBounceRequest>(sendBounceRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendBounce");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendBounceRequest.getOriginalMessageId() != null) {
            request.addParameter("OriginalMessageId", StringUtils.fromString(sendBounceRequest.getOriginalMessageId()));
        }

        if (sendBounceRequest.getBounceSender() != null) {
            request.addParameter("BounceSender", StringUtils.fromString(sendBounceRequest.getBounceSender()));
        }

        if (sendBounceRequest.getExplanation() != null) {
            request.addParameter("Explanation", StringUtils.fromString(sendBounceRequest.getExplanation()));
        }

        {
            MessageDsn messageDsn = sendBounceRequest.getMessageDsn();
            if (messageDsn != null) {

                if (messageDsn.getReportingMta() != null) {
                    request.addParameter("MessageDsn.ReportingMta", StringUtils.fromString(messageDsn.getReportingMta()));
                }

                if (messageDsn.getArrivalDate() != null) {
                    request.addParameter("MessageDsn.ArrivalDate", StringUtils.fromDate(messageDsn.getArrivalDate()));
                }

                if (!messageDsn.getExtensionFields().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<ExtensionField>) messageDsn.getExtensionFields()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<ExtensionField> extensionFieldsList = (com.amazonaws.internal.SdkInternalList<ExtensionField>) messageDsn
                            .getExtensionFields();
                    int extensionFieldsListIndex = 1;

                    for (ExtensionField extensionFieldsListValue : extensionFieldsList) {

                        if (extensionFieldsListValue.getName() != null) {
                            request.addParameter("MessageDsn.ExtensionFields.member." + extensionFieldsListIndex + ".Name",
                                    StringUtils.fromString(extensionFieldsListValue.getName()));
                        }

                        if (extensionFieldsListValue.getValue() != null) {
                            request.addParameter("MessageDsn.ExtensionFields.member." + extensionFieldsListIndex + ".Value",
                                    StringUtils.fromString(extensionFieldsListValue.getValue()));
                        }
                        extensionFieldsListIndex++;
                    }
                }
            }
        }

        if (!sendBounceRequest.getBouncedRecipientInfoList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<BouncedRecipientInfo>) sendBounceRequest.getBouncedRecipientInfoList()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<BouncedRecipientInfo> bouncedRecipientInfoListList = (com.amazonaws.internal.SdkInternalList<BouncedRecipientInfo>) sendBounceRequest
                    .getBouncedRecipientInfoList();
            int bouncedRecipientInfoListListIndex = 1;

            for (BouncedRecipientInfo bouncedRecipientInfoListListValue : bouncedRecipientInfoListList) {

                if (bouncedRecipientInfoListListValue.getRecipient() != null) {
                    request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".Recipient",
                            StringUtils.fromString(bouncedRecipientInfoListListValue.getRecipient()));
                }

                if (bouncedRecipientInfoListListValue.getRecipientArn() != null) {
                    request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".RecipientArn",
                            StringUtils.fromString(bouncedRecipientInfoListListValue.getRecipientArn()));
                }

                if (bouncedRecipientInfoListListValue.getBounceType() != null) {
                    request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".BounceType",
                            StringUtils.fromString(bouncedRecipientInfoListListValue.getBounceType()));
                }

                {
                    RecipientDsnFields recipientDsnFields = bouncedRecipientInfoListListValue.getRecipientDsnFields();
                    if (recipientDsnFields != null) {

                        if (recipientDsnFields.getFinalRecipient() != null) {
                            request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".RecipientDsnFields.FinalRecipient",
                                    StringUtils.fromString(recipientDsnFields.getFinalRecipient()));
                        }

                        if (recipientDsnFields.getAction() != null) {
                            request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".RecipientDsnFields.Action",
                                    StringUtils.fromString(recipientDsnFields.getAction()));
                        }

                        if (recipientDsnFields.getRemoteMta() != null) {
                            request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".RecipientDsnFields.RemoteMta",
                                    StringUtils.fromString(recipientDsnFields.getRemoteMta()));
                        }

                        if (recipientDsnFields.getStatus() != null) {
                            request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".RecipientDsnFields.Status",
                                    StringUtils.fromString(recipientDsnFields.getStatus()));
                        }

                        if (recipientDsnFields.getDiagnosticCode() != null) {
                            request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".RecipientDsnFields.DiagnosticCode",
                                    StringUtils.fromString(recipientDsnFields.getDiagnosticCode()));
                        }

                        if (recipientDsnFields.getLastAttemptDate() != null) {
                            request.addParameter(
                                    "BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex + ".RecipientDsnFields.LastAttemptDate",
                                    StringUtils.fromDate(recipientDsnFields.getLastAttemptDate()));
                        }

                        if (!recipientDsnFields.getExtensionFields().isEmpty()
                                || !((com.amazonaws.internal.SdkInternalList<ExtensionField>) recipientDsnFields.getExtensionFields()).isAutoConstruct()) {
                            com.amazonaws.internal.SdkInternalList<ExtensionField> extensionFieldsList = (com.amazonaws.internal.SdkInternalList<ExtensionField>) recipientDsnFields
                                    .getExtensionFields();
                            int extensionFieldsListIndex = 1;

                            for (ExtensionField extensionFieldsListValue : extensionFieldsList) {

                                if (extensionFieldsListValue.getName() != null) {
                                    request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex
                                            + ".RecipientDsnFields.ExtensionFields.member." + extensionFieldsListIndex + ".Name",
                                            StringUtils.fromString(extensionFieldsListValue.getName()));
                                }

                                if (extensionFieldsListValue.getValue() != null) {
                                    request.addParameter("BouncedRecipientInfoList.member." + bouncedRecipientInfoListListIndex
                                            + ".RecipientDsnFields.ExtensionFields.member." + extensionFieldsListIndex + ".Value",
                                            StringUtils.fromString(extensionFieldsListValue.getValue()));
                                }
                                extensionFieldsListIndex++;
                            }
                        }
                    }
                }
                bouncedRecipientInfoListListIndex++;
            }
        }

        if (sendBounceRequest.getBounceSenderArn() != null) {
            request.addParameter("BounceSenderArn", StringUtils.fromString(sendBounceRequest.getBounceSenderArn()));
        }

        return request;
    }

}
