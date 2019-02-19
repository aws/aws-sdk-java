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

/**
 * <p>
 * A description of the file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account that created the file system. If the file system was created by an IAM user, the parent account
     * to which the user belongs is the owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The opaque string specified in the request.
     * </p>
     */
    private String creationToken;
    /**
     * <p>
     * The ID of the file system, assigned by Amazon EFS.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     */
    private String lifeCycleState;
    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     * <a>CreateFileSystem</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this
     * field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current number of mount targets that the file system has. For more information, see <a>CreateMountTarget</a>.
     * </p>
     */
    private Integer numberOfMountTargets;
    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and
     * the time at which that size was determined in its <code>Timestamp</code> field. The <code>Timestamp</code> value
     * is the integer number of seconds since 1970-01-01T00:00:00Z. The <code>SizeInBytes</code> value doesn't represent
     * the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to
     * the file system. That is, <code>SizeInBytes</code> represents actual size only if the file system is not modified
     * for a period longer than a couple of hours. Otherwise, the value is not the exact size that the file system was
     * at any point in time.
     * </p>
     */
    private FileSystemSize sizeInBytes;
    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     */
    private String performanceMode;
    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * encrypted file system.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     * bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or change
     * between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode
     * change.
     * </p>
     */
    private String throughputMode;
    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file system. The limit on throughput is 1024
     * MiB/s. You can get these limits increased by contacting AWS Support. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     * Increase</a> in the <i>Amazon EFS User Guide.</i>
     * </p>
     */
    private Double provisionedThroughputInMibps;
    /**
     * <p>
     * The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The AWS account that created the file system. If the file system was created by an IAM user, the parent account
     * to which the user belongs is the owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account that created the file system. If the file system was created by an IAM user, the parent
     *        account to which the user belongs is the owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was created by an IAM user, the parent account
     * to which the user belongs is the owner.
     * </p>
     * 
     * @return The AWS account that created the file system. If the file system was created by an IAM user, the parent
     *         account to which the user belongs is the owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was created by an IAM user, the parent account
     * to which the user belongs is the owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account that created the file system. If the file system was created by an IAM user, the parent
     *        account to which the user belongs is the owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The opaque string specified in the request.
     * </p>
     * 
     * @param creationToken
     *        The opaque string specified in the request.
     */

    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * The opaque string specified in the request.
     * </p>
     * 
     * @return The opaque string specified in the request.
     */

    public String getCreationToken() {
        return this.creationToken;
    }

    /**
     * <p>
     * The opaque string specified in the request.
     * </p>
     * 
     * @param creationToken
     *        The opaque string specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withCreationToken(String creationToken) {
        setCreationToken(creationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system, assigned by Amazon EFS.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @return The ID of the file system, assigned by Amazon EFS.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system, assigned by Amazon EFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * </p>
     * 
     * @param creationTime
     *        The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * </p>
     * 
     * @return The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * </p>
     * 
     * @param creationTime
     *        The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * 
     * @param lifeCycleState
     *        The lifecycle phase of the file system.
     * @see LifeCycleState
     */

    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * 
     * @return The lifecycle phase of the file system.
     * @see LifeCycleState
     */

    public String getLifeCycleState() {
        return this.lifeCycleState;
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * 
     * @param lifeCycleState
     *        The lifecycle phase of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public UpdateFileSystemResult withLifeCycleState(String lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * 
     * @param lifeCycleState
     *        The lifecycle phase of the file system.
     * @see LifeCycleState
     */

    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        withLifeCycleState(lifeCycleState);
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * 
     * @param lifeCycleState
     *        The lifecycle phase of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public UpdateFileSystemResult withLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
        return this;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     * <a>CreateFileSystem</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this
     * field.
     * </p>
     * 
     * @param name
     *        You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     *        <a>CreateFileSystem</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in
     *        this field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     * <a>CreateFileSystem</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this
     * field.
     * </p>
     * 
     * @return You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     *         <a>CreateFileSystem</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in
     *         this field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     * <a>CreateFileSystem</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in this
     * field.
     * </p>
     * 
     * @param name
     *        You can add tags to a file system, including a <code>Name</code> tag. For more information, see
     *        <a>CreateFileSystem</a>. If the file system has a <code>Name</code> tag, Amazon EFS returns the value in
     *        this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current number of mount targets that the file system has. For more information, see <a>CreateMountTarget</a>.
     * </p>
     * 
     * @param numberOfMountTargets
     *        The current number of mount targets that the file system has. For more information, see
     *        <a>CreateMountTarget</a>.
     */

    public void setNumberOfMountTargets(Integer numberOfMountTargets) {
        this.numberOfMountTargets = numberOfMountTargets;
    }

    /**
     * <p>
     * The current number of mount targets that the file system has. For more information, see <a>CreateMountTarget</a>.
     * </p>
     * 
     * @return The current number of mount targets that the file system has. For more information, see
     *         <a>CreateMountTarget</a>.
     */

    public Integer getNumberOfMountTargets() {
        return this.numberOfMountTargets;
    }

    /**
     * <p>
     * The current number of mount targets that the file system has. For more information, see <a>CreateMountTarget</a>.
     * </p>
     * 
     * @param numberOfMountTargets
     *        The current number of mount targets that the file system has. For more information, see
     *        <a>CreateMountTarget</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withNumberOfMountTargets(Integer numberOfMountTargets) {
        setNumberOfMountTargets(numberOfMountTargets);
        return this;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and
     * the time at which that size was determined in its <code>Timestamp</code> field. The <code>Timestamp</code> value
     * is the integer number of seconds since 1970-01-01T00:00:00Z. The <code>SizeInBytes</code> value doesn't represent
     * the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to
     * the file system. That is, <code>SizeInBytes</code> represents actual size only if the file system is not modified
     * for a period longer than a couple of hours. Otherwise, the value is not the exact size that the file system was
     * at any point in time.
     * </p>
     * 
     * @param sizeInBytes
     *        The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code>
     *        field, and the time at which that size was determined in its <code>Timestamp</code> field. The
     *        <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. The
     *        <code>SizeInBytes</code> value doesn't represent the size of a consistent snapshot of the file system, but
     *        it is eventually consistent when there are no writes to the file system. That is, <code>SizeInBytes</code>
     *        represents actual size only if the file system is not modified for a period longer than a couple of hours.
     *        Otherwise, the value is not the exact size that the file system was at any point in time.
     */

    public void setSizeInBytes(FileSystemSize sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and
     * the time at which that size was determined in its <code>Timestamp</code> field. The <code>Timestamp</code> value
     * is the integer number of seconds since 1970-01-01T00:00:00Z. The <code>SizeInBytes</code> value doesn't represent
     * the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to
     * the file system. That is, <code>SizeInBytes</code> represents actual size only if the file system is not modified
     * for a period longer than a couple of hours. Otherwise, the value is not the exact size that the file system was
     * at any point in time.
     * </p>
     * 
     * @return The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code>
     *         field, and the time at which that size was determined in its <code>Timestamp</code> field. The
     *         <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. The
     *         <code>SizeInBytes</code> value doesn't represent the size of a consistent snapshot of the file system,
     *         but it is eventually consistent when there are no writes to the file system. That is,
     *         <code>SizeInBytes</code> represents actual size only if the file system is not modified for a period
     *         longer than a couple of hours. Otherwise, the value is not the exact size that the file system was at any
     *         point in time.
     */

    public FileSystemSize getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and
     * the time at which that size was determined in its <code>Timestamp</code> field. The <code>Timestamp</code> value
     * is the integer number of seconds since 1970-01-01T00:00:00Z. The <code>SizeInBytes</code> value doesn't represent
     * the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to
     * the file system. That is, <code>SizeInBytes</code> represents actual size only if the file system is not modified
     * for a period longer than a couple of hours. Otherwise, the value is not the exact size that the file system was
     * at any point in time.
     * </p>
     * 
     * @param sizeInBytes
     *        The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code>
     *        field, and the time at which that size was determined in its <code>Timestamp</code> field. The
     *        <code>Timestamp</code> value is the integer number of seconds since 1970-01-01T00:00:00Z. The
     *        <code>SizeInBytes</code> value doesn't represent the size of a consistent snapshot of the file system, but
     *        it is eventually consistent when there are no writes to the file system. That is, <code>SizeInBytes</code>
     *        represents actual size only if the file system is not modified for a period longer than a couple of hours.
     *        Otherwise, the value is not the exact size that the file system was at any point in time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withSizeInBytes(FileSystemSize sizeInBytes) {
        setSizeInBytes(sizeInBytes);
        return this;
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * 
     * @param performanceMode
     *        The performance mode of the file system.
     * @see PerformanceMode
     */

    public void setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * 
     * @return The performance mode of the file system.
     * @see PerformanceMode
     */

    public String getPerformanceMode() {
        return this.performanceMode;
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * 
     * @param performanceMode
     *        The performance mode of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public UpdateFileSystemResult withPerformanceMode(String performanceMode) {
        setPerformanceMode(performanceMode);
        return this;
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * 
     * @param performanceMode
     *        The performance mode of the file system.
     * @see PerformanceMode
     */

    public void setPerformanceMode(PerformanceMode performanceMode) {
        withPerformanceMode(performanceMode);
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * 
     * @param performanceMode
     *        The performance mode of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public UpdateFileSystemResult withPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is encrypted.
     * </p>
     * 
     * @param encrypted
     *        A Boolean value that, if true, indicates that the file system is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is encrypted.
     * </p>
     * 
     * @return A Boolean value that, if true, indicates that the file system is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is encrypted.
     * </p>
     * 
     * @param encrypted
     *        A Boolean value that, if true, indicates that the file system is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is encrypted.
     * </p>
     * 
     * @return A Boolean value that, if true, indicates that the file system is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * encrypted file system.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     *        encrypted file system.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * encrypted file system.
     * </p>
     * 
     * @return The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     *         encrypted file system.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     * encrypted file system.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     *        encrypted file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     * bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or change
     * between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode
     * change.
     * </p>
     * 
     * @param throughputMode
     *        The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     *        bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or
     *        change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     *        throughput mode change.
     * @see ThroughputMode
     */

    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     * bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or change
     * between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode
     * change.
     * </p>
     * 
     * @return The throughput mode for a file system. There are two throughput modes to choose from for your file
     *         system: bursting and provisioned. You can decrease your file system's throughput in Provisioned
     *         Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the
     *         last decrease or throughput mode change.
     * @see ThroughputMode
     */

    public String getThroughputMode() {
        return this.throughputMode;
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     * bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or change
     * between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode
     * change.
     * </p>
     * 
     * @param throughputMode
     *        The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     *        bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or
     *        change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     *        throughput mode change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public UpdateFileSystemResult withThroughputMode(String throughputMode) {
        setThroughputMode(throughputMode);
        return this;
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     * bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or change
     * between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode
     * change.
     * </p>
     * 
     * @param throughputMode
     *        The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     *        bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or
     *        change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     *        throughput mode change.
     * @see ThroughputMode
     */

    public void setThroughputMode(ThroughputMode throughputMode) {
        withThroughputMode(throughputMode);
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     * bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or change
     * between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode
     * change.
     * </p>
     * 
     * @param throughputMode
     *        The throughput mode for a file system. There are two throughput modes to choose from for your file system:
     *        bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or
     *        change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     *        throughput mode change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public UpdateFileSystemResult withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file system. The limit on throughput is 1024
     * MiB/s. You can get these limits increased by contacting AWS Support. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     * Increase</a> in the <i>Amazon EFS User Guide.</i>
     * </p>
     * 
     * @param provisionedThroughputInMibps
     *        The throughput, measured in MiB/s, that you want to provision for a file system. The limit on throughput
     *        is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     *        Increase</a> in the <i>Amazon EFS User Guide.</i>
     */

    public void setProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file system. The limit on throughput is 1024
     * MiB/s. You can get these limits increased by contacting AWS Support. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     * Increase</a> in the <i>Amazon EFS User Guide.</i>
     * </p>
     * 
     * @return The throughput, measured in MiB/s, that you want to provision for a file system. The limit on throughput
     *         is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information, see <a
     *         href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     *         Increase</a> in the <i>Amazon EFS User Guide.</i>
     */

    public Double getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file system. The limit on throughput is 1024
     * MiB/s. You can get these limits increased by contacting AWS Support. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     * Increase</a> in the <i>Amazon EFS User Guide.</i>
     * </p>
     * 
     * @param provisionedThroughputInMibps
     *        The throughput, measured in MiB/s, that you want to provision for a file system. The limit on throughput
     *        is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     *        Increase</a> in the <i>Amazon EFS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        setProvisionedThroughputInMibps(provisionedThroughputInMibps);
        return this;
    }

    /**
     * <p>
     * The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     * </p>
     * 
     * @return The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     * </p>
     * 
     * @param tags
     *        The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     * </p>
     * 
     * @param tags
     *        The tags associated with the file system, presented as an array of <code>Tag</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getCreationToken() != null)
            sb.append("CreationToken: ").append(getCreationToken()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: ").append(getLifeCycleState()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNumberOfMountTargets() != null)
            sb.append("NumberOfMountTargets: ").append(getNumberOfMountTargets()).append(",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: ").append(getSizeInBytes()).append(",");
        if (getPerformanceMode() != null)
            sb.append("PerformanceMode: ").append(getPerformanceMode()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: ").append(getThroughputMode()).append(",");
        if (getProvisionedThroughputInMibps() != null)
            sb.append("ProvisionedThroughputInMibps: ").append(getProvisionedThroughputInMibps()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemResult == false)
            return false;
        UpdateFileSystemResult other = (UpdateFileSystemResult) obj;
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
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getProvisionedThroughputInMibps() == null ^ this.getProvisionedThroughputInMibps() == null)
            return false;
        if (other.getProvisionedThroughputInMibps() != null && other.getProvisionedThroughputInMibps().equals(this.getProvisionedThroughputInMibps()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputInMibps() == null) ? 0 : getProvisionedThroughputInMibps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemResult clone() {
        try {
            return (UpdateFileSystemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
