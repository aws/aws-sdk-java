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
import com.amazonaws.services.ec2.model.transform.DescribeScheduledInstanceAvailabilityRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeScheduledInstanceAvailability(DescribeScheduledInstanceAvailabilityRequest) DescribeScheduledInstanceAvailability operation}.
 * <p>
 * Finds available schedules that meet the specified criteria.
 * </p>
 * <p>
 * You can search for an available schedule no more than 3 months in
 * advance. You must meet the minimum required duration of 1,200 hours
 * per year. For example, the minimum daily schedule is 4 hours, the
 * minimum weekly schedule is 24 hours, and the minimum monthly schedule
 * is 100 hours.
 * </p>
 * <p>
 * After you find a schedule that meets your needs, call
 * PurchaseScheduledInstances to purchase Scheduled Instances with that
 * schedule.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeScheduledInstanceAvailability(DescribeScheduledInstanceAvailabilityRequest)
 */
public class DescribeScheduledInstanceAvailabilityRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeScheduledInstanceAvailabilityRequest> {

    /**
     * The schedule recurrence.
     */
    private ScheduledInstanceRecurrenceRequest recurrence;

    /**
     * The time period for the first schedule to start.
     */
    private SlotDateTimeRangeRequest firstSlotStartTimeRange;

    /**
     * The minimum available duration, in hours. The minimum required
     * duration is 1,200 hours per year. For example, the minimum daily
     * schedule is 4 hours, the minimum weekly schedule is 24 hours, and the
     * minimum monthly schedule is 100 hours.
     */
    private Integer minSlotDurationInHours;

    /**
     * The maximum available duration, in hours. This value must be greater
     * than <code>MinSlotDurationInHours</code> and less than 1,720.
     */
    private Integer maxSlotDurationInHours;

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
     * The schedule recurrence.
     *
     * @return The schedule recurrence.
     */
    public ScheduledInstanceRecurrenceRequest getRecurrence() {
        return recurrence;
    }
    
    /**
     * The schedule recurrence.
     *
     * @param recurrence The schedule recurrence.
     */
    public void setRecurrence(ScheduledInstanceRecurrenceRequest recurrence) {
        this.recurrence = recurrence;
    }
    
    /**
     * The schedule recurrence.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurrence The schedule recurrence.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withRecurrence(ScheduledInstanceRecurrenceRequest recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * The time period for the first schedule to start.
     *
     * @return The time period for the first schedule to start.
     */
    public SlotDateTimeRangeRequest getFirstSlotStartTimeRange() {
        return firstSlotStartTimeRange;
    }
    
    /**
     * The time period for the first schedule to start.
     *
     * @param firstSlotStartTimeRange The time period for the first schedule to start.
     */
    public void setFirstSlotStartTimeRange(SlotDateTimeRangeRequest firstSlotStartTimeRange) {
        this.firstSlotStartTimeRange = firstSlotStartTimeRange;
    }
    
    /**
     * The time period for the first schedule to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param firstSlotStartTimeRange The time period for the first schedule to start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withFirstSlotStartTimeRange(SlotDateTimeRangeRequest firstSlotStartTimeRange) {
        this.firstSlotStartTimeRange = firstSlotStartTimeRange;
        return this;
    }

    /**
     * The minimum available duration, in hours. The minimum required
     * duration is 1,200 hours per year. For example, the minimum daily
     * schedule is 4 hours, the minimum weekly schedule is 24 hours, and the
     * minimum monthly schedule is 100 hours.
     *
     * @return The minimum available duration, in hours. The minimum required
     *         duration is 1,200 hours per year. For example, the minimum daily
     *         schedule is 4 hours, the minimum weekly schedule is 24 hours, and the
     *         minimum monthly schedule is 100 hours.
     */
    public Integer getMinSlotDurationInHours() {
        return minSlotDurationInHours;
    }
    
    /**
     * The minimum available duration, in hours. The minimum required
     * duration is 1,200 hours per year. For example, the minimum daily
     * schedule is 4 hours, the minimum weekly schedule is 24 hours, and the
     * minimum monthly schedule is 100 hours.
     *
     * @param minSlotDurationInHours The minimum available duration, in hours. The minimum required
     *         duration is 1,200 hours per year. For example, the minimum daily
     *         schedule is 4 hours, the minimum weekly schedule is 24 hours, and the
     *         minimum monthly schedule is 100 hours.
     */
    public void setMinSlotDurationInHours(Integer minSlotDurationInHours) {
        this.minSlotDurationInHours = minSlotDurationInHours;
    }
    
