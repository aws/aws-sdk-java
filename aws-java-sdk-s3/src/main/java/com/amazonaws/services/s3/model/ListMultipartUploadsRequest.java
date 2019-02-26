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
import com.amazonaws.services.s3.AmazonS3;

/**
 * Container for the parameters of the ListMultipartUploads operation.
 * <p>
 * Required Parameters: BucketName
 *
 * @see AmazonS3#listMultipartUploads(ListMultipartUploadsRequest)
 */
public class ListMultipartUploadsRequest extends AmazonWebServiceRequest implements Serializable {

    /** The name of the bucket containing the uploads to list. */
    private String bucketName;

	/**
	 * Optional parameter that causes multipart uploads for keys that contain
	 * the same string between the prefix and the first occurrence of the
	 * delimiter to be rolled up into a single result element in the
	 * {@link MultipartUploadListing#getCommonPrefixes()} list. These rolled-up
	 * keys are not returned elsewhere in the response. The most commonly used
	 * delimiter is "/", which simulates a hierarchical organization similar to
	 * a file system directory structure.
	 */
    private String delimiter;

	/**
	 * Optional parameter restricting the response to multipart uploads for keys
	 * which begin with the specified prefix. You can use prefixes to separate a
	 * bucket into different sets of keys in a way similar to how a file system
	 * uses folders.
	 */
    private String prefix;

    /** The optional maximum number of uploads to return. */
    private Integer maxUploads;

    /**
     * The optional key marker indicating where in the results to begin listing.
     * <p>
     * Together with the upload ID marker, specifies the multipart upload after
     * which listing should begin.
     * <p>
     * If the upload ID marker is not specified, only the keys lexicographically
     * greater than the specified key-marker will be included in the list.
     * <p>
     * If the upload ID marker is specified, any multipart uploads for a key
     * equal to the key-marker may also be included, provided those multipart
     * uploads have upload IDs lexicographically greater than the specified
     * marker.
     */
    private String keyMarker;

    /**
     * The optional upload ID marker indicating where in the results to begin
     * listing.
     * <p>
     * Together with the key marker, specifies the multipart upload after which
     * listing should begin. If no key marker is specified, the upload ID marker
     * is ignored. Otherwise, any multipart uploads for a key equal to the key
     * marker may be included in the list only if they have an upload ID
     * lexicographically greater than the specified marker.
     */
    private String uploadIdMarker;
    
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
     * Constructs a new ListMultipartUploadsRequest to list the multipart
     * uploads from the specified bucket.
     *
     * @param bucketName
     *            The name of the bucket containing the uploads to list.
     */
    public ListMultipartUploadsRequest(String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * Returns the name of the bucket containing the uploads to list.
     *
     * @return The name of the bucket containing the uploads to list.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket containing the multipart uploads to list.
     *
     * @param bucketName
     *            The name of the bucket containing the uploads to list.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets The name of the bucket containing the uploads to list, and returns
     * this updated ListMultipartUploadsRequest object so that additional method
     * calls can be chained together.
     *
     * @param bucketName
     *            The name of the bucket containing the uploads to list.
     *
     * @return This updated ListMultipartUploadsRequest object.
     */
    public ListMultipartUploadsRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Returns the optional maximum number of uploads to return, or null if no
     * maximum number of uploads has been set for this request.
     *
     * @return The optional maximum number of uploads to return.
     */
    public Integer getMaxUploads() {
        return maxUploads;
    }

    /**
     * Sets the optional maximum number of uploads to return.
     *
     * @param maxUploads
     *            The maximum number of uploads to return.
     */
    public void setMaxUploads(Integer maxUploads) {
        this.maxUploads = maxUploads;
    }

    /**
     * Sets the optional maximum number of uploads to return and returns this
     * updated ListMultipartUploadsRequest object so that additional method
     * calls can be chained together.
     *
     * @param maxUploadsInt
     *            The optional maximum number of uploads to return.
     *
     * @return This updated ListMultipartUploadsRequest object.
     */
    public ListMultipartUploadsRequest withMaxUploads(int maxUploadsInt) {
        this.maxUploads = maxUploadsInt;
        return this;
    }

    /**
     * Returns the optional key marker indicating where in the results to begin
     * listing.
     * <p>
     * Together with the upload ID marker, specifies the multipart upload after
     * which listing should begin.
     * <p>
     * If the upload ID marker is not specified, only the keys lexicographically
     * greater than the specified key-marker will be included in the list.
     * <p>
     * If the upload ID marker is specified, any multipart uploads for a key
     * equal to the key-marker may also be included, provided those multipart
     * uploads have upload IDs lexicographically greater than the specified
     * marker.
     *
     * @return The optional key marker indicating where in the results to begin
     *         listing.
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * Sets the optional key marker indicating where in the results to begin
     * listing.
     * <p>
     * Together with the upload ID marker, specifies the multipart upload after
     * which listing should begin.
     * <p>
     * If the upload ID marker is not specified, only the keys lexicographically
     * greater than the specified key-marker will be included in the list.
     * <p>
     * If the upload ID marker is specified, any multipart uploads for a key
     * equal to the key-marker may also be included, provided those multipart
     * uploads have upload IDs lexicographically greater than the specified
     * marker.
     *
     * @param keyMarker
     *            The optional key marker indicating where in the results to
     *            begin listing.
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * Sets the KeyMarker property for this request.
     *
     * @param keyMarker
     *            The value that KeyMarker is set to
     * @return the request with the KeyMarker set
     */
    public ListMultipartUploadsRequest withKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }

