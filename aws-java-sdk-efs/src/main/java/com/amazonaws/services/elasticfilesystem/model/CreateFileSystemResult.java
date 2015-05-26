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

/**
 * <p>
 * This object provides description of a file system.
 * </p>
 */
public class CreateFileSystemResult implements Serializable, Cloneable {

    /**
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs
     * is the owner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String ownerId;

    /**
     * Opaque string specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String creationToken;

    /**
     * The file system ID assigned by Amazon EFS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     */
    private String fileSystemId;

    /**
     * The time at which the file system was created, in seconds, since
     * 1970-01-01T00:00:00Z.
     */
    private java.util.Date creationTime;

    /**
     * A predefined string value that indicates the lifecycle phase of the
     * file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, deleting, deleted
     */
    private String lifeCycleState;

    /**
     * You can add tags to a file system (see <a>CreateTags</a>) including a
     * "Name" tag. If the file system has a "Name" tag, Amazon EFS returns
     * the value in this field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String name;

    /**
     * The current number of mount targets (see <a>CreateMountTarget</a>) the
     * file system has.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer numberOfMountTargets;

    /**
     * This object provides the latest known metered size of data stored in
     * the file system, in bytes, in its <code>Value</code> field, and the
     * time at which that size was determined in its <code>Timestamp</code>
     * field. The <code>Timestamp</code> value is the integer number of
     * seconds since 1970-01-01T00:00:00Z. Note that the value does not
     * represent the size of a consistent snapshot of the file system, but it
     * is eventually consistent when there are no writes to the file system.
     * That is, the value will represent actual size only if the file system
     * is not modified for a period longer than a couple of hours. Otherwise,
     * the value is not the exact size the file system was at any instant in
     * time.
     */
    private FileSystemSize sizeInBytes;

    /**
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs
     * is the owner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return The AWS account that created the file system. If the file system was
     *         created by an IAM user, the parent account to which the user belongs
     *         is the owner.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs
     * is the owner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param ownerId The AWS account that created the file system. If the file system was
     *         created by an IAM user, the parent account to which the user belongs
     *         is the owner.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs
     * is the owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param ownerId The AWS account that created the file system. If the file system was
     *         created by an IAM user, the parent account to which the user belongs
     *         is the owner.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFileSystemResult withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Opaque string specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return Opaque string specified in the request.
     */
    public String getCreationToken() {
        return creationToken;
    }
    
