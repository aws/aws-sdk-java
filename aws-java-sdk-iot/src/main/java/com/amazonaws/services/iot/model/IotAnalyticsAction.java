/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sends message data to an AWS IoT Analytics channel.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotAnalyticsAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The name of the IoT Analytics channel to which message data will be sent.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * Whether to process the action as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is delivered as a separate message when passed by <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more than 100
     * messages.
     * </p>
     */
    private Boolean batchMode;
    /**
     * <p>
     * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT
     * Analytics (iotanalytics:BatchPutMessage).
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
     * </p>
     * 
     * @param channelArn
     *        (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
     * </p>
     * 
     * @return (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
     * </p>
     * 
     * @param channelArn
     *        (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotAnalyticsAction withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The name of the IoT Analytics channel to which message data will be sent.
     * </p>
     * 
     * @param channelName
     *        The name of the IoT Analytics channel to which message data will be sent.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the IoT Analytics channel to which message data will be sent.
     * </p>
     * 
     * @return The name of the IoT Analytics channel to which message data will be sent.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the IoT Analytics channel to which message data will be sent.
     * </p>
     * 
     * @param channelName
     *        The name of the IoT Analytics channel to which message data will be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotAnalyticsAction withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * Whether to process the action as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is delivered as a separate message when passed by <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more than 100
     * messages.
     * </p>
     * 
     * @param batchMode
     *        Whether to process the action as a batch. The default value is <code>false</code>.</p>
     *        <p>
     *        When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each
     *        Array element is delivered as a separate message when passed by <a
     *        href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     *        <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more
     *        than 100 messages.
     */

    public void setBatchMode(Boolean batchMode) {
        this.batchMode = batchMode;
    }

    /**
     * <p>
     * Whether to process the action as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is delivered as a separate message when passed by <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more than 100
     * messages.
     * </p>
     * 
     * @return Whether to process the action as a batch. The default value is <code>false</code>.</p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each
     *         Array element is delivered as a separate message when passed by <a
     *         href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     *         <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more
     *         than 100 messages.
     */

    public Boolean getBatchMode() {
        return this.batchMode;
    }

    /**
     * <p>
     * Whether to process the action as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is delivered as a separate message when passed by <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more than 100
     * messages.
     * </p>
     * 
     * @param batchMode
     *        Whether to process the action as a batch. The default value is <code>false</code>.</p>
     *        <p>
     *        When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each
     *        Array element is delivered as a separate message when passed by <a
     *        href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     *        <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more
     *        than 100 messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotAnalyticsAction withBatchMode(Boolean batchMode) {
        setBatchMode(batchMode);
        return this;
    }

    /**
     * <p>
     * Whether to process the action as a batch. The default value is <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each Array
     * element is delivered as a separate message when passed by <a
     * href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     * <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more than 100
     * messages.
     * </p>
     * 
     * @return Whether to process the action as a batch. The default value is <code>false</code>.</p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code> and the rule SQL statement evaluates to an Array, each
     *         Array element is delivered as a separate message when passed by <a
     *         href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html">
     *         <code>BatchPutMessage</code> </a> to the AWS IoT Analytics channel. The resulting array can't have more
     *         than 100 messages.
     */

    public Boolean isBatchMode() {
        return this.batchMode;
    }

    /**
     * <p>
     * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT
     * Analytics (iotanalytics:BatchPutMessage).
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT
     *        Analytics (iotanalytics:BatchPutMessage).
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT
     * Analytics (iotanalytics:BatchPutMessage).
     * </p>
     * 
     * @return The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT
     *         Analytics (iotanalytics:BatchPutMessage).
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT
     * Analytics (iotanalytics:BatchPutMessage).
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT
     *        Analytics (iotanalytics:BatchPutMessage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotAnalyticsAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getBatchMode() != null)
            sb.append("BatchMode: ").append(getBatchMode()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotAnalyticsAction == false)
            return false;
        IotAnalyticsAction other = (IotAnalyticsAction) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getBatchMode() == null ^ this.getBatchMode() == null)
            return false;
        if (other.getBatchMode() != null && other.getBatchMode().equals(this.getBatchMode()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getBatchMode() == null) ? 0 : getBatchMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public IotAnalyticsAction clone() {
        try {
            return (IotAnalyticsAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.IotAnalyticsActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
