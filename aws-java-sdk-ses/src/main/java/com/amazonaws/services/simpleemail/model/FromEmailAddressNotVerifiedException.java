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
package com.amazonaws.services.simpleemail.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that the sender address specified for a custom verification email is not verified, and is therefore not
 * eligible to send the custom verification email.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FromEmailAddressNotVerifiedException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that the from email address associated with the custom verification email template is not verified.
     * </p>
     */
    private String fromEmailAddress;

    /**
     * Constructs a new FromEmailAddressNotVerifiedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public FromEmailAddressNotVerifiedException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that the from email address associated with the custom verification email template is not verified.
     * </p>
     * 
     * @param fromEmailAddress
     *        Indicates that the from email address associated with the custom verification email template is not
     *        verified.
     */

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    /**
     * <p>
     * Indicates that the from email address associated with the custom verification email template is not verified.
     * </p>
     * 
     * @return Indicates that the from email address associated with the custom verification email template is not
     *         verified.
     */

    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }

    /**
     * <p>
     * Indicates that the from email address associated with the custom verification email template is not verified.
     * </p>
     * 
     * @param fromEmailAddress
     *        Indicates that the from email address associated with the custom verification email template is not
     *        verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FromEmailAddressNotVerifiedException withFromEmailAddress(String fromEmailAddress) {
        setFromEmailAddress(fromEmailAddress);
        return this;
    }

}
