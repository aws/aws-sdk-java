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
 * Contains details about the truck dimensions in the unit of measurement that you specify. Used to filter out roads
 * that can't support or allow the specified dimensions for requests that specify <code>TravelMode</code> as
 * <code>Truck</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/TruckDimensions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TruckDimensions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The height of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Double height;
    /**
     * <p>
     * The length of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>15.5</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Double length;
    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The width of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Double width;

    /**
     * <p>
     * The height of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param height
     *        The height of the truck.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>4.5</code>.
     *        </p>
     *        </li>
     */

    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * <p>
     * The height of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The height of the truck.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>4.5</code>.
     *         </p>
     *         </li>
     */

    public Double getHeight() {
        return this.height;
    }

    /**
     * <p>
     * The height of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param height
     *        The height of the truck.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>4.5</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TruckDimensions withHeight(Double height) {
        setHeight(height);
        return this;
    }

    /**
     * <p>
     * The length of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>15.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param length
     *        The length of the truck.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>15.5</code>.
     *        </p>
     *        </li>
     */

    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * <p>
     * The length of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>15.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The length of the truck.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>15.5</code>.
     *         </p>
     *         </li>
     */

    public Double getLength() {
        return this.length;
    }

    /**
     * <p>
     * The length of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>15.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param length
     *        The length of the truck.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>15.5</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TruckDimensions withLength(Double length) {
        setLength(length);
        return this;
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * 
     * @param unit
     *        Specifies the unit of measurement for the truck dimensions.</p>
     *        <p>
     *        Default Value: <code>Meters</code>
     * @see DimensionUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * 
     * @return Specifies the unit of measurement for the truck dimensions.</p>
     *         <p>
     *         Default Value: <code>Meters</code>
     * @see DimensionUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * 
     * @param unit
     *        Specifies the unit of measurement for the truck dimensions.</p>
     *        <p>
     *        Default Value: <code>Meters</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionUnit
     */

    public TruckDimensions withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * 
     * @param unit
     *        Specifies the unit of measurement for the truck dimensions.</p>
     *        <p>
     *        Default Value: <code>Meters</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionUnit
     */

    public TruckDimensions withUnit(DimensionUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The width of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param width
     *        The width of the truck.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>4.5</code>.
     *        </p>
     *        </li>
     */

    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * <p>
     * The width of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The width of the truck.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>4.5</code>.
     *         </p>
     *         </li>
     */

    public Double getWidth() {
        return this.width;
    }

    /**
     * <p>
     * The width of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param width
     *        The width of the truck.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>4.5</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TruckDimensions withWidth(Double width) {
        setWidth(width);
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
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getLength() != null)
            sb.append("Length: ").append(getLength()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TruckDimensions == false)
            return false;
        TruckDimensions other = (TruckDimensions) obj;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public TruckDimensions clone() {
        try {
            return (TruckDimensions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.TruckDimensionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
