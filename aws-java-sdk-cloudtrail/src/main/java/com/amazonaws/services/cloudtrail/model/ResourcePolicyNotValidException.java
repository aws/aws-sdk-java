/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when the resouce-based policy has syntax errors, or contains a principal that is not valid.
 * </p>
 * <p>
 * The following are requirements for the resource policy:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Contains only one action: cloudtrail-data:PutAuditEvents
 * </p>
 * </li>
 * <li>
 * <p>
 * Contains at least one statement. The policy can have a maximum of 20 statements.
 * </p>
 * </li>
 * <li>
 * <p>
 * Each statement contains at least one principal. A statement can have a maximum of 50 principals.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicyNotValidException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourcePolicyNotValidException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourcePolicyNotValidException(String message) {
        super(message);
    }

}
