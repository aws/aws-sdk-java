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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the endpoint capacity to activate for production.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CapacitySize" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacitySize implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the endpoint capacity type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Defines the capacity size, either as a number of instances or a capacity percentage.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * Specifies the endpoint capacity type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies the endpoint capacity type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     *        </p>
     *        </li>
     * @see CapacitySizeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the endpoint capacity type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the endpoint capacity type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     *         </p>
     *         </li>
     * @see CapacitySizeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the endpoint capacity type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies the endpoint capacity type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacitySizeType
     */

    public CapacitySize withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint capacity type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies the endpoint capacity type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INSTANCE_COUNT</code>: The endpoint activates based on the number of instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPACITY_PERCENT</code>: The endpoint activates based on the specified percentage of capacity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacitySizeType
     */

    public CapacitySize withType(CapacitySizeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Defines the capacity size, either as a number of instances or a capacity percentage.
     * </p>
     * 
     * @param value
     *        Defines the capacity size, either as a number of instances or a capacity percentage.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * Defines the capacity size, either as a number of instances or a capacity percentage.
     * </p>
     * 
     * @return Defines the capacity size, either as a number of instances or a capacity percentage.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * Defines the capacity size, either as a number of instances or a capacity percentage.
     * </p>
     * 
     * @param value
     *        Defines the capacity size, either as a number of instances or a capacity percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacitySize withValue(Integer value) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof CapacitySize == false)
            return false;
        CapacitySize other = (CapacitySize) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public CapacitySize clone() {
        try {
            return (CapacitySize) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CapacitySizeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
