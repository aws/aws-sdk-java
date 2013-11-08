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
 * The available AWS access control policy actions for Amazon SQS.
 */
public enum SQSActions implements Action {
    /** Represents any action executed on Amazon SQS. */
    AllSQSActions("SQS:*"),

    /** Action for the AddPermission operation. */
    AddPermission("SQS:AddPermission"),

    /** Action for the ChangeMessageVisibility operation. */
    ChangeMessageVisibility("SQS:ChangeMessageVisibility"),

    /** Action for the CreateQueue operation. */
    CreateQueue("SQS:CreateQueue"),

    /** Action for the DeleteMessage operation. */
    DeleteMessage("SQS:DeleteMessage"),

    /** Action for the DeleteQueue operation. */
    DeleteQueue("SQS:DeleteQueue"),

    /** Action for the GetQueueAttributes operation. */
    GetQueueAttributes("SQS:GetQueueAttributes"),

    /** Action for the GetQueueUrl operation. */
    GetQueueUrl("SQS:GetQueueUrl"),

    /** Action for the ListQueues operation. */
    ListQueues("SQS:ListQueues"),

    /** Action for the ReceiveMessage operation. */
    ReceiveMessage("SQS:ReceiveMessage"),

    /** Action for the RemovePermission operation. */
    RemovePermission("SQS:RemovePermission"),

    /** Action for the SendMessage operation. */
    SendMessage("SQS:SendMessage"),

    /** Action for the SetQueueAttributes operation. */
    SetQueueAttributes("SQS:SetQueueAttributes");

    private final String action;

    private SQSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
