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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/BatchExecuteStatement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchExecuteStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The cluster identifier. This parameter is required when connecting to a cluster and authenticating using either
     * Secrets Manager or temporary credentials.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using either Secrets Manager or
     * temporary credentials.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The database user name. This parameter is required when connecting to a cluster and authenticating using
     * temporary credentials.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using Secrets Manager.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * One or more SQL statements to run.
     * 
     * <pre>
     * <code> The SQL statements are run as a single transaction. They run serially in the order of the array. Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     * </pre>
     */
    private java.util.List<String> sqls;
    /**
     * <p>
     * The name of the SQL statements. You can name the SQL statements when you create them to identify the query.
     * </p>
     */
    private String statementName;
    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statements run.
     * </p>
     */
    private Boolean withEvent;
    /**
     * <p>
     * The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and
     * authenticating using either Secrets Manager or temporary credentials.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is required when connecting to a cluster and authenticating using either
     * Secrets Manager or temporary credentials.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier. This parameter is required when connecting to a cluster and authenticating using
     *        either Secrets Manager or temporary credentials.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is required when connecting to a cluster and authenticating using either
     * Secrets Manager or temporary credentials.
     * </p>
     * 
     * @return The cluster identifier. This parameter is required when connecting to a cluster and authenticating using
     *         either Secrets Manager or temporary credentials.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is required when connecting to a cluster and authenticating using either
     * Secrets Manager or temporary credentials.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier. This parameter is required when connecting to a cluster and authenticating using
     *        either Secrets Manager or temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using either Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @param database
     *        The name of the database. This parameter is required when authenticating using either Secrets Manager or
     *        temporary credentials.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using either Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @return The name of the database. This parameter is required when authenticating using either Secrets Manager or
     *         temporary credentials.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database. This parameter is required when authenticating using either Secrets Manager or
     * temporary credentials.
     * </p>
     * 
     * @param database
     *        The name of the database. This parameter is required when authenticating using either Secrets Manager or
     *        temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The database user name. This parameter is required when connecting to a cluster and authenticating using
     * temporary credentials.
     * </p>
     * 
     * @param dbUser
     *        The database user name. This parameter is required when connecting to a cluster and authenticating using
     *        temporary credentials.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The database user name. This parameter is required when connecting to a cluster and authenticating using
     * temporary credentials.
     * </p>
     * 
     * @return The database user name. This parameter is required when connecting to a cluster and authenticating using
     *         temporary credentials.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The database user name. This parameter is required when connecting to a cluster and authenticating using
     * temporary credentials.
     * </p>
     * 
     * @param dbUser
     *        The database user name. This parameter is required when connecting to a cluster and authenticating using
     *        temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using Secrets Manager.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the database. This parameter is required when
     *        authenticating using Secrets Manager.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using Secrets Manager.
     * </p>
     * 
     * @return The name or ARN of the secret that enables access to the database. This parameter is required when
     *         authenticating using Secrets Manager.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating
     * using Secrets Manager.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the database. This parameter is required when
     *        authenticating using Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * One or more SQL statements to run.
     * 
     * <pre>
     * <code> The SQL statements are run as a single transaction. They run serially in the order of the array. Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     * </pre>
     * 
     * @return One or more SQL statements to run.
     * 
     *         <pre>
     * 
     *         <code> The SQL statements are run as a single transaction. They run serially in the order of the array.
     *         Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL
     *         statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     */

    public java.util.List<String> getSqls() {
        return sqls;
    }

    /**
     * <p>
     * One or more SQL statements to run.
     * 
     * <pre>
     * <code> The SQL statements are run as a single transaction. They run serially in the order of the array. Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param sqls
     *        One or more SQL statements to run.
     * 
     *        <pre>
     * 
     *        <code> The SQL statements are run as a single transaction. They run serially in the order of the array.
     *        Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL
     *        statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     */

    public void setSqls(java.util.Collection<String> sqls) {
        if (sqls == null) {
            this.sqls = null;
            return;
        }

        this.sqls = new java.util.ArrayList<String>(sqls);
    }

    /**
     * <p>
     * One or more SQL statements to run.
     * 
     * <pre>
     * <code> The SQL statements are run as a single transaction. They run serially in the order of the array. Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     * </pre>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSqls(java.util.Collection)} or {@link #withSqls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sqls
     *        One or more SQL statements to run.
     * 
     *        <pre>
     * <code> The SQL statements are run as a single transaction. They run serially in the order of the array. Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withSqls(String... sqls) {
        if (this.sqls == null) {
            setSqls(new java.util.ArrayList<String>(sqls.length));
        }
        for (String ele : sqls) {
            this.sqls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more SQL statements to run.
     * 
     * <pre>
     * <code> The SQL statements are run as a single transaction. They run serially in the order of the array. Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param sqls
     *        One or more SQL statements to run.
     * 
     *        <pre>
     * 
     *        <code> The SQL statements are run as a single transaction. They run serially in the order of the array.
     *        Subsequent SQL statements don't start until the previous statement in the array completes. If any SQL
     *        statement fails, then because they are run as one transaction, all work is rolled back.&lt;/p&gt; </code>
     *        @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withSqls(java.util.Collection<String> sqls) {
        setSqls(sqls);
        return this;
    }

    /**
     * <p>
     * The name of the SQL statements. You can name the SQL statements when you create them to identify the query.
     * </p>
     * 
     * @param statementName
     *        The name of the SQL statements. You can name the SQL statements when you create them to identify the
     *        query.
     */

    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    /**
     * <p>
     * The name of the SQL statements. You can name the SQL statements when you create them to identify the query.
     * </p>
     * 
     * @return The name of the SQL statements. You can name the SQL statements when you create them to identify the
     *         query.
     */

    public String getStatementName() {
        return this.statementName;
    }

    /**
     * <p>
     * The name of the SQL statements. You can name the SQL statements when you create them to identify the query.
     * </p>
     * 
     * @param statementName
     *        The name of the SQL statements. You can name the SQL statements when you create them to identify the
     *        query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withStatementName(String statementName) {
        setStatementName(statementName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statements run.
     * </p>
     * 
     * @param withEvent
     *        A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL
     *        statements run.
     */

    public void setWithEvent(Boolean withEvent) {
        this.withEvent = withEvent;
    }

    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statements run.
     * </p>
     * 
     * @return A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL
     *         statements run.
     */

    public Boolean getWithEvent() {
        return this.withEvent;
    }

    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statements run.
     * </p>
     * 
     * @param withEvent
     *        A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL
     *        statements run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withWithEvent(Boolean withEvent) {
        setWithEvent(withEvent);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statements run.
     * </p>
     * 
     * @return A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL
     *         statements run.
     */

    public Boolean isWithEvent() {
        return this.withEvent;
    }

    /**
     * <p>
     * The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and
     * authenticating using either Secrets Manager or temporary credentials.
     * </p>
     * 
     * @param workgroupName
     *        The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and
     *        authenticating using either Secrets Manager or temporary credentials.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and
     * authenticating using either Secrets Manager or temporary credentials.
     * </p>
     * 
     * @return The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and
     *         authenticating using either Secrets Manager or temporary credentials.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and
     * authenticating using either Secrets Manager or temporary credentials.
     * </p>
     * 
     * @param workgroupName
     *        The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and
     *        authenticating using either Secrets Manager or temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getSqls() != null)
            sb.append("Sqls: ").append(getSqls()).append(",");
        if (getStatementName() != null)
            sb.append("StatementName: ").append(getStatementName()).append(",");
        if (getWithEvent() != null)
            sb.append("WithEvent: ").append(getWithEvent()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
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
        if (other.getSqls() == null ^ this.getSqls() == null)
            return false;
        if (other.getSqls() != null && other.getSqls().equals(this.getSqls()) == false)
            return false;
        if (other.getStatementName() == null ^ this.getStatementName() == null)
            return false;
        if (other.getStatementName() != null && other.getStatementName().equals(this.getStatementName()) == false)
            return false;
        if (other.getWithEvent() == null ^ this.getWithEvent() == null)
            return false;
        if (other.getWithEvent() != null && other.getWithEvent().equals(this.getWithEvent()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSqls() == null) ? 0 : getSqls().hashCode());
        hashCode = prime * hashCode + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        hashCode = prime * hashCode + ((getWithEvent() == null) ? 0 : getWithEvent().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public BatchExecuteStatementRequest clone() {
        return (BatchExecuteStatementRequest) super.clone();
    }

}
