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
 * The sort configuration of a waterfall visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WaterfallChartSortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaterfallChartSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort configuration of the category fields.
     * </p>
     */
    private java.util.List<FieldSortOptions> categorySort;
    /**
     * <p>
     * The limit on the number of bar groups that are displayed.
     * </p>
     */
    private ItemsLimitConfiguration breakdownItemsLimit;

    /**
     * <p>
     * The sort configuration of the category fields.
     * </p>
     * 
     * @return The sort configuration of the category fields.
     */

    public java.util.List<FieldSortOptions> getCategorySort() {
        return categorySort;
    }

    /**
     * <p>
     * The sort configuration of the category fields.
     * </p>
     * 
     * @param categorySort
     *        The sort configuration of the category fields.
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
     * The sort configuration of the category fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategorySort(java.util.Collection)} or {@link #withCategorySort(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categorySort
     *        The sort configuration of the category fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartSortConfiguration withCategorySort(FieldSortOptions... categorySort) {
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
     * The sort configuration of the category fields.
     * </p>
     * 
     * @param categorySort
     *        The sort configuration of the category fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartSortConfiguration withCategorySort(java.util.Collection<FieldSortOptions> categorySort) {
        setCategorySort(categorySort);
        return this;
    }

    /**
     * <p>
     * The limit on the number of bar groups that are displayed.
     * </p>
     * 
     * @param breakdownItemsLimit
     *        The limit on the number of bar groups that are displayed.
     */

    public void setBreakdownItemsLimit(ItemsLimitConfiguration breakdownItemsLimit) {
        this.breakdownItemsLimit = breakdownItemsLimit;
    }

    /**
     * <p>
     * The limit on the number of bar groups that are displayed.
     * </p>
     * 
     * @return The limit on the number of bar groups that are displayed.
     */

    public ItemsLimitConfiguration getBreakdownItemsLimit() {
        return this.breakdownItemsLimit;
    }

    /**
     * <p>
     * The limit on the number of bar groups that are displayed.
     * </p>
     * 
     * @param breakdownItemsLimit
     *        The limit on the number of bar groups that are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartSortConfiguration withBreakdownItemsLimit(ItemsLimitConfiguration breakdownItemsLimit) {
        setBreakdownItemsLimit(breakdownItemsLimit);
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
        if (getBreakdownItemsLimit() != null)
            sb.append("BreakdownItemsLimit: ").append(getBreakdownItemsLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaterfallChartSortConfiguration == false)
            return false;
        WaterfallChartSortConfiguration other = (WaterfallChartSortConfiguration) obj;
        if (other.getCategorySort() == null ^ this.getCategorySort() == null)
            return false;
        if (other.getCategorySort() != null && other.getCategorySort().equals(this.getCategorySort()) == false)
            return false;
        if (other.getBreakdownItemsLimit() == null ^ this.getBreakdownItemsLimit() == null)
            return false;
        if (other.getBreakdownItemsLimit() != null && other.getBreakdownItemsLimit().equals(this.getBreakdownItemsLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategorySort() == null) ? 0 : getCategorySort().hashCode());
        hashCode = prime * hashCode + ((getBreakdownItemsLimit() == null) ? 0 : getBreakdownItemsLimit().hashCode());
        return hashCode;
    }

    @Override
    public WaterfallChartSortConfiguration clone() {
        try {
            return (WaterfallChartSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WaterfallChartSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
