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
 * The inspection criteria and action for a single stateless rule. AWS Network Firewall inspects each packet for the
 * specified matching criteria. When a packet matches the criteria, Network Firewall performs the rule's actions on the
 * packet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/RuleDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each match
     * attributes set can include one or more items such as IP address, CIDR range, port number, protocol, and TCP
     * flags.
     * </p>
     */
    private MatchAttributes matchAttributes;
    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action and you can add custom actions.
     * </p>
     * <note>
     * <p>
     * Network Firewall only forwards a packet for stateful rule inspection if you specify
     * <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any stateless
     * rule and you specify <code>aws:forward_to_sfe</code> for the <code>StatelessDefaultActions</code> setting for the
     * <a>FirewallPolicy</a>.
     * </p>
     * </note>
     * <p>
     * For every rule, you must specify exactly one of the following standard actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the stateful rule
     * engine for inspection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, you can specify a custom action. To do this, you define a custom action by name and type, then
     * provide the name you've assigned to the action in this <code>Actions</code> setting. For information about the
     * options, see <a>CustomAction</a>.
     * </p>
     * <p>
     * To provide more than one action in this setting, separate the settings with a comma. For example, if you have a
     * custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you could specify
     * the standard action <code>aws:pass</code> and the custom action with <code>[“aws:pass”, “MyMetricsAction”]</code>
     * .
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each match
     * attributes set can include one or more items such as IP address, CIDR range, port number, protocol, and TCP
     * flags.
     * </p>
     * 
     * @param matchAttributes
     *        Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each
     *        match attributes set can include one or more items such as IP address, CIDR range, port number, protocol,
     *        and TCP flags.
     */

    public void setMatchAttributes(MatchAttributes matchAttributes) {
        this.matchAttributes = matchAttributes;
    }

    /**
     * <p>
     * Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each match
     * attributes set can include one or more items such as IP address, CIDR range, port number, protocol, and TCP
     * flags.
     * </p>
     * 
     * @return Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each
     *         match attributes set can include one or more items such as IP address, CIDR range, port number, protocol,
     *         and TCP flags.
     */

    public MatchAttributes getMatchAttributes() {
        return this.matchAttributes;
    }

    /**
     * <p>
     * Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each match
     * attributes set can include one or more items such as IP address, CIDR range, port number, protocol, and TCP
     * flags.
     * </p>
     * 
     * @param matchAttributes
     *        Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each
     *        match attributes set can include one or more items such as IP address, CIDR range, port number, protocol,
     *        and TCP flags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDefinition withMatchAttributes(MatchAttributes matchAttributes) {
        setMatchAttributes(matchAttributes);
        return this;
    }

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action and you can add custom actions.
     * </p>
     * <note>
     * <p>
     * Network Firewall only forwards a packet for stateful rule inspection if you specify
     * <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any stateless
     * rule and you specify <code>aws:forward_to_sfe</code> for the <code>StatelessDefaultActions</code> setting for the
     * <a>FirewallPolicy</a>.
     * </p>
     * </note>
     * <p>
     * For every rule, you must specify exactly one of the following standard actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the stateful rule
     * engine for inspection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, you can specify a custom action. To do this, you define a custom action by name and type, then
     * provide the name you've assigned to the action in this <code>Actions</code> setting. For information about the
     * options, see <a>CustomAction</a>.
     * </p>
     * <p>
     * To provide more than one action in this setting, separate the settings with a comma. For example, if you have a
     * custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you could specify
     * the standard action <code>aws:pass</code> and the custom action with <code>[“aws:pass”, “MyMetricsAction”]</code>
     * .
     * </p>
     * 
     * @return The actions to take on a packet that matches one of the stateless rule definition's match attributes. You
     *         must specify a standard action and you can add custom actions. </p> <note>
     *         <p>
     *         Network Firewall only forwards a packet for stateful rule inspection if you specify
     *         <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any
     *         stateless rule and you specify <code>aws:forward_to_sfe</code> for the
     *         <code>StatelessDefaultActions</code> setting for the <a>FirewallPolicy</a>.
     *         </p>
     *         </note>
     *         <p>
     *         For every rule, you must specify exactly one of the following standard actions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended
     *         destination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended
     *         destination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the
     *         stateful rule engine for inspection.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Additionally, you can specify a custom action. To do this, you define a custom action by name and type,
     *         then provide the name you've assigned to the action in this <code>Actions</code> setting. For information
     *         about the options, see <a>CustomAction</a>.
     *         </p>
     *         <p>
     *         To provide more than one action in this setting, separate the settings with a comma. For example, if you
     *         have a custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you
     *         could specify the standard action <code>aws:pass</code> and the custom action with
     *         <code>[“aws:pass”, “MyMetricsAction”]</code>.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action and you can add custom actions.
     * </p>
     * <note>
     * <p>
     * Network Firewall only forwards a packet for stateful rule inspection if you specify
     * <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any stateless
     * rule and you specify <code>aws:forward_to_sfe</code> for the <code>StatelessDefaultActions</code> setting for the
     * <a>FirewallPolicy</a>.
     * </p>
     * </note>
     * <p>
     * For every rule, you must specify exactly one of the following standard actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the stateful rule
     * engine for inspection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, you can specify a custom action. To do this, you define a custom action by name and type, then
     * provide the name you've assigned to the action in this <code>Actions</code> setting. For information about the
     * options, see <a>CustomAction</a>.
     * </p>
     * <p>
     * To provide more than one action in this setting, separate the settings with a comma. For example, if you have a
     * custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you could specify
     * the standard action <code>aws:pass</code> and the custom action with <code>[“aws:pass”, “MyMetricsAction”]</code>
     * .
     * </p>
     * 
     * @param actions
     *        The actions to take on a packet that matches one of the stateless rule definition's match attributes. You
     *        must specify a standard action and you can add custom actions. </p> <note>
     *        <p>
     *        Network Firewall only forwards a packet for stateful rule inspection if you specify
     *        <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any
     *        stateless rule and you specify <code>aws:forward_to_sfe</code> for the
     *        <code>StatelessDefaultActions</code> setting for the <a>FirewallPolicy</a>.
     *        </p>
     *        </note>
     *        <p>
     *        For every rule, you must specify exactly one of the following standard actions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended
     *        destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended
     *        destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the
     *        stateful rule engine for inspection.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Additionally, you can specify a custom action. To do this, you define a custom action by name and type,
     *        then provide the name you've assigned to the action in this <code>Actions</code> setting. For information
     *        about the options, see <a>CustomAction</a>.
     *        </p>
     *        <p>
     *        To provide more than one action in this setting, separate the settings with a comma. For example, if you
     *        have a custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you
     *        could specify the standard action <code>aws:pass</code> and the custom action with
     *        <code>[“aws:pass”, “MyMetricsAction”]</code>.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action and you can add custom actions.
     * </p>
     * <note>
     * <p>
     * Network Firewall only forwards a packet for stateful rule inspection if you specify
     * <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any stateless
     * rule and you specify <code>aws:forward_to_sfe</code> for the <code>StatelessDefaultActions</code> setting for the
     * <a>FirewallPolicy</a>.
     * </p>
     * </note>
     * <p>
     * For every rule, you must specify exactly one of the following standard actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the stateful rule
     * engine for inspection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, you can specify a custom action. To do this, you define a custom action by name and type, then
     * provide the name you've assigned to the action in this <code>Actions</code> setting. For information about the
     * options, see <a>CustomAction</a>.
     * </p>
     * <p>
     * To provide more than one action in this setting, separate the settings with a comma. For example, if you have a
     * custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you could specify
     * the standard action <code>aws:pass</code> and the custom action with <code>[“aws:pass”, “MyMetricsAction”]</code>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions to take on a packet that matches one of the stateless rule definition's match attributes. You
     *        must specify a standard action and you can add custom actions. </p> <note>
     *        <p>
     *        Network Firewall only forwards a packet for stateful rule inspection if you specify
     *        <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any
     *        stateless rule and you specify <code>aws:forward_to_sfe</code> for the
     *        <code>StatelessDefaultActions</code> setting for the <a>FirewallPolicy</a>.
     *        </p>
     *        </note>
     *        <p>
     *        For every rule, you must specify exactly one of the following standard actions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended
     *        destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended
     *        destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the
     *        stateful rule engine for inspection.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Additionally, you can specify a custom action. To do this, you define a custom action by name and type,
     *        then provide the name you've assigned to the action in this <code>Actions</code> setting. For information
     *        about the options, see <a>CustomAction</a>.
     *        </p>
     *        <p>
     *        To provide more than one action in this setting, separate the settings with a comma. For example, if you
     *        have a custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you
     *        could specify the standard action <code>aws:pass</code> and the custom action with
     *        <code>[“aws:pass”, “MyMetricsAction”]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDefinition withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must
     * specify a standard action and you can add custom actions.
     * </p>
     * <note>
     * <p>
     * Network Firewall only forwards a packet for stateful rule inspection if you specify
     * <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any stateless
     * rule and you specify <code>aws:forward_to_sfe</code> for the <code>StatelessDefaultActions</code> setting for the
     * <a>FirewallPolicy</a>.
     * </p>
     * </note>
     * <p>
     * For every rule, you must specify exactly one of the following standard actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the stateful rule
     * engine for inspection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, you can specify a custom action. To do this, you define a custom action by name and type, then
     * provide the name you've assigned to the action in this <code>Actions</code> setting. For information about the
     * options, see <a>CustomAction</a>.
     * </p>
     * <p>
     * To provide more than one action in this setting, separate the settings with a comma. For example, if you have a
     * custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you could specify
     * the standard action <code>aws:pass</code> and the custom action with <code>[“aws:pass”, “MyMetricsAction”]</code>
     * .
     * </p>
     * 
     * @param actions
     *        The actions to take on a packet that matches one of the stateless rule definition's match attributes. You
     *        must specify a standard action and you can add custom actions. </p> <note>
     *        <p>
     *        Network Firewall only forwards a packet for stateful rule inspection if you specify
     *        <code>aws:forward_to_sfe</code> for a rule that the packet matches, or if the packet doesn't match any
     *        stateless rule and you specify <code>aws:forward_to_sfe</code> for the
     *        <code>StatelessDefaultActions</code> setting for the <a>FirewallPolicy</a>.
     *        </p>
     *        </note>
     *        <p>
     *        For every rule, you must specify exactly one of the following standard actions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>aws:pass</b> - Discontinues all inspection of the packet and permits it to go to its intended
     *        destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aws:drop</b> - Discontinues all inspection of the packet and blocks it from going to its intended
     *        destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aws:forward_to_sfe</b> - Discontinues stateless inspection of the packet and forwards it to the
     *        stateful rule engine for inspection.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Additionally, you can specify a custom action. To do this, you define a custom action by name and type,
     *        then provide the name you've assigned to the action in this <code>Actions</code> setting. For information
     *        about the options, see <a>CustomAction</a>.
     *        </p>
     *        <p>
     *        To provide more than one action in this setting, separate the settings with a comma. For example, if you
     *        have a custom <code>PublishMetrics</code> action that you've named <code>MyMetricsAction</code>, then you
     *        could specify the standard action <code>aws:pass</code> and the custom action with
     *        <code>[“aws:pass”, “MyMetricsAction”]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDefinition withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
        if (getMatchAttributes() != null)
            sb.append("MatchAttributes: ").append(getMatchAttributes()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleDefinition == false)
            return false;
        RuleDefinition other = (RuleDefinition) obj;
        if (other.getMatchAttributes() == null ^ this.getMatchAttributes() == null)
            return false;
        if (other.getMatchAttributes() != null && other.getMatchAttributes().equals(this.getMatchAttributes()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchAttributes() == null) ? 0 : getMatchAttributes().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public RuleDefinition clone() {
        try {
            return (RuleDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.RuleDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
