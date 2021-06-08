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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a container image that is registered to an Amazon Lightsail container service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container image.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The digest of the container image.
     * </p>
     */
    private String digest;
    /**
     * <p>
     * The timestamp when the container image was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The name of the container image.
     * </p>
     * 
     * @param image
     *        The name of the container image.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The name of the container image.
     * </p>
     * 
     * @return The name of the container image.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The name of the container image.
     * </p>
     * 
     * @param image
     *        The name of the container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerImage withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The digest of the container image.
     * </p>
     * 
     * @param digest
     *        The digest of the container image.
     */

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * <p>
     * The digest of the container image.
     * </p>
     * 
     * @return The digest of the container image.
     */

    public String getDigest() {
        return this.digest;
    }

    /**
     * <p>
     * The digest of the container image.
     * </p>
     * 
     * @param digest
     *        The digest of the container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerImage withDigest(String digest) {
        setDigest(digest);
        return this;
    }

    /**
     * <p>
     * The timestamp when the container image was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the container image was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the container image was created.
     * </p>
     * 
     * @return The timestamp when the container image was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the container image was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the container image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerImage withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getDigest() != null)
            sb.append("Digest: ").append(getDigest()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerImage == false)
            return false;
        ContainerImage other = (ContainerImage) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getDigest() == null ^ this.getDigest() == null)
            return false;
        if (other.getDigest() != null && other.getDigest().equals(this.getDigest()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getDigest() == null) ? 0 : getDigest().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ContainerImage clone() {
        try {
            return (ContainerImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
