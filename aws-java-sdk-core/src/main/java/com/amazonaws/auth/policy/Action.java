/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy;

/**
 * An access control policy action identifies a specific action in a service
 * that can be performed on a resource. For example, sending a message to a
 * queue.
 * <p>
 * Actions allow you to limit what your access control policy statement affects.
 * For example, you could create a policy statement that enables a certain group
 * of users to send messages to your queue, but not allow them to perform any
 * other actions on your queue.
 * <p>
 * The action is B in the statement
 * "A has permission to do B to C where D applies."
 * <p>
 * Free form access control policy actions may include a wildcard (*) to match
 * multiple actions.
 * <p>
 * This class is not intended to be directly implemented, instead developers
 * should see the classes available in com.amazonaws.auth.policy.actions for
 * more information on the available actions for each service.
 */
public interface Action {

    /**
     * Returns the name of this action. For example, 'sqs:SendMessage' is the
     * name corresponding to the SQS action that enables users to send a message
     * to an SQS queue.
     *
     * @return The name of this action.
     */
    public String getActionName();
}
