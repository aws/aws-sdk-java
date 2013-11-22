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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Provides a list of status information for a DB instance.
 * </p>
 */
public class DBInstanceStatusInfo implements Serializable {

    /**
     * This value is currently "read replication."
     */
    private String statusType;

    /**
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     */
    private Boolean normal;

    /**
     * Status of the DB instance. For a StatusType of read replica, the
     * values can be replicating, error, stopped, or terminated.
     */
    private String status;

    /**
     * Details of the error if there is an error for the instance. If the
     * instance is not in an error state, this value is blank.
     */
    private String message;

    /**
     * This value is currently "read replication."
     *
     * @return This value is currently "read replication."
     */
    public String getStatusType() {
        return statusType;
    }
    
    /**
     * This value is currently "read replication."
     *
     * @param statusType This value is currently "read replication."
     */
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }
    
    /**
     * This value is currently "read replication."
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusType This value is currently "read replication."
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstanceStatusInfo withStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     *
     * @return Boolean value that is true if the instance is operating normally, or
     *         false if the instance is in an error state.
     */
    public Boolean isNormal() {
        return normal;
    }
    
    /**
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     *
     * @param normal Boolean value that is true if the instance is operating normally, or
     *         false if the instance is in an error state.
     */
    public void setNormal(Boolean normal) {
        this.normal = normal;
    }
    
    /**
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param normal Boolean value that is true if the instance is operating normally, or
     *         false if the instance is in an error state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstanceStatusInfo withNormal(Boolean normal) {
        this.normal = normal;
        return this;
    }

    /**
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     *
     * @return Boolean value that is true if the instance is operating normally, or
     *         false if the instance is in an error state.
     */
    public Boolean getNormal() {
        return normal;
    }

    /**
     * Status of the DB instance. For a StatusType of read replica, the
     * values can be replicating, error, stopped, or terminated.
     *
     * @return Status of the DB instance. For a StatusType of read replica, the
     *         values can be replicating, error, stopped, or terminated.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Status of the DB instance. For a StatusType of read replica, the
     * values can be replicating, error, stopped, or terminated.
     *
     * @param status Status of the DB instance. For a StatusType of read replica, the
     *         values can be replicating, error, stopped, or terminated.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Status of the DB instance. For a StatusType of read replica, the
     * values can be replicating, error, stopped, or terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Status of the DB instance. For a StatusType of read replica, the
     *         values can be replicating, error, stopped, or terminated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstanceStatusInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Details of the error if there is an error for the instance. If the
     * instance is not in an error state, this value is blank.
     *
     * @return Details of the error if there is an error for the instance. If the
     *         instance is not in an error state, this value is blank.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Details of the error if there is an error for the instance. If the
     * instance is not in an error state, this value is blank.
     *
     * @param message Details of the error if there is an error for the instance. If the
     *         instance is not in an error state, this value is blank.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Details of the error if there is an error for the instance. If the
     * instance is not in an error state, this value is blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message Details of the error if there is an error for the instance. If the
     *         instance is not in an error state, this value is blank.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstanceStatusInfo withMessage(String message) {
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
        if (getStatusType() != null) sb.append("StatusType: " + getStatusType() + ",");
        if (isNormal() != null) sb.append("Normal: " + isNormal() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatusType() == null) ? 0 : getStatusType().hashCode()); 
        hashCode = prime * hashCode + ((isNormal() == null) ? 0 : isNormal().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBInstanceStatusInfo == false) return false;
        DBInstanceStatusInfo other = (DBInstanceStatusInfo)obj;
        
        if (other.getStatusType() == null ^ this.getStatusType() == null) return false;
        if (other.getStatusType() != null && other.getStatusType().equals(this.getStatusType()) == false) return false; 
        if (other.isNormal() == null ^ this.isNormal() == null) return false;
        if (other.isNormal() != null && other.isNormal().equals(this.isNormal()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
}
    