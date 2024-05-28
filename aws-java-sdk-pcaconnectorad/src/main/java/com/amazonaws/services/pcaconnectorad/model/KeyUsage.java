/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The key usage extension defines the purpose (e.g., encipherment, signature) of the key contained in the certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/KeyUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the key usage extension to critical.
     * </p>
     */
    private Boolean critical;
    /**
     * <p>
     * The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in the
     * certificate.
     * </p>
     */
    private KeyUsageFlags usageFlags;

    /**
     * <p>
     * Sets the key usage extension to critical.
     * </p>
     * 
     * @param critical
     *        Sets the key usage extension to critical.
     */

    public void setCritical(Boolean critical) {
        this.critical = critical;
    }

    /**
     * <p>
     * Sets the key usage extension to critical.
     * </p>
     * 
     * @return Sets the key usage extension to critical.
     */

    public Boolean getCritical() {
        return this.critical;
    }

    /**
     * <p>
     * Sets the key usage extension to critical.
     * </p>
     * 
     * @param critical
     *        Sets the key usage extension to critical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withCritical(Boolean critical) {
        setCritical(critical);
        return this;
    }

    /**
     * <p>
     * Sets the key usage extension to critical.
     * </p>
     * 
     * @return Sets the key usage extension to critical.
     */

    public Boolean isCritical() {
        return this.critical;
    }

    /**
     * <p>
     * The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in the
     * certificate.
     * </p>
     * 
     * @param usageFlags
     *        The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in the
     *        certificate.
     */

    public void setUsageFlags(KeyUsageFlags usageFlags) {
        this.usageFlags = usageFlags;
    }

    /**
     * <p>
     * The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in the
     * certificate.
     * </p>
     * 
     * @return The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in the
     *         certificate.
     */

    public KeyUsageFlags getUsageFlags() {
        return this.usageFlags;
    }

    /**
     * <p>
     * The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in the
     * certificate.
     * </p>
     * 
     * @param usageFlags
     *        The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in the
     *        certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withUsageFlags(KeyUsageFlags usageFlags) {
        setUsageFlags(usageFlags);
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
        if (getCritical() != null)
            sb.append("Critical: ").append(getCritical()).append(",");
        if (getUsageFlags() != null)
            sb.append("UsageFlags: ").append(getUsageFlags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyUsage == false)
            return false;
        KeyUsage other = (KeyUsage) obj;
        if (other.getCritical() == null ^ this.getCritical() == null)
            return false;
        if (other.getCritical() != null && other.getCritical().equals(this.getCritical()) == false)
            return false;
        if (other.getUsageFlags() == null ^ this.getUsageFlags() == null)
            return false;
        if (other.getUsageFlags() != null && other.getUsageFlags().equals(this.getUsageFlags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCritical() == null) ? 0 : getCritical().hashCode());
        hashCode = prime * hashCode + ((getUsageFlags() == null) ? 0 : getUsageFlags().hashCode());
        return hashCode;
    }

    @Override
    public KeyUsage clone() {
        try {
            return (KeyUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.KeyUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
