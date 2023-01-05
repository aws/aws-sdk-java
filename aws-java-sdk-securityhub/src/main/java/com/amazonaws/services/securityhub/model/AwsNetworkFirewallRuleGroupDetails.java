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
 * Details about an Network Firewall rule group. Rule groups are used to inspect and control network traffic. Stateless
 * rule groups apply to individual packets. Stateful rule groups apply to packets in the context of their traffic flow.
 * </p>
 * <p>
 * Rule groups are referenced in firewall policies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsNetworkFirewallRuleGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsNetworkFirewallRuleGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of operating resources that this rule group can use.
     * </p>
     */
    private Integer capacity;
    /**
     * <p>
     * A description of the rule group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Details about the rule group.
     * </p>
     */
    private RuleGroupDetails ruleGroup;
    /**
     * <p>
     * The ARN of the rule group.
     * </p>
     */
    private String ruleGroupArn;
    /**
     * <p>
     * The identifier of the rule group.
     * </p>
     */
    private String ruleGroupId;
    /**
     * <p>
     * The descriptive name of the rule group.
     * </p>
     */
    private String ruleGroupName;
    /**
     * <p>
     * The type of rule group. A rule group can be stateful or stateless.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The maximum number of operating resources that this rule group can use.
     * </p>
     * 
     * @param capacity
     *        The maximum number of operating resources that this rule group can use.
     */

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The maximum number of operating resources that this rule group can use.
     * </p>
     * 
     * @return The maximum number of operating resources that this rule group can use.
     */

    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The maximum number of operating resources that this rule group can use.
     * </p>
     * 
     * @param capacity
     *        The maximum number of operating resources that this rule group can use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallRuleGroupDetails withCapacity(Integer capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * A description of the rule group.
     * </p>
     * 
     * @param description
     *        A description of the rule group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the rule group.
     * </p>
     * 
     * @return A description of the rule group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the rule group.
     * </p>
     * 
     * @param description
     *        A description of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallRuleGroupDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Details about the rule group.
     * </p>
     * 
     * @param ruleGroup
     *        Details about the rule group.
     */

    public void setRuleGroup(RuleGroupDetails ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    /**
     * <p>
     * Details about the rule group.
     * </p>
     * 
     * @return Details about the rule group.
     */

    public RuleGroupDetails getRuleGroup() {
        return this.ruleGroup;
    }

    /**
     * <p>
     * Details about the rule group.
     * </p>
     * 
     * @param ruleGroup
     *        Details about the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallRuleGroupDetails withRuleGroup(RuleGroupDetails ruleGroup) {
        setRuleGroup(ruleGroup);
        return this;
    }

    /**
     * <p>
     * The ARN of the rule group.
     * </p>
     * 
     * @param ruleGroupArn
     *        The ARN of the rule group.
     */

    public void setRuleGroupArn(String ruleGroupArn) {
        this.ruleGroupArn = ruleGroupArn;
    }

    /**
     * <p>
     * The ARN of the rule group.
     * </p>
     * 
     * @return The ARN of the rule group.
     */

    public String getRuleGroupArn() {
        return this.ruleGroupArn;
    }

    /**
     * <p>
     * The ARN of the rule group.
     * </p>
     * 
     * @param ruleGroupArn
     *        The ARN of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallRuleGroupDetails withRuleGroupArn(String ruleGroupArn) {
        setRuleGroupArn(ruleGroupArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the rule group.
     * </p>
     * 
     * @param ruleGroupId
     *        The identifier of the rule group.
     */

    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * The identifier of the rule group.
     * </p>
     * 
     * @return The identifier of the rule group.
     */

    public String getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * <p>
     * The identifier of the rule group.
     * </p>
     * 
     * @param ruleGroupId
     *        The identifier of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallRuleGroupDetails withRuleGroupId(String ruleGroupId) {
        setRuleGroupId(ruleGroupId);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the rule group.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group.
     */

    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group.
     * </p>
     * 
     * @return The descriptive name of the rule group.
     */

    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallRuleGroupDetails withRuleGroupName(String ruleGroupName) {
        setRuleGroupName(ruleGroupName);
        return this;
    }

    /**
     * <p>
     * The type of rule group. A rule group can be stateful or stateless.
     * </p>
     * 
     * @param type
     *        The type of rule group. A rule group can be stateful or stateless.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of rule group. A rule group can be stateful or stateless.
     * </p>
     * 
     * @return The type of rule group. A rule group can be stateful or stateless.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of rule group. A rule group can be stateful or stateless.
     * </p>
     * 
     * @param type
     *        The type of rule group. A rule group can be stateful or stateless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallRuleGroupDetails withType(String type) {
        setType(type);
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
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRuleGroup() != null)
            sb.append("RuleGroup: ").append(getRuleGroup()).append(",");
        if (getRuleGroupArn() != null)
            sb.append("RuleGroupArn: ").append(getRuleGroupArn()).append(",");
        if (getRuleGroupId() != null)
            sb.append("RuleGroupId: ").append(getRuleGroupId()).append(",");
        if (getRuleGroupName() != null)
            sb.append("RuleGroupName: ").append(getRuleGroupName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsNetworkFirewallRuleGroupDetails == false)
            return false;
        AwsNetworkFirewallRuleGroupDetails other = (AwsNetworkFirewallRuleGroupDetails) obj;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRuleGroup() == null ^ this.getRuleGroup() == null)
            return false;
        if (other.getRuleGroup() != null && other.getRuleGroup().equals(this.getRuleGroup()) == false)
            return false;
        if (other.getRuleGroupArn() == null ^ this.getRuleGroupArn() == null)
            return false;
        if (other.getRuleGroupArn() != null && other.getRuleGroupArn().equals(this.getRuleGroupArn()) == false)
            return false;
        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
            return false;
        if (other.getRuleGroupName() == null ^ this.getRuleGroupName() == null)
            return false;
        if (other.getRuleGroupName() != null && other.getRuleGroupName().equals(this.getRuleGroupName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRuleGroup() == null) ? 0 : getRuleGroup().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupArn() == null) ? 0 : getRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupId() == null) ? 0 : getRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupName() == null) ? 0 : getRuleGroupName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsNetworkFirewallRuleGroupDetails clone() {
        try {
            return (AwsNetworkFirewallRuleGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsNetworkFirewallRuleGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
