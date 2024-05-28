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
 * The options for customizing a security control parameter that is a list of integers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/IntegerListConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntegerListConfigurationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of integers.
     * </p>
     */
    private java.util.List<Integer> defaultValue;
    /**
     * <p>
     * The minimum valid value for a control parameter that is a list of integers.
     * </p>
     */
    private Integer min;
    /**
     * <p>
     * The maximum valid value for a control parameter that is a list of integers.
     * </p>
     */
    private Integer max;
    /**
     * <p>
     * The maximum number of list items that an interger list control parameter can accept.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of integers.
     * </p>
     * 
     * @return The Security Hub default value for a control parameter that is a list of integers.
     */

    public java.util.List<Integer> getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of integers.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of integers.
     */

    public void setDefaultValue(java.util.Collection<Integer> defaultValue) {
        if (defaultValue == null) {
            this.defaultValue = null;
            return;
        }

        this.defaultValue = new java.util.ArrayList<Integer>(defaultValue);
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of integers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultValue(java.util.Collection)} or {@link #withDefaultValue(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerListConfigurationOptions withDefaultValue(Integer... defaultValue) {
        if (this.defaultValue == null) {
            setDefaultValue(new java.util.ArrayList<Integer>(defaultValue.length));
        }
        for (Integer ele : defaultValue) {
            this.defaultValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of integers.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerListConfigurationOptions withDefaultValue(java.util.Collection<Integer> defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The minimum valid value for a control parameter that is a list of integers.
     * </p>
     * 
     * @param min
     *        The minimum valid value for a control parameter that is a list of integers.
     */

    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum valid value for a control parameter that is a list of integers.
     * </p>
     * 
     * @return The minimum valid value for a control parameter that is a list of integers.
     */

    public Integer getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum valid value for a control parameter that is a list of integers.
     * </p>
     * 
     * @param min
     *        The minimum valid value for a control parameter that is a list of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerListConfigurationOptions withMin(Integer min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The maximum valid value for a control parameter that is a list of integers.
     * </p>
     * 
     * @param max
     *        The maximum valid value for a control parameter that is a list of integers.
     */

    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum valid value for a control parameter that is a list of integers.
     * </p>
     * 
     * @return The maximum valid value for a control parameter that is a list of integers.
     */

    public Integer getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum valid value for a control parameter that is a list of integers.
     * </p>
     * 
     * @param max
     *        The maximum valid value for a control parameter that is a list of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerListConfigurationOptions withMax(Integer max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The maximum number of list items that an interger list control parameter can accept.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of list items that an interger list control parameter can accept.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of list items that an interger list control parameter can accept.
     * </p>
     * 
     * @return The maximum number of list items that an interger list control parameter can accept.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of list items that an interger list control parameter can accept.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of list items that an interger list control parameter can accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerListConfigurationOptions withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntegerListConfigurationOptions == false)
            return false;
        IntegerListConfigurationOptions other = (IntegerListConfigurationOptions) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public IntegerListConfigurationOptions clone() {
        try {
            return (IntegerListConfigurationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.IntegerListConfigurationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
