/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides statistical data and other information about an S3 bucket that Amazon Macie monitors and analyzes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/MatchingBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchingBucket implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the bucket.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported storage
     * class and have a file name extension for a supported file or storage format.
     * </p>
     */
    private Long classifiableObjectCount;
    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a
     * supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of
     * each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each
     * applicable object in the bucket.
     * </p>
     */
    private Long classifiableSizeInBytes;
    /**
     * <p>
     * Specifies whether any one-time or recurring classification jobs are configured to analyze objects in the bucket,
     * and, if so, the details of the job that ran most recently.
     * </p>
     */
    private JobDetails jobDetails;
    /**
     * <p>
     * The total number of objects in the bucket.
     * </p>
     */
    private Long objectCount;
    /**
     * <p>
     * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a
     * grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
     * </p>
     */
    private ObjectCountByEncryptionType objectCountByEncryptionType;
    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the latest
     * version of each object in the bucket. This value doesn't reflect the storage size of all versions of each object
     * in the bucket.
     * </p>
     */
    private Long sizeInBytes;
    /**
     * <p>
     * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the bucket.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of
     * each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each
     * applicable object in the bucket.
     * </p>
     */
    private Long sizeInBytesCompressed;
    /**
     * <p>
     * The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a supported
     * storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     */
    private ObjectLevelStatistics unclassifiableObjectCount;
    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These objects
     * don't use a supported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     */
    private ObjectLevelStatistics unclassifiableObjectSizeInBytes;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the bucket.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that owns the bucket.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the bucket.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account that owns the bucket.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the bucket.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that owns the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @return The name of the bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported storage
     * class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param classifiableObjectCount
     *        The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported
     *        storage class and have a file name extension for a supported file or storage format.
     */

    public void setClassifiableObjectCount(Long classifiableObjectCount) {
        this.classifiableObjectCount = classifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported storage
     * class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported
     *         storage class and have a file name extension for a supported file or storage format.
     */

    public Long getClassifiableObjectCount() {
        return this.classifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported storage
     * class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param classifiableObjectCount
     *        The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported
     *        storage class and have a file name extension for a supported file or storage format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withClassifiableObjectCount(Long classifiableObjectCount) {
        setClassifiableObjectCount(classifiableObjectCount);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a
     * supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of
     * each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each
     * applicable object in the bucket.
     * </p>
     * 
     * @param classifiableSizeInBytes
     *        The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These
     *        objects use a supported storage class and have a file name extension for a supported file or storage
     *        format.</p>
     *        <p>
     *        If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest
     *        version of each applicable object in the bucket. This value doesn't reflect the storage size of all
     *        versions of each applicable object in the bucket.
     */

    public void setClassifiableSizeInBytes(Long classifiableSizeInBytes) {
        this.classifiableSizeInBytes = classifiableSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a
     * supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of
     * each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each
     * applicable object in the bucket.
     * </p>
     * 
     * @return The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These
     *         objects use a supported storage class and have a file name extension for a supported file or storage
     *         format.</p>
     *         <p>
     *         If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest
     *         version of each applicable object in the bucket. This value doesn't reflect the storage size of all
     *         versions of each applicable object in the bucket.
     */

    public Long getClassifiableSizeInBytes() {
        return this.classifiableSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a
     * supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of
     * each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each
     * applicable object in the bucket.
     * </p>
     * 
     * @param classifiableSizeInBytes
     *        The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These
     *        objects use a supported storage class and have a file name extension for a supported file or storage
     *        format.</p>
     *        <p>
     *        If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest
     *        version of each applicable object in the bucket. This value doesn't reflect the storage size of all
     *        versions of each applicable object in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withClassifiableSizeInBytes(Long classifiableSizeInBytes) {
        setClassifiableSizeInBytes(classifiableSizeInBytes);
        return this;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring classification jobs are configured to analyze objects in the bucket,
     * and, if so, the details of the job that ran most recently.
     * </p>
     * 
     * @param jobDetails
     *        Specifies whether any one-time or recurring classification jobs are configured to analyze objects in the
     *        bucket, and, if so, the details of the job that ran most recently.
     */

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring classification jobs are configured to analyze objects in the bucket,
     * and, if so, the details of the job that ran most recently.
     * </p>
     * 
     * @return Specifies whether any one-time or recurring classification jobs are configured to analyze objects in the
     *         bucket, and, if so, the details of the job that ran most recently.
     */

    public JobDetails getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring classification jobs are configured to analyze objects in the bucket,
     * and, if so, the details of the job that ran most recently.
     * </p>
     * 
     * @param jobDetails
     *        Specifies whether any one-time or recurring classification jobs are configured to analyze objects in the
     *        bucket, and, if so, the details of the job that ran most recently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withJobDetails(JobDetails jobDetails) {
        setJobDetails(jobDetails);
        return this;
    }

    /**
     * <p>
     * The total number of objects in the bucket.
     * </p>
     * 
     * @param objectCount
     *        The total number of objects in the bucket.
     */

    public void setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
    }

    /**
     * <p>
     * The total number of objects in the bucket.
     * </p>
     * 
     * @return The total number of objects in the bucket.
     */

    public Long getObjectCount() {
        return this.objectCount;
    }

    /**
     * <p>
     * The total number of objects in the bucket.
     * </p>
     * 
     * @param objectCount
     *        The total number of objects in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withObjectCount(Long objectCount) {
        setObjectCount(objectCount);
        return this;
    }

    /**
     * <p>
     * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a
     * grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
     * </p>
     * 
     * @param objectCountByEncryptionType
     *        The total number of objects that are in the bucket, grouped by server-side encryption type. This includes
     *        a grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
     */

    public void setObjectCountByEncryptionType(ObjectCountByEncryptionType objectCountByEncryptionType) {
        this.objectCountByEncryptionType = objectCountByEncryptionType;
    }

    /**
     * <p>
     * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a
     * grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
     * </p>
     * 
     * @return The total number of objects that are in the bucket, grouped by server-side encryption type. This includes
     *         a grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
     */

    public ObjectCountByEncryptionType getObjectCountByEncryptionType() {
        return this.objectCountByEncryptionType;
    }

    /**
     * <p>
     * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a
     * grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
     * </p>
     * 
     * @param objectCountByEncryptionType
     *        The total number of objects that are in the bucket, grouped by server-side encryption type. This includes
     *        a grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withObjectCountByEncryptionType(ObjectCountByEncryptionType objectCountByEncryptionType) {
        setObjectCountByEncryptionType(objectCountByEncryptionType);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the latest
     * version of each object in the bucket. This value doesn't reflect the storage size of all versions of each object
     * in the bucket.
     * </p>
     * 
     * @param sizeInBytes
     *        The total storage size, in bytes, of the bucket.</p>
     *        <p>
     *        If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the
     *        latest version of each object in the bucket. This value doesn't reflect the storage size of all versions
     *        of each object in the bucket.
     */

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the latest
     * version of each object in the bucket. This value doesn't reflect the storage size of all versions of each object
     * in the bucket.
     * </p>
     * 
     * @return The total storage size, in bytes, of the bucket.</p>
     *         <p>
     *         If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the
     *         latest version of each object in the bucket. This value doesn't reflect the storage size of all versions
     *         of each object in the bucket.
     */

    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the latest
     * version of each object in the bucket. This value doesn't reflect the storage size of all versions of each object
     * in the bucket.
     * </p>
     * 
     * @param sizeInBytes
     *        The total storage size, in bytes, of the bucket.</p>
     *        <p>
     *        If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the
     *        latest version of each object in the bucket. This value doesn't reflect the storage size of all versions
     *        of each object in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withSizeInBytes(Long sizeInBytes) {
        setSizeInBytes(sizeInBytes);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the bucket.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of
     * each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each
     * applicable object in the bucket.
     * </p>
     * 
     * @param sizeInBytesCompressed
     *        The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the
     *        bucket.</p>
     *        <p>
     *        If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest
     *        version of each applicable object in the bucket. This value doesn't reflect the storage size of all
     *        versions of each applicable object in the bucket.
     */

    public void setSizeInBytesCompressed(Long sizeInBytesCompressed) {
        this.sizeInBytesCompressed = sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the bucket.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of
     * each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each
     * applicable object in the bucket.
     * </p>
     * 
     * @return The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the
     *         bucket.</p>
     *         <p>
     *         If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest
     *         version of each applicable object in the bucket. This value doesn't reflect the storage size of all
     *         versions of each applicable object in the bucket.
     */

    public Long getSizeInBytesCompressed() {
        return this.sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the bucket.
     * </p>
     * <p>
     * If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of
     * each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each
     * applicable object in the bucket.
     * </p>
     * 
     * @param sizeInBytesCompressed
     *        The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the
     *        bucket.</p>
     *        <p>
     *        If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest
     *        version of each applicable object in the bucket. This value doesn't reflect the storage size of all
     *        versions of each applicable object in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withSizeInBytesCompressed(Long sizeInBytesCompressed) {
        setSizeInBytesCompressed(sizeInBytesCompressed);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a supported
     * storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param unclassifiableObjectCount
     *        The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a
     *        supported storage class or don't have a file name extension for a supported file or storage format.
     */

    public void setUnclassifiableObjectCount(ObjectLevelStatistics unclassifiableObjectCount) {
        this.unclassifiableObjectCount = unclassifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a supported
     * storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a
     *         supported storage class or don't have a file name extension for a supported file or storage format.
     */

    public ObjectLevelStatistics getUnclassifiableObjectCount() {
        return this.unclassifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a supported
     * storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param unclassifiableObjectCount
     *        The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a
     *        supported storage class or don't have a file name extension for a supported file or storage format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withUnclassifiableObjectCount(ObjectLevelStatistics unclassifiableObjectCount) {
        setUnclassifiableObjectCount(unclassifiableObjectCount);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These objects
     * don't use a supported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param unclassifiableObjectSizeInBytes
     *        The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These
     *        objects don't use a supported storage class or don't have a file name extension for a supported file or
     *        storage format.
     */

    public void setUnclassifiableObjectSizeInBytes(ObjectLevelStatistics unclassifiableObjectSizeInBytes) {
        this.unclassifiableObjectSizeInBytes = unclassifiableObjectSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These objects
     * don't use a supported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These
     *         objects don't use a supported storage class or don't have a file name extension for a supported file or
     *         storage format.
     */

    public ObjectLevelStatistics getUnclassifiableObjectSizeInBytes() {
        return this.unclassifiableObjectSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These objects
     * don't use a supported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param unclassifiableObjectSizeInBytes
     *        The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These
     *        objects don't use a supported storage class or don't have a file name extension for a supported file or
     *        storage format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingBucket withUnclassifiableObjectSizeInBytes(ObjectLevelStatistics unclassifiableObjectSizeInBytes) {
        setUnclassifiableObjectSizeInBytes(unclassifiableObjectSizeInBytes);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getClassifiableObjectCount() != null)
            sb.append("ClassifiableObjectCount: ").append(getClassifiableObjectCount()).append(",");
        if (getClassifiableSizeInBytes() != null)
            sb.append("ClassifiableSizeInBytes: ").append(getClassifiableSizeInBytes()).append(",");
        if (getJobDetails() != null)
            sb.append("JobDetails: ").append(getJobDetails()).append(",");
        if (getObjectCount() != null)
            sb.append("ObjectCount: ").append(getObjectCount()).append(",");
        if (getObjectCountByEncryptionType() != null)
            sb.append("ObjectCountByEncryptionType: ").append(getObjectCountByEncryptionType()).append(",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: ").append(getSizeInBytes()).append(",");
        if (getSizeInBytesCompressed() != null)
            sb.append("SizeInBytesCompressed: ").append(getSizeInBytesCompressed()).append(",");
        if (getUnclassifiableObjectCount() != null)
            sb.append("UnclassifiableObjectCount: ").append(getUnclassifiableObjectCount()).append(",");
        if (getUnclassifiableObjectSizeInBytes() != null)
            sb.append("UnclassifiableObjectSizeInBytes: ").append(getUnclassifiableObjectSizeInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchingBucket == false)
            return false;
        MatchingBucket other = (MatchingBucket) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getClassifiableObjectCount() == null ^ this.getClassifiableObjectCount() == null)
            return false;
        if (other.getClassifiableObjectCount() != null && other.getClassifiableObjectCount().equals(this.getClassifiableObjectCount()) == false)
            return false;
        if (other.getClassifiableSizeInBytes() == null ^ this.getClassifiableSizeInBytes() == null)
            return false;
        if (other.getClassifiableSizeInBytes() != null && other.getClassifiableSizeInBytes().equals(this.getClassifiableSizeInBytes()) == false)
            return false;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        if (other.getObjectCount() == null ^ this.getObjectCount() == null)
            return false;
        if (other.getObjectCount() != null && other.getObjectCount().equals(this.getObjectCount()) == false)
            return false;
        if (other.getObjectCountByEncryptionType() == null ^ this.getObjectCountByEncryptionType() == null)
            return false;
        if (other.getObjectCountByEncryptionType() != null && other.getObjectCountByEncryptionType().equals(this.getObjectCountByEncryptionType()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getSizeInBytesCompressed() == null ^ this.getSizeInBytesCompressed() == null)
            return false;
        if (other.getSizeInBytesCompressed() != null && other.getSizeInBytesCompressed().equals(this.getSizeInBytesCompressed()) == false)
            return false;
        if (other.getUnclassifiableObjectCount() == null ^ this.getUnclassifiableObjectCount() == null)
            return false;
        if (other.getUnclassifiableObjectCount() != null && other.getUnclassifiableObjectCount().equals(this.getUnclassifiableObjectCount()) == false)
            return false;
        if (other.getUnclassifiableObjectSizeInBytes() == null ^ this.getUnclassifiableObjectSizeInBytes() == null)
            return false;
        if (other.getUnclassifiableObjectSizeInBytes() != null
                && other.getUnclassifiableObjectSizeInBytes().equals(this.getUnclassifiableObjectSizeInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getClassifiableObjectCount() == null) ? 0 : getClassifiableObjectCount().hashCode());
        hashCode = prime * hashCode + ((getClassifiableSizeInBytes() == null) ? 0 : getClassifiableSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        hashCode = prime * hashCode + ((getObjectCount() == null) ? 0 : getObjectCount().hashCode());
        hashCode = prime * hashCode + ((getObjectCountByEncryptionType() == null) ? 0 : getObjectCountByEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getSizeInBytesCompressed() == null) ? 0 : getSizeInBytesCompressed().hashCode());
        hashCode = prime * hashCode + ((getUnclassifiableObjectCount() == null) ? 0 : getUnclassifiableObjectCount().hashCode());
        hashCode = prime * hashCode + ((getUnclassifiableObjectSizeInBytes() == null) ? 0 : getUnclassifiableObjectSizeInBytes().hashCode());
        return hashCode;
    }

    @Override
    public MatchingBucket clone() {
        try {
            return (MatchingBucket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.MatchingBucketMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
