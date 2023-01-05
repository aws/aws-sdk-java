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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/SearchRasterDataCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRasterDataCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** <p/> */
    private Integer approximateResultCount;
    /** <p/> */
    private java.util.List<ItemSource> items;
    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p/>
     * 
     * @param approximateResultCount
     */

    public void setApproximateResultCount(Integer approximateResultCount) {
        this.approximateResultCount = approximateResultCount;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getApproximateResultCount() {
        return this.approximateResultCount;
    }

    /**
     * <p/>
     * 
     * @param approximateResultCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRasterDataCollectionResult withApproximateResultCount(Integer approximateResultCount) {
        setApproximateResultCount(approximateResultCount);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<ItemSource> getItems() {
        return items;
    }

    /**
     * <p/>
     * 
     * @param items
     */

    public void setItems(java.util.Collection<ItemSource> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<ItemSource>(items);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRasterDataCollectionResult withItems(ItemSource... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<ItemSource>(items.length));
        }
        for (ItemSource ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param items
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRasterDataCollectionResult withItems(java.util.Collection<ItemSource> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you receive this token. Use it in your next request to receive the
     *        next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you receive this token. Use it in your next request to receive
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you receive this token. Use it in your next request to receive the
     *        next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRasterDataCollectionResult withNextToken(String nextToken) {
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
        if (getApproximateResultCount() != null)
            sb.append("ApproximateResultCount: ").append(getApproximateResultCount()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRasterDataCollectionResult == false)
            return false;
        SearchRasterDataCollectionResult other = (SearchRasterDataCollectionResult) obj;
        if (other.getApproximateResultCount() == null ^ this.getApproximateResultCount() == null)
            return false;
        if (other.getApproximateResultCount() != null && other.getApproximateResultCount().equals(this.getApproximateResultCount()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getApproximateResultCount() == null) ? 0 : getApproximateResultCount().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchRasterDataCollectionResult clone() {
        try {
            return (SearchRasterDataCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
