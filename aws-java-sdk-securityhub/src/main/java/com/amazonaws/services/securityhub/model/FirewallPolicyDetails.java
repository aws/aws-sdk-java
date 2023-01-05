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
 * Defines the behavior of the firewall.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FirewallPolicyDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallPolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stateful rule groups that are used in the firewall policy.
     * </p>
     */
    private java.util.List<FirewallPolicyStatefulRuleGroupReferencesDetails> statefulRuleGroupReferences;
    /**
     * <p>
     * The custom action definitions that are available to use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting.
     * </p>
     */
    private java.util.List<FirewallPolicyStatelessCustomActionsDetails> statelessCustomActions;
    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     */
    private java.util.List<String> statelessDefaultActions;
    /**
     * <p>
     * The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     */
    private java.util.List<String> statelessFragmentDefaultActions;
    /**
     * <p>
     * The stateless rule groups that are used in the firewall policy.
     * </p>
     */
    private java.util.List<FirewallPolicyStatelessRuleGroupReferencesDetails> statelessRuleGroupReferences;

    /**
     * <p>
     * The stateful rule groups that are used in the firewall policy.
     * </p>
     * 
     * @return The stateful rule groups that are used in the firewall policy.
     */

    public java.util.List<FirewallPolicyStatefulRuleGroupReferencesDetails> getStatefulRuleGroupReferences() {
        return statefulRuleGroupReferences;
    }

    /**
     * <p>
     * The stateful rule groups that are used in the firewall policy.
     * </p>
     * 
     * @param statefulRuleGroupReferences
     *        The stateful rule groups that are used in the firewall policy.
     */

    public void setStatefulRuleGroupReferences(java.util.Collection<FirewallPolicyStatefulRuleGroupReferencesDetails> statefulRuleGroupReferences) {
        if (statefulRuleGroupReferences == null) {
            this.statefulRuleGroupReferences = null;
            return;
        }

        this.statefulRuleGroupReferences = new java.util.ArrayList<FirewallPolicyStatefulRuleGroupReferencesDetails>(statefulRuleGroupReferences);
    }

    /**
     * <p>
     * The stateful rule groups that are used in the firewall policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatefulRuleGroupReferences(java.util.Collection)} or
     * {@link #withStatefulRuleGroupReferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statefulRuleGroupReferences
     *        The stateful rule groups that are used in the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatefulRuleGroupReferences(FirewallPolicyStatefulRuleGroupReferencesDetails... statefulRuleGroupReferences) {
        if (this.statefulRuleGroupReferences == null) {
            setStatefulRuleGroupReferences(new java.util.ArrayList<FirewallPolicyStatefulRuleGroupReferencesDetails>(statefulRuleGroupReferences.length));
        }
        for (FirewallPolicyStatefulRuleGroupReferencesDetails ele : statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stateful rule groups that are used in the firewall policy.
     * </p>
     * 
     * @param statefulRuleGroupReferences
     *        The stateful rule groups that are used in the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatefulRuleGroupReferences(
            java.util.Collection<FirewallPolicyStatefulRuleGroupReferencesDetails> statefulRuleGroupReferences) {
        setStatefulRuleGroupReferences(statefulRuleGroupReferences);
        return this;
    }

    /**
     * <p>
     * The custom action definitions that are available to use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting.
     * </p>
     * 
     * @return The custom action definitions that are available to use in the firewall policy's
     *         <code>StatelessDefaultActions</code> setting.
     */

    public java.util.List<FirewallPolicyStatelessCustomActionsDetails> getStatelessCustomActions() {
        return statelessCustomActions;
    }

    /**
     * <p>
     * The custom action definitions that are available to use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting.
     * </p>
     * 
     * @param statelessCustomActions
     *        The custom action definitions that are available to use in the firewall policy's
     *        <code>StatelessDefaultActions</code> setting.
     */

    public void setStatelessCustomActions(java.util.Collection<FirewallPolicyStatelessCustomActionsDetails> statelessCustomActions) {
        if (statelessCustomActions == null) {
            this.statelessCustomActions = null;
            return;
        }

        this.statelessCustomActions = new java.util.ArrayList<FirewallPolicyStatelessCustomActionsDetails>(statelessCustomActions);
    }

    /**
     * <p>
     * The custom action definitions that are available to use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessCustomActions(java.util.Collection)} or
     * {@link #withStatelessCustomActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessCustomActions
     *        The custom action definitions that are available to use in the firewall policy's
     *        <code>StatelessDefaultActions</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatelessCustomActions(FirewallPolicyStatelessCustomActionsDetails... statelessCustomActions) {
        if (this.statelessCustomActions == null) {
            setStatelessCustomActions(new java.util.ArrayList<FirewallPolicyStatelessCustomActionsDetails>(statelessCustomActions.length));
        }
        for (FirewallPolicyStatelessCustomActionsDetails ele : statelessCustomActions) {
            this.statelessCustomActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom action definitions that are available to use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting.
     * </p>
     * 
     * @param statelessCustomActions
     *        The custom action definitions that are available to use in the firewall policy's
     *        <code>StatelessDefaultActions</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatelessCustomActions(java.util.Collection<FirewallPolicyStatelessCustomActionsDetails> statelessCustomActions) {
        setStatelessCustomActions(statelessCustomActions);
        return this;
    }

    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     * 
     * @return The actions to take on a packet if it doesn't match any of the stateless rules in the policy.</p>
     *         <p>
     *         You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>,
     *         <code>aws:forward_to_sfe</code>), and can optionally include a custom action from
     *         <code>StatelessCustomActions</code>.
     */

    public java.util.List<String> getStatelessDefaultActions() {
        return statelessDefaultActions;
    }

    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on a packet if it doesn't match any of the stateless rules in the policy.</p>
     *        <p>
     *        You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>,
     *        <code>aws:forward_to_sfe</code>), and can optionally include a custom action from
     *        <code>StatelessCustomActions</code>.
     */

    public void setStatelessDefaultActions(java.util.Collection<String> statelessDefaultActions) {
        if (statelessDefaultActions == null) {
            this.statelessDefaultActions = null;
            return;
        }

        this.statelessDefaultActions = new java.util.ArrayList<String>(statelessDefaultActions);
    }

    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessDefaultActions(java.util.Collection)} or
     * {@link #withStatelessDefaultActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on a packet if it doesn't match any of the stateless rules in the policy.</p>
     *        <p>
     *        You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>,
     *        <code>aws:forward_to_sfe</code>), and can optionally include a custom action from
     *        <code>StatelessCustomActions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatelessDefaultActions(String... statelessDefaultActions) {
        if (this.statelessDefaultActions == null) {
            setStatelessDefaultActions(new java.util.ArrayList<String>(statelessDefaultActions.length));
        }
        for (String ele : statelessDefaultActions) {
            this.statelessDefaultActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on a packet if it doesn't match any of the stateless rules in the policy.</p>
     *        <p>
     *        You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>,
     *        <code>aws:forward_to_sfe</code>), and can optionally include a custom action from
     *        <code>StatelessCustomActions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatelessDefaultActions(java.util.Collection<String> statelessDefaultActions) {
        setStatelessDefaultActions(statelessDefaultActions);
        return this;
    }

    /**
     * <p>
     * The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     * 
     * @return The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the
     *         policy.</p>
     *         <p>
     *         You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>,
     *         <code>aws:forward_to_sfe</code>), and can optionally include a custom action from
     *         <code>StatelessCustomActions</code>.
     */

    public java.util.List<String> getStatelessFragmentDefaultActions() {
        return statelessFragmentDefaultActions;
    }

    /**
     * <p>
     * The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the
     *        policy.</p>
     *        <p>
     *        You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>,
     *        <code>aws:forward_to_sfe</code>), and can optionally include a custom action from
     *        <code>StatelessCustomActions</code>.
     */

    public void setStatelessFragmentDefaultActions(java.util.Collection<String> statelessFragmentDefaultActions) {
        if (statelessFragmentDefaultActions == null) {
            this.statelessFragmentDefaultActions = null;
            return;
        }

        this.statelessFragmentDefaultActions = new java.util.ArrayList<String>(statelessFragmentDefaultActions);
    }

    /**
     * <p>
     * The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessFragmentDefaultActions(java.util.Collection)} or
     * {@link #withStatelessFragmentDefaultActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the
     *        policy.</p>
     *        <p>
     *        You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>,
     *        <code>aws:forward_to_sfe</code>), and can optionally include a custom action from
     *        <code>StatelessCustomActions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatelessFragmentDefaultActions(String... statelessFragmentDefaultActions) {
        if (this.statelessFragmentDefaultActions == null) {
            setStatelessFragmentDefaultActions(new java.util.ArrayList<String>(statelessFragmentDefaultActions.length));
        }
        for (String ele : statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the policy.
     * </p>
     * <p>
     * You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>, <code>aws:forward_to_sfe</code>
     * ), and can optionally include a custom action from <code>StatelessCustomActions</code>.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the
     *        policy.</p>
     *        <p>
     *        You must specify a standard action (<code>aws:pass</code>, <code>aws:drop</code>,
     *        <code>aws:forward_to_sfe</code>), and can optionally include a custom action from
     *        <code>StatelessCustomActions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatelessFragmentDefaultActions(java.util.Collection<String> statelessFragmentDefaultActions) {
        setStatelessFragmentDefaultActions(statelessFragmentDefaultActions);
        return this;
    }

    /**
     * <p>
     * The stateless rule groups that are used in the firewall policy.
     * </p>
     * 
     * @return The stateless rule groups that are used in the firewall policy.
     */

    public java.util.List<FirewallPolicyStatelessRuleGroupReferencesDetails> getStatelessRuleGroupReferences() {
        return statelessRuleGroupReferences;
    }

    /**
     * <p>
     * The stateless rule groups that are used in the firewall policy.
     * </p>
     * 
     * @param statelessRuleGroupReferences
     *        The stateless rule groups that are used in the firewall policy.
     */

    public void setStatelessRuleGroupReferences(java.util.Collection<FirewallPolicyStatelessRuleGroupReferencesDetails> statelessRuleGroupReferences) {
        if (statelessRuleGroupReferences == null) {
            this.statelessRuleGroupReferences = null;
            return;
        }

        this.statelessRuleGroupReferences = new java.util.ArrayList<FirewallPolicyStatelessRuleGroupReferencesDetails>(statelessRuleGroupReferences);
    }

    /**
     * <p>
     * The stateless rule groups that are used in the firewall policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessRuleGroupReferences(java.util.Collection)} or
     * {@link #withStatelessRuleGroupReferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessRuleGroupReferences
     *        The stateless rule groups that are used in the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatelessRuleGroupReferences(FirewallPolicyStatelessRuleGroupReferencesDetails... statelessRuleGroupReferences) {
        if (this.statelessRuleGroupReferences == null) {
            setStatelessRuleGroupReferences(new java.util.ArrayList<FirewallPolicyStatelessRuleGroupReferencesDetails>(statelessRuleGroupReferences.length));
        }
        for (FirewallPolicyStatelessRuleGroupReferencesDetails ele : statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stateless rule groups that are used in the firewall policy.
     * </p>
     * 
     * @param statelessRuleGroupReferences
     *        The stateless rule groups that are used in the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyDetails withStatelessRuleGroupReferences(
            java.util.Collection<FirewallPolicyStatelessRuleGroupReferencesDetails> statelessRuleGroupReferences) {
        setStatelessRuleGroupReferences(statelessRuleGroupReferences);
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
        if (getStatefulRuleGroupReferences() != null)
            sb.append("StatefulRuleGroupReferences: ").append(getStatefulRuleGroupReferences()).append(",");
        if (getStatelessCustomActions() != null)
            sb.append("StatelessCustomActions: ").append(getStatelessCustomActions()).append(",");
        if (getStatelessDefaultActions() != null)
            sb.append("StatelessDefaultActions: ").append(getStatelessDefaultActions()).append(",");
        if (getStatelessFragmentDefaultActions() != null)
            sb.append("StatelessFragmentDefaultActions: ").append(getStatelessFragmentDefaultActions()).append(",");
        if (getStatelessRuleGroupReferences() != null)
            sb.append("StatelessRuleGroupReferences: ").append(getStatelessRuleGroupReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallPolicyDetails == false)
            return false;
        FirewallPolicyDetails other = (FirewallPolicyDetails) obj;
        if (other.getStatefulRuleGroupReferences() == null ^ this.getStatefulRuleGroupReferences() == null)
            return false;
        if (other.getStatefulRuleGroupReferences() != null && other.getStatefulRuleGroupReferences().equals(this.getStatefulRuleGroupReferences()) == false)
            return false;
        if (other.getStatelessCustomActions() == null ^ this.getStatelessCustomActions() == null)
            return false;
        if (other.getStatelessCustomActions() != null && other.getStatelessCustomActions().equals(this.getStatelessCustomActions()) == false)
            return false;
        if (other.getStatelessDefaultActions() == null ^ this.getStatelessDefaultActions() == null)
            return false;
        if (other.getStatelessDefaultActions() != null && other.getStatelessDefaultActions().equals(this.getStatelessDefaultActions()) == false)
            return false;
        if (other.getStatelessFragmentDefaultActions() == null ^ this.getStatelessFragmentDefaultActions() == null)
            return false;
        if (other.getStatelessFragmentDefaultActions() != null
                && other.getStatelessFragmentDefaultActions().equals(this.getStatelessFragmentDefaultActions()) == false)
            return false;
        if (other.getStatelessRuleGroupReferences() == null ^ this.getStatelessRuleGroupReferences() == null)
            return false;
        if (other.getStatelessRuleGroupReferences() != null && other.getStatelessRuleGroupReferences().equals(this.getStatelessRuleGroupReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatefulRuleGroupReferences() == null) ? 0 : getStatefulRuleGroupReferences().hashCode());
        hashCode = prime * hashCode + ((getStatelessCustomActions() == null) ? 0 : getStatelessCustomActions().hashCode());
        hashCode = prime * hashCode + ((getStatelessDefaultActions() == null) ? 0 : getStatelessDefaultActions().hashCode());
        hashCode = prime * hashCode + ((getStatelessFragmentDefaultActions() == null) ? 0 : getStatelessFragmentDefaultActions().hashCode());
        hashCode = prime * hashCode + ((getStatelessRuleGroupReferences() == null) ? 0 : getStatelessRuleGroupReferences().hashCode());
        return hashCode;
    }

    @Override
    public FirewallPolicyDetails clone() {
        try {
            return (FirewallPolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FirewallPolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
