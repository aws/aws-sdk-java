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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGatewayCapabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGatewayCapabilityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the gateway that defines the capability configuration.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The namespace of the capability configuration. For example, if you configure OPC-UA sources from the IoT SiteWise
     * console, your OPC-UA capability configuration has the namespace <code>iotsitewise:opcuacollector:version</code>,
     * where <code>version</code> is a number such as <code>1</code>.
     * </p>
     */
    private String capabilityNamespace;

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

    public DescribeGatewayCapabilityConfigurationRequest withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The namespace of the capability configuration. For example, if you configure OPC-UA sources from the IoT SiteWise
     * console, your OPC-UA capability configuration has the namespace <code>iotsitewise:opcuacollector:version</code>,
     * where <code>version</code> is a number such as <code>1</code>.
     * </p>
     * 
     * @param capabilityNamespace
     *        The namespace of the capability configuration. For example, if you configure OPC-UA sources from the IoT
     *        SiteWise console, your OPC-UA capability configuration has the namespace
     *        <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as
     *        <code>1</code>.
     */

    public void setCapabilityNamespace(String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the capability configuration. For example, if you configure OPC-UA sources from the IoT SiteWise
     * console, your OPC-UA capability configuration has the namespace <code>iotsitewise:opcuacollector:version</code>,
     * where <code>version</code> is a number such as <code>1</code>.
     * </p>
     * 
     * @return The namespace of the capability configuration. For example, if you configure OPC-UA sources from the IoT
     *         SiteWise console, your OPC-UA capability configuration has the namespace
     *         <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as
     *         <code>1</code>.
     */

    public String getCapabilityNamespace() {
        return this.capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the capability configuration. For example, if you configure OPC-UA sources from the IoT SiteWise
     * console, your OPC-UA capability configuration has the namespace <code>iotsitewise:opcuacollector:version</code>,
     * where <code>version</code> is a number such as <code>1</code>.
     * </p>
     * 
     * @param capabilityNamespace
     *        The namespace of the capability configuration. For example, if you configure OPC-UA sources from the IoT
     *        SiteWise console, your OPC-UA capability configuration has the namespace
     *        <code>iotsitewise:opcuacollector:version</code>, where <code>version</code> is a number such as
     *        <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGatewayCapabilityConfigurationRequest withCapabilityNamespace(String capabilityNamespace) {
        setCapabilityNamespace(capabilityNamespace);
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
            sb.append("CapabilityNamespace: ").append(getCapabilityNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGatewayCapabilityConfigurationRequest == false)
            return false;
        DescribeGatewayCapabilityConfigurationRequest other = (DescribeGatewayCapabilityConfigurationRequest) obj;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getCapabilityNamespace() == null ^ this.getCapabilityNamespace() == null)
            return false;
        if (other.getCapabilityNamespace() != null && other.getCapabilityNamespace().equals(this.getCapabilityNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCapabilityNamespace() == null) ? 0 : getCapabilityNamespace().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGatewayCapabilityConfigurationRequest clone() {
        return (DescribeGatewayCapabilityConfigurationRequest) super.clone();
    }

}
