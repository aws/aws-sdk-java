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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A rule that you add to Application Recovery Controller to ensure that recovery actions don't accidentally impair your
 * application's availability.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateSafetyRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSafetyRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The assertion rule to update.
     * </p>
     */
    private AssertionRuleUpdate assertionRuleUpdate;
    /**
     * <p>
     * The gating rule to update.
     * </p>
     */
    private GatingRuleUpdate gatingRuleUpdate;

    /**
     * <p>
     * The assertion rule to update.
     * </p>
     * 
     * @param assertionRuleUpdate
     *        The assertion rule to update.
     */

    public void setAssertionRuleUpdate(AssertionRuleUpdate assertionRuleUpdate) {
        this.assertionRuleUpdate = assertionRuleUpdate;
    }

    /**
     * <p>
     * The assertion rule to update.
     * </p>
     * 
     * @return The assertion rule to update.
     */

    public AssertionRuleUpdate getAssertionRuleUpdate() {
        return this.assertionRuleUpdate;
    }

    /**
     * <p>
     * The assertion rule to update.
     * </p>
     * 
     * @param assertionRuleUpdate
     *        The assertion rule to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSafetyRuleRequest withAssertionRuleUpdate(AssertionRuleUpdate assertionRuleUpdate) {
        setAssertionRuleUpdate(assertionRuleUpdate);
        return this;
    }

    /**
     * <p>
     * The gating rule to update.
     * </p>
     * 
     * @param gatingRuleUpdate
     *        The gating rule to update.
     */

    public void setGatingRuleUpdate(GatingRuleUpdate gatingRuleUpdate) {
        this.gatingRuleUpdate = gatingRuleUpdate;
    }

    /**
     * <p>
     * The gating rule to update.
     * </p>
     * 
     * @return The gating rule to update.
     */

    public GatingRuleUpdate getGatingRuleUpdate() {
        return this.gatingRuleUpdate;
    }

    /**
     * <p>
     * The gating rule to update.
     * </p>
     * 
     * @param gatingRuleUpdate
     *        The gating rule to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSafetyRuleRequest withGatingRuleUpdate(GatingRuleUpdate gatingRuleUpdate) {
        setGatingRuleUpdate(gatingRuleUpdate);
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
        if (getAssertionRuleUpdate() != null)
            sb.append("AssertionRuleUpdate: ").append(getAssertionRuleUpdate()).append(",");
        if (getGatingRuleUpdate() != null)
            sb.append("GatingRuleUpdate: ").append(getGatingRuleUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSafetyRuleRequest == false)
            return false;
        UpdateSafetyRuleRequest other = (UpdateSafetyRuleRequest) obj;
        if (other.getAssertionRuleUpdate() == null ^ this.getAssertionRuleUpdate() == null)
            return false;
        if (other.getAssertionRuleUpdate() != null && other.getAssertionRuleUpdate().equals(this.getAssertionRuleUpdate()) == false)
            return false;
        if (other.getGatingRuleUpdate() == null ^ this.getGatingRuleUpdate() == null)
            return false;
        if (other.getGatingRuleUpdate() != null && other.getGatingRuleUpdate().equals(this.getGatingRuleUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssertionRuleUpdate() == null) ? 0 : getAssertionRuleUpdate().hashCode());
        hashCode = prime * hashCode + ((getGatingRuleUpdate() == null) ? 0 : getGatingRuleUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSafetyRuleRequest clone() {
        return (UpdateSafetyRuleRequest) super.clone();
    }

}
