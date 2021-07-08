/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOutposts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOutpostsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String nextToken;

    private Integer maxResults;
    /**
     * <p>
     * A filter for the lifecycle status of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     */
    private java.util.List<String> lifeCycleStatusFilter;
    /**
     * <p>
     * A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     */
    private java.util.List<String> availabilityZoneFilter;
    /**
     * <p>
     * A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     */
    private java.util.List<String> availabilityZoneIdFilter;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A filter for the lifecycle status of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @return A filter for the lifecycle status of the Outpost. </p>
     *         <p>
     *         Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *         an <code>OR</code>, and the request returns all results that match any of the specified values.
     */

    public java.util.List<String> getLifeCycleStatusFilter() {
        return lifeCycleStatusFilter;
    }

    /**
     * <p>
     * A filter for the lifecycle status of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @param lifeCycleStatusFilter
     *        A filter for the lifecycle status of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     */

    public void setLifeCycleStatusFilter(java.util.Collection<String> lifeCycleStatusFilter) {
        if (lifeCycleStatusFilter == null) {
            this.lifeCycleStatusFilter = null;
            return;
        }

        this.lifeCycleStatusFilter = new java.util.ArrayList<String>(lifeCycleStatusFilter);
    }

    /**
     * <p>
     * A filter for the lifecycle status of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifeCycleStatusFilter(java.util.Collection)} or
     * {@link #withLifeCycleStatusFilter(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lifeCycleStatusFilter
     *        A filter for the lifecycle status of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsRequest withLifeCycleStatusFilter(String... lifeCycleStatusFilter) {
        if (this.lifeCycleStatusFilter == null) {
            setLifeCycleStatusFilter(new java.util.ArrayList<String>(lifeCycleStatusFilter.length));
        }
        for (String ele : lifeCycleStatusFilter) {
            this.lifeCycleStatusFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A filter for the lifecycle status of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @param lifeCycleStatusFilter
     *        A filter for the lifecycle status of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsRequest withLifeCycleStatusFilter(java.util.Collection<String> lifeCycleStatusFilter) {
        setLifeCycleStatusFilter(lifeCycleStatusFilter);
        return this;
    }

    /**
     * <p>
     * A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @return A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost. </p>
     *         <p>
     *         Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *         an <code>OR</code>, and the request returns all results that match any of the specified values.
     */

    public java.util.List<String> getAvailabilityZoneFilter() {
        return availabilityZoneFilter;
    }

    /**
     * <p>
     * A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @param availabilityZoneFilter
     *        A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     */

    public void setAvailabilityZoneFilter(java.util.Collection<String> availabilityZoneFilter) {
        if (availabilityZoneFilter == null) {
            this.availabilityZoneFilter = null;
            return;
        }

        this.availabilityZoneFilter = new java.util.ArrayList<String>(availabilityZoneFilter);
    }

    /**
     * <p>
     * A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZoneFilter(java.util.Collection)} or
     * {@link #withAvailabilityZoneFilter(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param availabilityZoneFilter
     *        A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsRequest withAvailabilityZoneFilter(String... availabilityZoneFilter) {
        if (this.availabilityZoneFilter == null) {
            setAvailabilityZoneFilter(new java.util.ArrayList<String>(availabilityZoneFilter.length));
        }
        for (String ele : availabilityZoneFilter) {
            this.availabilityZoneFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @param availabilityZoneFilter
     *        A filter for the Availibility Zone (<code>us-east-1a</code>) of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsRequest withAvailabilityZoneFilter(java.util.Collection<String> availabilityZoneFilter) {
        setAvailabilityZoneFilter(availabilityZoneFilter);
        return this;
    }

    /**
     * <p>
     * A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @return A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost. </p>
     *         <p>
     *         Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *         an <code>OR</code>, and the request returns all results that match any of the specified values.
     */

    public java.util.List<String> getAvailabilityZoneIdFilter() {
        return availabilityZoneIdFilter;
    }

    /**
     * <p>
     * A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @param availabilityZoneIdFilter
     *        A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     */

    public void setAvailabilityZoneIdFilter(java.util.Collection<String> availabilityZoneIdFilter) {
        if (availabilityZoneIdFilter == null) {
            this.availabilityZoneIdFilter = null;
            return;
        }

        this.availabilityZoneIdFilter = new java.util.ArrayList<String>(availabilityZoneIdFilter);
    }

    /**
     * <p>
     * A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZoneIdFilter(java.util.Collection)} or
     * {@link #withAvailabilityZoneIdFilter(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param availabilityZoneIdFilter
     *        A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsRequest withAvailabilityZoneIdFilter(String... availabilityZoneIdFilter) {
        if (this.availabilityZoneIdFilter == null) {
            setAvailabilityZoneIdFilter(new java.util.ArrayList<String>(availabilityZoneIdFilter.length));
        }
        for (String ele : availabilityZoneIdFilter) {
            this.availabilityZoneIdFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost.
     * </p>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @param availabilityZoneIdFilter
     *        A filter for the AZ IDs (<code>use1-az1</code>) of the Outpost. </p>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsRequest withAvailabilityZoneIdFilter(java.util.Collection<String> availabilityZoneIdFilter) {
        setAvailabilityZoneIdFilter(availabilityZoneIdFilter);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getLifeCycleStatusFilter() != null)
            sb.append("LifeCycleStatusFilter: ").append(getLifeCycleStatusFilter()).append(",");
        if (getAvailabilityZoneFilter() != null)
            sb.append("AvailabilityZoneFilter: ").append(getAvailabilityZoneFilter()).append(",");
        if (getAvailabilityZoneIdFilter() != null)
            sb.append("AvailabilityZoneIdFilter: ").append(getAvailabilityZoneIdFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOutpostsRequest == false)
            return false;
        ListOutpostsRequest other = (ListOutpostsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getLifeCycleStatusFilter() == null ^ this.getLifeCycleStatusFilter() == null)
            return false;
        if (other.getLifeCycleStatusFilter() != null && other.getLifeCycleStatusFilter().equals(this.getLifeCycleStatusFilter()) == false)
            return false;
        if (other.getAvailabilityZoneFilter() == null ^ this.getAvailabilityZoneFilter() == null)
            return false;
        if (other.getAvailabilityZoneFilter() != null && other.getAvailabilityZoneFilter().equals(this.getAvailabilityZoneFilter()) == false)
            return false;
        if (other.getAvailabilityZoneIdFilter() == null ^ this.getAvailabilityZoneIdFilter() == null)
            return false;
        if (other.getAvailabilityZoneIdFilter() != null && other.getAvailabilityZoneIdFilter().equals(this.getAvailabilityZoneIdFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLifeCycleStatusFilter() == null) ? 0 : getLifeCycleStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneFilter() == null) ? 0 : getAvailabilityZoneFilter().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneIdFilter() == null) ? 0 : getAvailabilityZoneIdFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListOutpostsRequest clone() {
        return (ListOutpostsRequest) super.clone();
    }

}
