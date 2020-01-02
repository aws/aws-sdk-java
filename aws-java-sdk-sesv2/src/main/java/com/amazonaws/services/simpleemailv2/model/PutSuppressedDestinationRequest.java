/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to add an email destination to the suppression list for your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutSuppressedDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSuppressedDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address that should be added to the suppression list for your account.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The factors that should cause the email address to be added to the suppression list for your account.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The email address that should be added to the suppression list for your account.
     * </p>
     * 
     * @param emailAddress
     *        The email address that should be added to the suppression list for your account.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address that should be added to the suppression list for your account.
     * </p>
     * 
     * @return The email address that should be added to the suppression list for your account.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address that should be added to the suppression list for your account.
     * </p>
     * 
     * @param emailAddress
     *        The email address that should be added to the suppression list for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSuppressedDestinationRequest withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The factors that should cause the email address to be added to the suppression list for your account.
     * </p>
     * 
     * @param reason
     *        The factors that should cause the email address to be added to the suppression list for your account.
     * @see SuppressionListReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The factors that should cause the email address to be added to the suppression list for your account.
     * </p>
     * 
     * @return The factors that should cause the email address to be added to the suppression list for your account.
     * @see SuppressionListReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The factors that should cause the email address to be added to the suppression list for your account.
     * </p>
     * 
     * @param reason
     *        The factors that should cause the email address to be added to the suppression list for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public PutSuppressedDestinationRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The factors that should cause the email address to be added to the suppression list for your account.
     * </p>
     * 
     * @param reason
     *        The factors that should cause the email address to be added to the suppression list for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public PutSuppressedDestinationRequest withReason(SuppressionListReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSuppressedDestinationRequest == false)
            return false;
        PutSuppressedDestinationRequest other = (PutSuppressedDestinationRequest) obj;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public PutSuppressedDestinationRequest clone() {
        return (PutSuppressedDestinationRequest) super.clone();
    }

}
