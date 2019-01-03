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

import static com.amazonaws.util.DateUtils.cloneDate;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.TreeMap;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.util.DateUtils;

/**
 * Represents the object metadata that is stored with Amazon S3. This includes custom
 * user-supplied metadata, as well as the standard HTTP headers that Amazon S3
 * sends and receives (Content-Length, ETag, Content-MD5, etc.).
 */
public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult,
        ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable
{
    /*
     * TODO: Might be nice to get as many of the internal use only methods out
     *       of here so users never even see them.
     *       Example: we could set the ETag header directly through the raw
     *                metadata map instead of having a setter for it.
     */

    /**
     * Custom user metadata, represented in responses with the x-amz-meta-
     * header prefix
     */
    private Map<String, String> userMetadata = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

    /**
     * All other (non user custom) headers such as Content-Length, Content-Type,
     * etc.
     */
    private Map<String, Object> metadata = new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);

    public static final String AES_256_SERVER_SIDE_ENCRYPTION =
            SSEAlgorithm.AES256.getAlgorithm();

    /**
     * The date when the object is no longer cacheable.
     */
    private Date httpExpiresDate;

    /**
     * The time this object will expire and be completely removed from S3, or
     * null if this object will never expire.
     * <p>
     * This and the expiration time rule aren't stored in the metadata map
     * because the header contains both the time and the rule.
     */
    private Date expirationTime;

    /**
     * The expiration rule id for this object.
     */
    private String expirationTimeRuleId;

    /**
     * Boolean value indicating whether there is an ongoing request to restore
     * an archived copy of this object from Amazon Glacier.
     */
    private Boolean ongoingRestore;

    /**
     * The time at which an object that has been temporarily restored from
     * Glacier will expire, and will need to be restored again in order to be
     * accessed. Null if this object has not been restored from Glacier.
     */
    private Date restoreExpirationTime;

    public ObjectMetadata() {}

    private ObjectMetadata(ObjectMetadata from) {
        this.userMetadata = from.userMetadata == null
            ? null
            : new TreeMap<String,String>(from.userMetadata);
        // shallow clone the meata data
        this.metadata = from.metadata == null
            ? null
            : new TreeMap<String, Object>(from.metadata);
        this.expirationTime = cloneDate(from.expirationTime);
        this.expirationTimeRuleId = from.expirationTimeRuleId;
        this.httpExpiresDate = cloneDate(from.httpExpiresDate);
        this.ongoingRestore = from.ongoingRestore;
        this.restoreExpirationTime = cloneDate(from.restoreExpirationTime);
    }

    /**
     * <p>
     * Gets the custom user-metadata for the associated object.
     * </p>
     * <p>
     * Amazon S3 can store additional metadata on objects by internally
     * representing it as HTTP headers prefixed with "x-amz-meta-". Use
     * user-metadata to store arbitrary metadata alongside their data in Amazon
     * S3. When setting user metadata, callers <i>should not</i> include the
     * internal "x-amz-meta-" prefix; this library will handle that for them.
     * Likewise, when callers retrieve custom user-metadata, they will not see
     * the "x-amz-meta-" header prefix.
     * </p>
     * <p>
     * User-metadata keys are <b>case insensitive</b> and will be returned as
     * lowercase strings, even if they were originally specified with uppercase
     * strings.
     * </p>
     * <p>
     * Note that user-metadata for an object is limited by the HTTP request
     * header limit. All HTTP headers included in a request (including user
     * metadata headers and other standard HTTP headers) must be less than 8KB.
     * </p>
     *
     * @return The custom user metadata for the associated object.
     *
     * @see ObjectMetadata#setUserMetadata(Map)
     * @see ObjectMetadata#addUserMetadata(String, String)
     */
    public Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * <p>
     * Sets the custom user-metadata for the associated object.
     * </p>
     * <p>
     * Amazon S3 can store additional metadata on objects by internally
     * representing it as HTTP headers prefixed with "x-amz-meta-". Use
     * user-metadata to store arbitrary metadata alongside their data in Amazon
     * S3. When setting user metadata, callers <i>should not</i> include the
     * internal "x-amz-meta-" prefix; this library will handle that for them.
     * Likewise, when callers retrieve custom user-metadata, they will not see
     * the "x-amz-meta-" header prefix.
     * </p>
     * <p>
     * User-metadata keys are <b>case insensitive</b> and will be returned as
     * lowercase strings, even if they were originally specified with uppercase
     * strings.
     * </p>
     * <p>
     * Note that user-metadata for an object is limited by the HTTP request
     * header limit. All HTTP headers included in a request (including user
     * metadata headers and other standard HTTP headers) must be less than 8KB.
     * </p>
     *
     * @param userMetadata
     *            The custom user-metadata for the associated object. Note that
     *            the key should not include the internal S3 HTTP header prefix.
     * @see ObjectMetadata#getUserMetadata()
     * @see ObjectMetadata#addUserMetadata(String, String)
     */
    public void setUserMetadata(Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * For internal use only. Sets a specific metadata header value. Not
     * intended to be called by external code.
     *
     * @param key
     *            The name of the header being set.
     * @param value
     *            The value for the header.
     */
    public void setHeader(String key, Object value) {
        metadata.put(key, value);
    }

    /**
     * <p>
     * Adds the key value pair of custom user-metadata for the associated
     * object. If the entry in the custom user-metadata map already contains the
     * specified key, it will be replaced with these new contents.
     * </p>
     * <p>
     * Amazon S3 can store additional metadata on objects by internally
     * representing it as HTTP headers prefixed with "x-amz-meta-".
     * Use user-metadata to store arbitrary metadata alongside their data in
     * Amazon S3. When setting user metadata, callers <i>should not</i> include
     * the internal "x-amz-meta-" prefix; this library will handle that for
     * them. Likewise, when callers retrieve custom user-metadata, they will not
     * see the "x-amz-meta-" header prefix.
     * </p>
     * <p>
     * Note that user-metadata for an object is limited by the HTTP request
     * header limit. All HTTP headers included in a request (including user
     * metadata headers and other standard HTTP headers) must be less than 8KB.
     * </p>
     *
     * @param key
     *            The key for the custom user metadata entry. Note that the key
     *            should not include
     *            the internal S3 HTTP header prefix.
     * @param value
     *            The value for the custom user-metadata entry.
     *
     * @see ObjectMetadata#setUserMetadata(Map)
     * @see ObjectMetadata#getUserMetadata()
     */
    public void addUserMetadata(String key, String value) {
        this.userMetadata.put(key, value);
    }

    /**
     * Gets a map of the raw metadata/headers for the associated object.
     *
     * @return A map of the raw metadata/headers for the associated object.
     */
    public Map<String, Object> getRawMetadata() {
        Map<String,Object> copy = new TreeMap<String,Object>(String.CASE_INSENSITIVE_ORDER);
        copy.putAll(metadata);
        return Collections.unmodifiableMap(copy);
    }

    /**
     * Returns the raw value of the metadata/headers for the specified key.
     */
    public Object getRawMetadataValue(String key) {
        return metadata.get(key);
    }

    /**
     * Gets the value of the Last-Modified header, indicating the date
     * and time at which Amazon S3 last recorded a modification to the
     * associated object.
     *
     * @return The date and time at which Amazon S3 last recorded a modification
     *         to the associated object.
     */
    public Date getLastModified() {
        return cloneDate((Date)metadata.get(Headers.LAST_MODIFIED));
    }

    /**
     * For internal use only. Sets the Last-Modified header value
     * indicating the date and time at which Amazon S3 last recorded a
     * modification to the associated object.
     *
     * @param lastModified
     *            The date and time at which Amazon S3 last recorded a
     *            modification to the associated object.
     */
    public void setLastModified(Date lastModified) {
        metadata.put(Headers.LAST_MODIFIED, lastModified);
    }

    /**
     * <p>
     * Gets the Content-Length HTTP header indicating the size of the
     * associated object in bytes.
     * </p>
     * <p>
     * This field is required when uploading objects to S3, but the AWS S3 Java
     * client will automatically set it when working directly with files. When
     * uploading directly from a stream, set this field if
     * possible. Otherwise the client must buffer the entire stream in
     * order to calculate the content length before sending the data to
     * Amazon S3.
     * </p>
     * <p>
     * For more information on the Content-Length HTTP header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>
     * </p>
     *
     * @return The Content-Length HTTP header indicating the size of the
     *         associated object in bytes. Returns <code>null</code>
     *         if it hasn't been set yet.
     *
     * @see ObjectMetadata#setContentLength(long)
     */
    public long getContentLength() {
        Long contentLength = (Long)metadata.get(Headers.CONTENT_LENGTH);

        if (contentLength == null) return 0;
        return contentLength.longValue();
    }

    /**
     * Returns the physical length of the entire object stored in S3.
     * This is useful during, for example, a range get operation.
     */
    public long getInstanceLength() {
        // See Content-Range in
        // http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html
        String contentRange = (String)metadata.get(Headers.CONTENT_RANGE);
        if (contentRange != null) {
            int pos = contentRange.lastIndexOf("/");
            if (pos >= 0)
                return Long.parseLong(contentRange.substring(pos+1));
        }
        return getContentLength();
    }

    /**
     * <p>
     * Sets the Content-Length HTTP header indicating the size of the
     * associated object in bytes.
     * </p>
     * <p>
     * This field is required when uploading objects to S3, but the AWS S3 Java
     * client will automatically set it when working directly with files. When
     * uploading directly from a stream, set this field if
     * possible. Otherwise the client must buffer the entire stream in
     * order to calculate the content length before sending the data to
     * Amazon S3.
     * </p>
     * <p>
     * For more information on the Content-Length HTTP header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>
     * </p>
     *
     * @param contentLength
     *            The Content-Length HTTP header indicating the size of the
     *            associated object in bytes.
     *
     * @see ObjectMetadata#getContentLength()
     */
    public void setContentLength(long contentLength) {
        metadata.put(Headers.CONTENT_LENGTH, contentLength);
    }

    /**
     * <p>
     * Gets the Content-Type HTTP header, which indicates the type of content
     * stored in the associated object. The value of this header is a standard
     * MIME type.
     * </p>
     * <p>
     * When uploading files, the AWS S3 Java client will attempt to determine
     * the correct content type if one hasn't been set yet. Users are
     * responsible for ensuring a suitable content type is set when uploading
     * streams. If no content type is provided and cannot be determined by
     * the filename, the default content type, "application/octet-stream", will
     * be used.
     * </p>
     * <p>
     * For more information on the Content-Type header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>
     * </p>
     *
     * @return The HTTP Content-Type header, indicating the type of content
     *         stored in the associated S3 object. Returns <code>null</code>
     *         if it hasn't been
     *         set.
     *
     * @see ObjectMetadata#setContentType(String)
     */
    public String getContentType() {
        return (String)metadata.get(Headers.CONTENT_TYPE);
    }

    /**
     * <p>
     * Sets the Content-Type HTTP header indicating the type of content
     * stored in the associated object. The value of this header is a standard
     * MIME type.
     * </p>
     * <p>
     * When uploading files, the AWS S3 Java client will attempt to determine
     * the correct content type if one hasn't been set yet. Users are
     * responsible for ensuring a suitable content type is set when uploading
     * streams. If no content type is provided and cannot be determined by
     * the filename, the default content type "application/octet-stream" will
     * be used.
     * </p>
     * <p>
     * For more information on the Content-Type header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>
     * </p>
     *
     * @param contentType
     *            The HTTP Content-Type header indicating the type of content
     *            stored in the associated S3 object.
     *
     * @see ObjectMetadata#getContentType()
     */
    public void setContentType(String contentType) {
        metadata.put(Headers.CONTENT_TYPE, contentType);
    }

    /**
     * <p>
     * Gets the Content-Language HTTP header, which describes the natural language(s) of the
     * intended audience for the enclosed entity.
     * </p>
     * <p>
     * For more information on the Content-Type header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>
     * </p>
     *
     * @return The HTTP Content-Language header, which describes the natural language(s) of the
     * intended audience for the enclosed entity. Returns <code>null</code>
     *         if it hasn't been set.
     *
     * @see ObjectMetadata#setContentLanguage(String)
     */
    public String getContentLanguage() {
        return (String)metadata.get(Headers.CONTENT_LANGUAGE);
    }

    /**
     * <p>
     * Sets the Content-Language HTTP header which describes the natural language(s) of the
     * intended audience for the enclosed entity.
     * </p>
     * <p>
     * For more information on the Content-Type header, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>
     * </p>
     *
     * @param contentLanguage
     *            The HTTP Content-Language header which describes the natural language(s) of the
     * intended audience for the enclosed entity.
     *
     * @see ObjectMetadata#getContentLanguage()
     */
    public void setContentLanguage(String contentLanguage) {
        metadata.put(Headers.CONTENT_LANGUAGE, contentLanguage);
    }

    /**
     * <p>
     * Gets the optional Content-Encoding HTTP header specifying what
     * content encodings have been applied to the object and what decoding
     * mechanisms must be applied in order to obtain the media-type referenced
     * by the Content-Type field.
     * </p>
     * <p>
     * For more information on how the Content-Encoding HTTP header works, see
     * <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>
     * </p>
     *
     * @return The HTTP Content-Encoding header.
     * Returns <code>null</code> if it hasn't been set.
     *
     * @see ObjectMetadata#setContentEncoding(String)
     */
    public String getContentEncoding() {
        return (String)metadata.get(Headers.CONTENT_ENCODING);
    }

    /**
     * <p>
     * Sets the optional Content-Encoding HTTP header specifying what
     * content encodings have been applied to the object and what decoding
     * mechanisms must be applied in order to obtain the media-type referenced
     * by the Content-Type field.
     * </p>
     * <p>
     * For more information on how the Content-Encoding HTTP header works, see
     * <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>
     * </p>
     *
     * @param encoding
     *            The HTTP Content-Encoding header, as defined in RFC 2616.
     *
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>
     *
     * @see ObjectMetadata#getContentEncoding()
     */
    public void setContentEncoding(String encoding) {
        metadata.put(Headers.CONTENT_ENCODING, encoding);
    }

    /**
     * <p>
     * Gets the optional Cache-Control HTTP header which allows the user to
     * specify caching behavior along the HTTP request/reply chain.
     * </p>
     * <p>
     * For more information on how the Cache-Control HTTP header affects HTTP
     * requests and responses, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>
     * </p>
     *
     * @return The HTTP Cache-Control header as defined in RFC 2616.
     *         Returns <code>null</code>  if
     *         it hasn't been set.
     *
     * @see ObjectMetadata#setCacheControl(String)
     */
    public String getCacheControl() {
        return (String)metadata.get(Headers.CACHE_CONTROL);
    }

    /**
     * <p>
     * Sets the optional Cache-Control HTTP header which allows the user to
     * specify caching behavior along the HTTP request/reply chain.
     * </p>
     * <p>
     * For more information on how the Cache-Control HTTP header affects HTTP
     * requests and responses see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>
     * </p>
     *
     * @param cacheControl
     *            The HTTP Cache-Control header as defined in RFC 2616.
     *
     * @see ObjectMetadata#getCacheControl()
     */
    public void setCacheControl(String cacheControl) {
        metadata.put(Headers.CACHE_CONTROL, cacheControl);
    }

    /**
     * <p>
     * Sets the base64 encoded 128-bit MD5 digest of the associated object
     * (content - not including headers) according to RFC 1864. This data is
     * used as a message integrity check to verify that the data received by
     * Amazon S3 is the same data that the caller sent. If set to null,then the
     * MD5 digest is removed from the metadata.
     * </p>
     * <p>
     * This field represents the base64 encoded 128-bit MD5 digest digest of an
     * object's content as calculated on the caller's side. The ETag metadata
     * field sometimes (but not always) represents the hex encoded 128-bit MD5 digest as computed by Amazon
     * S3. See the documentation at {@link #getETag()} for more information on what the ETag field represents.
     * </p>
     * <p>
     * The AWS S3 Java client will attempt to calculate this field automatically
     * when uploading files to Amazon S3.
     * </p>
     *
     * @param md5Base64
     *            The base64 encoded MD5 hash of the content for the object
     *            associated with this metadata.
     *
     * @see ObjectMetadata#getContentMD5()
     */
    public void setContentMD5(String md5Base64) {
        if(md5Base64 == null){
            metadata.remove(Headers.CONTENT_MD5);
        }else{
            metadata.put(Headers.CONTENT_MD5, md5Base64);
        }

    }

    /**
     * <p>
     * Gets the base64 encoded 128-bit MD5 digest of the associated object
     * (content - not including headers) according to RFC 1864. This data is
     * used as a message integrity check to verify that the data received by
     * Amazon S3 is the same data that the caller sent.
     * </p>
     * <p>
     * This field represents the base64 encoded 128-bit MD5 digest digest of an
     * object's content as calculated on the caller's side. The ETag metadata
     * field sometimes (but not always) represents the hex encoded 128-bit MD5 digest as computed by Amazon
     * S3. See the documentation at {@link #getETag()} for more information on what the ETag field represents.
     * </p>
     * <p>
     * The AWS S3 Java client will attempt to calculate this field automatically
     * when uploading files to Amazon S3.
     * </p>
     *
     * @return The base64 encoded MD5 hash of the content for the associated
     *         object.  Returns <code>null</code> if the MD5 hash of the content
     *         hasn't been set.
     *
     * @see ObjectMetadata#setContentMD5(String)
     */
    public String getContentMD5() {
        return (String)metadata.get(Headers.CONTENT_MD5);
    }

    /**
     * <p>
     * Sets the optional Content-Disposition HTTP header, which specifies
     * presentational information such as the recommended filename for the
     * object to be saved as.
     * </p>
     * <p>
     * For more information on how the Content-Disposition header affects HTTP
     * client behavior, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>
     * </p>
     *
     * @param disposition
     *            The value for the Content-Disposition header.
     *
     * @see ObjectMetadata#getContentDisposition()
     */
    public void setContentDisposition(String disposition) {
        metadata.put(Headers.CONTENT_DISPOSITION, disposition);
    }

    /**
     * <p>
     * Gets the optional Content-Disposition HTTP header, which specifies
     * presentation information for the object such as the recommended filename
     * for the object to be saved as.
     * </p>
     * <p>
     * For more information on how the Content-Disposition header affects HTTP
     * client behavior, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1">
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>
     * </p>
     *
     * @return The value of the Content-Disposition header.
     *         Returns <code>null</code> if the Content-Disposition header
     *         hasn't been set.
     *
     * @see <a
     *      href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     *      >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>
     *
     * @see ObjectMetadata#setCacheControl(String)
     */
    public String getContentDisposition() {
        return (String)metadata.get(Headers.CONTENT_DISPOSITION);
    }

    /**
     * The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not its metadata.
     * The ETag may or may not be an MD5 digest of the object data. Whether or not it is depends on how the object was created
     * and how it is encrypted as described below:
     * <ul>
     * <li>
     * Objects created by the PUT Object, POST Object, or Copy operation, or through the AWS Management Console, and are encrypted
     * by SSE-S3 or plaintext, have ETags that are an MD5 digest of their object data.
     * </li>
     * <li>
     * Objects created by the PUT Object, POST Object, or Copy operation, or through the AWS Management Console, and are encrypted
     * by SSE-C or SSE-KMS, have ETags that are not an MD5 digest of their object data.
     * </li>
     * <li>
     * If an object is created by either the Multipart Upload or Part Copy operation, the ETag is not an MD5 digest, regardless of
     * the method of encryption.
     * </li>
     * </ul>
     *
     * @return The ETag of the object or <code>null</code>if it hasn't been set yet.
     */
    public String getETag() {
        return (String)metadata.get(Headers.ETAG);
    }

    /**
     * Gets the version ID of the associated Amazon S3 object if available.
     * Version IDs are only assigned to objects when an object is uploaded to an
     * Amazon S3 bucket that has object versioning enabled.
     *
     * @return The version ID of the associated Amazon S3 object if available.
     */
    public String getVersionId() {
        return (String)metadata.get(Headers.S3_VERSION_ID);
    }

    /**
     * Returns the server-side encryption algorithm when encrypting the object
     * using AWS-managed keys .
     */
    @Override
    public String getSSEAlgorithm() {
        return (String)metadata.get(Headers.SERVER_SIDE_ENCRYPTION);
    }

    /**
     * @deprecated Replaced by {@link #getSSEAlgorithm()}
     */
    @Deprecated
    public String getServerSideEncryption() {
        return (String)metadata.get(Headers.SERVER_SIDE_ENCRYPTION);
    }

    /**
     * Sets the server-side encryption algorithm when encrypting the object
     * using AWS-managed keys.
     *
     * @param algorithm
     *            The server-side encryption algorithm when encrypting the
     *            object using AWS-managed keys .
     */
    @Override
    public void setSSEAlgorithm(String algorithm) {
        metadata.put(Headers.SERVER_SIDE_ENCRYPTION, algorithm);
    }


    /**
     * @deprecated Replaced by {@link #setSSEAlgorithm(String)}
     */
    @Deprecated
    public void setServerSideEncryption(String algorithm) {
        metadata.put(Headers.SERVER_SIDE_ENCRYPTION, algorithm);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSSECustomerAlgorithm() {
        return (String) metadata.get(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM);
    }

    /**
     * For internal use only. This method is only used to set the value in the
     * object after receiving the value in a response from S3. When sending
     * requests, use {@link SSECustomerKey} members in request objects.
     */
    @Override
    public void setSSECustomerAlgorithm(String algorithm) {
        metadata.put(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM, algorithm);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSSECustomerKeyMd5() {
        return (String)metadata.get(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5);
    }

    /**
     * For internal use only. This method is only used to set the value in the
     * object after receiving the value in a response from S3. When sending
     * requests, use {@link SSECustomerKey} members in request objects.
     */
    public void setSSECustomerKeyMd5(String md5Digest) {
        metadata.put(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5, md5Digest);
    }

    /**
     * Returns the time this object will expire and be completely removed from
     * S3. Returns null if this object will never expire.
     */
    public Date getExpirationTime() {
        return cloneDate(expirationTime);
    }

    /**
     * For internal use only. This will *not* set the object's expiration time,
     * and is only used to set the value in the object after receiving the value
     * in a response from S3.
     *
     * @param expirationTime
     *            The expiration time for the object.
     */
    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * Returns the {@link BucketLifecycleConfiguration} rule ID for this
     * object's expiration, or null if it doesn't expire.
     */
    public String getExpirationTimeRuleId() {
        return expirationTimeRuleId;
    }

    /**
     * For internal use only. This will *not* set the object's expiration time
     * rule id, and is only used to set the value in the object after receiving
     * the value in a response from S3.
     */
    public void setExpirationTimeRuleId(String expirationTimeRuleId) {
        this.expirationTimeRuleId = expirationTimeRuleId;
    }


    /**
     * Returns the time at which an object that has been temporarily restored
     * from Amazon Glacier will expire, and will need to be restored again in
     * order to be accessed. Returns null if this is not a temporary copy of an
     * object restored from Glacier.
     */
    public Date getRestoreExpirationTime() {
        return cloneDate(restoreExpirationTime);
    }

    /**
     * For internal use only. This will *not* set the object's restore
     * expiration time, and is only used to set the value in the object after
     * receiving the value in a response from S3.
     *
     * @param restoreExpirationTime
     *            The new restore expiration time for the object.
     */
    public void setRestoreExpirationTime(Date restoreExpirationTime) {
        this.restoreExpirationTime = restoreExpirationTime;
    }

    /**
     * For internal use only. Sets the boolean value which indicates whether
     * there is ongoing restore request. Not intended to be called by external
     * code.
     */
    public void setOngoingRestore(boolean ongoingRestore) {
        this.ongoingRestore = Boolean.valueOf(ongoingRestore);
    }


    /**
     *  Returns the boolean value which indicates whether there is ongoing restore request.
     */
    public Boolean getOngoingRestore() {
        return this.ongoingRestore;
    }

    /**
     *  Set the date when the object is no longer cacheable.
     */
    public void setHttpExpiresDate(Date httpExpiresDate) {
        this.httpExpiresDate = httpExpiresDate;
    }

    /**
     * Returns the date when the object is no longer cacheable.
     */
    public Date getHttpExpiresDate() {
        return cloneDate(httpExpiresDate);
    }

    /**
     * @return The storage class of the object. Returns null if the object is in STANDARD storage.
     *         See {@link StorageClass} for possible values
     */
    public String getStorageClass() {
        final Object storageClass = metadata.get(Headers.STORAGE_CLASS);
        if (storageClass == null) {
            return null;
        }
        return storageClass.toString();
    }

    /**
     * Returns the value of the specified user meta datum.
     */
    public String getUserMetaDataOf(String key) {
        return userMetadata == null ? null : userMetadata.get(key);
    }

    /**
     * Returns a clone of this <code>ObjectMetadata</code>. Note the clone of
     * the internal {@link #metadata} is limited to a shallow copy due to the
     * unlimited type of value in the map. Other fields can be regarded as deep
     * clone.
     */
    public ObjectMetadata clone() {
        return new ObjectMetadata(this);
    }

    /**
     * Returns the AWS Key Management System key id used for Server Side
     * Encryption of the Amazon S3 object.
     */
    public String getSSEAwsKmsKeyId() {
        return (String) metadata
                .get(Headers.SERVER_SIDE_ENCRYPTION_AWS_KMS_KEYID);
    }

    @Override
    public boolean isRequesterCharged() {
        return metadata.get(Headers.REQUESTER_CHARGED_HEADER) != null;
    }

    @Override
    public void setRequesterCharged(boolean isRequesterCharged) {
        if (isRequesterCharged) {
            metadata.put(Headers.REQUESTER_CHARGED_HEADER, Constants.REQUESTER_PAYS);
        }
    }

    /**
     * <p>
     * Returns the value of x-amz-mp-parts-count header.
     * </p>
     * <p>
     * The x-amz-mp-parts-count header is returned in the response only when
     * a valid partNumber is specified in the request and the object has more than 1 part.
     * </p>
     * <p>
     * To find the part count of an object, set the partNumber to 1 in GetObjectRequest.
     * If the object has more than 1 part then part count will be returned,
     * otherwise null is returned.
     * </p>
     */
    public Integer getPartCount() {
        return (Integer) metadata.get(Headers.S3_PARTS_COUNT);
    }

    /**
     * <p>
     * Returns the content range of the object if response contains the Content-Range header.
     * </p>
     * <p>
     * If the request specifies a range or part number, then response returns the Content-Range range header.
     * Otherwise, the response does not return Content-Range header.
     * </p>
     * @return
     * 		Returns content range if the object is requested with specific range or part number,
     * 		null otherwise.
     */
    public Long[] getContentRange() {
        String contentRange = (String) metadata.get(Headers.CONTENT_RANGE);
        Long[] range = null;
        if (contentRange != null) {
            String[] tokens = contentRange.split("[ -/]+");
            try {
                range = new Long[] { Long.parseLong(tokens[1]), Long.parseLong(tokens[2]) };
            } catch (NumberFormatException nfe) {
                throw new SdkClientException(
                        "Unable to parse content range. Header 'Content-Range' has corrupted data" + nfe.getMessage(),
                        nfe);
            }
        }
        return range;
    }

    /**
     * @return The replication status of the object if it is from a bucket that
     * is the source or destination in a cross-region replication.
     */
    public String getReplicationStatus() {
        return (String) metadata.get(Headers.OBJECT_REPLICATION_STATUS);
    }

    /**
     * The Object Lock mode applied to this object.
     */
    public String getObjectLockMode() {
        return (String) metadata.get(Headers.OBJECT_LOCK_MODE);
    }

    /**
     * The date and time this object's Object Lock will expire.
     */
    public Date getObjectLockRetainUntilDate() {
        String dateStr = (String) metadata.get(Headers.OBJECT_LOCK_RETAIN_UNTIL_DATE);
        if (dateStr != null) {
            return DateUtils.parseISO8601Date(dateStr);
        }
        return null;
    }

    /**
     * The Legal Hold status of the specified object.
     */
    public String getObjectLockLegalHoldStatus() {
        return (String) metadata.get(Headers.OBJECT_LOCK_LEGAL_HOLD_STATUS);
    }
}
