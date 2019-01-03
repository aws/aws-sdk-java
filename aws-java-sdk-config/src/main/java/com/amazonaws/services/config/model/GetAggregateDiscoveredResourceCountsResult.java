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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateDiscoveredResourceCounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAggregateDiscoveredResourceCountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The total number of resources that are present in an aggregator with the filters that you provide.
     * </p>
     */
    private Long totalDiscoveredResources;
    /**
     * <p>
     * The key passed into the request object. If <code>GroupByKey</code> is not provided, the result will be empty.
     * </p>
     */
    private String groupByKey;
    /**
     * <p>
     * Returns a list of GroupedResourceCount objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupedResourceCount> groupedResourceCounts;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of resources that are present in an aggregator with the filters that you provide.
     * </p>
     * 
     * @param totalDiscoveredResources
     *        The total number of resources that are present in an aggregator with the filters that you provide.
     */

    public void setTotalDiscoveredResources(Long totalDiscoveredResources) {
        this.totalDiscoveredResources = totalDiscoveredResources;
    }

    /**
     * <p>
     * The total number of resources that are present in an aggregator with the filters that you provide.
     * </p>
     * 
     * @return The total number of resources that are present in an aggregator with the filters that you provide.
     */

    public Long getTotalDiscoveredResources() {
        return this.totalDiscoveredResources;
    }

    /**
     * <p>
     * The total number of resources that are present in an aggregator with the filters that you provide.
     * </p>
     * 
     * @param totalDiscoveredResources
     *        The total number of resources that are present in an aggregator with the filters that you provide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateDiscoveredResourceCountsResult withTotalDiscoveredResources(Long totalDiscoveredResources) {
        setTotalDiscoveredResources(totalDiscoveredResources);
        return this;
    }

    /**
     * <p>
     * The key passed into the request object. If <code>GroupByKey</code> is not provided, the result will be empty.
     * </p>
     * 
     * @param groupByKey
     *        The key passed into the request object. If <code>GroupByKey</code> is not provided, the result will be
     *        empty.
     */

    public void setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
    }

    /**
     * <p>
     * The key passed into the request object. If <code>GroupByKey</code> is not provided, the result will be empty.
     * </p>
     * 
     * @return The key passed into the request object. If <code>GroupByKey</code> is not provided, the result will be
     *         empty.
     */

    public String getGroupByKey() {
        return this.groupByKey;
    }

    /**
     * <p>
     * The key passed into the request object. If <code>GroupByKey</code> is not provided, the result will be empty.
     * </p>
     * 
     * @param groupByKey
     *        The key passed into the request object. If <code>GroupByKey</code> is not provided, the result will be
     *        empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateDiscoveredResourceCountsResult withGroupByKey(String groupByKey) {
        setGroupByKey(groupByKey);
        return this;
    }

    /**
     * <p>
     * Returns a list of GroupedResourceCount objects.
     * </p>
     * 
     * @return Returns a list of GroupedResourceCount objects.
     */

    public java.util.List<GroupedResourceCount> getGroupedResourceCounts() {
        if (groupedResourceCounts == null) {
            groupedResourceCounts = new com.amazonaws.internal.SdkInternalList<GroupedResourceCount>();
        }
        return groupedResourceCounts;
    }

    /**
     * <p>
     * Returns a list of GroupedResourceCount objects.
     * </p>
     * 
     * @param groupedResourceCounts
     *        Returns a list of GroupedResourceCount objects.
     */

    public void setGroupedResourceCounts(java.util.Collection<GroupedResourceCount> groupedResourceCounts) {
        if (groupedResourceCounts == null) {
            this.groupedResourceCounts = null;
            return;
        }

        this.groupedResourceCounts = new com.amazonaws.internal.SdkInternalList<GroupedResourceCount>(groupedResourceCounts);
    }

    /**
     * <p>
     * Returns a list of GroupedResourceCount objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupedResourceCounts(java.util.Collection)} or
     * {@link #withGroupedResourceCounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param groupedResourceCounts
     *        Returns a list of GroupedResourceCount objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateDiscoveredResourceCountsResult withGroupedResourceCounts(GroupedResourceCount... groupedResourceCounts) {
        if (this.groupedResourceCounts == null) {
            setGroupedResourceCounts(new com.amazonaws.internal.SdkInternalList<GroupedResourceCount>(groupedResourceCounts.length));
        }
        for (GroupedResourceCount ele : groupedResourceCounts) {
            this.groupedResourceCounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of GroupedResourceCount objects.
     * </p>
     * 
     * @param groupedResourceCounts
     *        Returns a list of GroupedResourceCount objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateDiscoveredResourceCountsResult withGroupedResourceCounts(java.util.Collection<GroupedResourceCount> groupedResourceCounts) {
        setGroupedResourceCounts(groupedResourceCounts);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateDiscoveredResourceCountsResult withNextToken(String nextToken) {
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
        if (getTotalDiscoveredResources() != null)
            sb.append("TotalDiscoveredResources: ").append(getTotalDiscoveredResources()).append(",");
        if (getGroupByKey() != null)
            sb.append("GroupByKey: ").append(getGroupByKey()).append(",");
        if (getGroupedResourceCounts() != null)
            sb.append("GroupedResourceCounts: ").append(getGroupedResourceCounts()).append(",");
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

        if (obj instanceof GetAggregateDiscoveredResourceCountsResult == false)
            return false;
        GetAggregateDiscoveredResourceCountsResult other = (GetAggregateDiscoveredResourceCountsResult) obj;
        if (other.getTotalDiscoveredResources() == null ^ this.getTotalDiscoveredResources() == null)
            return false;
        if (other.getTotalDiscoveredResources() != null && other.getTotalDiscoveredResources().equals(this.getTotalDiscoveredResources()) == false)
            return false;
        if (other.getGroupByKey() == null ^ this.getGroupByKey() == null)
            return false;
        if (other.getGroupByKey() != null && other.getGroupByKey().equals(this.getGroupByKey()) == false)
            return false;
        if (other.getGroupedResourceCounts() == null ^ this.getGroupedResourceCounts() == null)
            return false;
        if (other.getGroupedResourceCounts() != null && other.getGroupedResourceCounts().equals(this.getGroupedResourceCounts()) == false)
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

        hashCode = prime * hashCode + ((getTotalDiscoveredResources() == null) ? 0 : getTotalDiscoveredResources().hashCode());
        hashCode = prime * hashCode + ((getGroupByKey() == null) ? 0 : getGroupByKey().hashCode());
        hashCode = prime * hashCode + ((getGroupedResourceCounts() == null) ? 0 : getGroupedResourceCounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAggregateDiscoveredResourceCountsResult clone() {
        try {
            return (GetAggregateDiscoveredResourceCountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
