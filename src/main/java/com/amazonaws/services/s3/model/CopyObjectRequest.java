/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.Constants;

/**
 * Options for copying an S3 object from a source location to a new destination.
 * <p>
 * All CopyObjectRequests must specify a source bucket and key and a destination
 * bucket and key.  Beyond that, requests can also specify:
 * <ul>
 * <li>Object metadata for new object
 * <li>A {@link CannedAccessControlList} for the new object
 * <li>Constraints controlling if the copy will be performed or not
 * </ul>
 */
public class CopyObjectRequest extends AmazonWebServiceRequest {

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
     * See
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
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


    /**
     * Constructs a new CopyObjectRequest with only the basic, required options.
     *
     * @param sourceBucketName
     *            The name of the S3 bucket containing the object to copy.
     * @param sourceKey
     *            The key in the source bucket under which the object to copy is
     *            stored.
     * @param destinationBucketName
     *            The name of the S3 bucket in which the new object will be
     *            copied.
     * @param destinationKey
     *            The key in the destination bucket under which the new object
     *            will be copied.
     */
    public CopyObjectRequest(String sourceBucketName, String sourceKey,
                             String destinationBucketName, String destinationKey) {
        this(sourceBucketName, sourceKey, null, destinationBucketName, destinationKey);
    }

