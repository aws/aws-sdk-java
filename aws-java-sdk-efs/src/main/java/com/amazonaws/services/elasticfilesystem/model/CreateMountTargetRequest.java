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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#createMountTarget(CreateMountTargetRequest) CreateMountTarget operation}.
 * <p>
 * Creates a mount target for a file system. You can then mount the file
 * system on EC2 instances via the mount target.
 * </p>
 * <p>
 * You can create one mount target in each Availability Zone in your VPC.
 * All EC2 instances in a VPC within a given Availability Zone share a
 * single mount target for a given file system. If you have multiple
 * subnets in an Availability Zone, you create a mount target in one of
 * the subnets. EC2 instances do not need to be in the same subnet as the
 * mount target in order to access their file system. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html"> Amazon EFS: How it Works </a>
 * .
 * </p>
 * <p>
 * In the request, you also specify a file system ID for which you are
 * creating the mount target and the file system's lifecycle state must
 * be "available" (see DescribeFileSystems).
 * </p>
 * <p>
 * In the request, you also provide a subnet ID, which serves several
 * purposes:
 * </p>
 * 
 * <ul>
 * <li>It determines the VPC in which Amazon EFS creates the mount
 * target.</li>
 * <li>It determines the Availability Zone in which Amazon EFS creates
 * the mount target. </li>
 * <li>It determines the IP address range from which Amazon EFS selects
 * the IP address of the mount target if you don't specify an IP address
 * in the request. </li>
 * 
 * </ul>
 * <p>
 * After creating the mount target, Amazon EFS returns a response that
 * includes, a <code>MountTargetId</code> and an <code>IpAddress</code> .
 * You use this IP address when mounting the file system in an EC2
 * instance. You can also use the mount target's DNS name when mounting
 * the file system. The EC2 instance on which you mount the file system
 * via the mount target can resolve the mount target's DNS name to its IP
 * address. For more information, see
 * <a href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation"> How it Works: Implementation Overview </a>
 * 
 * </p>
 * <p>
 * Note that you can create mount targets for a file system in only one
 * VPC, and there can be only one mount target per Availability Zone.
 * That is, if the file system already has one or more mount targets
 * created for it, the request to add another mount target must meet the
 * following requirements:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * The subnet specified in the request must belong to the same VPC as the
 * subnets of the existing mount targets.
 * </p>
 * </li>
 * <li>The subnet specified in the request must not be in the same
 * Availability Zone as any of the subnets of the existing mount
 * targets.</li>
 * 
 * </ul>
 * <p>
 * If the request satisfies the requirements, Amazon EFS does the
 * following:
 * </p>
 * 
 * <ul>
 * <li>Creates a new mount target in the specified subnet. </li>
 * <li>Also creates a new network interface in the subnet as follows:
 * <ul>
 * <li>If the request provides an <code>IpAddress</code> , Amazon EFS
 * assigns that IP address to the network interface. Otherwise, Amazon
 * EFS assigns a free address in the subnet (in the same way that the
 * Amazon EC2 <code>CreateNetworkInterface</code> call does when a
 * request does not specify a primary private IP address).</li>
 * <li>If the request provides <code>SecurityGroups</code> , this
 * network interface is associated with those security groups. Otherwise,
 * it belongs to the default security group for the subnet's VPC.</li>
 * <li>Assigns the description <code>"Mount target fsmt-id for file
 * system fs-id"</code> where <code> fsmt-id </code> is the mount target
 * ID, and <code> fs-id </code> is the <code>FileSystemId</code> .</li>
 * <li>Sets the <code>requesterManaged</code> property of the network
 * interface to "true", and the <code>requesterId</code> value to
 * "EFS".</li>
 * 
 * </ul>
 * <p>
 * Each Amazon EFS mount target has one corresponding requestor-managed
 * EC2 network interface. After the network interface is created, Amazon
 * EFS sets the <code>NetworkInterfaceId</code> field in the mount
 * target's description to the network interface ID, and the
 * <code>IpAddress</code> field to its address. If network interface
 * creation fails, the entire <code>CreateMountTarget</code> operation
 * fails.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>NOTE:</b>The CreateMountTarget call returns only after creating the
 * network interface, but while the mount target state is still
 * "creating". You can check the mount target creation status by calling
 * the DescribeFileSystems API, which among other things returns the
 * mount target state.
 * </p>
 * <p>
 * We recommend you create a mount target in each of the Availability
 * Zones. There are cost considerations for using a file system in an
 * Availability Zone through a mount target created in another
 * Availability Zone. For more information, go to
 * <a href="http://aws.amazon.com/efs/"> Amazon EFS </a>
 * product detail page. In addition, by always using a mount target
 * local to the instance's Availability Zone, you eliminate a partial
 * failure scenario; if the Availablity Zone in which your mount target
 * is created goes down, then you won't be able to access your file
 * system through that mount target.
 * </p>
 * <p>
 * This operation requires permission for the following action on the
 * file system:
 * </p>
 * 
 * <ul>
 * <li> <code>elasticfilesystem:CreateMountTarget</code> </li>
 * 
 * </ul>
 * <p>
 * This operation also requires permission for the following Amazon EC2
 * actions:
 * </p>
 * 
 * <ul>
 * <li> <code>ec2:DescribeSubnets</code> </li>
 * <li> <code>ec2:DescribeNetworkInterfaces</code> </li>
 * <li> <code>ec2:CreateNetworkInterface</code> </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#createMountTarget(CreateMountTargetRequest)
 */
