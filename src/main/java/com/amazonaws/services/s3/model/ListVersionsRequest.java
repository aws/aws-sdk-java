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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.Constants;

/**
 * Request for a list of summary information about the versions in a specified
 * bucket.
 * <p>
 * The returned version summaries are ordered first by key and then by version.
 * Keys are sorted lexicographically (i.e. alphabetically from a-Z) and versions
 * are sorted from most recent to least recent. Both versions with data and
 * delete markers are included in the results.
 * <p>
 * Since buckets can contain a virtually unlimited number of versions, the
 * complete results of a list query can be extremely large. To manage large
 * result sets, Amazon S3 uses pagination to split them into multiple responses.
 * Callers should always check the {@link VersionListing#isTruncated()} method
 * to determine if the returned listing is complete, or if callers need to make
 * additional calls to get more results. The key and version ID marker
 * parameters allow callers to specify where to start the version listing.
 * Alternatively callers can use
 * {@link AmazonS3#listNextBatchOfVersions(VersionListing)} as an easy way to
 * get the next page of results.
 * <p>
 * Objects created before versioning was enabled or when versioning is suspended
 * will be given the default/null version ID (see
 * {@link Constants#NULL_VERSION_ID}). Note that the
 * {@link Constants#NULL_VERSION_ID} is a valid version ID and is not the same
 * as not having a version ID.
 * <p>
 * The delimiter parameter allows groups of keys that share a prefix terminated
 * by a special delimiter to be rolled-up by that common prefix in the returned
 * listing. This allows applications to organize and browse their keys
 * hierarchically, much like how you would organize your files into directories
 * in a file system. These common prefixes can be retrieved through the
 * {@link VersionListing#getCommonPrefixes()} method.
 * <p>
 * For example, consider a bucket that contains the keys:
 * <ul>
 * <li>"foo/bar/baz"</li>
 * <li>"foo/bar/bash"</li>
 * <li>"foo/bar/bang"</li>
 * <li>"foo/boo"</li>
 * </ul>
 * If you call listVersions with prefix="foo/" and delimiter="/" on this bucket,
 * you will get an S3VersionListing back that contains:
 * <ul>
 * <li>all the versions for one key ("foo/boo")</li>
 * <li>one entry in the common prefixes list ("foo/bar/")</li>
 * </ul>
 * If you want to see deeper into the virtual hierarchy, you can make another
 * call to listVersions setting the prefix parameter to any interesting common
 * prefix to list the individual versions under that prefix.
 * <p>
 * See
 * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
 * for more information about enabling versioning for a bucket.
 */
public class ListVersionsRequest extends AmazonWebServiceRequest {

    /** The name of the Amazon S3 bucket whose versions are to be listed. */
    private String bucketName;

    /**
     * Optional parameter restricting the response to keys which begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different sets of keys in a way similar to how a file system uses
     * folders.
     */
    private String prefix;

    /**
     * Optional parameter indicating where in the sorted list of all versions in
     * the specified bucket to begin returning results. Results are always
     * ordered first lexicographically (i.e. alphabetically) and then from most
     * recent version to least recent version. If a keyMarker is used without a
     * versionIdMarker, results begin immediately after that key's last version.
     * When a keyMarker is used with a versionIdMarker, results begin
     * immediately after the version with the specified key and version ID.
     * <p>
     * This enables pagination: to get the next page of results use the next key
     * marker and next version ID marker (from
     * {@link VersionListing#getNextKeyMarker()} and
     * {@link VersionListing#getNextVersionIdMarker()}) as the markers for the
     * next request to list versions. Or use the convenience method
     * {@link AmazonS3#listNextBatchOfVersions(VersionListing)}
     */
    private String keyMarker;

    /**
     * Optional parameter indicating where in the sorted list of all versions in
     * the specified bucket to begin returning results. Results are always
     * ordered first lexicographically (i.e. alphabetically) and then from most
     * recent version to least recent version. A keyMarker must be specified
     * when specifying a versionIdMarker. Results begin immediately after the
     * version with the specified key and version ID.
     * <p>
     * This enables pagination: to get the next page of results use the next key
     * marker and next version ID marker (from
     * {@link VersionListing#getNextKeyMarker()} and
     * {@link VersionListing#getNextVersionIdMarker()}) as the markers for the
     * next request to list versions. Or use the convenience method
     * {@link AmazonS3#listNextBatchOfVersions(VersionListing)}
     */
    private String versionIdMarker;

