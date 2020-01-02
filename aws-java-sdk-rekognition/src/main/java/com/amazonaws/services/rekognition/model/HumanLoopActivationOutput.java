/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Shows the results of the human in the loop evaluation. If there is no HumanLoopArn, the input did not trigger human
 * review.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopActivationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the HumanLoop created.
     * </p>
     */
    private String humanLoopArn;
    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     */
    private java.util.List<String> humanLoopActivationReasons;
    /**
     * <p>
     * Shows the result of condition evaluations, including those conditions which activated a human review.
     * </p>
     */
    private String humanLoopActivationConditionsEvaluationResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the HumanLoop created.
     * </p>
     * 
     * @param humanLoopArn
     *        The Amazon Resource Name (ARN) of the HumanLoop created.
     */

    public void setHumanLoopArn(String humanLoopArn) {
        this.humanLoopArn = humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the HumanLoop created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the HumanLoop created.
     */

    public String getHumanLoopArn() {
        return this.humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the HumanLoop created.
     * </p>
     * 
     * @param humanLoopArn
     *        The Amazon Resource Name (ARN) of the HumanLoop created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationOutput withHumanLoopArn(String humanLoopArn) {
        setHumanLoopArn(humanLoopArn);
        return this;
    }

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     * 
     * @return Shows if and why human review was needed.
     */

    public java.util.List<String> getHumanLoopActivationReasons() {
        return humanLoopActivationReasons;
    }

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     * 
     * @param humanLoopActivationReasons
     *        Shows if and why human review was needed.
     */

    public void setHumanLoopActivationReasons(java.util.Collection<String> humanLoopActivationReasons) {
        if (humanLoopActivationReasons == null) {
            this.humanLoopActivationReasons = null;
            return;
        }

        this.humanLoopActivationReasons = new java.util.ArrayList<String>(humanLoopActivationReasons);
    }

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHumanLoopActivationReasons(java.util.Collection)} or
     * {@link #withHumanLoopActivationReasons(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param humanLoopActivationReasons
     *        Shows if and why human review was needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationOutput withHumanLoopActivationReasons(String... humanLoopActivationReasons) {
        if (this.humanLoopActivationReasons == null) {
            setHumanLoopActivationReasons(new java.util.ArrayList<String>(humanLoopActivationReasons.length));
        }
        for (String ele : humanLoopActivationReasons) {
            this.humanLoopActivationReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     * 
     * @param humanLoopActivationReasons
     *        Shows if and why human review was needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationOutput withHumanLoopActivationReasons(java.util.Collection<String> humanLoopActivationReasons) {
        setHumanLoopActivationReasons(humanLoopActivationReasons);
        return this;
    }

    /**
     * <p>
     * Shows the result of condition evaluations, including those conditions which activated a human review.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param humanLoopActivationConditionsEvaluationResults
     *        Shows the result of condition evaluations, including those conditions which activated a human review.
     */

    public void setHumanLoopActivationConditionsEvaluationResults(String humanLoopActivationConditionsEvaluationResults) {
        this.humanLoopActivationConditionsEvaluationResults = humanLoopActivationConditionsEvaluationResults;
    }

    /**
     * <p>
     * Shows the result of condition evaluations, including those conditions which activated a human review.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return Shows the result of condition evaluations, including those conditions which activated a human review.
     */

    public String getHumanLoopActivationConditionsEvaluationResults() {
        return this.humanLoopActivationConditionsEvaluationResults;
    }

    /**
     * <p>
     * Shows the result of condition evaluations, including those conditions which activated a human review.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param humanLoopActivationConditionsEvaluationResults
     *        Shows the result of condition evaluations, including those conditions which activated a human review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationOutput withHumanLoopActivationConditionsEvaluationResults(String humanLoopActivationConditionsEvaluationResults) {
        setHumanLoopActivationConditionsEvaluationResults(humanLoopActivationConditionsEvaluationResults);
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
        if (getHumanLoopArn() != null)
            sb.append("HumanLoopArn: ").append(getHumanLoopArn()).append(",");
        if (getHumanLoopActivationReasons() != null)
            sb.append("HumanLoopActivationReasons: ").append(getHumanLoopActivationReasons()).append(",");
        if (getHumanLoopActivationConditionsEvaluationResults() != null)
            sb.append("HumanLoopActivationConditionsEvaluationResults: ").append(getHumanLoopActivationConditionsEvaluationResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopActivationOutput == false)
            return false;
        HumanLoopActivationOutput other = (HumanLoopActivationOutput) obj;
        if (other.getHumanLoopArn() == null ^ this.getHumanLoopArn() == null)
            return false;
        if (other.getHumanLoopArn() != null && other.getHumanLoopArn().equals(this.getHumanLoopArn()) == false)
            return false;
        if (other.getHumanLoopActivationReasons() == null ^ this.getHumanLoopActivationReasons() == null)
            return false;
        if (other.getHumanLoopActivationReasons() != null && other.getHumanLoopActivationReasons().equals(this.getHumanLoopActivationReasons()) == false)
            return false;
        if (other.getHumanLoopActivationConditionsEvaluationResults() == null ^ this.getHumanLoopActivationConditionsEvaluationResults() == null)
            return false;
        if (other.getHumanLoopActivationConditionsEvaluationResults() != null
                && other.getHumanLoopActivationConditionsEvaluationResults().equals(this.getHumanLoopActivationConditionsEvaluationResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanLoopArn() == null) ? 0 : getHumanLoopArn().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopActivationReasons() == null) ? 0 : getHumanLoopActivationReasons().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopActivationConditionsEvaluationResults() == null) ? 0 : getHumanLoopActivationConditionsEvaluationResults().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopActivationOutput clone() {
        try {
            return (HumanLoopActivationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.HumanLoopActivationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
