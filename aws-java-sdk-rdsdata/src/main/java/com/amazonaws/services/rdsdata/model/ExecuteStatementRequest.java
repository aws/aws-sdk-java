/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request parameters represent the input of a request to run a SQL statement against a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A value that indicates whether to continue running the statement after the call times out. By default, the
     * statement stops running when the call times out.
     * </p>
     * <important>
     * <p>
     * For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL statement
     * terminates before it is finished running, it can result in errors and possibly corrupted data structures.
     * </p>
     * </important>
     */
    private Boolean continueAfterTimeout;
    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String database;
    /**
     * <p>
     * A value that indicates whether to include metadata in the results.
     * </p>
     */
    private Boolean includeResultMetadata;
    /**
     * <p>
     * The parameters for the SQL statement.
     * </p>
     */
    private java.util.List<SqlParameter> parameters;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Options that control how the result set is returned.
     * </p>
     */
    private ResultSetOptions resultSetOptions;
    /**
     * <p>
     * The name of the database schema.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The name or ARN of the secret that enables access to the DB cluster.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The SQL statement to run.
     * </p>
     */
    private String sql;
    /**
     * <p>
     * The identifier of a transaction that was started by using the <code>BeginTransaction</code> operation. Specify
     * the transaction ID of the transaction that you want to include the SQL statement in.
     * </p>
     * <p>
     * If the SQL statement is not part of a transaction, don't set this parameter.
     * </p>
     */
    private String transactionId;

    /**
     * <p>
     * A value that indicates whether to continue running the statement after the call times out. By default, the
     * statement stops running when the call times out.
     * </p>
     * <important>
     * <p>
     * For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL statement
     * terminates before it is finished running, it can result in errors and possibly corrupted data structures.
     * </p>
     * </important>
     * 
     * @param continueAfterTimeout
     *        A value that indicates whether to continue running the statement after the call times out. By default, the
     *        statement stops running when the call times out.</p> <important>
     *        <p>
     *        For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL
     *        statement terminates before it is finished running, it can result in errors and possibly corrupted data
     *        structures.
     *        </p>
     */

    public void setContinueAfterTimeout(Boolean continueAfterTimeout) {
        this.continueAfterTimeout = continueAfterTimeout;
    }

    /**
     * <p>
     * A value that indicates whether to continue running the statement after the call times out. By default, the
     * statement stops running when the call times out.
     * </p>
     * <important>
     * <p>
     * For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL statement
     * terminates before it is finished running, it can result in errors and possibly corrupted data structures.
     * </p>
     * </important>
     * 
     * @return A value that indicates whether to continue running the statement after the call times out. By default,
     *         the statement stops running when the call times out.</p> <important>
     *         <p>
     *         For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL
     *         statement terminates before it is finished running, it can result in errors and possibly corrupted data
     *         structures.
     *         </p>
     */

    public Boolean getContinueAfterTimeout() {
        return this.continueAfterTimeout;
    }

    /**
     * <p>
     * A value that indicates whether to continue running the statement after the call times out. By default, the
     * statement stops running when the call times out.
     * </p>
     * <important>
     * <p>
     * For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL statement
     * terminates before it is finished running, it can result in errors and possibly corrupted data structures.
     * </p>
     * </important>
     * 
     * @param continueAfterTimeout
     *        A value that indicates whether to continue running the statement after the call times out. By default, the
     *        statement stops running when the call times out.</p> <important>
     *        <p>
     *        For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL
     *        statement terminates before it is finished running, it can result in errors and possibly corrupted data
     *        structures.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withContinueAfterTimeout(Boolean continueAfterTimeout) {
        setContinueAfterTimeout(continueAfterTimeout);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to continue running the statement after the call times out. By default, the
     * statement stops running when the call times out.
     * </p>
     * <important>
     * <p>
     * For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL statement
     * terminates before it is finished running, it can result in errors and possibly corrupted data structures.
     * </p>
     * </important>
     * 
     * @return A value that indicates whether to continue running the statement after the call times out. By default,
     *         the statement stops running when the call times out.</p> <important>
     *         <p>
     *         For DDL statements, we recommend continuing to run the statement after the call times out. When a DDL
     *         statement terminates before it is finished running, it can result in errors and possibly corrupted data
     *         structures.
     *         </p>
     */

    public Boolean isContinueAfterTimeout() {
        return this.continueAfterTimeout;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param database
     *        The name of the database.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @return The name of the database.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param database
     *        The name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to include metadata in the results.
     * </p>
     * 
     * @param includeResultMetadata
     *        A value that indicates whether to include metadata in the results.
     */

    public void setIncludeResultMetadata(Boolean includeResultMetadata) {
        this.includeResultMetadata = includeResultMetadata;
    }

    /**
     * <p>
     * A value that indicates whether to include metadata in the results.
     * </p>
     * 
     * @return A value that indicates whether to include metadata in the results.
     */

    public Boolean getIncludeResultMetadata() {
        return this.includeResultMetadata;
    }

    /**
     * <p>
     * A value that indicates whether to include metadata in the results.
     * </p>
     * 
     * @param includeResultMetadata
     *        A value that indicates whether to include metadata in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withIncludeResultMetadata(Boolean includeResultMetadata) {
        setIncludeResultMetadata(includeResultMetadata);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to include metadata in the results.
     * </p>
     * 
     * @return A value that indicates whether to include metadata in the results.
     */

    public Boolean isIncludeResultMetadata() {
        return this.includeResultMetadata;
    }

    /**
     * <p>
     * The parameters for the SQL statement.
     * </p>
     * 
     * @return The parameters for the SQL statement.
     */

    public java.util.List<SqlParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the SQL statement.
     * </p>
     * 
     * @param parameters
     *        The parameters for the SQL statement.
     */

    public void setParameters(java.util.Collection<SqlParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<SqlParameter>(parameters);
    }

    /**
     * <p>
     * The parameters for the SQL statement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameters for the SQL statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withParameters(SqlParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<SqlParameter>(parameters.length));
        }
        for (SqlParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameters for the SQL statement.
     * </p>
     * 
     * @param parameters
     *        The parameters for the SQL statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withParameters(java.util.Collection<SqlParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Options that control how the result set is returned.
     * </p>
     * 
     * @param resultSetOptions
     *        Options that control how the result set is returned.
     */

    public void setResultSetOptions(ResultSetOptions resultSetOptions) {
        this.resultSetOptions = resultSetOptions;
    }

    /**
     * <p>
     * Options that control how the result set is returned.
     * </p>
     * 
     * @return Options that control how the result set is returned.
     */

    public ResultSetOptions getResultSetOptions() {
        return this.resultSetOptions;
    }

    /**
     * <p>
     * Options that control how the result set is returned.
     * </p>
     * 
     * @param resultSetOptions
     *        Options that control how the result set is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withResultSetOptions(ResultSetOptions resultSetOptions) {
        setResultSetOptions(resultSetOptions);
        return this;
    }

    /**
     * <p>
     * The name of the database schema.
     * </p>
     * 
     * @param schema
     *        The name of the database schema.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The name of the database schema.
     * </p>
     * 
     * @return The name of the database schema.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The name of the database schema.
     * </p>
     * 
     * @param schema
     *        The name of the database schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the DB cluster.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @return The name or ARN of the secret that enables access to the DB cluster.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The SQL statement to run.
     * </p>
     * 
     * @param sql
     *        The SQL statement to run.
     */

    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * <p>
     * The SQL statement to run.
     * </p>
     * 
     * @return The SQL statement to run.
     */

    public String getSql() {
        return this.sql;
    }

    /**
     * <p>
     * The SQL statement to run.
     * </p>
     * 
     * @param sql
     *        The SQL statement to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withSql(String sql) {
        setSql(sql);
        return this;
    }

    /**
     * <p>
     * The identifier of a transaction that was started by using the <code>BeginTransaction</code> operation. Specify
     * the transaction ID of the transaction that you want to include the SQL statement in.
     * </p>
     * <p>
     * If the SQL statement is not part of a transaction, don't set this parameter.
     * </p>
     * 
     * @param transactionId
     *        The identifier of a transaction that was started by using the <code>BeginTransaction</code> operation.
     *        Specify the transaction ID of the transaction that you want to include the SQL statement in.</p>
     *        <p>
     *        If the SQL statement is not part of a transaction, don't set this parameter.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The identifier of a transaction that was started by using the <code>BeginTransaction</code> operation. Specify
     * the transaction ID of the transaction that you want to include the SQL statement in.
     * </p>
     * <p>
     * If the SQL statement is not part of a transaction, don't set this parameter.
     * </p>
     * 
     * @return The identifier of a transaction that was started by using the <code>BeginTransaction</code> operation.
     *         Specify the transaction ID of the transaction that you want to include the SQL statement in.</p>
     *         <p>
     *         If the SQL statement is not part of a transaction, don't set this parameter.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The identifier of a transaction that was started by using the <code>BeginTransaction</code> operation. Specify
     * the transaction ID of the transaction that you want to include the SQL statement in.
     * </p>
     * <p>
     * If the SQL statement is not part of a transaction, don't set this parameter.
     * </p>
     * 
     * @param transactionId
     *        The identifier of a transaction that was started by using the <code>BeginTransaction</code> operation.
     *        Specify the transaction ID of the transaction that you want to include the SQL statement in.</p>
     *        <p>
     *        If the SQL statement is not part of a transaction, don't set this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withTransactionId(String transactionId) {
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
        if (getContinueAfterTimeout() != null)
            sb.append("ContinueAfterTimeout: ").append(getContinueAfterTimeout()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getIncludeResultMetadata() != null)
            sb.append("IncludeResultMetadata: ").append(getIncludeResultMetadata()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResultSetOptions() != null)
            sb.append("ResultSetOptions: ").append(getResultSetOptions()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getSql() != null)
            sb.append("Sql: ").append(getSql()).append(",");
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

        if (obj instanceof ExecuteStatementRequest == false)
            return false;
        ExecuteStatementRequest other = (ExecuteStatementRequest) obj;
        if (other.getContinueAfterTimeout() == null ^ this.getContinueAfterTimeout() == null)
            return false;
        if (other.getContinueAfterTimeout() != null && other.getContinueAfterTimeout().equals(this.getContinueAfterTimeout()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getIncludeResultMetadata() == null ^ this.getIncludeResultMetadata() == null)
            return false;
        if (other.getIncludeResultMetadata() != null && other.getIncludeResultMetadata().equals(this.getIncludeResultMetadata()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResultSetOptions() == null ^ this.getResultSetOptions() == null)
            return false;
        if (other.getResultSetOptions() != null && other.getResultSetOptions().equals(this.getResultSetOptions()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getSql() == null ^ this.getSql() == null)
            return false;
        if (other.getSql() != null && other.getSql().equals(this.getSql()) == false)
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

        hashCode = prime * hashCode + ((getContinueAfterTimeout() == null) ? 0 : getContinueAfterTimeout().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getIncludeResultMetadata() == null) ? 0 : getIncludeResultMetadata().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResultSetOptions() == null) ? 0 : getResultSetOptions().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSql() == null) ? 0 : getSql().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteStatementRequest clone() {
        return (ExecuteStatementRequest) super.clone();
    }

}
