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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartJobRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job definition to use.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The ID of a previous JobRun to retry.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * The job arguments specifically for this run. For this job run, they replace the default arguments set in the job
     * definition itself.
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
    private java.util.Map<String, String> arguments;
    /**
     * <p>
     * This field is deprecated, use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     */
    @Deprecated
    private Integer allocatedCapacity;
    /**
     * <p>
     * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides the
     * timeout value set in the parent job.
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
     * The name of the SecurityConfiguration structure to be used with this job run.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     */
    private NotificationProperty notificationProperty;

    /**
     * <p>
     * The name of the job definition to use.
     * </p>
     * 
     * @param jobName
     *        The name of the job definition to use.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job definition to use.
     * </p>
     * 
     * @return The name of the job definition to use.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job definition to use.
     * </p>
     * 
     * @param jobName
     *        The name of the job definition to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The ID of a previous JobRun to retry.
     * </p>
     * 
     * @param jobRunId
     *        The ID of a previous JobRun to retry.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The ID of a previous JobRun to retry.
     * </p>
     * 
     * @return The ID of a previous JobRun to retry.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The ID of a previous JobRun to retry.
     * </p>
     * 
     * @param jobRunId
     *        The ID of a previous JobRun to retry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * The job arguments specifically for this run. For this job run, they replace the default arguments set in the job
     * definition itself.
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
     * @return The job arguments specifically for this run. For this job run, they replace the default arguments set in
     *         the job definition itself.</p>
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

    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * The job arguments specifically for this run. For this job run, they replace the default arguments set in the job
     * definition itself.
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
     * @param arguments
     *        The job arguments specifically for this run. For this job run, they replace the default arguments set in
     *        the job definition itself.</p>
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

    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * The job arguments specifically for this run. For this job run, they replace the default arguments set in the job
     * definition itself.
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
     * @param arguments
     *        The job arguments specifically for this run. For this job run, they replace the default arguments set in
     *        the job definition itself.</p>
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

    public StartJobRunRequest withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    public StartJobRunRequest addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest clearArgumentsEntries() {
        this.arguments = null;
        return this;
    }

    /**
     * <p>
     * This field is deprecated, use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @param allocatedCapacity
     *        This field is deprecated, use <code>MaxCapacity</code> instead.</p>
     *        <p>
     *        The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be
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
     * This field is deprecated, use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @return This field is deprecated, use <code>MaxCapacity</code> instead.</p>
     *         <p>
     *         The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be
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
     * This field is deprecated, use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @param allocatedCapacity
     *        This field is deprecated, use <code>MaxCapacity</code> instead.</p>
     *        <p>
     *        The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be
     *        allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of
     *        compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public StartJobRunRequest withAllocatedCapacity(Integer allocatedCapacity) {
        setAllocatedCapacity(allocatedCapacity);
        return this;
    }

    /**
     * <p>
     * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides the
     * timeout value set in the parent job.
     * </p>
     * 
     * @param timeout
     *        The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides
     *        the timeout value set in the parent job.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides the
     * timeout value set in the parent job.
     * </p>
     * 
     * @return The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *         terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This
     *         overrides the timeout value set in the parent job.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides the
     * timeout value set in the parent job.
     * </p>
     * 
     * @param timeout
     *        The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours). This overrides
     *        the timeout value set in the parent job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withTimeout(Integer timeout) {
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

    public StartJobRunRequest withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
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

    public StartJobRunRequest withWorkerType(String workerType) {
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

    public StartJobRunRequest withWorkerType(WorkerType workerType) {
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

    public StartJobRunRequest withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this job run.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with this job run.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this job run.
     * </p>
     * 
     * @return The name of the SecurityConfiguration structure to be used with this job run.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this job run.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with this job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     * 
     * @param notificationProperty
     *        Specifies configuration properties of a job run notification.
     */

    public void setNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     * 
     * @return Specifies configuration properties of a job run notification.
     */

    public NotificationProperty getNotificationProperty() {
        return this.notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     * 
     * @param notificationProperty
     *        Specifies configuration properties of a job run notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withNotificationProperty(NotificationProperty notificationProperty) {
        setNotificationProperty(notificationProperty);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId()).append(",");
        if (getArguments() != null)
            sb.append("Arguments: ").append(getArguments()).append(",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: ").append(getAllocatedCapacity()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: ").append(getNotificationProperty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobRunRequest == false)
            return false;
        StartJobRunRequest other = (StartJobRunRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null && other.getArguments().equals(this.getArguments()) == false)
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
        if (other.getNotificationProperty() == null ^ this.getNotificationProperty() == null)
            return false;
        if (other.getNotificationProperty() != null && other.getNotificationProperty().equals(this.getNotificationProperty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        hashCode = prime * hashCode + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        return hashCode;
    }

    @Override
    public StartJobRunRequest clone() {
        return (StartJobRunRequest) super.clone();
    }

}
