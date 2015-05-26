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
 * Container for the parameters to the {@link com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#deleteFileSystem(DeleteFileSystemRequest) DeleteFileSystem operation}.
 * <p>
 * Deletes a file system, permanently severing access to its contents.
 * Upon return, the file system no longer exists and you will not be able
 * to access any contents of the deleted file system.
 * </p>
 * <p>
 * You cannot delete a file system that is in use. That is, if the file
 * system has any mount targets, you must first delete them. For more
 * information, see DescribeMountTargets and DeleteMountTarget.
 * </p>
 * <p>
 * <b>NOTE:</b>The DeleteFileSystem call returns while the file system
 * state is still "deleting". You can check the file system deletion
 * status by calling the DescribeFileSystems API, which returns a list of
 * file systems in your account. If you pass file system ID or creation
 * token for the deleted file system, the DescribeFileSystems will return
 * a 404 "FileSystemNotFound" error.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>elasticfilesystem:DeleteFileSystem</code> action.
 * </p>
 *
 * @see com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#deleteFileSystem(DeleteFileSystemRequest)
 */
public class DeleteFileSystemRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the file system you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     */
    private String fileSystemId;

    /**
     * The ID of the file system you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @return The ID of the file system you want to delete.
     */
    public String getFileSystemId() {
        return fileSystemId;
    }
    
    /**
     * The ID of the file system you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId The ID of the file system you want to delete.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }
    
    /**
     * The ID of the file system you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId The ID of the file system you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteFileSystemRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
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
        if (getFileSystemId() != null) sb.append("FileSystemId: " + getFileSystemId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteFileSystemRequest == false) return false;
        DeleteFileSystemRequest other = (DeleteFileSystemRequest)obj;
        
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null) return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteFileSystemRequest clone() {
        
            return (DeleteFileSystemRequest) super.clone();
    }

}
    