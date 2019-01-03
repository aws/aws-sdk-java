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
public class ListCollectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     */
    private java.util.List<String> collectionIds;
    /**
     * <p>
     * If the result is truncated, the response provides a <code>NextToken</code> that you can use in the subsequent
     * request to fetch the next set of collection IDs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Version numbers of the face detection models associated with the collections in the array
     * <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version number for
     * the face detection model used by the collection in <code>CollectionId[2]</code>.
     * </p>
     */
    private java.util.List<String> faceModelVersions;

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     * 
     * @return An array of collection IDs.
     */

    public java.util.List<String> getCollectionIds() {
        return collectionIds;
    }

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     * 
     * @param collectionIds
     *        An array of collection IDs.
     */

    public void setCollectionIds(java.util.Collection<String> collectionIds) {
        if (collectionIds == null) {
            this.collectionIds = null;
            return;
        }

        this.collectionIds = new java.util.ArrayList<String>(collectionIds);
    }

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollectionIds(java.util.Collection)} or {@link #withCollectionIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param collectionIds
     *        An array of collection IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectionsResult withCollectionIds(String... collectionIds) {
        if (this.collectionIds == null) {
            setCollectionIds(new java.util.ArrayList<String>(collectionIds.length));
        }
        for (String ele : collectionIds) {
            this.collectionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of collection IDs.
     * </p>
     * 
     * @param collectionIds
     *        An array of collection IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectionsResult withCollectionIds(java.util.Collection<String> collectionIds) {
        setCollectionIds(collectionIds);
        return this;
    }

    /**
     * <p>
     * If the result is truncated, the response provides a <code>NextToken</code> that you can use in the subsequent
     * request to fetch the next set of collection IDs.
     * </p>
     * 
     * @param nextToken
     *        If the result is truncated, the response provides a <code>NextToken</code> that you can use in the
     *        subsequent request to fetch the next set of collection IDs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result is truncated, the response provides a <code>NextToken</code> that you can use in the subsequent
     * request to fetch the next set of collection IDs.
     * </p>
     * 
     * @return If the result is truncated, the response provides a <code>NextToken</code> that you can use in the
     *         subsequent request to fetch the next set of collection IDs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result is truncated, the response provides a <code>NextToken</code> that you can use in the subsequent
     * request to fetch the next set of collection IDs.
     * </p>
     * 
     * @param nextToken
     *        If the result is truncated, the response provides a <code>NextToken</code> that you can use in the
     *        subsequent request to fetch the next set of collection IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Version numbers of the face detection models associated with the collections in the array
     * <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version number for
     * the face detection model used by the collection in <code>CollectionId[2]</code>.
     * </p>
     * 
     * @return Version numbers of the face detection models associated with the collections in the array
     *         <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version
     *         number for the face detection model used by the collection in <code>CollectionId[2]</code>.
     */

    public java.util.List<String> getFaceModelVersions() {
        return faceModelVersions;
    }

    /**
     * <p>
     * Version numbers of the face detection models associated with the collections in the array
     * <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version number for
     * the face detection model used by the collection in <code>CollectionId[2]</code>.
     * </p>
     * 
     * @param faceModelVersions
     *        Version numbers of the face detection models associated with the collections in the array
     *        <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version
     *        number for the face detection model used by the collection in <code>CollectionId[2]</code>.
     */

    public void setFaceModelVersions(java.util.Collection<String> faceModelVersions) {
        if (faceModelVersions == null) {
            this.faceModelVersions = null;
            return;
        }

        this.faceModelVersions = new java.util.ArrayList<String>(faceModelVersions);
    }

    /**
     * <p>
     * Version numbers of the face detection models associated with the collections in the array
     * <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version number for
     * the face detection model used by the collection in <code>CollectionId[2]</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceModelVersions(java.util.Collection)} or {@link #withFaceModelVersions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param faceModelVersions
     *        Version numbers of the face detection models associated with the collections in the array
     *        <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version
     *        number for the face detection model used by the collection in <code>CollectionId[2]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectionsResult withFaceModelVersions(String... faceModelVersions) {
        if (this.faceModelVersions == null) {
            setFaceModelVersions(new java.util.ArrayList<String>(faceModelVersions.length));
        }
        for (String ele : faceModelVersions) {
            this.faceModelVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Version numbers of the face detection models associated with the collections in the array
     * <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version number for
     * the face detection model used by the collection in <code>CollectionId[2]</code>.
     * </p>
     * 
     * @param faceModelVersions
     *        Version numbers of the face detection models associated with the collections in the array
     *        <code>CollectionIds</code>. For example, the value of <code>FaceModelVersions[2]</code> is the version
     *        number for the face detection model used by the collection in <code>CollectionId[2]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectionsResult withFaceModelVersions(java.util.Collection<String> faceModelVersions) {
        setFaceModelVersions(faceModelVersions);
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
        if (getCollectionIds() != null)
            sb.append("CollectionIds: ").append(getCollectionIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFaceModelVersions() != null)
            sb.append("FaceModelVersions: ").append(getFaceModelVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCollectionsResult == false)
            return false;
        ListCollectionsResult other = (ListCollectionsResult) obj;
        if (other.getCollectionIds() == null ^ this.getCollectionIds() == null)
            return false;
        if (other.getCollectionIds() != null && other.getCollectionIds().equals(this.getCollectionIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFaceModelVersions() == null ^ this.getFaceModelVersions() == null)
            return false;
        if (other.getFaceModelVersions() != null && other.getFaceModelVersions().equals(this.getFaceModelVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionIds() == null) ? 0 : getCollectionIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFaceModelVersions() == null) ? 0 : getFaceModelVersions().hashCode());
        return hashCode;
    }

    @Override
    public ListCollectionsResult clone() {
        try {
            return (ListCollectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
