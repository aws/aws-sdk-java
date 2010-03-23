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
 * Options for downloading an S3 object.
 * <p>
 * All GetObjectRequests must specify a bucket name and key. Beyond that,
 * requests can also specify:
 * <ul>
 * <li>The range of bytes within the object to download
 * <li>Constraints controlling if the object will be downloaded or not
 * </ul>
 */
public class GetObjectRequest extends AmazonWebServiceRequest {

    /** The name of the bucket containing the object to retrieve */
    private String bucketName;

    /** The key under which the desired object is stored */
    private String key;

    /**
     * Optional version ID specifying which version of the object to download.
     * If not specified, the most recent version will be downloaded.
     * <p>
     * See
     * {@link AmazonS3#setBucketVersioningConfiguration(String, S3BucketVersioningConfiguration)}
     * for more information about enabling versioning for a bucket.
     */
    private String versionId;

    /** Optional member indicating the byte range of data to retrieve */
    private long[] range;

    /**
     * Optional list of ETag values that constrain this request to only be
     * executed if the object's ETag matches one of the specified ETag values.
     */
    private List<String> matchingETagConstraints = new ArrayList<String>();

    /**
     * Optional list of ETag values that constrain this request to only be
     * executed if the object's ETag does not match any of the specified ETag
     * constraint values.
     */
    private List<String> nonmatchingEtagConstraints = new ArrayList<String>();

    /**
     * Optional field that constrains this request to only be executed if the
     * object has not been modified since the specified date.
     */
    private Date unmodifiedSinceConstraint;

    /**
     * Optional field that constrains this request to only be executed if the
     * object has been modified since the specified date.
     */
    private Date modifiedSinceConstraint;


    /**
     * Constructs a new GetObjectRequest with all the required parameters.
     *
     * @param bucketName
     *            The name of the bucket containing the desired object.
     * @param key
     *            The key in the specified bucket under which the object is
     *            stored.
     */
    public GetObjectRequest(String bucketName, String key) {
        this(bucketName, key, null);
    }

    /**
     * Constructs a new GetObjectRequest with all the required parameters.
     *
     * @param bucketName
     *            The name of the bucket containing the desired object.
     * @param key
     *            The key in the specified bucket under which the object is
     *            stored.
     * @param versionId
     *            The Amazon S3 version ID specifying a specific version of the
     *            object to download.
     */
    public GetObjectRequest(String bucketName, String key, String versionId) {
        setBucketName(bucketName);
        setKey(key);
        setVersionId(versionId);
    }

