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
 * Information about a face detected in a video analysis request and the time the face was detected in the video.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaceDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the face was detected.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * The face properties for the detected face.
     * </p>
     */
    private FaceDetail face;

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the face was detected.
     * </p>
     * 
     * @param timestamp
     *        Time, in milliseconds from the start of the video, that the face was detected.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the face was detected.
     * </p>
     * 
     * @return Time, in milliseconds from the start of the video, that the face was detected.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the face was detected.
     * </p>
     * 
     * @param timestamp
     *        Time, in milliseconds from the start of the video, that the face was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetection withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The face properties for the detected face.
     * </p>
     * 
     * @param face
     *        The face properties for the detected face.
     */

    public void setFace(FaceDetail face) {
        this.face = face;
    }

    /**
     * <p>
     * The face properties for the detected face.
     * </p>
     * 
     * @return The face properties for the detected face.
     */

    public FaceDetail getFace() {
        return this.face;
    }

    /**
     * <p>
     * The face properties for the detected face.
     * </p>
     * 
     * @param face
     *        The face properties for the detected face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceDetection withFace(FaceDetail face) {
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
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

        if (obj instanceof FaceDetection == false)
            return false;
        FaceDetection other = (FaceDetection) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        return hashCode;
    }

    @Override
    public FaceDetection clone() {
        try {
            return (FaceDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.FaceDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
