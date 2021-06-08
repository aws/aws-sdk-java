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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The override action to apply to the rules in a rule group. Used only for rule statements that reference a rule group,
 * like <code>RuleGroupReferenceStatement</code> and <code>ManagedRuleGroupStatement</code>.
 * </p>
 * <p>
 * Set the override action to none to leave the rule actions in effect. Set it to count to only count matches,
 * regardless of the rule action settings.
 * </p>
 * <p>
 * In a <a>Rule</a>, you must specify either this <code>OverrideAction</code> setting or the rule <code>Action</code>
 * setting, but not both:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the rule statement references a rule group, use this override action setting and not the action setting.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the rule statement does not reference a rule group, use the rule action setting and not this rule override action
 * setting.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/OverrideAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverrideAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Override the rule action setting to count.
     * </p>
     */
    private CountAction count;
    /**
     * <p>
     * Don't override the rule action setting.
     * </p>
     */
    private NoneAction none;

    /**
     * <p>
     * Override the rule action setting to count.
     * </p>
     * 
     * @param count
     *        Override the rule action setting to count.
     */

    public void setCount(CountAction count) {
        this.count = count;
    }

    /**
     * <p>
     * Override the rule action setting to count.
     * </p>
     * 
     * @return Override the rule action setting to count.
     */

    public CountAction getCount() {
        return this.count;
    }

    /**
     * <p>
     * Override the rule action setting to count.
     * </p>
     * 
     * @param count
     *        Override the rule action setting to count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideAction withCount(CountAction count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Don't override the rule action setting.
     * </p>
     * 
     * @param none
     *        Don't override the rule action setting.
     */

    public void setNone(NoneAction none) {
        this.none = none;
    }

    /**
     * <p>
     * Don't override the rule action setting.
     * </p>
     * 
     * @return Don't override the rule action setting.
     */

    public NoneAction getNone() {
        return this.none;
    }

    /**
     * <p>
     * Don't override the rule action setting.
     * </p>
     * 
     * @param none
     *        Don't override the rule action setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideAction withNone(NoneAction none) {
        setNone(none);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getNone() != null)
            sb.append("None: ").append(getNone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverrideAction == false)
            return false;
        OverrideAction other = (OverrideAction) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getNone() == null ^ this.getNone() == null)
            return false;
        if (other.getNone() != null && other.getNone().equals(this.getNone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getNone() == null) ? 0 : getNone().hashCode());
        return hashCode;
    }

    @Override
    public OverrideAction clone() {
        try {
            return (OverrideAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.OverrideActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
