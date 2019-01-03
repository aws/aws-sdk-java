/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon SNS.
 */

public enum SNSActions implements Action {

    /** Represents any action executed on Amazon SNS. */
    AllSNSActions("sns:*"),

    /** Action for the AddPermission operation. */
    AddPermission("sns:AddPermission"),

    /**
     * Action for the CheckIfPhoneNumberIsOptedOut operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    CheckIfPhoneNumberIsOptedOut("sns:CheckIfPhoneNumberIsOptedOut"),
    /**
     * Action for the ConfirmSubscription operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    ConfirmSubscription("sns:ConfirmSubscription"),
    /**
     * Action for the CreatePlatformApplication operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    CreatePlatformApplication("sns:CreatePlatformApplication"),
    /**
     * Action for the CreatePlatformEndpoint operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    CreatePlatformEndpoint("sns:CreatePlatformEndpoint"),
    /**
     * Action for the CreateTopic operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    CreateTopic("sns:CreateTopic"),
    /**
     * Action for the DeleteEndpoint operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    DeleteEndpoint("sns:DeleteEndpoint"),
    /**
     * Action for the DeletePlatformApplication operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    DeletePlatformApplication("sns:DeletePlatformApplication"),
    /** Action for the DeleteTopic operation. */
    DeleteTopic("sns:DeleteTopic"),
    /**
     * Action for the GetEndpointAttributes operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    GetEndpointAttributes("sns:GetEndpointAttributes"),
    /**
     * Action for the GetPlatformApplicationAttributes operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    GetPlatformApplicationAttributes("sns:GetPlatformApplicationAttributes"),
    /**
     * Action for the GetSMSAttributes operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    GetSMSAttributes("sns:GetSMSAttributes"),
    /**
     * Action for the GetSubscriptionAttributes operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    GetSubscriptionAttributes("sns:GetSubscriptionAttributes"),
    /** Action for the GetTopicAttributes operation. */
    GetTopicAttributes("sns:GetTopicAttributes"),
    /**
     * Action for the ListEndpointsByPlatformApplication operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    ListEndpointsByPlatformApplication("sns:ListEndpointsByPlatformApplication"),
    /**
     * Action for the ListPhoneNumbersOptedOut operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    ListPhoneNumbersOptedOut("sns:ListPhoneNumbersOptedOut"),
    /**
     * Action for the ListPlatformApplications operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    ListPlatformApplications("sns:ListPlatformApplications"),
    /**
     * Action for the ListSubscriptions operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    ListSubscriptions("sns:ListSubscriptions"),
    /** Action for the ListSubscriptionsByTopic operation. */
    ListSubscriptionsByTopic("sns:ListSubscriptionsByTopic"),
    /**
     * Action for the ListTopics operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    ListTopics("sns:ListTopics"),
    /**
     * Action for the OptInPhoneNumber operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    OptInPhoneNumber("sns:OptInPhoneNumber"),
    /** Action for the Publish operation. */
    Publish("sns:Publish"),
    /** Action for the RemovePermission operation. */
    RemovePermission("sns:RemovePermission"),
    /**
     * Action for the SetEndpointAttributes operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    SetEndpointAttributes("sns:SetEndpointAttributes"),
    /**
     * Action for the SetPlatformApplicationAttributes operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    SetPlatformApplicationAttributes("sns:SetPlatformApplicationAttributes"),
    /**
     * Action for the SetSMSAttributes operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    SetSMSAttributes("sns:SetSMSAttributes"),
    /**
     * Action for the SetSubscriptionAttributes operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    SetSubscriptionAttributes("sns:SetSubscriptionAttributes"),
    /** Action for the SetTopicAttributes operation. */
    SetTopicAttributes("sns:SetTopicAttributes"),
    /** Action for the Subscribe operation. */
    Subscribe("sns:Subscribe"),
    /**
     * Action for the Unsubscribe operation.
     * @deprecated for not valid SNS action policy, see <a href="http://docs.aws.amazon.com/sns/latest/dg/AccessPolicyLanguage_SpecialInfo.html#sns_aspen_actions">Valid Amazon SNS Policy Actions</a> for more information.
     */
    @Deprecated
    Unsubscribe("sns:Unsubscribe")

    ;

    private final String action;

    private SNSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
