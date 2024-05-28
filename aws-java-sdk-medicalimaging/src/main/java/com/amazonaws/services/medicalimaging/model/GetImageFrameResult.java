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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageFrame" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImageFrameResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The blob containing the aggregated image frame information.
     * </p>
     */
    private java.io.InputStream imageFrameBlob;
    /**
     * <p>
     * The format in which the image frame information is returned to the customer. Default is
     * <code>application/octet-stream</code>.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The blob containing the aggregated image frame information.
     * </p>
     * 
     * @param imageFrameBlob
     *        The blob containing the aggregated image frame information.
     */

    public void setImageFrameBlob(java.io.InputStream imageFrameBlob) {
        this.imageFrameBlob = imageFrameBlob;
    }

    /**
     * <p>
     * The blob containing the aggregated image frame information.
     * </p>
     * 
     * @return The blob containing the aggregated image frame information.
     */

    public java.io.InputStream getImageFrameBlob() {
        return this.imageFrameBlob;
    }

    /**
     * <p>
     * The blob containing the aggregated image frame information.
     * </p>
     * 
     * @param imageFrameBlob
     *        The blob containing the aggregated image frame information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageFrameResult withImageFrameBlob(java.io.InputStream imageFrameBlob) {
        setImageFrameBlob(imageFrameBlob);
        return this;
    }

    /**
     * <p>
     * The format in which the image frame information is returned to the customer. Default is
     * <code>application/octet-stream</code>.
     * </p>
     * 
     * @param contentType
     *        The format in which the image frame information is returned to the customer. Default is
     *        <code>application/octet-stream</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The format in which the image frame information is returned to the customer. Default is
     * <code>application/octet-stream</code>.
     * </p>
     * 
     * @return The format in which the image frame information is returned to the customer. Default is
     *         <code>application/octet-stream</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The format in which the image frame information is returned to the customer. Default is
     * <code>application/octet-stream</code>.
     * </p>
     * 
     * @param contentType
     *        The format in which the image frame information is returned to the customer. Default is
     *        <code>application/octet-stream</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageFrameResult withContentType(String contentType) {
        setContentType(contentType);
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
        if (getImageFrameBlob() != null)
            sb.append("ImageFrameBlob: ").append(getImageFrameBlob()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImageFrameResult == false)
            return false;
        GetImageFrameResult other = (GetImageFrameResult) obj;
        if (other.getImageFrameBlob() == null ^ this.getImageFrameBlob() == null)
            return false;
        if (other.getImageFrameBlob() != null && other.getImageFrameBlob().equals(this.getImageFrameBlob()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageFrameBlob() == null) ? 0 : getImageFrameBlob().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public GetImageFrameResult clone() {
        try {
            return (GetImageFrameResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
