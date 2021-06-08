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
 * A single 5-tuple stateful rule, for use in a stateful rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/StatefulRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatefulRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria. For all actions, Network Firewall performs the specified action and discontinues stateful
     * inspection of the traffic flow.
     * </p>
     * <p>
     * The actions for a stateful rule are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Permits the packets to go to the intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * <p>
     * You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule with
     * <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change the action to
     * <code>DROP</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String action;
    /**
     * <p>
     * The stateful 5-tuple inspection criteria for this rule, used to inspect traffic flows.
     * </p>
     */
    private Header header;
    /** <p/> */
    private java.util.List<RuleOption> ruleOptions;

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria. For all actions, Network Firewall performs the specified action and discontinues stateful
     * inspection of the traffic flow.
     * </p>
     * <p>
     * The actions for a stateful rule are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Permits the packets to go to the intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * <p>
     * You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule with
     * <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change the action to
     * <code>DROP</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the
     *        stateful rule criteria. For all actions, Network Firewall performs the specified action and discontinues
     *        stateful inspection of the traffic flow. </p>
     *        <p>
     *        The actions for a stateful rule are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Permits the packets to go to the intended destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message, if
     *        alert logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if
     *        alert logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     *        </p>
     *        <p>
     *        You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule
     *        with <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change the
     *        action to <code>DROP</code>.
     *        </p>
     *        </li>
     * @see StatefulAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria. For all actions, Network Firewall performs the specified action and discontinues stateful
     * inspection of the traffic flow.
     * </p>
     * <p>
     * The actions for a stateful rule are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Permits the packets to go to the intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * <p>
     * You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule with
     * <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change the action to
     * <code>DROP</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the
     *         stateful rule criteria. For all actions, Network Firewall performs the specified action and discontinues
     *         stateful inspection of the traffic flow. </p>
     *         <p>
     *         The actions for a stateful rule are defined as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PASS</b> - Permits the packets to go to the intended destination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message,
     *         if alert logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if
     *         alert logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     *         </p>
     *         <p>
     *         You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule
     *         with <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change
     *         the action to <code>DROP</code>.
     *         </p>
     *         </li>
     * @see StatefulAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria. For all actions, Network Firewall performs the specified action and discontinues stateful
     * inspection of the traffic flow.
     * </p>
     * <p>
     * The actions for a stateful rule are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Permits the packets to go to the intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * <p>
     * You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule with
     * <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change the action to
     * <code>DROP</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the
     *        stateful rule criteria. For all actions, Network Firewall performs the specified action and discontinues
     *        stateful inspection of the traffic flow. </p>
     *        <p>
     *        The actions for a stateful rule are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Permits the packets to go to the intended destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message, if
     *        alert logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if
     *        alert logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     *        </p>
     *        <p>
     *        You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule
     *        with <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change the
     *        action to <code>DROP</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatefulAction
     */

    public StatefulRule withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria. For all actions, Network Firewall performs the specified action and discontinues stateful
     * inspection of the traffic flow.
     * </p>
     * <p>
     * The actions for a stateful rule are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Permits the packets to go to the intended destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if alert
     * logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     * </p>
     * <p>
     * You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule with
     * <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change the action to
     * <code>DROP</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the
     *        stateful rule criteria. For all actions, Network Firewall performs the specified action and discontinues
     *        stateful inspection of the traffic flow. </p>
     *        <p>
     *        The actions for a stateful rule are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Permits the packets to go to the intended destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Blocks the packets from going to the intended destination and sends an alert log message, if
     *        alert logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ALERT</b> - Permits the packets to go to the intended destination and sends an alert log message, if
     *        alert logging is configured in the <a>Firewall</a> <a>LoggingConfiguration</a>.
     *        </p>
     *        <p>
     *        You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule
     *        with <code>ALERT</code> action, verify in the logs that the rule is filtering as you want, then change the
     *        action to <code>DROP</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatefulAction
     */

    public StatefulRule withAction(StatefulAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The stateful 5-tuple inspection criteria for this rule, used to inspect traffic flows.
     * </p>
     * 
     * @param header
     *        The stateful 5-tuple inspection criteria for this rule, used to inspect traffic flows.
     */

    public void setHeader(Header header) {
        this.header = header;
    }

    /**
     * <p>
     * The stateful 5-tuple inspection criteria for this rule, used to inspect traffic flows.
     * </p>
     * 
     * @return The stateful 5-tuple inspection criteria for this rule, used to inspect traffic flows.
     */

    public Header getHeader() {
        return this.header;
    }

    /**
     * <p>
     * The stateful 5-tuple inspection criteria for this rule, used to inspect traffic flows.
     * </p>
     * 
     * @param header
     *        The stateful 5-tuple inspection criteria for this rule, used to inspect traffic flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatefulRule withHeader(Header header) {
        setHeader(header);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<RuleOption> getRuleOptions() {
        return ruleOptions;
    }

    /**
     * <p/>
     * 
     * @param ruleOptions
     */

    public void setRuleOptions(java.util.Collection<RuleOption> ruleOptions) {
        if (ruleOptions == null) {
            this.ruleOptions = null;
            return;
        }

        this.ruleOptions = new java.util.ArrayList<RuleOption>(ruleOptions);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleOptions(java.util.Collection)} or {@link #withRuleOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatefulRule withRuleOptions(RuleOption... ruleOptions) {
        if (this.ruleOptions == null) {
            setRuleOptions(new java.util.ArrayList<RuleOption>(ruleOptions.length));
        }
        for (RuleOption ele : ruleOptions) {
            this.ruleOptions.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param ruleOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatefulRule withRuleOptions(java.util.Collection<RuleOption> ruleOptions) {
        setRuleOptions(ruleOptions);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getRuleOptions() != null)
            sb.append("RuleOptions: ").append(getRuleOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatefulRule == false)
            return false;
        StatefulRule other = (StatefulRule) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getRuleOptions() == null ^ this.getRuleOptions() == null)
            return false;
        if (other.getRuleOptions() != null && other.getRuleOptions().equals(this.getRuleOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getRuleOptions() == null) ? 0 : getRuleOptions().hashCode());
        return hashCode;
    }

    @Override
    public StatefulRule clone() {
        try {
            return (StatefulRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.StatefulRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
