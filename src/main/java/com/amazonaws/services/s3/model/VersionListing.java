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
 * Contains the results of listing the versions in an Amazon S3 bucket,
 * including a list of {@link S3VersionSummary} objects describing each version,
 * information describing if this is a complete or partial listing, and the
 * original request parameters.
 * 
 * @see AmazonS3#listVersions(String, String)
 * @see AmazonS3#listVersions(ListVersionsRequest)
 * @see AmazonS3#listNextBatchOfVersions(VersionListing)
 */
public class VersionListing {

    /** A list of summary information describing the versions stored in the bucket */
    private List<S3VersionSummary> versionSummaries;

    /**
     * A list of the common prefixes included in this version listing - common
     * prefixes will only be populated for requests that specified a delimiter
     */
    private List<String> commonPrefixes = new ArrayList<String>();
    
    /** The name of the Amazon S3 bucket containing the listed versions */
    private String bucketName;

    /**
     * The key marker to use in order to request the next page of results - only
     * populated if the isTruncated member indicates that this version listing
     * is truncated
     */
    private String nextKeyMarker;

    /**
     * The version ID marker to use in order to request the next page of results
     * - only populated if the isTruncated member indicates that this version
     * listing is truncated
     */
    private String nextVersionIdMarker;

    /**
     * Indicates if this is a complete listing, or if the caller needs to make
     * additional requests to Amazon S3 to see the full object listing for an S3
     * bucket
     */
    private boolean isTruncated;

    
    /* Original Request Parameters */

    /**
     * The prefix parameter originally specified by the caller when this version
     * listing was returned
     */
    private String prefix;

    /**
     * The key marker parameter originally specified by the caller when this
     * version listing was returned
     */
    private String keyMarker;

    /**
     * The version ID marker parameter originally specified by the caller when
     * this version listing was returned
     */
    private String versionIdMarker;

    /**
     * The maxKeys parameter originally specified by the caller when this
     * version listing was returned
     */
    private int maxKeys;

    /**
     * The delimiter parameter originally specified by the caller when this
     * version listing was returned
     */
    private String delimiter;

    /**
     * Returns the list of version summaries describing the versions stored in
     * the associated S3 bucket. Callers should remember that listings for large
     * buckets can be truncated for performance reasons, so callers might need
     * to make additional calls to
     * {@link AmazonS3#listVersions(ListVersionsRequest)} to get additional
     * results. Callers should always check the {@link #isTruncated()} method to
     * determine if a listing is truncated or not.
     * 
     * @return A list of the version summaries describing the versions stored in
     *         the associated S3 bucket.
     */
    public List<S3VersionSummary> getVersionSummaries() { 
        return this.versionSummaries; 
    }

    /**
     * Not intended for direct use by callers. Sets the list of version
     * summaries describing the versions stored in the associated S3 bucket.
     * 
     * @param versionSummaries
     *            The version summaries describing the versions stored in the
     *            associated S3 bucket.
     */
    public void setVersionSummaries(List<S3VersionSummary> versionSummaries) { 
        this.versionSummaries = versionSummaries; 
    }

    /**
     * Returns the common prefixes included in this version listing. Common
     * prefixes are only present if a delimiter was specified in the original
     * request.
     * <p>
     * Each common prefix represents a set of keys in the S3 bucket that have
     * been condensed and omitted from the version summary results. This allows
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
     * If you call listVersions with prefix="foo/" and delimiter="/" on this
     * bucket, the returned S3VersionListing will contain one entry in the
     * common prefixes list ("foo/bar/") and none of the keys beginning with
     * that common prefix will be included in the version summaries list.
     * 
     * @return The list of common prefixes included in this version listing,
     *         which might be an empty list if no common prefixes were found.
     */
    public List<String> getCommonPrefixes() {
        return commonPrefixes;
    }

