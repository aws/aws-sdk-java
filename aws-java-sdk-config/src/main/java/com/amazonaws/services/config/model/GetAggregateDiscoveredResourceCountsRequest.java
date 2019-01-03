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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateDiscoveredResourceCounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAggregateDiscoveredResourceCountsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     */
    private String configurationAggregatorName;
    /**
     * <p>
     * Filters the results based on the <code>ResourceCountFilters</code> object.
     * </p>
     */
    private ResourceCountFilters filters;
    /**
     * <p>
     * The key to group the resource counts.
     * </p>
     */
    private String groupByKey;
    /**
     * <p>
     * The maximum number of <a>GroupedResourceCount</a> objects returned on each page. The default is 1000. You cannot
     * specify a number greater than 1000. If you specify 0, AWS Config uses the default.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     */

    public void setConfigurationAggregatorName(String configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @return The name of the configuration aggregator.
     */

    public String getConfigurationAggregatorName() {
        return this.configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateDiscoveredResourceCountsRequest withConfigurationAggregatorName(String configurationAggregatorName) {
        setConfigurationAggregatorName(configurationAggregatorName);
        return this;
    }

    /**
     * <p>
     * Filters the results based on the <code>ResourceCountFilters</code> object.
     * </p>
     * 
     * @param filters
     *        Filters the results based on the <code>ResourceCountFilters</code> object.
     */

    public void setFilters(ResourceCountFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Filters the results based on the <code>ResourceCountFilters</code> object.
     * </p>
     * 
     * @return Filters the results based on the <code>ResourceCountFilters</code> object.
     */

    public ResourceCountFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Filters the results based on the <code>ResourceCountFilters</code> object.
     * </p>
     * 
     * @param filters
     *        Filters the results based on the <code>ResourceCountFilters</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateDiscoveredResourceCountsRequest withFilters(ResourceCountFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The key to group the resource counts.
     * </p>
     * 
     * @param groupByKey
     *        The key to group the resource counts.
     * @see ResourceCountGroupKey
     */

    public void setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
    }

    /**
     * <p>
     * The key to group the resource counts.
     * </p>
     * 
     * @return The key to group the resource counts.
     * @see ResourceCountGroupKey
     */

    public String getGroupByKey() {
        return this.groupByKey;
    }

    /**
     * <p>
     * The key to group the resource counts.
     * </p>
     * 
     * @param groupByKey
     *        The key to group the resource counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCountGroupKey
     */

    public GetAggregateDiscoveredResourceCountsRequest withGroupByKey(String groupByKey) {
        setGroupByKey(groupByKey);
        return this;
    }

    /**
     * <p>
     * The key to group the resource counts.
     * </p>
     * 
     * @param groupByKey
     *        The key to group the resource counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCountGroupKey
     */

    public GetAggregateDiscoveredResourceCountsRequest withGroupByKey(ResourceCountGroupKey groupByKey) {
        this.groupByKey = groupByKey.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of <a>GroupedResourceCount</a> objects returned on each page. The default is 1000. You cannot
     * specify a number greater than 1000. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>GroupedResourceCount</a> objects returned on each page. The default is 1000. You
     *        cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of <a>GroupedResourceCount</a> objects returned on each page. The default is 1000. You cannot
     * specify a number greater than 1000. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @return The maximum number of <a>GroupedResourceCount</a> objects returned on each page. The default is 1000. You
     *         cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of <a>GroupedResourceCount</a> objects returned on each page. The default is 1000. You cannot
     * specify a number greater than 1000. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>GroupedResourceCount</a> objects returned on each page. The default is 1000. You
     *        cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateDiscoveredResourceCountsRequest withLimit(Integer limit) {
        setLimit(limit);
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

    public GetAggregateDiscoveredResourceCountsRequest withNextToken(String nextToken) {
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
        if (getConfigurationAggregatorName() != null)
            sb.append("ConfigurationAggregatorName: ").append(getConfigurationAggregatorName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getGroupByKey() != null)
            sb.append("GroupByKey: ").append(getGroupByKey()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof GetAggregateDiscoveredResourceCountsRequest == false)
            return false;
        GetAggregateDiscoveredResourceCountsRequest other = (GetAggregateDiscoveredResourceCountsRequest) obj;
        if (other.getConfigurationAggregatorName() == null ^ this.getConfigurationAggregatorName() == null)
            return false;
        if (other.getConfigurationAggregatorName() != null && other.getConfigurationAggregatorName().equals(this.getConfigurationAggregatorName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupByKey() == null ^ this.getGroupByKey() == null)
            return false;
        if (other.getGroupByKey() != null && other.getGroupByKey().equals(this.getGroupByKey()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationAggregatorName() == null) ? 0 : getConfigurationAggregatorName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupByKey() == null) ? 0 : getGroupByKey().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAggregateDiscoveredResourceCountsRequest clone() {
        return (GetAggregateDiscoveredResourceCountsRequest) super.clone();
    }

}
