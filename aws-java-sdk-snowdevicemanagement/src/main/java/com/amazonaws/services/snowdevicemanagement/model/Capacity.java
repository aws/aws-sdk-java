/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The physical capacity of the Amazon Web Services Snow Family device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/Capacity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Capacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of capacity available for use on the device.
     * </p>
     */
    private Long available;
    /**
     * <p>
     * The name of the type of capacity, such as memory.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The total capacity on the device.
     * </p>
     */
    private Long total;
    /**
     * <p>
     * The unit of measure for the type of capacity.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The amount of capacity used on the device.
     * </p>
     */
    private Long used;

    /**
     * <p>
     * The amount of capacity available for use on the device.
     * </p>
     * 
     * @param available
     *        The amount of capacity available for use on the device.
     */

    public void setAvailable(Long available) {
        this.available = available;
    }

    /**
     * <p>
     * The amount of capacity available for use on the device.
     * </p>
     * 
     * @return The amount of capacity available for use on the device.
     */

    public Long getAvailable() {
        return this.available;
    }

    /**
     * <p>
     * The amount of capacity available for use on the device.
     * </p>
     * 
     * @param available
     *        The amount of capacity available for use on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withAvailable(Long available) {
        setAvailable(available);
        return this;
    }

    /**
     * <p>
     * The name of the type of capacity, such as memory.
     * </p>
     * 
     * @param name
     *        The name of the type of capacity, such as memory.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the type of capacity, such as memory.
     * </p>
     * 
     * @return The name of the type of capacity, such as memory.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the type of capacity, such as memory.
     * </p>
     * 
     * @param name
     *        The name of the type of capacity, such as memory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The total capacity on the device.
     * </p>
     * 
     * @param total
     *        The total capacity on the device.
     */

    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * <p>
     * The total capacity on the device.
     * </p>
     * 
     * @return The total capacity on the device.
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total capacity on the device.
     * </p>
     * 
     * @param total
     *        The total capacity on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withTotal(Long total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The unit of measure for the type of capacity.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the type of capacity.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure for the type of capacity.
     * </p>
     * 
     * @return The unit of measure for the type of capacity.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measure for the type of capacity.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the type of capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The amount of capacity used on the device.
     * </p>
     * 
     * @param used
     *        The amount of capacity used on the device.
     */

    public void setUsed(Long used) {
        this.used = used;
    }

    /**
     * <p>
     * The amount of capacity used on the device.
     * </p>
     * 
     * @return The amount of capacity used on the device.
     */

    public Long getUsed() {
        return this.used;
    }

    /**
     * <p>
     * The amount of capacity used on the device.
     * </p>
     * 
     * @param used
     *        The amount of capacity used on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withUsed(Long used) {
        setUsed(used);
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
        if (getAvailable() != null)
            sb.append("Available: ").append(getAvailable()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getUsed() != null)
            sb.append("Used: ").append(getUsed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Capacity == false)
            return false;
        Capacity other = (Capacity) obj;
        if (other.getAvailable() == null ^ this.getAvailable() == null)
            return false;
        if (other.getAvailable() != null && other.getAvailable().equals(this.getAvailable()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getUsed() == null ^ this.getUsed() == null)
            return false;
        if (other.getUsed() != null && other.getUsed().equals(this.getUsed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailable() == null) ? 0 : getAvailable().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getUsed() == null) ? 0 : getUsed().hashCode());
        return hashCode;
    }

    @Override
    public Capacity clone() {
        try {
            return (Capacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.CapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
