/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribePlacementGroupsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describePlacementGroups(DescribePlacementGroupsRequest) DescribePlacementGroups operation}.
 * <p>
 * Describes one or more of your placement groups. For more information
 * about placement groups and cluster instances, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describePlacementGroups(DescribePlacementGroupsRequest)
 */
public class DescribePlacementGroupsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribePlacementGroupsRequest> {

    /**
     * One or more placement group names. <p>Default: Describes all your
     * placement groups, or only those otherwise specified.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNames;

    /**
     * One or more filters. <ul> <li> <p><code>group-name</code> - The name
     * of the placement group. </li> <li> <p><code>state</code> - The state
     * of the placement group (<code>pending</code> | <code>available</code>
     * | <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>strategy</code> - The strategy of the placement group
     * (<code>cluster</code>). </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more placement group names. <p>Default: Describes all your
     * placement groups, or only those otherwise specified.
     *
     * @return One or more placement group names. <p>Default: Describes all your
     *         placement groups, or only those otherwise specified.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
              groupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupNames.setAutoConstruct(true);
        }
        return groupNames;
    }
    
    /**
     * One or more placement group names. <p>Default: Describes all your
     * placement groups, or only those otherwise specified.
     *
     * @param groupNames One or more placement group names. <p>Default: Describes all your
     *         placement groups, or only those otherwise specified.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
        groupNamesCopy.addAll(groupNames);
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * One or more placement group names. <p>Default: Describes all your
     * placement groups, or only those otherwise specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames One or more placement group names. <p>Default: Describes all your
     *         placement groups, or only those otherwise specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePlacementGroupsRequest withGroupNames(String... groupNames) {
        if (getGroupNames() == null) setGroupNames(new java.util.ArrayList<String>(groupNames.length));
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * One or more placement group names. <p>Default: Describes all your
     * placement groups, or only those otherwise specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames One or more placement group names. <p>Default: Describes all your
     *         placement groups, or only those otherwise specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePlacementGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
            groupNamesCopy.addAll(groupNames);
            this.groupNames = groupNamesCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>group-name</code> - The name
     * of the placement group. </li> <li> <p><code>state</code> - The state
     * of the placement group (<code>pending</code> | <code>available</code>
     * | <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>strategy</code> - The strategy of the placement group
     * (<code>cluster</code>). </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>group-name</code> - The name
     *         of the placement group. </li> <li> <p><code>state</code> - The state
     *         of the placement group (<code>pending</code> | <code>available</code>
     *         | <code>deleting</code> | <code>deleted</code>). </li> <li>
     *         <p><code>strategy</code> - The strategy of the placement group
     *         (<code>cluster</code>). </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>group-name</code> - The name
     * of the placement group. </li> <li> <p><code>state</code> - The state
     * of the placement group (<code>pending</code> | <code>available</code>
     * | <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>strategy</code> - The strategy of the placement group
     * (<code>cluster</code>). </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>group-name</code> - The name
     *         of the placement group. </li> <li> <p><code>state</code> - The state
     *         of the placement group (<code>pending</code> | <code>available</code>
     *         | <code>deleting</code> | <code>deleted</code>). </li> <li>
     *         <p><code>strategy</code> - The strategy of the placement group
     *         (<code>cluster</code>). </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>group-name</code> - The name
     * of the placement group. </li> <li> <p><code>state</code> - The state
     * of the placement group (<code>pending</code> | <code>available</code>
     * | <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>strategy</code> - The strategy of the placement group
     * (<code>cluster</code>). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>group-name</code> - The name
     *         of the placement group. </li> <li> <p><code>state</code> - The state
     *         of the placement group (<code>pending</code> | <code>available</code>
     *         | <code>deleting</code> | <code>deleted</code>). </li> <li>
     *         <p><code>strategy</code> - The strategy of the placement group
     *         (<code>cluster</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePlacementGroupsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>group-name</code> - The name
     * of the placement group. </li> <li> <p><code>state</code> - The state
     * of the placement group (<code>pending</code> | <code>available</code>
     * | <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>strategy</code> - The strategy of the placement group
     * (<code>cluster</code>). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>group-name</code> - The name
     *         of the placement group. </li> <li> <p><code>state</code> - The state
     *         of the placement group (<code>pending</code> | <code>available</code>
     *         | <code>deleting</code> | <code>deleted</code>). </li> <li>
     *         <p><code>strategy</code> - The strategy of the placement group
     *         (<code>cluster</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePlacementGroupsRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribePlacementGroupsRequest> getDryRunRequest() {
        Request<DescribePlacementGroupsRequest> request = new DescribePlacementGroupsRequestMarshaller().marshall(this);
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
        if (getGroupNames() != null) sb.append("GroupNames: " + getGroupNames() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePlacementGroupsRequest == false) return false;
        DescribePlacementGroupsRequest other = (DescribePlacementGroupsRequest)obj;
        
        if (other.getGroupNames() == null ^ this.getGroupNames() == null) return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    