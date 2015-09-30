/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Receipt Rule Request Marshaller
 */
public class CreateReceiptRuleRequestMarshaller implements Marshaller<Request<CreateReceiptRuleRequest>, CreateReceiptRuleRequest> {

    public Request<CreateReceiptRuleRequest> marshall(CreateReceiptRuleRequest createReceiptRuleRequest) {

        if (createReceiptRuleRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReceiptRuleRequest> request = new DefaultRequest<CreateReceiptRuleRequest>(createReceiptRuleRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateReceiptRule");
        request.addParameter("Version", "2010-12-01");

        if (createReceiptRuleRequest.getRuleSetName() != null) {
            request.addParameter("RuleSetName", StringUtils.fromString(createReceiptRuleRequest.getRuleSetName()));
        }
        if (createReceiptRuleRequest.getAfter() != null) {
            request.addParameter("After", StringUtils.fromString(createReceiptRuleRequest.getAfter()));
        }
        ReceiptRule receiptRuleRule = createReceiptRuleRequest.getRule();
        if (receiptRuleRule != null) {
            if (receiptRuleRule.getName() != null) {
                request.addParameter("Rule.Name", StringUtils.fromString(receiptRuleRule.getName()));
            }
            if (receiptRuleRule.isEnabled() != null) {
                request.addParameter("Rule.Enabled", StringUtils.fromBoolean(receiptRuleRule.isEnabled()));
            }
            if (receiptRuleRule.getTlsPolicy() != null) {
                request.addParameter("Rule.TlsPolicy", StringUtils.fromString(receiptRuleRule.getTlsPolicy()));
            }

            java.util.List<String> recipientsList = receiptRuleRule.getRecipients();
            int recipientsListIndex = 1;

            for (String recipientsListValue : recipientsList) {
                if (recipientsListValue != null) {
                    request.addParameter("Rule.Recipients.member." + recipientsListIndex, StringUtils.fromString(recipientsListValue));
                }

                recipientsListIndex++;
            }

            java.util.List<ReceiptAction> actionsList = receiptRuleRule.getActions();
            int actionsListIndex = 1;

            for (ReceiptAction actionsListValue : actionsList) {
                ReceiptAction receiptActionMember = actionsListValue;
                if (receiptActionMember != null) {
                    S3Action s3ActionS3Action = receiptActionMember.getS3Action();
                    if (s3ActionS3Action != null) {
                        if (s3ActionS3Action.getTopicArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".S3Action.TopicArn", StringUtils.fromString(s3ActionS3Action.getTopicArn()));
                        }
                        if (s3ActionS3Action.getBucketName() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".S3Action.BucketName", StringUtils.fromString(s3ActionS3Action.getBucketName()));
                        }
                        if (s3ActionS3Action.getObjectKeyPrefix() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".S3Action.ObjectKeyPrefix", StringUtils.fromString(s3ActionS3Action.getObjectKeyPrefix()));
                        }
                        if (s3ActionS3Action.getKmsKeyArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".S3Action.KmsKeyArn", StringUtils.fromString(s3ActionS3Action.getKmsKeyArn()));
                        }
                    }
                    BounceAction bounceActionBounceAction = receiptActionMember.getBounceAction();
                    if (bounceActionBounceAction != null) {
                        if (bounceActionBounceAction.getTopicArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.TopicArn", StringUtils.fromString(bounceActionBounceAction.getTopicArn()));
                        }
                        if (bounceActionBounceAction.getSmtpReplyCode() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.SmtpReplyCode", StringUtils.fromString(bounceActionBounceAction.getSmtpReplyCode()));
                        }
                        if (bounceActionBounceAction.getStatusCode() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.StatusCode", StringUtils.fromString(bounceActionBounceAction.getStatusCode()));
                        }
                        if (bounceActionBounceAction.getMessage() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.Message", StringUtils.fromString(bounceActionBounceAction.getMessage()));
                        }
                        if (bounceActionBounceAction.getSender() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.Sender", StringUtils.fromString(bounceActionBounceAction.getSender()));
                        }
                    }
                    WorkmailAction workmailActionWorkmailAction = receiptActionMember.getWorkmailAction();
                    if (workmailActionWorkmailAction != null) {
                        if (workmailActionWorkmailAction.getTopicArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".WorkmailAction.TopicArn", StringUtils.fromString(workmailActionWorkmailAction.getTopicArn()));
                        }
                        if (workmailActionWorkmailAction.getOrganizationArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".WorkmailAction.OrganizationArn", StringUtils.fromString(workmailActionWorkmailAction.getOrganizationArn()));
                        }
                    }
                    LambdaAction lambdaActionLambdaAction = receiptActionMember.getLambdaAction();
                    if (lambdaActionLambdaAction != null) {
                        if (lambdaActionLambdaAction.getTopicArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".LambdaAction.TopicArn", StringUtils.fromString(lambdaActionLambdaAction.getTopicArn()));
                        }
                        if (lambdaActionLambdaAction.getFunctionArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".LambdaAction.FunctionArn", StringUtils.fromString(lambdaActionLambdaAction.getFunctionArn()));
                        }
                        if (lambdaActionLambdaAction.getInvocationType() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".LambdaAction.InvocationType", StringUtils.fromString(lambdaActionLambdaAction.getInvocationType()));
                        }
                    }
                    StopAction stopActionStopAction = receiptActionMember.getStopAction();
                    if (stopActionStopAction != null) {
                        if (stopActionStopAction.getScope() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".StopAction.Scope", StringUtils.fromString(stopActionStopAction.getScope()));
                        }
                        if (stopActionStopAction.getTopicArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".StopAction.TopicArn", StringUtils.fromString(stopActionStopAction.getTopicArn()));
                        }
                    }
                    AddHeaderAction addHeaderActionAddHeaderAction = receiptActionMember.getAddHeaderAction();
                    if (addHeaderActionAddHeaderAction != null) {
                        if (addHeaderActionAddHeaderAction.getHeaderName() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".AddHeaderAction.HeaderName", StringUtils.fromString(addHeaderActionAddHeaderAction.getHeaderName()));
                        }
                        if (addHeaderActionAddHeaderAction.getHeaderValue() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".AddHeaderAction.HeaderValue", StringUtils.fromString(addHeaderActionAddHeaderAction.getHeaderValue()));
                        }
                    }
                    SNSAction sNSActionSNSAction = receiptActionMember.getSNSAction();
                    if (sNSActionSNSAction != null) {
                        if (sNSActionSNSAction.getTopicArn() != null) {
                            request.addParameter("Rule.Actions.member." + actionsListIndex + ".SNSAction.TopicArn", StringUtils.fromString(sNSActionSNSAction.getTopicArn()));
                        }
                    }
                }

                actionsListIndex++;
            }
            if (receiptRuleRule.isScanEnabled() != null) {
                request.addParameter("Rule.ScanEnabled", StringUtils.fromBoolean(receiptRuleRule.isScanEnabled()));
            }
        }

        return request;
    }
}
