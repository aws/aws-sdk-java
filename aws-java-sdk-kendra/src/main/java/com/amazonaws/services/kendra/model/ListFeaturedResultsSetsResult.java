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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListFeaturedResultsSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFeaturedResultsSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of summary information for one or more featured results sets.
     * </p>
     */
    private java.util.List<FeaturedResultsSetSummary> featuredResultsSetSummaryItems;
    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns a pagination token in the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summary information for one or more featured results sets.
     * </p>
     * 
     * @return An array of summary information for one or more featured results sets.
     */

    public java.util.List<FeaturedResultsSetSummary> getFeaturedResultsSetSummaryItems() {
        return featuredResultsSetSummaryItems;
    }

    /**
     * <p>
     * An array of summary information for one or more featured results sets.
     * </p>
     * 
     * @param featuredResultsSetSummaryItems
     *        An array of summary information for one or more featured results sets.
     */

    public void setFeaturedResultsSetSummaryItems(java.util.Collection<FeaturedResultsSetSummary> featuredResultsSetSummaryItems) {
        if (featuredResultsSetSummaryItems == null) {
            this.featuredResultsSetSummaryItems = null;
            return;
        }

        this.featuredResultsSetSummaryItems = new java.util.ArrayList<FeaturedResultsSetSummary>(featuredResultsSetSummaryItems);
    }

    /**
     * <p>
     * An array of summary information for one or more featured results sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeaturedResultsSetSummaryItems(java.util.Collection)} or
     * {@link #withFeaturedResultsSetSummaryItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param featuredResultsSetSummaryItems
     *        An array of summary information for one or more featured results sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturedResultsSetsResult withFeaturedResultsSetSummaryItems(FeaturedResultsSetSummary... featuredResultsSetSummaryItems) {
        if (this.featuredResultsSetSummaryItems == null) {
            setFeaturedResultsSetSummaryItems(new java.util.ArrayList<FeaturedResultsSetSummary>(featuredResultsSetSummaryItems.length));
        }
        for (FeaturedResultsSetSummary ele : featuredResultsSetSummaryItems) {
            this.featuredResultsSetSummaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more featured results sets.
     * </p>
     * 
     * @param featuredResultsSetSummaryItems
     *        An array of summary information for one or more featured results sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturedResultsSetsResult withFeaturedResultsSetSummaryItems(java.util.Collection<FeaturedResultsSetSummary> featuredResultsSetSummaryItems) {
        setFeaturedResultsSetSummaryItems(featuredResultsSetSummaryItems);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns a pagination token in the response.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns a pagination token in the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns a pagination token in the response.
     * </p>
     * 
     * @return If the response is truncated, Amazon Kendra returns a pagination token in the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns a pagination token in the response.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns a pagination token in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturedResultsSetsResult withNextToken(String nextToken) {
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
        if (getFeaturedResultsSetSummaryItems() != null)
            sb.append("FeaturedResultsSetSummaryItems: ").append(getFeaturedResultsSetSummaryItems()).append(",");
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

        if (obj instanceof ListFeaturedResultsSetsResult == false)
            return false;
        ListFeaturedResultsSetsResult other = (ListFeaturedResultsSetsResult) obj;
        if (other.getFeaturedResultsSetSummaryItems() == null ^ this.getFeaturedResultsSetSummaryItems() == null)
            return false;
        if (other.getFeaturedResultsSetSummaryItems() != null
                && other.getFeaturedResultsSetSummaryItems().equals(this.getFeaturedResultsSetSummaryItems()) == false)
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

        hashCode = prime * hashCode + ((getFeaturedResultsSetSummaryItems() == null) ? 0 : getFeaturedResultsSetSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFeaturedResultsSetsResult clone() {
        try {
            return (ListFeaturedResultsSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
