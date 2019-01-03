/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediastoredata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/GetObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetObjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The bytes of the object.
     * </p>
     */
    private java.io.InputStream body;
    /**
     * <p>
     * An optional <code>CacheControl</code> header that allows the caller to control the object's cache behavior.
     * Headers can be passed in as specified in the HTTP spec at <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Headers with a custom user-defined value are also accepted.
     * </p>
     */
    private String cacheControl;
    /**
     * <p>
     * The range of bytes to retrieve.
     * </p>
     */
    private String contentRange;
    /**
     * <p>
     * The length of the object in bytes.
     * </p>
     */
    private Long contentLength;
    /**
     * <p>
     * The content type of the object.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The ETag that represents a unique instance of the object.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The date and time that the object was last modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other status
     * codes indicate the type of error that occurred.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * The bytes of the object.
     * </p>
     * 
     * @param body
     *        The bytes of the object.
     */

    public void setBody(java.io.InputStream body) {
        this.body = body;
    }

    /**
     * <p>
     * The bytes of the object.
     * </p>
     * 
     * @return The bytes of the object.
     */

    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * <p>
     * The bytes of the object.
     * </p>
     * 
     * @param body
     *        The bytes of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectResult withBody(java.io.InputStream body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * An optional <code>CacheControl</code> header that allows the caller to control the object's cache behavior.
     * Headers can be passed in as specified in the HTTP spec at <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Headers with a custom user-defined value are also accepted.
     * </p>
     * 
     * @param cacheControl
     *        An optional <code>CacheControl</code> header that allows the caller to control the object's cache
     *        behavior. Headers can be passed in as specified in the HTTP spec at <a
     *        href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *        >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.</p>
     *        <p>
     *        Headers with a custom user-defined value are also accepted.
     */

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    /**
     * <p>
     * An optional <code>CacheControl</code> header that allows the caller to control the object's cache behavior.
     * Headers can be passed in as specified in the HTTP spec at <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Headers with a custom user-defined value are also accepted.
     * </p>
     * 
     * @return An optional <code>CacheControl</code> header that allows the caller to control the object's cache
     *         behavior. Headers can be passed in as specified in the HTTP spec at <a
     *         href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *         >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.</p>
     *         <p>
     *         Headers with a custom user-defined value are also accepted.
     */

    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * <p>
     * An optional <code>CacheControl</code> header that allows the caller to control the object's cache behavior.
     * Headers can be passed in as specified in the HTTP spec at <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Headers with a custom user-defined value are also accepted.
     * </p>
     * 
     * @param cacheControl
     *        An optional <code>CacheControl</code> header that allows the caller to control the object's cache
     *        behavior. Headers can be passed in as specified in the HTTP spec at <a
     *        href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *        >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.</p>
     *        <p>
     *        Headers with a custom user-defined value are also accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectResult withCacheControl(String cacheControl) {
        setCacheControl(cacheControl);
        return this;
    }

    /**
     * <p>
     * The range of bytes to retrieve.
     * </p>
     * 
     * @param contentRange
     *        The range of bytes to retrieve.
     */

    public void setContentRange(String contentRange) {
        this.contentRange = contentRange;
    }

    /**
     * <p>
     * The range of bytes to retrieve.
     * </p>
     * 
     * @return The range of bytes to retrieve.
     */

    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * <p>
     * The range of bytes to retrieve.
     * </p>
     * 
     * @param contentRange
     *        The range of bytes to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectResult withContentRange(String contentRange) {
        setContentRange(contentRange);
        return this;
    }

    /**
     * <p>
     * The length of the object in bytes.
     * </p>
     * 
     * @param contentLength
     *        The length of the object in bytes.
     */

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * <p>
     * The length of the object in bytes.
     * </p>
     * 
     * @return The length of the object in bytes.
     */

    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * <p>
     * The length of the object in bytes.
     * </p>
     * 
     * @param contentLength
     *        The length of the object in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectResult withContentLength(Long contentLength) {
        setContentLength(contentLength);
        return this;
    }

    /**
     * <p>
     * The content type of the object.
     * </p>
     * 
     * @param contentType
     *        The content type of the object.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the object.
     * </p>
     * 
     * @return The content type of the object.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the object.
     * </p>
     * 
     * @param contentType
     *        The content type of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The ETag that represents a unique instance of the object.
     * </p>
     * 
     * @param eTag
     *        The ETag that represents a unique instance of the object.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The ETag that represents a unique instance of the object.
     * </p>
     * 
     * @return The ETag that represents a unique instance of the object.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The ETag that represents a unique instance of the object.
     * </p>
     * 
     * @param eTag
     *        The ETag that represents a unique instance of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The date and time that the object was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time that the object was last modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that the object was last modified.
     * </p>
     * 
     * @return The date and time that the object was last modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time that the object was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time that the object was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectResult withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other status
     * codes indicate the type of error that occurred.
     * </p>
     * 
     * @param statusCode
     *        The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other
     *        status codes indicate the type of error that occurred.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other status
     * codes indicate the type of error that occurred.
     * </p>
     * 
     * @return The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other
     *         status codes indicate the type of error that occurred.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other status
     * codes indicate the type of error that occurred.
     * </p>
     * 
     * @param statusCode
     *        The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other
     *        status codes indicate the type of error that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectResult withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getCacheControl() != null)
            sb.append("CacheControl: ").append(getCacheControl()).append(",");
        if (getContentRange() != null)
            sb.append("ContentRange: ").append(getContentRange()).append(",");
        if (getContentLength() != null)
            sb.append("ContentLength: ").append(getContentLength()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetObjectResult == false)
            return false;
        GetObjectResult other = (GetObjectResult) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getCacheControl() == null ^ this.getCacheControl() == null)
            return false;
        if (other.getCacheControl() != null && other.getCacheControl().equals(this.getCacheControl()) == false)
            return false;
        if (other.getContentRange() == null ^ this.getContentRange() == null)
            return false;
        if (other.getContentRange() != null && other.getContentRange().equals(this.getContentRange()) == false)
            return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getCacheControl() == null) ? 0 : getCacheControl().hashCode());
        hashCode = prime * hashCode + ((getContentRange() == null) ? 0 : getContentRange().hashCode());
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public GetObjectResult clone() {
        try {
            return (GetObjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
