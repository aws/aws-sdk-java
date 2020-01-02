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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The domain ID.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     */
    private String userProfileArn;
    /**
     * <p>
     * The user profile name.
     * </p>
     */
    private String userProfileName;
    /**
     * <p>
     * The homa Amazon Elastic File System (EFS) Uid.
     * </p>
     */
    private String homeEfsFileSystemUid;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;
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
     * The SSO user identifier.
     * </p>
     */
    private String singleSignOnUserIdentifier;
    /**
     * <p>
     * The SSO user value.
     * </p>
     */
    private String singleSignOnUserValue;
    /**
     * <p>
     * A collection of settings.
     * </p>
     */
    private UserSettings userSettings;

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

    public DescribeUserProfileResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * 
     * @param userProfileArn
     *        The user profile Amazon Resource Name (ARN).
     */

    public void setUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The user profile Amazon Resource Name (ARN).
     */

    public String getUserProfileArn() {
        return this.userProfileArn;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * 
     * @param userProfileArn
     *        The user profile Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withUserProfileArn(String userProfileArn) {
        setUserProfileArn(userProfileArn);
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

    public DescribeUserProfileResult withUserProfileName(String userProfileName) {
        setUserProfileName(userProfileName);
        return this;
    }

    /**
     * <p>
     * The homa Amazon Elastic File System (EFS) Uid.
     * </p>
     * 
     * @param homeEfsFileSystemUid
     *        The homa Amazon Elastic File System (EFS) Uid.
     */

    public void setHomeEfsFileSystemUid(String homeEfsFileSystemUid) {
        this.homeEfsFileSystemUid = homeEfsFileSystemUid;
    }

    /**
     * <p>
     * The homa Amazon Elastic File System (EFS) Uid.
     * </p>
     * 
     * @return The homa Amazon Elastic File System (EFS) Uid.
     */

    public String getHomeEfsFileSystemUid() {
        return this.homeEfsFileSystemUid;
    }

    /**
     * <p>
     * The homa Amazon Elastic File System (EFS) Uid.
     * </p>
     * 
     * @param homeEfsFileSystemUid
     *        The homa Amazon Elastic File System (EFS) Uid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withHomeEfsFileSystemUid(String homeEfsFileSystemUid) {
        setHomeEfsFileSystemUid(homeEfsFileSystemUid);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see UserProfileStatus
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
     * @see UserProfileStatus
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
     * @see UserProfileStatus
     */

    public DescribeUserProfileResult withStatus(String status) {
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
     * @see UserProfileStatus
     */

    public DescribeUserProfileResult withStatus(UserProfileStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @return The last modified time.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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

    public DescribeUserProfileResult withCreationTime(java.util.Date creationTime) {
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

    public DescribeUserProfileResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The SSO user identifier.
     * </p>
     * 
     * @param singleSignOnUserIdentifier
     *        The SSO user identifier.
     */

    public void setSingleSignOnUserIdentifier(String singleSignOnUserIdentifier) {
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
    }

    /**
     * <p>
     * The SSO user identifier.
     * </p>
     * 
     * @return The SSO user identifier.
     */

    public String getSingleSignOnUserIdentifier() {
        return this.singleSignOnUserIdentifier;
    }

    /**
     * <p>
     * The SSO user identifier.
     * </p>
     * 
     * @param singleSignOnUserIdentifier
     *        The SSO user identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withSingleSignOnUserIdentifier(String singleSignOnUserIdentifier) {
        setSingleSignOnUserIdentifier(singleSignOnUserIdentifier);
        return this;
    }

    /**
     * <p>
     * The SSO user value.
     * </p>
     * 
     * @param singleSignOnUserValue
     *        The SSO user value.
     */

    public void setSingleSignOnUserValue(String singleSignOnUserValue) {
        this.singleSignOnUserValue = singleSignOnUserValue;
    }

    /**
     * <p>
     * The SSO user value.
     * </p>
     * 
     * @return The SSO user value.
     */

    public String getSingleSignOnUserValue() {
        return this.singleSignOnUserValue;
    }

    /**
     * <p>
     * The SSO user value.
     * </p>
     * 
     * @param singleSignOnUserValue
     *        The SSO user value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withSingleSignOnUserValue(String singleSignOnUserValue) {
        setSingleSignOnUserValue(singleSignOnUserValue);
        return this;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @param userSettings
     *        A collection of settings.
     */

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @return A collection of settings.
     */

    public UserSettings getUserSettings() {
        return this.userSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @param userSettings
     *        A collection of settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withUserSettings(UserSettings userSettings) {
        setUserSettings(userSettings);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getUserProfileArn() != null)
            sb.append("UserProfileArn: ").append(getUserProfileArn()).append(",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: ").append(getUserProfileName()).append(",");
        if (getHomeEfsFileSystemUid() != null)
            sb.append("HomeEfsFileSystemUid: ").append(getHomeEfsFileSystemUid()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getSingleSignOnUserIdentifier() != null)
            sb.append("SingleSignOnUserIdentifier: ").append(getSingleSignOnUserIdentifier()).append(",");
        if (getSingleSignOnUserValue() != null)
            sb.append("SingleSignOnUserValue: ").append(getSingleSignOnUserValue()).append(",");
        if (getUserSettings() != null)
            sb.append("UserSettings: ").append(getUserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserProfileResult == false)
            return false;
        DescribeUserProfileResult other = (DescribeUserProfileResult) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileArn() == null ^ this.getUserProfileArn() == null)
            return false;
        if (other.getUserProfileArn() != null && other.getUserProfileArn().equals(this.getUserProfileArn()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getHomeEfsFileSystemUid() == null ^ this.getHomeEfsFileSystemUid() == null)
            return false;
        if (other.getHomeEfsFileSystemUid() != null && other.getHomeEfsFileSystemUid().equals(this.getHomeEfsFileSystemUid()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSingleSignOnUserIdentifier() == null ^ this.getSingleSignOnUserIdentifier() == null)
            return false;
        if (other.getSingleSignOnUserIdentifier() != null && other.getSingleSignOnUserIdentifier().equals(this.getSingleSignOnUserIdentifier()) == false)
            return false;
        if (other.getSingleSignOnUserValue() == null ^ this.getSingleSignOnUserValue() == null)
            return false;
        if (other.getSingleSignOnUserValue() != null && other.getSingleSignOnUserValue().equals(this.getSingleSignOnUserValue()) == false)
            return false;
        if (other.getUserSettings() == null ^ this.getUserSettings() == null)
            return false;
        if (other.getUserSettings() != null && other.getUserSettings().equals(this.getUserSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getUserProfileArn() == null) ? 0 : getUserProfileArn().hashCode());
        hashCode = prime * hashCode + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getHomeEfsFileSystemUid() == null) ? 0 : getHomeEfsFileSystemUid().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOnUserIdentifier() == null) ? 0 : getSingleSignOnUserIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOnUserValue() == null) ? 0 : getSingleSignOnUserValue().hashCode());
        hashCode = prime * hashCode + ((getUserSettings() == null) ? 0 : getUserSettings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserProfileResult clone() {
        try {
            return (DescribeUserProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
