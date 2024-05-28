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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartColumnStatisticsTaskRun" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartColumnStatisticsTaskRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database where the table resides.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table to generate statistics.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A list of the column names to generate statistics. If none is supplied, all column names for the table will be
     * used by default.
     * </p>
     */
    private java.util.List<String> columnNameList;
    /**
     * <p>
     * The IAM role that the service assumes to generate statistics.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     * generate stats.
     * </p>
     */
    private Double sampleSize;
    /**
     * <p>
     * The ID of the Data Catalog where the table reside. If none is supplied, the Amazon Web Services account ID is
     * used by default.
     * </p>
     */
    private String catalogID;
    /**
     * <p>
     * Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * </p>
     */
    private String securityConfiguration;

    /**
     * <p>
     * The name of the database where the table resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the database where the table resides.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database where the table resides.
     * </p>
     * 
     * @return The name of the database where the table resides.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database where the table resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the database where the table resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartColumnStatisticsTaskRunRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table to generate statistics.
     * </p>
     * 
     * @param tableName
     *        The name of the table to generate statistics.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to generate statistics.
     * </p>
     * 
     * @return The name of the table to generate statistics.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table to generate statistics.
     * </p>
     * 
     * @param tableName
     *        The name of the table to generate statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartColumnStatisticsTaskRunRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A list of the column names to generate statistics. If none is supplied, all column names for the table will be
     * used by default.
     * </p>
     * 
     * @return A list of the column names to generate statistics. If none is supplied, all column names for the table
     *         will be used by default.
     */

    public java.util.List<String> getColumnNameList() {
        return columnNameList;
    }

    /**
     * <p>
     * A list of the column names to generate statistics. If none is supplied, all column names for the table will be
     * used by default.
     * </p>
     * 
     * @param columnNameList
     *        A list of the column names to generate statistics. If none is supplied, all column names for the table
     *        will be used by default.
     */

    public void setColumnNameList(java.util.Collection<String> columnNameList) {
        if (columnNameList == null) {
            this.columnNameList = null;
            return;
        }

        this.columnNameList = new java.util.ArrayList<String>(columnNameList);
    }

    /**
     * <p>
     * A list of the column names to generate statistics. If none is supplied, all column names for the table will be
     * used by default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnNameList(java.util.Collection)} or {@link #withColumnNameList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param columnNameList
     *        A list of the column names to generate statistics. If none is supplied, all column names for the table
     *        will be used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartColumnStatisticsTaskRunRequest withColumnNameList(String... columnNameList) {
        if (this.columnNameList == null) {
            setColumnNameList(new java.util.ArrayList<String>(columnNameList.length));
        }
        for (String ele : columnNameList) {
            this.columnNameList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the column names to generate statistics. If none is supplied, all column names for the table will be
     * used by default.
     * </p>
     * 
     * @param columnNameList
     *        A list of the column names to generate statistics. If none is supplied, all column names for the table
     *        will be used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartColumnStatisticsTaskRunRequest withColumnNameList(java.util.Collection<String> columnNameList) {
        setColumnNameList(columnNameList);
        return this;
    }

    /**
     * <p>
     * The IAM role that the service assumes to generate statistics.
     * </p>
     * 
     * @param role
     *        The IAM role that the service assumes to generate statistics.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM role that the service assumes to generate statistics.
     * </p>
     * 
     * @return The IAM role that the service assumes to generate statistics.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM role that the service assumes to generate statistics.
     * </p>
     * 
     * @param role
     *        The IAM role that the service assumes to generate statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartColumnStatisticsTaskRunRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     * generate stats.
     * </p>
     * 
     * @param sampleSize
     *        The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     *        generate stats.
     */

    public void setSampleSize(Double sampleSize) {
        this.sampleSize = sampleSize;
    }

    /**
     * <p>
     * The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     * generate stats.
     * </p>
     * 
     * @return The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     *         generate stats.
     */

    public Double getSampleSize() {
        return this.sampleSize;
    }

    /**
     * <p>
     * The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     * generate stats.
     * </p>
     * 
     * @param sampleSize
     *        The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     *        generate stats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartColumnStatisticsTaskRunRequest withSampleSize(Double sampleSize) {
        setSampleSize(sampleSize);
        return this;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table reside. If none is supplied, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @param catalogID
     *        The ID of the Data Catalog where the table reside. If none is supplied, the Amazon Web Services account ID
     *        is used by default.
     */

    public void setCatalogID(String catalogID) {
        this.catalogID = catalogID;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table reside. If none is supplied, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the table reside. If none is supplied, the Amazon Web Services account
     *         ID is used by default.
     */

    public String getCatalogID() {
        return this.catalogID;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table reside. If none is supplied, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @param catalogID
     *        The ID of the Data Catalog where the table reside. If none is supplied, the Amazon Web Services account ID
     *        is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartColumnStatisticsTaskRunRequest withCatalogID(String catalogID) {
        setCatalogID(catalogID);
        return this;
    }

    /**
     * <p>
     * Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * </p>
     * 
     * @param securityConfiguration
     *        Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * </p>
     * 
     * @return Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * </p>
     * 
     * @param securityConfiguration
     *        Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartColumnStatisticsTaskRunRequest withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getColumnNameList() != null)
            sb.append("ColumnNameList: ").append(getColumnNameList()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSampleSize() != null)
            sb.append("SampleSize: ").append(getSampleSize()).append(",");
        if (getCatalogID() != null)
            sb.append("CatalogID: ").append(getCatalogID()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartColumnStatisticsTaskRunRequest == false)
            return false;
        StartColumnStatisticsTaskRunRequest other = (StartColumnStatisticsTaskRunRequest) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getColumnNameList() == null ^ this.getColumnNameList() == null)
            return false;
        if (other.getColumnNameList() != null && other.getColumnNameList().equals(this.getColumnNameList()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSampleSize() == null ^ this.getSampleSize() == null)
            return false;
        if (other.getSampleSize() != null && other.getSampleSize().equals(this.getSampleSize()) == false)
            return false;
        if (other.getCatalogID() == null ^ this.getCatalogID() == null)
            return false;
        if (other.getCatalogID() != null && other.getCatalogID().equals(this.getCatalogID()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getColumnNameList() == null) ? 0 : getColumnNameList().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSampleSize() == null) ? 0 : getSampleSize().hashCode());
        hashCode = prime * hashCode + ((getCatalogID() == null) ? 0 : getCatalogID().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StartColumnStatisticsTaskRunRequest clone() {
        return (StartColumnStatisticsTaskRunRequest) super.clone();
    }

}