    /**
     * Returns the optional upload ID marker indicating where in the results to
     * begin listing.
     * <p>
     * Together with the key marker, specifies the multipart upload after which
     * listing should begin. If no key marker is specified, the upload ID marker
     * is ignored. Otherwise, any multipart uploads for a key equal to the key
     * marker may be included in the list only if they have an upload ID
     * lexicographically greater than the specified marker.
     *
     * @return The optional upload ID marker indicating where in the results to
     *         begin listing.
     */
    public String getUploadIdMarker() {
        return uploadIdMarker;
    }

    /**
     * Sets the optional upload ID marker indicating where in the results to
     * begin listing.
     * <p>
     * Together with the key marker, specifies the multipart upload after which
     * listing should begin. If no key marker is specified, the upload ID marker
     * is ignored. Otherwise, any multipart uploads for a key equal to the key
     * marker may be included in the list only if they have an upload ID
     * lexicographically greater than the specified marker.
     *
     * @param uploadIdMarker
     *            The optional upload ID marker indicating where in the results
     *            to begin listing.
     */
    public void setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
    }

    /**
     * Sets the optional upload ID marker indicating where in the results to
     * begin listing and returns this updated ListMultipartUploadsRequest object
     * so that additional methods can be chained together.
     * <p>
     * Together with the key marker, specifies the multipart upload after which
     * listing should begin. If no key marker is specified, the upload ID marker
     * is ignored. Otherwise, any multipart uploads for a key equal to the key
     * marker may be included in the list only if they have an upload ID
     * lexicographically greater than the specified marker.
     *
     * @param uploadIdMarker
     *            The optional upload ID marker indicating where in the results
     *            to begin listing.
     *
     * @return This updated ListMultipartUploadsRequest object.
     */
    public ListMultipartUploadsRequest withUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
        return this;
    }

	/**
	 * Returns the optional delimiter parameter that causes multipart uploads for
	 * keys that contain the same string between the prefix and the first
	 * occurrence of the delimiter to be combined into a single result element
	 * in the {@link MultipartUploadListing#getCommonPrefixes()} list. These
	 * combined keys are not returned elsewhere in the response. The most
	 * commonly used delimiter is "/", which simulates a hierarchical
	 * organization similar to a file system directory structure.
	 *
	 * @return The optional delimiter parameter that causes multipart uploads
	 *         for keys that contain the same string between the prefix and the
	 *         first occurrence of the delimiter to be combined into a single
	 *         result element in the {@link MultipartUploadListing#getCommonPrefixes()}
	 *         list.
	 */
    public String getDelimiter() {
        return delimiter;
    }

	/**
	 * Sets the optional delimiter parameter that causes multipart uploads for
	 * keys that contain the same string between the prefix and the first
	 * occurrence of the delimiter to be combined into a single result element
	 * in the {@link MultipartUploadListing#getCommonPrefixes()} list.
	 *
	 * @param delimiter
	 *            The optional delimiter parameter that causes multipart uploads
	 *            for keys that contain the same string between the prefix and
	 *            the first occurrence of the delimiter to be combined into a
	 *            single result element in the
	 *            {@link MultipartUploadListing#getCommonPrefixes()} list.
	 */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

	/**
	 * Sets the optional delimiter parameter that causes multipart uploads for
	 * keys that contain the same string between the prefix and the first
	 * occurrence of the delimiter to be rolled up into a single result element
	 * in the {@link MultipartUploadListing#getCommonPrefixes()} list. Returns
	 * this {@link ListMultipartUploadsRequest}, enabling additional method
	 * calls to be chained together.
	 *
	 * @param delimiter
	 *            The optional delimiter parameter that causes multipart uploads
	 *            for keys that contain the same string between the prefix and
	 *            the first occurrence of the delimiter to be rolled up into a
	 *            single result element in the
	 *            {@link MultipartUploadListing#getCommonPrefixes()} list.
	 *
	 * @return This {@link ListMultipartUploadsRequest}, enabling additional
	 *         method calls to be chained together.
	 */
    public ListMultipartUploadsRequest withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

	/**
	 * Returns the optional prefix parameter that restricts the response to
	 * multipart uploads for keys that begin with the specified prefix. Use
	 * prefixes to separate a bucket into different sets of keys, similar to how
	 * a file system organizes files into directories.
	 *
	 * @return The optional prefix parameter restricting the response to
	 *         multipart uploads for keys that begin with the specified prefix.
	 */
    public String getPrefix() {
        return prefix;
    }

	/**
	 * Sets the optional prefix parameter, restricting the response to multipart
	 * uploads for keys that begin with the specified prefix.
	 *
	 * @param prefix
	 *            The optional prefix parameter, restricting the response to
	 *            multipart uploads for keys that begin with the specified
	 *            prefix.
	 */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

	/**
	 * Sets the optional prefix parameter restricting the response to multipart
	 * uploads for keys that begin with the specified prefix. Returns this
	 * {@link ListMultipartUploadsRequest}, enabling additional method calls to
	 * be chained together.
	 *
	 * @param prefix
	 *            The optional prefix parameter restricting the response to
	 *            multipart uploads for keys that begin with the specified
	 *            prefix.
	 *
	 * @return This {@link ListMultipartUploadsRequest}, enabling additional
	 *         method calls to be chained together.
	 */
    public ListMultipartUploadsRequest withPrefix(String prefix) {
        setPrefix(prefix);
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
     * Returns this {@link ListMultipartUploadsRequest}, enabling additional method calls
     * to be chained together.
     * 
     * @param encodingType
     *            The encoding method to be applied on the response. Valid
     *            values: null (not encoded) or "url".
     */
    public ListMultipartUploadsRequest withEncodingType(String encodingType) {
        setEncodingType(encodingType);
        return this;
    }

}
