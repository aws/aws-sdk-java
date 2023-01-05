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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration settings for the handling of the stateful rule groups in a firewall policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/StatefulEngineOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatefulEngineOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. <code>DEFAULT_ACTION_ORDER</code>
     * is the default behavior. Stateful rules are provided to the rule engine as Suricata compatible strings, and
     * Suricata evaluates them based on certain settings. For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     */
    private String ruleOrder;
    /**
     * <p>
     * Configures how Network Firewall processes traffic when a network connection breaks midstream. Network connections
     * can break due to disruptions in external networks or within the firewall itself.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall. This is
     * the default behavior.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without context from
     * traffic before the break. This impacts the behavior of rules that depend on this context. For example, if you
     * have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match the traffic for this rule
     * because the service won't have the context from session initialization defining the application layer protocol as
     * HTTP. However, this behavior is rule dependent—a TCP-layer rule using a <code>flow:stateless</code> rule would
     * still match, as would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * </ul>
     */
    private String streamExceptionPolicy;

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. <code>DEFAULT_ACTION_ORDER</code>
     * is the default behavior. Stateful rules are provided to the rule engine as Suricata compatible strings, and
     * Suricata evaluates them based on certain settings. For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy.
     *        <code>DEFAULT_ACTION_ORDER</code> is the default behavior. Stateful rules are provided to the rule engine
     *        as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     *        >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * @see RuleOrder
     */

    public void setRuleOrder(String ruleOrder) {
        this.ruleOrder = ruleOrder;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. <code>DEFAULT_ACTION_ORDER</code>
     * is the default behavior. Stateful rules are provided to the rule engine as Suricata compatible strings, and
     * Suricata evaluates them based on certain settings. For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * 
     * @return Indicates how to manage the order of stateful rule evaluation for the policy.
     *         <code>DEFAULT_ACTION_ORDER</code> is the default behavior. Stateful rules are provided to the rule engine
     *         as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     *         >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * @see RuleOrder
     */

    public String getRuleOrder() {
        return this.ruleOrder;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. <code>DEFAULT_ACTION_ORDER</code>
     * is the default behavior. Stateful rules are provided to the rule engine as Suricata compatible strings, and
     * Suricata evaluates them based on certain settings. For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy.
     *        <code>DEFAULT_ACTION_ORDER</code> is the default behavior. Stateful rules are provided to the rule engine
     *        as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     *        >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOrder
     */

    public StatefulEngineOptions withRuleOrder(String ruleOrder) {
        setRuleOrder(ruleOrder);
        return this;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. <code>DEFAULT_ACTION_ORDER</code>
     * is the default behavior. Stateful rules are provided to the rule engine as Suricata compatible strings, and
     * Suricata evaluates them based on certain settings. For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy.
     *        <code>DEFAULT_ACTION_ORDER</code> is the default behavior. Stateful rules are provided to the rule engine
     *        as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     *        >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOrder
     */

    public StatefulEngineOptions withRuleOrder(RuleOrder ruleOrder) {
        this.ruleOrder = ruleOrder.toString();
        return this;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when a network connection breaks midstream. Network connections
     * can break due to disruptions in external networks or within the firewall itself.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall. This is
     * the default behavior.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without context from
     * traffic before the break. This impacts the behavior of rules that depend on this context. For example, if you
     * have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match the traffic for this rule
     * because the service won't have the context from session initialization defining the application layer protocol as
     * HTTP. However, this behavior is rule dependent—a TCP-layer rule using a <code>flow:stateless</code> rule would
     * still match, as would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamExceptionPolicy
     *        Configures how Network Firewall processes traffic when a network connection breaks midstream. Network
     *        connections can break due to disruptions in external networks or within the firewall itself.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall.
     *        This is the default behavior.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without
     *        context from traffic before the break. This impacts the behavior of rules that depend on this context. For
     *        example, if you have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match the
     *        traffic for this rule because the service won't have the context from session initialization defining the
     *        application layer protocol as HTTP. However, this behavior is rule dependent—a TCP-layer rule using a
     *        <code>flow:stateless</code> rule would still match, as would the <code>aws:drop_strict</code> default
     *        action.
     *        </p>
     *        </li>
     * @see StreamExceptionPolicy
     */

    public void setStreamExceptionPolicy(String streamExceptionPolicy) {
        this.streamExceptionPolicy = streamExceptionPolicy;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when a network connection breaks midstream. Network connections
     * can break due to disruptions in external networks or within the firewall itself.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall. This is
     * the default behavior.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without context from
     * traffic before the break. This impacts the behavior of rules that depend on this context. For example, if you
     * have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match the traffic for this rule
     * because the service won't have the context from session initialization defining the application layer protocol as
     * HTTP. However, this behavior is rule dependent—a TCP-layer rule using a <code>flow:stateless</code> rule would
     * still match, as would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Configures how Network Firewall processes traffic when a network connection breaks midstream. Network
     *         connections can break due to disruptions in external networks or within the firewall itself.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall.
     *         This is the default behavior.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without
     *         context from traffic before the break. This impacts the behavior of rules that depend on this context.
     *         For example, if you have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match
     *         the traffic for this rule because the service won't have the context from session initialization defining
     *         the application layer protocol as HTTP. However, this behavior is rule dependent—a TCP-layer rule using a
     *         <code>flow:stateless</code> rule would still match, as would the <code>aws:drop_strict</code> default
     *         action.
     *         </p>
     *         </li>
     * @see StreamExceptionPolicy
     */

    public String getStreamExceptionPolicy() {
        return this.streamExceptionPolicy;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when a network connection breaks midstream. Network connections
     * can break due to disruptions in external networks or within the firewall itself.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall. This is
     * the default behavior.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without context from
     * traffic before the break. This impacts the behavior of rules that depend on this context. For example, if you
     * have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match the traffic for this rule
     * because the service won't have the context from session initialization defining the application layer protocol as
     * HTTP. However, this behavior is rule dependent—a TCP-layer rule using a <code>flow:stateless</code> rule would
     * still match, as would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamExceptionPolicy
     *        Configures how Network Firewall processes traffic when a network connection breaks midstream. Network
     *        connections can break due to disruptions in external networks or within the firewall itself.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall.
     *        This is the default behavior.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without
     *        context from traffic before the break. This impacts the behavior of rules that depend on this context. For
     *        example, if you have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match the
     *        traffic for this rule because the service won't have the context from session initialization defining the
     *        application layer protocol as HTTP. However, this behavior is rule dependent—a TCP-layer rule using a
     *        <code>flow:stateless</code> rule would still match, as would the <code>aws:drop_strict</code> default
     *        action.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamExceptionPolicy
     */

    public StatefulEngineOptions withStreamExceptionPolicy(String streamExceptionPolicy) {
        setStreamExceptionPolicy(streamExceptionPolicy);
        return this;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when a network connection breaks midstream. Network connections
     * can break due to disruptions in external networks or within the firewall itself.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall. This is
     * the default behavior.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without context from
     * traffic before the break. This impacts the behavior of rules that depend on this context. For example, if you
     * have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match the traffic for this rule
     * because the service won't have the context from session initialization defining the application layer protocol as
     * HTTP. However, this behavior is rule dependent—a TCP-layer rule using a <code>flow:stateless</code> rule would
     * still match, as would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamExceptionPolicy
     *        Configures how Network Firewall processes traffic when a network connection breaks midstream. Network
     *        connections can break due to disruptions in external networks or within the firewall itself.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DROP</code> - Network Firewall fails closed and drops all subsequent traffic going to the firewall.
     *        This is the default behavior.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Network Firewall continues to apply rules to the subsequent traffic without
     *        context from traffic before the break. This impacts the behavior of rules that depend on this context. For
     *        example, if you have a stateful rule to <code>drop http</code> traffic, Network Firewall won't match the
     *        traffic for this rule because the service won't have the context from session initialization defining the
     *        application layer protocol as HTTP. However, this behavior is rule dependent—a TCP-layer rule using a
     *        <code>flow:stateless</code> rule would still match, as would the <code>aws:drop_strict</code> default
     *        action.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamExceptionPolicy
     */

    public StatefulEngineOptions withStreamExceptionPolicy(StreamExceptionPolicy streamExceptionPolicy) {
        this.streamExceptionPolicy = streamExceptionPolicy.toString();
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
        if (getRuleOrder() != null)
            sb.append("RuleOrder: ").append(getRuleOrder()).append(",");
        if (getStreamExceptionPolicy() != null)
            sb.append("StreamExceptionPolicy: ").append(getStreamExceptionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatefulEngineOptions == false)
            return false;
        StatefulEngineOptions other = (StatefulEngineOptions) obj;
        if (other.getRuleOrder() == null ^ this.getRuleOrder() == null)
            return false;
        if (other.getRuleOrder() != null && other.getRuleOrder().equals(this.getRuleOrder()) == false)
            return false;
        if (other.getStreamExceptionPolicy() == null ^ this.getStreamExceptionPolicy() == null)
            return false;
        if (other.getStreamExceptionPolicy() != null && other.getStreamExceptionPolicy().equals(this.getStreamExceptionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleOrder() == null) ? 0 : getRuleOrder().hashCode());
        hashCode = prime * hashCode + ((getStreamExceptionPolicy() == null) ? 0 : getStreamExceptionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public StatefulEngineOptions clone() {
        try {
            return (StatefulEngineOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.StatefulEngineOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
