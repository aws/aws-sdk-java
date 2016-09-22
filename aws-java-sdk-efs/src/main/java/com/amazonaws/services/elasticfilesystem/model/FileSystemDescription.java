/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Description of the file system.
 * </p>
 */
public class FileSystemDescription implements Serializable, Cloneable {

    /**
     * <p>
     * AWS account that created the file system. If the file system was created by an IAM user, the parent account to
     * which the user belongs is the owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Opaque string specified in the request.
     * </p>
     */
    private String creationToken;
    /**
     * <p>
     * ID of the file system, assigned by Amazon EFS.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * Time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Lifecycle phase of the file system.
     * </p>
     */
    private String lifeCycleState;
    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     * <a>CreateTags</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Current number of mount targets that the file system has. For more information, see <a>CreateMountTarget</a>.
     * </p>
     */
    private Integer numberOfMountTargets;
    /**
     * <p>
     * Latest known metered size (in bytes) of data stored in the file system, in bytes, in its <code>Value</code>
     * field, and the time at which that size was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. Note that the value
     * does not represent the size of a consistent snapshot of the file system, but it is eventually consistent when
     * there are no writes to the file system. That is, the value will represent actual size only if the file system is
     * not modified for a period longer than a couple of hours. Otherwise, the value is not the exact size the file
     * system was at any instant in time.
     * </p>
     */
    private FileSystemSize sizeInBytes;
    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system.
     * </p>
     */
    private String performanceMode;

    /**
     * <p>
     * AWS account that created the file system. If the file system was created by an IAM user, the parent account to
     * which the user belongs is the owner.
     * </p>
     * 
     * @param ownerId
     *        AWS account that created the file system. If the file system was created by an IAM user, the parent
     *        account to which the user belongs is the owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * AWS account that created the file system. If the file system was created by an IAM user, the parent account to
     * which the user belongs is the owner.
     * </p>
     * 
     * @return AWS account that created the file system. If the file system was created by an IAM user, the parent
     *         account to which the user belongs is the owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * AWS account that created the file system. If the file system was created by an IAM user, the parent account to
     * which the user belongs is the owner.
     * </p>
     * 
     * @param ownerId
     *        AWS account that created the file system. If the file system was created by an IAM user, the parent
     *        account to which the user belongs is the owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDescription withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Opaque string specified in the request.
     * </p>
     * 
     * @param creationToken
     *        Opaque string specified in the request.
     */

    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * Opaque string specified in the request.
     * </p>
     * 
     * @return Opaque string specified in the request.
     */

    public String getCreationToken() {
        return this.creationToken;
    }

    /**
     * <p>
     * Opaque string specified in the request.
     * </p>
     * 
     * @param creationToken
     *        Opaque string specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDescription withCreationToken(String creationToken) {
        setCreationToken(creationToken);
        return this;
    }

    /**
     * <p>
     * ID of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @param fileSystemId
     *        ID of the file system, assigned by Amazon EFS.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * ID of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @return ID of the file system, assigned by Amazon EFS.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * ID of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @param fileSystemId
     *        ID of the file system, assigned by Amazon EFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDescription withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * Time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * </p>
     * 
     * @param creationTime
     *        Time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * </p>
     * 
     * @return Time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * </p>
     * 
     * @param creationTime
     *        Time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDescription withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Lifecycle phase of the file system.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle phase of the file system.
     * @see LifeCycleState
     */

    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * Lifecycle phase of the file system.
     * </p>
     * 
     * @return Lifecycle phase of the file system.
     * @see LifeCycleState
     */

    public String getLifeCycleState() {
        return this.lifeCycleState;
    }

