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
import java.io.Serializable;

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
public class VersionListing implements Serializable {

    /** A list of summary information describing the versions stored in the bucket */
    private List<S3VersionSummary> versionSummaries =
            new ArrayList<S3VersionSummary>();

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
     * The encodingType parameter originally specified by the caller when this
     * version listing was returned.
     */
    private String encodingType;


    /**
     * Gets the list of version summaries describing the versions stored in
     * the associated S3 bucket. Callers should remember that listings for large
     * buckets can be truncated for performance reasons, so callers might need
     * to make additional calls to
     * {@link AmazonS3#listVersions(ListVersionsRequest)} to get additional
     * results. Callers should always check {@link VersionListing#isTruncated()} to
     * determine if a listing is truncated or not.
     *
     * @return A list of the version summaries describing the versions stored in
     *         the associated S3 bucket.
     */
    public List<S3VersionSummary> getVersionSummaries() {
        return this.versionSummaries;
    }

    /**
     * For internal use only. Sets the list of version
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
     * Gets the common prefixes included in this version listing. Common
     * prefixes are only present if a delimiter was specified in the original
     * request.
     * <p>
     * Each common prefix represents a set of keys in the S3 bucket that have
     * been condensed and omitted from the version summary results. This allows
     * applications to organize and browse their keys hierarchically,
     * similar to how a file system organizes files
     * into directories.
     * <p>
     * For example, consider a bucket that contains the keys:
     * <ul>
     *  <li>"foo/bar/baz"</li>
     *  <li>"foo/bar/bash"</li>
     *  <li>"foo/bar/bang"</li>
     *  <li>"foo/boo"</li>
     * </ul>
     * If calling <code>listVersions</code> with a prefix value of "foo/" and a delimiter
     * value of "/" on this
     * bucket, the returned <code>VersionListing</code> will contain one entry in the
     * common prefixes list ("foo/bar/") and none of the keys beginning with
     * that common prefix will be included in the version summaries list.
     * </p>
     *
     * @return The list of common prefixes included in this version listing.
     *         Returns an empty list if no common prefixes are found.
     */
    public List<String> getCommonPrefixes() {
        return commonPrefixes;
    }

    /**
     * For internal use only. Sets the common prefixes for this
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
     * Gets the name of the Amazon S3 bucket containing the versions listed
     * in this {@link VersionListing}.
     *
     * @return The name of the Amazon S3 bucket containing the versions listed
     *         in this S3VersionListing.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * For internal use only. Sets the name of the Amazon S3
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
     * <code>null</code> if no prefix was specified. All object keys included in this version
     * listing start with the specified prefix.
     *
     * @return The prefix parameter originally used to request this version
     *         listing, or <code>null</code> if no prefix was specified.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * For internal use only. Sets the prefix parameter
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
     * or <code>null</code> if no key marker was specified. If specified, all object keys
     * included in this version listing will occur lexically (alphabetically)
     * after the specified key marker.
     *
     * @return The key marker parameter originally used to request this version
     *         listing, or <code>null</code> if no key marker was specified.
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * For internal use only. Sets the key marker parameter
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
     * Gets the value of the version ID marker parameter used to request this version
     * listing. Returns <code>null</code> if no version ID marker was otherwise specified.
     *
     * @return The version ID marker parameter originally used to request this
     *         version listing. Returns <code>null</code> if no version ID marker otherwise was specified.
     */
    public String getVersionIdMarker() {
        return versionIdMarker;
    }

    /**
     * For internal use only. Sets the version ID marker
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
     * Gets the value of the <code>maxKeys</code> parameter used to request this version
     * listing.  Returns the default <code>maxKeys</code> value provided by Amazon S3 if no
     * parameter value was otherwise specified.
     * <p>
     * The <code>maxKeys</code> parameter limits the number
     * of versions included in this version listing. A version listing will
     * never contain more versions than indicated by <code>maxKeys</code> , but can
     * contain less.
     * </p>
     *
     * @return The value of the <code>maxKeys</code> parameter used to request this version
     *         listing.  Returns the default <code>maxKeys</code> value provided by Amazon S3 if no
     *         parameter value was otherwise specified.
     */
    public int getMaxKeys() {
        return maxKeys;
    }

    /**
     * For internal use only. Sets the maxKeys parameter
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
     * Gets the value of the <code>delimiter</code> parameter used to request this version
     * listing. Returns <code>null</code> if no parameter value was otherwise specified.
     * <p>
     * The delimiter value allows
     * callers to condense S3 keys into common prefix listings. For example, if
     * a caller specifies a delimiter of "/" (a common used value for
     * delimiter), then any keys that contain a common prefix between the start
     * of the key and the first occurrence of "/" will not be included in the
     * list of object summaries; instead, the common prefixes list will have
     * one entry for the common prefix.
     * </p>
     *
     * @return The delimiter parameter originally used to request this version
     *         listing, or <code>null</code> if none was specified.
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * For internal use only. Sets the delimiter parameter
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
     * Gets the key marker to use in
     * the next <code>listVersions</code> request in order to obtain the next page of results.
     * Returns <code>null</code> if the version listing is not truncated.
     * For truncated requests,
     * this value is equal to the greatest (lexicographically) value of the
     * object keys included in this listing.
     *
     * @return The key marker to use in
     *         the next <code>listVersions</code> request in order to obtain the next page of results.
     *         Returns <code>null</code> if the version listing is not truncated.
     *
     * @see VersionListing#isTruncated()
     */
    public String getNextKeyMarker() {
        return nextKeyMarker;
    }

    /**
     * For internal use only. Sets the key marker to use in the
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
     * Gets the version ID marker to
     * use in the next <code>listVersions</code> request in order to obtain the next page of
     * results. Returns <code>null</code> if the version listing is not truncated.
     *
     * @return The version ID marker to use in the next <code>listVersions</code> request in
     *         order to see the next page of results.
     *         Returns <code>null</code> if the version listing is not truncated.
     *
     * @see VersionListing#isTruncated()
     */
    public String getNextVersionIdMarker() {
        return nextVersionIdMarker;
    }

    /**
     * For internal use only. Sets the version ID marker to use
     * in the next listVersions request in order to see the next page of results
     * for a truncated version listing.
     *
     * @param marker
     *            The version ID marker to use in the next listVersions request
     *            in order to obtain the next page of results for a truncated
     *            version listing.
     */
    public void setNextVersionIdMarker(String marker) {
        this.nextVersionIdMarker = marker;
    }

    /**
     * Gets whether or not the version listing
     * is complete, indicating if additional calls to Amazon S3 are needed to obtain
     * complete version listing results.
     *
     * @return The value <code>true</code> if this version listing is <b>not complete<b>, indicating
     *         additional calls to Amazon S3 are needed to obtain
     *         complete version listing results. Returns the value <code>false</code> if otherwise.
     */
    public boolean isTruncated() {
        return isTruncated;
    }

    /**
     * For internal use only. Sets the truncated property for
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

    /**
     * Gets the encoding type used by Amazon S3 to encode object key names in
     * the XML response. If you specify <code>encodingType</code> request
     * parameter, Amazon S3 includes this element in the response, and returns
     * encoded key name values in the following response elements:
     * <code>KeyMarker, NextKeyMarker, Prefix, Key, Delimiter</code>.
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

}
