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
import com.amazonaws.services.s3.AmazonS3Client;

/**
 * Returns a list of summary information about the objects in the specified
 * bucket, along with additional information depending on the request parameters
 * (such as common prefixes if a delimiter was specified). List results are
 * <b>always</b> returned in lexicographic (alphabetical) order.
 * <p>
 * Since buckets can contain a virtually unlimited number of keys, the complete
 * results of a list query can be extremely large. To manage large result sets,
 * Amazon S3 uses pagination to split them into multiple responses. Callers
 * should always check the {@link ObjectListing#isTruncated()} method to see
 * if the returned listing is complete, or if callers need to make additional
 * calls to get more results. The marker parameter allows callers to specify
 * where to start the object listing. Alternatively, callers can use the
 * {@link AmazonS3Client#listNextBatchOfObjects(ObjectListing)} method as an
 * easy way to get the next page of object listings.
 * <p>
 * The delimiter parameter allows groups of keys that share a prefix terminated
 * by a special delimiter to be rolled-up by that common prefix in the returned
 * listing. This allows applications to organize and browse their keys
 * hierarchically, much like how you would organize your files into directories
 * in a file system. These common prefixes can be retrieved through the
 * {@link ObjectListing#getCommonPrefixes()} method.
 * <p>
 * For example, consider a bucket that contains the keys:
 * <ul>
 * <li>"foo/bar/baz"</li>
 * <li>"foo/bar/bash"</li>
 * <li>"foo/bar/bang"</li>
 * <li>"foo/boo"</li>
 * </ul>
 * If you call listObjects with prefix="foo/" and delimiter="/" on this bucket,
 * you will get an S3ObjectListing back that contains one key ("foo/boo") and
 * one entry in the common prefixes list ("foo/bar/"). If you want to see deeper
 * into the virtual hierarchy, you can make another call to listObjects setting
 * the prefix parameter to any interesting common prefix to list the individual
 * keys under that prefix.
 * <p>
 * List performance is not substantially affected by the total number of keys in
 * your bucket, nor by the presence or absence of any additional query
 * parameters.
 */
public class ListObjectsRequest extends AmazonWebServiceRequest {
    
    /** The name of the Amazon S3 bucket to list. */
    private String bucketName;

    /**
     * Optional parameter restricting the response to keys which begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different sets of keys in a way similar to how a file system uses
     * folders.
     */
    private String prefix;

    /**
     * Optional parameter indicating where in the bucket to begin listing. The
     * list will only include keys that occur lexicographically after the
     * marker. This enables pagination: to get the next page of results use the
     * current value from {@link ObjectListing#getNextMarker()} as the marker
     * for the next request to list objects.
     */
    private String marker;

    /**
     * Optional parameter that causes keys that contain the same string between
     * the prefix and the first occurrence of the delimiter to be rolled up into
     * a single result element in the
     * {@link ObjectListing#getCommonPrefixes()} list. These rolled-up keys
     * are not returned elsewhere in the response. The most commonly used
     * delimiter is "/", which simulates a hierarchical organization similar to
     * a file system directory structure.
     */
    private String delimiter;

    /**
     * Optional parameter indicating the maximum number of keys to include in
     * the response. Amazon S3 might return fewer than this, but will not return
     * more. Even if maxKeys is not specified, Amazon S3 will limit the number
     * of results in the response.
     */
    private Integer maxKeys;

    
    /**
     * Constructs an empty ListObjectsRequest object. The caller must populate
     * the fields before the request is ready to be executed.
     */
    public ListObjectsRequest() {}

    /**
     * Constructs a new ListObjectsRequest object and initializes all required
     * and optional fields.
     * 
     * @param bucketName
     *            The name of the bucket whose objects are to be listed.
     * @param prefix
     *            The prefix restricting what keys will be listed.
     * @param marker
     *            The key marker indicating where results should begin.
     * @param delimiter
     *            The delimiter for condensing common prefixes in returned
     *            results.
     * @param maxKeys
     *            The maximum number of results to return.
     */
    public ListObjectsRequest(String bucketName, String prefix, String marker, String delimiter, Integer maxKeys) {
        setBucketName(bucketName);
        setPrefix(prefix);
        setMarker(marker);
        setDelimiter(delimiter);
        setMaxKeys(maxKeys);
    }

    
    /**
     * Returns the name of the Amazon S3 bucket whose objects are to be listed.
     * 
     * @return The name of the Amazon S3 bucket whose objects are to be listed.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose objects are to be listed.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket whose objects are to be
     *            listed.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose objects are to be listed, and
     * returns this ListObjectsRequest object so that method calls can be
     * chained together.
     * 
     * @param bucketName
     *            The name of the Amazon S3 bucket whose objects are to be
     *            listed.
     * 
     * @return This ListObjectsRequest object so that method calls can be
     *         chained together.
     */
    public ListObjectsRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the optional prefix parameter restricting the response to keys
     * which begin with the specified prefix. You can use prefixes to separate a
     * bucket into different sets of keys in a way similar to how a file system
     * uses folders.
     * 
     * @return The optional prefix parameter restricting the response to keys
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
     * begin with the specified prefix, and returns this ListObjectsRequest
     * object so that method calls may be chained together.
     * 
     * @param prefix
     *            the optional prefix parameter restricting the response to keys
     *            which begin with the specified prefix.
     * 
     * @return This ListObjectsRequest object so that method calls may be
     *         chained together.
     */
    public ListObjectsRequest withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * Returns the optional parameter indicating where in the bucket to begin
     * listing. The list will only include keys that occur lexicographically
     * after the marker.
     * 
     * @return the optional parameter indicating where in the bucket to begin
     *         listing. The list will only include keys that occur
     *         lexicographically after the marker.
     */
    public String getMarker() {
        return marker;
    }

