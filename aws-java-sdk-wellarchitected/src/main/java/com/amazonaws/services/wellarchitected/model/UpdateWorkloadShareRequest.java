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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for Update Workload Share
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkloadShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkloadShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String shareId;

    private String workloadId;

    private String permissionType;

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

    public UpdateWorkloadShareRequest withShareId(String shareId) {
        setShareId(shareId);
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

    public UpdateWorkloadShareRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
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

    public UpdateWorkloadShareRequest withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * @param permissionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public UpdateWorkloadShareRequest withPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType.toString();
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkloadShareRequest == false)
            return false;
        UpdateWorkloadShareRequest other = (UpdateWorkloadShareRequest) obj;
        if (other.getShareId() == null ^ this.getShareId() == null)
            return false;
        if (other.getShareId() != null && other.getShareId().equals(this.getShareId()) == false)
            return false;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareId() == null) ? 0 : getShareId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkloadShareRequest clone() {
        return (UpdateWorkloadShareRequest) super.clone();
    }

}
