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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#modifyInstanceGroups(ModifyInstanceGroupsRequest) ModifyInstanceGroups operation}.
 * <p>
 * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target
 * instance count for the group and the instance group ID. The call will either succeed or fail atomically.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#modifyInstanceGroups(ModifyInstanceGroupsRequest)
 */
public class ModifyInstanceGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Instance groups to change.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupModifyConfig> instanceGroups;

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
        setInstanceGroups(instanceGroups);
    }

    /**
     * Instance groups to change.
     *
     * @return Instance groups to change.
     */
    public java.util.List<InstanceGroupModifyConfig> getInstanceGroups() {
        if (instanceGroups == null) {
              instanceGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupModifyConfig>();
              instanceGroups.setAutoConstruct(true);
        }
        return instanceGroups;
    }
    
    /**
     * Instance groups to change.
     *
     * @param instanceGroups Instance groups to change.
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupModifyConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupModifyConfig> instanceGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupModifyConfig>(instanceGroups.size());
        instanceGroupsCopy.addAll(instanceGroups);
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
        if (getInstanceGroups() == null) setInstanceGroups(new java.util.ArrayList<InstanceGroupModifyConfig>(instanceGroups.length));
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
        if (instanceGroups == null) {
            this.instanceGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupModifyConfig> instanceGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupModifyConfig>(instanceGroups.size());
            instanceGroupsCopy.addAll(instanceGroups);
            this.instanceGroups = instanceGroupsCopy;
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
        if (getInstanceGroups() != null) sb.append("InstanceGroups: " + getInstanceGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyInstanceGroupsRequest == false) return false;
        ModifyInstanceGroupsRequest other = (ModifyInstanceGroupsRequest)obj;
        
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null) return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false) return false; 
        return true;
    }
    
}
    