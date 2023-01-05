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
 * The rules and actions for the rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Stateful inspection criteria for a domain list rule group. A domain list rule group determines access by specific
     * protocols to specific domains.
     * </p>
     */
    private RuleGroupSourceListDetails rulesSourceList;
    /**
     * <p>
     * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     * </p>
     */
    private String rulesString;
    /**
     * <p>
     * Suricata rule specifications.
     * </p>
     */
    private java.util.List<RuleGroupSourceStatefulRulesDetails> statefulRules;
    /**
     * <p>
     * The stateless rules and custom actions used by a stateless rule group.
     * </p>
     */
    private RuleGroupSourceStatelessRulesAndCustomActionsDetails statelessRulesAndCustomActions;

    /**
     * <p>
     * Stateful inspection criteria for a domain list rule group. A domain list rule group determines access by specific
     * protocols to specific domains.
     * </p>
     * 
     * @param rulesSourceList
     *        Stateful inspection criteria for a domain list rule group. A domain list rule group determines access by
     *        specific protocols to specific domains.
     */

    public void setRulesSourceList(RuleGroupSourceListDetails rulesSourceList) {
        this.rulesSourceList = rulesSourceList;
    }

    /**
     * <p>
     * Stateful inspection criteria for a domain list rule group. A domain list rule group determines access by specific
     * protocols to specific domains.
     * </p>
     * 
     * @return Stateful inspection criteria for a domain list rule group. A domain list rule group determines access by
     *         specific protocols to specific domains.
     */

    public RuleGroupSourceListDetails getRulesSourceList() {
        return this.rulesSourceList;
    }

    /**
     * <p>
     * Stateful inspection criteria for a domain list rule group. A domain list rule group determines access by specific
     * protocols to specific domains.
     * </p>
     * 
     * @param rulesSourceList
     *        Stateful inspection criteria for a domain list rule group. A domain list rule group determines access by
     *        specific protocols to specific domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSource withRulesSourceList(RuleGroupSourceListDetails rulesSourceList) {
        setRulesSourceList(rulesSourceList);
        return this;
    }

    /**
     * <p>
     * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     * </p>
     * 
     * @param rulesString
     *        Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     */

    public void setRulesString(String rulesString) {
        this.rulesString = rulesString;
    }

    /**
     * <p>
     * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     * </p>
     * 
     * @return Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     */

    public String getRulesString() {
        return this.rulesString;
    }

    /**
     * <p>
     * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     * </p>
     * 
     * @param rulesString
     *        Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSource withRulesString(String rulesString) {
        setRulesString(rulesString);
        return this;
    }

    /**
     * <p>
     * Suricata rule specifications.
     * </p>
     * 
     * @return Suricata rule specifications.
     */

    public java.util.List<RuleGroupSourceStatefulRulesDetails> getStatefulRules() {
        return statefulRules;
    }

    /**
     * <p>
     * Suricata rule specifications.
     * </p>
     * 
     * @param statefulRules
     *        Suricata rule specifications.
     */

    public void setStatefulRules(java.util.Collection<RuleGroupSourceStatefulRulesDetails> statefulRules) {
        if (statefulRules == null) {
            this.statefulRules = null;
            return;
        }

        this.statefulRules = new java.util.ArrayList<RuleGroupSourceStatefulRulesDetails>(statefulRules);
    }

    /**
     * <p>
     * Suricata rule specifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatefulRules(java.util.Collection)} or {@link #withStatefulRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statefulRules
     *        Suricata rule specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSource withStatefulRules(RuleGroupSourceStatefulRulesDetails... statefulRules) {
        if (this.statefulRules == null) {
            setStatefulRules(new java.util.ArrayList<RuleGroupSourceStatefulRulesDetails>(statefulRules.length));
        }
        for (RuleGroupSourceStatefulRulesDetails ele : statefulRules) {
            this.statefulRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Suricata rule specifications.
     * </p>
     * 
     * @param statefulRules
     *        Suricata rule specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSource withStatefulRules(java.util.Collection<RuleGroupSourceStatefulRulesDetails> statefulRules) {
        setStatefulRules(statefulRules);
        return this;
    }

    /**
     * <p>
     * The stateless rules and custom actions used by a stateless rule group.
     * </p>
     * 
     * @param statelessRulesAndCustomActions
     *        The stateless rules and custom actions used by a stateless rule group.
     */

    public void setStatelessRulesAndCustomActions(RuleGroupSourceStatelessRulesAndCustomActionsDetails statelessRulesAndCustomActions) {
        this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
    }

    /**
     * <p>
     * The stateless rules and custom actions used by a stateless rule group.
     * </p>
     * 
     * @return The stateless rules and custom actions used by a stateless rule group.
     */

    public RuleGroupSourceStatelessRulesAndCustomActionsDetails getStatelessRulesAndCustomActions() {
        return this.statelessRulesAndCustomActions;
    }

    /**
     * <p>
     * The stateless rules and custom actions used by a stateless rule group.
     * </p>
     * 
     * @param statelessRulesAndCustomActions
     *        The stateless rules and custom actions used by a stateless rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSource withStatelessRulesAndCustomActions(RuleGroupSourceStatelessRulesAndCustomActionsDetails statelessRulesAndCustomActions) {
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
        if (getRulesSourceList() != null)
            sb.append("RulesSourceList: ").append(getRulesSourceList()).append(",");
        if (getRulesString() != null)
            sb.append("RulesString: ").append(getRulesString()).append(",");
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

        if (obj instanceof RuleGroupSource == false)
            return false;
        RuleGroupSource other = (RuleGroupSource) obj;
        if (other.getRulesSourceList() == null ^ this.getRulesSourceList() == null)
            return false;
        if (other.getRulesSourceList() != null && other.getRulesSourceList().equals(this.getRulesSourceList()) == false)
            return false;
        if (other.getRulesString() == null ^ this.getRulesString() == null)
            return false;
        if (other.getRulesString() != null && other.getRulesString().equals(this.getRulesString()) == false)
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

        hashCode = prime * hashCode + ((getRulesSourceList() == null) ? 0 : getRulesSourceList().hashCode());
        hashCode = prime * hashCode + ((getRulesString() == null) ? 0 : getRulesString().hashCode());
        hashCode = prime * hashCode + ((getStatefulRules() == null) ? 0 : getStatefulRules().hashCode());
        hashCode = prime * hashCode + ((getStatelessRulesAndCustomActions() == null) ? 0 : getStatelessRulesAndCustomActions().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSource clone() {
        try {
            return (RuleGroupSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
