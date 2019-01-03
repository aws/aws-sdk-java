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
import com.amazonaws.services.ec2.model.transform.DescribeFleetsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeFleetsRequest> {

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
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
     * The ID of the EC2 Fleets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> fleetIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     * <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the target
     * capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     * <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> | <code>deleted-terminating</code> |
     * <code>modifying</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of request (<code>instant</code> | <code>request</code> | <code>maintain</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *        value is 1000. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *         value is 1000. To retrieve the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *        value is 1000. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsRequest withMaxResults(Integer maxResults) {
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

    public DescribeFleetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Fleets.
     * </p>
     * 
     * @return The ID of the EC2 Fleets.
     */

    public java.util.List<String> getFleetIds() {
        if (fleetIds == null) {
            fleetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return fleetIds;
    }

    /**
     * <p>
     * The ID of the EC2 Fleets.
     * </p>
     * 
     * @param fleetIds
     *        The ID of the EC2 Fleets.
     */

    public void setFleetIds(java.util.Collection<String> fleetIds) {
        if (fleetIds == null) {
            this.fleetIds = null;
            return;
        }

        this.fleetIds = new com.amazonaws.internal.SdkInternalList<String>(fleetIds);
    }

    /**
     * <p>
     * The ID of the EC2 Fleets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetIds(java.util.Collection)} or {@link #withFleetIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param fleetIds
     *        The ID of the EC2 Fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsRequest withFleetIds(String... fleetIds) {
        if (this.fleetIds == null) {
            setFleetIds(new com.amazonaws.internal.SdkInternalList<String>(fleetIds.length));
        }
        for (String ele : fleetIds) {
            this.fleetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Fleets.
     * </p>
     * 
     * @param fleetIds
     *        The ID of the EC2 Fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsRequest withFleetIds(java.util.Collection<String> fleetIds) {
        setFleetIds(fleetIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     * <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the target
     * capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     * <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> | <code>deleted-terminating</code> |
     * <code>modifying</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of request (<code>instant</code> | <code>request</code> | <code>maintain</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     *         <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the
     *         target capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     *         <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> |
     *         <code>deleted-terminating</code> | <code>modifying</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances
     *         (<code>true</code> | <code>false</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code> - The type of request (<code>instant</code> | <code>request</code> |
     *         <code>maintain</code>).
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
     * <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     * <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the target
     * capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     * <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> | <code>deleted-terminating</code> |
     * <code>modifying</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of request (<code>instant</code> | <code>request</code> | <code>maintain</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     *        <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the
     *        target capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     *        <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> |
     *        <code>deleted-terminating</code> | <code>modifying</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances
     *        (<code>true</code> | <code>false</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of request (<code>instant</code> | <code>request</code> |
     *        <code>maintain</code>).
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
     * <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     * <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the target
     * capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     * <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> | <code>deleted-terminating</code> |
     * <code>modifying</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of request (<code>instant</code> | <code>request</code> | <code>maintain</code>).
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
     *        <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     *        <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the
     *        target capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     *        <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> |
     *        <code>deleted-terminating</code> | <code>modifying</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances
     *        (<code>true</code> | <code>false</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of request (<code>instant</code> | <code>request</code> |
     *        <code>maintain</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsRequest withFilters(Filter... filters) {
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
     * <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     * <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the target
     * capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     * <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> | <code>deleted-terminating</code> |
     * <code>modifying</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances (
     * <code>true</code> | <code>false</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of request (<code>instant</code> | <code>request</code> | <code>maintain</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>activity-status</code> - The progress of the EC2 Fleet ( <code>error</code> |
     *        <code>pending-fulfillment</code> | <code>pending-termination</code> | <code>fulfilled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>excess-capacity-termination-policy</code> - Indicates whether to terminate running instances if the
     *        target capacity is decreased below the current EC2 Fleet size (<code>true</code> | <code>false</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleet-state</code> - The state of the EC2 Fleet (<code>submitted</code> | <code>active</code> |
     *        <code>deleted</code> | <code>failed</code> | <code>deleted-running</code> |
     *        <code>deleted-terminating</code> | <code>modifying</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>replace-unhealthy-instances</code> - Indicates whether EC2 Fleet should replace unhealthy instances
     *        (<code>true</code> | <code>false</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of request (<code>instant</code> | <code>request</code> |
     *        <code>maintain</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeFleetsRequest> getDryRunRequest() {
        Request<DescribeFleetsRequest> request = new DescribeFleetsRequestMarshaller().marshall(this);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFleetIds() != null)
            sb.append("FleetIds: ").append(getFleetIds()).append(",");
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

        if (obj instanceof DescribeFleetsRequest == false)
            return false;
        DescribeFleetsRequest other = (DescribeFleetsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFleetIds() == null ^ this.getFleetIds() == null)
            return false;
        if (other.getFleetIds() != null && other.getFleetIds().equals(this.getFleetIds()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFleetIds() == null) ? 0 : getFleetIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetsRequest clone() {
        return (DescribeFleetsRequest) super.clone();
    }
}
