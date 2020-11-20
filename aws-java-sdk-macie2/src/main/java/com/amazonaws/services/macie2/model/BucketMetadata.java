/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about an S3 bucket that Amazon Macie monitors and analyzes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the AWS account that owns the bucket.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     */
    private String bucketArn;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * </p>
     */
    private java.util.Date bucketCreatedAt;
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
     */
    private Long classifiableSizeInBytes;
    /**
     * <p>
     * Specifies whether any one-time or recurring classification jobs are configured to analyze data in the bucket,
     * and, if so, the details of the job that ran most recently.
     * </p>
     */
    private JobDetails jobDetails;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data about the
     * bucket from Amazon S3.
     * </p>
     */
    private java.util.Date lastUpdated;
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
     * Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL), bucket
     * policy, or block public access settings allow the bucket to be accessed by the general public.
     * </p>
     */
    private BucketPublicAccess publicAccess;
    /**
     * <p>
     * The AWS Region that hosts the bucket.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS accounts
     * and, if so, which accounts.
     * </p>
     */
    private ReplicationDetails replicationDetails;
    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String sharedAccess;
    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     */
    private Long sizeInBytes;
    /**
     * <p>
     * The total compressed storage size, in bytes, of the bucket.
     * </p>
     */
    private Long sizeInBytesCompressed;
    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated with the bucket.
     * </p>
     */
    private java.util.List<KeyValuePair> tags;
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
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     */
    private Boolean versioning;

    /**
     * <p>
     * The unique identifier for the AWS account that owns the bucket.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the AWS account that owns the bucket.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the AWS account that owns the bucket.
     * </p>
     * 
     * @return The unique identifier for the AWS account that owns the bucket.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the AWS account that owns the bucket.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the AWS account that owns the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of the bucket.
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bucket.
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * </p>
     * 
     * @param bucketCreatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     */

    public void setBucketCreatedAt(java.util.Date bucketCreatedAt) {
        this.bucketCreatedAt = bucketCreatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     */

    public java.util.Date getBucketCreatedAt() {
        return this.bucketCreatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * </p>
     * 
     * @param bucketCreatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withBucketCreatedAt(java.util.Date bucketCreatedAt) {
        setBucketCreatedAt(bucketCreatedAt);
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

    public BucketMetadata withBucketName(String bucketName) {
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

    public BucketMetadata withClassifiableObjectCount(Long classifiableObjectCount) {
        setClassifiableObjectCount(classifiableObjectCount);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a
     * supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param classifiableSizeInBytes
     *        The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These
     *        objects use a supported storage class and have a file name extension for a supported file or storage
     *        format.
     */

    public void setClassifiableSizeInBytes(Long classifiableSizeInBytes) {
        this.classifiableSizeInBytes = classifiableSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a
     * supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These
     *         objects use a supported storage class and have a file name extension for a supported file or storage
     *         format.
     */

    public Long getClassifiableSizeInBytes() {
        return this.classifiableSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a
     * supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param classifiableSizeInBytes
     *        The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These
     *        objects use a supported storage class and have a file name extension for a supported file or storage
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withClassifiableSizeInBytes(Long classifiableSizeInBytes) {
        setClassifiableSizeInBytes(classifiableSizeInBytes);
        return this;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring classification jobs are configured to analyze data in the bucket,
     * and, if so, the details of the job that ran most recently.
     * </p>
     * 
     * @param jobDetails
     *        Specifies whether any one-time or recurring classification jobs are configured to analyze data in the
     *        bucket, and, if so, the details of the job that ran most recently.
     */

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring classification jobs are configured to analyze data in the bucket,
     * and, if so, the details of the job that ran most recently.
     * </p>
     * 
     * @return Specifies whether any one-time or recurring classification jobs are configured to analyze data in the
     *         bucket, and, if so, the details of the job that ran most recently.
     */

    public JobDetails getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring classification jobs are configured to analyze data in the bucket,
     * and, if so, the details of the job that ran most recently.
     * </p>
     * 
     * @param jobDetails
     *        Specifies whether any one-time or recurring classification jobs are configured to analyze data in the
     *        bucket, and, if so, the details of the job that ran most recently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withJobDetails(JobDetails jobDetails) {
        setJobDetails(jobDetails);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data about the
     * bucket from Amazon S3.
     * </p>
     * 
     * @param lastUpdated
     *        The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data
     *        about the bucket from Amazon S3.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data about the
     * bucket from Amazon S3.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data
     *         about the bucket from Amazon S3.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data about the
     * bucket from Amazon S3.
     * </p>
     * 
     * @param lastUpdated
     *        The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data
     *        about the bucket from Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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

    public BucketMetadata withObjectCount(Long objectCount) {
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

    public BucketMetadata withObjectCountByEncryptionType(ObjectCountByEncryptionType objectCountByEncryptionType) {
        setObjectCountByEncryptionType(objectCountByEncryptionType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL), bucket
     * policy, or block public access settings allow the bucket to be accessed by the general public.
     * </p>
     * 
     * @param publicAccess
     *        Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL),
     *        bucket policy, or block public access settings allow the bucket to be accessed by the general public.
     */

    public void setPublicAccess(BucketPublicAccess publicAccess) {
        this.publicAccess = publicAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL), bucket
     * policy, or block public access settings allow the bucket to be accessed by the general public.
     * </p>
     * 
     * @return Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL),
     *         bucket policy, or block public access settings allow the bucket to be accessed by the general public.
     */

    public BucketPublicAccess getPublicAccess() {
        return this.publicAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL), bucket
     * policy, or block public access settings allow the bucket to be accessed by the general public.
     * </p>
     * 
     * @param publicAccess
     *        Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL),
     *        bucket policy, or block public access settings allow the bucket to be accessed by the general public.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withPublicAccess(BucketPublicAccess publicAccess) {
        setPublicAccess(publicAccess);
        return this;
    }

    /**
     * <p>
     * The AWS Region that hosts the bucket.
     * </p>
     * 
     * @param region
     *        The AWS Region that hosts the bucket.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region that hosts the bucket.
     * </p>
     * 
     * @return The AWS Region that hosts the bucket.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region that hosts the bucket.
     * </p>
     * 
     * @param region
     *        The AWS Region that hosts the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS accounts
     * and, if so, which accounts.
     * </p>
     * 
     * @param replicationDetails
     *        Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS
     *        accounts and, if so, which accounts.
     */

    public void setReplicationDetails(ReplicationDetails replicationDetails) {
        this.replicationDetails = replicationDetails;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS accounts
     * and, if so, which accounts.
     * </p>
     * 
     * @return Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS
     *         accounts and, if so, which accounts.
     */

    public ReplicationDetails getReplicationDetails() {
        return this.replicationDetails;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS accounts
     * and, if so, which accounts.
     * </p>
     * 
     * @param replicationDetails
     *        Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS
     *        accounts and, if so, which accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withReplicationDetails(ReplicationDetails replicationDetails) {
        setReplicationDetails(replicationDetails);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sharedAccess
     *        <p>
     *        Specifies whether the bucket is shared with another AWS account. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     *        </p>
     *        </li>
     *        </ul>
     * @see SharedAccess
     */

    public void setSharedAccess(String sharedAccess) {
        this.sharedAccess = sharedAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <p>
     *         Specifies whether the bucket is shared with another AWS account. Possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     *         </p>
     *         </li>
     *         </ul>
     * @see SharedAccess
     */

    public String getSharedAccess() {
        return this.sharedAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sharedAccess
     *        <p>
     *        Specifies whether the bucket is shared with another AWS account. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAccess
     */

    public BucketMetadata withSharedAccess(String sharedAccess) {
        setSharedAccess(sharedAccess);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sharedAccess
     *        <p>
     *        Specifies whether the bucket is shared with another AWS account. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAccess
     */

    public BucketMetadata withSharedAccess(SharedAccess sharedAccess) {
        this.sharedAccess = sharedAccess.toString();
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     * 
     * @param sizeInBytes
     *        The total storage size, in bytes, of the bucket.
     */

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     * 
     * @return The total storage size, in bytes, of the bucket.
     */

    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     * 
     * @param sizeInBytes
     *        The total storage size, in bytes, of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withSizeInBytes(Long sizeInBytes) {
        setSizeInBytes(sizeInBytes);
        return this;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of the bucket.
     * </p>
     * 
     * @param sizeInBytesCompressed
     *        The total compressed storage size, in bytes, of the bucket.
     */

    public void setSizeInBytesCompressed(Long sizeInBytesCompressed) {
        this.sizeInBytesCompressed = sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of the bucket.
     * </p>
     * 
     * @return The total compressed storage size, in bytes, of the bucket.
     */

    public Long getSizeInBytesCompressed() {
        return this.sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of the bucket.
     * </p>
     * 
     * @param sizeInBytesCompressed
     *        The total compressed storage size, in bytes, of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withSizeInBytesCompressed(Long sizeInBytesCompressed) {
        setSizeInBytesCompressed(sizeInBytesCompressed);
        return this;
    }

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated with the bucket.
     * </p>
     * 
     * @return An array that specifies the tags (keys and values) that are associated with the bucket.
     */

    public java.util.List<KeyValuePair> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated with the bucket.
     * </p>
     * 
     * @param tags
     *        An array that specifies the tags (keys and values) that are associated with the bucket.
     */

    public void setTags(java.util.Collection<KeyValuePair> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<KeyValuePair>(tags);
    }

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated with the bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array that specifies the tags (keys and values) that are associated with the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withTags(KeyValuePair... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<KeyValuePair>(tags.length));
        }
        for (KeyValuePair ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated with the bucket.
     * </p>
     * 
     * @param tags
     *        An array that specifies the tags (keys and values) that are associated with the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withTags(java.util.Collection<KeyValuePair> tags) {
        setTags(tags);
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

    public BucketMetadata withUnclassifiableObjectCount(ObjectLevelStatistics unclassifiableObjectCount) {
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

    public BucketMetadata withUnclassifiableObjectSizeInBytes(ObjectLevelStatistics unclassifiableObjectSizeInBytes) {
        setUnclassifiableObjectSizeInBytes(unclassifiableObjectSizeInBytes);
        return this;
    }

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     * 
     * @param versioning
     *        Specifies whether versioning is enabled for the bucket.
     */

    public void setVersioning(Boolean versioning) {
        this.versioning = versioning;
    }

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     * 
     * @return Specifies whether versioning is enabled for the bucket.
     */

    public Boolean getVersioning() {
        return this.versioning;
    }

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     * 
     * @param versioning
     *        Specifies whether versioning is enabled for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketMetadata withVersioning(Boolean versioning) {
        setVersioning(versioning);
        return this;
    }

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     * 
     * @return Specifies whether versioning is enabled for the bucket.
     */

    public Boolean isVersioning() {
        return this.versioning;
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
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn()).append(",");
        if (getBucketCreatedAt() != null)
            sb.append("BucketCreatedAt: ").append(getBucketCreatedAt()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getClassifiableObjectCount() != null)
            sb.append("ClassifiableObjectCount: ").append(getClassifiableObjectCount()).append(",");
        if (getClassifiableSizeInBytes() != null)
            sb.append("ClassifiableSizeInBytes: ").append(getClassifiableSizeInBytes()).append(",");
        if (getJobDetails() != null)
            sb.append("JobDetails: ").append(getJobDetails()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getObjectCount() != null)
            sb.append("ObjectCount: ").append(getObjectCount()).append(",");
        if (getObjectCountByEncryptionType() != null)
            sb.append("ObjectCountByEncryptionType: ").append(getObjectCountByEncryptionType()).append(",");
        if (getPublicAccess() != null)
            sb.append("PublicAccess: ").append(getPublicAccess()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getReplicationDetails() != null)
            sb.append("ReplicationDetails: ").append(getReplicationDetails()).append(",");
        if (getSharedAccess() != null)
            sb.append("SharedAccess: ").append(getSharedAccess()).append(",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: ").append(getSizeInBytes()).append(",");
        if (getSizeInBytesCompressed() != null)
            sb.append("SizeInBytesCompressed: ").append(getSizeInBytesCompressed()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUnclassifiableObjectCount() != null)
            sb.append("UnclassifiableObjectCount: ").append(getUnclassifiableObjectCount()).append(",");
        if (getUnclassifiableObjectSizeInBytes() != null)
            sb.append("UnclassifiableObjectSizeInBytes: ").append(getUnclassifiableObjectSizeInBytes()).append(",");
        if (getVersioning() != null)
            sb.append("Versioning: ").append(getVersioning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketMetadata == false)
            return false;
        BucketMetadata other = (BucketMetadata) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getBucketCreatedAt() == null ^ this.getBucketCreatedAt() == null)
            return false;
        if (other.getBucketCreatedAt() != null && other.getBucketCreatedAt().equals(this.getBucketCreatedAt()) == false)
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
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getObjectCount() == null ^ this.getObjectCount() == null)
            return false;
        if (other.getObjectCount() != null && other.getObjectCount().equals(this.getObjectCount()) == false)
            return false;
        if (other.getObjectCountByEncryptionType() == null ^ this.getObjectCountByEncryptionType() == null)
            return false;
        if (other.getObjectCountByEncryptionType() != null && other.getObjectCountByEncryptionType().equals(this.getObjectCountByEncryptionType()) == false)
            return false;
        if (other.getPublicAccess() == null ^ this.getPublicAccess() == null)
            return false;
        if (other.getPublicAccess() != null && other.getPublicAccess().equals(this.getPublicAccess()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getReplicationDetails() == null ^ this.getReplicationDetails() == null)
            return false;
        if (other.getReplicationDetails() != null && other.getReplicationDetails().equals(this.getReplicationDetails()) == false)
            return false;
        if (other.getSharedAccess() == null ^ this.getSharedAccess() == null)
            return false;
        if (other.getSharedAccess() != null && other.getSharedAccess().equals(this.getSharedAccess()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getSizeInBytesCompressed() == null ^ this.getSizeInBytesCompressed() == null)
            return false;
        if (other.getSizeInBytesCompressed() != null && other.getSizeInBytesCompressed().equals(this.getSizeInBytesCompressed()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        if (other.getVersioning() == null ^ this.getVersioning() == null)
            return false;
        if (other.getVersioning() != null && other.getVersioning().equals(this.getVersioning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getBucketCreatedAt() == null) ? 0 : getBucketCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getClassifiableObjectCount() == null) ? 0 : getClassifiableObjectCount().hashCode());
        hashCode = prime * hashCode + ((getClassifiableSizeInBytes() == null) ? 0 : getClassifiableSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getObjectCount() == null) ? 0 : getObjectCount().hashCode());
        hashCode = prime * hashCode + ((getObjectCountByEncryptionType() == null) ? 0 : getObjectCountByEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getPublicAccess() == null) ? 0 : getPublicAccess().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getReplicationDetails() == null) ? 0 : getReplicationDetails().hashCode());
        hashCode = prime * hashCode + ((getSharedAccess() == null) ? 0 : getSharedAccess().hashCode());
        hashCode = prime * hashCode + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getSizeInBytesCompressed() == null) ? 0 : getSizeInBytesCompressed().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUnclassifiableObjectCount() == null) ? 0 : getUnclassifiableObjectCount().hashCode());
        hashCode = prime * hashCode + ((getUnclassifiableObjectSizeInBytes() == null) ? 0 : getUnclassifiableObjectSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getVersioning() == null) ? 0 : getVersioning().hashCode());
        return hashCode;
    }

    @Override
    public BucketMetadata clone() {
        try {
            return (BucketMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
