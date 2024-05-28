/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a ROS 2 compliant primitive type message of the complex data structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ROS2PrimitiveMessageDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ROS2PrimitiveMessageDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * </p>
     */
    private String primitiveType;
    /**
     * <p>
     * The offset used to calculate the signal value. Combined with scaling, the calculation is
     * <code>value = raw_value * scaling + offset</code>.
     * </p>
     */
    private Double offset;
    /**
     * <p>
     * A multiplier used to decode the message.
     * </p>
     */
    private Double scaling;
    /**
     * <p>
     * An optional attribute specifying the upper bound for <code>STRING</code> and <code>WSTRING</code>.
     * </p>
     */
    private Long upperBound;

    /**
     * <p>
     * The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * </p>
     * 
     * @param primitiveType
     *        The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * @see ROS2PrimitiveType
     */

    public void setPrimitiveType(String primitiveType) {
        this.primitiveType = primitiveType;
    }

    /**
     * <p>
     * The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * </p>
     * 
     * @return The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * @see ROS2PrimitiveType
     */

    public String getPrimitiveType() {
        return this.primitiveType;
    }

    /**
     * <p>
     * The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * </p>
     * 
     * @param primitiveType
     *        The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ROS2PrimitiveType
     */

    public ROS2PrimitiveMessageDefinition withPrimitiveType(String primitiveType) {
        setPrimitiveType(primitiveType);
        return this;
    }

    /**
     * <p>
     * The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * </p>
     * 
     * @param primitiveType
     *        The primitive type (integer, floating point, boolean, etc.) for the ROS 2 primitive message definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ROS2PrimitiveType
     */

    public ROS2PrimitiveMessageDefinition withPrimitiveType(ROS2PrimitiveType primitiveType) {
        this.primitiveType = primitiveType.toString();
        return this;
    }

    /**
     * <p>
     * The offset used to calculate the signal value. Combined with scaling, the calculation is
     * <code>value = raw_value * scaling + offset</code>.
     * </p>
     * 
     * @param offset
     *        The offset used to calculate the signal value. Combined with scaling, the calculation is
     *        <code>value = raw_value * scaling + offset</code>.
     */

    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * The offset used to calculate the signal value. Combined with scaling, the calculation is
     * <code>value = raw_value * scaling + offset</code>.
     * </p>
     * 
     * @return The offset used to calculate the signal value. Combined with scaling, the calculation is
     *         <code>value = raw_value * scaling + offset</code>.
     */

    public Double getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * The offset used to calculate the signal value. Combined with scaling, the calculation is
     * <code>value = raw_value * scaling + offset</code>.
     * </p>
     * 
     * @param offset
     *        The offset used to calculate the signal value. Combined with scaling, the calculation is
     *        <code>value = raw_value * scaling + offset</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ROS2PrimitiveMessageDefinition withOffset(Double offset) {
        setOffset(offset);
        return this;
    }

    /**
     * <p>
     * A multiplier used to decode the message.
     * </p>
     * 
     * @param scaling
     *        A multiplier used to decode the message.
     */

    public void setScaling(Double scaling) {
        this.scaling = scaling;
    }

    /**
     * <p>
     * A multiplier used to decode the message.
     * </p>
     * 
     * @return A multiplier used to decode the message.
     */

    public Double getScaling() {
        return this.scaling;
    }

    /**
     * <p>
     * A multiplier used to decode the message.
     * </p>
     * 
     * @param scaling
     *        A multiplier used to decode the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ROS2PrimitiveMessageDefinition withScaling(Double scaling) {
        setScaling(scaling);
        return this;
    }

    /**
     * <p>
     * An optional attribute specifying the upper bound for <code>STRING</code> and <code>WSTRING</code>.
     * </p>
     * 
     * @param upperBound
     *        An optional attribute specifying the upper bound for <code>STRING</code> and <code>WSTRING</code>.
     */

    public void setUpperBound(Long upperBound) {
        this.upperBound = upperBound;
    }

    /**
     * <p>
     * An optional attribute specifying the upper bound for <code>STRING</code> and <code>WSTRING</code>.
     * </p>
     * 
     * @return An optional attribute specifying the upper bound for <code>STRING</code> and <code>WSTRING</code>.
     */

    public Long getUpperBound() {
        return this.upperBound;
    }

    /**
     * <p>
     * An optional attribute specifying the upper bound for <code>STRING</code> and <code>WSTRING</code>.
     * </p>
     * 
     * @param upperBound
     *        An optional attribute specifying the upper bound for <code>STRING</code> and <code>WSTRING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ROS2PrimitiveMessageDefinition withUpperBound(Long upperBound) {
        setUpperBound(upperBound);
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
        if (getPrimitiveType() != null)
            sb.append("PrimitiveType: ").append(getPrimitiveType()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset()).append(",");
        if (getScaling() != null)
            sb.append("Scaling: ").append(getScaling()).append(",");
        if (getUpperBound() != null)
            sb.append("UpperBound: ").append(getUpperBound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ROS2PrimitiveMessageDefinition == false)
            return false;
        ROS2PrimitiveMessageDefinition other = (ROS2PrimitiveMessageDefinition) obj;
        if (other.getPrimitiveType() == null ^ this.getPrimitiveType() == null)
            return false;
        if (other.getPrimitiveType() != null && other.getPrimitiveType().equals(this.getPrimitiveType()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getScaling() == null ^ this.getScaling() == null)
            return false;
        if (other.getScaling() != null && other.getScaling().equals(this.getScaling()) == false)
            return false;
        if (other.getUpperBound() == null ^ this.getUpperBound() == null)
            return false;
        if (other.getUpperBound() != null && other.getUpperBound().equals(this.getUpperBound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimitiveType() == null) ? 0 : getPrimitiveType().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getScaling() == null) ? 0 : getScaling().hashCode());
        hashCode = prime * hashCode + ((getUpperBound() == null) ? 0 : getUpperBound().hashCode());
        return hashCode;
    }

    @Override
    public ROS2PrimitiveMessageDefinition clone() {
        try {
            return (ROS2PrimitiveMessageDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.ROS2PrimitiveMessageDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
