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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteNetworkInterfacePermissionRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteNetworkInterfacePermission.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNetworkInterfacePermissionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteNetworkInterfacePermissionRequest> {

    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     */
    private String networkInterfacePermissionId;
    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network interface is attached to an instance.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     * 
     * @param networkInterfacePermissionId
     *        The ID of the network interface permission.
     */

    public void setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
        this.networkInterfacePermissionId = networkInterfacePermissionId;
    }

    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     * 
     * @return The ID of the network interface permission.
     */

    public String getNetworkInterfacePermissionId() {
        return this.networkInterfacePermissionId;
    }

    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     * 
     * @param networkInterfacePermissionId
     *        The ID of the network interface permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNetworkInterfacePermissionRequest withNetworkInterfacePermissionId(String networkInterfacePermissionId) {
        setNetworkInterfacePermissionId(networkInterfacePermissionId);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network interface is attached to an instance.
     * </p>
     * 
     * @param force
     *        Specify <code>true</code> to remove the permission even if the network interface is attached to an
     *        instance.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network interface is attached to an instance.
     * </p>
     * 
     * @return Specify <code>true</code> to remove the permission even if the network interface is attached to an
     *         instance.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network interface is attached to an instance.
     * </p>
     * 
     * @param force
     *        Specify <code>true</code> to remove the permission even if the network interface is attached to an
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNetworkInterfacePermissionRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network interface is attached to an instance.
     * </p>
     * 
     * @return Specify <code>true</code> to remove the permission even if the network interface is attached to an
     *         instance.
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteNetworkInterfacePermissionRequest> getDryRunRequest() {
        Request<DeleteNetworkInterfacePermissionRequest> request = new DeleteNetworkInterfacePermissionRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNetworkInterfacePermissionId() != null)
            sb.append("NetworkInterfacePermissionId: ").append(getNetworkInterfacePermissionId()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNetworkInterfacePermissionRequest == false)
            return false;
        DeleteNetworkInterfacePermissionRequest other = (DeleteNetworkInterfacePermissionRequest) obj;
        if (other.getNetworkInterfacePermissionId() == null ^ this.getNetworkInterfacePermissionId() == null)
            return false;
        if (other.getNetworkInterfacePermissionId() != null && other.getNetworkInterfacePermissionId().equals(this.getNetworkInterfacePermissionId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfacePermissionId() == null) ? 0 : getNetworkInterfacePermissionId().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNetworkInterfacePermissionRequest clone() {
        return (DeleteNetworkInterfacePermissionRequest) super.clone();
    }
}
