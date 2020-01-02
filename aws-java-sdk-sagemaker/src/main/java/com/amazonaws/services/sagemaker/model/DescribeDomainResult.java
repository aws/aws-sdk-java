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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The domain's Amazon Resource Name (ARN).
     * </p>
     */
    private String domainArn;
    /**
     * <p>
     * The domain ID.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * </p>
     */
    private String homeEfsFileSystemId;
    /**
     * <p>
     * The SSO managed application instance ID.
     * </p>
     */
    private String singleSignOnManagedApplicationInstanceId;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The failure reason.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The domain's authentication mode.
     * </p>
     */
    private String authMode;
    /**
     * <p>
     * Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in a given
     * UserProfile.
     * </p>
     */
    private UserSettings defaultUserSettings;
    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     */
    private String homeEfsFileSystemKmsKeyId;
    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The domain's URL.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The domain's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param domainArn
     *        The domain's Amazon Resource Name (ARN).
     */

    public void setDomainArn(String domainArn) {
        this.domainArn = domainArn;
    }

    /**
     * <p>
     * The domain's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The domain's Amazon Resource Name (ARN).
     */

    public String getDomainArn() {
        return this.domainArn;
    }

    /**
     * <p>
     * The domain's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param domainArn
     *        The domain's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withDomainArn(String domainArn) {
        setDomainArn(domainArn);
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

    public DescribeDomainResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @return The domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * </p>
     * 
     * @param homeEfsFileSystemId
     *        The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     */

    public void setHomeEfsFileSystemId(String homeEfsFileSystemId) {
        this.homeEfsFileSystemId = homeEfsFileSystemId;
    }

    /**
     * <p>
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * </p>
     * 
     * @return The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     */

    public String getHomeEfsFileSystemId() {
        return this.homeEfsFileSystemId;
    }

    /**
     * <p>
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * </p>
     * 
     * @param homeEfsFileSystemId
     *        The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withHomeEfsFileSystemId(String homeEfsFileSystemId) {
        setHomeEfsFileSystemId(homeEfsFileSystemId);
        return this;
    }

    /**
     * <p>
     * The SSO managed application instance ID.
     * </p>
     * 
     * @param singleSignOnManagedApplicationInstanceId
     *        The SSO managed application instance ID.
     */

    public void setSingleSignOnManagedApplicationInstanceId(String singleSignOnManagedApplicationInstanceId) {
        this.singleSignOnManagedApplicationInstanceId = singleSignOnManagedApplicationInstanceId;
    }

    /**
     * <p>
     * The SSO managed application instance ID.
     * </p>
     * 
     * @return The SSO managed application instance ID.
     */

    public String getSingleSignOnManagedApplicationInstanceId() {
        return this.singleSignOnManagedApplicationInstanceId;
    }

    /**
     * <p>
     * The SSO managed application instance ID.
     * </p>
     * 
     * @param singleSignOnManagedApplicationInstanceId
     *        The SSO managed application instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withSingleSignOnManagedApplicationInstanceId(String singleSignOnManagedApplicationInstanceId) {
        setSingleSignOnManagedApplicationInstanceId(singleSignOnManagedApplicationInstanceId);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see DomainStatus
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
     * @see DomainStatus
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
     * @see DomainStatus
     */

    public DescribeDomainResult withStatus(String status) {
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
     * @see DomainStatus
     */

    public DescribeDomainResult withStatus(DomainStatus status) {
        this.status = status.toString();
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

    public DescribeDomainResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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

    public DescribeDomainResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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

    public DescribeDomainResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The domain's authentication mode.
     * </p>
     * 
     * @param authMode
     *        The domain's authentication mode.
     * @see AuthMode
     */

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    /**
     * <p>
     * The domain's authentication mode.
     * </p>
     * 
     * @return The domain's authentication mode.
     * @see AuthMode
     */

    public String getAuthMode() {
        return this.authMode;
    }

    /**
     * <p>
     * The domain's authentication mode.
     * </p>
     * 
     * @param authMode
     *        The domain's authentication mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public DescribeDomainResult withAuthMode(String authMode) {
        setAuthMode(authMode);
        return this;
    }

    /**
     * <p>
     * The domain's authentication mode.
     * </p>
     * 
     * @param authMode
     *        The domain's authentication mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public DescribeDomainResult withAuthMode(AuthMode authMode) {
        this.authMode = authMode.toString();
        return this;
    }

    /**
     * <p>
     * Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in a given
     * UserProfile.
     * </p>
     * 
     * @param defaultUserSettings
     *        Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in
     *        a given UserProfile.
     */

    public void setDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
    }

    /**
     * <p>
     * Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in a given
     * UserProfile.
     * </p>
     * 
     * @return Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in
     *         a given UserProfile.
     */

    public UserSettings getDefaultUserSettings() {
        return this.defaultUserSettings;
    }

    /**
     * <p>
     * Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in a given
     * UserProfile.
     * </p>
     * 
     * @param defaultUserSettings
     *        Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in
     *        a given UserProfile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withDefaultUserSettings(UserSettings defaultUserSettings) {
        setDefaultUserSettings(defaultUserSettings);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @param homeEfsFileSystemKmsKeyId
     *        The AWS Key Management Service encryption key ID.
     */

    public void setHomeEfsFileSystemKmsKeyId(String homeEfsFileSystemKmsKeyId) {
        this.homeEfsFileSystemKmsKeyId = homeEfsFileSystemKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @return The AWS Key Management Service encryption key ID.
     */

    public String getHomeEfsFileSystemKmsKeyId() {
        return this.homeEfsFileSystemKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @param homeEfsFileSystemKmsKeyId
     *        The AWS Key Management Service encryption key ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withHomeEfsFileSystemKmsKeyId(String homeEfsFileSystemKmsKeyId) {
        setHomeEfsFileSystemKmsKeyId(homeEfsFileSystemKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     * 
     * @return Security setting to limit to a set of subnets.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     * 
     * @param subnetIds
     *        Security setting to limit to a set of subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Security setting to limit to a set of subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     * 
     * @param subnetIds
     *        Security setting to limit to a set of subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The domain's URL.
     * </p>
     * 
     * @param url
     *        The domain's URL.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The domain's URL.
     * </p>
     * 
     * @return The domain's URL.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The domain's URL.
     * </p>
     * 
     * @param url
     *        The domain's URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon Virtual Private Cloud.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud.
     * </p>
     * 
     * @return The ID of the Amazon Virtual Private Cloud.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon Virtual Private Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainResult withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getDomainArn() != null)
            sb.append("DomainArn: ").append(getDomainArn()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getHomeEfsFileSystemId() != null)
            sb.append("HomeEfsFileSystemId: ").append(getHomeEfsFileSystemId()).append(",");
        if (getSingleSignOnManagedApplicationInstanceId() != null)
            sb.append("SingleSignOnManagedApplicationInstanceId: ").append(getSingleSignOnManagedApplicationInstanceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getAuthMode() != null)
            sb.append("AuthMode: ").append(getAuthMode()).append(",");
        if (getDefaultUserSettings() != null)
            sb.append("DefaultUserSettings: ").append(getDefaultUserSettings()).append(",");
        if (getHomeEfsFileSystemKmsKeyId() != null)
            sb.append("HomeEfsFileSystemKmsKeyId: ").append(getHomeEfsFileSystemKmsKeyId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainResult == false)
            return false;
        DescribeDomainResult other = (DescribeDomainResult) obj;
        if (other.getDomainArn() == null ^ this.getDomainArn() == null)
            return false;
        if (other.getDomainArn() != null && other.getDomainArn().equals(this.getDomainArn()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getHomeEfsFileSystemId() == null ^ this.getHomeEfsFileSystemId() == null)
            return false;
        if (other.getHomeEfsFileSystemId() != null && other.getHomeEfsFileSystemId().equals(this.getHomeEfsFileSystemId()) == false)
            return false;
        if (other.getSingleSignOnManagedApplicationInstanceId() == null ^ this.getSingleSignOnManagedApplicationInstanceId() == null)
            return false;
        if (other.getSingleSignOnManagedApplicationInstanceId() != null
                && other.getSingleSignOnManagedApplicationInstanceId().equals(this.getSingleSignOnManagedApplicationInstanceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getAuthMode() == null ^ this.getAuthMode() == null)
            return false;
        if (other.getAuthMode() != null && other.getAuthMode().equals(this.getAuthMode()) == false)
            return false;
        if (other.getDefaultUserSettings() == null ^ this.getDefaultUserSettings() == null)
            return false;
        if (other.getDefaultUserSettings() != null && other.getDefaultUserSettings().equals(this.getDefaultUserSettings()) == false)
            return false;
        if (other.getHomeEfsFileSystemKmsKeyId() == null ^ this.getHomeEfsFileSystemKmsKeyId() == null)
            return false;
        if (other.getHomeEfsFileSystemKmsKeyId() != null && other.getHomeEfsFileSystemKmsKeyId().equals(this.getHomeEfsFileSystemKmsKeyId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainArn() == null) ? 0 : getDomainArn().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getHomeEfsFileSystemId() == null) ? 0 : getHomeEfsFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOnManagedApplicationInstanceId() == null) ? 0 : getSingleSignOnManagedApplicationInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getAuthMode() == null) ? 0 : getAuthMode().hashCode());
        hashCode = prime * hashCode + ((getDefaultUserSettings() == null) ? 0 : getDefaultUserSettings().hashCode());
        hashCode = prime * hashCode + ((getHomeEfsFileSystemKmsKeyId() == null) ? 0 : getHomeEfsFileSystemKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainResult clone() {
        try {
            return (DescribeDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
