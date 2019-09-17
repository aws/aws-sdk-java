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
 * The operation that you attempted requires you to have the <code>iam:CreateServiceLinkedRole</code> for
 * <code>organizations.amazonaws.com</code> permission so that AWS Organizations can create the required service-linked
 * role. You don't have that permission.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDeniedForDependencyException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new AccessDeniedForDependencyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AccessDeniedForDependencyException(String message) {
        super(message);
    }

    /**
     * @param reason
     * @see AccessDeniedForDependencyExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see AccessDeniedForDependencyExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDeniedForDependencyExceptionReason
     */

    public AccessDeniedForDependencyException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDeniedForDependencyExceptionReason
     */

    public AccessDeniedForDependencyException withReason(AccessDeniedForDependencyExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
