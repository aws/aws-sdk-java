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
 * The top ranked and bottom ranked computation configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopBottomRankedComputation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopBottomRankedComputation implements Serializable, Cloneable, StructuredPojo {

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
     * The result size of a top and bottom ranked computation.
     * </p>
     */
    private Integer resultSize;
    /**
     * <p>
     * The computation type. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: A top ranked computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: A bottom ranked computation.
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

    public TopBottomRankedComputation withComputationId(String computationId) {
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

    public TopBottomRankedComputation withName(String name) {
        setName(name);
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

    public TopBottomRankedComputation withCategory(DimensionField category) {
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

    public TopBottomRankedComputation withValue(MeasureField value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The result size of a top and bottom ranked computation.
     * </p>
     * 
     * @param resultSize
     *        The result size of a top and bottom ranked computation.
     */

    public void setResultSize(Integer resultSize) {
        this.resultSize = resultSize;
    }

    /**
     * <p>
     * The result size of a top and bottom ranked computation.
     * </p>
     * 
     * @return The result size of a top and bottom ranked computation.
     */

    public Integer getResultSize() {
        return this.resultSize;
    }

    /**
     * <p>
     * The result size of a top and bottom ranked computation.
     * </p>
     * 
     * @param resultSize
     *        The result size of a top and bottom ranked computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopBottomRankedComputation withResultSize(Integer resultSize) {
        setResultSize(resultSize);
        return this;
    }

    /**
     * <p>
     * The computation type. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: A top ranked computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: A bottom ranked computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The computation type. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TOP: A top ranked computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BOTTOM: A bottom ranked computation.
     *        </p>
     *        </li>
     * @see TopBottomComputationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The computation type. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: A top ranked computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: A bottom ranked computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The computation type. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TOP: A top ranked computation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BOTTOM: A bottom ranked computation.
     *         </p>
     *         </li>
     * @see TopBottomComputationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The computation type. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: A top ranked computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: A bottom ranked computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The computation type. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TOP: A top ranked computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BOTTOM: A bottom ranked computation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopBottomComputationType
     */

    public TopBottomRankedComputation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The computation type. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TOP: A top ranked computation.
     * </p>
     * </li>
     * <li>
     * <p>
     * BOTTOM: A bottom ranked computation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The computation type. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TOP: A top ranked computation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BOTTOM: A bottom ranked computation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopBottomComputationType
     */

    public TopBottomRankedComputation withType(TopBottomComputationType type) {
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getResultSize() != null)
            sb.append("ResultSize: ").append(getResultSize()).append(",");
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

        if (obj instanceof TopBottomRankedComputation == false)
            return false;
        TopBottomRankedComputation other = (TopBottomRankedComputation) obj;
        if (other.getComputationId() == null ^ this.getComputationId() == null)
            return false;
        if (other.getComputationId() != null && other.getComputationId().equals(this.getComputationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getResultSize() == null ^ this.getResultSize() == null)
            return false;
        if (other.getResultSize() != null && other.getResultSize().equals(this.getResultSize()) == false)
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
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getResultSize() == null) ? 0 : getResultSize().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TopBottomRankedComputation clone() {
        try {
            return (TopBottomRankedComputation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopBottomRankedComputationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
