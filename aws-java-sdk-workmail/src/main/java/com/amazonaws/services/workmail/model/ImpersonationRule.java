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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The rules for the given impersonation role.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ImpersonationRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImpersonationRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the rule.
     * </p>
     */
    private String impersonationRuleId;
    /**
     * <p>
     * The rule name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     * <code>DENY</code>.
     * </p>
     */
    private String effect;
    /**
     * <p>
     * A list of user IDs that match the rule.
     * </p>
     */
    private java.util.List<String> targetUsers;
    /**
     * <p>
     * A list of user IDs that don't match the rule.
     * </p>
     */
    private java.util.List<String> notTargetUsers;

    /**
     * <p>
     * The identifier of the rule.
     * </p>
     * 
     * @param impersonationRuleId
     *        The identifier of the rule.
     */

    public void setImpersonationRuleId(String impersonationRuleId) {
        this.impersonationRuleId = impersonationRuleId;
    }

    /**
     * <p>
     * The identifier of the rule.
     * </p>
     * 
     * @return The identifier of the rule.
     */

    public String getImpersonationRuleId() {
        return this.impersonationRuleId;
    }

    /**
     * <p>
     * The identifier of the rule.
     * </p>
     * 
     * @param impersonationRuleId
     *        The identifier of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRule withImpersonationRuleId(String impersonationRuleId) {
        setImpersonationRuleId(impersonationRuleId);
        return this;
    }

    /**
     * <p>
     * The rule name.
     * </p>
     * 
     * @param name
     *        The rule name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The rule name.
     * </p>
     * 
     * @return The rule name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The rule name.
     * </p>
     * 
     * @param name
     *        The rule name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @param description
     *        The rule description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @return The rule description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @param description
     *        The rule description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     * <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     *        <code>DENY</code>.
     * @see AccessEffect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     * <code>DENY</code>.
     * </p>
     * 
     * @return The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     *         <code>DENY</code>.
     * @see AccessEffect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     * <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     *        <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessEffect
     */

    public ImpersonationRule withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     * <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        The effect of the rule when it matches the input. Allowed effect values are <code>ALLOW</code> or
     *        <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessEffect
     */

    public ImpersonationRule withEffect(AccessEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * A list of user IDs that match the rule.
     * </p>
     * 
     * @return A list of user IDs that match the rule.
     */

    public java.util.List<String> getTargetUsers() {
        return targetUsers;
    }

    /**
     * <p>
     * A list of user IDs that match the rule.
     * </p>
     * 
     * @param targetUsers
     *        A list of user IDs that match the rule.
     */

    public void setTargetUsers(java.util.Collection<String> targetUsers) {
        if (targetUsers == null) {
            this.targetUsers = null;
            return;
        }

        this.targetUsers = new java.util.ArrayList<String>(targetUsers);
    }

    /**
     * <p>
     * A list of user IDs that match the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetUsers(java.util.Collection)} or {@link #withTargetUsers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetUsers
     *        A list of user IDs that match the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRule withTargetUsers(String... targetUsers) {
        if (this.targetUsers == null) {
            setTargetUsers(new java.util.ArrayList<String>(targetUsers.length));
        }
        for (String ele : targetUsers) {
            this.targetUsers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of user IDs that match the rule.
     * </p>
     * 
     * @param targetUsers
     *        A list of user IDs that match the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRule withTargetUsers(java.util.Collection<String> targetUsers) {
        setTargetUsers(targetUsers);
        return this;
    }

    /**
     * <p>
     * A list of user IDs that don't match the rule.
     * </p>
     * 
     * @return A list of user IDs that don't match the rule.
     */

    public java.util.List<String> getNotTargetUsers() {
        return notTargetUsers;
    }

    /**
     * <p>
     * A list of user IDs that don't match the rule.
     * </p>
     * 
     * @param notTargetUsers
     *        A list of user IDs that don't match the rule.
     */

    public void setNotTargetUsers(java.util.Collection<String> notTargetUsers) {
        if (notTargetUsers == null) {
            this.notTargetUsers = null;
            return;
        }

        this.notTargetUsers = new java.util.ArrayList<String>(notTargetUsers);
    }

    /**
     * <p>
     * A list of user IDs that don't match the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotTargetUsers(java.util.Collection)} or {@link #withNotTargetUsers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notTargetUsers
     *        A list of user IDs that don't match the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRule withNotTargetUsers(String... notTargetUsers) {
        if (this.notTargetUsers == null) {
            setNotTargetUsers(new java.util.ArrayList<String>(notTargetUsers.length));
        }
        for (String ele : notTargetUsers) {
            this.notTargetUsers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of user IDs that don't match the rule.
     * </p>
     * 
     * @param notTargetUsers
     *        A list of user IDs that don't match the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRule withNotTargetUsers(java.util.Collection<String> notTargetUsers) {
        setNotTargetUsers(notTargetUsers);
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
        if (getImpersonationRuleId() != null)
            sb.append("ImpersonationRuleId: ").append(getImpersonationRuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect()).append(",");
        if (getTargetUsers() != null)
            sb.append("TargetUsers: ").append(getTargetUsers()).append(",");
        if (getNotTargetUsers() != null)
            sb.append("NotTargetUsers: ").append(getNotTargetUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImpersonationRule == false)
            return false;
        ImpersonationRule other = (ImpersonationRule) obj;
        if (other.getImpersonationRuleId() == null ^ this.getImpersonationRuleId() == null)
            return false;
        if (other.getImpersonationRuleId() != null && other.getImpersonationRuleId().equals(this.getImpersonationRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getTargetUsers() == null ^ this.getTargetUsers() == null)
            return false;
        if (other.getTargetUsers() != null && other.getTargetUsers().equals(this.getTargetUsers()) == false)
            return false;
        if (other.getNotTargetUsers() == null ^ this.getNotTargetUsers() == null)
            return false;
        if (other.getNotTargetUsers() != null && other.getNotTargetUsers().equals(this.getNotTargetUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImpersonationRuleId() == null) ? 0 : getImpersonationRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getTargetUsers() == null) ? 0 : getTargetUsers().hashCode());
        hashCode = prime * hashCode + ((getNotTargetUsers() == null) ? 0 : getNotTargetUsers().hashCode());
        return hashCode;
    }

    @Override
    public ImpersonationRule clone() {
        try {
            return (ImpersonationRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.ImpersonationRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
