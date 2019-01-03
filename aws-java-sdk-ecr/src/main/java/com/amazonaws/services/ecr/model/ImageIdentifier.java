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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object with identifying information for an Amazon ECR image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ImageIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     */
    private String imageDigest;
    /**
     * <p>
     * The tag used for the image.
     * </p>
     */
    private String imageTag;

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @param imageDigest
     *        The <code>sha256</code> digest of the image manifest.
     */

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @return The <code>sha256</code> digest of the image manifest.
     */

    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @param imageDigest
     *        The <code>sha256</code> digest of the image manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageIdentifier withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
        return this;
    }

    /**
     * <p>
     * The tag used for the image.
     * </p>
     * 
     * @param imageTag
     *        The tag used for the image.
     */

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    /**
     * <p>
     * The tag used for the image.
     * </p>
     * 
     * @return The tag used for the image.
     */

    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * <p>
     * The tag used for the image.
     * </p>
     * 
     * @param imageTag
     *        The tag used for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageIdentifier withImageTag(String imageTag) {
        setImageTag(imageTag);
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
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest()).append(",");
        if (getImageTag() != null)
            sb.append("ImageTag: ").append(getImageTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageIdentifier == false)
            return false;
        ImageIdentifier other = (ImageIdentifier) obj;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getImageTag() == null ^ this.getImageTag() == null)
            return false;
        if (other.getImageTag() != null && other.getImageTag().equals(this.getImageTag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getImageTag() == null) ? 0 : getImageTag().hashCode());
        return hashCode;
    }

    @Override
    public ImageIdentifier clone() {
        try {
            return (ImageIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ImageIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
