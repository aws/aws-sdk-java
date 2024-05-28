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
public class AssociateFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * The ID for the existing UserID.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * An array of FaceIDs to associate with the UserID.
     * </p>
     */
    private java.util.List<String> faceIds;
    /**
     * <p>
     * An optional value specifying the minimum confidence in the UserID match to return. The default value is 75.
     * </p>
     */
    private Float userMatchThreshold;
    /**
     * <p>
     * Idempotent token used to identify the request to <code>AssociateFaces</code>. If you use the same token with
     * multiple <code>AssociateFaces</code> requests, the same response is returned. Use ClientRequestToken to prevent
     * the same request from being processed more than once.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection containing the UserID.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * 
     * @return The ID of an existing collection containing the UserID.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection containing the UserID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFacesRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * The ID for the existing UserID.
     * </p>
     * 
     * @param userId
     *        The ID for the existing UserID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID for the existing UserID.
     * </p>
     * 
     * @return The ID for the existing UserID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID for the existing UserID.
     * </p>
     * 
     * @param userId
     *        The ID for the existing UserID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFacesRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * An array of FaceIDs to associate with the UserID.
     * </p>
     * 
     * @return An array of FaceIDs to associate with the UserID.
     */

    public java.util.List<String> getFaceIds() {
        return faceIds;
    }

    /**
     * <p>
     * An array of FaceIDs to associate with the UserID.
     * </p>
     * 
     * @param faceIds
     *        An array of FaceIDs to associate with the UserID.
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
     * An array of FaceIDs to associate with the UserID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceIds(java.util.Collection)} or {@link #withFaceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param faceIds
     *        An array of FaceIDs to associate with the UserID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFacesRequest withFaceIds(String... faceIds) {
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
     * An array of FaceIDs to associate with the UserID.
     * </p>
     * 
     * @param faceIds
     *        An array of FaceIDs to associate with the UserID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFacesRequest withFaceIds(java.util.Collection<String> faceIds) {
        setFaceIds(faceIds);
        return this;
    }

    /**
     * <p>
     * An optional value specifying the minimum confidence in the UserID match to return. The default value is 75.
     * </p>
     * 
     * @param userMatchThreshold
     *        An optional value specifying the minimum confidence in the UserID match to return. The default value is
     *        75.
     */

    public void setUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
    }

    /**
     * <p>
     * An optional value specifying the minimum confidence in the UserID match to return. The default value is 75.
     * </p>
     * 
     * @return An optional value specifying the minimum confidence in the UserID match to return. The default value is
     *         75.
     */

    public Float getUserMatchThreshold() {
        return this.userMatchThreshold;
    }

    /**
     * <p>
     * An optional value specifying the minimum confidence in the UserID match to return. The default value is 75.
     * </p>
     * 
     * @param userMatchThreshold
     *        An optional value specifying the minimum confidence in the UserID match to return. The default value is
     *        75.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFacesRequest withUserMatchThreshold(Float userMatchThreshold) {
        setUserMatchThreshold(userMatchThreshold);
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to <code>AssociateFaces</code>. If you use the same token with
     * multiple <code>AssociateFaces</code> requests, the same response is returned. Use ClientRequestToken to prevent
     * the same request from being processed more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the request to <code>AssociateFaces</code>. If you use the same token
     *        with multiple <code>AssociateFaces</code> requests, the same response is returned. Use ClientRequestToken
     *        to prevent the same request from being processed more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to <code>AssociateFaces</code>. If you use the same token with
     * multiple <code>AssociateFaces</code> requests, the same response is returned. Use ClientRequestToken to prevent
     * the same request from being processed more than once.
     * </p>
     * 
     * @return Idempotent token used to identify the request to <code>AssociateFaces</code>. If you use the same token
     *         with multiple <code>AssociateFaces</code> requests, the same response is returned. Use ClientRequestToken
     *         to prevent the same request from being processed more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to <code>AssociateFaces</code>. If you use the same token with
     * multiple <code>AssociateFaces</code> requests, the same response is returned. Use ClientRequestToken to prevent
     * the same request from being processed more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the request to <code>AssociateFaces</code>. If you use the same token
     *        with multiple <code>AssociateFaces</code> requests, the same response is returned. Use ClientRequestToken
     *        to prevent the same request from being processed more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFacesRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getFaceIds() != null)
            sb.append("FaceIds: ").append(getFaceIds()).append(",");
        if (getUserMatchThreshold() != null)
            sb.append("UserMatchThreshold: ").append(getUserMatchThreshold()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateFacesRequest == false)
            return false;
        AssociateFacesRequest other = (AssociateFacesRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getFaceIds() == null ^ this.getFaceIds() == null)
            return false;
        if (other.getFaceIds() != null && other.getFaceIds().equals(this.getFaceIds()) == false)
            return false;
        if (other.getUserMatchThreshold() == null ^ this.getUserMatchThreshold() == null)
            return false;
        if (other.getUserMatchThreshold() != null && other.getUserMatchThreshold().equals(this.getUserMatchThreshold()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getFaceIds() == null) ? 0 : getFaceIds().hashCode());
        hashCode = prime * hashCode + ((getUserMatchThreshold() == null) ? 0 : getUserMatchThreshold().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateFacesRequest clone() {
        return (AssociateFacesRequest) super.clone();
    }

}