    /**
     * <p>
     * Lifecycle phase of the file system.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle phase of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public FileSystemDescription withLifeCycleState(String lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * Lifecycle phase of the file system.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle phase of the file system.
     * @see LifeCycleState
     */

    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
    }

    /**
     * <p>
     * Lifecycle phase of the file system.
     * </p>
     * 
     * @param lifeCycleState
     *        Lifecycle phase of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public FileSystemDescription withLifeCycleState(LifeCycleState lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     * <a>CreateTags</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this field.
     * </p>
     * 
     * @param name
     *        You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     *        <a>CreateTags</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this
     *        field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     * <a>CreateTags</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this field.
     * </p>
     * 
     * @return You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     *         <a>CreateTags</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this
     *         field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     * <a>CreateTags</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this field.
     * </p>
     * 
     * @param name
     *        You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     *        <a>CreateTags</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Current number of mount targets that the file system has. For more information, see <a>CreateMountTarget</a>.
     * </p>
     * 
     * @param numberOfMountTargets
     *        Current number of mount targets that the file system has. For more information, see
     *        <a>CreateMountTarget</a>.
     */

    public void setNumberOfMountTargets(Integer numberOfMountTargets) {
        this.numberOfMountTargets = numberOfMountTargets;
    }

    /**
     * <p>
     * Current number of mount targets that the file system has. For more information, see <a>CreateMountTarget</a>.
     * </p>
     * 
     * @return Current number of mount targets that the file system has. For more information, see
     *         <a>CreateMountTarget</a>.
     */

    public Integer getNumberOfMountTargets() {
        return this.numberOfMountTargets;
    }

    /**
     * <p>
     * Current number of mount targets that the file system has. For more information, see <a>CreateMountTarget</a>.
     * </p>
     * 
     * @param numberOfMountTargets
     *        Current number of mount targets that the file system has. For more information, see
     *        <a>CreateMountTarget</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDescription withNumberOfMountTargets(Integer numberOfMountTargets) {
        setNumberOfMountTargets(numberOfMountTargets);
        return this;
    }

    /**
     * <p>
     * Latest known metered size (in bytes) of data stored in the file system, in bytes, in its <code>Value</code>
     * field, and the time at which that size was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. Note that the value
     * does not represent the size of a consistent snapshot of the file system, but it is eventually consistent when
     * there are no writes to the file system. That is, the value will represent actual size only if the file system is
     * not modified for a period longer than a couple of hours. Otherwise, the value is not the exact size the file
     * system was at any instant in time.
     * </p>
     * 
     * @param sizeInBytes
     *        Latest known metered size (in bytes) of data stored in the file system, in bytes, in its
     *        <code>Value</code> field, and the time at which that size was determined in its <code>Timestamp</code>
     *        field. The <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. Note
     *        that the value does not represent the size of a consistent snapshot of the file system, but it is
     *        eventually consistent when there are no writes to the file system. That is, the value will represent
     *        actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise,
     *        the value is not the exact size the file system was at any instant in time.
     */

    public void setSizeInBytes(FileSystemSize sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * Latest known metered size (in bytes) of data stored in the file system, in bytes, in its <code>Value</code>
     * field, and the time at which that size was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. Note that the value
     * does not represent the size of a consistent snapshot of the file system, but it is eventually consistent when
     * there are no writes to the file system. That is, the value will represent actual size only if the file system is
     * not modified for a period longer than a couple of hours. Otherwise, the value is not the exact size the file
     * system was at any instant in time.
     * </p>
     * 
     * @return Latest known metered size (in bytes) of data stored in the file system, in bytes, in its
     *         <code>Value</code> field, and the time at which that size was determined in its <code>Timestamp</code>
     *         field. The <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. Note
     *         that the value does not represent the size of a consistent snapshot of the file system, but it is
     *         eventually consistent when there are no writes to the file system. That is, the value will represent
     *         actual size only if the file system is not modified for a period longer than a couple of hours.
     *         Otherwise, the value is not the exact size the file system was at any instant in time.
     */

    public FileSystemSize getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * <p>
     * Latest known metered size (in bytes) of data stored in the file system, in bytes, in its <code>Value</code>
     * field, and the time at which that size was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. Note that the value
     * does not represent the size of a consistent snapshot of the file system, but it is eventually consistent when
     * there are no writes to the file system. That is, the value will represent actual size only if the file system is
     * not modified for a period longer than a couple of hours. Otherwise, the value is not the exact size the file
     * system was at any instant in time.
     * </p>
     * 
     * @param sizeInBytes
     *        Latest known metered size (in bytes) of data stored in the file system, in bytes, in its
     *        <code>Value</code> field, and the time at which that size was determined in its <code>Timestamp</code>
     *        field. The <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. Note
     *        that the value does not represent the size of a consistent snapshot of the file system, but it is
     *        eventually consistent when there are no writes to the file system. That is, the value will represent
     *        actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise,
     *        the value is not the exact size the file system was at any instant in time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDescription withSizeInBytes(FileSystemSize sizeInBytes) {
        setSizeInBytes(sizeInBytes);
        return this;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system.
     * @see PerformanceMode
     */

    public void setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system.
     * </p>
     * 
     * @return The <code>PerformanceMode</code> of the file system.
     * @see PerformanceMode
     */

    public String getPerformanceMode() {
        return this.performanceMode;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public FileSystemDescription withPerformanceMode(String performanceMode) {
        setPerformanceMode(performanceMode);
        return this;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system.
     * @see PerformanceMode
     */

    public void setPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public FileSystemDescription withPerformanceMode(PerformanceMode performanceMode) {
        setPerformanceMode(performanceMode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getCreationToken() != null)
            sb.append("CreationToken: " + getCreationToken() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: " + getLifeCycleState() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getNumberOfMountTargets() != null)
            sb.append("NumberOfMountTargets: " + getNumberOfMountTargets() + ",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: " + getSizeInBytes() + ",");
        if (getPerformanceMode() != null)
            sb.append("PerformanceMode: " + getPerformanceMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemDescription == false)
            return false;
        FileSystemDescription other = (FileSystemDescription) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCreationToken() == null ^ this.getCreationToken() == null)
            return false;
        if (other.getCreationToken() != null && other.getCreationToken().equals(this.getCreationToken()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLifeCycleState() == null ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNumberOfMountTargets() == null ^ this.getNumberOfMountTargets() == null)
            return false;
        if (other.getNumberOfMountTargets() != null && other.getNumberOfMountTargets().equals(this.getNumberOfMountTargets()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getPerformanceMode() == null ^ this.getPerformanceMode() == null)
            return false;
        if (other.getPerformanceMode() != null && other.getPerformanceMode().equals(this.getPerformanceMode()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getPerformanceMode() == null) ? 0 : getPerformanceMode().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemDescription clone() {
        try {
            return (FileSystemDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
