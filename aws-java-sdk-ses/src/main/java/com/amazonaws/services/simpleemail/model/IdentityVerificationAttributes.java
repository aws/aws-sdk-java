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

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the verification attributes of a single identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/IdentityVerificationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityVerificationAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * </p>
     */
    private String verificationStatus;
    /**
     * <p>
     * The verification token for a domain identity. Null for email address identities.
     * </p>
     */
    private String verificationToken;

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * </p>
     * 
     * @param verificationStatus
     *        The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * @see VerificationStatus
     */

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * </p>
     * 
     * @return The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * @see VerificationStatus
     */

    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * </p>
     * 
     * @param verificationStatus
     *        The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationStatus
     */

    public IdentityVerificationAttributes withVerificationStatus(String verificationStatus) {
        setVerificationStatus(verificationStatus);
        return this;
    }

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * </p>
     * 
     * @param verificationStatus
     *        The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * @see VerificationStatus
     */

    public void setVerificationStatus(VerificationStatus verificationStatus) {
        withVerificationStatus(verificationStatus);
    }

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * </p>
     * 
     * @param verificationStatus
     *        The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationStatus
     */

    public IdentityVerificationAttributes withVerificationStatus(VerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The verification token for a domain identity. Null for email address identities.
     * </p>
     * 
     * @param verificationToken
     *        The verification token for a domain identity. Null for email address identities.
     */

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    /**
     * <p>
     * The verification token for a domain identity. Null for email address identities.
     * </p>
     * 
     * @return The verification token for a domain identity. Null for email address identities.
     */

    public String getVerificationToken() {
        return this.verificationToken;
    }

    /**
     * <p>
     * The verification token for a domain identity. Null for email address identities.
     * </p>
     * 
     * @param verificationToken
     *        The verification token for a domain identity. Null for email address identities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityVerificationAttributes withVerificationToken(String verificationToken) {
        setVerificationToken(verificationToken);
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
        if (getVerificationStatus() != null)
            sb.append("VerificationStatus: ").append(getVerificationStatus()).append(",");
        if (getVerificationToken() != null)
            sb.append("VerificationToken: ").append(getVerificationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityVerificationAttributes == false)
            return false;
        IdentityVerificationAttributes other = (IdentityVerificationAttributes) obj;
        if (other.getVerificationStatus() == null ^ this.getVerificationStatus() == null)
            return false;
        if (other.getVerificationStatus() != null && other.getVerificationStatus().equals(this.getVerificationStatus()) == false)
            return false;
        if (other.getVerificationToken() == null ^ this.getVerificationToken() == null)
            return false;
        if (other.getVerificationToken() != null && other.getVerificationToken().equals(this.getVerificationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerificationStatus() == null) ? 0 : getVerificationStatus().hashCode());
        hashCode = prime * hashCode + ((getVerificationToken() == null) ? 0 : getVerificationToken().hashCode());
        return hashCode;
    }

    @Override
    public IdentityVerificationAttributes clone() {
        try {
            return (IdentityVerificationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
