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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGatewayCapabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGatewayCapabilityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the gateway to be updated.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA sources
     * from the IoT SiteWise console, your OPC-UA capability configuration has the namespace
     * <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as <code>1</code>.
     * </p>
     */
    private String capabilityNamespace;
    /**
     * <p>
     * The JSON document that defines the configuration for the gateway capability. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String capabilityConfiguration;

    /**
     * <p>
     * The ID of the gateway to be updated.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway to be updated.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway to be updated.
     * </p>
     * 
     * @return The ID of the gateway to be updated.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway to be updated.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayCapabilityConfigurationRequest withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA sources
     * from the IoT SiteWise console, your OPC-UA capability configuration has the namespace
     * <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as <code>1</code>.
     * </p>
     * 
     * @param capabilityNamespace
     *        The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA
     *        sources from the IoT SiteWise console, your OPC-UA capability configuration has the namespace
     *        <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as
     *        <code>1</code>.
     */

    public void setCapabilityNamespace(String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA sources
     * from the IoT SiteWise console, your OPC-UA capability configuration has the namespace
     * <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as <code>1</code>.
     * </p>
     * 
     * @return The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA
     *         sources from the IoT SiteWise console, your OPC-UA capability configuration has the namespace
     *         <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as
     *         <code>1</code>.
     */

    public String getCapabilityNamespace() {
        return this.capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA sources
     * from the IoT SiteWise console, your OPC-UA capability configuration has the namespace
     * <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as <code>1</code>.
     * </p>
     * 
     * @param capabilityNamespace
     *        The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA
     *        sources from the IoT SiteWise console, your OPC-UA capability configuration has the namespace
     *        <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as
     *        <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayCapabilityConfigurationRequest withCapabilityNamespace(String capabilityNamespace) {
        setCapabilityNamespace(capabilityNamespace);
        return this;
    }

    /**
     * <p>
     * The JSON document that defines the configuration for the gateway capability. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param capabilityConfiguration
     *        The JSON document that defines the configuration for the gateway capability. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *        >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setCapabilityConfiguration(String capabilityConfiguration) {
        this.capabilityConfiguration = capabilityConfiguration;
    }

    /**
     * <p>
     * The JSON document that defines the configuration for the gateway capability. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The JSON document that defines the configuration for the gateway capability. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *         >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getCapabilityConfiguration() {
        return this.capabilityConfiguration;
    }

    /**
     * <p>
     * The JSON document that defines the configuration for the gateway capability. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     * >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param capabilityConfiguration
     *        The JSON document that defines the configuration for the gateway capability. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli"
     *        >Configuring data sources (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayCapabilityConfigurationRequest withCapabilityConfiguration(String capabilityConfiguration) {
        setCapabilityConfiguration(capabilityConfiguration);
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
            sb.append("CapabilityConfiguration: ").append(getCapabilityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayCapabilityConfigurationRequest == false)
            return false;
        UpdateGatewayCapabilityConfigurationRequest other = (UpdateGatewayCapabilityConfigurationRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCapabilityNamespace() == null) ? 0 : getCapabilityNamespace().hashCode());
        hashCode = prime * hashCode + ((getCapabilityConfiguration() == null) ? 0 : getCapabilityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGatewayCapabilityConfigurationRequest clone() {
        return (UpdateGatewayCapabilityConfigurationRequest) super.clone();
    }

}
