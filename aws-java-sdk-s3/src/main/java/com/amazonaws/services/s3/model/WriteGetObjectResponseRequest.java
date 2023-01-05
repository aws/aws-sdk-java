/*
 * Copyright 2021-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;

public class WriteGetObjectResponseRequest extends AmazonWebServiceRequest implements Serializable, S3DataSource {
    private static final long serialVersionUID = 1L;

    private String requestRoute;
    private String requestToken;
    private Integer statusCode;
    private String errorCode;
    private String errorMessage;
    private String contentType;
    private String acceptRanges;
    private String cacheControl;
    private String contentDisposition;
    private String contentEncoding;
    private String contentLanguage;
    private Long contentLength;
    private String contentRange;
    private String deleteMarker;
    private String eTag;
    private Date expires;
    private String expiration;
    private Date lastModified;
    private Integer missingMeta;
    private String objectLockMode;
    private String objectLockLegalHoldStatus;
    private Date objectLockRetainUntilDate;
    private Integer partsCount;
    private String replicationStatus;
    private String requestCharged;
    private String restore;
    private String serverSideEncryption;
    private String sseCustomerAlgorithm;
    private String sseKMSKeyId;
    private String sseCustomerKeyMD5;
    private String storageClass;
    private Integer tagCount;
    private String versionId;
    private Boolean bucketKeyEnabled;

    private ObjectMetadata metadata;

    private transient InputStream inputStream;
    private File file;

    public WriteGetObjectResponseRequest() {
    }

    /**
     * Set the route prefix to the HTTP URL generated.
     *
     * @return this object for method chaning.
     */
    public WriteGetObjectResponseRequest withRequestRoute(String requestRoute) {
        this.requestRoute = requestRoute;
        return this;
    }

    /**
     * Set the route prefix to the HTTP URL generated.
     */
    public void setRequestRoute(String requestRoute) {
        withRequestRoute(requestRoute);
    }

    /**
     * The route prefix to the HTTP URL generated.
     */
    public String getRequestRoute() {
        return requestRoute;
    }

    /**
     * Set a single use encrypted token that maps <code>WriteGetObjectResponse</code> to the end user <code>GetObject</code>
     * request.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withRequestToken(String requestToken) {
        this.requestToken = requestToken;
        return this;
    }

    /**
     * Set a single use encrypted token that maps <code>WriteGetObjectResponse</code> to the end user <code>GetObject</code>
     * request.
     */
    public void setRequestToken(String requestToken) {
        withRequestToken(requestToken);
    }

    /**
     * A single use encrypted token that maps <code>WriteGetObjectResponse</code> to the end user <code>GetObject</code>
     * request.
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Set the integer status code for an HTTP response of a corresponding <code>GetObject</code> request.
     *
     * <p class="title">
     * <b>Status Codes</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>200 - OK</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>206 - Partial Content</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>304 - Not Modified</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>400 - Bad Request</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>401 - Unauthorized</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>403 - Forbidden</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>404 - Not Found</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>405 - Method Not Allowed</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>409 - Conflict</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>411 - Length Required</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>412 - Precondition Failed</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>416 - Range Not Satisfiable</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>500 - Internal Server Error</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>503 - Service Unavailable</i>
     * </p>
     * </li>
     * </ul>
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Set the integer status code for an HTTP response of a corresponding <code>GetObject</code> request.
     *
     * <p class="title">
     * <b>Status Codes</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>200 - OK</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>206 - Partial Content</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>304 - Not Modified</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>400 - Bad Request</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>401 - Unauthorized</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>403 - Forbidden</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>404 - Not Found</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>405 - Method Not Allowed</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>409 - Conflict</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>411 - Length Required</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>412 - Precondition Failed</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>416 - Range Not Satisfiable</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>500 - Internal Server Error</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>503 - Service Unavailable</i>
     * </p>
     * </li>
     * </ul>
     */
    public void setStatusCode(Integer statusCode) {
        withStatusCode(statusCode);
    }

    /**
     * The integer status code for an HTTP response of a corresponding <code>GetObject</code> request.
     *
     * <p class="title">
     * <b>Status Codes</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>200 - OK</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>206 - Partial Content</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>304 - Not Modified</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>400 - Bad Request</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>401 - Unauthorized</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>403 - Forbidden</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>404 - Not Found</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>405 - Method Not Allowed</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>409 - Conflict</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>411 - Length Required</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>412 - Precondition Failed</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>416 - Range Not Satisfiable</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>500 - Internal Server Error</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>503 - Service Unavailable</i>
     * </p>
     * </li>
     * </ul>
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Set a string that uniquely identifies an error condition. Returned in the &lt;Code&gt; tag of the error XML response
     * for a corresponding <code>GetObject</code> call. Cannot be used with a successful <code>StatusCode</code> header
     * or when the transformed object is provided in the body.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Set a string that uniquely identifies an error condition. Returned in the &lt;Code&gt; tag of the error XML response
     * for a corresponding <code>GetObject</code> call. Cannot be used with a successful <code>StatusCode</code> header
     * or when the transformed object is provided in the body.
     */
    public void setErrorCode(String errorCode) {
        withErrorCode(errorCode);
    }

    /**
     * A string that uniquely identifies an error condition. Returned in the &lt;Code&gt; tag of the error XML response
     * for a corresponding <code>GetObject</code> call. Cannot be used with a successful <code>StatusCode</code> header
     * or when the transformed object is provided in the body.
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Set a generic description of the error condition. Returned in the &lt;Message&gt; tag of the error XML
     * response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
     * <code>StatusCode</code> header or when the transformed object is provided in body.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Set a generic description of the error condition. Returned in the &lt;Message&gt; tag of the error XML
     * response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
     * <code>StatusCode</code> header or when the transformed object is provided in body.
     */
    public void setErrorMessage(String errorMessage) {
        withErrorMessage(errorMessage);
    }

    /**
     * A generic description of the error condition. Returned in the &lt;Message&gt; tag of the error XML
     * response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
     * <code>StatusCode</code> header or when the transformed object is provided in body.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Indicate that a range of bytes was specified.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Indicate that a range of bytes was specified.
     */
    public void setAcceptRanges(String acceptRanges) {
        withAcceptRanges(acceptRanges);
    }
    /**
     * Indicates that a range of bytes was specified.
     */
    public String getAcceptRanges() {
        return acceptRanges;
    }

    /**
     * Specify caching behavior along the request/reply chain.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Specify caching behavior along the request/reply chain.
     */
    public void setCacheControl(String cacheControl) {
        withCacheControl(cacheControl);
    }

    /**
     * The caching behavior along the request/reply chain.
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * Specify presentational information for the object.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Specify presentational information for the object.
     */
    public void setContentDisposition(String contentDisposition) {
        withContentDisposition(contentDisposition);
    }

    /**
     * The presentational information for the object.
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * Specify what content encodings have been applied to the object and thus what decoding mechanisms must be
     * applied to obtain the media-type referenced by the Content-Type header field.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Specify what content encodings have been applied to the object and thus what decoding mechanisms must be
     * applied to obtain the media-type referenced by the Content-Type header field.
     */
    public void setContentEncoding(String contentEncoding) {
        withContentEncoding(contentEncoding);
    }

    /**
     * What content encodings have been applied to the object and thus what decoding mechanisms must be
     * applied to obtain the media-type referenced by the Content-Type header field.
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * Set the language the content is in.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Set the language the content is in..
     */
    public void setContentLanguage(String contentLanguage) {
        withContentLanguage(contentLanguage);
    }

    /**
     * The language the content is in.
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * Set the size of the body in bytes.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Set the size of the body in bytes.
     */
    public void setContentLength(Long contentLength) {
        withContentLength(contentLength);
    }

    /**
     * The size of the body in bytes.
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * Set the portion of the object returned in the response.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Set the portion of the object returned in the response.
     */
    public void setContentRange(String contentRange) {
        withContentRange(contentRange);
    }

    /**
     * The portion of the object returned in the response.
     */
    public String getContentRange() {
        return contentRange;
    }


    /**
     * Set whether an object stored in Amazon S3 is (<code>true</code>) or is not (<code>false</code>) a delete
     * marker.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withDeleteMarker(String deleteMarker) {
        this.deleteMarker = deleteMarker;
        return this;
    }

    /**
     * Set whether an object stored in Amazon S3 is (<code>true</code>) or is not (<code>false</code>) a delete
     * marker.
     */
    public void setDeleteMarker(String deleteMarker) {
        withDeleteMarker(deleteMarker);
    }

    /**
     * Whether an object stored in Amazon S3 is (<code>true</code>) or is not (<code>false</code>) a delete
     * marker.
     */
    public String getDeleteMarker() {
        return deleteMarker;
    }

    /**
     * Set an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Set an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     */
    public void setETag(String eTag) {
        withETag(eTag);
    }

    /**
     * An opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Set the date and time at which the object is no longer cacheable.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withExpires(Date expires) {
        this.expires = expires;
        return this;
    }

    /**
     * Set the date and time at which the object is no longer cacheable.
     */
    public void setExpires(Date expires) {
        withExpires(expires);
    }

    /**
     * The date and time at which the object is no longer cacheable.
     */
    public Date getExpires() {
        return expires;
    }

    /**
     * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It
     * includes the expiry-date and rule-id key-value pairs providing object expiration information. The value of
     * the rule-id is URL encoded.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It
     * includes the expiry-date and rule-id key-value pairs providing object expiration information. The value of
     * the rule-id is URL encoded.
     */
    public void setExpiration(String expiration) {
        withExpiration(expiration);
    }

    /**
     * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It
     * includes the expiry-date and rule-id key-value pairs providing object expiration information. The value of
     * the rule-id is URL encoded.
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Set the date and time the object was last modified.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withLastModified(Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Set the date and time the object was last modified.
     */
    public void setLastModified(Date lastModified) {
        withLastModified(lastModified);
    }

    /**
     * The date and time the object was last modified.
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * Set the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can happen if you
     * create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using
     * SOAP, you can create metadata whose values are not legal HTTP headers.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withMissingMeta(Integer missingMeta) {
        this.missingMeta = missingMeta;
        return this;
    }

    /**
     * Set the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can happen if you
     * create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using
     * SOAP, you can create metadata whose values are not legal HTTP headers.
     */
    public void setMissingMeta(Integer missingMeta) {
        withMissingMeta(missingMeta);
    }

    /**
     * The number of metadata entries not returned in <code>x-amz-meta</code> headers. This can happen if you
     * create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using
     * SOAP, you can create metadata whose values are not legal HTTP headers.
     */
    public Integer getMissingMeta() {
        return missingMeta;
    }

    /**
     * Set whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
     * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return this;
    }

    /**
     * Set whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
     * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
        return this;
    }

    /**
     * Set whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
     * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
     */
    public void setObjectLockMode(String objectLockMode) {
        withObjectLockMode(objectLockMode);
    }

    /**
     * Set whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
     * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
     */
    public void setObjectLockMode(ObjectLockMode objectLockMode) {
        withObjectLockMode(objectLockMode);
    }

    /**
     * Whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
     * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * Set whether an object stored in Amazon S3 has an active legal hold.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return this;
    }

    /**
     * Set whether an object stored in Amazon S3 has an active legal hold.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
        return this;
    }

    /**
     * Set whether an object stored in Amazon S3 has an active legal hold.
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        withObjectLockLegalHoldStatus(objectLockLegalHoldStatus);
    }

    /**
     * Set whether an object stored in Amazon S3 has an active legal hold.
     */
    public void setObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        withObjectLockLegalHoldStatus(objectLockLegalHoldStatus);
    }

    /**
     * Whether an object stored in Amazon S3 has an active legal hold.
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * Set the date and time when Object Lock is configured to expire.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withObjectLockRetainUntilDate(Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return this;
    }

    /**
     * Set the date and time when Object Lock is configured to expire.
     */
    public void setObjectLockRetainUntilDate(Date objectLockRetainUntilDate) {
        withObjectLockRetainUntilDate(objectLockRetainUntilDate);
    }

    /**
     * The date and time when Object Lock is configured to expire.
     */
    public Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * Set the count of parts this object has.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withPartsCount(Integer partsCount) {
        this.partsCount = partsCount;
        return this;
    }

    /**
     * Set the count of parts this object has.
     */
    public void setPartsCount(Integer partsCount) {
        withPartsCount(partsCount);
    }

    /**
     * The count of parts this object has.
     */
    public Integer getPartsCount() {
        return partsCount;
    }

    /**
     * Set if request involves bucket that is either a source or destination in a Replication rule. For more
     * information about S3 Replication, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
        return this;
    }

    /**
     * Set if request involves bucket that is either a source or destination in a Replication rule. For more
     * information about S3 Replication, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
     */
    public void setReplicationStatus(String replicationStatus) {
        withReplicationStatus(replicationStatus);
    }

    /**
     * If request involves bucket that is either a source or destination in a Replication rule. For more
     * information about S3 Replication, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
     */
    public String getReplicationStatus() {
        return replicationStatus;
    }

    /**
     * Set the value of the RequestCharged property for this object.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * Set the value of the RequestCharged property for this object.
     */
    public void setRequestCharged(String requestCharged) {
        withRequestCharged(requestCharged);
    }

    /**
     * The value of the RequestCharged property for this object.
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * Set information about object restoration operation and expiration time of the restored object copy.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withRestore(String restore) {
        this.restore = restore;
        return this;
    }

    /**
     * Set information about object restoration operation and expiration time of the restored object copy.
     */
    public void setRestore(String restore) {
        withRestore(restore);
    }

    /**
     * Information about object restoration operation and expiration time of the restored object copy.
     */
    public String getRestore() {
        return restore;
    }

    /**
     * Set the server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256,
     * aws:kms).
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }

    /**
     * Set the server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256,
     * aws:kms).
     */
    public void setServerSideEncryption(String serverSideEncryption) {
        withServerSideEncryption(serverSideEncryption);
    }

    /**
     * The server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256,
     * aws:kms).
     */
    public String getServerSideEncryption() {
        return serverSideEncryption;
    }

    /**
     * Set the algorithm used if server-side encryption with a customer-provided encryption key was specified for
     * object stored in Amazon S3.
     *
     * @return this object for method chaining.
     */
    public WriteGetObjectResponseRequest withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sseCustomerAlgorithm = sSECustomerAlgorithm;
        return this;
    }

    /**
     * Set the algorithm used if server-side encryption with a customer-provided encryption key was specified for
     * object stored in Amazon S3.
     */
    public void setSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        withSSECustomerAlgorithm(sSECustomerAlgorithm);
    }

    /**
     * The algorithm used if server-side encryption with a customer-provided encryption key was specified for
     * object stored in Amazon S3.
     */
    public String getSSECustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    /**
     * Specify the ID of the Amazon Web Services Key Management Service (KMS) symmetric customer managed customer
     * master key (CMK) that was used for stored in Amazon S3 object.
     *
     * @return this object for method chaining.
     */
    public WriteGetObjectResponseRequest withSSEKMSKeyId(String sSEKMSKeyId) {
        this.sseKMSKeyId = sSEKMSKeyId;
        return this;
    }
    /**
     * Specify the ID of the Amazon Web Services Key Management Service (KMS) symmetric customer managed customer
     * master key (CMK) that was used for stored in Amazon S3 object.
     */
    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        withSSEKMSKeyId(sSEKMSKeyId);
    }

    /**
     * If present, specifies the ID of the Amazon Web Services Key Management Service (KMS) symmetric customer managed customer
     * master key (CMK) that was used for stored in Amazon S3 object.
     */
    public String getSSEKMSKeyId() {
        return sseKMSKeyId;
    }

    /**
     * Set the 128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data stored in S3. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html">Protecting
     * data using server-side encryption with customer-provided encryption keys (SSE-C)</a>.
     *
     * @return this object for method chaining.
     */
    public WriteGetObjectResponseRequest withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sseCustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * Set the 128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data stored in S3. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html">Protecting
     * data using server-side encryption with customer-provided encryption keys (SSE-C)</a>.
     */
    public void setSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        withSSECustomerKeyMD5(sSECustomerKeyMD5);
    }

    /**
     * The 128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data stored in S3. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html">Protecting
     * data using server-side encryption with customer-provided encryption keys (SSE-C)</a>.
     *
     * @return this object for method chaining.
     */
    public String getSSECustomerKeyMD5() {
        return sseCustomerKeyMD5;
    }

    /**
     * Set the class of storage used to store object in Amazon S3.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * Set the class of storage used to store object in Amazon S3.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * Set the class of storage used to store object in Amazon S3.
     */
    public void setStorageClass(String storageClass) {
        withStorageClass(storageClass);
    }

    /**
     * Set the class of storage used to store object in Amazon S3.
     */
    public void setStorageClass(StorageClass storageClass) {
        withStorageClass(storageClass);
    }

    /**
     * The class of storage used to store object in Amazon S3.
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Set the number of tags, if any, on the object.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withTagCount(Integer tagCount) {
        this.tagCount = tagCount;
        return this;
    }

    /**
     * Set the number of tags, if any, on the object.
     */
    public void setTagCount(Integer tagCount) {
        withTagCount(tagCount);
    }

    /**
     * The number of tags, if any, on the object.
     */
    public Integer getTagCount() {
        return tagCount;
    }

    /**
     * Set an ID used to reference a specific version of the object.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Set an ID used to reference a specific version of the object.
     */
    public void setVersionId(String versionId) {
        withVersionId(versionId);
    }

    /**
     * An ID used to reference a specific version of the object.
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Indicate whether the object stored in Amazon S3 uses an S3 bucket key for server-side encryption with Amazon Web
     * Services KMS (SSE-KMS).
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withBucketKeyEnabled(Boolean bucketKeyEnabled) {
        this.bucketKeyEnabled = bucketKeyEnabled;
        return this;
    }

    /**
     * Indicate whether the object stored in Amazon S3 uses an S3 bucket key for server-side encryption with Amazon Web
     * Services KMS (SSE-KMS).
     */
    public void setBucketKeyEnabled(Boolean bucketKeyEnabled) {
        withBucketKeyEnabled(bucketKeyEnabled);
    }

    /**
     * Indicates whether the object stored in Amazon S3 uses an S3 bucket key for server-side encryption with Amazon Web
     * Services KMS (SSE-KMS).
     */
    public Boolean getBucketKeyEnabled() {
        return bucketKeyEnabled;
    }

    /**
     * Set the standard MIME type describing the format of the object data.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Set the standard MIME type describing the format of the object data.
     */
    public void setContentType(String contentType) {
        withContentType(contentType);
    }

    /**
     * The standard MIME type describing the format of the object data.
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Set a map of metadata to store with the object in S3.
     *
     * @return This object for method chaining.
     */
    public WriteGetObjectResponseRequest withMetadata(ObjectMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Set a map of metadata to store with the object in S3.
     */
    public void setMetadata(ObjectMetadata metadata) {
        withMetadata(metadata);
    }

    /**
     * A map of metadata to store with the object in S3.
     */
    public ObjectMetadata getMetadata() {
        return metadata;
    }

    public WriteGetObjectResponseRequest withInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        return this;
    }

    @Override
    public void setInputStream(InputStream inputStream) {
        withInputStream(inputStream);
    }

    @Override
    public InputStream getInputStream() {
        return inputStream;
    }

    public WriteGetObjectResponseRequest withFile(File file) {
        this.file = file;
        return this;
    }

    @Override
    public void setFile(File file) {
        withFile(file);
    }

    @Override
    public File getFile() {
        return file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WriteGetObjectResponseRequest that = (WriteGetObjectResponseRequest) o;

        if (requestRoute != null ? !requestRoute.equals(that.requestRoute) : that.requestRoute != null) return false;
        if (requestToken != null ? !requestToken.equals(that.requestToken) : that.requestToken != null) return false;
        if (statusCode != null ? !statusCode.equals(that.statusCode) : that.statusCode != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        if (errorMessage != null ? !errorMessage.equals(that.errorMessage) : that.errorMessage != null) return false;
        if (contentType != null ? !contentType.equals(that.contentType) : that.contentType != null) return false;
        if (acceptRanges != null ? !acceptRanges.equals(that.acceptRanges) : that.acceptRanges != null) return false;
        if (cacheControl != null ? !cacheControl.equals(that.cacheControl) : that.cacheControl != null) return false;
        if (contentDisposition != null ? !contentDisposition.equals(that.contentDisposition) : that.contentDisposition != null)
            return false;
        if (contentEncoding != null ? !contentEncoding.equals(that.contentEncoding) : that.contentEncoding != null)
            return false;
        if (contentLanguage != null ? !contentLanguage.equals(that.contentLanguage) : that.contentLanguage != null)
            return false;
        if (contentLength != null ? !contentLength.equals(that.contentLength) : that.contentLength != null)
            return false;
        if (contentRange != null ? !contentRange.equals(that.contentRange) : that.contentRange != null) return false;
        if (deleteMarker != null ? !deleteMarker.equals(that.deleteMarker) : that.deleteMarker != null) return false;
        if (eTag != null ? !eTag.equals(that.eTag) : that.eTag != null) return false;
        if (expires != null ? !expires.equals(that.expires) : that.expires != null) return false;
        if (expiration != null ? !expiration.equals(that.expiration) : that.expiration != null) return false;
        if (lastModified != null ? !lastModified.equals(that.lastModified) : that.lastModified != null) return false;
        if (missingMeta != null ? !missingMeta.equals(that.missingMeta) : that.missingMeta != null) return false;
        if (objectLockMode != null ? !objectLockMode.equals(that.objectLockMode) : that.objectLockMode != null)
            return false;
        if (objectLockLegalHoldStatus != null ? !objectLockLegalHoldStatus.equals(that.objectLockLegalHoldStatus) : that.objectLockLegalHoldStatus != null)
            return false;
        if (objectLockRetainUntilDate != null ? !objectLockRetainUntilDate.equals(that.objectLockRetainUntilDate) : that.objectLockRetainUntilDate != null)
            return false;
        if (partsCount != null ? !partsCount.equals(that.partsCount) : that.partsCount != null) return false;
        if (replicationStatus != null ? !replicationStatus.equals(that.replicationStatus) : that.replicationStatus != null)
            return false;
        if (requestCharged != null ? !requestCharged.equals(that.requestCharged) : that.requestCharged != null)
            return false;
        if (restore != null ? !restore.equals(that.restore) : that.restore != null) return false;
        if (serverSideEncryption != null ? !serverSideEncryption.equals(that.serverSideEncryption) : that.serverSideEncryption != null)
            return false;
        if (sseCustomerAlgorithm != null ? !sseCustomerAlgorithm.equals(that.sseCustomerAlgorithm) : that.sseCustomerAlgorithm != null)
            return false;
        if (sseKMSKeyId != null ? !sseKMSKeyId.equals(that.sseKMSKeyId) : that.sseKMSKeyId != null) return false;
        if (sseCustomerKeyMD5 != null ? !sseCustomerKeyMD5.equals(that.sseCustomerKeyMD5) : that.sseCustomerKeyMD5 != null)
            return false;
        if (storageClass != null ? !storageClass.equals(that.storageClass) : that.storageClass != null) return false;
        if (tagCount != null ? !tagCount.equals(that.tagCount) : that.tagCount != null) return false;
        if (versionId != null ? !versionId.equals(that.versionId) : that.versionId != null) return false;
        if (bucketKeyEnabled != null ? !bucketKeyEnabled.equals(that.bucketKeyEnabled) : that.bucketKeyEnabled != null)
            return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
        if (inputStream != null ? !inputStream.equals(that.inputStream) : that.inputStream != null) return false;
        return file != null ? file.equals(that.file) : that.file == null;
    }

    @Override
    public int hashCode() {
        int result = requestRoute != null ? requestRoute.hashCode() : 0;
        result = 31 * result + (requestToken != null ? requestToken.hashCode() : 0);
        result = 31 * result + (statusCode != null ? statusCode.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (errorMessage != null ? errorMessage.hashCode() : 0);
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (acceptRanges != null ? acceptRanges.hashCode() : 0);
        result = 31 * result + (cacheControl != null ? cacheControl.hashCode() : 0);
        result = 31 * result + (contentDisposition != null ? contentDisposition.hashCode() : 0);
        result = 31 * result + (contentEncoding != null ? contentEncoding.hashCode() : 0);
        result = 31 * result + (contentLanguage != null ? contentLanguage.hashCode() : 0);
        result = 31 * result + (contentLength != null ? contentLength.hashCode() : 0);
        result = 31 * result + (contentRange != null ? contentRange.hashCode() : 0);
        result = 31 * result + (deleteMarker != null ? deleteMarker.hashCode() : 0);
        result = 31 * result + (eTag != null ? eTag.hashCode() : 0);
        result = 31 * result + (expires != null ? expires.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (lastModified != null ? lastModified.hashCode() : 0);
        result = 31 * result + (missingMeta != null ? missingMeta.hashCode() : 0);
        result = 31 * result + (objectLockMode != null ? objectLockMode.hashCode() : 0);
        result = 31 * result + (objectLockLegalHoldStatus != null ? objectLockLegalHoldStatus.hashCode() : 0);
        result = 31 * result + (objectLockRetainUntilDate != null ? objectLockRetainUntilDate.hashCode() : 0);
        result = 31 * result + (partsCount != null ? partsCount.hashCode() : 0);
        result = 31 * result + (replicationStatus != null ? replicationStatus.hashCode() : 0);
        result = 31 * result + (requestCharged != null ? requestCharged.hashCode() : 0);
        result = 31 * result + (restore != null ? restore.hashCode() : 0);
        result = 31 * result + (serverSideEncryption != null ? serverSideEncryption.hashCode() : 0);
        result = 31 * result + (sseCustomerAlgorithm != null ? sseCustomerAlgorithm.hashCode() : 0);
        result = 31 * result + (sseKMSKeyId != null ? sseKMSKeyId.hashCode() : 0);
        result = 31 * result + (sseCustomerKeyMD5 != null ? sseCustomerKeyMD5.hashCode() : 0);
        result = 31 * result + (storageClass != null ? storageClass.hashCode() : 0);
        result = 31 * result + (tagCount != null ? tagCount.hashCode() : 0);
        result = 31 * result + (versionId != null ? versionId.hashCode() : 0);
        result = 31 * result + (bucketKeyEnabled != null ? bucketKeyEnabled.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (inputStream != null ? inputStream.hashCode() : 0);
        result = 31 * result + (file != null ? file.hashCode() : 0);
        return result;
    }
}
