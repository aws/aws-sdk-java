/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Details of a single thumbnail
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Thumbnail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Thumbnail implements Serializable, Cloneable, StructuredPojo {

    /** The binary data for the latest thumbnail. */
    private String body;
    /** The content type for the latest thumbnail. */
    private String contentType;
    /** Thumbnail Type */
    private String thumbnailType;
    /** Time stamp for the latest thumbnail. */
    private java.util.Date timeStamp;

    /**
     * The binary data for the latest thumbnail.
     * 
     * @param body
     *        The binary data for the latest thumbnail.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The binary data for the latest thumbnail.
     * 
     * @return The binary data for the latest thumbnail.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The binary data for the latest thumbnail.
     * 
     * @param body
     *        The binary data for the latest thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnail withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * The content type for the latest thumbnail.
     * 
     * @param contentType
     *        The content type for the latest thumbnail.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * The content type for the latest thumbnail.
     * 
     * @return The content type for the latest thumbnail.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * The content type for the latest thumbnail.
     * 
     * @param contentType
     *        The content type for the latest thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnail withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * Thumbnail Type
     * 
     * @param thumbnailType
     *        Thumbnail Type
     * @see ThumbnailType
     */

    public void setThumbnailType(String thumbnailType) {
        this.thumbnailType = thumbnailType;
    }

    /**
     * Thumbnail Type
     * 
     * @return Thumbnail Type
     * @see ThumbnailType
     */

    public String getThumbnailType() {
        return this.thumbnailType;
    }

    /**
     * Thumbnail Type
     * 
     * @param thumbnailType
     *        Thumbnail Type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThumbnailType
     */

    public Thumbnail withThumbnailType(String thumbnailType) {
        setThumbnailType(thumbnailType);
        return this;
    }

    /**
     * Thumbnail Type
     * 
     * @param thumbnailType
     *        Thumbnail Type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThumbnailType
     */

    public Thumbnail withThumbnailType(ThumbnailType thumbnailType) {
        this.thumbnailType = thumbnailType.toString();
        return this;
    }

    /**
     * Time stamp for the latest thumbnail.
     * 
     * @param timeStamp
     *        Time stamp for the latest thumbnail.
     */

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Time stamp for the latest thumbnail.
     * 
     * @return Time stamp for the latest thumbnail.
     */

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * Time stamp for the latest thumbnail.
     * 
     * @param timeStamp
     *        Time stamp for the latest thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnail withTimeStamp(java.util.Date timeStamp) {
        setTimeStamp(timeStamp);
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
        if (getThumbnailType() != null)
            sb.append("ThumbnailType: ").append(getThumbnailType()).append(",");
        if (getTimeStamp() != null)
            sb.append("TimeStamp: ").append(getTimeStamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Thumbnail == false)
            return false;
        Thumbnail other = (Thumbnail) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getThumbnailType() == null ^ this.getThumbnailType() == null)
            return false;
        if (other.getThumbnailType() != null && other.getThumbnailType().equals(this.getThumbnailType()) == false)
            return false;
        if (other.getTimeStamp() == null ^ this.getTimeStamp() == null)
            return false;
        if (other.getTimeStamp() != null && other.getTimeStamp().equals(this.getTimeStamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getThumbnailType() == null) ? 0 : getThumbnailType().hashCode());
        hashCode = prime * hashCode + ((getTimeStamp() == null) ? 0 : getTimeStamp().hashCode());
        return hashCode;
    }

    @Override
    public Thumbnail clone() {
        try {
            return (Thumbnail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ThumbnailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
