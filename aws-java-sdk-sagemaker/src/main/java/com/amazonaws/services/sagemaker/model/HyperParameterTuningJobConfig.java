/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures a hyperparameter tuning job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTuningJobConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the search strategy for hyperparameters. Currently, the only valid value is <code>Bayesian</code>.
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * The object that specifies the objective metric for this tuning job.
     * </p>
     */
    private HyperParameterTuningJobObjective hyperParameterTuningJobObjective;
    /**
     * <p>
     * The object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
     * </p>
     */
    private ResourceLimits resourceLimits;
    /**
     * <p>
     * The object that specifies the ranges of hyperparameters that this tuning job searches.
     * </p>
     */
    private ParameterRanges parameterRanges;

    /**
     * <p>
     * Specifies the search strategy for hyperparameters. Currently, the only valid value is <code>Bayesian</code>.
     * </p>
     * 
     * @param strategy
     *        Specifies the search strategy for hyperparameters. Currently, the only valid value is
     *        <code>Bayesian</code>.
     * @see HyperParameterTuningJobStrategyType
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * Specifies the search strategy for hyperparameters. Currently, the only valid value is <code>Bayesian</code>.
     * </p>
     * 
     * @return Specifies the search strategy for hyperparameters. Currently, the only valid value is
     *         <code>Bayesian</code>.
     * @see HyperParameterTuningJobStrategyType
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * Specifies the search strategy for hyperparameters. Currently, the only valid value is <code>Bayesian</code>.
     * </p>
     * 
     * @param strategy
     *        Specifies the search strategy for hyperparameters. Currently, the only valid value is
     *        <code>Bayesian</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStrategyType
     */

    public HyperParameterTuningJobConfig withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * Specifies the search strategy for hyperparameters. Currently, the only valid value is <code>Bayesian</code>.
     * </p>
     * 
     * @param strategy
     *        Specifies the search strategy for hyperparameters. Currently, the only valid value is
     *        <code>Bayesian</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStrategyType
     */

    public HyperParameterTuningJobConfig withStrategy(HyperParameterTuningJobStrategyType strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The object that specifies the objective metric for this tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobObjective
     *        The object that specifies the objective metric for this tuning job.
     */

    public void setHyperParameterTuningJobObjective(HyperParameterTuningJobObjective hyperParameterTuningJobObjective) {
        this.hyperParameterTuningJobObjective = hyperParameterTuningJobObjective;
    }

    /**
     * <p>
     * The object that specifies the objective metric for this tuning job.
     * </p>
     * 
     * @return The object that specifies the objective metric for this tuning job.
     */

    public HyperParameterTuningJobObjective getHyperParameterTuningJobObjective() {
        return this.hyperParameterTuningJobObjective;
    }

    /**
     * <p>
     * The object that specifies the objective metric for this tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobObjective
     *        The object that specifies the objective metric for this tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobConfig withHyperParameterTuningJobObjective(HyperParameterTuningJobObjective hyperParameterTuningJobObjective) {
        setHyperParameterTuningJobObjective(hyperParameterTuningJobObjective);
        return this;
    }

    /**
     * <p>
     * The object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
     * </p>
     * 
     * @param resourceLimits
     *        The object that specifies the maximum number of training jobs and parallel training jobs for this tuning
     *        job.
     */

    public void setResourceLimits(ResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
    }

    /**
     * <p>
     * The object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
     * </p>
     * 
     * @return The object that specifies the maximum number of training jobs and parallel training jobs for this tuning
     *         job.
     */

    public ResourceLimits getResourceLimits() {
        return this.resourceLimits;
    }

    /**
     * <p>
     * The object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
     * </p>
     * 
     * @param resourceLimits
     *        The object that specifies the maximum number of training jobs and parallel training jobs for this tuning
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobConfig withResourceLimits(ResourceLimits resourceLimits) {
        setResourceLimits(resourceLimits);
        return this;
    }

    /**
     * <p>
     * The object that specifies the ranges of hyperparameters that this tuning job searches.
     * </p>
     * 
     * @param parameterRanges
     *        The object that specifies the ranges of hyperparameters that this tuning job searches.
     */

    public void setParameterRanges(ParameterRanges parameterRanges) {
        this.parameterRanges = parameterRanges;
    }

    /**
     * <p>
     * The object that specifies the ranges of hyperparameters that this tuning job searches.
     * </p>
     * 
     * @return The object that specifies the ranges of hyperparameters that this tuning job searches.
     */

    public ParameterRanges getParameterRanges() {
        return this.parameterRanges;
    }

    /**
     * <p>
     * The object that specifies the ranges of hyperparameters that this tuning job searches.
     * </p>
     * 
     * @param parameterRanges
     *        The object that specifies the ranges of hyperparameters that this tuning job searches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobConfig withParameterRanges(ParameterRanges parameterRanges) {
        setParameterRanges(parameterRanges);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy()).append(",");
        if (getHyperParameterTuningJobObjective() != null)
            sb.append("HyperParameterTuningJobObjective: ").append(getHyperParameterTuningJobObjective()).append(",");
        if (getResourceLimits() != null)
            sb.append("ResourceLimits: ").append(getResourceLimits()).append(",");
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
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getHyperParameterTuningJobObjective() == null ^ this.getHyperParameterTuningJobObjective() == null)
            return false;
        if (other.getHyperParameterTuningJobObjective() != null
                && other.getHyperParameterTuningJobObjective().equals(this.getHyperParameterTuningJobObjective()) == false)
            return false;
        if (other.getResourceLimits() == null ^ this.getResourceLimits() == null)
            return false;
        if (other.getResourceLimits() != null && other.getResourceLimits().equals(this.getResourceLimits()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobObjective() == null) ? 0 : getHyperParameterTuningJobObjective().hashCode());
        hashCode = prime * hashCode + ((getResourceLimits() == null) ? 0 : getResourceLimits().hashCode());
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
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTuningJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
