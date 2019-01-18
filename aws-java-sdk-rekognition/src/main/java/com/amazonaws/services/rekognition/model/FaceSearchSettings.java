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
 * Input face recognition parameters for an Amazon Rekognition stream processor. <code>FaceRecognitionSettings</code> is
 * a request parameter for <a>CreateStreamProcessor</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaceSearchSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a collection that contains faces that you want to search for.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 70. 0
     * is the lowest confidence. 100 is the highest confidence.
     * </p>
     */
    private Float faceMatchThreshold;

    /**
     * <p>
     * The ID of a collection that contains faces that you want to search for.
     * </p>
     * 
     * @param collectionId
     *        The ID of a collection that contains faces that you want to search for.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of a collection that contains faces that you want to search for.
     * </p>
     * 
     * @return The ID of a collection that contains faces that you want to search for.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The ID of a collection that contains faces that you want to search for.
     * </p>
     * 
     * @param collectionId
     *        The ID of a collection that contains faces that you want to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceSearchSettings withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 70. 0
     * is the lowest confidence. 100 is the highest confidence.
     * </p>
     * 
     * @param faceMatchThreshold
     *        Minimum face match confidence score that must be met to return a result for a recognized face. Default is
     *        70. 0 is the lowest confidence. 100 is the highest confidence.
     */

    public void setFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
    }

    /**
     * <p>
     * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 70. 0
     * is the lowest confidence. 100 is the highest confidence.
     * </p>
     * 
     * @return Minimum face match confidence score that must be met to return a result for a recognized face. Default is
     *         70. 0 is the lowest confidence. 100 is the highest confidence.
     */

    public Float getFaceMatchThreshold() {
        return this.faceMatchThreshold;
    }

    /**
     * <p>
     * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 70. 0
     * is the lowest confidence. 100 is the highest confidence.
     * </p>
     * 
     * @param faceMatchThreshold
     *        Minimum face match confidence score that must be met to return a result for a recognized face. Default is
     *        70. 0 is the lowest confidence. 100 is the highest confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaceSearchSettings withFaceMatchThreshold(Float faceMatchThreshold) {
        setFaceMatchThreshold(faceMatchThreshold);
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
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
        if (getFaceMatchThreshold() != null)
            sb.append("FaceMatchThreshold: ").append(getFaceMatchThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceSearchSettings == false)
            return false;
        FaceSearchSettings other = (FaceSearchSettings) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getFaceMatchThreshold() == null ^ this.getFaceMatchThreshold() == null)
            return false;
        if (other.getFaceMatchThreshold() != null && other.getFaceMatchThreshold().equals(this.getFaceMatchThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getFaceMatchThreshold() == null) ? 0 : getFaceMatchThreshold().hashCode());
        return hashCode;
    }

    @Override
    public FaceSearchSettings clone() {
        try {
            return (FaceSearchSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.FaceSearchSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
