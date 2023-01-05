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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTableObjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableObjectsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog containing the governed table. Defaults to the caller’s account.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The database containing the governed table.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The governed table for which to retrieve objects.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The transaction ID at which to read the governed table contents. If this transaction has aborted, an error is
     * returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     * <code>QueryAsOfTime</code>.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * The time as of when to read the governed table contents. If not set, the most recent transaction commit time is
     * used. Cannot be specified along with <code>TransactionId</code>.
     * </p>
     */
    private java.util.Date queryAsOfTime;
    /**
     * <p>
     * A predicate to filter the objects returned based on the partition keys defined in the governed table.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The comparison operators supported are: =, &gt;, &lt;, &gt;=, &lt;=
     * </p>
     * </li>
     * <li>
     * <p>
     * The logical operators supported are: AND
     * </p>
     * </li>
     * <li>
     * <p>
     * The data types supported are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or yyyy-MM-dd
     * HH:mm:ss"), string and decimal.
     * </p>
     * </li>
     * </ul>
     */
    private String partitionPredicate;
    /**
     * <p>
     * Specifies how many values to return in a page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A continuation token if this is not the first call to retrieve these objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The catalog containing the governed table. Defaults to the caller’s account.
     * </p>
     * 
     * @param catalogId
     *        The catalog containing the governed table. Defaults to the caller’s account.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The catalog containing the governed table. Defaults to the caller’s account.
     * </p>
     * 
     * @return The catalog containing the governed table. Defaults to the caller’s account.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The catalog containing the governed table. Defaults to the caller’s account.
     * </p>
     * 
     * @param catalogId
     *        The catalog containing the governed table. Defaults to the caller’s account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableObjectsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The database containing the governed table.
     * </p>
     * 
     * @param databaseName
     *        The database containing the governed table.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database containing the governed table.
     * </p>
     * 
     * @return The database containing the governed table.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database containing the governed table.
     * </p>
     * 
     * @param databaseName
     *        The database containing the governed table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableObjectsRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The governed table for which to retrieve objects.
     * </p>
     * 
     * @param tableName
     *        The governed table for which to retrieve objects.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The governed table for which to retrieve objects.
     * </p>
     * 
     * @return The governed table for which to retrieve objects.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The governed table for which to retrieve objects.
     * </p>
     * 
     * @param tableName
     *        The governed table for which to retrieve objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableObjectsRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The transaction ID at which to read the governed table contents. If this transaction has aborted, an error is
     * returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     * <code>QueryAsOfTime</code>.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID at which to read the governed table contents. If this transaction has aborted, an error
     *        is returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     *        <code>QueryAsOfTime</code>.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction ID at which to read the governed table contents. If this transaction has aborted, an error is
     * returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     * <code>QueryAsOfTime</code>.
     * </p>
     * 
     * @return The transaction ID at which to read the governed table contents. If this transaction has aborted, an
     *         error is returned. If not set, defaults to the most recent committed transaction. Cannot be specified
     *         along with <code>QueryAsOfTime</code>.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The transaction ID at which to read the governed table contents. If this transaction has aborted, an error is
     * returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     * <code>QueryAsOfTime</code>.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID at which to read the governed table contents. If this transaction has aborted, an error
     *        is returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     *        <code>QueryAsOfTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableObjectsRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * The time as of when to read the governed table contents. If not set, the most recent transaction commit time is
     * used. Cannot be specified along with <code>TransactionId</code>.
     * </p>
     * 
     * @param queryAsOfTime
     *        The time as of when to read the governed table contents. If not set, the most recent transaction commit
     *        time is used. Cannot be specified along with <code>TransactionId</code>.
     */

    public void setQueryAsOfTime(java.util.Date queryAsOfTime) {
        this.queryAsOfTime = queryAsOfTime;
    }

    /**
     * <p>
     * The time as of when to read the governed table contents. If not set, the most recent transaction commit time is
     * used. Cannot be specified along with <code>TransactionId</code>.
     * </p>
     * 
     * @return The time as of when to read the governed table contents. If not set, the most recent transaction commit
     *         time is used. Cannot be specified along with <code>TransactionId</code>.
     */

    public java.util.Date getQueryAsOfTime() {
        return this.queryAsOfTime;
    }

    /**
     * <p>
     * The time as of when to read the governed table contents. If not set, the most recent transaction commit time is
     * used. Cannot be specified along with <code>TransactionId</code>.
     * </p>
     * 
     * @param queryAsOfTime
     *        The time as of when to read the governed table contents. If not set, the most recent transaction commit
     *        time is used. Cannot be specified along with <code>TransactionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableObjectsRequest withQueryAsOfTime(java.util.Date queryAsOfTime) {
        setQueryAsOfTime(queryAsOfTime);
        return this;
    }

    /**
     * <p>
     * A predicate to filter the objects returned based on the partition keys defined in the governed table.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The comparison operators supported are: =, &gt;, &lt;, &gt;=, &lt;=
     * </p>
     * </li>
     * <li>
     * <p>
     * The logical operators supported are: AND
     * </p>
     * </li>
     * <li>
     * <p>
     * The data types supported are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or yyyy-MM-dd
     * HH:mm:ss"), string and decimal.
     * </p>
     * </li>
     * </ul>
     * 
     * @param partitionPredicate
     *        A predicate to filter the objects returned based on the partition keys defined in the governed table.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The comparison operators supported are: =, &gt;, &lt;, &gt;=, &lt;=
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The logical operators supported are: AND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The data types supported are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or
     *        yyyy-MM-dd HH:mm:ss"), string and decimal.
     *        </p>
     *        </li>
     */

    public void setPartitionPredicate(String partitionPredicate) {
        this.partitionPredicate = partitionPredicate;
    }

    /**
     * <p>
     * A predicate to filter the objects returned based on the partition keys defined in the governed table.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The comparison operators supported are: =, &gt;, &lt;, &gt;=, &lt;=
     * </p>
     * </li>
     * <li>
     * <p>
     * The logical operators supported are: AND
     * </p>
     * </li>
     * <li>
     * <p>
     * The data types supported are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or yyyy-MM-dd
     * HH:mm:ss"), string and decimal.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A predicate to filter the objects returned based on the partition keys defined in the governed table.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The comparison operators supported are: =, &gt;, &lt;, &gt;=, &lt;=
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The logical operators supported are: AND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The data types supported are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or
     *         yyyy-MM-dd HH:mm:ss"), string and decimal.
     *         </p>
     *         </li>
     */

    public String getPartitionPredicate() {
        return this.partitionPredicate;
    }

    /**
     * <p>
     * A predicate to filter the objects returned based on the partition keys defined in the governed table.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The comparison operators supported are: =, &gt;, &lt;, &gt;=, &lt;=
     * </p>
     * </li>
     * <li>
     * <p>
     * The logical operators supported are: AND
     * </p>
     * </li>
     * <li>
     * <p>
     * The data types supported are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or yyyy-MM-dd
     * HH:mm:ss"), string and decimal.
     * </p>
     * </li>
     * </ul>
     * 
     * @param partitionPredicate
     *        A predicate to filter the objects returned based on the partition keys defined in the governed table.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The comparison operators supported are: =, &gt;, &lt;, &gt;=, &lt;=
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The logical operators supported are: AND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The data types supported are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or
     *        yyyy-MM-dd HH:mm:ss"), string and decimal.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableObjectsRequest withPartitionPredicate(String partitionPredicate) {
        setPartitionPredicate(partitionPredicate);
        return this;
    }

    /**
     * <p>
     * Specifies how many values to return in a page.
     * </p>
     * 
     * @param maxResults
     *        Specifies how many values to return in a page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies how many values to return in a page.
     * </p>
     * 
     * @return Specifies how many values to return in a page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies how many values to return in a page.
     * </p>
     * 
     * @param maxResults
     *        Specifies how many values to return in a page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableObjectsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A continuation token if this is not the first call to retrieve these objects.
     * </p>
     * 
     * @param nextToken
     *        A continuation token if this is not the first call to retrieve these objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token if this is not the first call to retrieve these objects.
     * </p>
     * 
     * @return A continuation token if this is not the first call to retrieve these objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token if this is not the first call to retrieve these objects.
     * </p>
     * 
     * @param nextToken
     *        A continuation token if this is not the first call to retrieve these objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableObjectsRequest withNextToken(String nextToken) {
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
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getQueryAsOfTime() != null)
            sb.append("QueryAsOfTime: ").append(getQueryAsOfTime()).append(",");
        if (getPartitionPredicate() != null)
            sb.append("PartitionPredicate: ").append(getPartitionPredicate()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetTableObjectsRequest == false)
            return false;
        GetTableObjectsRequest other = (GetTableObjectsRequest) obj;
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
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getQueryAsOfTime() == null ^ this.getQueryAsOfTime() == null)
            return false;
        if (other.getQueryAsOfTime() != null && other.getQueryAsOfTime().equals(this.getQueryAsOfTime()) == false)
            return false;
        if (other.getPartitionPredicate() == null ^ this.getPartitionPredicate() == null)
            return false;
        if (other.getPartitionPredicate() != null && other.getPartitionPredicate().equals(this.getPartitionPredicate()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getQueryAsOfTime() == null) ? 0 : getQueryAsOfTime().hashCode());
        hashCode = prime * hashCode + ((getPartitionPredicate() == null) ? 0 : getPartitionPredicate().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTableObjectsRequest clone() {
        return (GetTableObjectsRequest) super.clone();
    }

}
