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
 * Information needed to compare two values with a comparison operator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/SimpleRuleEvaluation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleRuleEvaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the input property, on the left side of the comparison operator.
     * </p>
     */
    private String inputPropertyValue;
    /**
     * <p>
     * The comparison operator.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The threshold value, on the right side of the comparison operator.
     * </p>
     */
    private String thresholdValue;

    /**
     * <p>
     * The value of the input property, on the left side of the comparison operator.
     * </p>
     * 
     * @param inputPropertyValue
     *        The value of the input property, on the left side of the comparison operator.
     */

    public void setInputPropertyValue(String inputPropertyValue) {
        this.inputPropertyValue = inputPropertyValue;
    }

    /**
     * <p>
     * The value of the input property, on the left side of the comparison operator.
     * </p>
     * 
     * @return The value of the input property, on the left side of the comparison operator.
     */

    public String getInputPropertyValue() {
        return this.inputPropertyValue;
    }

    /**
     * <p>
     * The value of the input property, on the left side of the comparison operator.
     * </p>
     * 
     * @param inputPropertyValue
     *        The value of the input property, on the left side of the comparison operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleRuleEvaluation withInputPropertyValue(String inputPropertyValue) {
        setInputPropertyValue(inputPropertyValue);
        return this;
    }

    /**
     * <p>
     * The comparison operator.
     * </p>
     * 
     * @param operator
     *        The comparison operator.
     * @see ComparisonOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The comparison operator.
     * </p>
     * 
     * @return The comparison operator.
     * @see ComparisonOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The comparison operator.
     * </p>
     * 
     * @param operator
     *        The comparison operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public SimpleRuleEvaluation withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The comparison operator.
     * </p>
     * 
     * @param operator
     *        The comparison operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public SimpleRuleEvaluation withOperator(ComparisonOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The threshold value, on the right side of the comparison operator.
     * </p>
     * 
     * @param thresholdValue
     *        The threshold value, on the right side of the comparison operator.
     */

    public void setThresholdValue(String thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    /**
     * <p>
     * The threshold value, on the right side of the comparison operator.
     * </p>
     * 
     * @return The threshold value, on the right side of the comparison operator.
     */

    public String getThresholdValue() {
        return this.thresholdValue;
    }

    /**
     * <p>
     * The threshold value, on the right side of the comparison operator.
     * </p>
     * 
     * @param thresholdValue
     *        The threshold value, on the right side of the comparison operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleRuleEvaluation withThresholdValue(String thresholdValue) {
        setThresholdValue(thresholdValue);
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
        if (getInputPropertyValue() != null)
            sb.append("InputPropertyValue: ").append(getInputPropertyValue()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getThresholdValue() != null)
            sb.append("ThresholdValue: ").append(getThresholdValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleRuleEvaluation == false)
            return false;
        SimpleRuleEvaluation other = (SimpleRuleEvaluation) obj;
        if (other.getInputPropertyValue() == null ^ this.getInputPropertyValue() == null)
            return false;
        if (other.getInputPropertyValue() != null && other.getInputPropertyValue().equals(this.getInputPropertyValue()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getThresholdValue() == null ^ this.getThresholdValue() == null)
            return false;
        if (other.getThresholdValue() != null && other.getThresholdValue().equals(this.getThresholdValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputPropertyValue() == null) ? 0 : getInputPropertyValue().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getThresholdValue() == null) ? 0 : getThresholdValue().hashCode());
        return hashCode;
    }

    @Override
    public SimpleRuleEvaluation clone() {
        try {
            return (SimpleRuleEvaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.SimpleRuleEvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
