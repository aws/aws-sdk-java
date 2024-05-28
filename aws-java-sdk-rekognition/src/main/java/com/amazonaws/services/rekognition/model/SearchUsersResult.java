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
public class SearchUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of UserMatch objects that matched the input face along with the confidence in the match. Array will be
     * empty if there are no matches.
     * </p>
     */
    private java.util.List<UserMatch> userMatches;
    /**
     * <p>
     * Version number of the face detection model associated with the input CollectionId.
     * </p>
     */
    private String faceModelVersion;
    /**
     * <p>
     * Contains the ID of a face that was used to search for matches in a collection.
     * </p>
     */
    private SearchedFace searchedFace;
    /**
     * <p>
     * Contains the ID of the UserID that was used to search for matches in a collection.
     * </p>
     */
    private SearchedUser searchedUser;

    /**
     * <p>
     * An array of UserMatch objects that matched the input face along with the confidence in the match. Array will be
     * empty if there are no matches.
     * </p>
     * 
     * @return An array of UserMatch objects that matched the input face along with the confidence in the match. Array
     *         will be empty if there are no matches.
     */

    public java.util.List<UserMatch> getUserMatches() {
        return userMatches;
    }

    /**
     * <p>
     * An array of UserMatch objects that matched the input face along with the confidence in the match. Array will be
     * empty if there are no matches.
     * </p>
     * 
     * @param userMatches
     *        An array of UserMatch objects that matched the input face along with the confidence in the match. Array
     *        will be empty if there are no matches.
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
     * An array of UserMatch objects that matched the input face along with the confidence in the match. Array will be
     * empty if there are no matches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserMatches(java.util.Collection)} or {@link #withUserMatches(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userMatches
     *        An array of UserMatch objects that matched the input face along with the confidence in the match. Array
     *        will be empty if there are no matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersResult withUserMatches(UserMatch... userMatches) {
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
     * An array of UserMatch objects that matched the input face along with the confidence in the match. Array will be
     * empty if there are no matches.
     * </p>
     * 
     * @param userMatches
     *        An array of UserMatch objects that matched the input face along with the confidence in the match. Array
     *        will be empty if there are no matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersResult withUserMatches(java.util.Collection<UserMatch> userMatches) {
        setUserMatches(userMatches);
        return this;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input CollectionId.
     * </p>
     * 
     * @param faceModelVersion
     *        Version number of the face detection model associated with the input CollectionId.
     */

    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input CollectionId.
     * </p>
     * 
     * @return Version number of the face detection model associated with the input CollectionId.
     */

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input CollectionId.
     * </p>
     * 
     * @param faceModelVersion
     *        Version number of the face detection model associated with the input CollectionId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersResult withFaceModelVersion(String faceModelVersion) {
        setFaceModelVersion(faceModelVersion);
        return this;
    }

    /**
     * <p>
     * Contains the ID of a face that was used to search for matches in a collection.
     * </p>
     * 
     * @param searchedFace
     *        Contains the ID of a face that was used to search for matches in a collection.
     */

    public void setSearchedFace(SearchedFace searchedFace) {
        this.searchedFace = searchedFace;
    }

    /**
     * <p>
     * Contains the ID of a face that was used to search for matches in a collection.
     * </p>
     * 
     * @return Contains the ID of a face that was used to search for matches in a collection.
     */

    public SearchedFace getSearchedFace() {
        return this.searchedFace;
    }

    /**
     * <p>
     * Contains the ID of a face that was used to search for matches in a collection.
     * </p>
     * 
     * @param searchedFace
     *        Contains the ID of a face that was used to search for matches in a collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersResult withSearchedFace(SearchedFace searchedFace) {
        setSearchedFace(searchedFace);
        return this;
    }

    /**
     * <p>
     * Contains the ID of the UserID that was used to search for matches in a collection.
     * </p>
     * 
     * @param searchedUser
     *        Contains the ID of the UserID that was used to search for matches in a collection.
     */

    public void setSearchedUser(SearchedUser searchedUser) {
        this.searchedUser = searchedUser;
    }

    /**
     * <p>
     * Contains the ID of the UserID that was used to search for matches in a collection.
     * </p>
     * 
     * @return Contains the ID of the UserID that was used to search for matches in a collection.
     */

    public SearchedUser getSearchedUser() {
        return this.searchedUser;
    }

    /**
     * <p>
     * Contains the ID of the UserID that was used to search for matches in a collection.
     * </p>
     * 
     * @param searchedUser
     *        Contains the ID of the UserID that was used to search for matches in a collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersResult withSearchedUser(SearchedUser searchedUser) {
        setSearchedUser(searchedUser);
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
        if (getSearchedUser() != null)
            sb.append("SearchedUser: ").append(getSearchedUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersResult == false)
            return false;
        SearchUsersResult other = (SearchUsersResult) obj;
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
        if (other.getSearchedUser() == null ^ this.getSearchedUser() == null)
            return false;
        if (other.getSearchedUser() != null && other.getSearchedUser().equals(this.getSearchedUser()) == false)
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
        hashCode = prime * hashCode + ((getSearchedUser() == null) ? 0 : getSearchedUser().hashCode());
        return hashCode;
    }

    @Override
    public SearchUsersResult clone() {
        try {
            return (SearchUsersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
