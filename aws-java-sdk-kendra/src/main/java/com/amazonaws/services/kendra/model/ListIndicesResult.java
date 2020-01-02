/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListIndices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIndicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     */
    private java.util.List<IndexConfigurationSummary> indexConfigurationSummaryItems;
    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of indexes.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     * 
     * @return An array of summary information for one or more indexes.
     */

    public java.util.List<IndexConfigurationSummary> getIndexConfigurationSummaryItems() {
        return indexConfigurationSummaryItems;
    }

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     * 
     * @param indexConfigurationSummaryItems
     *        An array of summary information for one or more indexes.
     */

    public void setIndexConfigurationSummaryItems(java.util.Collection<IndexConfigurationSummary> indexConfigurationSummaryItems) {
        if (indexConfigurationSummaryItems == null) {
            this.indexConfigurationSummaryItems = null;
            return;
        }

        this.indexConfigurationSummaryItems = new java.util.ArrayList<IndexConfigurationSummary>(indexConfigurationSummaryItems);
    }

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndexConfigurationSummaryItems(java.util.Collection)} or
     * {@link #withIndexConfigurationSummaryItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param indexConfigurationSummaryItems
     *        An array of summary information for one or more indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesResult withIndexConfigurationSummaryItems(IndexConfigurationSummary... indexConfigurationSummaryItems) {
        if (this.indexConfigurationSummaryItems == null) {
            setIndexConfigurationSummaryItems(new java.util.ArrayList<IndexConfigurationSummary>(indexConfigurationSummaryItems.length));
        }
        for (IndexConfigurationSummary ele : indexConfigurationSummaryItems) {
            this.indexConfigurationSummaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     * 
     * @param indexConfigurationSummaryItems
     *        An array of summary information for one or more indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesResult withIndexConfigurationSummaryItems(java.util.Collection<IndexConfigurationSummary> indexConfigurationSummaryItems) {
        setIndexConfigurationSummaryItems(indexConfigurationSummaryItems);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of indexes.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *        to retrieve the next set of indexes.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of indexes.
     * </p>
     * 
     * @return If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *         to retrieve the next set of indexes.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of indexes.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *        to retrieve the next set of indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesResult withNextToken(String nextToken) {
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
        if (getIndexConfigurationSummaryItems() != null)
            sb.append("IndexConfigurationSummaryItems: ").append(getIndexConfigurationSummaryItems()).append(",");
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

        if (obj instanceof ListIndicesResult == false)
            return false;
        ListIndicesResult other = (ListIndicesResult) obj;
        if (other.getIndexConfigurationSummaryItems() == null ^ this.getIndexConfigurationSummaryItems() == null)
            return false;
        if (other.getIndexConfigurationSummaryItems() != null
                && other.getIndexConfigurationSummaryItems().equals(this.getIndexConfigurationSummaryItems()) == false)
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

        hashCode = prime * hashCode + ((getIndexConfigurationSummaryItems() == null) ? 0 : getIndexConfigurationSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIndicesResult clone() {
        try {
            return (ListIndicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
