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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies additional purposes for which the certified public key may be used other than basic purposes indicated in
 * the <code>KeyUsage</code> extension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ExtendedKeyUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtendedKeyUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     * href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * </p>
     */
    private String extendedKeyUsageType;
    /**
     * <p>
     * Specifies a custom <code>ExtendedKeyUsage</code> with an object identifier (OID).
     * </p>
     */
    private String extendedKeyUsageObjectIdentifier;

    /**
     * <p>
     * Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     * href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * </p>
     * 
     * @param extendedKeyUsageType
     *        Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     *        href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * @see ExtendedKeyUsageType
     */

    public void setExtendedKeyUsageType(String extendedKeyUsageType) {
        this.extendedKeyUsageType = extendedKeyUsageType;
    }

    /**
     * <p>
     * Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     * href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * </p>
     * 
     * @return Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     *         href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * @see ExtendedKeyUsageType
     */

    public String getExtendedKeyUsageType() {
        return this.extendedKeyUsageType;
    }

    /**
     * <p>
     * Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     * href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * </p>
     * 
     * @param extendedKeyUsageType
     *        Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     *        href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageType
     */

    public ExtendedKeyUsage withExtendedKeyUsageType(String extendedKeyUsageType) {
        setExtendedKeyUsageType(extendedKeyUsageType);
        return this;
    }

    /**
     * <p>
     * Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     * href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * </p>
     * 
     * @param extendedKeyUsageType
     *        Specifies a standard <code>ExtendedKeyUsage</code> as defined as in <a
     *        href="https://tools.ietf.org/html/rfc5280#section-4.2.1.12">RFC 5280</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageType
     */

    public ExtendedKeyUsage withExtendedKeyUsageType(ExtendedKeyUsageType extendedKeyUsageType) {
        this.extendedKeyUsageType = extendedKeyUsageType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a custom <code>ExtendedKeyUsage</code> with an object identifier (OID).
     * </p>
     * 
     * @param extendedKeyUsageObjectIdentifier
     *        Specifies a custom <code>ExtendedKeyUsage</code> with an object identifier (OID).
     */

    public void setExtendedKeyUsageObjectIdentifier(String extendedKeyUsageObjectIdentifier) {
        this.extendedKeyUsageObjectIdentifier = extendedKeyUsageObjectIdentifier;
    }

    /**
     * <p>
     * Specifies a custom <code>ExtendedKeyUsage</code> with an object identifier (OID).
     * </p>
     * 
     * @return Specifies a custom <code>ExtendedKeyUsage</code> with an object identifier (OID).
     */

    public String getExtendedKeyUsageObjectIdentifier() {
        return this.extendedKeyUsageObjectIdentifier;
    }

    /**
     * <p>
     * Specifies a custom <code>ExtendedKeyUsage</code> with an object identifier (OID).
     * </p>
     * 
     * @param extendedKeyUsageObjectIdentifier
     *        Specifies a custom <code>ExtendedKeyUsage</code> with an object identifier (OID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedKeyUsage withExtendedKeyUsageObjectIdentifier(String extendedKeyUsageObjectIdentifier) {
        setExtendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier);
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
        if (getExtendedKeyUsageType() != null)
            sb.append("ExtendedKeyUsageType: ").append(getExtendedKeyUsageType()).append(",");
        if (getExtendedKeyUsageObjectIdentifier() != null)
            sb.append("ExtendedKeyUsageObjectIdentifier: ").append(getExtendedKeyUsageObjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtendedKeyUsage == false)
            return false;
        ExtendedKeyUsage other = (ExtendedKeyUsage) obj;
        if (other.getExtendedKeyUsageType() == null ^ this.getExtendedKeyUsageType() == null)
            return false;
        if (other.getExtendedKeyUsageType() != null && other.getExtendedKeyUsageType().equals(this.getExtendedKeyUsageType()) == false)
            return false;
        if (other.getExtendedKeyUsageObjectIdentifier() == null ^ this.getExtendedKeyUsageObjectIdentifier() == null)
            return false;
        if (other.getExtendedKeyUsageObjectIdentifier() != null
                && other.getExtendedKeyUsageObjectIdentifier().equals(this.getExtendedKeyUsageObjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtendedKeyUsageType() == null) ? 0 : getExtendedKeyUsageType().hashCode());
        hashCode = prime * hashCode + ((getExtendedKeyUsageObjectIdentifier() == null) ? 0 : getExtendedKeyUsageObjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ExtendedKeyUsage clone() {
        try {
            return (ExtendedKeyUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.ExtendedKeyUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
