/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Results of a listing of objects from an S3 bucket.
 */
public class ListObjectsV2Result implements Serializable {

    /** A list of summary information describing the objects stored in the bucket */
    private List<S3ObjectSummary> objectSummaries = new ArrayList<S3ObjectSummary>();

    /**
     * A list of the common prefixes included in this object listing - common
     * prefixes will only be populated for requests that specified a delimiter
     */
    private List<String> commonPrefixes = new ArrayList<String>();

    /**
     * Indicates if this is a complete listing, or if the caller needs to make
     * additional requests to Amazon S3 to see the full object listing for an S3
     * bucket
     */
    private boolean isTruncated;

    /** The name of the Amazon S3 bucket containing the listed objects */
    private String bucketName;

    /** KeyCount is the number of keys returned with this response */
    private int keyCount;

    /**
     * NextContinuationToken is sent when isTruncated is true meaning there are
     * more keys in the bucket that can be listed. The next list requests to Amazon
     * S3 can be continued by providing this NextContinuationToken.
     */
    private String nextContinuationToken;

    /* Original Request Parameters */

    /**
     * The prefix parameter originally specified by the caller when this object
     * listing was returned
     */
    private String prefix;

    /**
     * The delimiter parameter originally specified by the caller when this
     * object listing was returned
     */
    private String delimiter;

    /**
     * The maxKeys parameter originally specified by the caller when this object
     * listing was returned
     */
    private int maxKeys;

    /**
     * The encodingType parameter originally specified by the caller when this
     * object listing was returned.
     */
    private String encodingType;

    /**
     * Optional parameter which allows list to be continued from a specific point.
     * ContinuationToken is provided in truncated list results.
     */
    private String continuationToken;

    /**
     * Optional parameter indicating where you want Amazon S3 to start the object listing
     * from.  This can be any key in the bucket.
     */
    private String startAfter;

    /**
     * Gets whether or not this object listing is complete.
     *
     * @return The value <code>true</code> if the object listing is <b>not complete</b>.
     *         Returns the value <code>false</code> if otherwise.
     *         When returning <code>true</code>,
     *         additional calls to Amazon S3 may be needed in order to
     *         obtain more results.
     */
    public boolean isTruncated() {
        return isTruncated;
    }

