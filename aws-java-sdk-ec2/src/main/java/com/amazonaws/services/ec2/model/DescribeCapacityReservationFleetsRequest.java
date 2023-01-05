/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeCapacityReservationFleetsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityReservationFleetsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeCapacityReservationFleetsRequest> {

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to describe.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capacityReservationFleetIds;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     * <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     * <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only <code>open</code> is
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only <code>prioritized</code> is
     * supported.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to describe.
     * </p>
     * 
     * @return The IDs of the Capacity Reservation Fleets to describe.
     */

    public java.util.List<String> getCapacityReservationFleetIds() {
        if (capacityReservationFleetIds == null) {
            capacityReservationFleetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capacityReservationFleetIds;
    }

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to describe.
     * </p>
     * 
     * @param capacityReservationFleetIds
     *        The IDs of the Capacity Reservation Fleets to describe.
     */

    public void setCapacityReservationFleetIds(java.util.Collection<String> capacityReservationFleetIds) {
        if (capacityReservationFleetIds == null) {
            this.capacityReservationFleetIds = null;
            return;
        }

        this.capacityReservationFleetIds = new com.amazonaws.internal.SdkInternalList<String>(capacityReservationFleetIds);
    }

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityReservationFleetIds(java.util.Collection)} or
     * {@link #withCapacityReservationFleetIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityReservationFleetIds
     *        The IDs of the Capacity Reservation Fleets to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationFleetsRequest withCapacityReservationFleetIds(String... capacityReservationFleetIds) {
        if (this.capacityReservationFleetIds == null) {
            setCapacityReservationFleetIds(new com.amazonaws.internal.SdkInternalList<String>(capacityReservationFleetIds.length));
        }
        for (String ele : capacityReservationFleetIds) {
            this.capacityReservationFleetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to describe.
     * </p>
     * 
     * @param capacityReservationFleetIds
     *        The IDs of the Capacity Reservation Fleets to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationFleetsRequest withCapacityReservationFleetIds(java.util.Collection<String> capacityReservationFleetIds) {
        setCapacityReservationFleetIds(capacityReservationFleetIds);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationFleetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *         5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationFleetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     * <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     * <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only <code>open</code> is
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only <code>prioritized</code> is
     * supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     *         <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     *         <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only
     *         <code>open</code> is supported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only
     *         <code>prioritized</code> is supported.
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
     * <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     * <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     * <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only <code>open</code> is
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only <code>prioritized</code> is
     * supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     *        <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     *        <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only
     *        <code>open</code> is supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only
     *        <code>prioritized</code> is supported.
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
     * <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     * <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     * <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only <code>open</code> is
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only <code>prioritized</code> is
     * supported.
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
     *        <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     *        <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     *        <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only
     *        <code>open</code> is supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only
     *        <code>prioritized</code> is supported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationFleetsRequest withFilters(Filter... filters) {
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
     * <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     * <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     * <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only <code>open</code> is
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only <code>prioritized</code> is
     * supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Fleet (<code>submitted</code> | <code>modifying</code> |
     *        <code>active</code> | <code>partially_fulfilled</code> | <code>expiring</code> | <code>expired</code> |
     *        <code>cancelling</code> | <code>cancelled</code> | <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-match-criteria</code> - The instance matching criteria for the Fleet. Only
     *        <code>open</code> is supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - The tenancy of the Fleet (<code>default</code> | <code>dedicated</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allocation-strategy</code> - The allocation strategy used by the Fleet. Only
     *        <code>prioritized</code> is supported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationFleetsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeCapacityReservationFleetsRequest> getDryRunRequest() {
        Request<DescribeCapacityReservationFleetsRequest> request = new DescribeCapacityReservationFleetsRequestMarshaller().marshall(this);
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
        if (getCapacityReservationFleetIds() != null)
            sb.append("CapacityReservationFleetIds: ").append(getCapacityReservationFleetIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCapacityReservationFleetsRequest == false)
            return false;
        DescribeCapacityReservationFleetsRequest other = (DescribeCapacityReservationFleetsRequest) obj;
        if (other.getCapacityReservationFleetIds() == null ^ this.getCapacityReservationFleetIds() == null)
            return false;
        if (other.getCapacityReservationFleetIds() != null && other.getCapacityReservationFleetIds().equals(this.getCapacityReservationFleetIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationFleetIds() == null) ? 0 : getCapacityReservationFleetIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCapacityReservationFleetsRequest clone() {
        return (DescribeCapacityReservationFleetsRequest) super.clone();
    }
}
