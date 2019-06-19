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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of a gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GatewaySummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewaySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the gateway.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the gateway.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the gateway group that the gateway is associated to.
     * </p>
     */
    private String gatewayGroupArn;
    /**
     * <p>
     * The software version of the gateway. The gateway automatically updates its software version during normal
     * operation.
     * </p>
     */
    private String softwareVersion;

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @param arn
     *        The ARN of the gateway.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @return The ARN of the gateway.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @param arn
     *        The ARN of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     * 
     * @param name
     *        The name of the gateway.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     * 
     * @return The name of the gateway.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     * 
     * @param name
     *        The name of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the gateway.
     * </p>
     * 
     * @param description
     *        The description of the gateway.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the gateway.
     * </p>
     * 
     * @return The description of the gateway.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the gateway.
     * </p>
     * 
     * @param description
     *        The description of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the gateway group that the gateway is associated to.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The ARN of the gateway group that the gateway is associated to.
     */

    public void setGatewayGroupArn(String gatewayGroupArn) {
        this.gatewayGroupArn = gatewayGroupArn;
    }

    /**
     * <p>
     * The ARN of the gateway group that the gateway is associated to.
     * </p>
     * 
     * @return The ARN of the gateway group that the gateway is associated to.
     */

    public String getGatewayGroupArn() {
        return this.gatewayGroupArn;
    }

    /**
     * <p>
     * The ARN of the gateway group that the gateway is associated to.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The ARN of the gateway group that the gateway is associated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withGatewayGroupArn(String gatewayGroupArn) {
        setGatewayGroupArn(gatewayGroupArn);
        return this;
    }

    /**
     * <p>
     * The software version of the gateway. The gateway automatically updates its software version during normal
     * operation.
     * </p>
     * 
     * @param softwareVersion
     *        The software version of the gateway. The gateway automatically updates its software version during normal
     *        operation.
     */

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    /**
     * <p>
     * The software version of the gateway. The gateway automatically updates its software version during normal
     * operation.
     * </p>
     * 
     * @return The software version of the gateway. The gateway automatically updates its software version during normal
     *         operation.
     */

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * <p>
     * The software version of the gateway. The gateway automatically updates its software version during normal
     * operation.
     * </p>
     * 
     * @param softwareVersion
     *        The software version of the gateway. The gateway automatically updates its software version during normal
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewaySummary withSoftwareVersion(String softwareVersion) {
        setSoftwareVersion(softwareVersion);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGatewayGroupArn() != null)
            sb.append("GatewayGroupArn: ").append(getGatewayGroupArn()).append(",");
        if (getSoftwareVersion() != null)
            sb.append("SoftwareVersion: ").append(getSoftwareVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewaySummary == false)
            return false;
        GatewaySummary other = (GatewaySummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGatewayGroupArn() == null ^ this.getGatewayGroupArn() == null)
            return false;
        if (other.getGatewayGroupArn() != null && other.getGatewayGroupArn().equals(this.getGatewayGroupArn()) == false)
            return false;
        if (other.getSoftwareVersion() == null ^ this.getSoftwareVersion() == null)
            return false;
        if (other.getSoftwareVersion() != null && other.getSoftwareVersion().equals(this.getSoftwareVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGatewayGroupArn() == null) ? 0 : getGatewayGroupArn().hashCode());
        hashCode = prime * hashCode + ((getSoftwareVersion() == null) ? 0 : getSoftwareVersion().hashCode());
        return hashCode;
    }

    @Override
    public GatewaySummary clone() {
        try {
            return (GatewaySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.GatewaySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
