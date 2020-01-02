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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for coordination with the AWS Glue ETL (extract, transform and load) service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/GlueConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlueConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform and
     * load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and
     * targets.)
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data Catalog
     * database contains Glue Data tables.)
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform and
     * load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and
     * targets.)
     * </p>
     * 
     * @param tableName
     *        The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform
     *        and load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data
     *        sources and targets.)
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform and
     * load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and
     * targets.)
     * </p>
     * 
     * @return The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform
     *         and load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data
     *         sources and targets.)
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform and
     * load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and
     * targets.)
     * </p>
     * 
     * @param tableName
     *        The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform
     *        and load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data
     *        sources and targets.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueConfiguration withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data Catalog
     * database contains Glue Data tables.)
     * </p>
     * 
     * @param databaseName
     *        The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data
     *        Catalog database contains Glue Data tables.)
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data Catalog
     * database contains Glue Data tables.)
     * </p>
     * 
     * @return The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data
     *         Catalog database contains Glue Data tables.)
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data Catalog
     * database contains Glue Data tables.)
     * </p>
     * 
     * @param databaseName
     *        The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data
     *        Catalog database contains Glue Data tables.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueConfiguration withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlueConfiguration == false)
            return false;
        GlueConfiguration other = (GlueConfiguration) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        return hashCode;
    }

    @Override
    public GlueConfiguration clone() {
        try {
            return (GlueConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.GlueConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
