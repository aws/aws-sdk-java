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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the truck's weight specifications. Used to avoid roads that can't support or allow the total
 * weight for requests that specify <code>TravelMode</code> as <code>Truck</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/TruckWeight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TruckWeight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total weight of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>3500</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Double total;
    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The total weight of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>3500</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param total
     *        The total weight of the truck. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>3500</code>.
     *        </p>
     *        </li>
     */

    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * <p>
     * The total weight of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>3500</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The total weight of the truck. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>3500</code>.
     *         </p>
     *         </li>
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total weight of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>3500</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param total
     *        The total weight of the truck. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>3500</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TruckWeight withTotal(Double total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * 
     * @param unit
     *        The unit of measurement to use for the truck weight.</p>
     *        <p>
     *        Default Value: <code>Kilograms</code>
     * @see VehicleWeightUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * 
     * @return The unit of measurement to use for the truck weight.</p>
     *         <p>
     *         Default Value: <code>Kilograms</code>
     * @see VehicleWeightUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * 
     * @param unit
     *        The unit of measurement to use for the truck weight.</p>
     *        <p>
     *        Default Value: <code>Kilograms</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VehicleWeightUnit
     */

    public TruckWeight withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * 
     * @param unit
     *        The unit of measurement to use for the truck weight.</p>
     *        <p>
     *        Default Value: <code>Kilograms</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VehicleWeightUnit
     */

    public TruckWeight withUnit(VehicleWeightUnit unit) {
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
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

        if (obj instanceof TruckWeight == false)
            return false;
        TruckWeight other = (TruckWeight) obj;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
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

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public TruckWeight clone() {
        try {
            return (TruckWeight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.TruckWeightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
