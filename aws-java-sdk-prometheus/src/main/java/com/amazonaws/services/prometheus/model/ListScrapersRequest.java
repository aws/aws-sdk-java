/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>ListScrapers</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListScrapers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScrapersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) A list of key-value pairs to filter the list of scrapers returned. Keys include <code>status</code>,
     * <code>sourceArn</code>, <code>destinationArn</code>, and <code>alias</code>.
     * </p>
     * <p>
     * Filters on the same key are <code>OR</code>'d together, and filters on different keys are <code>AND</code>'d
     * together. For example, <code>status=ACTIVE&amp;status=CREATING&amp;alias=Test</code>, will return all scrapers
     * that have the alias Test, and are either in status ACTIVE or CREATING.
     * </p>
     * <p>
     * To find all active scrapers that are sending metrics to a specific Amazon Managed Service for Prometheus
     * workspace, you would use the ARN of the workspace in a query:
     * </p>
     * <p>
     * <code>status=ACTIVE&amp;destinationArn=arn:aws:aps:us-east-1:123456789012:workspace/ws-example1-1234-abcd-56ef-123456789012</code>
     * </p>
     * <p>
     * If this is included, it filters the results to only the scrapers that match the filter.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;
    /**
     * <p>
     * Optional) The maximum number of scrapers to return in one <code>ListScrapers</code> operation. The range is
     * 1-1000.
     * </p>
     * <p>
     * If you omit this parameter, the default of 100 is used.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) A list of key-value pairs to filter the list of scrapers returned. Keys include <code>status</code>,
     * <code>sourceArn</code>, <code>destinationArn</code>, and <code>alias</code>.
     * </p>
     * <p>
     * Filters on the same key are <code>OR</code>'d together, and filters on different keys are <code>AND</code>'d
     * together. For example, <code>status=ACTIVE&amp;status=CREATING&amp;alias=Test</code>, will return all scrapers
     * that have the alias Test, and are either in status ACTIVE or CREATING.
     * </p>
     * <p>
     * To find all active scrapers that are sending metrics to a specific Amazon Managed Service for Prometheus
     * workspace, you would use the ARN of the workspace in a query:
     * </p>
     * <p>
     * <code>status=ACTIVE&amp;destinationArn=arn:aws:aps:us-east-1:123456789012:workspace/ws-example1-1234-abcd-56ef-123456789012</code>
     * </p>
     * <p>
     * If this is included, it filters the results to only the scrapers that match the filter.
     * </p>
     * 
     * @return (Optional) A list of key-value pairs to filter the list of scrapers returned. Keys include
     *         <code>status</code>, <code>sourceArn</code>, <code>destinationArn</code>, and <code>alias</code>.</p>
     *         <p>
     *         Filters on the same key are <code>OR</code>'d together, and filters on different keys are
     *         <code>AND</code>'d together. For example, <code>status=ACTIVE&amp;status=CREATING&amp;alias=Test</code>,
     *         will return all scrapers that have the alias Test, and are either in status ACTIVE or CREATING.
     *         </p>
     *         <p>
     *         To find all active scrapers that are sending metrics to a specific Amazon Managed Service for Prometheus
     *         workspace, you would use the ARN of the workspace in a query:
     *         </p>
     *         <p>
     *         <code>status=ACTIVE&amp;destinationArn=arn:aws:aps:us-east-1:123456789012:workspace/ws-example1-1234-abcd-56ef-123456789012</code>
     *         </p>
     *         <p>
     *         If this is included, it filters the results to only the scrapers that match the filter.
     */

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * (Optional) A list of key-value pairs to filter the list of scrapers returned. Keys include <code>status</code>,
     * <code>sourceArn</code>, <code>destinationArn</code>, and <code>alias</code>.
     * </p>
     * <p>
     * Filters on the same key are <code>OR</code>'d together, and filters on different keys are <code>AND</code>'d
     * together. For example, <code>status=ACTIVE&amp;status=CREATING&amp;alias=Test</code>, will return all scrapers
     * that have the alias Test, and are either in status ACTIVE or CREATING.
     * </p>
     * <p>
     * To find all active scrapers that are sending metrics to a specific Amazon Managed Service for Prometheus
     * workspace, you would use the ARN of the workspace in a query:
     * </p>
     * <p>
     * <code>status=ACTIVE&amp;destinationArn=arn:aws:aps:us-east-1:123456789012:workspace/ws-example1-1234-abcd-56ef-123456789012</code>
     * </p>
     * <p>
     * If this is included, it filters the results to only the scrapers that match the filter.
     * </p>
     * 
     * @param filters
     *        (Optional) A list of key-value pairs to filter the list of scrapers returned. Keys include
     *        <code>status</code>, <code>sourceArn</code>, <code>destinationArn</code>, and <code>alias</code>.</p>
     *        <p>
     *        Filters on the same key are <code>OR</code>'d together, and filters on different keys are <code>AND</code>
     *        'd together. For example, <code>status=ACTIVE&amp;status=CREATING&amp;alias=Test</code>, will return all
     *        scrapers that have the alias Test, and are either in status ACTIVE or CREATING.
     *        </p>
     *        <p>
     *        To find all active scrapers that are sending metrics to a specific Amazon Managed Service for Prometheus
     *        workspace, you would use the ARN of the workspace in a query:
     *        </p>
     *        <p>
     *        <code>status=ACTIVE&amp;destinationArn=arn:aws:aps:us-east-1:123456789012:workspace/ws-example1-1234-abcd-56ef-123456789012</code>
     *        </p>
     *        <p>
     *        If this is included, it filters the results to only the scrapers that match the filter.
     */

    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * (Optional) A list of key-value pairs to filter the list of scrapers returned. Keys include <code>status</code>,
     * <code>sourceArn</code>, <code>destinationArn</code>, and <code>alias</code>.
     * </p>
     * <p>
     * Filters on the same key are <code>OR</code>'d together, and filters on different keys are <code>AND</code>'d
     * together. For example, <code>status=ACTIVE&amp;status=CREATING&amp;alias=Test</code>, will return all scrapers
     * that have the alias Test, and are either in status ACTIVE or CREATING.
     * </p>
     * <p>
     * To find all active scrapers that are sending metrics to a specific Amazon Managed Service for Prometheus
     * workspace, you would use the ARN of the workspace in a query:
     * </p>
     * <p>
     * <code>status=ACTIVE&amp;destinationArn=arn:aws:aps:us-east-1:123456789012:workspace/ws-example1-1234-abcd-56ef-123456789012</code>
     * </p>
     * <p>
     * If this is included, it filters the results to only the scrapers that match the filter.
     * </p>
     * 
     * @param filters
     *        (Optional) A list of key-value pairs to filter the list of scrapers returned. Keys include
     *        <code>status</code>, <code>sourceArn</code>, <code>destinationArn</code>, and <code>alias</code>.</p>
     *        <p>
     *        Filters on the same key are <code>OR</code>'d together, and filters on different keys are <code>AND</code>
     *        'd together. For example, <code>status=ACTIVE&amp;status=CREATING&amp;alias=Test</code>, will return all
     *        scrapers that have the alias Test, and are either in status ACTIVE or CREATING.
     *        </p>
     *        <p>
     *        To find all active scrapers that are sending metrics to a specific Amazon Managed Service for Prometheus
     *        workspace, you would use the ARN of the workspace in a query:
     *        </p>
     *        <p>
     *        <code>status=ACTIVE&amp;destinationArn=arn:aws:aps:us-east-1:123456789012:workspace/ws-example1-1234-abcd-56ef-123456789012</code>
     *        </p>
     *        <p>
     *        If this is included, it filters the results to only the scrapers that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest withFilters(java.util.Map<String, java.util.List<String>> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * Add a single Filters entry
     *
     * @see ListScrapersRequest#withFilters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest addFiltersEntry(String key, java.util.List<String> value) {
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

    public ListScrapersRequest clearFiltersEntries() {
        this.filters = null;
        return this;
    }

    /**
     * <p>
     * Optional) The maximum number of scrapers to return in one <code>ListScrapers</code> operation. The range is
     * 1-1000.
     * </p>
     * <p>
     * If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @param maxResults
     *        Optional) The maximum number of scrapers to return in one <code>ListScrapers</code> operation. The range
     *        is 1-1000.</p>
     *        <p>
     *        If you omit this parameter, the default of 100 is used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Optional) The maximum number of scrapers to return in one <code>ListScrapers</code> operation. The range is
     * 1-1000.
     * </p>
     * <p>
     * If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @return Optional) The maximum number of scrapers to return in one <code>ListScrapers</code> operation. The range
     *         is 1-1000.</p>
     *         <p>
     *         If you omit this parameter, the default of 100 is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Optional) The maximum number of scrapers to return in one <code>ListScrapers</code> operation. The range is
     * 1-1000.
     * </p>
     * <p>
     * If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @param maxResults
     *        Optional) The maximum number of scrapers to return in one <code>ListScrapers</code> operation. The range
     *        is 1-1000.</p>
     *        <p>
     *        If you omit this parameter, the default of 100 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListScrapersRequest == false)
            return false;
        ListScrapersRequest other = (ListScrapersRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListScrapersRequest clone() {
        return (ListScrapersRequest) super.clone();
    }

}
