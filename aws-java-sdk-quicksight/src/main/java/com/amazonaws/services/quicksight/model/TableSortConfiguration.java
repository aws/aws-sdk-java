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
 * The sort configuration for a <code>TableVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableSortConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field sort options for rows in the table.
     * </p>
     */
    private java.util.List<FieldSortOptions> rowSort;
    /**
     * <p>
     * The pagination configuration (page size, page number) for the table.
     * </p>
     */
    private PaginationConfiguration paginationConfiguration;

    /**
     * <p>
     * The field sort options for rows in the table.
     * </p>
     * 
     * @return The field sort options for rows in the table.
     */

    public java.util.List<FieldSortOptions> getRowSort() {
        return rowSort;
    }

    /**
     * <p>
     * The field sort options for rows in the table.
     * </p>
     * 
     * @param rowSort
     *        The field sort options for rows in the table.
     */

    public void setRowSort(java.util.Collection<FieldSortOptions> rowSort) {
        if (rowSort == null) {
            this.rowSort = null;
            return;
        }

        this.rowSort = new java.util.ArrayList<FieldSortOptions>(rowSort);
    }

    /**
     * <p>
     * The field sort options for rows in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRowSort(java.util.Collection)} or {@link #withRowSort(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param rowSort
     *        The field sort options for rows in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSortConfiguration withRowSort(FieldSortOptions... rowSort) {
        if (this.rowSort == null) {
            setRowSort(new java.util.ArrayList<FieldSortOptions>(rowSort.length));
        }
        for (FieldSortOptions ele : rowSort) {
            this.rowSort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field sort options for rows in the table.
     * </p>
     * 
     * @param rowSort
     *        The field sort options for rows in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSortConfiguration withRowSort(java.util.Collection<FieldSortOptions> rowSort) {
        setRowSort(rowSort);
        return this;
    }

    /**
     * <p>
     * The pagination configuration (page size, page number) for the table.
     * </p>
     * 
     * @param paginationConfiguration
     *        The pagination configuration (page size, page number) for the table.
     */

    public void setPaginationConfiguration(PaginationConfiguration paginationConfiguration) {
        this.paginationConfiguration = paginationConfiguration;
    }

    /**
     * <p>
     * The pagination configuration (page size, page number) for the table.
     * </p>
     * 
     * @return The pagination configuration (page size, page number) for the table.
     */

    public PaginationConfiguration getPaginationConfiguration() {
        return this.paginationConfiguration;
    }

    /**
     * <p>
     * The pagination configuration (page size, page number) for the table.
     * </p>
     * 
     * @param paginationConfiguration
     *        The pagination configuration (page size, page number) for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSortConfiguration withPaginationConfiguration(PaginationConfiguration paginationConfiguration) {
        setPaginationConfiguration(paginationConfiguration);
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
        if (getRowSort() != null)
            sb.append("RowSort: ").append(getRowSort()).append(",");
        if (getPaginationConfiguration() != null)
            sb.append("PaginationConfiguration: ").append(getPaginationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableSortConfiguration == false)
            return false;
        TableSortConfiguration other = (TableSortConfiguration) obj;
        if (other.getRowSort() == null ^ this.getRowSort() == null)
            return false;
        if (other.getRowSort() != null && other.getRowSort().equals(this.getRowSort()) == false)
            return false;
        if (other.getPaginationConfiguration() == null ^ this.getPaginationConfiguration() == null)
            return false;
        if (other.getPaginationConfiguration() != null && other.getPaginationConfiguration().equals(this.getPaginationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowSort() == null) ? 0 : getRowSort().hashCode());
        hashCode = prime * hashCode + ((getPaginationConfiguration() == null) ? 0 : getPaginationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TableSortConfiguration clone() {
        try {
            return (TableSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
