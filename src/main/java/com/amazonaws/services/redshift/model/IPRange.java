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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an IP range used in a security group.
 * </p>
 */
public class IPRange implements Serializable {

    /**
     * The status of the IP range, for example, "authorized".
     */
    private String status;

    /**
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     */
    private String cIDRIP;

    /**
     * The status of the IP range, for example, "authorized".
     *
     * @return The status of the IP range, for example, "authorized".
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the IP range, for example, "authorized".
     *
     * @param status The status of the IP range, for example, "authorized".
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the IP range, for example, "authorized".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the IP range, for example, "authorized".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IPRange withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     *
     * @return The IP range in Classless Inter-Domain Routing (CIDR) notation.
     */
    public String getCIDRIP() {
        return cIDRIP;
    }
    
    /**
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     *
     * @param cIDRIP The IP range in Classless Inter-Domain Routing (CIDR) notation.
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }
    
    /**
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cIDRIP The IP range in Classless Inter-Domain Routing (CIDR) notation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IPRange withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getCIDRIP() != null) sb.append("CIDRIP: " + getCIDRIP() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IPRange == false) return false;
        IPRange other = (IPRange)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null) return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false) return false; 
        return true;
    }
    
}
    