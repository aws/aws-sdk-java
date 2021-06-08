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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContactChannels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactChannelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of contact channels related to the specified contact.
     * </p>
     */
    private java.util.List<ContactChannel> contactChannels;

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

    public ListContactChannelsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of contact channels related to the specified contact.
     * </p>
     * 
     * @return A list of contact channels related to the specified contact.
     */

    public java.util.List<ContactChannel> getContactChannels() {
        return contactChannels;
    }

    /**
     * <p>
     * A list of contact channels related to the specified contact.
     * </p>
     * 
     * @param contactChannels
     *        A list of contact channels related to the specified contact.
     */

    public void setContactChannels(java.util.Collection<ContactChannel> contactChannels) {
        if (contactChannels == null) {
            this.contactChannels = null;
            return;
        }

        this.contactChannels = new java.util.ArrayList<ContactChannel>(contactChannels);
    }

    /**
     * <p>
     * A list of contact channels related to the specified contact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactChannels(java.util.Collection)} or {@link #withContactChannels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param contactChannels
     *        A list of contact channels related to the specified contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactChannelsResult withContactChannels(ContactChannel... contactChannels) {
        if (this.contactChannels == null) {
            setContactChannels(new java.util.ArrayList<ContactChannel>(contactChannels.length));
        }
        for (ContactChannel ele : contactChannels) {
            this.contactChannels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of contact channels related to the specified contact.
     * </p>
     * 
     * @param contactChannels
     *        A list of contact channels related to the specified contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactChannelsResult withContactChannels(java.util.Collection<ContactChannel> contactChannels) {
        setContactChannels(contactChannels);
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
        if (getContactChannels() != null)
            sb.append("ContactChannels: ").append(getContactChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContactChannelsResult == false)
            return false;
        ListContactChannelsResult other = (ListContactChannelsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getContactChannels() == null ^ this.getContactChannels() == null)
            return false;
        if (other.getContactChannels() != null && other.getContactChannels().equals(this.getContactChannels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getContactChannels() == null) ? 0 : getContactChannels().hashCode());
        return hashCode;
    }

    @Override
    public ListContactChannelsResult clone() {
        try {
            return (ListContactChannelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