    /**
     * Constructs a new CopyObjectRequest with the basic options and specifies
     * an S3 version ID which identifies a specific version of the source object
     * to copy.
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
     * Returns the name of the bucket containing the source object to be copied.
     *
     * @return The name of the bucket containing the source object to be copied.
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
     */
    public void setSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
    }

    /**
     * Sets the name of the bucket containing the source object to be copied,
     * and returns this object so that additional method calls can be chained
     * together.
     *
     * @param sourceBucketName
     *            The name of the bucket containing the source object to be
     *            copied.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withSourceBucketName(String sourceBucketName) {
        setSourceBucketName(sourceBucketName);
        return this;
    }

    /**
     * Returns the key in the source bucket under which the source object to be
     * copied is stored.
     *
     * @return The key in the source bucket under which the source object to be
     *         copied is stored.
     */
    public String getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the key in the source bucket under which the source object to be
     * copied is stored.
     *
     * @param sourceKey
     *            The key in the source bucket under which the source object to
     *            be copied is stored.
     */
    public void setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
    }

    /**
     * Sets the key in the source bucket under which the source object to be
     * copied is stored, and returns this object so that additional method calls
     * can be chained together.
     *
     * @param sourceKey
     *            The key in the source bucket under which the source object to
     *            be copied is stored.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withSourceKey(String sourceKey) {
        setSourceKey(sourceKey);
        return this;
    }

    /**
     * Returns the optional version ID specifying which version of the source
     * object to copy. If not specified, the most recent version of the source
     * object will be copied.
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default/null version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * {@link Constants#NULL_VERSION_ID} is a valid version ID and is not the
     * same as not having a version ID.
     * <p>
     * See
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
     *
     * @return The optional version ID specifying which version of the source
     *         object to copy.
     *
     * @see Constants#NULL_VERSION_ID
     */
    public String getSourceVersionId() {
        return sourceVersionId;
    }

    /**
     * Sets the optional version ID specifying which version of the source
     * object to copy. If not specified, the most recent version of the source
     * object will be copied.
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default/null version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * {@link Constants#NULL_VERSION_ID} is a valid version ID and is not the
     * same as not having a version ID.
     * <p>
     * See
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
     *
     * @param sourceVersionId
     *            The the optional version ID specifying which version of the
     *            source object to copy.
     */
    public void setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
    }

    /**
     * Sets the optional version ID specifying which version of the source
     * object to copy, and returns this object so that additional method calls
     * can be chained together. If not specified, the most recent version of the
     * source object will be copied.
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default/null version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * {@link Constants#NULL_VERSION_ID} is a valid version ID and is not the
     * same as not having a version ID.
     * <p>
     * See
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
     *
     * @param sourceVersionId
     *            The the optional version ID specifying which version of the
     *            source object to copy.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withSourceVersionId(String sourceVersionId) {
        setSourceVersionId(sourceVersionId);
        return this;
    }

    /**
     * Returns the name of the destination bucket which will contain the new,
     * copied object.
     *
     * @return The name of the destination bucket which will contain the new,
     *         copied object.
     */
    public String getDestinationBucketName() {
        return destinationBucketName;
    }

    /**
     * Sets the name of the destination bucket which will contain the new,
     * copied object.
     *
     * @param destinationBucketName
     *            The name of the destination bucket which will contain the new,
     *            copied object.
     */
    public void setDestinationBucketName(String destinationBucketName) {
        this.destinationBucketName = destinationBucketName;
    }

    /**
     * Sets the name of the destination bucket which will contain the new,
     * copied object, and returns this object so that additional method calls
     * can be chained together.
     *
     * @param destinationBucketName
     *            The name of the destination bucket which will contain the new,
     *            copied object.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withDestinationBucketName(String destinationBucketName) {
        setDestinationBucketName(destinationBucketName);
        return this;
    }

    /**
     * Returns the key in the destination bucket under which the new, copied
     * object will be stored.
     *
     * @return The key in the destination bucket under which the new, copied
     *         object will be stored.
     */
    public String getDestinationKey() {
        return destinationKey;
    }

    /**
     * Sets the key in the destination bucket under which the new, copied object
     * will be stored.
     *
     * @param destinationKey
     *            The key in the destination bucket under which the new, copied
     *            object will be stored.
     */
    public void setDestinationKey(String destinationKey) {
        this.destinationKey = destinationKey;
    }

    /**
     * Sets the key in the destination bucket under which the new, copied object
     * will be stored, and returns this object so that additional method calls
     * can be chained together.
     *
     * @param destinationKey
     *            The key in the destination bucket under which the new, copied
     *            object will be stored.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
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
     * Gets the optional Amazon S3 storage class to use when storing the newly
     * copied object. If not specified, the default, standard storage class will
     * be used.
     * <p>
     * For more information on available Amazon S3 storage classes, see the
     * {@link StorageClass} enumeration.
     *
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the newly
     * copied object. If not specified, the default, standard storage class will
     * be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     *
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the newly
     * copied object, and returns this CopyObjectRequest so that additional
     * method calls can be chained together. If not specified, the default,
     * standard storage class will be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the newly
     * copied object. If not specified, the default, standard storage class will
     * be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     *
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the newly
     * copied object, and returns this CopyObjectRequest so that additional
     * method calls can be chained together. If not specified, the default,
     * standard storage class will be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Returns the canned ACL to use for the new, copied object. If no canned
     * ACL is specified, S3 will default to using the
     * {@link CannedAccessControlList#Private} canned ACL for all copied
     * objects.
     *
     * @return The canned ACL to set for the new, copied object, or null if no
     *         canned ACL has been specified.
     */
    public CannedAccessControlList getCannedAccessControlList() {
        return cannedACL;
    }

    /**
     * Sets the canned ACL to use for the new, copied object. If no canned ACL
     * is specified, S3 will default to using the
     * {@link CannedAccessControlList#Private} canned ACL for all copied
     * objects.
     *
     * @param cannedACL
     *            The canned ACL to set for the new, copied object.
     */
    public void setCannedAccessControlList(CannedAccessControlList cannedACL) {
        this.cannedACL = cannedACL;
    }

    /**
     * Sets the canned ACL to use for the new, copied object, and returns this
     * CopyObjectRequest so that additional method calls can be chained
     * together.
     *
     * @param cannedACL
     *            The canned ACL to set for the new, copied object.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withCannedAccessControlList(CannedAccessControlList cannedACL) {
        setCannedAccessControlList(cannedACL);
        return this;
    }

    /**
     * Returns the optional object metadata to set for the new, copied object.
     *
     * @return The object metadata to set for the new, copied object, otherwise
     *         null if no object metadata has been specified.
     */
    public ObjectMetadata getNewObjectMetadata() {
        return newObjectMetadata;
    }

    /**
     * Sets the object metadata to use for the new, copied object. By default,
     * the object metadata from the source object will be copied to the
     * destination object, but if callers set object metadata with this method,
     * no metadata from the source object will be copied, and instead the new
     * destination object will have the metadata the user has specified here.
     *
     * @param newObjectMetadata
     *            The object metadata to use for the new, copied object.
     */
    public void setNewObjectMetadata(ObjectMetadata newObjectMetadata) {
        this.newObjectMetadata = newObjectMetadata;
    }

    /**
     * Sets the object metadata to use for the new, copied object, and returns
     * this object so that additional method calls can be chained together. By
     * default, the object metadata from the source object will be copied to the
     * destination object, but if callers set object metadata with this method,
     * it will be used instead.
     *
     * @param newObjectMetadata
     *            The object metadata to use for the new, copied object.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
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
     * Returns the optional list of ETag constraints that, when present, <b>must
     * include a match</b> for the source object's current ETag in order for the
     * copy object request to be executed. Only one ETag in the list needs to
     * match for the request to be executed by Amazon S3.
     * <p>
     * Matching ETag constraints may be used with the unmodified since
     * constraint, but not with any other type of constraint.
     *
     * @return The optional list of ETag constraints that, when present, must
     *         include a match for the source object's current ETag in order for
     *         this copy object request to be executed.
     */
    public List<String> getMatchingETagConstraints() {
        return matchingETagConstraints;
    }

    /**
     * Sets the optional list of ETag constraints that, when present, <b>must
     * include a match</b> for the source object's current ETag in order for the
     * copy object request to be executed. If none of the specified ETags match
     * the source object's current ETag, the copy object operation will be
     * aborted. Only one ETag in the list needs to match for the request to be
     * executed by Amazon S3.
     * <p>
     * Matching ETag constraints may be used with the unmodified since
     * constraint, but not with any other type of constraint.
     *
     * @param eTagList
     *            The optional list of ETag constraints that must include a
     *            match for the source object's current ETag in order for this
     *            copy object request to be executed.
     */
    public void setMatchingETagConstraints(List<String> eTagList) {
        this.matchingETagConstraints = eTagList;
    }

    /**
     * Adds an single ETag constraint to this request, and returns this object
     * so that additional method calls can be chained together. Multiple ETag
     * constraints can be added to a request, but one must match the source
     * object's current ETag in order for the copy object request to be
     * executed. If none of the ETag constraints added to this request match the
     * source object's current ETag, the copy object operation will be aborted.
     * <p>
     * Matching ETag constraints may be used with the unmodified since
     * constraint, but not with any other type of constraint.
     *
     * @param eTag
     *            The matching ETag constraint to add to this request.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withMatchingETagConstraint(String eTag) {
        this.matchingETagConstraints.add(eTag);
        return this;
    }

    /**
     * Returns the optional list of ETag constraints that, when present, <b>must
     * not include a match</b> for the source object's current ETag in order for
     * the copy object request to be executed. If any entry in the non-matching
     * ETag constraint list matches the source object's current ETag, this copy
     * request <b>will not</b> be executed by Amazon S3.
     * <p>
     * Non-matching ETag constraints may be used with the modified since
     * constraint, but not with any other type of constraint.
     *
     * @return The optional list of ETag constraints that, when present, <b>must
     *         not include a match</b> for the source object's current ETag in
     *         order for this copy object request to be executed.
     */
    public List<String> getNonmatchingETagConstraints() {
        return nonmatchingEtagConstraints;
    }

    /**
     * Sets the optional list of ETag constraints that, when present, <b>must
     * not include a match</b> for the source object's current ETag in order for
     * the copy object request to be executed. If any entry in the non-matching
     * ETag constraint list matches the source object's current ETag, this copy
     * request <b>will not</b> be executed by Amazon S3.
     * <p>
     * Non-matching ETag constraints may be used with the modified since
     * constraint, but not with any other type of constraint.
     *
     * @param eTagList
     *            The list of ETag constraints that, when present, <b>must not
     *            include a match</b> for the source object's current ETag in
     *            order for this copy object request to be executed.
     */
    public void setNonmatchingETagConstraints(List<String> eTagList) {
        this.nonmatchingEtagConstraints = eTagList;
    }

    /**
     * Adds a single ETag constraint to this request, and returns this object so
     * that additional method calls can be chained together. Multiple ETag
     * constraints can be added to a request, but all ETag constraints <b>must
     * not</b> match the source object's current ETag in order for the copy
     * object request to be executed. If any entry in the non-matching ETag
     * constraint list matches the source object's current ETag, this copy
     * request <b>will not</b> be executed by Amazon S3.
     * <p>
     * Non-matching ETag constraints may be used with the modified since
     * constraint, but not with any other type of constraint.
     *
     * @param eTag
     *            The non-matching ETag constraint to add to this request.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withNonmatchingETagConstraint(String eTag) {
        this.nonmatchingEtagConstraints.add(eTag);
        return this;
    }

    /**
     * Returns the optional unmodified since constraint that restricts this
     * request to executing <b>only if</b> the source object has <b>not</b> been
     * modified since the specified date.
     * <p>
     * The unmodified since constraint may be used with matching ETag
     * constraints, but not with any other type of constraint.
     *
     * @return The optional unmodified since constraint that restricts this
     *         request to executing <b>only if</b> the source object has not
     *         been modified since the specified date.
     */
    public Date getUnmodifiedSinceConstraint() {
        return unmodifiedSinceConstraint;
    }

    /**
     * Sets the optional unmodified since constraint that restricts this request
     * to executing <b>only if</b> the source object has <b>not</b> been
     * modified since the specified date.
     * <p>
     * The unmodified since constraint may be used with matching ETag
     * constraints, but not with any other type of constraint.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The unmodified since constraint that restricts this request to
     *            executing <b>only if</b> the source object has <b>not</b> been
     *            modified since this date.
     */
    public void setUnmodifiedSinceConstraint(Date date) {
        this.unmodifiedSinceConstraint = date;
    }

    /**
     * Sets the optional unmodified since constraint that restricts this request
     * to executing <b>only if</b> the source object has <b>not</b> been
     * modified since the specified date, and returns this object so that
     * additional method calls can be chained together.
     * <p>
     * The unmodified since constraint may be used with matching ETag
     * constraints, but not with any other type of constraint.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The unmodified since constraint that restricts this request to
     *            executing <b>only if</b> the source object has <b>not</b> been
     *            modified since this date.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withUnmodifiedSinceConstraint(Date date) {
        setUnmodifiedSinceConstraint(date);
        return this;
    }

    /**
     * Returns the optional modified since constraint that restricts this
     * request to executing <b>only if</b> the source object <b>has</b> been
     * modified since the specified date.
     * <p>
     * The modified since constraint may be used with non-matching ETag
     * constraints, but not with any other type of constraint.
     *
     * @return The optional modified since constraint that restricts this
     *         request to executing <b>only if</b> the source object <b>has</b>
     *         been modified since the specified date.
     */
    public Date getModifiedSinceConstraint() {
        return modifiedSinceConstraint;
    }

    /**
     * Sets the optional modified since constraint that restricts this request
     * to executing <b>only if</b> the source object <b>has</b> been modified
     * since the specified date.
     * <p>
     * The modified since constraint may be used with non-matching ETag
     * constraints, but not with any other type of constraint.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The modified since constraint that restricts this request to
     *            executing <b>only if</b> the source object <b>has</b> been
     *            modified since the specified date.
     */
    public void setModifiedSinceConstraint(Date date) {
        this.modifiedSinceConstraint = date;
    }

    /**
     * Sets the optional modified since constraint that restricts this request
     * to executing <b>only if</b> the source object <b>has</b> been modified
     * since the specified date.
     * <p>
     * The modified since constraint may be used with non-matching ETag
     * constraints, but not with any other type of constraint.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The modified since constraint that restricts this request to
     *            executing <b>only if</b> the source object <b>has</b> been
     *            modified since the specified date.
     *
     * @return This CopyObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public CopyObjectRequest withModifiedSinceConstraint(Date date) {
        setModifiedSinceConstraint(date);
        return this;
    }

}
