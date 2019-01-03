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
import com.amazonaws.services.ec2.model.transform.DescribeReservedInstancesListingsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeReservedInstancesListings.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesListingsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeReservedInstancesListingsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> | <code>active</code> |
     * <code>cancelled</code> | <code>closed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     */
    private String reservedInstancesId;
    /**
     * <p>
     * One or more Reserved Instance listing IDs.
     * </p>
     */
    private String reservedInstancesListingId;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> | <code>active</code> |
     * <code>cancelled</code> | <code>closed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> |
     *         <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-message</code> - The reason for the status.
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
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> | <code>active</code> |
     * <code>cancelled</code> | <code>closed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> |
     *        <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The reason for the status.
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
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> | <code>active</code> |
     * <code>cancelled</code> | <code>closed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
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
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> |
     *        <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The reason for the status.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesListingsRequest withFilters(Filter... filters) {
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
     * <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> | <code>active</code> |
     * <code>cancelled</code> | <code>closed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The reason for the status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>reserved-instances-id</code> - The ID of the Reserved Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reserved-instances-listing-id</code> - The ID of the Reserved Instances listing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the Reserved Instance listing (<code>pending</code> |
     *        <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The reason for the status.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesListingsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * 
     * @param reservedInstancesId
     *        One or more Reserved Instance IDs.
     */

    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * 
     * @return One or more Reserved Instance IDs.
     */

    public String getReservedInstancesId() {
        return this.reservedInstancesId;
    }

    /**
     * <p>
     * One or more Reserved Instance IDs.
     * </p>
     * 
     * @param reservedInstancesId
     *        One or more Reserved Instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesListingsRequest withReservedInstancesId(String reservedInstancesId) {
        setReservedInstancesId(reservedInstancesId);
        return this;
    }

    /**
     * <p>
     * One or more Reserved Instance listing IDs.
     * </p>
     * 
     * @param reservedInstancesListingId
     *        One or more Reserved Instance listing IDs.
     */

    public void setReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
    }

    /**
     * <p>
     * One or more Reserved Instance listing IDs.
     * </p>
     * 
     * @return One or more Reserved Instance listing IDs.
     */

    public String getReservedInstancesListingId() {
        return this.reservedInstancesListingId;
    }

    /**
     * <p>
     * One or more Reserved Instance listing IDs.
     * </p>
     * 
     * @param reservedInstancesListingId
     *        One or more Reserved Instance listing IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesListingsRequest withReservedInstancesListingId(String reservedInstancesListingId) {
        setReservedInstancesListingId(reservedInstancesListingId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeReservedInstancesListingsRequest> getDryRunRequest() {
        Request<DescribeReservedInstancesListingsRequest> request = new DescribeReservedInstancesListingsRequestMarshaller().marshall(this);
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
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: ").append(getReservedInstancesId()).append(",");
        if (getReservedInstancesListingId() != null)
            sb.append("ReservedInstancesListingId: ").append(getReservedInstancesListingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesListingsRequest == false)
            return false;
        DescribeReservedInstancesListingsRequest other = (DescribeReservedInstancesListingsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        if (other.getReservedInstancesListingId() == null ^ this.getReservedInstancesListingId() == null)
            return false;
        if (other.getReservedInstancesListingId() != null && other.getReservedInstancesListingId().equals(this.getReservedInstancesListingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesListingId() == null) ? 0 : getReservedInstancesListingId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesListingsRequest clone() {
        return (DescribeReservedInstancesListingsRequest) super.clone();
    }
}
