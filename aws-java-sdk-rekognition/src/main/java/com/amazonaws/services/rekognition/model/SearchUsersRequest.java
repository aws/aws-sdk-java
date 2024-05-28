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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of an existing collection containing the UserID, used with a UserId or FaceId. If a FaceId is provided,
     * UserId isn’t required to be present in the Collection.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * ID for the existing User.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * ID for the existing face.
     * </p>
     */
    private String faceId;
    /**
     * <p>
     * Optional value that specifies the minimum confidence in the matched UserID to return. Default value of 80.
     * </p>
     */
    private Float userMatchThreshold;
    /**
     * <p>
     * Maximum number of identities to return.
     * </p>
     */
    private Integer maxUsers;

    /**
     * <p>
     * The ID of an existing collection containing the UserID, used with a UserId or FaceId. If a FaceId is provided,
     * UserId isn’t required to be present in the Collection.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection containing the UserID, used with a UserId or FaceId. If a FaceId is
     *        provided, UserId isn’t required to be present in the Collection.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID, used with a UserId or FaceId. If a FaceId is provided,
     * UserId isn’t required to be present in the Collection.
     * </p>
     * 
     * @return The ID of an existing collection containing the UserID, used with a UserId or FaceId. If a FaceId is
     *         provided, UserId isn’t required to be present in the Collection.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID, used with a UserId or FaceId. If a FaceId is provided,
     * UserId isn’t required to be present in the Collection.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection containing the UserID, used with a UserId or FaceId. If a FaceId is
     *        provided, UserId isn’t required to be present in the Collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * ID for the existing User.
     * </p>
     * 
     * @param userId
     *        ID for the existing User.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * ID for the existing User.
     * </p>
     * 
     * @return ID for the existing User.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * ID for the existing User.
     * </p>
     * 
     * @param userId
     *        ID for the existing User.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * ID for the existing face.
     * </p>
     * 
     * @param faceId
     *        ID for the existing face.
     */

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * ID for the existing face.
     * </p>
     * 
     * @return ID for the existing face.
     */

    public String getFaceId() {
        return this.faceId;
    }

    /**
     * <p>
     * ID for the existing face.
     * </p>
     * 
     * @param faceId
     *        ID for the existing face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersRequest withFaceId(String faceId) {
        setFaceId(faceId);
        return this;
    }

    /**
     * <p>
     * Optional value that specifies the minimum confidence in the matched UserID to return. Default value of 80.
     * </p>
     * 
     * @param userMatchThreshold
     *        Optional value that specifies the minimum confidence in the matched UserID to return. Default value of 80.
     */

    public void setUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
    }

    /**
     * <p>
     * Optional value that specifies the minimum confidence in the matched UserID to return. Default value of 80.
     * </p>
     * 
     * @return Optional value that specifies the minimum confidence in the matched UserID to return. Default value of
     *         80.
     */

    public Float getUserMatchThreshold() {
        return this.userMatchThreshold;
    }

    /**
     * <p>
     * Optional value that specifies the minimum confidence in the matched UserID to return. Default value of 80.
     * </p>
     * 
     * @param userMatchThreshold
     *        Optional value that specifies the minimum confidence in the matched UserID to return. Default value of 80.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersRequest withUserMatchThreshold(Float userMatchThreshold) {
        setUserMatchThreshold(userMatchThreshold);
        return this;
    }

    /**
     * <p>
     * Maximum number of identities to return.
     * </p>
     * 
     * @param maxUsers
     *        Maximum number of identities to return.
     */

    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }

    /**
     * <p>
     * Maximum number of identities to return.
     * </p>
     * 
     * @return Maximum number of identities to return.
     */

    public Integer getMaxUsers() {
        return this.maxUsers;
    }

    /**
     * <p>
     * Maximum number of identities to return.
     * </p>
     * 
     * @param maxUsers
     *        Maximum number of identities to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersRequest withMaxUsers(Integer maxUsers) {
        setMaxUsers(maxUsers);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getFaceId() != null)
            sb.append("FaceId: ").append(getFaceId()).append(",");
        if (getUserMatchThreshold() != null)
            sb.append("UserMatchThreshold: ").append(getUserMatchThreshold()).append(",");
        if (getMaxUsers() != null)
            sb.append("MaxUsers: ").append(getMaxUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersRequest == false)
            return false;
        SearchUsersRequest other = (SearchUsersRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getUserMatchThreshold() == null ^ this.getUserMatchThreshold() == null)
            return false;
        if (other.getUserMatchThreshold() != null && other.getUserMatchThreshold().equals(this.getUserMatchThreshold()) == false)
            return false;
        if (other.getMaxUsers() == null ^ this.getMaxUsers() == null)
            return false;
        if (other.getMaxUsers() != null && other.getMaxUsers().equals(this.getMaxUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode + ((getUserMatchThreshold() == null) ? 0 : getUserMatchThreshold().hashCode());
        hashCode = prime * hashCode + ((getMaxUsers() == null) ? 0 : getMaxUsers().hashCode());
        return hashCode;
    }

    @Override
    public SearchUsersRequest clone() {
        return (SearchUsersRequest) super.clone();
    }

}
