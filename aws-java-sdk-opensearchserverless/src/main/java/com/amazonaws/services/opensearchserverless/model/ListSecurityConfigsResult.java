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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Details about the security configurations in your account.
     * </p>
     */
    private java.util.List<SecurityConfigSummary> securityConfigSummaries;

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Details about the security configurations in your account.
     * </p>
     * 
     * @return Details about the security configurations in your account.
     */

    public java.util.List<SecurityConfigSummary> getSecurityConfigSummaries() {
        return securityConfigSummaries;
    }

    /**
     * <p>
     * Details about the security configurations in your account.
     * </p>
     * 
     * @param securityConfigSummaries
     *        Details about the security configurations in your account.
     */

    public void setSecurityConfigSummaries(java.util.Collection<SecurityConfigSummary> securityConfigSummaries) {
        if (securityConfigSummaries == null) {
            this.securityConfigSummaries = null;
            return;
        }

        this.securityConfigSummaries = new java.util.ArrayList<SecurityConfigSummary>(securityConfigSummaries);
    }

    /**
     * <p>
     * Details about the security configurations in your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityConfigSummaries(java.util.Collection)} or
     * {@link #withSecurityConfigSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityConfigSummaries
     *        Details about the security configurations in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigsResult withSecurityConfigSummaries(SecurityConfigSummary... securityConfigSummaries) {
        if (this.securityConfigSummaries == null) {
            setSecurityConfigSummaries(new java.util.ArrayList<SecurityConfigSummary>(securityConfigSummaries.length));
        }
        for (SecurityConfigSummary ele : securityConfigSummaries) {
            this.securityConfigSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the security configurations in your account.
     * </p>
     * 
     * @param securityConfigSummaries
     *        Details about the security configurations in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigsResult withSecurityConfigSummaries(java.util.Collection<SecurityConfigSummary> securityConfigSummaries) {
        setSecurityConfigSummaries(securityConfigSummaries);
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
        if (getSecurityConfigSummaries() != null)
            sb.append("SecurityConfigSummaries: ").append(getSecurityConfigSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityConfigsResult == false)
            return false;
        ListSecurityConfigsResult other = (ListSecurityConfigsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSecurityConfigSummaries() == null ^ this.getSecurityConfigSummaries() == null)
            return false;
        if (other.getSecurityConfigSummaries() != null && other.getSecurityConfigSummaries().equals(this.getSecurityConfigSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfigSummaries() == null) ? 0 : getSecurityConfigSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityConfigsResult clone() {
        try {
            return (ListSecurityConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
