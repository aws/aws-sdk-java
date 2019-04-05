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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3Client;

/**
 * <p>
 * Contains options to return a list of summary information about the objects in the specified
 * bucket. Depending on the request parameters, additional information is returned,
 * such as common prefixes if a delimiter was specified. List
 * results are <i>always</i> returned in lexicographic (alphabetical) order.
 * </p>
 * <p>
 * Buckets can contain a virtually unlimited number of keys, and the complete
 * results of a list query can be extremely large. To manage large result sets,
 * Amazon S3 uses pagination to split them into multiple responses.
 * Always check the {@link ObjectListing#isTruncated()} method to see
 * if the returned listing is complete, or if callers need to make additional
 * calls to get more results. Alternatively, use the
 * {@link AmazonS3Client#listNextBatchOfObjects(ObjectListing)} method as an
 * easy way to get the next page of object listings.
 * </p>
 * <p>
 * Calling {@link ListObjectsRequest#setDelimiter(String)}
 * sets the delimiter, allowing groups of keys that share the
 * delimiter-terminated prefix to be included
 * in the returned listing. This allows applications to organize and browse
 * their keys hierarchically, similar to how a file system organizes files
 * into directories. These common prefixes can be retrieved
 * through the {@link ObjectListing#getCommonPrefixes()} method.
 * </p>
 * <p>
 * For example, consider a bucket that contains the following keys:
 * <ul>
 *  <li>"foo/bar/baz"</li>
 *  <li>"foo/bar/bash"</li>
 *  <li>"foo/bar/bang"</li>
 *  <li>"foo/boo"</li>
 * </ul>
 * If calling <code>listObjects</code> with
 * a prefix value of "foo/" and a delimiter value of "/"
 * on this bucket, an <code>ObjectListing</code> is returned that contains one key
 * ("foo/boo") and one entry in the common prefixes list ("foo/bar/").
 * To see deeper into the virtual hierarchy, make another
 * call to <code>listObjects</code> setting the prefix parameter to any interesting
 * common prefix to list the individual keys under that prefix.
 * </p>
 * <p>
 * The total number of keys in a bucket doesn't substantially affect list performance,
 * nor does the presence or absence of additional request parameters.
 * </p>
 */
public class ListObjectsRequest extends AmazonWebServiceRequest implements Serializable {

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
     * marker. This enables pagination; to get the next page of results use the
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
     * Optional parameter indicating the encoding method to be applied on the
     * response. An object key can contain any Unicode character; however, XML
     * 1.0 parser cannot parse some characters, such as characters with an ASCII
     * value from 0 to 10. For characters that are not supported in XML 1.0, you
     * can add this parameter to request that Amazon S3 encode the keys in the
     * response.
     */
    private String encodingType;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    /**
     * Constructs a new {@link ListObjectsRequest} object.
     * The caller must populate
     * the object fields before the request is ready to be executed.
     *
     * @see ListObjectsRequest#ListObjectsRequest(String, String, String, String, Integer)
     */
    public ListObjectsRequest() {}

    /**
     * Constructs a new {@link ListObjectsRequest} object and
     * initializes all required and optional object fields.
     *
     * @param bucketName
     *            The name of the bucket whose objects are to be listed.
     * @param prefix
     *            The prefix restricting what keys will be listed.
     * @param marker
     *            The key marker indicating where listing results should begin.
     * @param delimiter
     *            The delimiter for condensing common prefixes in the returned
     *            listing results.
     * @param maxKeys
     *            The maximum number of results to return.
     *
     * @see ListObjectsRequest#ListObjectsRequest()
     */
    public ListObjectsRequest(String bucketName, String prefix, String marker, String delimiter, Integer maxKeys) {
        setBucketName(bucketName);
        setPrefix(prefix);
        setMarker(marker);
        setDelimiter(delimiter);
        setMaxKeys(maxKeys);
    }


