/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListCapacityTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCapacityTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the results by an Outpost ID or an Outpost ARN.
     * </p>
     */
    private String outpostIdentifierFilter;

    private Integer maxResults;

    private String nextToken;
    /**
     * <p>
     * A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * </p>
     */
    private java.util.List<String> capacityTaskStatusFilter;

    /**
     * <p>
     * Filters the results by an Outpost ID or an Outpost ARN.
     * </p>
     * 
     * @param outpostIdentifierFilter
     *        Filters the results by an Outpost ID or an Outpost ARN.
     */

    public void setOutpostIdentifierFilter(String outpostIdentifierFilter) {
        this.outpostIdentifierFilter = outpostIdentifierFilter;
    }

    /**
     * <p>
     * Filters the results by an Outpost ID or an Outpost ARN.
     * </p>
     * 
     * @return Filters the results by an Outpost ID or an Outpost ARN.
     */

    public String getOutpostIdentifierFilter() {
        return this.outpostIdentifierFilter;
    }

    /**
     * <p>
     * Filters the results by an Outpost ID or an Outpost ARN.
     * </p>
     * 
     * @param outpostIdentifierFilter
     *        Filters the results by an Outpost ID or an Outpost ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCapacityTasksRequest withOutpostIdentifierFilter(String outpostIdentifierFilter) {
        setOutpostIdentifierFilter(outpostIdentifierFilter);
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

    public ListCapacityTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

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

    public ListCapacityTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * </p>
     * 
     * @return A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * @see CapacityTaskStatus
     */

    public java.util.List<String> getCapacityTaskStatusFilter() {
        return capacityTaskStatusFilter;
    }

    /**
     * <p>
     * A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * </p>
     * 
     * @param capacityTaskStatusFilter
     *        A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * @see CapacityTaskStatus
     */

    public void setCapacityTaskStatusFilter(java.util.Collection<String> capacityTaskStatusFilter) {
        if (capacityTaskStatusFilter == null) {
            this.capacityTaskStatusFilter = null;
            return;
        }

        this.capacityTaskStatusFilter = new java.util.ArrayList<String>(capacityTaskStatusFilter);
    }

    /**
     * <p>
     * A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityTaskStatusFilter(java.util.Collection)} or
     * {@link #withCapacityTaskStatusFilter(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityTaskStatusFilter
     *        A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTaskStatus
     */

    public ListCapacityTasksRequest withCapacityTaskStatusFilter(String... capacityTaskStatusFilter) {
        if (this.capacityTaskStatusFilter == null) {
            setCapacityTaskStatusFilter(new java.util.ArrayList<String>(capacityTaskStatusFilter.length));
        }
        for (String ele : capacityTaskStatusFilter) {
            this.capacityTaskStatusFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * </p>
     * 
     * @param capacityTaskStatusFilter
     *        A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTaskStatus
     */

    public ListCapacityTasksRequest withCapacityTaskStatusFilter(java.util.Collection<String> capacityTaskStatusFilter) {
        setCapacityTaskStatusFilter(capacityTaskStatusFilter);
        return this;
    }

    /**
     * <p>
     * A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * </p>
     * 
     * @param capacityTaskStatusFilter
     *        A list of statuses. For example, <code>REQUESTED</code> or <code>WAITING_FOR_EVACUATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTaskStatus
     */

    public ListCapacityTasksRequest withCapacityTaskStatusFilter(CapacityTaskStatus... capacityTaskStatusFilter) {
        java.util.ArrayList<String> capacityTaskStatusFilterCopy = new java.util.ArrayList<String>(capacityTaskStatusFilter.length);
        for (CapacityTaskStatus value : capacityTaskStatusFilter) {
            capacityTaskStatusFilterCopy.add(value.toString());
        }
        if (getCapacityTaskStatusFilter() == null) {
            setCapacityTaskStatusFilter(capacityTaskStatusFilterCopy);
        } else {
            getCapacityTaskStatusFilter().addAll(capacityTaskStatusFilterCopy);
        }
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
        if (getOutpostIdentifierFilter() != null)
            sb.append("OutpostIdentifierFilter: ").append(getOutpostIdentifierFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCapacityTaskStatusFilter() != null)
            sb.append("CapacityTaskStatusFilter: ").append(getCapacityTaskStatusFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCapacityTasksRequest == false)
            return false;
        ListCapacityTasksRequest other = (ListCapacityTasksRequest) obj;
        if (other.getOutpostIdentifierFilter() == null ^ this.getOutpostIdentifierFilter() == null)
            return false;
        if (other.getOutpostIdentifierFilter() != null && other.getOutpostIdentifierFilter().equals(this.getOutpostIdentifierFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCapacityTaskStatusFilter() == null ^ this.getCapacityTaskStatusFilter() == null)
            return false;
        if (other.getCapacityTaskStatusFilter() != null && other.getCapacityTaskStatusFilter().equals(this.getCapacityTaskStatusFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostIdentifierFilter() == null) ? 0 : getOutpostIdentifierFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCapacityTaskStatusFilter() == null) ? 0 : getCapacityTaskStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListCapacityTasksRequest clone() {
        return (ListCapacityTasksRequest) super.clone();
    }

}
