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
 * Describes a launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplate implements Serializable, Cloneable {

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
     * The time launch template was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The principal that created the launch template.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The version number of the default version of the launch template.
     * </p>
     */
    private Long defaultVersionNumber;
    /**
     * <p>
     * The version number of the latest version of the launch template.
     * </p>
     */
    private Long latestVersionNumber;
    /**
     * <p>
     * The tags for the launch template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

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

    public LaunchTemplate withLaunchTemplateId(String launchTemplateId) {
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

    public LaunchTemplate withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The time launch template was created.
     * </p>
     * 
     * @param createTime
     *        The time launch template was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time launch template was created.
     * </p>
     * 
     * @return The time launch template was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time launch template was created.
     * </p>
     * 
     * @param createTime
     *        The time launch template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplate withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The principal that created the launch template.
     * </p>
     * 
     * @param createdBy
     *        The principal that created the launch template.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The principal that created the launch template.
     * </p>
     * 
     * @return The principal that created the launch template.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The principal that created the launch template.
     * </p>
     * 
     * @param createdBy
     *        The principal that created the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplate withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The version number of the default version of the launch template.
     * </p>
     * 
     * @param defaultVersionNumber
     *        The version number of the default version of the launch template.
     */

    public void setDefaultVersionNumber(Long defaultVersionNumber) {
        this.defaultVersionNumber = defaultVersionNumber;
    }

    /**
     * <p>
     * The version number of the default version of the launch template.
     * </p>
     * 
     * @return The version number of the default version of the launch template.
     */

    public Long getDefaultVersionNumber() {
        return this.defaultVersionNumber;
    }

    /**
     * <p>
     * The version number of the default version of the launch template.
     * </p>
     * 
     * @param defaultVersionNumber
     *        The version number of the default version of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplate withDefaultVersionNumber(Long defaultVersionNumber) {
        setDefaultVersionNumber(defaultVersionNumber);
        return this;
    }

    /**
     * <p>
     * The version number of the latest version of the launch template.
     * </p>
     * 
     * @param latestVersionNumber
     *        The version number of the latest version of the launch template.
     */

    public void setLatestVersionNumber(Long latestVersionNumber) {
        this.latestVersionNumber = latestVersionNumber;
    }

    /**
     * <p>
     * The version number of the latest version of the launch template.
     * </p>
     * 
     * @return The version number of the latest version of the launch template.
     */

    public Long getLatestVersionNumber() {
        return this.latestVersionNumber;
    }

    /**
     * <p>
     * The version number of the latest version of the launch template.
     * </p>
     * 
     * @param latestVersionNumber
     *        The version number of the latest version of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplate withLatestVersionNumber(Long latestVersionNumber) {
        setLatestVersionNumber(latestVersionNumber);
        return this;
    }

    /**
     * <p>
     * The tags for the launch template.
     * </p>
     * 
     * @return The tags for the launch template.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the launch template.
     * </p>
     * 
     * @param tags
     *        The tags for the launch template.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the launch template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplate withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the launch template.
     * </p>
     * 
     * @param tags
     *        The tags for the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplate withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDefaultVersionNumber() != null)
            sb.append("DefaultVersionNumber: ").append(getDefaultVersionNumber()).append(",");
        if (getLatestVersionNumber() != null)
            sb.append("LatestVersionNumber: ").append(getLatestVersionNumber()).append(",");
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

        if (obj instanceof LaunchTemplate == false)
            return false;
        LaunchTemplate other = (LaunchTemplate) obj;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDefaultVersionNumber() == null ^ this.getDefaultVersionNumber() == null)
            return false;
        if (other.getDefaultVersionNumber() != null && other.getDefaultVersionNumber().equals(this.getDefaultVersionNumber()) == false)
            return false;
        if (other.getLatestVersionNumber() == null ^ this.getLatestVersionNumber() == null)
            return false;
        if (other.getLatestVersionNumber() != null && other.getLatestVersionNumber().equals(this.getLatestVersionNumber()) == false)
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

        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionNumber() == null) ? 0 : getDefaultVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionNumber() == null) ? 0 : getLatestVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplate clone() {
        try {
            return (LaunchTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