    /**
     * Sets the optional parameter indicating where in the bucket to begin
     * listing. The list will only include keys that occur lexicographically
     * after the marker.
     * 
     * @param marker
     *            the optional parameter indicating where in the bucket to begin
     *            listing. The list will only include keys that occur
     *            lexicographically after the marker.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * Sets the optional parameter indicating where in the bucket to begin
     * listing. The list will only include keys that occur lexicographically
     * after the marker, and returns this ListObjectsRequest object so that
     * method calls may be chained together.
     * 
     * @param marker
     *            the optional parameter indicating where in the bucket to begin
     *            listing. The list will only include keys that occur
     *            lexicographically after the marker.
     * 
     * @return This ListObjectsRequest object so that method calls may be
     *         chained together.
     */
    public ListObjectsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns the optional delimiter parameter that causes keys that contain
     * the same string between the prefix and the first occurrence of the
     * delimiter to be rolled up into a single result element in the
     * {@link ObjectListing#getCommonPrefixes()} list. These rolled-up keys
     * are not returned elsewhere in the response. The most commonly used
     * delimiter is "/", which simulates a hierarchical organization similar to
     * a file system directory structure.
     * 
     * @return the optional delimiter parameter that causes keys that contain
     *         the same string between the prefix and the first occurrence of
     *         the delimiter to be rolled up into a single result element in the
     *         {@link ObjectListing#getCommonPrefixes()} list.
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the optional delimiter parameter that causes keys that contain the
     * same string between the prefix and the first occurrence of the delimiter
     * to be rolled up into a single result element in the
     * {@link ObjectListing#getCommonPrefixes()} list.
     * 
     * @param delimiter
     *            the optional delimiter parameter that causes keys that contain
     *            the same string between the prefix and the first occurrence of
     *            the delimiter to be rolled up into a single result element in
     *            the {@link ObjectListing#getCommonPrefixes()} list.
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Sets the optional delimiter parameter that causes keys that contain the
     * same string between the prefix and the first occurrence of the delimiter
     * to be rolled up into a single result element in the
     * {@link ObjectListing#getCommonPrefixes()} list, and returns this
     * ListObjectsRequest object so that method calls may be chained together.
     * 
     * @param delimiter
     *            the optional delimiter parameter that causes keys that contain
     *            the same string between the prefix and the first occurrence of
     *            the delimiter to be rolled up into a single result element in
     *            the {@link ObjectListing#getCommonPrefixes()} list.
     * 
     * @return This ListObjectsRequest object so that method calls may be
     *         chained together.
     */
    public ListObjectsRequest withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * Returns the optional parameter indicating the maximum number of keys to
     * include in the response. Amazon S3 might return fewer than this, but will
     * not return more. Even if maxKeys is not specified, Amazon S3 will limit
     * the number of results in the response.
     * 
     * @return the optional parameter indicating the maximum number of keys to
     *         include in the response.
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    /**
     * Sets the optional parameter indicating the maximum number of keys to
     * include in the response.
     * 
     * @param maxKeys
     *            the optional parameter indicating the maximum number of keys
     *            to include in the response.
     */
    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * Sets the optional parameter indicating the maximum number of keys to
     * include in the response, and returns this ListObjectsRequest object so
     * that method calls may be chained together.
     * 
     * @param maxKeys
     *            the optional parameter indicating the maximum number of keys
     *            to include in the response.
     * 
     * @return This ListObjectsRequest object so that method calls may be
     *         chained together.
     */
    public ListObjectsRequest withMaxKeys(Integer maxKeys) {
        setMaxKeys(maxKeys);
        return this;
    }

}
