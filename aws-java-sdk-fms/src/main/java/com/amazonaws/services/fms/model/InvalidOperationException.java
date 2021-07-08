/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed because there was nothing to do or the operation wasn't possible. For example, you might have
 * submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set as the Firewall
 * Manager administrator. Or you might have tried to access a Region that's disabled by default, and that you need to
 * enable for the Firewall Manager administrator account and for Organizations before you can access it.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidOperationException extends com.amazonaws.services.fms.model.AWSFMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidOperationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidOperationException(String message) {
        super(message);
    }

}
