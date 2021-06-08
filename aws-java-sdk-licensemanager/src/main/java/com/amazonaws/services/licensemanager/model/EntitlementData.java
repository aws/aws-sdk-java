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
 * Data associated with an entitlement resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/EntitlementData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitlementData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Entitlement data name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Entitlement data value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Entitlement data unit.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * Entitlement data name.
     * </p>
     * 
     * @param name
     *        Entitlement data name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Entitlement data name.
     * </p>
     * 
     * @return Entitlement data name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Entitlement data name.
     * </p>
     * 
     * @param name
     *        Entitlement data name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Entitlement data value.
     * </p>
     * 
     * @param value
     *        Entitlement data value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Entitlement data value.
     * </p>
     * 
     * @return Entitlement data value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Entitlement data value.
     * </p>
     * 
     * @param value
     *        Entitlement data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementData withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Entitlement data unit.
     * </p>
     * 
     * @param unit
     *        Entitlement data unit.
     * @see EntitlementDataUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Entitlement data unit.
     * </p>
     * 
     * @return Entitlement data unit.
     * @see EntitlementDataUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Entitlement data unit.
     * </p>
     * 
     * @param unit
     *        Entitlement data unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitlementDataUnit
     */

    public EntitlementData withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Entitlement data unit.
     * </p>
     * 
     * @param unit
     *        Entitlement data unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitlementDataUnit
     */

    public EntitlementData withUnit(EntitlementDataUnit unit) {
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
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

        if (obj instanceof EntitlementData == false)
            return false;
        EntitlementData other = (EntitlementData) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public EntitlementData clone() {
        try {
            return (EntitlementData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.EntitlementDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
