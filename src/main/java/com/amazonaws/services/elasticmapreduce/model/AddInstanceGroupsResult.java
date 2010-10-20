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
package com.amazonaws.services.elasticmapreduce.model;

/**
 * <p>
 * Output from an AddInstanceGroups call.
 * </p>
 */
public class AddInstanceGroupsResult {

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
    private java.util.List<String> instanceGroupIds;

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
            instanceGroupIds = new java.util.ArrayList<String>();
        }
        return instanceGroupIds;
    }
    
    /**
     * Instance group IDs of the newly created instance groups.
     *
     * @param instanceGroupIds Instance group IDs of the newly created instance groups.
     */
    public void setInstanceGroupIds(java.util.Collection<String> instanceGroupIds) {
        java.util.List<String> instanceGroupIdsCopy = new java.util.ArrayList<String>();
        if (instanceGroupIds != null) {
            instanceGroupIdsCopy.addAll(instanceGroupIds);
        }
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
        java.util.List<String> instanceGroupIdsCopy = new java.util.ArrayList<String>();
        if (instanceGroupIds != null) {
            instanceGroupIdsCopy.addAll(instanceGroupIds);
        }
        this.instanceGroupIds = instanceGroupIdsCopy;

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
        sb.append("JobFlowId: " + jobFlowId + ", ");
        sb.append("InstanceGroupIds: " + instanceGroupIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    