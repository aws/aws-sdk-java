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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CreateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Definition of the Amazon Braket job to be created. Specifies the container image the job uses and information
     * about the Python scripts used for entry and training.
     * </p>
     */
    private AlgorithmSpecification algorithmSpecification;
    /**
     * <p>
     * Information about the output locations for job checkpoint data.
     * </p>
     */
    private JobCheckpointConfig checkpointConfig;
    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The quantum processing unit (QPU) or simulator used to create an Amazon Braket job.
     * </p>
     */
    private DeviceConfig deviceConfig;
    /**
     * <p>
     * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the training job. The
     * values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the
     * value is the value of th hyperparameter.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;
    /**
     * <p>
     * A list of parameters that specify the name and type of input data and where it is located.
     * </p>
     */
    private java.util.List<InputFileConfig> inputDataConfig;
    /**
     * <p>
     * Configuration of the resource instances to use while running the hybrid job on Amazon Braket.
     * </p>
     */
    private InstanceConfig instanceConfig;
    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The path to the S3 location where you want to store job artifacts and the encryption key used to store them.
     * </p>
     */
    private JobOutputDataConfig outputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user.
     * It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the
     * users' s3 buckets.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The user-defined criteria that specifies when a job stops running.
     * </p>
     */
    private JobStoppingCondition stoppingCondition;
    /**
     * <p>
     * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Definition of the Amazon Braket job to be created. Specifies the container image the job uses and information
     * about the Python scripts used for entry and training.
     * </p>
     * 
     * @param algorithmSpecification
     *        Definition of the Amazon Braket job to be created. Specifies the container image the job uses and
     *        information about the Python scripts used for entry and training.
     */

    public void setAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * Definition of the Amazon Braket job to be created. Specifies the container image the job uses and information
     * about the Python scripts used for entry and training.
     * </p>
     * 
     * @return Definition of the Amazon Braket job to be created. Specifies the container image the job uses and
     *         information about the Python scripts used for entry and training.
     */

    public AlgorithmSpecification getAlgorithmSpecification() {
        return this.algorithmSpecification;
    }

    /**
     * <p>
     * Definition of the Amazon Braket job to be created. Specifies the container image the job uses and information
     * about the Python scripts used for entry and training.
     * </p>
     * 
     * @param algorithmSpecification
     *        Definition of the Amazon Braket job to be created. Specifies the container image the job uses and
     *        information about the Python scripts used for entry and training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        setAlgorithmSpecification(algorithmSpecification);
        return this;
    }

    /**
     * <p>
     * Information about the output locations for job checkpoint data.
     * </p>
     * 
     * @param checkpointConfig
     *        Information about the output locations for job checkpoint data.
     */

    public void setCheckpointConfig(JobCheckpointConfig checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
    }

    /**
     * <p>
     * Information about the output locations for job checkpoint data.
     * </p>
     * 
     * @return Information about the output locations for job checkpoint data.
     */

    public JobCheckpointConfig getCheckpointConfig() {
        return this.checkpointConfig;
    }

    /**
     * <p>
     * Information about the output locations for job checkpoint data.
     * </p>
     * 
     * @param checkpointConfig
     *        Information about the output locations for job checkpoint data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withCheckpointConfig(JobCheckpointConfig checkpointConfig) {
        setCheckpointConfig(checkpointConfig);
        return this;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A unique token that guarantees that the call to this API is idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @return A unique token that guarantees that the call to this API is idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A unique token that guarantees that the call to this API is idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The quantum processing unit (QPU) or simulator used to create an Amazon Braket job.
     * </p>
     * 
     * @param deviceConfig
     *        The quantum processing unit (QPU) or simulator used to create an Amazon Braket job.
     */

    public void setDeviceConfig(DeviceConfig deviceConfig) {
        this.deviceConfig = deviceConfig;
    }

    /**
     * <p>
     * The quantum processing unit (QPU) or simulator used to create an Amazon Braket job.
     * </p>
     * 
     * @return The quantum processing unit (QPU) or simulator used to create an Amazon Braket job.
     */

    public DeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    /**
     * <p>
     * The quantum processing unit (QPU) or simulator used to create an Amazon Braket job.
     * </p>
     * 
     * @param deviceConfig
     *        The quantum processing unit (QPU) or simulator used to create an Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDeviceConfig(DeviceConfig deviceConfig) {
        setDeviceConfig(deviceConfig);
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the training job. The
     * values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the
     * value is the value of th hyperparameter.
     * </p>
     * 
     * @return Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the training
     *         job. The values are set with a string of JSON key:value pairs, where the key is the name of the
     *         hyperparameter and the value is the value of th hyperparameter.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the training job. The
     * values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the
     * value is the value of th hyperparameter.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the training job.
     *        The values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter
     *        and the value is the value of th hyperparameter.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the training job. The
     * values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the
     * value is the value of th hyperparameter.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the training job.
     *        The values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter
     *        and the value is the value of th hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    /**
     * Add a single HyperParameters entry
     *
     * @see CreateJobRequest#withHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest addHyperParametersEntry(String key, String value) {
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

    public CreateJobRequest clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * A list of parameters that specify the name and type of input data and where it is located.
     * </p>
     * 
     * @return A list of parameters that specify the name and type of input data and where it is located.
     */

    public java.util.List<InputFileConfig> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * A list of parameters that specify the name and type of input data and where it is located.
     * </p>
     * 
     * @param inputDataConfig
     *        A list of parameters that specify the name and type of input data and where it is located.
     */

    public void setInputDataConfig(java.util.Collection<InputFileConfig> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<InputFileConfig>(inputDataConfig);
    }

    /**
     * <p>
     * A list of parameters that specify the name and type of input data and where it is located.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        A list of parameters that specify the name and type of input data and where it is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withInputDataConfig(InputFileConfig... inputDataConfig) {
        if (this.inputDataConfig == null) {
            setInputDataConfig(new java.util.ArrayList<InputFileConfig>(inputDataConfig.length));
        }
        for (InputFileConfig ele : inputDataConfig) {
            this.inputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters that specify the name and type of input data and where it is located.
     * </p>
     * 
     * @param inputDataConfig
     *        A list of parameters that specify the name and type of input data and where it is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withInputDataConfig(java.util.Collection<InputFileConfig> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Configuration of the resource instances to use while running the hybrid job on Amazon Braket.
     * </p>
     * 
     * @param instanceConfig
     *        Configuration of the resource instances to use while running the hybrid job on Amazon Braket.
     */

    public void setInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
    }

    /**
     * <p>
     * Configuration of the resource instances to use while running the hybrid job on Amazon Braket.
     * </p>
     * 
     * @return Configuration of the resource instances to use while running the hybrid job on Amazon Braket.
     */

    public InstanceConfig getInstanceConfig() {
        return this.instanceConfig;
    }

    /**
     * <p>
     * Configuration of the resource instances to use while running the hybrid job on Amazon Braket.
     * </p>
     * 
     * @param instanceConfig
     *        Configuration of the resource instances to use while running the hybrid job on Amazon Braket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withInstanceConfig(InstanceConfig instanceConfig) {
        setInstanceConfig(instanceConfig);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     * 
     * @param jobName
     *        The name of the Amazon Braket job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     * 
     * @return The name of the Amazon Braket job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     * 
     * @param jobName
     *        The name of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The path to the S3 location where you want to store job artifacts and the encryption key used to store them.
     * </p>
     * 
     * @param outputDataConfig
     *        The path to the S3 location where you want to store job artifacts and the encryption key used to store
     *        them.
     */

    public void setOutputDataConfig(JobOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The path to the S3 location where you want to store job artifacts and the encryption key used to store them.
     * </p>
     * 
     * @return The path to the S3 location where you want to store job artifacts and the encryption key used to store
     *         them.
     */

    public JobOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The path to the S3 location where you want to store job artifacts and the encryption key used to store them.
     * </p>
     * 
     * @param outputDataConfig
     *        The path to the S3 location where you want to store job artifacts and the encryption key used to store
     *        them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withOutputDataConfig(JobOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user.
     * It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the
     * users' s3 buckets.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of
     *        a user. It can access user resources, run an Amazon Braket job container on behalf of user, and output
     *        resources to the users' s3 buckets.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user.
     * It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the
     * users' s3 buckets.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of
     *         a user. It can access user resources, run an Amazon Braket job container on behalf of user, and output
     *         resources to the users' s3 buckets.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user.
     * It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the
     * users' s3 buckets.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of
     *        a user. It can access user resources, run an Amazon Braket job container on behalf of user, and output
     *        resources to the users' s3 buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The user-defined criteria that specifies when a job stops running.
     * </p>
     * 
     * @param stoppingCondition
     *        The user-defined criteria that specifies when a job stops running.
     */

    public void setStoppingCondition(JobStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * The user-defined criteria that specifies when a job stops running.
     * </p>
     * 
     * @return The user-defined criteria that specifies when a job stops running.
     */

    public JobStoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * The user-defined criteria that specifies when a job stops running.
     * </p>
     * 
     * @param stoppingCondition
     *        The user-defined criteria that specifies when a job stops running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withStoppingCondition(JobStoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
     * </p>
     * 
     * @return A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket
     *         resources.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
     * </p>
     * 
     * @param tags
     *        A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket
     *        resources.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
     * </p>
     * 
     * @param tags
     *        A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateJobRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAlgorithmSpecification() != null)
            sb.append("AlgorithmSpecification: ").append(getAlgorithmSpecification()).append(",");
        if (getCheckpointConfig() != null)
            sb.append("CheckpointConfig: ").append(getCheckpointConfig()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDeviceConfig() != null)
            sb.append("DeviceConfig: ").append(getDeviceConfig()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getInstanceConfig() != null)
            sb.append("InstanceConfig: ").append(getInstanceConfig()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
        if (other.getAlgorithmSpecification() == null ^ this.getAlgorithmSpecification() == null)
            return false;
        if (other.getAlgorithmSpecification() != null && other.getAlgorithmSpecification().equals(this.getAlgorithmSpecification()) == false)
            return false;
        if (other.getCheckpointConfig() == null ^ this.getCheckpointConfig() == null)
            return false;
        if (other.getCheckpointConfig() != null && other.getCheckpointConfig().equals(this.getCheckpointConfig()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDeviceConfig() == null ^ this.getDeviceConfig() == null)
            return false;
        if (other.getDeviceConfig() != null && other.getDeviceConfig().equals(this.getDeviceConfig()) == false)
            return false;
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null && other.getHyperParameters().equals(this.getHyperParameters()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getInstanceConfig() == null ^ this.getInstanceConfig() == null)
            return false;
        if (other.getInstanceConfig() != null && other.getInstanceConfig().equals(this.getInstanceConfig()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithmSpecification() == null) ? 0 : getAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getCheckpointConfig() == null) ? 0 : getCheckpointConfig().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDeviceConfig() == null) ? 0 : getDeviceConfig().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getInstanceConfig() == null) ? 0 : getInstanceConfig().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}
