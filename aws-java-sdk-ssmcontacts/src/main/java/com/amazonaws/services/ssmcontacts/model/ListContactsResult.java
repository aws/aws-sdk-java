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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of the contacts and escalation plans in your Incident Manager account.
     * </p>
     */
    private java.util.List<Contact> contacts;

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of the contacts and escalation plans in your Incident Manager account.
     * </p>
     * 
     * @return A list of the contacts and escalation plans in your Incident Manager account.
     */

    public java.util.List<Contact> getContacts() {
        return contacts;
    }

    /**
     * <p>
     * A list of the contacts and escalation plans in your Incident Manager account.
     * </p>
     * 
     * @param contacts
     *        A list of the contacts and escalation plans in your Incident Manager account.
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
     * A list of the contacts and escalation plans in your Incident Manager account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContacts(java.util.Collection)} or {@link #withContacts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contacts
     *        A list of the contacts and escalation plans in your Incident Manager account.
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
     * A list of the contacts and escalation plans in your Incident Manager account.
     * </p>
     * 
     * @param contacts
     *        A list of the contacts and escalation plans in your Incident Manager account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsResult withContacts(java.util.Collection<Contact> contacts) {
        setContacts(contacts);
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
        if (getContacts() != null)
            sb.append("Contacts: ").append(getContacts());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getContacts() == null ^ this.getContacts() == null)
            return false;
        if (other.getContacts() != null && other.getContacts().equals(this.getContacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getContacts() == null) ? 0 : getContacts().hashCode());
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
