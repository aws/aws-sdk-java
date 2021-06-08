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
package com.amazonaws.services.networkfirewall.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed because of a problem with your request. Examples include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You specified an unsupported parameter name or value.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update a property with a value that isn't among the available types.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the context of the
 * request.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.networkfirewall.model.AWSNetworkFirewallException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

}
