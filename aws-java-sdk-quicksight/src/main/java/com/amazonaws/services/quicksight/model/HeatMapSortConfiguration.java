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
 * The sort configuration of a heat map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HeatMapSortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeatMapSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field sort configuration of the rows fields.
     * </p>
     */
    private java.util.List<FieldSortOptions> heatMapRowSort;
    /**
     * <p>
     * The column sort configuration for heat map for columns that aren't a part of a field well.
     * </p>
     */
    private java.util.List<FieldSortOptions> heatMapColumnSort;
    /**
     * <p>
     * The limit on the number of rows that are displayed in a heat map.
     * </p>
     */
    private ItemsLimitConfiguration heatMapRowItemsLimitConfiguration;
    /**
     * <p>
     * The limit on the number of columns that are displayed in a heat map.
     * </p>
     */
    private ItemsLimitConfiguration heatMapColumnItemsLimitConfiguration;

    /**
     * <p>
     * The field sort configuration of the rows fields.
     * </p>
     * 
     * @return The field sort configuration of the rows fields.
     */

    public java.util.List<FieldSortOptions> getHeatMapRowSort() {
        return heatMapRowSort;
    }

    /**
     * <p>
     * The field sort configuration of the rows fields.
     * </p>
     * 
     * @param heatMapRowSort
     *        The field sort configuration of the rows fields.
     */

    public void setHeatMapRowSort(java.util.Collection<FieldSortOptions> heatMapRowSort) {
        if (heatMapRowSort == null) {
            this.heatMapRowSort = null;
            return;
        }

        this.heatMapRowSort = new java.util.ArrayList<FieldSortOptions>(heatMapRowSort);
    }

    /**
     * <p>
     * The field sort configuration of the rows fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeatMapRowSort(java.util.Collection)} or {@link #withHeatMapRowSort(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param heatMapRowSort
     *        The field sort configuration of the rows fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapSortConfiguration withHeatMapRowSort(FieldSortOptions... heatMapRowSort) {
        if (this.heatMapRowSort == null) {
            setHeatMapRowSort(new java.util.ArrayList<FieldSortOptions>(heatMapRowSort.length));
        }
        for (FieldSortOptions ele : heatMapRowSort) {
            this.heatMapRowSort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field sort configuration of the rows fields.
     * </p>
     * 
     * @param heatMapRowSort
     *        The field sort configuration of the rows fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapSortConfiguration withHeatMapRowSort(java.util.Collection<FieldSortOptions> heatMapRowSort) {
        setHeatMapRowSort(heatMapRowSort);
        return this;
    }

    /**
     * <p>
     * The column sort configuration for heat map for columns that aren't a part of a field well.
     * </p>
     * 
     * @return The column sort configuration for heat map for columns that aren't a part of a field well.
     */

    public java.util.List<FieldSortOptions> getHeatMapColumnSort() {
        return heatMapColumnSort;
    }

    /**
     * <p>
     * The column sort configuration for heat map for columns that aren't a part of a field well.
     * </p>
     * 
     * @param heatMapColumnSort
     *        The column sort configuration for heat map for columns that aren't a part of a field well.
     */

    public void setHeatMapColumnSort(java.util.Collection<FieldSortOptions> heatMapColumnSort) {
        if (heatMapColumnSort == null) {
            this.heatMapColumnSort = null;
            return;
        }

        this.heatMapColumnSort = new java.util.ArrayList<FieldSortOptions>(heatMapColumnSort);
    }

    /**
     * <p>
     * The column sort configuration for heat map for columns that aren't a part of a field well.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeatMapColumnSort(java.util.Collection)} or {@link #withHeatMapColumnSort(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param heatMapColumnSort
     *        The column sort configuration for heat map for columns that aren't a part of a field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapSortConfiguration withHeatMapColumnSort(FieldSortOptions... heatMapColumnSort) {
        if (this.heatMapColumnSort == null) {
            setHeatMapColumnSort(new java.util.ArrayList<FieldSortOptions>(heatMapColumnSort.length));
        }
        for (FieldSortOptions ele : heatMapColumnSort) {
            this.heatMapColumnSort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column sort configuration for heat map for columns that aren't a part of a field well.
     * </p>
     * 
     * @param heatMapColumnSort
     *        The column sort configuration for heat map for columns that aren't a part of a field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapSortConfiguration withHeatMapColumnSort(java.util.Collection<FieldSortOptions> heatMapColumnSort) {
        setHeatMapColumnSort(heatMapColumnSort);
        return this;
    }

    /**
     * <p>
     * The limit on the number of rows that are displayed in a heat map.
     * </p>
     * 
     * @param heatMapRowItemsLimitConfiguration
     *        The limit on the number of rows that are displayed in a heat map.
     */

    public void setHeatMapRowItemsLimitConfiguration(ItemsLimitConfiguration heatMapRowItemsLimitConfiguration) {
        this.heatMapRowItemsLimitConfiguration = heatMapRowItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of rows that are displayed in a heat map.
     * </p>
     * 
     * @return The limit on the number of rows that are displayed in a heat map.
     */

    public ItemsLimitConfiguration getHeatMapRowItemsLimitConfiguration() {
        return this.heatMapRowItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of rows that are displayed in a heat map.
     * </p>
     * 
     * @param heatMapRowItemsLimitConfiguration
     *        The limit on the number of rows that are displayed in a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapSortConfiguration withHeatMapRowItemsLimitConfiguration(ItemsLimitConfiguration heatMapRowItemsLimitConfiguration) {
        setHeatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration);
        return this;
    }

    /**
     * <p>
     * The limit on the number of columns that are displayed in a heat map.
     * </p>
     * 
     * @param heatMapColumnItemsLimitConfiguration
     *        The limit on the number of columns that are displayed in a heat map.
     */

    public void setHeatMapColumnItemsLimitConfiguration(ItemsLimitConfiguration heatMapColumnItemsLimitConfiguration) {
        this.heatMapColumnItemsLimitConfiguration = heatMapColumnItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of columns that are displayed in a heat map.
     * </p>
     * 
     * @return The limit on the number of columns that are displayed in a heat map.
     */

    public ItemsLimitConfiguration getHeatMapColumnItemsLimitConfiguration() {
        return this.heatMapColumnItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of columns that are displayed in a heat map.
     * </p>
     * 
     * @param heatMapColumnItemsLimitConfiguration
     *        The limit on the number of columns that are displayed in a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapSortConfiguration withHeatMapColumnItemsLimitConfiguration(ItemsLimitConfiguration heatMapColumnItemsLimitConfiguration) {
        setHeatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration);
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
        if (getHeatMapRowSort() != null)
            sb.append("HeatMapRowSort: ").append(getHeatMapRowSort()).append(",");
        if (getHeatMapColumnSort() != null)
            sb.append("HeatMapColumnSort: ").append(getHeatMapColumnSort()).append(",");
        if (getHeatMapRowItemsLimitConfiguration() != null)
            sb.append("HeatMapRowItemsLimitConfiguration: ").append(getHeatMapRowItemsLimitConfiguration()).append(",");
        if (getHeatMapColumnItemsLimitConfiguration() != null)
            sb.append("HeatMapColumnItemsLimitConfiguration: ").append(getHeatMapColumnItemsLimitConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeatMapSortConfiguration == false)
            return false;
        HeatMapSortConfiguration other = (HeatMapSortConfiguration) obj;
        if (other.getHeatMapRowSort() == null ^ this.getHeatMapRowSort() == null)
            return false;
        if (other.getHeatMapRowSort() != null && other.getHeatMapRowSort().equals(this.getHeatMapRowSort()) == false)
            return false;
        if (other.getHeatMapColumnSort() == null ^ this.getHeatMapColumnSort() == null)
            return false;
        if (other.getHeatMapColumnSort() != null && other.getHeatMapColumnSort().equals(this.getHeatMapColumnSort()) == false)
            return false;
        if (other.getHeatMapRowItemsLimitConfiguration() == null ^ this.getHeatMapRowItemsLimitConfiguration() == null)
            return false;
        if (other.getHeatMapRowItemsLimitConfiguration() != null
                && other.getHeatMapRowItemsLimitConfiguration().equals(this.getHeatMapRowItemsLimitConfiguration()) == false)
            return false;
        if (other.getHeatMapColumnItemsLimitConfiguration() == null ^ this.getHeatMapColumnItemsLimitConfiguration() == null)
            return false;
        if (other.getHeatMapColumnItemsLimitConfiguration() != null
                && other.getHeatMapColumnItemsLimitConfiguration().equals(this.getHeatMapColumnItemsLimitConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeatMapRowSort() == null) ? 0 : getHeatMapRowSort().hashCode());
        hashCode = prime * hashCode + ((getHeatMapColumnSort() == null) ? 0 : getHeatMapColumnSort().hashCode());
        hashCode = prime * hashCode + ((getHeatMapRowItemsLimitConfiguration() == null) ? 0 : getHeatMapRowItemsLimitConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHeatMapColumnItemsLimitConfiguration() == null) ? 0 : getHeatMapColumnItemsLimitConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public HeatMapSortConfiguration clone() {
        try {
            return (HeatMapSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HeatMapSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
