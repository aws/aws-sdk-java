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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The contacts present in a specific contact list.
     * </p>
     */
    private java.util.List<Contact> contacts;
    /**
     * <p>
     * A string token indicating that there might be additional contacts available to be listed. Copy this token to a
     * subsequent call to <code>ListContacts</code> with the same parameters to retrieve the next page of contacts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The contacts present in a specific contact list.
     * </p>
     * 
     * @return The contacts present in a specific contact list.
     */

    public java.util.List<Contact> getContacts() {
        return contacts;
    }

    /**
     * <p>
     * The contacts present in a specific contact list.
     * </p>
     * 
     * @param contacts
     *        The contacts present in a specific contact list.
     */

    public void setContacts(java.util.Collection<Contact> contacts) {
        if (contacts == null) {
            this.contacts = null;
            return;
        }

        this.contacts = new java.util.ArrayList<Contact>(contacts);
    }

    /**
     * <p>
     * The contacts present in a specific contact list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContacts(java.util.Collection)} or {@link #withContacts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contacts
     *        The contacts present in a specific contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsResult withContacts(Contact... contacts) {
        if (this.contacts == null) {
            setContacts(new java.util.ArrayList<Contact>(contacts.length));
        }
        for (Contact ele : contacts) {
            this.contacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contacts present in a specific contact list.
     * </p>
     * 
     * @param contacts
     *        The contacts present in a specific contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsResult withContacts(java.util.Collection<Contact> contacts) {
        setContacts(contacts);
        return this;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contacts available to be listed. Copy this token to a
     * subsequent call to <code>ListContacts</code> with the same parameters to retrieve the next page of contacts.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional contacts available to be listed. Copy this token
     *        to a subsequent call to <code>ListContacts</code> with the same parameters to retrieve the next page of
     *        contacts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contacts available to be listed. Copy this token to a
     * subsequent call to <code>ListContacts</code> with the same parameters to retrieve the next page of contacts.
     * </p>
     * 
     * @return A string token indicating that there might be additional contacts available to be listed. Copy this token
     *         to a subsequent call to <code>ListContacts</code> with the same parameters to retrieve the next page of
     *         contacts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contacts available to be listed. Copy this token to a
     * subsequent call to <code>ListContacts</code> with the same parameters to retrieve the next page of contacts.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional contacts available to be listed. Copy this token
     *        to a subsequent call to <code>ListContacts</code> with the same parameters to retrieve the next page of
     *        contacts.
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
        if (getContacts() != null)
            sb.append("Contacts: ").append(getContacts()).append(",");
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
        if (other.getContacts() == null ^ this.getContacts() == null)
            return false;
        if (other.getContacts() != null && other.getContacts().equals(this.getContacts()) == false)
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

        hashCode = prime * hashCode + ((getContacts() == null) ? 0 : getContacts().hashCode());
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