    /**
     * Opaque string specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken Opaque string specified in the request.
     */
    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }
    
    /**
     * Opaque string specified in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken Opaque string specified in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFileSystemResult withCreationToken(String creationToken) {
        this.creationToken = creationToken;
        return this;
    }

    /**
     * The file system ID assigned by Amazon EFS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @return The file system ID assigned by Amazon EFS.
     */
    public String getFileSystemId() {
        return fileSystemId;
    }
    
    /**
     * The file system ID assigned by Amazon EFS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId The file system ID assigned by Amazon EFS.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }
    
    /**
     * The file system ID assigned by Amazon EFS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId The file system ID assigned by Amazon EFS.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFileSystemResult withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * The time at which the file system was created, in seconds, since
     * 1970-01-01T00:00:00Z.
     *
     * @return The time at which the file system was created, in seconds, since
     *         1970-01-01T00:00:00Z.
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }
    
    /**
     * The time at which the file system was created, in seconds, since
     * 1970-01-01T00:00:00Z.
     *
     * @param creationTime The time at which the file system was created, in seconds, since
     *         1970-01-01T00:00:00Z.
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * The time at which the file system was created, in seconds, since
     * 1970-01-01T00:00:00Z.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationTime The time at which the file system was created, in seconds, since
     *         1970-01-01T00:00:00Z.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFileSystemResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * A predefined string value that indicates the lifecycle phase of the
     * file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, deleting, deleted
     *
     * @return A predefined string value that indicates the lifecycle phase of the
     *         file system.
     *
     * @see LifeCycleState
     */
    public String getLifeCycleState() {
        return lifeCycleState;
    }
    
    /**
     * A predefined string value that indicates the lifecycle phase of the
     * file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, deleting, deleted
     *
     * @param lifeCycleState A predefined string value that indicates the lifecycle phase of the
     *         file system.
     *
     * @see LifeCycleState
     */
    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }
    
    /**
     * A predefined string value that indicates the lifecycle phase of the
     * file system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, deleting, deleted
     *
     * @param lifeCycleState A predefined string value that indicates the lifecycle phase of the
     *         file system.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LifeCycleState
     */
    public CreateFileSystemResult withLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
        return this;
    }

    /**
     * A predefined string value that indicates the lifecycle phase of the
     * file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, deleting, deleted
     *
     * @param lifeCycleState A predefined string value that indicates the lifecycle phase of the
     *         file system.
     *
     * @see LifeCycleState
     */
    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
    }
    
    /**
     * A predefined string value that indicates the lifecycle phase of the
     * file system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, deleting, deleted
     *
     * @param lifeCycleState A predefined string value that indicates the lifecycle phase of the
     *         file system.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LifeCycleState
     */
    public CreateFileSystemResult withLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
        return this;
    }

    /**
     * You can add tags to a file system (see <a>CreateTags</a>) including a
     * "Name" tag. If the file system has a "Name" tag, Amazon EFS returns
     * the value in this field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return You can add tags to a file system (see <a>CreateTags</a>) including a
     *         "Name" tag. If the file system has a "Name" tag, Amazon EFS returns
     *         the value in this field.
     */
    public String getName() {
        return name;
    }
    
    /**
     * You can add tags to a file system (see <a>CreateTags</a>) including a
     * "Name" tag. If the file system has a "Name" tag, Amazon EFS returns
     * the value in this field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param name You can add tags to a file system (see <a>CreateTags</a>) including a
     *         "Name" tag. If the file system has a "Name" tag, Amazon EFS returns
     *         the value in this field.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * You can add tags to a file system (see <a>CreateTags</a>) including a
     * "Name" tag. If the file system has a "Name" tag, Amazon EFS returns
     * the value in this field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param name You can add tags to a file system (see <a>CreateTags</a>) including a
     *         "Name" tag. If the file system has a "Name" tag, Amazon EFS returns
     *         the value in this field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFileSystemResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The current number of mount targets (see <a>CreateMountTarget</a>) the
     * file system has.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The current number of mount targets (see <a>CreateMountTarget</a>) the
     *         file system has.
     */
    public Integer getNumberOfMountTargets() {
        return numberOfMountTargets;
    }
    
    /**
     * The current number of mount targets (see <a>CreateMountTarget</a>) the
     * file system has.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfMountTargets The current number of mount targets (see <a>CreateMountTarget</a>) the
     *         file system has.
     */
    public void setNumberOfMountTargets(Integer numberOfMountTargets) {
        this.numberOfMountTargets = numberOfMountTargets;
    }
    
    /**
     * The current number of mount targets (see <a>CreateMountTarget</a>) the
     * file system has.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfMountTargets The current number of mount targets (see <a>CreateMountTarget</a>) the
     *         file system has.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFileSystemResult withNumberOfMountTargets(Integer numberOfMountTargets) {
        this.numberOfMountTargets = numberOfMountTargets;
        return this;
    }

    /**
     * This object provides the latest known metered size of data stored in
     * the file system, in bytes, in its <code>Value</code> field, and the
     * time at which that size was determined in its <code>Timestamp</code>
     * field. The <code>Timestamp</code> value is the integer number of
     * seconds since 1970-01-01T00:00:00Z. Note that the value does not
     * represent the size of a consistent snapshot of the file system, but it
     * is eventually consistent when there are no writes to the file system.
     * That is, the value will represent actual size only if the file system
     * is not modified for a period longer than a couple of hours. Otherwise,
     * the value is not the exact size the file system was at any instant in
     * time.
     *
     * @return This object provides the latest known metered size of data stored in
     *         the file system, in bytes, in its <code>Value</code> field, and the
     *         time at which that size was determined in its <code>Timestamp</code>
     *         field. The <code>Timestamp</code> value is the integer number of
     *         seconds since 1970-01-01T00:00:00Z. Note that the value does not
     *         represent the size of a consistent snapshot of the file system, but it
     *         is eventually consistent when there are no writes to the file system.
     *         That is, the value will represent actual size only if the file system
     *         is not modified for a period longer than a couple of hours. Otherwise,
     *         the value is not the exact size the file system was at any instant in
     *         time.
     */
    public FileSystemSize getSizeInBytes() {
        return sizeInBytes;
    }
    
    /**
     * This object provides the latest known metered size of data stored in
     * the file system, in bytes, in its <code>Value</code> field, and the
     * time at which that size was determined in its <code>Timestamp</code>
     * field. The <code>Timestamp</code> value is the integer number of
     * seconds since 1970-01-01T00:00:00Z. Note that the value does not
     * represent the size of a consistent snapshot of the file system, but it
     * is eventually consistent when there are no writes to the file system.
     * That is, the value will represent actual size only if the file system
     * is not modified for a period longer than a couple of hours. Otherwise,
     * the value is not the exact size the file system was at any instant in
     * time.
     *
     * @param sizeInBytes This object provides the latest known metered size of data stored in
     *         the file system, in bytes, in its <code>Value</code> field, and the
     *         time at which that size was determined in its <code>Timestamp</code>
     *         field. The <code>Timestamp</code> value is the integer number of
     *         seconds since 1970-01-01T00:00:00Z. Note that the value does not
     *         represent the size of a consistent snapshot of the file system, but it
     *         is eventually consistent when there are no writes to the file system.
     *         That is, the value will represent actual size only if the file system
     *         is not modified for a period longer than a couple of hours. Otherwise,
     *         the value is not the exact size the file system was at any instant in
     *         time.
     */
    public void setSizeInBytes(FileSystemSize sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
    
    /**
     * This object provides the latest known metered size of data stored in
     * the file system, in bytes, in its <code>Value</code> field, and the
     * time at which that size was determined in its <code>Timestamp</code>
     * field. The <code>Timestamp</code> value is the integer number of
     * seconds since 1970-01-01T00:00:00Z. Note that the value does not
     * represent the size of a consistent snapshot of the file system, but it
     * is eventually consistent when there are no writes to the file system.
     * That is, the value will represent actual size only if the file system
     * is not modified for a period longer than a couple of hours. Otherwise,
     * the value is not the exact size the file system was at any instant in
     * time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sizeInBytes This object provides the latest known metered size of data stored in
     *         the file system, in bytes, in its <code>Value</code> field, and the
     *         time at which that size was determined in its <code>Timestamp</code>
     *         field. The <code>Timestamp</code> value is the integer number of
     *         seconds since 1970-01-01T00:00:00Z. Note that the value does not
     *         represent the size of a consistent snapshot of the file system, but it
     *         is eventually consistent when there are no writes to the file system.
     *         That is, the value will represent actual size only if the file system
     *         is not modified for a period longer than a couple of hours. Otherwise,
     *         the value is not the exact size the file system was at any instant in
     *         time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFileSystemResult withSizeInBytes(FileSystemSize sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
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
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (getCreationToken() != null) sb.append("CreationToken: " + getCreationToken() + ",");
        if (getFileSystemId() != null) sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLifeCycleState() != null) sb.append("LifeCycleState: " + getLifeCycleState() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getNumberOfMountTargets() != null) sb.append("NumberOfMountTargets: " + getNumberOfMountTargets() + ",");
        if (getSizeInBytes() != null) sb.append("SizeInBytes: " + getSizeInBytes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getCreationToken() == null) ? 0 : getCreationToken().hashCode()); 
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode()); 
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode()); 
        hashCode = prime * hashCode + ((getLifeCycleState() == null) ? 0 : getLifeCycleState().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfMountTargets() == null) ? 0 : getNumberOfMountTargets().hashCode()); 
        hashCode = prime * hashCode + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateFileSystemResult == false) return false;
        CreateFileSystemResult other = (CreateFileSystemResult)obj;
        
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.getCreationToken() == null ^ this.getCreationToken() == null) return false;
        if (other.getCreationToken() != null && other.getCreationToken().equals(this.getCreationToken()) == false) return false; 
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null) return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false) return false; 
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        if (other.getLifeCycleState() == null ^ this.getLifeCycleState() == null) return false;
        if (other.getLifeCycleState() != null && other.getLifeCycleState().equals(this.getLifeCycleState()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getNumberOfMountTargets() == null ^ this.getNumberOfMountTargets() == null) return false;
        if (other.getNumberOfMountTargets() != null && other.getNumberOfMountTargets().equals(this.getNumberOfMountTargets()) == false) return false; 
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null) return false;
        if (other.getSizeInBytes() != null && other.getSizeInBytes().equals(this.getSizeInBytes()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateFileSystemResult clone() {
        try {
            return (CreateFileSystemResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    