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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameter key-value pair used to update a provisioned product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisioningParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisioningParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameter key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The parameter value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     * </p>
     */
    private Boolean usePreviousValue;

    /**
     * <p>
     * The parameter key.
     * </p>
     * 
     * @param key
     *        The parameter key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The parameter key.
     * </p>
     * 
     * @return The parameter key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The parameter key.
     * </p>
     * 
     * @param key
     *        The parameter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningParameter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @param value
     *        The parameter value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @return The parameter value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @param value
     *        The parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningParameter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     * </p>
     * 
     * @param usePreviousValue
     *        If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     */

    public void setUsePreviousValue(Boolean usePreviousValue) {
        this.usePreviousValue = usePreviousValue;
    }

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     * </p>
     * 
     * @return If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     */

    public Boolean getUsePreviousValue() {
        return this.usePreviousValue;
    }

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     * </p>
     * 
     * @param usePreviousValue
     *        If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningParameter withUsePreviousValue(Boolean usePreviousValue) {
        setUsePreviousValue(usePreviousValue);
        return this;
    }

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     * </p>
     * 
     * @return If set to true, <code>Value</code> is ignored and the previous parameter value is kept.
     */

    public Boolean isUsePreviousValue() {
        return this.usePreviousValue;
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getUsePreviousValue() != null)
            sb.append("UsePreviousValue: ").append(getUsePreviousValue());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.UpdateProvisioningParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
