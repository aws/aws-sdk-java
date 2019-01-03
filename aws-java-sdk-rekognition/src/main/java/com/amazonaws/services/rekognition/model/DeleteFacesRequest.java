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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Collection from which to remove the specific faces.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * An array of face IDs to delete.
     * </p>
     */
    private java.util.List<String> faceIds;

    /**
     * <p>
     * Collection from which to remove the specific faces.
     * </p>
     * 
     * @param collectionId
     *        Collection from which to remove the specific faces.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * Collection from which to remove the specific faces.
     * </p>
     * 
     * @return Collection from which to remove the specific faces.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * Collection from which to remove the specific faces.
     * </p>
     * 
     * @param collectionId
     *        Collection from which to remove the specific faces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFacesRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * An array of face IDs to delete.
     * </p>
     * 
     * @return An array of face IDs to delete.
     */

    public java.util.List<String> getFaceIds() {
        return faceIds;
    }

    /**
     * <p>
     * An array of face IDs to delete.
     * </p>
     * 
     * @param faceIds
     *        An array of face IDs to delete.
     */

    public void setFaceIds(java.util.Collection<String> faceIds) {
        if (faceIds == null) {
            this.faceIds = null;
            return;
        }

        this.faceIds = new java.util.ArrayList<String>(faceIds);
    }

    /**
     * <p>
     * An array of face IDs to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceIds(java.util.Collection)} or {@link #withFaceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param faceIds
     *        An array of face IDs to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFacesRequest withFaceIds(String... faceIds) {
        if (this.faceIds == null) {
            setFaceIds(new java.util.ArrayList<String>(faceIds.length));
        }
        for (String ele : faceIds) {
            this.faceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of face IDs to delete.
     * </p>
     * 
     * @param faceIds
     *        An array of face IDs to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFacesRequest withFaceIds(java.util.Collection<String> faceIds) {
        setFaceIds(faceIds);
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
        if (getFaceIds() != null)
            sb.append("FaceIds: ").append(getFaceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFacesRequest == false)
            return false;
        DeleteFacesRequest other = (DeleteFacesRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getFaceIds() == null ^ this.getFaceIds() == null)
            return false;
        if (other.getFaceIds() != null && other.getFaceIds().equals(this.getFaceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getFaceIds() == null) ? 0 : getFaceIds().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFacesRequest clone() {
        return (DeleteFacesRequest) super.clone();
    }

}
