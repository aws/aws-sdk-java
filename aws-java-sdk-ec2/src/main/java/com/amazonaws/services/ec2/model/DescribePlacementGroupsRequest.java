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
import com.amazonaws.services.ec2.model.transform.DescribePlacementGroupsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePlacementGroupsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribePlacementGroupsRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     * <code>partition</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupNames;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     * <code>partition</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>group-name</code> - The name of the placement group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     *         <code>partition</code>).
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     * <code>partition</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of the placement group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     *        <code>partition</code>).
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     * <code>partition</code>).
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
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of the placement group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     *        <code>partition</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePlacementGroupsRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     * <code>partition</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of the placement group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the placement group (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strategy</code> - The strategy of the placement group (<code>cluster</code> | <code>spread</code> |
     *        <code>partition</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePlacementGroupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise specified.
     * </p>
     * 
     * @return The names of the placement groups.</p>
     *         <p>
     *         Default: Describes all your placement groups, or only those otherwise specified.
     */

    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupNames;
    }

    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise specified.
     * </p>
     * 
     * @param groupNames
     *        The names of the placement groups.</p>
     *        <p>
     *        Default: Describes all your placement groups, or only those otherwise specified.
     */

    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new com.amazonaws.internal.SdkInternalList<String>(groupNames);
    }

    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupNames(java.util.Collection)} or {@link #withGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupNames
     *        The names of the placement groups.</p>
     *        <p>
     *        Default: Describes all your placement groups, or only those otherwise specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePlacementGroupsRequest withGroupNames(String... groupNames) {
        if (this.groupNames == null) {
            setGroupNames(new com.amazonaws.internal.SdkInternalList<String>(groupNames.length));
        }
        for (String ele : groupNames) {
            this.groupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise specified.
     * </p>
     * 
     * @param groupNames
     *        The names of the placement groups.</p>
     *        <p>
     *        Default: Describes all your placement groups, or only those otherwise specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePlacementGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribePlacementGroupsRequest> getDryRunRequest() {
        Request<DescribePlacementGroupsRequest> request = new DescribePlacementGroupsRequestMarshaller().marshall(this);
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
        if (getGroupNames() != null)
            sb.append("GroupNames: ").append(getGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePlacementGroupsRequest == false)
            return false;
        DescribePlacementGroupsRequest other = (DescribePlacementGroupsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribePlacementGroupsRequest clone() {
        return (DescribePlacementGroupsRequest) super.clone();
    }
}
