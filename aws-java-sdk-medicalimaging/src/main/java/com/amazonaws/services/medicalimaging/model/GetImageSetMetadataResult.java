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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageSetMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImageSetMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The blob containing the aggregated metadata information for the image set.
     * </p>
     */
    private java.io.InputStream imageSetMetadataBlob;
    /**
     * <p>
     * The format in which the study metadata is returned to the customer. Default is <code>text/plain</code>.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The compression format in which image set metadata attributes are returned.
     * </p>
     */
    private String contentEncoding;

    /**
     * <p>
     * The blob containing the aggregated metadata information for the image set.
     * </p>
     * 
     * @param imageSetMetadataBlob
     *        The blob containing the aggregated metadata information for the image set.
     */

    public void setImageSetMetadataBlob(java.io.InputStream imageSetMetadataBlob) {
        this.imageSetMetadataBlob = imageSetMetadataBlob;
    }

    /**
     * <p>
     * The blob containing the aggregated metadata information for the image set.
     * </p>
     * 
     * @return The blob containing the aggregated metadata information for the image set.
     */

    public java.io.InputStream getImageSetMetadataBlob() {
        return this.imageSetMetadataBlob;
    }

    /**
     * <p>
     * The blob containing the aggregated metadata information for the image set.
     * </p>
     * 
     * @param imageSetMetadataBlob
     *        The blob containing the aggregated metadata information for the image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageSetMetadataResult withImageSetMetadataBlob(java.io.InputStream imageSetMetadataBlob) {
        setImageSetMetadataBlob(imageSetMetadataBlob);
        return this;
    }

    /**
     * <p>
     * The format in which the study metadata is returned to the customer. Default is <code>text/plain</code>.
     * </p>
     * 
     * @param contentType
     *        The format in which the study metadata is returned to the customer. Default is <code>text/plain</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The format in which the study metadata is returned to the customer. Default is <code>text/plain</code>.
     * </p>
     * 
     * @return The format in which the study metadata is returned to the customer. Default is <code>text/plain</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The format in which the study metadata is returned to the customer. Default is <code>text/plain</code>.
     * </p>
     * 
     * @param contentType
     *        The format in which the study metadata is returned to the customer. Default is <code>text/plain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageSetMetadataResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The compression format in which image set metadata attributes are returned.
     * </p>
     * 
     * @param contentEncoding
     *        The compression format in which image set metadata attributes are returned.
     */

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    /**
     * <p>
     * The compression format in which image set metadata attributes are returned.
     * </p>
     * 
     * @return The compression format in which image set metadata attributes are returned.
     */

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * <p>
     * The compression format in which image set metadata attributes are returned.
     * </p>
     * 
     * @param contentEncoding
     *        The compression format in which image set metadata attributes are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageSetMetadataResult withContentEncoding(String contentEncoding) {
        setContentEncoding(contentEncoding);
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
        if (getImageSetMetadataBlob() != null)
            sb.append("ImageSetMetadataBlob: ").append(getImageSetMetadataBlob()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContentEncoding() != null)
            sb.append("ContentEncoding: ").append(getContentEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImageSetMetadataResult == false)
            return false;
        GetImageSetMetadataResult other = (GetImageSetMetadataResult) obj;
        if (other.getImageSetMetadataBlob() == null ^ this.getImageSetMetadataBlob() == null)
            return false;
        if (other.getImageSetMetadataBlob() != null && other.getImageSetMetadataBlob().equals(this.getImageSetMetadataBlob()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentEncoding() == null ^ this.getContentEncoding() == null)
            return false;
        if (other.getContentEncoding() != null && other.getContentEncoding().equals(this.getContentEncoding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageSetMetadataBlob() == null) ? 0 : getImageSetMetadataBlob().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContentEncoding() == null) ? 0 : getContentEncoding().hashCode());
        return hashCode;
    }

    @Override
    public GetImageSetMetadataResult clone() {
        try {
            return (GetImageSetMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
