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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * A list that contains the status of the delivery of the configuration
 * stream notification to the Amazon SNS topic.
 * </p>
 */
public class ConfigStreamDeliveryInfo implements Serializable, Cloneable {

    /**
     * Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     * topic on a <a
     * href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     * for AWS Config is optional. If the SNS delivery is turned off, the
     * last status will be <b>Not_Applicable</b>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure, Not_Applicable
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
     * The time from the last status change.
     */
    private java.util.Date lastStatusChangeTime;

    /**
     * Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     * topic on a <a
     * href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     * for AWS Config is optional. If the SNS delivery is turned off, the
     * last status will be <b>Not_Applicable</b>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure, Not_Applicable
     *
     * @return Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     *         topic on a <a
     *         href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *         for AWS Config is optional. If the SNS delivery is turned off, the
     *         last status will be <b>Not_Applicable</b>.
     *
     * @see DeliveryStatus
     */
    public String getLastStatus() {
        return lastStatus;
    }
    
    /**
     * Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     * topic on a <a
     * href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     * for AWS Config is optional. If the SNS delivery is turned off, the
     * last status will be <b>Not_Applicable</b>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure, Not_Applicable
     *
     * @param lastStatus Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     *         topic on a <a
     *         href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *         for AWS Config is optional. If the SNS delivery is turned off, the
     *         last status will be <b>Not_Applicable</b>.
     *
     * @see DeliveryStatus
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }
    
    /**
     * Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     * topic on a <a
     * href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     * for AWS Config is optional. If the SNS delivery is turned off, the
     * last status will be <b>Not_Applicable</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure, Not_Applicable
     *
     * @param lastStatus Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     *         topic on a <a
     *         href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *         for AWS Config is optional. If the SNS delivery is turned off, the
     *         last status will be <b>Not_Applicable</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeliveryStatus
     */
    public ConfigStreamDeliveryInfo withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     * topic on a <a
     * href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     * for AWS Config is optional. If the SNS delivery is turned off, the
     * last status will be <b>Not_Applicable</b>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure, Not_Applicable
     *
     * @param lastStatus Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     *         topic on a <a
     *         href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *         for AWS Config is optional. If the SNS delivery is turned off, the
     *         last status will be <b>Not_Applicable</b>.
     *
     * @see DeliveryStatus
     */
    public void setLastStatus(DeliveryStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
    }
    
    /**
     * Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     * topic on a <a
     * href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     * for AWS Config is optional. If the SNS delivery is turned off, the
     * last status will be <b>Not_Applicable</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure, Not_Applicable
     *
     * @param lastStatus Status of the last attempted delivery. <p><b>Note</b> Providing an SNS
     *         topic on a <a
     *         href="http://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *         for AWS Config is optional. If the SNS delivery is turned off, the
     *         last status will be <b>Not_Applicable</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeliveryStatus
     */
    public ConfigStreamDeliveryInfo withLastStatus(DeliveryStatus lastStatus) {
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
    public ConfigStreamDeliveryInfo withLastErrorCode(String lastErrorCode) {
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
    public ConfigStreamDeliveryInfo withLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
        return this;
    }

    /**
     * The time from the last status change.
     *
     * @return The time from the last status change.
     */
    public java.util.Date getLastStatusChangeTime() {
        return lastStatusChangeTime;
    }
    
    /**
     * The time from the last status change.
     *
     * @param lastStatusChangeTime The time from the last status change.
     */
    public void setLastStatusChangeTime(java.util.Date lastStatusChangeTime) {
        this.lastStatusChangeTime = lastStatusChangeTime;
    }
    
    /**
     * The time from the last status change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStatusChangeTime The time from the last status change.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigStreamDeliveryInfo withLastStatusChangeTime(java.util.Date lastStatusChangeTime) {
        this.lastStatusChangeTime = lastStatusChangeTime;
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
        if (getLastStatusChangeTime() != null) sb.append("LastStatusChangeTime: " + getLastStatusChangeTime() );
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
        hashCode = prime * hashCode + ((getLastStatusChangeTime() == null) ? 0 : getLastStatusChangeTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigStreamDeliveryInfo == false) return false;
        ConfigStreamDeliveryInfo other = (ConfigStreamDeliveryInfo)obj;
        
        if (other.getLastStatus() == null ^ this.getLastStatus() == null) return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false) return false; 
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null) return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false) return false; 
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null) return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false) return false; 
        if (other.getLastStatusChangeTime() == null ^ this.getLastStatusChangeTime() == null) return false;
        if (other.getLastStatusChangeTime() != null && other.getLastStatusChangeTime().equals(this.getLastStatusChangeTime()) == false) return false; 
        return true;
    }
    
    @Override
    public ConfigStreamDeliveryInfo clone() {
        try {
            return (ConfigStreamDeliveryInfo) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    