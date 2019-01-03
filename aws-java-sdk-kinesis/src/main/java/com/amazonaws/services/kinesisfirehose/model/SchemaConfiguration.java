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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the schema to which you want Kinesis Data Firehose to configure your data before it writes it to Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SchemaConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for
     * Kinesis Data Firehose. Cross-account roles aren't allowed.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * Specifies the name of the AWS Glue database that contains the schema for the output data.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * If you don't specify an AWS Region, the default is the current Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to
     * <code>LATEST</code>, Kinesis Data Firehose uses the most recent version. This means that any updates to the table
     * are automatically picked up.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for
     * Kinesis Data Firehose. Cross-account roles aren't allowed.
     * </p>
     * 
     * @param roleARN
     *        The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you
     *        use for Kinesis Data Firehose. Cross-account roles aren't allowed.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for
     * Kinesis Data Firehose. Cross-account roles aren't allowed.
     * </p>
     * 
     * @return The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you
     *         use for Kinesis Data Firehose. Cross-account roles aren't allowed.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for
     * Kinesis Data Firehose. Cross-account roles aren't allowed.
     * </p>
     * 
     * @param roleARN
     *        The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you
     *        use for Kinesis Data Firehose. Cross-account roles aren't allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
     * </p>
     * 
     * @return The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConfiguration withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the AWS Glue database that contains the schema for the output data.
     * </p>
     * 
     * @param databaseName
     *        Specifies the name of the AWS Glue database that contains the schema for the output data.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Specifies the name of the AWS Glue database that contains the schema for the output data.
     * </p>
     * 
     * @return Specifies the name of the AWS Glue database that contains the schema for the output data.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Specifies the name of the AWS Glue database that contains the schema for the output data.
     * </p>
     * 
     * @param databaseName
     *        Specifies the name of the AWS Glue database that contains the schema for the output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConfiguration withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
     * </p>
     * 
     * @param tableName
     *        Specifies the AWS Glue table that contains the column information that constitutes your data schema.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
     * </p>
     * 
     * @return Specifies the AWS Glue table that contains the column information that constitutes your data schema.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
     * </p>
     * 
     * @param tableName
     *        Specifies the AWS Glue table that contains the column information that constitutes your data schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConfiguration withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * If you don't specify an AWS Region, the default is the current Region.
     * </p>
     * 
     * @param region
     *        If you don't specify an AWS Region, the default is the current Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * If you don't specify an AWS Region, the default is the current Region.
     * </p>
     * 
     * @return If you don't specify an AWS Region, the default is the current Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * If you don't specify an AWS Region, the default is the current Region.
     * </p>
     * 
     * @param region
     *        If you don't specify an AWS Region, the default is the current Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConfiguration withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to
     * <code>LATEST</code>, Kinesis Data Firehose uses the most recent version. This means that any updates to the table
     * are automatically picked up.
     * </p>
     * 
     * @param versionId
     *        Specifies the table version for the output data schema. If you don't specify this version ID, or if you
     *        set it to <code>LATEST</code>, Kinesis Data Firehose uses the most recent version. This means that any
     *        updates to the table are automatically picked up.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to
     * <code>LATEST</code>, Kinesis Data Firehose uses the most recent version. This means that any updates to the table
     * are automatically picked up.
     * </p>
     * 
     * @return Specifies the table version for the output data schema. If you don't specify this version ID, or if you
     *         set it to <code>LATEST</code>, Kinesis Data Firehose uses the most recent version. This means that any
     *         updates to the table are automatically picked up.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to
     * <code>LATEST</code>, Kinesis Data Firehose uses the most recent version. This means that any updates to the table
     * are automatically picked up.
     * </p>
     * 
     * @param versionId
     *        Specifies the table version for the output data schema. If you don't specify this version ID, or if you
     *        set it to <code>LATEST</code>, Kinesis Data Firehose uses the most recent version. This means that any
     *        updates to the table are automatically picked up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConfiguration withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaConfiguration == false)
            return false;
        SchemaConfiguration other = (SchemaConfiguration) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public SchemaConfiguration clone() {
        try {
            return (SchemaConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SchemaConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
