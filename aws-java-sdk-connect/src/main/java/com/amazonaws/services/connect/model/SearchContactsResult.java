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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchContactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the contacts.
     * </p>
     */
    private java.util.List<ContactSearchSummary> contacts;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of contacts which matched your search query.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * Information about the contacts.
     * </p>
     * 
     * @return Information about the contacts.
     */

    public java.util.List<ContactSearchSummary> getContacts() {
        return contacts;
    }

    /**
     * <p>
     * Information about the contacts.
     * </p>
     * 
     * @param contacts
     *        Information about the contacts.
     */

    public void setContacts(java.util.Collection<ContactSearchSummary> contacts) {
        if (contacts == null) {
            this.contacts = null;
            return;
        }

        this.contacts = new java.util.ArrayList<ContactSearchSummary>(contacts);
    }

    /**
     * <p>
     * Information about the contacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContacts(java.util.Collection)} or {@link #withContacts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contacts
     *        Information about the contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsResult withContacts(ContactSearchSummary... contacts) {
        if (this.contacts == null) {
            setContacts(new java.util.ArrayList<ContactSearchSummary>(contacts.length));
        }
        for (ContactSearchSummary ele : contacts) {
            this.contacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the contacts.
     * </p>
     * 
     * @param contacts
     *        Information about the contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsResult withContacts(java.util.Collection<ContactSearchSummary> contacts) {
        setContacts(contacts);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of contacts which matched your search query.
     * </p>
     * 
     * @param totalCount
     *        The total number of contacts which matched your search query.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of contacts which matched your search query.
     * </p>
     * 
     * @return The total number of contacts which matched your search query.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of contacts which matched your search query.
     * </p>
     * 
     * @param totalCount
     *        The total number of contacts which matched your search query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsResult withTotalCount(Long totalCount) {
        setTotalCount(totalCount);
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
        if (getContacts() != null)
            sb.append("Contacts: ").append(getContacts()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchContactsResult == false)
            return false;
        SearchContactsResult other = (SearchContactsResult) obj;
        if (other.getContacts() == null ^ this.getContacts() == null)
            return false;
        if (other.getContacts() != null && other.getContacts().equals(this.getContacts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContacts() == null) ? 0 : getContacts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchContactsResult clone() {
        try {
            return (SearchContactsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
