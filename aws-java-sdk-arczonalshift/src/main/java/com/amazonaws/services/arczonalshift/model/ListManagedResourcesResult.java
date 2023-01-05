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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListManagedResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListManagedResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The items in the response list.
     * </p>
     */
    private java.util.List<ManagedResourceSummary> items;
    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The items in the response list.
     * </p>
     * 
     * @return The items in the response list.
     */

    public java.util.List<ManagedResourceSummary> getItems() {
        return items;
    }

    /**
     * <p>
     * The items in the response list.
     * </p>
     * 
     * @param items
     *        The items in the response list.
     */

    public void setItems(java.util.Collection<ManagedResourceSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<ManagedResourceSummary>(items);
    }

    /**
     * <p>
     * The items in the response list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The items in the response list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedResourcesResult withItems(ManagedResourceSummary... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<ManagedResourceSummary>(items.length));
        }
        for (ManagedResourceSummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The items in the response list.
     * </p>
     * 
     * @param items
     *        The items in the response list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedResourcesResult withItems(java.util.Collection<ManagedResourceSummary> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @return Specifies that you want to receive the next page of results. Valid only if you received a
     *         <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *         available. Set this parameter to the value provided by the previous call's <code>NextToken</code>
     *         response to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedResourcesResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof ListManagedResourcesResult == false)
            return false;
        ListManagedResourcesResult other = (ListManagedResourcesResult) obj;
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

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListManagedResourcesResult clone() {
        try {
            return (ListManagedResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
