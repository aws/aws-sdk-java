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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An inventory filter object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/InventoryFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The condition of the filter.
     * </p>
     */
    private String condition;
    /**
     * <p>
     * Value of the filter.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The condition of the filter.
     * </p>
     * 
     * @param condition
     *        The condition of the filter.
     * @see InventoryFilterCondition
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition of the filter.
     * </p>
     * 
     * @return The condition of the filter.
     * @see InventoryFilterCondition
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition of the filter.
     * </p>
     * 
     * @param condition
     *        The condition of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InventoryFilterCondition
     */

    public InventoryFilter withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The condition of the filter.
     * </p>
     * 
     * @param condition
     *        The condition of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InventoryFilterCondition
     */

    public InventoryFilter withCondition(InventoryFilterCondition condition) {
        this.condition = condition.toString();
        return this;
    }

    /**
     * <p>
     * Value of the filter.
     * </p>
     * 
     * @param value
     *        Value of the filter.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Value of the filter.
     * </p>
     * 
     * @return Value of the filter.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Value of the filter.
     * </p>
     * 
     * @param value
     *        Value of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryFilter withValue(String value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryFilter == false)
            return false;
        InventoryFilter other = (InventoryFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public InventoryFilter clone() {
        try {
            return (InventoryFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.InventoryFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
