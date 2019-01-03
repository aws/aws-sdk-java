/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * Provides options for copying an Amazon S3 object
 * from a source location to a new destination.
 * </p>
 * <p>
 * All <code>CopyObjectRequests</code> must specify a source bucket and key, along with a destination
 * bucket and key.  Beyond that, requests also specify:
 * </p>
 * <ul>
 *  <li>Object metadata for new object,</li>
 *  <li>A {@link CannedAccessControlList} for the new object,</li>
 *  <li>Constraints controlling if the copy will be performed or not.</li>
 * </ul>
 *
 * @see AmazonS3Client#copyObject(String, String, String, String)
 * @see AmazonS3Client#copyObject(com.amazonaws.services.s3.model.CopyObjectRequest)
 * @see CopyObjectResult
 */
public class CopyObjectRequest extends AmazonWebServiceRequest implements
                                                               SSEAwsKeyManagementParamsProvider,
                                                               Serializable,
                                                               S3AccelerateUnsupported {

    /** The name of the bucket containing the object to be copied */
    private String sourceBucketName;

    /**
     * The key in the source bucket under which the object to be copied is
     * stored
     */
    private String sourceKey;

    /**
     * Optional version Id specifying which version of the source object to
     * copy. If not specified, the most recent version of the source object will
     * be copied.
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     */
    private String sourceVersionId;

    /** The name of the bucket to contain the copy of the source object */
    private String destinationBucketName;

    /**
     * The key in the destination bucket under which the source object will be
     * copied
     */
    private String destinationKey;

    /**
     * The optional Amazon S3 storage class to use when storing the newly copied
     * object.  If not specified, the default, standard storage class will be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     */
    private String storageClass;

    /** Optional field specifying the object metadata for the new object */
    private ObjectMetadata newObjectMetadata;

    /** Optional field specifying the ACL for the new object */
    private CannedAccessControlList cannedACL;

    /**
     * An optional access control list to apply to the new object. If specified,
     * cannedAcl will be ignored.
     */
    private AccessControlList accessControlList;

    /**
     * Optional list of ETag values that constrain the copy request to only be
     * executed if the source object's ETag matches one of the specified ETag
     * values.
     */
    private List<String> matchingETagConstraints = new ArrayList<String>();

    /**
     * Optional list of ETag values that constrain the copy request to only be
     * executed if the source object's ETag does not match any of the specified
     * ETag constraint values.
     */
    private List<String> nonmatchingEtagConstraints = new ArrayList<String>();

    /**
     * Optional field that constrains the copy request to only be executed if
     * the source object has not been modified since the specified date.
     */
    private Date unmodifiedSinceConstraint;

    /**
     * Optional field that constrains the copy request to only be executed if
     * the source object has been modified since the specified date.
     */
    private Date modifiedSinceConstraint;

    /** Optional field specifying the redirect location for the new object */
    private String redirectLocation;

    /**
     * The optional customer-provided server-side encryption key to use to
     * decrypt the source object being copied.
     */
    private SSECustomerKey sourceSSECustomerKey;

    /**
     * The optional customer-provided server-side encryption key to use to
     * encrypt the destination object being copied.
     */
    private SSECustomerKey destinationSSECustomerKey;

    /**
     * The optional AWS Key Management system parameters to be used to encrypt
     * the the object on the server side.
     */
    private SSEAwsKeyManagementParams sseAwsKeyManagementParams;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    private ObjectTagging newObjectTagging;

    private String metadataDirective;

    private String objectLockMode;

    private Date objectLockRetainUntilDate;

    private String objectLockLegalHoldStatus;

    /**
     * <p>
     * Constructs with basic options.
     * </p>
     *
     * @param sourceBucketName
     *            The name of the S3 bucket containing the object to copy.
     * @param sourceKey
     *            The source bucket key under which the object to copy is
     *            stored.
     * @param destinationBucketName
     *            The name of the S3 bucket to which the new object will be
     *            copied.
     * @param destinationKey
     *            The destination bucket key under which the new object
     *            will be copied.
     */
    public CopyObjectRequest(String sourceBucketName, String sourceKey,
                             String destinationBucketName, String destinationKey) {
        this(sourceBucketName, sourceKey, null, destinationBucketName, destinationKey);
    }

    /**
     * <p>
     * Constructs a new {@link CopyObjectRequest} with basic options, providing
     * an S3 version ID identifying the specific version of the source object
     * to copy.
     * </p>
     *
     * @param sourceBucketName
     *            The name of the S3 bucket containing the object to copy.
     * @param sourceKey
     *            The key in the source bucket under which the object to copy is
     *            stored.
     * @param sourceVersionId
     *            The S3 version ID which uniquely identifies a specific version
     *            of the source object to copy.
     * @param destinationBucketName
     *            The name of the S3 bucket in which the new object will be
     *            copied.
     * @param destinationKey
     *            The key in the destination bucket under which the new object
     *            will be copied.
     *
     * @see CopyObjectRequest#CopyObjectRequest(String sourceBucketName, String sourceKey, String destinationBucketName, String destinationKey)
     */
    public CopyObjectRequest(String sourceBucketName, String sourceKey, String sourceVersionId,
                             String destinationBucketName, String destinationKey) {
        this.sourceBucketName = sourceBucketName;
        this.sourceKey = sourceKey;
        this.sourceVersionId = sourceVersionId;
        this.destinationBucketName = destinationBucketName;
        this.destinationKey = destinationKey;
    }

    /**
     * Gets the name of the bucket containing the source object to be copied.
     *
     * @return The name of the bucket containing the source object to be copied.
     *
     * @see CopyObjectRequest#setSourceBucketName(String sourceBucketName)
     */
    public String getSourceBucketName() {
        return sourceBucketName;
    }

    /**
     * Sets the name of the bucket containing the source object to be copied.
     *
     * @param sourceBucketName
     *            The name of the bucket containing the source object to be
     *            copied.
     * @see CopyObjectRequest#getSourceBucketName()
     */
    public void setSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
    }

    /**
     * Sets the name of the bucket containing the source object to be copied,
     * and returns this object, enabling additional method calls to be chained
     * together.
     *
     * @param sourceBucketName
     *            The name of the bucket containing the source object to be
     *            copied.
     *
     * @return This <code>CopyObjectRequest</code> instance,
     *         enabling additional method calls to be chained together.
     */
    public CopyObjectRequest withSourceBucketName(String sourceBucketName) {
        setSourceBucketName(sourceBucketName);
        return this;
    }

    /**
     * Gets the source bucket key under which the source object to be
     * copied is stored.
     *
     * @return The source bucket key under which the source object to be
     *         copied is stored.
     *
     * @see CopyObjectRequest#setSourceKey(String sourceKey)
     */
    public String getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the source bucket key under which the source object to be
     * copied is stored.
     *
     * @param sourceKey
     *            The source bucket key under which the source object to
     *            be copied is stored.
     *
     * @see CopyObjectRequest#setSourceKey(String)
     */
    public void setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
    }

    /**
     * Sets the key in the source bucket under which the source object to be
     * copied is stored and returns this object, enabling additional method calls
     * to be chained together.
     *
     * @param sourceKey
     *            The key in the source bucket under which the source object to
     *            be copied is stored.
     *
     * @return This <code>CopyObjectRequest</code> instance, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withSourceKey(String sourceKey) {
        setSourceKey(sourceKey);
        return this;
    }

    /**
     * <p>
     * Gets the version ID specifying which version of the source
     * object to copy. If not specified, the most recent version of the source
     * object will be copied.
     * </p>
     * <p>
     * Objects created before enabling versioning or when versioning is
     * suspended are given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @return The version ID specifying which version of the source
     *         object to copy.
     *
     *
     * @see Constants#NULL_VERSION_ID
     * @see CopyObjectRequest#setSourceVersionId(String sourceVersionId)
     */
    public String getSourceVersionId() {
        return sourceVersionId;
    }

    /**
     * <p>
     * Sets the optional version ID specifying which version of the source
     * object to copy. If not specified, the most recent version of the source
     * object will be copied.
     * </p>
     * <p>
     * Objects created before enabling versioning or when versioning is
     * suspended are given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param sourceVersionId
     *            The optional version ID specifying which version of the
     *            source object to copy.
     */
    public void setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
    }

    /**
     * <p>
     * Sets the optional version ID specifying which version of the source
     * object to copy and returns this object, enabling additional method calls
     * to be chained together. If not specified, the most recent version of the
     * source object will be copied.
     * </p>
     * <p>
     * Objects created before enabling versioning or when versioning is
     * suspended are given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param sourceVersionId
     *            The optional version ID specifying which version of the
     *            source object to copy.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withSourceVersionId(String sourceVersionId) {
        setSourceVersionId(sourceVersionId);
        return this;
    }

    /**
     * Gets the destination bucket name which will contain the new,
     * copied object.
     *
     * @return The name of the destination bucket which will contain the new,
     *         copied object.
     *
     * @see CopyObjectRequest#setDestinationBucketName(String destinationBucketName)
     */
    public String getDestinationBucketName() {
        return destinationBucketName;
    }

    /**
     * Sets the destination bucket name which will contain the new,
     * copied object.
     *
     * @param destinationBucketName
     *            The name of the destination bucket which will contain the new,
     *            copied object.
     *
     * @see CopyObjectRequest#getDestinationBucketName()
     */
    public void setDestinationBucketName(String destinationBucketName) {
        this.destinationBucketName = destinationBucketName;
    }

    /**
     * Sets the name of the destination bucket which will contain the new,
     * copied object and returns this object, enabling additional method calls
     * to be chained together.
     *
     * @param destinationBucketName
     *            The name of the destination bucket which will contain the new,
     *            copied object.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withDestinationBucketName(String destinationBucketName) {
        setDestinationBucketName(destinationBucketName);
        return this;
    }

    /**
     * Gets the destination bucket key under which the new, copied
     * object will be stored.
     *
     * @return The destination bucket key under which the new, copied
     *         object will be stored.
     *
     * @see CopyObjectRequest#setDestinationKey(String destinationKey)
     */
    public String getDestinationKey() {
        return destinationKey;
    }

    /**
     * Sets the destination bucket key under which the new, copied object
     * will be stored.
     *
     * @param destinationKey
     *            The destination bucket key under which the new, copied
     *            object will be stored.
     *
     * @see CopyObjectRequest#getDestinationKey()
     */
    public void setDestinationKey(String destinationKey) {
        this.destinationKey = destinationKey;
    }

    /**
     * Sets the destination bucket key under which the new, copied object
     * will be stored and returns this object, enabling additional method calls
     * can be chained together.
     *
     * @param destinationKey
     *            The destination bucket key under which the new, copied
     *            object will be stored.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withDestinationKey(String destinationKey) {
        setDestinationKey(destinationKey);
        return this;
    }

    /*
     * Optional Request Properties
     */

    /**
     * <p>
     * Gets the optional Amazon S3 storage class to use when storing the newly
     * copied object. If not specified, the default standard storage class is
     * used.
     * </p>
     * <p>
     * For more information on available Amazon S3 storage classes, see the
     * {@link StorageClass} enumeration.
     * </p>
     *
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     *
     * @see CopyObjectRequest#setStorageClass(String)
     * @see CopyObjectRequest#setStorageClass(StorageClass)
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * Sets the optional Amazon S3 storage class to use when storing the newly
     * copied object. If not specified, the default standard storage class is
     * used.
     * </p>
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     *
     * @see CopyObjectRequest#getStorageClass()
     * @see CopyObjectRequest#setStorageClass(StorageClass)
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * Sets the optional Amazon S3 storage class to use when storing the newly
     * copied object and returns this <code>CopyObjectRequest</code>, enabling additional
     * method calls to be chained together. If not specified, the default
     * standard storage class is used.
     * </p>
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * Sets the optional Amazon S3 storage class to use when storing the newly
     * copied object. If not specified, the default standard storage class
     * is used.
     * </p>
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     *
     * @see CopyObjectRequest#getStorageClass()
     * @see CopyObjectRequest#setStorageClass(String)
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * Sets the optional Amazon S3 storage class to use when storing the newly
     * copied object and returns this CopyObjectRequest, enabling additional
     * method calls to be chained together. If not specified, the default standard storage class
     * is used.
     * </p>
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Gets the canned ACL to use for the new, copied object. If no canned
     * ACL is specified, S3 will default to using the
     * {@link CannedAccessControlList#Private} canned ACL for all copied
     * objects.
     *
     * @return The canned ACL to set for the newly copied object,
     *         or <code>null</code> if no
     *         canned ACL has been specified.
     */
    public CannedAccessControlList getCannedAccessControlList() {
        return cannedACL;
    }

    /**
     * Sets the canned ACL to use for the newly copied object. If no canned ACL
     * is specified, S3 will default to using the
     * {@link CannedAccessControlList#Private} canned ACL for all copied
     * objects.
     *
     * @param cannedACL
     *            The canned ACL to set for the newly copied object.
     */
    public void setCannedAccessControlList(CannedAccessControlList cannedACL) {
        this.cannedACL = cannedACL;
    }

    /**
     * Sets the canned ACL to use for the newly copied object, and returns this
     * <code>CopyObjectRequest</code>, enabling additional method calls to be chained
     * together.
     *
     * @param cannedACL
     *            The canned ACL to set for the newly copied object.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withCannedAccessControlList(CannedAccessControlList cannedACL) {
        setCannedAccessControlList(cannedACL);
        return this;
    }

    /**
     * Returns the optional access control list for the new object. If
     * specified, cannedAcl will be ignored.
     */
    public AccessControlList getAccessControlList() {
        return accessControlList;
    }

    /**
     * Sets the optional access control list for the new object. If specified,
     * cannedAcl will be ignored.
     *
     * @param accessControlList
     *            The access control list for the new object.
     */
    public void setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * Sets the optional access control list for the new object. If specified,
     * cannedAcl will be ignored. Returns this {@link CopyObjectRequest},
     * enabling additional method calls to be chained together.
     *
     * @param accessControlList
     *            The access control list for the new object.
     */
    public CopyObjectRequest withAccessControlList(AccessControlList accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * Gets the optional object metadata to set for the new, copied object.
     *
     * @return The object metadata to set for the newly copied object.
     *         Returns <code>null</code> if no object metadata has been specified.
     *
     * @see CopyObjectRequest#setNewObjectMetadata(ObjectMetadata newObjectMetadata)
     */
    public ObjectMetadata getNewObjectMetadata() {
        return newObjectMetadata;
    }

    /**
     * Sets the object metadata to use for the new, copied object. By default
     * the object metadata from the source object is copied to the
     * destination object, but when setting object metadata with this method,
     * no metadata from the source object is copied. Instead, the new
     * destination object will have the metadata specified with this call.
     *
     * @param newObjectMetadata
     *            The object metadata to use for the newly copied object.
     *
     * @see CopyObjectRequest#getNewObjectMetadata()
     */
    public void setNewObjectMetadata(ObjectMetadata newObjectMetadata) {
        this.newObjectMetadata = newObjectMetadata;
    }

    /**
     * Sets the object metadata to use for the new, copied object and returns
     * this object, enabling additional method calls to be chained together. By
     * default, the object metadata from the source object will be copied to the
     * destination object, but if callers set object metadata with this method,
     * it will be used instead.
     *
     * @param newObjectMetadata
     *            The object metadata to use for the newly copied object.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withNewObjectMetadata(ObjectMetadata newObjectMetadata) {
        setNewObjectMetadata(newObjectMetadata);
        return this;
    }

    /*
     * Optional Constraints
     */

    /**
     * <p>
     * Gets the optional list of ETag constraints that, when present, <b>must</b>
     * include a match for the source object's current ETag in order for the
     * copy object request to be executed. Only one ETag in the list needs to
     * match for the request to be executed by Amazon S3.
     * </p>
     * <p>
     * Matching ETag constraints may be used with the unmodified since
     * constraint, but not with any other type of constraint.
     * </p>
     *
     * @return The optional list of ETag constraints that when present must
     *         include a match for the source object's current ETag in order for
     *         this request to be executed.
     */
    public List<String> getMatchingETagConstraints() {
        return matchingETagConstraints;
    }

    /**
     * <p>
     * Sets the optional list of ETag constraints that, when present, <b>must</b>
     * include a match for the source object's current ETag in order for the
     * copy object request to be executed. If none of the specified ETags match
     * the source object's current ETag, the copy object operation will be
     * aborted. Only one ETag in the list needs to match for the request to be
     * executed by Amazon S3.
     * </p>
     * <p>
     * Matching ETag constraints may be used with the unmodified since
     * constraint, but not with any other type of constraint.
     * </p>
     *
     * @param eTagList
     *            The optional list of ETag constraints that must include a
     *            match for the source object's current ETag in order for this
     *            request to be executed.
     */
    public void setMatchingETagConstraints(List<String> eTagList) {
        this.matchingETagConstraints = eTagList;
    }

    /**
     * <p>
     * Adds a single ETag constraint to this request and returns this object,
     * enabling additional method calls to be chained together. Multiple ETag
     * constraints can be added to a request, but one must match the source
     * object's current ETag in order for the copy object request to be
     * executed. If none of the ETag constraints added to this request match the
     * source object's current ETag, the copy object operation will be aborted.
     * </p>
     * <p>
     * Matching ETag constraints may be used with the unmodified since
     * constraint, but not with any other type of constraint.
     * </p>
     *
     * @param eTag
     *            The matching ETag constraint to add to this request.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withMatchingETagConstraint(String eTag) {
        this.matchingETagConstraints.add(eTag);
        return this;
    }

    /**
     * <p>
     * Gets the optional list of ETag constraints that, when present, <b>must
     * not</b> include a match for the source object's current ETag in order for
     * the copy object request to be executed. If any entry in the non-matching
     * ETag constraint list matches the source object's current ETag, this copy
     * request <b>will not</b> be executed by Amazon S3.
     * </p>
     * <p>
     * Non-matching ETag constraints may be used with the modified since
     * constraint, but not with any other type of constraint.
     * </p>
     *
     * @return The optional list of ETag constraints that when present <b>must
     *         not</b> include a match for the source object's current ETag in
     *         order for this request to be executed.
     */
    public List<String> getNonmatchingETagConstraints() {
        return nonmatchingEtagConstraints;
    }

    /**
     * <p>
     * Sets the optional list of ETag constraints that, when present, <b>must
     * not</b> include a match for the source object's current ETag in order for
     * the copy object request to be executed. If any entry in the non-matching
     * ETag constraint list matches the source object's current ETag, this copy
     * request <b>will not</b> be executed by Amazon S3.
     * </p>
     * <p>
     * Non-matching ETag constraints may be used with the modified since
     * constraint, but not with any other type of constraint.
     * </p>
     *
     * @param eTagList
     *            The list of ETag constraints that, when present, <b>must not</b>
     *            include a match for the source object's current ETag in
     *            order for this request to be executed.
     */
    public void setNonmatchingETagConstraints(List<String> eTagList) {
        this.nonmatchingEtagConstraints = eTagList;
    }

    /**
     * <p>
     * Adds a single ETag constraint to this request and returns this object, enabling
     * additional method calls to be chained together. Multiple ETag
     * constraints can be added to a request, but all ETag constraints <b>must
     * not</b> match the source object's current ETag in order for the copy
     * object request to be executed. If any entry in the non-matching ETag
     * constraint list matches the source object's current ETag, this copy
     * request <b>will not</b> be executed by Amazon S3.
     * </p>
     * <p>
     * Non-matching ETag constraints may be used with the modified since
     * constraint, but not with any other type of constraint.
     * </p>
     *
     * @param eTag
     *            The non-matching ETag constraint to add to this request.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withNonmatchingETagConstraint(String eTag) {
        this.nonmatchingEtagConstraints.add(eTag);
        return this;
    }

    /**
     * <p>
     * Gets the optional unmodified  constraint that restricts this
     * request to executing only if the source object has <b>not</b> been
     * modified after the specified date.
     * </p>
     * <p>
     * The unmodified since constraint may be used with matching ETag
     * constraints, but not with any other type of constraint.
     * </p>
     *
     * @return The optional unmodified constraint that restricts this
     *         request to executing only if the source object has <b>not</b>
     *         been modified after the specified date.
     */
    public Date getUnmodifiedSinceConstraint() {
        return unmodifiedSinceConstraint;
    }

    /**
     * <p>
     * Sets the optional unmodified constraint that restricts this request
     * to executing only if the source object has <b>not</b> been
     * modified after the specified date.
     * </p>
     * <p>
     * The unmodified constraint may be used with matching ETag
     * constraints, but not with any other type of constraint.
     * </p>
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     * </p>
     *
     * @param date
     *            The unmodified constraint that restricts this request to
     *            executing only if the source object has <b>not</b> been
     *            modified after this date.
     */
    public void setUnmodifiedSinceConstraint(Date date) {
        this.unmodifiedSinceConstraint = date;
    }

    /**
     * <p>
     * Sets the optional unmodified constraint that restricts this request
     * to executing only if the source object has <b>not</b> been
     * modified after the specified date. Returns this object, enabling
     * additional method calls to be chained together.
     * </p>
     * <p>
     * The unmodified constraint may be used with matching ETag
     * constraints, but not with any other type of constraint.
     * </p>
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     * </p>
     *
     * @param date
     *            The unmodified constraint that restricts this request to
     *            executing only if the source object has <b>not</b> been
     *            modified after this date.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withUnmodifiedSinceConstraint(Date date) {
        setUnmodifiedSinceConstraint(date);
        return this;
    }

    /**
     * <p>
     * Gets the optional modified constraint that restricts this
     * request to executing only if the source object <b>has</b> been
     * modified after the specified date.
     * </p>
     * <p>
     * The modified constraint may be used with non-matching ETag
     * constraints, but not with any other type of constraint.
     * </p>
     *
     * @return The optional modified constraint that restricts this
     *         request to executing only if the source object <b>has</b>
     *         been modified after the specified date.
     */
    public Date getModifiedSinceConstraint() {
        return modifiedSinceConstraint;
    }

    /**
     * <p>
     * Sets the optional modified constraint that restricts this request
     * to executing only if the source object <b>has</b> been modified
     * after the specified date.
     * </p>
     * <p>
     * The modified constraint may be used with non-matching ETag
     * constraints, but not with any other type of constraint.
     * </p>
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     * </p>
     *
     * @param date
     *            The modified constraint that restricts this request to
     *            executing only if the source object <b>has</b> been
     *            modified after the specified date.
     */
    public void setModifiedSinceConstraint(Date date) {
        this.modifiedSinceConstraint = date;
    }

    /**
     * <p>
     * Sets the optional modified constraint that restricts this request
     * to executing only if the source object <b>has</b> been modified
     * after the specified date. Returns this object, enabling additional
     * method calls to be chained together.
     * </p>
     * <p>
     * The modified constraint may be used with non-matching ETag
     * constraints, but not with any other type of constraint.
     * </p>
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     * </p>
     *
     * @param date
     *            The modified constraint that restricts this request to
     *            executing only if the source object <b>has</b> been
     *            modified after the specified date.
     *
     * @return This <code>CopyObjectRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyObjectRequest withModifiedSinceConstraint(Date date) {
        setModifiedSinceConstraint(date);
        return this;
    }

    /**
     * Sets the optional redirect location for the newly copied object.
     *
     * @param redirectLocation
     *            The redirect location for the newly copied object.
     */
    public void setRedirectLocation(String redirectLocation) {
        this.redirectLocation = redirectLocation;
    }

    /**
     * Gets the optional redirect location for the newly copied object.
     */
    public String getRedirectLocation() {
        return this.redirectLocation;
    }

    /**
     * Sets the optional redirect location for the newly copied object.Returns this
     * {@link CopyObjectRequest}, enabling additional method calls to be chained
     * together.
     * @param redirectLocation
     *            The redirect location for the newly copied object.
     */
    public CopyObjectRequest withRedirectLocation(String redirectLocation) {
        this.redirectLocation = redirectLocation;
        return this;
    }

    /**
     * Returns the optional customer-provided server-side encryption key to use
     * to decrypt the source object being copied.
     *
     * @return The optional customer-provided server-side encryption key to use
     *         to decrypt the source object being copied.
     */
    public SSECustomerKey getSourceSSECustomerKey() {
        return sourceSSECustomerKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * decrypt the source object being copied.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to decrypt the source object being copied.
     */
    public void setSourceSSECustomerKey(SSECustomerKey sseKey) {
        this.sourceSSECustomerKey = sseKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * decrypt the source object being copied, and returns the updated request
     * object so that additional method calls can be chained together.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to decrypt the source object being copied.
     *
     * @return This updated request object so that additional method calls can
     *         be chained together.
     */
    public CopyObjectRequest withSourceSSECustomerKey(SSECustomerKey sseKey) {
        setSourceSSECustomerKey(sseKey);
        return this;
    }

    /**
     * Returns the optional customer-provided server-side encryption key to use
     * to encrypt the destination object being copied.
     *
     * @return The optional customer-provided server-side encryption key to use
     *         to encrypt the destination object being copied.
     */
    public SSECustomerKey getDestinationSSECustomerKey() {
        return destinationSSECustomerKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * encrypt the destination object being copied.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to encrypt the destination object being copied.
     */
    public void setDestinationSSECustomerKey(SSECustomerKey sseKey) {
        if (sseKey != null && this.sseAwsKeyManagementParams != null) {
            throw new IllegalArgumentException(
                "Either SSECustomerKey or SSEAwsKeyManagementParams must not be set at the same time.");
        }
        this.destinationSSECustomerKey = sseKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * encrypt the destination object being copied, and returns the updated
     * request object so that additional method calls can be chained together.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to encrypt the destination object being copied.
     *
     * @return This updated request object so that additional method calls can
     *         be chained together.
     */
    public CopyObjectRequest withDestinationSSECustomerKey(SSECustomerKey sseKey) {
        setDestinationSSECustomerKey(sseKey);
        return this;
    }

    /**
     * Returns the AWS Key Management System parameters used to encrypt the
     * object on server side.
     */
    @Override
    public SSEAwsKeyManagementParams getSSEAwsKeyManagementParams() {
        return sseAwsKeyManagementParams;
    }

    /**
     * Sets the AWS Key Management System parameters used to encrypt the object
     * on server side.
     */
    public void setSSEAwsKeyManagementParams(SSEAwsKeyManagementParams params) {
        if (params != null && this.destinationSSECustomerKey != null) {
            throw new IllegalArgumentException(
                "Either SSECustomerKey or SSEAwsKeyManagementParams must not be set at the same time.");
        }
        this.sseAwsKeyManagementParams = params;
    }

    /**
     * Sets the AWS Key Management System parameters used to encrypt the object
     * on server side.
     *
     * @return returns the update CopyObjectRequest
     */
    public CopyObjectRequest withSSEAwsKeyManagementParams(
            SSEAwsKeyManagementParams sseAwsKeyManagementParams) {
        setSSEAwsKeyManagementParams(sseAwsKeyManagementParams);
        return this;
    }
    /**
     * Returns true if the user has enabled Requester Pays option when
     * conducting this operation from Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @return true if the user has enabled Requester Pays option for
     *         conducting this operation from Requester Pays Bucket.
     */
    public boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     */
    public void setRequesterPays(boolean isRequesterPays) {
        this.isRequesterPays = isRequesterPays;
    }

    /**
     * Used for conducting this operation from a Requester Pays Bucket. If
     * set the requester is charged for requests from the bucket. It returns this
     * updated CopyObjectRequest object so that additional method calls can be
     * chained together.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to upload or
     * download an object from it without Requester Pays enabled will result in
     * a 403 error and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket.
     *
     * @param isRequesterPays
     *            Enable Requester Pays option for the operation.
     *
     * @return The updated CopyObjectRequest object.
     */
    public CopyObjectRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

    /**
     * @return the tagging for the new object.
     */
    public ObjectTagging getNewObjectTagging() {
        return newObjectTagging;
    }

    /**
     * set the tagging for the new object.
     *
     * @param newObjectTagging the tagging for the new object.
     */
    public void setNewObjectTagging(ObjectTagging newObjectTagging) {
        this.newObjectTagging = newObjectTagging;
    }

    /**
     * set the tagging for the new object.
     *
     * @param newObjectTagging the tagging for the new object.
     *
     * @return This object for chaining.
     */
    public CopyObjectRequest withNewObjectTagging(ObjectTagging newObjectTagging) {
        setNewObjectTagging(newObjectTagging);
        return this;
    }

    /**
     * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
     */
    public String getMetadataDirective() {
        return metadataDirective;
    }

    /**
     * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
     *
     * @param metadataDirective New value for the metadata directive.
     */
    public void setMetadataDirective(String metadataDirective) {
        this.metadataDirective = metadataDirective;
    }

    /**
     * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
     *
     * @param metadataDirective New value for the metadata directive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public CopyObjectRequest withMetadataDirective(String metadataDirective) {
        setMetadataDirective(metadataDirective);
        return this;
    }

    /**
     * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
     *
     * @param metadataDirective New value for the metadata directive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public CopyObjectRequest withMetadataDirective(MetadataDirective metadataDirective) {
        return withMetadataDirective(metadataDirective == null ? null : metadataDirective.toString());
    }

    /**
     * The Object Lock mode that you want to apply to the copied object.
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * The Object Lock mode that you want to apply to the copied object.
     */
    public CopyObjectRequest withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return this;
    }

    /**
     * The Object Lock mode that you want to apply to the copied object.
     */
    public CopyObjectRequest withObjectLockMode(ObjectLockMode objectLockMode) {
        return withObjectLockMode(objectLockMode.toString());
    }

    /**
     * The Object Lock mode that you want to apply to the copied object.
     */
    public void setObjectLockMode(String objectLockMode) {
        withObjectLockMode(objectLockMode);
    }

    /**
     * The Object Lock mode that you want to apply to the copied object.
     */
    public void setObjectLockMode(ObjectLockMode objectLockMode) {
        setObjectLockMode(objectLockMode.toString());
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public CopyObjectRequest withObjectLockRetainUntilDate(Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return this;
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public void setObjectLockRetainUntilDate(Date objectLockRetainUntilDate) {
        withObjectLockRetainUntilDate(objectLockRetainUntilDate);
    }

    /**
     * Specifies whether you want to apply a Legal Hold to the copied object.
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * Specifies whether you want to apply a Legal Hold to the copied object.
     */
    public CopyObjectRequest withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return this;
    }

    /**
     * Specifies whether you want to apply a Legal Hold to the copied object.
     */
    public CopyObjectRequest withObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        return withObjectLockLegalHoldStatus(objectLockLegalHoldStatus.toString());
    }

    /**
     * Specifies whether you want to apply a Legal Hold to the copied object.
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        withObjectLockLegalHoldStatus(objectLockLegalHoldStatus);
    }

    /**
     * Specifies whether you want to apply a Legal Hold to the copied object.
     */
    public void setObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        setObjectLockLegalHoldStatus(objectLockLegalHoldStatus.toString());
    }
}
