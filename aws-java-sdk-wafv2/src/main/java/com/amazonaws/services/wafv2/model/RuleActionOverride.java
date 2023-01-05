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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Action setting to use in the place of a rule action that is configured inside the rule group. You specify one
 * override for each rule whose action you want to change.
 * </p>
 * <p>
 * You can use overrides for testing, for example you can override all of rule actions to <code>Count</code> and then
 * monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can also
 * permanently override some or all actions, to modify how the rule group manages your web traffic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RuleActionOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleActionOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule to override.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The override action to use, in place of the configured action of the rule in the rule group.
     * </p>
     */
    private RuleAction actionToUse;

    /**
     * <p>
     * The name of the rule to override.
     * </p>
     * 
     * @param name
     *        The name of the rule to override.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule to override.
     * </p>
     * 
     * @return The name of the rule to override.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule to override.
     * </p>
     * 
     * @param name
     *        The name of the rule to override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleActionOverride withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The override action to use, in place of the configured action of the rule in the rule group.
     * </p>
     * 
     * @param actionToUse
     *        The override action to use, in place of the configured action of the rule in the rule group.
     */

    public void setActionToUse(RuleAction actionToUse) {
        this.actionToUse = actionToUse;
    }

    /**
     * <p>
     * The override action to use, in place of the configured action of the rule in the rule group.
     * </p>
     * 
     * @return The override action to use, in place of the configured action of the rule in the rule group.
     */

    public RuleAction getActionToUse() {
        return this.actionToUse;
    }

    /**
     * <p>
     * The override action to use, in place of the configured action of the rule in the rule group.
     * </p>
     * 
     * @param actionToUse
     *        The override action to use, in place of the configured action of the rule in the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleActionOverride withActionToUse(RuleAction actionToUse) {
        setActionToUse(actionToUse);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getActionToUse() != null)
            sb.append("ActionToUse: ").append(getActionToUse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleActionOverride == false)
            return false;
        RuleActionOverride other = (RuleActionOverride) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getActionToUse() == null ^ this.getActionToUse() == null)
            return false;
        if (other.getActionToUse() != null && other.getActionToUse().equals(this.getActionToUse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getActionToUse() == null) ? 0 : getActionToUse().hashCode());
        return hashCode;
    }

    @Override
    public RuleActionOverride clone() {
        try {
            return (RuleActionOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RuleActionOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
