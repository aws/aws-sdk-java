/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitionIndexes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPartitionIndexesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog ID where the table resides.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * Specifies the name of a database from which you want to retrieve partition indexes.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Specifies the name of a table for which you want to retrieve the partition indexes.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The catalog ID where the table resides.
     * </p>
     * 
     * @param catalogId
     *        The catalog ID where the table resides.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The catalog ID where the table resides.
     * </p>
     * 
     * @return The catalog ID where the table resides.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The catalog ID where the table resides.
     * </p>
     * 
     * @param catalogId
     *        The catalog ID where the table resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionIndexesRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * Specifies the name of a database from which you want to retrieve partition indexes.
     * </p>
     * 
     * @param databaseName
     *        Specifies the name of a database from which you want to retrieve partition indexes.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Specifies the name of a database from which you want to retrieve partition indexes.
     * </p>
     * 
     * @return Specifies the name of a database from which you want to retrieve partition indexes.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Specifies the name of a database from which you want to retrieve partition indexes.
     * </p>
     * 
     * @param databaseName
     *        Specifies the name of a database from which you want to retrieve partition indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionIndexesRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Specifies the name of a table for which you want to retrieve the partition indexes.
     * </p>
     * 
     * @param tableName
     *        Specifies the name of a table for which you want to retrieve the partition indexes.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Specifies the name of a table for which you want to retrieve the partition indexes.
     * </p>
     * 
     * @return Specifies the name of a table for which you want to retrieve the partition indexes.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Specifies the name of a table for which you want to retrieve the partition indexes.
     * </p>
     * 
     * @param tableName
     *        Specifies the name of a table for which you want to retrieve the partition indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionIndexesRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, included if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, included if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, included if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionIndexesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPartitionIndexesRequest == false)
            return false;
        GetPartitionIndexesRequest other = (GetPartitionIndexesRequest) obj;
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
        return hashCode;
    }

    @Override
    public GetPartitionIndexesRequest clone() {
        return (GetPartitionIndexesRequest) super.clone();
    }

}
