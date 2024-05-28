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
 * Contains data regarding the input face used for a search.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchedFaceDetails implements Serializable, Cloneable, StructuredPojo {

    private FaceDetail faceDetail;

    /**
     * @param faceDetail
     */

    public void setFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    /**
     * @return
     */

    public FaceDetail getFaceDetail() {
        return this.faceDetail;
    }

    /**
     * @param faceDetail
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchedFaceDetails withFaceDetail(FaceDetail faceDetail) {
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

        if (obj instanceof SearchedFaceDetails == false)
            return false;
        SearchedFaceDetails other = (SearchedFaceDetails) obj;
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

        hashCode = prime * hashCode + ((getFaceDetail() == null) ? 0 : getFaceDetail().hashCode());
        return hashCode;
    }

    @Override
    public SearchedFaceDetails clone() {
        try {
            return (SearchedFaceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.SearchedFaceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
