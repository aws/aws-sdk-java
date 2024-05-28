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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a stateful rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FirewallStatefulRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallStatefulRule implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the stateful rule group.
     * </p>
     */
    private String ruleGroupArn;
    /**
     * <p>
     * The source IP addresses, in CIDR notation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sources;
    /**
     * <p>
     * The destination IP addresses, in CIDR notation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinations;
    /**
     * <p>
     * The source ports.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PortRange> sourcePorts;
    /**
     * <p>
     * The destination ports.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PortRange> destinationPorts;
    /**
     * <p>
     * The protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>alert</code>.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The direction. The possible values are <code>FORWARD</code> and <code>ANY</code>.
     * </p>
     */
    private String direction;

    /**
     * <p>
     * The ARN of the stateful rule group.
     * </p>
     * 
     * @param ruleGroupArn
     *        The ARN of the stateful rule group.
     */

    public void setRuleGroupArn(String ruleGroupArn) {
        this.ruleGroupArn = ruleGroupArn;
    }

    /**
     * <p>
     * The ARN of the stateful rule group.
     * </p>
     * 
     * @return The ARN of the stateful rule group.
     */

    public String getRuleGroupArn() {
        return this.ruleGroupArn;
    }

    /**
     * <p>
     * The ARN of the stateful rule group.
     * </p>
     * 
     * @param ruleGroupArn
     *        The ARN of the stateful rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withRuleGroupArn(String ruleGroupArn) {
        setRuleGroupArn(ruleGroupArn);
        return this;
    }

    /**
     * <p>
     * The source IP addresses, in CIDR notation.
     * </p>
     * 
     * @return The source IP addresses, in CIDR notation.
     */

    public java.util.List<String> getSources() {
        if (sources == null) {
            sources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sources;
    }

    /**
     * <p>
     * The source IP addresses, in CIDR notation.
     * </p>
     * 
     * @param sources
     *        The source IP addresses, in CIDR notation.
     */

    public void setSources(java.util.Collection<String> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new com.amazonaws.internal.SdkInternalList<String>(sources);
    }

    /**
     * <p>
     * The source IP addresses, in CIDR notation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The source IP addresses, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withSources(String... sources) {
        if (this.sources == null) {
            setSources(new com.amazonaws.internal.SdkInternalList<String>(sources.length));
        }
        for (String ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source IP addresses, in CIDR notation.
     * </p>
     * 
     * @param sources
     *        The source IP addresses, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withSources(java.util.Collection<String> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The destination IP addresses, in CIDR notation.
     * </p>
     * 
     * @return The destination IP addresses, in CIDR notation.
     */

    public java.util.List<String> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinations;
    }

    /**
     * <p>
     * The destination IP addresses, in CIDR notation.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses, in CIDR notation.
     */

    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<String>(destinations);
    }

    /**
     * <p>
     * The destination IP addresses, in CIDR notation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withDestinations(String... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<String>(destinations.length));
        }
        for (String ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination IP addresses, in CIDR notation.
     * </p>
     * 
     * @param destinations
     *        The destination IP addresses, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withDestinations(java.util.Collection<String> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The source ports.
     * </p>
     * 
     * @return The source ports.
     */

    public java.util.List<PortRange> getSourcePorts() {
        if (sourcePorts == null) {
            sourcePorts = new com.amazonaws.internal.SdkInternalList<PortRange>();
        }
        return sourcePorts;
    }

    /**
     * <p>
     * The source ports.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports.
     */

    public void setSourcePorts(java.util.Collection<PortRange> sourcePorts) {
        if (sourcePorts == null) {
            this.sourcePorts = null;
            return;
        }

        this.sourcePorts = new com.amazonaws.internal.SdkInternalList<PortRange>(sourcePorts);
    }

    /**
     * <p>
     * The source ports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourcePorts(java.util.Collection)} or {@link #withSourcePorts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withSourcePorts(PortRange... sourcePorts) {
        if (this.sourcePorts == null) {
            setSourcePorts(new com.amazonaws.internal.SdkInternalList<PortRange>(sourcePorts.length));
        }
        for (PortRange ele : sourcePorts) {
            this.sourcePorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source ports.
     * </p>
     * 
     * @param sourcePorts
     *        The source ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withSourcePorts(java.util.Collection<PortRange> sourcePorts) {
        setSourcePorts(sourcePorts);
        return this;
    }

    /**
     * <p>
     * The destination ports.
     * </p>
     * 
     * @return The destination ports.
     */

    public java.util.List<PortRange> getDestinationPorts() {
        if (destinationPorts == null) {
            destinationPorts = new com.amazonaws.internal.SdkInternalList<PortRange>();
        }
        return destinationPorts;
    }

    /**
     * <p>
     * The destination ports.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports.
     */

    public void setDestinationPorts(java.util.Collection<PortRange> destinationPorts) {
        if (destinationPorts == null) {
            this.destinationPorts = null;
            return;
        }

        this.destinationPorts = new com.amazonaws.internal.SdkInternalList<PortRange>(destinationPorts);
    }

    /**
     * <p>
     * The destination ports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPorts(java.util.Collection)} or {@link #withDestinationPorts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withDestinationPorts(PortRange... destinationPorts) {
        if (this.destinationPorts == null) {
            setDestinationPorts(new com.amazonaws.internal.SdkInternalList<PortRange>(destinationPorts.length));
        }
        for (PortRange ele : destinationPorts) {
            this.destinationPorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination ports.
     * </p>
     * 
     * @param destinationPorts
     *        The destination ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withDestinationPorts(java.util.Collection<PortRange> destinationPorts) {
        setDestinationPorts(destinationPorts);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @return The protocol.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>alert</code>.
     * </p>
     * 
     * @param ruleAction
     *        The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>alert</code>.
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>alert</code>.
     * </p>
     * 
     * @return The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>alert</code>.
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>alert</code>.
     * </p>
     * 
     * @param ruleAction
     *        The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>alert</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * The direction. The possible values are <code>FORWARD</code> and <code>ANY</code>.
     * </p>
     * 
     * @param direction
     *        The direction. The possible values are <code>FORWARD</code> and <code>ANY</code>.
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The direction. The possible values are <code>FORWARD</code> and <code>ANY</code>.
     * </p>
     * 
     * @return The direction. The possible values are <code>FORWARD</code> and <code>ANY</code>.
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * The direction. The possible values are <code>FORWARD</code> and <code>ANY</code>.
     * </p>
     * 
     * @param direction
     *        The direction. The possible values are <code>FORWARD</code> and <code>ANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatefulRule withDirection(String direction) {
        setDirection(direction);
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
        if (getRuleGroupArn() != null)
            sb.append("RuleGroupArn: ").append(getRuleGroupArn()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getSourcePorts() != null)
            sb.append("SourcePorts: ").append(getSourcePorts()).append(",");
        if (getDestinationPorts() != null)
            sb.append("DestinationPorts: ").append(getDestinationPorts()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getRuleAction() != null)
            sb.append("RuleAction: ").append(getRuleAction()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallStatefulRule == false)
            return false;
        FirewallStatefulRule other = (FirewallStatefulRule) obj;
        if (other.getRuleGroupArn() == null ^ this.getRuleGroupArn() == null)
            return false;
        if (other.getRuleGroupArn() != null && other.getRuleGroupArn().equals(this.getRuleGroupArn()) == false)
            return false;
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
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupArn() == null) ? 0 : getRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getSourcePorts() == null) ? 0 : getSourcePorts().hashCode());
        hashCode = prime * hashCode + ((getDestinationPorts() == null) ? 0 : getDestinationPorts().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        return hashCode;
    }

    @Override
    public FirewallStatefulRule clone() {
        try {
            return (FirewallStatefulRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
