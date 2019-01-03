/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides status of the delivery of the snapshot or the configuration history to the specified Amazon S3 bucket. Also
 * provides the status of notifications about the Amazon S3 delivery to the specified Amazon SNS topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigExportDeliveryInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigExportDeliveryInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     */
    private String lastStatus;
    /**
     * <p>
     * The error code from the last attempted delivery.
     * </p>
     */
    private String lastErrorCode;
    /**
     * <p>
     * The error message from the last attempted delivery.
     * </p>
     */
    private String lastErrorMessage;
    /**
     * <p>
     * The time of the last attempted delivery.
     * </p>
     */
    private java.util.Date lastAttemptTime;
    /**
     * <p>
     * The time of the last successful delivery.
     * </p>
     */
    private java.util.Date lastSuccessfulTime;
    /**
     * <p>
     * The time that the next delivery occurs.
     * </p>
     */
    private java.util.Date nextDeliveryTime;

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * 
     * @param lastStatus
     *        Status of the last attempted delivery.
     * @see DeliveryStatus
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * 
     * @return Status of the last attempted delivery.
     * @see DeliveryStatus
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * 
     * @param lastStatus
     *        Status of the last attempted delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStatus
     */

    public ConfigExportDeliveryInfo withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * 
     * @param lastStatus
     *        Status of the last attempted delivery.
     * @see DeliveryStatus
     */

    public void setLastStatus(DeliveryStatus lastStatus) {
        withLastStatus(lastStatus);
    }

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * 
     * @param lastStatus
     *        Status of the last attempted delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStatus
     */

    public ConfigExportDeliveryInfo withLastStatus(DeliveryStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
        return this;
    }

    /**
     * <p>
     * The error code from the last attempted delivery.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code from the last attempted delivery.
     */

    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }

    /**
     * <p>
     * The error code from the last attempted delivery.
     * </p>
     * 
     * @return The error code from the last attempted delivery.
     */

    public String getLastErrorCode() {
        return this.lastErrorCode;
    }

    /**
     * <p>
     * The error code from the last attempted delivery.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code from the last attempted delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigExportDeliveryInfo withLastErrorCode(String lastErrorCode) {
        setLastErrorCode(lastErrorCode);
        return this;
    }

    /**
     * <p>
     * The error message from the last attempted delivery.
     * </p>
     * 
     * @param lastErrorMessage
     *        The error message from the last attempted delivery.
     */

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    /**
     * <p>
     * The error message from the last attempted delivery.
     * </p>
     * 
     * @return The error message from the last attempted delivery.
     */

    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }

    /**
     * <p>
     * The error message from the last attempted delivery.
     * </p>
     * 
     * @param lastErrorMessage
     *        The error message from the last attempted delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigExportDeliveryInfo withLastErrorMessage(String lastErrorMessage) {
        setLastErrorMessage(lastErrorMessage);
        return this;
    }

    /**
     * <p>
     * The time of the last attempted delivery.
     * </p>
     * 
     * @param lastAttemptTime
     *        The time of the last attempted delivery.
     */

    public void setLastAttemptTime(java.util.Date lastAttemptTime) {
        this.lastAttemptTime = lastAttemptTime;
    }

    /**
     * <p>
     * The time of the last attempted delivery.
     * </p>
     * 
     * @return The time of the last attempted delivery.
     */

    public java.util.Date getLastAttemptTime() {
        return this.lastAttemptTime;
    }

    /**
     * <p>
     * The time of the last attempted delivery.
     * </p>
     * 
     * @param lastAttemptTime
     *        The time of the last attempted delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigExportDeliveryInfo withLastAttemptTime(java.util.Date lastAttemptTime) {
        setLastAttemptTime(lastAttemptTime);
        return this;
    }

    /**
     * <p>
     * The time of the last successful delivery.
     * </p>
     * 
     * @param lastSuccessfulTime
     *        The time of the last successful delivery.
     */

    public void setLastSuccessfulTime(java.util.Date lastSuccessfulTime) {
        this.lastSuccessfulTime = lastSuccessfulTime;
    }

    /**
     * <p>
     * The time of the last successful delivery.
     * </p>
     * 
     * @return The time of the last successful delivery.
     */

    public java.util.Date getLastSuccessfulTime() {
        return this.lastSuccessfulTime;
    }

    /**
     * <p>
     * The time of the last successful delivery.
     * </p>
     * 
     * @param lastSuccessfulTime
     *        The time of the last successful delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigExportDeliveryInfo withLastSuccessfulTime(java.util.Date lastSuccessfulTime) {
        setLastSuccessfulTime(lastSuccessfulTime);
        return this;
    }

    /**
     * <p>
     * The time that the next delivery occurs.
     * </p>
     * 
     * @param nextDeliveryTime
     *        The time that the next delivery occurs.
     */

    public void setNextDeliveryTime(java.util.Date nextDeliveryTime) {
        this.nextDeliveryTime = nextDeliveryTime;
    }

    /**
     * <p>
     * The time that the next delivery occurs.
     * </p>
     * 
     * @return The time that the next delivery occurs.
     */

    public java.util.Date getNextDeliveryTime() {
        return this.nextDeliveryTime;
    }

    /**
     * <p>
     * The time that the next delivery occurs.
     * </p>
     * 
     * @param nextDeliveryTime
     *        The time that the next delivery occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigExportDeliveryInfo withNextDeliveryTime(java.util.Date nextDeliveryTime) {
        setNextDeliveryTime(nextDeliveryTime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLastStatus() != null)
            sb.append("LastStatus: ").append(getLastStatus()).append(",");
        if (getLastErrorCode() != null)
            sb.append("LastErrorCode: ").append(getLastErrorCode()).append(",");
        if (getLastErrorMessage() != null)
            sb.append("LastErrorMessage: ").append(getLastErrorMessage()).append(",");
        if (getLastAttemptTime() != null)
            sb.append("LastAttemptTime: ").append(getLastAttemptTime()).append(",");
        if (getLastSuccessfulTime() != null)
            sb.append("LastSuccessfulTime: ").append(getLastSuccessfulTime()).append(",");
        if (getNextDeliveryTime() != null)
            sb.append("NextDeliveryTime: ").append(getNextDeliveryTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigExportDeliveryInfo == false)
            return false;
        ConfigExportDeliveryInfo other = (ConfigExportDeliveryInfo) obj;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null)
            return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false)
            return false;
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null)
            return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false)
            return false;
        if (other.getLastAttemptTime() == null ^ this.getLastAttemptTime() == null)
            return false;
        if (other.getLastAttemptTime() != null && other.getLastAttemptTime().equals(this.getLastAttemptTime()) == false)
            return false;
        if (other.getLastSuccessfulTime() == null ^ this.getLastSuccessfulTime() == null)
            return false;
        if (other.getLastSuccessfulTime() != null && other.getLastSuccessfulTime().equals(this.getLastSuccessfulTime()) == false)
            return false;
        if (other.getNextDeliveryTime() == null ^ this.getNextDeliveryTime() == null)
            return false;
        if (other.getNextDeliveryTime() != null && other.getNextDeliveryTime().equals(this.getNextDeliveryTime()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getNextDeliveryTime() == null) ? 0 : getNextDeliveryTime().hashCode());
        return hashCode;
    }

    @Override
    public ConfigExportDeliveryInfo clone() {
        try {
            return (ConfigExportDeliveryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigExportDeliveryInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
