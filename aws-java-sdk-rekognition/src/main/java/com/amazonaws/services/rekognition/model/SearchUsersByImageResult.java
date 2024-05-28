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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchUsersByImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the confidence in the match. The returned
     * structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse action is successful.
     * </p>
     */
    private java.util.List<UserMatch> userMatches;
    /**
     * <p>
     * Version number of the face detection model associated with the input collection CollectionId.
     * </p>
     */
    private String faceModelVersion;
    /**
     * <p>
     * A list of FaceDetail objects containing the BoundingBox for the largest face in image, as well as the confidence
     * in the bounding box, that was searched for matches. If no valid face is detected in the image the response will
     * contain no SearchedFace object.
     * </p>
     */
    private SearchedFaceDetails searchedFace;
    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from the specified image but not used for
     * search. Contains reasons that describe why a face wasn't used for Search.
     * </p>
     */
    private java.util.List<UnsearchedFace> unsearchedFaces;

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the confidence in the match. The returned
     * structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse action is successful.
     * </p>
     * 
     * @return An array of UserID objects that matched the input face, along with the confidence in the match. The
     *         returned structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse
     *         action is successful.
     */

    public java.util.List<UserMatch> getUserMatches() {
        return userMatches;
    }

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the confidence in the match. The returned
     * structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse action is successful.
     * </p>
     * 
     * @param userMatches
     *        An array of UserID objects that matched the input face, along with the confidence in the match. The
     *        returned structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse
     *        action is successful.
     */

    public void setUserMatches(java.util.Collection<UserMatch> userMatches) {
        if (userMatches == null) {
            this.userMatches = null;
            return;
        }

        this.userMatches = new java.util.ArrayList<UserMatch>(userMatches);
    }

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the confidence in the match. The returned
     * structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse action is successful.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserMatches(java.util.Collection)} or {@link #withUserMatches(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userMatches
     *        An array of UserID objects that matched the input face, along with the confidence in the match. The
     *        returned structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse
     *        action is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageResult withUserMatches(UserMatch... userMatches) {
        if (this.userMatches == null) {
            setUserMatches(new java.util.ArrayList<UserMatch>(userMatches.length));
        }
        for (UserMatch ele : userMatches) {
            this.userMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of UserID objects that matched the input face, along with the confidence in the match. The returned
     * structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse action is successful.
     * </p>
     * 
     * @param userMatches
     *        An array of UserID objects that matched the input face, along with the confidence in the match. The
     *        returned structure will be empty if there are no matches. Returned if the SearchUsersByImageResponse
     *        action is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageResult withUserMatches(java.util.Collection<UserMatch> userMatches) {
        setUserMatches(userMatches);
        return this;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input collection CollectionId.
     * </p>
     * 
     * @param faceModelVersion
     *        Version number of the face detection model associated with the input collection CollectionId.
     */

    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input collection CollectionId.
     * </p>
     * 
     * @return Version number of the face detection model associated with the input collection CollectionId.
     */

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input collection CollectionId.
     * </p>
     * 
     * @param faceModelVersion
     *        Version number of the face detection model associated with the input collection CollectionId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageResult withFaceModelVersion(String faceModelVersion) {
        setFaceModelVersion(faceModelVersion);
        return this;
    }

    /**
     * <p>
     * A list of FaceDetail objects containing the BoundingBox for the largest face in image, as well as the confidence
     * in the bounding box, that was searched for matches. If no valid face is detected in the image the response will
     * contain no SearchedFace object.
     * </p>
     * 
     * @param searchedFace
     *        A list of FaceDetail objects containing the BoundingBox for the largest face in image, as well as the
     *        confidence in the bounding box, that was searched for matches. If no valid face is detected in the image
     *        the response will contain no SearchedFace object.
     */

    public void setSearchedFace(SearchedFaceDetails searchedFace) {
        this.searchedFace = searchedFace;
    }

    /**
     * <p>
     * A list of FaceDetail objects containing the BoundingBox for the largest face in image, as well as the confidence
     * in the bounding box, that was searched for matches. If no valid face is detected in the image the response will
     * contain no SearchedFace object.
     * </p>
     * 
     * @return A list of FaceDetail objects containing the BoundingBox for the largest face in image, as well as the
     *         confidence in the bounding box, that was searched for matches. If no valid face is detected in the image
     *         the response will contain no SearchedFace object.
     */

    public SearchedFaceDetails getSearchedFace() {
        return this.searchedFace;
    }

    /**
     * <p>
     * A list of FaceDetail objects containing the BoundingBox for the largest face in image, as well as the confidence
     * in the bounding box, that was searched for matches. If no valid face is detected in the image the response will
     * contain no SearchedFace object.
     * </p>
     * 
     * @param searchedFace
     *        A list of FaceDetail objects containing the BoundingBox for the largest face in image, as well as the
     *        confidence in the bounding box, that was searched for matches. If no valid face is detected in the image
     *        the response will contain no SearchedFace object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageResult withSearchedFace(SearchedFaceDetails searchedFace) {
        setSearchedFace(searchedFace);
        return this;
    }

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from the specified image but not used for
     * search. Contains reasons that describe why a face wasn't used for Search.
     * </p>
     * 
     * @return List of UnsearchedFace objects. Contains the face details infered from the specified image but not used
     *         for search. Contains reasons that describe why a face wasn't used for Search.
     */

    public java.util.List<UnsearchedFace> getUnsearchedFaces() {
        return unsearchedFaces;
    }

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from the specified image but not used for
     * search. Contains reasons that describe why a face wasn't used for Search.
     * </p>
     * 
     * @param unsearchedFaces
     *        List of UnsearchedFace objects. Contains the face details infered from the specified image but not used
     *        for search. Contains reasons that describe why a face wasn't used for Search.
     */

    public void setUnsearchedFaces(java.util.Collection<UnsearchedFace> unsearchedFaces) {
        if (unsearchedFaces == null) {
            this.unsearchedFaces = null;
            return;
        }

        this.unsearchedFaces = new java.util.ArrayList<UnsearchedFace>(unsearchedFaces);
    }

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from the specified image but not used for
     * search. Contains reasons that describe why a face wasn't used for Search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsearchedFaces(java.util.Collection)} or {@link #withUnsearchedFaces(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param unsearchedFaces
     *        List of UnsearchedFace objects. Contains the face details infered from the specified image but not used
     *        for search. Contains reasons that describe why a face wasn't used for Search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageResult withUnsearchedFaces(UnsearchedFace... unsearchedFaces) {
        if (this.unsearchedFaces == null) {
            setUnsearchedFaces(new java.util.ArrayList<UnsearchedFace>(unsearchedFaces.length));
        }
        for (UnsearchedFace ele : unsearchedFaces) {
            this.unsearchedFaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of UnsearchedFace objects. Contains the face details infered from the specified image but not used for
     * search. Contains reasons that describe why a face wasn't used for Search.
     * </p>
     * 
     * @param unsearchedFaces
     *        List of UnsearchedFace objects. Contains the face details infered from the specified image but not used
     *        for search. Contains reasons that describe why a face wasn't used for Search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageResult withUnsearchedFaces(java.util.Collection<UnsearchedFace> unsearchedFaces) {
        setUnsearchedFaces(unsearchedFaces);
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
        if (getUserMatches() != null)
            sb.append("UserMatches: ").append(getUserMatches()).append(",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: ").append(getFaceModelVersion()).append(",");
        if (getSearchedFace() != null)
            sb.append("SearchedFace: ").append(getSearchedFace()).append(",");
        if (getUnsearchedFaces() != null)
            sb.append("UnsearchedFaces: ").append(getUnsearchedFaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersByImageResult == false)
            return false;
        SearchUsersByImageResult other = (SearchUsersByImageResult) obj;
        if (other.getUserMatches() == null ^ this.getUserMatches() == null)
            return false;
        if (other.getUserMatches() != null && other.getUserMatches().equals(this.getUserMatches()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        if (other.getSearchedFace() == null ^ this.getSearchedFace() == null)
            return false;
        if (other.getSearchedFace() != null && other.getSearchedFace().equals(this.getSearchedFace()) == false)
            return false;
        if (other.getUnsearchedFaces() == null ^ this.getUnsearchedFaces() == null)
            return false;
        if (other.getUnsearchedFaces() != null && other.getUnsearchedFaces().equals(this.getUnsearchedFaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserMatches() == null) ? 0 : getUserMatches().hashCode());
        hashCode = prime * hashCode + ((getFaceModelVersion() == null) ? 0 : getFaceModelVersion().hashCode());
        hashCode = prime * hashCode + ((getSearchedFace() == null) ? 0 : getSearchedFace().hashCode());
        hashCode = prime * hashCode + ((getUnsearchedFaces() == null) ? 0 : getUnsearchedFaces().hashCode());
        return hashCode;
    }

    @Override
    public SearchUsersByImageResult clone() {
        try {
            return (SearchUsersByImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
