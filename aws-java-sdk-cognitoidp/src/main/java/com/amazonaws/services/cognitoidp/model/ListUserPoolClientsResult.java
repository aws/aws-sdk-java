/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response from the server that lists user pool clients.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPoolClients" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserPoolClientsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     */
    private java.util.List<UserPoolClientDescription> userPoolClients;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     * 
     * @return The user pool clients in the response that lists user pool clients.
     */

    public java.util.List<UserPoolClientDescription> getUserPoolClients() {
        return userPoolClients;
    }

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     * 
     * @param userPoolClients
     *        The user pool clients in the response that lists user pool clients.
     */

    public void setUserPoolClients(java.util.Collection<UserPoolClientDescription> userPoolClients) {
        if (userPoolClients == null) {
            this.userPoolClients = null;
            return;
        }

        this.userPoolClients = new java.util.ArrayList<UserPoolClientDescription>(userPoolClients);
    }

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserPoolClients(java.util.Collection)} or {@link #withUserPoolClients(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param userPoolClients
     *        The user pool clients in the response that lists user pool clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserPoolClientsResult withUserPoolClients(UserPoolClientDescription... userPoolClients) {
        if (this.userPoolClients == null) {
            setUserPoolClients(new java.util.ArrayList<UserPoolClientDescription>(userPoolClients.length));
        }
        for (UserPoolClientDescription ele : userPoolClients) {
            this.userPoolClients.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     * 
     * @param userPoolClients
     *        The user pool clients in the response that lists user pool clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserPoolClientsResult withUserPoolClients(java.util.Collection<UserPoolClientDescription> userPoolClients) {
        setUserPoolClients(userPoolClients);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserPoolClientsResult withNextToken(String nextToken) {
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
        if (getUserPoolClients() != null)
            sb.append("UserPoolClients: ").append(getUserPoolClients()).append(",");
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

        if (obj instanceof ListUserPoolClientsResult == false)
            return false;
        ListUserPoolClientsResult other = (ListUserPoolClientsResult) obj;
        if (other.getUserPoolClients() == null ^ this.getUserPoolClients() == null)
            return false;
        if (other.getUserPoolClients() != null && other.getUserPoolClients().equals(this.getUserPoolClients()) == false)
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

        hashCode = prime * hashCode + ((getUserPoolClients() == null) ? 0 : getUserPoolClients().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUserPoolClientsResult clone() {
        try {
            return (ListUserPoolClientsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