    /**
     * The minimum available duration, in hours. The minimum required
     * duration is 1,200 hours per year. For example, the minimum daily
     * schedule is 4 hours, the minimum weekly schedule is 24 hours, and the
     * minimum monthly schedule is 100 hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minSlotDurationInHours The minimum available duration, in hours. The minimum required
     *         duration is 1,200 hours per year. For example, the minimum daily
     *         schedule is 4 hours, the minimum weekly schedule is 24 hours, and the
     *         minimum monthly schedule is 100 hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withMinSlotDurationInHours(Integer minSlotDurationInHours) {
        this.minSlotDurationInHours = minSlotDurationInHours;
        return this;
    }

    /**
     * The maximum available duration, in hours. This value must be greater
     * than <code>MinSlotDurationInHours</code> and less than 1,720.
     *
     * @return The maximum available duration, in hours. This value must be greater
     *         than <code>MinSlotDurationInHours</code> and less than 1,720.
     */
    public Integer getMaxSlotDurationInHours() {
        return maxSlotDurationInHours;
    }
    
    /**
     * The maximum available duration, in hours. This value must be greater
     * than <code>MinSlotDurationInHours</code> and less than 1,720.
     *
     * @param maxSlotDurationInHours The maximum available duration, in hours. This value must be greater
     *         than <code>MinSlotDurationInHours</code> and less than 1,720.
     */
    public void setMaxSlotDurationInHours(Integer maxSlotDurationInHours) {
        this.maxSlotDurationInHours = maxSlotDurationInHours;
    }
    
    /**
     * The maximum available duration, in hours. This value must be greater
     * than <code>MinSlotDurationInHours</code> and less than 1,720.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxSlotDurationInHours The maximum available duration, in hours. This value must be greater
     *         than <code>MinSlotDurationInHours</code> and less than 1,720.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstanceAvailabilityRequest withMaxSlotDurationInHours(Integer maxSlotDurationInHours) {
        this.maxSlotDurationInHours = maxSlotDurationInHours;
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
    public DescribeScheduledInstanceAvailabilityRequest withNextToken(String nextToken) {
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
    public DescribeScheduledInstanceAvailabilityRequest withMaxResults(Integer maxResults) {
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
    public DescribeScheduledInstanceAvailabilityRequest withFilters(Filter... filters) {
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
    public DescribeScheduledInstanceAvailabilityRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeScheduledInstanceAvailabilityRequest> getDryRunRequest() {
        Request<DescribeScheduledInstanceAvailabilityRequest> request = new DescribeScheduledInstanceAvailabilityRequestMarshaller().marshall(this);
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
        if (getRecurrence() != null) sb.append("Recurrence: " + getRecurrence() + ",");
        if (getFirstSlotStartTimeRange() != null) sb.append("FirstSlotStartTimeRange: " + getFirstSlotStartTimeRange() + ",");
        if (getMinSlotDurationInHours() != null) sb.append("MinSlotDurationInHours: " + getMinSlotDurationInHours() + ",");
        if (getMaxSlotDurationInHours() != null) sb.append("MaxSlotDurationInHours: " + getMaxSlotDurationInHours() + ",");
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
        
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode()); 
        hashCode = prime * hashCode + ((getFirstSlotStartTimeRange() == null) ? 0 : getFirstSlotStartTimeRange().hashCode()); 
        hashCode = prime * hashCode + ((getMinSlotDurationInHours() == null) ? 0 : getMinSlotDurationInHours().hashCode()); 
        hashCode = prime * hashCode + ((getMaxSlotDurationInHours() == null) ? 0 : getMaxSlotDurationInHours().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeScheduledInstanceAvailabilityRequest == false) return false;
        DescribeScheduledInstanceAvailabilityRequest other = (DescribeScheduledInstanceAvailabilityRequest)obj;
        
        if (other.getRecurrence() == null ^ this.getRecurrence() == null) return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false) return false; 
        if (other.getFirstSlotStartTimeRange() == null ^ this.getFirstSlotStartTimeRange() == null) return false;
        if (other.getFirstSlotStartTimeRange() != null && other.getFirstSlotStartTimeRange().equals(this.getFirstSlotStartTimeRange()) == false) return false; 
        if (other.getMinSlotDurationInHours() == null ^ this.getMinSlotDurationInHours() == null) return false;
        if (other.getMinSlotDurationInHours() != null && other.getMinSlotDurationInHours().equals(this.getMinSlotDurationInHours()) == false) return false; 
        if (other.getMaxSlotDurationInHours() == null ^ this.getMaxSlotDurationInHours() == null) return false;
        if (other.getMaxSlotDurationInHours() != null && other.getMaxSlotDurationInHours().equals(this.getMaxSlotDurationInHours()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeScheduledInstanceAvailabilityRequest clone() {
        
            return (DescribeScheduledInstanceAvailabilityRequest) super.clone();
    }

}
    