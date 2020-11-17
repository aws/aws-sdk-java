/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each match
 * attributes set can include one or more items such as IP address, CIDR range, port number, protocol, and TCP flags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/MatchAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with
     * any source address.
     * </p>
     */
    private java.util.List<Address> sources;
    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches
     * with any destination address.
     * </p>
     */
    private java.util.List<Address> destinations;
    /**
     * <p>
     * The source ports to inspect for. If not specified, this matches with any source port. This setting is only used
     * for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     */
    private java.util.List<PortRange> sourcePorts;
    /**
     * <p>
     * The destination ports to inspect for. If not specified, this matches with any destination port. This setting is
     * only used for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     */
    private java.util.List<PortRange> destinationPorts;
    /**
     * <p>
     * The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If not
     * specified, this matches with any protocol.
     * </p>
     */
    private java.util.List<Integer> protocols;
    /**
     * <p>
     * The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is only
     * used for protocol 6 (TCP).
     * </p>
     */
    private java.util.List<TCPFlagField> tCPFlags;

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with
     * any source address.
     * </p>
     * 
     * @return The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this
     *         matches with any source address.
     */

    public java.util.List<Address> getSources() {
        return sources;
    }

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with
     * any source address.
     * </p>
     * 
     * @param sources
     *        The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this
     *        matches with any source address.
     */

    public void setSources(java.util.Collection<Address> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<Address>(sources);
    }

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with
     * any source address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this
     *        matches with any source address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withSources(Address... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<Address>(sources.length));
        }
        for (Address ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches with
     * any source address.
     * </p>
     * 
     * @param sources
     *        The source IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this
     *        matches with any source address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withSources(java.util.Collection<Address> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches
     * with any destination address.
     * </p>
     * 
     * @return The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this
     *         matches with any destination address.
     */

    public java.util.List<Address> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches
     * with any destination address.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this
     *        matches with any destination address.
     */

    public void setDestinations(java.util.Collection<Address> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<Address>(destinations);
    }

    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches
     * with any destination address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this
     *        matches with any destination address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withDestinations(Address... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<Address>(destinations.length));
        }
        for (Address ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this matches
     * with any destination address.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses and address ranges to inspect for, in CIDR notation. If not specified, this
     *        matches with any destination address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withDestinations(java.util.Collection<Address> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The source ports to inspect for. If not specified, this matches with any source port. This setting is only used
     * for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     * 
     * @return The source ports to inspect for. If not specified, this matches with any source port. This setting is
     *         only used for protocols 6 (TCP) and 17 (UDP). </p>
     *         <p>
     *         You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for
     *         example <code>1990-1994</code>.
     */

    public java.util.List<PortRange> getSourcePorts() {
        return sourcePorts;
    }

    /**
     * <p>
     * The source ports to inspect for. If not specified, this matches with any source port. This setting is only used
     * for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports to inspect for. If not specified, this matches with any source port. This setting is only
     *        used for protocols 6 (TCP) and 17 (UDP). </p>
     *        <p>
     *        You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for
     *        example <code>1990-1994</code>.
     */

    public void setSourcePorts(java.util.Collection<PortRange> sourcePorts) {
        if (sourcePorts == null) {
            this.sourcePorts = null;
            return;
        }

        this.sourcePorts = new java.util.ArrayList<PortRange>(sourcePorts);
    }

    /**
     * <p>
     * The source ports to inspect for. If not specified, this matches with any source port. This setting is only used
     * for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourcePorts(java.util.Collection)} or {@link #withSourcePorts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports to inspect for. If not specified, this matches with any source port. This setting is only
     *        used for protocols 6 (TCP) and 17 (UDP). </p>
     *        <p>
     *        You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for
     *        example <code>1990-1994</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withSourcePorts(PortRange... sourcePorts) {
        if (this.sourcePorts == null) {
            setSourcePorts(new java.util.ArrayList<PortRange>(sourcePorts.length));
        }
        for (PortRange ele : sourcePorts) {
            this.sourcePorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source ports to inspect for. If not specified, this matches with any source port. This setting is only used
     * for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports to inspect for. If not specified, this matches with any source port. This setting is only
     *        used for protocols 6 (TCP) and 17 (UDP). </p>
     *        <p>
     *        You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for
     *        example <code>1990-1994</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withSourcePorts(java.util.Collection<PortRange> sourcePorts) {
        setSourcePorts(sourcePorts);
        return this;
    }

    /**
     * <p>
     * The destination ports to inspect for. If not specified, this matches with any destination port. This setting is
     * only used for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     * 
     * @return The destination ports to inspect for. If not specified, this matches with any destination port. This
     *         setting is only used for protocols 6 (TCP) and 17 (UDP). </p>
     *         <p>
     *         You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for
     *         example <code>1990-1994</code>.
     */

    public java.util.List<PortRange> getDestinationPorts() {
        return destinationPorts;
    }

    /**
     * <p>
     * The destination ports to inspect for. If not specified, this matches with any destination port. This setting is
     * only used for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports to inspect for. If not specified, this matches with any destination port. This
     *        setting is only used for protocols 6 (TCP) and 17 (UDP). </p>
     *        <p>
     *        You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for
     *        example <code>1990-1994</code>.
     */

    public void setDestinationPorts(java.util.Collection<PortRange> destinationPorts) {
        if (destinationPorts == null) {
            this.destinationPorts = null;
            return;
        }

        this.destinationPorts = new java.util.ArrayList<PortRange>(destinationPorts);
    }

    /**
     * <p>
     * The destination ports to inspect for. If not specified, this matches with any destination port. This setting is
     * only used for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPorts(java.util.Collection)} or {@link #withDestinationPorts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports to inspect for. If not specified, this matches with any destination port. This
     *        setting is only used for protocols 6 (TCP) and 17 (UDP). </p>
     *        <p>
     *        You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for
     *        example <code>1990-1994</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withDestinationPorts(PortRange... destinationPorts) {
        if (this.destinationPorts == null) {
            setDestinationPorts(new java.util.ArrayList<PortRange>(destinationPorts.length));
        }
        for (PortRange ele : destinationPorts) {
            this.destinationPorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination ports to inspect for. If not specified, this matches with any destination port. This setting is
     * only used for protocols 6 (TCP) and 17 (UDP).
     * </p>
     * <p>
     * You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for example
     * <code>1990-1994</code>.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports to inspect for. If not specified, this matches with any destination port. This
     *        setting is only used for protocols 6 (TCP) and 17 (UDP). </p>
     *        <p>
     *        You can specify individual ports, for example <code>1994</code> and you can specify port ranges, for
     *        example <code>1990-1994</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withDestinationPorts(java.util.Collection<PortRange> destinationPorts) {
        setDestinationPorts(destinationPorts);
        return this;
    }

    /**
     * <p>
     * The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If not
     * specified, this matches with any protocol.
     * </p>
     * 
     * @return The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA).
     *         If not specified, this matches with any protocol.
     */

    public java.util.List<Integer> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If not
     * specified, this matches with any protocol.
     * </p>
     * 
     * @param protocols
     *        The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If
     *        not specified, this matches with any protocol.
     */

    public void setProtocols(java.util.Collection<Integer> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<Integer>(protocols);
    }

    /**
     * <p>
     * The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If not
     * specified, this matches with any protocol.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If
     *        not specified, this matches with any protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withProtocols(Integer... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<Integer>(protocols.length));
        }
        for (Integer ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If not
     * specified, this matches with any protocol.
     * </p>
     * 
     * @param protocols
     *        The protocols to inspect for, specified using each protocol's assigned internet protocol number (IANA). If
     *        not specified, this matches with any protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withProtocols(java.util.Collection<Integer> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is only
     * used for protocol 6 (TCP).
     * </p>
     * 
     * @return The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is
     *         only used for protocol 6 (TCP).
     */

    public java.util.List<TCPFlagField> getTCPFlags() {
        return tCPFlags;
    }

    /**
     * <p>
     * The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is only
     * used for protocol 6 (TCP).
     * </p>
     * 
     * @param tCPFlags
     *        The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is
     *        only used for protocol 6 (TCP).
     */

    public void setTCPFlags(java.util.Collection<TCPFlagField> tCPFlags) {
        if (tCPFlags == null) {
            this.tCPFlags = null;
            return;
        }

        this.tCPFlags = new java.util.ArrayList<TCPFlagField>(tCPFlags);
    }

    /**
     * <p>
     * The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is only
     * used for protocol 6 (TCP).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTCPFlags(java.util.Collection)} or {@link #withTCPFlags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tCPFlags
     *        The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is
     *        only used for protocol 6 (TCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withTCPFlags(TCPFlagField... tCPFlags) {
        if (this.tCPFlags == null) {
            setTCPFlags(new java.util.ArrayList<TCPFlagField>(tCPFlags.length));
        }
        for (TCPFlagField ele : tCPFlags) {
            this.tCPFlags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is only
     * used for protocol 6 (TCP).
     * </p>
     * 
     * @param tCPFlags
     *        The TCP flags and masks to inspect for. If not specified, this matches with any settings. This setting is
     *        only used for protocol 6 (TCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchAttributes withTCPFlags(java.util.Collection<TCPFlagField> tCPFlags) {
        setTCPFlags(tCPFlags);
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
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getSourcePorts() != null)
            sb.append("SourcePorts: ").append(getSourcePorts()).append(",");
        if (getDestinationPorts() != null)
            sb.append("DestinationPorts: ").append(getDestinationPorts()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getTCPFlags() != null)
            sb.append("TCPFlags: ").append(getTCPFlags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchAttributes == false)
            return false;
        MatchAttributes other = (MatchAttributes) obj;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getSourcePorts() == null ^ this.getSourcePorts() == null)
            return false;
        if (other.getSourcePorts() != null && other.getSourcePorts().equals(this.getSourcePorts()) == false)
            return false;
        if (other.getDestinationPorts() == null ^ this.getDestinationPorts() == null)
            return false;
        if (other.getDestinationPorts() != null && other.getDestinationPorts().equals(this.getDestinationPorts()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getTCPFlags() == null ^ this.getTCPFlags() == null)
            return false;
        if (other.getTCPFlags() != null && other.getTCPFlags().equals(this.getTCPFlags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getSourcePorts() == null) ? 0 : getSourcePorts().hashCode());
        hashCode = prime * hashCode + ((getDestinationPorts() == null) ? 0 : getDestinationPorts().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getTCPFlags() == null) ? 0 : getTCPFlags().hashCode());
        return hashCode;
    }

    @Override
    public MatchAttributes clone() {
        try {
            return (MatchAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.MatchAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
