/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Criteria for the stateless rule.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatelessRuleMatchAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatelessRuleMatchAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of port ranges to specify the destination ports to inspect for.
     * </p>
     */
    private java.util.List<RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts> destinationPorts;
    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     */
    private java.util.List<RuleGroupSourceStatelessRuleMatchAttributesDestinations> destinations;
    /**
     * <p>
     * The protocols to inspect for.
     * </p>
     */
    private java.util.List<Integer> protocols;
    /**
     * <p>
     * A list of port ranges to specify the source ports to inspect for.
     * </p>
     */
    private java.util.List<RuleGroupSourceStatelessRuleMatchAttributesSourcePorts> sourcePorts;
    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     */
    private java.util.List<RuleGroupSourceStatelessRuleMatchAttributesSources> sources;
    /**
     * <p>
     * The TCP flags and masks to inspect for.
     * </p>
     */
    private java.util.List<RuleGroupSourceStatelessRuleMatchAttributesTcpFlags> tcpFlags;

    /**
     * <p>
     * A list of port ranges to specify the destination ports to inspect for.
     * </p>
     * 
     * @return A list of port ranges to specify the destination ports to inspect for.
     */

    public java.util.List<RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts> getDestinationPorts() {
        return destinationPorts;
    }

    /**
     * <p>
     * A list of port ranges to specify the destination ports to inspect for.
     * </p>
     * 
     * @param destinationPorts
     *        A list of port ranges to specify the destination ports to inspect for.
     */

    public void setDestinationPorts(java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts> destinationPorts) {
        if (destinationPorts == null) {
            this.destinationPorts = null;
            return;
        }

        this.destinationPorts = new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts>(destinationPorts);
    }

    /**
     * <p>
     * A list of port ranges to specify the destination ports to inspect for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPorts(java.util.Collection)} or {@link #withDestinationPorts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param destinationPorts
     *        A list of port ranges to specify the destination ports to inspect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withDestinationPorts(RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts... destinationPorts) {
        if (this.destinationPorts == null) {
            setDestinationPorts(new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts>(destinationPorts.length));
        }
        for (RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts ele : destinationPorts) {
            this.destinationPorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of port ranges to specify the destination ports to inspect for.
     * </p>
     * 
     * @param destinationPorts
     *        A list of port ranges to specify the destination ports to inspect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withDestinationPorts(
            java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts> destinationPorts) {
        setDestinationPorts(destinationPorts);
        return this;
    }

    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     * 
     * @return The destination IP addresses and address ranges to inspect for, in CIDR notation.
     */

    public java.util.List<RuleGroupSourceStatelessRuleMatchAttributesDestinations> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses and address ranges to inspect for, in CIDR notation.
     */

    public void setDestinations(java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesDestinations> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesDestinations>(destinations);
    }

    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses and address ranges to inspect for, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withDestinations(RuleGroupSourceStatelessRuleMatchAttributesDestinations... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesDestinations>(destinations.length));
        }
        for (RuleGroupSourceStatelessRuleMatchAttributesDestinations ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses and address ranges to inspect for, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withDestinations(
            java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesDestinations> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The protocols to inspect for.
     * </p>
     * 
     * @return The protocols to inspect for.
     */

    public java.util.List<Integer> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocols to inspect for.
     * </p>
     * 
     * @param protocols
     *        The protocols to inspect for.
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
     * The protocols to inspect for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols to inspect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withProtocols(Integer... protocols) {
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
     * The protocols to inspect for.
     * </p>
     * 
     * @param protocols
     *        The protocols to inspect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withProtocols(java.util.Collection<Integer> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * A list of port ranges to specify the source ports to inspect for.
     * </p>
     * 
     * @return A list of port ranges to specify the source ports to inspect for.
     */

    public java.util.List<RuleGroupSourceStatelessRuleMatchAttributesSourcePorts> getSourcePorts() {
        return sourcePorts;
    }

    /**
     * <p>
     * A list of port ranges to specify the source ports to inspect for.
     * </p>
     * 
     * @param sourcePorts
     *        A list of port ranges to specify the source ports to inspect for.
     */

    public void setSourcePorts(java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesSourcePorts> sourcePorts) {
        if (sourcePorts == null) {
            this.sourcePorts = null;
            return;
        }

        this.sourcePorts = new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesSourcePorts>(sourcePorts);
    }

    /**
     * <p>
     * A list of port ranges to specify the source ports to inspect for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourcePorts(java.util.Collection)} or {@link #withSourcePorts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourcePorts
     *        A list of port ranges to specify the source ports to inspect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withSourcePorts(RuleGroupSourceStatelessRuleMatchAttributesSourcePorts... sourcePorts) {
        if (this.sourcePorts == null) {
            setSourcePorts(new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesSourcePorts>(sourcePorts.length));
        }
        for (RuleGroupSourceStatelessRuleMatchAttributesSourcePorts ele : sourcePorts) {
            this.sourcePorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of port ranges to specify the source ports to inspect for.
     * </p>
     * 
     * @param sourcePorts
     *        A list of port ranges to specify the source ports to inspect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withSourcePorts(java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesSourcePorts> sourcePorts) {
        setSourcePorts(sourcePorts);
        return this;
    }

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     * 
     * @return The source IP addresses and address ranges to inspect for, in CIDR notation.
     */

    public java.util.List<RuleGroupSourceStatelessRuleMatchAttributesSources> getSources() {
        return sources;
    }

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     * 
     * @param sources
     *        The source IP addresses and address ranges to inspect for, in CIDR notation.
     */

    public void setSources(java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesSources> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesSources>(sources);
    }

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The source IP addresses and address ranges to inspect for, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withSources(RuleGroupSourceStatelessRuleMatchAttributesSources... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesSources>(sources.length));
        }
        for (RuleGroupSourceStatelessRuleMatchAttributesSources ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source IP addresses and address ranges to inspect for, in CIDR notation.
     * </p>
     * 
     * @param sources
     *        The source IP addresses and address ranges to inspect for, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withSources(java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesSources> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The TCP flags and masks to inspect for.
     * </p>
     * 
     * @return The TCP flags and masks to inspect for.
     */

    public java.util.List<RuleGroupSourceStatelessRuleMatchAttributesTcpFlags> getTcpFlags() {
        return tcpFlags;
    }

    /**
     * <p>
     * The TCP flags and masks to inspect for.
     * </p>
     * 
     * @param tcpFlags
     *        The TCP flags and masks to inspect for.
     */

    public void setTcpFlags(java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesTcpFlags> tcpFlags) {
        if (tcpFlags == null) {
            this.tcpFlags = null;
            return;
        }

        this.tcpFlags = new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesTcpFlags>(tcpFlags);
    }

    /**
     * <p>
     * The TCP flags and masks to inspect for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTcpFlags(java.util.Collection)} or {@link #withTcpFlags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tcpFlags
     *        The TCP flags and masks to inspect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withTcpFlags(RuleGroupSourceStatelessRuleMatchAttributesTcpFlags... tcpFlags) {
        if (this.tcpFlags == null) {
            setTcpFlags(new java.util.ArrayList<RuleGroupSourceStatelessRuleMatchAttributesTcpFlags>(tcpFlags.length));
        }
        for (RuleGroupSourceStatelessRuleMatchAttributesTcpFlags ele : tcpFlags) {
            this.tcpFlags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The TCP flags and masks to inspect for.
     * </p>
     * 
     * @param tcpFlags
     *        The TCP flags and masks to inspect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributes withTcpFlags(java.util.Collection<RuleGroupSourceStatelessRuleMatchAttributesTcpFlags> tcpFlags) {
        setTcpFlags(tcpFlags);
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
        if (getDestinationPorts() != null)
            sb.append("DestinationPorts: ").append(getDestinationPorts()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getSourcePorts() != null)
            sb.append("SourcePorts: ").append(getSourcePorts()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getTcpFlags() != null)
            sb.append("TcpFlags: ").append(getTcpFlags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatelessRuleMatchAttributes == false)
            return false;
        RuleGroupSourceStatelessRuleMatchAttributes other = (RuleGroupSourceStatelessRuleMatchAttributes) obj;
        if (other.getDestinationPorts() == null ^ this.getDestinationPorts() == null)
            return false;
        if (other.getDestinationPorts() != null && other.getDestinationPorts().equals(this.getDestinationPorts()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getSourcePorts() == null ^ this.getSourcePorts() == null)
            return false;
        if (other.getSourcePorts() != null && other.getSourcePorts().equals(this.getSourcePorts()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getTcpFlags() == null ^ this.getTcpFlags() == null)
            return false;
        if (other.getTcpFlags() != null && other.getTcpFlags().equals(this.getTcpFlags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationPorts() == null) ? 0 : getDestinationPorts().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getSourcePorts() == null) ? 0 : getSourcePorts().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getTcpFlags() == null) ? 0 : getTcpFlags().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatelessRuleMatchAttributes clone() {
        try {
            return (RuleGroupSourceStatelessRuleMatchAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatelessRuleMatchAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
