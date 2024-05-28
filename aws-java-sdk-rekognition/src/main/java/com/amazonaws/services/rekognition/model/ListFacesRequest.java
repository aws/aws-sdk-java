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
public class ListFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the collection from which to list the faces.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of faces.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of faces to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An array of user IDs to filter results with when listing faces in a collection.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * An array of face IDs to filter results with when listing faces in a collection.
     * </p>
     */
    private java.util.List<String> faceIds;

    /**
     * <p>
     * ID of the collection from which to list the faces.
     * </p>
     * 
     * @param collectionId
     *        ID of the collection from which to list the faces.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of the collection from which to list the faces.
     * </p>
     * 
     * @return ID of the collection from which to list the faces.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * ID of the collection from which to list the faces.
     * </p>
     * 
     * @param collectionId
     *        ID of the collection from which to list the faces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFacesRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of faces.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        faces.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of faces.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition
     *         returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *         faces.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of faces.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        faces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFacesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of faces to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of faces to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of faces to return.
     * </p>
     * 
     * @return Maximum number of faces to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of faces to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of faces to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFacesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An array of user IDs to filter results with when listing faces in a collection.
     * </p>
     * 
     * @param userId
     *        An array of user IDs to filter results with when listing faces in a collection.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * An array of user IDs to filter results with when listing faces in a collection.
     * </p>
     * 
     * @return An array of user IDs to filter results with when listing faces in a collection.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * An array of user IDs to filter results with when listing faces in a collection.
     * </p>
     * 
     * @param userId
     *        An array of user IDs to filter results with when listing faces in a collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFacesRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * An array of face IDs to filter results with when listing faces in a collection.
     * </p>
     * 
     * @return An array of face IDs to filter results with when listing faces in a collection.
     */

    public java.util.List<String> getFaceIds() {
        return faceIds;
    }

    /**
     * <p>
     * An array of face IDs to filter results with when listing faces in a collection.
     * </p>
     * 
     * @param faceIds
     *        An array of face IDs to filter results with when listing faces in a collection.
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
     * An array of face IDs to filter results with when listing faces in a collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceIds(java.util.Collection)} or {@link #withFaceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param faceIds
     *        An array of face IDs to filter results with when listing faces in a collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFacesRequest withFaceIds(String... faceIds) {
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
     * An array of face IDs to filter results with when listing faces in a collection.
     * </p>
     * 
     * @param faceIds
     *        An array of face IDs to filter results with when listing faces in a collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFacesRequest withFaceIds(java.util.Collection<String> faceIds) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
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

        if (obj instanceof ListFacesRequest == false)
            return false;
        ListFacesRequest other = (ListFacesRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getFaceIds() == null) ? 0 : getFaceIds().hashCode());
        return hashCode;
    }

    @Override
    public ListFacesRequest clone() {
        return (ListFacesRequest) super.clone();
    }

}
