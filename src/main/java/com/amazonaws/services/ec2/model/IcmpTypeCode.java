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
public class IcmpTypeCode implements Serializable {

    /**
     * For the ICMP protocol, the ICMP type. A value of <code>-1</code> is a
     * wildcard meaning all types. Required if specifying <code>icmp</code>
     * for the protocol.
     */
    private Integer type;

    /**
     * For the ICMP protocol, the ICMP code. A value of <code>-1</code> is a
     * wildcard meaning all codes. Required if specifying <code>icmp</code>
     * for the protocol.
     */
    private Integer code;

    /**
     * For the ICMP protocol, the ICMP type. A value of <code>-1</code> is a
     * wildcard meaning all types. Required if specifying <code>icmp</code>
     * for the protocol.
     *
     * @return For the ICMP protocol, the ICMP type. A value of <code>-1</code> is a
     *         wildcard meaning all types. Required if specifying <code>icmp</code>
     *         for the protocol.
     */
    public Integer getType() {
        return type;
    }
    
    /**
     * For the ICMP protocol, the ICMP type. A value of <code>-1</code> is a
     * wildcard meaning all types. Required if specifying <code>icmp</code>
     * for the protocol.
     *
     * @param type For the ICMP protocol, the ICMP type. A value of <code>-1</code> is a
     *         wildcard meaning all types. Required if specifying <code>icmp</code>
     *         for the protocol.
     */
    public void setType(Integer type) {
        this.type = type;
    }
    
    /**
     * For the ICMP protocol, the ICMP type. A value of <code>-1</code> is a
     * wildcard meaning all types. Required if specifying <code>icmp</code>
     * for the protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type For the ICMP protocol, the ICMP type. A value of <code>-1</code> is a
     *         wildcard meaning all types. Required if specifying <code>icmp</code>
     *         for the protocol.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IcmpTypeCode withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * For the ICMP protocol, the ICMP code. A value of <code>-1</code> is a
     * wildcard meaning all codes. Required if specifying <code>icmp</code>
     * for the protocol.
     *
     * @return For the ICMP protocol, the ICMP code. A value of <code>-1</code> is a
     *         wildcard meaning all codes. Required if specifying <code>icmp</code>
     *         for the protocol.
     */
    public Integer getCode() {
        return code;
    }
    
    /**
     * For the ICMP protocol, the ICMP code. A value of <code>-1</code> is a
     * wildcard meaning all codes. Required if specifying <code>icmp</code>
     * for the protocol.
     *
     * @param code For the ICMP protocol, the ICMP code. A value of <code>-1</code> is a
     *         wildcard meaning all codes. Required if specifying <code>icmp</code>
     *         for the protocol.
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    
    /**
     * For the ICMP protocol, the ICMP code. A value of <code>-1</code> is a
     * wildcard meaning all codes. Required if specifying <code>icmp</code>
     * for the protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code For the ICMP protocol, the ICMP code. A value of <code>-1</code> is a
     *         wildcard meaning all codes. Required if specifying <code>icmp</code>
     *         for the protocol.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IcmpTypeCode withCode(Integer code) {
        this.code = code;
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
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getCode() != null) sb.append("Code: " + getCode() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IcmpTypeCode == false) return false;
        IcmpTypeCode other = (IcmpTypeCode)obj;
        
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        return true;
    }
    
}
    