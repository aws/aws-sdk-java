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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token that you can use in the subsequent request to
     * retrieve the next set of groups that are mapped to users.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Summary information for list of groups that are mapped to users.
     * </p>
     */
    private java.util.List<GroupSummary> items;

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token that you can use in the subsequent request to
     * retrieve the next set of groups that are mapped to users.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token that you can use in the subsequent
     *        request to retrieve the next set of groups that are mapped to users.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token that you can use in the subsequent request to
     * retrieve the next set of groups that are mapped to users.
     * </p>
     * 
     * @return If the response is truncated, Amazon Q Business returns this token that you can use in the subsequent
     *         request to retrieve the next set of groups that are mapped to users.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token that you can use in the subsequent request to
     * retrieve the next set of groups that are mapped to users.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token that you can use in the subsequent
     *        request to retrieve the next set of groups that are mapped to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Summary information for list of groups that are mapped to users.
     * </p>
     * 
     * @return Summary information for list of groups that are mapped to users.
     */

    public java.util.List<GroupSummary> getItems() {
        return items;
    }

    /**
     * <p>
     * Summary information for list of groups that are mapped to users.
     * </p>
     * 
     * @param items
     *        Summary information for list of groups that are mapped to users.
     */

    public void setItems(java.util.Collection<GroupSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<GroupSummary>(items);
    }

    /**
     * <p>
     * Summary information for list of groups that are mapped to users.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Summary information for list of groups that are mapped to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withItems(GroupSummary... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<GroupSummary>(items.length));
        }
        for (GroupSummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for list of groups that are mapped to users.
     * </p>
     * 
     * @param items
     *        Summary information for list of groups that are mapped to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withItems(java.util.Collection<GroupSummary> items) {
        setItems(items);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGroupsResult == false)
            return false;
        ListGroupsResult other = (ListGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsResult clone() {
        try {
            return (ListGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
