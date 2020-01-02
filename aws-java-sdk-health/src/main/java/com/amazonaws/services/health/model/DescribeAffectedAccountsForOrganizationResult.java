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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedAccountsForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAffectedAccountsForOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     */
    private java.util.List<String> affectedAccounts;
    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     * 
     * @return A JSON set of elements of the affected accounts.
     */

    public java.util.List<String> getAffectedAccounts() {
        return affectedAccounts;
    }

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     * 
     * @param affectedAccounts
     *        A JSON set of elements of the affected accounts.
     */

    public void setAffectedAccounts(java.util.Collection<String> affectedAccounts) {
        if (affectedAccounts == null) {
            this.affectedAccounts = null;
            return;
        }

        this.affectedAccounts = new java.util.ArrayList<String>(affectedAccounts);
    }

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAffectedAccounts(java.util.Collection)} or {@link #withAffectedAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param affectedAccounts
     *        A JSON set of elements of the affected accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAffectedAccountsForOrganizationResult withAffectedAccounts(String... affectedAccounts) {
        if (this.affectedAccounts == null) {
            setAffectedAccounts(new java.util.ArrayList<String>(affectedAccounts.length));
        }
        for (String ele : affectedAccounts) {
            this.affectedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     * 
     * @param affectedAccounts
     *        A JSON set of elements of the affected accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAffectedAccountsForOrganizationResult withAffectedAccounts(java.util.Collection<String> affectedAccounts) {
        setAffectedAccounts(affectedAccounts);
        return this;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @param nextToken
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *        results, reissue the search request and include the returned token. When all results have been returned,
     *        the response does not contain a pagination token value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @return If the results of a search are large, only a portion of the results are returned, and a
     *         <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *         results, reissue the search request and include the returned token. When all results have been returned,
     *         the response does not contain a pagination token value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @param nextToken
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *        results, reissue the search request and include the returned token. When all results have been returned,
     *        the response does not contain a pagination token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAffectedAccountsForOrganizationResult withNextToken(String nextToken) {
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
        if (getAffectedAccounts() != null)
            sb.append("AffectedAccounts: ").append(getAffectedAccounts()).append(",");
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

        if (obj instanceof DescribeAffectedAccountsForOrganizationResult == false)
            return false;
        DescribeAffectedAccountsForOrganizationResult other = (DescribeAffectedAccountsForOrganizationResult) obj;
        if (other.getAffectedAccounts() == null ^ this.getAffectedAccounts() == null)
            return false;
        if (other.getAffectedAccounts() != null && other.getAffectedAccounts().equals(this.getAffectedAccounts()) == false)
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

        hashCode = prime * hashCode + ((getAffectedAccounts() == null) ? 0 : getAffectedAccounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAffectedAccountsForOrganizationResult clone() {
        try {
            return (DescribeAffectedAccountsForOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
