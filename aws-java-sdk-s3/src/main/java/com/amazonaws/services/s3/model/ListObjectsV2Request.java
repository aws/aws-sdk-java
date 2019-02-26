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

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;

/**
 * Request to retrieve a listing of objects in an S3 bucket.
 */
public class ListObjectsV2Request extends AmazonWebServiceRequest implements Serializable {

    /** The name of the Amazon S3 bucket to list. */
    private String bucketName;

    /**
     * Optional parameter that causes keys that contain the same string between
     * the prefix and the first occurrence of the delimiter to be rolled up into
     * a single result element in the
     * {@link ListObjectsV2Result#getCommonPrefixes()} list. These rolled-up keys
     * are not returned elsewhere in the response. The most commonly used
     * delimiter is "/", which simulates a hierarchical organization similar to
     * a file system directory structure.
     */
    private String delimiter;

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
     * Optional parameter indicating the maximum number of keys to include in
     * the response. Amazon S3 might return fewer than this, but will not return
     * more. Even if maxKeys is not specified, Amazon S3 will limit the number
     * of results in the response.
     */
    private Integer maxKeys;

    /**
     * Optional parameter restricting the response to keys which begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different sets of keys in a way similar to how a file system uses
     * folders.
     */
    private String prefix;

    /**
     * Optional parameter which allows list to be continued from a specific point.
     * ContinuationToken is provided in truncated list results.
     */
    private String continuationToken;

    /**
     * The owner field is not present in ListObjectsV2 results by default. If this flag is
     * set to true the owner field will be included.
     */
    private boolean fetchOwner;

    /**
     * Optional parameter indicating where you want Amazon S3 to start the object listing
     * from.  This can be any key in the bucket.
     */
    private String startAfter;

