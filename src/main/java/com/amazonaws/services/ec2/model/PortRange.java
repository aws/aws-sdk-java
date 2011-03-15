/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class PortRange {

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
        sb.append("From: " + from + ", ");
        sb.append("To: " + to + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    