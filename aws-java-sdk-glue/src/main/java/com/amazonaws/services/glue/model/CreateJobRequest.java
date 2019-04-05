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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you assign to this job definition. It must be unique in your account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the job being defined.
     * </p>
     */
    private String description;
    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * The name or ARN of the IAM role associated with this job.
     * </p>
     */
    private String role;
    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     */
    private ExecutionProperty executionProperty;
    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     */
    private JobCommand command;
    /**
     * <p>
     * The default arguments for this job.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> defaultArguments;
    /**
     * <p>
     * The connections used for this job.
     * </p>
     */
    private ConnectionsList connections;
    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     */
    private Integer maxRetries;
    /**
     * <p>
     * This parameter is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be allocated;
     * the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity
     * and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue
     * pricing page</a>.
     * </p>
     */
    @Deprecated
    private Integer allocatedCapacity;
    /**
     * <p>
     * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated
     * and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a python shell
     * job, or an Apache Spark ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either 0.0625
     * or 1 DPU. The default is 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl"), you can allocate from 2 to 100
     * DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     */
    private Double maxCapacity;
    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     */
    private NotificationProperty notificationProperty;
    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     */
    private String workerType;
    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this job.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the job. For more information about tags in
     * AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in
     * the developer guide.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name you assign to this job definition. It must be unique in your account.
     * </p>
     * 
     * @param name
     *        The name you assign to this job definition. It must be unique in your account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you assign to this job definition. It must be unique in your account.
     * </p>
     * 
     * @return The name you assign to this job definition. It must be unique in your account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you assign to this job definition. It must be unique in your account.
     * </p>
     * 
     * @param name
     *        The name you assign to this job definition. It must be unique in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * 
     * @param description
     *        Description of the job being defined.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * 
     * @return Description of the job being defined.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * 
     * @param description
     *        Description of the job being defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @param logUri
     *        This field is reserved for future use.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @return This field is reserved for future use.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @param logUri
     *        This field is reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the IAM role associated with this job.
     * </p>
     * 
     * @param role
     *        The name or ARN of the IAM role associated with this job.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or ARN of the IAM role associated with this job.
     * </p>
     * 
     * @return The name or ARN of the IAM role associated with this job.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name or ARN of the IAM role associated with this job.
     * </p>
     * 
     * @param role
     *        The name or ARN of the IAM role associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @param executionProperty
     *        An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     */

    public void setExecutionProperty(ExecutionProperty executionProperty) {
        this.executionProperty = executionProperty;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @return An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     */

    public ExecutionProperty getExecutionProperty() {
        return this.executionProperty;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @param executionProperty
     *        An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withExecutionProperty(ExecutionProperty executionProperty) {
        setExecutionProperty(executionProperty);
        return this;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @param command
     *        The JobCommand that executes this job.
     */

    public void setCommand(JobCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @return The JobCommand that executes this job.
     */

    public JobCommand getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @param command
     *        The JobCommand that executes this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withCommand(JobCommand command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The default arguments for this job.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @return The default arguments for this job.</p>
     *         <p>
     *         You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *         Glue itself consumes.
     *         </p>
     *         <p>
     *         For information about how to specify and consume your own Job arguments, see the <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS
     *         Glue APIs in Python</a> topic in the developer guide.
     *         </p>
     *         <p>
     *         For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *         Parameters Used by AWS Glue</a> topic in the developer guide.
     */

    public java.util.Map<String, String> getDefaultArguments() {
        return defaultArguments;
    }

    /**
     * <p>
     * The default arguments for this job.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @param defaultArguments
     *        The default arguments for this job.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *        Glue itself consumes.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own Job arguments, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by AWS Glue</a> topic in the developer guide.
     */

    public void setDefaultArguments(java.util.Map<String, String> defaultArguments) {
        this.defaultArguments = defaultArguments;
    }

    /**
     * <p>
     * The default arguments for this job.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @param defaultArguments
     *        The default arguments for this job.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *        Glue itself consumes.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own Job arguments, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by AWS Glue</a> topic in the developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDefaultArguments(java.util.Map<String, String> defaultArguments) {
        setDefaultArguments(defaultArguments);
        return this;
    }

    public CreateJobRequest addDefaultArgumentsEntry(String key, String value) {
        if (null == this.defaultArguments) {
            this.defaultArguments = new java.util.HashMap<String, String>();
        }
        if (this.defaultArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultArguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest clearDefaultArgumentsEntries() {
        this.defaultArguments = null;
        return this;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @param connections
     *        The connections used for this job.
     */

    public void setConnections(ConnectionsList connections) {
        this.connections = connections;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @return The connections used for this job.
     */

    public ConnectionsList getConnections() {
        return this.connections;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @param connections
     *        The connections used for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withConnections(ConnectionsList connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry this job if it fails.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     * 
     * @return The maximum number of times to retry this job if it fails.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry this job if it fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * This parameter is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be allocated;
     * the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity
     * and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue
     * pricing page</a>.
     * </p>
     * 
     * @param allocatedCapacity
     *        This parameter is deprecated. Use <code>MaxCapacity</code> instead.</p>
     *        <p>
     *        The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be
     *        allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of
     *        compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     */
    @Deprecated
    public void setAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    /**
     * <p>
     * This parameter is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be allocated;
     * the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity
     * and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue
     * pricing page</a>.
     * </p>
     * 
     * @return This parameter is deprecated. Use <code>MaxCapacity</code> instead.</p>
     *         <p>
     *         The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be
     *         allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of
     *         compute capacity and 16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     */
    @Deprecated
    public Integer getAllocatedCapacity() {
        return this.allocatedCapacity;
    }

    /**
     * <p>
     * This parameter is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be allocated;
     * the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity
     * and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue
     * pricing page</a>.
     * </p>
     * 
     * @param allocatedCapacity
     *        This parameter is deprecated. Use <code>MaxCapacity</code> instead.</p>
     *        <p>
     *        The number of AWS Glue data processing units (DPUs) to allocate to this Job. From 2 to 100 DPUs can be
     *        allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of
     *        compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public CreateJobRequest withAllocatedCapacity(Integer allocatedCapacity) {
        setAllocatedCapacity(allocatedCapacity);
        return this;
    }

    /**
     * <p>
     * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated
     * and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The job timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated
     * and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @return The job timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *         terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated
     * and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The job timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a python shell
     * job, or an Apache Spark ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either 0.0625
     * or 1 DPU. The default is 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl"), you can allocate from 2 to 100
     * DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxCapacity
     *        The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a
     *        relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For
     *        more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.</p>
     *        <p>
     *        Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *        </p>
     *        <p>
     *        The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a python
     *        shell job, or an Apache Spark ETL job:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify a python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either
     *        0.0625 or 1 DPU. The default is 0.0625 DPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl"), you can allocate from 2
     *        to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     *        </p>
     *        </li>
     */

    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a python shell
     * job, or an Apache Spark ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either 0.0625
     * or 1 DPU. The default is 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl"), you can allocate from 2 to 100
     * DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a
     *         relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory.
     *         For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *         page</a>.</p>
     *         <p>
     *         Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *         </p>
     *         <p>
     *         The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a python
     *         shell job, or an Apache Spark ETL job:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When you specify a python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either
     *         0.0625 or 1 DPU. The default is 0.0625 DPU.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl"), you can allocate from
     *         2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     *         </p>
     *         </li>
     */

    public Double getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a python shell
     * job, or an Apache Spark ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either 0.0625
     * or 1 DPU. The default is 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl"), you can allocate from 2 to 100
     * DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxCapacity
     *        The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a
     *        relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For
     *        more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.</p>
     *        <p>
     *        Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *        </p>
     *        <p>
     *        The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a python
     *        shell job, or an Apache Spark ETL job:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify a python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either
     *        0.0625 or 1 DPU. The default is 0.0625 DPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl"), you can allocate from 2
     *        to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     * 
     * @param notificationProperty
     *        Specifies configuration properties of a job notification.
     */

    public void setNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     * 
     * @return Specifies configuration properties of a job notification.
     */

    public NotificationProperty getNotificationProperty() {
        return this.notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     * 
     * @param notificationProperty
     *        Specifies configuration properties of a job notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withNotificationProperty(NotificationProperty notificationProperty) {
        setNotificationProperty(notificationProperty);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or
     *         G.2X.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *         and 2 executors per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and
     *         1 executor per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *         1 executor per worker.
     *         </p>
     *         </li>
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public CreateJobRequest withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1
     * executor per worker.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or
     *        G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1
     *        executor per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and
     *        1 executor per worker.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public CreateJobRequest withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated when a job runs.</p>
     *        <p>
     *        The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @return The number of workers of a defined <code>workerType</code> that are allocated when a job runs.</p>
     *         <p>
     *         The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated when a job runs.</p>
     *        <p>
     *        The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this job.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with this job.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this job.
     * </p>
     * 
     * @return The name of the SecurityConfiguration structure to be used with this job.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this job.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the job. For more information about tags in
     * AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in
     * the developer guide.
     * </p>
     * 
     * @return The tags to use with this job. You may use tags to limit access to the job. For more information about
     *         tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in
     *         AWS Glue</a> in the developer guide.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the job. For more information about tags in
     * AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in
     * the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this job. You may use tags to limit access to the job. For more information about
     *        tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in
     *        AWS Glue</a> in the developer guide.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the job. For more information about tags in
     * AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in
     * the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this job. You may use tags to limit access to the job. For more information about
     *        tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in
     *        AWS Glue</a> in the developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLogUri() != null)
            sb.append("LogUri: ").append(getLogUri()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getExecutionProperty() != null)
            sb.append("ExecutionProperty: ").append(getExecutionProperty()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getDefaultArguments() != null)
            sb.append("DefaultArguments: ").append(getDefaultArguments()).append(",");
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries()).append(",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: ").append(getAllocatedCapacity()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: ").append(getNotificationProperty()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getExecutionProperty() == null ^ this.getExecutionProperty() == null)
            return false;
        if (other.getExecutionProperty() != null && other.getExecutionProperty().equals(this.getExecutionProperty()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getDefaultArguments() == null ^ this.getDefaultArguments() == null)
            return false;
        if (other.getDefaultArguments() != null && other.getDefaultArguments().equals(this.getDefaultArguments()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getAllocatedCapacity() == null ^ this.getAllocatedCapacity() == null)
            return false;
        if (other.getAllocatedCapacity() != null && other.getAllocatedCapacity().equals(this.getAllocatedCapacity()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getNotificationProperty() == null ^ this.getNotificationProperty() == null)
            return false;
        if (other.getNotificationProperty() != null && other.getNotificationProperty().equals(this.getNotificationProperty()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getExecutionProperty() == null) ? 0 : getExecutionProperty().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getDefaultArguments() == null) ? 0 : getDefaultArguments().hashCode());
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}
