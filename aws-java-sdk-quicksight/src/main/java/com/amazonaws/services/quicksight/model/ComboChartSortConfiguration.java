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
 * The sort configuration of a <code>ComboChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ComboChartSortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComboChartSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort configuration of the category field well in a combo chart.
     * </p>
     */
    private java.util.List<FieldSortOptions> categorySort;
    /**
     * <p>
     * The item limit configuration for the category field well of a combo chart.
     * </p>
     */
    private ItemsLimitConfiguration categoryItemsLimit;
    /**
     * <p>
     * The sort configuration of the color field well in a combo chart.
     * </p>
     */
    private java.util.List<FieldSortOptions> colorSort;
    /**
     * <p>
     * The item limit configuration of the color field well in a combo chart.
     * </p>
     */
    private ItemsLimitConfiguration colorItemsLimit;

    /**
     * <p>
     * The sort configuration of the category field well in a combo chart.
     * </p>
     * 
     * @return The sort configuration of the category field well in a combo chart.
     */

    public java.util.List<FieldSortOptions> getCategorySort() {
        return categorySort;
    }

    /**
     * <p>
     * The sort configuration of the category field well in a combo chart.
     * </p>
     * 
     * @param categorySort
     *        The sort configuration of the category field well in a combo chart.
     */

    public void setCategorySort(java.util.Collection<FieldSortOptions> categorySort) {
        if (categorySort == null) {
            this.categorySort = null;
            return;
        }

        this.categorySort = new java.util.ArrayList<FieldSortOptions>(categorySort);
    }

    /**
     * <p>
     * The sort configuration of the category field well in a combo chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategorySort(java.util.Collection)} or {@link #withCategorySort(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categorySort
     *        The sort configuration of the category field well in a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartSortConfiguration withCategorySort(FieldSortOptions... categorySort) {
        if (this.categorySort == null) {
            setCategorySort(new java.util.ArrayList<FieldSortOptions>(categorySort.length));
        }
        for (FieldSortOptions ele : categorySort) {
            this.categorySort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sort configuration of the category field well in a combo chart.
     * </p>
     * 
     * @param categorySort
     *        The sort configuration of the category field well in a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartSortConfiguration withCategorySort(java.util.Collection<FieldSortOptions> categorySort) {
        setCategorySort(categorySort);
        return this;
    }

    /**
     * <p>
     * The item limit configuration for the category field well of a combo chart.
     * </p>
     * 
     * @param categoryItemsLimit
     *        The item limit configuration for the category field well of a combo chart.
     */

    public void setCategoryItemsLimit(ItemsLimitConfiguration categoryItemsLimit) {
        this.categoryItemsLimit = categoryItemsLimit;
    }

    /**
     * <p>
     * The item limit configuration for the category field well of a combo chart.
     * </p>
     * 
     * @return The item limit configuration for the category field well of a combo chart.
     */

    public ItemsLimitConfiguration getCategoryItemsLimit() {
        return this.categoryItemsLimit;
    }

    /**
     * <p>
     * The item limit configuration for the category field well of a combo chart.
     * </p>
     * 
     * @param categoryItemsLimit
     *        The item limit configuration for the category field well of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartSortConfiguration withCategoryItemsLimit(ItemsLimitConfiguration categoryItemsLimit) {
        setCategoryItemsLimit(categoryItemsLimit);
        return this;
    }

    /**
     * <p>
     * The sort configuration of the color field well in a combo chart.
     * </p>
     * 
     * @return The sort configuration of the color field well in a combo chart.
     */

    public java.util.List<FieldSortOptions> getColorSort() {
        return colorSort;
    }

    /**
     * <p>
     * The sort configuration of the color field well in a combo chart.
     * </p>
     * 
     * @param colorSort
     *        The sort configuration of the color field well in a combo chart.
     */

    public void setColorSort(java.util.Collection<FieldSortOptions> colorSort) {
        if (colorSort == null) {
            this.colorSort = null;
            return;
        }

        this.colorSort = new java.util.ArrayList<FieldSortOptions>(colorSort);
    }

    /**
     * <p>
     * The sort configuration of the color field well in a combo chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColorSort(java.util.Collection)} or {@link #withColorSort(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param colorSort
     *        The sort configuration of the color field well in a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartSortConfiguration withColorSort(FieldSortOptions... colorSort) {
        if (this.colorSort == null) {
            setColorSort(new java.util.ArrayList<FieldSortOptions>(colorSort.length));
        }
        for (FieldSortOptions ele : colorSort) {
            this.colorSort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sort configuration of the color field well in a combo chart.
     * </p>
     * 
     * @param colorSort
     *        The sort configuration of the color field well in a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartSortConfiguration withColorSort(java.util.Collection<FieldSortOptions> colorSort) {
        setColorSort(colorSort);
        return this;
    }

    /**
     * <p>
     * The item limit configuration of the color field well in a combo chart.
     * </p>
     * 
     * @param colorItemsLimit
     *        The item limit configuration of the color field well in a combo chart.
     */

    public void setColorItemsLimit(ItemsLimitConfiguration colorItemsLimit) {
        this.colorItemsLimit = colorItemsLimit;
    }

    /**
     * <p>
     * The item limit configuration of the color field well in a combo chart.
     * </p>
     * 
     * @return The item limit configuration of the color field well in a combo chart.
     */

    public ItemsLimitConfiguration getColorItemsLimit() {
        return this.colorItemsLimit;
    }

    /**
     * <p>
     * The item limit configuration of the color field well in a combo chart.
     * </p>
     * 
     * @param colorItemsLimit
     *        The item limit configuration of the color field well in a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartSortConfiguration withColorItemsLimit(ItemsLimitConfiguration colorItemsLimit) {
        setColorItemsLimit(colorItemsLimit);
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
        if (getCategorySort() != null)
            sb.append("CategorySort: ").append(getCategorySort()).append(",");
        if (getCategoryItemsLimit() != null)
            sb.append("CategoryItemsLimit: ").append(getCategoryItemsLimit()).append(",");
        if (getColorSort() != null)
            sb.append("ColorSort: ").append(getColorSort()).append(",");
        if (getColorItemsLimit() != null)
            sb.append("ColorItemsLimit: ").append(getColorItemsLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComboChartSortConfiguration == false)
            return false;
        ComboChartSortConfiguration other = (ComboChartSortConfiguration) obj;
        if (other.getCategorySort() == null ^ this.getCategorySort() == null)
            return false;
        if (other.getCategorySort() != null && other.getCategorySort().equals(this.getCategorySort()) == false)
            return false;
        if (other.getCategoryItemsLimit() == null ^ this.getCategoryItemsLimit() == null)
            return false;
        if (other.getCategoryItemsLimit() != null && other.getCategoryItemsLimit().equals(this.getCategoryItemsLimit()) == false)
            return false;
        if (other.getColorSort() == null ^ this.getColorSort() == null)
            return false;
        if (other.getColorSort() != null && other.getColorSort().equals(this.getColorSort()) == false)
            return false;
        if (other.getColorItemsLimit() == null ^ this.getColorItemsLimit() == null)
            return false;
        if (other.getColorItemsLimit() != null && other.getColorItemsLimit().equals(this.getColorItemsLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategorySort() == null) ? 0 : getCategorySort().hashCode());
        hashCode = prime * hashCode + ((getCategoryItemsLimit() == null) ? 0 : getCategoryItemsLimit().hashCode());
        hashCode = prime * hashCode + ((getColorSort() == null) ? 0 : getColorSort().hashCode());
        hashCode = prime * hashCode + ((getColorItemsLimit() == null) ? 0 : getColorItemsLimit().hashCode());
        return hashCode;
    }

    @Override
    public ComboChartSortConfiguration clone() {
        try {
            return (ComboChartSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ComboChartSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
