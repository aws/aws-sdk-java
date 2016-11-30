/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SearchFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * ID of a face to find matches for in the collection.
     * </p>
     */
    private String faceId;
    /**
     * <p>
     * Maximum number of faces to return. The API will return the maximum number of faces with the highest confidence in
     * the match.
     * </p>
     */
    private Integer maxFaces;
    /**
     * <p>
     * Optional value specifying the minimum confidence in the face match to return. For example, don't return any
     * matches where confidence in matches is less than 70%.
     * </p>
     */
    private Float faceMatchThreshold;

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * 
     * @param collectionId
     *        ID of the collection to search.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * 
     * @return ID of the collection to search.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * 
     * @param collectionId
     *        ID of the collection to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * ID of a face to find matches for in the collection.
     * </p>
     * 
     * @param faceId
     *        ID of a face to find matches for in the collection.
     */

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * ID of a face to find matches for in the collection.
     * </p>
     * 
     * @return ID of a face to find matches for in the collection.
     */

    public String getFaceId() {
        return this.faceId;
    }

    /**
     * <p>
     * ID of a face to find matches for in the collection.
     * </p>
     * 
     * @param faceId
     *        ID of a face to find matches for in the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesRequest withFaceId(String faceId) {
        setFaceId(faceId);
        return this;
    }

    /**
     * <p>
     * Maximum number of faces to return. The API will return the maximum number of faces with the highest confidence in
     * the match.
     * </p>
     * 
     * @param maxFaces
     *        Maximum number of faces to return. The API will return the maximum number of faces with the highest
     *        confidence in the match.
     */

    public void setMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
    }

    /**
     * <p>
     * Maximum number of faces to return. The API will return the maximum number of faces with the highest confidence in
     * the match.
     * </p>
     * 
     * @return Maximum number of faces to return. The API will return the maximum number of faces with the highest
     *         confidence in the match.
     */

    public Integer getMaxFaces() {
        return this.maxFaces;
    }

    /**
     * <p>
     * Maximum number of faces to return. The API will return the maximum number of faces with the highest confidence in
     * the match.
     * </p>
     * 
     * @param maxFaces
     *        Maximum number of faces to return. The API will return the maximum number of faces with the highest
     *        confidence in the match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesRequest withMaxFaces(Integer maxFaces) {
        setMaxFaces(maxFaces);
        return this;
    }

    /**
     * <p>
     * Optional value specifying the minimum confidence in the face match to return. For example, don't return any
     * matches where confidence in matches is less than 70%.
     * </p>
     * 
     * @param faceMatchThreshold
     *        Optional value specifying the minimum confidence in the face match to return. For example, don't return
     *        any matches where confidence in matches is less than 70%.
     */

    public void setFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
    }

    /**
     * <p>
     * Optional value specifying the minimum confidence in the face match to return. For example, don't return any
     * matches where confidence in matches is less than 70%.
     * </p>
     * 
     * @return Optional value specifying the minimum confidence in the face match to return. For example, don't return
     *         any matches where confidence in matches is less than 70%.
     */

    public Float getFaceMatchThreshold() {
        return this.faceMatchThreshold;
    }

    /**
     * <p>
     * Optional value specifying the minimum confidence in the face match to return. For example, don't return any
     * matches where confidence in matches is less than 70%.
     * </p>
     * 
     * @param faceMatchThreshold
     *        Optional value specifying the minimum confidence in the face match to return. For example, don't return
     *        any matches where confidence in matches is less than 70%.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesRequest withFaceMatchThreshold(Float faceMatchThreshold) {
        setFaceMatchThreshold(faceMatchThreshold);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("CollectionId: " + getCollectionId() + ",");
        if (getFaceId() != null)
            sb.append("FaceId: " + getFaceId() + ",");
        if (getMaxFaces() != null)
            sb.append("MaxFaces: " + getMaxFaces() + ",");
        if (getFaceMatchThreshold() != null)
            sb.append("FaceMatchThreshold: " + getFaceMatchThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFacesRequest == false)
            return false;
        SearchFacesRequest other = (SearchFacesRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getMaxFaces() == null ^ this.getMaxFaces() == null)
            return false;
        if (other.getMaxFaces() != null && other.getMaxFaces().equals(this.getMaxFaces()) == false)
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
        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode + ((getMaxFaces() == null) ? 0 : getMaxFaces().hashCode());
        hashCode = prime * hashCode + ((getFaceMatchThreshold() == null) ? 0 : getFaceMatchThreshold().hashCode());
        return hashCode;
    }

    @Override
    public SearchFacesRequest clone() {
        return (SearchFacesRequest) super.clone();
    }
}
