/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An object representing an Amazon ECR image layer.
 * </p>
 */
public class Layer implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     */
    private String layerDigest;
    /**
     * <p>
     * The availability status of the image layer. Valid values are <code>AVAILABLE</code> and <code>UNAVAILABLE</code>.
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
     * The availability status of the image layer. Valid values are <code>AVAILABLE</code> and <code>UNAVAILABLE</code>.
     * </p>
     * 
     * @param layerAvailability
     *        The availability status of the image layer. Valid values are <code>AVAILABLE</code> and
     *        <code>UNAVAILABLE</code>.
     * @see LayerAvailability
     */

    public void setLayerAvailability(String layerAvailability) {
        this.layerAvailability = layerAvailability;
    }

    /**
     * <p>
     * The availability status of the image layer. Valid values are <code>AVAILABLE</code> and <code>UNAVAILABLE</code>.
     * </p>
     * 
     * @return The availability status of the image layer. Valid values are <code>AVAILABLE</code> and
     *         <code>UNAVAILABLE</code>.
     * @see LayerAvailability
     */

    public String getLayerAvailability() {
        return this.layerAvailability;
    }

    /**
     * <p>
     * The availability status of the image layer. Valid values are <code>AVAILABLE</code> and <code>UNAVAILABLE</code>.
     * </p>
     * 
     * @param layerAvailability
     *        The availability status of the image layer. Valid values are <code>AVAILABLE</code> and
     *        <code>UNAVAILABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayerAvailability
     */

    public Layer withLayerAvailability(String layerAvailability) {
        setLayerAvailability(layerAvailability);
        return this;
    }

    /**
     * <p>
     * The availability status of the image layer. Valid values are <code>AVAILABLE</code> and <code>UNAVAILABLE</code>.
     * </p>
     * 
     * @param layerAvailability
     *        The availability status of the image layer. Valid values are <code>AVAILABLE</code> and
     *        <code>UNAVAILABLE</code>.
     * @see LayerAvailability
     */

    public void setLayerAvailability(LayerAvailability layerAvailability) {
        this.layerAvailability = layerAvailability.toString();
    }

    /**
     * <p>
     * The availability status of the image layer. Valid values are <code>AVAILABLE</code> and <code>UNAVAILABLE</code>.
     * </p>
     * 
     * @param layerAvailability
     *        The availability status of the image layer. Valid values are <code>AVAILABLE</code> and
     *        <code>UNAVAILABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayerAvailability
     */

    public Layer withLayerAvailability(LayerAvailability layerAvailability) {
        setLayerAvailability(layerAvailability);
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("LayerDigest: " + getLayerDigest() + ",");
        if (getLayerAvailability() != null)
            sb.append("LayerAvailability: " + getLayerAvailability() + ",");
        if (getLayerSize() != null)
            sb.append("LayerSize: " + getLayerSize());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        hashCode = prime * hashCode + ((getLayerAvailability() == null) ? 0 : getLayerAvailability().hashCode());
        hashCode = prime * hashCode + ((getLayerSize() == null) ? 0 : getLayerSize().hashCode());
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
}
