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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the data source to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the data source to update. The name of the data source can't be updated. To rename a data source you
     * must delete the data source and re-create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the index that contains the data source to update.
     * </p>
     */
    private String indexId;

    private DataSourceConfiguration configuration;
    /**
     * <p>
     * The new description for the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The new update schedule for the data source.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your behalf.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The unique identifier of the data source to update.
     * </p>
     * 
     * @param id
     *        The unique identifier of the data source to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the data source to update.
     * </p>
     * 
     * @return The unique identifier of the data source to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the data source to update.
     * </p>
     * 
     * @param id
     *        The unique identifier of the data source to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the data source to update. The name of the data source can't be updated. To rename a data source you
     * must delete the data source and re-create it.
     * </p>
     * 
     * @param name
     *        The name of the data source to update. The name of the data source can't be updated. To rename a data
     *        source you must delete the data source and re-create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source to update. The name of the data source can't be updated. To rename a data source you
     * must delete the data source and re-create it.
     * </p>
     * 
     * @return The name of the data source to update. The name of the data source can't be updated. To rename a data
     *         source you must delete the data source and re-create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source to update. The name of the data source can't be updated. To rename a data source you
     * must delete the data source and re-create it.
     * </p>
     * 
     * @param name
     *        The name of the data source to update. The name of the data source can't be updated. To rename a data
     *        source you must delete the data source and re-create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source to update.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the data source to update.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source to update.
     * </p>
     * 
     * @return The identifier of the index that contains the data source to update.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source to update.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the data source to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * @param configuration
     */

    public void setConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * @return
     */

    public DataSourceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * @param configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withConfiguration(DataSourceConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The new description for the data source.
     * </p>
     * 
     * @param description
     *        The new description for the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description for the data source.
     * </p>
     * 
     * @return The new description for the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description for the data source.
     * </p>
     * 
     * @param description
     *        The new description for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The new update schedule for the data source.
     * </p>
     * 
     * @param schedule
     *        The new update schedule for the data source.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The new update schedule for the data source.
     * </p>
     * 
     * @return The new update schedule for the data source.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The new update schedule for the data source.
     * </p>
     * 
     * @param schedule
     *        The new update schedule for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your
     *        behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your
     *         behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withRoleArn(String roleArn) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
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

        if (obj instanceof UpdateDataSourceRequest == false)
            return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSourceRequest clone() {
        return (UpdateDataSourceRequest) super.clone();
    }

}
