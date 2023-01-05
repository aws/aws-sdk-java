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
 * Stateless rules and custom actions for a stateless rule group.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatelessRulesAndCustomActionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatelessRulesAndCustomActionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Custom actions for the rule group.
     * </p>
     */
    private java.util.List<RuleGroupSourceCustomActionsDetails> customActions;
    /**
     * <p>
     * Stateless rules for the rule group.
     * </p>
     */
    private java.util.List<RuleGroupSourceStatelessRulesDetails> statelessRules;

    /**
     * <p>
     * Custom actions for the rule group.
     * </p>
     * 
     * @return Custom actions for the rule group.
     */

    public java.util.List<RuleGroupSourceCustomActionsDetails> getCustomActions() {
        return customActions;
    }

    /**
     * <p>
     * Custom actions for the rule group.
     * </p>
     * 
     * @param customActions
     *        Custom actions for the rule group.
     */

    public void setCustomActions(java.util.Collection<RuleGroupSourceCustomActionsDetails> customActions) {
        if (customActions == null) {
            this.customActions = null;
            return;
        }

        this.customActions = new java.util.ArrayList<RuleGroupSourceCustomActionsDetails>(customActions);
    }

    /**
     * <p>
     * Custom actions for the rule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomActions(java.util.Collection)} or {@link #withCustomActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customActions
     *        Custom actions for the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRulesAndCustomActionsDetails withCustomActions(RuleGroupSourceCustomActionsDetails... customActions) {
        if (this.customActions == null) {
            setCustomActions(new java.util.ArrayList<RuleGroupSourceCustomActionsDetails>(customActions.length));
        }
        for (RuleGroupSourceCustomActionsDetails ele : customActions) {
            this.customActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom actions for the rule group.
     * </p>
     * 
     * @param customActions
     *        Custom actions for the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRulesAndCustomActionsDetails withCustomActions(java.util.Collection<RuleGroupSourceCustomActionsDetails> customActions) {
        setCustomActions(customActions);
        return this;
    }

    /**
     * <p>
     * Stateless rules for the rule group.
     * </p>
     * 
     * @return Stateless rules for the rule group.
     */

    public java.util.List<RuleGroupSourceStatelessRulesDetails> getStatelessRules() {
        return statelessRules;
    }

    /**
     * <p>
     * Stateless rules for the rule group.
     * </p>
     * 
     * @param statelessRules
     *        Stateless rules for the rule group.
     */

    public void setStatelessRules(java.util.Collection<RuleGroupSourceStatelessRulesDetails> statelessRules) {
        if (statelessRules == null) {
            this.statelessRules = null;
            return;
        }

        this.statelessRules = new java.util.ArrayList<RuleGroupSourceStatelessRulesDetails>(statelessRules);
    }

    /**
     * <p>
     * Stateless rules for the rule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessRules(java.util.Collection)} or {@link #withStatelessRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statelessRules
     *        Stateless rules for the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRulesAndCustomActionsDetails withStatelessRules(RuleGroupSourceStatelessRulesDetails... statelessRules) {
        if (this.statelessRules == null) {
            setStatelessRules(new java.util.ArrayList<RuleGroupSourceStatelessRulesDetails>(statelessRules.length));
        }
        for (RuleGroupSourceStatelessRulesDetails ele : statelessRules) {
            this.statelessRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Stateless rules for the rule group.
     * </p>
     * 
     * @param statelessRules
     *        Stateless rules for the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRulesAndCustomActionsDetails withStatelessRules(java.util.Collection<RuleGroupSourceStatelessRulesDetails> statelessRules) {
        setStatelessRules(statelessRules);
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
        if (getCustomActions() != null)
            sb.append("CustomActions: ").append(getCustomActions()).append(",");
        if (getStatelessRules() != null)
            sb.append("StatelessRules: ").append(getStatelessRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatelessRulesAndCustomActionsDetails == false)
            return false;
        RuleGroupSourceStatelessRulesAndCustomActionsDetails other = (RuleGroupSourceStatelessRulesAndCustomActionsDetails) obj;
        if (other.getCustomActions() == null ^ this.getCustomActions() == null)
            return false;
        if (other.getCustomActions() != null && other.getCustomActions().equals(this.getCustomActions()) == false)
            return false;
        if (other.getStatelessRules() == null ^ this.getStatelessRules() == null)
            return false;
        if (other.getStatelessRules() != null && other.getStatelessRules().equals(this.getStatelessRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomActions() == null) ? 0 : getCustomActions().hashCode());
        hashCode = prime * hashCode + ((getStatelessRules() == null) ? 0 : getStatelessRules().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatelessRulesAndCustomActionsDetails clone() {
        try {
            return (RuleGroupSourceStatelessRulesAndCustomActionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatelessRulesAndCustomActionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
