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
public class FileSystemDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs is
     * the owner.
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
     * The file system ID assigned by Amazon EFS.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The time at which the file system was created, in seconds, since
     * 1970-01-01T00:00:00Z.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A predefined string value that indicates the lifecycle phase of the file
     * system.
     * </p>
     */
    private String lifeCycleState;
    /**
     * <p>
     * You can add tags to a file system (see <a>CreateTags</a>) including a
     * "Name" tag. If the file system has a "Name" tag, Amazon EFS returns the
     * value in this field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current number of mount targets (see <a>CreateMountTarget</a>) the
     * file system has.
     * </p>
     */
    private Integer numberOfMountTargets;
    /**
     * <p>
     * This object provides the latest known metered size of data stored in the
     * file system, in bytes, in its <code>Value</code> field, and the time at
     * which that size was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since
     * 1970-01-01T00:00:00Z. Note that the value does not represent the size of
     * a consistent snapshot of the file system, but it is eventually consistent
     * when there are no writes to the file system. That is, the value will
     * represent actual size only if the file system is not modified for a
     * period longer than a couple of hours. Otherwise, the value is not the
     * exact size the file system was at any instant in time.
     * </p>
     */
    private FileSystemSize sizeInBytes;

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs is
     * the owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account that created the file system. If the file system
     *        was created by an IAM user, the parent account to which the user
     *        belongs is the owner.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs is
     * the owner.
     * </p>
     * 
     * @return The AWS account that created the file system. If the file system
     *         was created by an IAM user, the parent account to which the user
     *         belongs is the owner.
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs is
     * the owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account that created the file system. If the file system
     *        was created by an IAM user, the parent account to which the user
     *        belongs is the owner.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FileSystemDescription withCreationToken(String creationToken) {
        setCreationToken(creationToken);
        return this;
    }

    /**
     * <p>
     * The file system ID assigned by Amazon EFS.
     * </p>
     * 
     * @param fileSystemId
     *        The file system ID assigned by Amazon EFS.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The file system ID assigned by Amazon EFS.
     * </p>
     * 
     * @return The file system ID assigned by Amazon EFS.
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The file system ID assigned by Amazon EFS.
     * </p>
     * 
     * @param fileSystemId
     *        The file system ID assigned by Amazon EFS.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FileSystemDescription withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The time at which the file system was created, in seconds, since
     * 1970-01-01T00:00:00Z.
     * </p>
     * 
     * @param creationTime
     *        The time at which the file system was created, in seconds, since
     *        1970-01-01T00:00:00Z.
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the file system was created, in seconds, since
     * 1970-01-01T00:00:00Z.
     * </p>
     * 
     * @return The time at which the file system was created, in seconds, since
     *         1970-01-01T00:00:00Z.
     */
    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the file system was created, in seconds, since
     * 1970-01-01T00:00:00Z.
     * </p>
     * 
     * @param creationTime
     *        The time at which the file system was created, in seconds, since
     *        1970-01-01T00:00:00Z.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FileSystemDescription withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A predefined string value that indicates the lifecycle phase of the file
     * system.
     * </p>
     * 
     * @param lifeCycleState
     *        A predefined string value that indicates the lifecycle phase of
     *        the file system.
     * @see LifeCycleState
     */
    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * A predefined string value that indicates the lifecycle phase of the file
     * system.
     * </p>
     * 
     * @return A predefined string value that indicates the lifecycle phase of
     *         the file system.
     * @see LifeCycleState
     */
    public String getLifeCycleState() {
        return this.lifeCycleState;
    }

    /**
     * <p>
     * A predefined string value that indicates the lifecycle phase of the file
     * system.
     * </p>
     * 
     * @param lifeCycleState
     *        A predefined string value that indicates the lifecycle phase of
     *        the file system.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public FileSystemDescription withLifeCycleState(String lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * A predefined string value that indicates the lifecycle phase of the file
     * system.
     * </p>
     * 
     * @param lifeCycleState
     *        A predefined string value that indicates the lifecycle phase of
     *        the file system.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
    }

    /**
     * <p>
     * A predefined string value that indicates the lifecycle phase of the file
     * system.
     * </p>
     * 
     * @param lifeCycleState
     *        A predefined string value that indicates the lifecycle phase of
     *        the file system.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public FileSystemDescription withLifeCycleState(
            LifeCycleState lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * You can add tags to a file system (see <a>CreateTags</a>) including a
     * "Name" tag. If the file system has a "Name" tag, Amazon EFS returns the
     * value in this field.
     * </p>
     * 
     * @param name
     *        You can add tags to a file system (see <a>CreateTags</a>)
     *        including a "Name" tag. If the file system has a "Name" tag,
     *        Amazon EFS returns the value in this field.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * You can add tags to a file system (see <a>CreateTags</a>) including a
     * "Name" tag. If the file system has a "Name" tag, Amazon EFS returns the
     * value in this field.
     * </p>
     * 
     * @return You can add tags to a file system (see <a>CreateTags</a>)
     *         including a "Name" tag. If the file system has a "Name" tag,
     *         Amazon EFS returns the value in this field.
     */
    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * You can add tags to a file system (see <a>CreateTags</a>) including a
     * "Name" tag. If the file system has a "Name" tag, Amazon EFS returns the
     * value in this field.
     * </p>
     * 
     * @param name
     *        You can add tags to a file system (see <a>CreateTags</a>)
     *        including a "Name" tag. If the file system has a "Name" tag,
     *        Amazon EFS returns the value in this field.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FileSystemDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current number of mount targets (see <a>CreateMountTarget</a>) the
     * file system has.
     * </p>
     * 
     * @param numberOfMountTargets
     *        The current number of mount targets (see <a>CreateMountTarget</a>)
     *        the file system has.
     */
    public void setNumberOfMountTargets(Integer numberOfMountTargets) {
        this.numberOfMountTargets = numberOfMountTargets;
    }

    /**
     * <p>
     * The current number of mount targets (see <a>CreateMountTarget</a>) the
     * file system has.
     * </p>
     * 
     * @return The current number of mount targets (see
     *         <a>CreateMountTarget</a>) the file system has.
     */
    public Integer getNumberOfMountTargets() {
        return this.numberOfMountTargets;
    }

    /**
     * <p>
     * The current number of mount targets (see <a>CreateMountTarget</a>) the
     * file system has.
     * </p>
     * 
     * @param numberOfMountTargets
     *        The current number of mount targets (see <a>CreateMountTarget</a>)
     *        the file system has.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FileSystemDescription withNumberOfMountTargets(
            Integer numberOfMountTargets) {
        setNumberOfMountTargets(numberOfMountTargets);
        return this;
    }

    /**
     * <p>
     * This object provides the latest known metered size of data stored in the
     * file system, in bytes, in its <code>Value</code> field, and the time at
     * which that size was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since
     * 1970-01-01T00:00:00Z. Note that the value does not represent the size of
     * a consistent snapshot of the file system, but it is eventually consistent
     * when there are no writes to the file system. That is, the value will
     * represent actual size only if the file system is not modified for a
     * period longer than a couple of hours. Otherwise, the value is not the
     * exact size the file system was at any instant in time.
     * </p>
     * 
     * @param sizeInBytes
     *        This object provides the latest known metered size of data stored
     *        in the file system, in bytes, in its <code>Value</code> field, and
     *        the time at which that size was determined in its
     *        <code>Timestamp</code> field. The <code>Timestamp</code> value is
     *        the integer number of seconds since 1970-01-01T00:00:00Z. Note
     *        that the value does not represent the size of a consistent
     *        snapshot of the file system, but it is eventually consistent when
     *        there are no writes to the file system. That is, the value will
     *        represent actual size only if the file system is not modified for
     *        a period longer than a couple of hours. Otherwise, the value is
     *        not the exact size the file system was at any instant in time.
     */
    public void setSizeInBytes(FileSystemSize sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * This object provides the latest known metered size of data stored in the
     * file system, in bytes, in its <code>Value</code> field, and the time at
     * which that size was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since
     * 1970-01-01T00:00:00Z. Note that the value does not represent the size of
     * a consistent snapshot of the file system, but it is eventually consistent
     * when there are no writes to the file system. That is, the value will
     * represent actual size only if the file system is not modified for a
     * period longer than a couple of hours. Otherwise, the value is not the
     * exact size the file system was at any instant in time.
     * </p>
     * 
     * @return This object provides the latest known metered size of data stored
     *         in the file system, in bytes, in its <code>Value</code> field,
     *         and the time at which that size was determined in its
     *         <code>Timestamp</code> field. The <code>Timestamp</code> value is
     *         the integer number of seconds since 1970-01-01T00:00:00Z. Note
     *         that the value does not represent the size of a consistent
     *         snapshot of the file system, but it is eventually consistent when
     *         there are no writes to the file system. That is, the value will
     *         represent actual size only if the file system is not modified for
     *         a period longer than a couple of hours. Otherwise, the value is
     *         not the exact size the file system was at any instant in time.
     */
    public FileSystemSize getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * <p>
     * This object provides the latest known metered size of data stored in the
     * file system, in bytes, in its <code>Value</code> field, and the time at
     * which that size was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since
     * 1970-01-01T00:00:00Z. Note that the value does not represent the size of
     * a consistent snapshot of the file system, but it is eventually consistent
     * when there are no writes to the file system. That is, the value will
     * represent actual size only if the file system is not modified for a
     * period longer than a couple of hours. Otherwise, the value is not the
     * exact size the file system was at any instant in time.
     * </p>
     * 
     * @param sizeInBytes
     *        This object provides the latest known metered size of data stored
     *        in the file system, in bytes, in its <code>Value</code> field, and
     *        the time at which that size was determined in its
     *        <code>Timestamp</code> field. The <code>Timestamp</code> value is
     *        the integer number of seconds since 1970-01-01T00:00:00Z. Note
     *        that the value does not represent the size of a consistent
     *        snapshot of the file system, but it is eventually consistent when
     *        there are no writes to the file system. That is, the value will
     *        represent actual size only if the file system is not modified for
     *        a period longer than a couple of hours. Otherwise, the value is
     *        not the exact size the file system was at any instant in time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FileSystemDescription withSizeInBytes(FileSystemSize sizeInBytes) {
        setSizeInBytes(sizeInBytes);
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
            sb.append("NumberOfMountTargets: " + getNumberOfMountTargets()
                    + ",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: " + getSizeInBytes());
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
        if (other.getOwnerId() != null
                && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCreationToken() == null ^ this.getCreationToken() == null)
            return false;
        if (other.getCreationToken() != null
                && other.getCreationToken().equals(this.getCreationToken()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLifeCycleState() == null
                ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null
                && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNumberOfMountTargets() == null
                ^ this.getNumberOfMountTargets() == null)
            return false;
        if (other.getNumberOfMountTargets() != null
                && other.getNumberOfMountTargets().equals(
                        this.getNumberOfMountTargets()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null
                && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationToken() == null) ? 0 : getCreationToken()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLifeCycleState() == null) ? 0 : getLifeCycleState()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfMountTargets() == null) ? 0
                        : getNumberOfMountTargets().hashCode());
        hashCode = prime
                * hashCode
                + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemDescription clone() {
        try {
            return (FileSystemDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}