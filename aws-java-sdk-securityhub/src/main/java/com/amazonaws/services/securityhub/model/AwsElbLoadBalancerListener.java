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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a load balancer listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerListener"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerListener implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The port on which the instance is listening.
     * </p>
     */
    private Integer instancePort;
    /**
     * <p>
     * The protocol to use to route traffic to instances.
     * </p>
     * <p>
     * Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * </p>
     */
    private String instanceProtocol;
    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * <p>
     * On EC2-VPC, you can specify any port from the range 1-65535.
     * </p>
     * <p>
     * On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * </p>
     */
    private Integer loadBalancerPort;
    /**
     * <p>
     * The load balancer transport protocol to use for routing.
     * </p>
     * <p>
     * Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     */
    private String sslCertificateId;

    /**
     * <p>
     * The port on which the instance is listening.
     * </p>
     * 
     * @param instancePort
     *        The port on which the instance is listening.
     */

    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The port on which the instance is listening.
     * </p>
     * 
     * @return The port on which the instance is listening.
     */

    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * <p>
     * The port on which the instance is listening.
     * </p>
     * 
     * @param instancePort
     *        The port on which the instance is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerListener withInstancePort(Integer instancePort) {
        setInstancePort(instancePort);
        return this;
    }

    /**
     * <p>
     * The protocol to use to route traffic to instances.
     * </p>
     * <p>
     * Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * </p>
     * 
     * @param instanceProtocol
     *        The protocol to use to route traffic to instances.</p>
     *        <p>
     *        Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     */

    public void setInstanceProtocol(String instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
    }

    /**
     * <p>
     * The protocol to use to route traffic to instances.
     * </p>
     * <p>
     * Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * </p>
     * 
     * @return The protocol to use to route traffic to instances.</p>
     *         <p>
     *         Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     */

    public String getInstanceProtocol() {
        return this.instanceProtocol;
    }

    /**
     * <p>
     * The protocol to use to route traffic to instances.
     * </p>
     * <p>
     * Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * </p>
     * 
     * @param instanceProtocol
     *        The protocol to use to route traffic to instances.</p>
     *        <p>
     *        Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerListener withInstanceProtocol(String instanceProtocol) {
        setInstanceProtocol(instanceProtocol);
        return this;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * <p>
     * On EC2-VPC, you can specify any port from the range 1-65535.
     * </p>
     * <p>
     * On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * </p>
     * 
     * @param loadBalancerPort
     *        The port on which the load balancer is listening.</p>
     *        <p>
     *        On EC2-VPC, you can specify any port from the range 1-65535.
     *        </p>
     *        <p>
     *        On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     */

    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * <p>
     * On EC2-VPC, you can specify any port from the range 1-65535.
     * </p>
     * <p>
     * On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * </p>
     * 
     * @return The port on which the load balancer is listening.</p>
     *         <p>
     *         On EC2-VPC, you can specify any port from the range 1-65535.
     *         </p>
     *         <p>
     *         On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     */

    public Integer getLoadBalancerPort() {
        return this.loadBalancerPort;
    }

    /**
     * <p>
     * The port on which the load balancer is listening.
     * </p>
     * <p>
     * On EC2-VPC, you can specify any port from the range 1-65535.
     * </p>
     * <p>
     * On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * </p>
     * 
     * @param loadBalancerPort
     *        The port on which the load balancer is listening.</p>
     *        <p>
     *        On EC2-VPC, you can specify any port from the range 1-65535.
     *        </p>
     *        <p>
     *        On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerListener withLoadBalancerPort(Integer loadBalancerPort) {
        setLoadBalancerPort(loadBalancerPort);
        return this;
    }

    /**
     * <p>
     * The load balancer transport protocol to use for routing.
     * </p>
     * <p>
     * Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * </p>
     * 
     * @param protocol
     *        The load balancer transport protocol to use for routing.</p>
     *        <p>
     *        Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The load balancer transport protocol to use for routing.
     * </p>
     * <p>
     * Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * </p>
     * 
     * @return The load balancer transport protocol to use for routing.</p>
     *         <p>
     *         Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The load balancer transport protocol to use for routing.
     * </p>
     * <p>
     * Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * </p>
     * 
     * @param protocol
     *        The load balancer transport protocol to use for routing.</p>
     *        <p>
     *        Valid values: <code>HTTP</code> | <code>HTTPS</code> | <code>TCP</code> | <code>SSL</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerListener withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @param sslCertificateId
     *        The ARN of the server certificate.
     */

    public void setSslCertificateId(String sslCertificateId) {
        this.sslCertificateId = sslCertificateId;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @return The ARN of the server certificate.
     */

    public String getSslCertificateId() {
        return this.sslCertificateId;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @param sslCertificateId
     *        The ARN of the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerListener withSslCertificateId(String sslCertificateId) {
        setSslCertificateId(sslCertificateId);
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
        if (getInstancePort() != null)
            sb.append("InstancePort: ").append(getInstancePort()).append(",");
        if (getInstanceProtocol() != null)
            sb.append("InstanceProtocol: ").append(getInstanceProtocol()).append(",");
        if (getLoadBalancerPort() != null)
            sb.append("LoadBalancerPort: ").append(getLoadBalancerPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSslCertificateId() != null)
            sb.append("SslCertificateId: ").append(getSslCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLoadBalancerListener == false)
            return false;
        AwsElbLoadBalancerListener other = (AwsElbLoadBalancerListener) obj;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getInstanceProtocol() == null ^ this.getInstanceProtocol() == null)
            return false;
        if (other.getInstanceProtocol() != null && other.getInstanceProtocol().equals(this.getInstanceProtocol()) == false)
            return false;
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null)
            return false;
        if (other.getLoadBalancerPort() != null && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSslCertificateId() == null ^ this.getSslCertificateId() == null)
            return false;
        if (other.getSslCertificateId() != null && other.getSslCertificateId().equals(this.getSslCertificateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
        hashCode = prime * hashCode + ((getInstanceProtocol() == null) ? 0 : getInstanceProtocol().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerPort() == null) ? 0 : getLoadBalancerPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSslCertificateId() == null) ? 0 : getSslCertificateId().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerListener clone() {
        try {
            return (AwsElbLoadBalancerListener) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerListenerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
