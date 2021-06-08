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
 * The stateless or stateful rules definitions for use in a single rule group. Each rule group requires a single
 * <code>RulesSource</code>. You can use an instance of this for either stateless rules or stateful rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/RulesSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RulesSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules. Suricata
     * is an open-source network IPS that includes a standard rule-based language for network traffic inspection.
     * </p>
     * <p>
     * These rules contain the inspection criteria and the action to take for traffic that matches the criteria, so this
     * type of rule group doesn't have a separate action setting.
     * </p>
     */
    private String rulesString;
    /**
     * <p>
     * Stateful inspection criteria for a domain list rule group.
     * </p>
     */
    private RulesSourceList rulesSourceList;
    /**
     * <p>
     * The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to be used
     * together in a stateful rule group.
     * </p>
     */
    private java.util.List<StatefulRule> statefulRules;
    /**
     * <p>
     * Stateless inspection criteria to be used in a stateless rule group.
     * </p>
     */
    private StatelessRulesAndCustomActions statelessRulesAndCustomActions;

    /**
     * <p>
     * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules. Suricata
     * is an open-source network IPS that includes a standard rule-based language for network traffic inspection.
     * </p>
     * <p>
     * These rules contain the inspection criteria and the action to take for traffic that matches the criteria, so this
     * type of rule group doesn't have a separate action setting.
     * </p>
     * 
     * @param rulesString
     *        Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     *        Suricata is an open-source network IPS that includes a standard rule-based language for network traffic
     *        inspection.</p>
     *        <p>
     *        These rules contain the inspection criteria and the action to take for traffic that matches the criteria,
     *        so this type of rule group doesn't have a separate action setting.
     */

    public void setRulesString(String rulesString) {
        this.rulesString = rulesString;
    }

    /**
     * <p>
     * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules. Suricata
     * is an open-source network IPS that includes a standard rule-based language for network traffic inspection.
     * </p>
     * <p>
     * These rules contain the inspection criteria and the action to take for traffic that matches the criteria, so this
     * type of rule group doesn't have a separate action setting.
     * </p>
     * 
     * @return Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     *         Suricata is an open-source network IPS that includes a standard rule-based language for network traffic
     *         inspection.</p>
     *         <p>
     *         These rules contain the inspection criteria and the action to take for traffic that matches the criteria,
     *         so this type of rule group doesn't have a separate action setting.
     */

    public String getRulesString() {
        return this.rulesString;
    }

    /**
     * <p>
     * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules. Suricata
     * is an open-source network IPS that includes a standard rule-based language for network traffic inspection.
     * </p>
     * <p>
     * These rules contain the inspection criteria and the action to take for traffic that matches the criteria, so this
     * type of rule group doesn't have a separate action setting.
     * </p>
     * 
     * @param rulesString
     *        Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     *        Suricata is an open-source network IPS that includes a standard rule-based language for network traffic
     *        inspection.</p>
     *        <p>
     *        These rules contain the inspection criteria and the action to take for traffic that matches the criteria,
     *        so this type of rule group doesn't have a separate action setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesSource withRulesString(String rulesString) {
        setRulesString(rulesString);
        return this;
    }

    /**
     * <p>
     * Stateful inspection criteria for a domain list rule group.
     * </p>
     * 
     * @param rulesSourceList
     *        Stateful inspection criteria for a domain list rule group.
     */

    public void setRulesSourceList(RulesSourceList rulesSourceList) {
        this.rulesSourceList = rulesSourceList;
    }

    /**
     * <p>
     * Stateful inspection criteria for a domain list rule group.
     * </p>
     * 
     * @return Stateful inspection criteria for a domain list rule group.
     */

    public RulesSourceList getRulesSourceList() {
        return this.rulesSourceList;
    }

    /**
     * <p>
     * Stateful inspection criteria for a domain list rule group.
     * </p>
     * 
     * @param rulesSourceList
     *        Stateful inspection criteria for a domain list rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesSource withRulesSourceList(RulesSourceList rulesSourceList) {
        setRulesSourceList(rulesSourceList);
        return this;
    }

    /**
     * <p>
     * The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to be used
     * together in a stateful rule group.
     * </p>
     * 
     * @return The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to
     *         be used together in a stateful rule group.
     */

    public java.util.List<StatefulRule> getStatefulRules() {
        return statefulRules;
    }

    /**
     * <p>
     * The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to be used
     * together in a stateful rule group.
     * </p>
     * 
     * @param statefulRules
     *        The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to
     *        be used together in a stateful rule group.
     */

    public void setStatefulRules(java.util.Collection<StatefulRule> statefulRules) {
        if (statefulRules == null) {
            this.statefulRules = null;
            return;
        }

        this.statefulRules = new java.util.ArrayList<StatefulRule>(statefulRules);
    }

    /**
     * <p>
     * The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to be used
     * together in a stateful rule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatefulRules(java.util.Collection)} or {@link #withStatefulRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statefulRules
     *        The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to
     *        be used together in a stateful rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesSource withStatefulRules(StatefulRule... statefulRules) {
        if (this.statefulRules == null) {
            setStatefulRules(new java.util.ArrayList<StatefulRule>(statefulRules.length));
        }
        for (StatefulRule ele : statefulRules) {
            this.statefulRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to be used
     * together in a stateful rule group.
     * </p>
     * 
     * @param statefulRules
     *        The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to
     *        be used together in a stateful rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesSource withStatefulRules(java.util.Collection<StatefulRule> statefulRules) {
        setStatefulRules(statefulRules);
        return this;
    }

    /**
     * <p>
     * Stateless inspection criteria to be used in a stateless rule group.
     * </p>
     * 
     * @param statelessRulesAndCustomActions
     *        Stateless inspection criteria to be used in a stateless rule group.
     */

    public void setStatelessRulesAndCustomActions(StatelessRulesAndCustomActions statelessRulesAndCustomActions) {
        this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
    }

    /**
     * <p>
     * Stateless inspection criteria to be used in a stateless rule group.
     * </p>
     * 
     * @return Stateless inspection criteria to be used in a stateless rule group.
     */

    public StatelessRulesAndCustomActions getStatelessRulesAndCustomActions() {
        return this.statelessRulesAndCustomActions;
    }

    /**
     * <p>
     * Stateless inspection criteria to be used in a stateless rule group.
     * </p>
     * 
     * @param statelessRulesAndCustomActions
     *        Stateless inspection criteria to be used in a stateless rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesSource withStatelessRulesAndCustomActions(StatelessRulesAndCustomActions statelessRulesAndCustomActions) {
        setStatelessRulesAndCustomActions(statelessRulesAndCustomActions);
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
        if (getRulesString() != null)
            sb.append("RulesString: ").append(getRulesString()).append(",");
        if (getRulesSourceList() != null)
            sb.append("RulesSourceList: ").append(getRulesSourceList()).append(",");
        if (getStatefulRules() != null)
            sb.append("StatefulRules: ").append(getStatefulRules()).append(",");
        if (getStatelessRulesAndCustomActions() != null)
            sb.append("StatelessRulesAndCustomActions: ").append(getStatelessRulesAndCustomActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RulesSource == false)
            return false;
        RulesSource other = (RulesSource) obj;
        if (other.getRulesString() == null ^ this.getRulesString() == null)
            return false;
        if (other.getRulesString() != null && other.getRulesString().equals(this.getRulesString()) == false)
            return false;
        if (other.getRulesSourceList() == null ^ this.getRulesSourceList() == null)
            return false;
        if (other.getRulesSourceList() != null && other.getRulesSourceList().equals(this.getRulesSourceList()) == false)
            return false;
        if (other.getStatefulRules() == null ^ this.getStatefulRules() == null)
            return false;
        if (other.getStatefulRules() != null && other.getStatefulRules().equals(this.getStatefulRules()) == false)
            return false;
        if (other.getStatelessRulesAndCustomActions() == null ^ this.getStatelessRulesAndCustomActions() == null)
            return false;
        if (other.getStatelessRulesAndCustomActions() != null
                && other.getStatelessRulesAndCustomActions().equals(this.getStatelessRulesAndCustomActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRulesString() == null) ? 0 : getRulesString().hashCode());
        hashCode = prime * hashCode + ((getRulesSourceList() == null) ? 0 : getRulesSourceList().hashCode());
        hashCode = prime * hashCode + ((getStatefulRules() == null) ? 0 : getStatefulRules().hashCode());
        hashCode = prime * hashCode + ((getStatelessRulesAndCustomActions() == null) ? 0 : getStatelessRulesAndCustomActions().hashCode());
        return hashCode;
    }

    @Override
    public RulesSource clone() {
        try {
            return (RulesSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.RulesSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