    /**
     * For internal use only.  Sets the truncated property for
     * this object listing, indicating if this is a complete listing or not and
     * whether the caller needs to make additional calls to S3 to get more
     * object summaries.
     *
     * @param isTruncated
     *            The value <code>true</code> if the object listing is <b>not complete</b>.
     *            The value <code>false</code> if otherwise.
     */
    public void setTruncated(boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * Gets the name of the Amazon S3 bucket containing the objects listed in
     * this {@link ListObjectsV2Result}.
     *
     * @return The name of the Amazon S3 bucket containing the objects listed in
     *         this {@link ListObjectsV2Result}.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * For internal use only.
     * Sets the name of the Amazon S3
     * bucket containing the objects listed in this {@link ListObjectsV2Result}.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the objects listed
     *            in this {@link ListObjectsV2Result}.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Gets the prefix parameter originally used to request this object listing, or
     * <code>null</code> if no prefix was specified.
     * All objects and common prefixes included
     * in this object listing start with the specified prefix.
     *
     * @return The prefix parameter originally used to request this object
     *         listing. Returns <code>null</code> if no prefix was specified.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * For internal use only.
     * Sets the prefix parameter
     * originally used to request this object listing.
     *
     * @param prefix
     *            The prefix parameter originally used to request this object
     *            listing.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Gets the delimiter parameter originally used to request this object
     * listing, or <code>null</code> if no delimiter specified.
     * <p>
     * The delimiter value allows
     * callers to condense S3 keys into common prefix listings. For example, if
     * a caller specifies a delimiter of "/" (a common used value for
     * delimiter), any keys that contain a common prefix between the start
     * of the key and the first occurrence of "/" will not be included in the
     * list of object summaries. Instead, the common prefixes list will have
     * one entry for the common prefix.
     * </p>
     *
     * @return The delimiter parameter originally used to request this object
     *         listing. Returns <code>null</code> if no delimiter was specified.
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * For internal use only. Sets the delimiter parameter
     * originally used to request this object listing.
     *
     * @param delimiter
     *            The delimiter parameter originally used to request this object
     *            listing.
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Gets the encoding type used by Amazon S3 to encode object key names in
     * the XML response. If you specify <code>encodingType</code> request
     * parameter, Amazon S3 includes this element in the response, and returns
     * encoded key name values in the following response elements:
     * <code>Delimiter, Marker, Prefix,
     * NextMarker, Key</code>.
     *
     * @return <code>Null</code> if <code>encodingType</code> is not specified
     *         in the request parameter.
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * For internal use only. Sets the encoding type used by Amazon S3 to encode
     * object key names in the XML response.
     *
     * @param encodingType
     *            <code>Null</code> if <code>encodingType</code> is not
     *            specified in the request parameter.
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * Gets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     *
     * @return The optional continuation token associated with this request.
     */
    public String getContinuationToken() { return continuationToken; }

    /**
     * Sets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     *
     * @param continuationToken
     *                     The optional continuation token to associate with this request.
     */
    public void setContinuationToken(String continuationToken) { this.continuationToken = continuationToken; }

    /**
     * Gets the optional NextContinuationToken.
     * NextContinuationToken is sent when isTruncated is true meaning there are
     * more keys in the bucket that can be listed. The next list requests to Amazon
     * S3 can be continued by providing this NextContinuationToken.
     *
    * @return The optional NextContinuationToken parameter.
     */
    public String getNextContinuationToken() { return nextContinuationToken; }

    /**
     * Sets the optional NextContinuationToken.
     * NextContinuationToken is sent when isTruncated is true meaning there are
     * more keys in the bucket that can be listed. The next list requests to Amazon
     * S3 can be continued by providing this NextContinuationToken.
     *
     * @param nextContinuationToken
     *              The optional NextContinuationToken parameter to associate with this request.
     *
     * @return The optional NextContinuationToken parameter.
     */
    public void setNextContinuationToken(String nextContinuationToken) { this.nextContinuationToken = nextContinuationToken; }

    /**
     * Gets the number of keys returned with this response.
     *
     * @return number of keys returned with this response.
     */
    public int getKeyCount() { return keyCount; }

    /**
     * Sets the number of keys returned with this response.
     *
     * @param keyCount
     *           The number of keys that were returned with this response.
     */
    public void setKeyCount(int keyCount) { this.keyCount = keyCount; }

    /**
     * Gets the optional <code>maxKeys</code> parameter indicating the maximum number of keys to
     * include in the response. Amazon S3 might return fewer keys than specified, but will
     * never return more. Even if the optional parameter is not specified,
     * Amazon S3 will limit the number of results in the response.
     *
     * @return The optional parameter indicating the maximum number of keys to
     *         include in the response.
     */
    public int getMaxKeys() { return maxKeys; }

    /**
     * Sets the optional <code>maxKeys</code> parameter indicating the maximum number of keys to
     * include in the response.
     *
     * @param maxKeys
     *            The optional parameter indicating the maximum number of keys
     *            to include in the response.
     */
    public void setMaxKeys(int maxKeys) { this.maxKeys = maxKeys; }

    /**
     * Returns optional parameter indicating where you want Amazon S3 to start the object
     * listing from.  This can be any key in the bucket.
     *
     * @return the optional startAfter parameter
     */
    public String getStartAfter() { return startAfter; }

    /**
     * Sets the optional parameter indicating where you want Amazon S3 to start the object
     * listing from.  This can be any key in the bucket.
     *
     * @param startAfter
     *                The optional startAfter parameter.  This can be any key in the bucket.
     */
    public void setStartAfter(String startAfter) { this.startAfter = startAfter; }

    /**
     * Gets the list of object summaries describing the objects stored in the
     * S3 bucket. Listings for large buckets can be
     * truncated for performance reasons.  Always check the
     * {@link ListObjectsV2Result#isTruncated()} method to see if the returned
     * listing is complete or if additional calls are needed to get
     * more results. Callers can pass the nextContinuationToken into subsequent
     * requests to get additional results.
     *
     * @return A list of the object summaries describing the objects stored in
     *         the S3 bucket.
     */
    public List<S3ObjectSummary> getObjectSummaries() {
        return objectSummaries;
    }

    /**
     * <p>
     * Gets the common prefixes included in this object listing. Common
     * prefixes are only present if a delimiter was specified in the original
     * request.
     * </p>
     * <p>
     * Each common prefix represents a set of keys in the S3 bucket that have
     * been condensed and omitted from the object summary results. This allows
     * applications to organize and browse their keys hierarchically,
     * similar to how a file system organizes files
     * into directories.
     * </p>
     * <p>
     * For example, consider a bucket that contains the following keys:
     * <ul>
     *  <li>"foo/bar/baz"</li>
     *  <li>"foo/bar/bash"</li>
     *  <li>"foo/bar/bang"</li>
     *  <li>"foo/boo"</li>
     * </ul>
     * If calling <code>listObjects</code> with the prefix="foo/" and the delimiter="/" on
     * this bucket, the returned <code>S3ObjectListing</code>
     * will contain one entry in the common
     * prefixes list ("foo/bar/") and none of the keys beginning with that
     * common prefix will be included in the object summaries list.
     *
     * @return The list of common prefixes included in this object listing,
     *         which might be an empty list if no common prefixes were found.
     */
    public List<String> getCommonPrefixes() {
        return commonPrefixes;
    }

    /**
     * For internal use only. Sets the common prefixes for this
     * object listing, representing the key prefixes that were rolled up because
     * of the request's delimiter parameter.
     *
     * @param commonPrefixes
     *            The common prefixes for this object listing.
     */
    public void setCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
    }

}
