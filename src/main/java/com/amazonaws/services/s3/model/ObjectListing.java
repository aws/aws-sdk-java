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
import java.util.List;

import com.amazonaws.services.s3.AmazonS3;

/**
 * Contains the results of listing the objects in an Amazon S3 bucket, including
 * a list of {@link S3ObjectSummary} objects describing the objects stored in
 * the bucket, a list of common prefixes (if a delimiter was specified in the
 * request), as well as information describing if this is a complete or partial
 * listing and the the original request parameters.
 * 
 * @see AmazonS3#listObjects(String, String)
 * @see AmazonS3#listObjects(ListObjectsRequest)
 * @see AmazonS3#listNextBatchOfObjects(ObjectListing)
 */
public class ObjectListing {
    
    /** A list of summary information describing the objects stored in the bucket */
    private List<S3ObjectSummary> objectSummaries = new ArrayList<S3ObjectSummary>();

    /**
     * A list of the common prefixes included in this object listing - common
     * prefixes will only be populated for requests that specified a delimiter
     */
    private List<String> commonPrefixes = new ArrayList<String>();
    
    /** The name of the Amazon S3 bucket containing the listed objects */
    private String bucketName;

    /**
     * The marker to use in order to request the next page of results - only
     * populated if the isTruncated member indicates that this object listing is
     * truncated
     */
    private String nextMarker;
    
    /**
     * Indicates if this is a complete listing, or if the caller needs to make
     * additional requests to Amazon S3 to see the full object listing for an S3
     * bucket
     */
    private boolean isTruncated;
    
    
    /* Original Request Parameters */

    /**
     * The prefix parameter originally specified by the caller when this object
     * listing was returned
     */
    private String prefix;
    
    /**
     * The marker parameter originally specified by the caller when this object
     * listing was returned
     */
    private String marker;
    
    /**
     * The maxKeys parameter originally specified by the caller when this object
     * listing was returned
     */
    private int maxKeys;
    
    /**
     * The delimiter parameter originally specified by the caller when this
     * object listing was returned
     */
    private String delimiter;

    /**
     * Returns the list of object summaries describing the objects stored in the
     * S3 bucket. Callers should remember that listings for large buckets can be
     * truncated for performance reasons, so callers might need to make
     * additional calls to
     * {@link AmazonS3#listNextBatchOfObjects(ObjectListing)} to get
     * additional results. Callers should always check the
     * {@link #isTruncated()} method to determine if a listing is truncated or
     * not.
     * 
     * @return A list of the object summaries describing the objects stored in
     *         the S3 bucket.
     */
    public List<S3ObjectSummary> getObjectSummaries() {
        return objectSummaries;
    }

