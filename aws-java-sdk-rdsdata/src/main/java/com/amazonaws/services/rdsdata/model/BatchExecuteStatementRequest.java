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
 * The request parameters represent the input of a SQL statement over an array of data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BatchExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchExecuteStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The parameter set for the batch operation.
     * </p>
     * <p>
     * The maximum number of parameters in a parameter set is 1,000.
     * </p>
     */
    private java.util.List<java.util.List<SqlParameter>> parameterSets;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     */
    private String resourceArn;
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

    public BatchExecuteStatementRequest withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The parameter set for the batch operation.
     * </p>
     * <p>
     * The maximum number of parameters in a parameter set is 1,000.
     * </p>
     * 
     * @return The parameter set for the batch operation.</p>
     *         <p>
     *         The maximum number of parameters in a parameter set is 1,000.
     */

    public java.util.List<java.util.List<SqlParameter>> getParameterSets() {
        return parameterSets;
    }

    /**
     * <p>
     * The parameter set for the batch operation.
     * </p>
     * <p>
     * The maximum number of parameters in a parameter set is 1,000.
     * </p>
     * 
     * @param parameterSets
     *        The parameter set for the batch operation.</p>
     *        <p>
     *        The maximum number of parameters in a parameter set is 1,000.
     */

    public void setParameterSets(java.util.Collection<java.util.List<SqlParameter>> parameterSets) {
        if (parameterSets == null) {
            this.parameterSets = null;
            return;
        }

        this.parameterSets = new java.util.ArrayList<java.util.List<SqlParameter>>(parameterSets);
    }

    /**
     * <p>
     * The parameter set for the batch operation.
     * </p>
     * <p>
     * The maximum number of parameters in a parameter set is 1,000.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterSets(java.util.Collection)} or {@link #withParameterSets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param parameterSets
     *        The parameter set for the batch operation.</p>
     *        <p>
     *        The maximum number of parameters in a parameter set is 1,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withParameterSets(java.util.List<SqlParameter>... parameterSets) {
        if (this.parameterSets == null) {
            setParameterSets(new java.util.ArrayList<java.util.List<SqlParameter>>(parameterSets.length));
        }
        for (java.util.List<SqlParameter> ele : parameterSets) {
            this.parameterSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameter set for the batch operation.
     * </p>
     * <p>
     * The maximum number of parameters in a parameter set is 1,000.
     * </p>
     * 
     * @param parameterSets
     *        The parameter set for the batch operation.</p>
     *        <p>
     *        The maximum number of parameters in a parameter set is 1,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withParameterSets(java.util.Collection<java.util.List<SqlParameter>> parameterSets) {
        setParameterSets(parameterSets);
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

    public BatchExecuteStatementRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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

    public BatchExecuteStatementRequest withSchema(String schema) {
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

    public BatchExecuteStatementRequest withSecretArn(String secretArn) {
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

    public BatchExecuteStatementRequest withSql(String sql) {
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

    public BatchExecuteStatementRequest withTransactionId(String transactionId) {
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
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getParameterSets() != null)
            sb.append("ParameterSets: ").append(getParameterSets()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof BatchExecuteStatementRequest == false)
            return false;
        BatchExecuteStatementRequest other = (BatchExecuteStatementRequest) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getParameterSets() == null ^ this.getParameterSets() == null)
            return false;
        if (other.getParameterSets() != null && other.getParameterSets().equals(this.getParameterSets()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getParameterSets() == null) ? 0 : getParameterSets().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSql() == null) ? 0 : getSql().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        return hashCode;
    }

    @Override
    public BatchExecuteStatementRequest clone() {
        return (BatchExecuteStatementRequest) super.clone();
    }

}
