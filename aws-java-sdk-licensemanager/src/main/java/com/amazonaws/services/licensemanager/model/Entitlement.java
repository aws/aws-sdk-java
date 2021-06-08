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
 * Describes a resource entitled for use with a license.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/Entitlement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Entitlement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Entitlement name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Entitlement resource. Use only if the unit is None.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Maximum entitlement count. Use if the unit is not None.
     * </p>
     */
    private Long maxCount;
    /**
     * <p>
     * Indicates whether overages are allowed.
     * </p>
     */
    private Boolean overage;
    /**
     * <p>
     * Entitlement unit.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * Indicates whether check-ins are allowed.
     * </p>
     */
    private Boolean allowCheckIn;

    /**
     * <p>
     * Entitlement name.
     * </p>
     * 
     * @param name
     *        Entitlement name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Entitlement name.
     * </p>
     * 
     * @return Entitlement name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Entitlement name.
     * </p>
     * 
     * @param name
     *        Entitlement name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Entitlement resource. Use only if the unit is None.
     * </p>
     * 
     * @param value
     *        Entitlement resource. Use only if the unit is None.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Entitlement resource. Use only if the unit is None.
     * </p>
     * 
     * @return Entitlement resource. Use only if the unit is None.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Entitlement resource. Use only if the unit is None.
     * </p>
     * 
     * @param value
     *        Entitlement resource. Use only if the unit is None.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Maximum entitlement count. Use if the unit is not None.
     * </p>
     * 
     * @param maxCount
     *        Maximum entitlement count. Use if the unit is not None.
     */

    public void setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * <p>
     * Maximum entitlement count. Use if the unit is not None.
     * </p>
     * 
     * @return Maximum entitlement count. Use if the unit is not None.
     */

    public Long getMaxCount() {
        return this.maxCount;
    }

    /**
     * <p>
     * Maximum entitlement count. Use if the unit is not None.
     * </p>
     * 
     * @param maxCount
     *        Maximum entitlement count. Use if the unit is not None.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withMaxCount(Long maxCount) {
        setMaxCount(maxCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether overages are allowed.
     * </p>
     * 
     * @param overage
     *        Indicates whether overages are allowed.
     */

    public void setOverage(Boolean overage) {
        this.overage = overage;
    }

    /**
     * <p>
     * Indicates whether overages are allowed.
     * </p>
     * 
     * @return Indicates whether overages are allowed.
     */

    public Boolean getOverage() {
        return this.overage;
    }

    /**
     * <p>
     * Indicates whether overages are allowed.
     * </p>
     * 
     * @param overage
     *        Indicates whether overages are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withOverage(Boolean overage) {
        setOverage(overage);
        return this;
    }

    /**
     * <p>
     * Indicates whether overages are allowed.
     * </p>
     * 
     * @return Indicates whether overages are allowed.
     */

    public Boolean isOverage() {
        return this.overage;
    }

    /**
     * <p>
     * Entitlement unit.
     * </p>
     * 
     * @param unit
     *        Entitlement unit.
     * @see EntitlementUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Entitlement unit.
     * </p>
     * 
     * @return Entitlement unit.
     * @see EntitlementUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Entitlement unit.
     * </p>
     * 
     * @param unit
     *        Entitlement unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitlementUnit
     */

    public Entitlement withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Entitlement unit.
     * </p>
     * 
     * @param unit
     *        Entitlement unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitlementUnit
     */

    public Entitlement withUnit(EntitlementUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether check-ins are allowed.
     * </p>
     * 
     * @param allowCheckIn
     *        Indicates whether check-ins are allowed.
     */

    public void setAllowCheckIn(Boolean allowCheckIn) {
        this.allowCheckIn = allowCheckIn;
    }

    /**
     * <p>
     * Indicates whether check-ins are allowed.
     * </p>
     * 
     * @return Indicates whether check-ins are allowed.
     */

    public Boolean getAllowCheckIn() {
        return this.allowCheckIn;
    }

    /**
     * <p>
     * Indicates whether check-ins are allowed.
     * </p>
     * 
     * @param allowCheckIn
     *        Indicates whether check-ins are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withAllowCheckIn(Boolean allowCheckIn) {
        setAllowCheckIn(allowCheckIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether check-ins are allowed.
     * </p>
     * 
     * @return Indicates whether check-ins are allowed.
     */

    public Boolean isAllowCheckIn() {
        return this.allowCheckIn;
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getMaxCount() != null)
            sb.append("MaxCount: ").append(getMaxCount()).append(",");
        if (getOverage() != null)
            sb.append("Overage: ").append(getOverage()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getAllowCheckIn() != null)
            sb.append("AllowCheckIn: ").append(getAllowCheckIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Entitlement == false)
            return false;
        Entitlement other = (Entitlement) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getMaxCount() == null ^ this.getMaxCount() == null)
            return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false)
            return false;
        if (other.getOverage() == null ^ this.getOverage() == null)
            return false;
        if (other.getOverage() != null && other.getOverage().equals(this.getOverage()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getAllowCheckIn() == null ^ this.getAllowCheckIn() == null)
            return false;
        if (other.getAllowCheckIn() != null && other.getAllowCheckIn().equals(this.getAllowCheckIn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        hashCode = prime * hashCode + ((getOverage() == null) ? 0 : getOverage().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getAllowCheckIn() == null) ? 0 : getAllowCheckIn().hashCode());
        return hashCode;
    }

    @Override
    public Entitlement clone() {
        try {
            return (Entitlement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.EntitlementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
