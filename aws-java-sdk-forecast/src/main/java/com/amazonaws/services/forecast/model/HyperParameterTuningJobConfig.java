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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for a hyperparameter tuning job. This object is specified in the <a>CreatePredictor</a>
 * request.
 * </p>
 * <p>
 * A hyperparameter is a parameter that governs the model training process and is set before training starts. This is as
 * opposed to a model parameter that is determined during training. The values of the hyperparameters have an effect on
 * the chosen model parameters.
 * </p>
 * <p>
 * A hyperparameter tuning job is the process of choosing the optimum set of hyperparameter values that optimize a
 * specified metric. This is accomplished by running many training jobs over a range of hyperparameter values. The
 * optimum set of values is dependent on the algorithm, the training data, and the given metric objective.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/HyperParameterTuningJobConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the ranges of valid values for the hyperparameters.
     * </p>
     */
    private ParameterRanges parameterRanges;

    /**
     * <p>
     * Specifies the ranges of valid values for the hyperparameters.
     * </p>
     * 
     * @param parameterRanges
     *        Specifies the ranges of valid values for the hyperparameters.
     */

    public void setParameterRanges(ParameterRanges parameterRanges) {
        this.parameterRanges = parameterRanges;
    }

    /**
     * <p>
     * Specifies the ranges of valid values for the hyperparameters.
     * </p>
     * 
     * @return Specifies the ranges of valid values for the hyperparameters.
     */

    public ParameterRanges getParameterRanges() {
        return this.parameterRanges;
    }

    /**
     * <p>
     * Specifies the ranges of valid values for the hyperparameters.
     * </p>
     * 
     * @param parameterRanges
     *        Specifies the ranges of valid values for the hyperparameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobConfig withParameterRanges(ParameterRanges parameterRanges) {
        setParameterRanges(parameterRanges);
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
        if (getParameterRanges() != null)
            sb.append("ParameterRanges: ").append(getParameterRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningJobConfig == false)
            return false;
        HyperParameterTuningJobConfig other = (HyperParameterTuningJobConfig) obj;
        if (other.getParameterRanges() == null ^ this.getParameterRanges() == null)
            return false;
        if (other.getParameterRanges() != null && other.getParameterRanges().equals(this.getParameterRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterRanges() == null) ? 0 : getParameterRanges().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTuningJobConfig clone() {
        try {
            return (HyperParameterTuningJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.HyperParameterTuningJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
