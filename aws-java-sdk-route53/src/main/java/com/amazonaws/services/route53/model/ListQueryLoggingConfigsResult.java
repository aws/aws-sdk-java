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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListQueryLoggingConfigs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueryLoggingConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html">QueryLoggingConfig</a>
     * element for each configuration for DNS query logging that is associated with the current AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<QueryLoggingConfig> queryLoggingConfigs;
    /**
     * <p>
     * If a response includes the last of the query logging configurations that are associated with the current AWS
     * account, <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html">
     * ListQueryLoggingConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53 returned in the
     * previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html">QueryLoggingConfig</a>
     * element for each configuration for DNS query logging that is associated with the current AWS account.
     * </p>
     * 
     * @return An array that contains one <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     *         >QueryLoggingConfig</a> element for each configuration for DNS query logging that is associated with the
     *         current AWS account.
     */

    public java.util.List<QueryLoggingConfig> getQueryLoggingConfigs() {
        if (queryLoggingConfigs == null) {
            queryLoggingConfigs = new com.amazonaws.internal.SdkInternalList<QueryLoggingConfig>();
        }
        return queryLoggingConfigs;
    }

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html">QueryLoggingConfig</a>
     * element for each configuration for DNS query logging that is associated with the current AWS account.
     * </p>
     * 
     * @param queryLoggingConfigs
     *        An array that contains one <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     *        >QueryLoggingConfig</a> element for each configuration for DNS query logging that is associated with the
     *        current AWS account.
     */

    public void setQueryLoggingConfigs(java.util.Collection<QueryLoggingConfig> queryLoggingConfigs) {
        if (queryLoggingConfigs == null) {
            this.queryLoggingConfigs = null;
            return;
        }

        this.queryLoggingConfigs = new com.amazonaws.internal.SdkInternalList<QueryLoggingConfig>(queryLoggingConfigs);
    }

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html">QueryLoggingConfig</a>
     * element for each configuration for DNS query logging that is associated with the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryLoggingConfigs(java.util.Collection)} or {@link #withQueryLoggingConfigs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param queryLoggingConfigs
     *        An array that contains one <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     *        >QueryLoggingConfig</a> element for each configuration for DNS query logging that is associated with the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryLoggingConfigsResult withQueryLoggingConfigs(QueryLoggingConfig... queryLoggingConfigs) {
        if (this.queryLoggingConfigs == null) {
            setQueryLoggingConfigs(new com.amazonaws.internal.SdkInternalList<QueryLoggingConfig>(queryLoggingConfigs.length));
        }
        for (QueryLoggingConfig ele : queryLoggingConfigs) {
            this.queryLoggingConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains one <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html">QueryLoggingConfig</a>
     * element for each configuration for DNS query logging that is associated with the current AWS account.
     * </p>
     * 
     * @param queryLoggingConfigs
     *        An array that contains one <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     *        >QueryLoggingConfig</a> element for each configuration for DNS query logging that is associated with the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryLoggingConfigsResult withQueryLoggingConfigs(java.util.Collection<QueryLoggingConfig> queryLoggingConfigs) {
        setQueryLoggingConfigs(queryLoggingConfigs);
        return this;
    }

    /**
     * <p>
     * If a response includes the last of the query logging configurations that are associated with the current AWS
     * account, <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html">
     * ListQueryLoggingConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53 returned in the
     * previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @param nextToken
     *        If a response includes the last of the query logging configurations that are associated with the current
     *        AWS account, <code>NextToken</code> doesn't appear in the response.</p>
     *        <p>
     *        If a response doesn't include the last of the configurations, you can get more configurations by
     *        submitting another <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     *        >ListQueryLoggingConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53
     *        returned in the previous response and include it in <code>NextToken</code> in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a response includes the last of the query logging configurations that are associated with the current AWS
     * account, <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html">
     * ListQueryLoggingConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53 returned in the
     * previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @return If a response includes the last of the query logging configurations that are associated with the current
     *         AWS account, <code>NextToken</code> doesn't appear in the response.</p>
     *         <p>
     *         If a response doesn't include the last of the configurations, you can get more configurations by
     *         submitting another <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     *         >ListQueryLoggingConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53
     *         returned in the previous response and include it in <code>NextToken</code> in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a response includes the last of the query logging configurations that are associated with the current AWS
     * account, <code>NextToken</code> doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get more configurations by submitting
     * another <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html">
     * ListQueryLoggingConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53 returned in the
     * previous response and include it in <code>NextToken</code> in the next request.
     * </p>
     * 
     * @param nextToken
     *        If a response includes the last of the query logging configurations that are associated with the current
     *        AWS account, <code>NextToken</code> doesn't appear in the response.</p>
     *        <p>
     *        If a response doesn't include the last of the configurations, you can get more configurations by
     *        submitting another <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     *        >ListQueryLoggingConfigs</a> request. Get the value of <code>NextToken</code> that Amazon Route 53
     *        returned in the previous response and include it in <code>NextToken</code> in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryLoggingConfigsResult withNextToken(String nextToken) {
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
        if (getQueryLoggingConfigs() != null)
            sb.append("QueryLoggingConfigs: ").append(getQueryLoggingConfigs()).append(",");
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

        if (obj instanceof ListQueryLoggingConfigsResult == false)
            return false;
        ListQueryLoggingConfigsResult other = (ListQueryLoggingConfigsResult) obj;
        if (other.getQueryLoggingConfigs() == null ^ this.getQueryLoggingConfigs() == null)
            return false;
        if (other.getQueryLoggingConfigs() != null && other.getQueryLoggingConfigs().equals(this.getQueryLoggingConfigs()) == false)
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

        hashCode = prime * hashCode + ((getQueryLoggingConfigs() == null) ? 0 : getQueryLoggingConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListQueryLoggingConfigsResult clone() {
        try {
            return (ListQueryLoggingConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
