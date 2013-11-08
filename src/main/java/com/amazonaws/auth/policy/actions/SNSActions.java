/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    AllSNSActions("SNS:*"),

    /** Action for the AddPermission operation. */
    AddPermission("SNS:AddPermission"),

    /** Action for the ConfirmSubscription operation. */
    ConfirmSubscription("SNS:ConfirmSubscription"),

    /** Action for the CreateTopic operation. */
    CreateTopic("SNS:CreateTopic"),

    /** Action for the DeleteTopic operation. */
    DeleteTopic("SNS:DeleteTopic"),

    /** Action for the GetTopicAttributes operation. */
    GetTopicAttributes("SNS:GetTopicAttributes"),

    /** Action for the ListSubscriptions operation. */
    ListSubscriptions("SNS:ListSubscriptions"),

    /** Action for the ListSubscriptionsByTopic operation. */
    ListSubscriptionsByTopic("SNS:ListSubscriptionsByTopic"),

    /** Action for the ListTopics operation. */
    ListTopics("SNS:ListTopics"),

    /** Action for the Publish operation. */
    Publish("SNS:Publish"),

    /** Action for the RemovePermission operation. */
    RemovePermission("SNS:RemovePermission"),

    /** Action for the SetTopicAttributes operation. */
    SetTopicAttributes("SNS:SetTopicAttributes"),

    /** Action for the Subscribe operation. */
    Subscribe("SNS:Subscribe"),

    /** Action for the Unsubscribe operation. */
    Unsubscribe("SNS:Unsubscribe");

    private final String action;

    private SNSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
