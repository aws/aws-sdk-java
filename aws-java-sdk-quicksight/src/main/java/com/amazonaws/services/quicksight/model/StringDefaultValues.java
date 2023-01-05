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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The default values of the <code>StringParameterDeclaration</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StringDefaultValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringDefaultValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dynamic value of the <code>StringDefaultValues</code>. Different defaults displayed according to users,
     * groups, and values mapping.
     * </p>
     */
    private DynamicDefaultValue dynamicValue;
    /**
     * <p>
     * The static values of the <code>DecimalDefaultValues</code>.
     * </p>
     */
    private java.util.List<String> staticValues;

    /**
     * <p>
     * The dynamic value of the <code>StringDefaultValues</code>. Different defaults displayed according to users,
     * groups, and values mapping.
     * </p>
     * 
     * @param dynamicValue
     *        The dynamic value of the <code>StringDefaultValues</code>. Different defaults displayed according to
     *        users, groups, and values mapping.
     */

    public void setDynamicValue(DynamicDefaultValue dynamicValue) {
        this.dynamicValue = dynamicValue;
    }

    /**
     * <p>
     * The dynamic value of the <code>StringDefaultValues</code>. Different defaults displayed according to users,
     * groups, and values mapping.
     * </p>
     * 
     * @return The dynamic value of the <code>StringDefaultValues</code>. Different defaults displayed according to
     *         users, groups, and values mapping.
     */

    public DynamicDefaultValue getDynamicValue() {
        return this.dynamicValue;
    }

    /**
     * <p>
     * The dynamic value of the <code>StringDefaultValues</code>. Different defaults displayed according to users,
     * groups, and values mapping.
     * </p>
     * 
     * @param dynamicValue
     *        The dynamic value of the <code>StringDefaultValues</code>. Different defaults displayed according to
     *        users, groups, and values mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringDefaultValues withDynamicValue(DynamicDefaultValue dynamicValue) {
        setDynamicValue(dynamicValue);
        return this;
    }

    /**
     * <p>
     * The static values of the <code>DecimalDefaultValues</code>.
     * </p>
     * 
     * @return The static values of the <code>DecimalDefaultValues</code>.
     */

    public java.util.List<String> getStaticValues() {
        return staticValues;
    }

    /**
     * <p>
     * The static values of the <code>DecimalDefaultValues</code>.
     * </p>
     * 
     * @param staticValues
     *        The static values of the <code>DecimalDefaultValues</code>.
     */

    public void setStaticValues(java.util.Collection<String> staticValues) {
        if (staticValues == null) {
            this.staticValues = null;
            return;
        }

        this.staticValues = new java.util.ArrayList<String>(staticValues);
    }

    /**
     * <p>
     * The static values of the <code>DecimalDefaultValues</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaticValues(java.util.Collection)} or {@link #withStaticValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param staticValues
     *        The static values of the <code>DecimalDefaultValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringDefaultValues withStaticValues(String... staticValues) {
        if (this.staticValues == null) {
            setStaticValues(new java.util.ArrayList<String>(staticValues.length));
        }
        for (String ele : staticValues) {
            this.staticValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The static values of the <code>DecimalDefaultValues</code>.
     * </p>
     * 
     * @param staticValues
     *        The static values of the <code>DecimalDefaultValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringDefaultValues withStaticValues(java.util.Collection<String> staticValues) {
        setStaticValues(staticValues);
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
        if (getDynamicValue() != null)
            sb.append("DynamicValue: ").append(getDynamicValue()).append(",");
        if (getStaticValues() != null)
            sb.append("StaticValues: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringDefaultValues == false)
            return false;
        StringDefaultValues other = (StringDefaultValues) obj;
        if (other.getDynamicValue() == null ^ this.getDynamicValue() == null)
            return false;
        if (other.getDynamicValue() != null && other.getDynamicValue().equals(this.getDynamicValue()) == false)
            return false;
        if (other.getStaticValues() == null ^ this.getStaticValues() == null)
            return false;
        if (other.getStaticValues() != null && other.getStaticValues().equals(this.getStaticValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamicValue() == null) ? 0 : getDynamicValue().hashCode());
        hashCode = prime * hashCode + ((getStaticValues() == null) ? 0 : getStaticValues().hashCode());
        return hashCode;
    }

    @Override
    public StringDefaultValues clone() {
        try {
            return (StringDefaultValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.StringDefaultValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
