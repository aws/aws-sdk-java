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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverQueryLogConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more than <code>MaxResults</code> query logging configurations, you can submit another
     * <code>ListResolverQueryLogConfigs</code> request to get the next group of configurations. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of query logging configurations that were created by the current account in the specified
     * Region. This count can differ from the number of query logging configurations that are returned in a
     * <code>ListResolverQueryLogConfigs</code> response, depending on the values that you specify in the request.
     * </p>
     */
    private Integer totalCount;
    /**
     * <p>
     * The total number of query logging configurations that were created by the current account in the specified Region
     * and that match the filters that were specified in the <code>ListResolverQueryLogConfigs</code> request. For the
     * total number of query logging configurations that were created by the current account in the specified Region,
     * see <code>TotalCount</code>.
     * </p>
     */
    private Integer totalFilteredCount;
    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration that
     * matches the values that you specified for <code>Filter</code>.
     * </p>
     */
    private java.util.List<ResolverQueryLogConfig> resolverQueryLogConfigs;

    /**
     * <p>
     * If there are more than <code>MaxResults</code> query logging configurations, you can submit another
     * <code>ListResolverQueryLogConfigs</code> request to get the next group of configurations. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If there are more than <code>MaxResults</code> query logging configurations, you can submit another
     *        <code>ListResolverQueryLogConfigs</code> request to get the next group of configurations. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more than <code>MaxResults</code> query logging configurations, you can submit another
     * <code>ListResolverQueryLogConfigs</code> request to get the next group of configurations. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If there are more than <code>MaxResults</code> query logging configurations, you can submit another
     *         <code>ListResolverQueryLogConfigs</code> request to get the next group of configurations. In the next
     *         request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more than <code>MaxResults</code> query logging configurations, you can submit another
     * <code>ListResolverQueryLogConfigs</code> request to get the next group of configurations. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If there are more than <code>MaxResults</code> query logging configurations, you can submit another
     *        <code>ListResolverQueryLogConfigs</code> request to get the next group of configurations. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of query logging configurations that were created by the current account in the specified
     * Region. This count can differ from the number of query logging configurations that are returned in a
     * <code>ListResolverQueryLogConfigs</code> response, depending on the values that you specify in the request.
     * </p>
     * 
     * @param totalCount
     *        The total number of query logging configurations that were created by the current account in the specified
     *        Region. This count can differ from the number of query logging configurations that are returned in a
     *        <code>ListResolverQueryLogConfigs</code> response, depending on the values that you specify in the
     *        request.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of query logging configurations that were created by the current account in the specified
     * Region. This count can differ from the number of query logging configurations that are returned in a
     * <code>ListResolverQueryLogConfigs</code> response, depending on the values that you specify in the request.
     * </p>
     * 
     * @return The total number of query logging configurations that were created by the current account in the
     *         specified Region. This count can differ from the number of query logging configurations that are returned
     *         in a <code>ListResolverQueryLogConfigs</code> response, depending on the values that you specify in the
     *         request.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of query logging configurations that were created by the current account in the specified
     * Region. This count can differ from the number of query logging configurations that are returned in a
     * <code>ListResolverQueryLogConfigs</code> response, depending on the values that you specify in the request.
     * </p>
     * 
     * @param totalCount
     *        The total number of query logging configurations that were created by the current account in the specified
     *        Region. This count can differ from the number of query logging configurations that are returned in a
     *        <code>ListResolverQueryLogConfigs</code> response, depending on the values that you specify in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsResult withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * The total number of query logging configurations that were created by the current account in the specified Region
     * and that match the filters that were specified in the <code>ListResolverQueryLogConfigs</code> request. For the
     * total number of query logging configurations that were created by the current account in the specified Region,
     * see <code>TotalCount</code>.
     * </p>
     * 
     * @param totalFilteredCount
     *        The total number of query logging configurations that were created by the current account in the specified
     *        Region and that match the filters that were specified in the <code>ListResolverQueryLogConfigs</code>
     *        request. For the total number of query logging configurations that were created by the current account in
     *        the specified Region, see <code>TotalCount</code>.
     */

    public void setTotalFilteredCount(Integer totalFilteredCount) {
        this.totalFilteredCount = totalFilteredCount;
    }

    /**
     * <p>
     * The total number of query logging configurations that were created by the current account in the specified Region
     * and that match the filters that were specified in the <code>ListResolverQueryLogConfigs</code> request. For the
     * total number of query logging configurations that were created by the current account in the specified Region,
     * see <code>TotalCount</code>.
     * </p>
     * 
     * @return The total number of query logging configurations that were created by the current account in the
     *         specified Region and that match the filters that were specified in the
     *         <code>ListResolverQueryLogConfigs</code> request. For the total number of query logging configurations
     *         that were created by the current account in the specified Region, see <code>TotalCount</code>.
     */

    public Integer getTotalFilteredCount() {
        return this.totalFilteredCount;
    }

    /**
     * <p>
     * The total number of query logging configurations that were created by the current account in the specified Region
     * and that match the filters that were specified in the <code>ListResolverQueryLogConfigs</code> request. For the
     * total number of query logging configurations that were created by the current account in the specified Region,
     * see <code>TotalCount</code>.
     * </p>
     * 
     * @param totalFilteredCount
     *        The total number of query logging configurations that were created by the current account in the specified
     *        Region and that match the filters that were specified in the <code>ListResolverQueryLogConfigs</code>
     *        request. For the total number of query logging configurations that were created by the current account in
     *        the specified Region, see <code>TotalCount</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsResult withTotalFilteredCount(Integer totalFilteredCount) {
        setTotalFilteredCount(totalFilteredCount);
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration that
     * matches the values that you specified for <code>Filter</code>.
     * </p>
     * 
     * @return A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration
     *         that matches the values that you specified for <code>Filter</code>.
     */

    public java.util.List<ResolverQueryLogConfig> getResolverQueryLogConfigs() {
        return resolverQueryLogConfigs;
    }

    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration that
     * matches the values that you specified for <code>Filter</code>.
     * </p>
     * 
     * @param resolverQueryLogConfigs
     *        A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration
     *        that matches the values that you specified for <code>Filter</code>.
     */

    public void setResolverQueryLogConfigs(java.util.Collection<ResolverQueryLogConfig> resolverQueryLogConfigs) {
        if (resolverQueryLogConfigs == null) {
            this.resolverQueryLogConfigs = null;
            return;
        }

        this.resolverQueryLogConfigs = new java.util.ArrayList<ResolverQueryLogConfig>(resolverQueryLogConfigs);
    }

    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration that
     * matches the values that you specified for <code>Filter</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolverQueryLogConfigs(java.util.Collection)} or
     * {@link #withResolverQueryLogConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resolverQueryLogConfigs
     *        A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration
     *        that matches the values that you specified for <code>Filter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsResult withResolverQueryLogConfigs(ResolverQueryLogConfig... resolverQueryLogConfigs) {
        if (this.resolverQueryLogConfigs == null) {
            setResolverQueryLogConfigs(new java.util.ArrayList<ResolverQueryLogConfig>(resolverQueryLogConfigs.length));
        }
        for (ResolverQueryLogConfig ele : resolverQueryLogConfigs) {
            this.resolverQueryLogConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration that
     * matches the values that you specified for <code>Filter</code>.
     * </p>
     * 
     * @param resolverQueryLogConfigs
     *        A list that contains one <code>ResolverQueryLogConfig</code> element for each query logging configuration
     *        that matches the values that you specified for <code>Filter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsResult withResolverQueryLogConfigs(java.util.Collection<ResolverQueryLogConfig> resolverQueryLogConfigs) {
        setResolverQueryLogConfigs(resolverQueryLogConfigs);
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
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getTotalFilteredCount() != null)
            sb.append("TotalFilteredCount: ").append(getTotalFilteredCount()).append(",");
        if (getResolverQueryLogConfigs() != null)
            sb.append("ResolverQueryLogConfigs: ").append(getResolverQueryLogConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolverQueryLogConfigsResult == false)
            return false;
        ListResolverQueryLogConfigsResult other = (ListResolverQueryLogConfigsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getTotalFilteredCount() == null ^ this.getTotalFilteredCount() == null)
            return false;
        if (other.getTotalFilteredCount() != null && other.getTotalFilteredCount().equals(this.getTotalFilteredCount()) == false)
            return false;
        if (other.getResolverQueryLogConfigs() == null ^ this.getResolverQueryLogConfigs() == null)
            return false;
        if (other.getResolverQueryLogConfigs() != null && other.getResolverQueryLogConfigs().equals(this.getResolverQueryLogConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getTotalFilteredCount() == null) ? 0 : getTotalFilteredCount().hashCode());
        hashCode = prime * hashCode + ((getResolverQueryLogConfigs() == null) ? 0 : getResolverQueryLogConfigs().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverQueryLogConfigsResult clone() {
        try {
            return (ListResolverQueryLogConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
