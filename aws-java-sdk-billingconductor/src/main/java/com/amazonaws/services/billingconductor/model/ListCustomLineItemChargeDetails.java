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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of the charge details of a custom line item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemChargeDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomLineItemChargeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>ListCustomLineItemFlatChargeDetails</code> that describes the charge details of a flat custom line item.
     * </p>
     */
    private ListCustomLineItemFlatChargeDetails flat;
    /**
     * <p>
     * A <code>ListCustomLineItemPercentageChargeDetails</code> that describes the charge details of a percentage custom
     * line item.
     * </p>
     */
    private ListCustomLineItemPercentageChargeDetails percentage;
    /**
     * <p>
     * The type of the custom line item that indicates whether the charge is a <code>fee</code> or <code>credit</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A representation of the line item filter.
     * </p>
     */
    private java.util.List<LineItemFilter> lineItemFilters;

    /**
     * <p>
     * A <code>ListCustomLineItemFlatChargeDetails</code> that describes the charge details of a flat custom line item.
     * </p>
     * 
     * @param flat
     *        A <code>ListCustomLineItemFlatChargeDetails</code> that describes the charge details of a flat custom line
     *        item.
     */

    public void setFlat(ListCustomLineItemFlatChargeDetails flat) {
        this.flat = flat;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemFlatChargeDetails</code> that describes the charge details of a flat custom line item.
     * </p>
     * 
     * @return A <code>ListCustomLineItemFlatChargeDetails</code> that describes the charge details of a flat custom
     *         line item.
     */

    public ListCustomLineItemFlatChargeDetails getFlat() {
        return this.flat;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemFlatChargeDetails</code> that describes the charge details of a flat custom line item.
     * </p>
     * 
     * @param flat
     *        A <code>ListCustomLineItemFlatChargeDetails</code> that describes the charge details of a flat custom line
     *        item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemChargeDetails withFlat(ListCustomLineItemFlatChargeDetails flat) {
        setFlat(flat);
        return this;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemPercentageChargeDetails</code> that describes the charge details of a percentage custom
     * line item.
     * </p>
     * 
     * @param percentage
     *        A <code>ListCustomLineItemPercentageChargeDetails</code> that describes the charge details of a percentage
     *        custom line item.
     */

    public void setPercentage(ListCustomLineItemPercentageChargeDetails percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemPercentageChargeDetails</code> that describes the charge details of a percentage custom
     * line item.
     * </p>
     * 
     * @return A <code>ListCustomLineItemPercentageChargeDetails</code> that describes the charge details of a
     *         percentage custom line item.
     */

    public ListCustomLineItemPercentageChargeDetails getPercentage() {
        return this.percentage;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemPercentageChargeDetails</code> that describes the charge details of a percentage custom
     * line item.
     * </p>
     * 
     * @param percentage
     *        A <code>ListCustomLineItemPercentageChargeDetails</code> that describes the charge details of a percentage
     *        custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemChargeDetails withPercentage(ListCustomLineItemPercentageChargeDetails percentage) {
        setPercentage(percentage);
        return this;
    }

    /**
     * <p>
     * The type of the custom line item that indicates whether the charge is a <code>fee</code> or <code>credit</code>.
     * </p>
     * 
     * @param type
     *        The type of the custom line item that indicates whether the charge is a <code>fee</code> or
     *        <code>credit</code>.
     * @see CustomLineItemType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the custom line item that indicates whether the charge is a <code>fee</code> or <code>credit</code>.
     * </p>
     * 
     * @return The type of the custom line item that indicates whether the charge is a <code>fee</code> or
     *         <code>credit</code>.
     * @see CustomLineItemType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the custom line item that indicates whether the charge is a <code>fee</code> or <code>credit</code>.
     * </p>
     * 
     * @param type
     *        The type of the custom line item that indicates whether the charge is a <code>fee</code> or
     *        <code>credit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomLineItemType
     */

    public ListCustomLineItemChargeDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the custom line item that indicates whether the charge is a <code>fee</code> or <code>credit</code>.
     * </p>
     * 
     * @param type
     *        The type of the custom line item that indicates whether the charge is a <code>fee</code> or
     *        <code>credit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomLineItemType
     */

    public ListCustomLineItemChargeDetails withType(CustomLineItemType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A representation of the line item filter.
     * </p>
     * 
     * @return A representation of the line item filter.
     */

    public java.util.List<LineItemFilter> getLineItemFilters() {
        return lineItemFilters;
    }

    /**
     * <p>
     * A representation of the line item filter.
     * </p>
     * 
     * @param lineItemFilters
     *        A representation of the line item filter.
     */

    public void setLineItemFilters(java.util.Collection<LineItemFilter> lineItemFilters) {
        if (lineItemFilters == null) {
            this.lineItemFilters = null;
            return;
        }

        this.lineItemFilters = new java.util.ArrayList<LineItemFilter>(lineItemFilters);
    }

    /**
     * <p>
     * A representation of the line item filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineItemFilters(java.util.Collection)} or {@link #withLineItemFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lineItemFilters
     *        A representation of the line item filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemChargeDetails withLineItemFilters(LineItemFilter... lineItemFilters) {
        if (this.lineItemFilters == null) {
            setLineItemFilters(new java.util.ArrayList<LineItemFilter>(lineItemFilters.length));
        }
        for (LineItemFilter ele : lineItemFilters) {
            this.lineItemFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A representation of the line item filter.
     * </p>
     * 
     * @param lineItemFilters
     *        A representation of the line item filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemChargeDetails withLineItemFilters(java.util.Collection<LineItemFilter> lineItemFilters) {
        setLineItemFilters(lineItemFilters);
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
        if (getFlat() != null)
            sb.append("Flat: ").append(getFlat()).append(",");
        if (getPercentage() != null)
            sb.append("Percentage: ").append(getPercentage()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLineItemFilters() != null)
            sb.append("LineItemFilters: ").append(getLineItemFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomLineItemChargeDetails == false)
            return false;
        ListCustomLineItemChargeDetails other = (ListCustomLineItemChargeDetails) obj;
        if (other.getFlat() == null ^ this.getFlat() == null)
            return false;
        if (other.getFlat() != null && other.getFlat().equals(this.getFlat()) == false)
            return false;
        if (other.getPercentage() == null ^ this.getPercentage() == null)
            return false;
        if (other.getPercentage() != null && other.getPercentage().equals(this.getPercentage()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLineItemFilters() == null ^ this.getLineItemFilters() == null)
            return false;
        if (other.getLineItemFilters() != null && other.getLineItemFilters().equals(this.getLineItemFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlat() == null) ? 0 : getFlat().hashCode());
        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLineItemFilters() == null) ? 0 : getLineItemFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomLineItemChargeDetails clone() {
        try {
            return (ListCustomLineItemChargeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ListCustomLineItemChargeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
