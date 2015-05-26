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
 * Container for the parameters to the {@link com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#createFileSystem(CreateFileSystemRequest) CreateFileSystem operation}.
 * <p>
 * Creates a new, empty file system. The operation requires a creation
 * token in the request that Amazon EFS uses to ensure idempotent
 * creation (calling the operation with same creation token has no
 * effect). If a file system does not currently exist that is owned by
 * the caller's AWS account with the specified creation token, this
 * operation does the following:
 * </p>
 * 
 * <ul>
 * <li>Creates a new, empty file system. The file system will have an
 * Amazon EFS assigned ID, and an initial lifecycle state "creating".
 * </li>
 * <li> Returns with the description of the created file system. </li>
 * 
 * </ul>
 * <p>
 * Otherwise, this operation returns a
 * <code>FileSystemAlreadyExists</code> error with the ID of the existing
 * file system.
 * </p>
 * <p>
 * <b>NOTE:</b>For basic use cases, you can use a randomly generated UUID
 * for the creation token.
 * </p>
 * <p>
 * The idempotent operation allows you to retry a
 * <code>CreateFileSystem</code> call without risk of creating an extra
 * file system. This can happen when an initial call fails in a way that
 * leaves it uncertain whether or not a file system was actually created.
 * An example might be that a transport level timeout occurred or your
 * connection was reset. As long as you use the same creation token, if
 * the initial call had succeeded in creating a file system, the client
 * can learn of its existence from the
 * <code>FileSystemAlreadyExists</code> error.
 * </p>
 * <p>
 * <b>NOTE:</b>The CreateFileSystem call returns while the file system's
 * lifecycle state is still "creating". You can check the file system
 * creation status by calling the DescribeFileSystems API, which among
 * other things returns the file system state.
 * </p>
 * <p>
 * After the file system is fully created, Amazon EFS sets its lifecycle
 * state to "available", at which point you can create one or more mount
 * targets for the file system (CreateMountTarget) in your VPC. You mount
 * your Amazon EFS file system on an EC2 instances in your VPC via the
 * mount target. For more information, see
 * <a href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html"> Amazon EFS: How it Works </a>
 * 
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>elasticfilesystem:CreateFileSystem</code> action.
 * </p>
 *
 * @see com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#createFileSystem(CreateFileSystemRequest)
 */
public class CreateFileSystemRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure
     * idempotent creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String creationToken;

    /**
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure
     * idempotent creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return String of up to 64 ASCII characters. Amazon EFS uses this to ensure
     *         idempotent creation.
     */
    public String getCreationToken() {
        return creationToken;
    }
    
    /**
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure
     * idempotent creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken String of up to 64 ASCII characters. Amazon EFS uses this to ensure
     *         idempotent creation.
     */
    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }
    
    /**
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure
     * idempotent creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken String of up to 64 ASCII characters. Amazon EFS uses this to ensure
     *         idempotent creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFileSystemRequest withCreationToken(String creationToken) {
        this.creationToken = creationToken;
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
        if (getCreationToken() != null) sb.append("CreationToken: " + getCreationToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCreationToken() == null) ? 0 : getCreationToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateFileSystemRequest == false) return false;
        CreateFileSystemRequest other = (CreateFileSystemRequest)obj;
        
        if (other.getCreationToken() == null ^ this.getCreationToken() == null) return false;
        if (other.getCreationToken() != null && other.getCreationToken().equals(this.getCreationToken()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateFileSystemRequest clone() {
        
            return (CreateFileSystemRequest) super.clone();
    }

}
    