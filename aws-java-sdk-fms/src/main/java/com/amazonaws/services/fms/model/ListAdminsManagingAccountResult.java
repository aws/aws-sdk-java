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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAdminsManagingAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAdminsManagingAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of accounts who manage member accounts within their <a>AdminScope</a>.
     * </p>
     */
    private java.util.List<String> adminAccounts;
    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of accounts who manage member accounts within their <a>AdminScope</a>.
     * </p>
     * 
     * @return The list of accounts who manage member accounts within their <a>AdminScope</a>.
     */

    public java.util.List<String> getAdminAccounts() {
        return adminAccounts;
    }

    /**
     * <p>
     * The list of accounts who manage member accounts within their <a>AdminScope</a>.
     * </p>
     * 
     * @param adminAccounts
     *        The list of accounts who manage member accounts within their <a>AdminScope</a>.
     */

    public void setAdminAccounts(java.util.Collection<String> adminAccounts) {
        if (adminAccounts == null) {
            this.adminAccounts = null;
            return;
        }

        this.adminAccounts = new java.util.ArrayList<String>(adminAccounts);
    }

    /**
     * <p>
     * The list of accounts who manage member accounts within their <a>AdminScope</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdminAccounts(java.util.Collection)} or {@link #withAdminAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param adminAccounts
     *        The list of accounts who manage member accounts within their <a>AdminScope</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdminsManagingAccountResult withAdminAccounts(String... adminAccounts) {
        if (this.adminAccounts == null) {
            setAdminAccounts(new java.util.ArrayList<String>(adminAccounts.length));
        }
        for (String ele : adminAccounts) {
            this.adminAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of accounts who manage member accounts within their <a>AdminScope</a>.
     * </p>
     * 
     * @param adminAccounts
     *        The list of accounts who manage member accounts within their <a>AdminScope</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdminsManagingAccountResult withAdminAccounts(java.util.Collection<String> adminAccounts) {
        setAdminAccounts(adminAccounts);
        return this;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *         are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *         <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *         returned from the prior request in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdminsManagingAccountResult withNextToken(String nextToken) {
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

        if (obj instanceof ListAdminsManagingAccountResult == false)
            return false;
        ListAdminsManagingAccountResult other = (ListAdminsManagingAccountResult) obj;
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
    public ListAdminsManagingAccountResult clone() {
        try {
            return (ListAdminsManagingAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
