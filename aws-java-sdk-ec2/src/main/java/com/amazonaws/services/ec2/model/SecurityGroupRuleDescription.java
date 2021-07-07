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
 * Describes the description of a security group rule.
 * </p>
 * <p>
 * You can use this when you want to update the security group rule description for either an inbound or outbound rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SecurityGroupRuleDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupRuleDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     */
    private String securityGroupRuleId;
    /**
     * <p>
     * The description of the security group rule.
     * </p>
     */
    private String description;

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

    public SecurityGroupRuleDescription withSecurityGroupRuleId(String securityGroupRuleId) {
        setSecurityGroupRuleId(securityGroupRuleId);
        return this;
    }

    /**
     * <p>
     * The description of the security group rule.
     * </p>
     * 
     * @param description
     *        The description of the security group rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security group rule.
     * </p>
     * 
     * @return The description of the security group rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the security group rule.
     * </p>
     * 
     * @param description
     *        The description of the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleDescription withDescription(String description) {
        setDescription(description);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroupRuleDescription == false)
            return false;
        SecurityGroupRuleDescription other = (SecurityGroupRuleDescription) obj;
        if (other.getSecurityGroupRuleId() == null ^ this.getSecurityGroupRuleId() == null)
            return false;
        if (other.getSecurityGroupRuleId() != null && other.getSecurityGroupRuleId().equals(this.getSecurityGroupRuleId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroupRuleId() == null) ? 0 : getSecurityGroupRuleId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupRuleDescription clone() {
        try {
            return (SecurityGroupRuleDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
