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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListOrganizationAdminAccounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationAdminAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only one of
     * these accounts can have a status of ENABLED.
     * </p>
     */
    private java.util.List<AdminAccount> adminAccounts;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only one of
     * these accounts can have a status of ENABLED.
     * </p>
     * 
     * @return An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only
     *         one of these accounts can have a status of ENABLED.
     */

    public java.util.List<AdminAccount> getAdminAccounts() {
        return adminAccounts;
    }

    /**
     * <p>
     * An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only one of
     * these accounts can have a status of ENABLED.
     * </p>
     * 
     * @param adminAccounts
     *        An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only
     *        one of these accounts can have a status of ENABLED.
     */

    public void setAdminAccounts(java.util.Collection<AdminAccount> adminAccounts) {
        if (adminAccounts == null) {
            this.adminAccounts = null;
            return;
        }

        this.adminAccounts = new java.util.ArrayList<AdminAccount>(adminAccounts);
    }

    /**
     * <p>
     * An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only one of
     * these accounts can have a status of ENABLED.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdminAccounts(java.util.Collection)} or {@link #withAdminAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param adminAccounts
     *        An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only
     *        one of these accounts can have a status of ENABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationAdminAccountsResult withAdminAccounts(AdminAccount... adminAccounts) {
        if (this.adminAccounts == null) {
            setAdminAccounts(new java.util.ArrayList<AdminAccount>(adminAccounts.length));
        }
        for (AdminAccount ele : adminAccounts) {
            this.adminAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only one of
     * these accounts can have a status of ENABLED.
     * </p>
     * 
     * @param adminAccounts
     *        An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only
     *        one of these accounts can have a status of ENABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationAdminAccountsResult withAdminAccounts(java.util.Collection<AdminAccount> adminAccounts) {
        setAdminAccounts(adminAccounts);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
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
        if (getAdminAccounts() != null)
            sb.append("AdminAccounts: ").append(getAdminAccounts()).append(",");
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
        if (other.getAdminAccounts() == null ^ this.getAdminAccounts() == null)
            return false;
        if (other.getAdminAccounts() != null && other.getAdminAccounts().equals(this.getAdminAccounts()) == false)
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

        hashCode = prime * hashCode + ((getAdminAccounts() == null) ? 0 : getAdminAccounts().hashCode());
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
