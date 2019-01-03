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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Execute SQL Request
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteSqlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** ARN of the db credentials in AWS Secret Store or the friendly secret name */
    private String awsSecretStoreArn;
    /** Target DB name */
    private String database;
    /** ARN of the target db cluster or instance */
    private String dbClusterOrInstanceArn;
    /** Target Schema name */
    private String schema;
    /** SQL statement(s) to be executed. Statements can be chained by using semicolons */
    private String sqlStatements;

    /**
     * ARN of the db credentials in AWS Secret Store or the friendly secret name
     * 
     * @param awsSecretStoreArn
     *        ARN of the db credentials in AWS Secret Store or the friendly secret name
     */

    public void setAwsSecretStoreArn(String awsSecretStoreArn) {
        this.awsSecretStoreArn = awsSecretStoreArn;
    }

    /**
     * ARN of the db credentials in AWS Secret Store or the friendly secret name
     * 
     * @return ARN of the db credentials in AWS Secret Store or the friendly secret name
     */

    public String getAwsSecretStoreArn() {
        return this.awsSecretStoreArn;
    }

    /**
     * ARN of the db credentials in AWS Secret Store or the friendly secret name
     * 
     * @param awsSecretStoreArn
     *        ARN of the db credentials in AWS Secret Store or the friendly secret name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlRequest withAwsSecretStoreArn(String awsSecretStoreArn) {
        setAwsSecretStoreArn(awsSecretStoreArn);
        return this;
    }

    /**
     * Target DB name
     * 
     * @param database
     *        Target DB name
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * Target DB name
     * 
     * @return Target DB name
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * Target DB name
     * 
     * @param database
     *        Target DB name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlRequest withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * ARN of the target db cluster or instance
     * 
     * @param dbClusterOrInstanceArn
     *        ARN of the target db cluster or instance
     */

    public void setDbClusterOrInstanceArn(String dbClusterOrInstanceArn) {
        this.dbClusterOrInstanceArn = dbClusterOrInstanceArn;
    }

    /**
     * ARN of the target db cluster or instance
     * 
     * @return ARN of the target db cluster or instance
     */

    public String getDbClusterOrInstanceArn() {
        return this.dbClusterOrInstanceArn;
    }

    /**
     * ARN of the target db cluster or instance
     * 
     * @param dbClusterOrInstanceArn
     *        ARN of the target db cluster or instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlRequest withDbClusterOrInstanceArn(String dbClusterOrInstanceArn) {
        setDbClusterOrInstanceArn(dbClusterOrInstanceArn);
        return this;
    }

    /**
     * Target Schema name
     * 
     * @param schema
     *        Target Schema name
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * Target Schema name
     * 
     * @return Target Schema name
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * Target Schema name
     * 
     * @param schema
     *        Target Schema name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlRequest withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * SQL statement(s) to be executed. Statements can be chained by using semicolons
     * 
     * @param sqlStatements
     *        SQL statement(s) to be executed. Statements can be chained by using semicolons
     */

    public void setSqlStatements(String sqlStatements) {
        this.sqlStatements = sqlStatements;
    }

    /**
     * SQL statement(s) to be executed. Statements can be chained by using semicolons
     * 
     * @return SQL statement(s) to be executed. Statements can be chained by using semicolons
     */

    public String getSqlStatements() {
        return this.sqlStatements;
    }

    /**
     * SQL statement(s) to be executed. Statements can be chained by using semicolons
     * 
     * @param sqlStatements
     *        SQL statement(s) to be executed. Statements can be chained by using semicolons
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlRequest withSqlStatements(String sqlStatements) {
        setSqlStatements(sqlStatements);
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
        if (getAwsSecretStoreArn() != null)
            sb.append("AwsSecretStoreArn: ").append(getAwsSecretStoreArn()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getDbClusterOrInstanceArn() != null)
            sb.append("DbClusterOrInstanceArn: ").append(getDbClusterOrInstanceArn()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getSqlStatements() != null)
            sb.append("SqlStatements: ").append(getSqlStatements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteSqlRequest == false)
            return false;
        ExecuteSqlRequest other = (ExecuteSqlRequest) obj;
        if (other.getAwsSecretStoreArn() == null ^ this.getAwsSecretStoreArn() == null)
            return false;
        if (other.getAwsSecretStoreArn() != null && other.getAwsSecretStoreArn().equals(this.getAwsSecretStoreArn()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getDbClusterOrInstanceArn() == null ^ this.getDbClusterOrInstanceArn() == null)
            return false;
        if (other.getDbClusterOrInstanceArn() != null && other.getDbClusterOrInstanceArn().equals(this.getDbClusterOrInstanceArn()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getSqlStatements() == null ^ this.getSqlStatements() == null)
            return false;
        if (other.getSqlStatements() != null && other.getSqlStatements().equals(this.getSqlStatements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsSecretStoreArn() == null) ? 0 : getAwsSecretStoreArn().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getDbClusterOrInstanceArn() == null) ? 0 : getDbClusterOrInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getSqlStatements() == null) ? 0 : getSqlStatements().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteSqlRequest clone() {
        return (ExecuteSqlRequest) super.clone();
    }

}
