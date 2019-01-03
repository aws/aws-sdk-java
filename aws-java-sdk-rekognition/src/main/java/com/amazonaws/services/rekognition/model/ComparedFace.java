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
 * Provides face metadata for target image faces that are analyzed by <code>CompareFaces</code> and
 * <code>RecognizeCelebrities</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComparedFace implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     */
    private java.util.List<Landmark> landmarks;
    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * </p>
     */
    private Pose pose;
    /**
     * <p>
     * Identifies face image brightness and sharpness.
     * </p>
     */
    private ImageQuality quality;

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

    public ComparedFace withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * 
     * @param confidence
     *        Level of confidence that what the bounding box contains is a face.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * 
     * @return Level of confidence that what the bounding box contains is a face.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * 
     * @param confidence
     *        Level of confidence that what the bounding box contains is a face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedFace withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     * 
     * @return An array of facial landmarks.
     */

    public java.util.List<Landmark> getLandmarks() {
        return landmarks;
    }

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     * 
     * @param landmarks
     *        An array of facial landmarks.
     */

    public void setLandmarks(java.util.Collection<Landmark> landmarks) {
        if (landmarks == null) {
            this.landmarks = null;
            return;
        }

        this.landmarks = new java.util.ArrayList<Landmark>(landmarks);
    }

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLandmarks(java.util.Collection)} or {@link #withLandmarks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param landmarks
     *        An array of facial landmarks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedFace withLandmarks(Landmark... landmarks) {
        if (this.landmarks == null) {
            setLandmarks(new java.util.ArrayList<Landmark>(landmarks.length));
        }
        for (Landmark ele : landmarks) {
            this.landmarks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     * 
     * @param landmarks
     *        An array of facial landmarks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedFace withLandmarks(java.util.Collection<Landmark> landmarks) {
        setLandmarks(landmarks);
        return this;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * </p>
     * 
     * @param pose
     *        Indicates the pose of the face as determined by its pitch, roll, and yaw.
     */

    public void setPose(Pose pose) {
        this.pose = pose;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * </p>
     * 
     * @return Indicates the pose of the face as determined by its pitch, roll, and yaw.
     */

    public Pose getPose() {
        return this.pose;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * </p>
     * 
     * @param pose
     *        Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedFace withPose(Pose pose) {
        setPose(pose);
        return this;
    }

    /**
     * <p>
     * Identifies face image brightness and sharpness.
     * </p>
     * 
     * @param quality
     *        Identifies face image brightness and sharpness.
     */

    public void setQuality(ImageQuality quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * Identifies face image brightness and sharpness.
     * </p>
     * 
     * @return Identifies face image brightness and sharpness.
     */

    public ImageQuality getQuality() {
        return this.quality;
    }

    /**
     * <p>
     * Identifies face image brightness and sharpness.
     * </p>
     * 
     * @param quality
     *        Identifies face image brightness and sharpness.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparedFace withQuality(ImageQuality quality) {
        setQuality(quality);
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
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getLandmarks() != null)
            sb.append("Landmarks: ").append(getLandmarks()).append(",");
        if (getPose() != null)
            sb.append("Pose: ").append(getPose()).append(",");
        if (getQuality() != null)
            sb.append("Quality: ").append(getQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComparedFace == false)
            return false;
        ComparedFace other = (ComparedFace) obj;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getLandmarks() == null ^ this.getLandmarks() == null)
            return false;
        if (other.getLandmarks() != null && other.getLandmarks().equals(this.getLandmarks()) == false)
            return false;
        if (other.getPose() == null ^ this.getPose() == null)
            return false;
        if (other.getPose() != null && other.getPose().equals(this.getPose()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getLandmarks() == null) ? 0 : getLandmarks().hashCode());
        hashCode = prime * hashCode + ((getPose() == null) ? 0 : getPose().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        return hashCode;
    }

    @Override
    public ComparedFace clone() {
        try {
            return (ComparedFace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ComparedFaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
