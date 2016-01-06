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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * Limits
 */
public class Limits implements Serializable, Cloneable {

    private Integer maximumReplicationCount;

    private Integer maximumPartitionCount;

    /**
     * Returns the value of the MaximumReplicationCount property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the MaximumReplicationCount property for this object.
     */
    public Integer getMaximumReplicationCount() {
        return maximumReplicationCount;
    }
    
    /**
     * Sets the value of the MaximumReplicationCount property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maximumReplicationCount The new value for the MaximumReplicationCount property for this
     *         object.
     */
    public void setMaximumReplicationCount(Integer maximumReplicationCount) {
        this.maximumReplicationCount = maximumReplicationCount;
    }
    
    /**
     * Sets the value of the MaximumReplicationCount property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maximumReplicationCount The new value for the MaximumReplicationCount property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Limits withMaximumReplicationCount(Integer maximumReplicationCount) {
        this.maximumReplicationCount = maximumReplicationCount;
        return this;
    }

    /**
     * Returns the value of the MaximumPartitionCount property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the MaximumPartitionCount property for this object.
     */
    public Integer getMaximumPartitionCount() {
        return maximumPartitionCount;
    }
    
    /**
     * Sets the value of the MaximumPartitionCount property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maximumPartitionCount The new value for the MaximumPartitionCount property for this object.
     */
    public void setMaximumPartitionCount(Integer maximumPartitionCount) {
        this.maximumPartitionCount = maximumPartitionCount;
    }
    
    /**
     * Sets the value of the MaximumPartitionCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maximumPartitionCount The new value for the MaximumPartitionCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Limits withMaximumPartitionCount(Integer maximumPartitionCount) {
        this.maximumPartitionCount = maximumPartitionCount;
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
        if (getMaximumReplicationCount() != null) sb.append("MaximumReplicationCount: " + getMaximumReplicationCount() + ",");
        if (getMaximumPartitionCount() != null) sb.append("MaximumPartitionCount: " + getMaximumPartitionCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMaximumReplicationCount() == null) ? 0 : getMaximumReplicationCount().hashCode()); 
        hashCode = prime * hashCode + ((getMaximumPartitionCount() == null) ? 0 : getMaximumPartitionCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Limits == false) return false;
        Limits other = (Limits)obj;
        
        if (other.getMaximumReplicationCount() == null ^ this.getMaximumReplicationCount() == null) return false;
        if (other.getMaximumReplicationCount() != null && other.getMaximumReplicationCount().equals(this.getMaximumReplicationCount()) == false) return false; 
        if (other.getMaximumPartitionCount() == null ^ this.getMaximumPartitionCount() == null) return false;
        if (other.getMaximumPartitionCount() != null && other.getMaximumPartitionCount().equals(this.getMaximumPartitionCount()) == false) return false; 
        return true;
    }
    
    @Override
    public Limits clone() {
        try {
            return (Limits) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    