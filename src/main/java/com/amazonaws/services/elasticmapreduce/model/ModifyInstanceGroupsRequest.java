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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#modifyInstanceGroups(ModifyInstanceGroupsRequest) ModifyInstanceGroups operation}.
 * <p>
 * ModifyInstanceGroups modifies the number of nodes and configuration
 * settings of an instance group. The input parameters include the new
 * target instance count for the group and the instance group ID. The
 * call will either succeed or fail atomically.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#modifyInstanceGroups(ModifyInstanceGroupsRequest)
 */
public class ModifyInstanceGroupsRequest extends AmazonWebServiceRequest {

    /**
     * Instance groups to change.
     */
    private java.util.List<InstanceGroupModifyConfig> instanceGroups;

    /**
     * Default constructor for a new ModifyInstanceGroupsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifyInstanceGroupsRequest() {}
    
    /**
     * Constructs a new ModifyInstanceGroupsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceGroups Instance groups to change.
     */
    public ModifyInstanceGroupsRequest(java.util.List<InstanceGroupModifyConfig> instanceGroups) {
        this.instanceGroups = instanceGroups;
    }
    
    /**
     * Instance groups to change.
     *
     * @return Instance groups to change.
     */
    public java.util.List<InstanceGroupModifyConfig> getInstanceGroups() {
        if (instanceGroups == null) {
            instanceGroups = new java.util.ArrayList<InstanceGroupModifyConfig>();
        }
        return instanceGroups;
    }
    
    /**
     * Instance groups to change.
     *
     * @param instanceGroups Instance groups to change.
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupModifyConfig> instanceGroups) {
        java.util.List<InstanceGroupModifyConfig> instanceGroupsCopy = new java.util.ArrayList<InstanceGroupModifyConfig>();
        if (instanceGroups != null) {
            instanceGroupsCopy.addAll(instanceGroups);
        }
        this.instanceGroups = instanceGroupsCopy;
    }
    
    /**
     * Instance groups to change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Instance groups to change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceGroupsRequest withInstanceGroups(InstanceGroupModifyConfig... instanceGroups) {
        for (InstanceGroupModifyConfig value : instanceGroups) {
            getInstanceGroups().add(value);
        }
        return this;
    }
    
    /**
     * Instance groups to change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Instance groups to change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceGroupsRequest withInstanceGroups(java.util.Collection<InstanceGroupModifyConfig> instanceGroups) {
        java.util.List<InstanceGroupModifyConfig> instanceGroupsCopy = new java.util.ArrayList<InstanceGroupModifyConfig>();
        if (instanceGroups != null) {
            instanceGroupsCopy.addAll(instanceGroups);
        }
        this.instanceGroups = instanceGroupsCopy;

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
        sb.append("InstanceGroups: " + instanceGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    