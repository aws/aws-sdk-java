/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.Constants;

/**
 * <p>
 * Provides options for copying an Amazon S3 object from a source location to a
 * part of a multipart upload.
 * </p>
 * <p>
 * All <code>CopyPartRequests</code> must specify an upload id, a source bucket
 * and key, along with a destination bucket and key. Beyond that, requests also
 * specify constraints controlling if the copy will be performed or not.</li>
 *
 * @see AmazonS3Client#copyObject(CopyObjectRequest)
 * @see AmazonS3Client#initiateMultipartUpload(InitiateMultipartUploadRequest)
 * @see AmazonS3Client#uploadPart(UploadPartRequest)
 * @see CopyPartResult
 */
public class CopyPartRequest extends AmazonWebServiceRequest implements Serializable,
                                                                        S3AccelerateUnsupported {

    /**
     * The upload id of the multipart upload into which to copy this part.
     *
     * @see AmazonS3#initiateMultipartUpload(InitiateMultipartUploadRequest)
     */
    private String uploadId;

    /**
     * The part number to copy into.
     *
     * @see AmazonS3#uploadPart(UploadPartRequest)
     */
    private int partNumber;

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
     * {@link AmazonS3#withBucketVersioningConfiguration(withBucketVersioningConfigurationRequest)}.
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
     * Optional list of ETag values that constrain the copy request to only be
     * executed if the source object's ETag matches one of the specified ETag
     * values.
     */
    private final List<String> matchingETagConstraints = new ArrayList<String>();

    /**
     * Optional list of ETag values that constrain the copy request to only be
     * executed if the source object's ETag does not match any of the specified
     * ETag constraint values.
     */
    private final List<String> nonmatchingEtagConstraints = new ArrayList<String>();

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
     * Optional field that copies the object starting at the given zero-based
     * byte offset. Used with {@link CopyPartRequest#lastByte}
     */
    private Long firstByte;

    /**
     * Optional field that copies the object up to and including the given
     * zero-based byte offset. Used with {@link CopyPartRequest#firstByte}.
     */
    private Long lastByte;

    /**
     * The optional customer-provided server-side encryption key to use to
     * decrypt the source object part being copied.
     */
    private SSECustomerKey sourceSSECustomerKey;

    /**
     * The optional customer-provided server-side encryption key to use to
     * encrypt the source object part being copied.
     */
    private SSECustomerKey destinationSSECustomerKey;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    /**
     * Returns the ID of the existing, initiated multipart upload with which
     * this new part will be associated.
     *
     * @return the ID of the existing, initiated multipart upload with which
     *         this new part will be associated.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the ID of the existing, initiated multipart upload with which this
     * new part will be associated.
     *
     * @param uploadId
     *            the ID of the existing, initiated multipart upload with which
     *            this new part will be associated.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Sets the ID of the existing, initiated multipart upload with which this
     * new part will be associated.
     *
     * @param uploadId
     *            the ID of the existing, initiated multipart upload with which
     *            this new part will be associated. * @return This
     *            <code>CopyPartRequest</code>, enabling additional method calls
     *            to be chained together.
     */
    public CopyPartRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * Returns the part number describing this part's position relative to the
     * other parts in the multipart upload. Part number must be between 1 and
     * 10,000 (inclusive).
     *
     * @return the part number describing this part's position relative to the
     *         other parts in the multipart upload. Part number must be between
     *         1 and 10,000 (inclusive).
     */
    public int getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the part number describing this part's position relative to the
     * other parts in the multipart upload. Part number must be between 1 and
     * 10,000 (inclusive).
     *
     * @param partNumber
     *            the part number describing this part's position relative to
     *            the other parts in the multipart upload. Part number must be
     *            between 1 and 10,000 (inclusive).
     */
    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Sets the part number describing this part's position relative to the
     * other parts in the multipart upload. Part number must be between 1 and
     * 10,000 (inclusive).
     *
     * @param partNumber
     *            the part number describing this part's position relative to
     *            the other parts in the multipart upload. Part number must be
     *            between 1 and 10,000 (inclusive).
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withPartNumber(int partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * Gets the name of the bucket containing the source object to be copied.
     *
     * @return The name of the bucket containing the source object to be copied.
     * @see CopyPartRequest#setSourceBucketName(String sourceBucketName)
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
     * @see CopyPartRequest#getSourceBucketName()
     */
    public void setSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
    }

    /**
     * Sets the name of the bucket containing the source object to be copied.
     *
     * @param sourceBucketName
     *            The name of the bucket containing the source object to be
     *            copied.
     * @see CopyPartRequest#getSourceBucketName()
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
        return this;
    }

    /**
     * Gets the source bucket key under which the source object to be copied is
     * stored.
     *
     * @return The source bucket key under which the source object to be copied
     *         is stored.
     * @see CopyPartRequest#setSourceKey(String sourceKey)
     */
    public String getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the source bucket key under which the source object to be copied is
     * stored.
     *
     * @param sourceKey
     *            The source bucket key under which the source object to be
     *            copied is stored.
     * @see CopyPartRequest#setSourceKey(String sourceKey)
     */
    public void setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
    }

    /**
     * Sets the source bucket key under which the source object to be copied is
     * stored.
     *
     * @param sourceKey
     *            The source bucket key under which the source object to be
     *            copied is stored.
     * @see CopyPartRequest#setSourceKey(String sourceKey)
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
    }

    /**
     * <p>
     * Gets the version ID specifying which version of the source object to
     * copy. If not specified, the most recent version of the source object will
     * be copied.
     * </p>
     * <p>
     * Objects created before enabling versioning or when versioning is
     * suspended are given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the <code>null</code>
     * version ID is a valid version ID and is not the same as not having a
     * version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * .
     * </p>
     *
     * @return The version ID specifying which version of the source object to
     *         copy.
     * @see Constants#NULL_VERSION_ID
     * @see CopyPartRequest#setSourceVersionId(String sourceVersionId)
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
     * {@link Constants#NULL_VERSION_ID}). Note that the <code>null</code>
     * version ID is a valid version ID and is not the same as not having a
     * version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * .
     * </p>
     *
     * @param sourceVersionId
     *            The optional version ID specifying which version of the source
     *            object to copy.
     */
    public void setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
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
     * {@link Constants#NULL_VERSION_ID}). Note that the <code>null</code>
     * version ID is a valid version ID and is not the same as not having a
     * version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * .
     * </p>
     *
     * @param sourceVersionId
     *            The optional version ID specifying which version of the source
     *            object to copy.
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
        return this;
    }

    /**
     * Gets the destination bucket name which will contain the new,
     * copied object.
     *
     * @return The name of the destination bucket which will contain the new,
     *         copied object.
     *
     * @see CopyPartRequest#setDestinationBucketName(String destinationBucketName)
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
     * @see CopyPartRequest#getDestinationBucketName()
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
     * @return This <code>CopyPartRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyPartRequest withDestinationBucketName(String destinationBucketName) {
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
     * @see CopyPartRequest#setDestinationKey(String destinationKey)
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
     * @see CopyPartRequest#getDestinationKey()
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
     * @return This <code>CopyPartRequest</code>, enabling additional method calls to be
     *         chained together.
     */
    public CopyPartRequest withDestinationKey(String destinationKey) {
        setDestinationKey(destinationKey);
        return this;
    }


    /**
     * Returns the optional start range to copy from the source object.
     *
     * @return the optional start range to copy from the source object.
     */
    public Long getFirstByte() {
        return firstByte;
    }

    /**
     * Sets the optional zero-based byte offset to begin copying the source
     * object.
     *
     * @param firstByte
     *            the optional zero-based byte offset to begin copying the
     *            source object.
     */
    public void setFirstByte(Long firstByte) {
        this.firstByte = firstByte;
    }

    /**
     * Sets the optional zero-based byte offset to begin copying the source
     * object.
     *
     * @param firstByte
     *            the optional zero-based byte offset to begin copying the
     *            source object.
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withFirstByte(Long firstByte) {
        this.firstByte = firstByte;
        return this;
    }

    /**
     * Returns the optional zero-based byte offset to stop copying the source.
     *
     * @return the optional zero-based byte offset to stop copying the source.
     */
    public Long getLastByte() {
        return lastByte;
    }

    /**
     * Sets the optional zero-based byte offset to stop copying the source.
     */
    public void setLastByte(Long lastByte) {
        this.lastByte = lastByte;
    }

    /**
     * Sets the optional zero-based byte offset to stop copying the source.
     *
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withLastByte(Long lastByte) {
        this.lastByte = lastByte;
        return this;
    }

    /**
     * <p>
     * Gets the optional list of ETag constraints that, when present,
     * <b>must</b> include a match for the source object's current ETag in order
     * for the copy object request to be executed. Only one ETag in the list
     * needs to match for the request to be executed by Amazon S3.
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
     * Sets the optional list of ETag constraints that, when present,
     * <b>must</b> include a match for the source object's current ETag in order
     * for the copy object request to be executed. If none of the specified
     * ETags match the source object's current ETag, the copy object operation
     * will be aborted. Only one ETag in the list needs to match for the request
     * to be executed by Amazon S3.
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
        this.matchingETagConstraints.clear();
        this.matchingETagConstraints.addAll(eTagList);
    }

    /**
     * Fluent API for {@link #setMatchingETagConstraints(List)}.
     */
    public CopyPartRequest withMatchingETagConstraints(List<String> eTagList) {
        setMatchingETagConstraints(eTagList);
        return this;
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
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withMatchingETagConstraint(String eTag) {
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
     *            The list of ETag constraints that, when present, <b>must
     *            not</b> include a match for the source object's current ETag
     *            in order for this request to be executed.
     */
    public void setNonmatchingETagConstraints(List<String> eTagList) {
        this.nonmatchingEtagConstraints.clear();
        this.nonmatchingEtagConstraints.addAll(eTagList);
    }

    /**
     * Fluent API for {@link #setNonmatchingETagConstraints(List)}.
     */
    public CopyPartRequest withNonmatchingETagConstraints(List<String> eTagList) {
        setNonmatchingETagConstraints(eTagList);
        return this;
    }

    /**
     * <p>
     * Adds a single ETag constraint to this request and returns this object,
     * enabling additional method calls to be chained together. Multiple ETag
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
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withNonmatchingETagConstraint(String eTag) {
        this.nonmatchingEtagConstraints.add(eTag);
        return this;
    }

    /**
     * <p>
     * Gets the optional unmodified constraint that restricts this request to
     * executing only if the source object has <b>not</b> been modified after
     * the specified date.
     * </p>
     * <p>
     * The unmodified since constraint may be used with matching ETag
     * constraints, but not with any other type of constraint.
     * </p>
     *
     * @return The optional unmodified constraint that restricts this request to
     *         executing only if the source object has <b>not</b> been modified
     *         after the specified date.
     */
    public Date getUnmodifiedSinceConstraint() {
        return unmodifiedSinceConstraint;
    }

    /**
     * <p>
     * Sets the optional unmodified constraint that restricts this request to
     * executing only if the source object has <b>not</b> been modified after
     * the specified date.
     * </p>
     * <p>
     * The unmodified constraint may be used with matching ETag constraints, but
     * not with any other type of constraint.
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
     * Sets the optional unmodified constraint that restricts this request to
     * executing only if the source object has <b>not</b> been modified after
     * the specified date. Returns this object, enabling additional method calls
     * to be chained together.
     * </p>
     * <p>
     * The unmodified constraint may be used with matching ETag constraints, but
     * not with any other type of constraint.
     * </p>
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     * </p>
     *
     * @param date
     *            The unmodified constraint that restricts this request to
     *            executing only if the source object has <b>not</b> been
     *            modified after this date.
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withUnmodifiedSinceConstraint(Date date) {
        setUnmodifiedSinceConstraint(date);
        return this;
    }

    /**
     * <p>
     * Gets the optional modified constraint that restricts this request to
     * executing only if the source object <b>has</b> been modified after the
     * specified date.
     * </p>
     * <p>
     * The modified constraint may be used with non-matching ETag constraints,
     * but not with any other type of constraint.
     * </p>
     *
     * @return The optional modified constraint that restricts this request to
     *         executing only if the source object <b>has</b> been modified
     *         after the specified date.
     */
    public Date getModifiedSinceConstraint() {
        return modifiedSinceConstraint;
    }

    /**
     * <p>
     * Sets the optional modified constraint that restricts this request to
     * executing only if the source object <b>has</b> been modified after the
     * specified date.
     * </p>
     * <p>
     * The modified constraint may be used with non-matching ETag constraints,
     * but not with any other type of constraint.
     * </p>
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     * </p>
     *
     * @param date
     *            The modified constraint that restricts this request to
     *            executing only if the source object <b>has</b> been modified
     *            after the specified date.
     */
    public void setModifiedSinceConstraint(Date date) {
        this.modifiedSinceConstraint = date;
    }

    /**
     * <p>
     * Sets the optional modified constraint that restricts this request to
     * executing only if the source object <b>has</b> been modified after the
     * specified date. Returns this object, enabling additional method calls to
     * be chained together.
     * </p>
     * <p>
     * The modified constraint may be used with non-matching ETag constraints,
     * but not with any other type of constraint.
     * </p>
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     * </p>
     *
     * @param date
     *            The modified constraint that restricts this request to
     *            executing only if the source object <b>has</b> been modified
     *            after the specified date.
     * @return This <code>CopyPartRequest</code>, enabling additional method
     *         calls to be chained together.
     */
    public CopyPartRequest withModifiedSinceConstraint(Date date) {
        setModifiedSinceConstraint(date);
        return this;
    }

    /**
     * Returns the optional customer-provided server-side encryption key to use
     * to decrypt the source object part being copied.
     *
     * @return The optional customer-provided server-side encryption key to use
     *         to decrypt the source object part being copied.
     */
    public SSECustomerKey getSourceSSECustomerKey() {
        return sourceSSECustomerKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * decrypt the source object part being copied.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to decrypt the source object part being copied.
     */
    public void setSourceSSECustomerKey(SSECustomerKey sseKey) {
        this.sourceSSECustomerKey = sseKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * decrypt the source object part being copied, and returns the updated
     * request object so that additional method calls can be chained together.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to decrypt the source object part being copied.
     *
     * @return This updated request object so that additional method calls can
     *         be chained together.
     */
    public CopyPartRequest withSourceSSECustomerKey(SSECustomerKey sseKey) {
        setSourceSSECustomerKey(sseKey);
        return this;
    }

    /**
     * Returns the optional customer-provided server-side encryption key to use
     * to encrypt the source object part being copied.
     *
     * @return The optional customer-provided server-side encryption key to use
     *         to encrypt the source object part being copied.
     */
    public SSECustomerKey getDestinationSSECustomerKey() {
        return destinationSSECustomerKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * encrypt the source object part being copied.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to encrypt the source object part being copied.
     */
    public void setDestinationSSECustomerKey(SSECustomerKey sseKey) {
        this.destinationSSECustomerKey = sseKey;
    }

    /**
     * Returns the optional customer-provided server-side encryption key to use
     * to encrypt the source object part being copied, and returns the updated
     * request object so that additional method calls can be chained together.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to encrypt the source object part being copied.
     *
     * @return This updated request object so that additional method calls can
     *         be chained together.
     */
    public CopyPartRequest withDestinationSSECustomerKey(SSECustomerKey sseKey) {
        setDestinationSSECustomerKey(sseKey);
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
     * updated PutObjectRequest object so that additional method calls can be
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
     * @return The updated PutObjectRequest object.
     */
    public CopyPartRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

}
