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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRoleEffect"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImpersonationRoleEffectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The impersonation role type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     * or <code>DENY</code>.
     * </p>
     */
    private String effect;
    /**
     * <p>
     * A list of the rules that match the input and produce the configured effect.
     * </p>
     */
    private java.util.List<ImpersonationMatchedRule> matchedRules;

    /**
     * <p>
     * The impersonation role type.
     * </p>
     * 
     * @param type
     *        The impersonation role type.
     * @see ImpersonationRoleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The impersonation role type.
     * </p>
     * 
     * @return The impersonation role type.
     * @see ImpersonationRoleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The impersonation role type.
     * </p>
     * 
     * @param type
     *        The impersonation role type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpersonationRoleType
     */

    public GetImpersonationRoleEffectResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The impersonation role type.
     * </p>
     * 
     * @param type
     *        The impersonation role type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpersonationRoleType
     */

    public GetImpersonationRoleEffectResult withType(ImpersonationRoleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     * or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     *        or <code>DENY</code>.
     * @see AccessEffect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     * or <code>DENY</code>.
     * </p>
     * 
     * @return <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     *         or <code>DENY</code>.
     * @see AccessEffect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     * or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     *        or <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessEffect
     */

    public GetImpersonationRoleEffectResult withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     * or <code>DENY</code>.
     * </p>
     * 
     * @param effect
     *        <code/>Effect of the impersonation role on the target user based on its rules. Available effects are <code>ALLOW</code>
     *        or <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessEffect
     */

    public GetImpersonationRoleEffectResult withEffect(AccessEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * A list of the rules that match the input and produce the configured effect.
     * </p>
     * 
     * @return A list of the rules that match the input and produce the configured effect.
     */

    public java.util.List<ImpersonationMatchedRule> getMatchedRules() {
        return matchedRules;
    }

    /**
     * <p>
     * A list of the rules that match the input and produce the configured effect.
     * </p>
     * 
     * @param matchedRules
     *        A list of the rules that match the input and produce the configured effect.
     */

    public void setMatchedRules(java.util.Collection<ImpersonationMatchedRule> matchedRules) {
        if (matchedRules == null) {
            this.matchedRules = null;
            return;
        }

        this.matchedRules = new java.util.ArrayList<ImpersonationMatchedRule>(matchedRules);
    }

    /**
     * <p>
     * A list of the rules that match the input and produce the configured effect.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchedRules(java.util.Collection)} or {@link #withMatchedRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param matchedRules
     *        A list of the rules that match the input and produce the configured effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImpersonationRoleEffectResult withMatchedRules(ImpersonationMatchedRule... matchedRules) {
        if (this.matchedRules == null) {
            setMatchedRules(new java.util.ArrayList<ImpersonationMatchedRule>(matchedRules.length));
        }
        for (ImpersonationMatchedRule ele : matchedRules) {
            this.matchedRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the rules that match the input and produce the configured effect.
     * </p>
     * 
     * @param matchedRules
     *        A list of the rules that match the input and produce the configured effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImpersonationRoleEffectResult withMatchedRules(java.util.Collection<ImpersonationMatchedRule> matchedRules) {
        setMatchedRules(matchedRules);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect()).append(",");
        if (getMatchedRules() != null)
            sb.append("MatchedRules: ").append(getMatchedRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImpersonationRoleEffectResult == false)
            return false;
        GetImpersonationRoleEffectResult other = (GetImpersonationRoleEffectResult) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getMatchedRules() == null ^ this.getMatchedRules() == null)
            return false;
        if (other.getMatchedRules() != null && other.getMatchedRules().equals(this.getMatchedRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getMatchedRules() == null) ? 0 : getMatchedRules().hashCode());
        return hashCode;
    }

    @Override
    public GetImpersonationRoleEffectResult clone() {
        try {
            return (GetImpersonationRoleEffectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
