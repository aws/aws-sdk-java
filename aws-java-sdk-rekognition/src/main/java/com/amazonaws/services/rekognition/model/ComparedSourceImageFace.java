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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Type that describes the face Amazon Rekognition chose to compare with the faces in the target. This contains a
 * bounding box for the selected face and confidence level that the bounding box contains a face. Note that Amazon
 * Rekognition selects the largest face in the source image for this comparison.
 * </p>
 */
public class ComparedSourceImageFace implements Serializable, Cloneable {

    private BoundingBox boundingBox;
    /**
     * <p>
     * Confidence that the selected bounding box contains a face.
     * </p>
     */
    private Float confidence;

    /**
     * @param boundingBox
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * @return
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * @param boundingBox
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedSourceImageFace withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * Confidence that the selected bounding box contains a face.
     * </p>
     * 
     * @param confidence
     *        Confidence that the selected bounding box contains a face.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Confidence that the selected bounding box contains a face.
     * </p>
     * 
     * @return Confidence that the selected bounding box contains a face.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Confidence that the selected bounding box contains a face.
     * </p>
     * 
     * @param confidence
     *        Confidence that the selected bounding box contains a face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedSourceImageFace withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComparedSourceImageFace == false)
            return false;
        ComparedSourceImageFace other = (ComparedSourceImageFace) obj;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public ComparedSourceImageFace clone() {
        try {
            return (ComparedSourceImageFace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
