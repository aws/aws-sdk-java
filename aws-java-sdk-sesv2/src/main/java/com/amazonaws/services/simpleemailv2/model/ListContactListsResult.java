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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListContactLists" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactListsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The available contact lists.
     * </p>
     */
    private java.util.List<ContactList> contactLists;
    /**
     * <p>
     * A string token indicating that there might be additional contact lists available to be listed. Copy this token to
     * a subsequent call to <code>ListContactLists</code> with the same parameters to retrieve the next page of contact
     * lists.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The available contact lists.
     * </p>
     * 
     * @return The available contact lists.
     */

    public java.util.List<ContactList> getContactLists() {
        return contactLists;
    }

    /**
     * <p>
     * The available contact lists.
     * </p>
     * 
     * @param contactLists
     *        The available contact lists.
     */

    public void setContactLists(java.util.Collection<ContactList> contactLists) {
        if (contactLists == null) {
            this.contactLists = null;
            return;
        }

        this.contactLists = new java.util.ArrayList<ContactList>(contactLists);
    }

    /**
     * <p>
     * The available contact lists.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactLists(java.util.Collection)} or {@link #withContactLists(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contactLists
     *        The available contact lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactListsResult withContactLists(ContactList... contactLists) {
        if (this.contactLists == null) {
            setContactLists(new java.util.ArrayList<ContactList>(contactLists.length));
        }
        for (ContactList ele : contactLists) {
            this.contactLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The available contact lists.
     * </p>
     * 
     * @param contactLists
     *        The available contact lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactListsResult withContactLists(java.util.Collection<ContactList> contactLists) {
        setContactLists(contactLists);
        return this;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contact lists available to be listed. Copy this token to
     * a subsequent call to <code>ListContactLists</code> with the same parameters to retrieve the next page of contact
     * lists.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional contact lists available to be listed. Copy this
     *        token to a subsequent call to <code>ListContactLists</code> with the same parameters to retrieve the next
     *        page of contact lists.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contact lists available to be listed. Copy this token to
     * a subsequent call to <code>ListContactLists</code> with the same parameters to retrieve the next page of contact
     * lists.
     * </p>
     * 
     * @return A string token indicating that there might be additional contact lists available to be listed. Copy this
     *         token to a subsequent call to <code>ListContactLists</code> with the same parameters to retrieve the next
     *         page of contact lists.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contact lists available to be listed. Copy this token to
     * a subsequent call to <code>ListContactLists</code> with the same parameters to retrieve the next page of contact
     * lists.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional contact lists available to be listed. Copy this
     *        token to a subsequent call to <code>ListContactLists</code> with the same parameters to retrieve the next
     *        page of contact lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactListsResult withNextToken(String nextToken) {
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
        if (getContactLists() != null)
            sb.append("ContactLists: ").append(getContactLists()).append(",");
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

        if (obj instanceof ListContactListsResult == false)
            return false;
        ListContactListsResult other = (ListContactListsResult) obj;
        if (other.getContactLists() == null ^ this.getContactLists() == null)
            return false;
        if (other.getContactLists() != null && other.getContactLists().equals(this.getContactLists()) == false)
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

        hashCode = prime * hashCode + ((getContactLists() == null) ? 0 : getContactLists().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactListsResult clone() {
        try {
            return (ListContactListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
