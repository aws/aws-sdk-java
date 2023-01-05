/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.event.ProgressListener;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * <p>Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object. If you
 * grant <code>READ</code> access to the anonymous user, you can return the object without using an authorization header.</p>
 *
 * <p>An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can, however,
 * create a logical hierarchy by using object key names that imply a folder structure. For example, instead of naming an object
 * <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.</p>
 *
 * <p>To get an object from such a \ logical hierarchy, specify the full key name for the object in the <code>GET</code>
 * operation. For a virtual hosted-style request example, if you have the object <code>photos/2006/February/sample.jpg</code>,
 * specify the resource as <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the
 * object <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource as
 * <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see
 * <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket\">HTTP Host Header
 * Bucket Specification</a>.</p>
 *
 * <p>To distribute large files to many people, you can save bandwidth costs by using BitTorrent. For more information, see
 * <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html\">Amazon S3 Torrent</a>. For more information about
 * returning the ACL of an object, see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html\">
 * GetObjectAcl</a>.</p>
 *
 * <p>If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3 Intelligent-
 * Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you must first restore a copy
 * using <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html\">RestoreObject</a>. Otherwise, this
 * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects, see
 * <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html\">Restoring Archived Objects</a>.</p>
 *
 * <p>Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests if your
 * object uses server-side encryption with CMKs stored in Amazon Web Services KMS (SSE-KMS) or server-side encryption with Amazon
 * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400 BadRequest error.</p>
 *
 * <p>If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you store the
 * object in Amazon S3, then when you GET the object, you must use the following headers:</p>
 *
 * <ul>
 *     <li> <p>x-amz-server-side-encryption-customer-algorithm</p> </li>
 *     <li> <p>x-amz-server-side-encryption-customer-key</p> </li>
 *     <li> <p>x-amz-server-side-encryption-customer-key-MD5</p> </li>
 * </ul>
 *
 * <p>For more information about SSE-C, see
 * <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html\">Server-Side Encryption
 * (Using Customer-Provided Encryption Keys)</a>.</p> <p>Assuming you have the relevant permission to read object tags, the
 * response also returns the <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with
 * the object. You can use <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html\">GetObjectTagging
 * </a> to retrieve the tag set associated with an object.</p>
 *
 * <p> <b>Permissions</b> </p>
 *
 * <p>You need the relevant read object (or version) permission for this operation. For more information,
 * see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html\">Specifying Permissions in a
 * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also have the
 * <code>s3:ListBucket</code> permission.</p>
 *
 * <ul>
 *     <li> <p>If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
 *     404 (\"no such key\") error.</p> </li>
 *     <li> <p>If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
 *     (\"access denied\") error.</p> </li>
 * </ul>
 *
 * <p> <b>Versioning</b> </p>
 *
 * <p>By default, the GET action returns the current version of an object. To return a different version, use the
 * <code>versionId</code> subresource.</p>
 *
 * <note>
 *     <ul>
 *         <li> <p>You need the <code>s3:GetObjectVersion</code> permission to access a specific version of an object. </p> </li>
 *         <li> <p>If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
 *         includes <code>x-amz-delete-marker: true</code> in the response.</p> </li>
 *     </ul>
 * </note>
 *
 * <p>For more information about versioning, see
 * <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html\">PutBucketVersioning</a>. </p>
 *
 * <p> <b>Overriding Response Header Values</b> </p>
 *
 *<p>There are times when you want to override certain response header values in a GET response. For example, you might
 * override the Content-Disposition response header value in your GET request.</p> <p>You can override values for a set of
 * response headers using the following query parameters. These response header values are sent only on a successful request,
 * that is, when status code 200 OK is returned. The set of headers you can override using these parameters is a subset of the
 * headers that Amazon S3 accepts when you create an object. The response headers that you can override for the GET response
 * are <code>Content-Type</code>, <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>,
 * <code>Content-Disposition</code>, and <code>Content-Encoding</code>. To override these header values in the GET response, you
 * use the following request parameters.</p>
 *
 * <note>
 *     <p>You must sign the request, either using an Authorization header or a presigned URL, when using these parameters. They
 *     cannot be used with an unsigned (anonymous) request.</p>
 * </note>
 *
 * <ul>
 *     <li> <p> <code>response-content-type</code> </p> </li>
 *     <li> <p> <code>response-content-language</code> </p> </li>
 *     <li> <p> <code>response-expires</code> </p> </li>
 *     <li> <p> <code>response-cache-control</code> </p>
 *     </li> <li> <p> <code>response-content-disposition</code> </p> </li>
 *     <li> <p> <code>response-content-encoding</code> </p> </li>
 * </ul>
 *
 * <p> <b>Additional Considerations about Request Headers</b> </p>
 *
 * <p>If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
 * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code> condition
 * evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested. </p>
 *
 * <p>If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request as
 * follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and; <code>If-Modified-Since</code> condition
 * evaluates to <code>true</code>; then, S3 returns 304 Not Modified response code.</p> <p>For more information about conditional
 * requests, see <a href=\"https://tools.ietf.org/html/rfc7232\">RFC 7232</a>.</p> <p>The following operations are related to
 * <code>GetObject</code>:</p>
 *
 * <ul>
 *     <li> <p> <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html\">ListBuckets</a> </p> </li>
 *     <li> <p> <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html\">GetObjectAcl</a> </p> </li>
 * </ul>
 *
 * @see GetObjectRequest#GetObjectRequest(String, String)
 * @see GetObjectRequest#GetObjectRequest(String, String, String)
 * @see GetObjectMetadataRequest
 */
public class GetObjectRequest extends AmazonWebServiceRequest implements
        SSECustomerKeyProvider, Serializable, ExpectedBucketOwnerRequest {
    /**
     * Builder of an S3 object identifier.  This member field is never null.
     */
    private S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();

    /** Optional member indicating the byte range of data to retrieve */
    private long[] range;

    /**
     * Optional list of ETag values that constrain this request to only be
     * executed if the object's ETag matches one of the specified ETag values.
     */
    private List<String> matchingETagConstraints = new ArrayList<String>();

    /**
     * Optional list of ETag values that constrain this request to only be
     * executed if the object's ETag does not match any of the specified ETag
     * constraint values.
     */
    private List<String> nonmatchingEtagConstraints = new ArrayList<String>();

    /**
     * Optional field that constrains this request to only be executed if the
     * object has not been modified since the specified date.
     */
    private Date unmodifiedSinceConstraint;

    /**
     * Optional field that constrains this request to only be executed if the
     * object has been modified since the specified date.
     */
    private Date modifiedSinceConstraint;

    /**
     * Optional field that overrides headers on the response.
     */
    private ResponseHeaderOverrides responseHeaders;

    /**
     * If enabled, the requester is charged for downloading the data from
     * Requester Pays Buckets.
     */
    private boolean isRequesterPays;

    /**
     * The optional customer-provided server-side encryption key to use to
     * decrypt this object.
     */
    private SSECustomerKey sseCustomerKey;

    /**
     * The part number of the requested part in a multipart object.
     */
    private Integer partNumber;

    private String expectedBucketOwner;

    /**
     * Constructs a new {@link GetObjectRequest} with all the required parameters.
     *
     * <p>
     * When using this API with an access point, you must direct requests
     * to the access point hostname. The access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * </p>
     * <p>
     * When using this operation using an access point through the Amazon Web Services SDKs, you provide
     * the access point ARN in place of the bucket name. For more information about access point
     * ARNs, see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html\">
     * Using access points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket, or access point ARN, containing the desired object.
     * @param key
     *            The key in the specified bucket under which the object is
     *            stored.
     *
     * @see GetObjectRequest#GetObjectRequest(String, String, String)
     * @see GetObjectRequest#GetObjectRequest(String, String, boolean)
     */
    public GetObjectRequest(String bucketName, String key) {
        this(bucketName, key, null);
    }

    /**
     * Constructs a new {@link GetObjectRequest} with all the required parameters.
     *
     * <p>
     * When using this API with an access point, you must direct requests
     * to the access point hostname. The access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * </p>
     * <p>
     * When using this operation using an access point through the Amazon Web Services SDKs, you provide
     * the access point ARN in place of the bucket name. For more information about access point
     * ARNs, see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html\">
     * Using access points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket, or access point ARN, containing the desired object.
     * @param key
     *            The key in the specified bucket under which the object is
     *            stored.
     * @param versionId
     *            The Amazon S3 version ID specifying a specific version of the
     *            object to download.
     *
     * @see GetObjectRequest#GetObjectRequest(String, String)
     * @see GetObjectRequest#GetObjectRequest(String, String, boolean)
     */
    public GetObjectRequest(String bucketName, String key, String versionId) {
        setBucketName(bucketName);
        setKey(key);
        setVersionId(versionId);
    }

    public GetObjectRequest(S3ObjectId s3ObjectId) {
        this.s3ObjectIdBuilder = new S3ObjectIdBuilder(s3ObjectId);
    }

    /**
     * Constructs a new {@link GetObjectRequest} with all the required
     * parameters.
     *
     * <p>
     * When using this API with an access point, you must direct requests
     * to the access point hostname. The access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * </p>
     * <p>
     * When using this operation using an access point through the Amazon Web Services SDKs, you provide
     * the access point ARN in place of the bucket name. For more information about access point
     * ARNs, see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html\">
     * Using access points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket, or access point ARN, containing the desired object.
     * @param key
     *            The key in the specified bucket under which the object is
     *            stored.
     * @param isRequesterPays
     *            If enabled, the requester is charged for downloading the data
     *            from Requester Pays Buckets.
     *
     * @see GetObjectRequest#GetObjectRequest(String, String)
     * @see GetObjectRequest#GetObjectRequest(String, String, String)
     */
    public GetObjectRequest(String bucketName, String key,
            boolean isRequesterPays) {
        this.s3ObjectIdBuilder
            .withBucket(bucketName)
            .withKey(key)
            ;
        this.isRequesterPays = isRequesterPays;
    }

    public String getExpectedBucketOwner() {
        return expectedBucketOwner;
    }

    public GetObjectRequest withExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
        return this;
    }

    public void setExpectedBucketOwner(String expectedBucketOwner) {
        withExpectedBucketOwner(expectedBucketOwner);
    }

    /**
     * <p>
     * The bucket name containing the object.
     * </p>
     * <p>
     * When using this action with an access point, you must direct requests to the access point hostname. The access
     * point hostname takes the form <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * When using this action with an access point through the Amazon Web Services SDKs, you provide the access point
     * ARN in place of the bucket name. For more information about access point ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The
     * S3 on Outposts hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When using this
     * action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of
     * the bucket name. For more information about S3 on Outposts ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     *
     * @return The bucket name containing the object. </p>
     *         <p>
     *         When using this action with an access point, you must direct requests to the access point hostname. The
     *         access point hostname takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *         action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in
     *         place of the bucket name. For more information about access point ARNs, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access
     *         points</a> in the <i>Amazon S3 User Guide</i>.
     *         </p>
     *         <p>
     *         When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts
     *         hostname. The S3 on Outposts hostname takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When
     *         using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts
     *         bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts</a>
     *         in the <i>Amazon S3 User Guide</i>.
     *
     * @see GetObjectRequest#setBucketName(String)
     * @see GetObjectRequest#withBucketName(String)
     */
    public String getBucketName() {
        return s3ObjectIdBuilder.getBucket();
    }

    /**
     * <p>
     * The bucket name containing the object.
     * </p>
     * <p>
     * When using this action with an access point, you must direct requests to the access point hostname. The
     * access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this action
     * with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the
     * bucket name. For more information about access point ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname.
     * The S3 on Outposts hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When using
     * this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in
     * place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     *
     * @param bucketName
     *        The bucket name containing the object. </p>
     *        <p>
     *        When using this action with an access point, you must direct requests to the access point hostname.
     *        The access point hostname takes the form
     *        <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *        action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in
     *        place of the bucket name. For more information about access point ARNs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access
     *        points</a> in the <i>Amazon S3 User Guide</i>.
     *        </p>
     *        <p>
     *        When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts
     *        hostname. The S3 on Outposts hostname takes the form
     *        <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When
     *        using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts
     *        bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on
     *        Outposts</a> in the <i>Amazon S3 User Guide</i>.
     *
     * @see GetObjectRequest#getBucketName()
     * @see GetObjectRequest#withBucketName(String)
     */
    public void setBucketName(String bucketName) {
        s3ObjectIdBuilder.setBucket(bucketName);
    }

    /**
     * <p>
     * The bucket name containing the object.
     * </p>
     * <p>
     * When using this action with an access point, you must direct requests to the access point hostname. The
     * access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this action
     * with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the
     * bucket name. For more information about access point ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname.
     * The S3 on Outposts hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When using
     * this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in
     * place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     *
     * @param bucketName
     *        The bucket name containing the object. </p>
     *        <p>
     *        When using this action with an access point, you must direct requests to the access point hostname.
     *        The access point hostname takes the form
     *        <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *        action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in
     *        place of the bucket name. For more information about access point ARNs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access
     *        points</a> in the <i>Amazon S3 User Guide</i>.
     *        </p>
     *        <p>
     *        When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts
     *        hostname. The S3 on Outposts hostname takes the form
     *        <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com. When
     *        using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts
     *        bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on
     *        Outposts</a> in the <i>Amazon S3 User Guide</i>.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectRequest#getBucketName()
     * @see GetObjectRequest#setBucketName(String)
     */
    public GetObjectRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the key under which the object to be downloaded is stored.
     *
     * @return The key under which the object to be downloaded is stored.
     *
     * @see GetObjectRequest#setKey(String)
     * @see GetObjectRequest#withKey(String)
     */
    public String getKey() {
        return s3ObjectIdBuilder.getKey();
    }

    /**
     * Sets the key under which the object to be downloaded is stored.
     *
     * @param key
     *            The key under which the object to be downloaded is stored.
     *
     * @see GetObjectRequest#getKey()
     * @see GetObjectRequest#withKey(String)
     */
    public void setKey(String key) {
        s3ObjectIdBuilder.setKey(key);
    }

    /**
     * Sets the key under which the object to be downloaded is stored.
     * Returns this {@link GetObjectRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param key
     *            The key under which the object to be downloaded is stored.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectRequest#getKey()
     * @see GetObjectRequest#setKey(String)
     */
    public GetObjectRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Gets the optional version ID specifying which version of the object to
     * download. If not specified, the most recent version will be downloaded.
     * </p>
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended are given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @return The optional version ID specifying which version of the object to
     *         download. If not specified, the most recent version will be
     *         downloaded.
     *
     * @see GetObjectRequest#setVersionId(String)
     * @see GetObjectRequest#withVersionId(String)
     */
    public String getVersionId() {
        return s3ObjectIdBuilder.getVersionId();
    }

    /**
     * Sets the optional version ID specifying which version of the object to
     * download. If not specified, the most recent version will be downloaded.
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param versionId
     *            The optional version ID specifying which version of the object
     *            to download.
     *
     * @see GetObjectRequest#getVersionId()
     * @see GetObjectRequest#withVersionId(String)
     */
    public void setVersionId(String versionId) {
        s3ObjectIdBuilder.setVersionId(versionId);
    }

    /**
     * <p>
     * Sets the optional version ID specifying which version of the object to
     * download and returns this object, enabling additional method calls to be
     * chained together. If not specified, the most recent version will be
     * downloaded.
     * </p>
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default or <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param versionId
     *            The optional version ID specifying which version of the object
     *            to download.
     *
     * @return The updated request object, enabling additional method calls to be
     * chained together.
     *
     * @see GetObjectRequest#getVersionId()
     * @see GetObjectRequest#setVersionId(String)
     */
    public GetObjectRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }


    /*
     * Optional Request Parameters
     */

    /**
     * <p>
     * Gets the optional inclusive byte range within the desired object
     * that will be downloaded by this request.
     * </p>
     * <p>
     * The range is returned as
     * a two element array, containing the start and end index of the byte range.
     * If no byte range has been specified, the entire object is downloaded and
     * this method returns <code>null</code>.
     * </p>
     * @return A two element array indicating the inclusive start index and end index
     *         within the object being downloaded by this request.
     *         Returns <code>null</code> if no range has been specified,
     *         and the whole object is
     *         to be downloaded.
     *
     * @see #setRange(long, long)
     * @see #withRange(long, long)
     */
    public long[] getRange() {
        return range == null ? null : range.clone();
    }

    /**
     * <p>
     * Sets the optional inclusive byte range within the desired object that
     * will be downloaded by this request.
     * </p>
     * <p>
     * The first byte in an object has
     * position 0; as an example, the first ten bytes of an object can be
     * downloaded by specifying a range of 0 to 9.
     * </p>
     * <p>
     * If no byte range is specified, this request downloads the entire
     * object from Amazon S3.
     * </p>
     *
     * @param start
     *            The start of the inclusive byte range to download.
     * @param end
     *            The end of the inclusive byte range to download.
     *
     * @see #getRange()
     * @see #withRange(long, long)
     */
    public void setRange(long start, long end) {
        range = new long[] {start, end};
    }

    /**
     * <p>
     * Sets the optional inclusive start range within the desired object that the
     * rest of which will be downloaded by this request.
     * </p>
     * <p>
     * The first byte in an object has
     * position 0; as an example, the object is of 10 bytes in length, the last
     * 4 bytes can be downloaded by specifying the start range as 6.
     * </p>
     * <p>
     * If no byte range is specified, this request downloads the entire
     * object from Amazon S3.
     * </p>
     *
     * @param start
     *            The start of the inclusive byte range to download.
     *
     * @see #setRange(long, long)
     * @see #withRange(long)
     */
    public void setRange(long start) {
        setRange(start, Long.MAX_VALUE - 1);
    }

    /**
     * <p>
     * Sets the optional inclusive byte range within the desired object that
     * will be downloaded by this request.
     * Returns this {@link GetObjectRequest}, enabling additional method
     * calls to be chained together.
     * </p>
     * <p>
     * The first byte in an object has
     * position 0; as an example, the first ten bytes of an object can be
     * downloaded by specifying a range of 0 to 9.
     * </p>
     * <p>
     * If no byte range is specified, this request downloads the entire
     * object from Amazon S3.
     * </p>
     *
     * @param start
     *            The start of the inclusive byte range to download.
     * @param end
     *            The end of the inclusive byte range to download.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectRequest#getRange()
     * @see GetObjectRequest#setRange(long, long)
     */
    public GetObjectRequest withRange(long start, long end) {
        setRange(start, end);
        return this;
    }

    /**
     * <p>
     * Sets the optional inclusive start range within the desired object that the
     * rest of which will be downloaded by this request.
     * </p>
     * Returns this {@link GetObjectRequest}, enabling additional method
     * calls to be chained together.
     * <p>
     * The first byte in an object has
     * position 0; as an example, the object is of 10 bytes in length, the last
     * 4 bytes can be downloaded by specifying the start range as 6.
     * </p>
     * <p>
     * If no byte range is specified, this request downloads the entire
     * object from Amazon S3.
     * </p>
     *
     * @param start
     *            The start of the inclusive byte range to download.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see #withRange(long, long)
     * @see #setRange(long)
     */
    public GetObjectRequest withRange(long start) {
        setRange(start);
        return this;
    }

    /**
     * Gets the optional list of ETag constraints that, when present, <b>must</b>
     * include a match for the object's current ETag in order for this
     * request to be executed. Only one ETag in the list needs to match for this
     * request to be executed by Amazon S3.
     *
     * @return The optional list of ETag constraints that when present <b>must</b>
     *         include a match for the object's current ETag in order for this
     *         request to be executed.
     *
     * @see GetObjectRequest#setMatchingETagConstraints(List)
     * @see GetObjectRequest#withMatchingETagConstraint(String)
     */
    public List<String> getMatchingETagConstraints() {
        return matchingETagConstraints;
    }

    /**
     * Sets the optional list of ETag constraints that when present <b>must</b>
     * include a match for the object's current ETag in order for this
     * request to be executed. If none of the specified ETags match the object's
     * current ETag, this request will not be executed. Only one ETag in the
     * list needs to match for the request to be executed by Amazon S3.
     *
     * @param eTagList
     *            The optional list of ETag constraints that <b>must</b> include a
     *            match for the object's current ETag in order for this request
     *            to be executed.
     *
     * @see GetObjectRequest#getMatchingETagConstraints()
     * @see GetObjectRequest#withMatchingETagConstraint(String)
     */
    public void setMatchingETagConstraints(List<String> eTagList) {
        this.matchingETagConstraints = eTagList;
    }

    /**
     * Sets a single ETag constraint to this request.
     * Returns this {@link GetObjectRequest}, enabling additional method
     * calls to be chained together.
     * <p>
     * Multiple ETag constraints can be added to a request, but one must match the object's
     * current ETag in order for this request to be executed. If none of the
     * ETag constraints added to this request match the object's current ETag,
     * this request will not be executed by Amazon S3.
     * </p>
     *
     * @param eTag
     *            The matching ETag constraint to add to this request.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectRequest#getMatchingETagConstraints()
     * @see GetObjectRequest#setMatchingETagConstraints(List)
     */
    public GetObjectRequest withMatchingETagConstraint(String eTag) {
        this.matchingETagConstraints.add(eTag);
        return this;
    }

    /**
     * Gets the optional list of ETag constraints that when present, <b>must</b>
     * not include a match for the object's current ETag in order for this
     * request to be executed. If any entry in the non-matching ETag constraint
     * list matches the object's current ETag, this request <b>will not</b> be
     * executed by Amazon S3.
     *
     * @return The optional list of ETag constraints that when present, <b>must</b>
     *         not include a match for the object's current ETag in order
     *         for this request to be executed.
     *
     * @see GetObjectRequest#setNonmatchingETagConstraints(List)
     * @see GetObjectRequest#withNonmatchingETagConstraint(String)
     */
    public List<String> getNonmatchingETagConstraints() {
        return nonmatchingEtagConstraints;
    }

    /**
     * Sets the optional list of ETag constraints that when present <b>must</b>
     * not include a match for the object's current ETag in order for this
     * request to be executed. If any entry in the non-matching ETag constraint
     * list matches the object's current ETag, this request <b>will not</b> be
     * executed by Amazon S3.
     *
     * @param eTagList
     *            The list of ETag constraints that, when present, <b>must not</b>
     *            include a match for the object's current ETag in order for
     *            this request to be executed.
     *
     * @see GetObjectRequest#getNonmatchingETagConstraints()
     * @see GetObjectRequest#withNonmatchingETagConstraint(String)
     */
    public void setNonmatchingETagConstraints(List<String> eTagList) {
        this.nonmatchingEtagConstraints = eTagList;
    }

    /**
     * Sets a single ETag constraint to this request.
     * Returns this {@link GetObjectRequest}, enabling additional method
     * calls to be chained together.
     * <p>
     * Multiple ETag
     * constraints can be added to a request, but all ETag constraints <b>must
     * not</b> match the object's current ETag in order for this request to be
     * executed. If any entry in the non-matching ETag constraint list matches
     * the object's current ETag, this request <b>will not</b> be executed by
     * Amazon S3.
     * </p>
     *
     * @param eTag
     *            The non-matching ETag constraint to add to this request.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectRequest#getNonmatchingETagConstraints()
     * @see GetObjectRequest#setNonmatchingETagConstraints(List)
     */
    public GetObjectRequest withNonmatchingETagConstraint(String eTag) {
        this.nonmatchingEtagConstraints.add(eTag);
        return this;
    }

    /**
     * Gets the optional unmodified constraint that restricts this
     * request to executing only if the object has <b>not</b> been
     * modified after the specified date.
     *
     * @return The optional unmodified constraint that restricts this
     *         request to executing only if the object has <b>not</b>
     *         been modified after the specified date.
     *
     * @see GetObjectRequest#setUnmodifiedSinceConstraint(Date)
     * @see GetObjectRequest#withUnmodifiedSinceConstraint(Date)
     */
    public Date getUnmodifiedSinceConstraint() {
        return unmodifiedSinceConstraint;
    }

    /**
     * Sets the optional unmodified constraint that restricts this request
     * to executing only if the object has <b>not</b> been modified after
     * the specified date.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The unmodified constraint that restricts this request to
     *            executing only if the object has <b>not</b> been
     *            modified after this date.
     *
     * @see GetObjectRequest#getUnmodifiedSinceConstraint()
     * @see GetObjectRequest#withUnmodifiedSinceConstraint(Date)
     */
    public void setUnmodifiedSinceConstraint(Date date) {
        this.unmodifiedSinceConstraint = date;
    }

    /**
     * Sets the optional unmodified constraint that restricts this request
     * to executing only if the object has <b>not</b> been modified after
     * the specified date.
     * Returns this {@link GetObjectRequest}, enabling additional method
     * calls to be chained together.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The unmodified constraint that restricts this request to
     *            executing only if the object has <b>not</b> been
     *            modified after this date.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectRequest#getUnmodifiedSinceConstraint()
     * @see GetObjectRequest#setUnmodifiedSinceConstraint(Date)
     */
    public GetObjectRequest withUnmodifiedSinceConstraint(Date date) {
        setUnmodifiedSinceConstraint(date);
        return this;
    }

    /**
     * Gets the optional modified constraint that restricts this
     * request to executing only if the object <b>has</b> been
     * modified after the specified date.
     *
     * @return The optional modified constraint that restricts this
     *         request to executing only if the object <b>has</b>
     *         been modified after the specified date.
     *
     * @see GetObjectRequest#setModifiedSinceConstraint(Date)
     * @see GetObjectRequest#withModifiedSinceConstraint(Date)
     */
    public Date getModifiedSinceConstraint() {
        return modifiedSinceConstraint;
    }

    /**
     * Sets the optional modified constraint that restricts this request
     * to executing only if the object <b>has</b> been modified after the
     * specified date.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     * </p>
     *
     * @param date
     *            The modified constraint that restricts this request to
     *            executing only if the object <b>has</b> been modified
     *            after the specified date.
     *
     * @see GetObjectRequest#getModifiedSinceConstraint()
     * @see GetObjectRequest#withModifiedSinceConstraint(Date)
     */
    public void setModifiedSinceConstraint(Date date) {
        this.modifiedSinceConstraint = date;
    }

    /**
     * Sets the optional modified constraint that restricts this request
     * to executing only if the object <b>has</b> been modified after the
     * specified date.
     * Returns this {@link GetObjectRequest}, enabling additional method
     * calls to be chained together.
     * <p>
     * Note that Amazon S3 will ignore any dates occurring in the future.
     *
     * @param date
     *            The modified constraint that restricts this request to
     *            executing only if the object <b>has</b> been modified
     *            after the specified date.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectRequest#getModifiedSinceConstraint()
     * @see GetObjectRequest#setModifiedSinceConstraint(Date)
     */
    public GetObjectRequest withModifiedSinceConstraint(Date date) {
        setModifiedSinceConstraint(date);
        return this;
    }

    /**
     * Returns the headers to be overridden in the service response.
     *
     * @return the headers to be overridden in the service response.
     */
    public ResponseHeaderOverrides getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Sets the headers to be overridden in the service response.
     *
     * @param responseHeaders
     *            The headers to be overridden in the service response.
     */
    public void setResponseHeaders(ResponseHeaderOverrides responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    /**
     * Sets the headers to be overridden in the service response and returns
     * this object, for method chaining.
     *
     * @param responseHeaders
     *            The headers to be overridden in the service response.
     *
     * @return This {@link GetObjectRequest} for method chaining.
     */
    public GetObjectRequest withResponseHeaders(ResponseHeaderOverrides responseHeaders) {
        setResponseHeaders(responseHeaders);
        return this;
    }

    /**
     * Sets the optional progress listener for receiving updates about object
     * download status.
     *
     * @param progressListener
     *            The legacy progress listener that is used exclusively for Amazon S3 client.
     *
     * @deprecated use {@link #setGeneralProgressListener(ProgressListener)}
     *             instead.
     */
    @Deprecated
    public void setProgressListener(com.amazonaws.services.s3.model.ProgressListener progressListener) {
        setGeneralProgressListener(new LegacyS3ProgressListener(progressListener));
    }

    /**
     * Returns the optional progress listener for receiving updates about object
     * download status.
     *
     * @return the optional progress listener for receiving updates about object
     *          download status.
     *
     * @deprecated use {@link #getGeneralProgressListener()} instead.
     */
    @Deprecated
    public com.amazonaws.services.s3.model.ProgressListener getProgressListener() {
        ProgressListener generalProgressListener = getGeneralProgressListener();
        if (generalProgressListener instanceof LegacyS3ProgressListener) {
            return ((LegacyS3ProgressListener)generalProgressListener).unwrap();
        } else {
             return null;
        }
    }

    /**
     * Sets the optional progress listener for receiving updates about object
     * download status, and returns this updated object so that additional method
     * calls can be chained together.
     *
     * @param progressListener
     *            The legacy progress listener that is used exclusively for Amazon S3 client.
     *
     * @return This updated GetObjectRequest object.
     *
     * @deprecated use {@link #withGeneralProgressListener(ProgressListener)}
     *             instead.
     */
    @Deprecated
    public GetObjectRequest withProgressListener(com.amazonaws.services.s3.model.ProgressListener progressListener) {
        setProgressListener(progressListener);
        return this;
    }

    /**
     * Returns true if the user has enabled Requester Pays option when
     * downloading an object from Requester Pays Bucket; else false.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to read an
     * object from it without Requester Pays enabled will result in a 403 error
     * and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
     *
     * @return true if the user has enabled Requester Pays option for
     *         downloading an object from Requester Pays Bucket.
     */
    public boolean isRequesterPays() {
        return isRequesterPays;
    }

    /**
     * Used for downloading an Amazon S3 Object from a Requester Pays Bucket. If
     * set the requester is charged for downloading the data from the bucket.
     *
     * <p>
     * If a bucket is enabled for Requester Pays, then any attempt to read an
     * object from it without Requester Pays enabled will result in a 403 error
     * and the bucket owner will be charged for the request.
     *
     * <p>
     * Enabling Requester Pays disables the ability to have anonymous access to
     * this bucket
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
     * updated GetObjectRequest object so that additional method calls can be
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
     * @return The updated GetObjectRequest object.
     */
    public GetObjectRequest withRequesterPays(boolean isRequesterPays) {
        setRequesterPays(isRequesterPays);
        return this;
    }

    @Override
    public SSECustomerKey getSSECustomerKey() {
        return sseCustomerKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * decrypt this object.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to decrypt this object.
     */
    public void setSSECustomerKey(SSECustomerKey sseKey) {
        this.sseCustomerKey = sseKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * decrypt this object, and returns the updated GetObjectRequest so that
     * additional method calls may be chained together.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to decrypt this object.
     *
     * @return The optional customer-provided server-side encryption key to use
     *         to decrypt this object.
     */
    public GetObjectRequest withSSECustomerKey(SSECustomerKey sseKey) {
        setSSECustomerKey(sseKey);
        return this;
    }

    /**
     * <p>
     * Returns the optional part number that indicates the part to be downloaded in a multipart object.
     * </p>
     *
     * @return The part number representing a part in a multipart object.
     *
     * @see GetObjectRequest#setPartNumber(Integer)
     * @see GetObjectRequest#withPartNumber(Integer)
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    /**
     * <p>
     * Sets the optional part number that indicates the part to be downloaded in a multipart object.
     * </p>
     * <p>
     * The valid range for part number is 1 - 10000 inclusive.
     * Part numbers are 1 based. If an object has 1 part, partNumber=1 would be the correct not 0.
     * For partNumber < 1, an AmazonS3Exception is thrown with response code 400 bad request.
     * For partNumber larger than actual part count,  an AmazonS3Exception is thrown with response code 416 Request Range Not Satisfiable.
     * </p>
     *
     * @param partNumber
     *            The part number representing a part in a multipart object.
     *
     * @see GetObjectRequest#getPartNumber()
     * @see GetObjectRequest#withPartNumber(Integer)
     */
    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * Sets the optional part number that indicates the part to be downloaded in a multipart object.
     * </p>
     * <p>
     * The valid range for part number is 1 - 10000 inclusive.
     * Part numbers are 1 based. If an object has 1 part, partNumber=1 would be the correct not 0.
     * For partNumber < 1, an AmazonS3Exception is thrown with response code 400 bad request.
     * For partNumber larger than actual part count,  an AmazonS3Exception is thrown with response code 416 Request Range Not Satisfiable.
     * </p>
     *
     * @param partNumber
     *            The part number representing a part in a multipart object.
     *
     * @return This {@link GetObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see GetObjectRequest#getPartNumber()
     * @see GetObjectRequest#setPartNumber(Integer)
     */
    public GetObjectRequest withPartNumber(Integer partNumber) {
        setPartNumber(partNumber);
        return this;
    }


    /**
     * Returns an immutable S3 object id.
     */
    public S3ObjectId getS3ObjectId() {
        return s3ObjectIdBuilder.build();
    }

    /**
     * Sets the S3 object id for this request.
     */
    public void setS3ObjectId(S3ObjectId s3ObjectId) {
        this.s3ObjectIdBuilder = new S3ObjectIdBuilder(s3ObjectId);
    }

    /**
     * Fluent API to set the S3 object id for this request.
     */
    public GetObjectRequest withS3ObjectId(S3ObjectId s3ObjectId) {
        setS3ObjectId(s3ObjectId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final GetObjectRequest that = (GetObjectRequest) o;

        if (isRequesterPays != that.isRequesterPays) {
            return false;
        }
        if (s3ObjectIdBuilder != null ? !s3ObjectIdBuilder.equals(that.s3ObjectIdBuilder) : that.s3ObjectIdBuilder != null) {
            return false;
        }
        if (!Arrays.equals(range, that.range)) {
            return false;
        }
        if (matchingETagConstraints != null ? !matchingETagConstraints.equals(that.matchingETagConstraints)
                                            : that.matchingETagConstraints != null) {
            return false;
        }
        if (nonmatchingEtagConstraints != null ? !nonmatchingEtagConstraints.equals(that.nonmatchingEtagConstraints)
                                               : that.nonmatchingEtagConstraints != null) {
            return false;
        }
        if (unmodifiedSinceConstraint != null ? !unmodifiedSinceConstraint.equals(that.unmodifiedSinceConstraint)
                                              : that.unmodifiedSinceConstraint != null) {
            return false;
        }
        if (modifiedSinceConstraint != null ? !modifiedSinceConstraint.equals(that.modifiedSinceConstraint)
                                            : that.modifiedSinceConstraint != null) {
            return false;
        }
        if (responseHeaders != null ? !responseHeaders.equals(that.responseHeaders) : that.responseHeaders != null) {
            return false;
        }
        if (sseCustomerKey != null ? !sseCustomerKey.equals(that.sseCustomerKey) : that.sseCustomerKey != null) {
            return false;
        }
        return partNumber != null ? partNumber.equals(that.partNumber) : that.partNumber == null;
    }

    @Override
    public int hashCode() {
        int result = s3ObjectIdBuilder != null ? s3ObjectIdBuilder.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(range);
        result = 31 * result + (matchingETagConstraints != null ? matchingETagConstraints.hashCode() : 0);
        result = 31 * result + (nonmatchingEtagConstraints != null ? nonmatchingEtagConstraints.hashCode() : 0);
        result = 31 * result + (unmodifiedSinceConstraint != null ? unmodifiedSinceConstraint.hashCode() : 0);
        result = 31 * result + (modifiedSinceConstraint != null ? modifiedSinceConstraint.hashCode() : 0);
        result = 31 * result + (responseHeaders != null ? responseHeaders.hashCode() : 0);
        result = 31 * result + (isRequesterPays ? 1 : 0);
        result = 31 * result + (sseCustomerKey != null ? sseCustomerKey.hashCode() : 0);
        result = 31 * result + (partNumber != null ? partNumber.hashCode() : 0);
        return result;
    }
}
