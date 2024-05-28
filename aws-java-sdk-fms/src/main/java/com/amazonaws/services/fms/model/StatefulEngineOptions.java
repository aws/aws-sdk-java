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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration settings for the handling of the stateful rule groups in a Network Firewall firewall policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/StatefulEngineOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatefulEngineOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided to the
     * rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>DEFAULT_ACTION_ORDER</code>
     * </p>
     */
    private String ruleOrder;
    /**
     * <p>
     * Indicates how Network Firewall should handle traffic when a network connection breaks midstream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before the
     * break. This impacts the behavior of rules that depend on context. For example, with a stateful rule that drops
     * HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the context from session
     * initialization, which defines the application layer protocol as HTTP. However, a TCP-layer rule using a
     * <code>flow:stateless</code> rule would still match, and so would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this option,
     * Network Firewall also sends a TCP reject packet back to the client so the client can immediately establish a new
     * session. With the new session, Network Firewall will have context and will apply rules appropriately.
     * </p>
     * <p>
     * For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle timeouts,
     * this is the recommended setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream exception policy
     * settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html">Stream
     * exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>FMS_IGNORE</code>
     * </p>
     */
    private String streamExceptionPolicy;

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided to the
     * rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>DEFAULT_ACTION_ORDER</code>
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided
     *        to the rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     *        >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.</p>
     *        <p>
     *        Default: <code>DEFAULT_ACTION_ORDER</code>
     * @see RuleOrder
     */

    public void setRuleOrder(String ruleOrder) {
        this.ruleOrder = ruleOrder;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided to the
     * rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>DEFAULT_ACTION_ORDER</code>
     * </p>
     * 
     * @return Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided
     *         to the rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     *         >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.</p>
     *         <p>
     *         Default: <code>DEFAULT_ACTION_ORDER</code>
     * @see RuleOrder
     */

    public String getRuleOrder() {
        return this.ruleOrder;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided to the
     * rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>DEFAULT_ACTION_ORDER</code>
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided
     *        to the rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     *        >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.</p>
     *        <p>
     *        Default: <code>DEFAULT_ACTION_ORDER</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOrder
     */

    public StatefulEngineOptions withRuleOrder(String ruleOrder) {
        setRuleOrder(ruleOrder);
        return this;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided to the
     * rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     * >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>DEFAULT_ACTION_ORDER</code>
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy. Stateful rules are provided
     *        to the rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html"
     *        >Evaluation order for stateful rules</a> in the <i>Network Firewall Developer Guide</i>.</p>
     *        <p>
     *        Default: <code>DEFAULT_ACTION_ORDER</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOrder
     */

    public StatefulEngineOptions withRuleOrder(RuleOrder ruleOrder) {
        this.ruleOrder = ruleOrder.toString();
        return this;
    }

    /**
     * <p>
     * Indicates how Network Firewall should handle traffic when a network connection breaks midstream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before the
     * break. This impacts the behavior of rules that depend on context. For example, with a stateful rule that drops
     * HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the context from session
     * initialization, which defines the application layer protocol as HTTP. However, a TCP-layer rule using a
     * <code>flow:stateless</code> rule would still match, and so would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this option,
     * Network Firewall also sends a TCP reject packet back to the client so the client can immediately establish a new
     * session. With the new session, Network Firewall will have context and will apply rules appropriately.
     * </p>
     * <p>
     * For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle timeouts,
     * this is the recommended setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream exception policy
     * settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html">Stream
     * exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>FMS_IGNORE</code>
     * </p>
     * 
     * @param streamExceptionPolicy
     *        Indicates how Network Firewall should handle traffic when a network connection breaks midstream.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before
     *        the break. This impacts the behavior of rules that depend on context. For example, with a stateful rule
     *        that drops HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the
     *        context from session initialization, which defines the application layer protocol as HTTP. However, a
     *        TCP-layer rule using a <code>flow:stateless</code> rule would still match, and so would the
     *        <code>aws:drop_strict</code> default action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this option,
     *        Network Firewall also sends a TCP reject packet back to the client so the client can immediately establish
     *        a new session. With the new session, Network Firewall will have context and will apply rules
     *        appropriately.
     *        </p>
     *        <p>
     *        For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle
     *        timeouts, this is the recommended setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream exception
     *        policy settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html"
     *        >Stream exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>FMS_IGNORE</code>
     * @see StreamExceptionPolicy
     */

    public void setStreamExceptionPolicy(String streamExceptionPolicy) {
        this.streamExceptionPolicy = streamExceptionPolicy;
    }

    /**
     * <p>
     * Indicates how Network Firewall should handle traffic when a network connection breaks midstream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before the
     * break. This impacts the behavior of rules that depend on context. For example, with a stateful rule that drops
     * HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the context from session
     * initialization, which defines the application layer protocol as HTTP. However, a TCP-layer rule using a
     * <code>flow:stateless</code> rule would still match, and so would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this option,
     * Network Firewall also sends a TCP reject packet back to the client so the client can immediately establish a new
     * session. With the new session, Network Firewall will have context and will apply rules appropriately.
     * </p>
     * <p>
     * For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle timeouts,
     * this is the recommended setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream exception policy
     * settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html">Stream
     * exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>FMS_IGNORE</code>
     * </p>
     * 
     * @return Indicates how Network Firewall should handle traffic when a network connection breaks midstream.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before
     *         the break. This impacts the behavior of rules that depend on context. For example, with a stateful rule
     *         that drops HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the
     *         context from session initialization, which defines the application layer protocol as HTTP. However, a
     *         TCP-layer rule using a <code>flow:stateless</code> rule would still match, and so would the
     *         <code>aws:drop_strict</code> default action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this
     *         option, Network Firewall also sends a TCP reject packet back to the client so the client can immediately
     *         establish a new session. With the new session, Network Firewall will have context and will apply rules
     *         appropriately.
     *         </p>
     *         <p>
     *         For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle
     *         timeouts, this is the recommended setting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream
     *         exception policy settings.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html"
     *         >Stream exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     *         </p>
     *         <p>
     *         Default: <code>FMS_IGNORE</code>
     * @see StreamExceptionPolicy
     */

    public String getStreamExceptionPolicy() {
        return this.streamExceptionPolicy;
    }

    /**
     * <p>
     * Indicates how Network Firewall should handle traffic when a network connection breaks midstream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before the
     * break. This impacts the behavior of rules that depend on context. For example, with a stateful rule that drops
     * HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the context from session
     * initialization, which defines the application layer protocol as HTTP. However, a TCP-layer rule using a
     * <code>flow:stateless</code> rule would still match, and so would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this option,
     * Network Firewall also sends a TCP reject packet back to the client so the client can immediately establish a new
     * session. With the new session, Network Firewall will have context and will apply rules appropriately.
     * </p>
     * <p>
     * For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle timeouts,
     * this is the recommended setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream exception policy
     * settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html">Stream
     * exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>FMS_IGNORE</code>
     * </p>
     * 
     * @param streamExceptionPolicy
     *        Indicates how Network Firewall should handle traffic when a network connection breaks midstream.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before
     *        the break. This impacts the behavior of rules that depend on context. For example, with a stateful rule
     *        that drops HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the
     *        context from session initialization, which defines the application layer protocol as HTTP. However, a
     *        TCP-layer rule using a <code>flow:stateless</code> rule would still match, and so would the
     *        <code>aws:drop_strict</code> default action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this option,
     *        Network Firewall also sends a TCP reject packet back to the client so the client can immediately establish
     *        a new session. With the new session, Network Firewall will have context and will apply rules
     *        appropriately.
     *        </p>
     *        <p>
     *        For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle
     *        timeouts, this is the recommended setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream exception
     *        policy settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html"
     *        >Stream exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>FMS_IGNORE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamExceptionPolicy
     */

    public StatefulEngineOptions withStreamExceptionPolicy(String streamExceptionPolicy) {
        setStreamExceptionPolicy(streamExceptionPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates how Network Firewall should handle traffic when a network connection breaks midstream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before the
     * break. This impacts the behavior of rules that depend on context. For example, with a stateful rule that drops
     * HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the context from session
     * initialization, which defines the application layer protocol as HTTP. However, a TCP-layer rule using a
     * <code>flow:stateless</code> rule would still match, and so would the <code>aws:drop_strict</code> default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this option,
     * Network Firewall also sends a TCP reject packet back to the client so the client can immediately establish a new
     * session. With the new session, Network Firewall will have context and will apply rules appropriately.
     * </p>
     * <p>
     * For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle timeouts,
     * this is the recommended setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream exception policy
     * settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html">Stream
     * exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * <p>
     * Default: <code>FMS_IGNORE</code>
     * </p>
     * 
     * @param streamExceptionPolicy
     *        Indicates how Network Firewall should handle traffic when a network connection breaks midstream.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DROP</code> - Fail closed and drop all subsequent traffic going to the firewall.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTINUE</code> - Continue to apply rules to subsequent traffic without context from traffic before
     *        the break. This impacts the behavior of rules that depend on context. For example, with a stateful rule
     *        that drops HTTP traffic, Network Firewall won't match subsequent traffic because the it won't have the
     *        context from session initialization, which defines the application layer protocol as HTTP. However, a
     *        TCP-layer rule using a <code>flow:stateless</code> rule would still match, and so would the
     *        <code>aws:drop_strict</code> default action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECT</code> - Fail closed and drop all subsequent traffic going to the firewall. With this option,
     *        Network Firewall also sends a TCP reject packet back to the client so the client can immediately establish
     *        a new session. With the new session, Network Firewall will have context and will apply rules
     *        appropriately.
     *        </p>
     *        <p>
     *        For applications that are reliant on long-lived TCP connections that trigger Gateway Load Balancer idle
     *        timeouts, this is the recommended setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FMS_IGNORE</code> - Firewall Manager doesn't monitor or modify the Network Firewall stream exception
     *        policy settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/stream-exception-policy.html"
     *        >Stream exception policy in your firewall policy</a> in the <i>Network Firewall Developer Guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>FMS_IGNORE</code>
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
        com.amazonaws.services.fms.model.transform.StatefulEngineOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
