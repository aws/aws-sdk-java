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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The share invitation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ShareInvitation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareInvitation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     */
    private String shareInvitationId;

    private String workloadId;

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

    public ShareInvitation withShareInvitationId(String shareInvitationId) {
        setShareInvitationId(shareInvitationId);
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

    public ShareInvitation withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareInvitation == false)
            return false;
        ShareInvitation other = (ShareInvitation) obj;
        if (other.getShareInvitationId() == null ^ this.getShareInvitationId() == null)
            return false;
        if (other.getShareInvitationId() != null && other.getShareInvitationId().equals(this.getShareInvitationId()) == false)
            return false;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareInvitationId() == null) ? 0 : getShareInvitationId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        return hashCode;
    }

    @Override
    public ShareInvitation clone() {
        try {
            return (ShareInvitation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ShareInvitationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
