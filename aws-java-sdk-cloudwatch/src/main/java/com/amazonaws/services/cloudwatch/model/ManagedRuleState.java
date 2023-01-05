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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The status of a managed Contributor Insights rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ManagedRuleState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleState implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Contributor Insights rule that contains data for the specified Amazon Web Services resource.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The name of the Contributor Insights rule that contains data for the specified Amazon Web Services resource.
     * </p>
     * 
     * @param ruleName
     *        The name of the Contributor Insights rule that contains data for the specified Amazon Web Services
     *        resource.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the Contributor Insights rule that contains data for the specified Amazon Web Services resource.
     * </p>
     * 
     * @return The name of the Contributor Insights rule that contains data for the specified Amazon Web Services
     *         resource.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the Contributor Insights rule that contains data for the specified Amazon Web Services resource.
     * </p>
     * 
     * @param ruleName
     *        The name of the Contributor Insights rule that contains data for the specified Amazon Web Services
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleState withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the rule is enabled or disabled.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @return Indicates whether the rule is enabled or disabled.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the rule is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleState withState(String state) {
        setState(state);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedRuleState == false)
            return false;
        ManagedRuleState other = (ManagedRuleState) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleState clone() {
        try {
            return (ManagedRuleState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
