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
 * Defines the input needed to run a training job using the algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrainingJobDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingJobDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms
     * support, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3
     * to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     * algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     */
    private String trainingInputMode;
    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;
    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an input source.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;
    /**
     * <p>
     * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the
     * artifacts.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * </p>
     */
    private ResourceConfig resourceConfig;
    /**
     * <p>
     * Sets a duration for training. Use this parameter to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120
     * seconds. Algorithms might use this 120-second window to save the model artifacts.
     * </p>
     */
    private StoppingCondition stoppingCondition;

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms
     * support, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3
     * to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     * algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker
     *        algorithms support, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.</p>
     *        <p>
     *        If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data
     *        from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training
     *        container. If an algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data
     *        directly from S3 to the container.
     * @see TrainingInputMode
     */

    public void setTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
    }

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms
     * support, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3
     * to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     * algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * 
     * @return The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker
     *         algorithms support, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.</p>
     *         <p>
     *         If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data
     *         from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training
     *         container. If an algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data
     *         directly from S3 to the container.
     * @see TrainingInputMode
     */

    public String getTrainingInputMode() {
        return this.trainingInputMode;
    }

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms
     * support, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3
     * to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     * algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker
     *        algorithms support, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.</p>
     *        <p>
     *        If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data
     *        from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training
     *        container. If an algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data
     *        directly from S3 to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public TrainingJobDefinition withTrainingInputMode(String trainingInputMode) {
        setTrainingInputMode(trainingInputMode);
        return this;
    }

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms
     * support, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data from S3
     * to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an
     * algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * 
     * @param trainingInputMode
     *        The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker
     *        algorithms support, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.</p>
     *        <p>
     *        If an algorithm supports the <code>File</code> input mode, Amazon SageMaker downloads the training data
     *        from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training
     *        container. If an algorithm supports the <code>Pipe</code> input mode, Amazon SageMaker streams data
     *        directly from S3 to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public TrainingJobDefinition withTrainingInputMode(TrainingInputMode trainingInputMode) {
        this.trainingInputMode = trainingInputMode.toString();
        return this;
    }

    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     * 
     * @return The hyperparameters used for the training job.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     * 
     * @param hyperParameters
     *        The hyperparameters used for the training job.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     * 
     * @param hyperParameters
     *        The hyperparameters used for the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobDefinition withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    public TrainingJobDefinition addHyperParametersEntry(String key, String value) {
        if (null == this.hyperParameters) {
            this.hyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.hyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.hyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobDefinition clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an input source.
     * </p>
     * 
     * @return An array of <code>Channel</code> objects, each of which specifies an input source.
     */

    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an input source.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects, each of which specifies an input source.
     */

    public void setInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<Channel>(inputDataConfig);
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an input source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects, each of which specifies an input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobDefinition withInputDataConfig(Channel... inputDataConfig) {
        if (this.inputDataConfig == null) {
            setInputDataConfig(new java.util.ArrayList<Channel>(inputDataConfig.length));
        }
        for (Channel ele : inputDataConfig) {
            this.inputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an input source.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects, each of which specifies an input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobDefinition withInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the
     * artifacts.
     * </p>
     * 
     * @param outputDataConfig
     *        the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for
     *        the artifacts.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the
     * artifacts.
     * </p>
     * 
     * @return the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders
     *         for the artifacts.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the
     * artifacts.
     * </p>
     * 
     * @param outputDataConfig
     *        the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for
     *        the artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobDefinition withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * </p>
     * 
     * @param resourceConfig
     *        The resources, including the ML compute instances and ML storage volumes, to use for model training.
     */

    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * </p>
     * 
     * @return The resources, including the ML compute instances and ML storage volumes, to use for model training.
     */

    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * </p>
     * 
     * @param resourceConfig
     *        The resources, including the ML compute instances and ML storage volumes, to use for model training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobDefinition withResourceConfig(ResourceConfig resourceConfig) {
        setResourceConfig(resourceConfig);
        return this;
    }

    /**
     * <p>
     * Sets a duration for training. Use this parameter to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120
     * seconds. Algorithms might use this 120-second window to save the model artifacts.
     * </p>
     * 
     * @param stoppingCondition
     *        Sets a duration for training. Use this parameter to cap model training costs.</p>
     *        <p>
     *        To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for
     *        120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     */

    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Sets a duration for training. Use this parameter to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120
     * seconds. Algorithms might use this 120-second window to save the model artifacts.
     * </p>
     * 
     * @return Sets a duration for training. Use this parameter to cap model training costs.</p>
     *         <p>
     *         To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for
     *         120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     */

    public StoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * Sets a duration for training. Use this parameter to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120
     * seconds. Algorithms might use this 120-second window to save the model artifacts.
     * </p>
     * 
     * @param stoppingCondition
     *        Sets a duration for training. Use this parameter to cap model training costs.</p>
     *        <p>
     *        To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for
     *        120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobDefinition withStoppingCondition(StoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
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
        if (getTrainingInputMode() != null)
            sb.append("TrainingInputMode: ").append(getTrainingInputMode()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: ").append(getResourceConfig()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingJobDefinition == false)
            return false;
        TrainingJobDefinition other = (TrainingJobDefinition) obj;
        if (other.getTrainingInputMode() == null ^ this.getTrainingInputMode() == null)
            return false;
        if (other.getTrainingInputMode() != null && other.getTrainingInputMode().equals(this.getTrainingInputMode()) == false)
            return false;
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null && other.getHyperParameters().equals(this.getHyperParameters()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingInputMode() == null) ? 0 : getTrainingInputMode().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        return hashCode;
    }

    @Override
    public TrainingJobDefinition clone() {
        try {
            return (TrainingJobDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrainingJobDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
