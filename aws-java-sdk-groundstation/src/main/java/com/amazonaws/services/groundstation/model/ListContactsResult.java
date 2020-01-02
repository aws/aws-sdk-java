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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of contacts.
     * </p>
     */
    private java.util.List<ContactData> contactList;
    /**
     * <p>
     * Next token returned in the response of a previous <code>ListContacts</code> call. Used to get the next page of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of contacts.
     * </p>
     * 
     * @return List of contacts.
     */

    public java.util.List<ContactData> getContactList() {
        return contactList;
    }

    /**
     * <p>
     * List of contacts.
     * </p>
     * 
     * @param contactList
     *        List of contacts.
     */

    public void setContactList(java.util.Collection<ContactData> contactList) {
        if (contactList == null) {
            this.contactList = null;
            return;
        }

        this.contactList = new java.util.ArrayList<ContactData>(contactList);
    }

    /**
     * <p>
     * List of contacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactList(java.util.Collection)} or {@link #withContactList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contactList
     *        List of contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsResult withContactList(ContactData... contactList) {
        if (this.contactList == null) {
            setContactList(new java.util.ArrayList<ContactData>(contactList.length));
        }
        for (ContactData ele : contactList) {
            this.contactList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of contacts.
     * </p>
     * 
     * @param contactList
     *        List of contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsResult withContactList(java.util.Collection<ContactData> contactList) {
        setContactList(contactList);
        return this;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListContacts</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous <code>ListContacts</code> call. Used to get the next
     *        page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListContacts</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @return Next token returned in the response of a previous <code>ListContacts</code> call. Used to get the next
     *         page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListContacts</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous <code>ListContacts</code> call. Used to get the next
     *        page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsResult withNextToken(String nextToken) {
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
        if (getContactList() != null)
            sb.append("ContactList: ").append(getContactList()).append(",");
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

        if (obj instanceof ListContactsResult == false)
            return false;
        ListContactsResult other = (ListContactsResult) obj;
        if (other.getContactList() == null ^ this.getContactList() == null)
            return false;
        if (other.getContactList() != null && other.getContactList().equals(this.getContactList()) == false)
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

        hashCode = prime * hashCode + ((getContactList() == null) ? 0 : getContactList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactsResult clone() {
        try {
            return (ListContactsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
