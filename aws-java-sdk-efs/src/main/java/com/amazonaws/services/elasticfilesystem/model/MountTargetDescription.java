/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;

/**
 * <p>
 * This object provides description of a mount target.
 * </p>
 */
public class MountTargetDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The system-assigned mount target ID.
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
     * The ID of the subnet that the mount target is in.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The lifecycle state the mount target is in.
     * </p>
     */
    private String lifeCycleState;
    /**
     * <p>
     * The address at which the file system may be mounted via the mount target.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created
     * the mount target.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID that owns the resource.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     * 
     * @return The AWS account ID that owns the resource.
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID that owns the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The system-assigned mount target ID.
     * </p>
     * 
     * @param mountTargetId
     *        The system-assigned mount target ID.
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * The system-assigned mount target ID.
     * </p>
     * 
     * @return The system-assigned mount target ID.
     */
    public String getMountTargetId() {
        return this.mountTargetId;
    }

    /**
     * <p>
     * The system-assigned mount target ID.
     * </p>
     * 
     * @param mountTargetId
     *        The system-assigned mount target ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withMountTargetId(String mountTargetId) {
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet that the mount target is in.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet that the mount target is in.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet that the mount target is in.
     * </p>
     * 
     * @return The ID of the subnet that the mount target is in.
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet that the mount target is in.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet that the mount target is in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The lifecycle state the mount target is in.
     * </p>
     * 
     * @param lifeCycleState
     *        The lifecycle state the mount target is in.
     * @see LifeCycleState
     */
    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * The lifecycle state the mount target is in.
     * </p>
     * 
     * @return The lifecycle state the mount target is in.
     * @see LifeCycleState
     */
    public String getLifeCycleState() {
        return this.lifeCycleState;
    }

    /**
     * <p>
     * The lifecycle state the mount target is in.
     * </p>
     * 
     * @param lifeCycleState
     *        The lifecycle state the mount target is in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public MountTargetDescription withLifeCycleState(String lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * The lifecycle state the mount target is in.
     * </p>
     * 
     * @param lifeCycleState
     *        The lifecycle state the mount target is in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
    }

    /**
     * <p>
     * The lifecycle state the mount target is in.
     * </p>
     * 
     * @param lifeCycleState
     *        The lifecycle state the mount target is in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public MountTargetDescription withLifeCycleState(
            LifeCycleState lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * The address at which the file system may be mounted via the mount target.
     * </p>
     * 
     * @param ipAddress
     *        The address at which the file system may be mounted via the mount
     *        target.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The address at which the file system may be mounted via the mount target.
     * </p>
     * 
     * @return The address at which the file system may be mounted via the mount
     *         target.
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The address at which the file system may be mounted via the mount target.
     * </p>
     * 
     * @param ipAddress
     *        The address at which the file system may be mounted via the mount
     *        target.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created
     * the mount target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface that Amazon EFS created when it
     *        created the mount target.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created
     * the mount target.
     * </p>
     * 
     * @return The ID of the network interface that Amazon EFS created when it
     *         created the mount target.
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created
     * the mount target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface that Amazon EFS created when it
     *        created the mount target.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withNetworkInterfaceId(
            String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getMountTargetId() != null)
            sb.append("MountTargetId: " + getMountTargetId() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: " + getLifeCycleState() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MountTargetDescription == false)
            return false;
        MountTargetDescription other = (MountTargetDescription) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null
                && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null
                && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null
                && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLifeCycleState() == null
                ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null
                && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null
                ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(
                        this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getMountTargetId() == null) ? 0 : getMountTargetId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getLifeCycleState() == null) ? 0 : getLifeCycleState()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getNetworkInterfaceId() == null) ? 0
                        : getNetworkInterfaceId().hashCode());
        return hashCode;
    }

    @Override
    public MountTargetDescription clone() {
        try {
            return (MountTargetDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}