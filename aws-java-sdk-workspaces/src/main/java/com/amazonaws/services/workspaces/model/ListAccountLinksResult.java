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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAccountLinks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountLinksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the account links.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccountLink> accountLinks;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the account links.
     * </p>
     * 
     * @return Information about the account links.
     */

    public java.util.List<AccountLink> getAccountLinks() {
        if (accountLinks == null) {
            accountLinks = new com.amazonaws.internal.SdkInternalList<AccountLink>();
        }
        return accountLinks;
    }

    /**
     * <p>
     * Information about the account links.
     * </p>
     * 
     * @param accountLinks
     *        Information about the account links.
     */

    public void setAccountLinks(java.util.Collection<AccountLink> accountLinks) {
        if (accountLinks == null) {
            this.accountLinks = null;
            return;
        }

        this.accountLinks = new com.amazonaws.internal.SdkInternalList<AccountLink>(accountLinks);
    }

    /**
     * <p>
     * Information about the account links.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountLinks(java.util.Collection)} or {@link #withAccountLinks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountLinks
     *        Information about the account links.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountLinksResult withAccountLinks(AccountLink... accountLinks) {
        if (this.accountLinks == null) {
            setAccountLinks(new com.amazonaws.internal.SdkInternalList<AccountLink>(accountLinks.length));
        }
        for (AccountLink ele : accountLinks) {
            this.accountLinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the account links.
     * </p>
     * 
     * @param accountLinks
     *        Information about the account links.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountLinksResult withAccountLinks(java.util.Collection<AccountLink> accountLinks) {
        setAccountLinks(accountLinks);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountLinksResult withNextToken(String nextToken) {
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
        if (getAccountLinks() != null)
            sb.append("AccountLinks: ").append(getAccountLinks()).append(",");
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

        if (obj instanceof ListAccountLinksResult == false)
            return false;
        ListAccountLinksResult other = (ListAccountLinksResult) obj;
        if (other.getAccountLinks() == null ^ this.getAccountLinks() == null)
            return false;
        if (other.getAccountLinks() != null && other.getAccountLinks().equals(this.getAccountLinks()) == false)
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

        hashCode = prime * hashCode + ((getAccountLinks() == null) ? 0 : getAccountLinks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountLinksResult clone() {
        try {
            return (ListAccountLinksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
