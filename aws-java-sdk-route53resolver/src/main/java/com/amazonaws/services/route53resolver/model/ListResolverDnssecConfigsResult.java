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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverDnssecConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverDnssecConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If a response includes the last of the DNSSEC configurations that are associated with the current AWS account,
     * <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListResolverDnssecConfigs.html">
     * ListResolverDnssecConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53 returned in
     * the previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     * >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with the
     * current AWS account.
     * </p>
     */
    private java.util.List<ResolverDnssecConfig> resolverDnssecConfigs;

    /**
     * <p>
     * If a response includes the last of the DNSSEC configurations that are associated with the current AWS account,
     * <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListResolverDnssecConfigs.html">
     * ListResolverDnssecConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53 returned in
     * the previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @param nextToken
     *        If a response includes the last of the DNSSEC configurations that are associated with the current AWS
     *        account, <code>NextToken</code> doesn't appear in the response.</p>
     *        <p>
     *        If a response doesn't include the last of the configurations, you can get more configurations by
     *        submitting another <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListResolverDnssecConfigs.html"
     *        >ListResolverDnssecConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53
     *        returned in the previous response and include it in <code>NextToken</code> in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a response includes the last of the DNSSEC configurations that are associated with the current AWS account,
     * <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListResolverDnssecConfigs.html">
     * ListResolverDnssecConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53 returned in
     * the previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @return If a response includes the last of the DNSSEC configurations that are associated with the current AWS
     *         account, <code>NextToken</code> doesn't appear in the response.</p>
     *         <p>
     *         If a response doesn't include the last of the configurations, you can get more configurations by
     *         submitting another <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListResolverDnssecConfigs.html"
     *         >ListResolverDnssecConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53
     *         returned in the previous response and include it in <code>NextToken</code> in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a response includes the last of the DNSSEC configurations that are associated with the current AWS account,
     * <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListResolverDnssecConfigs.html">
     * ListResolverDnssecConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53 returned in
     * the previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @param nextToken
     *        If a response includes the last of the DNSSEC configurations that are associated with the current AWS
     *        account, <code>NextToken</code> doesn't appear in the response.</p>
     *        <p>
     *        If a response doesn't include the last of the configurations, you can get more configurations by
     *        submitting another <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListResolverDnssecConfigs.html"
     *        >ListResolverDnssecConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53
     *        returned in the previous response and include it in <code>NextToken</code> in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverDnssecConfigsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     * >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with the
     * current AWS account.
     * </p>
     * 
     * @return An array that contains one <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     *         >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with
     *         the current AWS account.
     */

    public java.util.List<ResolverDnssecConfig> getResolverDnssecConfigs() {
        return resolverDnssecConfigs;
    }

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     * >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with the
     * current AWS account.
     * </p>
     * 
     * @param resolverDnssecConfigs
     *        An array that contains one <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     *        >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with the
     *        current AWS account.
     */

    public void setResolverDnssecConfigs(java.util.Collection<ResolverDnssecConfig> resolverDnssecConfigs) {
        if (resolverDnssecConfigs == null) {
            this.resolverDnssecConfigs = null;
            return;
        }

        this.resolverDnssecConfigs = new java.util.ArrayList<ResolverDnssecConfig>(resolverDnssecConfigs);
    }

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     * >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with the
     * current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolverDnssecConfigs(java.util.Collection)} or
     * {@link #withResolverDnssecConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resolverDnssecConfigs
     *        An array that contains one <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     *        >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverDnssecConfigsResult withResolverDnssecConfigs(ResolverDnssecConfig... resolverDnssecConfigs) {
        if (this.resolverDnssecConfigs == null) {
            setResolverDnssecConfigs(new java.util.ArrayList<ResolverDnssecConfig>(resolverDnssecConfigs.length));
        }
        for (ResolverDnssecConfig ele : resolverDnssecConfigs) {
            this.resolverDnssecConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     * >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with the
     * current AWS account.
     * </p>
     * 
     * @param resolverDnssecConfigs
     *        An array that contains one <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResolverDnssecConfig.html"
     *        >ResolverDnssecConfig</a> element for each configuration for DNSSEC validation that is associated with the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverDnssecConfigsResult withResolverDnssecConfigs(java.util.Collection<ResolverDnssecConfig> resolverDnssecConfigs) {
        setResolverDnssecConfigs(resolverDnssecConfigs);
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
        if (getResolverDnssecConfigs() != null)
            sb.append("ResolverDnssecConfigs: ").append(getResolverDnssecConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolverDnssecConfigsResult == false)
            return false;
        ListResolverDnssecConfigsResult other = (ListResolverDnssecConfigsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResolverDnssecConfigs() == null ^ this.getResolverDnssecConfigs() == null)
            return false;
        if (other.getResolverDnssecConfigs() != null && other.getResolverDnssecConfigs().equals(this.getResolverDnssecConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResolverDnssecConfigs() == null) ? 0 : getResolverDnssecConfigs().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverDnssecConfigsResult clone() {
        try {
            return (ListResolverDnssecConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
