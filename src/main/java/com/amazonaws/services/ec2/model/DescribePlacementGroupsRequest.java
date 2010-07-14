/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describePlacementGroups(DescribePlacementGroupsRequest) DescribePlacementGroups operation}.
 * <p>
 * Returns information about one or more PlacementGroup instances in a
 * user's account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describePlacementGroups(DescribePlacementGroupsRequest)
 */
public class DescribePlacementGroupsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the <code>PlacementGroup</code>.
     */
    private java.util.List<String> groupNames;

    /**
     * The name of the <code>PlacementGroup</code>.
     *
     * @return The name of the <code>PlacementGroup</code>.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new java.util.ArrayList<String>();
        }
        return groupNames;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     *
     * @param groupNames The name of the <code>PlacementGroup</code>.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The name of the <code>PlacementGroup</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePlacementGroupsRequest withGroupNames(String... groupNames) {
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The name of the <code>PlacementGroup</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePlacementGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;

        return this;
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
        sb.append("GroupNames: " + groupNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    