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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Vpn Connection Options Specification
 */
public class VpnConnectionOptionsSpecification implements Serializable {

    private Boolean staticRoutesOnly;

    /**
     * Returns the value of the StaticRoutesOnly property for this object.
     *
     * @return The value of the StaticRoutesOnly property for this object.
     */
    public Boolean isStaticRoutesOnly() {
        return staticRoutesOnly;
    }
    
    /**
     * Sets the value of the StaticRoutesOnly property for this object.
     *
     * @param staticRoutesOnly The new value for the StaticRoutesOnly property for this object.
     */
    public void setStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
    }
    
    /**
     * Sets the value of the StaticRoutesOnly property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param staticRoutesOnly The new value for the StaticRoutesOnly property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VpnConnectionOptionsSpecification withStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
        return this;
    }

    /**
     * Returns the value of the StaticRoutesOnly property for this object.
     *
     * @return The value of the StaticRoutesOnly property for this object.
     */
    public Boolean getStaticRoutesOnly() {
        return staticRoutesOnly;
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
        if (isStaticRoutesOnly() != null) sb.append("StaticRoutesOnly: " + isStaticRoutesOnly() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isStaticRoutesOnly() == null) ? 0 : isStaticRoutesOnly().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpnConnectionOptionsSpecification == false) return false;
        VpnConnectionOptionsSpecification other = (VpnConnectionOptionsSpecification)obj;
        
        if (other.isStaticRoutesOnly() == null ^ this.isStaticRoutesOnly() == null) return false;
        if (other.isStaticRoutesOnly() != null && other.isStaticRoutesOnly().equals(this.isStaticRoutesOnly()) == false) return false; 
        return true;
    }
    
}
    