/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.sqs.AmazonSQS;

/**
 * The available AWS access control policy actions for Amazon Simple Queue
 * Service.
 *
 * @see Statement#setActions(java.util.Collection)
 */
public enum SQSActions implements Action {

    /** Represents any action being taken on Amazon SQS. */
    AllSqsActions("sqs:*"),

    /**
     * Action for the AddPermission operation on Amazon SQS.
     *
     * @see AmazonSQS#addPermission(com.amazonaws.services.sqs.model.AddPermissionRequest)
     */
    AddPermission("sqs:AddPermission"),

    /**
     * Action for the ChangeMessageVisibility operation on Amazon SQS.
     *
     * @see AmazonSQS#changeMessageVisibility(com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest)
     */
    ChangeMessageVisibility("sqs:ChangeMessageVisibility"),

    /**
     * Action for the CreateQueue operation on Amazon SQS.
     *
     * @see AmazonSQS#createQueue(com.amazonaws.services.sqs.model.CreateQueueRequest)
     */
    CreateQueue("sqs:CreateQueue"),

    /**
     * Action for the DeleteMessage operation on Amazon SQS.
     *
     * @see AmazonSQS#deleteMessage(com.amazonaws.services.sqs.model.DeleteMessageRequest)
     */
    DeleteMessage("sqs:DeleteMessage"),

    /**
     * Action for the DeleteQueue operation on Amazon SQS.
     *
     * @see AmazonSQS#deleteQueue(com.amazonaws.services.sqs.model.DeleteQueueRequest)
     */
    DeleteQueue("sqs:DeleteQueue"),

    /**
     * Action for the GetQueueAttributes operation on Amazon SQS.
     *
     * @see AmazonSQS#getQueueAttributes(com.amazonaws.services.sqs.model.GetQueueAttributesRequest)
     */
    GetQueueAttributes("sqs:GetQueueAttributes"),

    /**
     * Action for the ListQueues operation on Amazon SQS.
     *
     * @see AmazonSQS#listQueues(com.amazonaws.services.sqs.model.ListQueuesRequest)
     */
    ListQueues("sqs:ListQueues"),

    /**
     * Action for the ReveiveMessage operation on Amazon SQS.
     *
     * @see AmazonSQS#receiveMessage(com.amazonaws.services.sqs.model.ReceiveMessageRequest)
     */
    ReceiveMessage("sqs:ReceiveMessage"),

    /**
     * Action for the RemovePermission operation on Amazon SQS.
     *
     * @see AmazonSQS#removePermission(com.amazonaws.services.sqs.model.RemovePermissionRequest)
     */
    RemovePermission("sqs:RemovePermission"),

    /**
     * Action for the SendMessage operation on Amazon SQS.
     *
     * @see AmazonSQS#sendMessage(com.amazonaws.services.sqs.model.SendMessageRequest)
     */
    SendMessage("sqs:SendMessage"),

    /**
     * Action for the SetQueueAttributes operation on Amazon SQS.
     *
     * @see AmazonSQS#setQueueAttributes(com.amazonaws.services.sqs.model.SetQueueAttributesRequest)
     */
    SetQueueAttributes("sqs:SetQueueAttributes");

    private final String action;

    private SQSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }

}