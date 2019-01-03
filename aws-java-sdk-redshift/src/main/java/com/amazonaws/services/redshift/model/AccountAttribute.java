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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A name value pair that describes an aspect of an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AccountAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * A list of attribute values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttributeValueTarget> attributeValues;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @return The name of the attribute.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAttribute withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * A list of attribute values.
     * </p>
     * 
     * @return A list of attribute values.
     */

    public java.util.List<AttributeValueTarget> getAttributeValues() {
        if (attributeValues == null) {
            attributeValues = new com.amazonaws.internal.SdkInternalList<AttributeValueTarget>();
        }
        return attributeValues;
    }

    /**
     * <p>
     * A list of attribute values.
     * </p>
     * 
     * @param attributeValues
     *        A list of attribute values.
     */

    public void setAttributeValues(java.util.Collection<AttributeValueTarget> attributeValues) {
        if (attributeValues == null) {
            this.attributeValues = null;
            return;
        }

        this.attributeValues = new com.amazonaws.internal.SdkInternalList<AttributeValueTarget>(attributeValues);
    }

    /**
     * <p>
     * A list of attribute values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeValues(java.util.Collection)} or {@link #withAttributeValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeValues
     *        A list of attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAttribute withAttributeValues(AttributeValueTarget... attributeValues) {
        if (this.attributeValues == null) {
            setAttributeValues(new com.amazonaws.internal.SdkInternalList<AttributeValueTarget>(attributeValues.length));
        }
        for (AttributeValueTarget ele : attributeValues) {
            this.attributeValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attribute values.
     * </p>
     * 
     * @param attributeValues
     *        A list of attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAttribute withAttributeValues(java.util.Collection<AttributeValueTarget> attributeValues) {
        setAttributeValues(attributeValues);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValues() != null)
            sb.append("AttributeValues: ").append(getAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAttribute == false)
            return false;
        AccountAttribute other = (AccountAttribute) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValues() == null ^ this.getAttributeValues() == null)
            return false;
        if (other.getAttributeValues() != null && other.getAttributeValues().equals(this.getAttributeValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValues() == null) ? 0 : getAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public AccountAttribute clone() {
        try {
            return (AccountAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
