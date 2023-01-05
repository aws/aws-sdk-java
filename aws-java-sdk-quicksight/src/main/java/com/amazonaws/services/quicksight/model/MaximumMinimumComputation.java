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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The maximum and minimum computation configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/MaximumMinimumComputation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaximumMinimumComputation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for a computation.
     * </p>
     */
    private String computationId;
    /**
     * <p>
     * The name of a computation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     */
    private DimensionField time;
    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     */
    private MeasureField value;
    /**
     * <p>
     * The type of computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MAXIMUM: A maximum computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * MINIMUM: A minimum computation.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @param computationId
     *        The ID for a computation.
     */

    public void setComputationId(String computationId) {
        this.computationId = computationId;
    }

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @return The ID for a computation.
     */

    public String getComputationId() {
        return this.computationId;
    }

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @param computationId
     *        The ID for a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaximumMinimumComputation withComputationId(String computationId) {
        setComputationId(computationId);
        return this;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @param name
     *        The name of a computation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @return The name of a computation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @param name
     *        The name of a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaximumMinimumComputation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @param time
     *        The time field that is used in a computation.
     */

    public void setTime(DimensionField time) {
        this.time = time;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @return The time field that is used in a computation.
     */

    public DimensionField getTime() {
        return this.time;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @param time
     *        The time field that is used in a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaximumMinimumComputation withTime(DimensionField time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     * 
     * @param value
     *        The value field that is used in a computation.
     */

    public void setValue(MeasureField value) {
        this.value = value;
    }

    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     * 
     * @return The value field that is used in a computation.
     */

    public MeasureField getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     * 
     * @param value
     *        The value field that is used in a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaximumMinimumComputation withValue(MeasureField value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MAXIMUM: A maximum computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * MINIMUM: A minimum computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of computation. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        MAXIMUM: A maximum computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MINIMUM: A minimum computation.
     *        </p>
     *        </li>
     * @see MaximumMinimumComputationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MAXIMUM: A maximum computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * MINIMUM: A minimum computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of computation. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         MAXIMUM: A maximum computation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MINIMUM: A minimum computation.
     *         </p>
     *         </li>
     * @see MaximumMinimumComputationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MAXIMUM: A maximum computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * MINIMUM: A minimum computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of computation. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        MAXIMUM: A maximum computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MINIMUM: A minimum computation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumMinimumComputationType
     */

    public MaximumMinimumComputation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of computation. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MAXIMUM: A maximum computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * MINIMUM: A minimum computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of computation. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        MAXIMUM: A maximum computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MINIMUM: A minimum computation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumMinimumComputationType
     */

    public MaximumMinimumComputation withType(MaximumMinimumComputationType type) {
        this.type = type.toString();
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
        if (getComputationId() != null)
            sb.append("ComputationId: ").append(getComputationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaximumMinimumComputation == false)
            return false;
        MaximumMinimumComputation other = (MaximumMinimumComputation) obj;
        if (other.getComputationId() == null ^ this.getComputationId() == null)
            return false;
        if (other.getComputationId() != null && other.getComputationId().equals(this.getComputationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputationId() == null) ? 0 : getComputationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public MaximumMinimumComputation clone() {
        try {
            return (MaximumMinimumComputation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.MaximumMinimumComputationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
