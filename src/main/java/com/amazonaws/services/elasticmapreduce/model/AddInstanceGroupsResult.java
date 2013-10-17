/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * Output from an AddInstanceGroups call.
 * </p>
 */
public class AddInstanceGroupsResult implements Serializable {

    /**
     * The job flow ID in which the instance groups are added.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String jobFlowId;

    /**
     * Instance group IDs of the newly created instance groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceGroupIds;

    /**
     * The job flow ID in which the instance groups are added.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The job flow ID in which the instance groups are added.
     */
    public String getJobFlowId() {
        return jobFlowId;
    }
    
    /**
     * The job flow ID in which the instance groups are added.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowId The job flow ID in which the instance groups are added.
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * The job flow ID in which the instance groups are added.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowId The job flow ID in which the instance groups are added.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddInstanceGroupsResult withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }

    /**
     * Instance group IDs of the newly created instance groups.
     *
     * @return Instance group IDs of the newly created instance groups.
     */
    public java.util.List<String> getInstanceGroupIds() {
        if (instanceGroupIds == null) {
              instanceGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceGroupIds.setAutoConstruct(true);
        }
        return instanceGroupIds;
    }
    
    /**
     * Instance group IDs of the newly created instance groups.
     *
     * @param instanceGroupIds Instance group IDs of the newly created instance groups.
     */
    public void setInstanceGroupIds(java.util.Collection<String> instanceGroupIds) {
        if (instanceGroupIds == null) {
            this.instanceGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceGroupIds.size());
        instanceGroupIdsCopy.addAll(instanceGroupIds);
        this.instanceGroupIds = instanceGroupIdsCopy;
    }
    
    /**
     * Instance group IDs of the newly created instance groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroupIds Instance group IDs of the newly created instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddInstanceGroupsResult withInstanceGroupIds(String... instanceGroupIds) {
        if (getInstanceGroupIds() == null) setInstanceGroupIds(new java.util.ArrayList<String>(instanceGroupIds.length));
        for (String value : instanceGroupIds) {
            getInstanceGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * Instance group IDs of the newly created instance groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroupIds Instance group IDs of the newly created instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddInstanceGroupsResult withInstanceGroupIds(java.util.Collection<String> instanceGroupIds) {
        if (instanceGroupIds == null) {
            this.instanceGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceGroupIds.size());
            instanceGroupIdsCopy.addAll(instanceGroupIds);
            this.instanceGroupIds = instanceGroupIdsCopy;
        }

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
        if (getJobFlowId() != null) sb.append("JobFlowId: " + getJobFlowId() + ",");
        if (getInstanceGroupIds() != null) sb.append("InstanceGroupIds: " + getInstanceGroupIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceGroupIds() == null) ? 0 : getInstanceGroupIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddInstanceGroupsResult == false) return false;
        AddInstanceGroupsResult other = (AddInstanceGroupsResult)obj;
        
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null) return false;
        if (other.getJobFlowId() != null && other.getJobFlowId().equals(this.getJobFlowId()) == false) return false; 
        if (other.getInstanceGroupIds() == null ^ this.getInstanceGroupIds() == null) return false;
        if (other.getInstanceGroupIds() != null && other.getInstanceGroupIds().equals(this.getInstanceGroupIds()) == false) return false; 
        return true;
    }
    
}
    