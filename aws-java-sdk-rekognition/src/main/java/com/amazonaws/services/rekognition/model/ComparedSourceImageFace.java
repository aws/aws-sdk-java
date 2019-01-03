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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Type that describes the face Amazon Rekognition chose to compare with the faces in the target. This contains a
 * bounding box for the selected face and confidence level that the bounding box contains a face. Note that Amazon
 * Rekognition selects the largest face in the source image for this comparison.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComparedSourceImageFace implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * Confidence level that the selected bounding box contains a face.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     * 
     * @param boundingBox
     *        Bounding box of the face.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     * 
     * @return Bounding box of the face.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     * 
     * @param boundingBox
     *        Bounding box of the face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedSourceImageFace withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * Confidence level that the selected bounding box contains a face.
     * </p>
     * 
     * @param confidence
     *        Confidence level that the selected bounding box contains a face.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Confidence level that the selected bounding box contains a face.
     * </p>
     * 
     * @return Confidence level that the selected bounding box contains a face.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Confidence level that the selected bounding box contains a face.
     * </p>
     * 
     * @param confidence
     *        Confidence level that the selected bounding box contains a face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedSourceImageFace withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: ").append(getBoundingBox()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ComparedSourceImageFaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
