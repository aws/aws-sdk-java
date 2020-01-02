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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the data source. A data source name can't be changed without deleting and recreating the data
     * source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the index that should be associated with this data source.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The connector configuration information that is required to access the repository.
     * </p>
     */
    private DataSourceConfiguration configuration;
    /**
     * <p>
     * A description for the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If you
     * don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> operation to update the index.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon Kendra</a>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A unique name for the data source. A data source name can't be changed without deleting and recreating the data
     * source.
     * </p>
     * 
     * @param name
     *        A unique name for the data source. A data source name can't be changed without deleting and recreating the
     *        data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the data source. A data source name can't be changed without deleting and recreating the data
     * source.
     * </p>
     * 
     * @return A unique name for the data source. A data source name can't be changed without deleting and recreating
     *         the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the data source. A data source name can't be changed without deleting and recreating the data
     * source.
     * </p>
     * 
     * @param name
     *        A unique name for the data source. A data source name can't be changed without deleting and recreating the
     *        data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the index that should be associated with this data source.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that should be associated with this data source.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that should be associated with this data source.
     * </p>
     * 
     * @return The identifier of the index that should be associated with this data source.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that should be associated with this data source.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that should be associated with this data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     * 
     * @param type
     *        The type of repository that contains the data source.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     * 
     * @return The type of repository that contains the data source.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     * 
     * @param type
     *        The type of repository that contains the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateDataSourceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     * 
     * @param type
     *        The type of repository that contains the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateDataSourceRequest withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The connector configuration information that is required to access the repository.
     * </p>
     * 
     * @param configuration
     *        The connector configuration information that is required to access the repository.
     */

    public void setConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The connector configuration information that is required to access the repository.
     * </p>
     * 
     * @return The connector configuration information that is required to access the repository.
     */

    public DataSourceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The connector configuration information that is required to access the repository.
     * </p>
     * 
     * @param configuration
     *        The connector configuration information that is required to access the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withConfiguration(DataSourceConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A description for the data source.
     * </p>
     * 
     * @param description
     *        A description for the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the data source.
     * </p>
     * 
     * @return A description for the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the data source.
     * </p>
     * 
     * @param description
     *        A description for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If you
     * don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> operation to update the index.
     * </p>
     * 
     * @param schedule
     *        Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If
     *        you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     *        <code>StartDataSourceSyncJob</code> operation to update the index.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If you
     * don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> operation to update the index.
     * </p>
     * 
     * @return Sets the frequency that Amazon Kendra will check the documents in your repository and update the index.
     *         If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     *         <code>StartDataSourceSyncJob</code> operation to update the index.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If you
     * don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> operation to update the index.
     * </p>
     * 
     * @param schedule
     *        Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If
     *        you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     *        <code>StartDataSourceSyncJob</code> operation to update the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information,
     *        see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information,
     *         see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     *         Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information,
     *        see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceRequest == false)
            return false;
        CreateDataSourceRequest other = (CreateDataSourceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceRequest clone() {
        return (CreateDataSourceRequest) super.clone();
    }

}
