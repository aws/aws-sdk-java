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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If more than <code>MaxResults</code> resolver rules match the specified criteria, you can submit another
     * <code>ListResolverRules</code> request to get the next group of results. In the next request, specify the value
     * of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The value that you specified for <code>MaxResults</code> in the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The resolver rules that were created using the current AWS account and that match the specified filters, if any.
     * </p>
     */
    private java.util.List<ResolverRule> resolverRules;

    /**
     * <p>
     * If more than <code>MaxResults</code> resolver rules match the specified criteria, you can submit another
     * <code>ListResolverRules</code> request to get the next group of results. In the next request, specify the value
     * of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> resolver rules match the specified criteria, you can submit another
     *        <code>ListResolverRules</code> request to get the next group of results. In the next request, specify the
     *        value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resolver rules match the specified criteria, you can submit another
     * <code>ListResolverRules</code> request to get the next group of results. In the next request, specify the value
     * of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> resolver rules match the specified criteria, you can submit another
     *         <code>ListResolverRules</code> request to get the next group of results. In the next request, specify the
     *         value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resolver rules match the specified criteria, you can submit another
     * <code>ListResolverRules</code> request to get the next group of results. In the next request, specify the value
     * of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> resolver rules match the specified criteria, you can submit another
     *        <code>ListResolverRules</code> request to get the next group of results. In the next request, specify the
     *        value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxResults</code> in the request.
     * </p>
     * 
     * @param maxResults
     *        The value that you specified for <code>MaxResults</code> in the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxResults</code> in the request.
     * </p>
     * 
     * @return The value that you specified for <code>MaxResults</code> in the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxResults</code> in the request.
     * </p>
     * 
     * @param maxResults
     *        The value that you specified for <code>MaxResults</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverRulesResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The resolver rules that were created using the current AWS account and that match the specified filters, if any.
     * </p>
     * 
     * @return The resolver rules that were created using the current AWS account and that match the specified filters,
     *         if any.
     */

    public java.util.List<ResolverRule> getResolverRules() {
        return resolverRules;
    }

    /**
     * <p>
     * The resolver rules that were created using the current AWS account and that match the specified filters, if any.
     * </p>
     * 
     * @param resolverRules
     *        The resolver rules that were created using the current AWS account and that match the specified filters,
     *        if any.
     */

    public void setResolverRules(java.util.Collection<ResolverRule> resolverRules) {
        if (resolverRules == null) {
            this.resolverRules = null;
            return;
        }

        this.resolverRules = new java.util.ArrayList<ResolverRule>(resolverRules);
    }

    /**
     * <p>
     * The resolver rules that were created using the current AWS account and that match the specified filters, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolverRules(java.util.Collection)} or {@link #withResolverRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resolverRules
     *        The resolver rules that were created using the current AWS account and that match the specified filters,
     *        if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverRulesResult withResolverRules(ResolverRule... resolverRules) {
        if (this.resolverRules == null) {
            setResolverRules(new java.util.ArrayList<ResolverRule>(resolverRules.length));
        }
        for (ResolverRule ele : resolverRules) {
            this.resolverRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resolver rules that were created using the current AWS account and that match the specified filters, if any.
     * </p>
     * 
     * @param resolverRules
     *        The resolver rules that were created using the current AWS account and that match the specified filters,
     *        if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverRulesResult withResolverRules(java.util.Collection<ResolverRule> resolverRules) {
        setResolverRules(resolverRules);
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
        if (getResolverRules() != null)
            sb.append("ResolverRules: ").append(getResolverRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolverRulesResult == false)
            return false;
        ListResolverRulesResult other = (ListResolverRulesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getResolverRules() == null ^ this.getResolverRules() == null)
            return false;
        if (other.getResolverRules() != null && other.getResolverRules().equals(this.getResolverRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResolverRules() == null) ? 0 : getResolverRules().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverRulesResult clone() {
        try {
            return (ListResolverRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
