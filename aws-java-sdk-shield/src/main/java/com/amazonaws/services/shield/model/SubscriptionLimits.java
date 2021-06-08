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
 * Limits settings for your subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/SubscriptionLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriptionLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Limits settings on protections for your subscription.
     * </p>
     */
    private ProtectionLimits protectionLimits;
    /**
     * <p>
     * Limits settings on protection groups for your subscription.
     * </p>
     */
    private ProtectionGroupLimits protectionGroupLimits;

    /**
     * <p>
     * Limits settings on protections for your subscription.
     * </p>
     * 
     * @param protectionLimits
     *        Limits settings on protections for your subscription.
     */

    public void setProtectionLimits(ProtectionLimits protectionLimits) {
        this.protectionLimits = protectionLimits;
    }

    /**
     * <p>
     * Limits settings on protections for your subscription.
     * </p>
     * 
     * @return Limits settings on protections for your subscription.
     */

    public ProtectionLimits getProtectionLimits() {
        return this.protectionLimits;
    }

    /**
     * <p>
     * Limits settings on protections for your subscription.
     * </p>
     * 
     * @param protectionLimits
     *        Limits settings on protections for your subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionLimits withProtectionLimits(ProtectionLimits protectionLimits) {
        setProtectionLimits(protectionLimits);
        return this;
    }

    /**
     * <p>
     * Limits settings on protection groups for your subscription.
     * </p>
     * 
     * @param protectionGroupLimits
     *        Limits settings on protection groups for your subscription.
     */

    public void setProtectionGroupLimits(ProtectionGroupLimits protectionGroupLimits) {
        this.protectionGroupLimits = protectionGroupLimits;
    }

    /**
     * <p>
     * Limits settings on protection groups for your subscription.
     * </p>
     * 
     * @return Limits settings on protection groups for your subscription.
     */

    public ProtectionGroupLimits getProtectionGroupLimits() {
        return this.protectionGroupLimits;
    }

    /**
     * <p>
     * Limits settings on protection groups for your subscription.
     * </p>
     * 
     * @param protectionGroupLimits
     *        Limits settings on protection groups for your subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriptionLimits withProtectionGroupLimits(ProtectionGroupLimits protectionGroupLimits) {
        setProtectionGroupLimits(protectionGroupLimits);
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
        if (getProtectionLimits() != null)
            sb.append("ProtectionLimits: ").append(getProtectionLimits()).append(",");
        if (getProtectionGroupLimits() != null)
            sb.append("ProtectionGroupLimits: ").append(getProtectionGroupLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscriptionLimits == false)
            return false;
        SubscriptionLimits other = (SubscriptionLimits) obj;
        if (other.getProtectionLimits() == null ^ this.getProtectionLimits() == null)
            return false;
        if (other.getProtectionLimits() != null && other.getProtectionLimits().equals(this.getProtectionLimits()) == false)
            return false;
        if (other.getProtectionGroupLimits() == null ^ this.getProtectionGroupLimits() == null)
            return false;
        if (other.getProtectionGroupLimits() != null && other.getProtectionGroupLimits().equals(this.getProtectionGroupLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectionLimits() == null) ? 0 : getProtectionLimits().hashCode());
        hashCode = prime * hashCode + ((getProtectionGroupLimits() == null) ? 0 : getProtectionGroupLimits().hashCode());
        return hashCode;
    }

    @Override
    public SubscriptionLimits clone() {
        try {
            return (SubscriptionLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.SubscriptionLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
