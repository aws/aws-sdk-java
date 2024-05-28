/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A share invitation summary return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ShareInvitationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareInvitationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     */
    private String shareInvitationId;

    private String sharedBy;

    private String sharedWith;

    private String permissionType;
    /**
     * <p>
     * The resource type of the share invitation.
     * </p>
     */
    private String shareResourceType;

    private String workloadName;

    private String workloadId;

    private String lensName;
    /**
     * <p>
     * The ARN for the lens.
     * </p>
     */
    private String lensArn;
    /**
     * <p>
     * The profile name.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The profile ARN.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * The name of the review template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The review template ARN.
     * </p>
     */
    private String templateArn;

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @param shareInvitationId
     *        The ID assigned to the share invitation.
     */

    public void setShareInvitationId(String shareInvitationId) {
        this.shareInvitationId = shareInvitationId;
    }

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @return The ID assigned to the share invitation.
     */

    public String getShareInvitationId() {
        return this.shareInvitationId;
    }

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @param shareInvitationId
     *        The ID assigned to the share invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withShareInvitationId(String shareInvitationId) {
        setShareInvitationId(shareInvitationId);
        return this;
    }

    /**
     * @param sharedBy
     */

    public void setSharedBy(String sharedBy) {
        this.sharedBy = sharedBy;
    }

    /**
     * @return
     */

    public String getSharedBy() {
        return this.sharedBy;
    }

    /**
     * @param sharedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withSharedBy(String sharedBy) {
        setSharedBy(sharedBy);
        return this;
    }

    /**
     * @param sharedWith
     */

    public void setSharedWith(String sharedWith) {
        this.sharedWith = sharedWith;
    }

    /**
     * @return
     */

    public String getSharedWith() {
        return this.sharedWith;
    }

    /**
     * @param sharedWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withSharedWith(String sharedWith) {
        setSharedWith(sharedWith);
        return this;
    }

    /**
     * @param permissionType
     * @see PermissionType
     */

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * @return
     * @see PermissionType
     */

    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * @param permissionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public ShareInvitationSummary withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * @param permissionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public ShareInvitationSummary withPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * <p>
     * The resource type of the share invitation.
     * </p>
     * 
     * @param shareResourceType
     *        The resource type of the share invitation.
     * @see ShareResourceType
     */

    public void setShareResourceType(String shareResourceType) {
        this.shareResourceType = shareResourceType;
    }

    /**
     * <p>
     * The resource type of the share invitation.
     * </p>
     * 
     * @return The resource type of the share invitation.
     * @see ShareResourceType
     */

    public String getShareResourceType() {
        return this.shareResourceType;
    }

    /**
     * <p>
     * The resource type of the share invitation.
     * </p>
     * 
     * @param shareResourceType
     *        The resource type of the share invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareResourceType
     */

    public ShareInvitationSummary withShareResourceType(String shareResourceType) {
        setShareResourceType(shareResourceType);
        return this;
    }

    /**
     * <p>
     * The resource type of the share invitation.
     * </p>
     * 
     * @param shareResourceType
     *        The resource type of the share invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareResourceType
     */

    public ShareInvitationSummary withShareResourceType(ShareResourceType shareResourceType) {
        this.shareResourceType = shareResourceType.toString();
        return this;
    }

    /**
     * @param workloadName
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * @return
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * @param workloadName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
        return this;
    }

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param lensName
     */

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

    /**
     * @return
     */

    public String getLensName() {
        return this.lensName;
    }

    /**
     * @param lensName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withLensName(String lensName) {
        setLensName(lensName);
        return this;
    }

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN for the lens.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @return The ARN for the lens.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN for the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withLensArn(String lensArn) {
        setLensArn(lensArn);
        return this;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @param profileName
     *        The profile name.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @return The profile name.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @param profileName
     *        The profile name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @return The profile ARN.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @param templateName
     *        The name of the review template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @return The name of the review template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @param templateName
     *        The name of the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @return The review template ARN.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareInvitationSummary withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
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
        if (getShareInvitationId() != null)
            sb.append("ShareInvitationId: ").append(getShareInvitationId()).append(",");
        if (getSharedBy() != null)
            sb.append("SharedBy: ").append(getSharedBy()).append(",");
        if (getSharedWith() != null)
            sb.append("SharedWith: ").append(getSharedWith()).append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType()).append(",");
        if (getShareResourceType() != null)
            sb.append("ShareResourceType: ").append(getShareResourceType()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName()).append(",");
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getLensName() != null)
            sb.append("LensName: ").append(getLensName()).append(",");
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareInvitationSummary == false)
            return false;
        ShareInvitationSummary other = (ShareInvitationSummary) obj;
        if (other.getShareInvitationId() == null ^ this.getShareInvitationId() == null)
            return false;
        if (other.getShareInvitationId() != null && other.getShareInvitationId().equals(this.getShareInvitationId()) == false)
            return false;
        if (other.getSharedBy() == null ^ this.getSharedBy() == null)
            return false;
        if (other.getSharedBy() != null && other.getSharedBy().equals(this.getSharedBy()) == false)
            return false;
        if (other.getSharedWith() == null ^ this.getSharedWith() == null)
            return false;
        if (other.getSharedWith() != null && other.getSharedWith().equals(this.getSharedWith()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getShareResourceType() == null ^ this.getShareResourceType() == null)
            return false;
        if (other.getShareResourceType() != null && other.getShareResourceType().equals(this.getShareResourceType()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getLensName() == null ^ this.getLensName() == null)
            return false;
        if (other.getLensName() != null && other.getLensName().equals(this.getLensName()) == false)
            return false;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareInvitationId() == null) ? 0 : getShareInvitationId().hashCode());
        hashCode = prime * hashCode + ((getSharedBy() == null) ? 0 : getSharedBy().hashCode());
        hashCode = prime * hashCode + ((getSharedWith() == null) ? 0 : getSharedWith().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        hashCode = prime * hashCode + ((getShareResourceType() == null) ? 0 : getShareResourceType().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getLensName() == null) ? 0 : getLensName().hashCode());
        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        return hashCode;
    }

    @Override
    public ShareInvitationSummary clone() {
        try {
            return (ShareInvitationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ShareInvitationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
