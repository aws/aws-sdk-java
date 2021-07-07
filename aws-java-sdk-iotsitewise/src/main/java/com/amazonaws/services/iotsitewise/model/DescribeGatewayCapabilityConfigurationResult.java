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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGatewayCapabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGatewayCapabilityConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     */
    private String capabilityNamespace;
    /**
     * <p>
     * The JSON document that defines the gateway capability's configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String capabilityConfiguration;
    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     */
    private String capabilitySyncStatus;

    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway that defines the capability configuration.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     * 
     * @return The ID of the gateway that defines the capability configuration.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway that defines the capability configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayCapabilityConfigurationResult withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * 
     * @param capabilityNamespace
     *        The namespace of the gateway capability.
     */

    public void setCapabilityNamespace(String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * 
     * @return The namespace of the gateway capability.
     */

    public String getCapabilityNamespace() {
        return this.capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * 
     * @param capabilityNamespace
     *        The namespace of the gateway capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayCapabilityConfigurationResult withCapabilityNamespace(String capabilityNamespace) {
        setCapabilityNamespace(capabilityNamespace);
        return this;
    }

    /**
     * <p>
     * The JSON document that defines the gateway capability's configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param capabilityConfiguration
     *        The JSON document that defines the gateway capability's configuration. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *        >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setCapabilityConfiguration(String capabilityConfiguration) {
        this.capabilityConfiguration = capabilityConfiguration;
    }

    /**
     * <p>
     * The JSON document that defines the gateway capability's configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The JSON document that defines the gateway capability's configuration. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *         >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getCapabilityConfiguration() {
        return this.capabilityConfiguration;
    }

    /**
     * <p>
     * The JSON document that defines the gateway capability's configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param capabilityConfiguration
     *        The JSON document that defines the gateway capability's configuration. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *        >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayCapabilityConfigurationResult withCapabilityConfiguration(String capabilityConfiguration) {
        setCapabilityConfiguration(capabilityConfiguration);
        return this;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capabilitySyncStatus
     *        The synchronization status of the capability configuration. The sync status can be one of the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code> – The gateway is running the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     *        </p>
     *        </li>
     * @see CapabilitySyncStatus
     */

    public void setCapabilitySyncStatus(String capabilitySyncStatus) {
        this.capabilitySyncStatus = capabilitySyncStatus;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The synchronization status of the capability configuration. The sync status can be one of the
     *         following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code> – The gateway is running the capability configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     *         </p>
     *         </li>
     * @see CapabilitySyncStatus
     */

    public String getCapabilitySyncStatus() {
        return this.capabilitySyncStatus;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capabilitySyncStatus
     *        The synchronization status of the capability configuration. The sync status can be one of the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code> – The gateway is running the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilitySyncStatus
     */

    public DescribeGatewayCapabilityConfigurationResult withCapabilitySyncStatus(String capabilitySyncStatus) {
        setCapabilitySyncStatus(capabilitySyncStatus);
        return this;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capabilitySyncStatus
     *        The synchronization status of the capability configuration. The sync status can be one of the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code> – The gateway is running the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilitySyncStatus
     */

    public DescribeGatewayCapabilityConfigurationResult withCapabilitySyncStatus(CapabilitySyncStatus capabilitySyncStatus) {
        this.capabilitySyncStatus = capabilitySyncStatus.toString();
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
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getCapabilityNamespace() != null)
            sb.append("CapabilityNamespace: ").append(getCapabilityNamespace()).append(",");
        if (getCapabilityConfiguration() != null)
            sb.append("CapabilityConfiguration: ").append(getCapabilityConfiguration()).append(",");
        if (getCapabilitySyncStatus() != null)
            sb.append("CapabilitySyncStatus: ").append(getCapabilitySyncStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGatewayCapabilityConfigurationResult == false)
            return false;
        DescribeGatewayCapabilityConfigurationResult other = (DescribeGatewayCapabilityConfigurationResult) obj;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getCapabilityNamespace() == null ^ this.getCapabilityNamespace() == null)
            return false;
        if (other.getCapabilityNamespace() != null && other.getCapabilityNamespace().equals(this.getCapabilityNamespace()) == false)
            return false;
        if (other.getCapabilityConfiguration() == null ^ this.getCapabilityConfiguration() == null)
            return false;
        if (other.getCapabilityConfiguration() != null && other.getCapabilityConfiguration().equals(this.getCapabilityConfiguration()) == false)
            return false;
        if (other.getCapabilitySyncStatus() == null ^ this.getCapabilitySyncStatus() == null)
            return false;
        if (other.getCapabilitySyncStatus() != null && other.getCapabilitySyncStatus().equals(this.getCapabilitySyncStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCapabilityNamespace() == null) ? 0 : getCapabilityNamespace().hashCode());
        hashCode = prime * hashCode + ((getCapabilityConfiguration() == null) ? 0 : getCapabilityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCapabilitySyncStatus() == null) ? 0 : getCapabilitySyncStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGatewayCapabilityConfigurationResult clone() {
        try {
            return (DescribeGatewayCapabilityConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
