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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The application instance's ID.
     * </p>
     */
    private String applicationInstanceId;
    /**
     * <p>
     * The ID of the application instance that this instance replaced.
     * </p>
     */
    private String applicationInstanceIdToReplace;
    /**
     * <p>
     * The application instance's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the application instance was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The device's ID.
     * </p>
     */
    private String defaultRuntimeContextDevice;
    /**
     * <p>
     * The device's bane.
     * </p>
     */
    private String defaultRuntimeContextDeviceName;
    /**
     * <p>
     * The application instance's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The application instance's health status.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * The application instance was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The application instance's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The application instance's state.
     * </p>
     */
    private java.util.List<ReportedRuntimeContextState> runtimeContextStates;
    /**
     * <p>
     * The application instance's runtime role ARN.
     * </p>
     */
    private String runtimeRoleArn;
    /**
     * <p>
     * The application instance's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The application instance's status description.
     * </p>
     */
    private String statusDescription;
    /**
     * <p>
     * The application instance's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @param applicationInstanceId
     *        The application instance's ID.
     */

    public void setApplicationInstanceId(String applicationInstanceId) {
        this.applicationInstanceId = applicationInstanceId;
    }

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @return The application instance's ID.
     */

    public String getApplicationInstanceId() {
        return this.applicationInstanceId;
    }

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @param applicationInstanceId
     *        The application instance's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withApplicationInstanceId(String applicationInstanceId) {
        setApplicationInstanceId(applicationInstanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the application instance that this instance replaced.
     * </p>
     * 
     * @param applicationInstanceIdToReplace
     *        The ID of the application instance that this instance replaced.
     */

    public void setApplicationInstanceIdToReplace(String applicationInstanceIdToReplace) {
        this.applicationInstanceIdToReplace = applicationInstanceIdToReplace;
    }

    /**
     * <p>
     * The ID of the application instance that this instance replaced.
     * </p>
     * 
     * @return The ID of the application instance that this instance replaced.
     */

    public String getApplicationInstanceIdToReplace() {
        return this.applicationInstanceIdToReplace;
    }

    /**
     * <p>
     * The ID of the application instance that this instance replaced.
     * </p>
     * 
     * @param applicationInstanceIdToReplace
     *        The ID of the application instance that this instance replaced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withApplicationInstanceIdToReplace(String applicationInstanceIdToReplace) {
        setApplicationInstanceIdToReplace(applicationInstanceIdToReplace);
        return this;
    }

    /**
     * <p>
     * The application instance's ARN.
     * </p>
     * 
     * @param arn
     *        The application instance's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The application instance's ARN.
     * </p>
     * 
     * @return The application instance's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The application instance's ARN.
     * </p>
     * 
     * @param arn
     *        The application instance's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the application instance was created.
     * </p>
     * 
     * @param createdTime
     *        When the application instance was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the application instance was created.
     * </p>
     * 
     * @return When the application instance was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the application instance was created.
     * </p>
     * 
     * @param createdTime
     *        When the application instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param defaultRuntimeContextDevice
     *        The device's ID.
     */

    public void setDefaultRuntimeContextDevice(String defaultRuntimeContextDevice) {
        this.defaultRuntimeContextDevice = defaultRuntimeContextDevice;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @return The device's ID.
     */

    public String getDefaultRuntimeContextDevice() {
        return this.defaultRuntimeContextDevice;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param defaultRuntimeContextDevice
     *        The device's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withDefaultRuntimeContextDevice(String defaultRuntimeContextDevice) {
        setDefaultRuntimeContextDevice(defaultRuntimeContextDevice);
        return this;
    }

    /**
     * <p>
     * The device's bane.
     * </p>
     * 
     * @param defaultRuntimeContextDeviceName
     *        The device's bane.
     */

    public void setDefaultRuntimeContextDeviceName(String defaultRuntimeContextDeviceName) {
        this.defaultRuntimeContextDeviceName = defaultRuntimeContextDeviceName;
    }

    /**
     * <p>
     * The device's bane.
     * </p>
     * 
     * @return The device's bane.
     */

    public String getDefaultRuntimeContextDeviceName() {
        return this.defaultRuntimeContextDeviceName;
    }

    /**
     * <p>
     * The device's bane.
     * </p>
     * 
     * @param defaultRuntimeContextDeviceName
     *        The device's bane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withDefaultRuntimeContextDeviceName(String defaultRuntimeContextDeviceName) {
        setDefaultRuntimeContextDeviceName(defaultRuntimeContextDeviceName);
        return this;
    }

    /**
     * <p>
     * The application instance's description.
     * </p>
     * 
     * @param description
     *        The application instance's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The application instance's description.
     * </p>
     * 
     * @return The application instance's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The application instance's description.
     * </p>
     * 
     * @param description
     *        The application instance's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The application instance's health status.
     * </p>
     * 
     * @param healthStatus
     *        The application instance's health status.
     * @see ApplicationInstanceHealthStatus
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The application instance's health status.
     * </p>
     * 
     * @return The application instance's health status.
     * @see ApplicationInstanceHealthStatus
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The application instance's health status.
     * </p>
     * 
     * @param healthStatus
     *        The application instance's health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationInstanceHealthStatus
     */

    public DescribeApplicationInstanceResult withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The application instance's health status.
     * </p>
     * 
     * @param healthStatus
     *        The application instance's health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationInstanceHealthStatus
     */

    public DescribeApplicationInstanceResult withHealthStatus(ApplicationInstanceHealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * The application instance was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The application instance was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The application instance was updated.
     * </p>
     * 
     * @return The application instance was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The application instance was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The application instance was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The application instance's name.
     * </p>
     * 
     * @param name
     *        The application instance's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The application instance's name.
     * </p>
     * 
     * @return The application instance's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The application instance's name.
     * </p>
     * 
     * @param name
     *        The application instance's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The application instance's state.
     * </p>
     * 
     * @return The application instance's state.
     */

    public java.util.List<ReportedRuntimeContextState> getRuntimeContextStates() {
        return runtimeContextStates;
    }

    /**
     * <p>
     * The application instance's state.
     * </p>
     * 
     * @param runtimeContextStates
     *        The application instance's state.
     */

    public void setRuntimeContextStates(java.util.Collection<ReportedRuntimeContextState> runtimeContextStates) {
        if (runtimeContextStates == null) {
            this.runtimeContextStates = null;
            return;
        }

        this.runtimeContextStates = new java.util.ArrayList<ReportedRuntimeContextState>(runtimeContextStates);
    }

    /**
     * <p>
     * The application instance's state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuntimeContextStates(java.util.Collection)} or {@link #withRuntimeContextStates(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param runtimeContextStates
     *        The application instance's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withRuntimeContextStates(ReportedRuntimeContextState... runtimeContextStates) {
        if (this.runtimeContextStates == null) {
            setRuntimeContextStates(new java.util.ArrayList<ReportedRuntimeContextState>(runtimeContextStates.length));
        }
        for (ReportedRuntimeContextState ele : runtimeContextStates) {
            this.runtimeContextStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The application instance's state.
     * </p>
     * 
     * @param runtimeContextStates
     *        The application instance's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withRuntimeContextStates(java.util.Collection<ReportedRuntimeContextState> runtimeContextStates) {
        setRuntimeContextStates(runtimeContextStates);
        return this;
    }

    /**
     * <p>
     * The application instance's runtime role ARN.
     * </p>
     * 
     * @param runtimeRoleArn
     *        The application instance's runtime role ARN.
     */

    public void setRuntimeRoleArn(String runtimeRoleArn) {
        this.runtimeRoleArn = runtimeRoleArn;
    }

    /**
     * <p>
     * The application instance's runtime role ARN.
     * </p>
     * 
     * @return The application instance's runtime role ARN.
     */

    public String getRuntimeRoleArn() {
        return this.runtimeRoleArn;
    }

    /**
     * <p>
     * The application instance's runtime role ARN.
     * </p>
     * 
     * @param runtimeRoleArn
     *        The application instance's runtime role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withRuntimeRoleArn(String runtimeRoleArn) {
        setRuntimeRoleArn(runtimeRoleArn);
        return this;
    }

    /**
     * <p>
     * The application instance's status.
     * </p>
     * 
     * @param status
     *        The application instance's status.
     * @see ApplicationInstanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The application instance's status.
     * </p>
     * 
     * @return The application instance's status.
     * @see ApplicationInstanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The application instance's status.
     * </p>
     * 
     * @param status
     *        The application instance's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationInstanceStatus
     */

    public DescribeApplicationInstanceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The application instance's status.
     * </p>
     * 
     * @param status
     *        The application instance's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationInstanceStatus
     */

    public DescribeApplicationInstanceResult withStatus(ApplicationInstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The application instance's status description.
     * </p>
     * 
     * @param statusDescription
     *        The application instance's status description.
     */

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * <p>
     * The application instance's status description.
     * </p>
     * 
     * @return The application instance's status description.
     */

    public String getStatusDescription() {
        return this.statusDescription;
    }

    /**
     * <p>
     * The application instance's status description.
     * </p>
     * 
     * @param statusDescription
     *        The application instance's status description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withStatusDescription(String statusDescription) {
        setStatusDescription(statusDescription);
        return this;
    }

    /**
     * <p>
     * The application instance's tags.
     * </p>
     * 
     * @return The application instance's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The application instance's tags.
     * </p>
     * 
     * @param tags
     *        The application instance's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The application instance's tags.
     * </p>
     * 
     * @param tags
     *        The application instance's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeApplicationInstanceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceResult clearTagsEntries() {
        this.tags = null;
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
        if (getApplicationInstanceId() != null)
            sb.append("ApplicationInstanceId: ").append(getApplicationInstanceId()).append(",");
        if (getApplicationInstanceIdToReplace() != null)
            sb.append("ApplicationInstanceIdToReplace: ").append(getApplicationInstanceIdToReplace()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDefaultRuntimeContextDevice() != null)
            sb.append("DefaultRuntimeContextDevice: ").append(getDefaultRuntimeContextDevice()).append(",");
        if (getDefaultRuntimeContextDeviceName() != null)
            sb.append("DefaultRuntimeContextDeviceName: ").append(getDefaultRuntimeContextDeviceName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuntimeContextStates() != null)
            sb.append("RuntimeContextStates: ").append(getRuntimeContextStates()).append(",");
        if (getRuntimeRoleArn() != null)
            sb.append("RuntimeRoleArn: ").append(getRuntimeRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDescription() != null)
            sb.append("StatusDescription: ").append(getStatusDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationInstanceResult == false)
            return false;
        DescribeApplicationInstanceResult other = (DescribeApplicationInstanceResult) obj;
        if (other.getApplicationInstanceId() == null ^ this.getApplicationInstanceId() == null)
            return false;
        if (other.getApplicationInstanceId() != null && other.getApplicationInstanceId().equals(this.getApplicationInstanceId()) == false)
            return false;
        if (other.getApplicationInstanceIdToReplace() == null ^ this.getApplicationInstanceIdToReplace() == null)
            return false;
        if (other.getApplicationInstanceIdToReplace() != null
                && other.getApplicationInstanceIdToReplace().equals(this.getApplicationInstanceIdToReplace()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDefaultRuntimeContextDevice() == null ^ this.getDefaultRuntimeContextDevice() == null)
            return false;
        if (other.getDefaultRuntimeContextDevice() != null && other.getDefaultRuntimeContextDevice().equals(this.getDefaultRuntimeContextDevice()) == false)
            return false;
        if (other.getDefaultRuntimeContextDeviceName() == null ^ this.getDefaultRuntimeContextDeviceName() == null)
            return false;
        if (other.getDefaultRuntimeContextDeviceName() != null
                && other.getDefaultRuntimeContextDeviceName().equals(this.getDefaultRuntimeContextDeviceName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuntimeContextStates() == null ^ this.getRuntimeContextStates() == null)
            return false;
        if (other.getRuntimeContextStates() != null && other.getRuntimeContextStates().equals(this.getRuntimeContextStates()) == false)
            return false;
        if (other.getRuntimeRoleArn() == null ^ this.getRuntimeRoleArn() == null)
            return false;
        if (other.getRuntimeRoleArn() != null && other.getRuntimeRoleArn().equals(this.getRuntimeRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDescription() == null ^ this.getStatusDescription() == null)
            return false;
        if (other.getStatusDescription() != null && other.getStatusDescription().equals(this.getStatusDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationInstanceId() == null) ? 0 : getApplicationInstanceId().hashCode());
        hashCode = prime * hashCode + ((getApplicationInstanceIdToReplace() == null) ? 0 : getApplicationInstanceIdToReplace().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDefaultRuntimeContextDevice() == null) ? 0 : getDefaultRuntimeContextDevice().hashCode());
        hashCode = prime * hashCode + ((getDefaultRuntimeContextDeviceName() == null) ? 0 : getDefaultRuntimeContextDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuntimeContextStates() == null) ? 0 : getRuntimeContextStates().hashCode());
        hashCode = prime * hashCode + ((getRuntimeRoleArn() == null) ? 0 : getRuntimeRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDescription() == null) ? 0 : getStatusDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationInstanceResult clone() {
        try {
            return (DescribeApplicationInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
