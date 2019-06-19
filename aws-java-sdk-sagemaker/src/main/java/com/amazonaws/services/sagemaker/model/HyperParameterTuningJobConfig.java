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
     * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job
     * it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To randomly search, set it to
     * <code>Random</code>. For information about search strategies, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How Hyperparameter
     * Tuning Works</a>.
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * The <a>HyperParameterTuningJobObjective</a> object that specifies the objective metric for this tuning job.
     * </p>
     */
    private HyperParameterTuningJobObjective hyperParameterTuningJobObjective;
    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training jobs
     * for this tuning job.
     * </p>
     */
    private ResourceLimits resourceLimits;
    /**
     * <p>
     * The <a>ParameterRanges</a> object that specifies the ranges of hyperparameters that this tuning job searches.
     * </p>
     */
    private ParameterRanges parameterRanges;
    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be
     * one of the following values (the default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform
     * better than previously completed training jobs. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop Training
     * Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     */
    private String trainingJobEarlyStoppingType;

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job
     * it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To randomly search, set it to
     * <code>Random</code>. For information about search strategies, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How Hyperparameter
     * Tuning Works</a>.
     * </p>
     * 
     * @param strategy
     *        Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the
     *        training job it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To
     *        randomly search, set it to <code>Random</code>. For information about search strategies, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How
     *        Hyperparameter Tuning Works</a>.
     * @see HyperParameterTuningJobStrategyType
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job
     * it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To randomly search, set it to
     * <code>Random</code>. For information about search strategies, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How Hyperparameter
     * Tuning Works</a>.
     * </p>
     * 
     * @return Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the
     *         training job it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To
     *         randomly search, set it to <code>Random</code>. For information about search strategies, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How
     *         Hyperparameter Tuning Works</a>.
     * @see HyperParameterTuningJobStrategyType
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job
     * it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To randomly search, set it to
     * <code>Random</code>. For information about search strategies, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How Hyperparameter
     * Tuning Works</a>.
     * </p>
     * 
     * @param strategy
     *        Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the
     *        training job it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To
     *        randomly search, set it to <code>Random</code>. For information about search strategies, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How
     *        Hyperparameter Tuning Works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStrategyType
     */

    public HyperParameterTuningJobConfig withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job
     * it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To randomly search, set it to
     * <code>Random</code>. For information about search strategies, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How Hyperparameter
     * Tuning Works</a>.
     * </p>
     * 
     * @param strategy
     *        Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the
     *        training job it launches. To use the Bayesian search stategy, set this to <code>Bayesian</code>. To
     *        randomly search, set it to <code>Random</code>. For information about search strategies, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html">How
     *        Hyperparameter Tuning Works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStrategyType
     */

    public HyperParameterTuningJobConfig withStrategy(HyperParameterTuningJobStrategyType strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobObjective</a> object that specifies the objective metric for this tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobObjective
     *        The <a>HyperParameterTuningJobObjective</a> object that specifies the objective metric for this tuning
     *        job.
     */

    public void setHyperParameterTuningJobObjective(HyperParameterTuningJobObjective hyperParameterTuningJobObjective) {
        this.hyperParameterTuningJobObjective = hyperParameterTuningJobObjective;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobObjective</a> object that specifies the objective metric for this tuning job.
     * </p>
     * 
     * @return The <a>HyperParameterTuningJobObjective</a> object that specifies the objective metric for this tuning
     *         job.
     */

    public HyperParameterTuningJobObjective getHyperParameterTuningJobObjective() {
        return this.hyperParameterTuningJobObjective;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobObjective</a> object that specifies the objective metric for this tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobObjective
     *        The <a>HyperParameterTuningJobObjective</a> object that specifies the objective metric for this tuning
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobConfig withHyperParameterTuningJobObjective(HyperParameterTuningJobObjective hyperParameterTuningJobObjective) {
        setHyperParameterTuningJobObjective(hyperParameterTuningJobObjective);
        return this;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training jobs
     * for this tuning job.
     * </p>
     * 
     * @param resourceLimits
     *        The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training
     *        jobs for this tuning job.
     */

    public void setResourceLimits(ResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training jobs
     * for this tuning job.
     * </p>
     * 
     * @return The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training
     *         jobs for this tuning job.
     */

    public ResourceLimits getResourceLimits() {
        return this.resourceLimits;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training jobs
     * for this tuning job.
     * </p>
     * 
     * @param resourceLimits
     *        The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training
     *        jobs for this tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobConfig withResourceLimits(ResourceLimits resourceLimits) {
        setResourceLimits(resourceLimits);
        return this;
    }

    /**
     * <p>
     * The <a>ParameterRanges</a> object that specifies the ranges of hyperparameters that this tuning job searches.
     * </p>
     * 
     * @param parameterRanges
     *        The <a>ParameterRanges</a> object that specifies the ranges of hyperparameters that this tuning job
     *        searches.
     */

    public void setParameterRanges(ParameterRanges parameterRanges) {
        this.parameterRanges = parameterRanges;
    }

    /**
     * <p>
     * The <a>ParameterRanges</a> object that specifies the ranges of hyperparameters that this tuning job searches.
     * </p>
     * 
     * @return The <a>ParameterRanges</a> object that specifies the ranges of hyperparameters that this tuning job
     *         searches.
     */

    public ParameterRanges getParameterRanges() {
        return this.parameterRanges;
    }

    /**
     * <p>
     * The <a>ParameterRanges</a> object that specifies the ranges of hyperparameters that this tuning job searches.
     * </p>
     * 
     * @param parameterRanges
     *        The <a>ParameterRanges</a> object that specifies the ranges of hyperparameters that this tuning job
     *        searches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobConfig withParameterRanges(ParameterRanges parameterRanges) {
        setParameterRanges(parameterRanges);
        return this;
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be
     * one of the following values (the default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform
     * better than previously completed training jobs. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop Training
     * Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param trainingJobEarlyStoppingType
     *        Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This
     *        can be one of the following values (the default value is <code>OFF</code>):</p>
     *        <dl>
     *        <dt>OFF</dt>
     *        <dd>
     *        <p>
     *        Training jobs launched by the hyperparameter tuning job do not use early stopping.
     *        </p>
     *        </dd>
     *        <dt>AUTO</dt>
     *        <dd>
     *        <p>
     *        Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to
     *        perform better than previously completed training jobs. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop
     *        Training Jobs Early</a>.
     *        </p>
     *        </dd>
     * @see TrainingJobEarlyStoppingType
     */

    public void setTrainingJobEarlyStoppingType(String trainingJobEarlyStoppingType) {
        this.trainingJobEarlyStoppingType = trainingJobEarlyStoppingType;
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be
     * one of the following values (the default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform
     * better than previously completed training jobs. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop Training
     * Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This
     *         can be one of the following values (the default value is <code>OFF</code>):</p>
     *         <dl>
     *         <dt>OFF</dt>
     *         <dd>
     *         <p>
     *         Training jobs launched by the hyperparameter tuning job do not use early stopping.
     *         </p>
     *         </dd>
     *         <dt>AUTO</dt>
     *         <dd>
     *         <p>
     *         Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to
     *         perform better than previously completed training jobs. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop
     *         Training Jobs Early</a>.
     *         </p>
     *         </dd>
     * @see TrainingJobEarlyStoppingType
     */

    public String getTrainingJobEarlyStoppingType() {
        return this.trainingJobEarlyStoppingType;
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be
     * one of the following values (the default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform
     * better than previously completed training jobs. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop Training
     * Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param trainingJobEarlyStoppingType
     *        Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This
     *        can be one of the following values (the default value is <code>OFF</code>):</p>
     *        <dl>
     *        <dt>OFF</dt>
     *        <dd>
     *        <p>
     *        Training jobs launched by the hyperparameter tuning job do not use early stopping.
     *        </p>
     *        </dd>
     *        <dt>AUTO</dt>
     *        <dd>
     *        <p>
     *        Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to
     *        perform better than previously completed training jobs. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop
     *        Training Jobs Early</a>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobEarlyStoppingType
     */

    public HyperParameterTuningJobConfig withTrainingJobEarlyStoppingType(String trainingJobEarlyStoppingType) {
        setTrainingJobEarlyStoppingType(trainingJobEarlyStoppingType);
        return this;
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be
     * one of the following values (the default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform
     * better than previously completed training jobs. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop Training
     * Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param trainingJobEarlyStoppingType
     *        Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This
     *        can be one of the following values (the default value is <code>OFF</code>):</p>
     *        <dl>
     *        <dt>OFF</dt>
     *        <dd>
     *        <p>
     *        Training jobs launched by the hyperparameter tuning job do not use early stopping.
     *        </p>
     *        </dd>
     *        <dt>AUTO</dt>
     *        <dd>
     *        <p>
     *        Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to
     *        perform better than previously completed training jobs. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">Stop
     *        Training Jobs Early</a>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobEarlyStoppingType
     */

    public HyperParameterTuningJobConfig withTrainingJobEarlyStoppingType(TrainingJobEarlyStoppingType trainingJobEarlyStoppingType) {
        this.trainingJobEarlyStoppingType = trainingJobEarlyStoppingType.toString();
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
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy()).append(",");
        if (getHyperParameterTuningJobObjective() != null)
            sb.append("HyperParameterTuningJobObjective: ").append(getHyperParameterTuningJobObjective()).append(",");
        if (getResourceLimits() != null)
            sb.append("ResourceLimits: ").append(getResourceLimits()).append(",");
        if (getParameterRanges() != null)
            sb.append("ParameterRanges: ").append(getParameterRanges()).append(",");
        if (getTrainingJobEarlyStoppingType() != null)
            sb.append("TrainingJobEarlyStoppingType: ").append(getTrainingJobEarlyStoppingType());
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
        if (other.getTrainingJobEarlyStoppingType() == null ^ this.getTrainingJobEarlyStoppingType() == null)
            return false;
        if (other.getTrainingJobEarlyStoppingType() != null && other.getTrainingJobEarlyStoppingType().equals(this.getTrainingJobEarlyStoppingType()) == false)
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
        hashCode = prime * hashCode + ((getTrainingJobEarlyStoppingType() == null) ? 0 : getTrainingJobEarlyStoppingType().hashCode());
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
