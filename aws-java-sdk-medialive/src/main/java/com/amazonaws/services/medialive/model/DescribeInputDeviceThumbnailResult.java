/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for DescribeInputDeviceThumbnailResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDeviceThumbnail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInputDeviceThumbnailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The binary data for the thumbnail that the Link device has most recently sent to MediaLive. */
    private java.io.InputStream body;
    /** Specifies the media type of the thumbnail. */
    private String contentType;
    /** The length of the content. */
    private Long contentLength;
    /** The unique, cacheable version of this thumbnail. */
    private String eTag;
    /** The date and time the thumbnail was last updated at the device. */
    private java.util.Date lastModified;

    /**
     * The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
     * 
     * @param body
     *        The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
     */

    public void setBody(java.io.InputStream body) {
        this.body = body;
    }

    /**
     * The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
     * 
     * @return The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
     */

    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
     * 
     * @param body
     *        The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceThumbnailResult withBody(java.io.InputStream body) {
        setBody(body);
        return this;
    }

    /**
     * Specifies the media type of the thumbnail.
     * 
     * @param contentType
     *        Specifies the media type of the thumbnail.
     * @see ContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Specifies the media type of the thumbnail.
     * 
     * @return Specifies the media type of the thumbnail.
     * @see ContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * Specifies the media type of the thumbnail.
     * 
     * @param contentType
     *        Specifies the media type of the thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public DescribeInputDeviceThumbnailResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * Specifies the media type of the thumbnail.
     * 
     * @param contentType
     *        Specifies the media type of the thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public DescribeInputDeviceThumbnailResult withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * The length of the content.
     * 
     * @param contentLength
     *        The length of the content.
     */

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * The length of the content.
     * 
     * @return The length of the content.
     */

    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * The length of the content.
     * 
     * @param contentLength
     *        The length of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceThumbnailResult withContentLength(Long contentLength) {
        setContentLength(contentLength);
        return this;
    }

    /**
     * The unique, cacheable version of this thumbnail.
     * 
     * @param eTag
     *        The unique, cacheable version of this thumbnail.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * The unique, cacheable version of this thumbnail.
     * 
     * @return The unique, cacheable version of this thumbnail.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * The unique, cacheable version of this thumbnail.
     * 
     * @param eTag
     *        The unique, cacheable version of this thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceThumbnailResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * The date and time the thumbnail was last updated at the device.
     * 
     * @param lastModified
     *        The date and time the thumbnail was last updated at the device.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * The date and time the thumbnail was last updated at the device.
     * 
     * @return The date and time the thumbnail was last updated at the device.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * The date and time the thumbnail was last updated at the device.
     * 
     * @param lastModified
     *        The date and time the thumbnail was last updated at the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceThumbnailResult withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContentLength() != null)
            sb.append("ContentLength: ").append(getContentLength()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInputDeviceThumbnailResult == false)
            return false;
        DescribeInputDeviceThumbnailResult other = (DescribeInputDeviceThumbnailResult) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInputDeviceThumbnailResult clone() {
        try {
            return (DescribeInputDeviceThumbnailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
