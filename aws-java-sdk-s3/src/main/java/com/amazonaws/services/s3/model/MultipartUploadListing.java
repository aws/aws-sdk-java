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

/**
 * The ListMultipartUploadsResponse contains all the information about the
 * ListMultipartUploads method.
 */
public class MultipartUploadListing implements Serializable {

    /**
     * The name of the bucket containing the listed multipart uploads, as
     * specified in the original request.
     */
    private String bucketName;

    /**
     * The optional key marker specified in the original request to specify
     * where in the results to begin listing multipart uploads.
     */
    private String keyMarker;

    /**
     * The optional delimiter specified in the original request to control how
     * multipart uploads for keys with common prefixes are condensed.
     */
    private String delimiter;

	/**
	 * The optional prefix specified in the original request to limit the
	 * returned multipart uploads to those for keys that match this prefix.
	 */
    private String prefix;

    /**
     * The optional upload ID marker specified in the original request to
     * specify where in the results to begin listing multipart uploads.
     */
    private String uploadIdMarker;

    /**
     * The optional maximum number of uploads to be listed, as specified in the
     * original request.
     */
    private int maxUploads;

    /**
     * The encodingType parameter originally specified by the caller when this
     * multipart upload listing was returned.
     */
    private String encodingType;

    /**
     * Indicates if the listing is truncated, and additional requests need to be
     * made to get more results.
     */
    private boolean isTruncated;

    /**
     * If this listing is truncated, this is the next key marker that should be
     * used in the next request to get the next page of results.
     */
    private String nextKeyMarker;

    /**
     * If this listing is truncated, this is the next upload ID marker that
     * should be used in the next request to get the next page of results.
     */
    private String nextUploadIdMarker;

    /** The list of multipart uploads. */
    private List<MultipartUpload> multipartUploads;

    /**
     * A list of the common prefixes included in this multipart upload listing - common
     * prefixes will only be populated for requests that specified a delimiter, and indicate
     * additional key prefixes that contain more multipart uploads that have not been included
     * in this listing.
     */
    private List<String> commonPrefixes = new ArrayList<String>();


    /**
     * Returns the name of the bucket containing the listed multipart uploads,
     * as specified in the original request.
     *
     * @return The name of the bucket containing the listed multipart uploads,
     *         as specified in the original request.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the listed multipart uploads, as
     * specified in the original request.
     *
     * @param bucketName
     *            The name of the bucket containing the listed multipart
     *            uploads, as specified in the original request.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Returns the optional key marker specified in the original request to
     * specify where in the results to begin listing multipart uploads.
     *
     * @return The optional key marker specified in the original request to
     *         specify where in the results to begin listing multipart uploads.
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * Sets the optional key marker specified in the original request to specify
     * where in the results to begin listing multipart uploads.
     *
     * @param keyMarker
     *            The optional key marker specified in the original request to
     *            specify where in the results to begin listing multipart
     *            uploads.
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * Returns the optional upload ID marker specified in the original request
     * to specify where in the results to begin listing multipart uploads.
     *
     * @return The optional upload ID marker specified in the original request
     *         to specify where in the results to begin listing multipart
     *         uploads.
     */
    public String getUploadIdMarker() {
        return uploadIdMarker;
    }

