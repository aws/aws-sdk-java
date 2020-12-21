/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Contains the parameters for <code>RegisterJobDefinition</code>.
 * </p>
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
     * The type of job definition. For more information about multi-node parallel jobs, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node parallel
     * job definition</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use only
     * <code>containerProperties</code>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use
     * <code>containerProperties</code> instead.
     * </p>
     * </note>
     */
    private NodeProperties nodeProperties;
    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that's
     * specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job is terminated
     * due to a timeout, it isn't retried.
     * </p>
     */
    private RetryStrategy retryStrategy;
    /**
     * <p>
     * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks during task
     * creation. For tags with the same name, job tags are given priority over job definitions tags. If the total number
     * of combined tags from the job and job definition is over 50, the job is moved to the <code>FAILED</code> state.
     * </p>
     */
    private Boolean propagateTags;
    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates
     * your jobs if they have not finished. If a job is terminated due to a timeout, it isn't retried. The minimum value
     * for the timeout is 60 seconds. Any timeout configuration that's specified during a <a>SubmitJob</a> operation
     * overrides the timeout configuration defined here. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/job_timeouts.html">Job Timeouts</a> in the <i>AWS Batch
     * User Guide</i>.
     * </p>
     */
    private JobTimeout timeout;
    /**
     * <p>
     * The tags that you apply to the job definition to help you categorize and organize your resources. Each tag
     * consists of a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging AWS Resources</a> in <i>AWS
     * Batch User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The platform capabilities required by the job definition. If no value is specified, it defaults to
     * <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * </p>
     */
    private java.util.List<String> platformCapabilities;

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
     * The type of job definition. For more information about multi-node parallel jobs, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node parallel
     * job definition</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of job definition. For more information about multi-node parallel jobs, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node
     *        parallel job definition</a> in the <i>AWS Batch User Guide</i>.</p> <note>
     *        <p>
     *        If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     *        </p>
     * @see JobDefinitionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of job definition. For more information about multi-node parallel jobs, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node parallel
     * job definition</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     * </p>
     * </note>
     * 
     * @return The type of job definition. For more information about multi-node parallel jobs, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node
     *         parallel job definition</a> in the <i>AWS Batch User Guide</i>.</p> <note>
     *         <p>
     *         If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     *         </p>
     * @see JobDefinitionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of job definition. For more information about multi-node parallel jobs, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node parallel
     * job definition</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of job definition. For more information about multi-node parallel jobs, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node
     *        parallel job definition</a> in the <i>AWS Batch User Guide</i>.</p> <note>
     *        <p>
     *        If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobDefinitionType
     */

    public RegisterJobDefinitionRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of job definition. For more information about multi-node parallel jobs, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node parallel
     * job definition</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of job definition. For more information about multi-node parallel jobs, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node
     *        parallel job definition</a> in the <i>AWS Batch User Guide</i>.</p> <note>
     *        <p>
     *        If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     *        </p>
     * @see JobDefinitionType
     */

    public void setType(JobDefinitionType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of job definition. For more information about multi-node parallel jobs, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node parallel
     * job definition</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of job definition. For more information about multi-node parallel jobs, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-job-def.html">Creating a multi-node
     *        parallel job definition</a> in the <i>AWS Batch User Guide</i>.</p> <note>
     *        <p>
     *        If the job is run on Fargate resources, then <code>multinode</code> isn't supported.
     *        </p>
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

    /**
     * Add a single Parameters entry
     *
     * @see RegisterJobDefinitionRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * <note>
     * <p>
     * If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use only
     * <code>containerProperties</code>.
     * </p>
     * </note>
     * 
     * @param containerProperties
     *        An object with various properties specific to single-node container-based jobs. If the job definition's
     *        <code>type</code> parameter is <code>container</code>, then you must specify either
     *        <code>containerProperties</code> or <code>nodeProperties</code>.</p> <note>
     *        <p>
     *        If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use only
     *        <code>containerProperties</code>.
     *        </p>
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
     * <note>
     * <p>
     * If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use only
     * <code>containerProperties</code>.
     * </p>
     * </note>
     * 
     * @return An object with various properties specific to single-node container-based jobs. If the job definition's
     *         <code>type</code> parameter is <code>container</code>, then you must specify either
     *         <code>containerProperties</code> or <code>nodeProperties</code>.</p> <note>
     *         <p>
     *         If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use only
     *         <code>containerProperties</code>.
     *         </p>
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
     * <note>
     * <p>
     * If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use only
     * <code>containerProperties</code>.
     * </p>
     * </note>
     * 
     * @param containerProperties
     *        An object with various properties specific to single-node container-based jobs. If the job definition's
     *        <code>type</code> parameter is <code>container</code>, then you must specify either
     *        <code>containerProperties</code> or <code>nodeProperties</code>.</p> <note>
     *        <p>
     *        If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use only
     *        <code>containerProperties</code>.
     *        </p>
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
     * <note>
     * <p>
     * If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use
     * <code>containerProperties</code> instead.
     * </p>
     * </note>
     * 
     * @param nodeProperties
     *        An object with various properties specific to multi-node parallel jobs. If you specify node properties for
     *        a job, it becomes a multi-node parallel job. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node
     *        Parallel Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter
     *        is <code>container</code>, then you must specify either <code>containerProperties</code> or
     *        <code>nodeProperties</code>.</p> <note>
     *        <p>
     *        If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use
     *        <code>containerProperties</code> instead.
     *        </p>
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
     * <note>
     * <p>
     * If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use
     * <code>containerProperties</code> instead.
     * </p>
     * </note>
     * 
     * @return An object with various properties specific to multi-node parallel jobs. If you specify node properties
     *         for a job, it becomes a multi-node parallel job. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node
     *         Parallel Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter
     *         is <code>container</code>, then you must specify either <code>containerProperties</code> or
     *         <code>nodeProperties</code>.</p> <note>
     *         <p>
     *         If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use
     *         <code>containerProperties</code> instead.
     *         </p>
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
     * <note>
     * <p>
     * If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use
     * <code>containerProperties</code> instead.
     * </p>
     * </note>
     * 
     * @param nodeProperties
     *        An object with various properties specific to multi-node parallel jobs. If you specify node properties for
     *        a job, it becomes a multi-node parallel job. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/multi-node-parallel-jobs.html">Multi-node
     *        Parallel Jobs</a> in the <i>AWS Batch User Guide</i>. If the job definition's <code>type</code> parameter
     *        is <code>container</code>, then you must specify either <code>containerProperties</code> or
     *        <code>nodeProperties</code>.</p> <note>
     *        <p>
     *        If the job runs on Fargate resources, then you must not specify <code>nodeProperties</code>; use
     *        <code>containerProperties</code> instead.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withNodeProperties(NodeProperties nodeProperties) {
        setNodeProperties(nodeProperties);
        return this;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that's
     * specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job is terminated
     * due to a timeout, it isn't retried.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy
     *        that's specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job
     *        is terminated due to a timeout, it isn't retried.
     */

    public void setRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that's
     * specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job is terminated
     * due to a timeout, it isn't retried.
     * </p>
     * 
     * @return The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy
     *         that's specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job
     *         is terminated due to a timeout, it isn't retried.
     */

    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that's
     * specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job is terminated
     * due to a timeout, it isn't retried.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy
     *        that's specified during a <a>SubmitJob</a> operation overrides the retry strategy defined here. If a job
     *        is terminated due to a timeout, it isn't retried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withRetryStrategy(RetryStrategy retryStrategy) {
        setRetryStrategy(retryStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks during task
     * creation. For tags with the same name, job tags are given priority over job definitions tags. If the total number
     * of combined tags from the job and job definition is over 50, the job is moved to the <code>FAILED</code> state.
     * </p>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS
     *        task. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks
     *        during task creation. For tags with the same name, job tags are given priority over job definitions tags.
     *        If the total number of combined tags from the job and job definition is over 50, the job is moved to the
     *        <code>FAILED</code> state.
     */

    public void setPropagateTags(Boolean propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks during task
     * creation. For tags with the same name, job tags are given priority over job definitions tags. If the total number
     * of combined tags from the job and job definition is over 50, the job is moved to the <code>FAILED</code> state.
     * </p>
     * 
     * @return Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS
     *         task. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks
     *         during task creation. For tags with the same name, job tags are given priority over job definitions tags.
     *         If the total number of combined tags from the job and job definition is over 50, the job is moved to the
     *         <code>FAILED</code> state.
     */

    public Boolean getPropagateTags() {
        return this.propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks during task
     * creation. For tags with the same name, job tags are given priority over job definitions tags. If the total number
     * of combined tags from the job and job definition is over 50, the job is moved to the <code>FAILED</code> state.
     * </p>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS
     *        task. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks
     *        during task creation. For tags with the same name, job tags are given priority over job definitions tags.
     *        If the total number of combined tags from the job and job definition is over 50, the job is moved to the
     *        <code>FAILED</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withPropagateTags(Boolean propagateTags) {
        setPropagateTags(propagateTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks during task
     * creation. For tags with the same name, job tags are given priority over job definitions tags. If the total number
     * of combined tags from the job and job definition is over 50, the job is moved to the <code>FAILED</code> state.
     * </p>
     * 
     * @return Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS
     *         task. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks
     *         during task creation. For tags with the same name, job tags are given priority over job definitions tags.
     *         If the total number of combined tags from the job and job definition is over 50, the job is moved to the
     *         <code>FAILED</code> state.
     */

    public Boolean isPropagateTags() {
        return this.propagateTags;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates
     * your jobs if they have not finished. If a job is terminated due to a timeout, it isn't retried. The minimum value
     * for the timeout is 60 seconds. Any timeout configuration that's specified during a <a>SubmitJob</a> operation
     * overrides the timeout configuration defined here. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/job_timeouts.html">Job Timeouts</a> in the <i>AWS Batch
     * User Guide</i>.
     * </p>
     * 
     * @param timeout
     *        The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch
     *        terminates your jobs if they have not finished. If a job is terminated due to a timeout, it isn't retried.
     *        The minimum value for the timeout is 60 seconds. Any timeout configuration that's specified during a
     *        <a>SubmitJob</a> operation overrides the timeout configuration defined here. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/job_timeouts.html">Job Timeouts</a> in the <i>AWS
     *        Batch User Guide</i>.
     */

    public void setTimeout(JobTimeout timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates
     * your jobs if they have not finished. If a job is terminated due to a timeout, it isn't retried. The minimum value
     * for the timeout is 60 seconds. Any timeout configuration that's specified during a <a>SubmitJob</a> operation
     * overrides the timeout configuration defined here. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/job_timeouts.html">Job Timeouts</a> in the <i>AWS Batch
     * User Guide</i>.
     * </p>
     * 
     * @return The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch
     *         terminates your jobs if they have not finished. If a job is terminated due to a timeout, it isn't
     *         retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that's specified
     *         during a <a>SubmitJob</a> operation overrides the timeout configuration defined here. For more
     *         information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/job_timeouts.html">Job
     *         Timeouts</a> in the <i>AWS Batch User Guide</i>.
     */

    public JobTimeout getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates
     * your jobs if they have not finished. If a job is terminated due to a timeout, it isn't retried. The minimum value
     * for the timeout is 60 seconds. Any timeout configuration that's specified during a <a>SubmitJob</a> operation
     * overrides the timeout configuration defined here. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/job_timeouts.html">Job Timeouts</a> in the <i>AWS Batch
     * User Guide</i>.
     * </p>
     * 
     * @param timeout
     *        The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch
     *        terminates your jobs if they have not finished. If a job is terminated due to a timeout, it isn't retried.
     *        The minimum value for the timeout is 60 seconds. Any timeout configuration that's specified during a
     *        <a>SubmitJob</a> operation overrides the timeout configuration defined here. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/job_timeouts.html">Job Timeouts</a> in the <i>AWS
     *        Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withTimeout(JobTimeout timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The tags that you apply to the job definition to help you categorize and organize your resources. Each tag
     * consists of a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging AWS Resources</a> in <i>AWS
     * Batch User Guide</i>.
     * </p>
     * 
     * @return The tags that you apply to the job definition to help you categorize and organize your resources. Each
     *         tag consists of a key and an optional value. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging AWS Resources</a> in
     *         <i>AWS Batch User Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that you apply to the job definition to help you categorize and organize your resources. Each tag
     * consists of a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging AWS Resources</a> in <i>AWS
     * Batch User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags that you apply to the job definition to help you categorize and organize your resources. Each tag
     *        consists of a key and an optional value. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging AWS Resources</a> in
     *        <i>AWS Batch User Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that you apply to the job definition to help you categorize and organize your resources. Each tag
     * consists of a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging AWS Resources</a> in <i>AWS
     * Batch User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags that you apply to the job definition to help you categorize and organize your resources. Each tag
     *        consists of a key and an optional value. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging AWS Resources</a> in
     *        <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RegisterJobDefinitionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RegisterJobDefinitionRequest addTagsEntry(String key, String value) {
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

    public RegisterJobDefinitionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The platform capabilities required by the job definition. If no value is specified, it defaults to
     * <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * </p>
     * 
     * @return The platform capabilities required by the job definition. If no value is specified, it defaults to
     *         <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * @see PlatformCapability
     */

    public java.util.List<String> getPlatformCapabilities() {
        return platformCapabilities;
    }

    /**
     * <p>
     * The platform capabilities required by the job definition. If no value is specified, it defaults to
     * <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * </p>
     * 
     * @param platformCapabilities
     *        The platform capabilities required by the job definition. If no value is specified, it defaults to
     *        <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * @see PlatformCapability
     */

    public void setPlatformCapabilities(java.util.Collection<String> platformCapabilities) {
        if (platformCapabilities == null) {
            this.platformCapabilities = null;
            return;
        }

        this.platformCapabilities = new java.util.ArrayList<String>(platformCapabilities);
    }

    /**
     * <p>
     * The platform capabilities required by the job definition. If no value is specified, it defaults to
     * <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformCapabilities(java.util.Collection)} or {@link #withPlatformCapabilities(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param platformCapabilities
     *        The platform capabilities required by the job definition. If no value is specified, it defaults to
     *        <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformCapability
     */

    public RegisterJobDefinitionRequest withPlatformCapabilities(String... platformCapabilities) {
        if (this.platformCapabilities == null) {
            setPlatformCapabilities(new java.util.ArrayList<String>(platformCapabilities.length));
        }
        for (String ele : platformCapabilities) {
            this.platformCapabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The platform capabilities required by the job definition. If no value is specified, it defaults to
     * <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * </p>
     * 
     * @param platformCapabilities
     *        The platform capabilities required by the job definition. If no value is specified, it defaults to
     *        <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformCapability
     */

    public RegisterJobDefinitionRequest withPlatformCapabilities(java.util.Collection<String> platformCapabilities) {
        setPlatformCapabilities(platformCapabilities);
        return this;
    }

    /**
     * <p>
     * The platform capabilities required by the job definition. If no value is specified, it defaults to
     * <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * </p>
     * 
     * @param platformCapabilities
     *        The platform capabilities required by the job definition. If no value is specified, it defaults to
     *        <code>EC2</code>. To run the job on Fargate resources, specify <code>FARGATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformCapability
     */

    public RegisterJobDefinitionRequest withPlatformCapabilities(PlatformCapability... platformCapabilities) {
        java.util.ArrayList<String> platformCapabilitiesCopy = new java.util.ArrayList<String>(platformCapabilities.length);
        for (PlatformCapability value : platformCapabilities) {
            platformCapabilitiesCopy.add(value.toString());
        }
        if (getPlatformCapabilities() == null) {
            setPlatformCapabilities(platformCapabilitiesCopy);
        } else {
            getPlatformCapabilities().addAll(platformCapabilitiesCopy);
        }
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
        if (getPropagateTags() != null)
            sb.append("PropagateTags: ").append(getPropagateTags()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPlatformCapabilities() != null)
            sb.append("PlatformCapabilities: ").append(getPlatformCapabilities());
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
        if (other.getPropagateTags() == null ^ this.getPropagateTags() == null)
            return false;
        if (other.getPropagateTags() != null && other.getPropagateTags().equals(this.getPropagateTags()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPlatformCapabilities() == null ^ this.getPlatformCapabilities() == null)
            return false;
        if (other.getPlatformCapabilities() != null && other.getPlatformCapabilities().equals(this.getPlatformCapabilities()) == false)
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
        hashCode = prime * hashCode + ((getPropagateTags() == null) ? 0 : getPropagateTags().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPlatformCapabilities() == null) ? 0 : getPlatformCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public RegisterJobDefinitionRequest clone() {
        return (RegisterJobDefinitionRequest) super.clone();
    }

}
