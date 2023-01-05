/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for response parameters to the <code><a>ListVpcEndpointAccess</a></code> operation. Returns a list of
 * accounts id and account type authorized to manage VPC endpoints.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVpcEndpointAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC endpoints
     * against the specified domain.
     * </p>
     */
    private java.util.List<AuthorizedPrincipal> authorizedPrincipalList;
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC endpoints
     * against the specified domain.
     * </p>
     * 
     * @return List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC
     *         endpoints against the specified domain.
     */

    public java.util.List<AuthorizedPrincipal> getAuthorizedPrincipalList() {
        return authorizedPrincipalList;
    }

    /**
     * <p>
     * List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC endpoints
     * against the specified domain.
     * </p>
     * 
     * @param authorizedPrincipalList
     *        List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC endpoints
     *        against the specified domain.
     */

    public void setAuthorizedPrincipalList(java.util.Collection<AuthorizedPrincipal> authorizedPrincipalList) {
        if (authorizedPrincipalList == null) {
            this.authorizedPrincipalList = null;
            return;
        }

        this.authorizedPrincipalList = new java.util.ArrayList<AuthorizedPrincipal>(authorizedPrincipalList);
    }

    /**
     * <p>
     * List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC endpoints
     * against the specified domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedPrincipalList(java.util.Collection)} or
     * {@link #withAuthorizedPrincipalList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authorizedPrincipalList
     *        List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC endpoints
     *        against the specified domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointAccessResult withAuthorizedPrincipalList(AuthorizedPrincipal... authorizedPrincipalList) {
        if (this.authorizedPrincipalList == null) {
            setAuthorizedPrincipalList(new java.util.ArrayList<AuthorizedPrincipal>(authorizedPrincipalList.length));
        }
        for (AuthorizedPrincipal ele : authorizedPrincipalList) {
            this.authorizedPrincipalList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC endpoints
     * against the specified domain.
     * </p>
     * 
     * @param authorizedPrincipalList
     *        List of <code>AuthorizedPrincipal</code> describing the details of the permissions to manage VPC endpoints
     *        against the specified domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointAccessResult withAuthorizedPrincipalList(java.util.Collection<AuthorizedPrincipal> authorizedPrincipalList) {
        setAuthorizedPrincipalList(authorizedPrincipalList);
        return this;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointAccessResult withNextToken(String nextToken) {
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
        if (getAuthorizedPrincipalList() != null)
            sb.append("AuthorizedPrincipalList: ").append(getAuthorizedPrincipalList()).append(",");
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

        if (obj instanceof ListVpcEndpointAccessResult == false)
            return false;
        ListVpcEndpointAccessResult other = (ListVpcEndpointAccessResult) obj;
        if (other.getAuthorizedPrincipalList() == null ^ this.getAuthorizedPrincipalList() == null)
            return false;
        if (other.getAuthorizedPrincipalList() != null && other.getAuthorizedPrincipalList().equals(this.getAuthorizedPrincipalList()) == false)
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

        hashCode = prime * hashCode + ((getAuthorizedPrincipalList() == null) ? 0 : getAuthorizedPrincipalList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVpcEndpointAccessResult clone() {
        try {
            return (ListVpcEndpointAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
