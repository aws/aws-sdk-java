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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition of the Network Firewall firewall policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkFirewallPolicyDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallPolicyDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stateless rule groups that are used in the Network Firewall firewall policy.
     * </p>
     */
    private java.util.List<StatelessRuleGroup> statelessRuleGroups;
    /**
     * <p>
     * The actions to take on packets that don't match any of the stateless rule groups.
     * </p>
     */
    private java.util.List<String> statelessDefaultActions;
    /**
     * <p>
     * The actions to take on packet fragments that don't match any of the stateless rule groups.
     * </p>
     */
    private java.util.List<String> statelessFragmentDefaultActions;
    /**
     * <p>
     * Names of custom actions that are available for use in the stateless default actions settings.
     * </p>
     */
    private java.util.List<String> statelessCustomActions;
    /**
     * <p>
     * The stateful rule groups that are used in the Network Firewall firewall policy.
     * </p>
     */
    private java.util.List<StatefulRuleGroup> statefulRuleGroups;

    /**
     * <p>
     * The stateless rule groups that are used in the Network Firewall firewall policy.
     * </p>
     * 
     * @return The stateless rule groups that are used in the Network Firewall firewall policy.
     */

    public java.util.List<StatelessRuleGroup> getStatelessRuleGroups() {
        return statelessRuleGroups;
    }

    /**
     * <p>
     * The stateless rule groups that are used in the Network Firewall firewall policy.
     * </p>
     * 
     * @param statelessRuleGroups
     *        The stateless rule groups that are used in the Network Firewall firewall policy.
     */

    public void setStatelessRuleGroups(java.util.Collection<StatelessRuleGroup> statelessRuleGroups) {
        if (statelessRuleGroups == null) {
            this.statelessRuleGroups = null;
            return;
        }

        this.statelessRuleGroups = new java.util.ArrayList<StatelessRuleGroup>(statelessRuleGroups);
    }

    /**
     * <p>
     * The stateless rule groups that are used in the Network Firewall firewall policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessRuleGroups(java.util.Collection)} or {@link #withStatelessRuleGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param statelessRuleGroups
     *        The stateless rule groups that are used in the Network Firewall firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatelessRuleGroups(StatelessRuleGroup... statelessRuleGroups) {
        if (this.statelessRuleGroups == null) {
            setStatelessRuleGroups(new java.util.ArrayList<StatelessRuleGroup>(statelessRuleGroups.length));
        }
        for (StatelessRuleGroup ele : statelessRuleGroups) {
            this.statelessRuleGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stateless rule groups that are used in the Network Firewall firewall policy.
     * </p>
     * 
     * @param statelessRuleGroups
     *        The stateless rule groups that are used in the Network Firewall firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatelessRuleGroups(java.util.Collection<StatelessRuleGroup> statelessRuleGroups) {
        setStatelessRuleGroups(statelessRuleGroups);
        return this;
    }

    /**
     * <p>
     * The actions to take on packets that don't match any of the stateless rule groups.
     * </p>
     * 
     * @return The actions to take on packets that don't match any of the stateless rule groups.
     */

    public java.util.List<String> getStatelessDefaultActions() {
        return statelessDefaultActions;
    }

    /**
     * <p>
     * The actions to take on packets that don't match any of the stateless rule groups.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on packets that don't match any of the stateless rule groups.
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
     * The actions to take on packets that don't match any of the stateless rule groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessDefaultActions(java.util.Collection)} or
     * {@link #withStatelessDefaultActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on packets that don't match any of the stateless rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatelessDefaultActions(String... statelessDefaultActions) {
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
     * The actions to take on packets that don't match any of the stateless rule groups.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on packets that don't match any of the stateless rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatelessDefaultActions(java.util.Collection<String> statelessDefaultActions) {
        setStatelessDefaultActions(statelessDefaultActions);
        return this;
    }

    /**
     * <p>
     * The actions to take on packet fragments that don't match any of the stateless rule groups.
     * </p>
     * 
     * @return The actions to take on packet fragments that don't match any of the stateless rule groups.
     */

    public java.util.List<String> getStatelessFragmentDefaultActions() {
        return statelessFragmentDefaultActions;
    }

    /**
     * <p>
     * The actions to take on packet fragments that don't match any of the stateless rule groups.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on packet fragments that don't match any of the stateless rule groups.
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
     * The actions to take on packet fragments that don't match any of the stateless rule groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessFragmentDefaultActions(java.util.Collection)} or
     * {@link #withStatelessFragmentDefaultActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on packet fragments that don't match any of the stateless rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatelessFragmentDefaultActions(String... statelessFragmentDefaultActions) {
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
     * The actions to take on packet fragments that don't match any of the stateless rule groups.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on packet fragments that don't match any of the stateless rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatelessFragmentDefaultActions(java.util.Collection<String> statelessFragmentDefaultActions) {
        setStatelessFragmentDefaultActions(statelessFragmentDefaultActions);
        return this;
    }

    /**
     * <p>
     * Names of custom actions that are available for use in the stateless default actions settings.
     * </p>
     * 
     * @return Names of custom actions that are available for use in the stateless default actions settings.
     */

    public java.util.List<String> getStatelessCustomActions() {
        return statelessCustomActions;
    }

    /**
     * <p>
     * Names of custom actions that are available for use in the stateless default actions settings.
     * </p>
     * 
     * @param statelessCustomActions
     *        Names of custom actions that are available for use in the stateless default actions settings.
     */

    public void setStatelessCustomActions(java.util.Collection<String> statelessCustomActions) {
        if (statelessCustomActions == null) {
            this.statelessCustomActions = null;
            return;
        }

        this.statelessCustomActions = new java.util.ArrayList<String>(statelessCustomActions);
    }

    /**
     * <p>
     * Names of custom actions that are available for use in the stateless default actions settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessCustomActions(java.util.Collection)} or
     * {@link #withStatelessCustomActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessCustomActions
     *        Names of custom actions that are available for use in the stateless default actions settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatelessCustomActions(String... statelessCustomActions) {
        if (this.statelessCustomActions == null) {
            setStatelessCustomActions(new java.util.ArrayList<String>(statelessCustomActions.length));
        }
        for (String ele : statelessCustomActions) {
            this.statelessCustomActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Names of custom actions that are available for use in the stateless default actions settings.
     * </p>
     * 
     * @param statelessCustomActions
     *        Names of custom actions that are available for use in the stateless default actions settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatelessCustomActions(java.util.Collection<String> statelessCustomActions) {
        setStatelessCustomActions(statelessCustomActions);
        return this;
    }

    /**
     * <p>
     * The stateful rule groups that are used in the Network Firewall firewall policy.
     * </p>
     * 
     * @return The stateful rule groups that are used in the Network Firewall firewall policy.
     */

    public java.util.List<StatefulRuleGroup> getStatefulRuleGroups() {
        return statefulRuleGroups;
    }

    /**
     * <p>
     * The stateful rule groups that are used in the Network Firewall firewall policy.
     * </p>
     * 
     * @param statefulRuleGroups
     *        The stateful rule groups that are used in the Network Firewall firewall policy.
     */

    public void setStatefulRuleGroups(java.util.Collection<StatefulRuleGroup> statefulRuleGroups) {
        if (statefulRuleGroups == null) {
            this.statefulRuleGroups = null;
            return;
        }

        this.statefulRuleGroups = new java.util.ArrayList<StatefulRuleGroup>(statefulRuleGroups);
    }

    /**
     * <p>
     * The stateful rule groups that are used in the Network Firewall firewall policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatefulRuleGroups(java.util.Collection)} or {@link #withStatefulRuleGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param statefulRuleGroups
     *        The stateful rule groups that are used in the Network Firewall firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatefulRuleGroups(StatefulRuleGroup... statefulRuleGroups) {
        if (this.statefulRuleGroups == null) {
            setStatefulRuleGroups(new java.util.ArrayList<StatefulRuleGroup>(statefulRuleGroups.length));
        }
        for (StatefulRuleGroup ele : statefulRuleGroups) {
            this.statefulRuleGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stateful rule groups that are used in the Network Firewall firewall policy.
     * </p>
     * 
     * @param statefulRuleGroups
     *        The stateful rule groups that are used in the Network Firewall firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFirewallPolicyDescription withStatefulRuleGroups(java.util.Collection<StatefulRuleGroup> statefulRuleGroups) {
        setStatefulRuleGroups(statefulRuleGroups);
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
        if (getStatelessRuleGroups() != null)
            sb.append("StatelessRuleGroups: ").append(getStatelessRuleGroups()).append(",");
        if (getStatelessDefaultActions() != null)
            sb.append("StatelessDefaultActions: ").append(getStatelessDefaultActions()).append(",");
        if (getStatelessFragmentDefaultActions() != null)
            sb.append("StatelessFragmentDefaultActions: ").append(getStatelessFragmentDefaultActions()).append(",");
        if (getStatelessCustomActions() != null)
            sb.append("StatelessCustomActions: ").append(getStatelessCustomActions()).append(",");
        if (getStatefulRuleGroups() != null)
            sb.append("StatefulRuleGroups: ").append(getStatefulRuleGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFirewallPolicyDescription == false)
            return false;
        NetworkFirewallPolicyDescription other = (NetworkFirewallPolicyDescription) obj;
        if (other.getStatelessRuleGroups() == null ^ this.getStatelessRuleGroups() == null)
            return false;
        if (other.getStatelessRuleGroups() != null && other.getStatelessRuleGroups().equals(this.getStatelessRuleGroups()) == false)
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
        if (other.getStatelessCustomActions() == null ^ this.getStatelessCustomActions() == null)
            return false;
        if (other.getStatelessCustomActions() != null && other.getStatelessCustomActions().equals(this.getStatelessCustomActions()) == false)
            return false;
        if (other.getStatefulRuleGroups() == null ^ this.getStatefulRuleGroups() == null)
            return false;
        if (other.getStatefulRuleGroups() != null && other.getStatefulRuleGroups().equals(this.getStatefulRuleGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatelessRuleGroups() == null) ? 0 : getStatelessRuleGroups().hashCode());
        hashCode = prime * hashCode + ((getStatelessDefaultActions() == null) ? 0 : getStatelessDefaultActions().hashCode());
        hashCode = prime * hashCode + ((getStatelessFragmentDefaultActions() == null) ? 0 : getStatelessFragmentDefaultActions().hashCode());
        hashCode = prime * hashCode + ((getStatelessCustomActions() == null) ? 0 : getStatelessCustomActions().hashCode());
        hashCode = prime * hashCode + ((getStatefulRuleGroups() == null) ? 0 : getStatefulRuleGroups().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFirewallPolicyDescription clone() {
        try {
            return (NetworkFirewallPolicyDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkFirewallPolicyDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
