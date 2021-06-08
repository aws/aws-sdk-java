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
 * Stateless inspection criteria. Each stateless rule group uses exactly one of these data types to define its stateless
 * rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/StatelessRulesAndCustomActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatelessRulesAndCustomActions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the set of stateless rules for use in a stateless rule group.
     * </p>
     */
    private java.util.List<StatelessRule> statelessRules;
    /**
     * <p>
     * Defines an array of individual custom action definitions that are available for use by the stateless rules in
     * this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that you define, and
     * then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a> <code>Actions</code>
     * specification.
     * </p>
     */
    private java.util.List<CustomAction> customActions;

    /**
     * <p>
     * Defines the set of stateless rules for use in a stateless rule group.
     * </p>
     * 
     * @return Defines the set of stateless rules for use in a stateless rule group.
     */

    public java.util.List<StatelessRule> getStatelessRules() {
        return statelessRules;
    }

    /**
     * <p>
     * Defines the set of stateless rules for use in a stateless rule group.
     * </p>
     * 
     * @param statelessRules
     *        Defines the set of stateless rules for use in a stateless rule group.
     */

    public void setStatelessRules(java.util.Collection<StatelessRule> statelessRules) {
        if (statelessRules == null) {
            this.statelessRules = null;
            return;
        }

        this.statelessRules = new java.util.ArrayList<StatelessRule>(statelessRules);
    }

    /**
     * <p>
     * Defines the set of stateless rules for use in a stateless rule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessRules(java.util.Collection)} or {@link #withStatelessRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statelessRules
     *        Defines the set of stateless rules for use in a stateless rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRulesAndCustomActions withStatelessRules(StatelessRule... statelessRules) {
        if (this.statelessRules == null) {
            setStatelessRules(new java.util.ArrayList<StatelessRule>(statelessRules.length));
        }
        for (StatelessRule ele : statelessRules) {
            this.statelessRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the set of stateless rules for use in a stateless rule group.
     * </p>
     * 
     * @param statelessRules
     *        Defines the set of stateless rules for use in a stateless rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRulesAndCustomActions withStatelessRules(java.util.Collection<StatelessRule> statelessRules) {
        setStatelessRules(statelessRules);
        return this;
    }

    /**
     * <p>
     * Defines an array of individual custom action definitions that are available for use by the stateless rules in
     * this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that you define, and
     * then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a> <code>Actions</code>
     * specification.
     * </p>
     * 
     * @return Defines an array of individual custom action definitions that are available for use by the stateless
     *         rules in this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that
     *         you define, and then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a>
     *         <code>Actions</code> specification.
     */

    public java.util.List<CustomAction> getCustomActions() {
        return customActions;
    }

    /**
     * <p>
     * Defines an array of individual custom action definitions that are available for use by the stateless rules in
     * this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that you define, and
     * then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a> <code>Actions</code>
     * specification.
     * </p>
     * 
     * @param customActions
     *        Defines an array of individual custom action definitions that are available for use by the stateless rules
     *        in this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that you
     *        define, and then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a>
     *        <code>Actions</code> specification.
     */

    public void setCustomActions(java.util.Collection<CustomAction> customActions) {
        if (customActions == null) {
            this.customActions = null;
            return;
        }

        this.customActions = new java.util.ArrayList<CustomAction>(customActions);
    }

    /**
     * <p>
     * Defines an array of individual custom action definitions that are available for use by the stateless rules in
     * this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that you define, and
     * then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a> <code>Actions</code>
     * specification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomActions(java.util.Collection)} or {@link #withCustomActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customActions
     *        Defines an array of individual custom action definitions that are available for use by the stateless rules
     *        in this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that you
     *        define, and then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a>
     *        <code>Actions</code> specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRulesAndCustomActions withCustomActions(CustomAction... customActions) {
        if (this.customActions == null) {
            setCustomActions(new java.util.ArrayList<CustomAction>(customActions.length));
        }
        for (CustomAction ele : customActions) {
            this.customActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines an array of individual custom action definitions that are available for use by the stateless rules in
     * this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that you define, and
     * then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a> <code>Actions</code>
     * specification.
     * </p>
     * 
     * @param customActions
     *        Defines an array of individual custom action definitions that are available for use by the stateless rules
     *        in this <code>StatelessRulesAndCustomActions</code> specification. You name each custom action that you
     *        define, and then you can use it by name in your <a>StatelessRule</a> <a>RuleDefinition</a>
     *        <code>Actions</code> specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRulesAndCustomActions withCustomActions(java.util.Collection<CustomAction> customActions) {
        setCustomActions(customActions);
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
        if (getStatelessRules() != null)
            sb.append("StatelessRules: ").append(getStatelessRules()).append(",");
        if (getCustomActions() != null)
            sb.append("CustomActions: ").append(getCustomActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatelessRulesAndCustomActions == false)
            return false;
        StatelessRulesAndCustomActions other = (StatelessRulesAndCustomActions) obj;
        if (other.getStatelessRules() == null ^ this.getStatelessRules() == null)
            return false;
        if (other.getStatelessRules() != null && other.getStatelessRules().equals(this.getStatelessRules()) == false)
            return false;
        if (other.getCustomActions() == null ^ this.getCustomActions() == null)
            return false;
        if (other.getCustomActions() != null && other.getCustomActions().equals(this.getCustomActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatelessRules() == null) ? 0 : getStatelessRules().hashCode());
        hashCode = prime * hashCode + ((getCustomActions() == null) ? 0 : getCustomActions().hashCode());
        return hashCode;
    }

    @Override
    public StatelessRulesAndCustomActions clone() {
        try {
            return (StatelessRulesAndCustomActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.StatelessRulesAndCustomActionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
