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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Usage associated with an entitlement resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/EntitlementUsage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitlementUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Entitlement usage name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Resource usage consumed.
     * </p>
     */
    private String consumedValue;
    /**
     * <p>
     * Maximum entitlement usage count.
     * </p>
     */
    private String maxCount;
    /**
     * <p>
     * Entitlement usage unit.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * Entitlement usage name.
     * </p>
     * 
     * @param name
     *        Entitlement usage name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Entitlement usage name.
     * </p>
     * 
     * @return Entitlement usage name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Entitlement usage name.
     * </p>
     * 
     * @param name
     *        Entitlement usage name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementUsage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Resource usage consumed.
     * </p>
     * 
     * @param consumedValue
     *        Resource usage consumed.
     */

    public void setConsumedValue(String consumedValue) {
        this.consumedValue = consumedValue;
    }

    /**
     * <p>
     * Resource usage consumed.
     * </p>
     * 
     * @return Resource usage consumed.
     */

    public String getConsumedValue() {
        return this.consumedValue;
    }

    /**
     * <p>
     * Resource usage consumed.
     * </p>
     * 
     * @param consumedValue
     *        Resource usage consumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementUsage withConsumedValue(String consumedValue) {
        setConsumedValue(consumedValue);
        return this;
    }

    /**
     * <p>
     * Maximum entitlement usage count.
     * </p>
     * 
     * @param maxCount
     *        Maximum entitlement usage count.
     */

    public void setMaxCount(String maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * <p>
     * Maximum entitlement usage count.
     * </p>
     * 
     * @return Maximum entitlement usage count.
     */

    public String getMaxCount() {
        return this.maxCount;
    }

    /**
     * <p>
     * Maximum entitlement usage count.
     * </p>
     * 
     * @param maxCount
     *        Maximum entitlement usage count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementUsage withMaxCount(String maxCount) {
        setMaxCount(maxCount);
        return this;
    }

    /**
     * <p>
     * Entitlement usage unit.
     * </p>
     * 
     * @param unit
     *        Entitlement usage unit.
     * @see EntitlementDataUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Entitlement usage unit.
     * </p>
     * 
     * @return Entitlement usage unit.
     * @see EntitlementDataUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Entitlement usage unit.
     * </p>
     * 
     * @param unit
     *        Entitlement usage unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitlementDataUnit
     */

    public EntitlementUsage withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Entitlement usage unit.
     * </p>
     * 
     * @param unit
     *        Entitlement usage unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitlementDataUnit
     */

    public EntitlementUsage withUnit(EntitlementDataUnit unit) {
        this.unit = unit.toString();
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
        if (getConsumedValue() != null)
            sb.append("ConsumedValue: ").append(getConsumedValue()).append(",");
        if (getMaxCount() != null)
            sb.append("MaxCount: ").append(getMaxCount()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntitlementUsage == false)
            return false;
        EntitlementUsage other = (EntitlementUsage) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConsumedValue() == null ^ this.getConsumedValue() == null)
            return false;
        if (other.getConsumedValue() != null && other.getConsumedValue().equals(this.getConsumedValue()) == false)
            return false;
        if (other.getMaxCount() == null ^ this.getMaxCount() == null)
            return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConsumedValue() == null) ? 0 : getConsumedValue().hashCode());
        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public EntitlementUsage clone() {
        try {
            return (EntitlementUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.EntitlementUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
