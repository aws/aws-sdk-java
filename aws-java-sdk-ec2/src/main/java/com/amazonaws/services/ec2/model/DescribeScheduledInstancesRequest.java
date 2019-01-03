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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeScheduledInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeScheduledInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeScheduledInstancesRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value
     * is 100. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * One or more Scheduled Instance IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scheduledInstanceIds;
    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     */
    private SlotStartTimeRangeRequest slotStartTimeRange;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstancesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone (for example, <code>us-west-2a</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type (for example, <code>c4.large</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-platform</code> - The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value
     * is 100. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. This value can be between 5 and 300. The default
     *        value is 100. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value
     * is 100. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. This value can be between 5 and 300. The
     *         default value is 100. To retrieve the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value
     * is 100. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. This value can be between 5 and 300. The default
     *        value is 100. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * One or more Scheduled Instance IDs.
     * </p>
     * 
     * @return One or more Scheduled Instance IDs.
     */

    public java.util.List<String> getScheduledInstanceIds() {
        if (scheduledInstanceIds == null) {
            scheduledInstanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scheduledInstanceIds;
    }

    /**
     * <p>
     * One or more Scheduled Instance IDs.
     * </p>
     * 
     * @param scheduledInstanceIds
     *        One or more Scheduled Instance IDs.
     */

    public void setScheduledInstanceIds(java.util.Collection<String> scheduledInstanceIds) {
        if (scheduledInstanceIds == null) {
            this.scheduledInstanceIds = null;
            return;
        }

        this.scheduledInstanceIds = new com.amazonaws.internal.SdkInternalList<String>(scheduledInstanceIds);
    }

    /**
     * <p>
     * One or more Scheduled Instance IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledInstanceIds(java.util.Collection)} or {@link #withScheduledInstanceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scheduledInstanceIds
     *        One or more Scheduled Instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstancesRequest withScheduledInstanceIds(String... scheduledInstanceIds) {
        if (this.scheduledInstanceIds == null) {
            setScheduledInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(scheduledInstanceIds.length));
        }
        for (String ele : scheduledInstanceIds) {
            this.scheduledInstanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Scheduled Instance IDs.
     * </p>
     * 
     * @param scheduledInstanceIds
     *        One or more Scheduled Instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstancesRequest withScheduledInstanceIds(java.util.Collection<String> scheduledInstanceIds) {
        setScheduledInstanceIds(scheduledInstanceIds);
        return this;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @param slotStartTimeRange
     *        The time period for the first schedule to start.
     */

    public void setSlotStartTimeRange(SlotStartTimeRangeRequest slotStartTimeRange) {
        this.slotStartTimeRange = slotStartTimeRange;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @return The time period for the first schedule to start.
     */

    public SlotStartTimeRangeRequest getSlotStartTimeRange() {
        return this.slotStartTimeRange;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @param slotStartTimeRange
     *        The time period for the first schedule to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstancesRequest withSlotStartTimeRange(SlotStartTimeRangeRequest slotStartTimeRange) {
        setSlotStartTimeRange(slotStartTimeRange);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeScheduledInstancesRequest> getDryRunRequest() {
        Request<DescribeScheduledInstancesRequest> request = new DescribeScheduledInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScheduledInstanceIds() != null)
            sb.append("ScheduledInstanceIds: ").append(getScheduledInstanceIds()).append(",");
        if (getSlotStartTimeRange() != null)
            sb.append("SlotStartTimeRange: ").append(getSlotStartTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledInstancesRequest == false)
            return false;
        DescribeScheduledInstancesRequest other = (DescribeScheduledInstancesRequest) obj;
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
        if (other.getScheduledInstanceIds() == null ^ this.getScheduledInstanceIds() == null)
            return false;
        if (other.getScheduledInstanceIds() != null && other.getScheduledInstanceIds().equals(this.getScheduledInstanceIds()) == false)
            return false;
        if (other.getSlotStartTimeRange() == null ^ this.getSlotStartTimeRange() == null)
            return false;
        if (other.getSlotStartTimeRange() != null && other.getSlotStartTimeRange().equals(this.getSlotStartTimeRange()) == false)
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
        hashCode = prime * hashCode + ((getScheduledInstanceIds() == null) ? 0 : getScheduledInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getSlotStartTimeRange() == null) ? 0 : getSlotStartTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledInstancesRequest clone() {
        return (DescribeScheduledInstancesRequest) super.clone();
    }
}
