/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * A list that contains the status of the delivery of either the snapshot
 * or the configuration history to the specified Amazon S3 bucket.
 * </p>
 */
public class ConfigExportDeliveryInfo implements Serializable {

    /**
     * Status of the last attempted delivery.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     */
    private String lastStatus;

    /**
     * The error code from the last attempted delivery.
     */
    private String lastErrorCode;

    /**
     * The error message from the last attempted delivery.
     */
    private String lastErrorMessage;

    /**
     * The time of the last attempted delivery.
     */
    private java.util.Date lastAttemptTime;

    /**
     * The time of the last successful delivery.
     */
    private java.util.Date lastSuccessfulTime;

    /**
     * Status of the last attempted delivery.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @return Status of the last attempted delivery.
     *
     * @see DeliveryStatus
     */
    public String getLastStatus() {
        return lastStatus;
    }
    
    /**
     * Status of the last attempted delivery.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param lastStatus Status of the last attempted delivery.
     *
     * @see DeliveryStatus
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }
    
    /**
     * Status of the last attempted delivery.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param lastStatus Status of the last attempted delivery.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeliveryStatus
     */
    public ConfigExportDeliveryInfo withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * Status of the last attempted delivery.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param lastStatus Status of the last attempted delivery.
     *
     * @see DeliveryStatus
     */
    public void setLastStatus(DeliveryStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
    }
    
    /**
     * Status of the last attempted delivery.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param lastStatus Status of the last attempted delivery.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeliveryStatus
     */
    public ConfigExportDeliveryInfo withLastStatus(DeliveryStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
        return this;
    }

    /**
     * The error code from the last attempted delivery.
     *
     * @return The error code from the last attempted delivery.
     */
    public String getLastErrorCode() {
        return lastErrorCode;
    }
    
    /**
     * The error code from the last attempted delivery.
     *
     * @param lastErrorCode The error code from the last attempted delivery.
     */
    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }
    
    /**
     * The error code from the last attempted delivery.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastErrorCode The error code from the last attempted delivery.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigExportDeliveryInfo withLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
        return this;
    }

    /**
     * The error message from the last attempted delivery.
     *
     * @return The error message from the last attempted delivery.
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
    
    /**
     * The error message from the last attempted delivery.
     *
     * @param lastErrorMessage The error message from the last attempted delivery.
     */
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }
    
    /**
     * The error message from the last attempted delivery.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastErrorMessage The error message from the last attempted delivery.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigExportDeliveryInfo withLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
        return this;
    }

    /**
     * The time of the last attempted delivery.
     *
     * @return The time of the last attempted delivery.
     */
    public java.util.Date getLastAttemptTime() {
        return lastAttemptTime;
    }
    
    /**
     * The time of the last attempted delivery.
     *
     * @param lastAttemptTime The time of the last attempted delivery.
     */
    public void setLastAttemptTime(java.util.Date lastAttemptTime) {
        this.lastAttemptTime = lastAttemptTime;
    }
    
    /**
     * The time of the last attempted delivery.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastAttemptTime The time of the last attempted delivery.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigExportDeliveryInfo withLastAttemptTime(java.util.Date lastAttemptTime) {
        this.lastAttemptTime = lastAttemptTime;
        return this;
    }

    /**
     * The time of the last successful delivery.
     *
     * @return The time of the last successful delivery.
     */
    public java.util.Date getLastSuccessfulTime() {
        return lastSuccessfulTime;
    }
    
    /**
     * The time of the last successful delivery.
     *
     * @param lastSuccessfulTime The time of the last successful delivery.
     */
    public void setLastSuccessfulTime(java.util.Date lastSuccessfulTime) {
        this.lastSuccessfulTime = lastSuccessfulTime;
    }
    
    /**
     * The time of the last successful delivery.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastSuccessfulTime The time of the last successful delivery.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigExportDeliveryInfo withLastSuccessfulTime(java.util.Date lastSuccessfulTime) {
        this.lastSuccessfulTime = lastSuccessfulTime;
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
        if (getLastStatus() != null) sb.append("LastStatus: " + getLastStatus() + ",");
        if (getLastErrorCode() != null) sb.append("LastErrorCode: " + getLastErrorCode() + ",");
        if (getLastErrorMessage() != null) sb.append("LastErrorMessage: " + getLastErrorMessage() + ",");
        if (getLastAttemptTime() != null) sb.append("LastAttemptTime: " + getLastAttemptTime() + ",");
        if (getLastSuccessfulTime() != null) sb.append("LastSuccessfulTime: " + getLastSuccessfulTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode()); 
        hashCode = prime * hashCode + ((getLastErrorCode() == null) ? 0 : getLastErrorCode().hashCode()); 
        hashCode = prime * hashCode + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode()); 
        hashCode = prime * hashCode + ((getLastAttemptTime() == null) ? 0 : getLastAttemptTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastSuccessfulTime() == null) ? 0 : getLastSuccessfulTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigExportDeliveryInfo == false) return false;
        ConfigExportDeliveryInfo other = (ConfigExportDeliveryInfo)obj;
        
        if (other.getLastStatus() == null ^ this.getLastStatus() == null) return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false) return false; 
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null) return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false) return false; 
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null) return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false) return false; 
        if (other.getLastAttemptTime() == null ^ this.getLastAttemptTime() == null) return false;
        if (other.getLastAttemptTime() != null && other.getLastAttemptTime().equals(this.getLastAttemptTime()) == false) return false; 
        if (other.getLastSuccessfulTime() == null ^ this.getLastSuccessfulTime() == null) return false;
        if (other.getLastSuccessfulTime() != null && other.getLastSuccessfulTime().equals(this.getLastSuccessfulTime()) == false) return false; 
        return true;
    }
    
}
    