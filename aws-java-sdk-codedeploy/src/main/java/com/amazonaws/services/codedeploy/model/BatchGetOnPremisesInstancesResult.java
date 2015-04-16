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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a batch get on-premises instances operation.
 * </p>
 */
public class BatchGetOnPremisesInstancesResult implements Serializable, Cloneable {

    /**
     * Information about the on-premises instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceInfo> instanceInfos;

    /**
     * Information about the on-premises instances.
     *
     * @return Information about the on-premises instances.
     */
    public java.util.List<InstanceInfo> getInstanceInfos() {
        if (instanceInfos == null) {
              instanceInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceInfo>();
              instanceInfos.setAutoConstruct(true);
        }
        return instanceInfos;
    }
    
    /**
     * Information about the on-premises instances.
     *
     * @param instanceInfos Information about the on-premises instances.
     */
    public void setInstanceInfos(java.util.Collection<InstanceInfo> instanceInfos) {
        if (instanceInfos == null) {
            this.instanceInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceInfo> instanceInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceInfo>(instanceInfos.size());
        instanceInfosCopy.addAll(instanceInfos);
        this.instanceInfos = instanceInfosCopy;
    }
    
    /**
     * Information about the on-premises instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceInfos(java.util.Collection)} or {@link
     * #withInstanceInfos(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInfos Information about the on-premises instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetOnPremisesInstancesResult withInstanceInfos(InstanceInfo... instanceInfos) {
        if (getInstanceInfos() == null) setInstanceInfos(new java.util.ArrayList<InstanceInfo>(instanceInfos.length));
        for (InstanceInfo value : instanceInfos) {
            getInstanceInfos().add(value);
        }
        return this;
    }
    
    /**
     * Information about the on-premises instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInfos Information about the on-premises instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetOnPremisesInstancesResult withInstanceInfos(java.util.Collection<InstanceInfo> instanceInfos) {
        if (instanceInfos == null) {
            this.instanceInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceInfo> instanceInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceInfo>(instanceInfos.size());
            instanceInfosCopy.addAll(instanceInfos);
            this.instanceInfos = instanceInfosCopy;
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
        if (getInstanceInfos() != null) sb.append("InstanceInfos: " + getInstanceInfos() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceInfos() == null) ? 0 : getInstanceInfos().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchGetOnPremisesInstancesResult == false) return false;
        BatchGetOnPremisesInstancesResult other = (BatchGetOnPremisesInstancesResult)obj;
        
        if (other.getInstanceInfos() == null ^ this.getInstanceInfos() == null) return false;
        if (other.getInstanceInfos() != null && other.getInstanceInfos().equals(this.getInstanceInfos()) == false) return false; 
        return true;
    }
    
    @Override
    public BatchGetOnPremisesInstancesResult clone() {
        try {
            return (BatchGetOnPremisesInstancesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    