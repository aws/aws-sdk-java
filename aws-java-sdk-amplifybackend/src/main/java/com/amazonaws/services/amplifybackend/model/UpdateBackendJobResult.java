/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBackendJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of the backend environment.
     * </p>
     */
    private String backendEnvironmentName;
    /**
     * <p>
     * The time when the job was created.
     * </p>
     */
    private String createTime;
    /**
     * <p>
     * If the request fails, this error is returned.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The ID for the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of the operation.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The current status of the request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time when the job was last updated.
     * </p>
     */
    private String updateTime;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendJobResult withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @param backendEnvironmentName
     *        The name of the backend environment.
     */

    public void setBackendEnvironmentName(String backendEnvironmentName) {
        this.backendEnvironmentName = backendEnvironmentName;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @return The name of the backend environment.
     */

    public String getBackendEnvironmentName() {
        return this.backendEnvironmentName;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @param backendEnvironmentName
     *        The name of the backend environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendJobResult withBackendEnvironmentName(String backendEnvironmentName) {
        setBackendEnvironmentName(backendEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The time when the job was created.
     * </p>
     * 
     * @param createTime
     *        The time when the job was created.
     */

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the job was created.
     * </p>
     * 
     * @return The time when the job was created.
     */

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the job was created.
     * </p>
     * 
     * @param createTime
     *        The time when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendJobResult withCreateTime(String createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * If the request fails, this error is returned.
     * </p>
     * 
     * @param error
     *        If the request fails, this error is returned.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * If the request fails, this error is returned.
     * </p>
     * 
     * @return If the request fails, this error is returned.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * If the request fails, this error is returned.
     * </p>
     * 
     * @param error
     *        If the request fails, this error is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendJobResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @param jobId
     *        The ID for the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @return The ID for the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @param jobId
     *        The ID for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @param operation
     *        The name of the operation.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @return The name of the operation.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @param operation
     *        The name of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendJobResult withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @return The current status of the request.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The time when the job was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time when the job was last updated.
     */

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time when the job was last updated.
     * </p>
     * 
     * @return The time when the job was last updated.
     */

    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time when the job was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time when the job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendJobResult withUpdateTime(String updateTime) {
        setUpdateTime(updateTime);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBackendEnvironmentName() != null)
            sb.append("BackendEnvironmentName: ").append(getBackendEnvironmentName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBackendJobResult == false)
            return false;
        UpdateBackendJobResult other = (UpdateBackendJobResult) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBackendEnvironmentName() == null ^ this.getBackendEnvironmentName() == null)
            return false;
        if (other.getBackendEnvironmentName() != null && other.getBackendEnvironmentName().equals(this.getBackendEnvironmentName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentName() == null) ? 0 : getBackendEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBackendJobResult clone() {
        try {
            return (UpdateBackendJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
