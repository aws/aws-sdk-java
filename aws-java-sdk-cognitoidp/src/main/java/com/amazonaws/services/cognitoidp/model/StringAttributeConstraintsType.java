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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The constraints associated with a string attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StringAttributeConstraintsType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringAttributeConstraintsType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum length.
     * </p>
     */
    private String minLength;
    /**
     * <p>
     * The maximum length.
     * </p>
     */
    private String maxLength;

    /**
     * <p>
     * The minimum length.
     * </p>
     * 
     * @param minLength
     *        The minimum length.
     */

    public void setMinLength(String minLength) {
        this.minLength = minLength;
    }

    /**
     * <p>
     * The minimum length.
     * </p>
     * 
     * @return The minimum length.
     */

    public String getMinLength() {
        return this.minLength;
    }

    /**
     * <p>
     * The minimum length.
     * </p>
     * 
     * @param minLength
     *        The minimum length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringAttributeConstraintsType withMinLength(String minLength) {
        setMinLength(minLength);
        return this;
    }

    /**
     * <p>
     * The maximum length.
     * </p>
     * 
     * @param maxLength
     *        The maximum length.
     */

    public void setMaxLength(String maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * <p>
     * The maximum length.
     * </p>
     * 
     * @return The maximum length.
     */

    public String getMaxLength() {
        return this.maxLength;
    }

    /**
     * <p>
     * The maximum length.
     * </p>
     * 
     * @param maxLength
     *        The maximum length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringAttributeConstraintsType withMaxLength(String maxLength) {
        setMaxLength(maxLength);
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
        if (getMinLength() != null)
            sb.append("MinLength: ").append(getMinLength()).append(",");
        if (getMaxLength() != null)
            sb.append("MaxLength: ").append(getMaxLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringAttributeConstraintsType == false)
            return false;
        StringAttributeConstraintsType other = (StringAttributeConstraintsType) obj;
        if (other.getMinLength() == null ^ this.getMinLength() == null)
            return false;
        if (other.getMinLength() != null && other.getMinLength().equals(this.getMinLength()) == false)
            return false;
        if (other.getMaxLength() == null ^ this.getMaxLength() == null)
            return false;
        if (other.getMaxLength() != null && other.getMaxLength().equals(this.getMaxLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinLength() == null) ? 0 : getMinLength().hashCode());
        hashCode = prime * hashCode + ((getMaxLength() == null) ? 0 : getMaxLength().hashCode());
        return hashCode;
    }

    @Override
    public StringAttributeConstraintsType clone() {
        try {
            return (StringAttributeConstraintsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.StringAttributeConstraintsTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
