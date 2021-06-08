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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteRuleGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String ruleGroupArn;
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

    public DeleteRuleGroupRequest withRuleGroupName(String ruleGroupName) {
        setRuleGroupName(ruleGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupArn
     *        The Amazon Resource Name (ARN) of the rule group.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setRuleGroupArn(String ruleGroupArn) {
        this.ruleGroupArn = ruleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule group.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getRuleGroupArn() {
        return this.ruleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param ruleGroupArn
     *        The Amazon Resource Name (ARN) of the rule group.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleGroupRequest withRuleGroupArn(String ruleGroupArn) {
        setRuleGroupArn(ruleGroupArn);
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

    public DeleteRuleGroupRequest withType(String type) {
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

    public DeleteRuleGroupRequest withType(RuleGroupType type) {
        this.type = type.toString();
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
        if (getRuleGroupArn() != null)
            sb.append("RuleGroupArn: ").append(getRuleGroupArn()).append(",");
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

        if (obj instanceof DeleteRuleGroupRequest == false)
            return false;
        DeleteRuleGroupRequest other = (DeleteRuleGroupRequest) obj;
        if (other.getRuleGroupName() == null ^ this.getRuleGroupName() == null)
            return false;
        if (other.getRuleGroupName() != null && other.getRuleGroupName().equals(this.getRuleGroupName()) == false)
            return false;
        if (other.getRuleGroupArn() == null ^ this.getRuleGroupArn() == null)
            return false;
        if (other.getRuleGroupArn() != null && other.getRuleGroupArn().equals(this.getRuleGroupArn()) == false)
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

        hashCode = prime * hashCode + ((getRuleGroupName() == null) ? 0 : getRuleGroupName().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupArn() == null) ? 0 : getRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRuleGroupRequest clone() {
        return (DeleteRuleGroupRequest) super.clone();
    }

}
