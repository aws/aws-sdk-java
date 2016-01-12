/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
    /** Action for the ConfirmSubscription operation. */
    ConfirmSubscription("sns:ConfirmSubscription"),
    /** Action for the CreatePlatformApplication operation. */
    CreatePlatformApplication("sns:CreatePlatformApplication"),
    /** Action for the CreatePlatformEndpoint operation. */
    CreatePlatformEndpoint("sns:CreatePlatformEndpoint"),
    /** Action for the CreateTopic operation. */
    CreateTopic("sns:CreateTopic"),
    /** Action for the DeleteEndpoint operation. */
    DeleteEndpoint("sns:DeleteEndpoint"),
    /** Action for the DeletePlatformApplication operation. */
    DeletePlatformApplication("sns:DeletePlatformApplication"),
    /** Action for the DeleteTopic operation. */
    DeleteTopic("sns:DeleteTopic"),
    /** Action for the GetEndpointAttributes operation. */
    GetEndpointAttributes("sns:GetEndpointAttributes"),
    /** Action for the GetPlatformApplicationAttributes operation. */
    GetPlatformApplicationAttributes("sns:GetPlatformApplicationAttributes"),
    /** Action for the GetSubscriptionAttributes operation. */
    GetSubscriptionAttributes("sns:GetSubscriptionAttributes"),
    /** Action for the GetTopicAttributes operation. */
    GetTopicAttributes("sns:GetTopicAttributes"),
    /** Action for the ListEndpointsByPlatformApplication operation. */
    ListEndpointsByPlatformApplication("sns:ListEndpointsByPlatformApplication"),
    /** Action for the ListPlatformApplications operation. */
    ListPlatformApplications("sns:ListPlatformApplications"),
    /** Action for the ListSubscriptions operation. */
    ListSubscriptions("sns:ListSubscriptions"),
    /** Action for the ListSubscriptionsByTopic operation. */
    ListSubscriptionsByTopic("sns:ListSubscriptionsByTopic"),
    /** Action for the ListTopics operation. */
    ListTopics("sns:ListTopics"),
    /** Action for the Publish operation. */
    Publish("sns:Publish"),
    /** Action for the RemovePermission operation. */
    RemovePermission("sns:RemovePermission"),
    /** Action for the SetEndpointAttributes operation. */
    SetEndpointAttributes("sns:SetEndpointAttributes"),
    /** Action for the SetPlatformApplicationAttributes operation. */
    SetPlatformApplicationAttributes("sns:SetPlatformApplicationAttributes"),
    /** Action for the SetSubscriptionAttributes operation. */
    SetSubscriptionAttributes("sns:SetSubscriptionAttributes"),
    /** Action for the SetTopicAttributes operation. */
    SetTopicAttributes("sns:SetTopicAttributes"),
    /** Action for the Subscribe operation. */
    Subscribe("sns:Subscribe"),
    /** Action for the Unsubscribe operation. */
    Unsubscribe("sns:Unsubscribe"),

    ;

    private final String action;

    private SNSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}