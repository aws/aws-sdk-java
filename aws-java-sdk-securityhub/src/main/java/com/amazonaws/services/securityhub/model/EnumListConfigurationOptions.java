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
 * The options for customizing a security control parameter that is a list of enums.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnumListConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnumListConfigurationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of enums.
     * </p>
     */
    private java.util.List<String> defaultValue;
    /**
     * <p>
     * The maximum number of list items that an enum list control parameter can accept.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The valid values for a control parameter that is a list of enums.
     * </p>
     */
    private java.util.List<String> allowedValues;

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of enums.
     * </p>
     * 
     * @return The Security Hub default value for a control parameter that is a list of enums.
     */

    public java.util.List<String> getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of enums.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of enums.
     */

    public void setDefaultValue(java.util.Collection<String> defaultValue) {
        if (defaultValue == null) {
            this.defaultValue = null;
            return;
        }

        this.defaultValue = new java.util.ArrayList<String>(defaultValue);
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of enums.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultValue(java.util.Collection)} or {@link #withDefaultValue(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of enums.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumListConfigurationOptions withDefaultValue(String... defaultValue) {
        if (this.defaultValue == null) {
            setDefaultValue(new java.util.ArrayList<String>(defaultValue.length));
        }
        for (String ele : defaultValue) {
            this.defaultValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of enums.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of enums.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumListConfigurationOptions withDefaultValue(java.util.Collection<String> defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The maximum number of list items that an enum list control parameter can accept.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of list items that an enum list control parameter can accept.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of list items that an enum list control parameter can accept.
     * </p>
     * 
     * @return The maximum number of list items that an enum list control parameter can accept.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of list items that an enum list control parameter can accept.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of list items that an enum list control parameter can accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumListConfigurationOptions withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The valid values for a control parameter that is a list of enums.
     * </p>
     * 
     * @return The valid values for a control parameter that is a list of enums.
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The valid values for a control parameter that is a list of enums.
     * </p>
     * 
     * @param allowedValues
     *        The valid values for a control parameter that is a list of enums.
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
     * The valid values for a control parameter that is a list of enums.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        The valid values for a control parameter that is a list of enums.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumListConfigurationOptions withAllowedValues(String... allowedValues) {
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
     * The valid values for a control parameter that is a list of enums.
     * </p>
     * 
     * @param allowedValues
     *        The valid values for a control parameter that is a list of enums.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumListConfigurationOptions withAllowedValues(java.util.Collection<String> allowedValues) {
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
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
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

        if (obj instanceof EnumListConfigurationOptions == false)
            return false;
        EnumListConfigurationOptions other = (EnumListConfigurationOptions) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
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
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        return hashCode;
    }

    @Override
    public EnumListConfigurationOptions clone() {
        try {
            return (EnumListConfigurationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.EnumListConfigurationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
