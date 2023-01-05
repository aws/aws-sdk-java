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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of attributes associated with a job run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/JobRunSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobRunSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application the job is running on.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the job run.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the job run.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The user who created the job run.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the job run was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The state of the job run.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The state details of the job run.
     * </p>
     */
    private String stateDetails;
    /**
     * <p>
     * The EMR release version associated with the application your job is running on.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The type of job run, such as Spark or Hive.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the application the job is running on.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application the job is running on.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application the job is running on.
     * </p>
     * 
     * @return The ID of the application the job is running on.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application the job is running on.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application the job is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @param id
     *        The ID of the job run.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @return The ID of the job run.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @param id
     *        The ID of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     * 
     * @param name
     *        The optional job run name. This doesn't have to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     * 
     * @return The optional job run name. This doesn't have to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     * 
     * @param name
     *        The optional job run name. This doesn't have to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the job run.
     * </p>
     * 
     * @param arn
     *        The ARN of the job run.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the job run.
     * </p>
     * 
     * @return The ARN of the job run.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the job run.
     * </p>
     * 
     * @param arn
     *        The ARN of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The user who created the job run.
     * </p>
     * 
     * @param createdBy
     *        The user who created the job run.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user who created the job run.
     * </p>
     * 
     * @return The user who created the job run.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user who created the job run.
     * </p>
     * 
     * @param createdBy
     *        The user who created the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the job run was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     * 
     * @return The date and time when the job run was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the job run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the job run was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the job run was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the job run was last updated.
     * </p>
     * 
     * @return The date and time when the job run was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the job run was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the job run was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param executionRole
     *        The execution role ARN of the job run.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @return The execution role ARN of the job run.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param executionRole
     *        The execution role ARN of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The state of the job run.
     * </p>
     * 
     * @param state
     *        The state of the job run.
     * @see JobRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job run.
     * </p>
     * 
     * @return The state of the job run.
     * @see JobRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the job run.
     * </p>
     * 
     * @param state
     *        The state of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public JobRunSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the job run.
     * </p>
     * 
     * @param state
     *        The state of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public JobRunSummary withState(JobRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The state details of the job run.
     * </p>
     * 
     * @param stateDetails
     *        The state details of the job run.
     */

    public void setStateDetails(String stateDetails) {
        this.stateDetails = stateDetails;
    }

    /**
     * <p>
     * The state details of the job run.
     * </p>
     * 
     * @return The state details of the job run.
     */

    public String getStateDetails() {
        return this.stateDetails;
    }

    /**
     * <p>
     * The state details of the job run.
     * </p>
     * 
     * @param stateDetails
     *        The state details of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withStateDetails(String stateDetails) {
        setStateDetails(stateDetails);
        return this;
    }

    /**
     * <p>
     * The EMR release version associated with the application your job is running on.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version associated with the application your job is running on.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The EMR release version associated with the application your job is running on.
     * </p>
     * 
     * @return The EMR release version associated with the application your job is running on.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The EMR release version associated with the application your job is running on.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version associated with the application your job is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The type of job run, such as Spark or Hive.
     * </p>
     * 
     * @param type
     *        The type of job run, such as Spark or Hive.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of job run, such as Spark or Hive.
     * </p>
     * 
     * @return The type of job run, such as Spark or Hive.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of job run, such as Spark or Hive.
     * </p>
     * 
     * @param type
     *        The type of job run, such as Spark or Hive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunSummary withType(String type) {
        setType(type);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateDetails() != null)
            sb.append("StateDetails: ").append(getStateDetails()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobRunSummary == false)
            return false;
        JobRunSummary other = (JobRunSummary) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateDetails() == null ^ this.getStateDetails() == null)
            return false;
        if (other.getStateDetails() != null && other.getStateDetails().equals(this.getStateDetails()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateDetails() == null) ? 0 : getStateDetails().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public JobRunSummary clone() {
        try {
            return (JobRunSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.JobRunSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
