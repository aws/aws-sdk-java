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
 * Input for Create Workload Share
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkloadShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkloadShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private String sharedWith;

    private String permissionType;

    private String clientRequestToken;

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

    public CreateWorkloadShareRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
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

    public CreateWorkloadShareRequest withSharedWith(String sharedWith) {
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

    public CreateWorkloadShareRequest withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * @param permissionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public CreateWorkloadShareRequest withPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkloadShareRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getSharedWith() != null)
            sb.append("SharedWith: ").append(getSharedWith()).append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkloadShareRequest == false)
            return false;
        CreateWorkloadShareRequest other = (CreateWorkloadShareRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getSharedWith() == null ^ this.getSharedWith() == null)
            return false;
        if (other.getSharedWith() != null && other.getSharedWith().equals(this.getSharedWith()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getSharedWith() == null) ? 0 : getSharedWith().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkloadShareRequest clone() {
        return (CreateWorkloadShareRequest) super.clone();
    }

}
