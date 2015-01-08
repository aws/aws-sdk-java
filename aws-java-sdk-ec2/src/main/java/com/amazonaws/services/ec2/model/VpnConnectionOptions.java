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
 * Describes VPN connection options.
 * </p>
 */
public class VpnConnectionOptions implements Serializable {

    /**
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     */
    private Boolean staticRoutesOnly;

    /**
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     *
     * @return Indicates whether the VPN connection uses static routes only. Static
     *         routes must be used for devices that don't support BGP.
     */
    public Boolean isStaticRoutesOnly() {
        return staticRoutesOnly;
    }
    
    /**
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     *
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. Static
     *         routes must be used for devices that don't support BGP.
     */
    public void setStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
    }
    
    /**
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. Static
     *         routes must be used for devices that don't support BGP.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnConnectionOptions withStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
        return this;
    }

    /**
     * Indicates whether the VPN connection uses static routes only. Static
     * routes must be used for devices that don't support BGP.
     *
     * @return Indicates whether the VPN connection uses static routes only. Static
     *         routes must be used for devices that don't support BGP.
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

        if (obj instanceof VpnConnectionOptions == false) return false;
        VpnConnectionOptions other = (VpnConnectionOptions)obj;
        
        if (other.isStaticRoutesOnly() == null ^ this.isStaticRoutesOnly() == null) return false;
        if (other.isStaticRoutesOnly() != null && other.isStaticRoutesOnly().equals(this.isStaticRoutesOnly()) == false) return false; 
        return true;
    }
    
}
    