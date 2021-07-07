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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an update to a security group rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SecurityGroupRuleUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupRuleUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     */
    private String securityGroupRuleId;
    /**
     * <p>
     * Information about the security group rule.
     * </p>
     */
    private SecurityGroupRuleRequest securityGroupRule;

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     * 
     * @param securityGroupRuleId
     *        The ID of the security group rule.
     */

    public void setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
    }

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     * 
     * @return The ID of the security group rule.
     */

    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     * 
     * @param securityGroupRuleId
     *        The ID of the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleUpdate withSecurityGroupRuleId(String securityGroupRuleId) {
        setSecurityGroupRuleId(securityGroupRuleId);
        return this;
    }

    /**
     * <p>
     * Information about the security group rule.
     * </p>
     * 
     * @param securityGroupRule
     *        Information about the security group rule.
     */

    public void setSecurityGroupRule(SecurityGroupRuleRequest securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
    }

    /**
     * <p>
     * Information about the security group rule.
     * </p>
     * 
     * @return Information about the security group rule.
     */

    public SecurityGroupRuleRequest getSecurityGroupRule() {
        return this.securityGroupRule;
    }

    /**
     * <p>
     * Information about the security group rule.
     * </p>
     * 
     * @param securityGroupRule
     *        Information about the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleUpdate withSecurityGroupRule(SecurityGroupRuleRequest securityGroupRule) {
        setSecurityGroupRule(securityGroupRule);
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
        if (getSecurityGroupRuleId() != null)
            sb.append("SecurityGroupRuleId: ").append(getSecurityGroupRuleId()).append(",");
        if (getSecurityGroupRule() != null)
            sb.append("SecurityGroupRule: ").append(getSecurityGroupRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroupRuleUpdate == false)
            return false;
        SecurityGroupRuleUpdate other = (SecurityGroupRuleUpdate) obj;
        if (other.getSecurityGroupRuleId() == null ^ this.getSecurityGroupRuleId() == null)
            return false;
        if (other.getSecurityGroupRuleId() != null && other.getSecurityGroupRuleId().equals(this.getSecurityGroupRuleId()) == false)
            return false;
        if (other.getSecurityGroupRule() == null ^ this.getSecurityGroupRule() == null)
            return false;
        if (other.getSecurityGroupRule() != null && other.getSecurityGroupRule().equals(this.getSecurityGroupRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroupRuleId() == null) ? 0 : getSecurityGroupRuleId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupRule() == null) ? 0 : getSecurityGroupRule().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupRuleUpdate clone() {
        try {
            return (SecurityGroupRuleUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
