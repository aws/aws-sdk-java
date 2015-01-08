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
 * Describes a state change.
 * </p>
 */
public class StateReason implements Serializable {

    /**
     * The reason code for the state change.
     */
    private String code;

    /**
     * The message for the state change. <ul>
     * <li><p><code>Server.SpotInstanceTermination</code>: A Spot Instance
     * was terminated due to an increase in the market price.</li>
     * <li><p><code>Server.InternalError</code>: An internal error occurred
     * during instance launch, resulting in termination.</li>
     * <li><p><code>Server.InsufficientInstanceCapacity</code>: There was
     * insufficient instance capacity to satisfy the launch request.</li>
     * <li><p><code>Client.InternalError</code>: A client error caused the
     * instance to terminate on launch.</li>
     * <li><p><code>Client.InstanceInitiatedShutdown</code>: The instance was
     * shut down using the <code>shutdown -h</code> command from the
     * instance.</li> <li><p><code>Client.UserInitiatedShutdown</code>: The
     * instance was shut down using the Amazon EC2 API.</li>
     * <li><p><code>Client.VolumeLimitExceeded</code>: The volume limit was
     * exceeded.</li> <li><p><code>Client.InvalidSnapshot.NotFound</code>:
     * The specified snapshot was not found.</li> </ul>
     */
    private String message;

