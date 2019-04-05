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
package com.amazonaws.services.shield.model;

import javax.annotation.Generated;

/**
 * <p>
 * You are trying to update a subscription that has not yet completed the 1-year commitment. You can change the
 * <code>AutoRenew</code> parameter during the last 30 days of your subscription. This exception indicates that you are
 * attempting to change <code>AutoRenew</code> prior to that period.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LockedSubscriptionException extends com.amazonaws.services.shield.model.AWSShieldException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LockedSubscriptionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LockedSubscriptionException(String message) {
        super(message);
    }

}
