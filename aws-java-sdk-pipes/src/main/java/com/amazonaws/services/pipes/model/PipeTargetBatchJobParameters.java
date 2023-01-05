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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using an Batch job as a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeTargetBatchJobParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetBatchJobParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
     * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the
     * target is an Batch job.
     * </p>
     */
    private BatchArrayProperties arrayProperties;
    /**
     * <p>
     * The overrides that are sent to a container.
     * </p>
     */
    private BatchContainerOverrides containerOverrides;
    /**
     * <p>
     * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     * <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child array job
     * completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type dependency with a
     * job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of
     * each dependency to complete before it can begin.
     * </p>
     */
    private java.util.List<BatchJobDependency> dependsOn;
    /**
     * <p>
     * The job definition used by this job. This value can be one of <code>name</code>, <code>name:revision</code>, or
     * the Amazon Resource Name (ARN) for the job definition. If name is specified without a revision then the latest
     * active revision is used.
     * </p>
     */
    private String jobDefinition;
    /**
     * <p>
     * The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can contain
     * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job
     * definition. Parameters are specified as a key and value pair mapping. Parameters included here override any
     * corresponding parameter defaults from the job definition.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the retry
     * strategy defined in the job definition.
     * </p>
     */
    private BatchRetryStrategy retryStrategy;

    /**
     * <p>
     * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
     * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the
     * target is an Batch job.
     * </p>
     * 
     * @param arrayProperties
     *        The array properties for the submitted job, such as the size of the array. The array size can be between 2
     *        and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used
     *        only if the target is an Batch job.
     */

    public void setArrayProperties(BatchArrayProperties arrayProperties) {
        this.arrayProperties = arrayProperties;
    }

    /**
     * <p>
     * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
     * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the
     * target is an Batch job.
     * </p>
     * 
     * @return The array properties for the submitted job, such as the size of the array. The array size can be between
     *         2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used
     *         only if the target is an Batch job.
     */

    public BatchArrayProperties getArrayProperties() {
        return this.arrayProperties;
    }

    /**
     * <p>
     * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and
     * 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the
     * target is an Batch job.
     * </p>
     * 
     * @param arrayProperties
     *        The array properties for the submitted job, such as the size of the array. The array size can be between 2
     *        and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used
     *        only if the target is an Batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters withArrayProperties(BatchArrayProperties arrayProperties) {
        setArrayProperties(arrayProperties);
        return this;
    }

    /**
     * <p>
     * The overrides that are sent to a container.
     * </p>
     * 
     * @param containerOverrides
     *        The overrides that are sent to a container.
     */

    public void setContainerOverrides(BatchContainerOverrides containerOverrides) {
        this.containerOverrides = containerOverrides;
    }

    /**
     * <p>
     * The overrides that are sent to a container.
     * </p>
     * 
     * @return The overrides that are sent to a container.
     */

    public BatchContainerOverrides getContainerOverrides() {
        return this.containerOverrides;
    }

    /**
     * <p>
     * The overrides that are sent to a container.
     * </p>
     * 
     * @param containerOverrides
     *        The overrides that are sent to a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters withContainerOverrides(BatchContainerOverrides containerOverrides) {
        setContainerOverrides(containerOverrides);
        return this;
    }

    /**
     * <p>
     * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     * <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child array job
     * completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type dependency with a
     * job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of
     * each dependency to complete before it can begin.
     * </p>
     * 
     * @return A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     *         <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child
     *         array job completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type
     *         dependency with a job ID for array jobs. In that case, each index child of this job must wait for the
     *         corresponding index child of each dependency to complete before it can begin.
     */

    public java.util.List<BatchJobDependency> getDependsOn() {
        return dependsOn;
    }

    /**
     * <p>
     * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     * <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child array job
     * completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type dependency with a
     * job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of
     * each dependency to complete before it can begin.
     * </p>
     * 
     * @param dependsOn
     *        A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     *        <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child
     *        array job completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type
     *        dependency with a job ID for array jobs. In that case, each index child of this job must wait for the
     *        corresponding index child of each dependency to complete before it can begin.
     */

    public void setDependsOn(java.util.Collection<BatchJobDependency> dependsOn) {
        if (dependsOn == null) {
            this.dependsOn = null;
            return;
        }

        this.dependsOn = new java.util.ArrayList<BatchJobDependency>(dependsOn);
    }

    /**
     * <p>
     * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     * <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child array job
     * completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type dependency with a
     * job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of
     * each dependency to complete before it can begin.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     *        <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child
     *        array job completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type
     *        dependency with a job ID for array jobs. In that case, each index child of this job must wait for the
     *        corresponding index child of each dependency to complete before it can begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters withDependsOn(BatchJobDependency... dependsOn) {
        if (this.dependsOn == null) {
            setDependsOn(new java.util.ArrayList<BatchJobDependency>(dependsOn.length));
        }
        for (BatchJobDependency ele : dependsOn) {
            this.dependsOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     * <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child array job
     * completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type dependency with a
     * job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of
     * each dependency to complete before it can begin.
     * </p>
     * 
     * @param dependsOn
     *        A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a
     *        <code>SEQUENTIAL</code> type dependency without specifying a job ID for array jobs so that each child
     *        array job completes sequentially, starting at index 0. You can also specify an <code>N_TO_N</code> type
     *        dependency with a job ID for array jobs. In that case, each index child of this job must wait for the
     *        corresponding index child of each dependency to complete before it can begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters withDependsOn(java.util.Collection<BatchJobDependency> dependsOn) {
        setDependsOn(dependsOn);
        return this;
    }

    /**
     * <p>
     * The job definition used by this job. This value can be one of <code>name</code>, <code>name:revision</code>, or
     * the Amazon Resource Name (ARN) for the job definition. If name is specified without a revision then the latest
     * active revision is used.
     * </p>
     * 
     * @param jobDefinition
     *        The job definition used by this job. This value can be one of <code>name</code>,
     *        <code>name:revision</code>, or the Amazon Resource Name (ARN) for the job definition. If name is specified
     *        without a revision then the latest active revision is used.
     */

    public void setJobDefinition(String jobDefinition) {
        this.jobDefinition = jobDefinition;
    }

    /**
     * <p>
     * The job definition used by this job. This value can be one of <code>name</code>, <code>name:revision</code>, or
     * the Amazon Resource Name (ARN) for the job definition. If name is specified without a revision then the latest
     * active revision is used.
     * </p>
     * 
     * @return The job definition used by this job. This value can be one of <code>name</code>,
     *         <code>name:revision</code>, or the Amazon Resource Name (ARN) for the job definition. If name is
     *         specified without a revision then the latest active revision is used.
     */

    public String getJobDefinition() {
        return this.jobDefinition;
    }

    /**
     * <p>
     * The job definition used by this job. This value can be one of <code>name</code>, <code>name:revision</code>, or
     * the Amazon Resource Name (ARN) for the job definition. If name is specified without a revision then the latest
     * active revision is used.
     * </p>
     * 
     * @param jobDefinition
     *        The job definition used by this job. This value can be one of <code>name</code>,
     *        <code>name:revision</code>, or the Amazon Resource Name (ARN) for the job definition. If name is specified
     *        without a revision then the latest active revision is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters withJobDefinition(String jobDefinition) {
        setJobDefinition(jobDefinition);
        return this;
    }

    /**
     * <p>
     * The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can contain
     * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
     * </p>
     * 
     * @param jobName
     *        The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can
     *        contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can contain
     * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
     * </p>
     * 
     * @return The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can
     *         contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can contain
     * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
     * </p>
     * 
     * @param jobName
     *        The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can
     *        contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job
     * definition. Parameters are specified as a key and value pair mapping. Parameters included here override any
     * corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @return Additional parameters passed to the job that replace parameter substitution placeholders that are set in
     *         the job definition. Parameters are specified as a key and value pair mapping. Parameters included here
     *         override any corresponding parameter defaults from the job definition.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job
     * definition. Parameters are specified as a key and value pair mapping. Parameters included here override any
     * corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @param parameters
     *        Additional parameters passed to the job that replace parameter substitution placeholders that are set in
     *        the job definition. Parameters are specified as a key and value pair mapping. Parameters included here
     *        override any corresponding parameter defaults from the job definition.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job
     * definition. Parameters are specified as a key and value pair mapping. Parameters included here override any
     * corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @param parameters
     *        Additional parameters passed to the job that replace parameter substitution placeholders that are set in
     *        the job definition. Parameters are specified as a key and value pair mapping. Parameters included here
     *        override any corresponding parameter defaults from the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see PipeTargetBatchJobParameters#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the retry
     * strategy defined in the job definition.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the retry
     *        strategy defined in the job definition.
     */

    public void setRetryStrategy(BatchRetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the retry
     * strategy defined in the job definition.
     * </p>
     * 
     * @return The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the
     *         retry strategy defined in the job definition.
     */

    public BatchRetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the retry
     * strategy defined in the job definition.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the retry
     *        strategy defined in the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetBatchJobParameters withRetryStrategy(BatchRetryStrategy retryStrategy) {
        setRetryStrategy(retryStrategy);
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
        if (getArrayProperties() != null)
            sb.append("ArrayProperties: ").append(getArrayProperties()).append(",");
        if (getContainerOverrides() != null)
            sb.append("ContainerOverrides: ").append(getContainerOverrides()).append(",");
        if (getDependsOn() != null)
            sb.append("DependsOn: ").append(getDependsOn()).append(",");
        if (getJobDefinition() != null)
            sb.append("JobDefinition: ").append(getJobDefinition()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getRetryStrategy() != null)
            sb.append("RetryStrategy: ").append(getRetryStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeTargetBatchJobParameters == false)
            return false;
        PipeTargetBatchJobParameters other = (PipeTargetBatchJobParameters) obj;
        if (other.getArrayProperties() == null ^ this.getArrayProperties() == null)
            return false;
        if (other.getArrayProperties() != null && other.getArrayProperties().equals(this.getArrayProperties()) == false)
            return false;
        if (other.getContainerOverrides() == null ^ this.getContainerOverrides() == null)
            return false;
        if (other.getContainerOverrides() != null && other.getContainerOverrides().equals(this.getContainerOverrides()) == false)
            return false;
        if (other.getDependsOn() == null ^ this.getDependsOn() == null)
            return false;
        if (other.getDependsOn() != null && other.getDependsOn().equals(this.getDependsOn()) == false)
            return false;
        if (other.getJobDefinition() == null ^ this.getJobDefinition() == null)
            return false;
        if (other.getJobDefinition() != null && other.getJobDefinition().equals(this.getJobDefinition()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getRetryStrategy() == null ^ this.getRetryStrategy() == null)
            return false;
        if (other.getRetryStrategy() != null && other.getRetryStrategy().equals(this.getRetryStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayProperties() == null) ? 0 : getArrayProperties().hashCode());
        hashCode = prime * hashCode + ((getContainerOverrides() == null) ? 0 : getContainerOverrides().hashCode());
        hashCode = prime * hashCode + ((getDependsOn() == null) ? 0 : getDependsOn().hashCode());
        hashCode = prime * hashCode + ((getJobDefinition() == null) ? 0 : getJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getRetryStrategy() == null) ? 0 : getRetryStrategy().hashCode());
        return hashCode;
    }

    @Override
    public PipeTargetBatchJobParameters clone() {
        try {
            return (PipeTargetBatchJobParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeTargetBatchJobParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
