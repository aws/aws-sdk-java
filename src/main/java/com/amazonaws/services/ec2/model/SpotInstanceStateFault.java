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
 * 
 * </p>
 */
public class SpotInstanceStateFault {

    /**
     * 
     */
    private String code;

    /**
     * 
     */
    private String message;

    /**
     * 
     *
     * @return 
     */
    public String getCode() {
        return code;
    }
    
    /**
     * 
     *
     * @param code 
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceStateFault withCode(String code) {
        this.code = code;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * 
     *
     * @param message 
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceStateFault withMessage(String message) {
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
        
        sb.append("Code: " + code + ", ");
        sb.append("Message: " + message + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    