    /**
     * The reason code for the state change.
     *
     * @return The reason code for the state change.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The reason code for the state change.
     *
     * @param code The reason code for the state change.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The reason code for the state change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The reason code for the state change.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StateReason withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The message for the state change. <ul>
     * <li><p><code>Server.SpotInstanceTermination</code>: A Spot Instance
     * was terminated due to an increase in the market price.</li>
     * <li><p><code>Server.InternalError</code>: An internal error occurred
     * during instance launch, resulting in termination.</li>
     * <li><p><code>Server.InsufficientInstanceCapacity</code>: There was
     * insufficient instance capacity to satisfy the launch request.</li>
     * <li><p><code>Client.InternalError</code>: A client error caused the
     * instance to terminate on launch.</li>
     * <li><p><code>Client.InstanceInitiatedShutdown</code>: The instance was
     * shut down using the <code>shutdown -h</code> command from the
     * instance.</li> <li><p><code>Client.UserInitiatedShutdown</code>: The
     * instance was shut down using the Amazon EC2 API.</li>
     * <li><p><code>Client.VolumeLimitExceeded</code>: The volume limit was
     * exceeded.</li> <li><p><code>Client.InvalidSnapshot.NotFound</code>:
     * The specified snapshot was not found.</li> </ul>
     *
     * @return The message for the state change. <ul>
     *         <li><p><code>Server.SpotInstanceTermination</code>: A Spot Instance
     *         was terminated due to an increase in the market price.</li>
     *         <li><p><code>Server.InternalError</code>: An internal error occurred
     *         during instance launch, resulting in termination.</li>
     *         <li><p><code>Server.InsufficientInstanceCapacity</code>: There was
     *         insufficient instance capacity to satisfy the launch request.</li>
     *         <li><p><code>Client.InternalError</code>: A client error caused the
     *         instance to terminate on launch.</li>
     *         <li><p><code>Client.InstanceInitiatedShutdown</code>: The instance was
     *         shut down using the <code>shutdown -h</code> command from the
     *         instance.</li> <li><p><code>Client.UserInitiatedShutdown</code>: The
     *         instance was shut down using the Amazon EC2 API.</li>
     *         <li><p><code>Client.VolumeLimitExceeded</code>: The volume limit was
     *         exceeded.</li> <li><p><code>Client.InvalidSnapshot.NotFound</code>:
     *         The specified snapshot was not found.</li> </ul>
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The message for the state change. <ul>
     * <li><p><code>Server.SpotInstanceTermination</code>: A Spot Instance
     * was terminated due to an increase in the market price.</li>
     * <li><p><code>Server.InternalError</code>: An internal error occurred
     * during instance launch, resulting in termination.</li>
     * <li><p><code>Server.InsufficientInstanceCapacity</code>: There was
     * insufficient instance capacity to satisfy the launch request.</li>
     * <li><p><code>Client.InternalError</code>: A client error caused the
     * instance to terminate on launch.</li>
     * <li><p><code>Client.InstanceInitiatedShutdown</code>: The instance was
     * shut down using the <code>shutdown -h</code> command from the
     * instance.</li> <li><p><code>Client.UserInitiatedShutdown</code>: The
     * instance was shut down using the Amazon EC2 API.</li>
     * <li><p><code>Client.VolumeLimitExceeded</code>: The volume limit was
     * exceeded.</li> <li><p><code>Client.InvalidSnapshot.NotFound</code>:
     * The specified snapshot was not found.</li> </ul>
     *
     * @param message The message for the state change. <ul>
     *         <li><p><code>Server.SpotInstanceTermination</code>: A Spot Instance
     *         was terminated due to an increase in the market price.</li>
     *         <li><p><code>Server.InternalError</code>: An internal error occurred
     *         during instance launch, resulting in termination.</li>
     *         <li><p><code>Server.InsufficientInstanceCapacity</code>: There was
     *         insufficient instance capacity to satisfy the launch request.</li>
     *         <li><p><code>Client.InternalError</code>: A client error caused the
     *         instance to terminate on launch.</li>
     *         <li><p><code>Client.InstanceInitiatedShutdown</code>: The instance was
     *         shut down using the <code>shutdown -h</code> command from the
     *         instance.</li> <li><p><code>Client.UserInitiatedShutdown</code>: The
     *         instance was shut down using the Amazon EC2 API.</li>
     *         <li><p><code>Client.VolumeLimitExceeded</code>: The volume limit was
     *         exceeded.</li> <li><p><code>Client.InvalidSnapshot.NotFound</code>:
     *         The specified snapshot was not found.</li> </ul>
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The message for the state change. <ul>
     * <li><p><code>Server.SpotInstanceTermination</code>: A Spot Instance
     * was terminated due to an increase in the market price.</li>
     * <li><p><code>Server.InternalError</code>: An internal error occurred
     * during instance launch, resulting in termination.</li>
     * <li><p><code>Server.InsufficientInstanceCapacity</code>: There was
     * insufficient instance capacity to satisfy the launch request.</li>
     * <li><p><code>Client.InternalError</code>: A client error caused the
     * instance to terminate on launch.</li>
     * <li><p><code>Client.InstanceInitiatedShutdown</code>: The instance was
     * shut down using the <code>shutdown -h</code> command from the
     * instance.</li> <li><p><code>Client.UserInitiatedShutdown</code>: The
     * instance was shut down using the Amazon EC2 API.</li>
     * <li><p><code>Client.VolumeLimitExceeded</code>: The volume limit was
     * exceeded.</li> <li><p><code>Client.InvalidSnapshot.NotFound</code>:
     * The specified snapshot was not found.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The message for the state change. <ul>
     *         <li><p><code>Server.SpotInstanceTermination</code>: A Spot Instance
     *         was terminated due to an increase in the market price.</li>
     *         <li><p><code>Server.InternalError</code>: An internal error occurred
     *         during instance launch, resulting in termination.</li>
     *         <li><p><code>Server.InsufficientInstanceCapacity</code>: There was
     *         insufficient instance capacity to satisfy the launch request.</li>
     *         <li><p><code>Client.InternalError</code>: A client error caused the
     *         instance to terminate on launch.</li>
     *         <li><p><code>Client.InstanceInitiatedShutdown</code>: The instance was
     *         shut down using the <code>shutdown -h</code> command from the
     *         instance.</li> <li><p><code>Client.UserInitiatedShutdown</code>: The
     *         instance was shut down using the Amazon EC2 API.</li>
     *         <li><p><code>Client.VolumeLimitExceeded</code>: The volume limit was
     *         exceeded.</li> <li><p><code>Client.InvalidSnapshot.NotFound</code>:
     *         The specified snapshot was not found.</li> </ul>
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
    