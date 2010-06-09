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
 * The result of the GetConsoleOutput operation.
 * </p>
 */
public class GetConsoleOutputResult {

    /**
     * The ID of the instance whose console output was requested.
     */
    private String instanceId;

    /**
     * The time the output was last updated.
     */
    private java.util.Date timestamp;

    /**
     * The console output, Base64 encoded.
     */
    private String output;

    /**
     * The ID of the instance whose console output was requested.
     *
     * @return The ID of the instance whose console output was requested.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance whose console output was requested.
     *
     * @param instanceId The ID of the instance whose console output was requested.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance whose console output was requested.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance whose console output was requested.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetConsoleOutputResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The time the output was last updated.
     *
     * @return The time the output was last updated.
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }
    
    /**
     * The time the output was last updated.
     *
     * @param timestamp The time the output was last updated.
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * The time the output was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The time the output was last updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetConsoleOutputResult withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    
    /**
     * The console output, Base64 encoded.
     *
     * @return The console output, Base64 encoded.
     */
    public String getOutput() {
        return output;
    }
    
    /**
     * The console output, Base64 encoded.
     *
     * @param output The console output, Base64 encoded.
     */
    public void setOutput(String output) {
        this.output = output;
    }
    
    /**
     * The console output, Base64 encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param output The console output, Base64 encoded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetConsoleOutputResult withOutput(String output) {
        this.output = output;
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
        
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("Timestamp: " + timestamp + ", ");
        sb.append("Output: " + output + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    