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
 * Object containing both the face metadata (stored in the backend database), and facial attributes that are detected
 * but aren't stored in the database.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaceRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image
     * ID that you assigned.
     * </p>
     */
    private Face face;
    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     */
    private FaceDetail faceDetail;

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image
     * ID that you assigned.
     * </p>
     * 
     * @param face
     *        Describes the face properties such as the bounding box, face ID, image ID of the input image, and external
     *        image ID that you assigned.
     */

    public void setFace(Face face) {
        this.face = face;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image
     * ID that you assigned.
     * </p>
     * 
     * @return Describes the face properties such as the bounding box, face ID, image ID of the input image, and
     *         external image ID that you assigned.
     */

    public Face getFace() {
        return this.face;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image
     * ID that you assigned.
     * </p>
     * 
     * @param face
     *        Describes the face properties such as the bounding box, face ID, image ID of the input image, and external
     *        image ID that you assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceRecord withFace(Face face) {
        setFace(face);
        return this;
    }

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     * 
     * @param faceDetail
     *        Structure containing attributes of the face that the algorithm detected.
     */

    public void setFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     * 
     * @return Structure containing attributes of the face that the algorithm detected.
     */

    public FaceDetail getFaceDetail() {
        return this.faceDetail;
    }

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     * 
     * @param faceDetail
     *        Structure containing attributes of the face that the algorithm detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceRecord withFaceDetail(FaceDetail faceDetail) {
        setFaceDetail(faceDetail);
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
        if (getFace() != null)
            sb.append("Face: ").append(getFace()).append(",");
        if (getFaceDetail() != null)
            sb.append("FaceDetail: ").append(getFaceDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceRecord == false)
            return false;
        FaceRecord other = (FaceRecord) obj;
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        if (other.getFaceDetail() == null ^ this.getFaceDetail() == null)
            return false;
        if (other.getFaceDetail() != null && other.getFaceDetail().equals(this.getFaceDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        hashCode = prime * hashCode + ((getFaceDetail() == null) ? 0 : getFaceDetail().hashCode());
        return hashCode;
    }

    @Override
    public FaceRecord clone() {
        try {
            return (FaceRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.FaceRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