    /**
     * Returns the common prefixes included in this object listing. Common
     * prefixes are only present if a delimiter was specified in the original
     * request.
     * <p>
     * Each common prefix represents a set of keys in the S3 bucket that have
     * been condensed and omitted from the object summary results. This allows
     * applications to organize and browse their keys hierarchically, much like
     * how you would organize your files into directories in a file system.
     * <p>
     * For example, consider a bucket that contains the keys:
     * <ul>
     * <li>"foo/bar/baz"</li>
     * <li>"foo/bar/bash"</li>
     * <li>"foo/bar/bang"</li>
     * <li>"foo/boo"</li>
     * </ul>
     * If you call listObjects with prefix="foo/" and delimiter="/" on this
     * bucket, the returned S3ObjectListing will contain one entry in the common
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
     * Not intended for direct use by callers. Sets the common prefixes for this
     * object listing, representing the key prefixes that were rolled up because
     * of the request's delimiter parameter.
     * 
     * @param commonPrefixes
     *            The common prefixes for this object listing.
     */
    public void setCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
    }

    /**
     * For truncated object listings (see {@link ObjectListing#isTruncated()})
     * returns the marker to use in the next listObjects request in order to see
     * the next page of results. If an object listing is not truncated, this
     * method will return null since there is no need for a next marker. For
     * truncated requests, this value is equal to the greatest
     * (lexicographically) value of the object keys and common prefixes included
     * in this listing.
     * 
     * @return The marker to use in the next listObjects request in order to see
     *         the next page of results if this object listing is truncated,
     *         otherwise null if this object listing isn't truncated.
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * Not intended for direct use by callers. Sets the marker to use in the
     * next listObjects request in order to see the next page of results for a
     * truncated object listing.
     * 
     * @param nextMarker
     *            The marker to use in the next listObjects request in order to
     *            see the next page of results for a truncated object listing.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * Returns the name of the Amazon S3 bucket containing the objects listed in
     * this S3ObjectListing.
     * 
     * @return The name of the Amazon S3 bucket containing the objects listed in
     *         this S3ObjectListing.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Not intended for direct use by callers. Sets the name of the Amazon S3
     * bucket containing the objects listed in this S3ObjectListing.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the objects listed
     *            in this S3ObjectListing.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The prefix parameter originally used to request this object listing, or
     * null if no prefix was specified. All objects and common prefixes included
     * in this object listing start with the specified prefix.
     * 
     * @return The prefix parameter originally used to request this object
     *         listing, or null if no prefix was specified.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Not intended for direct use by callers. Sets the prefix parameter
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
     * The marker parameter originally used to request this object listing, or
     * null if no marker was specified. If specified, all objects and common
     * prefixes included in this object listing will occur lexically
     * (alphabetically) after the specified marker.
     * 
     * @return The marker parameter originally used to request this object
     *         listing, or null if no marker was specified.
     */
    public String getMarker() {
        return marker;
    }

    /**
     * Not intended for direct use by callers. Sets the marker parameter
     * originally used to request this object listing.
     * 
     * @param marker
     *            The marker parameter originally used to request this object
     *            listing.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * Returns the maxKeys parameter originally used to request this object
     * listing, or the default maxKeys value provided by Amazon S3 if the
     * requester didn't specify a value. The maxKeys parameter limits the
     * combined number of objects and common prefixes included in this object
     * listing. An object listing will never contain more objects plus common
     * prefixes than indicated by the maxKeys, but can of course contain less.
     * 
     * @return The maxKeys parameter originally used to request this object
     *         listing, or the default maxKeys value applied by Amazon S3 if
     *         the requester didn't specify a value.
     */
    public int getMaxKeys() {
        return maxKeys;
    }

    /**
     * Not intended for direct use by callers. Sets the maxKeys parameter
     * originally used to request this object listing, or the default maxKeys
     * applied by Amazon S3 if the requester didn't specify a value.
     * 
     * @param maxKeys
     *            he maxKeys parameter originally used to request this object
     *            listing, or the default maxKeys value applied by Amazon S3 if
     *            the requester didn't specify a value.
     */
    public void setMaxKeys(int maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * Returns the delimiter parameter originally used to request this object
     * listing, or null if none was specified. The delimiter value allows
     * callers to condense S3 keys into common prefix listings. For example, if
     * a caller specifies a delimiter of "/" (a common used value for
     * delimiter), then any keys that contain a common prefix between the start
     * of the key and the first occurrence of "/" will not be included in the
     * list of object summaries, but instead, the common prefixes list will have
     * one entry for the common prefix.
     * 
     * @return The delimiter parameter originally used to request this object
     *         listing, or null if none was specified.
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Not intended for direct use by callers. Sets the delimiter parameter
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
     * Returns true if this object listing is <b>not complete</b> and indicates
     * that the caller needs to make additional calls to Amazon S3 to get more
     * results.
     * 
     * @return True if this object listing is <b>not complete</b> and indicates
     *         that the caller needs to make additional calls to Amazon S3 to
     *         get additional object summaries or common prefixes.
     */
    public boolean isTruncated() {
        return isTruncated;
    }

    /**
     * Not intended for direct use by callers. Sets the truncated property for
     * this object listing, indicating if this is a complete listing or not and
     * whether the caller needs to make additional calls to S3 to get more
     * object summaries.
     * 
     * @param isTruncated
     *            True if this object listing is <b>not complete</b> and the
     *            caller needs to make additional S3 calls to get additional
     *            object summaries or common prefixes.
     */
    public void setTruncated(boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

}
