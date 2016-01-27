/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the output of PurchaseScheduledInstances.
 * </p>
 */
public class PurchaseScheduledInstancesResult implements Serializable, Cloneable {

    /**
     * Information about the Scheduled Instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstance> scheduledInstanceSet;

    /**
     * Information about the Scheduled Instances.
     *
     * @return Information about the Scheduled Instances.
     */
    public java.util.List<ScheduledInstance> getScheduledInstanceSet() {
        if (scheduledInstanceSet == null) {
              scheduledInstanceSet = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstance>();
              scheduledInstanceSet.setAutoConstruct(true);
        }
        return scheduledInstanceSet;
    }
    
    /**
     * Information about the Scheduled Instances.
     *
     * @param scheduledInstanceSet Information about the Scheduled Instances.
     */
    public void setScheduledInstanceSet(java.util.Collection<ScheduledInstance> scheduledInstanceSet) {
        if (scheduledInstanceSet == null) {
            this.scheduledInstanceSet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstance> scheduledInstanceSetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstance>(scheduledInstanceSet.size());
        scheduledInstanceSetCopy.addAll(scheduledInstanceSet);
        this.scheduledInstanceSet = scheduledInstanceSetCopy;
    }
    
    /**
     * Information about the Scheduled Instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setScheduledInstanceSet(java.util.Collection)} or
     * {@link #withScheduledInstanceSet(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledInstanceSet Information about the Scheduled Instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PurchaseScheduledInstancesResult withScheduledInstanceSet(ScheduledInstance... scheduledInstanceSet) {
        if (getScheduledInstanceSet() == null) setScheduledInstanceSet(new java.util.ArrayList<ScheduledInstance>(scheduledInstanceSet.length));
        for (ScheduledInstance value : scheduledInstanceSet) {
            getScheduledInstanceSet().add(value);
        }
        return this;
    }
    
    /**
     * Information about the Scheduled Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledInstanceSet Information about the Scheduled Instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PurchaseScheduledInstancesResult withScheduledInstanceSet(java.util.Collection<ScheduledInstance> scheduledInstanceSet) {
        if (scheduledInstanceSet == null) {
            this.scheduledInstanceSet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstance> scheduledInstanceSetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstance>(scheduledInstanceSet.size());
            scheduledInstanceSetCopy.addAll(scheduledInstanceSet);
            this.scheduledInstanceSet = scheduledInstanceSetCopy;
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
        if (getScheduledInstanceSet() != null) sb.append("ScheduledInstanceSet: " + getScheduledInstanceSet() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getScheduledInstanceSet() == null) ? 0 : getScheduledInstanceSet().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PurchaseScheduledInstancesResult == false) return false;
        PurchaseScheduledInstancesResult other = (PurchaseScheduledInstancesResult)obj;
        
        if (other.getScheduledInstanceSet() == null ^ this.getScheduledInstanceSet() == null) return false;
        if (other.getScheduledInstanceSet() != null && other.getScheduledInstanceSet().equals(this.getScheduledInstanceSet()) == false) return false; 
        return true;
    }
    
    @Override
    public PurchaseScheduledInstancesResult clone() {
        try {
            return (PurchaseScheduledInstancesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    