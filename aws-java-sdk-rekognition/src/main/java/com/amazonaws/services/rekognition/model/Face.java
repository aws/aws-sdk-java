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
 * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID
 * that you assigned.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Face implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     */
    private String faceId;
    /**
     * <p>
     * Bounding box of the face.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the input image.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     */
    private String externalImageId;
    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a different object such as a tree).
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * 
     * @param faceId
     *        Unique identifier that Amazon Rekognition assigns to the face.
     */

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * 
     * @return Unique identifier that Amazon Rekognition assigns to the face.
     */

    public String getFaceId() {
        return this.faceId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * 
     * @param faceId
     *        Unique identifier that Amazon Rekognition assigns to the face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Face withFaceId(String faceId) {
        setFaceId(faceId);
        return this;
    }

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

    public Face withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the input image.
     * </p>
     * 
     * @param imageId
     *        Unique identifier that Amazon Rekognition assigns to the input image.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the input image.
     * </p>
     * 
     * @return Unique identifier that Amazon Rekognition assigns to the input image.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the input image.
     * </p>
     * 
     * @param imageId
     *        Unique identifier that Amazon Rekognition assigns to the input image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Face withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * 
     * @param externalImageId
     *        Identifier that you assign to all the faces in the input image.
     */

    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * 
     * @return Identifier that you assign to all the faces in the input image.
     */

    public String getExternalImageId() {
        return this.externalImageId;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * 
     * @param externalImageId
     *        Identifier that you assign to all the faces in the input image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Face withExternalImageId(String externalImageId) {
        setExternalImageId(externalImageId);
        return this;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a different object such as a tree).
     * </p>
     * 
     * @param confidence
     *        Confidence level that the bounding box contains a face (and not a different object such as a tree).
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a different object such as a tree).
     * </p>
     * 
     * @return Confidence level that the bounding box contains a face (and not a different object such as a tree).
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a different object such as a tree).
     * </p>
     * 
     * @param confidence
     *        Confidence level that the bounding box contains a face (and not a different object such as a tree).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Face withConfidence(Float confidence) {
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
        if (getFaceId() != null)
            sb.append("FaceId: ").append(getFaceId()).append(",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: ").append(getBoundingBox()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getExternalImageId() != null)
            sb.append("ExternalImageId: ").append(getExternalImageId()).append(",");
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

        if (obj instanceof Face == false)
            return false;
        Face other = (Face) obj;
        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getExternalImageId() == null ^ this.getExternalImageId() == null)
            return false;
        if (other.getExternalImageId() != null && other.getExternalImageId().equals(this.getExternalImageId()) == false)
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

        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getExternalImageId() == null) ? 0 : getExternalImageId().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public Face clone() {
        try {
            return (Face) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.FaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
