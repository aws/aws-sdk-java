/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a launch template version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateVersion implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The name of the launch template.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * The version number.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The description for the version.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * The time the version was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The principal that created the version.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     */
    private Boolean defaultVersion;
    /**
     * <p>
     * Information about the launch template.
     * </p>
     */
    private ResponseLaunchTemplateData launchTemplateData;

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @return The ID of the launch template.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateVersion withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @return The name of the launch template.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateVersion withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param versionNumber
     *        The version number.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @return The version number.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param versionNumber
     *        The version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateVersion withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The description for the version.
     * </p>
     * 
     * @param versionDescription
     *        The description for the version.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * The description for the version.
     * </p>
     * 
     * @return The description for the version.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * The description for the version.
     * </p>
     * 
     * @param versionDescription
     *        The description for the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateVersion withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * The time the version was created.
     * </p>
     * 
     * @param createTime
     *        The time the version was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the version was created.
     * </p>
     * 
     * @return The time the version was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the version was created.
     * </p>
     * 
     * @param createTime
     *        The time the version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateVersion withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The principal that created the version.
     * </p>
     * 
     * @param createdBy
     *        The principal that created the version.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The principal that created the version.
     * </p>
     * 
     * @return The principal that created the version.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The principal that created the version.
     * </p>
     * 
     * @param createdBy
     *        The principal that created the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateVersion withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     * 
     * @param defaultVersion
     *        Indicates whether the version is the default version.
     */

    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     * 
     * @return Indicates whether the version is the default version.
     */

    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     * 
     * @param defaultVersion
     *        Indicates whether the version is the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateVersion withDefaultVersion(Boolean defaultVersion) {
        setDefaultVersion(defaultVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     * 
     * @return Indicates whether the version is the default version.
     */

    public Boolean isDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * Information about the launch template.
     * </p>
     * 
     * @param launchTemplateData
     *        Information about the launch template.
     */

    public void setLaunchTemplateData(ResponseLaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
    }

    /**
     * <p>
     * Information about the launch template.
     * </p>
     * 
     * @return Information about the launch template.
     */

    public ResponseLaunchTemplateData getLaunchTemplateData() {
        return this.launchTemplateData;
    }

    /**
     * <p>
     * Information about the launch template.
     * </p>
     * 
     * @param launchTemplateData
     *        Information about the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateVersion withLaunchTemplateData(ResponseLaunchTemplateData launchTemplateData) {
        setLaunchTemplateData(launchTemplateData);
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: ").append(getLaunchTemplateId()).append(",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: ").append(getLaunchTemplateName()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion()).append(",");
        if (getLaunchTemplateData() != null)
            sb.append("LaunchTemplateData: ").append(getLaunchTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateVersion == false)
            return false;
        LaunchTemplateVersion other = (LaunchTemplateVersion) obj;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        if (other.getLaunchTemplateData() == null ^ this.getLaunchTemplateData() == null)
            return false;
        if (other.getLaunchTemplateData() != null && other.getLaunchTemplateData().equals(this.getLaunchTemplateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateData() == null) ? 0 : getLaunchTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateVersion clone() {
        try {
            return (LaunchTemplateVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
