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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListProxySessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProxySessionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The proxy session details.
     * </p>
     */
    private java.util.List<ProxySession> proxySessions;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The proxy session details.
     * </p>
     * 
     * @return The proxy session details.
     */

    public java.util.List<ProxySession> getProxySessions() {
        return proxySessions;
    }

    /**
     * <p>
     * The proxy session details.
     * </p>
     * 
     * @param proxySessions
     *        The proxy session details.
     */

    public void setProxySessions(java.util.Collection<ProxySession> proxySessions) {
        if (proxySessions == null) {
            this.proxySessions = null;
            return;
        }

        this.proxySessions = new java.util.ArrayList<ProxySession>(proxySessions);
    }

    /**
     * <p>
     * The proxy session details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProxySessions(java.util.Collection)} or {@link #withProxySessions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param proxySessions
     *        The proxy session details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProxySessionsResult withProxySessions(ProxySession... proxySessions) {
        if (this.proxySessions == null) {
            setProxySessions(new java.util.ArrayList<ProxySession>(proxySessions.length));
        }
        for (ProxySession ele : proxySessions) {
            this.proxySessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The proxy session details.
     * </p>
     * 
     * @param proxySessions
     *        The proxy session details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProxySessionsResult withProxySessions(java.util.Collection<ProxySession> proxySessions) {
        setProxySessions(proxySessions);
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

    public ListProxySessionsResult withNextToken(String nextToken) {
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
        if (getProxySessions() != null)
            sb.append("ProxySessions: ").append(getProxySessions()).append(",");
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

        if (obj instanceof ListProxySessionsResult == false)
            return false;
        ListProxySessionsResult other = (ListProxySessionsResult) obj;
        if (other.getProxySessions() == null ^ this.getProxySessions() == null)
            return false;
        if (other.getProxySessions() != null && other.getProxySessions().equals(this.getProxySessions()) == false)
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

        hashCode = prime * hashCode + ((getProxySessions() == null) ? 0 : getProxySessions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProxySessionsResult clone() {
        try {
            return (ListProxySessionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
