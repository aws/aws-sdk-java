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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the rule and the threshold under which a prediction can be rejected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether you want to reject the top prediction for all targets or none.
     * </p>
     */
    private String rule;
    /**
     * <p>
     * The confidence score that specifies the condition at which a prediction can be rejected.
     * </p>
     */
    private Float threshold;

    /**
     * <p>
     * Specifies whether you want to reject the top prediction for all targets or none.
     * </p>
     * 
     * @param rule
     *        Specifies whether you want to reject the top prediction for all targets or none.
     * @see RejectRuleBehavior
     */

    public void setRule(String rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * Specifies whether you want to reject the top prediction for all targets or none.
     * </p>
     * 
     * @return Specifies whether you want to reject the top prediction for all targets or none.
     * @see RejectRuleBehavior
     */

    public String getRule() {
        return this.rule;
    }

    /**
     * <p>
     * Specifies whether you want to reject the top prediction for all targets or none.
     * </p>
     * 
     * @param rule
     *        Specifies whether you want to reject the top prediction for all targets or none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RejectRuleBehavior
     */

    public RejectRule withRule(String rule) {
        setRule(rule);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to reject the top prediction for all targets or none.
     * </p>
     * 
     * @param rule
     *        Specifies whether you want to reject the top prediction for all targets or none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RejectRuleBehavior
     */

    public RejectRule withRule(RejectRuleBehavior rule) {
        this.rule = rule.toString();
        return this;
    }

    /**
     * <p>
     * The confidence score that specifies the condition at which a prediction can be rejected.
     * </p>
     * 
     * @param threshold
     *        The confidence score that specifies the condition at which a prediction can be rejected.
     */

    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The confidence score that specifies the condition at which a prediction can be rejected.
     * </p>
     * 
     * @return The confidence score that specifies the condition at which a prediction can be rejected.
     */

    public Float getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The confidence score that specifies the condition at which a prediction can be rejected.
     * </p>
     * 
     * @param threshold
     *        The confidence score that specifies the condition at which a prediction can be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectRule withThreshold(Float threshold) {
        setThreshold(threshold);
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
        if (getRule() != null)
            sb.append("Rule: ").append(getRule()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectRule == false)
            return false;
        RejectRule other = (RejectRule) obj;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        return hashCode;
    }

    @Override
    public RejectRule clone() {
        try {
            return (RejectRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RejectRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
