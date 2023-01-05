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
 * The drill down filter for the column hierarchies.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DrillDownFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DrillDownFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The numeric equality type drill down filter. This filter is used for number type columns.
     * </p>
     */
    private NumericEqualityDrillDownFilter numericEqualityFilter;
    /**
     * <p>
     * The category type drill down filter. This filter is used for string type columns.
     * </p>
     */
    private CategoryDrillDownFilter categoryFilter;
    /**
     * <p>
     * The time range drill down filter. This filter is used for date time columns.
     * </p>
     */
    private TimeRangeDrillDownFilter timeRangeFilter;

    /**
     * <p>
     * The numeric equality type drill down filter. This filter is used for number type columns.
     * </p>
     * 
     * @param numericEqualityFilter
     *        The numeric equality type drill down filter. This filter is used for number type columns.
     */

    public void setNumericEqualityFilter(NumericEqualityDrillDownFilter numericEqualityFilter) {
        this.numericEqualityFilter = numericEqualityFilter;
    }

    /**
     * <p>
     * The numeric equality type drill down filter. This filter is used for number type columns.
     * </p>
     * 
     * @return The numeric equality type drill down filter. This filter is used for number type columns.
     */

    public NumericEqualityDrillDownFilter getNumericEqualityFilter() {
        return this.numericEqualityFilter;
    }

    /**
     * <p>
     * The numeric equality type drill down filter. This filter is used for number type columns.
     * </p>
     * 
     * @param numericEqualityFilter
     *        The numeric equality type drill down filter. This filter is used for number type columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DrillDownFilter withNumericEqualityFilter(NumericEqualityDrillDownFilter numericEqualityFilter) {
        setNumericEqualityFilter(numericEqualityFilter);
        return this;
    }

    /**
     * <p>
     * The category type drill down filter. This filter is used for string type columns.
     * </p>
     * 
     * @param categoryFilter
     *        The category type drill down filter. This filter is used for string type columns.
     */

    public void setCategoryFilter(CategoryDrillDownFilter categoryFilter) {
        this.categoryFilter = categoryFilter;
    }

    /**
     * <p>
     * The category type drill down filter. This filter is used for string type columns.
     * </p>
     * 
     * @return The category type drill down filter. This filter is used for string type columns.
     */

    public CategoryDrillDownFilter getCategoryFilter() {
        return this.categoryFilter;
    }

    /**
     * <p>
     * The category type drill down filter. This filter is used for string type columns.
     * </p>
     * 
     * @param categoryFilter
     *        The category type drill down filter. This filter is used for string type columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DrillDownFilter withCategoryFilter(CategoryDrillDownFilter categoryFilter) {
        setCategoryFilter(categoryFilter);
        return this;
    }

    /**
     * <p>
     * The time range drill down filter. This filter is used for date time columns.
     * </p>
     * 
     * @param timeRangeFilter
     *        The time range drill down filter. This filter is used for date time columns.
     */

    public void setTimeRangeFilter(TimeRangeDrillDownFilter timeRangeFilter) {
        this.timeRangeFilter = timeRangeFilter;
    }

    /**
     * <p>
     * The time range drill down filter. This filter is used for date time columns.
     * </p>
     * 
     * @return The time range drill down filter. This filter is used for date time columns.
     */

    public TimeRangeDrillDownFilter getTimeRangeFilter() {
        return this.timeRangeFilter;
    }

    /**
     * <p>
     * The time range drill down filter. This filter is used for date time columns.
     * </p>
     * 
     * @param timeRangeFilter
     *        The time range drill down filter. This filter is used for date time columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DrillDownFilter withTimeRangeFilter(TimeRangeDrillDownFilter timeRangeFilter) {
        setTimeRangeFilter(timeRangeFilter);
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
        if (getNumericEqualityFilter() != null)
            sb.append("NumericEqualityFilter: ").append(getNumericEqualityFilter()).append(",");
        if (getCategoryFilter() != null)
            sb.append("CategoryFilter: ").append(getCategoryFilter()).append(",");
        if (getTimeRangeFilter() != null)
            sb.append("TimeRangeFilter: ").append(getTimeRangeFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DrillDownFilter == false)
            return false;
        DrillDownFilter other = (DrillDownFilter) obj;
        if (other.getNumericEqualityFilter() == null ^ this.getNumericEqualityFilter() == null)
            return false;
        if (other.getNumericEqualityFilter() != null && other.getNumericEqualityFilter().equals(this.getNumericEqualityFilter()) == false)
            return false;
        if (other.getCategoryFilter() == null ^ this.getCategoryFilter() == null)
            return false;
        if (other.getCategoryFilter() != null && other.getCategoryFilter().equals(this.getCategoryFilter()) == false)
            return false;
        if (other.getTimeRangeFilter() == null ^ this.getTimeRangeFilter() == null)
            return false;
        if (other.getTimeRangeFilter() != null && other.getTimeRangeFilter().equals(this.getTimeRangeFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumericEqualityFilter() == null) ? 0 : getNumericEqualityFilter().hashCode());
        hashCode = prime * hashCode + ((getCategoryFilter() == null) ? 0 : getCategoryFilter().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeFilter() == null) ? 0 : getTimeRangeFilter().hashCode());
        return hashCode;
    }

    @Override
    public DrillDownFilter clone() {
        try {
            return (DrillDownFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DrillDownFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
