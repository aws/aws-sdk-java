/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeScheduledInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeScheduledInstances(DescribeScheduledInstancesRequest) DescribeScheduledInstances operation}.
 * <p>
 * Describes one or more of your Scheduled Instances.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeScheduledInstances(DescribeScheduledInstancesRequest)
 */
public class DescribeScheduledInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeScheduledInstancesRequest> {

    /**
     * One or more Scheduled Instance IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> scheduledInstanceIds;

    /**
     * The time period for the first schedule to start.
     */
    private SlotStartTimeRangeRequest slotStartTimeRange;

    /**
     * The token for the next set of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return in a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>NextToken</code> value.
     */
    private Integer maxResults;

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     * <p><code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     * platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     * </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more Scheduled Instance IDs.
     *
     * @return One or more Scheduled Instance IDs.
     */
    public java.util.List<String> getScheduledInstanceIds() {
        if (scheduledInstanceIds == null) {
              scheduledInstanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              scheduledInstanceIds.setAutoConstruct(true);
        }
        return scheduledInstanceIds;
    }
    
    /**
     * One or more Scheduled Instance IDs.
     *
     * @param scheduledInstanceIds One or more Scheduled Instance IDs.
     */
    public void setScheduledInstanceIds(java.util.Collection<String> scheduledInstanceIds) {
        if (scheduledInstanceIds == null) {
            this.scheduledInstanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> scheduledInstanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scheduledInstanceIds.size());
        scheduledInstanceIdsCopy.addAll(scheduledInstanceIds);
        this.scheduledInstanceIds = scheduledInstanceIdsCopy;
    }
    
    /**
     * One or more Scheduled Instance IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setScheduledInstanceIds(java.util.Collection)} or
     * {@link #withScheduledInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledInstanceIds One or more Scheduled Instance IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstancesRequest withScheduledInstanceIds(String... scheduledInstanceIds) {
        if (getScheduledInstanceIds() == null) setScheduledInstanceIds(new java.util.ArrayList<String>(scheduledInstanceIds.length));
        for (String value : scheduledInstanceIds) {
            getScheduledInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Scheduled Instance IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledInstanceIds One or more Scheduled Instance IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstancesRequest withScheduledInstanceIds(java.util.Collection<String> scheduledInstanceIds) {
        if (scheduledInstanceIds == null) {
            this.scheduledInstanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> scheduledInstanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scheduledInstanceIds.size());
            scheduledInstanceIdsCopy.addAll(scheduledInstanceIds);
            this.scheduledInstanceIds = scheduledInstanceIdsCopy;
        }

        return this;
    }

    /**
     * The time period for the first schedule to start.
     *
     * @return The time period for the first schedule to start.
     */
    public SlotStartTimeRangeRequest getSlotStartTimeRange() {
        return slotStartTimeRange;
    }
    
    /**
     * The time period for the first schedule to start.
     *
     * @param slotStartTimeRange The time period for the first schedule to start.
     */
    public void setSlotStartTimeRange(SlotStartTimeRangeRequest slotStartTimeRange) {
        this.slotStartTimeRange = slotStartTimeRange;
    }
    
    /**
     * The time period for the first schedule to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param slotStartTimeRange The time period for the first schedule to start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstancesRequest withSlotStartTimeRange(SlotStartTimeRangeRequest slotStartTimeRange) {
        this.slotStartTimeRange = slotStartTimeRange;
        return this;
    }

    /**
     * The token for the next set of results.
     *
     * @return The token for the next set of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of results.
     *
     * @param nextToken The token for the next set of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return in a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @return The maximum number of results to return in a single call. To retrieve
     *         the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @param maxResults The maximum number of results to return in a single call. To retrieve
     *         the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return in a single call. To retrieve
     *         the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     * <p><code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     * platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     * </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     *         <p><code>instance-type</code> - The instance type (for example,
     *         <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     *         The network platform (<code>EC2-Classic</code> or
     *         <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     *         platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     * <p><code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     * platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     * </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     *         <p><code>instance-type</code> - The instance type (for example,
     *         <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     *         The network platform (<code>EC2-Classic</code> or
     *         <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     *         platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     *         </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     * <p><code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     * platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     *         <p><code>instance-type</code> - The instance type (for example,
     *         <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     *         The network platform (<code>EC2-Classic</code> or
     *         <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     *         platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstancesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     * <p><code>instance-type</code> - The instance type (for example,
     * <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     * The network platform (<code>EC2-Classic</code> or
     * <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     * platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone (for example, <code>us-west-2a</code>). </li> <li>
     *         <p><code>instance-type</code> - The instance type (for example,
     *         <code>c4.large</code>). </li> <li> <p><code>network-platform</code> -
     *         The network platform (<code>EC2-Classic</code> or
     *         <code>EC2-VPC</code>). </li> <li> <p><code>platform</code> - The
     *         platform (<code>Linux/UNIX</code> or <code>Windows</code>). </li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeScheduledInstancesRequest> getDryRunRequest() {
        Request<DescribeScheduledInstancesRequest> request = new DescribeScheduledInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getScheduledInstanceIds() != null) sb.append("ScheduledInstanceIds: " + getScheduledInstanceIds() + ",");
        if (getSlotStartTimeRange() != null) sb.append("SlotStartTimeRange: " + getSlotStartTimeRange() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getScheduledInstanceIds() == null) ? 0 : getScheduledInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getSlotStartTimeRange() == null) ? 0 : getSlotStartTimeRange().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeScheduledInstancesRequest == false) return false;
        DescribeScheduledInstancesRequest other = (DescribeScheduledInstancesRequest)obj;
        
        if (other.getScheduledInstanceIds() == null ^ this.getScheduledInstanceIds() == null) return false;
        if (other.getScheduledInstanceIds() != null && other.getScheduledInstanceIds().equals(this.getScheduledInstanceIds()) == false) return false; 
        if (other.getSlotStartTimeRange() == null ^ this.getSlotStartTimeRange() == null) return false;
        if (other.getSlotStartTimeRange() != null && other.getSlotStartTimeRange().equals(this.getSlotStartTimeRange()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeScheduledInstancesRequest clone() {
        
            return (DescribeScheduledInstancesRequest) super.clone();
    }

}
    