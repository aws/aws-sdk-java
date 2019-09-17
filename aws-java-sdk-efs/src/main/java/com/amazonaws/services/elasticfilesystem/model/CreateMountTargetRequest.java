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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateMountTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMountTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the file system for which to create the mount target.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The ID of the subnet to add the mount target in.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * Valid IPv4 address within the address range of the specified subnet.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC as subnet
     * specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;

    /**
     * <p>
     * The ID of the file system for which to create the mount target.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system for which to create the mount target.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which to create the mount target.
     * </p>
     * 
     * @return The ID of the file system for which to create the mount target.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which to create the mount target.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system for which to create the mount target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet to add the mount target in.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet to add the mount target in.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet to add the mount target in.
     * </p>
     * 
     * @return The ID of the subnet to add the mount target in.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet to add the mount target in.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet to add the mount target in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * Valid IPv4 address within the address range of the specified subnet.
     * </p>
     * 
     * @param ipAddress
     *        Valid IPv4 address within the address range of the specified subnet.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Valid IPv4 address within the address range of the specified subnet.
     * </p>
     * 
     * @return Valid IPv4 address within the address range of the specified subnet.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * Valid IPv4 address within the address range of the specified subnet.
     * </p>
     * 
     * @param ipAddress
     *        Valid IPv4 address within the address range of the specified subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetRequest withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC as subnet
     * specified.
     * </p>
     * 
     * @return Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC
     *         as subnet specified.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC as subnet
     * specified.
     * </p>
     * 
     * @param securityGroups
     *        Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC as
     *        subnet specified.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(securityGroups);
    }

    /**
     * <p>
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC as subnet
     * specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC as
     *        subnet specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetRequest withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC as subnet
     * specified.
     * </p>
     * 
     * @param securityGroups
     *        Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>. These must be for the same VPC as
     *        subnet specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMountTargetRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMountTargetRequest == false)
            return false;
        CreateMountTargetRequest other = (CreateMountTargetRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public CreateMountTargetRequest clone() {
        return (CreateMountTargetRequest) super.clone();
    }

}
