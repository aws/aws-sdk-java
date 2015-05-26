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
 * Container for the parameters to the {@link com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest) DescribeMountTargetSecurityGroups operation}.
 * <p>
 * Returns the security groups currently in effect for a mount target.
 * This operation requires that the network interface of the mount target
 * has been created and the life cycle state of the mount target is not
 * "deleted".
 * </p>
 * <p>
 * This operation requires permissions for the following actions:
 * </p>
 * 
 * <ul>
 * <li> <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code>
 * action on the mount target's file system. </li>
 * <li> <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the
 * mount target's network interface. </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest)
 */
public class DescribeMountTargetSecurityGroupsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the mount target whose security groups you want to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     */
    private String mountTargetId;

    /**
     * The ID of the mount target whose security groups you want to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @return The ID of the mount target whose security groups you want to retrieve.
     */
    public String getMountTargetId() {
        return mountTargetId;
    }
    
    /**
     * The ID of the mount target whose security groups you want to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @param mountTargetId The ID of the mount target whose security groups you want to retrieve.
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }
    
    /**
     * The ID of the mount target whose security groups you want to retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @param mountTargetId The ID of the mount target whose security groups you want to retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMountTargetSecurityGroupsRequest withMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
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
        if (getMountTargetId() != null) sb.append("MountTargetId: " + getMountTargetId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMountTargetSecurityGroupsRequest == false) return false;
        DescribeMountTargetSecurityGroupsRequest other = (DescribeMountTargetSecurityGroupsRequest)obj;
        
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null) return false;
        if (other.getMountTargetId() != null && other.getMountTargetId().equals(this.getMountTargetId()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeMountTargetSecurityGroupsRequest clone() {
        
            return (DescribeMountTargetSecurityGroupsRequest) super.clone();
    }

}
    