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
 * Container for the parameters to the {@link com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#modifyMountTargetSecurityGroups(ModifyMountTargetSecurityGroupsRequest) ModifyMountTargetSecurityGroups operation}.
 * <p>
 * Modifies the set of security groups in effect for a mount target.
 * </p>
 * <p>
 * When you create a mount target, Amazon EFS also creates a new network
 * interface (see CreateMountTarget). This operation replaces the
 * security groups in effect for the network interface associated with a
 * mount target, with the <code>SecurityGroups</code> provided in the
 * request. This operation requires that the network interface of the
 * mount target has been created and the life cycle state of the mount
 * target is not "deleted".
 * </p>
 * <p>
 * The operation requires permissions for the following actions:
 * </p>
 * 
 * <ul>
 * <li> <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code>
 * action on the mount target's file system. </li>
 * <li> <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the
 * mount target's network interface. </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#modifyMountTargetSecurityGroups(ModifyMountTargetSecurityGroupsRequest)
 */
public class ModifyMountTargetSecurityGroupsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the mount target whose security groups you want to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     */
    private String mountTargetId;

    /**
     * An array of up to five VPC security group IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * The ID of the mount target whose security groups you want to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @return The ID of the mount target whose security groups you want to modify.
     */
    public String getMountTargetId() {
        return mountTargetId;
    }
    
    /**
     * The ID of the mount target whose security groups you want to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @param mountTargetId The ID of the mount target whose security groups you want to modify.
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }
    
    /**
     * The ID of the mount target whose security groups you want to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @param mountTargetId The ID of the mount target whose security groups you want to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyMountTargetSecurityGroupsRequest withMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    /**
     * An array of up to five VPC security group IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return An array of up to five VPC security group IDs.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * An array of up to five VPC security group IDs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param securityGroups An array of up to five VPC security group IDs.
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
     * An array of up to five VPC security group IDs.
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
     * @param securityGroups An array of up to five VPC security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyMountTargetSecurityGroupsRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * An array of up to five VPC security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param securityGroups An array of up to five VPC security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyMountTargetSecurityGroupsRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
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
        if (getMountTargetId() != null) sb.append("MountTargetId: " + getMountTargetId() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyMountTargetSecurityGroupsRequest == false) return false;
        ModifyMountTargetSecurityGroupsRequest other = (ModifyMountTargetSecurityGroupsRequest)obj;
        
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null) return false;
        if (other.getMountTargetId() != null && other.getMountTargetId().equals(this.getMountTargetId()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyMountTargetSecurityGroupsRequest clone() {
        
            return (ModifyMountTargetSecurityGroupsRequest) super.clone();
    }

}
    