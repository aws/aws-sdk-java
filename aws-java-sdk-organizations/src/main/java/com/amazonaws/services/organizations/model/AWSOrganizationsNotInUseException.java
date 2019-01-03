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
 * Your account isn't a member of an organization. To make this request, you must use the credentials of an account that
 * belongs to an organization.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOrganizationsNotInUseException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new AWSOrganizationsNotInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AWSOrganizationsNotInUseException(String message) {
        super(message);
    }

}
