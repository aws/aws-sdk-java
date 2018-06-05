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
 * Defines the training jobs launched by a hyperparameter tuning job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTrainingJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTrainingJobDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning job.
     * </p>
     */
    private java.util.Map<String, String> staticHyperParameters;
    /**
     * <p>
     * The object that specifies the algorithm to use for the training jobs that the tuning job launches.
     * </p>
     */
    private HyperParameterAlgorithmSpecification algorithmSpecification;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An array of objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;
    /**
     * <p>
     * The object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to
     * connect to. Control access to and from your training container by configuring the VPC. For more information, see
     * <a>train-vpc</a>.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning
     * job launches.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning
     * job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes
     * for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed training
     * algorithms, specify an instance count greater than 1.
     * </p>
     */
    private ResourceConfig resourceConfig;
    /**
     * <p>
     * Sets a maximum duration for the training jobs that the tuning job launches. Use this parameter to limit model
     * training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal. This delays job termination
     * for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     * </p>
     * <p>
     * When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided
     * by Amazon SageMaker save the intermediate results of the job.
     * </p>
     */
    private StoppingCondition stoppingCondition;

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning job.
     * </p>
     * 
     * @return Specifies the values of hyperparameters that do not change for the tuning job.
     */

    public java.util.Map<String, String> getStaticHyperParameters() {
        return staticHyperParameters;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning job.
     * </p>
     * 
     * @param staticHyperParameters
     *        Specifies the values of hyperparameters that do not change for the tuning job.
     */

    public void setStaticHyperParameters(java.util.Map<String, String> staticHyperParameters) {
        this.staticHyperParameters = staticHyperParameters;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning job.
     * </p>
     * 
     * @param staticHyperParameters
     *        Specifies the values of hyperparameters that do not change for the tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withStaticHyperParameters(java.util.Map<String, String> staticHyperParameters) {
        setStaticHyperParameters(staticHyperParameters);
        return this;
    }

    public HyperParameterTrainingJobDefinition addStaticHyperParametersEntry(String key, String value) {
        if (null == this.staticHyperParameters) {
            this.staticHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.staticHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.staticHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StaticHyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition clearStaticHyperParametersEntries() {
        this.staticHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * The object that specifies the algorithm to use for the training jobs that the tuning job launches.
     * </p>
     * 
     * @param algorithmSpecification
     *        The object that specifies the algorithm to use for the training jobs that the tuning job launches.
     */

    public void setAlgorithmSpecification(HyperParameterAlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * The object that specifies the algorithm to use for the training jobs that the tuning job launches.
     * </p>
     * 
     * @return The object that specifies the algorithm to use for the training jobs that the tuning job launches.
     */

    public HyperParameterAlgorithmSpecification getAlgorithmSpecification() {
        return this.algorithmSpecification;
    }

    /**
     * <p>
     * The object that specifies the algorithm to use for the training jobs that the tuning job launches.
     * </p>
     * 
     * @param algorithmSpecification
     *        The object that specifies the algorithm to use for the training jobs that the tuning job launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withAlgorithmSpecification(HyperParameterAlgorithmSpecification algorithmSpecification) {
        setAlgorithmSpecification(algorithmSpecification);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job
     *        launches.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job
     *         launches.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job
     *        launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An array of objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     * 
     * @return An array of objects that specify the input for the training jobs that the tuning job launches.
     */

    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of objects that specify the input for the training jobs that the tuning job launches.
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
     * An array of objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of objects that specify the input for the training jobs that the tuning job launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withInputDataConfig(Channel... inputDataConfig) {
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
     * An array of objects that specify the input for the training jobs that the tuning job launches.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of objects that specify the input for the training jobs that the tuning job launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to
     * connect to. Control access to and from your training container by configuring the VPC. For more information, see
     * <a>train-vpc</a>.
     * </p>
     * 
     * @param vpcConfig
     *        The object that specifies the VPC that you want the training jobs that this hyperparameter tuning job
     *        launches to connect to. Control access to and from your training container by configuring the VPC. For
     *        more information, see <a>train-vpc</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to
     * connect to. Control access to and from your training container by configuring the VPC. For more information, see
     * <a>train-vpc</a>.
     * </p>
     * 
     * @return The object that specifies the VPC that you want the training jobs that this hyperparameter tuning job
     *         launches to connect to. Control access to and from your training container by configuring the VPC. For
     *         more information, see <a>train-vpc</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to
     * connect to. Control access to and from your training container by configuring the VPC. For more information, see
     * <a>train-vpc</a>.
     * </p>
     * 
     * @param vpcConfig
     *        The object that specifies the VPC that you want the training jobs that this hyperparameter tuning job
     *        launches to connect to. Control access to and from your training container by configuring the VPC. For
     *        more information, see <a>train-vpc</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning
     * job launches.
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the
     *        tuning job launches.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning
     * job launches.
     * </p>
     * 
     * @return Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that
     *         the tuning job launches.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning
     * job launches.
     * </p>
     * 
     * @param outputDataConfig
     *        Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the
     *        tuning job launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning
     * job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes
     * for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed training
     * algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @param resourceConfig
     *        The resources, including the compute instances and storage volumes, to use for the training jobs that the
     *        tuning job launches.</p>
     *        <p>
     *        Storage volumes store model artifacts and incremental states. Training algorithms might also use storage
     *        volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training
     *        data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For
     *        distributed training algorithms, specify an instance count greater than 1.
     */

    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning
     * job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes
     * for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed training
     * algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @return The resources, including the compute instances and storage volumes, to use for the training jobs that the
     *         tuning job launches.</p>
     *         <p>
     *         Storage volumes store model artifacts and incremental states. Training algorithms might also use storage
     *         volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training
     *         data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For
     *         distributed training algorithms, specify an instance count greater than 1.
     */

    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning
     * job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes
     * for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For distributed training
     * algorithms, specify an instance count greater than 1.
     * </p>
     * 
     * @param resourceConfig
     *        The resources, including the compute instances and storage volumes, to use for the training jobs that the
     *        tuning job launches.</p>
     *        <p>
     *        Storage volumes store model artifacts and incremental states. Training algorithms might also use storage
     *        volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training
     *        data, choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification. For
     *        distributed training algorithms, specify an instance count greater than 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withResourceConfig(ResourceConfig resourceConfig) {
        setResourceConfig(resourceConfig);
        return this;
    }

    /**
     * <p>
     * Sets a maximum duration for the training jobs that the tuning job launches. Use this parameter to limit model
     * training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal. This delays job termination
     * for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     * </p>
     * <p>
     * When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided
     * by Amazon SageMaker save the intermediate results of the job.
     * </p>
     * 
     * @param stoppingCondition
     *        Sets a maximum duration for the training jobs that the tuning job launches. Use this parameter to limit
     *        model training costs. </p>
     *        <p>
     *        To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal. This delays job
     *        termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     *        </p>
     *        <p>
     *        When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms
     *        provided by Amazon SageMaker save the intermediate results of the job.
     */

    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Sets a maximum duration for the training jobs that the tuning job launches. Use this parameter to limit model
     * training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal. This delays job termination
     * for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     * </p>
     * <p>
     * When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided
     * by Amazon SageMaker save the intermediate results of the job.
     * </p>
     * 
     * @return Sets a maximum duration for the training jobs that the tuning job launches. Use this parameter to limit
     *         model training costs. </p>
     *         <p>
     *         To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal. This delays job
     *         termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     *         </p>
     *         <p>
     *         When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms
     *         provided by Amazon SageMaker save the intermediate results of the job.
     */

    public StoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * Sets a maximum duration for the training jobs that the tuning job launches. Use this parameter to limit model
     * training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal. This delays job termination
     * for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     * </p>
     * <p>
     * When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms provided
     * by Amazon SageMaker save the intermediate results of the job.
     * </p>
     * 
     * @param stoppingCondition
     *        Sets a maximum duration for the training jobs that the tuning job launches. Use this parameter to limit
     *        model training costs. </p>
     *        <p>
     *        To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal. This delays job
     *        termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
     *        </p>
     *        <p>
     *        When Amazon SageMaker terminates a job because the stopping condition has been met, training algorithms
     *        provided by Amazon SageMaker save the intermediate results of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobDefinition withStoppingCondition(StoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
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
        if (getStaticHyperParameters() != null)
            sb.append("StaticHyperParameters: ").append(getStaticHyperParameters()).append(",");
        if (getAlgorithmSpecification() != null)
            sb.append("AlgorithmSpecification: ").append(getAlgorithmSpecification()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
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

        if (obj instanceof HyperParameterTrainingJobDefinition == false)
            return false;
        HyperParameterTrainingJobDefinition other = (HyperParameterTrainingJobDefinition) obj;
        if (other.getStaticHyperParameters() == null ^ this.getStaticHyperParameters() == null)
            return false;
        if (other.getStaticHyperParameters() != null && other.getStaticHyperParameters().equals(this.getStaticHyperParameters()) == false)
            return false;
        if (other.getAlgorithmSpecification() == null ^ this.getAlgorithmSpecification() == null)
            return false;
        if (other.getAlgorithmSpecification() != null && other.getAlgorithmSpecification().equals(this.getAlgorithmSpecification()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
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

        hashCode = prime * hashCode + ((getStaticHyperParameters() == null) ? 0 : getStaticHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmSpecification() == null) ? 0 : getAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTrainingJobDefinition clone() {
        try {
            return (HyperParameterTrainingJobDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTrainingJobDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
