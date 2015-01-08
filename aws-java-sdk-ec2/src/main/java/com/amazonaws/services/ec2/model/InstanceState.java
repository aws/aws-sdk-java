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
 * Describes the current state of the instance.
 * </p>
 */
public class InstanceState implements Serializable {

    /**
     * The low byte represents the state. The high byte is an opaque internal
     * value and should be ignored. <ul> <li><p><code>0</code> :
     * <code>pending</code></li> <li><p><code>16</code> :
     * <code>running</code></li> <li><p><code>32</code> :
     * <code>shutting-down</code></li> <li><p><code>48</code> :
     * <code>terminated</code></li> <li><p><code>64</code> :
     * <code>stopping</code></li> <li><p><code>80</code> :
     * <code>stopped</code></li> </ul>
     */
    private Integer code;

    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated, stopping, stopped
     */
    private String name;

    /**
     * The low byte represents the state. The high byte is an opaque internal
     * value and should be ignored. <ul> <li><p><code>0</code> :
     * <code>pending</code></li> <li><p><code>16</code> :
     * <code>running</code></li> <li><p><code>32</code> :
     * <code>shutting-down</code></li> <li><p><code>48</code> :
     * <code>terminated</code></li> <li><p><code>64</code> :
     * <code>stopping</code></li> <li><p><code>80</code> :
     * <code>stopped</code></li> </ul>
     *
     * @return The low byte represents the state. The high byte is an opaque internal
     *         value and should be ignored. <ul> <li><p><code>0</code> :
     *         <code>pending</code></li> <li><p><code>16</code> :
     *         <code>running</code></li> <li><p><code>32</code> :
     *         <code>shutting-down</code></li> <li><p><code>48</code> :
     *         <code>terminated</code></li> <li><p><code>64</code> :
     *         <code>stopping</code></li> <li><p><code>80</code> :
     *         <code>stopped</code></li> </ul>
     */
    public Integer getCode() {
        return code;
    }
    
    /**
     * The low byte represents the state. The high byte is an opaque internal
     * value and should be ignored. <ul> <li><p><code>0</code> :
     * <code>pending</code></li> <li><p><code>16</code> :
     * <code>running</code></li> <li><p><code>32</code> :
     * <code>shutting-down</code></li> <li><p><code>48</code> :
     * <code>terminated</code></li> <li><p><code>64</code> :
     * <code>stopping</code></li> <li><p><code>80</code> :
     * <code>stopped</code></li> </ul>
     *
     * @param code The low byte represents the state. The high byte is an opaque internal
     *         value and should be ignored. <ul> <li><p><code>0</code> :
     *         <code>pending</code></li> <li><p><code>16</code> :
     *         <code>running</code></li> <li><p><code>32</code> :
     *         <code>shutting-down</code></li> <li><p><code>48</code> :
     *         <code>terminated</code></li> <li><p><code>64</code> :
     *         <code>stopping</code></li> <li><p><code>80</code> :
     *         <code>stopped</code></li> </ul>
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    
    /**
     * The low byte represents the state. The high byte is an opaque internal
     * value and should be ignored. <ul> <li><p><code>0</code> :
     * <code>pending</code></li> <li><p><code>16</code> :
     * <code>running</code></li> <li><p><code>32</code> :
     * <code>shutting-down</code></li> <li><p><code>48</code> :
     * <code>terminated</code></li> <li><p><code>64</code> :
     * <code>stopping</code></li> <li><p><code>80</code> :
     * <code>stopped</code></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The low byte represents the state. The high byte is an opaque internal
     *         value and should be ignored. <ul> <li><p><code>0</code> :
     *         <code>pending</code></li> <li><p><code>16</code> :
     *         <code>running</code></li> <li><p><code>32</code> :
     *         <code>shutting-down</code></li> <li><p><code>48</code> :
     *         <code>terminated</code></li> <li><p><code>64</code> :
     *         <code>stopping</code></li> <li><p><code>80</code> :
     *         <code>stopped</code></li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceState withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated, stopping, stopped
     *
     * @return The current state of the instance.
     *
     * @see InstanceStateName
     */
    public String getName() {
        return name;
    }
    
    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated, stopping, stopped
     *
     * @param name The current state of the instance.
     *
     * @see InstanceStateName
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The current state of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated, stopping, stopped
     *
     * @param name The current state of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceStateName
     */
    public InstanceState withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated, stopping, stopped
     *
     * @param name The current state of the instance.
     *
     * @see InstanceStateName
     */
    public void setName(InstanceStateName name) {
        this.name = name.toString();
    }
    
    /**
     * The current state of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated, stopping, stopped
     *
     * @param name The current state of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceStateName
     */
    public InstanceState withName(InstanceStateName name) {
        this.name = name.toString();
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceState == false) return false;
        InstanceState other = (InstanceState)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    