/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamCidrAuthorizationContext" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamCidrAuthorizationContext implements Serializable, Cloneable {

    /**
     * <p>
     * The plain-text authorization message for the prefix and account.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The signed authorization message for the prefix and account.
     * </p>
     */
    private String signature;

    /**
     * <p>
     * The plain-text authorization message for the prefix and account.
     * </p>
     * 
     * @param message
     *        The plain-text authorization message for the prefix and account.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The plain-text authorization message for the prefix and account.
     * </p>
     * 
     * @return The plain-text authorization message for the prefix and account.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The plain-text authorization message for the prefix and account.
     * </p>
     * 
     * @param message
     *        The plain-text authorization message for the prefix and account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamCidrAuthorizationContext withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The signed authorization message for the prefix and account.
     * </p>
     * 
     * @param signature
     *        The signed authorization message for the prefix and account.
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The signed authorization message for the prefix and account.
     * </p>
     * 
     * @return The signed authorization message for the prefix and account.
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * The signed authorization message for the prefix and account.
     * </p>
     * 
     * @param signature
     *        The signed authorization message for the prefix and account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamCidrAuthorizationContext withSignature(String signature) {
        setSignature(signature);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamCidrAuthorizationContext == false)
            return false;
        IpamCidrAuthorizationContext other = (IpamCidrAuthorizationContext) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        return hashCode;
    }

    @Override
    public IpamCidrAuthorizationContext clone() {
        try {
            return (IpamCidrAuthorizationContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
