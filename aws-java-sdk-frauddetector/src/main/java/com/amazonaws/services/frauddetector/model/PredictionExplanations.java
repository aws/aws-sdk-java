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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The prediction explanations that provide insight into how each event variable impacted the model version's fraud
 * prediction score.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PredictionExplanations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictionExplanations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of the event variable's impact on the prediction score.
     * </p>
     */
    private java.util.List<VariableImpactExplanation> variableImpactExplanations;
    /**
     * <p>
     * The details of the aggregated variables impact on the prediction score.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     */
    private java.util.List<AggregatedVariablesImpactExplanation> aggregatedVariablesImpactExplanations;

    /**
     * <p>
     * The details of the event variable's impact on the prediction score.
     * </p>
     * 
     * @return The details of the event variable's impact on the prediction score.
     */

    public java.util.List<VariableImpactExplanation> getVariableImpactExplanations() {
        return variableImpactExplanations;
    }

    /**
     * <p>
     * The details of the event variable's impact on the prediction score.
     * </p>
     * 
     * @param variableImpactExplanations
     *        The details of the event variable's impact on the prediction score.
     */

    public void setVariableImpactExplanations(java.util.Collection<VariableImpactExplanation> variableImpactExplanations) {
        if (variableImpactExplanations == null) {
            this.variableImpactExplanations = null;
            return;
        }

        this.variableImpactExplanations = new java.util.ArrayList<VariableImpactExplanation>(variableImpactExplanations);
    }

    /**
     * <p>
     * The details of the event variable's impact on the prediction score.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariableImpactExplanations(java.util.Collection)} or
     * {@link #withVariableImpactExplanations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param variableImpactExplanations
     *        The details of the event variable's impact on the prediction score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictionExplanations withVariableImpactExplanations(VariableImpactExplanation... variableImpactExplanations) {
        if (this.variableImpactExplanations == null) {
            setVariableImpactExplanations(new java.util.ArrayList<VariableImpactExplanation>(variableImpactExplanations.length));
        }
        for (VariableImpactExplanation ele : variableImpactExplanations) {
            this.variableImpactExplanations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the event variable's impact on the prediction score.
     * </p>
     * 
     * @param variableImpactExplanations
     *        The details of the event variable's impact on the prediction score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictionExplanations withVariableImpactExplanations(java.util.Collection<VariableImpactExplanation> variableImpactExplanations) {
        setVariableImpactExplanations(variableImpactExplanations);
        return this;
    }

    /**
     * <p>
     * The details of the aggregated variables impact on the prediction score.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     * 
     * @return The details of the aggregated variables impact on the prediction score. </p>
     *         <p>
     *         Account Takeover Insights (ATI) model uses event variables from the login data you provide to
     *         continuously calculate a set of variables (aggregated variables) based on historical events. For example,
     *         your ATI model might calculate the number of times an user has logged in using the same IP address. In
     *         this case, event variables used to derive the aggregated variables are <code>IP address</code> and
     *         <code>user</code>.
     */

    public java.util.List<AggregatedVariablesImpactExplanation> getAggregatedVariablesImpactExplanations() {
        return aggregatedVariablesImpactExplanations;
    }

    /**
     * <p>
     * The details of the aggregated variables impact on the prediction score.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     * 
     * @param aggregatedVariablesImpactExplanations
     *        The details of the aggregated variables impact on the prediction score. </p>
     *        <p>
     *        Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     *        calculate a set of variables (aggregated variables) based on historical events. For example, your ATI
     *        model might calculate the number of times an user has logged in using the same IP address. In this case,
     *        event variables used to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     */

    public void setAggregatedVariablesImpactExplanations(java.util.Collection<AggregatedVariablesImpactExplanation> aggregatedVariablesImpactExplanations) {
        if (aggregatedVariablesImpactExplanations == null) {
            this.aggregatedVariablesImpactExplanations = null;
            return;
        }

        this.aggregatedVariablesImpactExplanations = new java.util.ArrayList<AggregatedVariablesImpactExplanation>(aggregatedVariablesImpactExplanations);
    }

    /**
     * <p>
     * The details of the aggregated variables impact on the prediction score.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregatedVariablesImpactExplanations(java.util.Collection)} or
     * {@link #withAggregatedVariablesImpactExplanations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param aggregatedVariablesImpactExplanations
     *        The details of the aggregated variables impact on the prediction score. </p>
     *        <p>
     *        Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     *        calculate a set of variables (aggregated variables) based on historical events. For example, your ATI
     *        model might calculate the number of times an user has logged in using the same IP address. In this case,
     *        event variables used to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictionExplanations withAggregatedVariablesImpactExplanations(AggregatedVariablesImpactExplanation... aggregatedVariablesImpactExplanations) {
        if (this.aggregatedVariablesImpactExplanations == null) {
            setAggregatedVariablesImpactExplanations(new java.util.ArrayList<AggregatedVariablesImpactExplanation>(aggregatedVariablesImpactExplanations.length));
        }
        for (AggregatedVariablesImpactExplanation ele : aggregatedVariablesImpactExplanations) {
            this.aggregatedVariablesImpactExplanations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the aggregated variables impact on the prediction score.
     * </p>
     * <p>
     * Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     * calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might
     * calculate the number of times an user has logged in using the same IP address. In this case, event variables used
     * to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * </p>
     * 
     * @param aggregatedVariablesImpactExplanations
     *        The details of the aggregated variables impact on the prediction score. </p>
     *        <p>
     *        Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously
     *        calculate a set of variables (aggregated variables) based on historical events. For example, your ATI
     *        model might calculate the number of times an user has logged in using the same IP address. In this case,
     *        event variables used to derive the aggregated variables are <code>IP address</code> and <code>user</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictionExplanations withAggregatedVariablesImpactExplanations(
            java.util.Collection<AggregatedVariablesImpactExplanation> aggregatedVariablesImpactExplanations) {
        setAggregatedVariablesImpactExplanations(aggregatedVariablesImpactExplanations);
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
        if (getVariableImpactExplanations() != null)
            sb.append("VariableImpactExplanations: ").append(getVariableImpactExplanations()).append(",");
        if (getAggregatedVariablesImpactExplanations() != null)
            sb.append("AggregatedVariablesImpactExplanations: ").append(getAggregatedVariablesImpactExplanations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictionExplanations == false)
            return false;
        PredictionExplanations other = (PredictionExplanations) obj;
        if (other.getVariableImpactExplanations() == null ^ this.getVariableImpactExplanations() == null)
            return false;
        if (other.getVariableImpactExplanations() != null && other.getVariableImpactExplanations().equals(this.getVariableImpactExplanations()) == false)
            return false;
        if (other.getAggregatedVariablesImpactExplanations() == null ^ this.getAggregatedVariablesImpactExplanations() == null)
            return false;
        if (other.getAggregatedVariablesImpactExplanations() != null
                && other.getAggregatedVariablesImpactExplanations().equals(this.getAggregatedVariablesImpactExplanations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariableImpactExplanations() == null) ? 0 : getVariableImpactExplanations().hashCode());
        hashCode = prime * hashCode + ((getAggregatedVariablesImpactExplanations() == null) ? 0 : getAggregatedVariablesImpactExplanations().hashCode());
        return hashCode;
    }

    @Override
    public PredictionExplanations clone() {
        try {
            return (PredictionExplanations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.PredictionExplanationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
