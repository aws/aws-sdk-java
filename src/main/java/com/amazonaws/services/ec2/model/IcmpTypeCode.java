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
public class IcmpTypeCode {

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
        sb.append("Type: " + type + ", ");
        sb.append("Code: " + code + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    