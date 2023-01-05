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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for <code>Hyperband</code>, a multi-fidelity based hyperparameter tuning strategy.
 * <code>Hyperband</code> uses the final and intermediate results of a training job to dynamically allocate resources to
 * utilized hyperparameter configurations while automatically stopping under-performing configurations. This parameter
 * should be provided only if <code>Hyperband</code> is selected as the <code>StrategyConfig</code> under the
 * <code>HyperParameterTuningJobConfig</code> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperbandStrategyConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperbandStrategyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter
     * tuning job. If the value for <code>MinResource</code> has not been reached, the training job will not be stopped
     * by <code>Hyperband</code>.
     * </p>
     */
    private Integer minResource;
    /**
     * <p>
     * The maximum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter
     * tuning job. Once a job reaches the <code>MaxResource</code> value, it is stopped. If a value for
     * <code>MaxResource</code> is not provided, and <code>Hyperband</code> is selected as the hyperparameter tuning
     * strategy, <code>HyperbandTrainingJ</code> attempts to infer <code>MaxResource</code> from the following keys (if
     * present) in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTrainingJobDefinition.html#sagemaker-Type-HyperParameterTrainingJobDefinition-StaticHyperParameters"
     * >StaticsHyperParameters</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>numepochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n_epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>num_epochs</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>HyperbandStrategyConfig</code> is unable to infer a value for <code>MaxResource</code>, it generates a
     * validation error. The maximum value is 20,000 epochs. All metrics that correspond to an objective metric are used
     * to derive <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">early stopping
     * decisions</a>. For <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/distributed-training.html">distributive</a> training jobs,
     * ensure that duplicate metrics are not printed in the logs across the individual nodes in a training job. If
     * multiple nodes are publishing duplicate or incorrect metrics, training jobs may make an incorrect stopping
     * decision and stop the job prematurely.
     * </p>
     */
    private Integer maxResource;

    /**
     * <p>
     * The minimum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter
     * tuning job. If the value for <code>MinResource</code> has not been reached, the training job will not be stopped
     * by <code>Hyperband</code>.
     * </p>
     * 
     * @param minResource
     *        The minimum number of resources (such as epochs) that can be used by a training job launched by a
     *        hyperparameter tuning job. If the value for <code>MinResource</code> has not been reached, the training
     *        job will not be stopped by <code>Hyperband</code>.
     */

    public void setMinResource(Integer minResource) {
        this.minResource = minResource;
    }

    /**
     * <p>
     * The minimum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter
     * tuning job. If the value for <code>MinResource</code> has not been reached, the training job will not be stopped
     * by <code>Hyperband</code>.
     * </p>
     * 
     * @return The minimum number of resources (such as epochs) that can be used by a training job launched by a
     *         hyperparameter tuning job. If the value for <code>MinResource</code> has not been reached, the training
     *         job will not be stopped by <code>Hyperband</code>.
     */

    public Integer getMinResource() {
        return this.minResource;
    }

    /**
     * <p>
     * The minimum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter
     * tuning job. If the value for <code>MinResource</code> has not been reached, the training job will not be stopped
     * by <code>Hyperband</code>.
     * </p>
     * 
     * @param minResource
     *        The minimum number of resources (such as epochs) that can be used by a training job launched by a
     *        hyperparameter tuning job. If the value for <code>MinResource</code> has not been reached, the training
     *        job will not be stopped by <code>Hyperband</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperbandStrategyConfig withMinResource(Integer minResource) {
        setMinResource(minResource);
        return this;
    }

    /**
     * <p>
     * The maximum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter
     * tuning job. Once a job reaches the <code>MaxResource</code> value, it is stopped. If a value for
     * <code>MaxResource</code> is not provided, and <code>Hyperband</code> is selected as the hyperparameter tuning
     * strategy, <code>HyperbandTrainingJ</code> attempts to infer <code>MaxResource</code> from the following keys (if
     * present) in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTrainingJobDefinition.html#sagemaker-Type-HyperParameterTrainingJobDefinition-StaticHyperParameters"
     * >StaticsHyperParameters</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>numepochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n_epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>num_epochs</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>HyperbandStrategyConfig</code> is unable to infer a value for <code>MaxResource</code>, it generates a
     * validation error. The maximum value is 20,000 epochs. All metrics that correspond to an objective metric are used
     * to derive <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">early stopping
     * decisions</a>. For <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/distributed-training.html">distributive</a> training jobs,
     * ensure that duplicate metrics are not printed in the logs across the individual nodes in a training job. If
     * multiple nodes are publishing duplicate or incorrect metrics, training jobs may make an incorrect stopping
     * decision and stop the job prematurely.
     * </p>
     * 
     * @param maxResource
     *        The maximum number of resources (such as epochs) that can be used by a training job launched by a
     *        hyperparameter tuning job. Once a job reaches the <code>MaxResource</code> value, it is stopped. If a
     *        value for <code>MaxResource</code> is not provided, and <code>Hyperband</code> is selected as the
     *        hyperparameter tuning strategy, <code>HyperbandTrainingJ</code> attempts to infer <code>MaxResource</code>
     *        from the following keys (if present) in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTrainingJobDefinition.html#sagemaker-Type-HyperParameterTrainingJobDefinition-StaticHyperParameters"
     *        >StaticsHyperParameters</a>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>epochs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>numepochs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>n-epochs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>n_epochs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>num_epochs</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>HyperbandStrategyConfig</code> is unable to infer a value for <code>MaxResource</code>, it
     *        generates a validation error. The maximum value is 20,000 epochs. All metrics that correspond to an
     *        objective metric are used to derive <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">early
     *        stopping decisions</a>. For <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/distributed-training.html">distributive</a> training
     *        jobs, ensure that duplicate metrics are not printed in the logs across the individual nodes in a training
     *        job. If multiple nodes are publishing duplicate or incorrect metrics, training jobs may make an incorrect
     *        stopping decision and stop the job prematurely.
     */

    public void setMaxResource(Integer maxResource) {
        this.maxResource = maxResource;
    }

    /**
     * <p>
     * The maximum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter
     * tuning job. Once a job reaches the <code>MaxResource</code> value, it is stopped. If a value for
     * <code>MaxResource</code> is not provided, and <code>Hyperband</code> is selected as the hyperparameter tuning
     * strategy, <code>HyperbandTrainingJ</code> attempts to infer <code>MaxResource</code> from the following keys (if
     * present) in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTrainingJobDefinition.html#sagemaker-Type-HyperParameterTrainingJobDefinition-StaticHyperParameters"
     * >StaticsHyperParameters</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>numepochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n_epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>num_epochs</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>HyperbandStrategyConfig</code> is unable to infer a value for <code>MaxResource</code>, it generates a
     * validation error. The maximum value is 20,000 epochs. All metrics that correspond to an objective metric are used
     * to derive <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">early stopping
     * decisions</a>. For <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/distributed-training.html">distributive</a> training jobs,
     * ensure that duplicate metrics are not printed in the logs across the individual nodes in a training job. If
     * multiple nodes are publishing duplicate or incorrect metrics, training jobs may make an incorrect stopping
     * decision and stop the job prematurely.
     * </p>
     * 
     * @return The maximum number of resources (such as epochs) that can be used by a training job launched by a
     *         hyperparameter tuning job. Once a job reaches the <code>MaxResource</code> value, it is stopped. If a
     *         value for <code>MaxResource</code> is not provided, and <code>Hyperband</code> is selected as the
     *         hyperparameter tuning strategy, <code>HyperbandTrainingJ</code> attempts to infer
     *         <code>MaxResource</code> from the following keys (if present) in <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTrainingJobDefinition.html#sagemaker-Type-HyperParameterTrainingJobDefinition-StaticHyperParameters"
     *         >StaticsHyperParameters</a>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>epochs</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>numepochs</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>n-epochs</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>n_epochs</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>num_epochs</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>HyperbandStrategyConfig</code> is unable to infer a value for <code>MaxResource</code>, it
     *         generates a validation error. The maximum value is 20,000 epochs. All metrics that correspond to an
     *         objective metric are used to derive <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">early
     *         stopping decisions</a>. For <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/distributed-training.html">distributive</a>
     *         training jobs, ensure that duplicate metrics are not printed in the logs across the individual nodes in a
     *         training job. If multiple nodes are publishing duplicate or incorrect metrics, training jobs may make an
     *         incorrect stopping decision and stop the job prematurely.
     */

    public Integer getMaxResource() {
        return this.maxResource;
    }

    /**
     * <p>
     * The maximum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter
     * tuning job. Once a job reaches the <code>MaxResource</code> value, it is stopped. If a value for
     * <code>MaxResource</code> is not provided, and <code>Hyperband</code> is selected as the hyperparameter tuning
     * strategy, <code>HyperbandTrainingJ</code> attempts to infer <code>MaxResource</code> from the following keys (if
     * present) in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTrainingJobDefinition.html#sagemaker-Type-HyperParameterTrainingJobDefinition-StaticHyperParameters"
     * >StaticsHyperParameters</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>numepochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n-epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>n_epochs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>num_epochs</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>HyperbandStrategyConfig</code> is unable to infer a value for <code>MaxResource</code>, it generates a
     * validation error. The maximum value is 20,000 epochs. All metrics that correspond to an objective metric are used
     * to derive <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">early stopping
     * decisions</a>. For <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/distributed-training.html">distributive</a> training jobs,
     * ensure that duplicate metrics are not printed in the logs across the individual nodes in a training job. If
     * multiple nodes are publishing duplicate or incorrect metrics, training jobs may make an incorrect stopping
     * decision and stop the job prematurely.
     * </p>
     * 
     * @param maxResource
     *        The maximum number of resources (such as epochs) that can be used by a training job launched by a
     *        hyperparameter tuning job. Once a job reaches the <code>MaxResource</code> value, it is stopped. If a
     *        value for <code>MaxResource</code> is not provided, and <code>Hyperband</code> is selected as the
     *        hyperparameter tuning strategy, <code>HyperbandTrainingJ</code> attempts to infer <code>MaxResource</code>
     *        from the following keys (if present) in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_HyperParameterTrainingJobDefinition.html#sagemaker-Type-HyperParameterTrainingJobDefinition-StaticHyperParameters"
     *        >StaticsHyperParameters</a>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>epochs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>numepochs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>n-epochs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>n_epochs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>num_epochs</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>HyperbandStrategyConfig</code> is unable to infer a value for <code>MaxResource</code>, it
     *        generates a validation error. The maximum value is 20,000 epochs. All metrics that correspond to an
     *        objective metric are used to derive <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html">early
     *        stopping decisions</a>. For <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/distributed-training.html">distributive</a> training
     *        jobs, ensure that duplicate metrics are not printed in the logs across the individual nodes in a training
     *        job. If multiple nodes are publishing duplicate or incorrect metrics, training jobs may make an incorrect
     *        stopping decision and stop the job prematurely.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperbandStrategyConfig withMaxResource(Integer maxResource) {
        setMaxResource(maxResource);
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
        if (getMinResource() != null)
            sb.append("MinResource: ").append(getMinResource()).append(",");
        if (getMaxResource() != null)
            sb.append("MaxResource: ").append(getMaxResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperbandStrategyConfig == false)
            return false;
        HyperbandStrategyConfig other = (HyperbandStrategyConfig) obj;
        if (other.getMinResource() == null ^ this.getMinResource() == null)
            return false;
        if (other.getMinResource() != null && other.getMinResource().equals(this.getMinResource()) == false)
            return false;
        if (other.getMaxResource() == null ^ this.getMaxResource() == null)
            return false;
        if (other.getMaxResource() != null && other.getMaxResource().equals(this.getMaxResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinResource() == null) ? 0 : getMinResource().hashCode());
        hashCode = prime * hashCode + ((getMaxResource() == null) ? 0 : getMaxResource().hashCode());
        return hashCode;
    }

    @Override
    public HyperbandStrategyConfig clone() {
        try {
            return (HyperbandStrategyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperbandStrategyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
