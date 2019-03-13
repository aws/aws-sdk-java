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
 * A list that contains the status of the delivery of the configuration stream notification to the Amazon SNS topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigStreamDeliveryInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigStreamDeliveryInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * <p>
     * <b>Note</b> Providing an SNS topic on a <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a> for
     * AWS Config is optional. If the SNS delivery is turned off, the last status will be <b>Not_Applicable</b>.
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
     * The time from the last status change.
     * </p>
     */
    private java.util.Date lastStatusChangeTime;

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * <p>
     * <b>Note</b> Providing an SNS topic on a <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a> for
     * AWS Config is optional. If the SNS delivery is turned off, the last status will be <b>Not_Applicable</b>.
     * </p>
     * 
     * @param lastStatus
     *        Status of the last attempted delivery.</p>
     *        <p>
     *        <b>Note</b> Providing an SNS topic on a <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *        for AWS Config is optional. If the SNS delivery is turned off, the last status will be
     *        <b>Not_Applicable</b>.
     * @see DeliveryStatus
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * <p>
     * <b>Note</b> Providing an SNS topic on a <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a> for
     * AWS Config is optional. If the SNS delivery is turned off, the last status will be <b>Not_Applicable</b>.
     * </p>
     * 
     * @return Status of the last attempted delivery.</p>
     *         <p>
     *         <b>Note</b> Providing an SNS topic on a <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html"
     *         >DeliveryChannel</a> for AWS Config is optional. If the SNS delivery is turned off, the last status will
     *         be <b>Not_Applicable</b>.
     * @see DeliveryStatus
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * <p>
     * <b>Note</b> Providing an SNS topic on a <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a> for
     * AWS Config is optional. If the SNS delivery is turned off, the last status will be <b>Not_Applicable</b>.
     * </p>
     * 
     * @param lastStatus
     *        Status of the last attempted delivery.</p>
     *        <p>
     *        <b>Note</b> Providing an SNS topic on a <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *        for AWS Config is optional. If the SNS delivery is turned off, the last status will be
     *        <b>Not_Applicable</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStatus
     */

    public ConfigStreamDeliveryInfo withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * <p>
     * <b>Note</b> Providing an SNS topic on a <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a> for
     * AWS Config is optional. If the SNS delivery is turned off, the last status will be <b>Not_Applicable</b>.
     * </p>
     * 
     * @param lastStatus
     *        Status of the last attempted delivery.</p>
     *        <p>
     *        <b>Note</b> Providing an SNS topic on a <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *        for AWS Config is optional. If the SNS delivery is turned off, the last status will be
     *        <b>Not_Applicable</b>.
     * @see DeliveryStatus
     */

    public void setLastStatus(DeliveryStatus lastStatus) {
        withLastStatus(lastStatus);
    }

    /**
     * <p>
     * Status of the last attempted delivery.
     * </p>
     * <p>
     * <b>Note</b> Providing an SNS topic on a <a
     * href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a> for
     * AWS Config is optional. If the SNS delivery is turned off, the last status will be <b>Not_Applicable</b>.
     * </p>
     * 
     * @param lastStatus
     *        Status of the last attempted delivery.</p>
     *        <p>
     *        <b>Note</b> Providing an SNS topic on a <a
     *        href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeliveryChannel.html">DeliveryChannel</a>
     *        for AWS Config is optional. If the SNS delivery is turned off, the last status will be
     *        <b>Not_Applicable</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStatus
     */

    public ConfigStreamDeliveryInfo withLastStatus(DeliveryStatus lastStatus) {
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

    public ConfigStreamDeliveryInfo withLastErrorCode(String lastErrorCode) {
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

    public ConfigStreamDeliveryInfo withLastErrorMessage(String lastErrorMessage) {
        setLastErrorMessage(lastErrorMessage);
        return this;
    }

    /**
     * <p>
     * The time from the last status change.
     * </p>
     * 
     * @param lastStatusChangeTime
     *        The time from the last status change.
     */

    public void setLastStatusChangeTime(java.util.Date lastStatusChangeTime) {
        this.lastStatusChangeTime = lastStatusChangeTime;
    }

    /**
     * <p>
     * The time from the last status change.
     * </p>
     * 
     * @return The time from the last status change.
     */

    public java.util.Date getLastStatusChangeTime() {
        return this.lastStatusChangeTime;
    }

    /**
     * <p>
     * The time from the last status change.
     * </p>
     * 
     * @param lastStatusChangeTime
     *        The time from the last status change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigStreamDeliveryInfo withLastStatusChangeTime(java.util.Date lastStatusChangeTime) {
        setLastStatusChangeTime(lastStatusChangeTime);
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
        if (getLastStatusChangeTime() != null)
            sb.append("LastStatusChangeTime: ").append(getLastStatusChangeTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigStreamDeliveryInfo == false)
            return false;
        ConfigStreamDeliveryInfo other = (ConfigStreamDeliveryInfo) obj;
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
        if (other.getLastStatusChangeTime() == null ^ this.getLastStatusChangeTime() == null)
            return false;
        if (other.getLastStatusChangeTime() != null && other.getLastStatusChangeTime().equals(this.getLastStatusChangeTime()) == false)
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
        hashCode = prime * hashCode + ((getLastStatusChangeTime() == null) ? 0 : getLastStatusChangeTime().hashCode());
        return hashCode;
    }

    @Override
    public ConfigStreamDeliveryInfo clone() {
        try {
            return (ConfigStreamDeliveryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigStreamDeliveryInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
