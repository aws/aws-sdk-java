/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the type of a stateful rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RuleGroupTypePair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupTypePair implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the rule group.
     * </p>
     */
    private String ruleGroupArn;
    /**
     * <p>
     * The rule group type. The possible values are <code>Domain List</code> and <code>Suricata</code>.
     * </p>
     */
    private String ruleGroupType;

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

    public RuleGroupTypePair withRuleGroupArn(String ruleGroupArn) {
        setRuleGroupArn(ruleGroupArn);
        return this;
    }

    /**
     * <p>
     * The rule group type. The possible values are <code>Domain List</code> and <code>Suricata</code>.
     * </p>
     * 
     * @param ruleGroupType
     *        The rule group type. The possible values are <code>Domain List</code> and <code>Suricata</code>.
     */

    public void setRuleGroupType(String ruleGroupType) {
        this.ruleGroupType = ruleGroupType;
    }

    /**
     * <p>
     * The rule group type. The possible values are <code>Domain List</code> and <code>Suricata</code>.
     * </p>
     * 
     * @return The rule group type. The possible values are <code>Domain List</code> and <code>Suricata</code>.
     */

    public String getRuleGroupType() {
        return this.ruleGroupType;
    }

    /**
     * <p>
     * The rule group type. The possible values are <code>Domain List</code> and <code>Suricata</code>.
     * </p>
     * 
     * @param ruleGroupType
     *        The rule group type. The possible values are <code>Domain List</code> and <code>Suricata</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupTypePair withRuleGroupType(String ruleGroupType) {
        setRuleGroupType(ruleGroupType);
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
        if (getRuleGroupType() != null)
            sb.append("RuleGroupType: ").append(getRuleGroupType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupTypePair == false)
            return false;
        RuleGroupTypePair other = (RuleGroupTypePair) obj;
        if (other.getRuleGroupArn() == null ^ this.getRuleGroupArn() == null)
            return false;
        if (other.getRuleGroupArn() != null && other.getRuleGroupArn().equals(this.getRuleGroupArn()) == false)
            return false;
        if (other.getRuleGroupType() == null ^ this.getRuleGroupType() == null)
            return false;
        if (other.getRuleGroupType() != null && other.getRuleGroupType().equals(this.getRuleGroupType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupArn() == null) ? 0 : getRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupType() == null) ? 0 : getRuleGroupType().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupTypePair clone() {
        try {
            return (RuleGroupTypePair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
