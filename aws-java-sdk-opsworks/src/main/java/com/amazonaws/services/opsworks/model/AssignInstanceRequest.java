/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#assignInstance(AssignInstanceRequest) AssignInstance operation}.
 * <p>
 * Assign a registered instance to a custom layer. You cannot use this
 * action with instances that were created with AWS OpsWorks.
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#assignInstance(AssignInstanceRequest)
 */
public class AssignInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The layer ID, which must correspond to a custom layer. You cannot
     * assign a registered instance to a built-in layer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIds;

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssignInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The layer ID, which must correspond to a custom layer. You cannot
     * assign a registered instance to a built-in layer.
     *
     * @return The layer ID, which must correspond to a custom layer. You cannot
     *         assign a registered instance to a built-in layer.
     */
    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
              layerIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              layerIds.setAutoConstruct(true);
        }
        return layerIds;
    }
    
    /**
     * The layer ID, which must correspond to a custom layer. You cannot
     * assign a registered instance to a built-in layer.
     *
     * @param layerIds The layer ID, which must correspond to a custom layer. You cannot
     *         assign a registered instance to a built-in layer.
     */
    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(layerIds.size());
        layerIdsCopy.addAll(layerIds);
        this.layerIds = layerIdsCopy;
    }
    
    /**
     * The layer ID, which must correspond to a custom layer. You cannot
     * assign a registered instance to a built-in layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds The layer ID, which must correspond to a custom layer. You cannot
     *         assign a registered instance to a built-in layer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssignInstanceRequest withLayerIds(String... layerIds) {
        if (getLayerIds() == null) setLayerIds(new java.util.ArrayList<String>(layerIds.length));
        for (String value : layerIds) {
            getLayerIds().add(value);
        }
        return this;
    }
    
    /**
     * The layer ID, which must correspond to a custom layer. You cannot
     * assign a registered instance to a built-in layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds The layer ID, which must correspond to a custom layer. You cannot
     *         assign a registered instance to a built-in layer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssignInstanceRequest withLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(layerIds.size());
            layerIdsCopy.addAll(layerIds);
            this.layerIds = layerIdsCopy;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getLayerIds() != null) sb.append("LayerIds: " + getLayerIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssignInstanceRequest == false) return false;
        AssignInstanceRequest other = (AssignInstanceRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getLayerIds() == null ^ this.getLayerIds() == null) return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false) return false; 
        return true;
    }
    
}
    