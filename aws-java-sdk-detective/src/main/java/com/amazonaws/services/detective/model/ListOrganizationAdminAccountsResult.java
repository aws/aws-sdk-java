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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListOrganizationAdminAccounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationAdminAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of Detective administrator accounts.
     * </p>
     */
    private java.util.List<Administrator> administrators;
    /**
     * <p>
     * If there are more accounts remaining in the results, then this is the pagination token to use to request the next
     * page of accounts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of Detective administrator accounts.
     * </p>
     * 
     * @return The list of Detective administrator accounts.
     */

    public java.util.List<Administrator> getAdministrators() {
        return administrators;
    }

    /**
     * <p>
     * The list of Detective administrator accounts.
     * </p>
     * 
     * @param administrators
     *        The list of Detective administrator accounts.
     */

    public void setAdministrators(java.util.Collection<Administrator> administrators) {
        if (administrators == null) {
            this.administrators = null;
            return;
        }

        this.administrators = new java.util.ArrayList<Administrator>(administrators);
    }

    /**
     * <p>
     * The list of Detective administrator accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdministrators(java.util.Collection)} or {@link #withAdministrators(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param administrators
     *        The list of Detective administrator accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationAdminAccountsResult withAdministrators(Administrator... administrators) {
        if (this.administrators == null) {
            setAdministrators(new java.util.ArrayList<Administrator>(administrators.length));
        }
        for (Administrator ele : administrators) {
            this.administrators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Detective administrator accounts.
     * </p>
     * 
     * @param administrators
     *        The list of Detective administrator accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationAdminAccountsResult withAdministrators(java.util.Collection<Administrator> administrators) {
        setAdministrators(administrators);
        return this;
    }

    /**
     * <p>
     * If there are more accounts remaining in the results, then this is the pagination token to use to request the next
     * page of accounts.
     * </p>
     * 
     * @param nextToken
     *        If there are more accounts remaining in the results, then this is the pagination token to use to request
     *        the next page of accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more accounts remaining in the results, then this is the pagination token to use to request the next
     * page of accounts.
     * </p>
     * 
     * @return If there are more accounts remaining in the results, then this is the pagination token to use to request
     *         the next page of accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more accounts remaining in the results, then this is the pagination token to use to request the next
     * page of accounts.
     * </p>
     * 
     * @param nextToken
     *        If there are more accounts remaining in the results, then this is the pagination token to use to request
     *        the next page of accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationAdminAccountsResult withNextToken(String nextToken) {
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
        if (getAdministrators() != null)
            sb.append("Administrators: ").append(getAdministrators()).append(",");
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

        if (obj instanceof ListOrganizationAdminAccountsResult == false)
            return false;
        ListOrganizationAdminAccountsResult other = (ListOrganizationAdminAccountsResult) obj;
        if (other.getAdministrators() == null ^ this.getAdministrators() == null)
            return false;
        if (other.getAdministrators() != null && other.getAdministrators().equals(this.getAdministrators()) == false)
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

        hashCode = prime * hashCode + ((getAdministrators() == null) ? 0 : getAdministrators().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationAdminAccountsResult clone() {
        try {
            return (ListOrganizationAdminAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
