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
 * 
 */
public class PortRange implements Serializable {

    /**
     * The first port in the range. Required if specifying <code>tcp</code>
     * or <code>udp</code> for the protocol.
     */
    private Integer from;

    /**
     * The last port in the range. Required if specifying <code>tcp</code> or
     * <code>udp</code> for the protocol.
     */
    private Integer to;

    /**
     * The first port in the range. Required if specifying <code>tcp</code>
     * or <code>udp</code> for the protocol.
     *
     * @return The first port in the range. Required if specifying <code>tcp</code>
     *         or <code>udp</code> for the protocol.
     */
    public Integer getFrom() {
        return from;
    }
    
    /**
     * The first port in the range. Required if specifying <code>tcp</code>
     * or <code>udp</code> for the protocol.
     *
     * @param from The first port in the range. Required if specifying <code>tcp</code>
     *         or <code>udp</code> for the protocol.
     */
    public void setFrom(Integer from) {
        this.from = from;
    }
    
    /**
     * The first port in the range. Required if specifying <code>tcp</code>
     * or <code>udp</code> for the protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param from The first port in the range. Required if specifying <code>tcp</code>
     *         or <code>udp</code> for the protocol.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PortRange withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * The last port in the range. Required if specifying <code>tcp</code> or
     * <code>udp</code> for the protocol.
     *
     * @return The last port in the range. Required if specifying <code>tcp</code> or
     *         <code>udp</code> for the protocol.
     */
    public Integer getTo() {
        return to;
    }
    
    /**
     * The last port in the range. Required if specifying <code>tcp</code> or
     * <code>udp</code> for the protocol.
     *
     * @param to The last port in the range. Required if specifying <code>tcp</code> or
     *         <code>udp</code> for the protocol.
     */
    public void setTo(Integer to) {
        this.to = to;
    }
    
    /**
     * The last port in the range. Required if specifying <code>tcp</code> or
     * <code>udp</code> for the protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param to The last port in the range. Required if specifying <code>tcp</code> or
     *         <code>udp</code> for the protocol.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PortRange withTo(Integer to) {
        this.to = to;
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
        if (getFrom() != null) sb.append("From: " + getFrom() + ",");
        if (getTo() != null) sb.append("To: " + getTo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode()); 
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PortRange == false) return false;
        PortRange other = (PortRange)obj;
        
        if (other.getFrom() == null ^ this.getFrom() == null) return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false) return false; 
        if (other.getTo() == null ^ this.getTo() == null) return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false) return false; 
        return true;
    }
    
}
    