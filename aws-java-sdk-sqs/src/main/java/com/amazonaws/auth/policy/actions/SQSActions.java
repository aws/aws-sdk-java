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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon SQS.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SQSActions implements Action {

    /** Represents any action executed on Amazon SQS. */
    AllSQSActions("sqs:*"),

    /** Action for the AddPermission operation. */
    AddPermission("sqs:AddPermission"),
    /** Action for the ChangeMessageVisibility operation. */
    ChangeMessageVisibility("sqs:ChangeMessageVisibility"),
    /** Action for the ChangeMessageVisibilityBatch operation. */
    ChangeMessageVisibilityBatch("sqs:ChangeMessageVisibilityBatch"),
    /** Action for the CreateQueue operation. */
    CreateQueue("sqs:CreateQueue"),
    /** Action for the DeleteMessage operation. */
    DeleteMessage("sqs:DeleteMessage"),
    /** Action for the DeleteMessageBatch operation. */
    DeleteMessageBatch("sqs:DeleteMessageBatch"),
    /** Action for the DeleteQueue operation. */
    DeleteQueue("sqs:DeleteQueue"),
    /** Action for the GetQueueAttributes operation. */
    GetQueueAttributes("sqs:GetQueueAttributes"),
    /** Action for the GetQueueUrl operation. */
    GetQueueUrl("sqs:GetQueueUrl"),
    /** Action for the ListDeadLetterSourceQueues operation. */
    ListDeadLetterSourceQueues("sqs:ListDeadLetterSourceQueues"),
    /** Action for the ListQueueTags operation. */
    ListQueueTags("sqs:ListQueueTags"),
    /** Action for the ListQueues operation. */
    ListQueues("sqs:ListQueues"),
    /** Action for the PurgeQueue operation. */
    PurgeQueue("sqs:PurgeQueue"),
    /** Action for the ReceiveMessage operation. */
    ReceiveMessage("sqs:ReceiveMessage"),
    /** Action for the RemovePermission operation. */
    RemovePermission("sqs:RemovePermission"),
    /** Action for the SendMessage operation. */
    SendMessage("sqs:SendMessage"),
    /** Action for the SendMessageBatch operation. */
    SendMessageBatch("sqs:SendMessageBatch"),
    /** Action for the SetQueueAttributes operation. */
    SetQueueAttributes("sqs:SetQueueAttributes"),
    /** Action for the TagQueue operation. */
    TagQueue("sqs:TagQueue"),
    /** Action for the UntagQueue operation. */
    UntagQueue("sqs:UntagQueue"),

    ;

    private final String action;

    private SQSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
