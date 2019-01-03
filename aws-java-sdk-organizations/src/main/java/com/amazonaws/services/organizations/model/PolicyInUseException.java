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
package com.amazonaws.services.organizations.model;

import javax.annotation.Generated;

/**
 * <p>
 * The policy is attached to one or more entities. You must detach it from all roots, OUs, and accounts before
 * performing this operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyInUseException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new PolicyInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public PolicyInUseException(String message) {
        super(message);
    }

}
