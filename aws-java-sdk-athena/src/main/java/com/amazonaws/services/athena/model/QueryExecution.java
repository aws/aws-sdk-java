/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a single instance of a query execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     */
    private String queryExecutionId;
    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     */
    private String query;
    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL query statements. <code>DML</code>
     * indicates DML (Data Manipulation Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML, such as <code>SHOW CREATE TABLE</code>,
     * or <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     */
    private String statementType;
    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query
     * results. These are known as "client-side settings". If workgroup settings override client-side settings, then the
     * query uses the location for the query results and the encryption configuration that are specified for the
     * workgroup.
     * </p>
     */
    private ResultConfiguration resultConfiguration;
    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     */
    private QueryExecutionContext queryExecutionContext;
    /**
     * <p>
     * The completion date, current state, submission time, and state change reason (if applicable) for the query
     * execution.
     * </p>
     */
    private QueryExecutionStatus status;
    /**
     * <p>
     * The amount of data scanned during the query execution and the amount of time that it took to execute, and the
     * type of statement that was run.
     * </p>
     */
    private QueryExecutionStatistics statistics;
    /**
     * <p>
     * The name of the workgroup in which the query ran.
     * </p>
     */
    private String workGroup;

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique identifier for each query execution.
     */

    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     * 
     * @return The unique identifier for each query execution.
     */

    public String getQueryExecutionId() {
        return this.queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique identifier for each query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withQueryExecutionId(String queryExecutionId) {
        setQueryExecutionId(queryExecutionId);
        return this;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * 
     * @param query
     *        The SQL query statements which the query execution ran.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * 
     * @return The SQL query statements which the query execution ran.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * 
     * @param query
     *        The SQL query statements which the query execution ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL query statements. <code>DML</code>
     * indicates DML (Data Manipulation Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML, such as <code>SHOW CREATE TABLE</code>,
     * or <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * 
     * @param statementType
     *        The type of query statement that was run. <code>DDL</code> indicates DDL query statements.
     *        <code>DML</code> indicates DML (Data Manipulation Language) query statements, such as
     *        <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code> indicates query statements other than DDL and
     *        DML, such as <code>SHOW CREATE TABLE</code>, or <code>DESCRIBE &lt;table&gt;</code>.
     * @see StatementType
     */

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL query statements. <code>DML</code>
     * indicates DML (Data Manipulation Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML, such as <code>SHOW CREATE TABLE</code>,
     * or <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * 
     * @return The type of query statement that was run. <code>DDL</code> indicates DDL query statements.
     *         <code>DML</code> indicates DML (Data Manipulation Language) query statements, such as
     *         <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code> indicates query statements other than DDL and
     *         DML, such as <code>SHOW CREATE TABLE</code>, or <code>DESCRIBE &lt;table&gt;</code>.
     * @see StatementType
     */

    public String getStatementType() {
        return this.statementType;
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL query statements. <code>DML</code>
     * indicates DML (Data Manipulation Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML, such as <code>SHOW CREATE TABLE</code>,
     * or <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * 
     * @param statementType
     *        The type of query statement that was run. <code>DDL</code> indicates DDL query statements.
     *        <code>DML</code> indicates DML (Data Manipulation Language) query statements, such as
     *        <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code> indicates query statements other than DDL and
     *        DML, such as <code>SHOW CREATE TABLE</code>, or <code>DESCRIBE &lt;table&gt;</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatementType
     */

    public QueryExecution withStatementType(String statementType) {
        setStatementType(statementType);
        return this;
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL query statements. <code>DML</code>
     * indicates DML (Data Manipulation Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML, such as <code>SHOW CREATE TABLE</code>,
     * or <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * 
     * @param statementType
     *        The type of query statement that was run. <code>DDL</code> indicates DDL query statements.
     *        <code>DML</code> indicates DML (Data Manipulation Language) query statements, such as
     *        <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code> indicates query statements other than DDL and
     *        DML, such as <code>SHOW CREATE TABLE</code>, or <code>DESCRIBE &lt;table&gt;</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatementType
     */

    public QueryExecution withStatementType(StatementType statementType) {
        this.statementType = statementType.toString();
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query
     * results. These are known as "client-side settings". If workgroup settings override client-side settings, then the
     * query uses the location for the query results and the encryption configuration that are specified for the
     * workgroup.
     * </p>
     * 
     * @param resultConfiguration
     *        The location in Amazon S3 where query results were stored and the encryption option, if any, used for
     *        query results. These are known as "client-side settings". If workgroup settings override client-side
     *        settings, then the query uses the location for the query results and the encryption configuration that are
     *        specified for the workgroup.
     */

    public void setResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query
     * results. These are known as "client-side settings". If workgroup settings override client-side settings, then the
     * query uses the location for the query results and the encryption configuration that are specified for the
     * workgroup.
     * </p>
     * 
     * @return The location in Amazon S3 where query results were stored and the encryption option, if any, used for
     *         query results. These are known as "client-side settings". If workgroup settings override client-side
     *         settings, then the query uses the location for the query results and the encryption configuration that
     *         are specified for the workgroup.
     */

    public ResultConfiguration getResultConfiguration() {
        return this.resultConfiguration;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query
     * results. These are known as "client-side settings". If workgroup settings override client-side settings, then the
     * query uses the location for the query results and the encryption configuration that are specified for the
     * workgroup.
     * </p>
     * 
     * @param resultConfiguration
     *        The location in Amazon S3 where query results were stored and the encryption option, if any, used for
     *        query results. These are known as "client-side settings". If workgroup settings override client-side
     *        settings, then the query uses the location for the query results and the encryption configuration that are
     *        specified for the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withResultConfiguration(ResultConfiguration resultConfiguration) {
        setResultConfiguration(resultConfiguration);
        return this;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     * 
     * @param queryExecutionContext
     *        The database in which the query execution occurred.
     */

    public void setQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        this.queryExecutionContext = queryExecutionContext;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     * 
     * @return The database in which the query execution occurred.
     */

    public QueryExecutionContext getQueryExecutionContext() {
        return this.queryExecutionContext;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     * 
     * @param queryExecutionContext
     *        The database in which the query execution occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        setQueryExecutionContext(queryExecutionContext);
        return this;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change reason (if applicable) for the query
     * execution.
     * </p>
     * 
     * @param status
     *        The completion date, current state, submission time, and state change reason (if applicable) for the query
     *        execution.
     */

    public void setStatus(QueryExecutionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change reason (if applicable) for the query
     * execution.
     * </p>
     * 
     * @return The completion date, current state, submission time, and state change reason (if applicable) for the
     *         query execution.
     */

    public QueryExecutionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change reason (if applicable) for the query
     * execution.
     * </p>
     * 
     * @param status
     *        The completion date, current state, submission time, and state change reason (if applicable) for the query
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withStatus(QueryExecutionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The amount of data scanned during the query execution and the amount of time that it took to execute, and the
     * type of statement that was run.
     * </p>
     * 
     * @param statistics
     *        The amount of data scanned during the query execution and the amount of time that it took to execute, and
     *        the type of statement that was run.
     */

    public void setStatistics(QueryExecutionStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The amount of data scanned during the query execution and the amount of time that it took to execute, and the
     * type of statement that was run.
     * </p>
     * 
     * @return The amount of data scanned during the query execution and the amount of time that it took to execute, and
     *         the type of statement that was run.
     */

    public QueryExecutionStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * The amount of data scanned during the query execution and the amount of time that it took to execute, and the
     * type of statement that was run.
     * </p>
     * 
     * @param statistics
     *        The amount of data scanned during the query execution and the amount of time that it took to execute, and
     *        the type of statement that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withStatistics(QueryExecutionStatistics statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup in which the query ran.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup in which the query ran.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the query ran.
     * </p>
     * 
     * @return The name of the workgroup in which the query ran.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the query ran.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup in which the query ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
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
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: ").append(getQueryExecutionId()).append(",");
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getStatementType() != null)
            sb.append("StatementType: ").append(getStatementType()).append(",");
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: ").append(getResultConfiguration()).append(",");
        if (getQueryExecutionContext() != null)
            sb.append("QueryExecutionContext: ").append(getQueryExecutionContext()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecution == false)
            return false;
        QueryExecution other = (QueryExecution) obj;
        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getStatementType() == null ^ this.getStatementType() == null)
            return false;
        if (other.getStatementType() != null && other.getStatementType().equals(this.getStatementType()) == false)
            return false;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        if (other.getQueryExecutionContext() == null ^ this.getQueryExecutionContext() == null)
            return false;
        if (other.getQueryExecutionContext() != null && other.getQueryExecutionContext().equals(this.getQueryExecutionContext()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getStatementType() == null) ? 0 : getStatementType().hashCode());
        hashCode = prime * hashCode + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        hashCode = prime * hashCode + ((getQueryExecutionContext() == null) ? 0 : getQueryExecutionContext().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public QueryExecution clone() {
        try {
            return (QueryExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