    /**
     * Returns the name of the bucket containing the object to be downloaded.
     *
     * @return The name of the bucket containing the object to be downloaded.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the object to be downloaded.
     *
     * @param bucketName
     *            The name of the bucket containing the object to be downloaded.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket containing the object to be downloaded, and
     * returns this object so that additional method calls can be chained
     * together.
     *
     * @param bucketName
     *            The name of the bucket containing the object to be downloaded.
     *
     * @return This updated GetObjectRequest, so that additional method calls
     *         can be chained together.
     */
    public GetObjectRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the key under which the object to be downloaded is stored.
     *
     * @return The key under which the object to be downloaded is stored.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key under which the object to be downloaded is stored.
     *
     * @param key
     *            The key under which the object to be downloaded is stored.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key under which the object to be downloaded is stored, and
     * returns this object so that additional method calls can be chained
     * together.
     *
     * @param key
     *            The key under which the object to be downloaded is stored.
     *
     * @return This updated GetObjectRequest, so that additional method calls
     *         can be chained together.
     */
    public GetObjectRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * Returns the optional version ID specifying which version of the object to
     * download. If not specified, the most recent version will be downloaded.
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
     * @return The optional version ID specifying which version of the object to
     *         download. If not specified, the most recent version will be
     *         downloaded.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the optional version ID specifying which version of the object to
     * download. If not specified, the most recent version will be downloaded.
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
     * @param versionId
     *            The optional version ID specifying which version of the object
     *            to download.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Sets the optional version ID specifying which version of the object to
     * download, and returns this object so that additional method calls can be
     * chained together. If not specified, the most recent version will be
     * downloaded.
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
     * @param versionId
     *            The optional version ID specifying which version of the object
     *            to download.
     */
    public GetObjectRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }


    /*
     * Optional Request Parameters
     */

    /**
     * Returns the optional byte range (inclusive) within the desired object
     * that will be downloaded by this request. The range is returned as
     * a two element array containing the start and end index of the byte range.
     * If no byte range has been specified (and therefore, the entire object
     * will be downloaded by this request), null is returned.
     *
     * @return A two element array indicating the start index and end index
     *         (inclusive) within the object being downloaded by this request,
     *         or null if no range has been specified, and the whole object is
     *         to be downloaded.
     */
    public long[] getRange() {
        return range;
    }

    /**
     * Sets the optional byte range (inclusive) within the desired object that
     * will be downloaded by this request. The first byte in an object has
     * position 0, so, for example, the first ten bytes of an object can be
     * downloaded by specifying a range of 0 to 9.
     * <p>
     * If no byte range is specified, this request will download the entire
     * object from S3.
     *
     * @param start
     *            The start of the byte range to download (inclusive).
     * @param end
     *            The end of the byte range to download (inclusive).
     */
    public void setRange(long start, long end) {
        range = new long[] {start, end};
    }

    /**
     * Sets the optional byte range (inclusive) within the desired object that
     * will be downloaded by this request, and this returns this request object
     * so that additional method calls can be chained together. The first byte
     * in an object has position 0, so, for example, the first ten bytes of an
     * object can be downloaded by specifying a range of 0 to 9.
     * <p>
     * If no byte range is specified, this request will download the entire
     * object from S3.
     *
     * @param start
     *            The start of the byte range to download (inclusive).
     * @param end
     *            The end of the byte range to download (inclusive).
     *
     * @return This updated object, after setting the byte range for this
     *         request, so that additional method calls can be chained together.
     */
    public GetObjectRequest withRange(long start, long end) {
        setRange(start, end);
        return this;
    }

    /**
     * Returns the optional list of ETag constraints that, when present, <b>must
     * include a match</b> for the object's current ETag in order for this
     * request to be executed. Only one ETag in the list needs to match for this
     * request to be executed by Amazon S3.
     *
     * @return The optional list of ETag constraints that, when present, must
     *         include a match for the object's current ETag in order for this
     *         request to be executed.
     */
    public List<String> getMatchingETagConstraints() {
        return matchingETagConstraints;
    }

    /**
     * Sets the optional list of ETag constraints that, when present, <b>must
     * include a match</b> for the object's current ETag in order for this
     * request to be executed. If none of the specified ETags match the object's
     * current ETag, the this request will not be executed. Only one ETag in the
     * list needs to match for the request to be executed by Amazon S3.
     *
     * @param eTagList
     *            The optional list of ETag constraints that must include a
     *            match for the object's current ETag in order for this request
     *            to be executed.
     */
    public void setMatchingETagConstraints(List<String> eTagList) {
        this.matchingETagConstraints = eTagList;
    }

    /**
     * Adds an single ETag constraint to this request, and returns this object
     * so that additional method calls can be chained together. Multiple ETag
     * constraints can be added to a request, but one must match the object's
     * current ETag in order for this request to be executed. If none of the
     * ETag constraints added to this request match the object's current ETag,
     * this request will not be executed by Amazon S3.
     *
     * @param eTag
     *            The matching ETag constraint to add to this request.
     *
     * @return This GetObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public GetObjectRequest withMatchingETagConstraint(String eTag) {
        this.matchingETagConstraints.add(eTag);
        return this;
    }

    /**
     * Returns the optional list of ETag constraints that, when present, <b>must
     * not include a match</b> for the object's current ETag in order for this
     * request to be executed. If any entry in the non-matching ETag constraint
     * list matches the object's current ETag, this request <b>will not</b> be
     * executed by Amazon S3.
     *
     * @return The optional list of ETag constraints that, when present, <b>must
     *         not include a match</b> for the object's current ETag in order
     *         for this request to be executed.
     */
    public List<String> getNonmatchingETagConstraints() {
        return nonmatchingEtagConstraints;
    }

    /**
     * Sets the optional list of ETag constraints that, when present, <b>must
     * not include a match</b> for the object's current ETag in order for this
     * request to be executed. If any entry in the non-matching ETag constraint
     * list matches the object's current ETag, this request <b>will not</b> be
     * executed by Amazon S3.
     *
     * @param eTagList
     *            The list of ETag constraints that, when present, <b>must not
     *            include a match</b> for the object's current ETag in order for
     *            this request to be executed.
     */
    public void setNonmatchingETagConstraints(List<String> eTagList) {
        this.nonmatchingEtagConstraints = eTagList;
    }

    /**
     * Adds a single ETag constraint to this request, and returns this object so
     * that additional method calls can be chained together. Multiple ETag
     * constraints can be added to a request, but all ETag constraints <b>must
     * not</b> match the object's current ETag in order for this request to be
     * executed. If any entry in the non-matching ETag constraint list matches
     * the object's current ETag, this request <b>will not</b> be executed by
     * Amazon S3.
     *
     * @param eTag
     *            The non-matching ETag constraint to add to this request.
     *
     * @return This GetObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public GetObjectRequest withNonmatchingETagConstraint(String eTag) {
        this.nonmatchingEtagConstraints.add(eTag);
        return this;
    }

    /**
     * Returns the optional unmodified since constraint that restricts this
     * request to executing <b>only if</b> the object has <b>not</b> been
     * modified since the specified date.
     *
     * @return The optional unmodified since constraint that restricts this
     *         request to executing <b>only if</b> the object has not
     *         been modified since the specified date.
     */
    public Date getUnmodifiedSinceConstraint() {
        return unmodifiedSinceConstraint;
    }

    /**
     * Sets the optional unmodified since constraint that restricts this request
     * to executing <b>only if</b> the object has <b>not</b> been modified since
     * the specified date.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The unmodified since constraint that restricts this request to
     *            executing <b>only if</b> the object has <b>not</b> been
     *            modified since this date.
     */
    public void setUnmodifiedSinceConstraint(Date date) {
        this.unmodifiedSinceConstraint = date;
    }

    /**
     * Sets the optional unmodified since constraint that restricts this request
     * to executing <b>only if</b> the object has <b>not</b> been modified since
     * the specified date, and returns this object so that additional method
     * calls can be chained together.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The unmodified since constraint that restricts this request to
     *            executing <b>only if</b> the object has <b>not</b> been
     *            modified since this date.
     *
     * @return This GetObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public GetObjectRequest withUnmodifiedSinceConstraint(Date date) {
        setUnmodifiedSinceConstraint(date);
        return this;
    }

    /**
     * Returns the optional modified since constraint that restricts this
     * request to executing <b>only if</b> the object <b>has</b> been
     * modified since the specified date.
     *
     * @return The optional modified since constraint that restricts this
     *         request to executing <b>only if</b> the object <b>has</b>
     *         been modified since the specified date.
     */
    public Date getModifiedSinceConstraint() {
        return modifiedSinceConstraint;
    }

    /**
     * Sets the optional modified since constraint that restricts this request
     * to executing <b>only if</b> the object <b>has</b> been modified since the
     * specified date.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The modified since constraint that restricts this request to
     *            executing <b>only if</b> the object <b>has</b> been modified
     *            since the specified date.
     */
    public void setModifiedSinceConstraint(Date date) {
        this.modifiedSinceConstraint = date;
    }

    /**
     * Sets the optional modified since constraint that restricts this request
     * to executing <b>only if</b> the object <b>has</b> been modified since the
     * specified date.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The modified since constraint that restricts this request to
     *            executing <b>only if</b> the object <b>has</b> been modified
     *            since the specified date.
     *
     * @return This GetObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public GetObjectRequest withModifiedSinceConstraint(Date date) {
        setModifiedSinceConstraint(date);
        return this;
    }

}
