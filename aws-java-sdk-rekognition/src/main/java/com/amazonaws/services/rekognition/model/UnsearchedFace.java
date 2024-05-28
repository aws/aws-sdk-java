/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Face details inferred from the image but not used for search. The response attribute contains reasons for why a face
 * wasn't used for Search.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsearchedFace implements Serializable, Cloneable, StructuredPojo {

    private FaceDetail faceDetails;
    /**
     * <p>
     * Reasons why a face wasn't used for Search.
     * </p>
     */
    private java.util.List<String> reasons;

    /**
     * @param faceDetails
     */

    public void setFaceDetails(FaceDetail faceDetails) {
        this.faceDetails = faceDetails;
    }

    /**
     * @return
     */

    public FaceDetail getFaceDetails() {
        return this.faceDetails;
    }

    /**
     * @param faceDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsearchedFace withFaceDetails(FaceDetail faceDetails) {
        setFaceDetails(faceDetails);
        return this;
    }

    /**
     * <p>
     * Reasons why a face wasn't used for Search.
     * </p>
     * 
     * @return Reasons why a face wasn't used for Search.
     * @see UnsearchedFaceReason
     */

    public java.util.List<String> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * Reasons why a face wasn't used for Search.
     * </p>
     * 
     * @param reasons
     *        Reasons why a face wasn't used for Search.
     * @see UnsearchedFaceReason
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
     * Reasons why a face wasn't used for Search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        Reasons why a face wasn't used for Search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnsearchedFaceReason
     */

    public UnsearchedFace withReasons(String... reasons) {
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
     * Reasons why a face wasn't used for Search.
     * </p>
     * 
     * @param reasons
     *        Reasons why a face wasn't used for Search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnsearchedFaceReason
     */

    public UnsearchedFace withReasons(java.util.Collection<String> reasons) {
        setReasons(reasons);
        return this;
    }

    /**
     * <p>
     * Reasons why a face wasn't used for Search.
     * </p>
     * 
     * @param reasons
     *        Reasons why a face wasn't used for Search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnsearchedFaceReason
     */

    public UnsearchedFace withReasons(UnsearchedFaceReason... reasons) {
        java.util.ArrayList<String> reasonsCopy = new java.util.ArrayList<String>(reasons.length);
        for (UnsearchedFaceReason value : reasons) {
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
        if (getFaceDetails() != null)
            sb.append("FaceDetails: ").append(getFaceDetails()).append(",");
        if (getReasons() != null)
            sb.append("Reasons: ").append(getReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsearchedFace == false)
            return false;
        UnsearchedFace other = (UnsearchedFace) obj;
        if (other.getFaceDetails() == null ^ this.getFaceDetails() == null)
            return false;
        if (other.getFaceDetails() != null && other.getFaceDetails().equals(this.getFaceDetails()) == false)
            return false;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceDetails() == null) ? 0 : getFaceDetails().hashCode());
        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        return hashCode;
    }

    @Override
    public UnsearchedFace clone() {
        try {
            return (UnsearchedFace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.UnsearchedFaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
