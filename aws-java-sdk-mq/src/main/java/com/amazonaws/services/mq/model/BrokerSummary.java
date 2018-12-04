/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The Amazon Resource Name (ARN) of the broker.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/BrokerSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerSummary implements Serializable, Cloneable, StructuredPojo {

    /** The Amazon Resource Name (ARN) of the broker. */
    private String brokerArn;
    /** The unique ID that Amazon MQ generates for the broker. */
    private String brokerId;
    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     */
    private String brokerName;
    /**
     * The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING,
     * REBOOT_IN_PROGRESS
     */
    private String brokerState;
    /**
     * Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     * SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ creates
     * an active/standby broker for high availability.
     */
    private String deploymentMode;
    /** The broker's instance type. Possible values: mq.t2.micro, mq.m4.large */
    private String hostInstanceType;

    /**
     * The Amazon Resource Name (ARN) of the broker.
     * 
     * @param brokerArn
     *        The Amazon Resource Name (ARN) of the broker.
     */

    public void setBrokerArn(String brokerArn) {
        this.brokerArn = brokerArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the broker.
     * 
     * @return The Amazon Resource Name (ARN) of the broker.
     */

    public String getBrokerArn() {
        return this.brokerArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the broker.
     * 
     * @param brokerArn
     *        The Amazon Resource Name (ARN) of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSummary withBrokerArn(String brokerArn) {
        setBrokerArn(brokerArn);
        return this;
    }

    /**
     * The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * The unique ID that Amazon MQ generates for the broker.
     * 
     * @return The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSummary withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @param brokerName
     *        The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *        only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *        characters, or special characters.
     */

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @return The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *         only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *         characters, or special characters.
     */

    public String getBrokerName() {
        return this.brokerName;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @param brokerName
     *        The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *        only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *        characters, or special characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSummary withBrokerName(String brokerName) {
        setBrokerName(brokerName);
        return this;
    }

    /**
     * The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING,
     * REBOOT_IN_PROGRESS
     * 
     * @param brokerState
     *        The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS,
     *        RUNNING, REBOOT_IN_PROGRESS
     * @see BrokerState
     */

    public void setBrokerState(String brokerState) {
        this.brokerState = brokerState;
    }

    /**
     * The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING,
     * REBOOT_IN_PROGRESS
     * 
     * @return The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS,
     *         RUNNING, REBOOT_IN_PROGRESS
     * @see BrokerState
     */

    public String getBrokerState() {
        return this.brokerState;
    }

    /**
     * The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING,
     * REBOOT_IN_PROGRESS
     * 
     * @param brokerState
     *        The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS,
     *        RUNNING, REBOOT_IN_PROGRESS
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerState
     */

    public BrokerSummary withBrokerState(String brokerState) {
        setBrokerState(brokerState);
        return this;
    }

    /**
     * The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING,
     * REBOOT_IN_PROGRESS
     * 
     * @param brokerState
     *        The status of the broker. Possible values: CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS,
     *        RUNNING, REBOOT_IN_PROGRESS
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerState
     */

    public BrokerSummary withBrokerState(BrokerState brokerState) {
        this.brokerState = brokerState.toString();
        return this;
    }

    /**
     * Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     * SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ creates
     * an active/standby broker for high availability.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     *        SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ
     *        creates an active/standby broker for high availability.
     * @see DeploymentMode
     */

    public void setDeploymentMode(String deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    /**
     * Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     * SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ creates
     * an active/standby broker for high availability.
     * 
     * @return Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     *         SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ
     *         creates an active/standby broker for high availability.
     * @see DeploymentMode
     */

    public String getDeploymentMode() {
        return this.deploymentMode;
    }

    /**
     * Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     * SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ creates
     * an active/standby broker for high availability.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     *        SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ
     *        creates an active/standby broker for high availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public BrokerSummary withDeploymentMode(String deploymentMode) {
        setDeploymentMode(deploymentMode);
        return this;
    }

    /**
     * Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     * SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ creates
     * an active/standby broker for high availability.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker. Possible values: SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ
     *        SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ
     *        creates an active/standby broker for high availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public BrokerSummary withDeploymentMode(DeploymentMode deploymentMode) {
        this.deploymentMode = deploymentMode.toString();
        return this;
    }

    /**
     * The broker's instance type. Possible values: mq.t2.micro, mq.m4.large
     * 
     * @param hostInstanceType
     *        The broker's instance type. Possible values: mq.t2.micro, mq.m4.large
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * The broker's instance type. Possible values: mq.t2.micro, mq.m4.large
     * 
     * @return The broker's instance type. Possible values: mq.t2.micro, mq.m4.large
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * The broker's instance type. Possible values: mq.t2.micro, mq.m4.large
     * 
     * @param hostInstanceType
     *        The broker's instance type. Possible values: mq.t2.micro, mq.m4.large
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSummary withHostInstanceType(String hostInstanceType) {
        setHostInstanceType(hostInstanceType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBrokerArn() != null)
            sb.append("BrokerArn: ").append(getBrokerArn()).append(",");
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getBrokerName() != null)
            sb.append("BrokerName: ").append(getBrokerName()).append(",");
        if (getBrokerState() != null)
            sb.append("BrokerState: ").append(getBrokerState()).append(",");
        if (getDeploymentMode() != null)
            sb.append("DeploymentMode: ").append(getDeploymentMode()).append(",");
        if (getHostInstanceType() != null)
            sb.append("HostInstanceType: ").append(getHostInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerSummary == false)
            return false;
        BrokerSummary other = (BrokerSummary) obj;
        if (other.getBrokerArn() == null ^ this.getBrokerArn() == null)
            return false;
        if (other.getBrokerArn() != null && other.getBrokerArn().equals(this.getBrokerArn()) == false)
            return false;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getBrokerName() == null ^ this.getBrokerName() == null)
            return false;
        if (other.getBrokerName() != null && other.getBrokerName().equals(this.getBrokerName()) == false)
            return false;
        if (other.getBrokerState() == null ^ this.getBrokerState() == null)
            return false;
        if (other.getBrokerState() != null && other.getBrokerState().equals(this.getBrokerState()) == false)
            return false;
        if (other.getDeploymentMode() == null ^ this.getDeploymentMode() == null)
            return false;
        if (other.getDeploymentMode() != null && other.getDeploymentMode().equals(this.getDeploymentMode()) == false)
            return false;
        if (other.getHostInstanceType() == null ^ this.getHostInstanceType() == null)
            return false;
        if (other.getHostInstanceType() != null && other.getHostInstanceType().equals(this.getHostInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerArn() == null) ? 0 : getBrokerArn().hashCode());
        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getBrokerName() == null) ? 0 : getBrokerName().hashCode());
        hashCode = prime * hashCode + ((getBrokerState() == null) ? 0 : getBrokerState().hashCode());
        hashCode = prime * hashCode + ((getDeploymentMode() == null) ? 0 : getDeploymentMode().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public BrokerSummary clone() {
        try {
            return (BrokerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.BrokerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