    /**
     * Sets the optional upload ID marker specified in the original request to
     * specify where in the results to begin listing multipart uploads.
     *
     * @param uploadIdMarker
     *            The optional upload ID marker specified in the original
     *            request to specify where in the results to begin listing
     *            multipart uploads.
     */
    public void setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
    }

    /**
     * Returns the next key marker that should be used in the next request to
     * get the next page of results. This value is only valid if
     * {@link #isTruncated()} indicates this listing is truncated.
     *
     * @return the next key marker that should be used in the next request to
     *         get the next page of results. This value is only valid if
     *         {@link #isTruncated()} indicates this listing is truncated.
     */
    public String getNextKeyMarker() {
        return nextKeyMarker;
    }

    /**
     * Sets the next key marker that should be used in the next request to get
     * the next page of results.
     *
     * @param nextKeyMarker
     *            the next key marker that should be used in the next request to
     *            get the next page of results.
     */
    public void setNextKeyMarker(String nextKeyMarker) {
        this.nextKeyMarker = nextKeyMarker;
    }

    /**
     * Returns the next upload ID marker that should be used in the next request
     * to get the next page of results. This value is only valid if
     * {@link #isTruncated()} indicates this listing is truncated.
     *
     * @return the next upload ID marker that should be used in the next request
     *         to get the next page of results.
     */
    public String getNextUploadIdMarker() {
        return nextUploadIdMarker;
    }

    /**
     * Sets the next upload ID marker that should be used in the next request to
     * get the next page of results.
     *
     * @param nextUploadIdMarker
     *            The next upload ID marker that should be used in the next
     *            request to get the next page of results.
     */
    public void setNextUploadIdMarker(String nextUploadIdMarker) {
        this.nextUploadIdMarker = nextUploadIdMarker;
    }

    /**
     * Returns the optional maximum number of uploads to be listed, as specified
     * in the original request.
     *
     * @return The optional maximum number of uploads to be listed, as specified
     *         in the original request.
     */
    public int getMaxUploads() {
        return maxUploads;
    }

    /**
     * Sets the optional maximum number of uploads to be listed, as specified in
     * the original request.
     *
     * @param maxUploads
     *            The optional maximum number of uploads to be listed, as
     *            specified in the original request.
     */
    public void setMaxUploads(int maxUploads) {
        this.maxUploads = maxUploads;
    }

    /**
     * Gets the encoding type used by Amazon S3 to encode object key names in
     * the XML response. If you specify <code>encodingType</code> request
     * parameter, Amazon S3 includes this element in the response, and returns
     * encoded key name values in the following response elements:
     * <code>Delimiter, KeyMarker, Prefix, NextKeyMarker, Key</code>.
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
     * Returns true if the listing is truncated, and additional requests need to
     * be made to get more results.
     *
     * @return true if the listing is truncated, and additional requests need to
     *         be made to get more results.
     */
    public boolean isTruncated() {
        return isTruncated;
    }

    /**
     * Sets whether this listing is truncated, and additional requests need to
     * be made to get more results.
     *
     * @param isTruncated
     *            true if the listing is truncated, and additional requests need
     *            to be made to get more results.
     */
    public void setTruncated(boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * Returns the list of multipart uploads.
     *
     * @return The list of multipart uploads.
     */
    public List<MultipartUpload> getMultipartUploads() {
        if (multipartUploads == null) multipartUploads = new ArrayList<MultipartUpload>();
        return multipartUploads;
    }

    /**
     * Sets the list of multipart uploads.
     *
     * @param multipartUploads
     *            The list of multipart uploads.
     */
    public void setMultipartUploads(List<MultipartUpload> multipartUploads) {
        this.multipartUploads = multipartUploads;
    }

    /**
     * <p>
     * Returns the common prefixes included in this multipart upload listing. Common
     * prefixes are only present if a delimiter was specified in the original
     * request.
     * </p>
     * <p>
     * Each common prefix represents a set of keys in the S3 bucket that have
     * been condensed and omitted from the multipart upload listing results. This allows
     * applications to organize and browse their multipart uploads hierarchically,
     * similar to how a file system organizes files into directories.
     * </p>
     * <p>
     * For example, consider a bucket that contains the following keys currently
     * involved in multipart uploads:
     * <ul>
     *  <li>"foo/bar/baz"</li>
     *  <li>"foo/bar/bash"</li>
     *  <li>"foo/bar/bang"</li>
     *  <li>"foo/boo"</li>
     * </ul>
     * If calling <code>listMultipartUploads</code> with the prefix="foo/" and the delimiter="/" on
     * this bucket, the returned <code>MultipartUploadListing</code>
     * will contain one entry in the common
     * prefixes list ("foo/bar/") and none of the uploads for the keys beginning with that
     * common prefix will be included in the multipart upload list.
     *
     * @return The list of common prefixes included in this multipart object listing,
     *         which might be an empty list if no common prefixes were found.
     */
    public List<String> getCommonPrefixes() {
        return commonPrefixes;
    }

	/**
	 * For internal use only. Sets the common prefixes for this multipart upload
	 * listing, representing the uploads for key prefixes that were rolled up
	 * because of the request's delimiter parameter.
	 *
	 * @param commonPrefixes
	 *            The common prefixes for this multipart upload listing.
	 */
    public void setCommonPrefixes(List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
    }

	/**
	 * Gets the delimiter parameter originally used to request this multipart
	 * upload listing, or <code>null</code> if no delimiter specified.
	 * <p>
	 * The delimiter value allows callers to condense multipart uploads for keys
	 * with common prefixes. For example, if a caller specifies a delimiter of
	 * "/" (a commonly used value for delimiter), any multipart uploads for keys
	 * that contain a common prefix between the start of the key and the first
	 * occurrence of "/" will not be included in the list of multipart uploads.
	 * Instead, the common prefixes list will have one entry for the common
	 * prefix.
	 * </p>
	 *
	 * @return The delimiter parameter originally used to request this multipart
	 *         upload listing. Returns <code>null</code> if no delimiter was
	 *         specified.
	 */
    public String getDelimiter() {
        return delimiter;
    }

	/**
	 * For internal use only. Sets the delimiter parameter originally used to
	 * request this multipart upload listing.
	 *
	 * @param delimiter
	 *            The delimiter parameter originally used to request this
	 *            multipart upload listing.
	 */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

	/**
	 * Returns the prefix parameter originally used to request this multipart
	 * upload listing, or <code>null</code> if no prefix was specified. All
	 * objects and common prefixes included in this multipart upload listing
	 * start with the specified prefix.
	 *
	 * @return The prefix parameter originally used to request this multipart upload
	 *         listing. Returns <code>null</code> if no prefix was specified.
	 */
    public String getPrefix() {
        return prefix;
    }

	/**
	 * For internal use only. Sets the prefix parameter originally used to
	 * request this multipart upload listing.
	 *
	 * @param prefix
	 *            The prefix parameter originally used to request this multipart
	 *            upload listing.
	 */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
