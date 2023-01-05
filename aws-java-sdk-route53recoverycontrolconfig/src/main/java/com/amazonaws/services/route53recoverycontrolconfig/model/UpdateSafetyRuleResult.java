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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateSafetyRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSafetyRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The assertion rule updated.
     * </p>
     */
    private AssertionRule assertionRule;
    /**
     * <p>
     * The gating rule updated.
     * </p>
     */
    private GatingRule gatingRule;

    /**
     * <p>
     * The assertion rule updated.
     * </p>
     * 
     * @param assertionRule
     *        The assertion rule updated.
     */

    public void setAssertionRule(AssertionRule assertionRule) {
        this.assertionRule = assertionRule;
    }

    /**
     * <p>
     * The assertion rule updated.
     * </p>
     * 
     * @return The assertion rule updated.
     */

    public AssertionRule getAssertionRule() {
        return this.assertionRule;
    }

    /**
     * <p>
     * The assertion rule updated.
     * </p>
     * 
     * @param assertionRule
     *        The assertion rule updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSafetyRuleResult withAssertionRule(AssertionRule assertionRule) {
        setAssertionRule(assertionRule);
        return this;
    }

    /**
     * <p>
     * The gating rule updated.
     * </p>
     * 
     * @param gatingRule
     *        The gating rule updated.
     */

    public void setGatingRule(GatingRule gatingRule) {
        this.gatingRule = gatingRule;
    }

    /**
     * <p>
     * The gating rule updated.
     * </p>
     * 
     * @return The gating rule updated.
     */

    public GatingRule getGatingRule() {
        return this.gatingRule;
    }

    /**
     * <p>
     * The gating rule updated.
     * </p>
     * 
     * @param gatingRule
     *        The gating rule updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSafetyRuleResult withGatingRule(GatingRule gatingRule) {
        setGatingRule(gatingRule);
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
        if (getAssertionRule() != null)
            sb.append("AssertionRule: ").append(getAssertionRule()).append(",");
        if (getGatingRule() != null)
            sb.append("GatingRule: ").append(getGatingRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSafetyRuleResult == false)
            return false;
        UpdateSafetyRuleResult other = (UpdateSafetyRuleResult) obj;
        if (other.getAssertionRule() == null ^ this.getAssertionRule() == null)
            return false;
        if (other.getAssertionRule() != null && other.getAssertionRule().equals(this.getAssertionRule()) == false)
            return false;
        if (other.getGatingRule() == null ^ this.getGatingRule() == null)
            return false;
        if (other.getGatingRule() != null && other.getGatingRule().equals(this.getGatingRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssertionRule() == null) ? 0 : getAssertionRule().hashCode());
        hashCode = prime * hashCode + ((getGatingRule() == null) ? 0 : getGatingRule().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSafetyRuleResult clone() {
        try {
            return (UpdateSafetyRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
