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
 * The sort configuration of a line chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LineChartSortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineChartSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort configuration of the category fields.
     * </p>
     */
    private java.util.List<FieldSortOptions> categorySort;
    /**
     * <p>
     * The limit on the number of categories that are displayed in a line chart.
     * </p>
     */
    private ItemsLimitConfiguration categoryItemsLimitConfiguration;
    /**
     * <p>
     * The limit on the number of lines that are displayed in a line chart.
     * </p>
     */
    private ItemsLimitConfiguration colorItemsLimitConfiguration;
    /**
     * <p>
     * The sort configuration of the small multiples field.
     * </p>
     */
    private java.util.List<FieldSortOptions> smallMultiplesSort;
    /**
     * <p>
     * The limit on the number of small multiples panels that are displayed.
     * </p>
     */
    private ItemsLimitConfiguration smallMultiplesLimitConfiguration;

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

    public LineChartSortConfiguration withCategorySort(FieldSortOptions... categorySort) {
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

    public LineChartSortConfiguration withCategorySort(java.util.Collection<FieldSortOptions> categorySort) {
        setCategorySort(categorySort);
        return this;
    }

    /**
     * <p>
     * The limit on the number of categories that are displayed in a line chart.
     * </p>
     * 
     * @param categoryItemsLimitConfiguration
     *        The limit on the number of categories that are displayed in a line chart.
     */

    public void setCategoryItemsLimitConfiguration(ItemsLimitConfiguration categoryItemsLimitConfiguration) {
        this.categoryItemsLimitConfiguration = categoryItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of categories that are displayed in a line chart.
     * </p>
     * 
     * @return The limit on the number of categories that are displayed in a line chart.
     */

    public ItemsLimitConfiguration getCategoryItemsLimitConfiguration() {
        return this.categoryItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of categories that are displayed in a line chart.
     * </p>
     * 
     * @param categoryItemsLimitConfiguration
     *        The limit on the number of categories that are displayed in a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartSortConfiguration withCategoryItemsLimitConfiguration(ItemsLimitConfiguration categoryItemsLimitConfiguration) {
        setCategoryItemsLimitConfiguration(categoryItemsLimitConfiguration);
        return this;
    }

    /**
     * <p>
     * The limit on the number of lines that are displayed in a line chart.
     * </p>
     * 
     * @param colorItemsLimitConfiguration
     *        The limit on the number of lines that are displayed in a line chart.
     */

    public void setColorItemsLimitConfiguration(ItemsLimitConfiguration colorItemsLimitConfiguration) {
        this.colorItemsLimitConfiguration = colorItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of lines that are displayed in a line chart.
     * </p>
     * 
     * @return The limit on the number of lines that are displayed in a line chart.
     */

    public ItemsLimitConfiguration getColorItemsLimitConfiguration() {
        return this.colorItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of lines that are displayed in a line chart.
     * </p>
     * 
     * @param colorItemsLimitConfiguration
     *        The limit on the number of lines that are displayed in a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartSortConfiguration withColorItemsLimitConfiguration(ItemsLimitConfiguration colorItemsLimitConfiguration) {
        setColorItemsLimitConfiguration(colorItemsLimitConfiguration);
        return this;
    }

    /**
     * <p>
     * The sort configuration of the small multiples field.
     * </p>
     * 
     * @return The sort configuration of the small multiples field.
     */

    public java.util.List<FieldSortOptions> getSmallMultiplesSort() {
        return smallMultiplesSort;
    }

    /**
     * <p>
     * The sort configuration of the small multiples field.
     * </p>
     * 
     * @param smallMultiplesSort
     *        The sort configuration of the small multiples field.
     */

    public void setSmallMultiplesSort(java.util.Collection<FieldSortOptions> smallMultiplesSort) {
        if (smallMultiplesSort == null) {
            this.smallMultiplesSort = null;
            return;
        }

        this.smallMultiplesSort = new java.util.ArrayList<FieldSortOptions>(smallMultiplesSort);
    }

    /**
     * <p>
     * The sort configuration of the small multiples field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSmallMultiplesSort(java.util.Collection)} or {@link #withSmallMultiplesSort(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param smallMultiplesSort
     *        The sort configuration of the small multiples field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartSortConfiguration withSmallMultiplesSort(FieldSortOptions... smallMultiplesSort) {
        if (this.smallMultiplesSort == null) {
            setSmallMultiplesSort(new java.util.ArrayList<FieldSortOptions>(smallMultiplesSort.length));
        }
        for (FieldSortOptions ele : smallMultiplesSort) {
            this.smallMultiplesSort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sort configuration of the small multiples field.
     * </p>
     * 
     * @param smallMultiplesSort
     *        The sort configuration of the small multiples field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartSortConfiguration withSmallMultiplesSort(java.util.Collection<FieldSortOptions> smallMultiplesSort) {
        setSmallMultiplesSort(smallMultiplesSort);
        return this;
    }

    /**
     * <p>
     * The limit on the number of small multiples panels that are displayed.
     * </p>
     * 
     * @param smallMultiplesLimitConfiguration
     *        The limit on the number of small multiples panels that are displayed.
     */

    public void setSmallMultiplesLimitConfiguration(ItemsLimitConfiguration smallMultiplesLimitConfiguration) {
        this.smallMultiplesLimitConfiguration = smallMultiplesLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of small multiples panels that are displayed.
     * </p>
     * 
     * @return The limit on the number of small multiples panels that are displayed.
     */

    public ItemsLimitConfiguration getSmallMultiplesLimitConfiguration() {
        return this.smallMultiplesLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of small multiples panels that are displayed.
     * </p>
     * 
     * @param smallMultiplesLimitConfiguration
     *        The limit on the number of small multiples panels that are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartSortConfiguration withSmallMultiplesLimitConfiguration(ItemsLimitConfiguration smallMultiplesLimitConfiguration) {
        setSmallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration);
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
        if (getCategoryItemsLimitConfiguration() != null)
            sb.append("CategoryItemsLimitConfiguration: ").append(getCategoryItemsLimitConfiguration()).append(",");
        if (getColorItemsLimitConfiguration() != null)
            sb.append("ColorItemsLimitConfiguration: ").append(getColorItemsLimitConfiguration()).append(",");
        if (getSmallMultiplesSort() != null)
            sb.append("SmallMultiplesSort: ").append(getSmallMultiplesSort()).append(",");
        if (getSmallMultiplesLimitConfiguration() != null)
            sb.append("SmallMultiplesLimitConfiguration: ").append(getSmallMultiplesLimitConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineChartSortConfiguration == false)
            return false;
        LineChartSortConfiguration other = (LineChartSortConfiguration) obj;
        if (other.getCategorySort() == null ^ this.getCategorySort() == null)
            return false;
        if (other.getCategorySort() != null && other.getCategorySort().equals(this.getCategorySort()) == false)
            return false;
        if (other.getCategoryItemsLimitConfiguration() == null ^ this.getCategoryItemsLimitConfiguration() == null)
            return false;
        if (other.getCategoryItemsLimitConfiguration() != null
                && other.getCategoryItemsLimitConfiguration().equals(this.getCategoryItemsLimitConfiguration()) == false)
            return false;
        if (other.getColorItemsLimitConfiguration() == null ^ this.getColorItemsLimitConfiguration() == null)
            return false;
        if (other.getColorItemsLimitConfiguration() != null && other.getColorItemsLimitConfiguration().equals(this.getColorItemsLimitConfiguration()) == false)
            return false;
        if (other.getSmallMultiplesSort() == null ^ this.getSmallMultiplesSort() == null)
            return false;
        if (other.getSmallMultiplesSort() != null && other.getSmallMultiplesSort().equals(this.getSmallMultiplesSort()) == false)
            return false;
        if (other.getSmallMultiplesLimitConfiguration() == null ^ this.getSmallMultiplesLimitConfiguration() == null)
            return false;
        if (other.getSmallMultiplesLimitConfiguration() != null
                && other.getSmallMultiplesLimitConfiguration().equals(this.getSmallMultiplesLimitConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategorySort() == null) ? 0 : getCategorySort().hashCode());
        hashCode = prime * hashCode + ((getCategoryItemsLimitConfiguration() == null) ? 0 : getCategoryItemsLimitConfiguration().hashCode());
        hashCode = prime * hashCode + ((getColorItemsLimitConfiguration() == null) ? 0 : getColorItemsLimitConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSmallMultiplesSort() == null) ? 0 : getSmallMultiplesSort().hashCode());
        hashCode = prime * hashCode + ((getSmallMultiplesLimitConfiguration() == null) ? 0 : getSmallMultiplesLimitConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public LineChartSortConfiguration clone() {
        try {
            return (LineChartSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LineChartSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
