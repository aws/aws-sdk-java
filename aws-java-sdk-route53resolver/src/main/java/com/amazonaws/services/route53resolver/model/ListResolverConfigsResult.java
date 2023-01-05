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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If a response includes the last of the Resolver configurations that are associated with the current Amazon Web
     * Services account, <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <code>ListResolverConfigs</code> request. Get the value of <code>NextToken</code> that Amazon Route 53
     * returned in the previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     * associated with the current Amazon Web Services account.
     * </p>
     */
    private java.util.List<ResolverConfig> resolverConfigs;

    /**
     * <p>
     * If a response includes the last of the Resolver configurations that are associated with the current Amazon Web
     * Services account, <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <code>ListResolverConfigs</code> request. Get the value of <code>NextToken</code> that Amazon Route 53
     * returned in the previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @param nextToken
     *        If a response includes the last of the Resolver configurations that are associated with the current Amazon
     *        Web Services account, <code>NextToken</code> doesn't appear in the response.</p>
     *        <p>
     *        If a response doesn't include the last of the configurations, you can get more configurations by
     *        submitting another <code>ListResolverConfigs</code> request. Get the value of <code>NextToken</code> that
     *        Amazon Route 53 returned in the previous response and include it in <code>NextToken</code> in the next
     *        request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a response includes the last of the Resolver configurations that are associated with the current Amazon Web
     * Services account, <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <code>ListResolverConfigs</code> request. Get the value of <code>NextToken</code> that Amazon Route 53
     * returned in the previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @return If a response includes the last of the Resolver configurations that are associated with the current
     *         Amazon Web Services account, <code>NextToken</code> doesn't appear in the response.</p>
     *         <p>
     *         If a response doesn't include the last of the configurations, you can get more configurations by
     *         submitting another <code>ListResolverConfigs</code> request. Get the value of <code>NextToken</code> that
     *         Amazon Route 53 returned in the previous response and include it in <code>NextToken</code> in the next
     *         request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a response includes the last of the Resolver configurations that are associated with the current Amazon Web
     * Services account, <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <code>ListResolverConfigs</code> request. Get the value of <code>NextToken</code> that Amazon Route 53
     * returned in the previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @param nextToken
     *        If a response includes the last of the Resolver configurations that are associated with the current Amazon
     *        Web Services account, <code>NextToken</code> doesn't appear in the response.</p>
     *        <p>
     *        If a response doesn't include the last of the configurations, you can get more configurations by
     *        submitting another <code>ListResolverConfigs</code> request. Get the value of <code>NextToken</code> that
     *        Amazon Route 53 returned in the previous response and include it in <code>NextToken</code> in the next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverConfigsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     * associated with the current Amazon Web Services account.
     * </p>
     * 
     * @return An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     *         associated with the current Amazon Web Services account.
     */

    public java.util.List<ResolverConfig> getResolverConfigs() {
        return resolverConfigs;
    }

    /**
     * <p>
     * An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     * associated with the current Amazon Web Services account.
     * </p>
     * 
     * @param resolverConfigs
     *        An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     *        associated with the current Amazon Web Services account.
     */

    public void setResolverConfigs(java.util.Collection<ResolverConfig> resolverConfigs) {
        if (resolverConfigs == null) {
            this.resolverConfigs = null;
            return;
        }

        this.resolverConfigs = new java.util.ArrayList<ResolverConfig>(resolverConfigs);
    }

    /**
     * <p>
     * An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     * associated with the current Amazon Web Services account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolverConfigs(java.util.Collection)} or {@link #withResolverConfigs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resolverConfigs
     *        An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     *        associated with the current Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverConfigsResult withResolverConfigs(ResolverConfig... resolverConfigs) {
        if (this.resolverConfigs == null) {
            setResolverConfigs(new java.util.ArrayList<ResolverConfig>(resolverConfigs.length));
        }
        for (ResolverConfig ele : resolverConfigs) {
            this.resolverConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     * associated with the current Amazon Web Services account.
     * </p>
     * 
     * @param resolverConfigs
     *        An array that contains one <code>ResolverConfigs</code> element for each Resolver configuration that is
     *        associated with the current Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverConfigsResult withResolverConfigs(java.util.Collection<ResolverConfig> resolverConfigs) {
        setResolverConfigs(resolverConfigs);
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
        if (getResolverConfigs() != null)
            sb.append("ResolverConfigs: ").append(getResolverConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolverConfigsResult == false)
            return false;
        ListResolverConfigsResult other = (ListResolverConfigsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResolverConfigs() == null ^ this.getResolverConfigs() == null)
            return false;
        if (other.getResolverConfigs() != null && other.getResolverConfigs().equals(this.getResolverConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResolverConfigs() == null) ? 0 : getResolverConfigs().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverConfigsResult clone() {
        try {
            return (ListResolverConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
