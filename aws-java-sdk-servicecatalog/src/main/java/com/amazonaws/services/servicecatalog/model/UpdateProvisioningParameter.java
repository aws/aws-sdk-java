/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * The parameter key/value pair used to update a ProvisionedProduct object. If <code>UsePreviousValue</code> is set to
 * true, <code>Value</code> is ignored and the value for <code>Key</code> is kept as previously set (current value).
 * </p>
 */
public class UpdateProvisioningParameter implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from <a>DescribeProvisioningParameters</a>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value to use for updating the product provisioning. Any constraints on this value can be found in the
     * <code>ProvisioningArtifactParameter</code> parameter for <code>Key</code>.
     * </p>
     */
    private String value;
    /**
     * <p>
     * If true, uses the currently set value for <code>Key</code>, ignoring
     * <code>UpdateProvisioningParameter.Value</code>.
     * </p>
     */
    private Boolean usePreviousValue;

    /**
     * <p>
     * The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @param key
     *        The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from
     *        <a>DescribeProvisioningParameters</a>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @return The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from
     *         <a>DescribeProvisioningParameters</a>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @param key
     *        The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from
     *        <a>DescribeProvisioningParameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningParameter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value to use for updating the product provisioning. Any constraints on this value can be found in the
     * <code>ProvisioningArtifactParameter</code> parameter for <code>Key</code>.
     * </p>
     * 
     * @param value
     *        The value to use for updating the product provisioning. Any constraints on this value can be found in the
     *        <code>ProvisioningArtifactParameter</code> parameter for <code>Key</code>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to use for updating the product provisioning. Any constraints on this value can be found in the
     * <code>ProvisioningArtifactParameter</code> parameter for <code>Key</code>.
     * </p>
     * 
     * @return The value to use for updating the product provisioning. Any constraints on this value can be found in the
     *         <code>ProvisioningArtifactParameter</code> parameter for <code>Key</code>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to use for updating the product provisioning. Any constraints on this value can be found in the
     * <code>ProvisioningArtifactParameter</code> parameter for <code>Key</code>.
     * </p>
     * 
     * @param value
     *        The value to use for updating the product provisioning. Any constraints on this value can be found in the
     *        <code>ProvisioningArtifactParameter</code> parameter for <code>Key</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningParameter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * If true, uses the currently set value for <code>Key</code>, ignoring
     * <code>UpdateProvisioningParameter.Value</code>.
     * </p>
     * 
     * @param usePreviousValue
     *        If true, uses the currently set value for <code>Key</code>, ignoring
     *        <code>UpdateProvisioningParameter.Value</code>.
     */

    public void setUsePreviousValue(Boolean usePreviousValue) {
        this.usePreviousValue = usePreviousValue;
    }

    /**
     * <p>
     * If true, uses the currently set value for <code>Key</code>, ignoring
     * <code>UpdateProvisioningParameter.Value</code>.
     * </p>
     * 
     * @return If true, uses the currently set value for <code>Key</code>, ignoring
     *         <code>UpdateProvisioningParameter.Value</code>.
     */

    public Boolean getUsePreviousValue() {
        return this.usePreviousValue;
    }

    /**
     * <p>
     * If true, uses the currently set value for <code>Key</code>, ignoring
     * <code>UpdateProvisioningParameter.Value</code>.
     * </p>
     * 
     * @param usePreviousValue
     *        If true, uses the currently set value for <code>Key</code>, ignoring
     *        <code>UpdateProvisioningParameter.Value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningParameter withUsePreviousValue(Boolean usePreviousValue) {
        setUsePreviousValue(usePreviousValue);
        return this;
    }

    /**
     * <p>
     * If true, uses the currently set value for <code>Key</code>, ignoring
     * <code>UpdateProvisioningParameter.Value</code>.
     * </p>
     * 
     * @return If true, uses the currently set value for <code>Key</code>, ignoring
     *         <code>UpdateProvisioningParameter.Value</code>.
     */

    public Boolean isUsePreviousValue() {
        return this.usePreviousValue;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getUsePreviousValue() != null)
            sb.append("UsePreviousValue: " + getUsePreviousValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisioningParameter == false)
            return false;
        UpdateProvisioningParameter other = (UpdateProvisioningParameter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUsePreviousValue() == null ^ this.getUsePreviousValue() == null)
            return false;
        if (other.getUsePreviousValue() != null && other.getUsePreviousValue().equals(this.getUsePreviousValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUsePreviousValue() == null) ? 0 : getUsePreviousValue().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisioningParameter clone() {
        try {
            return (UpdateProvisioningParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
