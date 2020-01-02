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
 * The request parameters represent the input of a request to run one or more SQL statements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteSqlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
     * </p>
     */
    private String awsSecretStoreArn;
    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The ARN of the Aurora Serverless DB cluster.
     * </p>
     */
    private String dbClusterOrInstanceArn;
    /**
     * <p>
     * The name of the database schema.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * One or more SQL statements to run on the DB cluster.
     * </p>
     * <p>
     * You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is permitted,
     * including data definition, data manipulation, and commit statements.
     * </p>
     */
    private String sqlStatements;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @param awsSecretStoreArn
     *        The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
     */

    public void setAwsSecretStoreArn(String awsSecretStoreArn) {
        this.awsSecretStoreArn = awsSecretStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
     */

    public String getAwsSecretStoreArn() {
        return this.awsSecretStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @param awsSecretStoreArn
     *        The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlRequest withAwsSecretStoreArn(String awsSecretStoreArn) {
        setAwsSecretStoreArn(awsSecretStoreArn);
        return this;
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

    public ExecuteSqlRequest withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The ARN of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @param dbClusterOrInstanceArn
     *        The ARN of the Aurora Serverless DB cluster.
     */

    public void setDbClusterOrInstanceArn(String dbClusterOrInstanceArn) {
        this.dbClusterOrInstanceArn = dbClusterOrInstanceArn;
    }

    /**
     * <p>
     * The ARN of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @return The ARN of the Aurora Serverless DB cluster.
     */

    public String getDbClusterOrInstanceArn() {
        return this.dbClusterOrInstanceArn;
    }

    /**
     * <p>
     * The ARN of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @param dbClusterOrInstanceArn
     *        The ARN of the Aurora Serverless DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlRequest withDbClusterOrInstanceArn(String dbClusterOrInstanceArn) {
        setDbClusterOrInstanceArn(dbClusterOrInstanceArn);
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

    public ExecuteSqlRequest withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * One or more SQL statements to run on the DB cluster.
     * </p>
     * <p>
     * You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is permitted,
     * including data definition, data manipulation, and commit statements.
     * </p>
     * 
     * @param sqlStatements
     *        One or more SQL statements to run on the DB cluster.</p>
     *        <p>
     *        You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is
     *        permitted, including data definition, data manipulation, and commit statements.
     */

    public void setSqlStatements(String sqlStatements) {
        this.sqlStatements = sqlStatements;
    }

    /**
     * <p>
     * One or more SQL statements to run on the DB cluster.
     * </p>
     * <p>
     * You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is permitted,
     * including data definition, data manipulation, and commit statements.
     * </p>
     * 
     * @return One or more SQL statements to run on the DB cluster.</p>
     *         <p>
     *         You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is
     *         permitted, including data definition, data manipulation, and commit statements.
     */

    public String getSqlStatements() {
        return this.sqlStatements;
    }

    /**
     * <p>
     * One or more SQL statements to run on the DB cluster.
     * </p>
     * <p>
     * You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is permitted,
     * including data definition, data manipulation, and commit statements.
     * </p>
     * 
     * @param sqlStatements
     *        One or more SQL statements to run on the DB cluster.</p>
     *        <p>
     *        You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is
     *        permitted, including data definition, data manipulation, and commit statements.
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
