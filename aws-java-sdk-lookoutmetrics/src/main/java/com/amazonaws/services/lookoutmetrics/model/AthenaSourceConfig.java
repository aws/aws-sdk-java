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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an Amazon Athena datasource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AthenaSourceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AthenaSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An IAM role that gives Amazon Lookout for Metrics permission to access the data.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The database's name.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The database's data catalog.
     * </p>
     */
    private String dataCatalog;
    /**
     * <p>
     * The database's table name.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The database's work group name.
     * </p>
     */
    private String workGroupName;
    /**
     * <p>
     * The database's results path.
     * </p>
     */
    private String s3ResultsPath;
    /**
     * <p>
     * Settings for backtest mode.
     * </p>
     */
    private BackTestConfiguration backTestConfiguration;

    /**
     * <p>
     * An IAM role that gives Amazon Lookout for Metrics permission to access the data.
     * </p>
     * 
     * @param roleArn
     *        An IAM role that gives Amazon Lookout for Metrics permission to access the data.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Lookout for Metrics permission to access the data.
     * </p>
     * 
     * @return An IAM role that gives Amazon Lookout for Metrics permission to access the data.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Lookout for Metrics permission to access the data.
     * </p>
     * 
     * @param roleArn
     *        An IAM role that gives Amazon Lookout for Metrics permission to access the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaSourceConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The database's name.
     * </p>
     * 
     * @param databaseName
     *        The database's name.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database's name.
     * </p>
     * 
     * @return The database's name.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database's name.
     * </p>
     * 
     * @param databaseName
     *        The database's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaSourceConfig withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The database's data catalog.
     * </p>
     * 
     * @param dataCatalog
     *        The database's data catalog.
     */

    public void setDataCatalog(String dataCatalog) {
        this.dataCatalog = dataCatalog;
    }

    /**
     * <p>
     * The database's data catalog.
     * </p>
     * 
     * @return The database's data catalog.
     */

    public String getDataCatalog() {
        return this.dataCatalog;
    }

    /**
     * <p>
     * The database's data catalog.
     * </p>
     * 
     * @param dataCatalog
     *        The database's data catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaSourceConfig withDataCatalog(String dataCatalog) {
        setDataCatalog(dataCatalog);
        return this;
    }

    /**
     * <p>
     * The database's table name.
     * </p>
     * 
     * @param tableName
     *        The database's table name.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The database's table name.
     * </p>
     * 
     * @return The database's table name.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The database's table name.
     * </p>
     * 
     * @param tableName
     *        The database's table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaSourceConfig withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The database's work group name.
     * </p>
     * 
     * @param workGroupName
     *        The database's work group name.
     */

    public void setWorkGroupName(String workGroupName) {
        this.workGroupName = workGroupName;
    }

    /**
     * <p>
     * The database's work group name.
     * </p>
     * 
     * @return The database's work group name.
     */

    public String getWorkGroupName() {
        return this.workGroupName;
    }

    /**
     * <p>
     * The database's work group name.
     * </p>
     * 
     * @param workGroupName
     *        The database's work group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaSourceConfig withWorkGroupName(String workGroupName) {
        setWorkGroupName(workGroupName);
        return this;
    }

    /**
     * <p>
     * The database's results path.
     * </p>
     * 
     * @param s3ResultsPath
     *        The database's results path.
     */

    public void setS3ResultsPath(String s3ResultsPath) {
        this.s3ResultsPath = s3ResultsPath;
    }

    /**
     * <p>
     * The database's results path.
     * </p>
     * 
     * @return The database's results path.
     */

    public String getS3ResultsPath() {
        return this.s3ResultsPath;
    }

    /**
     * <p>
     * The database's results path.
     * </p>
     * 
     * @param s3ResultsPath
     *        The database's results path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaSourceConfig withS3ResultsPath(String s3ResultsPath) {
        setS3ResultsPath(s3ResultsPath);
        return this;
    }

    /**
     * <p>
     * Settings for backtest mode.
     * </p>
     * 
     * @param backTestConfiguration
     *        Settings for backtest mode.
     */

    public void setBackTestConfiguration(BackTestConfiguration backTestConfiguration) {
        this.backTestConfiguration = backTestConfiguration;
    }

    /**
     * <p>
     * Settings for backtest mode.
     * </p>
     * 
     * @return Settings for backtest mode.
     */

    public BackTestConfiguration getBackTestConfiguration() {
        return this.backTestConfiguration;
    }

    /**
     * <p>
     * Settings for backtest mode.
     * </p>
     * 
     * @param backTestConfiguration
     *        Settings for backtest mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaSourceConfig withBackTestConfiguration(BackTestConfiguration backTestConfiguration) {
        setBackTestConfiguration(backTestConfiguration);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDataCatalog() != null)
            sb.append("DataCatalog: ").append(getDataCatalog()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getWorkGroupName() != null)
            sb.append("WorkGroupName: ").append(getWorkGroupName()).append(",");
        if (getS3ResultsPath() != null)
            sb.append("S3ResultsPath: ").append(getS3ResultsPath()).append(",");
        if (getBackTestConfiguration() != null)
            sb.append("BackTestConfiguration: ").append(getBackTestConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AthenaSourceConfig == false)
            return false;
        AthenaSourceConfig other = (AthenaSourceConfig) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDataCatalog() == null ^ this.getDataCatalog() == null)
            return false;
        if (other.getDataCatalog() != null && other.getDataCatalog().equals(this.getDataCatalog()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getWorkGroupName() == null ^ this.getWorkGroupName() == null)
            return false;
        if (other.getWorkGroupName() != null && other.getWorkGroupName().equals(this.getWorkGroupName()) == false)
            return false;
        if (other.getS3ResultsPath() == null ^ this.getS3ResultsPath() == null)
            return false;
        if (other.getS3ResultsPath() != null && other.getS3ResultsPath().equals(this.getS3ResultsPath()) == false)
            return false;
        if (other.getBackTestConfiguration() == null ^ this.getBackTestConfiguration() == null)
            return false;
        if (other.getBackTestConfiguration() != null && other.getBackTestConfiguration().equals(this.getBackTestConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDataCatalog() == null) ? 0 : getDataCatalog().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getWorkGroupName() == null) ? 0 : getWorkGroupName().hashCode());
        hashCode = prime * hashCode + ((getS3ResultsPath() == null) ? 0 : getS3ResultsPath().hashCode());
        hashCode = prime * hashCode + ((getBackTestConfiguration() == null) ? 0 : getBackTestConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AthenaSourceConfig clone() {
        try {
            return (AthenaSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AthenaSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
