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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The validity period for a signing job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SignatureValidityPeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignatureValidityPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The numerical value of the time unit for signature validity.
     * </p>
     */
    private Integer value;
    /**
     * <p>
     * The time unit for signature validity.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The numerical value of the time unit for signature validity.
     * </p>
     * 
     * @param value
     *        The numerical value of the time unit for signature validity.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The numerical value of the time unit for signature validity.
     * </p>
     * 
     * @return The numerical value of the time unit for signature validity.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * The numerical value of the time unit for signature validity.
     * </p>
     * 
     * @param value
     *        The numerical value of the time unit for signature validity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignatureValidityPeriod withValue(Integer value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The time unit for signature validity.
     * </p>
     * 
     * @param type
     *        The time unit for signature validity.
     * @see ValidityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The time unit for signature validity.
     * </p>
     * 
     * @return The time unit for signature validity.
     * @see ValidityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The time unit for signature validity.
     * </p>
     * 
     * @param type
     *        The time unit for signature validity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidityType
     */

    public SignatureValidityPeriod withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The time unit for signature validity.
     * </p>
     * 
     * @param type
     *        The time unit for signature validity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidityType
     */

    public SignatureValidityPeriod withType(ValidityType type) {
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

        if (obj instanceof SignatureValidityPeriod == false)
            return false;
        SignatureValidityPeriod other = (SignatureValidityPeriod) obj;
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
    public SignatureValidityPeriod clone() {
        try {
            return (SignatureValidityPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SignatureValidityPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
