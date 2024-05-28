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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRelays" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRelaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of returned relays.
     * </p>
     */
    private java.util.List<Relay> relays;

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelaysResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of returned relays.
     * </p>
     * 
     * @return The list of returned relays.
     */

    public java.util.List<Relay> getRelays() {
        return relays;
    }

    /**
     * <p>
     * The list of returned relays.
     * </p>
     * 
     * @param relays
     *        The list of returned relays.
     */

    public void setRelays(java.util.Collection<Relay> relays) {
        if (relays == null) {
            this.relays = null;
            return;
        }

        this.relays = new java.util.ArrayList<Relay>(relays);
    }

    /**
     * <p>
     * The list of returned relays.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelays(java.util.Collection)} or {@link #withRelays(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param relays
     *        The list of returned relays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelaysResult withRelays(Relay... relays) {
        if (this.relays == null) {
            setRelays(new java.util.ArrayList<Relay>(relays.length));
        }
        for (Relay ele : relays) {
            this.relays.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of returned relays.
     * </p>
     * 
     * @param relays
     *        The list of returned relays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelaysResult withRelays(java.util.Collection<Relay> relays) {
        setRelays(relays);
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
        if (getRelays() != null)
            sb.append("Relays: ").append(getRelays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRelaysResult == false)
            return false;
        ListRelaysResult other = (ListRelaysResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRelays() == null ^ this.getRelays() == null)
            return false;
        if (other.getRelays() != null && other.getRelays().equals(this.getRelays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRelays() == null) ? 0 : getRelays().hashCode());
        return hashCode;
    }

    @Override
    public ListRelaysResult clone() {
        try {
            return (ListRelaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
