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
 * A face that <a>IndexFaces</a> detected, but didn't index. Use the <code>Reasons</code> response attribute to
 * determine why a face wasn't indexed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnindexedFace implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of reasons that specify why a face wasn't indexed.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from
     * the camera.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     * <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_BRIGHTNESS - The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_SHARPNESS - The image is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_CONFIDENCE - The face was detected with a low confidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> reasons;
    /**
     * <p>
     * The structure that contains attributes of a face that <code>IndexFaces</code>detected, but didn't index.
     * </p>
     */
    private FaceDetail faceDetail;

    /**
     * <p>
     * An array of reasons that specify why a face wasn't indexed.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from
     * the camera.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     * <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_BRIGHTNESS - The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_SHARPNESS - The image is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_CONFIDENCE - The face was detected with a low confidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of reasons that specify why a face wasn't indexed. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away
     *         from the camera.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     *         <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LOW_BRIGHTNESS - The image is too dark.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LOW_SHARPNESS - The image is too blurry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LOW_CONFIDENCE - The face was detected with a low confidence.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     *         </p>
     *         </li>
     * @see Reason
     */

    public java.util.List<String> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * An array of reasons that specify why a face wasn't indexed.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from
     * the camera.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     * <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_BRIGHTNESS - The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_SHARPNESS - The image is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_CONFIDENCE - The face was detected with a low confidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasons
     *        An array of reasons that specify why a face wasn't indexed. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away
     *        from the camera.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     *        <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_BRIGHTNESS - The image is too dark.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_SHARPNESS - The image is too blurry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_CONFIDENCE - The face was detected with a low confidence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     *        </p>
     *        </li>
     * @see Reason
     */

    public void setReasons(java.util.Collection<String> reasons) {
        if (reasons == null) {
            this.reasons = null;
            return;
        }

        this.reasons = new java.util.ArrayList<String>(reasons);
    }

    /**
     * <p>
     * An array of reasons that specify why a face wasn't indexed.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from
     * the camera.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     * <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_BRIGHTNESS - The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_SHARPNESS - The image is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_CONFIDENCE - The face was detected with a low confidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        An array of reasons that specify why a face wasn't indexed. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away
     *        from the camera.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     *        <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_BRIGHTNESS - The image is too dark.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_SHARPNESS - The image is too blurry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_CONFIDENCE - The face was detected with a low confidence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reason
     */

    public UnindexedFace withReasons(String... reasons) {
        if (this.reasons == null) {
            setReasons(new java.util.ArrayList<String>(reasons.length));
        }
        for (String ele : reasons) {
            this.reasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of reasons that specify why a face wasn't indexed.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from
     * the camera.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     * <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_BRIGHTNESS - The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_SHARPNESS - The image is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_CONFIDENCE - The face was detected with a low confidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasons
     *        An array of reasons that specify why a face wasn't indexed. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away
     *        from the camera.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     *        <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_BRIGHTNESS - The image is too dark.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_SHARPNESS - The image is too blurry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_CONFIDENCE - The face was detected with a low confidence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reason
     */

    public UnindexedFace withReasons(java.util.Collection<String> reasons) {
        setReasons(reasons);
        return this;
    }

    /**
     * <p>
     * An array of reasons that specify why a face wasn't indexed.
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from
     * the camera.
     * </p>
     * </li>
     * <li>
     * <p>
     * EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     * <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_BRIGHTNESS - The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_SHARPNESS - The image is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * LOW_CONFIDENCE - The face was detected with a low confidence.
     * </p>
     * </li>
     * <li>
     * <p>
     * SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasons
     *        An array of reasons that specify why a face wasn't indexed. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away
     *        from the camera.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the
     *        <code>MaxFaces</code> input parameter for <code>IndexFaces</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_BRIGHTNESS - The image is too dark.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_SHARPNESS - The image is too blurry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LOW_CONFIDENCE - The face was detected with a low confidence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SMALL_BOUNDING_BOX - The bounding box around the face is too small.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reason
     */

    public UnindexedFace withReasons(Reason... reasons) {
        java.util.ArrayList<String> reasonsCopy = new java.util.ArrayList<String>(reasons.length);
        for (Reason value : reasons) {
            reasonsCopy.add(value.toString());
        }
        if (getReasons() == null) {
            setReasons(reasonsCopy);
        } else {
            getReasons().addAll(reasonsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The structure that contains attributes of a face that <code>IndexFaces</code>detected, but didn't index.
     * </p>
     * 
     * @param faceDetail
     *        The structure that contains attributes of a face that <code>IndexFaces</code>detected, but didn't index.
     */

    public void setFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    /**
     * <p>
     * The structure that contains attributes of a face that <code>IndexFaces</code>detected, but didn't index.
     * </p>
     * 
     * @return The structure that contains attributes of a face that <code>IndexFaces</code>detected, but didn't index.
     */

    public FaceDetail getFaceDetail() {
        return this.faceDetail;
    }

    /**
     * <p>
     * The structure that contains attributes of a face that <code>IndexFaces</code>detected, but didn't index.
     * </p>
     * 
     * @param faceDetail
     *        The structure that contains attributes of a face that <code>IndexFaces</code>detected, but didn't index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnindexedFace withFaceDetail(FaceDetail faceDetail) {
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
        if (getReasons() != null)
            sb.append("Reasons: ").append(getReasons()).append(",");
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

        if (obj instanceof UnindexedFace == false)
            return false;
        UnindexedFace other = (UnindexedFace) obj;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
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

        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        hashCode = prime * hashCode + ((getFaceDetail() == null) ? 0 : getFaceDetail().hashCode());
        return hashCode;
    }

    @Override
    public UnindexedFace clone() {
        try {
            return (UnindexedFace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.UnindexedFaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