    /**
     * If enabled, the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    /**
     * Gets the name of the Amazon S3 bucket whose
     * objects are to be listed.
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
     * Sets the name of the Amazon S3 bucket whose objects are to be listed.
     * Returns this {@link ListObjectsV2Request}, enabling additional method
     * calls to be chained together.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose objects are to be
     *            listed.
     *
     * @return This {@link ListObjectsV2Request}, enabling additional method
     *         calls to be chained together.
     */
    public ListObjectsV2Request withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the optional delimiter parameter that causes keys that contain
     * the same string between the prefix and the first occurrence of the
     * delimiter to be combined into a single result element in the
     * {@link ListObjectsV2Result#getCommonPrefixes()} list. These combined keys
     * are not returned elsewhere in the response. The most commonly used
     * delimiter is "/", which simulates a hierarchical organization similar to
     * a file system directory structure.
     *
     * @return The optional delimiter parameter that causes keys that contain
     *         the same string between the prefix and the first occurrence of
     *         the delimiter to be combined into a single result element in the
     *         {@link ListObjectsV2Result#getCommonPrefixes()} list.
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the optional delimiter parameter that causes keys that contain the
     * same string between the prefix and the first occurrence of the delimiter
     * to be combined into a single result element in the
     * {@link ListObjectsV2Result#getCommonPrefixes()} list.
     *
     * @param delimiter
     *            The optional delimiter parameter that causes keys that contain
     *            the same string between the prefix and the first occurrence of
     *            the delimiter to be combined into a single result element in
     *            the {@link ListObjectsV2Result#getCommonPrefixes()} list.
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Sets the optional delimiter parameter that causes keys that contain the
     * same string between the prefix and the first occurrence of the delimiter
     * to be rolled up into a single result element in the
     * {@link ListObjectsV2Result#getCommonPrefixes()} list.
     * Returns this {@link ListObjectsRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param delimiter
     *            The optional delimiter parameter that causes keys that contain
     *            the same string between the prefix and the first occurrence of
     *            the delimiter to be rolled up into a single result element in
     *            the {@link ListObjectsV2Result#getCommonPrefixes()} list.
     *
     * @return This {@link ListObjectsRequest}, enabling additional method
     *         calls to be chained together.
     */
    public ListObjectsV2Request withDelimiter(String delimiter) {
        setDelimiter(delimiter);
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
     * Returns this {@link ListObjectsV2Request}, enabling additional method calls
     * to be chained together.
     *
     * @param encodingType
     *            The encoding method to be applied on the response. Valid
     *            values: null (not encoded) or "url".
     */
    public ListObjectsV2Request withEncodingType(String encodingType) {
        setEncodingType(encodingType);
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
     */
    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * Sets the optional <code>maxKeys</code> parameter indicating the maximum number of keys to
     * include in the response.
     * Returns this {@link ListObjectsV2Request}, enabling additional method
     * calls to be chained together.
     *
     * @param maxKeys
     *            The optional parameter indicating the maximum number of keys
     *            to include in the response.
     *
     * @return This {@link ListObjectsV2Request}, enabling additional method
     *         calls to be chained together.
     *
     * @see ListObjectsV2Request#getMaxKeys()
     * @see ListObjectsV2Request#setMaxKeys(Integer)
     */
    public ListObjectsV2Request withMaxKeys(Integer maxKeys) {
        setMaxKeys(maxKeys);
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
     * @see ListObjectsV2Request#setPrefix(String)
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
     * @see ListObjectsV2Request#getPrefix()
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets the optional prefix parameter restricting the response to keys that
     * begin with the specified prefix.
     * Returns this {@link ListObjectsV2Request}, enabling additional method
     * calls to be chained together.
     *
     * @param prefix
     *            The optional prefix parameter restricting the response to keys
     *            that begin with the specified prefix.
     *
     * @return This {@link ListObjectsV2Request}, enabling additional method
     *         calls to be chained together.
     *
     * @see ListObjectsV2Request#getPrefix()
     * @see ListObjectsV2Request#setPrefix(String)
     */
    public ListObjectsV2Request withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
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
     * Sets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     *
     * @param continuationToken
     *                     The optional continuation token to associate with this request.
     *
     * @return This {@link ListObjectsV2Request}, enabling additional method
     *         calls to be chained together.
     */
    public ListObjectsV2Request withContinuationToken(String continuationToken) {
        setContinuationToken(continuationToken);
        return this;
    }

    /**
     * Returns if fetch owner is set.  The owner field is not present in ListObjectsV2
     * results by default.  If this flag is set to true the owner field will be included.

     * @return whether fetchOwner is set
     */
    public boolean isFetchOwner() { return fetchOwner; }

    /**
     * Sets the optional fetch owner flag.  The owner field is not present in ListObjectsV2
     * results by default.  If this flag is set to true the owner field will be included.

     * @param fetchOwner
     *               Set to true if the owner field should be included in results
     */
    public void setFetchOwner(boolean fetchOwner) { this.fetchOwner = fetchOwner; }

    /**
     * Sets the optional fetch owner flag.  The owner field is not present in ListObjectsV2
     * results by default.  If this flag is set to true the owner field will be included.

     * @param fetchOwner
     *               Set to true if the owner field should be included in results
     *
     * @return This {@link ListObjectsV2Request}, enabling additional method
     *         calls to be chained together.
     */
    public ListObjectsV2Request withFetchOwner(boolean fetchOwner) {
        setFetchOwner(fetchOwner);
        return this;
    }

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
     * Sets the optional parameter indicating where you want Amazon S3 to start the object
     * listing from.  This can be any key in the bucket.
     *
     * @param startAfter
     *                The optional startAfter parameter.  This can be any key in the bucket.
     *
     * @return This {@link ListObjectsV2Request}, enabling additional method
     *         calls to be chained together.
     */
    public ListObjectsV2Request withStartAfter(String startAfter) {
        setStartAfter(startAfter);
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
     * updated ListObjectsV2Request object so that additional method calls can be
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
     * @return The updated ListObjectsV2Request object.
     */
    public ListObjectsV2Request withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }
}
