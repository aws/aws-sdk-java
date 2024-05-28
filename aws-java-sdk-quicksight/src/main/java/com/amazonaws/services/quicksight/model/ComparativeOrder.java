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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents a comparative order.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ComparativeOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComparativeOrder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     * <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * </p>
     */
    private String useOrdering;
    /**
     * <p>
     * The list of columns to be used in the ordering.
     * </p>
     */
    private java.util.List<String> specifedOrder;
    /**
     * <p>
     * The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     * <code>MOST</code>.
     * </p>
     */
    private String treatUndefinedSpecifiedValues;

    /**
     * <p>
     * The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     * <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * </p>
     * 
     * @param useOrdering
     *        The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     *        <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * @see ColumnOrderingType
     */

    public void setUseOrdering(String useOrdering) {
        this.useOrdering = useOrdering;
    }

    /**
     * <p>
     * The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     * <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * </p>
     * 
     * @return The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     *         <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * @see ColumnOrderingType
     */

    public String getUseOrdering() {
        return this.useOrdering;
    }

    /**
     * <p>
     * The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     * <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * </p>
     * 
     * @param useOrdering
     *        The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     *        <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnOrderingType
     */

    public ComparativeOrder withUseOrdering(String useOrdering) {
        setUseOrdering(useOrdering);
        return this;
    }

    /**
     * <p>
     * The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     * <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * </p>
     * 
     * @param useOrdering
     *        The ordering type for a column. Valid values for this structure are <code>GREATER_IS_BETTER</code>,
     *        <code>LESSER_IS_BETTER</code> and <code>SPECIFIED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnOrderingType
     */

    public ComparativeOrder withUseOrdering(ColumnOrderingType useOrdering) {
        this.useOrdering = useOrdering.toString();
        return this;
    }

    /**
     * <p>
     * The list of columns to be used in the ordering.
     * </p>
     * 
     * @return The list of columns to be used in the ordering.
     */

    public java.util.List<String> getSpecifedOrder() {
        return specifedOrder;
    }

    /**
     * <p>
     * The list of columns to be used in the ordering.
     * </p>
     * 
     * @param specifedOrder
     *        The list of columns to be used in the ordering.
     */

    public void setSpecifedOrder(java.util.Collection<String> specifedOrder) {
        if (specifedOrder == null) {
            this.specifedOrder = null;
            return;
        }

        this.specifedOrder = new java.util.ArrayList<String>(specifedOrder);
    }

    /**
     * <p>
     * The list of columns to be used in the ordering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpecifedOrder(java.util.Collection)} or {@link #withSpecifedOrder(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param specifedOrder
     *        The list of columns to be used in the ordering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparativeOrder withSpecifedOrder(String... specifedOrder) {
        if (this.specifedOrder == null) {
            setSpecifedOrder(new java.util.ArrayList<String>(specifedOrder.length));
        }
        for (String ele : specifedOrder) {
            this.specifedOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of columns to be used in the ordering.
     * </p>
     * 
     * @param specifedOrder
     *        The list of columns to be used in the ordering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparativeOrder withSpecifedOrder(java.util.Collection<String> specifedOrder) {
        setSpecifedOrder(specifedOrder);
        return this;
    }

    /**
     * <p>
     * The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     * <code>MOST</code>.
     * </p>
     * 
     * @param treatUndefinedSpecifiedValues
     *        The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     *        <code>MOST</code>.
     * @see UndefinedSpecifiedValueType
     */

    public void setTreatUndefinedSpecifiedValues(String treatUndefinedSpecifiedValues) {
        this.treatUndefinedSpecifiedValues = treatUndefinedSpecifiedValues;
    }

    /**
     * <p>
     * The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     * <code>MOST</code>.
     * </p>
     * 
     * @return The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     *         <code>MOST</code>.
     * @see UndefinedSpecifiedValueType
     */

    public String getTreatUndefinedSpecifiedValues() {
        return this.treatUndefinedSpecifiedValues;
    }

    /**
     * <p>
     * The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     * <code>MOST</code>.
     * </p>
     * 
     * @param treatUndefinedSpecifiedValues
     *        The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     *        <code>MOST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UndefinedSpecifiedValueType
     */

    public ComparativeOrder withTreatUndefinedSpecifiedValues(String treatUndefinedSpecifiedValues) {
        setTreatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues);
        return this;
    }

    /**
     * <p>
     * The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     * <code>MOST</code>.
     * </p>
     * 
     * @param treatUndefinedSpecifiedValues
     *        The treat of undefined specified values. Valid values for this structure are <code>LEAST</code> and
     *        <code>MOST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UndefinedSpecifiedValueType
     */

    public ComparativeOrder withTreatUndefinedSpecifiedValues(UndefinedSpecifiedValueType treatUndefinedSpecifiedValues) {
        this.treatUndefinedSpecifiedValues = treatUndefinedSpecifiedValues.toString();
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
        if (getUseOrdering() != null)
            sb.append("UseOrdering: ").append(getUseOrdering()).append(",");
        if (getSpecifedOrder() != null)
            sb.append("SpecifedOrder: ").append(getSpecifedOrder()).append(",");
        if (getTreatUndefinedSpecifiedValues() != null)
            sb.append("TreatUndefinedSpecifiedValues: ").append(getTreatUndefinedSpecifiedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComparativeOrder == false)
            return false;
        ComparativeOrder other = (ComparativeOrder) obj;
        if (other.getUseOrdering() == null ^ this.getUseOrdering() == null)
            return false;
        if (other.getUseOrdering() != null && other.getUseOrdering().equals(this.getUseOrdering()) == false)
            return false;
        if (other.getSpecifedOrder() == null ^ this.getSpecifedOrder() == null)
            return false;
        if (other.getSpecifedOrder() != null && other.getSpecifedOrder().equals(this.getSpecifedOrder()) == false)
            return false;
        if (other.getTreatUndefinedSpecifiedValues() == null ^ this.getTreatUndefinedSpecifiedValues() == null)
            return false;
        if (other.getTreatUndefinedSpecifiedValues() != null
                && other.getTreatUndefinedSpecifiedValues().equals(this.getTreatUndefinedSpecifiedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUseOrdering() == null) ? 0 : getUseOrdering().hashCode());
        hashCode = prime * hashCode + ((getSpecifedOrder() == null) ? 0 : getSpecifedOrder().hashCode());
        hashCode = prime * hashCode + ((getTreatUndefinedSpecifiedValues() == null) ? 0 : getTreatUndefinedSpecifiedValues().hashCode());
        return hashCode;
    }

    @Override
    public ComparativeOrder clone() {
        try {
            return (ComparativeOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ComparativeOrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
