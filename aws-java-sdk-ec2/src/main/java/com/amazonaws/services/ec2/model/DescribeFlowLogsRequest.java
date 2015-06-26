/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeFlowLogs(DescribeFlowLogsRequest) DescribeFlowLogs operation}.
 * <p>
 * Describes one or more flow logs. To view the information in your flow
 * logs (the log streams for the network interfaces), you must use the
 * CloudWatch Logs console or the CloudWatch Logs API.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeFlowLogs(DescribeFlowLogsRequest)
 */
public class DescribeFlowLogsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * One or more flow log IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> flowLogIds;

    /**
     * One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     * status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     * the flow log.</li> <li><p><code>log-group-name</code> - The name of
     * the log group.</li> <li><p><code>resource-id</code> - The ID of the
     * VPC, subnet, or network interface.</li>
     * <li><p><code>traffic-type</code> - The type of traffic
     * (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     * </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filter;

    /**
     * The token to retrieve the next page of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results can be seen by sending another request
     * with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger
     * than 1000, only 1000 results are returned. You cannot specify this
     * parameter and the flow log IDs parameter in the same request.
     */
    private Integer maxResults;

    /**
     * One or more flow log IDs.
     *
     * @return One or more flow log IDs.
     */
    public java.util.List<String> getFlowLogIds() {
        if (flowLogIds == null) {
              flowLogIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              flowLogIds.setAutoConstruct(true);
        }
        return flowLogIds;
    }
    
    /**
     * One or more flow log IDs.
     *
     * @param flowLogIds One or more flow log IDs.
     */
    public void setFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> flowLogIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(flowLogIds.size());
        flowLogIdsCopy.addAll(flowLogIds);
        this.flowLogIds = flowLogIdsCopy;
    }
    
    /**
     * One or more flow log IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFlowLogIds(java.util.Collection)} or {@link
     * #withFlowLogIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param flowLogIds One or more flow log IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFlowLogsRequest withFlowLogIds(String... flowLogIds) {
        if (getFlowLogIds() == null) setFlowLogIds(new java.util.ArrayList<String>(flowLogIds.length));
        for (String value : flowLogIds) {
            getFlowLogIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more flow log IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param flowLogIds One or more flow log IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFlowLogsRequest withFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> flowLogIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(flowLogIds.size());
            flowLogIdsCopy.addAll(flowLogIds);
            this.flowLogIds = flowLogIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     * status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     * the flow log.</li> <li><p><code>log-group-name</code> - The name of
     * the log group.</li> <li><p><code>resource-id</code> - The ID of the
     * VPC, subnet, or network interface.</li>
     * <li><p><code>traffic-type</code> - The type of traffic
     * (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     * </ul>
     *
     * @return One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     *         status of the logs delivery (<code>SUCCESS</code> |
     *         <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     *         the flow log.</li> <li><p><code>log-group-name</code> - The name of
     *         the log group.</li> <li><p><code>resource-id</code> - The ID of the
     *         VPC, subnet, or network interface.</li>
     *         <li><p><code>traffic-type</code> - The type of traffic
     *         (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     *         </ul>
     */
    public java.util.List<Filter> getFilter() {
        if (filter == null) {
              filter = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filter.setAutoConstruct(true);
        }
        return filter;
    }
    
    /**
     * One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     * status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     * the flow log.</li> <li><p><code>log-group-name</code> - The name of
     * the log group.</li> <li><p><code>resource-id</code> - The ID of the
     * VPC, subnet, or network interface.</li>
     * <li><p><code>traffic-type</code> - The type of traffic
     * (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     * </ul>
     *
     * @param filter One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     *         status of the logs delivery (<code>SUCCESS</code> |
     *         <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     *         the flow log.</li> <li><p><code>log-group-name</code> - The name of
     *         the log group.</li> <li><p><code>resource-id</code> - The ID of the
     *         VPC, subnet, or network interface.</li>
     *         <li><p><code>traffic-type</code> - The type of traffic
     *         (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     *         </ul>
     */
    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filter.size());
        filterCopy.addAll(filter);
        this.filter = filterCopy;
    }
    
    /**
     * One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     * status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     * the flow log.</li> <li><p><code>log-group-name</code> - The name of
     * the log group.</li> <li><p><code>resource-id</code> - The ID of the
     * VPC, subnet, or network interface.</li>
     * <li><p><code>traffic-type</code> - The type of traffic
     * (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilter(java.util.Collection)} or {@link
     * #withFilter(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     *         status of the logs delivery (<code>SUCCESS</code> |
     *         <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     *         the flow log.</li> <li><p><code>log-group-name</code> - The name of
     *         the log group.</li> <li><p><code>resource-id</code> - The ID of the
     *         VPC, subnet, or network interface.</li>
     *         <li><p><code>traffic-type</code> - The type of traffic
     *         (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFlowLogsRequest withFilter(Filter... filter) {
        if (getFilter() == null) setFilter(new java.util.ArrayList<Filter>(filter.length));
        for (Filter value : filter) {
            getFilter().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     * status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     * the flow log.</li> <li><p><code>log-group-name</code> - The name of
     * the log group.</li> <li><p><code>resource-id</code> - The ID of the
     * VPC, subnet, or network interface.</li>
     * <li><p><code>traffic-type</code> - The type of traffic
     * (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter One or more filters. <ul> <li><p><code>deliver-log-status</code> - The
     *         status of the logs delivery (<code>SUCCESS</code> |
     *         <code>FAILED</code>).</li> <li><p><code>flow-log-id</code> - The ID of
     *         the flow log.</li> <li><p><code>log-group-name</code> - The name of
     *         the log group.</li> <li><p><code>resource-id</code> - The ID of the
     *         VPC, subnet, or network interface.</li>
     *         <li><p><code>traffic-type</code> - The type of traffic
     *         (<code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFlowLogsRequest withFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filter.size());
            filterCopy.addAll(filter);
            this.filter = filterCopy;
        }

        return this;
    }

    /**
     * The token to retrieve the next page of results.
     *
     * @return The token to retrieve the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     *
     * @param nextToken The token to retrieve the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to retrieve the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFlowLogsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results can be seen by sending another request
     * with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger
     * than 1000, only 1000 results are returned. You cannot specify this
     * parameter and the flow log IDs parameter in the same request.
     *
     * @return The maximum number of results to return for the request in a single
     *         page. The remaining results can be seen by sending another request
     *         with the returned <code>NextToken</code> value. This value can be
     *         between 5 and 1000; if <code>MaxResults</code> is given a value larger
     *         than 1000, only 1000 results are returned. You cannot specify this
     *         parameter and the flow log IDs parameter in the same request.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results can be seen by sending another request
     * with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger
     * than 1000, only 1000 results are returned. You cannot specify this
     * parameter and the flow log IDs parameter in the same request.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results can be seen by sending another request
     *         with the returned <code>NextToken</code> value. This value can be
     *         between 5 and 1000; if <code>MaxResults</code> is given a value larger
     *         than 1000, only 1000 results are returned. You cannot specify this
     *         parameter and the flow log IDs parameter in the same request.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results can be seen by sending another request
     * with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger
     * than 1000, only 1000 results are returned. You cannot specify this
     * parameter and the flow log IDs parameter in the same request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results can be seen by sending another request
     *         with the returned <code>NextToken</code> value. This value can be
     *         between 5 and 1000; if <code>MaxResults</code> is given a value larger
     *         than 1000, only 1000 results are returned. You cannot specify this
     *         parameter and the flow log IDs parameter in the same request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFlowLogsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFlowLogIds() != null) sb.append("FlowLogIds: " + getFlowLogIds() + ",");
        if (getFilter() != null) sb.append("Filter: " + getFilter() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFlowLogIds() == null) ? 0 : getFlowLogIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeFlowLogsRequest == false) return false;
        DescribeFlowLogsRequest other = (DescribeFlowLogsRequest)obj;
        
        if (other.getFlowLogIds() == null ^ this.getFlowLogIds() == null) return false;
        if (other.getFlowLogIds() != null && other.getFlowLogIds().equals(this.getFlowLogIds()) == false) return false; 
        if (other.getFilter() == null ^ this.getFilter() == null) return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeFlowLogsRequest clone() {
        
            return (DescribeFlowLogsRequest) super.clone();
    }

}
    