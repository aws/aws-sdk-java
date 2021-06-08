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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The rule results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/RuleResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rule ID that was matched, based on the rule execution mode.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     */
    private java.util.List<String> outcomes;

    /**
     * <p>
     * The rule ID that was matched, based on the rule execution mode.
     * </p>
     * 
     * @param ruleId
     *        The rule ID that was matched, based on the rule execution mode.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The rule ID that was matched, based on the rule execution mode.
     * </p>
     * 
     * @return The rule ID that was matched, based on the rule execution mode.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The rule ID that was matched, based on the rule execution mode.
     * </p>
     * 
     * @param ruleId
     *        The rule ID that was matched, based on the rule execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleResult withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * 
     * @return The outcomes of the matched rule, based on the rule execution mode.
     */

    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * 
     * @param outcomes
     *        The outcomes of the matched rule, based on the rule execution mode.
     */

    public void setOutcomes(java.util.Collection<String> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<String>(outcomes);
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomes(java.util.Collection)} or {@link #withOutcomes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outcomes
     *        The outcomes of the matched rule, based on the rule execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleResult withOutcomes(String... outcomes) {
        if (this.outcomes == null) {
            setOutcomes(new java.util.ArrayList<String>(outcomes.length));
        }
        for (String ele : outcomes) {
            this.outcomes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * 
     * @param outcomes
     *        The outcomes of the matched rule, based on the rule execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleResult withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
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
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getOutcomes() != null)
            sb.append("Outcomes: ").append(getOutcomes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleResult == false)
            return false;
        RuleResult other = (RuleResult) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        return hashCode;
    }

    @Override
    public RuleResult clone() {
        try {
            return (RuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.RuleResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
