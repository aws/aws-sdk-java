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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     * temporary credentials.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using temporary credentials.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The database user name. This parameter is required when authenticating using temporary credentials.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The SQL statement text to run.
     * </p>
     */
    private String sql;
    /**
     * <p>
     * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * </p>
     */
    private String statementName;
    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * </p>
     */
    private Boolean withEvent;

    /**
     * <p>
     * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     *        temporary credentials.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @return The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager
     *         or temporary credentials.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or
     *        temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @param database
     *        The name of the database. This parameter is required when authenticating using temporary credentials.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @return The name of the database. This parameter is required when authenticating using temporary credentials.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @param database
     *        The name of the database. This parameter is required when authenticating using temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The database user name. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @param dbUser
     *        The database user name. This parameter is required when authenticating using temporary credentials.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The database user name. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @return The database user name. This parameter is required when authenticating using temporary credentials.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The database user name. This parameter is required when authenticating using temporary credentials.
     * </p>
     * 
     * @param dbUser
     *        The database user name. This parameter is required when authenticating using temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the database. This parameter is required when
     *        authenticating using AWS Secrets Manager.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     * 
     * @return The name or ARN of the secret that enables access to the database. This parameter is required when
     *         authenticating using AWS Secrets Manager.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using AWS Secrets Manager.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the database. This parameter is required when
     *        authenticating using AWS Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The SQL statement text to run.
     * </p>
     * 
     * @param sql
     *        The SQL statement text to run.
     */

    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * <p>
     * The SQL statement text to run.
     * </p>
     * 
     * @return The SQL statement text to run.
     */

    public String getSql() {
        return this.sql;
    }

    /**
     * <p>
     * The SQL statement text to run.
     * </p>
     * 
     * @param sql
     *        The SQL statement text to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withSql(String sql) {
        setSql(sql);
        return this;
    }

    /**
     * <p>
     * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * </p>
     * 
     * @param statementName
     *        The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     */

    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    /**
     * <p>
     * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * </p>
     * 
     * @return The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     */

    public String getStatementName() {
        return this.statementName;
    }

    /**
     * <p>
     * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * </p>
     * 
     * @param statementName
     *        The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withStatementName(String statementName) {
        setStatementName(statementName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * </p>
     * 
     * @param withEvent
     *        A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL
     *        statement runs.
     */

    public void setWithEvent(Boolean withEvent) {
        this.withEvent = withEvent;
    }

    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * </p>
     * 
     * @return A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL
     *         statement runs.
     */

    public Boolean getWithEvent() {
        return this.withEvent;
    }

    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * </p>
     * 
     * @param withEvent
     *        A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL
     *        statement runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementRequest withWithEvent(Boolean withEvent) {
        setWithEvent(withEvent);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * </p>
     * 
     * @return A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL
     *         statement runs.
     */

    public Boolean isWithEvent() {
        return this.withEvent;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getSql() != null)
            sb.append("Sql: ").append(getSql()).append(",");
        if (getStatementName() != null)
            sb.append("StatementName: ").append(getStatementName()).append(",");
        if (getWithEvent() != null)
            sb.append("WithEvent: ").append(getWithEvent());
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
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getSql() == null ^ this.getSql() == null)
            return false;
        if (other.getSql() != null && other.getSql().equals(this.getSql()) == false)
            return false;
        if (other.getStatementName() == null ^ this.getStatementName() == null)
            return false;
        if (other.getStatementName() != null && other.getStatementName().equals(this.getStatementName()) == false)
            return false;
        if (other.getWithEvent() == null ^ this.getWithEvent() == null)
            return false;
        if (other.getWithEvent() != null && other.getWithEvent().equals(this.getWithEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSql() == null) ? 0 : getSql().hashCode());
        hashCode = prime * hashCode + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        hashCode = prime * hashCode + ((getWithEvent() == null) ? 0 : getWithEvent().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteStatementRequest clone() {
        return (ExecuteStatementRequest) super.clone();
    }

}
