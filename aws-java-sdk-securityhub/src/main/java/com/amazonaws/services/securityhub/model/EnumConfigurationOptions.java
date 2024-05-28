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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options for customizing a security control parameter that is an enum.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnumConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnumConfigurationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Security Hub default value for a control parameter that is an enum.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The valid values for a control parameter that is an enum.
     * </p>
     */
    private java.util.List<String> allowedValues;

    /**
     * <p>
     * The Security Hub default value for a control parameter that is an enum.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is an enum.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is an enum.
     * </p>
     * 
     * @return The Security Hub default value for a control parameter that is an enum.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is an enum.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is an enum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumConfigurationOptions withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The valid values for a control parameter that is an enum.
     * </p>
     * 
     * @return The valid values for a control parameter that is an enum.
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The valid values for a control parameter that is an enum.
     * </p>
     * 
     * @param allowedValues
     *        The valid values for a control parameter that is an enum.
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<String>(allowedValues);
    }

    /**
     * <p>
     * The valid values for a control parameter that is an enum.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        The valid values for a control parameter that is an enum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumConfigurationOptions withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The valid values for a control parameter that is an enum.
     * </p>
     * 
     * @param allowedValues
     *        The valid values for a control parameter that is an enum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumConfigurationOptions withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnumConfigurationOptions == false)
            return false;
        EnumConfigurationOptions other = (EnumConfigurationOptions) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        return hashCode;
    }

    @Override
    public EnumConfigurationOptions clone() {
        try {
            return (EnumConfigurationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.EnumConfigurationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
