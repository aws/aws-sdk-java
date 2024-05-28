/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of a target group.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html">Target
 * groups</a> in the <i>Amazon VPC Lattice User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TargetGroupConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetGroupConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The health check configuration. Not supported if the target group type is <code>LAMBDA</code> or <code>ALB</code>
     * .
     * </p>
     */
    private HealthCheckConfig healthCheck;
    /**
     * <p>
     * The type of IP address used for the target group. Supported only if the target group type is <code>IP</code>. The
     * default is <code>IPV4</code>.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>. The default is <code>V1</code>.
     * </p>
     */
    private String lambdaEventStructureVersion;
    /**
     * <p>
     * The port on which the targets are listening. For HTTP, the default is 80. For HTTPS, the default is 443. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol to use for routing traffic to the targets. The default is the protocol of the target group. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     */
    private String protocolVersion;
    /**
     * <p>
     * The ID of the VPC. Not supported if the target group type is <code>LAMBDA</code>.
     * </p>
     */
    private String vpcIdentifier;

    /**
     * <p>
     * The health check configuration. Not supported if the target group type is <code>LAMBDA</code> or <code>ALB</code>
     * .
     * </p>
     * 
     * @param healthCheck
     *        The health check configuration. Not supported if the target group type is <code>LAMBDA</code> or
     *        <code>ALB</code>.
     */

    public void setHealthCheck(HealthCheckConfig healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The health check configuration. Not supported if the target group type is <code>LAMBDA</code> or <code>ALB</code>
     * .
     * </p>
     * 
     * @return The health check configuration. Not supported if the target group type is <code>LAMBDA</code> or
     *         <code>ALB</code>.
     */

    public HealthCheckConfig getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * The health check configuration. Not supported if the target group type is <code>LAMBDA</code> or <code>ALB</code>
     * .
     * </p>
     * 
     * @param healthCheck
     *        The health check configuration. Not supported if the target group type is <code>LAMBDA</code> or
     *        <code>ALB</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupConfig withHealthCheck(HealthCheckConfig healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * The type of IP address used for the target group. Supported only if the target group type is <code>IP</code>. The
     * default is <code>IPV4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. Supported only if the target group type is
     *        <code>IP</code>. The default is <code>IPV4</code>.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The type of IP address used for the target group. Supported only if the target group type is <code>IP</code>. The
     * default is <code>IPV4</code>.
     * </p>
     * 
     * @return The type of IP address used for the target group. Supported only if the target group type is
     *         <code>IP</code>. The default is <code>IPV4</code>.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The type of IP address used for the target group. Supported only if the target group type is <code>IP</code>. The
     * default is <code>IPV4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. Supported only if the target group type is
     *        <code>IP</code>. The default is <code>IPV4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public TargetGroupConfig withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The type of IP address used for the target group. Supported only if the target group type is <code>IP</code>. The
     * default is <code>IPV4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. Supported only if the target group type is
     *        <code>IP</code>. The default is <code>IPV4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public TargetGroupConfig withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>. The default is <code>V1</code>.
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        The version of the event structure that your Lambda function receives. Supported only if the target group
     *        type is <code>LAMBDA</code>. The default is <code>V1</code>.
     * @see LambdaEventStructureVersion
     */

    public void setLambdaEventStructureVersion(String lambdaEventStructureVersion) {
        this.lambdaEventStructureVersion = lambdaEventStructureVersion;
    }

    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>. The default is <code>V1</code>.
     * </p>
     * 
     * @return The version of the event structure that your Lambda function receives. Supported only if the target group
     *         type is <code>LAMBDA</code>. The default is <code>V1</code>.
     * @see LambdaEventStructureVersion
     */

    public String getLambdaEventStructureVersion() {
        return this.lambdaEventStructureVersion;
    }

    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>. The default is <code>V1</code>.
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        The version of the event structure that your Lambda function receives. Supported only if the target group
     *        type is <code>LAMBDA</code>. The default is <code>V1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaEventStructureVersion
     */

    public TargetGroupConfig withLambdaEventStructureVersion(String lambdaEventStructureVersion) {
        setLambdaEventStructureVersion(lambdaEventStructureVersion);
        return this;
    }

    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>. The default is <code>V1</code>.
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        The version of the event structure that your Lambda function receives. Supported only if the target group
     *        type is <code>LAMBDA</code>. The default is <code>V1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaEventStructureVersion
     */

    public TargetGroupConfig withLambdaEventStructureVersion(LambdaEventStructureVersion lambdaEventStructureVersion) {
        this.lambdaEventStructureVersion = lambdaEventStructureVersion.toString();
        return this;
    }

    /**
     * <p>
     * The port on which the targets are listening. For HTTP, the default is 80. For HTTPS, the default is 443. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @param port
     *        The port on which the targets are listening. For HTTP, the default is 80. For HTTPS, the default is 443.
     *        Not supported if the target group type is <code>LAMBDA</code>.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the targets are listening. For HTTP, the default is 80. For HTTPS, the default is 443. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @return The port on which the targets are listening. For HTTP, the default is 80. For HTTPS, the default is 443.
     *         Not supported if the target group type is <code>LAMBDA</code>.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the targets are listening. For HTTP, the default is 80. For HTTPS, the default is 443. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @param port
     *        The port on which the targets are listening. For HTTP, the default is 80. For HTTPS, the default is 443.
     *        Not supported if the target group type is <code>LAMBDA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupConfig withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. The default is the protocol of the target group. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. The default is the protocol of the target group.
     *        Not supported if the target group type is <code>LAMBDA</code>.
     * @see TargetGroupProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. The default is the protocol of the target group. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @return The protocol to use for routing traffic to the targets. The default is the protocol of the target group.
     *         Not supported if the target group type is <code>LAMBDA</code>.
     * @see TargetGroupProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. The default is the protocol of the target group. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. The default is the protocol of the target group.
     *        Not supported if the target group type is <code>LAMBDA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocol
     */

    public TargetGroupConfig withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. The default is the protocol of the target group. Not
     * supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. The default is the protocol of the target group.
     *        Not supported if the target group type is <code>LAMBDA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocol
     */

    public TargetGroupConfig withProtocol(TargetGroupProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     *        <code>LAMBDA</code>.
     * @see TargetGroupProtocolVersion
     */

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    /**
     * <p>
     * The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     * 
     * @return The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     *         <code>LAMBDA</code>.
     * @see TargetGroupProtocolVersion
     */

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * <p>
     * The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     *        <code>LAMBDA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocolVersion
     */

    public TargetGroupConfig withProtocolVersion(String protocolVersion) {
        setProtocolVersion(protocolVersion);
        return this;
    }

    /**
     * <p>
     * The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version. The default is <code>HTTP1</code>. Not supported if the target group type is
     *        <code>LAMBDA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocolVersion
     */

    public TargetGroupConfig withProtocolVersion(TargetGroupProtocolVersion protocolVersion) {
        this.protocolVersion = protocolVersion.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC. Not supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID of the VPC. Not supported if the target group type is <code>LAMBDA</code>.
     */

    public void setVpcIdentifier(String vpcIdentifier) {
        this.vpcIdentifier = vpcIdentifier;
    }

    /**
     * <p>
     * The ID of the VPC. Not supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @return The ID of the VPC. Not supported if the target group type is <code>LAMBDA</code>.
     */

    public String getVpcIdentifier() {
        return this.vpcIdentifier;
    }

    /**
     * <p>
     * The ID of the VPC. Not supported if the target group type is <code>LAMBDA</code>.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID of the VPC. Not supported if the target group type is <code>LAMBDA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupConfig withVpcIdentifier(String vpcIdentifier) {
        setVpcIdentifier(vpcIdentifier);
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
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType()).append(",");
        if (getLambdaEventStructureVersion() != null)
            sb.append("LambdaEventStructureVersion: ").append(getLambdaEventStructureVersion()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getProtocolVersion() != null)
            sb.append("ProtocolVersion: ").append(getProtocolVersion()).append(",");
        if (getVpcIdentifier() != null)
            sb.append("VpcIdentifier: ").append(getVpcIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupConfig == false)
            return false;
        TargetGroupConfig other = (TargetGroupConfig) obj;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        if (other.getLambdaEventStructureVersion() == null ^ this.getLambdaEventStructureVersion() == null)
            return false;
        if (other.getLambdaEventStructureVersion() != null && other.getLambdaEventStructureVersion().equals(this.getLambdaEventStructureVersion()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getProtocolVersion() == null ^ this.getProtocolVersion() == null)
            return false;
        if (other.getProtocolVersion() != null && other.getProtocolVersion().equals(this.getProtocolVersion()) == false)
            return false;
        if (other.getVpcIdentifier() == null ^ this.getVpcIdentifier() == null)
            return false;
        if (other.getVpcIdentifier() != null && other.getVpcIdentifier().equals(this.getVpcIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getLambdaEventStructureVersion() == null) ? 0 : getLambdaEventStructureVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getProtocolVersion() == null) ? 0 : getProtocolVersion().hashCode());
        hashCode = prime * hashCode + ((getVpcIdentifier() == null) ? 0 : getVpcIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public TargetGroupConfig clone() {
        try {
            return (TargetGroupConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.TargetGroupConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