    /**
     * Optional parameter that causes keys that contain the same string between
     * the prefix and the first occurrence of the delimiter to be rolled up into
     * a single result element in the
     * {@link VersionListing#getCommonPrefixes()} list. These rolled-up keys
     * are not returned elsewhere in the response. The most commonly used
     * delimiter is "/", which simulates a hierarchical organization similar to
     * a file system directory structure.
     */
    private String delimiter;

    /**
     * Optional parameter indicating the maximum number of results to include in
     * the response. Amazon S3 might return fewer than this, but will not return
     * more. Even if maxKeys is not specified, Amazon S3 will limit the number
     * of results in the response.
     */
    private Integer maxResults;

    
    /**
     * Constructs an empty ListVersionsRequest object. The caller must populate
     * the fields before the request is ready to be executed.
     */
    public ListVersionsRequest() {}
    
    /**
     * Constructs a new ListVersionsRequest object and initializes all required
     * and optional fields.
     * 
     * @param bucketName
     *            The name of the bucket whose versions are to be listed. See
     *            {@link #getBucketName()}.
     * @param prefix
     *            The prefix restricting what keys will be listed. See
     *            {@link #getPrefix()}.
     * @param keyMarker
     *            The key marker indicating where results should begin. See
     *            {@link #getKeyMarker()}.
     * @param versionIdMarker
     *            The version ID marker indicating where results should begin.
     *            See {@link #getVersionIdMarker()}.
     * @param delimiter
     *            The delimiter for condensing common prefixes in returned
     *            results. See {@link #getDelimiter()}.
     * @param maxResults
     *            The maximum number of results to return. See
     *            {@link #getMaxResults()}.
     */
    public ListVersionsRequest(String bucketName, String prefix, String keyMarker, String versionIdMarker, String delimiter, Integer maxResults) {
        setBucketName(bucketName);
        setPrefix(prefix);
        setKeyMarker(keyMarker);
        setVersionIdMarker(versionIdMarker);
        setDelimiter(delimiter);
        setMaxResults(maxResults);
    }
    
    
    /**
     * Returns the name of the Amazon S3 bucket whose versions are to be listed.
     * 
     * @return The name of the Amazon S3 bucket whose versions are to be listed.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose versions are to be listed.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket whose versions are to be
     *            listed.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose versions are to be listed,
     * and returns this ListVersionsRequest object so that method calls can be
     * chained together.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket whose versions are to be
     *            listed.
     * 
     * @return This ListVersionsRequest object so that method calls can be
     *         chained together.
     */
    public ListVersionsRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the optional prefix parameter restricting the response to keys
     * which begin with the specified prefix. You can use prefixes to separate a
     * bucket into different sets of keys in a way similar to how a file system
     * uses folders.
     * 
     * @return the optional prefix parameter restricting the response to keys
     *         which begin with the specified prefix.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the optional prefix parameter restricting the response to keys which
     * begin with the specified prefix.
     * 
     * @param prefix
     *            the optional prefix parameter restricting the response to keys
     *            which begin with the specified prefix.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets the optional prefix parameter restricting the response to keys which
     * begin with the specified prefix, and returns this ListVersionsRequest
     * object so that method calls may be chained together.
     * 
     * @param prefix
     *            the optional prefix parameter restricting the response to keys
     *            which begin with the specified prefix.
     * 
     * @return This ListVersionsRequest object so that method calls may be
     *         chained together.
     */
    public ListVersionsRequest withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * Returns the optional keyMarker parameter indicating where in the sorted
     * list of all versions in the specified bucket to begin returning results.
     * Results are always ordered first lexicographically (i.e. alphabetically)
     * and then from most recent version to least recent version. If a keyMarker
     * is used without a versionIdMarker, results begin immediately after that
     * key's last version. When a keyMarker is used with a versionIdMarker,
     * results begin immediately after the version with the specified key and
     * version ID.
     * 
     * @return the optional keyMarker parameter indicating where in the sorted
     *         list of all versions in the specified bucket to begin returning
     *         results.
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * Sets the optional keyMarker parameter indicating where in the sorted list
     * of all versions in the specified bucket to begin returning results.
     * 
     * @param keyMarker
     *            the optional keyMarker parameter indicating where in the
     *            sorted list of all versions in the specified bucket to begin
     *            returning results.
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * Sets the optional keyMarker parameter indicating where in the sorted list
     * of all versions in the specified bucket to begin returning results, and
     * returns this ListVersionsRequest object so that method calls may be
     * chained together.
     * 
     * @param keyMarker
     *            the optional keyMarker parameter indicating where in the
     *            sorted list of all versions in the specified bucket to begin
     *            returning results.
     * 
     * @return This ListVersionsRequest object so that method calls may be
     *         chained together.
     */
    public ListVersionsRequest withKeyMarker(String keyMarker) {
        setKeyMarker(keyMarker);
        return this;
    }

