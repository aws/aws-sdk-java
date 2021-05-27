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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information needed to evaluate data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/RuleEvaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleEvaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information needed to compare two values with a comparison operator.
     * </p>
     */
    private SimpleRuleEvaluation simpleRuleEvaluation;

    /**
     * <p>
     * Information needed to compare two values with a comparison operator.
     * </p>
     * 
     * @param simpleRuleEvaluation
     *        Information needed to compare two values with a comparison operator.
     */

    public void setSimpleRuleEvaluation(SimpleRuleEvaluation simpleRuleEvaluation) {
        this.simpleRuleEvaluation = simpleRuleEvaluation;
    }

    /**
     * <p>
     * Information needed to compare two values with a comparison operator.
     * </p>
     * 
     * @return Information needed to compare two values with a comparison operator.
     */

    public SimpleRuleEvaluation getSimpleRuleEvaluation() {
        return this.simpleRuleEvaluation;
    }

    /**
     * <p>
     * Information needed to compare two values with a comparison operator.
     * </p>
     * 
     * @param simpleRuleEvaluation
     *        Information needed to compare two values with a comparison operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleEvaluation withSimpleRuleEvaluation(SimpleRuleEvaluation simpleRuleEvaluation) {
        setSimpleRuleEvaluation(simpleRuleEvaluation);
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
        if (getSimpleRuleEvaluation() != null)
            sb.append("SimpleRuleEvaluation: ").append(getSimpleRuleEvaluation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleEvaluation == false)
            return false;
        RuleEvaluation other = (RuleEvaluation) obj;
        if (other.getSimpleRuleEvaluation() == null ^ this.getSimpleRuleEvaluation() == null)
            return false;
        if (other.getSimpleRuleEvaluation() != null && other.getSimpleRuleEvaluation().equals(this.getSimpleRuleEvaluation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleRuleEvaluation() == null) ? 0 : getSimpleRuleEvaluation().hashCode());
        return hashCode;
    }

    @Override
    public RuleEvaluation clone() {
        try {
            return (RuleEvaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.RuleEvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
