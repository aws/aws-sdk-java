/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListCollections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCollectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about each collection.
     * </p>
     */
    private java.util.List<CollectionSummary> collectionSummaries;
    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details about each collection.
     * </p>
     * 
     * @return Details about each collection.
     */

    public java.util.List<CollectionSummary> getCollectionSummaries() {
        return collectionSummaries;
    }

    /**
     * <p>
     * Details about each collection.
     * </p>
     * 
     * @param collectionSummaries
     *        Details about each collection.
     */

    public void setCollectionSummaries(java.util.Collection<CollectionSummary> collectionSummaries) {
        if (collectionSummaries == null) {
            this.collectionSummaries = null;
            return;
        }

        this.collectionSummaries = new java.util.ArrayList<CollectionSummary>(collectionSummaries);
    }

    /**
     * <p>
     * Details about each collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollectionSummaries(java.util.Collection)} or {@link #withCollectionSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param collectionSummaries
     *        Details about each collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectionsResult withCollectionSummaries(CollectionSummary... collectionSummaries) {
        if (this.collectionSummaries == null) {
            setCollectionSummaries(new java.util.ArrayList<CollectionSummary>(collectionSummaries.length));
        }
        for (CollectionSummary ele : collectionSummaries) {
            this.collectionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about each collection.
     * </p>
     * 
     * @param collectionSummaries
     *        Details about each collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectionsResult withCollectionSummaries(java.util.Collection<CollectionSummary> collectionSummaries) {
        setCollectionSummaries(collectionSummaries);
        return this;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCollectionSummaries() != null)
            sb.append("CollectionSummaries: ").append(getCollectionSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
        if (other.getCollectionSummaries() == null ^ this.getCollectionSummaries() == null)
            return false;
        if (other.getCollectionSummaries() != null && other.getCollectionSummaries().equals(this.getCollectionSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionSummaries() == null) ? 0 : getCollectionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