    /**
     * Gets the name of the Amazon S3 bucket whose
     * objects are to be listed.
     *
     * @return The name of the Amazon S3 bucket whose objects are to be listed.
     *
     * @see ListObjectsRequest#setBucketName(String)
     * @see ListObjectsRequest#withBucketName(String)
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
     *
     * @see ListObjectsRequest#getBucketName()
     * @see ListObjectsRequest#withBucketName(String)
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose objects are to be listed.
     * Returns this {@link ListObjectsRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose objects are to be
     *            listed.
     *
     * @return This {@link ListObjectsRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see ListObjectsRequest#getBucketName()
     * @see ListObjectsRequest#setBucketName(String)
     */
    public ListObjectsRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the optional prefix parameter and restricts the response to keys
     * that begin with the specified prefix. Use prefixes to separate a
     * bucket into different sets of keys, similar to how a file system organizes files
     * into directories.
     *
     * @return The optional prefix parameter restricting the response to keys
     *         that begin with the specified prefix.
     *
     * @see ListObjectsRequest#setPrefix(String)
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the optional prefix parameter, restricting the response to keys that
     * begin with the specified prefix.
     *
     * @param prefix
     *            The optional prefix parameter, restricting the response to keys
     *            that begin with the specified prefix.
     *
     * @see ListObjectsRequest#getPrefix()
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets the optional prefix parameter restricting the response to keys that
     * begin with the specified prefix.
     * Returns this {@link ListObjectsRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param prefix
     *            The optional prefix parameter restricting the response to keys
     *            that begin with the specified prefix.
     *
     * @return This {@link ListObjectsRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see ListObjectsRequest#getPrefix()
     * @see ListObjectsRequest#setPrefix(String)
     */
    public ListObjectsRequest withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * Gets the optional marker parameter indicating where in the bucket to begin
     * listing. The list will only include keys that occur lexicographically
     * after the marker.
     *
     * @return The optional marker parameter indicating where in the bucket to begin
     *         listing. The list will only include keys that occur
     *         lexicographically after the marker.
     *
     * @see ListObjectsRequest#setMarker(String)
     * @see ListObjectsRequest#withMarker(String)
     */
    public String getMarker() {
        return marker;
    }

    /**
     * Sets the optional marker parameter indicating where in the bucket to begin
     * listing. The list will only include keys that occur lexicographically
     * after the marker.
     *
     * @param marker
     *            The optional marker parameter indicating where in the bucket to begin
     *            listing. The list will only include keys that occur
     *            lexicographically after the marker.
     *
     * @see ListObjectsRequest#getMarker()
     * @see ListObjectsRequest#withMarker(String)
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * Sets the optional marker parameter indicating where in the bucket to begin
     * listing.
     * Returns this {@link ListObjectsRequest}, enabling additional method
     * calls to be chained together.
     * The list will only include keys that occur lexicographically
     * after the marker.
     *
     * @param marker
     *            The optional parameter indicating where in the bucket to begin
     *            listing. The list will only include keys that occur
     *            lexicographically after the marker.
     *
     * @return This {@link ListObjectsRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see ListObjectsRequest#getMarker()
     * @see ListObjectsRequest#setMarker(String)
     */
    public ListObjectsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Gets the optional delimiter parameter that causes keys that contain
     * the same string between the prefix and the first occurrence of the
     * delimiter to be combined into a single result element in the
     * {@link ObjectListing#getCommonPrefixes()} list. These combined keys
     * are not returned elsewhere in the response. The most commonly used
     * delimiter is "/", which simulates a hierarchical organization similar to
     * a file system directory structure.
     *
     * @return The optional delimiter parameter that causes keys that contain
     *         the same string between the prefix and the first occurrence of
     *         the delimiter to be combined into a single result element in the
     *         {@link ObjectListing#getCommonPrefixes()} list.
     *
     * @see ListObjectsRequest#setDelimiter(String)
     * @see ListObjectsRequest#withDelimiter(String)
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the optional delimiter parameter that causes keys that contain the
     * same string between the prefix and the first occurrence of the delimiter
     * to be combined into a single result element in the
     * {@link ObjectListing#getCommonPrefixes()} list.
     *
     * @param delimiter
     *            The optional delimiter parameter that causes keys that contain
     *            the same string between the prefix and the first occurrence of
     *            the delimiter to be combined into a single result element in
     *            the {@link ObjectListing#getCommonPrefixes()} list.
     *
     * @see ListObjectsRequest#getDelimiter()
     * @see ListObjectsRequest#withDelimiter(String)
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Sets the optional delimiter parameter that causes keys that contain the
     * same string between the prefix and the first occurrence of the delimiter
     * to be rolled up into a single result element in the
     * {@link ObjectListing#getCommonPrefixes()} list.
     * Returns this {@link ListObjectsRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param delimiter
     *            The optional delimiter parameter that causes keys that contain
     *            the same string between the prefix and the first occurrence of
     *            the delimiter to be rolled up into a single result element in
     *            the {@link ObjectListing#getCommonPrefixes()} list.
     *
     * @return This {@link ListObjectsRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see ListObjectsRequest#getDelimiter()
     * @see ListObjectsRequest#setDelimiter(String)
     */
    public ListObjectsRequest withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * Gets the optional <code>maxKeys</code> parameter indicating the maximum number of keys to
     * include in the response. Amazon S3 might return fewer keys than specified, but will
     * never return more. Even if the optional parameter is not specified,
     * Amazon S3 will limit the number of results in the response.
     *
     * @return The optional parameter indicating the maximum number of keys to
     *         include in the response.
     *
     * @see ListObjectsRequest#setMaxKeys(Integer)
     * @see ListObjectsRequest#withMaxKeys(Integer)
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    /**
     * Sets the optional <code>maxKeys</code> parameter indicating the maximum number of keys to
     * include in the response.
     *
     * @param maxKeys
     *            The optional parameter indicating the maximum number of keys
     *            to include in the response.
     *
     * @see ListObjectsRequest#getMaxKeys()
     * @see ListObjectsRequest#withMaxKeys(Integer)
     */
    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * Sets the optional <code>maxKeys</code> parameter indicating the maximum number of keys to
     * include in the response.
     * Returns this {@link ListObjectsRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param maxKeys
     *            The optional parameter indicating the maximum number of keys
     *            to include in the response.
     *
     * @return This {@link ListObjectsRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see ListObjectsRequest#getMaxKeys()
     * @see ListObjectsRequest#setMaxKeys(Integer)
     */
    public ListObjectsRequest withMaxKeys(Integer maxKeys) {
        setMaxKeys(maxKeys);
        return this;
    }

    /**
     * Gets the optional <code>encodingType</code> parameter indicating the
     * encoding method to be applied on the response.
     * 
     * @return The encoding method to be applied on the response.
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * Sets the optional <code>encodingType</code> parameter indicating the
     * encoding method to be applied on the response. An object key can contain
     * any Unicode character; however, XML 1.0 parser cannot parse some
     * characters, such as characters with an ASCII value from 0 to 10. For
     * characters that are not supported in XML 1.0, you can add this parameter
     * to request that Amazon S3 encode the keys in the response.
     * 
     * @param encodingType
     *            The encoding method to be applied on the response. Valid
     *            values: null (not encoded) or "url".
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }
    
    /**
     * Sets the optional <code>encodingType</code> parameter indicating the
     * encoding method to be applied on the response. An object key can contain
     * any Unicode character; however, XML 1.0 parser cannot parse some
     * characters, such as characters with an ASCII value from 0 to 10. For
     * characters that are not supported in XML 1.0, you can add this parameter
     * to request that Amazon S3 encode the keys in the response. 
     * Returns this {@link ListObjectsRequest}, enabling additional method calls
     * to be chained together.
     * 
     * @param encodingType
     *            The encoding method to be applied on the response. Valid
     *            values: null (not encoded) or "url".
     */
    public ListObjectsRequest withEncodingType(String encodingType) {
        setEncodingType(encodingType);
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
     * updated ListObjectsRequest object so that additional method calls can be
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
     * @return The updated ListObjectsRequest object.
     */
    public ListObjectsRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

}
