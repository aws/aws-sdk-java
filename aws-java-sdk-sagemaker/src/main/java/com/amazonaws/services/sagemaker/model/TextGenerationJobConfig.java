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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of settings used by an AutoML job V2 for the text generation problem type.
 * </p>
 * <note>
 * <p>
 * The text generation models that support fine-tuning in Autopilot are currently accessible exclusively in regions
 * supported by Canvas. Refer to the documentation of Canvas for the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/canvas.html">full list of its supported Regions</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TextGenerationJobConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextGenerationJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How long a fine-tuning job is allowed to run. For <code>TextGenerationJobConfig</code> problem types, the
     * <code>MaxRuntimePerTrainingJobInSeconds</code> attribute of <code>AutoMLJobCompletionCriteria</code> defaults to
     * 72h (259200s).
     * </p>
     */
    private AutoMLJobCompletionCriteria completionCriteria;
    /**
     * <p>
     * The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language models. For
     * information on the list of supported models, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-models.html#autopilot-llms-finetuning-supported-llms"
     * >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is provided,
     * the default model used is <b>Falcon7BInstruct</b>.
     * </p>
     */
    private String baseModelName;
    /**
     * <p>
     * The hyperparameters used to configure and optimize the learning process of the base model. You can set any
     * combination of the following hyperparameters for all base models. For more information on each supported
     * hyperparameter, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-set-hyperparameters.html"
     * >Optimize the learning process of your text generation models with hyperparameters</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"epochCount"</code>: The number of times the model goes through the entire training dataset. Its value
     * should be a string containing an integer value within the range of "1" to "10".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"batchSize"</code>: The number of data samples used in each iteration of training. Its value should be a
     * string containing an integer value within the range of "1" to "64".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"learningRate"</code>: The step size at which a model's parameters are updated during training. Its value
     * should be a string containing a floating-point value within the range of "0" to "1".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"learningRateWarmupSteps"</code>: The number of training steps during which the learning rate gradually
     * increases before reaching its target or maximum value. Its value should be a string containing an integer value
     * within the range of "0" to "250".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Here is an example where all four hyperparameters are configured.
     * </p>
     * <p>
     * <code>{ "epochCount":"5", "learningRate":"0.5", "batchSize": "32", "learningRateWarmupSteps": "10" }</code>
     * </p>
     */
    private java.util.Map<String, String> textGenerationHyperParameters;

    private ModelAccessConfig modelAccessConfig;

    /**
     * <p>
     * How long a fine-tuning job is allowed to run. For <code>TextGenerationJobConfig</code> problem types, the
     * <code>MaxRuntimePerTrainingJobInSeconds</code> attribute of <code>AutoMLJobCompletionCriteria</code> defaults to
     * 72h (259200s).
     * </p>
     * 
     * @param completionCriteria
     *        How long a fine-tuning job is allowed to run. For <code>TextGenerationJobConfig</code> problem types, the
     *        <code>MaxRuntimePerTrainingJobInSeconds</code> attribute of <code>AutoMLJobCompletionCriteria</code>
     *        defaults to 72h (259200s).
     */

    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * <p>
     * How long a fine-tuning job is allowed to run. For <code>TextGenerationJobConfig</code> problem types, the
     * <code>MaxRuntimePerTrainingJobInSeconds</code> attribute of <code>AutoMLJobCompletionCriteria</code> defaults to
     * 72h (259200s).
     * </p>
     * 
     * @return How long a fine-tuning job is allowed to run. For <code>TextGenerationJobConfig</code> problem types, the
     *         <code>MaxRuntimePerTrainingJobInSeconds</code> attribute of <code>AutoMLJobCompletionCriteria</code>
     *         defaults to 72h (259200s).
     */

    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return this.completionCriteria;
    }

    /**
     * <p>
     * How long a fine-tuning job is allowed to run. For <code>TextGenerationJobConfig</code> problem types, the
     * <code>MaxRuntimePerTrainingJobInSeconds</code> attribute of <code>AutoMLJobCompletionCriteria</code> defaults to
     * 72h (259200s).
     * </p>
     * 
     * @param completionCriteria
     *        How long a fine-tuning job is allowed to run. For <code>TextGenerationJobConfig</code> problem types, the
     *        <code>MaxRuntimePerTrainingJobInSeconds</code> attribute of <code>AutoMLJobCompletionCriteria</code>
     *        defaults to 72h (259200s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextGenerationJobConfig withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        setCompletionCriteria(completionCriteria);
        return this;
    }

    /**
     * <p>
     * The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language models. For
     * information on the list of supported models, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-models.html#autopilot-llms-finetuning-supported-llms"
     * >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is provided,
     * the default model used is <b>Falcon7BInstruct</b>.
     * </p>
     * 
     * @param baseModelName
     *        The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language
     *        models. For information on the list of supported models, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-models.html#autopilot-llms-finetuning-supported-llms"
     *        >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is
     *        provided, the default model used is <b>Falcon7BInstruct</b>.
     */

    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language models. For
     * information on the list of supported models, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-models.html#autopilot-llms-finetuning-supported-llms"
     * >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is provided,
     * the default model used is <b>Falcon7BInstruct</b>.
     * </p>
     * 
     * @return The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language
     *         models. For information on the list of supported models, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-models.html#autopilot-llms-finetuning-supported-llms"
     *         >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is
     *         provided, the default model used is <b>Falcon7BInstruct</b>.
     */

    public String getBaseModelName() {
        return this.baseModelName;
    }

    /**
     * <p>
     * The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language models. For
     * information on the list of supported models, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-models.html#autopilot-llms-finetuning-supported-llms"
     * >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is provided,
     * the default model used is <b>Falcon7BInstruct</b>.
     * </p>
     * 
     * @param baseModelName
     *        The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language
     *        models. For information on the list of supported models, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-models.html#autopilot-llms-finetuning-supported-llms"
     *        >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is
     *        provided, the default model used is <b>Falcon7BInstruct</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextGenerationJobConfig withBaseModelName(String baseModelName) {
        setBaseModelName(baseModelName);
        return this;
    }

    /**
     * <p>
     * The hyperparameters used to configure and optimize the learning process of the base model. You can set any
     * combination of the following hyperparameters for all base models. For more information on each supported
     * hyperparameter, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-set-hyperparameters.html"
     * >Optimize the learning process of your text generation models with hyperparameters</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"epochCount"</code>: The number of times the model goes through the entire training dataset. Its value
     * should be a string containing an integer value within the range of "1" to "10".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"batchSize"</code>: The number of data samples used in each iteration of training. Its value should be a
     * string containing an integer value within the range of "1" to "64".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"learningRate"</code>: The step size at which a model's parameters are updated during training. Its value
     * should be a string containing a floating-point value within the range of "0" to "1".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"learningRateWarmupSteps"</code>: The number of training steps during which the learning rate gradually
     * increases before reaching its target or maximum value. Its value should be a string containing an integer value
     * within the range of "0" to "250".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Here is an example where all four hyperparameters are configured.
     * </p>
     * <p>
     * <code>{ "epochCount":"5", "learningRate":"0.5", "batchSize": "32", "learningRateWarmupSteps": "10" }</code>
     * </p>
     * 
     * @return The hyperparameters used to configure and optimize the learning process of the base model. You can set
     *         any combination of the following hyperparameters for all base models. For more information on each
     *         supported hyperparameter, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-set-hyperparameters.html"
     *         >Optimize the learning process of your text generation models with hyperparameters</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"epochCount"</code>: The number of times the model goes through the entire training dataset. Its
     *         value should be a string containing an integer value within the range of "1" to "10".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"batchSize"</code>: The number of data samples used in each iteration of training. Its value should
     *         be a string containing an integer value within the range of "1" to "64".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"learningRate"</code>: The step size at which a model's parameters are updated during training. Its
     *         value should be a string containing a floating-point value within the range of "0" to "1".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"learningRateWarmupSteps"</code>: The number of training steps during which the learning rate
     *         gradually increases before reaching its target or maximum value. Its value should be a string containing
     *         an integer value within the range of "0" to "250".
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Here is an example where all four hyperparameters are configured.
     *         </p>
     *         <p>
     *         <code>{ "epochCount":"5", "learningRate":"0.5", "batchSize": "32", "learningRateWarmupSteps": "10" }</code>
     */

    public java.util.Map<String, String> getTextGenerationHyperParameters() {
        return textGenerationHyperParameters;
    }

    /**
     * <p>
     * The hyperparameters used to configure and optimize the learning process of the base model. You can set any
     * combination of the following hyperparameters for all base models. For more information on each supported
     * hyperparameter, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-set-hyperparameters.html"
     * >Optimize the learning process of your text generation models with hyperparameters</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"epochCount"</code>: The number of times the model goes through the entire training dataset. Its value
     * should be a string containing an integer value within the range of "1" to "10".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"batchSize"</code>: The number of data samples used in each iteration of training. Its value should be a
     * string containing an integer value within the range of "1" to "64".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"learningRate"</code>: The step size at which a model's parameters are updated during training. Its value
     * should be a string containing a floating-point value within the range of "0" to "1".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"learningRateWarmupSteps"</code>: The number of training steps during which the learning rate gradually
     * increases before reaching its target or maximum value. Its value should be a string containing an integer value
     * within the range of "0" to "250".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Here is an example where all four hyperparameters are configured.
     * </p>
     * <p>
     * <code>{ "epochCount":"5", "learningRate":"0.5", "batchSize": "32", "learningRateWarmupSteps": "10" }</code>
     * </p>
     * 
     * @param textGenerationHyperParameters
     *        The hyperparameters used to configure and optimize the learning process of the base model. You can set any
     *        combination of the following hyperparameters for all base models. For more information on each supported
     *        hyperparameter, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-set-hyperparameters.html"
     *        >Optimize the learning process of your text generation models with hyperparameters</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"epochCount"</code>: The number of times the model goes through the entire training dataset. Its
     *        value should be a string containing an integer value within the range of "1" to "10".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"batchSize"</code>: The number of data samples used in each iteration of training. Its value should
     *        be a string containing an integer value within the range of "1" to "64".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"learningRate"</code>: The step size at which a model's parameters are updated during training. Its
     *        value should be a string containing a floating-point value within the range of "0" to "1".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"learningRateWarmupSteps"</code>: The number of training steps during which the learning rate
     *        gradually increases before reaching its target or maximum value. Its value should be a string containing
     *        an integer value within the range of "0" to "250".
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Here is an example where all four hyperparameters are configured.
     *        </p>
     *        <p>
     *        <code>{ "epochCount":"5", "learningRate":"0.5", "batchSize": "32", "learningRateWarmupSteps": "10" }</code>
     */

    public void setTextGenerationHyperParameters(java.util.Map<String, String> textGenerationHyperParameters) {
        this.textGenerationHyperParameters = textGenerationHyperParameters;
    }

    /**
     * <p>
     * The hyperparameters used to configure and optimize the learning process of the base model. You can set any
     * combination of the following hyperparameters for all base models. For more information on each supported
     * hyperparameter, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-set-hyperparameters.html"
     * >Optimize the learning process of your text generation models with hyperparameters</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"epochCount"</code>: The number of times the model goes through the entire training dataset. Its value
     * should be a string containing an integer value within the range of "1" to "10".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"batchSize"</code>: The number of data samples used in each iteration of training. Its value should be a
     * string containing an integer value within the range of "1" to "64".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"learningRate"</code>: The step size at which a model's parameters are updated during training. Its value
     * should be a string containing a floating-point value within the range of "0" to "1".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"learningRateWarmupSteps"</code>: The number of training steps during which the learning rate gradually
     * increases before reaching its target or maximum value. Its value should be a string containing an integer value
     * within the range of "0" to "250".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Here is an example where all four hyperparameters are configured.
     * </p>
     * <p>
     * <code>{ "epochCount":"5", "learningRate":"0.5", "batchSize": "32", "learningRateWarmupSteps": "10" }</code>
     * </p>
     * 
     * @param textGenerationHyperParameters
     *        The hyperparameters used to configure and optimize the learning process of the base model. You can set any
     *        combination of the following hyperparameters for all base models. For more information on each supported
     *        hyperparameter, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-set-hyperparameters.html"
     *        >Optimize the learning process of your text generation models with hyperparameters</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"epochCount"</code>: The number of times the model goes through the entire training dataset. Its
     *        value should be a string containing an integer value within the range of "1" to "10".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"batchSize"</code>: The number of data samples used in each iteration of training. Its value should
     *        be a string containing an integer value within the range of "1" to "64".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"learningRate"</code>: The step size at which a model's parameters are updated during training. Its
     *        value should be a string containing a floating-point value within the range of "0" to "1".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"learningRateWarmupSteps"</code>: The number of training steps during which the learning rate
     *        gradually increases before reaching its target or maximum value. Its value should be a string containing
     *        an integer value within the range of "0" to "250".
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Here is an example where all four hyperparameters are configured.
     *        </p>
     *        <p>
     *        <code>{ "epochCount":"5", "learningRate":"0.5", "batchSize": "32", "learningRateWarmupSteps": "10" }</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextGenerationJobConfig withTextGenerationHyperParameters(java.util.Map<String, String> textGenerationHyperParameters) {
        setTextGenerationHyperParameters(textGenerationHyperParameters);
        return this;
    }

    /**
     * Add a single TextGenerationHyperParameters entry
     *
     * @see TextGenerationJobConfig#withTextGenerationHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TextGenerationJobConfig addTextGenerationHyperParametersEntry(String key, String value) {
        if (null == this.textGenerationHyperParameters) {
            this.textGenerationHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.textGenerationHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.textGenerationHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TextGenerationHyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextGenerationJobConfig clearTextGenerationHyperParametersEntries() {
        this.textGenerationHyperParameters = null;
        return this;
    }

    /**
     * @param modelAccessConfig
     */

    public void setModelAccessConfig(ModelAccessConfig modelAccessConfig) {
        this.modelAccessConfig = modelAccessConfig;
    }

    /**
     * @return
     */

    public ModelAccessConfig getModelAccessConfig() {
        return this.modelAccessConfig;
    }

    /**
     * @param modelAccessConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextGenerationJobConfig withModelAccessConfig(ModelAccessConfig modelAccessConfig) {
        setModelAccessConfig(modelAccessConfig);
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
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: ").append(getCompletionCriteria()).append(",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: ").append(getBaseModelName()).append(",");
        if (getTextGenerationHyperParameters() != null)
            sb.append("TextGenerationHyperParameters: ").append(getTextGenerationHyperParameters()).append(",");
        if (getModelAccessConfig() != null)
            sb.append("ModelAccessConfig: ").append(getModelAccessConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextGenerationJobConfig == false)
            return false;
        TextGenerationJobConfig other = (TextGenerationJobConfig) obj;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getBaseModelName() == null ^ this.getBaseModelName() == null)
            return false;
        if (other.getBaseModelName() != null && other.getBaseModelName().equals(this.getBaseModelName()) == false)
            return false;
        if (other.getTextGenerationHyperParameters() == null ^ this.getTextGenerationHyperParameters() == null)
            return false;
        if (other.getTextGenerationHyperParameters() != null
                && other.getTextGenerationHyperParameters().equals(this.getTextGenerationHyperParameters()) == false)
            return false;
        if (other.getModelAccessConfig() == null ^ this.getModelAccessConfig() == null)
            return false;
        if (other.getModelAccessConfig() != null && other.getModelAccessConfig().equals(this.getModelAccessConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        hashCode = prime * hashCode + ((getTextGenerationHyperParameters() == null) ? 0 : getTextGenerationHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getModelAccessConfig() == null) ? 0 : getModelAccessConfig().hashCode());
        return hashCode;
    }

    @Override
    public TextGenerationJobConfig clone() {
        try {
            return (TextGenerationJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TextGenerationJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
