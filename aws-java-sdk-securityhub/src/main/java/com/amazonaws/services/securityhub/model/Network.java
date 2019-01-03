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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of network-related information about a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Network" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Network implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the direction of network traffic associated with a finding.
     * </p>
     */
    private String direction;
    /**
     * <p>
     * The protocol of network-related information about a finding.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The source IPv4 address of network-related information about a finding.
     * </p>
     */
    private String sourceIpV4;
    /**
     * <p>
     * The source IPv6 address of network-related information about a finding.
     * </p>
     */
    private String sourceIpV6;
    /**
     * <p>
     * The source port of network-related information about a finding.
     * </p>
     */
    private Integer sourcePort;
    /**
     * <p>
     * The source domain of network-related information about a finding.
     * </p>
     */
    private String sourceDomain;
    /**
     * <p>
     * The source media access control (MAC) address of network-related information about a finding.
     * </p>
     */
    private String sourceMac;
    /**
     * <p>
     * The destination IPv4 address of network-related information about a finding.
     * </p>
     */
    private String destinationIpV4;
    /**
     * <p>
     * The destination IPv6 address of network-related information about a finding.
     * </p>
     */
    private String destinationIpV6;
    /**
     * <p>
     * The destination port of network-related information about a finding.
     * </p>
     */
    private Integer destinationPort;
    /**
     * <p>
     * The destination domain of network-related information about a finding.
     * </p>
     */
    private String destinationDomain;

    /**
     * <p>
     * Indicates the direction of network traffic associated with a finding.
     * </p>
     * 
     * @param direction
     *        Indicates the direction of network traffic associated with a finding.
     * @see NetworkDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * Indicates the direction of network traffic associated with a finding.
     * </p>
     * 
     * @return Indicates the direction of network traffic associated with a finding.
     * @see NetworkDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * Indicates the direction of network traffic associated with a finding.
     * </p>
     * 
     * @param direction
     *        Indicates the direction of network traffic associated with a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkDirection
     */

    public Network withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * Indicates the direction of network traffic associated with a finding.
     * </p>
     * 
     * @param direction
     *        Indicates the direction of network traffic associated with a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkDirection
     */

    public Network withDirection(NetworkDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The protocol of network-related information about a finding.
     * </p>
     * 
     * @param protocol
     *        The protocol of network-related information about a finding.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of network-related information about a finding.
     * </p>
     * 
     * @return The protocol of network-related information about a finding.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol of network-related information about a finding.
     * </p>
     * 
     * @param protocol
     *        The protocol of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The source IPv4 address of network-related information about a finding.
     * </p>
     * 
     * @param sourceIpV4
     *        The source IPv4 address of network-related information about a finding.
     */

    public void setSourceIpV4(String sourceIpV4) {
        this.sourceIpV4 = sourceIpV4;
    }

    /**
     * <p>
     * The source IPv4 address of network-related information about a finding.
     * </p>
     * 
     * @return The source IPv4 address of network-related information about a finding.
     */

    public String getSourceIpV4() {
        return this.sourceIpV4;
    }

    /**
     * <p>
     * The source IPv4 address of network-related information about a finding.
     * </p>
     * 
     * @param sourceIpV4
     *        The source IPv4 address of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withSourceIpV4(String sourceIpV4) {
        setSourceIpV4(sourceIpV4);
        return this;
    }

    /**
     * <p>
     * The source IPv6 address of network-related information about a finding.
     * </p>
     * 
     * @param sourceIpV6
     *        The source IPv6 address of network-related information about a finding.
     */

    public void setSourceIpV6(String sourceIpV6) {
        this.sourceIpV6 = sourceIpV6;
    }

    /**
     * <p>
     * The source IPv6 address of network-related information about a finding.
     * </p>
     * 
     * @return The source IPv6 address of network-related information about a finding.
     */

    public String getSourceIpV6() {
        return this.sourceIpV6;
    }

    /**
     * <p>
     * The source IPv6 address of network-related information about a finding.
     * </p>
     * 
     * @param sourceIpV6
     *        The source IPv6 address of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withSourceIpV6(String sourceIpV6) {
        setSourceIpV6(sourceIpV6);
        return this;
    }

    /**
     * <p>
     * The source port of network-related information about a finding.
     * </p>
     * 
     * @param sourcePort
     *        The source port of network-related information about a finding.
     */

    public void setSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
    }

    /**
     * <p>
     * The source port of network-related information about a finding.
     * </p>
     * 
     * @return The source port of network-related information about a finding.
     */

    public Integer getSourcePort() {
        return this.sourcePort;
    }

    /**
     * <p>
     * The source port of network-related information about a finding.
     * </p>
     * 
     * @param sourcePort
     *        The source port of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withSourcePort(Integer sourcePort) {
        setSourcePort(sourcePort);
        return this;
    }

    /**
     * <p>
     * The source domain of network-related information about a finding.
     * </p>
     * 
     * @param sourceDomain
     *        The source domain of network-related information about a finding.
     */

    public void setSourceDomain(String sourceDomain) {
        this.sourceDomain = sourceDomain;
    }

    /**
     * <p>
     * The source domain of network-related information about a finding.
     * </p>
     * 
     * @return The source domain of network-related information about a finding.
     */

    public String getSourceDomain() {
        return this.sourceDomain;
    }

    /**
     * <p>
     * The source domain of network-related information about a finding.
     * </p>
     * 
     * @param sourceDomain
     *        The source domain of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withSourceDomain(String sourceDomain) {
        setSourceDomain(sourceDomain);
        return this;
    }

    /**
     * <p>
     * The source media access control (MAC) address of network-related information about a finding.
     * </p>
     * 
     * @param sourceMac
     *        The source media access control (MAC) address of network-related information about a finding.
     */

    public void setSourceMac(String sourceMac) {
        this.sourceMac = sourceMac;
    }

    /**
     * <p>
     * The source media access control (MAC) address of network-related information about a finding.
     * </p>
     * 
     * @return The source media access control (MAC) address of network-related information about a finding.
     */

    public String getSourceMac() {
        return this.sourceMac;
    }

    /**
     * <p>
     * The source media access control (MAC) address of network-related information about a finding.
     * </p>
     * 
     * @param sourceMac
     *        The source media access control (MAC) address of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withSourceMac(String sourceMac) {
        setSourceMac(sourceMac);
        return this;
    }

    /**
     * <p>
     * The destination IPv4 address of network-related information about a finding.
     * </p>
     * 
     * @param destinationIpV4
     *        The destination IPv4 address of network-related information about a finding.
     */

    public void setDestinationIpV4(String destinationIpV4) {
        this.destinationIpV4 = destinationIpV4;
    }

    /**
     * <p>
     * The destination IPv4 address of network-related information about a finding.
     * </p>
     * 
     * @return The destination IPv4 address of network-related information about a finding.
     */

    public String getDestinationIpV4() {
        return this.destinationIpV4;
    }

    /**
     * <p>
     * The destination IPv4 address of network-related information about a finding.
     * </p>
     * 
     * @param destinationIpV4
     *        The destination IPv4 address of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withDestinationIpV4(String destinationIpV4) {
        setDestinationIpV4(destinationIpV4);
        return this;
    }

    /**
     * <p>
     * The destination IPv6 address of network-related information about a finding.
     * </p>
     * 
     * @param destinationIpV6
     *        The destination IPv6 address of network-related information about a finding.
     */

    public void setDestinationIpV6(String destinationIpV6) {
        this.destinationIpV6 = destinationIpV6;
    }

    /**
     * <p>
     * The destination IPv6 address of network-related information about a finding.
     * </p>
     * 
     * @return The destination IPv6 address of network-related information about a finding.
     */

    public String getDestinationIpV6() {
        return this.destinationIpV6;
    }

    /**
     * <p>
     * The destination IPv6 address of network-related information about a finding.
     * </p>
     * 
     * @param destinationIpV6
     *        The destination IPv6 address of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withDestinationIpV6(String destinationIpV6) {
        setDestinationIpV6(destinationIpV6);
        return this;
    }

    /**
     * <p>
     * The destination port of network-related information about a finding.
     * </p>
     * 
     * @param destinationPort
     *        The destination port of network-related information about a finding.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The destination port of network-related information about a finding.
     * </p>
     * 
     * @return The destination port of network-related information about a finding.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The destination port of network-related information about a finding.
     * </p>
     * 
     * @param destinationPort
     *        The destination port of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * <p>
     * The destination domain of network-related information about a finding.
     * </p>
     * 
     * @param destinationDomain
     *        The destination domain of network-related information about a finding.
     */

    public void setDestinationDomain(String destinationDomain) {
        this.destinationDomain = destinationDomain;
    }

    /**
     * <p>
     * The destination domain of network-related information about a finding.
     * </p>
     * 
     * @return The destination domain of network-related information about a finding.
     */

    public String getDestinationDomain() {
        return this.destinationDomain;
    }

    /**
     * <p>
     * The destination domain of network-related information about a finding.
     * </p>
     * 
     * @param destinationDomain
     *        The destination domain of network-related information about a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withDestinationDomain(String destinationDomain) {
        setDestinationDomain(destinationDomain);
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
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSourceIpV4() != null)
            sb.append("SourceIpV4: ").append(getSourceIpV4()).append(",");
        if (getSourceIpV6() != null)
            sb.append("SourceIpV6: ").append(getSourceIpV6()).append(",");
        if (getSourcePort() != null)
            sb.append("SourcePort: ").append(getSourcePort()).append(",");
        if (getSourceDomain() != null)
            sb.append("SourceDomain: ").append(getSourceDomain()).append(",");
        if (getSourceMac() != null)
            sb.append("SourceMac: ").append(getSourceMac()).append(",");
        if (getDestinationIpV4() != null)
            sb.append("DestinationIpV4: ").append(getDestinationIpV4()).append(",");
        if (getDestinationIpV6() != null)
            sb.append("DestinationIpV6: ").append(getDestinationIpV6()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
        if (getDestinationDomain() != null)
            sb.append("DestinationDomain: ").append(getDestinationDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Network == false)
            return false;
        Network other = (Network) obj;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSourceIpV4() == null ^ this.getSourceIpV4() == null)
            return false;
        if (other.getSourceIpV4() != null && other.getSourceIpV4().equals(this.getSourceIpV4()) == false)
            return false;
        if (other.getSourceIpV6() == null ^ this.getSourceIpV6() == null)
            return false;
        if (other.getSourceIpV6() != null && other.getSourceIpV6().equals(this.getSourceIpV6()) == false)
            return false;
        if (other.getSourcePort() == null ^ this.getSourcePort() == null)
            return false;
        if (other.getSourcePort() != null && other.getSourcePort().equals(this.getSourcePort()) == false)
            return false;
        if (other.getSourceDomain() == null ^ this.getSourceDomain() == null)
            return false;
        if (other.getSourceDomain() != null && other.getSourceDomain().equals(this.getSourceDomain()) == false)
            return false;
        if (other.getSourceMac() == null ^ this.getSourceMac() == null)
            return false;
        if (other.getSourceMac() != null && other.getSourceMac().equals(this.getSourceMac()) == false)
            return false;
        if (other.getDestinationIpV4() == null ^ this.getDestinationIpV4() == null)
            return false;
        if (other.getDestinationIpV4() != null && other.getDestinationIpV4().equals(this.getDestinationIpV4()) == false)
            return false;
        if (other.getDestinationIpV6() == null ^ this.getDestinationIpV6() == null)
            return false;
        if (other.getDestinationIpV6() != null && other.getDestinationIpV6().equals(this.getDestinationIpV6()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
            return false;
        if (other.getDestinationDomain() == null ^ this.getDestinationDomain() == null)
            return false;
        if (other.getDestinationDomain() != null && other.getDestinationDomain().equals(this.getDestinationDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSourceIpV4() == null) ? 0 : getSourceIpV4().hashCode());
        hashCode = prime * hashCode + ((getSourceIpV6() == null) ? 0 : getSourceIpV6().hashCode());
        hashCode = prime * hashCode + ((getSourcePort() == null) ? 0 : getSourcePort().hashCode());
        hashCode = prime * hashCode + ((getSourceDomain() == null) ? 0 : getSourceDomain().hashCode());
        hashCode = prime * hashCode + ((getSourceMac() == null) ? 0 : getSourceMac().hashCode());
        hashCode = prime * hashCode + ((getDestinationIpV4() == null) ? 0 : getDestinationIpV4().hashCode());
        hashCode = prime * hashCode + ((getDestinationIpV6() == null) ? 0 : getDestinationIpV6().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getDestinationDomain() == null) ? 0 : getDestinationDomain().hashCode());
        return hashCode;
    }

    @Override
    public Network clone() {
        try {
            return (Network) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.NetworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
