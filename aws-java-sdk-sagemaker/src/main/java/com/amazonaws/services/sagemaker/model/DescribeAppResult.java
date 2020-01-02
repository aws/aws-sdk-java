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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The app's Amazon Resource Name (ARN).
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The type of app.
     * </p>
     */
    private String appType;
    /**
     * <p>
     * The name of the app.
     * </p>
     */
    private String appName;
    /**
     * <p>
     * The domain ID.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The user profile name.
     * </p>
     */
    private String userProfileName;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of the last health check.
     * </p>
     */
    private java.util.Date lastHealthCheckTimestamp;
    /**
     * <p>
     * The timestamp of the last user's activity.
     * </p>
     */
    private java.util.Date lastUserActivityTimestamp;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The failure reason.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The instance type and quantity.
     * </p>
     */
    private ResourceSpec resourceSpec;

    /**
     * <p>
     * The app's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param appArn
     *        The app's Amazon Resource Name (ARN).
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The app's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The app's Amazon Resource Name (ARN).
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The app's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param appArn
     *        The app's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * 
     * @param appType
     *        The type of app.
     * @see AppType
     */

    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * 
     * @return The type of app.
     * @see AppType
     */

    public String getAppType() {
        return this.appType;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * 
     * @param appType
     *        The type of app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public DescribeAppResult withAppType(String appType) {
        setAppType(appType);
        return this;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * 
     * @param appType
     *        The type of app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public DescribeAppResult withAppType(AppType appType) {
        this.appType = appType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @param appName
     *        The name of the app.
     */

    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @return The name of the app.
     */

    public String getAppName() {
        return this.appName;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @param appName
     *        The name of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withAppName(String appName) {
        setAppName(appName);
        return this;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @return The domain ID.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * 
     * @param userProfileName
     *        The user profile name.
     */

    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * 
     * @return The user profile name.
     */

    public String getUserProfileName() {
        return this.userProfileName;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * 
     * @param userProfileName
     *        The user profile name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withUserProfileName(String userProfileName) {
        setUserProfileName(userProfileName);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see AppStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see AppStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatus
     */

    public DescribeAppResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatus
     */

    public DescribeAppResult withStatus(AppStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of the last health check.
     * </p>
     * 
     * @param lastHealthCheckTimestamp
     *        The timestamp of the last health check.
     */

    public void setLastHealthCheckTimestamp(java.util.Date lastHealthCheckTimestamp) {
        this.lastHealthCheckTimestamp = lastHealthCheckTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last health check.
     * </p>
     * 
     * @return The timestamp of the last health check.
     */

    public java.util.Date getLastHealthCheckTimestamp() {
        return this.lastHealthCheckTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last health check.
     * </p>
     * 
     * @param lastHealthCheckTimestamp
     *        The timestamp of the last health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withLastHealthCheckTimestamp(java.util.Date lastHealthCheckTimestamp) {
        setLastHealthCheckTimestamp(lastHealthCheckTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last user's activity.
     * </p>
     * 
     * @param lastUserActivityTimestamp
     *        The timestamp of the last user's activity.
     */

    public void setLastUserActivityTimestamp(java.util.Date lastUserActivityTimestamp) {
        this.lastUserActivityTimestamp = lastUserActivityTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last user's activity.
     * </p>
     * 
     * @return The timestamp of the last user's activity.
     */

    public java.util.Date getLastUserActivityTimestamp() {
        return this.lastUserActivityTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last user's activity.
     * </p>
     * 
     * @param lastUserActivityTimestamp
     *        The timestamp of the last user's activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withLastUserActivityTimestamp(java.util.Date lastUserActivityTimestamp) {
        setLastUserActivityTimestamp(lastUserActivityTimestamp);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @param failureReason
     *        The failure reason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @return The failure reason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @param failureReason
     *        The failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The instance type and quantity.
     * </p>
     * 
     * @param resourceSpec
     *        The instance type and quantity.
     */

    public void setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    /**
     * <p>
     * The instance type and quantity.
     * </p>
     * 
     * @return The instance type and quantity.
     */

    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * <p>
     * The instance type and quantity.
     * </p>
     * 
     * @param resourceSpec
     *        The instance type and quantity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withResourceSpec(ResourceSpec resourceSpec) {
        setResourceSpec(resourceSpec);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppType() != null)
            sb.append("AppType: ").append(getAppType()).append(",");
        if (getAppName() != null)
            sb.append("AppName: ").append(getAppName()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: ").append(getUserProfileName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastHealthCheckTimestamp() != null)
            sb.append("LastHealthCheckTimestamp: ").append(getLastHealthCheckTimestamp()).append(",");
        if (getLastUserActivityTimestamp() != null)
            sb.append("LastUserActivityTimestamp: ").append(getLastUserActivityTimestamp()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getResourceSpec() != null)
            sb.append("ResourceSpec: ").append(getResourceSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppResult == false)
            return false;
        DescribeAppResult other = (DescribeAppResult) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getAppName() == null ^ this.getAppName() == null)
            return false;
        if (other.getAppName() != null && other.getAppName().equals(this.getAppName()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastHealthCheckTimestamp() == null ^ this.getLastHealthCheckTimestamp() == null)
            return false;
        if (other.getLastHealthCheckTimestamp() != null && other.getLastHealthCheckTimestamp().equals(this.getLastHealthCheckTimestamp()) == false)
            return false;
        if (other.getLastUserActivityTimestamp() == null ^ this.getLastUserActivityTimestamp() == null)
            return false;
        if (other.getLastUserActivityTimestamp() != null && other.getLastUserActivityTimestamp().equals(this.getLastUserActivityTimestamp()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getResourceSpec() == null ^ this.getResourceSpec() == null)
            return false;
        if (other.getResourceSpec() != null && other.getResourceSpec().equals(this.getResourceSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getAppName() == null) ? 0 : getAppName().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastHealthCheckTimestamp() == null) ? 0 : getLastHealthCheckTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUserActivityTimestamp() == null) ? 0 : getLastUserActivityTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getResourceSpec() == null) ? 0 : getResourceSpec().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppResult clone() {
        try {
            return (DescribeAppResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