    /**
     * Returns the optional versionIdMarker parameter indicating where in the
     * sorted list of all versions in the specified bucket to begin returning
     * results. Results are always ordered first lexicographically (i.e.
     * alphabetically) and then from most recent version to least recent
     * version. A keyMarker must be specified when specifying a versionIdMarker.
     * Results begin immediately after the version with the specified key and
     * version ID.
     * 
     * @return the optional versionIdMarker parameter indicating where in the
     *         sorted list of all versions in the specified bucket to begin
     *         returning results.
     */
    public String getVersionIdMarker() {
        return versionIdMarker;
    }

    /**
     * Sets the optional versionIdMarker parameter indicating where in the
     * sorted list of all versions in the specified bucket to begin returning
     * results.
     * 
     * @param versionIdMarker
     *            the optional versionIdMarker parameter indicating where in the
     *            sorted list of all versions in the specified bucket to begin
     *            returning results.
     */
    public void setVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
    }

    /**
     * Sets the optional versionIdMarker parameter indicating where in the
     * sorted list of all versions in the specified bucket to begin returning
     * results, and returns this ListVersionsRequest object so that method calls
     * may be chained together.
     * 
     * @param versionIdMarker
     *            the optional versionIdMarker parameter indicating where in the
     *            sorted list of all versions in the specified bucket to begin
     *            returning results.
     * 
     * @return This ListVersionsRequest object so that method calls may be
     *         chained together.
     */
    public ListVersionsRequest withVersionIdMarker(String versionIdMarker) {
        setVersionIdMarker(versionIdMarker);
        return this;
    }

    /**
     * Returns the optional delimiter parameter that causes keys that contain
     * the same string between the prefix and the first occurrence of the
     * delimiter to be rolled up into a single result element in the
     * {@link VersionListing#getCommonPrefixes()} list. These rolled-up keys
     * are not returned elsewhere in the response. The most commonly used
     * delimiter is "/", which simulates a hierarchical organization similar to
     * a file system directory structure.
     * 
     * @return the optional delimiter parameter that causes keys that contain
     *         the same string between the prefix and the first occurrence of
     *         the delimiter to be rolled up into a single result element in the
     *         {@link VersionListing#getCommonPrefixes()} list.
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the optional delimiter parameter that causes keys that contain the
     * same string between the prefix and the first occurrence of the delimiter
     * to be rolled up into a single result element in the
     * {@link VersionListing#getCommonPrefixes()} list.
     * 
     * @param delimiter
     *            the optional delimiter parameter that causes keys that contain
     *            the same string between the prefix and the first occurrence of
     *            the delimiter to be rolled up into a single result element in
     *            the {@link VersionListing#getCommonPrefixes()} list.
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Sets the optional delimiter parameter that causes keys that contain the
     * same string between the prefix and the first occurrence of the delimiter
     * to be rolled up into a single result element in the
     * {@link VersionListing#getCommonPrefixes()} list, and returns this
     * ListVersionsRequest object so that method calls may be chained together.
     * 
     * @param delimiter
     *            the optional delimiter parameter that causes keys that contain
     *            the same string between the prefix and the first occurrence of
     *            the delimiter to be rolled up into a single result element in
     *            the {@link VersionListing#getCommonPrefixes()} list.
     * 
     * @return This ListVersionsRequest object so that method calls may be
     *         chained together.
     */
    public ListVersionsRequest withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * Returns the optional parameter indicating the maximum number of results
     * to include in the response. Amazon S3 might return fewer than this, but
     * will not return more. Even if maxResults is not specified, Amazon S3 will
     * limit the number of results in the response.
     * 
     * @return the optional parameter indicating the maximum number of results
     *         to include in the response.
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the optional parameter indicating the maximum number of results to
     * include in the response.
     * 
     * @param maxResults
     *            the optional parameter indicating the maximum number of
     *            results to include in the response.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Sets the optional parameter indicating the maximum number of results to
     * include in the response, and returns this ListVersionsRequest object so
     * that method calls may be chained together.
     * 
     * @param maxResults
     *            the optional parameter indicating the maximum number of
     *            results to include in the response.
     * 
     * @return This ListVersionsRequest object so that method calls may be
     *         chained together.
     */
    public ListVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

}
