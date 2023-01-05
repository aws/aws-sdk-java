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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon Redshift
 * Data API ExecuteStatement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeTargetRedshiftDataParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetRedshiftDataParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database. Required when authenticating using temporary credentials.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The database user name. Required when authenticating using temporary credentials.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. Required when authenticating using SageMaker.
     * </p>
     */
    private String secretManagerArn;
    /**
     * <p>
     * The SQL statement text to run.
     * </p>
     */
    private java.util.List<String> sqls;
    /**
     * <p>
     * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * </p>
     */
    private String statementName;
    /**
     * <p>
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * </p>
     */
    private Boolean withEvent;

    /**
     * <p>
     * The name of the database. Required when authenticating using temporary credentials.
     * </p>
     * 
     * @param database
     *        The name of the database. Required when authenticating using temporary credentials.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database. Required when authenticating using temporary credentials.
     * </p>
     * 
     * @return The name of the database. Required when authenticating using temporary credentials.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database. Required when authenticating using temporary credentials.
     * </p>
     * 
     * @param database
     *        The name of the database. Required when authenticating using temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetRedshiftDataParameters withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The database user name. Required when authenticating using temporary credentials.
     * </p>
     * 
     * @param dbUser
     *        The database user name. Required when authenticating using temporary credentials.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The database user name. Required when authenticating using temporary credentials.
     * </p>
     * 
     * @return The database user name. Required when authenticating using temporary credentials.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The database user name. Required when authenticating using temporary credentials.
     * </p>
     * 
     * @param dbUser
     *        The database user name. Required when authenticating using temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetRedshiftDataParameters withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. Required when authenticating using SageMaker.
     * </p>
     * 
     * @param secretManagerArn
     *        The name or ARN of the secret that enables access to the database. Required when authenticating using
     *        SageMaker.
     */

    public void setSecretManagerArn(String secretManagerArn) {
        this.secretManagerArn = secretManagerArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. Required when authenticating using SageMaker.
     * </p>
     * 
     * @return The name or ARN of the secret that enables access to the database. Required when authenticating using
     *         SageMaker.
     */

    public String getSecretManagerArn() {
        return this.secretManagerArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database. Required when authenticating using SageMaker.
     * </p>
     * 
     * @param secretManagerArn
     *        The name or ARN of the secret that enables access to the database. Required when authenticating using
     *        SageMaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetRedshiftDataParameters withSecretManagerArn(String secretManagerArn) {
        setSecretManagerArn(secretManagerArn);
        return this;
    }

    /**
     * <p>
     * The SQL statement text to run.
     * </p>
     * 
     * @return The SQL statement text to run.
     */

    public java.util.List<String> getSqls() {
        return sqls;
    }

    /**
     * <p>
     * The SQL statement text to run.
     * </p>
     * 
     * @param sqls
     *        The SQL statement text to run.
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
     * The SQL statement text to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSqls(java.util.Collection)} or {@link #withSqls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sqls
     *        The SQL statement text to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetRedshiftDataParameters withSqls(String... sqls) {
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
     * The SQL statement text to run.
     * </p>
     * 
     * @param sqls
     *        The SQL statement text to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetRedshiftDataParameters withSqls(java.util.Collection<String> sqls) {
        setSqls(sqls);
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

    public PipeTargetRedshiftDataParameters withStatementName(String statementName) {
        setStatementName(statementName);
        return this;
    }

    /**
     * <p>
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * </p>
     * 
     * @param withEvent
     *        Indicates whether to send an event back to EventBridge after the SQL statement runs.
     */

    public void setWithEvent(Boolean withEvent) {
        this.withEvent = withEvent;
    }

    /**
     * <p>
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * </p>
     * 
     * @return Indicates whether to send an event back to EventBridge after the SQL statement runs.
     */

    public Boolean getWithEvent() {
        return this.withEvent;
    }

    /**
     * <p>
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * </p>
     * 
     * @param withEvent
     *        Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetRedshiftDataParameters withWithEvent(Boolean withEvent) {
        setWithEvent(withEvent);
        return this;
    }

    /**
     * <p>
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * </p>
     * 
     * @return Indicates whether to send an event back to EventBridge after the SQL statement runs.
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
        if (getDatabase() != null)
            sb.append("Database: ").append("***Sensitive Data Redacted***").append(",");
        if (getDbUser() != null)
            sb.append("DbUser: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecretManagerArn() != null)
            sb.append("SecretManagerArn: ").append(getSecretManagerArn()).append(",");
        if (getSqls() != null)
            sb.append("Sqls: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatementName() != null)
            sb.append("StatementName: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof PipeTargetRedshiftDataParameters == false)
            return false;
        PipeTargetRedshiftDataParameters other = (PipeTargetRedshiftDataParameters) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getSecretManagerArn() == null ^ this.getSecretManagerArn() == null)
            return false;
        if (other.getSecretManagerArn() != null && other.getSecretManagerArn().equals(this.getSecretManagerArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getSecretManagerArn() == null) ? 0 : getSecretManagerArn().hashCode());
        hashCode = prime * hashCode + ((getSqls() == null) ? 0 : getSqls().hashCode());
        hashCode = prime * hashCode + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        hashCode = prime * hashCode + ((getWithEvent() == null) ? 0 : getWithEvent().hashCode());
        return hashCode;
    }

    @Override
    public PipeTargetRedshiftDataParameters clone() {
        try {
            return (PipeTargetRedshiftDataParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeTargetRedshiftDataParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
