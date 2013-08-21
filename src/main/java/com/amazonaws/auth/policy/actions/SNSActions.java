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
import com.amazonaws.auth.policy.Statement;
import com.amazonaws.services.sns.AmazonSNS;

/**
 * The available AWS access control policy actions for Amazon Simple
 * Notification Service.
 *
 * @see Statement#setActions(java.util.Collection)
 */
public enum SNSActions implements Action {

    /** Represents any action being taken on Amazon SNS. */
    AllSnsActions("sns:*"),

    /**
     * Action for the AddPermission operation on Amazon SNS.
     *
     * @see AmazonSNS#addPermission(com.amazonaws.services.sns.model.AddPermissionRequest)
     */
    AddPermission("sns:AddPermission"),

    /**
     * Action for the ConfirmSubscription operation on Amazon SNS.
     *
     * @see AmazonSNS#confirmSubscription(com.amazonaws.services.sns.model.ConfirmSubscriptionRequest)
     */
    ConfirmSubscription("sns:ConfirmSubscription"),

    /**
     * Action for the CreateTopic operation on Amazon SNS.
     *
     * @see AmazonSNS#createTopic(com.amazonaws.services.sns.model.CreateTopic)
     */
    CreateTopic("sns:CreateTopic"),

    /**
     * Action for the DeleteTopic operation on Amazon SNS.
     *
     * @see AmazonSNS#deleteTopic(com.amazonaws.services.sns.model.DeleteTopicRequest)
     */
    DeleteTopic("sns:DeleteTopic"),

    /**
     * Action for the GetSubscriptionAttributes operation on Amazon SNS.
     *
     * @see AmazonSNS#getSubscriptionAttributes(com.amazonaws.services.sns.model.GetSubscriptionAttributes)
     */
    GetSubscriptionAttributes("sns:GetSubscriptionAttributes"),

    /**
     * Action for the GetTopicAttributes operation on Amazon SNS.
     *
     * @see AmazonSNS#getTopicAttributes(com.amazonaws.services.sns.model.GetTopicAttributesRequest)
     */
    GetTopicAttributes("sns:GetTopicAttributes"),

    /**
     * Action for the ListSubscriptions operation on Amazon SNS.
     *
     * @see AmazonSNS#listSubscriptions(com.amazonaws.services.sns.model.ListSubscriptions)
     */
    ListSubscriptions("sns:ListSubscriptions"),

    /**
     * Action for the ListSubscriptionsByTopic operation on Amazon SNS.
     *
     * @see AmazonSNS#listSubscriptionsByTopic(com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest)
     */
    ListSubscriptionsByTopic("sns:ListSubscriptionsByTopic"),

    /**
     * Action for the ListTopics operation on Amazon SNS.
     *
     * @see AmazonSNS#listTopics(com.amazonaws.services.sns.model.ListTopics)
     */
    ListTopics("sns:ListTopics"),

    /**
     * Action for the Publish operation on Amazon SNS.
     *
     * @see AmazonSNS#publish(com.amazonaws.services.sns.model.PublishRequest)
     */
    Publish("sns:Publish"),

    /**
     * Action for the RemovePermission operation on Amazon SNS.
     *
     * @see AmazonSNS#removePermission(com.amazonaws.services.sns.model.RemovePermissionRequest)
     */
    RemovePermission("sns:RemovePermission"),

    /**
     * Action for the SetSubscriptionAttributes operation on Amazon SNS.
     *
     * @see AmazonSNS#setSubscriptionAttributes(com.amazonaws.services.sns.model.SetSubscriptionAttributes)
     */
    SetSubscriptionAttributes("sns:SetSubscriptionAttributes"),

    /**
     * Action for the SetTopicAttributes operation on Amazon SNS.
     *
     * @see AmazonSNS#setTopicAttributes(com.amazonaws.services.sns.model.SetTopicAttributesRequest)
     */
    SetTopicAttributes("sns:SetTopicAttributes"),

    /**
     * Action for the Subscribe operation on Amazon SNS.
     *
     * @see AmazonSNS#subscribe(com.amazonaws.services.sns.model.SubscribeRequest)
     */
    Subscribe("sns:Subscribe"),

    /**
     * Action for the Unsubscribe operation on Amazon SNS.
     *
     * @see AmazonSNS#unsubscribe(com.amazonaws.services.sns.model.Unsubscribe)
     */
    Unsubscribe("sns:Unsubscribe");

    private final String action;

    private SNSActions(String action) {
        this.action = action;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.auth.policy.Action#getId()
     */
    public String getActionName() {
        return this.action;
    }
}