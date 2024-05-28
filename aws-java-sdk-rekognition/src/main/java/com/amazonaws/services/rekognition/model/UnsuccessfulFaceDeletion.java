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
 * Contains metadata like FaceId, UserID, and Reasons, for a face that was unsuccessfully deleted.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsuccessfulFaceDeletion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier assigned to the face.
     * </p>
     */
    private String faceId;
    /**
     * <p>
     * A provided ID for the UserID. Unique within the collection.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     */
    private java.util.List<String> reasons;

    /**
     * <p>
     * A unique identifier assigned to the face.
     * </p>
     * 
     * @param faceId
     *        A unique identifier assigned to the face.
     */

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * A unique identifier assigned to the face.
     * </p>
     * 
     * @return A unique identifier assigned to the face.
     */

    public String getFaceId() {
        return this.faceId;
    }

    /**
     * <p>
     * A unique identifier assigned to the face.
     * </p>
     * 
     * @param faceId
     *        A unique identifier assigned to the face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsuccessfulFaceDeletion withFaceId(String faceId) {
        setFaceId(faceId);
        return this;
    }

    /**
     * <p>
     * A provided ID for the UserID. Unique within the collection.
     * </p>
     * 
     * @param userId
     *        A provided ID for the UserID. Unique within the collection.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * A provided ID for the UserID. Unique within the collection.
     * </p>
     * 
     * @return A provided ID for the UserID. Unique within the collection.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * A provided ID for the UserID. Unique within the collection.
     * </p>
     * 
     * @param userId
     *        A provided ID for the UserID. Unique within the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsuccessfulFaceDeletion withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     * 
     * @return The reason why the deletion was unsuccessful.
     * @see UnsuccessfulFaceDeletionReason
     */

    public java.util.List<String> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     * 
     * @param reasons
     *        The reason why the deletion was unsuccessful.
     * @see UnsuccessfulFaceDeletionReason
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
     * The reason why the deletion was unsuccessful.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        The reason why the deletion was unsuccessful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnsuccessfulFaceDeletionReason
     */

    public UnsuccessfulFaceDeletion withReasons(String... reasons) {
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
     * The reason why the deletion was unsuccessful.
     * </p>
     * 
     * @param reasons
     *        The reason why the deletion was unsuccessful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnsuccessfulFaceDeletionReason
     */

    public UnsuccessfulFaceDeletion withReasons(java.util.Collection<String> reasons) {
        setReasons(reasons);
        return this;
    }

    /**
     * <p>
     * The reason why the deletion was unsuccessful.
     * </p>
     * 
     * @param reasons
     *        The reason why the deletion was unsuccessful.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnsuccessfulFaceDeletionReason
     */

    public UnsuccessfulFaceDeletion withReasons(UnsuccessfulFaceDeletionReason... reasons) {
        java.util.ArrayList<String> reasonsCopy = new java.util.ArrayList<String>(reasons.length);
        for (UnsuccessfulFaceDeletionReason value : reasons) {
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
        if (getFaceId() != null)
            sb.append("FaceId: ").append(getFaceId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
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

        if (obj instanceof UnsuccessfulFaceDeletion == false)
            return false;
        UnsuccessfulFaceDeletion other = (UnsuccessfulFaceDeletion) obj;
        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
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

        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        return hashCode;
    }

    @Override
    public UnsuccessfulFaceDeletion clone() {
        try {
            return (UnsuccessfulFaceDeletion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.UnsuccessfulFaceDeletionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
