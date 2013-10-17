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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an AWS OpsWorks service error.
 * </p>
 */
public class ServiceError implements Serializable {

    /**
     * The error ID.
     */
    private String serviceErrorId;

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The error type.
     */
    private String type;

    /**
     * A message that describes the error.
     */
    private String message;

    /**
     * When the error occurred.
     */
    private String createdAt;

    /**
     * The error ID.
     *
     * @return The error ID.
     */
    public String getServiceErrorId() {
        return serviceErrorId;
    }
    
    /**
     * The error ID.
     *
     * @param serviceErrorId The error ID.
     */
    public void setServiceErrorId(String serviceErrorId) {
        this.serviceErrorId = serviceErrorId;
    }
    
    /**
     * The error ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceErrorId The error ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServiceError withServiceErrorId(String serviceErrorId) {
        this.serviceErrorId = serviceErrorId;
        return this;
    }

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServiceError withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServiceError withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The error type.
     *
     * @return The error type.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The error type.
     *
     * @param type The error type.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The error type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The error type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServiceError withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * A message that describes the error.
     *
     * @return A message that describes the error.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A message that describes the error.
     *
     * @param message A message that describes the error.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A message that describes the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message A message that describes the error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServiceError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * When the error occurred.
     *
     * @return When the error occurred.
     */
    public String getCreatedAt() {
        return createdAt;
    }
    
    /**
     * When the error occurred.
     *
     * @param createdAt When the error occurred.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * When the error occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt When the error occurred.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServiceError withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
        if (getServiceErrorId() != null) sb.append("ServiceErrorId: " + getServiceErrorId() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServiceErrorId() == null) ? 0 : getServiceErrorId().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ServiceError == false) return false;
        ServiceError other = (ServiceError)obj;
        
        if (other.getServiceErrorId() == null ^ this.getServiceErrorId() == null) return false;
        if (other.getServiceErrorId() != null && other.getServiceErrorId().equals(this.getServiceErrorId()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        return true;
    }
    
}
    