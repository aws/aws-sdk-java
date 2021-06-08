/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListQuerySuggestionsBlockLists"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQuerySuggestionsBlockListsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Summary items for a block list.
     * </p>
     * <p>
     * This includes summary items on the block list ID, block list name, when the block list was created, when the
     * block list was last updated, and the count of block words/phrases in the block list.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     */
    private java.util.List<QuerySuggestionsBlockListSummary> blockListSummaryItems;
    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of block lists.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary items for a block list.
     * </p>
     * <p>
     * This includes summary items on the block list ID, block list name, when the block list was created, when the
     * block list was last updated, and the count of block words/phrases in the block list.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @return Summary items for a block list.</p>
     *         <p>
     *         This includes summary items on the block list ID, block list name, when the block list was created, when
     *         the block list was last updated, and the count of block words/phrases in the block list.
     *         </p>
     *         <p>
     *         For information on the current quota limits for block lists, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     */

    public java.util.List<QuerySuggestionsBlockListSummary> getBlockListSummaryItems() {
        return blockListSummaryItems;
    }

    /**
     * <p>
     * Summary items for a block list.
     * </p>
     * <p>
     * This includes summary items on the block list ID, block list name, when the block list was created, when the
     * block list was last updated, and the count of block words/phrases in the block list.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param blockListSummaryItems
     *        Summary items for a block list.</p>
     *        <p>
     *        This includes summary items on the block list ID, block list name, when the block list was created, when
     *        the block list was last updated, and the count of block words/phrases in the block list.
     *        </p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     */

    public void setBlockListSummaryItems(java.util.Collection<QuerySuggestionsBlockListSummary> blockListSummaryItems) {
        if (blockListSummaryItems == null) {
            this.blockListSummaryItems = null;
            return;
        }

        this.blockListSummaryItems = new java.util.ArrayList<QuerySuggestionsBlockListSummary>(blockListSummaryItems);
    }

    /**
     * <p>
     * Summary items for a block list.
     * </p>
     * <p>
     * This includes summary items on the block list ID, block list name, when the block list was created, when the
     * block list was last updated, and the count of block words/phrases in the block list.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockListSummaryItems(java.util.Collection)} or
     * {@link #withBlockListSummaryItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param blockListSummaryItems
     *        Summary items for a block list.</p>
     *        <p>
     *        This includes summary items on the block list ID, block list name, when the block list was created, when
     *        the block list was last updated, and the count of block words/phrases in the block list.
     *        </p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuerySuggestionsBlockListsResult withBlockListSummaryItems(QuerySuggestionsBlockListSummary... blockListSummaryItems) {
        if (this.blockListSummaryItems == null) {
            setBlockListSummaryItems(new java.util.ArrayList<QuerySuggestionsBlockListSummary>(blockListSummaryItems.length));
        }
        for (QuerySuggestionsBlockListSummary ele : blockListSummaryItems) {
            this.blockListSummaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary items for a block list.
     * </p>
     * <p>
     * This includes summary items on the block list ID, block list name, when the block list was created, when the
     * block list was last updated, and the count of block words/phrases in the block list.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param blockListSummaryItems
     *        Summary items for a block list.</p>
     *        <p>
     *        This includes summary items on the block list ID, block list name, when the block list was created, when
     *        the block list was last updated, and the count of block words/phrases in the block list.
     *        </p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuerySuggestionsBlockListsResult withBlockListSummaryItems(java.util.Collection<QuerySuggestionsBlockListSummary> blockListSummaryItems) {
        setBlockListSummaryItems(blockListSummaryItems);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of block lists.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *        to retrieve the next set of block lists.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of block lists.
     * </p>
     * 
     * @return If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *         to retrieve the next set of block lists.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of block lists.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *        to retrieve the next set of block lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuerySuggestionsBlockListsResult withNextToken(String nextToken) {
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
        if (getBlockListSummaryItems() != null)
            sb.append("BlockListSummaryItems: ").append(getBlockListSummaryItems()).append(",");
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

        if (obj instanceof ListQuerySuggestionsBlockListsResult == false)
            return false;
        ListQuerySuggestionsBlockListsResult other = (ListQuerySuggestionsBlockListsResult) obj;
        if (other.getBlockListSummaryItems() == null ^ this.getBlockListSummaryItems() == null)
            return false;
        if (other.getBlockListSummaryItems() != null && other.getBlockListSummaryItems().equals(this.getBlockListSummaryItems()) == false)
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

        hashCode = prime * hashCode + ((getBlockListSummaryItems() == null) ? 0 : getBlockListSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListQuerySuggestionsBlockListsResult clone() {
        try {
            return (ListQuerySuggestionsBlockListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
