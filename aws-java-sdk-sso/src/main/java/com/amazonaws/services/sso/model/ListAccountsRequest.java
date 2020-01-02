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
package com.amazonaws.services.sso.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) When requesting subsequent pages, this is the page token from the previous response output.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * This is the number of items clients can request per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token issued by the <code>CreateToken</code> API call. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in
     * the <i>AWS SSO OIDC API Reference Guide</i>.
     * </p>
     */
    private String accessToken;

    /**
     * <p>
     * (Optional) When requesting subsequent pages, this is the page token from the previous response output.
     * </p>
     * 
     * @param nextToken
     *        (Optional) When requesting subsequent pages, this is the page token from the previous response output.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) When requesting subsequent pages, this is the page token from the previous response output.
     * </p>
     * 
     * @return (Optional) When requesting subsequent pages, this is the page token from the previous response output.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) When requesting subsequent pages, this is the page token from the previous response output.
     * </p>
     * 
     * @param nextToken
     *        (Optional) When requesting subsequent pages, this is the page token from the previous response output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * This is the number of items clients can request per page.
     * </p>
     * 
     * @param maxResults
     *        This is the number of items clients can request per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * This is the number of items clients can request per page.
     * </p>
     * 
     * @return This is the number of items clients can request per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * This is the number of items clients can request per page.
     * </p>
     * 
     * @param maxResults
     *        This is the number of items clients can request per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token issued by the <code>CreateToken</code> API call. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in
     * the <i>AWS SSO OIDC API Reference Guide</i>.
     * </p>
     * 
     * @param accessToken
     *        The token issued by the <code>CreateToken</code> API call. For more information, see <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html"
     *        >CreateToken</a> in the <i>AWS SSO OIDC API Reference Guide</i>.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The token issued by the <code>CreateToken</code> API call. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in
     * the <i>AWS SSO OIDC API Reference Guide</i>.
     * </p>
     * 
     * @return The token issued by the <code>CreateToken</code> API call. For more information, see <a
     *         href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html"
     *         >CreateToken</a> in the <i>AWS SSO OIDC API Reference Guide</i>.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The token issued by the <code>CreateToken</code> API call. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in
     * the <i>AWS SSO OIDC API Reference Guide</i>.
     * </p>
     * 
     * @param accessToken
     *        The token issued by the <code>CreateToken</code> API call. For more information, see <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html"
     *        >CreateToken</a> in the <i>AWS SSO OIDC API Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***");
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountsRequest clone() {
        return (ListAccountsRequest) super.clone();
    }

}
