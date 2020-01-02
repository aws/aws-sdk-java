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
 * The request parameters represent the input of a request to start a SQL transaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BeginTransaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BeginTransactionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String database;
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

    public BeginTransactionRequest withDatabase(String database) {
        setDatabase(database);
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

    public BeginTransactionRequest withResourceArn(String resourceArn) {
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

    public BeginTransactionRequest withSchema(String schema) {
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

    public BeginTransactionRequest withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BeginTransactionRequest == false)
            return false;
        BeginTransactionRequest other = (BeginTransactionRequest) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public BeginTransactionRequest clone() {
        return (BeginTransactionRequest) super.clone();
    }

}
