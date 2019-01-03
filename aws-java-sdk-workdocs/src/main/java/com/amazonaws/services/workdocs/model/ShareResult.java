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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the share results of a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/ShareResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the principal.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The ID of the invited user.
     * </p>
     */
    private String inviteePrincipalId;
    /**
     * <p>
     * The role.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the resource that was shared.
     * </p>
     */
    private String shareId;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @param principalId
     *        The ID of the principal.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @return The ID of the principal.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @param principalId
     *        The ID of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareResult withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The ID of the invited user.
     * </p>
     * 
     * @param inviteePrincipalId
     *        The ID of the invited user.
     */

    public void setInviteePrincipalId(String inviteePrincipalId) {
        this.inviteePrincipalId = inviteePrincipalId;
    }

    /**
     * <p>
     * The ID of the invited user.
     * </p>
     * 
     * @return The ID of the invited user.
     */

    public String getInviteePrincipalId() {
        return this.inviteePrincipalId;
    }

    /**
     * <p>
     * The ID of the invited user.
     * </p>
     * 
     * @param inviteePrincipalId
     *        The ID of the invited user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareResult withInviteePrincipalId(String inviteePrincipalId) {
        setInviteePrincipalId(inviteePrincipalId);
        return this;
    }

    /**
     * <p>
     * The role.
     * </p>
     * 
     * @param role
     *        The role.
     * @see RoleType
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role.
     * </p>
     * 
     * @return The role.
     * @see RoleType
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role.
     * </p>
     * 
     * @param role
     *        The role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public ShareResult withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The role.
     * </p>
     * 
     * @param role
     *        The role.
     * @see RoleType
     */

    public void setRole(RoleType role) {
        withRole(role);
    }

    /**
     * <p>
     * The role.
     * </p>
     * 
     * @param role
     *        The role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public ShareResult withRole(RoleType role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see ShareStatusType
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
     * @see ShareStatusType
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
     * @see ShareStatusType
     */

    public ShareResult withStatus(String status) {
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
     * @see ShareStatusType
     */

    public void setStatus(ShareStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatusType
     */

    public ShareResult withStatus(ShareStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource that was shared.
     * </p>
     * 
     * @param shareId
     *        The ID of the resource that was shared.
     */

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    /**
     * <p>
     * The ID of the resource that was shared.
     * </p>
     * 
     * @return The ID of the resource that was shared.
     */

    public String getShareId() {
        return this.shareId;
    }

    /**
     * <p>
     * The ID of the resource that was shared.
     * </p>
     * 
     * @param shareId
     *        The ID of the resource that was shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareResult withShareId(String shareId) {
        setShareId(shareId);
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getInviteePrincipalId() != null)
            sb.append("InviteePrincipalId: ").append(getInviteePrincipalId()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getShareId() != null)
            sb.append("ShareId: ").append(getShareId()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareResult == false)
            return false;
        ShareResult other = (ShareResult) obj;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getInviteePrincipalId() == null ^ this.getInviteePrincipalId() == null)
            return false;
        if (other.getInviteePrincipalId() != null && other.getInviteePrincipalId().equals(this.getInviteePrincipalId()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getShareId() == null ^ this.getShareId() == null)
            return false;
        if (other.getShareId() != null && other.getShareId().equals(this.getShareId()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getInviteePrincipalId() == null) ? 0 : getInviteePrincipalId().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getShareId() == null) ? 0 : getShareId().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ShareResult clone() {
        try {
            return (ShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.ShareResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
