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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * The details of the step state change reason.
 * </p>
 */
public class StepStateChangeReason implements Serializable {

    /**
     * The programmable code for the state change reason.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE
     */
    private String code;

    /**
     * The descriptive message for the state change reason.
     */
    private String message;

    /**
     * The programmable code for the state change reason.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE
     *
     * @return The programmable code for the state change reason.
     *
     * @see StepStateChangeReasonCode
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The programmable code for the state change reason.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE
     *
     * @param code The programmable code for the state change reason.
     *
     * @see StepStateChangeReasonCode
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The programmable code for the state change reason.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE
     *
     * @param code The programmable code for the state change reason.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StepStateChangeReasonCode
     */
    public StepStateChangeReason withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The programmable code for the state change reason.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE
     *
     * @param code The programmable code for the state change reason.
     *
     * @see StepStateChangeReasonCode
     */
    public void setCode(StepStateChangeReasonCode code) {
        this.code = code.toString();
    }
    
    /**
     * The programmable code for the state change reason.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE
     *
     * @param code The programmable code for the state change reason.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StepStateChangeReasonCode
     */
    public StepStateChangeReason withCode(StepStateChangeReasonCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * The descriptive message for the state change reason.
     *
     * @return The descriptive message for the state change reason.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The descriptive message for the state change reason.
     *
     * @param message The descriptive message for the state change reason.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The descriptive message for the state change reason.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The descriptive message for the state change reason.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StepStateChangeReason withMessage(String message) {
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

        if (obj instanceof StepStateChangeReason == false) return false;
        StepStateChangeReason other = (StepStateChangeReason)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
}
    