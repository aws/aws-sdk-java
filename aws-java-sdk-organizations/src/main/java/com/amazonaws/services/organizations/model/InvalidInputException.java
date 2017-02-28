/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * You provided invalid values for one or more of the request parameters.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidInputException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new InvalidInputException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidInputException(String message) {
        super(message);
    }

    /**
     * @param reason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidInputException withReason(String reason) {
        setReason(reason);
        return this;
    }

}
