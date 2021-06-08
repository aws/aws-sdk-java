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
 * A workload share summary return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/WorkloadShareSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadShareSummary implements Serializable, Cloneable, StructuredPojo {

    private String shareId;

    private String sharedWith;

    private String permissionType;

    private String status;

    /**
     * @param shareId
     */

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    /**
     * @return
     */

    public String getShareId() {
        return this.shareId;
    }

    /**
     * @param shareId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadShareSummary withShareId(String shareId) {
        setShareId(shareId);
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

    public WorkloadShareSummary withSharedWith(String sharedWith) {
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

    public WorkloadShareSummary withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * @param permissionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public WorkloadShareSummary withPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * @param status
     * @see ShareStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see ShareStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public WorkloadShareSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public WorkloadShareSummary withStatus(ShareStatus status) {
        this.status = status.toString();
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
        if (getShareId() != null)
            sb.append("ShareId: ").append(getShareId()).append(",");
        if (getSharedWith() != null)
            sb.append("SharedWith: ").append(getSharedWith()).append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkloadShareSummary == false)
            return false;
        WorkloadShareSummary other = (WorkloadShareSummary) obj;
        if (other.getShareId() == null ^ this.getShareId() == null)
            return false;
        if (other.getShareId() != null && other.getShareId().equals(this.getShareId()) == false)
            return false;
        if (other.getSharedWith() == null ^ this.getSharedWith() == null)
            return false;
        if (other.getSharedWith() != null && other.getSharedWith().equals(this.getSharedWith()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareId() == null) ? 0 : getShareId().hashCode());
        hashCode = prime * hashCode + ((getSharedWith() == null) ? 0 : getSharedWith().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public WorkloadShareSummary clone() {
        try {
            return (WorkloadShareSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.WorkloadShareSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
