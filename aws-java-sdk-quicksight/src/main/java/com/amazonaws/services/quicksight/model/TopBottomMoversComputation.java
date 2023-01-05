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
 * The top movers and bottom movers computation setup.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopBottomMoversComputation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopBottomMoversComputation implements Serializable, Cloneable, StructuredPojo {

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
     * The category field that is used in a computation.
     * </p>
     */
    private DimensionField category;
    /**
     * <p>
     * The value field that is used in a computation.
     * </p>
     */
    private MeasureField value;
    /**
     * <p>
     * The mover size setup of the top and bottom movers computation.
     * </p>
     */
    private Integer moverSize;
    /**
     * <p>
     * The sort order setup of the top and bottom movers computation.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The computation type. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: Top movers computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: Bottom movers computation.
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

    public TopBottomMoversComputation withComputationId(String computationId) {
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

    public TopBottomMoversComputation withName(String name) {
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

    public TopBottomMoversComputation withTime(DimensionField time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The category field that is used in a computation.
     * </p>
     * 
     * @param category
     *        The category field that is used in a computation.
     */

    public void setCategory(DimensionField category) {
        this.category = category;
    }

    /**
     * <p>
     * The category field that is used in a computation.
     * </p>
     * 
     * @return The category field that is used in a computation.
     */

    public DimensionField getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category field that is used in a computation.
     * </p>
     * 
     * @param category
     *        The category field that is used in a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopBottomMoversComputation withCategory(DimensionField category) {
        setCategory(category);
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

    public TopBottomMoversComputation withValue(MeasureField value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The mover size setup of the top and bottom movers computation.
     * </p>
     * 
     * @param moverSize
     *        The mover size setup of the top and bottom movers computation.
     */

    public void setMoverSize(Integer moverSize) {
        this.moverSize = moverSize;
    }

    /**
     * <p>
     * The mover size setup of the top and bottom movers computation.
     * </p>
     * 
     * @return The mover size setup of the top and bottom movers computation.
     */

    public Integer getMoverSize() {
        return this.moverSize;
    }

    /**
     * <p>
     * The mover size setup of the top and bottom movers computation.
     * </p>
     * 
     * @param moverSize
     *        The mover size setup of the top and bottom movers computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopBottomMoversComputation withMoverSize(Integer moverSize) {
        setMoverSize(moverSize);
        return this;
    }

    /**
     * <p>
     * The sort order setup of the top and bottom movers computation.
     * </p>
     * 
     * @param sortOrder
     *        The sort order setup of the top and bottom movers computation.
     * @see TopBottomSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order setup of the top and bottom movers computation.
     * </p>
     * 
     * @return The sort order setup of the top and bottom movers computation.
     * @see TopBottomSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order setup of the top and bottom movers computation.
     * </p>
     * 
     * @param sortOrder
     *        The sort order setup of the top and bottom movers computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopBottomSortOrder
     */

    public TopBottomMoversComputation withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order setup of the top and bottom movers computation.
     * </p>
     * 
     * @param sortOrder
     *        The sort order setup of the top and bottom movers computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopBottomSortOrder
     */

    public TopBottomMoversComputation withSortOrder(TopBottomSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The computation type. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: Top movers computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: Bottom movers computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The computation type. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TOP: Top movers computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BOTTOM: Bottom movers computation.
     *        </p>
     *        </li>
     * @see TopBottomComputationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The computation type. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: Top movers computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: Bottom movers computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The computation type. Choose from the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TOP: Top movers computation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BOTTOM: Bottom movers computation.
     *         </p>
     *         </li>
     * @see TopBottomComputationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The computation type. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: Top movers computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: Bottom movers computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The computation type. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TOP: Top movers computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BOTTOM: Bottom movers computation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopBottomComputationType
     */

    public TopBottomMoversComputation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The computation type. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: Top movers computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: Bottom movers computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The computation type. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TOP: Top movers computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BOTTOM: Bottom movers computation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopBottomComputationType
     */

    public TopBottomMoversComputation withType(TopBottomComputationType type) {
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getMoverSize() != null)
            sb.append("MoverSize: ").append(getMoverSize()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
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

        if (obj instanceof TopBottomMoversComputation == false)
            return false;
        TopBottomMoversComputation other = (TopBottomMoversComputation) obj;
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
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getMoverSize() == null ^ this.getMoverSize() == null)
            return false;
        if (other.getMoverSize() != null && other.getMoverSize().equals(this.getMoverSize()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
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
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getMoverSize() == null) ? 0 : getMoverSize().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TopBottomMoversComputation clone() {
        try {
            return (TopBottomMoversComputation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopBottomMoversComputationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
