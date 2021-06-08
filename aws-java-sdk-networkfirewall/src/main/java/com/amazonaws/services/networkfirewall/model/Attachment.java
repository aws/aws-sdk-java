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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration and status for a single subnet that you've specified for use by the AWS Network Firewall firewall.
 * This is part of the <a>FirewallStatus</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/Attachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the subnet that you've specified to be used for a firewall endpoint.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The identifier of the firewall endpoint that Network Firewall has instantiated in the subnet. You use this to
     * identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of the
     * endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings. When this
     * value is <code>READY</code>, the endpoint is available and configured properly to handle network traffic. When
     * the endpoint isn't available for traffic, this value will reflect its state, for example <code>CREATING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique identifier of the subnet that you've specified to be used for a firewall endpoint.
     * </p>
     * 
     * @param subnetId
     *        The unique identifier of the subnet that you've specified to be used for a firewall endpoint.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The unique identifier of the subnet that you've specified to be used for a firewall endpoint.
     * </p>
     * 
     * @return The unique identifier of the subnet that you've specified to be used for a firewall endpoint.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The unique identifier of the subnet that you've specified to be used for a firewall endpoint.
     * </p>
     * 
     * @param subnetId
     *        The unique identifier of the subnet that you've specified to be used for a firewall endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The identifier of the firewall endpoint that Network Firewall has instantiated in the subnet. You use this to
     * identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * </p>
     * 
     * @param endpointId
     *        The identifier of the firewall endpoint that Network Firewall has instantiated in the subnet. You use this
     *        to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the
     *        endpoint.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The identifier of the firewall endpoint that Network Firewall has instantiated in the subnet. You use this to
     * identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * </p>
     * 
     * @return The identifier of the firewall endpoint that Network Firewall has instantiated in the subnet. You use
     *         this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through
     *         the endpoint.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The identifier of the firewall endpoint that Network Firewall has instantiated in the subnet. You use this to
     * identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * </p>
     * 
     * @param endpointId
     *        The identifier of the firewall endpoint that Network Firewall has instantiated in the subnet. You use this
     *        to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of the
     * endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings. When this
     * value is <code>READY</code>, the endpoint is available and configured properly to handle network traffic. When
     * the endpoint isn't available for traffic, this value will reflect its state, for example <code>CREATING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of
     *        the endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings.
     *        When this value is <code>READY</code>, the endpoint is available and configured properly to handle network
     *        traffic. When the endpoint isn't available for traffic, this value will reflect its state, for example
     *        <code>CREATING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * @see AttachmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of the
     * endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings. When this
     * value is <code>READY</code>, the endpoint is available and configured properly to handle network traffic. When
     * the endpoint isn't available for traffic, this value will reflect its state, for example <code>CREATING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @return The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of
     *         the endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings.
     *         When this value is <code>READY</code>, the endpoint is available and configured properly to handle
     *         network traffic. When the endpoint isn't available for traffic, this value will reflect its state, for
     *         example <code>CREATING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * @see AttachmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of the
     * endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings. When this
     * value is <code>READY</code>, the endpoint is available and configured properly to handle network traffic. When
     * the endpoint isn't available for traffic, this value will reflect its state, for example <code>CREATING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of
     *        the endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings.
     *        When this value is <code>READY</code>, the endpoint is available and configured properly to handle network
     *        traffic. When the endpoint isn't available for traffic, this value will reflect its state, for example
     *        <code>CREATING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public Attachment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of the
     * endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings. When this
     * value is <code>READY</code>, the endpoint is available and configured properly to handle network traffic. When
     * the endpoint isn't available for traffic, this value will reflect its state, for example <code>CREATING</code>,
     * <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The current status of the firewall endpoint in the subnet. This value reflects both the instantiation of
     *        the endpoint in the VPC subnet and the sync states that are reported in the <code>Config</code> settings.
     *        When this value is <code>READY</code>, the endpoint is available and configured properly to handle network
     *        traffic. When the endpoint isn't available for traffic, this value will reflect its state, for example
     *        <code>CREATING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public Attachment withStatus(AttachmentStatus status) {
        this.status = status.toString();
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attachment == false)
            return false;
        Attachment other = (Attachment) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Attachment clone() {
        try {
            return (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.AttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
