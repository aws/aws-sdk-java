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
 * <p>
 * Describes a state change for an Amazon EC2 instance.
 * </p>
 */
public class StateReason implements Serializable {

    /**
     * Reason code for the state change.
     */
    private String code;

    /**
     * Descriptive message for the state change.
     */
    private String message;

    /**
     * Reason code for the state change.
     *
     * @return Reason code for the state change.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Reason code for the state change.
     *
     * @param code Reason code for the state change.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Reason code for the state change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code Reason code for the state change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StateReason withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Descriptive message for the state change.
     *
     * @return Descriptive message for the state change.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Descriptive message for the state change.
     *
     * @param message Descriptive message for the state change.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Descriptive message for the state change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message Descriptive message for the state change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StateReason withMessage(String message) {
        this.message = message;
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
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StateReason == false) return false;
        StateReason other = (StateReason)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
}
    