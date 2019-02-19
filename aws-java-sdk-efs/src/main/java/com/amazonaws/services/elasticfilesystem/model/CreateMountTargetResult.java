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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Provides a description of a mount target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateMountTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMountTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     */
    private String mountTargetId;
    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     */
    private String lifeCycleState;
    /**
     * <p>
     * Address at which the file system can be mounted by using the mount target.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     * 
     * @param ownerId
     *        AWS account ID that owns the resource.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     * 
     * @return AWS account ID that owns the resource.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     * 
     * @param ownerId
     *        AWS account ID that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetResult withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     * 
     * @param mountTargetId
     *        System-assigned mount target ID.
     */

    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     * 
     * @return System-assigned mount target ID.
     */

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     * 
     * @param mountTargetId
     *        System-assigned mount target ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetResult withMountTargetId(String mountTargetId) {
        setMountTargetId(mountTargetId);
        return this;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system for which the mount target is intended.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     * 
     * @return The ID of the file system for which the mount target is intended.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system for which the mount target is intended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetResult withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the mount target's subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     * 
     * @return The ID of the mount target's subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the mount target's subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetResult withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle state of the mount target.
     * @see LifeCycleState
     */

    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @return Lifecycle state of the mount target.
     * @see LifeCycleState
     */

    public String getLifeCycleState() {
        return this.lifeCycleState;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle state of the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public CreateMountTargetResult withLifeCycleState(String lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle state of the mount target.
     * @see LifeCycleState
     */

    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        withLifeCycleState(lifeCycleState);
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle state of the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public CreateMountTargetResult withLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
        return this;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount target.
     * </p>
     * 
     * @param ipAddress
     *        Address at which the file system can be mounted by using the mount target.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount target.
     * </p>
     * 
     * @return Address at which the file system can be mounted by using the mount target.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount target.
     * </p>
     * 
     * @param ipAddress
     *        Address at which the file system can be mounted by using the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetResult withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface that Amazon EFS created when it created the mount target.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * </p>
     * 
     * @return The ID of the network interface that Amazon EFS created when it created the mount target.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface that Amazon EFS created when it created the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetResult withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getMountTargetId() != null)
            sb.append("MountTargetId: ").append(getMountTargetId()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: ").append(getLifeCycleState()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMountTargetResult == false)
            return false;
        CreateMountTargetResult other = (CreateMountTargetResult) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLifeCycleState() == null ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getLifeCycleState() == null) ? 0 : getLifeCycleState().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMountTargetResult clone() {
        try {
            return (CreateMountTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
