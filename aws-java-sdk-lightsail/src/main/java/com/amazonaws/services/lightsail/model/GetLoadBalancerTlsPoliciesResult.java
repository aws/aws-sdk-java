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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerTlsPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoadBalancerTlsPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that describe the TLS security policies that are available.
     * </p>
     */
    private java.util.List<LoadBalancerTlsPolicy> tlsPolicies;
    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetLoadBalancerTlsPolicies</code> request and specify the
     * next page token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects that describe the TLS security policies that are available.
     * </p>
     * 
     * @return An array of objects that describe the TLS security policies that are available.
     */

    public java.util.List<LoadBalancerTlsPolicy> getTlsPolicies() {
        return tlsPolicies;
    }

    /**
     * <p>
     * An array of objects that describe the TLS security policies that are available.
     * </p>
     * 
     * @param tlsPolicies
     *        An array of objects that describe the TLS security policies that are available.
     */

    public void setTlsPolicies(java.util.Collection<LoadBalancerTlsPolicy> tlsPolicies) {
        if (tlsPolicies == null) {
            this.tlsPolicies = null;
            return;
        }

        this.tlsPolicies = new java.util.ArrayList<LoadBalancerTlsPolicy>(tlsPolicies);
    }

    /**
     * <p>
     * An array of objects that describe the TLS security policies that are available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTlsPolicies(java.util.Collection)} or {@link #withTlsPolicies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tlsPolicies
     *        An array of objects that describe the TLS security policies that are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancerTlsPoliciesResult withTlsPolicies(LoadBalancerTlsPolicy... tlsPolicies) {
        if (this.tlsPolicies == null) {
            setTlsPolicies(new java.util.ArrayList<LoadBalancerTlsPolicy>(tlsPolicies.length));
        }
        for (LoadBalancerTlsPolicy ele : tlsPolicies) {
            this.tlsPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the TLS security policies that are available.
     * </p>
     * 
     * @param tlsPolicies
     *        An array of objects that describe the TLS security policies that are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancerTlsPoliciesResult withTlsPolicies(java.util.Collection<LoadBalancerTlsPolicy> tlsPolicies) {
        setTlsPolicies(tlsPolicies);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetLoadBalancerTlsPolicies</code> request and specify the
     * next page token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @param nextPageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        A next page token is not returned if there are no more results to display.
     *        </p>
     *        <p>
     *        To get the next page of results, perform another <code>GetLoadBalancerTlsPolicies</code> request and
     *        specify the next page token using the <code>pageToken</code> parameter.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetLoadBalancerTlsPolicies</code> request and specify the
     * next page token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         A next page token is not returned if there are no more results to display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another <code>GetLoadBalancerTlsPolicies</code> request and
     *         specify the next page token using the <code>pageToken</code> parameter.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetLoadBalancerTlsPolicies</code> request and specify the
     * next page token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @param nextPageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        A next page token is not returned if there are no more results to display.
     *        </p>
     *        <p>
     *        To get the next page of results, perform another <code>GetLoadBalancerTlsPolicies</code> request and
     *        specify the next page token using the <code>pageToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoadBalancerTlsPoliciesResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getTlsPolicies() != null)
            sb.append("TlsPolicies: ").append(getTlsPolicies()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoadBalancerTlsPoliciesResult == false)
            return false;
        GetLoadBalancerTlsPoliciesResult other = (GetLoadBalancerTlsPoliciesResult) obj;
        if (other.getTlsPolicies() == null ^ this.getTlsPolicies() == null)
            return false;
        if (other.getTlsPolicies() != null && other.getTlsPolicies().equals(this.getTlsPolicies()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTlsPolicies() == null) ? 0 : getTlsPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetLoadBalancerTlsPoliciesResult clone() {
        try {
            return (GetLoadBalancerTlsPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
