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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon RDS HTTP endpoint configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/RdsHttpEndpointConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsHttpEndpointConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS Region for RDS HTTP endpoint.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * Amazon RDS cluster identifier.
     * </p>
     */
    private String dbClusterIdentifier;
    /**
     * <p>
     * Logical database name.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Logical schema name.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * AWS secret store ARN for database credentials.
     * </p>
     */
    private String awsSecretStoreArn;

    /**
     * <p>
     * AWS Region for RDS HTTP endpoint.
     * </p>
     * 
     * @param awsRegion
     *        AWS Region for RDS HTTP endpoint.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * AWS Region for RDS HTTP endpoint.
     * </p>
     * 
     * @return AWS Region for RDS HTTP endpoint.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * AWS Region for RDS HTTP endpoint.
     * </p>
     * 
     * @param awsRegion
     *        AWS Region for RDS HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsHttpEndpointConfig withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * Amazon RDS cluster identifier.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        Amazon RDS cluster identifier.
     */

    public void setDbClusterIdentifier(String dbClusterIdentifier) {
        this.dbClusterIdentifier = dbClusterIdentifier;
    }

    /**
     * <p>
     * Amazon RDS cluster identifier.
     * </p>
     * 
     * @return Amazon RDS cluster identifier.
     */

    public String getDbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * <p>
     * Amazon RDS cluster identifier.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        Amazon RDS cluster identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsHttpEndpointConfig withDbClusterIdentifier(String dbClusterIdentifier) {
        setDbClusterIdentifier(dbClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Logical database name.
     * </p>
     * 
     * @param databaseName
     *        Logical database name.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Logical database name.
     * </p>
     * 
     * @return Logical database name.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Logical database name.
     * </p>
     * 
     * @param databaseName
     *        Logical database name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsHttpEndpointConfig withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Logical schema name.
     * </p>
     * 
     * @param schema
     *        Logical schema name.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * Logical schema name.
     * </p>
     * 
     * @return Logical schema name.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * Logical schema name.
     * </p>
     * 
     * @param schema
     *        Logical schema name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsHttpEndpointConfig withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * AWS secret store ARN for database credentials.
     * </p>
     * 
     * @param awsSecretStoreArn
     *        AWS secret store ARN for database credentials.
     */

    public void setAwsSecretStoreArn(String awsSecretStoreArn) {
        this.awsSecretStoreArn = awsSecretStoreArn;
    }

    /**
     * <p>
     * AWS secret store ARN for database credentials.
     * </p>
     * 
     * @return AWS secret store ARN for database credentials.
     */

    public String getAwsSecretStoreArn() {
        return this.awsSecretStoreArn;
    }

    /**
     * <p>
     * AWS secret store ARN for database credentials.
     * </p>
     * 
     * @param awsSecretStoreArn
     *        AWS secret store ARN for database credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsHttpEndpointConfig withAwsSecretStoreArn(String awsSecretStoreArn) {
        setAwsSecretStoreArn(awsSecretStoreArn);
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
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getDbClusterIdentifier() != null)
            sb.append("DbClusterIdentifier: ").append(getDbClusterIdentifier()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getAwsSecretStoreArn() != null)
            sb.append("AwsSecretStoreArn: ").append(getAwsSecretStoreArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsHttpEndpointConfig == false)
            return false;
        RdsHttpEndpointConfig other = (RdsHttpEndpointConfig) obj;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getDbClusterIdentifier() == null ^ this.getDbClusterIdentifier() == null)
            return false;
        if (other.getDbClusterIdentifier() != null && other.getDbClusterIdentifier().equals(this.getDbClusterIdentifier()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getAwsSecretStoreArn() == null ^ this.getAwsSecretStoreArn() == null)
            return false;
        if (other.getAwsSecretStoreArn() != null && other.getAwsSecretStoreArn().equals(this.getAwsSecretStoreArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getDbClusterIdentifier() == null) ? 0 : getDbClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getAwsSecretStoreArn() == null) ? 0 : getAwsSecretStoreArn().hashCode());
        return hashCode;
    }

    @Override
    public RdsHttpEndpointConfig clone() {
        try {
            return (RdsHttpEndpointConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.RdsHttpEndpointConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
