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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifier for a single stateful rule group, used in a firewall policy to refer to a rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/StatefulRuleGroupReference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatefulRuleGroupReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stateful rule group.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * An integer setting that indicates the order in which to run the stateful rule groups in a single
     * <a>FirewallPolicy</a>. This setting only applies to firewall policies that specify the <code>STRICT_ORDER</code>
     * rule order in the stateful engine options settings.
     * </p>
     * <p>
     * Network Firewall evalutes each stateful rule group against a packet starting with the group that has the lowest
     * priority setting. You must ensure that the priority settings are unique within each policy.
     * </p>
     * <p>
     * You can change the priority settings of your rule groups at any time. To make it easier to insert rule groups
     * later, number them so there's a wide range in between, for example use 100, 200, and so on.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The action that allows the policy owner to override the behavior of the rule group within a policy.
     * </p>
     */
    private StatefulRuleGroupOverride override;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stateful rule group.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the stateful rule group.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stateful rule group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stateful rule group.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stateful rule group.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the stateful rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatefulRuleGroupReference withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * An integer setting that indicates the order in which to run the stateful rule groups in a single
     * <a>FirewallPolicy</a>. This setting only applies to firewall policies that specify the <code>STRICT_ORDER</code>
     * rule order in the stateful engine options settings.
     * </p>
     * <p>
     * Network Firewall evalutes each stateful rule group against a packet starting with the group that has the lowest
     * priority setting. You must ensure that the priority settings are unique within each policy.
     * </p>
     * <p>
     * You can change the priority settings of your rule groups at any time. To make it easier to insert rule groups
     * later, number them so there's a wide range in between, for example use 100, 200, and so on.
     * </p>
     * 
     * @param priority
     *        An integer setting that indicates the order in which to run the stateful rule groups in a single
     *        <a>FirewallPolicy</a>. This setting only applies to firewall policies that specify the
     *        <code>STRICT_ORDER</code> rule order in the stateful engine options settings.</p>
     *        <p>
     *        Network Firewall evalutes each stateful rule group against a packet starting with the group that has the
     *        lowest priority setting. You must ensure that the priority settings are unique within each policy.
     *        </p>
     *        <p>
     *        You can change the priority settings of your rule groups at any time. To make it easier to insert rule
     *        groups later, number them so there's a wide range in between, for example use 100, 200, and so on.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * An integer setting that indicates the order in which to run the stateful rule groups in a single
     * <a>FirewallPolicy</a>. This setting only applies to firewall policies that specify the <code>STRICT_ORDER</code>
     * rule order in the stateful engine options settings.
     * </p>
     * <p>
     * Network Firewall evalutes each stateful rule group against a packet starting with the group that has the lowest
     * priority setting. You must ensure that the priority settings are unique within each policy.
     * </p>
     * <p>
     * You can change the priority settings of your rule groups at any time. To make it easier to insert rule groups
     * later, number them so there's a wide range in between, for example use 100, 200, and so on.
     * </p>
     * 
     * @return An integer setting that indicates the order in which to run the stateful rule groups in a single
     *         <a>FirewallPolicy</a>. This setting only applies to firewall policies that specify the
     *         <code>STRICT_ORDER</code> rule order in the stateful engine options settings.</p>
     *         <p>
     *         Network Firewall evalutes each stateful rule group against a packet starting with the group that has the
     *         lowest priority setting. You must ensure that the priority settings are unique within each policy.
     *         </p>
     *         <p>
     *         You can change the priority settings of your rule groups at any time. To make it easier to insert rule
     *         groups later, number them so there's a wide range in between, for example use 100, 200, and so on.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * An integer setting that indicates the order in which to run the stateful rule groups in a single
     * <a>FirewallPolicy</a>. This setting only applies to firewall policies that specify the <code>STRICT_ORDER</code>
     * rule order in the stateful engine options settings.
     * </p>
     * <p>
     * Network Firewall evalutes each stateful rule group against a packet starting with the group that has the lowest
     * priority setting. You must ensure that the priority settings are unique within each policy.
     * </p>
     * <p>
     * You can change the priority settings of your rule groups at any time. To make it easier to insert rule groups
     * later, number them so there's a wide range in between, for example use 100, 200, and so on.
     * </p>
     * 
     * @param priority
     *        An integer setting that indicates the order in which to run the stateful rule groups in a single
     *        <a>FirewallPolicy</a>. This setting only applies to firewall policies that specify the
     *        <code>STRICT_ORDER</code> rule order in the stateful engine options settings.</p>
     *        <p>
     *        Network Firewall evalutes each stateful rule group against a packet starting with the group that has the
     *        lowest priority setting. You must ensure that the priority settings are unique within each policy.
     *        </p>
     *        <p>
     *        You can change the priority settings of your rule groups at any time. To make it easier to insert rule
     *        groups later, number them so there's a wide range in between, for example use 100, 200, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatefulRuleGroupReference withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The action that allows the policy owner to override the behavior of the rule group within a policy.
     * </p>
     * 
     * @param override
     *        The action that allows the policy owner to override the behavior of the rule group within a policy.
     */

    public void setOverride(StatefulRuleGroupOverride override) {
        this.override = override;
    }

    /**
     * <p>
     * The action that allows the policy owner to override the behavior of the rule group within a policy.
     * </p>
     * 
     * @return The action that allows the policy owner to override the behavior of the rule group within a policy.
     */

    public StatefulRuleGroupOverride getOverride() {
        return this.override;
    }

    /**
     * <p>
     * The action that allows the policy owner to override the behavior of the rule group within a policy.
     * </p>
     * 
     * @param override
     *        The action that allows the policy owner to override the behavior of the rule group within a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatefulRuleGroupReference withOverride(StatefulRuleGroupOverride override) {
        setOverride(override);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getOverride() != null)
            sb.append("Override: ").append(getOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatefulRuleGroupReference == false)
            return false;
        StatefulRuleGroupReference other = (StatefulRuleGroupReference) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getOverride() == null ^ this.getOverride() == null)
            return false;
        if (other.getOverride() != null && other.getOverride().equals(this.getOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getOverride() == null) ? 0 : getOverride().hashCode());
        return hashCode;
    }

    @Override
    public StatefulRuleGroupReference clone() {
        try {
            return (StatefulRuleGroupReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.StatefulRuleGroupReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
