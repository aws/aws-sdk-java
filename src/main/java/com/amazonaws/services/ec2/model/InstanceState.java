/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Represents the state of an Amazon EC2 instance.
 * </p>
 */
public class InstanceState {

    /**
     * A 16-bit unsigned integer. The high byte is an opaque internal value
     * and should be ignored. The low byte is set based on the state
     * represented.
     */
    private Integer code;

    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated
     */
    private String name;

    /**
     * A 16-bit unsigned integer. The high byte is an opaque internal value
     * and should be ignored. The low byte is set based on the state
     * represented.
     *
     * @return A 16-bit unsigned integer. The high byte is an opaque internal value
     *         and should be ignored. The low byte is set based on the state
     *         represented.
     */
    public Integer getCode() {
        return code;
    }
    
    /**
     * A 16-bit unsigned integer. The high byte is an opaque internal value
     * and should be ignored. The low byte is set based on the state
     * represented.
     *
     * @param code A 16-bit unsigned integer. The high byte is an opaque internal value
     *         and should be ignored. The low byte is set based on the state
     *         represented.
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    
    /**
     * A 16-bit unsigned integer. The high byte is an opaque internal value
     * and should be ignored. The low byte is set based on the state
     * represented.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code A 16-bit unsigned integer. The high byte is an opaque internal value
     *         and should be ignored. The low byte is set based on the state
     *         represented.
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
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated
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
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated
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
     * <b>Allowed Values: </b>pending, running, shutting-down, terminated
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
        
        sb.append("Code: " + code + ", ");
        sb.append("Name: " + name + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    