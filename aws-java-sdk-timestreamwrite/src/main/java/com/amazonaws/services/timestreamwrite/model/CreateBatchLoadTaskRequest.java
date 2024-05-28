/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateBatchLoadTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBatchLoadTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String clientToken;

    private DataModelConfiguration dataModelConfiguration;
    /**
     * <p>
     * Defines configuration details about the data source for a batch load task.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;

    private ReportConfiguration reportConfiguration;
    /**
     * <p>
     * Target Timestream database for a batch load task.
     * </p>
     */
    private String targetDatabaseName;
    /**
     * <p>
     * Target Timestream table for a batch load task.
     * </p>
     */
    private String targetTableName;
    /** <p/> */
    private Long recordVersion;

    /**
     * <p/>
     * 
     * @param clientToken
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p/>
     * 
     * @param clientToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchLoadTaskRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * @param dataModelConfiguration
     */

    public void setDataModelConfiguration(DataModelConfiguration dataModelConfiguration) {
        this.dataModelConfiguration = dataModelConfiguration;
    }

    /**
     * @return
     */

    public DataModelConfiguration getDataModelConfiguration() {
        return this.dataModelConfiguration;
    }

    /**
     * @param dataModelConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchLoadTaskRequest withDataModelConfiguration(DataModelConfiguration dataModelConfiguration) {
        setDataModelConfiguration(dataModelConfiguration);
        return this;
    }

    /**
     * <p>
     * Defines configuration details about the data source for a batch load task.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Defines configuration details about the data source for a batch load task.
     */

    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Defines configuration details about the data source for a batch load task.
     * </p>
     * 
     * @return Defines configuration details about the data source for a batch load task.
     */

    public DataSourceConfiguration getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }

    /**
     * <p>
     * Defines configuration details about the data source for a batch load task.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Defines configuration details about the data source for a batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchLoadTaskRequest withDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        setDataSourceConfiguration(dataSourceConfiguration);
        return this;
    }

    /**
     * @param reportConfiguration
     */

    public void setReportConfiguration(ReportConfiguration reportConfiguration) {
        this.reportConfiguration = reportConfiguration;
    }

    /**
     * @return
     */

    public ReportConfiguration getReportConfiguration() {
        return this.reportConfiguration;
    }

    /**
     * @param reportConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchLoadTaskRequest withReportConfiguration(ReportConfiguration reportConfiguration) {
        setReportConfiguration(reportConfiguration);
        return this;
    }

    /**
     * <p>
     * Target Timestream database for a batch load task.
     * </p>
     * 
     * @param targetDatabaseName
     *        Target Timestream database for a batch load task.
     */

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * <p>
     * Target Timestream database for a batch load task.
     * </p>
     * 
     * @return Target Timestream database for a batch load task.
     */

    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * <p>
     * Target Timestream database for a batch load task.
     * </p>
     * 
     * @param targetDatabaseName
     *        Target Timestream database for a batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchLoadTaskRequest withTargetDatabaseName(String targetDatabaseName) {
        setTargetDatabaseName(targetDatabaseName);
        return this;
    }

    /**
     * <p>
     * Target Timestream table for a batch load task.
     * </p>
     * 
     * @param targetTableName
     *        Target Timestream table for a batch load task.
     */

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * Target Timestream table for a batch load task.
     * </p>
     * 
     * @return Target Timestream table for a batch load task.
     */

    public String getTargetTableName() {
        return this.targetTableName;
    }

    /**
     * <p>
     * Target Timestream table for a batch load task.
     * </p>
     * 
     * @param targetTableName
     *        Target Timestream table for a batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchLoadTaskRequest withTargetTableName(String targetTableName) {
        setTargetTableName(targetTableName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param recordVersion
     */

    public void setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getRecordVersion() {
        return this.recordVersion;
    }

    /**
     * <p/>
     * 
     * @param recordVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchLoadTaskRequest withRecordVersion(Long recordVersion) {
        setRecordVersion(recordVersion);
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
            sb.append("ClientToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getDataModelConfiguration() != null)
            sb.append("DataModelConfiguration: ").append(getDataModelConfiguration()).append(",");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: ").append(getDataSourceConfiguration()).append(",");
        if (getReportConfiguration() != null)
            sb.append("ReportConfiguration: ").append(getReportConfiguration()).append(",");
        if (getTargetDatabaseName() != null)
            sb.append("TargetDatabaseName: ").append(getTargetDatabaseName()).append(",");
        if (getTargetTableName() != null)
            sb.append("TargetTableName: ").append(getTargetTableName()).append(",");
        if (getRecordVersion() != null)
            sb.append("RecordVersion: ").append(getRecordVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBatchLoadTaskRequest == false)
            return false;
        CreateBatchLoadTaskRequest other = (CreateBatchLoadTaskRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDataModelConfiguration() == null ^ this.getDataModelConfiguration() == null)
            return false;
        if (other.getDataModelConfiguration() != null && other.getDataModelConfiguration().equals(this.getDataModelConfiguration()) == false)
            return false;
        if (other.getDataSourceConfiguration() == null ^ this.getDataSourceConfiguration() == null)
            return false;
        if (other.getDataSourceConfiguration() != null && other.getDataSourceConfiguration().equals(this.getDataSourceConfiguration()) == false)
            return false;
        if (other.getReportConfiguration() == null ^ this.getReportConfiguration() == null)
            return false;
        if (other.getReportConfiguration() != null && other.getReportConfiguration().equals(this.getReportConfiguration()) == false)
            return false;
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null)
            return false;
        if (other.getTargetDatabaseName() != null && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false)
            return false;
        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getRecordVersion() == null ^ this.getRecordVersion() == null)
            return false;
        if (other.getRecordVersion() != null && other.getRecordVersion().equals(this.getRecordVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDataModelConfiguration() == null) ? 0 : getDataModelConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getReportConfiguration() == null) ? 0 : getReportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTargetDatabaseName() == null) ? 0 : getTargetDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime * hashCode + ((getRecordVersion() == null) ? 0 : getRecordVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateBatchLoadTaskRequest clone() {
        return (CreateBatchLoadTaskRequest) super.clone();
    }

}
