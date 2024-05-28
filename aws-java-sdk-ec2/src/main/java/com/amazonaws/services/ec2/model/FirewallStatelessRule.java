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
 * Describes a stateless rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FirewallStatelessRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallStatelessRule implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the stateless rule group.
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
     * The protocols.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> protocols;
    /**
     * <p>
     * The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>forward_to_site</code>.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The rule priority.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The ARN of the stateless rule group.
     * </p>
     * 
     * @param ruleGroupArn
     *        The ARN of the stateless rule group.
     */

    public void setRuleGroupArn(String ruleGroupArn) {
        this.ruleGroupArn = ruleGroupArn;
    }

    /**
     * <p>
     * The ARN of the stateless rule group.
     * </p>
     * 
     * @return The ARN of the stateless rule group.
     */

    public String getRuleGroupArn() {
        return this.ruleGroupArn;
    }

    /**
     * <p>
     * The ARN of the stateless rule group.
     * </p>
     * 
     * @param ruleGroupArn
     *        The ARN of the stateless rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatelessRule withRuleGroupArn(String ruleGroupArn) {
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

    public FirewallStatelessRule withSources(String... sources) {
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

    public FirewallStatelessRule withSources(java.util.Collection<String> sources) {
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

    public FirewallStatelessRule withDestinations(String... destinations) {
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

    public FirewallStatelessRule withDestinations(java.util.Collection<String> destinations) {
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

    public FirewallStatelessRule withSourcePorts(PortRange... sourcePorts) {
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

    public FirewallStatelessRule withSourcePorts(java.util.Collection<PortRange> sourcePorts) {
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

    public FirewallStatelessRule withDestinationPorts(PortRange... destinationPorts) {
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

    public FirewallStatelessRule withDestinationPorts(java.util.Collection<PortRange> destinationPorts) {
        setDestinationPorts(destinationPorts);
        return this;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @return The protocols.
     */

    public java.util.List<Integer> getProtocols() {
        if (protocols == null) {
            protocols = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return protocols;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     */

    public void setProtocols(java.util.Collection<Integer> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new com.amazonaws.internal.SdkInternalList<Integer>(protocols);
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatelessRule withProtocols(Integer... protocols) {
        if (this.protocols == null) {
            setProtocols(new com.amazonaws.internal.SdkInternalList<Integer>(protocols.length));
        }
        for (Integer ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatelessRule withProtocols(java.util.Collection<Integer> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>forward_to_site</code>.
     * </p>
     * 
     * @param ruleAction
     *        The rule action. The possible values are <code>pass</code>, <code>drop</code>, and
     *        <code>forward_to_site</code>.
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>forward_to_site</code>.
     * </p>
     * 
     * @return The rule action. The possible values are <code>pass</code>, <code>drop</code>, and
     *         <code>forward_to_site</code>.
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * The rule action. The possible values are <code>pass</code>, <code>drop</code>, and <code>forward_to_site</code>.
     * </p>
     * 
     * @param ruleAction
     *        The rule action. The possible values are <code>pass</code>, <code>drop</code>, and
     *        <code>forward_to_site</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatelessRule withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * The rule priority.
     * </p>
     * 
     * @param priority
     *        The rule priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The rule priority.
     * </p>
     * 
     * @return The rule priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The rule priority.
     * </p>
     * 
     * @param priority
     *        The rule priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatelessRule withPriority(Integer priority) {
        setPriority(priority);
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
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getRuleAction() != null)
            sb.append("RuleAction: ").append(getRuleAction()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallStatelessRule == false)
            return false;
        FirewallStatelessRule other = (FirewallStatelessRule) obj;
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
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
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
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public FirewallStatelessRule clone() {
        try {
            return (FirewallStatelessRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
