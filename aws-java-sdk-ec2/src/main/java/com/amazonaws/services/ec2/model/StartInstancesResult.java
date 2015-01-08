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

/**
 * 
 */
public class StartInstancesResult implements Serializable {

    /**
     * Information about one or more started instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStateChange> startingInstances;

    /**
     * Information about one or more started instances.
     *
     * @return Information about one or more started instances.
     */
    public java.util.List<InstanceStateChange> getStartingInstances() {
        if (startingInstances == null) {
              startingInstances = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStateChange>();
              startingInstances.setAutoConstruct(true);
        }
        return startingInstances;
    }
    
    /**
     * Information about one or more started instances.
     *
     * @param startingInstances Information about one or more started instances.
     */
    public void setStartingInstances(java.util.Collection<InstanceStateChange> startingInstances) {
        if (startingInstances == null) {
            this.startingInstances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStateChange> startingInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStateChange>(startingInstances.size());
        startingInstancesCopy.addAll(startingInstances);
        this.startingInstances = startingInstancesCopy;
    }
    
    /**
     * Information about one or more started instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startingInstances Information about one or more started instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartInstancesResult withStartingInstances(InstanceStateChange... startingInstances) {
        if (getStartingInstances() == null) setStartingInstances(new java.util.ArrayList<InstanceStateChange>(startingInstances.length));
        for (InstanceStateChange value : startingInstances) {
            getStartingInstances().add(value);
        }
        return this;
    }
    
    /**
     * Information about one or more started instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startingInstances Information about one or more started instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartInstancesResult withStartingInstances(java.util.Collection<InstanceStateChange> startingInstances) {
        if (startingInstances == null) {
            this.startingInstances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStateChange> startingInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStateChange>(startingInstances.size());
            startingInstancesCopy.addAll(startingInstances);
            this.startingInstances = startingInstancesCopy;
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
        if (getStartingInstances() != null) sb.append("StartingInstances: " + getStartingInstances() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStartingInstances() == null) ? 0 : getStartingInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartInstancesResult == false) return false;
        StartInstancesResult other = (StartInstancesResult)obj;
        
        if (other.getStartingInstances() == null ^ this.getStartingInstances() == null) return false;
        if (other.getStartingInstances() != null && other.getStartingInstances().equals(this.getStartingInstances()) == false) return false; 
        return true;
    }
    
}
    