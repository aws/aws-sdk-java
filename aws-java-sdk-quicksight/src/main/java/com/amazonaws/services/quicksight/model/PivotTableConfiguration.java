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
 * The configuration for a <code>PivotTableVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private PivotTableFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration for a <code>PivotTableVisual</code>.
     * </p>
     */
    private PivotTableSortConfiguration sortConfiguration;
    /**
     * <p>
     * The table options for a pivot table visual.
     * </p>
     */
    private PivotTableOptions tableOptions;
    /**
     * <p>
     * The total options for a pivot table visual.
     * </p>
     */
    private PivotTableTotalOptions totalOptions;
    /**
     * <p>
     * The field options for a pivot table visual.
     * </p>
     */
    private PivotTableFieldOptions fieldOptions;
    /**
     * <p>
     * The paginated report options for a pivot table visual.
     * </p>
     */
    private PivotTablePaginatedReportOptions paginatedReportOptions;

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     */

    public void setFieldWells(PivotTableFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public PivotTableFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableConfiguration withFieldWells(PivotTableFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration for a <code>PivotTableVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration for a <code>PivotTableVisual</code>.
     */

    public void setSortConfiguration(PivotTableSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration for a <code>PivotTableVisual</code>.
     * </p>
     * 
     * @return The sort configuration for a <code>PivotTableVisual</code>.
     */

    public PivotTableSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration for a <code>PivotTableVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration for a <code>PivotTableVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableConfiguration withSortConfiguration(PivotTableSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The table options for a pivot table visual.
     * </p>
     * 
     * @param tableOptions
     *        The table options for a pivot table visual.
     */

    public void setTableOptions(PivotTableOptions tableOptions) {
        this.tableOptions = tableOptions;
    }

    /**
     * <p>
     * The table options for a pivot table visual.
     * </p>
     * 
     * @return The table options for a pivot table visual.
     */

    public PivotTableOptions getTableOptions() {
        return this.tableOptions;
    }

    /**
     * <p>
     * The table options for a pivot table visual.
     * </p>
     * 
     * @param tableOptions
     *        The table options for a pivot table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableConfiguration withTableOptions(PivotTableOptions tableOptions) {
        setTableOptions(tableOptions);
        return this;
    }

    /**
     * <p>
     * The total options for a pivot table visual.
     * </p>
     * 
     * @param totalOptions
     *        The total options for a pivot table visual.
     */

    public void setTotalOptions(PivotTableTotalOptions totalOptions) {
        this.totalOptions = totalOptions;
    }

    /**
     * <p>
     * The total options for a pivot table visual.
     * </p>
     * 
     * @return The total options for a pivot table visual.
     */

    public PivotTableTotalOptions getTotalOptions() {
        return this.totalOptions;
    }

    /**
     * <p>
     * The total options for a pivot table visual.
     * </p>
     * 
     * @param totalOptions
     *        The total options for a pivot table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableConfiguration withTotalOptions(PivotTableTotalOptions totalOptions) {
        setTotalOptions(totalOptions);
        return this;
    }

    /**
     * <p>
     * The field options for a pivot table visual.
     * </p>
     * 
     * @param fieldOptions
     *        The field options for a pivot table visual.
     */

    public void setFieldOptions(PivotTableFieldOptions fieldOptions) {
        this.fieldOptions = fieldOptions;
    }

    /**
     * <p>
     * The field options for a pivot table visual.
     * </p>
     * 
     * @return The field options for a pivot table visual.
     */

    public PivotTableFieldOptions getFieldOptions() {
        return this.fieldOptions;
    }

    /**
     * <p>
     * The field options for a pivot table visual.
     * </p>
     * 
     * @param fieldOptions
     *        The field options for a pivot table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableConfiguration withFieldOptions(PivotTableFieldOptions fieldOptions) {
        setFieldOptions(fieldOptions);
        return this;
    }

    /**
     * <p>
     * The paginated report options for a pivot table visual.
     * </p>
     * 
     * @param paginatedReportOptions
     *        The paginated report options for a pivot table visual.
     */

    public void setPaginatedReportOptions(PivotTablePaginatedReportOptions paginatedReportOptions) {
        this.paginatedReportOptions = paginatedReportOptions;
    }

    /**
     * <p>
     * The paginated report options for a pivot table visual.
     * </p>
     * 
     * @return The paginated report options for a pivot table visual.
     */

    public PivotTablePaginatedReportOptions getPaginatedReportOptions() {
        return this.paginatedReportOptions;
    }

    /**
     * <p>
     * The paginated report options for a pivot table visual.
     * </p>
     * 
     * @param paginatedReportOptions
     *        The paginated report options for a pivot table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableConfiguration withPaginatedReportOptions(PivotTablePaginatedReportOptions paginatedReportOptions) {
        setPaginatedReportOptions(paginatedReportOptions);
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
        if (getFieldWells() != null)
            sb.append("FieldWells: ").append(getFieldWells()).append(",");
        if (getSortConfiguration() != null)
            sb.append("SortConfiguration: ").append(getSortConfiguration()).append(",");
        if (getTableOptions() != null)
            sb.append("TableOptions: ").append(getTableOptions()).append(",");
        if (getTotalOptions() != null)
            sb.append("TotalOptions: ").append(getTotalOptions()).append(",");
        if (getFieldOptions() != null)
            sb.append("FieldOptions: ").append(getFieldOptions()).append(",");
        if (getPaginatedReportOptions() != null)
            sb.append("PaginatedReportOptions: ").append(getPaginatedReportOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableConfiguration == false)
            return false;
        PivotTableConfiguration other = (PivotTableConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getTableOptions() == null ^ this.getTableOptions() == null)
            return false;
        if (other.getTableOptions() != null && other.getTableOptions().equals(this.getTableOptions()) == false)
            return false;
        if (other.getTotalOptions() == null ^ this.getTotalOptions() == null)
            return false;
        if (other.getTotalOptions() != null && other.getTotalOptions().equals(this.getTotalOptions()) == false)
            return false;
        if (other.getFieldOptions() == null ^ this.getFieldOptions() == null)
            return false;
        if (other.getFieldOptions() != null && other.getFieldOptions().equals(this.getFieldOptions()) == false)
            return false;
        if (other.getPaginatedReportOptions() == null ^ this.getPaginatedReportOptions() == null)
            return false;
        if (other.getPaginatedReportOptions() != null && other.getPaginatedReportOptions().equals(this.getPaginatedReportOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldWells() == null) ? 0 : getFieldWells().hashCode());
        hashCode = prime * hashCode + ((getSortConfiguration() == null) ? 0 : getSortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTableOptions() == null) ? 0 : getTableOptions().hashCode());
        hashCode = prime * hashCode + ((getTotalOptions() == null) ? 0 : getTotalOptions().hashCode());
        hashCode = prime * hashCode + ((getFieldOptions() == null) ? 0 : getFieldOptions().hashCode());
        hashCode = prime * hashCode + ((getPaginatedReportOptions() == null) ? 0 : getPaginatedReportOptions().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableConfiguration clone() {
        try {
            return (PivotTableConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
