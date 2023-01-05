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
 * The setup for the detailed tooltip.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FieldBasedTooltip" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldBasedTooltip implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility of <code>Show aggregations</code>.
     * </p>
     */
    private String aggregationVisibility;
    /**
     * <p>
     * The type for the &gt;tooltip title. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Doesn't use the primary value as the title.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     * </p>
     * </li>
     * </ul>
     */
    private String tooltipTitleType;
    /**
     * <p>
     * The fields configuration in the tooltip.
     * </p>
     */
    private java.util.List<TooltipItem> tooltipFields;

    /**
     * <p>
     * The visibility of <code>Show aggregations</code>.
     * </p>
     * 
     * @param aggregationVisibility
     *        The visibility of <code>Show aggregations</code>.
     * @see Visibility
     */

    public void setAggregationVisibility(String aggregationVisibility) {
        this.aggregationVisibility = aggregationVisibility;
    }

    /**
     * <p>
     * The visibility of <code>Show aggregations</code>.
     * </p>
     * 
     * @return The visibility of <code>Show aggregations</code>.
     * @see Visibility
     */

    public String getAggregationVisibility() {
        return this.aggregationVisibility;
    }

    /**
     * <p>
     * The visibility of <code>Show aggregations</code>.
     * </p>
     * 
     * @param aggregationVisibility
     *        The visibility of <code>Show aggregations</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FieldBasedTooltip withAggregationVisibility(String aggregationVisibility) {
        setAggregationVisibility(aggregationVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility of <code>Show aggregations</code>.
     * </p>
     * 
     * @param aggregationVisibility
     *        The visibility of <code>Show aggregations</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FieldBasedTooltip withAggregationVisibility(Visibility aggregationVisibility) {
        this.aggregationVisibility = aggregationVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The type for the &gt;tooltip title. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Doesn't use the primary value as the title.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tooltipTitleType
     *        The type for the &gt;tooltip title. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Doesn't use the primary value as the title.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     *        </p>
     *        </li>
     * @see TooltipTitleType
     */

    public void setTooltipTitleType(String tooltipTitleType) {
        this.tooltipTitleType = tooltipTitleType;
    }

    /**
     * <p>
     * The type for the &gt;tooltip title. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Doesn't use the primary value as the title.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type for the &gt;tooltip title. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Doesn't use the primary value as the title.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     *         </p>
     *         </li>
     * @see TooltipTitleType
     */

    public String getTooltipTitleType() {
        return this.tooltipTitleType;
    }

    /**
     * <p>
     * The type for the &gt;tooltip title. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Doesn't use the primary value as the title.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tooltipTitleType
     *        The type for the &gt;tooltip title. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Doesn't use the primary value as the title.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TooltipTitleType
     */

    public FieldBasedTooltip withTooltipTitleType(String tooltipTitleType) {
        setTooltipTitleType(tooltipTitleType);
        return this;
    }

    /**
     * <p>
     * The type for the &gt;tooltip title. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Doesn't use the primary value as the title.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tooltipTitleType
     *        The type for the &gt;tooltip title. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Doesn't use the primary value as the title.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRIMARY_VALUE</code>: Uses primary value as the title.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TooltipTitleType
     */

    public FieldBasedTooltip withTooltipTitleType(TooltipTitleType tooltipTitleType) {
        this.tooltipTitleType = tooltipTitleType.toString();
        return this;
    }

    /**
     * <p>
     * The fields configuration in the tooltip.
     * </p>
     * 
     * @return The fields configuration in the tooltip.
     */

    public java.util.List<TooltipItem> getTooltipFields() {
        return tooltipFields;
    }

    /**
     * <p>
     * The fields configuration in the tooltip.
     * </p>
     * 
     * @param tooltipFields
     *        The fields configuration in the tooltip.
     */

    public void setTooltipFields(java.util.Collection<TooltipItem> tooltipFields) {
        if (tooltipFields == null) {
            this.tooltipFields = null;
            return;
        }

        this.tooltipFields = new java.util.ArrayList<TooltipItem>(tooltipFields);
    }

    /**
     * <p>
     * The fields configuration in the tooltip.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTooltipFields(java.util.Collection)} or {@link #withTooltipFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tooltipFields
     *        The fields configuration in the tooltip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldBasedTooltip withTooltipFields(TooltipItem... tooltipFields) {
        if (this.tooltipFields == null) {
            setTooltipFields(new java.util.ArrayList<TooltipItem>(tooltipFields.length));
        }
        for (TooltipItem ele : tooltipFields) {
            this.tooltipFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The fields configuration in the tooltip.
     * </p>
     * 
     * @param tooltipFields
     *        The fields configuration in the tooltip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldBasedTooltip withTooltipFields(java.util.Collection<TooltipItem> tooltipFields) {
        setTooltipFields(tooltipFields);
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
        if (getAggregationVisibility() != null)
            sb.append("AggregationVisibility: ").append(getAggregationVisibility()).append(",");
        if (getTooltipTitleType() != null)
            sb.append("TooltipTitleType: ").append(getTooltipTitleType()).append(",");
        if (getTooltipFields() != null)
            sb.append("TooltipFields: ").append(getTooltipFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldBasedTooltip == false)
            return false;
        FieldBasedTooltip other = (FieldBasedTooltip) obj;
        if (other.getAggregationVisibility() == null ^ this.getAggregationVisibility() == null)
            return false;
        if (other.getAggregationVisibility() != null && other.getAggregationVisibility().equals(this.getAggregationVisibility()) == false)
            return false;
        if (other.getTooltipTitleType() == null ^ this.getTooltipTitleType() == null)
            return false;
        if (other.getTooltipTitleType() != null && other.getTooltipTitleType().equals(this.getTooltipTitleType()) == false)
            return false;
        if (other.getTooltipFields() == null ^ this.getTooltipFields() == null)
            return false;
        if (other.getTooltipFields() != null && other.getTooltipFields().equals(this.getTooltipFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregationVisibility() == null) ? 0 : getAggregationVisibility().hashCode());
        hashCode = prime * hashCode + ((getTooltipTitleType() == null) ? 0 : getTooltipTitleType().hashCode());
        hashCode = prime * hashCode + ((getTooltipFields() == null) ? 0 : getTooltipFields().hashCode());
        return hashCode;
    }

    @Override
    public FieldBasedTooltip clone() {
        try {
            return (FieldBasedTooltip) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FieldBasedTooltipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
