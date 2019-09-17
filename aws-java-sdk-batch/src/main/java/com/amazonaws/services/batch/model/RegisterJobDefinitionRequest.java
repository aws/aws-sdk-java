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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/RegisterJobDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterJobDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * The type of job definition.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value
     * pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding parameter defaults from
     * the job definition.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * An object with various properties specific to single-node container-based jobs. If the job definition's
     * <code>type</code> parameter is <code>container</code>, then you must specify either
     * <code>containerProperties</code> or <code>nodeProperties</code>.
     * </p>
     */
    private ContainerProperties containerProperties;
    /**
     * <p>
     * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job,
     * it becomes a multi-node parallel job. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node Parallel
     * Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter is
     * <code>container</code>, then you must specify either <code>containerProperties</code> or
     * <code>nodeProperties</code>.
     * </p>
     */
    private NodeProperties nodeProperties;
    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that is
     * specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job is terminated
     * due to a timeout, it is not retried.
     * </p>
     */
    private RetryStrategy retryStrategy;
    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates
     * your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum
     * value for the timeout is 60 seconds. Any timeout configuration that is specified during a <a>SubmitJob</a>
     * operation overrides the timeout configuration defined here. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/job_timeouts.html">Job Timeouts</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private JobTimeout timeout;

    /**
     * <p>
     * The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens,
     *        and underscores are allowed.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * 
     * @return The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers,
     *         hyphens, and underscores are allowed.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens,
     *        and underscores are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @see JobDefinitionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @return The type of job definition.
     * @see JobDefinitionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobDefinitionType
     */

    public RegisterJobDefinitionRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @see JobDefinitionType
     */

    public void setType(JobDefinitionType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of job definition.
     * </p>
     * 
     * @param type
     *        The type of job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobDefinitionType
     */

    public RegisterJobDefinitionRequest withType(JobDefinitionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value
     * pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding parameter defaults from
     * the job definition.
     * </p>
     * 
     * @return Default parameter substitution placeholders to set in the job definition. Parameters are specified as a
     *         key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     *         parameter defaults from the job definition.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value
     * pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding parameter defaults from
     * the job definition.
     * </p>
     * 
     * @param parameters
     *        Default parameter substitution placeholders to set in the job definition. Parameters are specified as a
     *        key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     *        parameter defaults from the job definition.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value
     * pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding parameter defaults from
     * the job definition.
     * </p>
     * 
     * @param parameters
     *        Default parameter substitution placeholders to set in the job definition. Parameters are specified as a
     *        key-value pair mapping. Parameters in a <code>SubmitJob</code> request override any corresponding
     *        parameter defaults from the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public RegisterJobDefinitionRequest addParametersEntry(String key, String value) {
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

    public RegisterJobDefinitionRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * An object with various properties specific to single-node container-based jobs. If the job definition's
     * <code>type</code> parameter is <code>container</code>, then you must specify either
     * <code>containerProperties</code> or <code>nodeProperties</code>.
     * </p>
     * 
     * @param containerProperties
     *        An object with various properties specific to single-node container-based jobs. If the job definition's
     *        <code>type</code> parameter is <code>container</code>, then you must specify either
     *        <code>containerProperties</code> or <code>nodeProperties</code>.
     */

    public void setContainerProperties(ContainerProperties containerProperties) {
        this.containerProperties = containerProperties;
    }

    /**
     * <p>
     * An object with various properties specific to single-node container-based jobs. If the job definition's
     * <code>type</code> parameter is <code>container</code>, then you must specify either
     * <code>containerProperties</code> or <code>nodeProperties</code>.
     * </p>
     * 
     * @return An object with various properties specific to single-node container-based jobs. If the job definition's
     *         <code>type</code> parameter is <code>container</code>, then you must specify either
     *         <code>containerProperties</code> or <code>nodeProperties</code>.
     */

    public ContainerProperties getContainerProperties() {
        return this.containerProperties;
    }

    /**
     * <p>
     * An object with various properties specific to single-node container-based jobs. If the job definition's
     * <code>type</code> parameter is <code>container</code>, then you must specify either
     * <code>containerProperties</code> or <code>nodeProperties</code>.
     * </p>
     * 
     * @param containerProperties
     *        An object with various properties specific to single-node container-based jobs. If the job definition's
     *        <code>type</code> parameter is <code>container</code>, then you must specify either
     *        <code>containerProperties</code> or <code>nodeProperties</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withContainerProperties(ContainerProperties containerProperties) {
        setContainerProperties(containerProperties);
        return this;
    }

    /**
     * <p>
     * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job,
     * it becomes a multi-node parallel job. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node Parallel
     * Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter is
     * <code>container</code>, then you must specify either <code>containerProperties</code> or
     * <code>nodeProperties</code>.
     * </p>
     * 
     * @param nodeProperties
     *        An object with various properties specific to multi-node parallel jobs. If you specify node properties for
     *        a job, it becomes a multi-node parallel job. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node
     *        Parallel Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter
     *        is <code>container</code>, then you must specify either <code>containerProperties</code> or
     *        <code>nodeProperties</code>.
     */

    public void setNodeProperties(NodeProperties nodeProperties) {
        this.nodeProperties = nodeProperties;
    }

    /**
     * <p>
     * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job,
     * it becomes a multi-node parallel job. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node Parallel
     * Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter is
     * <code>container</code>, then you must specify either <code>containerProperties</code> or
     * <code>nodeProperties</code>.
     * </p>
     * 
     * @return An object with various properties specific to multi-node parallel jobs. If you specify node properties
     *         for a job, it becomes a multi-node parallel job. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node
     *         Parallel Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter
     *         is <code>container</code>, then you must specify either <code>containerProperties</code> or
     *         <code>nodeProperties</code>.
     */

    public NodeProperties getNodeProperties() {
        return this.nodeProperties;
    }

    /**
     * <p>
     * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job,
     * it becomes a multi-node parallel job. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node Parallel
     * Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter is
     * <code>container</code>, then you must specify either <code>containerProperties</code> or
     * <code>nodeProperties</code>.
     * </p>
     * 
     * @param nodeProperties
     *        An object with various properties specific to multi-node parallel jobs. If you specify node properties for
     *        a job, it becomes a multi-node parallel job. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node
     *        Parallel Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter
     *        is <code>container</code>, then you must specify either <code>containerProperties</code> or
     *        <code>nodeProperties</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withNodeProperties(NodeProperties nodeProperties) {
        setNodeProperties(nodeProperties);
        return this;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that is
     * specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job is terminated
     * due to a timeout, it is not retried.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy
     *        that is specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job
     *        is terminated due to a timeout, it is not retried.
     */

    public void setRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that is
     * specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job is terminated
     * due to a timeout, it is not retried.
     * </p>
     * 
     * @return The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy
     *         that is specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job
     *         is terminated due to a timeout, it is not retried.
     */

    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that is
     * specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job is terminated
     * due to a timeout, it is not retried.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy
     *        that is specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job
     *        is terminated due to a timeout, it is not retried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withRetryStrategy(RetryStrategy retryStrategy) {
        setRetryStrategy(retryStrategy);
        return this;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates
     * your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum
     * value for the timeout is 60 seconds. Any timeout configuration that is specified during a <a>SubmitJob</a>
     * operation overrides the timeout configuration defined here. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/job_timeouts.html">Job Timeouts</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param timeout
     *        The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch
     *        terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not
     *        retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that is specified
     *        during a <a>SubmitJob</a> operation overrides the timeout configuration defined here. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/job_timeouts.html">Job Timeouts</a> in
     *        the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setTimeout(JobTimeout timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates
     * your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum
     * value for the timeout is 60 seconds. Any timeout configuration that is specified during a <a>SubmitJob</a>
     * operation overrides the timeout configuration defined here. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/job_timeouts.html">Job Timeouts</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch
     *         terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not
     *         retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that is specified
     *         during a <a>SubmitJob</a> operation overrides the timeout configuration defined here. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/job_timeouts.html">Job Timeouts</a> in
     *         the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public JobTimeout getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates
     * your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum
     * value for the timeout is 60 seconds. Any timeout configuration that is specified during a <a>SubmitJob</a>
     * operation overrides the timeout configuration defined here. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/job_timeouts.html">Job Timeouts</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param timeout
     *        The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch
     *        terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not
     *        retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that is specified
     *        during a <a>SubmitJob</a> operation overrides the timeout configuration defined here. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/job_timeouts.html">Job Timeouts</a> in
     *        the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withTimeout(JobTimeout timeout) {
        setTimeout(timeout);
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
        if (getJobDefinitionName() != null)
            sb.append("JobDefinitionName: ").append(getJobDefinitionName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getContainerProperties() != null)
            sb.append("ContainerProperties: ").append(getContainerProperties()).append(",");
        if (getNodeProperties() != null)
            sb.append("NodeProperties: ").append(getNodeProperties()).append(",");
        if (getRetryStrategy() != null)
            sb.append("RetryStrategy: ").append(getRetryStrategy()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterJobDefinitionRequest == false)
            return false;
        RegisterJobDefinitionRequest other = (RegisterJobDefinitionRequest) obj;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getContainerProperties() == null ^ this.getContainerProperties() == null)
            return false;
        if (other.getContainerProperties() != null && other.getContainerProperties().equals(this.getContainerProperties()) == false)
            return false;
        if (other.getNodeProperties() == null ^ this.getNodeProperties() == null)
            return false;
        if (other.getNodeProperties() != null && other.getNodeProperties().equals(this.getNodeProperties()) == false)
            return false;
        if (other.getRetryStrategy() == null ^ this.getRetryStrategy() == null)
            return false;
        if (other.getRetryStrategy() != null && other.getRetryStrategy().equals(this.getRetryStrategy()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobDefinitionName() == null) ? 0 : getJobDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getContainerProperties() == null) ? 0 : getContainerProperties().hashCode());
        hashCode = prime * hashCode + ((getNodeProperties() == null) ? 0 : getNodeProperties().hashCode());
        hashCode = prime * hashCode + ((getRetryStrategy() == null) ? 0 : getRetryStrategy().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public RegisterJobDefinitionRequest clone() {
        return (RegisterJobDefinitionRequest) super.clone();
    }

}
