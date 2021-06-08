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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use the AttributeValueList to filter by string or integer values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/AttributeValueList" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeValueList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of integer values that the filter matches.
     * </p>
     */
    private java.util.List<Integer> integerValues;
    /**
     * <p>
     * The list of string values that the filter matches.
     * </p>
     */
    private java.util.List<String> stringValues;

    /**
     * <p>
     * The list of integer values that the filter matches.
     * </p>
     * 
     * @return The list of integer values that the filter matches.
     */

    public java.util.List<Integer> getIntegerValues() {
        return integerValues;
    }

    /**
     * <p>
     * The list of integer values that the filter matches.
     * </p>
     * 
     * @param integerValues
     *        The list of integer values that the filter matches.
     */

    public void setIntegerValues(java.util.Collection<Integer> integerValues) {
        if (integerValues == null) {
            this.integerValues = null;
            return;
        }

        this.integerValues = new java.util.ArrayList<Integer>(integerValues);
    }

    /**
     * <p>
     * The list of integer values that the filter matches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerValues(java.util.Collection)} or {@link #withIntegerValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param integerValues
     *        The list of integer values that the filter matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValueList withIntegerValues(Integer... integerValues) {
        if (this.integerValues == null) {
            setIntegerValues(new java.util.ArrayList<Integer>(integerValues.length));
        }
        for (Integer ele : integerValues) {
            this.integerValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of integer values that the filter matches.
     * </p>
     * 
     * @param integerValues
     *        The list of integer values that the filter matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValueList withIntegerValues(java.util.Collection<Integer> integerValues) {
        setIntegerValues(integerValues);
        return this;
    }

    /**
     * <p>
     * The list of string values that the filter matches.
     * </p>
     * 
     * @return The list of string values that the filter matches.
     */

    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * The list of string values that the filter matches.
     * </p>
     * 
     * @param stringValues
     *        The list of string values that the filter matches.
     */

    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * The list of string values that the filter matches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringValues(java.util.Collection)} or {@link #withStringValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringValues
     *        The list of string values that the filter matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValueList withStringValues(String... stringValues) {
        if (this.stringValues == null) {
            setStringValues(new java.util.ArrayList<String>(stringValues.length));
        }
        for (String ele : stringValues) {
            this.stringValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of string values that the filter matches.
     * </p>
     * 
     * @param stringValues
     *        The list of string values that the filter matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeValueList withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
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
        if (getIntegerValues() != null)
            sb.append("IntegerValues: ").append(getIntegerValues()).append(",");
        if (getStringValues() != null)
            sb.append("StringValues: ").append(getStringValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeValueList == false)
            return false;
        AttributeValueList other = (AttributeValueList) obj;
        if (other.getIntegerValues() == null ^ this.getIntegerValues() == null)
            return false;
        if (other.getIntegerValues() != null && other.getIntegerValues().equals(this.getIntegerValues()) == false)
            return false;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegerValues() == null) ? 0 : getIntegerValues().hashCode());
        hashCode = prime * hashCode + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        return hashCode;
    }

    @Override
    public AttributeValueList clone() {
        try {
            return (AttributeValueList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.AttributeValueListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
