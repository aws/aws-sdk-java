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
 * Container for the parameters to the {@link com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#deleteMountTarget(DeleteMountTargetRequest) DeleteMountTarget operation}.
 * <p>
 * Deletes the specified mount target.
 * </p>
 * <p>
 * This operation forcibly breaks any mounts of the file system via the
 * mount target being deleted, which might disrupt instances or
 * applications using those mounts. To avoid applications getting cut off
 * abruptly, you might consider unmounting any mounts of the mount
 * target, if feasible. The operation also deletes the associated network
 * interface. Uncommitted writes may be lost, but breaking a mount target
 * using this operation does not corrupt the file system itself. The file
 * system you created remains. You can mount an EC2 instance in your VPC
 * using another mount target.
 * </p>
 * <p>
 * This operation requires permission for the following action on the
 * file system:
 * </p>
 * 
 * <ul>
 * <li> <code>elasticfilesystem:DeleteMountTarget</code> </li>
 * 
 * </ul>
 * <p>
 * <b>NOTE:</b>The DeleteMountTarget call returns while the mount target
 * state is still "deleting". You can check the mount target deletion by
 * calling the DescribeMountTargets API, which returns a list of mount
 * target descriptions for the given file system.
 * </p>
 * <p>
 * The operation also requires permission for the following Amazon EC2
 * action on the mount target's network interface:
 * </p>
 * 
 * <ul>
 * <li> <code>ec2:DeleteNetworkInterface</code> </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#deleteMountTarget(DeleteMountTargetRequest)
 */
public class DeleteMountTargetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * String. The ID of the mount target to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     */
    private String mountTargetId;

    /**
     * String. The ID of the mount target to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @return String. The ID of the mount target to delete.
     */
    public String getMountTargetId() {
        return mountTargetId;
    }
    
    /**
     * String. The ID of the mount target to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @param mountTargetId String. The ID of the mount target to delete.
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }
    
    /**
     * String. The ID of the mount target to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fsmt-[0-9a-f]{8}<br/>
     *
     * @param mountTargetId String. The ID of the mount target to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteMountTargetRequest withMountTargetId(String mountTargetId) {
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

        if (obj instanceof DeleteMountTargetRequest == false) return false;
        DeleteMountTargetRequest other = (DeleteMountTargetRequest)obj;
        
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null) return false;
        if (other.getMountTargetId() != null && other.getMountTargetId().equals(this.getMountTargetId()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteMountTargetRequest clone() {
        
            return (DeleteMountTargetRequest) super.clone();
    }

}
    