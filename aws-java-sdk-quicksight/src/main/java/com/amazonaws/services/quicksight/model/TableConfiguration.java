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
 * The configuration for a <code>TableVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private TableFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration for a <code>TableVisual</code>.
     * </p>
     */
    private TableSortConfiguration sortConfiguration;
    /**
     * <p>
     * The table options for a table visual.
     * </p>
     */
    private TableOptions tableOptions;
    /**
     * <p>
     * The total options for a table visual.
     * </p>
     */
    private TotalOptions totalOptions;
    /**
     * <p>
     * The field options for a table visual.
     * </p>
     */
    private TableFieldOptions fieldOptions;
    /**
     * <p>
     * The paginated report options for a table visual.
     * </p>
     */
    private TablePaginatedReportOptions paginatedReportOptions;

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     */

    public void setFieldWells(TableFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public TableFieldWells getFieldWells() {
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

    public TableConfiguration withFieldWells(TableFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration for a <code>TableVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration for a <code>TableVisual</code>.
     */

    public void setSortConfiguration(TableSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration for a <code>TableVisual</code>.
     * </p>
     * 
     * @return The sort configuration for a <code>TableVisual</code>.
     */

    public TableSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration for a <code>TableVisual</code>.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration for a <code>TableVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableConfiguration withSortConfiguration(TableSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The table options for a table visual.
     * </p>
     * 
     * @param tableOptions
     *        The table options for a table visual.
     */

    public void setTableOptions(TableOptions tableOptions) {
        this.tableOptions = tableOptions;
    }

    /**
     * <p>
     * The table options for a table visual.
     * </p>
     * 
     * @return The table options for a table visual.
     */

    public TableOptions getTableOptions() {
        return this.tableOptions;
    }

    /**
     * <p>
     * The table options for a table visual.
     * </p>
     * 
     * @param tableOptions
     *        The table options for a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableConfiguration withTableOptions(TableOptions tableOptions) {
        setTableOptions(tableOptions);
        return this;
    }

    /**
     * <p>
     * The total options for a table visual.
     * </p>
     * 
     * @param totalOptions
     *        The total options for a table visual.
     */

    public void setTotalOptions(TotalOptions totalOptions) {
        this.totalOptions = totalOptions;
    }

    /**
     * <p>
     * The total options for a table visual.
     * </p>
     * 
     * @return The total options for a table visual.
     */

    public TotalOptions getTotalOptions() {
        return this.totalOptions;
    }

    /**
     * <p>
     * The total options for a table visual.
     * </p>
     * 
     * @param totalOptions
     *        The total options for a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableConfiguration withTotalOptions(TotalOptions totalOptions) {
        setTotalOptions(totalOptions);
        return this;
    }

    /**
     * <p>
     * The field options for a table visual.
     * </p>
     * 
     * @param fieldOptions
     *        The field options for a table visual.
     */

    public void setFieldOptions(TableFieldOptions fieldOptions) {
        this.fieldOptions = fieldOptions;
    }

    /**
     * <p>
     * The field options for a table visual.
     * </p>
     * 
     * @return The field options for a table visual.
     */

    public TableFieldOptions getFieldOptions() {
        return this.fieldOptions;
    }

    /**
     * <p>
     * The field options for a table visual.
     * </p>
     * 
     * @param fieldOptions
     *        The field options for a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableConfiguration withFieldOptions(TableFieldOptions fieldOptions) {
        setFieldOptions(fieldOptions);
        return this;
    }

    /**
     * <p>
     * The paginated report options for a table visual.
     * </p>
     * 
     * @param paginatedReportOptions
     *        The paginated report options for a table visual.
     */

    public void setPaginatedReportOptions(TablePaginatedReportOptions paginatedReportOptions) {
        this.paginatedReportOptions = paginatedReportOptions;
    }

    /**
     * <p>
     * The paginated report options for a table visual.
     * </p>
     * 
     * @return The paginated report options for a table visual.
     */

    public TablePaginatedReportOptions getPaginatedReportOptions() {
        return this.paginatedReportOptions;
    }

    /**
     * <p>
     * The paginated report options for a table visual.
     * </p>
     * 
     * @param paginatedReportOptions
     *        The paginated report options for a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableConfiguration withPaginatedReportOptions(TablePaginatedReportOptions paginatedReportOptions) {
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

        if (obj instanceof TableConfiguration == false)
            return false;
        TableConfiguration other = (TableConfiguration) obj;
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
    public TableConfiguration clone() {
        try {
            return (TableConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
