/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/SubmitJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job. A name must be 1 to 128 characters in length.
     * </p>
     * <p>
     * Pattern: ^[a-zA-Z0-9_]+$
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job queue into which the job will be submitted. You can specify either the name or the Amazon Resource Name
     * (ARN) of the queue.
     * </p>
     */
    private String jobQueue;
    /**
     * <p>
     * A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     * </p>
     */
    private java.util.List<JobDependency> dependsOn;
    /**
     * <p>
     * The job definition used by this job. This value can be either a <code>name:revision</code> or the Amazon Resource
     * Name (ARN) for the job definition.
     * </p>
     */
    private String jobDefinition;
    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job
     * definition. Parameters are specified as a key and value pair mapping. Parameters in a <code>SubmitJob</code>
     * request override any corresponding parameter defaults from the job definition.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified job definition
     * and the overrides it should receive. You can override the default command for a container (that is specified in
     * the job definition or the Docker image) with a <code>command</code> override. You can also override existing
     * environment variables (that are specified in the job definition or Docker image) on a container or add new
     * environment variables to it with an <code>environment</code> override.
     * </p>
     */
    private ContainerOverrides containerOverrides;
    /**
     * <p>
     * The retry strategy to use for failed jobs from this <a>SubmitJob</a> operation. When a retry strategy is
     * specified here, it overrides the retry strategy defined in the job definition.
     * </p>
     */
    private RetryStrategy retryStrategy;

    /**
     * <p>
     * The name of the job. A name must be 1 to 128 characters in length.
     * </p>
     * <p>
     * Pattern: ^[a-zA-Z0-9_]+$
     * </p>
     * 
     * @param jobName
     *        The name of the job. A name must be 1 to 128 characters in length.</p>
     *        <p>
     *        Pattern: ^[a-zA-Z0-9_]+$
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job. A name must be 1 to 128 characters in length.
     * </p>
     * <p>
     * Pattern: ^[a-zA-Z0-9_]+$
     * </p>
     * 
     * @return The name of the job. A name must be 1 to 128 characters in length.</p>
     *         <p>
     *         Pattern: ^[a-zA-Z0-9_]+$
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job. A name must be 1 to 128 characters in length.
     * </p>
     * <p>
     * Pattern: ^[a-zA-Z0-9_]+$
     * </p>
     * 
     * @param jobName
     *        The name of the job. A name must be 1 to 128 characters in length.</p>
     *        <p>
     *        Pattern: ^[a-zA-Z0-9_]+$
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job queue into which the job will be submitted. You can specify either the name or the Amazon Resource Name
     * (ARN) of the queue.
     * </p>
     * 
     * @param jobQueue
     *        The job queue into which the job will be submitted. You can specify either the name or the Amazon Resource
     *        Name (ARN) of the queue.
     */

    public void setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
    }

    /**
     * <p>
     * The job queue into which the job will be submitted. You can specify either the name or the Amazon Resource Name
     * (ARN) of the queue.
     * </p>
     * 
     * @return The job queue into which the job will be submitted. You can specify either the name or the Amazon
     *         Resource Name (ARN) of the queue.
     */

    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * <p>
     * The job queue into which the job will be submitted. You can specify either the name or the Amazon Resource Name
     * (ARN) of the queue.
     * </p>
     * 
     * @param jobQueue
     *        The job queue into which the job will be submitted. You can specify either the name or the Amazon Resource
     *        Name (ARN) of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitJobRequest withJobQueue(String jobQueue) {
        setJobQueue(jobQueue);
        return this;
    }

    /**
     * <p>
     * A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     * </p>
     * 
     * @return A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     */

    public java.util.List<JobDependency> getDependsOn() {
        return dependsOn;
    }

    /**
     * <p>
     * A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     * </p>
     * 
     * @param dependsOn
     *        A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     */

    public void setDependsOn(java.util.Collection<JobDependency> dependsOn) {
        if (dependsOn == null) {
            this.dependsOn = null;
            return;
        }

        this.dependsOn = new java.util.ArrayList<JobDependency>(dependsOn);
    }

    /**
     * <p>
     * A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitJobRequest withDependsOn(JobDependency... dependsOn) {
        if (this.dependsOn == null) {
            setDependsOn(new java.util.ArrayList<JobDependency>(dependsOn.length));
        }
        for (JobDependency ele : dependsOn) {
            this.dependsOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     * </p>
     * 
     * @param dependsOn
     *        A list of job IDs on which this job depends. A job can depend upon a maximum of 100 jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitJobRequest withDependsOn(java.util.Collection<JobDependency> dependsOn) {
        setDependsOn(dependsOn);
        return this;
    }

    /**
     * <p>
     * The job definition used by this job. This value can be either a <code>name:revision</code> or the Amazon Resource
     * Name (ARN) for the job definition.
     * </p>
     * 
     * @param jobDefinition
     *        The job definition used by this job. This value can be either a <code>name:revision</code> or the Amazon
     *        Resource Name (ARN) for the job definition.
     */

    public void setJobDefinition(String jobDefinition) {
        this.jobDefinition = jobDefinition;
    }

    /**
     * <p>
     * The job definition used by this job. This value can be either a <code>name:revision</code> or the Amazon Resource
     * Name (ARN) for the job definition.
     * </p>
     * 
     * @return The job definition used by this job. This value can be either a <code>name:revision</code> or the Amazon
     *         Resource Name (ARN) for the job definition.
     */

    public String getJobDefinition() {
        return this.jobDefinition;
    }

    /**
     * <p>
     * The job definition used by this job. This value can be either a <code>name:revision</code> or the Amazon Resource
     * Name (ARN) for the job definition.
     * </p>
     * 
     * @param jobDefinition
     *        The job definition used by this job. This value can be either a <code>name:revision</code> or the Amazon
     *        Resource Name (ARN) for the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitJobRequest withJobDefinition(String jobDefinition) {
        setJobDefinition(jobDefinition);
        return this;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job
     * definition. Parameters are specified as a key and value pair mapping. Parameters in a <code>SubmitJob</code>
     * request override any corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @return Additional parameters passed to the job that replace parameter substitution placeholders that are set in
     *         the job definition. Parameters are specified as a key and value pair mapping. Parameters in a
     *         <code>SubmitJob</code> request override any corresponding parameter defaults from the job definition.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job
     * definition. Parameters are specified as a key and value pair mapping. Parameters in a <code>SubmitJob</code>
     * request override any corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @param parameters
     *        Additional parameters passed to the job that replace parameter substitution placeholders that are set in
     *        the job definition. Parameters are specified as a key and value pair mapping. Parameters in a
     *        <code>SubmitJob</code> request override any corresponding parameter defaults from the job definition.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job
     * definition. Parameters are specified as a key and value pair mapping. Parameters in a <code>SubmitJob</code>
     * request override any corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @param parameters
     *        Additional parameters passed to the job that replace parameter substitution placeholders that are set in
     *        the job definition. Parameters are specified as a key and value pair mapping. Parameters in a
     *        <code>SubmitJob</code> request override any corresponding parameter defaults from the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitJobRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public SubmitJobRequest addParametersEntry(String key, String value) {
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

    public SubmitJobRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified job definition
     * and the overrides it should receive. You can override the default command for a container (that is specified in
     * the job definition or the Docker image) with a <code>command</code> override. You can also override existing
     * environment variables (that are specified in the job definition or Docker image) on a container or add new
     * environment variables to it with an <code>environment</code> override.
     * </p>
     * 
     * @param containerOverrides
     *        A list of container overrides in JSON format that specify the name of a container in the specified job
     *        definition and the overrides it should receive. You can override the default command for a container (that
     *        is specified in the job definition or the Docker image) with a <code>command</code> override. You can also
     *        override existing environment variables (that are specified in the job definition or Docker image) on a
     *        container or add new environment variables to it with an <code>environment</code> override.
     */

    public void setContainerOverrides(ContainerOverrides containerOverrides) {
        this.containerOverrides = containerOverrides;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified job definition
     * and the overrides it should receive. You can override the default command for a container (that is specified in
     * the job definition or the Docker image) with a <code>command</code> override. You can also override existing
     * environment variables (that are specified in the job definition or Docker image) on a container or add new
     * environment variables to it with an <code>environment</code> override.
     * </p>
     * 
     * @return A list of container overrides in JSON format that specify the name of a container in the specified job
     *         definition and the overrides it should receive. You can override the default command for a container
     *         (that is specified in the job definition or the Docker image) with a <code>command</code> override. You
     *         can also override existing environment variables (that are specified in the job definition or Docker
     *         image) on a container or add new environment variables to it with an <code>environment</code> override.
     */

    public ContainerOverrides getContainerOverrides() {
        return this.containerOverrides;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified job definition
     * and the overrides it should receive. You can override the default command for a container (that is specified in
     * the job definition or the Docker image) with a <code>command</code> override. You can also override existing
     * environment variables (that are specified in the job definition or Docker image) on a container or add new
     * environment variables to it with an <code>environment</code> override.
     * </p>
     * 
     * @param containerOverrides
     *        A list of container overrides in JSON format that specify the name of a container in the specified job
     *        definition and the overrides it should receive. You can override the default command for a container (that
     *        is specified in the job definition or the Docker image) with a <code>command</code> override. You can also
     *        override existing environment variables (that are specified in the job definition or Docker image) on a
     *        container or add new environment variables to it with an <code>environment</code> override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitJobRequest withContainerOverrides(ContainerOverrides containerOverrides) {
        setContainerOverrides(containerOverrides);
        return this;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs from this <a>SubmitJob</a> operation. When a retry strategy is
     * specified here, it overrides the retry strategy defined in the job definition.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs from this <a>SubmitJob</a> operation. When a retry strategy is
     *        specified here, it overrides the retry strategy defined in the job definition.
     */

    public void setRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs from this <a>SubmitJob</a> operation. When a retry strategy is
     * specified here, it overrides the retry strategy defined in the job definition.
     * </p>
     * 
     * @return The retry strategy to use for failed jobs from this <a>SubmitJob</a> operation. When a retry strategy is
     *         specified here, it overrides the retry strategy defined in the job definition.
     */

    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs from this <a>SubmitJob</a> operation. When a retry strategy is
     * specified here, it overrides the retry strategy defined in the job definition.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs from this <a>SubmitJob</a> operation. When a retry strategy is
     *        specified here, it overrides the retry strategy defined in the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitJobRequest withRetryStrategy(RetryStrategy retryStrategy) {
        setRetryStrategy(retryStrategy);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobQueue() != null)
            sb.append("JobQueue: ").append(getJobQueue()).append(",");
        if (getDependsOn() != null)
            sb.append("DependsOn: ").append(getDependsOn()).append(",");
        if (getJobDefinition() != null)
            sb.append("JobDefinition: ").append(getJobDefinition()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getContainerOverrides() != null)
            sb.append("ContainerOverrides: ").append(getContainerOverrides()).append(",");
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

        if (obj instanceof SubmitJobRequest == false)
            return false;
        SubmitJobRequest other = (SubmitJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobQueue() == null ^ this.getJobQueue() == null)
            return false;
        if (other.getJobQueue() != null && other.getJobQueue().equals(this.getJobQueue()) == false)
            return false;
        if (other.getDependsOn() == null ^ this.getDependsOn() == null)
            return false;
        if (other.getDependsOn() != null && other.getDependsOn().equals(this.getDependsOn()) == false)
            return false;
        if (other.getJobDefinition() == null ^ this.getJobDefinition() == null)
            return false;
        if (other.getJobDefinition() != null && other.getJobDefinition().equals(this.getJobDefinition()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getContainerOverrides() == null ^ this.getContainerOverrides() == null)
            return false;
        if (other.getContainerOverrides() != null && other.getContainerOverrides().equals(this.getContainerOverrides()) == false)
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

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobQueue() == null) ? 0 : getJobQueue().hashCode());
        hashCode = prime * hashCode + ((getDependsOn() == null) ? 0 : getDependsOn().hashCode());
        hashCode = prime * hashCode + ((getJobDefinition() == null) ? 0 : getJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getContainerOverrides() == null) ? 0 : getContainerOverrides().hashCode());
        hashCode = prime * hashCode + ((getRetryStrategy() == null) ? 0 : getRetryStrategy().hashCode());
        return hashCode;
    }

    @Override
    public SubmitJobRequest clone() {
        return (SubmitJobRequest) super.clone();
    }

}
