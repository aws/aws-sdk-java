/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListTableOptimizerRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTableOptimizerRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the database in the catalog in which the table resides.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A continuation token for paginating the returned list of optimizer runs, returned if the current segment of the
     * list is not the last.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of the optimizer runs associated with a table.
     * </p>
     */
    private java.util.List<TableOptimizerRun> tableOptimizerRuns;

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @param catalogId
     *        The Catalog ID of the table.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @return The Catalog ID of the table.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @param catalogId
     *        The Catalog ID of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableOptimizerRunsResult withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the database in the catalog in which the table resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the database in the catalog in which the table resides.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database in the catalog in which the table resides.
     * </p>
     * 
     * @return The name of the database in the catalog in which the table resides.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database in the catalog in which the table resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the database in the catalog in which the table resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableOptimizerRunsResult withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableOptimizerRunsResult withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of optimizer runs, returned if the current segment of the
     * list is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of optimizer runs, returned if the current segment
     *        of the list is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of optimizer runs, returned if the current segment of the
     * list is not the last.
     * </p>
     * 
     * @return A continuation token for paginating the returned list of optimizer runs, returned if the current segment
     *         of the list is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of optimizer runs, returned if the current segment of the
     * list is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of optimizer runs, returned if the current segment
     *        of the list is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableOptimizerRunsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of the optimizer runs associated with a table.
     * </p>
     * 
     * @return A list of the optimizer runs associated with a table.
     */

    public java.util.List<TableOptimizerRun> getTableOptimizerRuns() {
        return tableOptimizerRuns;
    }

    /**
     * <p>
     * A list of the optimizer runs associated with a table.
     * </p>
     * 
     * @param tableOptimizerRuns
     *        A list of the optimizer runs associated with a table.
     */

    public void setTableOptimizerRuns(java.util.Collection<TableOptimizerRun> tableOptimizerRuns) {
        if (tableOptimizerRuns == null) {
            this.tableOptimizerRuns = null;
            return;
        }

        this.tableOptimizerRuns = new java.util.ArrayList<TableOptimizerRun>(tableOptimizerRuns);
    }

    /**
     * <p>
     * A list of the optimizer runs associated with a table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableOptimizerRuns(java.util.Collection)} or {@link #withTableOptimizerRuns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tableOptimizerRuns
     *        A list of the optimizer runs associated with a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableOptimizerRunsResult withTableOptimizerRuns(TableOptimizerRun... tableOptimizerRuns) {
        if (this.tableOptimizerRuns == null) {
            setTableOptimizerRuns(new java.util.ArrayList<TableOptimizerRun>(tableOptimizerRuns.length));
        }
        for (TableOptimizerRun ele : tableOptimizerRuns) {
            this.tableOptimizerRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the optimizer runs associated with a table.
     * </p>
     * 
     * @param tableOptimizerRuns
     *        A list of the optimizer runs associated with a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableOptimizerRunsResult withTableOptimizerRuns(java.util.Collection<TableOptimizerRun> tableOptimizerRuns) {
        setTableOptimizerRuns(tableOptimizerRuns);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTableOptimizerRuns() != null)
            sb.append("TableOptimizerRuns: ").append(getTableOptimizerRuns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTableOptimizerRunsResult == false)
            return false;
        ListTableOptimizerRunsResult other = (ListTableOptimizerRunsResult) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTableOptimizerRuns() == null ^ this.getTableOptimizerRuns() == null)
            return false;
        if (other.getTableOptimizerRuns() != null && other.getTableOptimizerRuns().equals(this.getTableOptimizerRuns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTableOptimizerRuns() == null) ? 0 : getTableOptimizerRuns().hashCode());
        return hashCode;
    }

    @Override
    public ListTableOptimizerRunsResult clone() {
        try {
            return (ListTableOptimizerRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
