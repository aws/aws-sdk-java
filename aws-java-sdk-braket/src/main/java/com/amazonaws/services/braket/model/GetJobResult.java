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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Definition of the Amazon Braket job created. Specifies the container image the job uses, information about the
     * Python scripts used for entry and training, and the user-defined metrics used to evaluation the job.
     * </p>
     */
    private AlgorithmSpecification algorithmSpecification;
    /**
     * <p>
     * The billable time the Amazon Braket job used to complete.
     * </p>
     */
    private Integer billableDuration;
    /**
     * <p>
     * Information about the output locations for job checkpoint data.
     * </p>
     */
    private JobCheckpointConfig checkpointConfig;
    /**
     * <p>
     * The date and time that the Amazon Braket job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The quantum processing unit (QPU) or simulator used to run the Amazon Braket job.
     * </p>
     */
    private DeviceConfig deviceConfig;
    /**
     * <p>
     * The date and time that the Amazon Braket job ended.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * Details about the type and time events occurred related to the Amazon Braket job.
     * </p>
     */
    private java.util.List<JobEventDetails> events;
    /**
     * <p>
     * A description of the reason why an Amazon Braket job failed, if it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the traiing job. The
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
     * The resource instances to use while running the hybrid job on Amazon Braket.
     * </p>
     */
    private InstanceConfig instanceConfig;
    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The name of the Amazon Braket job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The path to the S3 location where job artifacts are stored and the encryption key used to store them there.
     * </p>
     */
    private JobOutputDataConfig outputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user.
     * It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the
     * s3 buckets of a user.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The date and time that the Amazon Braket job was started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The user-defined criteria that specifies when to stop a job running.
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
     * Definition of the Amazon Braket job created. Specifies the container image the job uses, information about the
     * Python scripts used for entry and training, and the user-defined metrics used to evaluation the job.
     * </p>
     * 
     * @param algorithmSpecification
     *        Definition of the Amazon Braket job created. Specifies the container image the job uses, information about
     *        the Python scripts used for entry and training, and the user-defined metrics used to evaluation the job.
     */

    public void setAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * Definition of the Amazon Braket job created. Specifies the container image the job uses, information about the
     * Python scripts used for entry and training, and the user-defined metrics used to evaluation the job.
     * </p>
     * 
     * @return Definition of the Amazon Braket job created. Specifies the container image the job uses, information
     *         about the Python scripts used for entry and training, and the user-defined metrics used to evaluation the
     *         job.
     */

    public AlgorithmSpecification getAlgorithmSpecification() {
        return this.algorithmSpecification;
    }

    /**
     * <p>
     * Definition of the Amazon Braket job created. Specifies the container image the job uses, information about the
     * Python scripts used for entry and training, and the user-defined metrics used to evaluation the job.
     * </p>
     * 
     * @param algorithmSpecification
     *        Definition of the Amazon Braket job created. Specifies the container image the job uses, information about
     *        the Python scripts used for entry and training, and the user-defined metrics used to evaluation the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        setAlgorithmSpecification(algorithmSpecification);
        return this;
    }

    /**
     * <p>
     * The billable time the Amazon Braket job used to complete.
     * </p>
     * 
     * @param billableDuration
     *        The billable time the Amazon Braket job used to complete.
     */

    public void setBillableDuration(Integer billableDuration) {
        this.billableDuration = billableDuration;
    }

    /**
     * <p>
     * The billable time the Amazon Braket job used to complete.
     * </p>
     * 
     * @return The billable time the Amazon Braket job used to complete.
     */

    public Integer getBillableDuration() {
        return this.billableDuration;
    }

    /**
     * <p>
     * The billable time the Amazon Braket job used to complete.
     * </p>
     * 
     * @param billableDuration
     *        The billable time the Amazon Braket job used to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withBillableDuration(Integer billableDuration) {
        setBillableDuration(billableDuration);
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

    public GetJobResult withCheckpointConfig(JobCheckpointConfig checkpointConfig) {
        setCheckpointConfig(checkpointConfig);
        return this;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the Amazon Braket job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was created.
     * </p>
     * 
     * @return The date and time that the Amazon Braket job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the Amazon Braket job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The quantum processing unit (QPU) or simulator used to run the Amazon Braket job.
     * </p>
     * 
     * @param deviceConfig
     *        The quantum processing unit (QPU) or simulator used to run the Amazon Braket job.
     */

    public void setDeviceConfig(DeviceConfig deviceConfig) {
        this.deviceConfig = deviceConfig;
    }

    /**
     * <p>
     * The quantum processing unit (QPU) or simulator used to run the Amazon Braket job.
     * </p>
     * 
     * @return The quantum processing unit (QPU) or simulator used to run the Amazon Braket job.
     */

    public DeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    /**
     * <p>
     * The quantum processing unit (QPU) or simulator used to run the Amazon Braket job.
     * </p>
     * 
     * @param deviceConfig
     *        The quantum processing unit (QPU) or simulator used to run the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withDeviceConfig(DeviceConfig deviceConfig) {
        setDeviceConfig(deviceConfig);
        return this;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job ended.
     * </p>
     * 
     * @param endedAt
     *        The date and time that the Amazon Braket job ended.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job ended.
     * </p>
     * 
     * @return The date and time that the Amazon Braket job ended.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job ended.
     * </p>
     * 
     * @param endedAt
     *        The date and time that the Amazon Braket job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * Details about the type and time events occurred related to the Amazon Braket job.
     * </p>
     * 
     * @return Details about the type and time events occurred related to the Amazon Braket job.
     */

    public java.util.List<JobEventDetails> getEvents() {
        return events;
    }

    /**
     * <p>
     * Details about the type and time events occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param events
     *        Details about the type and time events occurred related to the Amazon Braket job.
     */

    public void setEvents(java.util.Collection<JobEventDetails> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<JobEventDetails>(events);
    }

    /**
     * <p>
     * Details about the type and time events occurred related to the Amazon Braket job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        Details about the type and time events occurred related to the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withEvents(JobEventDetails... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<JobEventDetails>(events.length));
        }
        for (JobEventDetails ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the type and time events occurred related to the Amazon Braket job.
     * </p>
     * 
     * @param events
     *        Details about the type and time events occurred related to the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withEvents(java.util.Collection<JobEventDetails> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * A description of the reason why an Amazon Braket job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        A description of the reason why an Amazon Braket job failed, if it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A description of the reason why an Amazon Braket job failed, if it failed.
     * </p>
     * 
     * @return A description of the reason why an Amazon Braket job failed, if it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * A description of the reason why an Amazon Braket job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        A description of the reason why an Amazon Braket job failed, if it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the traiing job. The
     * values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the
     * value is the value of th hyperparameter.
     * </p>
     * 
     * @return Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the traiing job.
     *         The values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter
     *         and the value is the value of th hyperparameter.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the traiing job. The
     * values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the
     * value is the value of th hyperparameter.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the traiing job.
     *        The values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter
     *        and the value is the value of th hyperparameter.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the traiing job. The
     * values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the
     * value is the value of th hyperparameter.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the traiing job.
     *        The values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter
     *        and the value is the value of th hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    /**
     * Add a single HyperParameters entry
     *
     * @see GetJobResult#withHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult addHyperParametersEntry(String key, String value) {
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

    public GetJobResult clearHyperParametersEntries() {
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

    public GetJobResult withInputDataConfig(InputFileConfig... inputDataConfig) {
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

    public GetJobResult withInputDataConfig(java.util.Collection<InputFileConfig> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The resource instances to use while running the hybrid job on Amazon Braket.
     * </p>
     * 
     * @param instanceConfig
     *        The resource instances to use while running the hybrid job on Amazon Braket.
     */

    public void setInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
    }

    /**
     * <p>
     * The resource instances to use while running the hybrid job on Amazon Braket.
     * </p>
     * 
     * @return The resource instances to use while running the hybrid job on Amazon Braket.
     */

    public InstanceConfig getInstanceConfig() {
        return this.instanceConfig;
    }

    /**
     * <p>
     * The resource instances to use while running the hybrid job on Amazon Braket.
     * </p>
     * 
     * @param instanceConfig
     *        The resource instances to use while running the hybrid job on Amazon Braket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withInstanceConfig(InstanceConfig instanceConfig) {
        setInstanceConfig(instanceConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the Amazon Braket job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @return The ARN of the Amazon Braket job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withJobArn(String jobArn) {
        setJobArn(jobArn);
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

    public GetJobResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The path to the S3 location where job artifacts are stored and the encryption key used to store them there.
     * </p>
     * 
     * @param outputDataConfig
     *        The path to the S3 location where job artifacts are stored and the encryption key used to store them
     *        there.
     */

    public void setOutputDataConfig(JobOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The path to the S3 location where job artifacts are stored and the encryption key used to store them there.
     * </p>
     * 
     * @return The path to the S3 location where job artifacts are stored and the encryption key used to store them
     *         there.
     */

    public JobOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The path to the S3 location where job artifacts are stored and the encryption key used to store them there.
     * </p>
     * 
     * @param outputDataConfig
     *        The path to the S3 location where job artifacts are stored and the encryption key used to store them
     *        there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withOutputDataConfig(JobOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user.
     * It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the
     * s3 buckets of a user.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of
     *        a user. It can access user resources, run an Amazon Braket job container on behalf of user, and output
     *        resources to the s3 buckets of a user.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user.
     * It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the
     * s3 buckets of a user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of
     *         a user. It can access user resources, run an Amazon Braket job container on behalf of user, and output
     *         resources to the s3 buckets of a user.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user.
     * It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the
     * s3 buckets of a user.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of
     *        a user. It can access user resources, run an Amazon Braket job container on behalf of user, and output
     *        resources to the s3 buckets of a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was started.
     * </p>
     * 
     * @param startedAt
     *        The date and time that the Amazon Braket job was started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was started.
     * </p>
     * 
     * @return The date and time that the Amazon Braket job was started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The date and time that the Amazon Braket job was started.
     * </p>
     * 
     * @param startedAt
     *        The date and time that the Amazon Braket job was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Braket job.
     * @see JobPrimaryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     * 
     * @return The status of the Amazon Braket job.
     * @see JobPrimaryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobPrimaryStatus
     */

    public GetJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Braket job.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobPrimaryStatus
     */

    public GetJobResult withStatus(JobPrimaryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The user-defined criteria that specifies when to stop a job running.
     * </p>
     * 
     * @param stoppingCondition
     *        The user-defined criteria that specifies when to stop a job running.
     */

    public void setStoppingCondition(JobStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * The user-defined criteria that specifies when to stop a job running.
     * </p>
     * 
     * @return The user-defined criteria that specifies when to stop a job running.
     */

    public JobStoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * The user-defined criteria that specifies when to stop a job running.
     * </p>
     * 
     * @param stoppingCondition
     *        The user-defined criteria that specifies when to stop a job running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withStoppingCondition(JobStoppingCondition stoppingCondition) {
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

    public GetJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetJobResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult addTagsEntry(String key, String value) {
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

    public GetJobResult clearTagsEntries() {
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
        if (getBillableDuration() != null)
            sb.append("BillableDuration: ").append(getBillableDuration()).append(",");
        if (getCheckpointConfig() != null)
            sb.append("CheckpointConfig: ").append(getCheckpointConfig()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeviceConfig() != null)
            sb.append("DeviceConfig: ").append(getDeviceConfig()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getInstanceConfig() != null)
            sb.append("InstanceConfig: ").append(getInstanceConfig()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GetJobResult == false)
            return false;
        GetJobResult other = (GetJobResult) obj;
        if (other.getAlgorithmSpecification() == null ^ this.getAlgorithmSpecification() == null)
            return false;
        if (other.getAlgorithmSpecification() != null && other.getAlgorithmSpecification().equals(this.getAlgorithmSpecification()) == false)
            return false;
        if (other.getBillableDuration() == null ^ this.getBillableDuration() == null)
            return false;
        if (other.getBillableDuration() != null && other.getBillableDuration().equals(this.getBillableDuration()) == false)
            return false;
        if (other.getCheckpointConfig() == null ^ this.getCheckpointConfig() == null)
            return false;
        if (other.getCheckpointConfig() != null && other.getCheckpointConfig().equals(this.getCheckpointConfig()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeviceConfig() == null ^ this.getDeviceConfig() == null)
            return false;
        if (other.getDeviceConfig() != null && other.getDeviceConfig().equals(this.getDeviceConfig()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
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
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
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
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getBillableDuration() == null) ? 0 : getBillableDuration().hashCode());
        hashCode = prime * hashCode + ((getCheckpointConfig() == null) ? 0 : getCheckpointConfig().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeviceConfig() == null) ? 0 : getDeviceConfig().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getInstanceConfig() == null) ? 0 : getInstanceConfig().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetJobResult clone() {
        try {
            return (GetJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
