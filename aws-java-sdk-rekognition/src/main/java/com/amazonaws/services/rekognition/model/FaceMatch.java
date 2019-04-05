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
 * Provides face metadata. In addition, it also provides the confidence in the match of this face with the input face.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaceMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Confidence in the match of this face with the input face.
     * </p>
     */
    private Float similarity;
    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image
     * ID that you assigned.
     * </p>
     */
    private Face face;

    /**
     * <p>
     * Confidence in the match of this face with the input face.
     * </p>
     * 
     * @param similarity
     *        Confidence in the match of this face with the input face.
     */

    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

    /**
     * <p>
     * Confidence in the match of this face with the input face.
     * </p>
     * 
     * @return Confidence in the match of this face with the input face.
     */

    public Float getSimilarity() {
        return this.similarity;
    }

    /**
     * <p>
     * Confidence in the match of this face with the input face.
     * </p>
     * 
     * @param similarity
     *        Confidence in the match of this face with the input face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceMatch withSimilarity(Float similarity) {
        setSimilarity(similarity);
        return this;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image
     * ID that you assigned.
     * </p>
     * 
     * @param face
     *        Describes the face properties such as the bounding box, face ID, image ID of the source image, and
     *        external image ID that you assigned.
     */

    public void setFace(Face face) {
        this.face = face;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image
     * ID that you assigned.
     * </p>
     * 
     * @return Describes the face properties such as the bounding box, face ID, image ID of the source image, and
     *         external image ID that you assigned.
     */

    public Face getFace() {
        return this.face;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image
     * ID that you assigned.
     * </p>
     * 
     * @param face
     *        Describes the face properties such as the bounding box, face ID, image ID of the source image, and
     *        external image ID that you assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceMatch withFace(Face face) {
        setFace(face);
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
        if (getSimilarity() != null)
            sb.append("Similarity: ").append(getSimilarity()).append(",");
        if (getFace() != null)
            sb.append("Face: ").append(getFace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceMatch == false)
            return false;
        FaceMatch other = (FaceMatch) obj;
        if (other.getSimilarity() == null ^ this.getSimilarity() == null)
            return false;
        if (other.getSimilarity() != null && other.getSimilarity().equals(this.getSimilarity()) == false)
            return false;
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimilarity() == null) ? 0 : getSimilarity().hashCode());
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        return hashCode;
    }

    @Override
    public FaceMatch clone() {
        try {
            return (FaceMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.FaceMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
