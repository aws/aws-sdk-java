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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is provided, the Amazon Web Services account ID is
     * used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A regular expression pattern. If present, only those tables whose names match the pattern are returned.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The transaction ID at which to read the table contents.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used.
     * Cannot be specified along with <code>TransactionId</code>.
     * </p>
     */
    private java.util.Date queryAsOfTime;

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is provided, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the tables reside. If none is provided, the Amazon Web Services account
     *        ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is provided, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the tables reside. If none is provided, the Amazon Web Services account
     *         ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is provided, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the tables reside. If none is provided, the Amazon Web Services account
     *        ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTablesRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param databaseName
     *        The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @return The database in the catalog whose tables to list. For Hive compatibility, this name is entirely
     *         lowercase.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param databaseName
     *        The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTablesRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A regular expression pattern. If present, only those tables whose names match the pattern are returned.
     * </p>
     * 
     * @param expression
     *        A regular expression pattern. If present, only those tables whose names match the pattern are returned.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A regular expression pattern. If present, only those tables whose names match the pattern are returned.
     * </p>
     * 
     * @return A regular expression pattern. If present, only those tables whose names match the pattern are returned.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * A regular expression pattern. If present, only those tables whose names match the pattern are returned.
     * </p>
     * 
     * @param expression
     *        A regular expression pattern. If present, only those tables whose names match the pattern are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTablesRequest withExpression(String expression) {
        setExpression(expression);
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

    public GetTablesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tables to return in a single response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * 
     * @return The maximum number of tables to return in a single response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tables to return in a single response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTablesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The transaction ID at which to read the table contents.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID at which to read the table contents.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction ID at which to read the table contents.
     * </p>
     * 
     * @return The transaction ID at which to read the table contents.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The transaction ID at which to read the table contents.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID at which to read the table contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTablesRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used.
     * Cannot be specified along with <code>TransactionId</code>.
     * </p>
     * 
     * @param queryAsOfTime
     *        The time as of when to read the table contents. If not set, the most recent transaction commit time will
     *        be used. Cannot be specified along with <code>TransactionId</code>.
     */

    public void setQueryAsOfTime(java.util.Date queryAsOfTime) {
        this.queryAsOfTime = queryAsOfTime;
    }

    /**
     * <p>
     * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used.
     * Cannot be specified along with <code>TransactionId</code>.
     * </p>
     * 
     * @return The time as of when to read the table contents. If not set, the most recent transaction commit time will
     *         be used. Cannot be specified along with <code>TransactionId</code>.
     */

    public java.util.Date getQueryAsOfTime() {
        return this.queryAsOfTime;
    }

    /**
     * <p>
     * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used.
     * Cannot be specified along with <code>TransactionId</code>.
     * </p>
     * 
     * @param queryAsOfTime
     *        The time as of when to read the table contents. If not set, the most recent transaction commit time will
     *        be used. Cannot be specified along with <code>TransactionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTablesRequest withQueryAsOfTime(java.util.Date queryAsOfTime) {
        setQueryAsOfTime(queryAsOfTime);
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getQueryAsOfTime() != null)
            sb.append("QueryAsOfTime: ").append(getQueryAsOfTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTablesRequest == false)
            return false;
        GetTablesRequest other = (GetTablesRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getQueryAsOfTime() == null ^ this.getQueryAsOfTime() == null)
            return false;
        if (other.getQueryAsOfTime() != null && other.getQueryAsOfTime().equals(this.getQueryAsOfTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getQueryAsOfTime() == null) ? 0 : getQueryAsOfTime().hashCode());
        return hashCode;
    }

    @Override
    public GetTablesRequest clone() {
        return (GetTablesRequest) super.clone();
    }

}
