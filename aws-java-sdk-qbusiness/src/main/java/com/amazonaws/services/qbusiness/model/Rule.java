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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Guardrail rules for an Amazon Q Business application. Amazon Q Business supports only one rule at a time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Rule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Users and groups to be included in a rule.
     * </p>
     */
    private UsersAndGroups includedUsersAndGroups;
    /**
     * <p>
     * Users and groups to be excluded from a rule.
     * </p>
     */
    private UsersAndGroups excludedUsersAndGroups;
    /**
     * <p>
     * The type of rule.
     * </p>
     */
    private String ruleType;
    /**
     * <p>
     * The configuration information for a rule.
     * </p>
     */
    private RuleConfiguration ruleConfiguration;

    /**
     * <p>
     * Users and groups to be included in a rule.
     * </p>
     * 
     * @param includedUsersAndGroups
     *        Users and groups to be included in a rule.
     */

    public void setIncludedUsersAndGroups(UsersAndGroups includedUsersAndGroups) {
        this.includedUsersAndGroups = includedUsersAndGroups;
    }

    /**
     * <p>
     * Users and groups to be included in a rule.
     * </p>
     * 
     * @return Users and groups to be included in a rule.
     */

    public UsersAndGroups getIncludedUsersAndGroups() {
        return this.includedUsersAndGroups;
    }

    /**
     * <p>
     * Users and groups to be included in a rule.
     * </p>
     * 
     * @param includedUsersAndGroups
     *        Users and groups to be included in a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withIncludedUsersAndGroups(UsersAndGroups includedUsersAndGroups) {
        setIncludedUsersAndGroups(includedUsersAndGroups);
        return this;
    }

    /**
     * <p>
     * Users and groups to be excluded from a rule.
     * </p>
     * 
     * @param excludedUsersAndGroups
     *        Users and groups to be excluded from a rule.
     */

    public void setExcludedUsersAndGroups(UsersAndGroups excludedUsersAndGroups) {
        this.excludedUsersAndGroups = excludedUsersAndGroups;
    }

    /**
     * <p>
     * Users and groups to be excluded from a rule.
     * </p>
     * 
     * @return Users and groups to be excluded from a rule.
     */

    public UsersAndGroups getExcludedUsersAndGroups() {
        return this.excludedUsersAndGroups;
    }

    /**
     * <p>
     * Users and groups to be excluded from a rule.
     * </p>
     * 
     * @param excludedUsersAndGroups
     *        Users and groups to be excluded from a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withExcludedUsersAndGroups(UsersAndGroups excludedUsersAndGroups) {
        setExcludedUsersAndGroups(excludedUsersAndGroups);
        return this;
    }

    /**
     * <p>
     * The type of rule.
     * </p>
     * 
     * @param ruleType
     *        The type of rule.
     * @see RuleType
     */

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * <p>
     * The type of rule.
     * </p>
     * 
     * @return The type of rule.
     * @see RuleType
     */

    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * <p>
     * The type of rule.
     * </p>
     * 
     * @param ruleType
     *        The type of rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleType
     */

    public Rule withRuleType(String ruleType) {
        setRuleType(ruleType);
        return this;
    }

    /**
     * <p>
     * The type of rule.
     * </p>
     * 
     * @param ruleType
     *        The type of rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleType
     */

    public Rule withRuleType(RuleType ruleType) {
        this.ruleType = ruleType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration information for a rule.
     * </p>
     * 
     * @param ruleConfiguration
     *        The configuration information for a rule.
     */

    public void setRuleConfiguration(RuleConfiguration ruleConfiguration) {
        this.ruleConfiguration = ruleConfiguration;
    }

    /**
     * <p>
     * The configuration information for a rule.
     * </p>
     * 
     * @return The configuration information for a rule.
     */

    public RuleConfiguration getRuleConfiguration() {
        return this.ruleConfiguration;
    }

    /**
     * <p>
     * The configuration information for a rule.
     * </p>
     * 
     * @param ruleConfiguration
     *        The configuration information for a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withRuleConfiguration(RuleConfiguration ruleConfiguration) {
        setRuleConfiguration(ruleConfiguration);
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
        if (getIncludedUsersAndGroups() != null)
            sb.append("IncludedUsersAndGroups: ").append(getIncludedUsersAndGroups()).append(",");
        if (getExcludedUsersAndGroups() != null)
            sb.append("ExcludedUsersAndGroups: ").append(getExcludedUsersAndGroups()).append(",");
        if (getRuleType() != null)
            sb.append("RuleType: ").append(getRuleType()).append(",");
        if (getRuleConfiguration() != null)
            sb.append("RuleConfiguration: ").append(getRuleConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getIncludedUsersAndGroups() == null ^ this.getIncludedUsersAndGroups() == null)
            return false;
        if (other.getIncludedUsersAndGroups() != null && other.getIncludedUsersAndGroups().equals(this.getIncludedUsersAndGroups()) == false)
            return false;
        if (other.getExcludedUsersAndGroups() == null ^ this.getExcludedUsersAndGroups() == null)
            return false;
        if (other.getExcludedUsersAndGroups() != null && other.getExcludedUsersAndGroups().equals(this.getExcludedUsersAndGroups()) == false)
            return false;
        if (other.getRuleType() == null ^ this.getRuleType() == null)
            return false;
        if (other.getRuleType() != null && other.getRuleType().equals(this.getRuleType()) == false)
            return false;
        if (other.getRuleConfiguration() == null ^ this.getRuleConfiguration() == null)
            return false;
        if (other.getRuleConfiguration() != null && other.getRuleConfiguration().equals(this.getRuleConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludedUsersAndGroups() == null) ? 0 : getIncludedUsersAndGroups().hashCode());
        hashCode = prime * hashCode + ((getExcludedUsersAndGroups() == null) ? 0 : getExcludedUsersAndGroups().hashCode());
        hashCode = prime * hashCode + ((getRuleType() == null) ? 0 : getRuleType().hashCode());
        hashCode = prime * hashCode + ((getRuleConfiguration() == null) ? 0 : getRuleConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
