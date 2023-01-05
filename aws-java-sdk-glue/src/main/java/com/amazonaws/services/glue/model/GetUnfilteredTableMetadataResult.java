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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUnfilteredTableMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUnfilteredTableMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Table table;

    private java.util.List<String> authorizedColumns;

    private Boolean isRegisteredWithLakeFormation;

    private java.util.List<ColumnRowFilter> cellFilters;

    /**
     * @param table
     */

    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * @return
     */

    public Table getTable() {
        return this.table;
    }

    /**
     * @param table
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredTableMetadataResult withTable(Table table) {
        setTable(table);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getAuthorizedColumns() {
        return authorizedColumns;
    }

    /**
     * @param authorizedColumns
     */

    public void setAuthorizedColumns(java.util.Collection<String> authorizedColumns) {
        if (authorizedColumns == null) {
            this.authorizedColumns = null;
            return;
        }

        this.authorizedColumns = new java.util.ArrayList<String>(authorizedColumns);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedColumns(java.util.Collection)} or {@link #withAuthorizedColumns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param authorizedColumns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredTableMetadataResult withAuthorizedColumns(String... authorizedColumns) {
        if (this.authorizedColumns == null) {
            setAuthorizedColumns(new java.util.ArrayList<String>(authorizedColumns.length));
        }
        for (String ele : authorizedColumns) {
            this.authorizedColumns.add(ele);
        }
        return this;
    }

    /**
     * @param authorizedColumns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredTableMetadataResult withAuthorizedColumns(java.util.Collection<String> authorizedColumns) {
        setAuthorizedColumns(authorizedColumns);
        return this;
    }

    /**
     * @param isRegisteredWithLakeFormation
     */

    public void setIsRegisteredWithLakeFormation(Boolean isRegisteredWithLakeFormation) {
        this.isRegisteredWithLakeFormation = isRegisteredWithLakeFormation;
    }

    /**
     * @return
     */

    public Boolean getIsRegisteredWithLakeFormation() {
        return this.isRegisteredWithLakeFormation;
    }

    /**
     * @param isRegisteredWithLakeFormation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredTableMetadataResult withIsRegisteredWithLakeFormation(Boolean isRegisteredWithLakeFormation) {
        setIsRegisteredWithLakeFormation(isRegisteredWithLakeFormation);
        return this;
    }

    /**
     * @return
     */

    public Boolean isRegisteredWithLakeFormation() {
        return this.isRegisteredWithLakeFormation;
    }

    /**
     * @return
     */

    public java.util.List<ColumnRowFilter> getCellFilters() {
        return cellFilters;
    }

    /**
     * @param cellFilters
     */

    public void setCellFilters(java.util.Collection<ColumnRowFilter> cellFilters) {
        if (cellFilters == null) {
            this.cellFilters = null;
            return;
        }

        this.cellFilters = new java.util.ArrayList<ColumnRowFilter>(cellFilters);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCellFilters(java.util.Collection)} or {@link #withCellFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cellFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredTableMetadataResult withCellFilters(ColumnRowFilter... cellFilters) {
        if (this.cellFilters == null) {
            setCellFilters(new java.util.ArrayList<ColumnRowFilter>(cellFilters.length));
        }
        for (ColumnRowFilter ele : cellFilters) {
            this.cellFilters.add(ele);
        }
        return this;
    }

    /**
     * @param cellFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredTableMetadataResult withCellFilters(java.util.Collection<ColumnRowFilter> cellFilters) {
        setCellFilters(cellFilters);
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
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getAuthorizedColumns() != null)
            sb.append("AuthorizedColumns: ").append(getAuthorizedColumns()).append(",");
        if (getIsRegisteredWithLakeFormation() != null)
            sb.append("IsRegisteredWithLakeFormation: ").append(getIsRegisteredWithLakeFormation()).append(",");
        if (getCellFilters() != null)
            sb.append("CellFilters: ").append(getCellFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUnfilteredTableMetadataResult == false)
            return false;
        GetUnfilteredTableMetadataResult other = (GetUnfilteredTableMetadataResult) obj;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getAuthorizedColumns() == null ^ this.getAuthorizedColumns() == null)
            return false;
        if (other.getAuthorizedColumns() != null && other.getAuthorizedColumns().equals(this.getAuthorizedColumns()) == false)
            return false;
        if (other.getIsRegisteredWithLakeFormation() == null ^ this.getIsRegisteredWithLakeFormation() == null)
            return false;
        if (other.getIsRegisteredWithLakeFormation() != null
                && other.getIsRegisteredWithLakeFormation().equals(this.getIsRegisteredWithLakeFormation()) == false)
            return false;
        if (other.getCellFilters() == null ^ this.getCellFilters() == null)
            return false;
        if (other.getCellFilters() != null && other.getCellFilters().equals(this.getCellFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedColumns() == null) ? 0 : getAuthorizedColumns().hashCode());
        hashCode = prime * hashCode + ((getIsRegisteredWithLakeFormation() == null) ? 0 : getIsRegisteredWithLakeFormation().hashCode());
        hashCode = prime * hashCode + ((getCellFilters() == null) ? 0 : getCellFilters().hashCode());
        return hashCode;
    }

    @Override
    public GetUnfilteredTableMetadataResult clone() {
        try {
            return (GetUnfilteredTableMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
