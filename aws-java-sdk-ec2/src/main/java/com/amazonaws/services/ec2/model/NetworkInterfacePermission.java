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

/**
 * <p>
 * Describes a permission for a network interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkInterfacePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterfacePermission implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     */
    private String networkInterfacePermissionId;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The AWS service.
     * </p>
     */
    private String awsService;
    /**
     * <p>
     * The type of permission.
     * </p>
     */
    private String permission;
    /**
     * <p>
     * Information about the state of the permission.
     * </p>
     */
    private NetworkInterfacePermissionState permissionState;

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

    public NetworkInterfacePermission withNetworkInterfacePermissionId(String networkInterfacePermissionId) {
        setNetworkInterfacePermissionId(networkInterfacePermissionId);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterfacePermission withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterfacePermission withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     * 
     * @param awsService
     *        The AWS service.
     */

    public void setAwsService(String awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     * 
     * @return The AWS service.
     */

    public String getAwsService() {
        return this.awsService;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     * 
     * @param awsService
     *        The AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterfacePermission withAwsService(String awsService) {
        setAwsService(awsService);
        return this;
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * 
     * @param permission
     *        The type of permission.
     * @see InterfacePermissionType
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * 
     * @return The type of permission.
     * @see InterfacePermissionType
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * 
     * @param permission
     *        The type of permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterfacePermissionType
     */

    public NetworkInterfacePermission withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * 
     * @param permission
     *        The type of permission.
     * @see InterfacePermissionType
     */

    public void setPermission(InterfacePermissionType permission) {
        withPermission(permission);
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * 
     * @param permission
     *        The type of permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterfacePermissionType
     */

    public NetworkInterfacePermission withPermission(InterfacePermissionType permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * Information about the state of the permission.
     * </p>
     * 
     * @param permissionState
     *        Information about the state of the permission.
     */

    public void setPermissionState(NetworkInterfacePermissionState permissionState) {
        this.permissionState = permissionState;
    }

    /**
     * <p>
     * Information about the state of the permission.
     * </p>
     * 
     * @return Information about the state of the permission.
     */

    public NetworkInterfacePermissionState getPermissionState() {
        return this.permissionState;
    }

    /**
     * <p>
     * Information about the state of the permission.
     * </p>
     * 
     * @param permissionState
     *        Information about the state of the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterfacePermission withPermissionState(NetworkInterfacePermissionState permissionState) {
        setPermissionState(permissionState);
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
        if (getNetworkInterfacePermissionId() != null)
            sb.append("NetworkInterfacePermissionId: ").append(getNetworkInterfacePermissionId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsService() != null)
            sb.append("AwsService: ").append(getAwsService()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
        if (getPermissionState() != null)
            sb.append("PermissionState: ").append(getPermissionState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterfacePermission == false)
            return false;
        NetworkInterfacePermission other = (NetworkInterfacePermission) obj;
        if (other.getNetworkInterfacePermissionId() == null ^ this.getNetworkInterfacePermissionId() == null)
            return false;
        if (other.getNetworkInterfacePermissionId() != null && other.getNetworkInterfacePermissionId().equals(this.getNetworkInterfacePermissionId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getPermissionState() == null ^ this.getPermissionState() == null)
            return false;
        if (other.getPermissionState() != null && other.getPermissionState().equals(this.getPermissionState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfacePermissionId() == null) ? 0 : getNetworkInterfacePermissionId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getPermissionState() == null) ? 0 : getPermissionState().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInterfacePermission clone() {
        try {
            return (NetworkInterfacePermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