    /**
     * Not intended for direct use by callers. Sets the common prefixes for this
     * version listing, representing the key prefixes that were rolled up
     * because of the request's delimiter parameter.
     * 
     * @param commonPrefixes
     *            The common prefixes for this version listing.
     */
    public void setCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
    }

    /**
     * Returns the name of the Amazon S3 bucket containing the versions listed
     * in this S3VersionListing.
     * 
     * @return The name of the Amazon S3 bucket containing the versions listed
     *         in this S3VersionListing.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Not intended for direct use by callers. Sets the name of the Amazon S3
     * bucket containing the versions listed in this S3VersionListing.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the versions
     *            listed in this S3VersionListing.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The prefix parameter originally used to request this version listing, or
     * null if no prefix was specified. All object keys included in this version
     * listing start with the specified prefix.
     * 
     * @return The prefix parameter originally used to request this version
     *         listing, or null if no prefix was specified.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Not intended for direct use by callers. Sets the prefix parameter
     * originally used to request this version listing.
     * 
     * @param prefix
     *            The prefix parameter originally used to request this version
     *            listing.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * The key marker parameter originally used to request this version listing,
     * or null if no key marker was specified. If specified, all object keys
     * included in this version listing will occur lexically (alphabetically)
     * after the specified key marker.
     * 
     * @return The key marker parameter originally used to request this version
     *         listing, or null if no key marker was specified.
     */
    public String getKeyMarker() { 
        return keyMarker; 
    }

    /**
     * Not intended for direct use by callers. Sets the key marker parameter
     * originally used to request this version listing.
     * 
     * @param keyMarker
     *            The key marker parameter originally used to request this
     *            version listing.
     */
    public void setKeyMarker(String keyMarker) { 
        this.keyMarker = keyMarker; 
    }

    /**
     * The version ID marker parameter originally used to request this version
     * listing, or null if no version ID marker was specified.
     * 
     * @return The version ID marker parameter originally used to request this
     *         version listing, or null if no version ID marker was specified.
     */
    public String getVersionIdMarker() {
        return versionIdMarker; 
    }

    /**
     * Not intended for direct use by callers. Sets the version ID marker
     * parameter originally used to request this version listing.
     * 
     * @param versionIdMarker
     *            The version ID marker parameter originally used to request
     *            this version listing.
     */
    public void setVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
    }

    /**
     * Returns the maxKeys parameter originally used to request this version
     * listing, or the default maxKeys value provided by Amazon S3 if the
     * requester didn't specify a value. The maxKeys parameter limits the number
     * of versions included in this version listing. A version listing will
     * never contain more versions than indicated by the maxKeys, but can of
     * course contain less.
     * 
     * @return The maxKeys parameter originally used to request this version
     *         listing, or the default maxKeys value applied by Amazon S3 if the
     *         requester didn't specify a value.
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
     *            The maxKeys parameter originally used to request this version
     *            listing, or the default maxKeys value applied by Amazon S3 if
     *            the requester didn't specify a value.
     */
    public void setMaxKeys(int maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * Returns the delimiter parameter originally used to request this version
     * listing, or null if none was specified. The delimiter value allows
     * callers to condense S3 keys into common prefix listings. For example, if
     * a caller specifies a delimiter of "/" (a common used value for
     * delimiter), then any keys that contain a common prefix between the start
     * of the key and the first occurrence of "/" will not be included in the
     * list of object summaries, but instead, the common prefixes list will have
     * one entry for the common prefix.
     * 
     * @return The delimiter parameter originally used to request this version
     *         listing, or null if none was specified.
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Not intended for direct use by callers. Sets the delimiter parameter
     * originally used to request this version listing.
     * 
     * @param delimiter
     *            The delimiter parameter originally used to request this
     *            version listing.
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * For truncated version listings (see
     * {@link VersionListing#isTruncated()}) returns the key marker to use in
     * the next listVersions request in order to see the next page of results.
     * If a version listing is not truncated, this method will return null
     * since there is no need for a next key marker. For truncated requests,
     * this value is equal to the greatest (lexicographically) value of the
     * object keys included in this listing.
     * 
     * @return The key marker to use in the next listVersions request in order
     *         to see the next page of results if this version listing is
     *         truncated, otherwise null if this version listing isn't
     *         truncated.
     */
    public String getNextKeyMarker() { 
        return nextKeyMarker; 
    }

    /**
     * Not intended for direct use by callers. Sets the key marker to use in the
     * next listVersions request in order to see the next page of results for a
     * truncated version listing.
     * 
     * @param marker
     *            The key marker to use in the next listVersions request in
     *            order to see the next page of results for a truncated version
     *            listing.
     */
    public void setNextKeyMarker(String marker) { 
        this.nextKeyMarker = marker; 
    }

    /**
     * For truncated version listings (see
     * {@link VersionListing#isTruncated()}) returns the version ID marker to
     * use in the next listVersions request in order to see the next page of
     * results. If a version listing is not truncated, this method will return
     * null since there is no need for a next version ID marker.
     * 
     * @return The version ID marker to use in the next listVersions request in
     *         order to see the next page of results if this version listing is
     *         truncated, otherwise null if this version listing isn't
     *         truncated.
     */
    public String getNextVersionIdMarker() { 
        return nextVersionIdMarker; 
    }

    /**
     * Not intended for direct use by callers. Sets the version ID marker to use
     * in the next listVersions request in order to see the next page of results
     * for a truncated version listing.
     * 
     * @param marker
     *            The version ID marker to use in the next listVersions request
     *            in order to see the next page of results for a truncated
     *            version listing.
     */
    public void setNextVersionIdMarker(String marker) { 
        this.nextVersionIdMarker = marker; 
    }

    /**
     * Returns true if this version listing is <b>not complete</b> and indicates
     * that the caller needs to make additional calls to Amazon S3 to get more
     * results.
     * 
     * @return True if this version listing is <b>not complete</b> and indicates
     *         that the caller needs to make additional calls to Amazon S3 to
     *         get additional version summaries.
     */
    public boolean isTruncated() { 
        return isTruncated; 
    }

    /**
     * Not intended for direct use by callers. Sets the truncated property for
     * this version listing, indicating if this is a complete listing or not and
     * whether the caller needs to make additional calls to S3 to get more
     * version summaries.
     * 
     * @param isTruncated
     *            True if this version listing is <b>not complete</b> and the
     *            caller needs to make additional S3 calls to get additional
     *            version summaries.
     */
    public void setTruncated(boolean isTruncated) { 
        this.isTruncated = isTruncated; 
    }

}
