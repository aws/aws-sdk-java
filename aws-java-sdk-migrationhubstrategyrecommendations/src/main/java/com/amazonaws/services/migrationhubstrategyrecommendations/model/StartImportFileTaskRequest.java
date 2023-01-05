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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartImportFileTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportFileTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The S3 bucket where the import file is located. The bucket name is required to begin with
     * <code>migrationhub-strategy-</code>.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that the
     * servers specified in the import file are available in AWS Application Discovery Service.
     * </p>
     */
    private String dataSourceType;
    /**
     * <p>
     * Groups the resources in the import file together with a unique name. This ID can be as filter in
     * <code>ListApplicationComponents</code> and <code>ListServers</code>.
     * </p>
     */
    private java.util.List<Group> groupId;
    /**
     * <p>
     * A descriptive name for the request.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The S3 bucket where Strategy Recommendations uploads import results. The bucket name is required to begin with
     * migrationhub-strategy-.
     * </p>
     */
    private String s3bucketForReportData;
    /**
     * <p>
     * The Amazon S3 key name of the import file.
     * </p>
     */
    private String s3key;

    /**
     * <p>
     * The S3 bucket where the import file is located. The bucket name is required to begin with
     * <code>migrationhub-strategy-</code>.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket where the import file is located. The bucket name is required to begin with
     *        <code>migrationhub-strategy-</code>.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the import file is located. The bucket name is required to begin with
     * <code>migrationhub-strategy-</code>.
     * </p>
     * 
     * @return The S3 bucket where the import file is located. The bucket name is required to begin with
     *         <code>migrationhub-strategy-</code>.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the import file is located. The bucket name is required to begin with
     * <code>migrationhub-strategy-</code>.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket where the import file is located. The bucket name is required to begin with
     *        <code>migrationhub-strategy-</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportFileTaskRequest withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that the
     * servers specified in the import file are available in AWS Application Discovery Service.
     * </p>
     * 
     * @param dataSourceType
     *        Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that
     *        the servers specified in the import file are available in AWS Application Discovery Service.
     * @see DataSourceType
     */

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    /**
     * <p>
     * Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that the
     * servers specified in the import file are available in AWS Application Discovery Service.
     * </p>
     * 
     * @return Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that
     *         the servers specified in the import file are available in AWS Application Discovery Service.
     * @see DataSourceType
     */

    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * <p>
     * Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that the
     * servers specified in the import file are available in AWS Application Discovery Service.
     * </p>
     * 
     * @param dataSourceType
     *        Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that
     *        the servers specified in the import file are available in AWS Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public StartImportFileTaskRequest withDataSourceType(String dataSourceType) {
        setDataSourceType(dataSourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that the
     * servers specified in the import file are available in AWS Application Discovery Service.
     * </p>
     * 
     * @param dataSourceType
     *        Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that
     *        the servers specified in the import file are available in AWS Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public StartImportFileTaskRequest withDataSourceType(DataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType.toString();
        return this;
    }

    /**
     * <p>
     * Groups the resources in the import file together with a unique name. This ID can be as filter in
     * <code>ListApplicationComponents</code> and <code>ListServers</code>.
     * </p>
     * 
     * @return Groups the resources in the import file together with a unique name. This ID can be as filter in
     *         <code>ListApplicationComponents</code> and <code>ListServers</code>.
     */

    public java.util.List<Group> getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * Groups the resources in the import file together with a unique name. This ID can be as filter in
     * <code>ListApplicationComponents</code> and <code>ListServers</code>.
     * </p>
     * 
     * @param groupId
     *        Groups the resources in the import file together with a unique name. This ID can be as filter in
     *        <code>ListApplicationComponents</code> and <code>ListServers</code>.
     */

    public void setGroupId(java.util.Collection<Group> groupId) {
        if (groupId == null) {
            this.groupId = null;
            return;
        }

        this.groupId = new java.util.ArrayList<Group>(groupId);
    }

    /**
     * <p>
     * Groups the resources in the import file together with a unique name. This ID can be as filter in
     * <code>ListApplicationComponents</code> and <code>ListServers</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupId(java.util.Collection)} or {@link #withGroupId(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupId
     *        Groups the resources in the import file together with a unique name. This ID can be as filter in
     *        <code>ListApplicationComponents</code> and <code>ListServers</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportFileTaskRequest withGroupId(Group... groupId) {
        if (this.groupId == null) {
            setGroupId(new java.util.ArrayList<Group>(groupId.length));
        }
        for (Group ele : groupId) {
            this.groupId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Groups the resources in the import file together with a unique name. This ID can be as filter in
     * <code>ListApplicationComponents</code> and <code>ListServers</code>.
     * </p>
     * 
     * @param groupId
     *        Groups the resources in the import file together with a unique name. This ID can be as filter in
     *        <code>ListApplicationComponents</code> and <code>ListServers</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportFileTaskRequest withGroupId(java.util.Collection<Group> groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * A descriptive name for the request.
     * </p>
     * 
     * @param name
     *        A descriptive name for the request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for the request.
     * </p>
     * 
     * @return A descriptive name for the request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for the request.
     * </p>
     * 
     * @param name
     *        A descriptive name for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportFileTaskRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where Strategy Recommendations uploads import results. The bucket name is required to begin with
     * migrationhub-strategy-.
     * </p>
     * 
     * @param s3bucketForReportData
     *        The S3 bucket where Strategy Recommendations uploads import results. The bucket name is required to begin
     *        with migrationhub-strategy-.
     */

    public void setS3bucketForReportData(String s3bucketForReportData) {
        this.s3bucketForReportData = s3bucketForReportData;
    }

    /**
     * <p>
     * The S3 bucket where Strategy Recommendations uploads import results. The bucket name is required to begin with
     * migrationhub-strategy-.
     * </p>
     * 
     * @return The S3 bucket where Strategy Recommendations uploads import results. The bucket name is required to begin
     *         with migrationhub-strategy-.
     */

    public String getS3bucketForReportData() {
        return this.s3bucketForReportData;
    }

    /**
     * <p>
     * The S3 bucket where Strategy Recommendations uploads import results. The bucket name is required to begin with
     * migrationhub-strategy-.
     * </p>
     * 
     * @param s3bucketForReportData
     *        The S3 bucket where Strategy Recommendations uploads import results. The bucket name is required to begin
     *        with migrationhub-strategy-.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportFileTaskRequest withS3bucketForReportData(String s3bucketForReportData) {
        setS3bucketForReportData(s3bucketForReportData);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key name of the import file.
     * </p>
     * 
     * @param s3key
     *        The Amazon S3 key name of the import file.
     */

    public void setS3key(String s3key) {
        this.s3key = s3key;
    }

    /**
     * <p>
     * The Amazon S3 key name of the import file.
     * </p>
     * 
     * @return The Amazon S3 key name of the import file.
     */

    public String getS3key() {
        return this.s3key;
    }

    /**
     * <p>
     * The Amazon S3 key name of the import file.
     * </p>
     * 
     * @param s3key
     *        The Amazon S3 key name of the import file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportFileTaskRequest withS3key(String s3key) {
        setS3key(s3key);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getDataSourceType() != null)
            sb.append("DataSourceType: ").append(getDataSourceType()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3bucketForReportData() != null)
            sb.append("S3bucketForReportData: ").append(getS3bucketForReportData()).append(",");
        if (getS3key() != null)
            sb.append("S3key: ").append(getS3key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportFileTaskRequest == false)
            return false;
        StartImportFileTaskRequest other = (StartImportFileTaskRequest) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getDataSourceType() == null ^ this.getDataSourceType() == null)
            return false;
        if (other.getDataSourceType() != null && other.getDataSourceType().equals(this.getDataSourceType()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3bucketForReportData() == null ^ this.getS3bucketForReportData() == null)
            return false;
        if (other.getS3bucketForReportData() != null && other.getS3bucketForReportData().equals(this.getS3bucketForReportData()) == false)
            return false;
        if (other.getS3key() == null ^ this.getS3key() == null)
            return false;
        if (other.getS3key() != null && other.getS3key().equals(this.getS3key()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getDataSourceType() == null) ? 0 : getDataSourceType().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3bucketForReportData() == null) ? 0 : getS3bucketForReportData().hashCode());
        hashCode = prime * hashCode + ((getS3key() == null) ? 0 : getS3key().hashCode());
        return hashCode;
    }

    @Override
    public StartImportFileTaskRequest clone() {
        return (StartImportFileTaskRequest) super.clone();
    }

}
