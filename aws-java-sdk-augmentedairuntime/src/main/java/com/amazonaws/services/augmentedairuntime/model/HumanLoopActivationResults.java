/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the corresponding flow definition's human loop activation condition evaluation. Null if
 * <code>StartHumanLoop</code> was invoked directly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/HumanLoopActivationResults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopActivationResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object containing information about why a human loop was triggered.
     * </p>
     */
    private HumanLoopActivationReason humanLoopActivationReason;
    /**
     * <p>
     * A copy of the human loop activation conditions of the flow definition, augmented with the results of evaluating
     * those conditions on the input provided to the <code>StartHumanLoop</code> operation.
     * </p>
     */
    private String humanLoopActivationConditionsEvaluationResults;

    /**
     * <p>
     * An object containing information about why a human loop was triggered.
     * </p>
     * 
     * @param humanLoopActivationReason
     *        An object containing information about why a human loop was triggered.
     */

    public void setHumanLoopActivationReason(HumanLoopActivationReason humanLoopActivationReason) {
        this.humanLoopActivationReason = humanLoopActivationReason;
    }

    /**
     * <p>
     * An object containing information about why a human loop was triggered.
     * </p>
     * 
     * @return An object containing information about why a human loop was triggered.
     */

    public HumanLoopActivationReason getHumanLoopActivationReason() {
        return this.humanLoopActivationReason;
    }

    /**
     * <p>
     * An object containing information about why a human loop was triggered.
     * </p>
     * 
     * @param humanLoopActivationReason
     *        An object containing information about why a human loop was triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationResults withHumanLoopActivationReason(HumanLoopActivationReason humanLoopActivationReason) {
        setHumanLoopActivationReason(humanLoopActivationReason);
        return this;
    }

    /**
     * <p>
     * A copy of the human loop activation conditions of the flow definition, augmented with the results of evaluating
     * those conditions on the input provided to the <code>StartHumanLoop</code> operation.
     * </p>
     * 
     * @param humanLoopActivationConditionsEvaluationResults
     *        A copy of the human loop activation conditions of the flow definition, augmented with the results of
     *        evaluating those conditions on the input provided to the <code>StartHumanLoop</code> operation.
     */

    public void setHumanLoopActivationConditionsEvaluationResults(String humanLoopActivationConditionsEvaluationResults) {
        this.humanLoopActivationConditionsEvaluationResults = humanLoopActivationConditionsEvaluationResults;
    }

    /**
     * <p>
     * A copy of the human loop activation conditions of the flow definition, augmented with the results of evaluating
     * those conditions on the input provided to the <code>StartHumanLoop</code> operation.
     * </p>
     * 
     * @return A copy of the human loop activation conditions of the flow definition, augmented with the results of
     *         evaluating those conditions on the input provided to the <code>StartHumanLoop</code> operation.
     */

    public String getHumanLoopActivationConditionsEvaluationResults() {
        return this.humanLoopActivationConditionsEvaluationResults;
    }

    /**
     * <p>
     * A copy of the human loop activation conditions of the flow definition, augmented with the results of evaluating
     * those conditions on the input provided to the <code>StartHumanLoop</code> operation.
     * </p>
     * 
     * @param humanLoopActivationConditionsEvaluationResults
     *        A copy of the human loop activation conditions of the flow definition, augmented with the results of
     *        evaluating those conditions on the input provided to the <code>StartHumanLoop</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationResults withHumanLoopActivationConditionsEvaluationResults(String humanLoopActivationConditionsEvaluationResults) {
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
        if (getHumanLoopActivationReason() != null)
            sb.append("HumanLoopActivationReason: ").append(getHumanLoopActivationReason()).append(",");
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

        if (obj instanceof HumanLoopActivationResults == false)
            return false;
        HumanLoopActivationResults other = (HumanLoopActivationResults) obj;
        if (other.getHumanLoopActivationReason() == null ^ this.getHumanLoopActivationReason() == null)
            return false;
        if (other.getHumanLoopActivationReason() != null && other.getHumanLoopActivationReason().equals(this.getHumanLoopActivationReason()) == false)
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

        hashCode = prime * hashCode + ((getHumanLoopActivationReason() == null) ? 0 : getHumanLoopActivationReason().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopActivationConditionsEvaluationResults() == null) ? 0 : getHumanLoopActivationConditionsEvaluationResults().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopActivationResults clone() {
        try {
            return (HumanLoopActivationResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.augmentedairuntime.model.transform.HumanLoopActivationResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
