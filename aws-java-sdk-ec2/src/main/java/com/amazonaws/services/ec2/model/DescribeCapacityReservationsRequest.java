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
import com.amazonaws.services.ec2.model.transform.DescribeCapacityReservationsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityReservationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeCapacityReservationsRequest> {

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capacityReservationIds;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned nextToken value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * One or more filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @return The ID of the Capacity Reservation.
     */

    public java.util.List<String> getCapacityReservationIds() {
        if (capacityReservationIds == null) {
            capacityReservationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capacityReservationIds;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationIds
     *        The ID of the Capacity Reservation.
     */

    public void setCapacityReservationIds(java.util.Collection<String> capacityReservationIds) {
        if (capacityReservationIds == null) {
            this.capacityReservationIds = null;
            return;
        }

        this.capacityReservationIds = new com.amazonaws.internal.SdkInternalList<String>(capacityReservationIds);
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityReservationIds(java.util.Collection)} or
     * {@link #withCapacityReservationIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityReservationIds
     *        The ID of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withCapacityReservationIds(String... capacityReservationIds) {
        if (this.capacityReservationIds == null) {
            setCapacityReservationIds(new com.amazonaws.internal.SdkInternalList<String>(capacityReservationIds.length));
        }
        for (String ele : capacityReservationIds) {
            this.capacityReservationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationIds
     *        The ID of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withCapacityReservationIds(java.util.Collection<String> capacityReservationIds) {
        setCapacityReservationIds(capacityReservationIds);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned nextToken value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned nextToken value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned nextToken value.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the returned nextToken value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned nextToken value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned nextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * 
     * @return One or more filters.
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
     * 
     * @param filters
     *        One or more filters.
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
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withFilters(Filter... filters) {
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
     * 
     * @param filters
     *        One or more filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeCapacityReservationsRequest> getDryRunRequest() {
        Request<DescribeCapacityReservationsRequest> request = new DescribeCapacityReservationsRequestMarshaller().marshall(this);
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
        if (getCapacityReservationIds() != null)
            sb.append("CapacityReservationIds: ").append(getCapacityReservationIds()).append(",");
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

        if (obj instanceof DescribeCapacityReservationsRequest == false)
            return false;
        DescribeCapacityReservationsRequest other = (DescribeCapacityReservationsRequest) obj;
        if (other.getCapacityReservationIds() == null ^ this.getCapacityReservationIds() == null)
            return false;
        if (other.getCapacityReservationIds() != null && other.getCapacityReservationIds().equals(this.getCapacityReservationIds()) == false)
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

        hashCode = prime * hashCode + ((getCapacityReservationIds() == null) ? 0 : getCapacityReservationIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCapacityReservationsRequest clone() {
        return (DescribeCapacityReservationsRequest) super.clone();
    }
}
