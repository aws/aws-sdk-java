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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a WorkSpace.
 * </p>
 */
public class Workspace implements Serializable, Cloneable {

    /**
     * The identifier of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     */
    private String workspaceId;

    /**
     * The identifier of the AWS Directory Service directory that the
     * WorkSpace belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     */
    private String directoryId;

    /**
     * The user that the WorkSpace is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     */
    private String userName;

    /**
     * The IP address of the WorkSpace.
     */
    private String ipAddress;

    /**
     * The operational state of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, IMPAIRED, UNHEALTHY, REBOOTING, REBUILDING, TERMINATING, TERMINATED, SUSPENDED, ERROR
     */
    private String state;

    /**
     * The identifier of the bundle that the WorkSpace was created from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     */
    private String bundleId;

    /**
     * The identifier of the subnet that the WorkSpace is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8})$<br/>
     */
    private String subnetId;

    /**
     * If the WorkSpace could not be created, this contains a textual error
     * message that describes the failure.
     */
    private String errorMessage;

    /**
     * If the WorkSpace could not be created, this contains the error code.
     */
    private String errorCode;

    /**
     * The identifier of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @return The identifier of the WorkSpace.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }
    
    /**
     * The identifier of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @param workspaceId The identifier of the WorkSpace.
     */
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
    
    /**
     * The identifier of the WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @param workspaceId The identifier of the WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Workspace withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * The identifier of the AWS Directory Service directory that the
     * WorkSpace belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @return The identifier of the AWS Directory Service directory that the
     *         WorkSpace belongs to.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the AWS Directory Service directory that the
     * WorkSpace belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @param directoryId The identifier of the AWS Directory Service directory that the
     *         WorkSpace belongs to.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the AWS Directory Service directory that the
     * WorkSpace belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @param directoryId The identifier of the AWS Directory Service directory that the
     *         WorkSpace belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Workspace withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The user that the WorkSpace is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @return The user that the WorkSpace is assigned to.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The user that the WorkSpace is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param userName The user that the WorkSpace is assigned to.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The user that the WorkSpace is assigned to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param userName The user that the WorkSpace is assigned to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Workspace withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The IP address of the WorkSpace.
     *
     * @return The IP address of the WorkSpace.
     */
    public String getIpAddress() {
        return ipAddress;
    }
    
    /**
     * The IP address of the WorkSpace.
     *
     * @param ipAddress The IP address of the WorkSpace.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    /**
     * The IP address of the WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipAddress The IP address of the WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Workspace withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * The operational state of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, IMPAIRED, UNHEALTHY, REBOOTING, REBUILDING, TERMINATING, TERMINATED, SUSPENDED, ERROR
     *
     * @return The operational state of the WorkSpace.
     *
     * @see WorkspaceState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The operational state of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, IMPAIRED, UNHEALTHY, REBOOTING, REBUILDING, TERMINATING, TERMINATED, SUSPENDED, ERROR
     *
     * @param state The operational state of the WorkSpace.
     *
     * @see WorkspaceState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The operational state of the WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, IMPAIRED, UNHEALTHY, REBOOTING, REBUILDING, TERMINATING, TERMINATED, SUSPENDED, ERROR
     *
     * @param state The operational state of the WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see WorkspaceState
     */
    public Workspace withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The operational state of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, IMPAIRED, UNHEALTHY, REBOOTING, REBUILDING, TERMINATING, TERMINATED, SUSPENDED, ERROR
     *
     * @param state The operational state of the WorkSpace.
     *
     * @see WorkspaceState
     */
    public void setState(WorkspaceState state) {
        this.state = state.toString();
    }
    
    /**
     * The operational state of the WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, AVAILABLE, IMPAIRED, UNHEALTHY, REBOOTING, REBUILDING, TERMINATING, TERMINATED, SUSPENDED, ERROR
     *
     * @param state The operational state of the WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see WorkspaceState
     */
    public Workspace withState(WorkspaceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The identifier of the bundle that the WorkSpace was created from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @return The identifier of the bundle that the WorkSpace was created from.
     */
    public String getBundleId() {
        return bundleId;
    }
    
    /**
     * The identifier of the bundle that the WorkSpace was created from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @param bundleId The identifier of the bundle that the WorkSpace was created from.
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    
    /**
     * The identifier of the bundle that the WorkSpace was created from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @param bundleId The identifier of the bundle that the WorkSpace was created from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Workspace withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * The identifier of the subnet that the WorkSpace is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8})$<br/>
     *
     * @return The identifier of the subnet that the WorkSpace is in.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The identifier of the subnet that the WorkSpace is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8})$<br/>
     *
     * @param subnetId The identifier of the subnet that the WorkSpace is in.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The identifier of the subnet that the WorkSpace is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8})$<br/>
     *
     * @param subnetId The identifier of the subnet that the WorkSpace is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Workspace withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * If the WorkSpace could not be created, this contains a textual error
     * message that describes the failure.
     *
     * @return If the WorkSpace could not be created, this contains a textual error
     *         message that describes the failure.
     */
    public String getErrorMessage() {
        return errorMessage;
    }
    
    /**
     * If the WorkSpace could not be created, this contains a textual error
     * message that describes the failure.
     *
     * @param errorMessage If the WorkSpace could not be created, this contains a textual error
     *         message that describes the failure.
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    /**
     * If the WorkSpace could not be created, this contains a textual error
     * message that describes the failure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorMessage If the WorkSpace could not be created, this contains a textual error
     *         message that describes the failure.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Workspace withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * If the WorkSpace could not be created, this contains the error code.
     *
     * @return If the WorkSpace could not be created, this contains the error code.
     */
    public String getErrorCode() {
        return errorCode;
    }
    
    /**
     * If the WorkSpace could not be created, this contains the error code.
     *
     * @param errorCode If the WorkSpace could not be created, this contains the error code.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    /**
     * If the WorkSpace could not be created, this contains the error code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorCode If the WorkSpace could not be created, this contains the error code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Workspace withErrorCode(String errorCode) {
        this.errorCode = errorCode;
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
        if (getWorkspaceId() != null) sb.append("WorkspaceId: " + getWorkspaceId() + ",");
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getIpAddress() != null) sb.append("IpAddress: " + getIpAddress() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getBundleId() != null) sb.append("BundleId: " + getBundleId() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getErrorMessage() != null) sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getErrorCode() != null) sb.append("ErrorCode: " + getErrorCode() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Workspace == false) return false;
        Workspace other = (Workspace)obj;
        
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null) return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false) return false; 
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getIpAddress() == null ^ this.getIpAddress() == null) return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getBundleId() == null ^ this.getBundleId() == null) return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null) return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false) return false; 
        if (other.getErrorCode() == null ^ this.getErrorCode() == null) return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false) return false; 
        return true;
    }
    
    @Override
    public Workspace clone() {
        try {
            return (Workspace) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    