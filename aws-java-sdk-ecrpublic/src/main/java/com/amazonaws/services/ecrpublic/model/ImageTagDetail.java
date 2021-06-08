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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the image tag details for an image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/ImageTagDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageTagDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tag associated with the image.
     * </p>
     */
    private String imageTag;
    /**
     * <p>
     * The time stamp indicating when the image tag was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * An object that describes the details of an image.
     * </p>
     */
    private ReferencedImageDetail imageDetail;

    /**
     * <p>
     * The tag associated with the image.
     * </p>
     * 
     * @param imageTag
     *        The tag associated with the image.
     */

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    /**
     * <p>
     * The tag associated with the image.
     * </p>
     * 
     * @return The tag associated with the image.
     */

    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * <p>
     * The tag associated with the image.
     * </p>
     * 
     * @param imageTag
     *        The tag associated with the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageTagDetail withImageTag(String imageTag) {
        setImageTag(imageTag);
        return this;
    }

    /**
     * <p>
     * The time stamp indicating when the image tag was created.
     * </p>
     * 
     * @param createdAt
     *        The time stamp indicating when the image tag was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time stamp indicating when the image tag was created.
     * </p>
     * 
     * @return The time stamp indicating when the image tag was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time stamp indicating when the image tag was created.
     * </p>
     * 
     * @param createdAt
     *        The time stamp indicating when the image tag was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageTagDetail withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An object that describes the details of an image.
     * </p>
     * 
     * @param imageDetail
     *        An object that describes the details of an image.
     */

    public void setImageDetail(ReferencedImageDetail imageDetail) {
        this.imageDetail = imageDetail;
    }

    /**
     * <p>
     * An object that describes the details of an image.
     * </p>
     * 
     * @return An object that describes the details of an image.
     */

    public ReferencedImageDetail getImageDetail() {
        return this.imageDetail;
    }

    /**
     * <p>
     * An object that describes the details of an image.
     * </p>
     * 
     * @param imageDetail
     *        An object that describes the details of an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageTagDetail withImageDetail(ReferencedImageDetail imageDetail) {
        setImageDetail(imageDetail);
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
        if (getImageTag() != null)
            sb.append("ImageTag: ").append(getImageTag()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getImageDetail() != null)
            sb.append("ImageDetail: ").append(getImageDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageTagDetail == false)
            return false;
        ImageTagDetail other = (ImageTagDetail) obj;
        if (other.getImageTag() == null ^ this.getImageTag() == null)
            return false;
        if (other.getImageTag() != null && other.getImageTag().equals(this.getImageTag()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getImageDetail() == null ^ this.getImageDetail() == null)
            return false;
        if (other.getImageDetail() != null && other.getImageDetail().equals(this.getImageDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageTag() == null) ? 0 : getImageTag().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getImageDetail() == null) ? 0 : getImageDetail().hashCode());
        return hashCode;
    }

    @Override
    public ImageTagDetail clone() {
        try {
            return (ImageTagDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecrpublic.model.transform.ImageTagDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
