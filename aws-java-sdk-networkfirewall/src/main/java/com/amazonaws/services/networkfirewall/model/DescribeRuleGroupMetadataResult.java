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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeRuleGroupMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRuleGroupMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String ruleGroupArn;
    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String ruleGroupName;
    /**
     * <p>
     * Returns the metadata objects for the specified rule group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
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

    private StatefulRuleOptions statefulRuleOptions;
    /**
     * <p>
     * The last time that the rule group was changed.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupArn
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setRuleGroupArn(String ruleGroupArn) {
        this.ruleGroupArn = ruleGroupArn;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The descriptive name of the rule group. You can't change the name of a rule group after you create
     *         it.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getRuleGroupArn() {
        return this.ruleGroupArn;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupArn
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuleGroupMetadataResult withRuleGroupArn(String ruleGroupArn) {
        setRuleGroupArn(ruleGroupArn);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The descriptive name of the rule group. You can't change the name of a rule group after you create
     *         it.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupName
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuleGroupMetadataResult withRuleGroupName(String ruleGroupName) {
        setRuleGroupName(ruleGroupName);
        return this;
    }

    /**
     * <p>
     * Returns the metadata objects for the specified rule group.
     * </p>
     * 
     * @param description
     *        Returns the metadata objects for the specified rule group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Returns the metadata objects for the specified rule group.
     * </p>
     * 
     * @return Returns the metadata objects for the specified rule group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Returns the metadata objects for the specified rule group.
     * </p>
     * 
     * @param description
     *        Returns the metadata objects for the specified rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuleGroupMetadataResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules. </p> <note>
     *        <p>
     *        This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     *        </p>
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
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
     * 
     * @return Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *         stateless rules. If it is stateful, it contains stateful rules. </p> <note>
     *         <p>
     *         This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     *         </p>
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
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules. </p> <note>
     *        <p>
     *        This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public DescribeRuleGroupMetadataResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * <note>
     * <p>
     * This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     * </p>
     * </note>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules. </p> <note>
     *        <p>
     *        This setting is required for requests that do not include the <code>RuleGroupARN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public DescribeRuleGroupMetadataResult withType(RuleGroupType type) {
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

    public DescribeRuleGroupMetadataResult withCapacity(Integer capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * @param statefulRuleOptions
     */

    public void setStatefulRuleOptions(StatefulRuleOptions statefulRuleOptions) {
        this.statefulRuleOptions = statefulRuleOptions;
    }

    /**
     * @return
     */

    public StatefulRuleOptions getStatefulRuleOptions() {
        return this.statefulRuleOptions;
    }

    /**
     * @param statefulRuleOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuleGroupMetadataResult withStatefulRuleOptions(StatefulRuleOptions statefulRuleOptions) {
        setStatefulRuleOptions(statefulRuleOptions);
        return this;
    }

    /**
     * <p>
     * The last time that the rule group was changed.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the rule group was changed.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the rule group was changed.
     * </p>
     * 
     * @return The last time that the rule group was changed.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the rule group was changed.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the rule group was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuleGroupMetadataResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getStatefulRuleOptions() != null)
            sb.append("StatefulRuleOptions: ").append(getStatefulRuleOptions()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRuleGroupMetadataResult == false)
            return false;
        DescribeRuleGroupMetadataResult other = (DescribeRuleGroupMetadataResult) obj;
        if (other.getRuleGroupArn() == null ^ this.getRuleGroupArn() == null)
            return false;
        if (other.getRuleGroupArn() != null && other.getRuleGroupArn().equals(this.getRuleGroupArn()) == false)
            return false;
        if (other.getRuleGroupName() == null ^ this.getRuleGroupName() == null)
            return false;
        if (other.getRuleGroupName() != null && other.getRuleGroupName().equals(this.getRuleGroupName()) == false)
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
        if (other.getStatefulRuleOptions() == null ^ this.getStatefulRuleOptions() == null)
            return false;
        if (other.getStatefulRuleOptions() != null && other.getStatefulRuleOptions().equals(this.getStatefulRuleOptions()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupArn() == null) ? 0 : getRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupName() == null) ? 0 : getRuleGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getStatefulRuleOptions() == null) ? 0 : getStatefulRuleOptions().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRuleGroupMetadataResult clone() {
        try {
            return (DescribeRuleGroupMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
