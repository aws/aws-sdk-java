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
import com.amazonaws.services.ec2.model.transform.DescribeScheduledInstanceAvailabilityRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeScheduledInstanceAvailability.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledInstanceAvailabilityRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeScheduledInstanceAvailabilityRequest> {

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
     * The time period for the first schedule to start.
     * </p>
     */
    private SlotDateTimeRangeRequest firstSlotStartTimeRange;
    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value
     * is 300. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The maximum available duration, in hours. This value must be greater than <code>MinSlotDurationInHours</code> and
     * less than 1,720.
     * </p>
     */
    private Integer maxSlotDurationInHours;
    /**
     * <p>
     * The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For example, the
     * minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is
     * 100 hours.
     * </p>
     */
    private Integer minSlotDurationInHours;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The schedule recurrence.
     * </p>
     */
    private ScheduledInstanceRecurrenceRequest recurrence;

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

    public DescribeScheduledInstanceAvailabilityRequest withFilters(Filter... filters) {
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

    public DescribeScheduledInstanceAvailabilityRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @param firstSlotStartTimeRange
     *        The time period for the first schedule to start.
     */

    public void setFirstSlotStartTimeRange(SlotDateTimeRangeRequest firstSlotStartTimeRange) {
        this.firstSlotStartTimeRange = firstSlotStartTimeRange;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @return The time period for the first schedule to start.
     */

    public SlotDateTimeRangeRequest getFirstSlotStartTimeRange() {
        return this.firstSlotStartTimeRange;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * 
     * @param firstSlotStartTimeRange
     *        The time period for the first schedule to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstanceAvailabilityRequest withFirstSlotStartTimeRange(SlotDateTimeRangeRequest firstSlotStartTimeRange) {
        setFirstSlotStartTimeRange(firstSlotStartTimeRange);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value
     * is 300. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. This value can be between 5 and 300. The default
     *        value is 300. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value
     * is 300. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. This value can be between 5 and 300. The
     *         default value is 300. To retrieve the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value
     * is 300. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. This value can be between 5 and 300. The default
     *        value is 300. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstanceAvailabilityRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The maximum available duration, in hours. This value must be greater than <code>MinSlotDurationInHours</code> and
     * less than 1,720.
     * </p>
     * 
     * @param maxSlotDurationInHours
     *        The maximum available duration, in hours. This value must be greater than
     *        <code>MinSlotDurationInHours</code> and less than 1,720.
     */

    public void setMaxSlotDurationInHours(Integer maxSlotDurationInHours) {
        this.maxSlotDurationInHours = maxSlotDurationInHours;
    }

    /**
     * <p>
     * The maximum available duration, in hours. This value must be greater than <code>MinSlotDurationInHours</code> and
     * less than 1,720.
     * </p>
     * 
     * @return The maximum available duration, in hours. This value must be greater than
     *         <code>MinSlotDurationInHours</code> and less than 1,720.
     */

    public Integer getMaxSlotDurationInHours() {
        return this.maxSlotDurationInHours;
    }

    /**
     * <p>
     * The maximum available duration, in hours. This value must be greater than <code>MinSlotDurationInHours</code> and
     * less than 1,720.
     * </p>
     * 
     * @param maxSlotDurationInHours
     *        The maximum available duration, in hours. This value must be greater than
     *        <code>MinSlotDurationInHours</code> and less than 1,720.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstanceAvailabilityRequest withMaxSlotDurationInHours(Integer maxSlotDurationInHours) {
        setMaxSlotDurationInHours(maxSlotDurationInHours);
        return this;
    }

    /**
     * <p>
     * The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For example, the
     * minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is
     * 100 hours.
     * </p>
     * 
     * @param minSlotDurationInHours
     *        The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For
     *        example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum
     *        monthly schedule is 100 hours.
     */

    public void setMinSlotDurationInHours(Integer minSlotDurationInHours) {
        this.minSlotDurationInHours = minSlotDurationInHours;
    }

    /**
     * <p>
     * The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For example, the
     * minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is
     * 100 hours.
     * </p>
     * 
     * @return The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For
     *         example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum
     *         monthly schedule is 100 hours.
     */

    public Integer getMinSlotDurationInHours() {
        return this.minSlotDurationInHours;
    }

    /**
     * <p>
     * The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For example, the
     * minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is
     * 100 hours.
     * </p>
     * 
     * @param minSlotDurationInHours
     *        The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For
     *        example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum
     *        monthly schedule is 100 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstanceAvailabilityRequest withMinSlotDurationInHours(Integer minSlotDurationInHours) {
        setMinSlotDurationInHours(minSlotDurationInHours);
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

    public DescribeScheduledInstanceAvailabilityRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     * 
     * @param recurrence
     *        The schedule recurrence.
     */

    public void setRecurrence(ScheduledInstanceRecurrenceRequest recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     * 
     * @return The schedule recurrence.
     */

    public ScheduledInstanceRecurrenceRequest getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     * 
     * @param recurrence
     *        The schedule recurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstanceAvailabilityRequest withRecurrence(ScheduledInstanceRecurrenceRequest recurrence) {
        setRecurrence(recurrence);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeScheduledInstanceAvailabilityRequest> getDryRunRequest() {
        Request<DescribeScheduledInstanceAvailabilityRequest> request = new DescribeScheduledInstanceAvailabilityRequestMarshaller().marshall(this);
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
        if (getFirstSlotStartTimeRange() != null)
            sb.append("FirstSlotStartTimeRange: ").append(getFirstSlotStartTimeRange()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getMaxSlotDurationInHours() != null)
            sb.append("MaxSlotDurationInHours: ").append(getMaxSlotDurationInHours()).append(",");
        if (getMinSlotDurationInHours() != null)
            sb.append("MinSlotDurationInHours: ").append(getMinSlotDurationInHours()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledInstanceAvailabilityRequest == false)
            return false;
        DescribeScheduledInstanceAvailabilityRequest other = (DescribeScheduledInstanceAvailabilityRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getFirstSlotStartTimeRange() == null ^ this.getFirstSlotStartTimeRange() == null)
            return false;
        if (other.getFirstSlotStartTimeRange() != null && other.getFirstSlotStartTimeRange().equals(this.getFirstSlotStartTimeRange()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMaxSlotDurationInHours() == null ^ this.getMaxSlotDurationInHours() == null)
            return false;
        if (other.getMaxSlotDurationInHours() != null && other.getMaxSlotDurationInHours().equals(this.getMaxSlotDurationInHours()) == false)
            return false;
        if (other.getMinSlotDurationInHours() == null ^ this.getMinSlotDurationInHours() == null)
            return false;
        if (other.getMinSlotDurationInHours() != null && other.getMinSlotDurationInHours().equals(this.getMinSlotDurationInHours()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getFirstSlotStartTimeRange() == null) ? 0 : getFirstSlotStartTimeRange().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getMaxSlotDurationInHours() == null) ? 0 : getMaxSlotDurationInHours().hashCode());
        hashCode = prime * hashCode + ((getMinSlotDurationInHours() == null) ? 0 : getMinSlotDurationInHours().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledInstanceAvailabilityRequest clone() {
        return (DescribeScheduledInstanceAvailabilityRequest) super.clone();
    }
}
