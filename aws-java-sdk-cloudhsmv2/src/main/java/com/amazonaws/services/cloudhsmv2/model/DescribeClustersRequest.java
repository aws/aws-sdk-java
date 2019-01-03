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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more filters to limit the items returned in the response.
     * </p>
     * <p>
     * Use the <code>clusterIds</code> filter to return only the specified clusters. Specify clusters by their cluster
     * identifier (ID).
     * </p>
     * <p>
     * Use the <code>vpcIds</code> filter to return only the clusters in the specified virtual private clouds (VPCs).
     * Specify VPCs by their VPC identifier (ID).
     * </p>
     * <p>
     * Use the <code>states</code> filter to return only clusters that match the specified state.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;
    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more clusters.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of clusters to return in the response. When there are more clusters than the number you
     * specify, the response contains a <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters to limit the items returned in the response.
     * </p>
     * <p>
     * Use the <code>clusterIds</code> filter to return only the specified clusters. Specify clusters by their cluster
     * identifier (ID).
     * </p>
     * <p>
     * Use the <code>vpcIds</code> filter to return only the clusters in the specified virtual private clouds (VPCs).
     * Specify VPCs by their VPC identifier (ID).
     * </p>
     * <p>
     * Use the <code>states</code> filter to return only clusters that match the specified state.
     * </p>
     * 
     * @return One or more filters to limit the items returned in the response.</p>
     *         <p>
     *         Use the <code>clusterIds</code> filter to return only the specified clusters. Specify clusters by their
     *         cluster identifier (ID).
     *         </p>
     *         <p>
     *         Use the <code>vpcIds</code> filter to return only the clusters in the specified virtual private clouds
     *         (VPCs). Specify VPCs by their VPC identifier (ID).
     *         </p>
     *         <p>
     *         Use the <code>states</code> filter to return only clusters that match the specified state.
     */

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters to limit the items returned in the response.
     * </p>
     * <p>
     * Use the <code>clusterIds</code> filter to return only the specified clusters. Specify clusters by their cluster
     * identifier (ID).
     * </p>
     * <p>
     * Use the <code>vpcIds</code> filter to return only the clusters in the specified virtual private clouds (VPCs).
     * Specify VPCs by their VPC identifier (ID).
     * </p>
     * <p>
     * Use the <code>states</code> filter to return only clusters that match the specified state.
     * </p>
     * 
     * @param filters
     *        One or more filters to limit the items returned in the response.</p>
     *        <p>
     *        Use the <code>clusterIds</code> filter to return only the specified clusters. Specify clusters by their
     *        cluster identifier (ID).
     *        </p>
     *        <p>
     *        Use the <code>vpcIds</code> filter to return only the clusters in the specified virtual private clouds
     *        (VPCs). Specify VPCs by their VPC identifier (ID).
     *        </p>
     *        <p>
     *        Use the <code>states</code> filter to return only clusters that match the specified state.
     */

    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * One or more filters to limit the items returned in the response.
     * </p>
     * <p>
     * Use the <code>clusterIds</code> filter to return only the specified clusters. Specify clusters by their cluster
     * identifier (ID).
     * </p>
     * <p>
     * Use the <code>vpcIds</code> filter to return only the clusters in the specified virtual private clouds (VPCs).
     * Specify VPCs by their VPC identifier (ID).
     * </p>
     * <p>
     * Use the <code>states</code> filter to return only clusters that match the specified state.
     * </p>
     * 
     * @param filters
     *        One or more filters to limit the items returned in the response.</p>
     *        <p>
     *        Use the <code>clusterIds</code> filter to return only the specified clusters. Specify clusters by their
     *        cluster identifier (ID).
     *        </p>
     *        <p>
     *        Use the <code>vpcIds</code> filter to return only the clusters in the specified virtual private clouds
     *        (VPCs). Specify VPCs by their VPC identifier (ID).
     *        </p>
     *        <p>
     *        Use the <code>states</code> filter to return only clusters that match the specified state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withFilters(java.util.Map<String, java.util.List<String>> filters) {
        setFilters(filters);
        return this;
    }

    public DescribeClustersRequest addFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest clearFiltersEntries() {
        this.filters = null;
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more clusters.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *        clusters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more clusters.
     * </p>
     * 
     * @return The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *         clusters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more clusters.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *        clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of clusters to return in the response. When there are more clusters than the number you
     * specify, the response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of clusters to return in the response. When there are more clusters than the number you
     *        specify, the response contains a <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of clusters to return in the response. When there are more clusters than the number you
     * specify, the response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of clusters to return in the response. When there are more clusters than the number
     *         you specify, the response contains a <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of clusters to return in the response. When there are more clusters than the number you
     * specify, the response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of clusters to return in the response. When there are more clusters than the number you
     *        specify, the response contains a <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeClustersRequest == false)
            return false;
        DescribeClustersRequest other = (DescribeClustersRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClustersRequest clone() {
        return (DescribeClustersRequest) super.clone();
    }

}
