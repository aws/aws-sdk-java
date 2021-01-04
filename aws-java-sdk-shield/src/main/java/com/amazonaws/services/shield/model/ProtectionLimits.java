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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Limits settings on protections for your subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ProtectionLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectionLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of resource types that you can specify in a protection.
     * </p>
     */
    private java.util.List<Limit> protectedResourceTypeLimits;

    /**
     * <p>
     * The maximum number of resource types that you can specify in a protection.
     * </p>
     * 
     * @return The maximum number of resource types that you can specify in a protection.
     */

    public java.util.List<Limit> getProtectedResourceTypeLimits() {
        return protectedResourceTypeLimits;
    }

    /**
     * <p>
     * The maximum number of resource types that you can specify in a protection.
     * </p>
     * 
     * @param protectedResourceTypeLimits
     *        The maximum number of resource types that you can specify in a protection.
     */

    public void setProtectedResourceTypeLimits(java.util.Collection<Limit> protectedResourceTypeLimits) {
        if (protectedResourceTypeLimits == null) {
            this.protectedResourceTypeLimits = null;
            return;
        }

        this.protectedResourceTypeLimits = new java.util.ArrayList<Limit>(protectedResourceTypeLimits);
    }

    /**
     * <p>
     * The maximum number of resource types that you can specify in a protection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectedResourceTypeLimits(java.util.Collection)} or
     * {@link #withProtectedResourceTypeLimits(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param protectedResourceTypeLimits
     *        The maximum number of resource types that you can specify in a protection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectionLimits withProtectedResourceTypeLimits(Limit... protectedResourceTypeLimits) {
        if (this.protectedResourceTypeLimits == null) {
            setProtectedResourceTypeLimits(new java.util.ArrayList<Limit>(protectedResourceTypeLimits.length));
        }
        for (Limit ele : protectedResourceTypeLimits) {
            this.protectedResourceTypeLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of resource types that you can specify in a protection.
     * </p>
     * 
     * @param protectedResourceTypeLimits
     *        The maximum number of resource types that you can specify in a protection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectionLimits withProtectedResourceTypeLimits(java.util.Collection<Limit> protectedResourceTypeLimits) {
        setProtectedResourceTypeLimits(protectedResourceTypeLimits);
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
        if (getProtectedResourceTypeLimits() != null)
            sb.append("ProtectedResourceTypeLimits: ").append(getProtectedResourceTypeLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectionLimits == false)
            return false;
        ProtectionLimits other = (ProtectionLimits) obj;
        if (other.getProtectedResourceTypeLimits() == null ^ this.getProtectedResourceTypeLimits() == null)
            return false;
        if (other.getProtectedResourceTypeLimits() != null && other.getProtectedResourceTypeLimits().equals(this.getProtectedResourceTypeLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectedResourceTypeLimits() == null) ? 0 : getProtectedResourceTypeLimits().hashCode());
        return hashCode;
    }

    @Override
    public ProtectionLimits clone() {
        try {
            return (ProtectionLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.ProtectionLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
