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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAccounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Chime account name prefix with which to filter results.
     * </p>
     */
    private String name;
    /**
     * <p>
     * User email address with which to filter results.
     * </p>
     */
    private String userEmail;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. Defaults to 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Amazon Chime account name prefix with which to filter results.
     * </p>
     * 
     * @param name
     *        Amazon Chime account name prefix with which to filter results.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Amazon Chime account name prefix with which to filter results.
     * </p>
     * 
     * @return Amazon Chime account name prefix with which to filter results.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Amazon Chime account name prefix with which to filter results.
     * </p>
     * 
     * @param name
     *        Amazon Chime account name prefix with which to filter results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * User email address with which to filter results.
     * </p>
     * 
     * @param userEmail
     *        User email address with which to filter results.
     */

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * <p>
     * User email address with which to filter results.
     * </p>
     * 
     * @return User email address with which to filter results.
     */

    public String getUserEmail() {
        return this.userEmail;
    }

    /**
     * <p>
     * User email address with which to filter results.
     * </p>
     * 
     * @param userEmail
     *        User email address with which to filter results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsRequest withUserEmail(String userEmail) {
        setUserEmail(userEmail);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Defaults to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Defaults to 100.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. Defaults to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Defaults to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUserEmail() != null)
            sb.append("UserEmail: ").append("***Sensitive Data Redacted***").append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccountsRequest == false)
            return false;
        ListAccountsRequest other = (ListAccountsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUserEmail() == null ^ this.getUserEmail() == null)
            return false;
        if (other.getUserEmail() != null && other.getUserEmail().equals(this.getUserEmail()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountsRequest clone() {
        return (ListAccountsRequest) super.clone();
    }

}
