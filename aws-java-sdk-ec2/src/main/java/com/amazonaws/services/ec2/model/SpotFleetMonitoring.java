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
 * <p>
 * Describes whether monitoring is enabled.
 * </p>
 */
public class SpotFleetMonitoring implements Serializable, Cloneable {

    /**
     * Enables monitoring for the instance. <p>Default: <code>false</code>
     */
    private Boolean enabled;

    /**
     * Enables monitoring for the instance. <p>Default: <code>false</code>
     *
     * @return Enables monitoring for the instance. <p>Default: <code>false</code>
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Enables monitoring for the instance. <p>Default: <code>false</code>
     *
     * @param enabled Enables monitoring for the instance. <p>Default: <code>false</code>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Enables monitoring for the instance. <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Enables monitoring for the instance. <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetMonitoring withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Enables monitoring for the instance. <p>Default: <code>false</code>
     *
     * @return Enables monitoring for the instance. <p>Default: <code>false</code>
     */
    public Boolean getEnabled() {
        return enabled;
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
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotFleetMonitoring == false) return false;
        SpotFleetMonitoring other = (SpotFleetMonitoring)obj;
        
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        return true;
    }
    
    @Override
    public SpotFleetMonitoring clone() {
        try {
            return (SpotFleetMonitoring) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    