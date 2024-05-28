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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetListsMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetListsMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata of the specified list or all lists under the account.
     * </p>
     */
    private java.util.List<AllowDenyList> lists;
    /**
     * <p>
     * The next page token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The metadata of the specified list or all lists under the account.
     * </p>
     * 
     * @return The metadata of the specified list or all lists under the account.
     */

    public java.util.List<AllowDenyList> getLists() {
        return lists;
    }

    /**
     * <p>
     * The metadata of the specified list or all lists under the account.
     * </p>
     * 
     * @param lists
     *        The metadata of the specified list or all lists under the account.
     */

    public void setLists(java.util.Collection<AllowDenyList> lists) {
        if (lists == null) {
            this.lists = null;
            return;
        }

        this.lists = new java.util.ArrayList<AllowDenyList>(lists);
    }

    /**
     * <p>
     * The metadata of the specified list or all lists under the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLists(java.util.Collection)} or {@link #withLists(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lists
     *        The metadata of the specified list or all lists under the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListsMetadataResult withLists(AllowDenyList... lists) {
        if (this.lists == null) {
            setLists(new java.util.ArrayList<AllowDenyList>(lists.length));
        }
        for (AllowDenyList ele : lists) {
            this.lists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata of the specified list or all lists under the account.
     * </p>
     * 
     * @param lists
     *        The metadata of the specified list or all lists under the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListsMetadataResult withLists(java.util.Collection<AllowDenyList> lists) {
        setLists(lists);
        return this;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @return The next page token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListsMetadataResult withNextToken(String nextToken) {
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
        if (getLists() != null)
            sb.append("Lists: ").append(getLists()).append(",");
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

        if (obj instanceof GetListsMetadataResult == false)
            return false;
        GetListsMetadataResult other = (GetListsMetadataResult) obj;
        if (other.getLists() == null ^ this.getLists() == null)
            return false;
        if (other.getLists() != null && other.getLists().equals(this.getLists()) == false)
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

        hashCode = prime * hashCode + ((getLists() == null) ? 0 : getLists().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetListsMetadataResult clone() {
        try {
            return (GetListsMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
