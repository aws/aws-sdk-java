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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about all brokers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/BrokerSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The broker's Amazon Resource Name (ARN).
     * </p>
     */
    private String brokerArn;
    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     */
    private String brokerId;
    /**
     * <p>
     * The broker's name. This value is unique in your AWS account, 1-50 characters long, and containing only letters,
     * numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters, or special
     * characters.
     * </p>
     */
    private String brokerName;
    /**
     * <p>
     * The broker's status.
     * </p>
     */
    private String brokerState;
    /**
     * <p>
     * The time when the broker was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     */
    private String deploymentMode;
    /**
     * <p>
     * The type of broker engine.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The broker's instance type.
     * </p>
     */
    private String hostInstanceType;

    /**
     * <p>
     * The broker's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param brokerArn
     *        The broker's Amazon Resource Name (ARN).
     */

    public void setBrokerArn(String brokerArn) {
        this.brokerArn = brokerArn;
    }

    /**
     * <p>
     * The broker's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The broker's Amazon Resource Name (ARN).
     */

    public String getBrokerArn() {
        return this.brokerArn;
    }

    /**
     * <p>
     * The broker's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param brokerArn
     *        The broker's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSummary withBrokerArn(String brokerArn) {
        setBrokerArn(brokerArn);
        return this;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @return The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
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
     * <p>
     * The broker's name. This value is unique in your AWS account, 1-50 characters long, and containing only letters,
     * numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters, or special
     * characters.
     * </p>
     * 
     * @param brokerName
     *        The broker's name. This value is unique in your AWS account, 1-50 characters long, and containing only
     *        letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard
     *        characters, or special characters.
     */

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    /**
     * <p>
     * The broker's name. This value is unique in your AWS account, 1-50 characters long, and containing only letters,
     * numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters, or special
     * characters.
     * </p>
     * 
     * @return The broker's name. This value is unique in your AWS account, 1-50 characters long, and containing only
     *         letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard
     *         characters, or special characters.
     */

    public String getBrokerName() {
        return this.brokerName;
    }

    /**
     * <p>
     * The broker's name. This value is unique in your AWS account, 1-50 characters long, and containing only letters,
     * numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters, or special
     * characters.
     * </p>
     * 
     * @param brokerName
     *        The broker's name. This value is unique in your AWS account, 1-50 characters long, and containing only
     *        letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard
     *        characters, or special characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSummary withBrokerName(String brokerName) {
        setBrokerName(brokerName);
        return this;
    }

    /**
     * <p>
     * The broker's status.
     * </p>
     * 
     * @param brokerState
     *        The broker's status.
     * @see BrokerState
     */

    public void setBrokerState(String brokerState) {
        this.brokerState = brokerState;
    }

    /**
     * <p>
     * The broker's status.
     * </p>
     * 
     * @return The broker's status.
     * @see BrokerState
     */

    public String getBrokerState() {
        return this.brokerState;
    }

    /**
     * <p>
     * The broker's status.
     * </p>
     * 
     * @param brokerState
     *        The broker's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerState
     */

    public BrokerSummary withBrokerState(String brokerState) {
        setBrokerState(brokerState);
        return this;
    }

    /**
     * <p>
     * The broker's status.
     * </p>
     * 
     * @param brokerState
     *        The broker's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerState
     */

    public BrokerSummary withBrokerState(BrokerState brokerState) {
        this.brokerState = brokerState.toString();
        return this;
    }

    /**
     * <p>
     * The time when the broker was created.
     * </p>
     * 
     * @param created
     *        The time when the broker was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The time when the broker was created.
     * </p>
     * 
     * @return The time when the broker was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The time when the broker was created.
     * </p>
     * 
     * @param created
     *        The time when the broker was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSummary withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     * 
     * @param deploymentMode
     *        The broker's deployment mode.
     * @see DeploymentMode
     */

    public void setDeploymentMode(String deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     * 
     * @return The broker's deployment mode.
     * @see DeploymentMode
     */

    public String getDeploymentMode() {
        return this.deploymentMode;
    }

    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     * 
     * @param deploymentMode
     *        The broker's deployment mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public BrokerSummary withDeploymentMode(String deploymentMode) {
        setDeploymentMode(deploymentMode);
        return this;
    }

    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     * 
     * @param deploymentMode
     *        The broker's deployment mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public BrokerSummary withDeploymentMode(DeploymentMode deploymentMode) {
        this.deploymentMode = deploymentMode.toString();
        return this;
    }

    /**
     * <p>
     * The type of broker engine.
     * </p>
     * 
     * @param engineType
     *        The type of broker engine.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The type of broker engine.
     * </p>
     * 
     * @return The type of broker engine.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The type of broker engine.
     * </p>
     * 
     * @param engineType
     *        The type of broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public BrokerSummary withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The type of broker engine.
     * </p>
     * 
     * @param engineType
     *        The type of broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public BrokerSummary withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * The broker's instance type.
     * </p>
     * 
     * @param hostInstanceType
     *        The broker's instance type.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * <p>
     * The broker's instance type.
     * </p>
     * 
     * @return The broker's instance type.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * <p>
     * The broker's instance type.
     * </p>
     * 
     * @param hostInstanceType
     *        The broker's instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSummary withHostInstanceType(String hostInstanceType) {
        setHostInstanceType(hostInstanceType);
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
        if (getBrokerArn() != null)
            sb.append("BrokerArn: ").append(getBrokerArn()).append(",");
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getBrokerName() != null)
            sb.append("BrokerName: ").append(getBrokerName()).append(",");
        if (getBrokerState() != null)
            sb.append("BrokerState: ").append(getBrokerState()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDeploymentMode() != null)
            sb.append("DeploymentMode: ").append(getDeploymentMode()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
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
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDeploymentMode() == null ^ this.getDeploymentMode() == null)
            return false;
        if (other.getDeploymentMode() != null && other.getDeploymentMode().equals(this.getDeploymentMode()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
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
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDeploymentMode() == null) ? 0 : getDeploymentMode().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
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
