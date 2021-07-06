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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetBucketStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The total number of buckets.
     * </p>
     */
    private Long bucketCount;
    /**
     * <p>
     * The total number of buckets that are publicly accessible based on a combination of permissions settings for each
     * bucket.
     * </p>
     */
    private BucketCountByEffectivePermission bucketCountByEffectivePermission;
    /**
     * <p>
     * The total number of buckets that use certain types of server-side encryption to encrypt new objects by default.
     * This object also reports the total number of buckets that don't encrypt new objects by default.
     * </p>
     */
    private BucketCountByEncryptionType bucketCountByEncryptionType;
    /**
     * <p>
     * The total number of buckets whose bucket policies do or don't require server-side encryption of objects when
     * objects are uploaded to the buckets.
     * </p>
     */
    private BucketCountPolicyAllowsUnencryptedObjectUploads bucketCountByObjectEncryptionRequirement;
    /**
     * <p>
     * The total number of buckets that are or aren't shared with another Amazon Web Services account.
     * </p>
     */
    private BucketCountBySharedAccessType bucketCountBySharedAccessType;
    /**
     * <p>
     * The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported storage
     * class and have a file name extension for a supported file or storage format.
     * </p>
     */
    private Long classifiableObjectCount;
    /**
     * <p>
     * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects
     * use a supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each applicable object in those buckets. This value doesn't reflect the storage size of all versions
     * of all applicable objects in the buckets.
     * </p>
     */
    private Long classifiableSizeInBytes;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved both bucket and
     * object metadata from Amazon S3 for the buckets.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The total number of objects in the buckets.
     * </p>
     */
    private Long objectCount;
    /**
     * <p>
     * The total storage size, in bytes, of the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each object in those buckets. This value doesn't reflect the storage size of all versions of the
     * objects in the buckets.
     * </p>
     */
    private Long sizeInBytes;
    /**
     * <p>
     * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each applicable object in those buckets. This value doesn't reflect the storage size of all versions
     * of the applicable objects in the buckets.
     * </p>
     */
    private Long sizeInBytesCompressed;
    /**
     * <p>
     * The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported
     * storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     */
    private ObjectLevelStatistics unclassifiableObjectCount;
    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the buckets. These objects
     * don't use a supported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     */
    private ObjectLevelStatistics unclassifiableObjectSizeInBytes;

    /**
     * <p>
     * The total number of buckets.
     * </p>
     * 
     * @param bucketCount
     *        The total number of buckets.
     */

    public void setBucketCount(Long bucketCount) {
        this.bucketCount = bucketCount;
    }

    /**
     * <p>
     * The total number of buckets.
     * </p>
     * 
     * @return The total number of buckets.
     */

    public Long getBucketCount() {
        return this.bucketCount;
    }

    /**
     * <p>
     * The total number of buckets.
     * </p>
     * 
     * @param bucketCount
     *        The total number of buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withBucketCount(Long bucketCount) {
        setBucketCount(bucketCount);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible based on a combination of permissions settings for each
     * bucket.
     * </p>
     * 
     * @param bucketCountByEffectivePermission
     *        The total number of buckets that are publicly accessible based on a combination of permissions settings
     *        for each bucket.
     */

    public void setBucketCountByEffectivePermission(BucketCountByEffectivePermission bucketCountByEffectivePermission) {
        this.bucketCountByEffectivePermission = bucketCountByEffectivePermission;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible based on a combination of permissions settings for each
     * bucket.
     * </p>
     * 
     * @return The total number of buckets that are publicly accessible based on a combination of permissions settings
     *         for each bucket.
     */

    public BucketCountByEffectivePermission getBucketCountByEffectivePermission() {
        return this.bucketCountByEffectivePermission;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible based on a combination of permissions settings for each
     * bucket.
     * </p>
     * 
     * @param bucketCountByEffectivePermission
     *        The total number of buckets that are publicly accessible based on a combination of permissions settings
     *        for each bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withBucketCountByEffectivePermission(BucketCountByEffectivePermission bucketCountByEffectivePermission) {
        setBucketCountByEffectivePermission(bucketCountByEffectivePermission);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that use certain types of server-side encryption to encrypt new objects by default.
     * This object also reports the total number of buckets that don't encrypt new objects by default.
     * </p>
     * 
     * @param bucketCountByEncryptionType
     *        The total number of buckets that use certain types of server-side encryption to encrypt new objects by
     *        default. This object also reports the total number of buckets that don't encrypt new objects by default.
     */

    public void setBucketCountByEncryptionType(BucketCountByEncryptionType bucketCountByEncryptionType) {
        this.bucketCountByEncryptionType = bucketCountByEncryptionType;
    }

    /**
     * <p>
     * The total number of buckets that use certain types of server-side encryption to encrypt new objects by default.
     * This object also reports the total number of buckets that don't encrypt new objects by default.
     * </p>
     * 
     * @return The total number of buckets that use certain types of server-side encryption to encrypt new objects by
     *         default. This object also reports the total number of buckets that don't encrypt new objects by default.
     */

    public BucketCountByEncryptionType getBucketCountByEncryptionType() {
        return this.bucketCountByEncryptionType;
    }

    /**
     * <p>
     * The total number of buckets that use certain types of server-side encryption to encrypt new objects by default.
     * This object also reports the total number of buckets that don't encrypt new objects by default.
     * </p>
     * 
     * @param bucketCountByEncryptionType
     *        The total number of buckets that use certain types of server-side encryption to encrypt new objects by
     *        default. This object also reports the total number of buckets that don't encrypt new objects by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withBucketCountByEncryptionType(BucketCountByEncryptionType bucketCountByEncryptionType) {
        setBucketCountByEncryptionType(bucketCountByEncryptionType);
        return this;
    }

    /**
     * <p>
     * The total number of buckets whose bucket policies do or don't require server-side encryption of objects when
     * objects are uploaded to the buckets.
     * </p>
     * 
     * @param bucketCountByObjectEncryptionRequirement
     *        The total number of buckets whose bucket policies do or don't require server-side encryption of objects
     *        when objects are uploaded to the buckets.
     */

    public void setBucketCountByObjectEncryptionRequirement(BucketCountPolicyAllowsUnencryptedObjectUploads bucketCountByObjectEncryptionRequirement) {
        this.bucketCountByObjectEncryptionRequirement = bucketCountByObjectEncryptionRequirement;
    }

    /**
     * <p>
     * The total number of buckets whose bucket policies do or don't require server-side encryption of objects when
     * objects are uploaded to the buckets.
     * </p>
     * 
     * @return The total number of buckets whose bucket policies do or don't require server-side encryption of objects
     *         when objects are uploaded to the buckets.
     */

    public BucketCountPolicyAllowsUnencryptedObjectUploads getBucketCountByObjectEncryptionRequirement() {
        return this.bucketCountByObjectEncryptionRequirement;
    }

    /**
     * <p>
     * The total number of buckets whose bucket policies do or don't require server-side encryption of objects when
     * objects are uploaded to the buckets.
     * </p>
     * 
     * @param bucketCountByObjectEncryptionRequirement
     *        The total number of buckets whose bucket policies do or don't require server-side encryption of objects
     *        when objects are uploaded to the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withBucketCountByObjectEncryptionRequirement(
            BucketCountPolicyAllowsUnencryptedObjectUploads bucketCountByObjectEncryptionRequirement) {
        setBucketCountByObjectEncryptionRequirement(bucketCountByObjectEncryptionRequirement);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that are or aren't shared with another Amazon Web Services account.
     * </p>
     * 
     * @param bucketCountBySharedAccessType
     *        The total number of buckets that are or aren't shared with another Amazon Web Services account.
     */

    public void setBucketCountBySharedAccessType(BucketCountBySharedAccessType bucketCountBySharedAccessType) {
        this.bucketCountBySharedAccessType = bucketCountBySharedAccessType;
    }

    /**
     * <p>
     * The total number of buckets that are or aren't shared with another Amazon Web Services account.
     * </p>
     * 
     * @return The total number of buckets that are or aren't shared with another Amazon Web Services account.
     */

    public BucketCountBySharedAccessType getBucketCountBySharedAccessType() {
        return this.bucketCountBySharedAccessType;
    }

    /**
     * <p>
     * The total number of buckets that are or aren't shared with another Amazon Web Services account.
     * </p>
     * 
     * @param bucketCountBySharedAccessType
     *        The total number of buckets that are or aren't shared with another Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withBucketCountBySharedAccessType(BucketCountBySharedAccessType bucketCountBySharedAccessType) {
        setBucketCountBySharedAccessType(bucketCountBySharedAccessType);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported storage
     * class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param classifiableObjectCount
     *        The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported
     *        storage class and have a file name extension for a supported file or storage format.
     */

    public void setClassifiableObjectCount(Long classifiableObjectCount) {
        this.classifiableObjectCount = classifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported storage
     * class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported
     *         storage class and have a file name extension for a supported file or storage format.
     */

    public Long getClassifiableObjectCount() {
        return this.classifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported storage
     * class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param classifiableObjectCount
     *        The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported
     *        storage class and have a file name extension for a supported file or storage format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withClassifiableObjectCount(Long classifiableObjectCount) {
        setClassifiableObjectCount(classifiableObjectCount);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects
     * use a supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each applicable object in those buckets. This value doesn't reflect the storage size of all versions
     * of all applicable objects in the buckets.
     * </p>
     * 
     * @param classifiableSizeInBytes
     *        The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These
     *        objects use a supported storage class and have a file name extension for a supported file or storage
     *        format.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *        latest version of each applicable object in those buckets. This value doesn't reflect the storage size of
     *        all versions of all applicable objects in the buckets.
     */

    public void setClassifiableSizeInBytes(Long classifiableSizeInBytes) {
        this.classifiableSizeInBytes = classifiableSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects
     * use a supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each applicable object in those buckets. This value doesn't reflect the storage size of all versions
     * of all applicable objects in the buckets.
     * </p>
     * 
     * @return The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These
     *         objects use a supported storage class and have a file name extension for a supported file or storage
     *         format.</p>
     *         <p>
     *         If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *         latest version of each applicable object in those buckets. This value doesn't reflect the storage size of
     *         all versions of all applicable objects in the buckets.
     */

    public Long getClassifiableSizeInBytes() {
        return this.classifiableSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects
     * use a supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each applicable object in those buckets. This value doesn't reflect the storage size of all versions
     * of all applicable objects in the buckets.
     * </p>
     * 
     * @param classifiableSizeInBytes
     *        The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These
     *        objects use a supported storage class and have a file name extension for a supported file or storage
     *        format.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *        latest version of each applicable object in those buckets. This value doesn't reflect the storage size of
     *        all versions of all applicable objects in the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withClassifiableSizeInBytes(Long classifiableSizeInBytes) {
        setClassifiableSizeInBytes(classifiableSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved both bucket and
     * object metadata from Amazon S3 for the buckets.
     * </p>
     * 
     * @param lastUpdated
     *        The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved both
     *        bucket and object metadata from Amazon S3 for the buckets.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved both bucket and
     * object metadata from Amazon S3 for the buckets.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved both
     *         bucket and object metadata from Amazon S3 for the buckets.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved both bucket and
     * object metadata from Amazon S3 for the buckets.
     * </p>
     * 
     * @param lastUpdated
     *        The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved both
     *        bucket and object metadata from Amazon S3 for the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The total number of objects in the buckets.
     * </p>
     * 
     * @param objectCount
     *        The total number of objects in the buckets.
     */

    public void setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
    }

    /**
     * <p>
     * The total number of objects in the buckets.
     * </p>
     * 
     * @return The total number of objects in the buckets.
     */

    public Long getObjectCount() {
        return this.objectCount;
    }

    /**
     * <p>
     * The total number of objects in the buckets.
     * </p>
     * 
     * @param objectCount
     *        The total number of objects in the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withObjectCount(Long objectCount) {
        setObjectCount(objectCount);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each object in those buckets. This value doesn't reflect the storage size of all versions of the
     * objects in the buckets.
     * </p>
     * 
     * @param sizeInBytes
     *        The total storage size, in bytes, of the buckets.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *        latest version of each object in those buckets. This value doesn't reflect the storage size of all
     *        versions of the objects in the buckets.
     */

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each object in those buckets. This value doesn't reflect the storage size of all versions of the
     * objects in the buckets.
     * </p>
     * 
     * @return The total storage size, in bytes, of the buckets.</p>
     *         <p>
     *         If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *         latest version of each object in those buckets. This value doesn't reflect the storage size of all
     *         versions of the objects in the buckets.
     */

    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each object in those buckets. This value doesn't reflect the storage size of all versions of the
     * objects in the buckets.
     * </p>
     * 
     * @param sizeInBytes
     *        The total storage size, in bytes, of the buckets.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *        latest version of each object in those buckets. This value doesn't reflect the storage size of all
     *        versions of the objects in the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withSizeInBytes(Long sizeInBytes) {
        setSizeInBytes(sizeInBytes);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each applicable object in those buckets. This value doesn't reflect the storage size of all versions
     * of the applicable objects in the buckets.
     * </p>
     * 
     * @param sizeInBytesCompressed
     *        The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the
     *        buckets.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *        latest version of each applicable object in those buckets. This value doesn't reflect the storage size of
     *        all versions of the applicable objects in the buckets.
     */

    public void setSizeInBytesCompressed(Long sizeInBytesCompressed) {
        this.sizeInBytesCompressed = sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each applicable object in those buckets. This value doesn't reflect the storage size of all versions
     * of the applicable objects in the buckets.
     * </p>
     * 
     * @return The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the
     *         buckets.</p>
     *         <p>
     *         If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *         latest version of each applicable object in those buckets. This value doesn't reflect the storage size of
     *         all versions of the applicable objects in the buckets.
     */

    public Long getSizeInBytesCompressed() {
        return this.sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the latest
     * version of each applicable object in those buckets. This value doesn't reflect the storage size of all versions
     * of the applicable objects in the buckets.
     * </p>
     * 
     * @param sizeInBytesCompressed
     *        The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the
     *        buckets.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, Macie calculates this value based on the size of the
     *        latest version of each applicable object in those buckets. This value doesn't reflect the storage size of
     *        all versions of the applicable objects in the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withSizeInBytesCompressed(Long sizeInBytesCompressed) {
        setSizeInBytesCompressed(sizeInBytesCompressed);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported
     * storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param unclassifiableObjectCount
     *        The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a
     *        supported storage class or don't have a file name extension for a supported file or storage format.
     */

    public void setUnclassifiableObjectCount(ObjectLevelStatistics unclassifiableObjectCount) {
        this.unclassifiableObjectCount = unclassifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported
     * storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a
     *         supported storage class or don't have a file name extension for a supported file or storage format.
     */

    public ObjectLevelStatistics getUnclassifiableObjectCount() {
        return this.unclassifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported
     * storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param unclassifiableObjectCount
     *        The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a
     *        supported storage class or don't have a file name extension for a supported file or storage format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withUnclassifiableObjectCount(ObjectLevelStatistics unclassifiableObjectCount) {
        setUnclassifiableObjectCount(unclassifiableObjectCount);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the buckets. These objects
     * don't use a supported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param unclassifiableObjectSizeInBytes
     *        The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the buckets. These
     *        objects don't use a supported storage class or don't have a file name extension for a supported file or
     *        storage format.
     */

    public void setUnclassifiableObjectSizeInBytes(ObjectLevelStatistics unclassifiableObjectSizeInBytes) {
        this.unclassifiableObjectSizeInBytes = unclassifiableObjectSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the buckets. These objects
     * don't use a supported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the buckets. These
     *         objects don't use a supported storage class or don't have a file name extension for a supported file or
     *         storage format.
     */

    public ObjectLevelStatistics getUnclassifiableObjectSizeInBytes() {
        return this.unclassifiableObjectSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the buckets. These objects
     * don't use a supported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param unclassifiableObjectSizeInBytes
     *        The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the buckets. These
     *        objects don't use a supported storage class or don't have a file name extension for a supported file or
     *        storage format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketStatisticsResult withUnclassifiableObjectSizeInBytes(ObjectLevelStatistics unclassifiableObjectSizeInBytes) {
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
        if (getBucketCount() != null)
            sb.append("BucketCount: ").append(getBucketCount()).append(",");
        if (getBucketCountByEffectivePermission() != null)
            sb.append("BucketCountByEffectivePermission: ").append(getBucketCountByEffectivePermission()).append(",");
        if (getBucketCountByEncryptionType() != null)
            sb.append("BucketCountByEncryptionType: ").append(getBucketCountByEncryptionType()).append(",");
        if (getBucketCountByObjectEncryptionRequirement() != null)
            sb.append("BucketCountByObjectEncryptionRequirement: ").append(getBucketCountByObjectEncryptionRequirement()).append(",");
        if (getBucketCountBySharedAccessType() != null)
            sb.append("BucketCountBySharedAccessType: ").append(getBucketCountBySharedAccessType()).append(",");
        if (getClassifiableObjectCount() != null)
            sb.append("ClassifiableObjectCount: ").append(getClassifiableObjectCount()).append(",");
        if (getClassifiableSizeInBytes() != null)
            sb.append("ClassifiableSizeInBytes: ").append(getClassifiableSizeInBytes()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getObjectCount() != null)
            sb.append("ObjectCount: ").append(getObjectCount()).append(",");
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

        if (obj instanceof GetBucketStatisticsResult == false)
            return false;
        GetBucketStatisticsResult other = (GetBucketStatisticsResult) obj;
        if (other.getBucketCount() == null ^ this.getBucketCount() == null)
            return false;
        if (other.getBucketCount() != null && other.getBucketCount().equals(this.getBucketCount()) == false)
            return false;
        if (other.getBucketCountByEffectivePermission() == null ^ this.getBucketCountByEffectivePermission() == null)
            return false;
        if (other.getBucketCountByEffectivePermission() != null
                && other.getBucketCountByEffectivePermission().equals(this.getBucketCountByEffectivePermission()) == false)
            return false;
        if (other.getBucketCountByEncryptionType() == null ^ this.getBucketCountByEncryptionType() == null)
            return false;
        if (other.getBucketCountByEncryptionType() != null && other.getBucketCountByEncryptionType().equals(this.getBucketCountByEncryptionType()) == false)
            return false;
        if (other.getBucketCountByObjectEncryptionRequirement() == null ^ this.getBucketCountByObjectEncryptionRequirement() == null)
            return false;
        if (other.getBucketCountByObjectEncryptionRequirement() != null
                && other.getBucketCountByObjectEncryptionRequirement().equals(this.getBucketCountByObjectEncryptionRequirement()) == false)
            return false;
        if (other.getBucketCountBySharedAccessType() == null ^ this.getBucketCountBySharedAccessType() == null)
            return false;
        if (other.getBucketCountBySharedAccessType() != null
                && other.getBucketCountBySharedAccessType().equals(this.getBucketCountBySharedAccessType()) == false)
            return false;
        if (other.getClassifiableObjectCount() == null ^ this.getClassifiableObjectCount() == null)
            return false;
        if (other.getClassifiableObjectCount() != null && other.getClassifiableObjectCount().equals(this.getClassifiableObjectCount()) == false)
            return false;
        if (other.getClassifiableSizeInBytes() == null ^ this.getClassifiableSizeInBytes() == null)
            return false;
        if (other.getClassifiableSizeInBytes() != null && other.getClassifiableSizeInBytes().equals(this.getClassifiableSizeInBytes()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getObjectCount() == null ^ this.getObjectCount() == null)
            return false;
        if (other.getObjectCount() != null && other.getObjectCount().equals(this.getObjectCount()) == false)
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

        hashCode = prime * hashCode + ((getBucketCount() == null) ? 0 : getBucketCount().hashCode());
        hashCode = prime * hashCode + ((getBucketCountByEffectivePermission() == null) ? 0 : getBucketCountByEffectivePermission().hashCode());
        hashCode = prime * hashCode + ((getBucketCountByEncryptionType() == null) ? 0 : getBucketCountByEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getBucketCountByObjectEncryptionRequirement() == null) ? 0 : getBucketCountByObjectEncryptionRequirement().hashCode());
        hashCode = prime * hashCode + ((getBucketCountBySharedAccessType() == null) ? 0 : getBucketCountBySharedAccessType().hashCode());
        hashCode = prime * hashCode + ((getClassifiableObjectCount() == null) ? 0 : getClassifiableObjectCount().hashCode());
        hashCode = prime * hashCode + ((getClassifiableSizeInBytes() == null) ? 0 : getClassifiableSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getObjectCount() == null) ? 0 : getObjectCount().hashCode());
        hashCode = prime * hashCode + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getSizeInBytesCompressed() == null) ? 0 : getSizeInBytesCompressed().hashCode());
        hashCode = prime * hashCode + ((getUnclassifiableObjectCount() == null) ? 0 : getUnclassifiableObjectCount().hashCode());
        hashCode = prime * hashCode + ((getUnclassifiableObjectSizeInBytes() == null) ? 0 : getUnclassifiableObjectSizeInBytes().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketStatisticsResult clone() {
        try {
            return (GetBucketStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
