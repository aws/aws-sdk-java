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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchFacesByImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The bounding box around the face in the input image that Amazon Rekognition used for the search.
     * </p>
     */
    private BoundingBox searchedFaceBoundingBox;
    /**
     * <p>
     * The level of confidence that the <code>searchedFaceBoundingBox</code>, contains a face.
     * </p>
     */
    private Float searchedFaceConfidence;
    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in the match.
     * </p>
     */
    private java.util.List<FaceMatch> faceMatches;
    /**
     * <p>
     * Version number of the face detection model associated with the input collection (<code>CollectionId</code>).
     * </p>
     */
    private String faceModelVersion;

    /**
     * <p>
     * The bounding box around the face in the input image that Amazon Rekognition used for the search.
     * </p>
     * 
     * @param searchedFaceBoundingBox
     *        The bounding box around the face in the input image that Amazon Rekognition used for the search.
     */

    public void setSearchedFaceBoundingBox(BoundingBox searchedFaceBoundingBox) {
        this.searchedFaceBoundingBox = searchedFaceBoundingBox;
    }

    /**
     * <p>
     * The bounding box around the face in the input image that Amazon Rekognition used for the search.
     * </p>
     * 
     * @return The bounding box around the face in the input image that Amazon Rekognition used for the search.
     */

    public BoundingBox getSearchedFaceBoundingBox() {
        return this.searchedFaceBoundingBox;
    }

    /**
     * <p>
     * The bounding box around the face in the input image that Amazon Rekognition used for the search.
     * </p>
     * 
     * @param searchedFaceBoundingBox
     *        The bounding box around the face in the input image that Amazon Rekognition used for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageResult withSearchedFaceBoundingBox(BoundingBox searchedFaceBoundingBox) {
        setSearchedFaceBoundingBox(searchedFaceBoundingBox);
        return this;
    }

    /**
     * <p>
     * The level of confidence that the <code>searchedFaceBoundingBox</code>, contains a face.
     * </p>
     * 
     * @param searchedFaceConfidence
     *        The level of confidence that the <code>searchedFaceBoundingBox</code>, contains a face.
     */

    public void setSearchedFaceConfidence(Float searchedFaceConfidence) {
        this.searchedFaceConfidence = searchedFaceConfidence;
    }

    /**
     * <p>
     * The level of confidence that the <code>searchedFaceBoundingBox</code>, contains a face.
     * </p>
     * 
     * @return The level of confidence that the <code>searchedFaceBoundingBox</code>, contains a face.
     */

    public Float getSearchedFaceConfidence() {
        return this.searchedFaceConfidence;
    }

    /**
     * <p>
     * The level of confidence that the <code>searchedFaceBoundingBox</code>, contains a face.
     * </p>
     * 
     * @param searchedFaceConfidence
     *        The level of confidence that the <code>searchedFaceBoundingBox</code>, contains a face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageResult withSearchedFaceConfidence(Float searchedFaceConfidence) {
        setSearchedFaceConfidence(searchedFaceConfidence);
        return this;
    }

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in the match.
     * </p>
     * 
     * @return An array of faces that match the input face, along with the confidence in the match.
     */

    public java.util.List<FaceMatch> getFaceMatches() {
        return faceMatches;
    }

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in the match.
     * </p>
     * 
     * @param faceMatches
     *        An array of faces that match the input face, along with the confidence in the match.
     */

    public void setFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        if (faceMatches == null) {
            this.faceMatches = null;
            return;
        }

        this.faceMatches = new java.util.ArrayList<FaceMatch>(faceMatches);
    }

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in the match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceMatches(java.util.Collection)} or {@link #withFaceMatches(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param faceMatches
     *        An array of faces that match the input face, along with the confidence in the match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageResult withFaceMatches(FaceMatch... faceMatches) {
        if (this.faceMatches == null) {
            setFaceMatches(new java.util.ArrayList<FaceMatch>(faceMatches.length));
        }
        for (FaceMatch ele : faceMatches) {
            this.faceMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in the match.
     * </p>
     * 
     * @param faceMatches
     *        An array of faces that match the input face, along with the confidence in the match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageResult withFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        setFaceMatches(faceMatches);
        return this;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input collection (<code>CollectionId</code>).
     * </p>
     * 
     * @param faceModelVersion
     *        Version number of the face detection model associated with the input collection (<code>CollectionId</code>
     *        ).
     */

    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input collection (<code>CollectionId</code>).
     * </p>
     * 
     * @return Version number of the face detection model associated with the input collection (
     *         <code>CollectionId</code>).
     */

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input collection (<code>CollectionId</code>).
     * </p>
     * 
     * @param faceModelVersion
     *        Version number of the face detection model associated with the input collection (<code>CollectionId</code>
     *        ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFacesByImageResult withFaceModelVersion(String faceModelVersion) {
        setFaceModelVersion(faceModelVersion);
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
        if (getSearchedFaceBoundingBox() != null)
            sb.append("SearchedFaceBoundingBox: ").append(getSearchedFaceBoundingBox()).append(",");
        if (getSearchedFaceConfidence() != null)
            sb.append("SearchedFaceConfidence: ").append(getSearchedFaceConfidence()).append(",");
        if (getFaceMatches() != null)
            sb.append("FaceMatches: ").append(getFaceMatches()).append(",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: ").append(getFaceModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFacesByImageResult == false)
            return false;
        SearchFacesByImageResult other = (SearchFacesByImageResult) obj;
        if (other.getSearchedFaceBoundingBox() == null ^ this.getSearchedFaceBoundingBox() == null)
            return false;
        if (other.getSearchedFaceBoundingBox() != null && other.getSearchedFaceBoundingBox().equals(this.getSearchedFaceBoundingBox()) == false)
            return false;
        if (other.getSearchedFaceConfidence() == null ^ this.getSearchedFaceConfidence() == null)
            return false;
        if (other.getSearchedFaceConfidence() != null && other.getSearchedFaceConfidence().equals(this.getSearchedFaceConfidence()) == false)
            return false;
        if (other.getFaceMatches() == null ^ this.getFaceMatches() == null)
            return false;
        if (other.getFaceMatches() != null && other.getFaceMatches().equals(this.getFaceMatches()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSearchedFaceBoundingBox() == null) ? 0 : getSearchedFaceBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getSearchedFaceConfidence() == null) ? 0 : getSearchedFaceConfidence().hashCode());
        hashCode = prime * hashCode + ((getFaceMatches() == null) ? 0 : getFaceMatches().hashCode());
        hashCode = prime * hashCode + ((getFaceModelVersion() == null) ? 0 : getFaceModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public SearchFacesByImageResult clone() {
        try {
            return (SearchFacesByImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
