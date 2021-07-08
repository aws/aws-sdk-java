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
 * Network Firewall stateless rule group, used in a <a>NetworkFirewallPolicyDescription</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/StatelessRuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatelessRuleGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule group.
     * </p>
     */
    private String ruleGroupName;
    /**
     * <p>
     * The resource ID of the rule group.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The priority of the rule group. Network Firewall evaluates the stateless rule groups in a firewall policy
     * starting from the lowest priority setting.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @param ruleGroupName
     *        The name of the rule group.
     */

    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @return The name of the rule group.
     */

    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @param ruleGroupName
     *        The name of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRuleGroup withRuleGroupName(String ruleGroupName) {
        setRuleGroupName(ruleGroupName);
        return this;
    }

    /**
     * <p>
     * The resource ID of the rule group.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of the rule group.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID of the rule group.
     * </p>
     * 
     * @return The resource ID of the rule group.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID of the rule group.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRuleGroup withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The priority of the rule group. Network Firewall evaluates the stateless rule groups in a firewall policy
     * starting from the lowest priority setting.
     * </p>
     * 
     * @param priority
     *        The priority of the rule group. Network Firewall evaluates the stateless rule groups in a firewall policy
     *        starting from the lowest priority setting.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the rule group. Network Firewall evaluates the stateless rule groups in a firewall policy
     * starting from the lowest priority setting.
     * </p>
     * 
     * @return The priority of the rule group. Network Firewall evaluates the stateless rule groups in a firewall policy
     *         starting from the lowest priority setting.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the rule group. Network Firewall evaluates the stateless rule groups in a firewall policy
     * starting from the lowest priority setting.
     * </p>
     * 
     * @param priority
     *        The priority of the rule group. Network Firewall evaluates the stateless rule groups in a firewall policy
     *        starting from the lowest priority setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessRuleGroup withPriority(Integer priority) {
        setPriority(priority);
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
        if (getRuleGroupName() != null)
            sb.append("RuleGroupName: ").append(getRuleGroupName()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatelessRuleGroup == false)
            return false;
        StatelessRuleGroup other = (StatelessRuleGroup) obj;
        if (other.getRuleGroupName() == null ^ this.getRuleGroupName() == null)
            return false;
        if (other.getRuleGroupName() != null && other.getRuleGroupName().equals(this.getRuleGroupName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupName() == null) ? 0 : getRuleGroupName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public StatelessRuleGroup clone() {
        try {
            return (StatelessRuleGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.StatelessRuleGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
