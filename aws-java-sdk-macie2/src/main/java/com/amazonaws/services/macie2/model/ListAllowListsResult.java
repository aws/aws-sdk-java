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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListAllowLists" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAllowListsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects, one for each allow list.
     * </p>
     */
    private java.util.List<AllowListSummary> allowLists;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects, one for each allow list.
     * </p>
     * 
     * @return An array of objects, one for each allow list.
     */

    public java.util.List<AllowListSummary> getAllowLists() {
        return allowLists;
    }

    /**
     * <p>
     * An array of objects, one for each allow list.
     * </p>
     * 
     * @param allowLists
     *        An array of objects, one for each allow list.
     */

    public void setAllowLists(java.util.Collection<AllowListSummary> allowLists) {
        if (allowLists == null) {
            this.allowLists = null;
            return;
        }

        this.allowLists = new java.util.ArrayList<AllowListSummary>(allowLists);
    }

    /**
     * <p>
     * An array of objects, one for each allow list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowLists(java.util.Collection)} or {@link #withAllowLists(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowLists
     *        An array of objects, one for each allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowListsResult withAllowLists(AllowListSummary... allowLists) {
        if (this.allowLists == null) {
            setAllowLists(new java.util.ArrayList<AllowListSummary>(allowLists.length));
        }
        for (AllowListSummary ele : allowLists) {
            this.allowLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each allow list.
     * </p>
     * 
     * @param allowLists
     *        An array of objects, one for each allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowListsResult withAllowLists(java.util.Collection<AllowListSummary> allowLists) {
        setAllowLists(allowLists);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowListsResult withNextToken(String nextToken) {
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
        if (getAllowLists() != null)
            sb.append("AllowLists: ").append(getAllowLists()).append(",");
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

        if (obj instanceof ListAllowListsResult == false)
            return false;
        ListAllowListsResult other = (ListAllowListsResult) obj;
        if (other.getAllowLists() == null ^ this.getAllowLists() == null)
            return false;
        if (other.getAllowLists() != null && other.getAllowLists().equals(this.getAllowLists()) == false)
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

        hashCode = prime * hashCode + ((getAllowLists() == null) ? 0 : getAllowLists().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAllowListsResult clone() {
        try {
            return (ListAllowListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
