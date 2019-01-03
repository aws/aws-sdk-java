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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Length of time for which the certificate issued by your private certificate authority (CA), or by the private CA
 * itself, is valid in days, months, or years. You can issue a certificate by calling the <a>IssueCertificate</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/Validity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Validity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time period.
     * </p>
     */
    private Long value;
    /**
     * <p>
     * Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Time period.
     * </p>
     * 
     * @param value
     *        Time period.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * Time period.
     * </p>
     * 
     * @return Time period.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * Time period.
     * </p>
     * 
     * @param value
     *        Time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Validity withValue(Long value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * </p>
     * 
     * @param type
     *        Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * @see ValidityPeriodType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * </p>
     * 
     * @return Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * @see ValidityPeriodType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * </p>
     * 
     * @param type
     *        Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidityPeriodType
     */

    public Validity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * </p>
     * 
     * @param type
     *        Specifies whether the <code>Value</code> parameter represents days, months, or years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidityPeriodType
     */

    public Validity withType(ValidityPeriodType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Validity == false)
            return false;
        Validity other = (Validity) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Validity clone() {
        try {
            return (Validity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.ValidityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
