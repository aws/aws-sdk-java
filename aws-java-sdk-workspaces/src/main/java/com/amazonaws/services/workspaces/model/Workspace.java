/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a WorkSpace.
 * </p>
 */
public class Workspace implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The identifier of the AWS Directory Service directory that the WorkSpace belongs to.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The user that the WorkSpace is assigned to.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The IP address of the WorkSpace.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The operational state of the WorkSpace.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The identifier of the bundle that the WorkSpace was created from.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The identifier of the subnet that the WorkSpace is in.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * If the WorkSpace could not be created, this contains a textual error message that describes the failure.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * If the WorkSpace could not be created, this contains the error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The name of the WorkSpace as seen by the operating system.
     * </p>
     */
    private String computerName;
    /**
     * <p>
     * The KMS key used to encrypt data stored on your WorkSpace.
     * </p>
     */
    private String volumeEncryptionKey;
    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     * </p>
     */
    private Boolean userVolumeEncryptionEnabled;
    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     * </p>
     */
    private Boolean rootVolumeEncryptionEnabled;

    private WorkspaceProperties workspaceProperties;

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the WorkSpace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @return The identifier of the WorkSpace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS Directory Service directory that the WorkSpace belongs to.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the AWS Directory Service directory that the WorkSpace belongs to.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the AWS Directory Service directory that the WorkSpace belongs to.
     * </p>
     * 
     * @return The identifier of the AWS Directory Service directory that the WorkSpace belongs to.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the AWS Directory Service directory that the WorkSpace belongs to.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the AWS Directory Service directory that the WorkSpace belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The user that the WorkSpace is assigned to.
     * </p>
     * 
     * @param userName
     *        The user that the WorkSpace is assigned to.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user that the WorkSpace is assigned to.
     * </p>
     * 
     * @return The user that the WorkSpace is assigned to.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user that the WorkSpace is assigned to.
     * </p>
     * 
     * @param userName
     *        The user that the WorkSpace is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The IP address of the WorkSpace.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the WorkSpace.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the WorkSpace.
     * </p>
     * 
     * @return The IP address of the WorkSpace.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the WorkSpace.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The operational state of the WorkSpace.
     * </p>
     * 
     * @param state
     *        The operational state of the WorkSpace.
     * @see WorkspaceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The operational state of the WorkSpace.
     * </p>
     * 
     * @return The operational state of the WorkSpace.
     * @see WorkspaceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The operational state of the WorkSpace.
     * </p>
     * 
     * @param state
     *        The operational state of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceState
     */

    public Workspace withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The operational state of the WorkSpace.
     * </p>
     * 
     * @param state
     *        The operational state of the WorkSpace.
     * @see WorkspaceState
     */

    public void setState(WorkspaceState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The operational state of the WorkSpace.
     * </p>
     * 
     * @param state
     *        The operational state of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceState
     */

    public Workspace withState(WorkspaceState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The identifier of the bundle that the WorkSpace was created from.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle that the WorkSpace was created from.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle that the WorkSpace was created from.
     * </p>
     * 
     * @return The identifier of the bundle that the WorkSpace was created from.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle that the WorkSpace was created from.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle that the WorkSpace was created from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet that the WorkSpace is in.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet that the WorkSpace is in.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that the WorkSpace is in.
     * </p>
     * 
     * @return The identifier of the subnet that the WorkSpace is in.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that the WorkSpace is in.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet that the WorkSpace is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * If the WorkSpace could not be created, this contains a textual error message that describes the failure.
     * </p>
     * 
     * @param errorMessage
     *        If the WorkSpace could not be created, this contains a textual error message that describes the failure.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If the WorkSpace could not be created, this contains a textual error message that describes the failure.
     * </p>
     * 
     * @return If the WorkSpace could not be created, this contains a textual error message that describes the failure.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * If the WorkSpace could not be created, this contains a textual error message that describes the failure.
     * </p>
     * 
     * @param errorMessage
     *        If the WorkSpace could not be created, this contains a textual error message that describes the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * If the WorkSpace could not be created, this contains the error code.
     * </p>
     * 
     * @param errorCode
     *        If the WorkSpace could not be created, this contains the error code.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * If the WorkSpace could not be created, this contains the error code.
     * </p>
     * 
     * @return If the WorkSpace could not be created, this contains the error code.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * If the WorkSpace could not be created, this contains the error code.
     * </p>
     * 
     * @param errorCode
     *        If the WorkSpace could not be created, this contains the error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The name of the WorkSpace as seen by the operating system.
     * </p>
     * 
     * @param computerName
     *        The name of the WorkSpace as seen by the operating system.
     */

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    /**
     * <p>
     * The name of the WorkSpace as seen by the operating system.
     * </p>
     * 
     * @return The name of the WorkSpace as seen by the operating system.
     */

    public String getComputerName() {
        return this.computerName;
    }

    /**
     * <p>
     * The name of the WorkSpace as seen by the operating system.
     * </p>
     * 
     * @param computerName
     *        The name of the WorkSpace as seen by the operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withComputerName(String computerName) {
        setComputerName(computerName);
        return this;
    }

    /**
     * <p>
     * The KMS key used to encrypt data stored on your WorkSpace.
     * </p>
     * 
     * @param volumeEncryptionKey
     *        The KMS key used to encrypt data stored on your WorkSpace.
     */

    public void setVolumeEncryptionKey(String volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
    }

    /**
     * <p>
     * The KMS key used to encrypt data stored on your WorkSpace.
     * </p>
     * 
     * @return The KMS key used to encrypt data stored on your WorkSpace.
     */

    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    /**
     * <p>
     * The KMS key used to encrypt data stored on your WorkSpace.
     * </p>
     * 
     * @param volumeEncryptionKey
     *        The KMS key used to encrypt data stored on your WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withVolumeEncryptionKey(String volumeEncryptionKey) {
        setVolumeEncryptionKey(volumeEncryptionKey);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     * </p>
     * 
     * @param userVolumeEncryptionEnabled
     *        Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     */

    public void setUserVolumeEncryptionEnabled(Boolean userVolumeEncryptionEnabled) {
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     * </p>
     * 
     * @return Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     */

    public Boolean getUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     * </p>
     * 
     * @param userVolumeEncryptionEnabled
     *        Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withUserVolumeEncryptionEnabled(Boolean userVolumeEncryptionEnabled) {
        setUserVolumeEncryptionEnabled(userVolumeEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     * </p>
     * 
     * @return Specifies whether the data stored on the user volume, or D: drive, is encrypted.
     */

    public Boolean isUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     * </p>
     * 
     * @param rootVolumeEncryptionEnabled
     *        Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     */

    public void setRootVolumeEncryptionEnabled(Boolean rootVolumeEncryptionEnabled) {
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     * </p>
     * 
     * @return Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     */

    public Boolean getRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     * </p>
     * 
     * @param rootVolumeEncryptionEnabled
     *        Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withRootVolumeEncryptionEnabled(Boolean rootVolumeEncryptionEnabled) {
        setRootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     * </p>
     * 
     * @return Specifies whether the data stored on the root volume, or C: drive, is encrypted.
     */

    public Boolean isRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled;
    }

    /**
     * @param workspaceProperties
     */

    public void setWorkspaceProperties(WorkspaceProperties workspaceProperties) {
        this.workspaceProperties = workspaceProperties;
    }

    /**
     * @return
     */

    public WorkspaceProperties getWorkspaceProperties() {
        return this.workspaceProperties;
    }

    /**
     * @param workspaceProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workspace withWorkspaceProperties(WorkspaceProperties workspaceProperties) {
        setWorkspaceProperties(workspaceProperties);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: " + getWorkspaceId() + ",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getComputerName() != null)
            sb.append("ComputerName: " + getComputerName() + ",");
        if (getVolumeEncryptionKey() != null)
            sb.append("VolumeEncryptionKey: " + getVolumeEncryptionKey() + ",");
        if (getUserVolumeEncryptionEnabled() != null)
            sb.append("UserVolumeEncryptionEnabled: " + getUserVolumeEncryptionEnabled() + ",");
        if (getRootVolumeEncryptionEnabled() != null)
            sb.append("RootVolumeEncryptionEnabled: " + getRootVolumeEncryptionEnabled() + ",");
        if (getWorkspaceProperties() != null)
            sb.append("WorkspaceProperties: " + getWorkspaceProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workspace == false)
            return false;
        Workspace other = (Workspace) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getComputerName() == null ^ this.getComputerName() == null)
            return false;
        if (other.getComputerName() != null && other.getComputerName().equals(this.getComputerName()) == false)
            return false;
        if (other.getVolumeEncryptionKey() == null ^ this.getVolumeEncryptionKey() == null)
            return false;
        if (other.getVolumeEncryptionKey() != null && other.getVolumeEncryptionKey().equals(this.getVolumeEncryptionKey()) == false)
            return false;
        if (other.getUserVolumeEncryptionEnabled() == null ^ this.getUserVolumeEncryptionEnabled() == null)
            return false;
        if (other.getUserVolumeEncryptionEnabled() != null && other.getUserVolumeEncryptionEnabled().equals(this.getUserVolumeEncryptionEnabled()) == false)
            return false;
        if (other.getRootVolumeEncryptionEnabled() == null ^ this.getRootVolumeEncryptionEnabled() == null)
            return false;
        if (other.getRootVolumeEncryptionEnabled() != null && other.getRootVolumeEncryptionEnabled().equals(this.getRootVolumeEncryptionEnabled()) == false)
            return false;
        if (other.getWorkspaceProperties() == null ^ this.getWorkspaceProperties() == null)
            return false;
        if (other.getWorkspaceProperties() != null && other.getWorkspaceProperties().equals(this.getWorkspaceProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getComputerName() == null) ? 0 : getComputerName().hashCode());
        hashCode = prime * hashCode + ((getVolumeEncryptionKey() == null) ? 0 : getVolumeEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getUserVolumeEncryptionEnabled() == null) ? 0 : getUserVolumeEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getRootVolumeEncryptionEnabled() == null) ? 0 : getRootVolumeEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceProperties() == null) ? 0 : getWorkspaceProperties().hashCode());
        return hashCode;
    }

    @Override
    public Workspace clone() {
        try {
            return (Workspace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
