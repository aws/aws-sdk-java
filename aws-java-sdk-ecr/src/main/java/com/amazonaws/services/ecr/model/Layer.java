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
 * An object representing an Amazon ECR image layer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/Layer" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Layer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     */
    private String layerDigest;
    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     */
    private String layerAvailability;
    /**
     * <p>
     * The size, in bytes, of the image layer.
     * </p>
     */
    private Long layerSize;
    /**
     * <p>
     * The media type of the layer, such as <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     * <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * </p>
     */
    private String mediaType;

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * 
     * @param layerDigest
     *        The <code>sha256</code> digest of the image layer.
     */

    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * 
     * @return The <code>sha256</code> digest of the image layer.
     */

    public String getLayerDigest() {
        return this.layerDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * 
     * @param layerDigest
     *        The <code>sha256</code> digest of the image layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Layer withLayerDigest(String layerDigest) {
        setLayerDigest(layerDigest);
        return this;
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * 
     * @param layerAvailability
     *        The availability status of the image layer.
     * @see LayerAvailability
     */

    public void setLayerAvailability(String layerAvailability) {
        this.layerAvailability = layerAvailability;
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * 
     * @return The availability status of the image layer.
     * @see LayerAvailability
     */

    public String getLayerAvailability() {
        return this.layerAvailability;
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * 
     * @param layerAvailability
     *        The availability status of the image layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayerAvailability
     */

    public Layer withLayerAvailability(String layerAvailability) {
        setLayerAvailability(layerAvailability);
        return this;
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * 
     * @param layerAvailability
     *        The availability status of the image layer.
     * @see LayerAvailability
     */

    public void setLayerAvailability(LayerAvailability layerAvailability) {
        withLayerAvailability(layerAvailability);
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * 
     * @param layerAvailability
     *        The availability status of the image layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayerAvailability
     */

    public Layer withLayerAvailability(LayerAvailability layerAvailability) {
        this.layerAvailability = layerAvailability.toString();
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the image layer.
     * </p>
     * 
     * @param layerSize
     *        The size, in bytes, of the image layer.
     */

    public void setLayerSize(Long layerSize) {
        this.layerSize = layerSize;
    }

    /**
     * <p>
     * The size, in bytes, of the image layer.
     * </p>
     * 
     * @return The size, in bytes, of the image layer.
     */

    public Long getLayerSize() {
        return this.layerSize;
    }

    /**
     * <p>
     * The size, in bytes, of the image layer.
     * </p>
     * 
     * @param layerSize
     *        The size, in bytes, of the image layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Layer withLayerSize(Long layerSize) {
        setLayerSize(layerSize);
        return this;
    }

    /**
     * <p>
     * The media type of the layer, such as <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     * <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * </p>
     * 
     * @param mediaType
     *        The media type of the layer, such as <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     *        <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     */

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The media type of the layer, such as <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     * <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * </p>
     * 
     * @return The media type of the layer, such as <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     *         <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     */

    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * <p>
     * The media type of the layer, such as <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     * <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * </p>
     * 
     * @param mediaType
     *        The media type of the layer, such as <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     *        <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Layer withMediaType(String mediaType) {
        setMediaType(mediaType);
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
        if (getLayerDigest() != null)
            sb.append("LayerDigest: ").append(getLayerDigest()).append(",");
        if (getLayerAvailability() != null)
            sb.append("LayerAvailability: ").append(getLayerAvailability()).append(",");
        if (getLayerSize() != null)
            sb.append("LayerSize: ").append(getLayerSize()).append(",");
        if (getMediaType() != null)
            sb.append("MediaType: ").append(getMediaType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Layer == false)
            return false;
        Layer other = (Layer) obj;
        if (other.getLayerDigest() == null ^ this.getLayerDigest() == null)
            return false;
        if (other.getLayerDigest() != null && other.getLayerDigest().equals(this.getLayerDigest()) == false)
            return false;
        if (other.getLayerAvailability() == null ^ this.getLayerAvailability() == null)
            return false;
        if (other.getLayerAvailability() != null && other.getLayerAvailability().equals(this.getLayerAvailability()) == false)
            return false;
        if (other.getLayerSize() == null ^ this.getLayerSize() == null)
            return false;
        if (other.getLayerSize() != null && other.getLayerSize().equals(this.getLayerSize()) == false)
            return false;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        hashCode = prime * hashCode + ((getLayerAvailability() == null) ? 0 : getLayerAvailability().hashCode());
        hashCode = prime * hashCode + ((getLayerSize() == null) ? 0 : getLayerSize().hashCode());
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        return hashCode;
    }

    @Override
    public Layer clone() {
        try {
            return (Layer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.LayerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
