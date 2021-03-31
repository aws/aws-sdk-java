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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessEffect"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMobileDeviceAccessEffectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile device
     * access rules in the Amazon WorkMail organization for the simulated user parameters.
     * </p>
     */
    private String effect;
    /**
     * <p>
     * A list of the rules which matched the simulated user input and produced the effect.
     * </p>
     */
    private java.util.List<MobileDeviceAccessMatchedRule> matchedRules;

    /**
     * <p>
     * The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile device
     * access rules in the Amazon WorkMail organization for the simulated user parameters.
     * </p>
     * 
     * @param effect
     *        The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile
     *        device access rules in the Amazon WorkMail organization for the simulated user parameters.
     * @see MobileDeviceAccessRuleEffect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile device
     * access rules in the Amazon WorkMail organization for the simulated user parameters.
     * </p>
     * 
     * @return The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile
     *         device access rules in the Amazon WorkMail organization for the simulated user parameters.
     * @see MobileDeviceAccessRuleEffect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile device
     * access rules in the Amazon WorkMail organization for the simulated user parameters.
     * </p>
     * 
     * @param effect
     *        The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile
     *        device access rules in the Amazon WorkMail organization for the simulated user parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MobileDeviceAccessRuleEffect
     */

    public GetMobileDeviceAccessEffectResult withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile device
     * access rules in the Amazon WorkMail organization for the simulated user parameters.
     * </p>
     * 
     * @param effect
     *        The effect of the simulated access, <code>ALLOW</code> or <code>DENY</code>, after evaluating mobile
     *        device access rules in the Amazon WorkMail organization for the simulated user parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MobileDeviceAccessRuleEffect
     */

    public GetMobileDeviceAccessEffectResult withEffect(MobileDeviceAccessRuleEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * A list of the rules which matched the simulated user input and produced the effect.
     * </p>
     * 
     * @return A list of the rules which matched the simulated user input and produced the effect.
     */

    public java.util.List<MobileDeviceAccessMatchedRule> getMatchedRules() {
        return matchedRules;
    }

    /**
     * <p>
     * A list of the rules which matched the simulated user input and produced the effect.
     * </p>
     * 
     * @param matchedRules
     *        A list of the rules which matched the simulated user input and produced the effect.
     */

    public void setMatchedRules(java.util.Collection<MobileDeviceAccessMatchedRule> matchedRules) {
        if (matchedRules == null) {
            this.matchedRules = null;
            return;
        }

        this.matchedRules = new java.util.ArrayList<MobileDeviceAccessMatchedRule>(matchedRules);
    }

    /**
     * <p>
     * A list of the rules which matched the simulated user input and produced the effect.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchedRules(java.util.Collection)} or {@link #withMatchedRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param matchedRules
     *        A list of the rules which matched the simulated user input and produced the effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessEffectResult withMatchedRules(MobileDeviceAccessMatchedRule... matchedRules) {
        if (this.matchedRules == null) {
            setMatchedRules(new java.util.ArrayList<MobileDeviceAccessMatchedRule>(matchedRules.length));
        }
        for (MobileDeviceAccessMatchedRule ele : matchedRules) {
            this.matchedRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the rules which matched the simulated user input and produced the effect.
     * </p>
     * 
     * @param matchedRules
     *        A list of the rules which matched the simulated user input and produced the effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessEffectResult withMatchedRules(java.util.Collection<MobileDeviceAccessMatchedRule> matchedRules) {
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

        if (obj instanceof GetMobileDeviceAccessEffectResult == false)
            return false;
        GetMobileDeviceAccessEffectResult other = (GetMobileDeviceAccessEffectResult) obj;
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

        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getMatchedRules() == null) ? 0 : getMatchedRules().hashCode());
        return hashCode;
    }

    @Override
    public GetMobileDeviceAccessEffectResult clone() {
        try {
            return (GetMobileDeviceAccessEffectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