public class CreateMountTargetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the file system for which to create the mount target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     */
    private String fileSystemId;

    /**
     * The ID of the subnet to add the mount target in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     */
    private String subnetId;

    /**
     * A valid IPv4 address within the address range of the specified subnet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}<br/>
     */
    private String ipAddress;

    /**
     * Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     * be for the same VPC as subnet specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * The ID of the file system for which to create the mount target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @return The ID of the file system for which to create the mount target.
     */
    public String getFileSystemId() {
        return fileSystemId;
    }
    
    /**
     * The ID of the file system for which to create the mount target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId The ID of the file system for which to create the mount target.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }
    
    /**
     * The ID of the file system for which to create the mount target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId The ID of the file system for which to create the mount target.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMountTargetRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * The ID of the subnet to add the mount target in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @return The ID of the subnet to add the mount target in.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet to add the mount target in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @param subnetId The ID of the subnet to add the mount target in.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet to add the mount target in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @param subnetId The ID of the subnet to add the mount target in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMountTargetRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * A valid IPv4 address within the address range of the specified subnet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}<br/>
     *
     * @return A valid IPv4 address within the address range of the specified subnet.
     */
    public String getIpAddress() {
        return ipAddress;
    }
    
    /**
     * A valid IPv4 address within the address range of the specified subnet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}<br/>
     *
     * @param ipAddress A valid IPv4 address within the address range of the specified subnet.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    /**
     * A valid IPv4 address within the address range of the specified subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}<br/>
     *
     * @param ipAddress A valid IPv4 address within the address range of the specified subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMountTargetRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     * be for the same VPC as subnet specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     *         be for the same VPC as subnet specified.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     * be for the same VPC as subnet specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param securityGroups Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     *         be for the same VPC as subnet specified.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     * be for the same VPC as subnet specified.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or {@link
     * #withSecurityGroups(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param securityGroups Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     *         be for the same VPC as subnet specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMountTargetRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     * be for the same VPC as subnet specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param securityGroups Up to 5 VPC security group IDs, of the form "sg-xxxxxxxx". These must
     *         be for the same VPC as subnet specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMountTargetRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

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
        if (getFileSystemId() != null) sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getIpAddress() != null) sb.append("IpAddress: " + getIpAddress() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateMountTargetRequest == false) return false;
        CreateMountTargetRequest other = (CreateMountTargetRequest)obj;
        
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null) return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getIpAddress() == null ^ this.getIpAddress() == null) return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateMountTargetRequest clone() {
        
            return (CreateMountTargetRequest) super.clone();
    }

}
    