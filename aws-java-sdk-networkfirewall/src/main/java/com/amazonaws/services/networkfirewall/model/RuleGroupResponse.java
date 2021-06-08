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
 * The high-level properties of a rule group. This, along with the <a>RuleGroup</a>, define the rule group. You can
 * retrieve all objects for a rule group by calling <a>DescribeRuleGroup</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/RuleGroupResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <note>
     * <p>
     * If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this ARN is
     * a placeholder that isn't attached to a valid resource.
     * </p>
     * </note>
     */
    private String ruleGroupArn;
    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     */
    private String ruleGroupName;
    /**
     * <p>
     * The unique identifier for the rule group.
     * </p>
     */
    private String ruleGroupId;
    /**
     * <p>
     * A description of the rule group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy,
     * Network Firewall reserves this capacity for the rule group.
     * </p>
     * <p>
     * You can retrieve the capacity that would be required for a rule group before you create the rule group by calling
     * <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * </p>
     */
    private Integer capacity;
    /**
     * <p>
     * Detailed information about the current status of a rule group.
     * </p>
     */
    private String ruleGroupStatus;
    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <note>
     * <p>
     * If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this ARN is
     * a placeholder that isn't attached to a valid resource.
     * </p>
     * </note>
     * 
     * @param ruleGroupArn
     *        The Amazon Resource Name (ARN) of the rule group.</p> <note>
     *        <p>
     *        If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this
     *        ARN is a placeholder that isn't attached to a valid resource.
     *        </p>
     */

    public void setRuleGroupArn(String ruleGroupArn) {
        this.ruleGroupArn = ruleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <note>
     * <p>
     * If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this ARN is
     * a placeholder that isn't attached to a valid resource.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the rule group.</p> <note>
     *         <p>
     *         If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this
     *         ARN is a placeholder that isn't attached to a valid resource.
     *         </p>
     */

    public String getRuleGroupArn() {
        return this.ruleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <note>
     * <p>
     * If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this ARN is
     * a placeholder that isn't attached to a valid resource.
     * </p>
     * </note>
     * 
     * @param ruleGroupArn
     *        The Amazon Resource Name (ARN) of the rule group.</p> <note>
     *        <p>
     *        If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this
     *        ARN is a placeholder that isn't attached to a valid resource.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupResponse withRuleGroupArn(String ruleGroupArn) {
        setRuleGroupArn(ruleGroupArn);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     */

    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @return The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     */

    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupResponse withRuleGroupName(String ruleGroupName) {
        setRuleGroupName(ruleGroupName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the rule group.
     * </p>
     * 
     * @param ruleGroupId
     *        The unique identifier for the rule group.
     */

    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * The unique identifier for the rule group.
     * </p>
     * 
     * @return The unique identifier for the rule group.
     */

    public String getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * <p>
     * The unique identifier for the rule group.
     * </p>
     * 
     * @param ruleGroupId
     *        The unique identifier for the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupResponse withRuleGroupId(String ruleGroupId) {
        setRuleGroupId(ruleGroupId);
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

    public RuleGroupResponse withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @see RuleGroupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @return Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *         stateless rules. If it is stateful, it contains stateful rules.
     * @see RuleGroupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public RuleGroupResponse withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public RuleGroupResponse withType(RuleGroupType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy,
     * Network Firewall reserves this capacity for the rule group.
     * </p>
     * <p>
     * You can retrieve the capacity that would be required for a rule group before you create the rule group by calling
     * <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * </p>
     * 
     * @param capacity
     *        The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation.
     *        When you update a rule group, you are limited to this capacity. When you reference a rule group from a
     *        firewall policy, Network Firewall reserves this capacity for the rule group. </p>
     *        <p>
     *        You can retrieve the capacity that would be required for a rule group before you create the rule group by
     *        calling <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     */

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy,
     * Network Firewall reserves this capacity for the rule group.
     * </p>
     * <p>
     * You can retrieve the capacity that would be required for a rule group before you create the rule group by calling
     * <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * </p>
     * 
     * @return The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation.
     *         When you update a rule group, you are limited to this capacity. When you reference a rule group from a
     *         firewall policy, Network Firewall reserves this capacity for the rule group. </p>
     *         <p>
     *         You can retrieve the capacity that would be required for a rule group before you create the rule group by
     *         calling <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     */

    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy,
     * Network Firewall reserves this capacity for the rule group.
     * </p>
     * <p>
     * You can retrieve the capacity that would be required for a rule group before you create the rule group by calling
     * <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * </p>
     * 
     * @param capacity
     *        The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation.
     *        When you update a rule group, you are limited to this capacity. When you reference a rule group from a
     *        firewall policy, Network Firewall reserves this capacity for the rule group. </p>
     *        <p>
     *        You can retrieve the capacity that would be required for a rule group before you create the rule group by
     *        calling <a>CreateRuleGroup</a> with <code>DryRun</code> set to <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupResponse withCapacity(Integer capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * Detailed information about the current status of a rule group.
     * </p>
     * 
     * @param ruleGroupStatus
     *        Detailed information about the current status of a rule group.
     * @see ResourceStatus
     */

    public void setRuleGroupStatus(String ruleGroupStatus) {
        this.ruleGroupStatus = ruleGroupStatus;
    }

    /**
     * <p>
     * Detailed information about the current status of a rule group.
     * </p>
     * 
     * @return Detailed information about the current status of a rule group.
     * @see ResourceStatus
     */

    public String getRuleGroupStatus() {
        return this.ruleGroupStatus;
    }

    /**
     * <p>
     * Detailed information about the current status of a rule group.
     * </p>
     * 
     * @param ruleGroupStatus
     *        Detailed information about the current status of a rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public RuleGroupResponse withRuleGroupStatus(String ruleGroupStatus) {
        setRuleGroupStatus(ruleGroupStatus);
        return this;
    }

    /**
     * <p>
     * Detailed information about the current status of a rule group.
     * </p>
     * 
     * @param ruleGroupStatus
     *        Detailed information about the current status of a rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public RuleGroupResponse withRuleGroupStatus(ResourceStatus ruleGroupStatus) {
        this.ruleGroupStatus = ruleGroupStatus.toString();
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @return The key:value pairs to associate with the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupResponse withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupResponse withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRuleGroupArn() != null)
            sb.append("RuleGroupArn: ").append(getRuleGroupArn()).append(",");
        if (getRuleGroupName() != null)
            sb.append("RuleGroupName: ").append(getRuleGroupName()).append(",");
        if (getRuleGroupId() != null)
            sb.append("RuleGroupId: ").append(getRuleGroupId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getRuleGroupStatus() != null)
            sb.append("RuleGroupStatus: ").append(getRuleGroupStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupResponse == false)
            return false;
        RuleGroupResponse other = (RuleGroupResponse) obj;
        if (other.getRuleGroupArn() == null ^ this.getRuleGroupArn() == null)
            return false;
        if (other.getRuleGroupArn() != null && other.getRuleGroupArn().equals(this.getRuleGroupArn()) == false)
            return false;
        if (other.getRuleGroupName() == null ^ this.getRuleGroupName() == null)
            return false;
        if (other.getRuleGroupName() != null && other.getRuleGroupName().equals(this.getRuleGroupName()) == false)
            return false;
        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getRuleGroupStatus() == null ^ this.getRuleGroupStatus() == null)
            return false;
        if (other.getRuleGroupStatus() != null && other.getRuleGroupStatus().equals(this.getRuleGroupStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupArn() == null) ? 0 : getRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupName() == null) ? 0 : getRuleGroupName().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupId() == null) ? 0 : getRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupStatus() == null) ? 0 : getRuleGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupResponse clone() {
        try {
            return (RuleGroupResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.RuleGroupResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
