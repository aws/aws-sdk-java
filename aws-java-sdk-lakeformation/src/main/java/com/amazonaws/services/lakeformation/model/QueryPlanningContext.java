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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about the query plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/QueryPlanningContext" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryPlanningContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Data Catalog where the partition in question resides. If none is provided, the Amazon Web Services
     * account ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The database containing the table.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used.
     * Cannot be specified along with <code>TransactionId</code>.
     * </p>
     */
    private java.util.Date queryAsOfTime;
    /**
     * <p>
     * A map consisting of key-value pairs.
     * </p>
     */
    private java.util.Map<String, String> queryParameters;
    /**
     * <p>
     * The transaction ID at which to read the table contents. If this transaction is not committed, the read will be
     * treated as part of that transaction and will see its writes. If this transaction has aborted, an error will be
     * returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     * <code>QueryAsOfTime</code>.
     * </p>
     */
    private String transactionId;

    /**
     * <p>
     * The ID of the Data Catalog where the partition in question resides. If none is provided, the Amazon Web Services
     * account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partition in question resides. If none is provided, the Amazon Web
     *        Services account ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partition in question resides. If none is provided, the Amazon Web Services
     * account ID is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the partition in question resides. If none is provided, the Amazon Web
     *         Services account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partition in question resides. If none is provided, the Amazon Web Services
     * account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partition in question resides. If none is provided, the Amazon Web
     *        Services account ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryPlanningContext withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The database containing the table.
     * </p>
     * 
     * @param databaseName
     *        The database containing the table.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database containing the table.
     * </p>
     * 
     * @return The database containing the table.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database containing the table.
     * </p>
     * 
     * @param databaseName
     *        The database containing the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryPlanningContext withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
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

    public QueryPlanningContext withQueryAsOfTime(java.util.Date queryAsOfTime) {
        setQueryAsOfTime(queryAsOfTime);
        return this;
    }

    /**
     * <p>
     * A map consisting of key-value pairs.
     * </p>
     * 
     * @return A map consisting of key-value pairs.
     */

    public java.util.Map<String, String> getQueryParameters() {
        return queryParameters;
    }

    /**
     * <p>
     * A map consisting of key-value pairs.
     * </p>
     * 
     * @param queryParameters
     *        A map consisting of key-value pairs.
     */

    public void setQueryParameters(java.util.Map<String, String> queryParameters) {
        this.queryParameters = queryParameters;
    }

    /**
     * <p>
     * A map consisting of key-value pairs.
     * </p>
     * 
     * @param queryParameters
     *        A map consisting of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryPlanningContext withQueryParameters(java.util.Map<String, String> queryParameters) {
        setQueryParameters(queryParameters);
        return this;
    }

    /**
     * Add a single QueryParameters entry
     *
     * @see QueryPlanningContext#withQueryParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public QueryPlanningContext addQueryParametersEntry(String key, String value) {
        if (null == this.queryParameters) {
            this.queryParameters = new java.util.HashMap<String, String>();
        }
        if (this.queryParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.queryParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryPlanningContext clearQueryParametersEntries() {
        this.queryParameters = null;
        return this;
    }

    /**
     * <p>
     * The transaction ID at which to read the table contents. If this transaction is not committed, the read will be
     * treated as part of that transaction and will see its writes. If this transaction has aborted, an error will be
     * returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     * <code>QueryAsOfTime</code>.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID at which to read the table contents. If this transaction is not committed, the read
     *        will be treated as part of that transaction and will see its writes. If this transaction has aborted, an
     *        error will be returned. If not set, defaults to the most recent committed transaction. Cannot be specified
     *        along with <code>QueryAsOfTime</code>.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction ID at which to read the table contents. If this transaction is not committed, the read will be
     * treated as part of that transaction and will see its writes. If this transaction has aborted, an error will be
     * returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     * <code>QueryAsOfTime</code>.
     * </p>
     * 
     * @return The transaction ID at which to read the table contents. If this transaction is not committed, the read
     *         will be treated as part of that transaction and will see its writes. If this transaction has aborted, an
     *         error will be returned. If not set, defaults to the most recent committed transaction. Cannot be
     *         specified along with <code>QueryAsOfTime</code>.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The transaction ID at which to read the table contents. If this transaction is not committed, the read will be
     * treated as part of that transaction and will see its writes. If this transaction has aborted, an error will be
     * returned. If not set, defaults to the most recent committed transaction. Cannot be specified along with
     * <code>QueryAsOfTime</code>.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID at which to read the table contents. If this transaction is not committed, the read
     *        will be treated as part of that transaction and will see its writes. If this transaction has aborted, an
     *        error will be returned. If not set, defaults to the most recent committed transaction. Cannot be specified
     *        along with <code>QueryAsOfTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryPlanningContext withTransactionId(String transactionId) {
        setTransactionId(transactionId);
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
        if (getQueryAsOfTime() != null)
            sb.append("QueryAsOfTime: ").append(getQueryAsOfTime()).append(",");
        if (getQueryParameters() != null)
            sb.append("QueryParameters: ").append(getQueryParameters()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryPlanningContext == false)
            return false;
        QueryPlanningContext other = (QueryPlanningContext) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getQueryAsOfTime() == null ^ this.getQueryAsOfTime() == null)
            return false;
        if (other.getQueryAsOfTime() != null && other.getQueryAsOfTime().equals(this.getQueryAsOfTime()) == false)
            return false;
        if (other.getQueryParameters() == null ^ this.getQueryParameters() == null)
            return false;
        if (other.getQueryParameters() != null && other.getQueryParameters().equals(this.getQueryParameters()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getQueryAsOfTime() == null) ? 0 : getQueryAsOfTime().hashCode());
        hashCode = prime * hashCode + ((getQueryParameters() == null) ? 0 : getQueryParameters().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        return hashCode;
    }

    @Override
    public QueryPlanningContext clone() {
        try {
            return (QueryPlanningContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.QueryPlanningContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
