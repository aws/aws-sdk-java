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
 * An object representing an Amazon ECR image layer failure.
 * </p>
 */
public class LayerFailure implements Serializable, Cloneable {

    /**
     * <p>
     * The layer digest associated with the failure.
     * </p>
     */
    private String layerDigest;
    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The layer digest associated with the failure.
     * </p>
     * 
     * @param layerDigest
     *        The layer digest associated with the failure.
     */

    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    /**
     * <p>
     * The layer digest associated with the failure.
     * </p>
     * 
     * @return The layer digest associated with the failure.
     */

    public String getLayerDigest() {
        return this.layerDigest;
    }

    /**
     * <p>
     * The layer digest associated with the failure.
     * </p>
     * 
     * @param layerDigest
     *        The layer digest associated with the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerFailure withLayerDigest(String layerDigest) {
        setLayerDigest(layerDigest);
        return this;
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * 
     * @param failureCode
     *        The failure code associated with the failure.
     * @see LayerFailureCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * 
     * @return The failure code associated with the failure.
     * @see LayerFailureCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * 
     * @param failureCode
     *        The failure code associated with the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayerFailureCode
     */

    public LayerFailure withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * 
     * @param failureCode
     *        The failure code associated with the failure.
     * @see LayerFailureCode
     */

    public void setFailureCode(LayerFailureCode failureCode) {
        this.failureCode = failureCode.toString();
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * 
     * @param failureCode
     *        The failure code associated with the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayerFailureCode
     */

    public LayerFailure withFailureCode(LayerFailureCode failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @return The reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerFailure withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getFailureCode() != null)
            sb.append("FailureCode: " + getFailureCode() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayerFailure == false)
            return false;
        LayerFailure other = (LayerFailure) obj;
        if (other.getLayerDigest() == null ^ this.getLayerDigest() == null)
            return false;
        if (other.getLayerDigest() != null && other.getLayerDigest().equals(this.getLayerDigest()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public LayerFailure clone() {
        try {
            return (LayerFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
