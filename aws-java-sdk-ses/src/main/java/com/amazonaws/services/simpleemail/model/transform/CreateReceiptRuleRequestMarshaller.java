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
 * CreateReceiptRuleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReceiptRuleRequestMarshaller implements Marshaller<Request<CreateReceiptRuleRequest>, CreateReceiptRuleRequest> {

    public Request<CreateReceiptRuleRequest> marshall(CreateReceiptRuleRequest createReceiptRuleRequest) {

        if (createReceiptRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReceiptRuleRequest> request = new DefaultRequest<CreateReceiptRuleRequest>(createReceiptRuleRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateReceiptRule");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createReceiptRuleRequest.getRuleSetName() != null) {
            request.addParameter("RuleSetName", StringUtils.fromString(createReceiptRuleRequest.getRuleSetName()));
        }

        if (createReceiptRuleRequest.getAfter() != null) {
            request.addParameter("After", StringUtils.fromString(createReceiptRuleRequest.getAfter()));
        }

        {
            ReceiptRule rule = createReceiptRuleRequest.getRule();
            if (rule != null) {

                if (rule.getName() != null) {
                    request.addParameter("Rule.Name", StringUtils.fromString(rule.getName()));
                }

                if (rule.getEnabled() != null) {
                    request.addParameter("Rule.Enabled", StringUtils.fromBoolean(rule.getEnabled()));
                }

                if (rule.getTlsPolicy() != null) {
                    request.addParameter("Rule.TlsPolicy", StringUtils.fromString(rule.getTlsPolicy()));
                }

                if (!rule.getRecipients().isEmpty() || !((com.amazonaws.internal.SdkInternalList<String>) rule.getRecipients()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> recipientsList = (com.amazonaws.internal.SdkInternalList<String>) rule.getRecipients();
                    int recipientsListIndex = 1;

                    for (String recipientsListValue : recipientsList) {
                        if (recipientsListValue != null) {
                            request.addParameter("Rule.Recipients.member." + recipientsListIndex, StringUtils.fromString(recipientsListValue));
                        }
                        recipientsListIndex++;
                    }
                }

                if (!rule.getActions().isEmpty() || !((com.amazonaws.internal.SdkInternalList<ReceiptAction>) rule.getActions()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<ReceiptAction> actionsList = (com.amazonaws.internal.SdkInternalList<ReceiptAction>) rule
                            .getActions();
                    int actionsListIndex = 1;

                    for (ReceiptAction actionsListValue : actionsList) {

                        {
                            S3Action s3Action = actionsListValue.getS3Action();
                            if (s3Action != null) {

                                if (s3Action.getTopicArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".S3Action.TopicArn",
                                            StringUtils.fromString(s3Action.getTopicArn()));
                                }

                                if (s3Action.getBucketName() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".S3Action.BucketName",
                                            StringUtils.fromString(s3Action.getBucketName()));
                                }

                                if (s3Action.getObjectKeyPrefix() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".S3Action.ObjectKeyPrefix",
                                            StringUtils.fromString(s3Action.getObjectKeyPrefix()));
                                }

                                if (s3Action.getKmsKeyArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".S3Action.KmsKeyArn",
                                            StringUtils.fromString(s3Action.getKmsKeyArn()));
                                }
                            }
                        }

                        {
                            BounceAction bounceAction = actionsListValue.getBounceAction();
                            if (bounceAction != null) {

                                if (bounceAction.getTopicArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.TopicArn",
                                            StringUtils.fromString(bounceAction.getTopicArn()));
                                }

                                if (bounceAction.getSmtpReplyCode() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.SmtpReplyCode",
                                            StringUtils.fromString(bounceAction.getSmtpReplyCode()));
                                }

                                if (bounceAction.getStatusCode() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.StatusCode",
                                            StringUtils.fromString(bounceAction.getStatusCode()));
                                }

                                if (bounceAction.getMessage() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.Message",
                                            StringUtils.fromString(bounceAction.getMessage()));
                                }

                                if (bounceAction.getSender() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".BounceAction.Sender",
                                            StringUtils.fromString(bounceAction.getSender()));
                                }
                            }
                        }

                        {
                            WorkmailAction workmailAction = actionsListValue.getWorkmailAction();
                            if (workmailAction != null) {

                                if (workmailAction.getTopicArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".WorkmailAction.TopicArn",
                                            StringUtils.fromString(workmailAction.getTopicArn()));
                                }

                                if (workmailAction.getOrganizationArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".WorkmailAction.OrganizationArn",
                                            StringUtils.fromString(workmailAction.getOrganizationArn()));
                                }
                            }
                        }

                        {
                            LambdaAction lambdaAction = actionsListValue.getLambdaAction();
                            if (lambdaAction != null) {

                                if (lambdaAction.getTopicArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".LambdaAction.TopicArn",
                                            StringUtils.fromString(lambdaAction.getTopicArn()));
                                }

                                if (lambdaAction.getFunctionArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".LambdaAction.FunctionArn",
                                            StringUtils.fromString(lambdaAction.getFunctionArn()));
                                }

                                if (lambdaAction.getInvocationType() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".LambdaAction.InvocationType",
                                            StringUtils.fromString(lambdaAction.getInvocationType()));
                                }
                            }
                        }

                        {
                            StopAction stopAction = actionsListValue.getStopAction();
                            if (stopAction != null) {

                                if (stopAction.getScope() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".StopAction.Scope",
                                            StringUtils.fromString(stopAction.getScope()));
                                }

                                if (stopAction.getTopicArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".StopAction.TopicArn",
                                            StringUtils.fromString(stopAction.getTopicArn()));
                                }
                            }
                        }

                        {
                            AddHeaderAction addHeaderAction = actionsListValue.getAddHeaderAction();
                            if (addHeaderAction != null) {

                                if (addHeaderAction.getHeaderName() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".AddHeaderAction.HeaderName",
                                            StringUtils.fromString(addHeaderAction.getHeaderName()));
                                }

                                if (addHeaderAction.getHeaderValue() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".AddHeaderAction.HeaderValue",
                                            StringUtils.fromString(addHeaderAction.getHeaderValue()));
                                }
                            }
                        }

                        {
                            SNSAction sNSAction = actionsListValue.getSNSAction();
                            if (sNSAction != null) {

                                if (sNSAction.getTopicArn() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".SNSAction.TopicArn",
                                            StringUtils.fromString(sNSAction.getTopicArn()));
                                }

                                if (sNSAction.getEncoding() != null) {
                                    request.addParameter("Rule.Actions.member." + actionsListIndex + ".SNSAction.Encoding",
                                            StringUtils.fromString(sNSAction.getEncoding()));
                                }
                            }
                        }
                        actionsListIndex++;
                    }
                }

                if (rule.getScanEnabled() != null) {
                    request.addParameter("Rule.ScanEnabled", StringUtils.fromBoolean(rule.getScanEnabled()));
                }
            }
        }

        return request;
    }

}
