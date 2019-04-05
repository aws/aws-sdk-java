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
 * Contains the results of listing the objects in an Amazon S3 bucket.
 * This includes
 * a list of {@link S3ObjectSummary} objects describing the objects stored in
 * the bucket, a list of common prefixes if a delimiter was specified in the
 * request, information describing if this is a complete or partial
 * listing, and the original request parameters.
 * 
 * @see AmazonS3#listObjects(String, String)
 * @see AmazonS3#listObjects(ListObjectsRequest)
 * @see AmazonS3#listNextBatchOfObjects(ObjectListing)
 */
public class ObjectListing implements Serializable {
    
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
     * The encodingType parameter originally specified by the caller when this
     * object listing was returned.
     */
    private String encodingType;


    /**
     * Gets the list of object summaries describing the objects stored in the
     * S3 bucket. Listings for large buckets can be
     * truncated for performance reasons.  Always check the
     * {@link ObjectListing#isTruncated()} method to see if the returned
     * listing is complete or if additional calls are needed to get
     * more results. Callers might need to make
     * additional calls to
     * {@link AmazonS3#listNextBatchOfObjects(ObjectListing)} to get
     * additional results.
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

    /**
     * Gets the marker to use in the next <code>listObjects</code>
     * request in order to see
     * the next page of results. 
     * If an object listing is not truncated, this
     * method will return <code>null</code>. For
     * truncated requests, this value is equal to the greatest
     * lexicographical value of the object keys and common prefixes included
     * in this listing.
     * 
     * @return The marker to use in the next <code>listObjects</code> request in order to see
     *         the next page of results if this object listing is truncated.
     *         Returns <code>null</code> if this object listing isn't truncated.
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * For internal use only. Sets the marker to use in the
     * next list objects request in order to see the next page of results for a
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
     * Gets the name of the Amazon S3 bucket containing the objects listed in
     * this {@link ObjectListing}.
     * 
     * @return The name of the Amazon S3 bucket containing the objects listed in
     *         this {@link ObjectListing}.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * For internal use only.  
     * Sets the name of the Amazon S3
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
     * Gets the marker parameter originally used to request this object listing, or
     * <code>null</code> if no marker was specified. 
     * If specified, all objects and common
     * prefixes included in this object listing will occur
     * alphabetically after the specified marker.
     * 
     * @return The marker parameter originally used to request this object
     *         listing. Returns <code>null</code> if no marker was specified.
     */
    public String getMarker() {
        return marker;
    }

    /**
     * For internal use only. 
     * Sets the marker parameter
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
     * Gets the <code>maxKeys</code> parameter originally used to request this object
     * listing, or the default <code>maxKeys</code> value provided by Amazon S3 if the
     * requester didn't specify a value. The <code>maxKeys</code> parameter limits the
     * combined number of objects and common prefixes included in this object
     * listing. An object listing will never contain more objects plus common
     * prefixes than indicated by the <code>maxKeys</code>, but can of course contain less.
     * 
     * @return The <code>maxKeys</code> parameter originally used to request this object
     *         listing. Returns the default <code>maxKeys</code> value applied by Amazon S3 if
     *         no value was specified.
     */
    public int getMaxKeys() {
        return maxKeys;
    }

    /**
     * For internal use only. 
     * Sets the <code>maxKeys</code> parameter
     * originally used to request this object listing, or the default maxKeys
     * applied by Amazon S3 if the requester didn't specify a value.
     * 
     * @param maxKeys
     *            The <code>maxKeys</code> parameter originally used to request this object
     *            listing, or the default <code>maxKeys</code> value applied by Amazon S3 if
     *            the requester didn't specify a value.
     */
    public void setMaxKeys(int maxKeys) {
        this.maxKeys = maxKeys;
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

}
