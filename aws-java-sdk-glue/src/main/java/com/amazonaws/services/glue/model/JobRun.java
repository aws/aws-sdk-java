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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a job run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/JobRun" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of this job run.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The number of the attempt to run this job.
     * </p>
     */
    private Integer attempt;
    /**
     * <p>
     * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
     * </p>
     */
    private String previousRunId;
    /**
     * <p>
     * The name of the trigger that started this job run.
     * </p>
     */
    private String triggerName;
    /**
     * <p>
     * The name of the job definition being used in this run.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The date and time at which this job run was started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The last time this job run was modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * The date and time this job run completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The current state of the job run.
     * </p>
     */
    private String jobRunState;
    /**
     * <p>
     * The job arguments associated with this run. For this job run, they replace the default arguments set in the job
     * definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments, see the <a
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
     * An error message associated with this job run.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     */
    private java.util.List<Predecessor> predecessorRuns;
    /**
     * <p>
     * This field is deprecated, use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     */
    @Deprecated
    private Integer allocatedCapacity;
    /**
     * <p>
     * The amount of time (in seconds) that the job run consumed resources.
     * </p>
     */
    private Integer executionTime;
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
     * Specifies configuration properties of a job run notification.
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
     * The name of the SecurityConfiguration structure to be used with this job run.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * The name of the log group for secure logging, that can be server-side encrypted in CloudWatch using KMS. This
     * name can be <code>/aws-glue/jobs/</code>, in which case the default encryption is <code>NONE</code>. If you add a
     * role name and SecurityConfiguration name (in other words,
     * <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>), then that security configuration will
     * be used to encrypt the log group.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * The ID of this job run.
     * </p>
     * 
     * @param id
     *        The ID of this job run.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of this job run.
     * </p>
     * 
     * @return The ID of this job run.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of this job run.
     * </p>
     * 
     * @param id
     *        The ID of this job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The number of the attempt to run this job.
     * </p>
     * 
     * @param attempt
     *        The number of the attempt to run this job.
     */

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * <p>
     * The number of the attempt to run this job.
     * </p>
     * 
     * @return The number of the attempt to run this job.
     */

    public Integer getAttempt() {
        return this.attempt;
    }

    /**
     * <p>
     * The number of the attempt to run this job.
     * </p>
     * 
     * @param attempt
     *        The number of the attempt to run this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withAttempt(Integer attempt) {
        setAttempt(attempt);
        return this;
    }

    /**
     * <p>
     * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
     * </p>
     * 
     * @param previousRunId
     *        The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
     */

    public void setPreviousRunId(String previousRunId) {
        this.previousRunId = previousRunId;
    }

    /**
     * <p>
     * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
     * </p>
     * 
     * @return The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
     */

    public String getPreviousRunId() {
        return this.previousRunId;
    }

    /**
     * <p>
     * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
     * </p>
     * 
     * @param previousRunId
     *        The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withPreviousRunId(String previousRunId) {
        setPreviousRunId(previousRunId);
        return this;
    }

    /**
     * <p>
     * The name of the trigger that started this job run.
     * </p>
     * 
     * @param triggerName
     *        The name of the trigger that started this job run.
     */

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * <p>
     * The name of the trigger that started this job run.
     * </p>
     * 
     * @return The name of the trigger that started this job run.
     */

    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * <p>
     * The name of the trigger that started this job run.
     * </p>
     * 
     * @param triggerName
     *        The name of the trigger that started this job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withTriggerName(String triggerName) {
        setTriggerName(triggerName);
        return this;
    }

    /**
     * <p>
     * The name of the job definition being used in this run.
     * </p>
     * 
     * @param jobName
     *        The name of the job definition being used in this run.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job definition being used in this run.
     * </p>
     * 
     * @return The name of the job definition being used in this run.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job definition being used in this run.
     * </p>
     * 
     * @param jobName
     *        The name of the job definition being used in this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The date and time at which this job run was started.
     * </p>
     * 
     * @param startedOn
     *        The date and time at which this job run was started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time at which this job run was started.
     * </p>
     * 
     * @return The date and time at which this job run was started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time at which this job run was started.
     * </p>
     * 
     * @param startedOn
     *        The date and time at which this job run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The last time this job run was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The last time this job run was modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The last time this job run was modified.
     * </p>
     * 
     * @return The last time this job run was modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The last time this job run was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The last time this job run was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * The date and time this job run completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time this job run completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time this job run completed.
     * </p>
     * 
     * @return The date and time this job run completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time this job run completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time this job run completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * 
     * @param jobRunState
     *        The current state of the job run.
     * @see JobRunState
     */

    public void setJobRunState(String jobRunState) {
        this.jobRunState = jobRunState;
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * 
     * @return The current state of the job run.
     * @see JobRunState
     */

    public String getJobRunState() {
        return this.jobRunState;
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * 
     * @param jobRunState
     *        The current state of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public JobRun withJobRunState(String jobRunState) {
        setJobRunState(jobRunState);
        return this;
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * 
     * @param jobRunState
     *        The current state of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public JobRun withJobRunState(JobRunState jobRunState) {
        this.jobRunState = jobRunState.toString();
        return this;
    }

    /**
     * <p>
     * The job arguments associated with this run. For this job run, they replace the default arguments set in the job
     * definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue APIs
     * in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * 
     * @return The job arguments associated with this run. For this job run, they replace the default arguments set in
     *         the job definition itself.</p>
     *         <p>
     *         You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *         Glue itself consumes.
     *         </p>
     *         <p>
     *         For information about how to specify and consume your own job arguments, see the <a
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
     * The job arguments associated with this run. For this job run, they replace the default arguments set in the job
     * definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments, see the <a
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
     *        The job arguments associated with this run. For this job run, they replace the default arguments set in
     *        the job definition itself.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *        Glue itself consumes.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own job arguments, see the <a
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
     * The job arguments associated with this run. For this job run, they replace the default arguments set in the job
     * definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue
     * itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments, see the <a
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
     *        The job arguments associated with this run. For this job run, they replace the default arguments set in
     *        the job definition itself.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS
     *        Glue itself consumes.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own job arguments, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling AWS Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the key-value pairs that AWS Glue consumes to set up your job, see the <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by AWS Glue</a> topic in the developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    public JobRun addArgumentsEntry(String key, String value) {
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

    public JobRun clearArgumentsEntries() {
        this.arguments = null;
        return this;
    }

    /**
     * <p>
     * An error message associated with this job run.
     * </p>
     * 
     * @param errorMessage
     *        An error message associated with this job run.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message associated with this job run.
     * </p>
     * 
     * @return An error message associated with this job run.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message associated with this job run.
     * </p>
     * 
     * @param errorMessage
     *        An error message associated with this job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     * 
     * @return A list of predecessors to this job run.
     */

    public java.util.List<Predecessor> getPredecessorRuns() {
        return predecessorRuns;
    }

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     * 
     * @param predecessorRuns
     *        A list of predecessors to this job run.
     */

    public void setPredecessorRuns(java.util.Collection<Predecessor> predecessorRuns) {
        if (predecessorRuns == null) {
            this.predecessorRuns = null;
            return;
        }

        this.predecessorRuns = new java.util.ArrayList<Predecessor>(predecessorRuns);
    }

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredecessorRuns(java.util.Collection)} or {@link #withPredecessorRuns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param predecessorRuns
     *        A list of predecessors to this job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withPredecessorRuns(Predecessor... predecessorRuns) {
        if (this.predecessorRuns == null) {
            setPredecessorRuns(new java.util.ArrayList<Predecessor>(predecessorRuns.length));
        }
        for (Predecessor ele : predecessorRuns) {
            this.predecessorRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     * 
     * @param predecessorRuns
     *        A list of predecessors to this job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withPredecessorRuns(java.util.Collection<Predecessor> predecessorRuns) {
        setPredecessorRuns(predecessorRuns);
        return this;
    }

    /**
     * <p>
     * This field is deprecated, use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @param allocatedCapacity
     *        This field is deprecated, use <code>MaxCapacity</code> instead.</p>
     *        <p>
     *        The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be
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
     * The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @return This field is deprecated, use <code>MaxCapacity</code> instead.</p>
     *         <p>
     *         The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be
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
     * The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be
     * allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * 
     * @param allocatedCapacity
     *        This field is deprecated, use <code>MaxCapacity</code> instead.</p>
     *        <p>
     *        The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be
     *        allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of
     *        compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public JobRun withAllocatedCapacity(Integer allocatedCapacity) {
        setAllocatedCapacity(allocatedCapacity);
        return this;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the job run consumed resources.
     * </p>
     * 
     * @param executionTime
     *        The amount of time (in seconds) that the job run consumed resources.
     */

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the job run consumed resources.
     * </p>
     * 
     * @return The amount of time (in seconds) that the job run consumed resources.
     */

    public Integer getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the job run consumed resources.
     * </p>
     * 
     * @param executionTime
     *        The amount of time (in seconds) that the job run consumed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withExecutionTime(Integer executionTime) {
        setExecutionTime(executionTime);
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

    public JobRun withTimeout(Integer timeout) {
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

    public JobRun withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
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

    public JobRun withNotificationProperty(NotificationProperty notificationProperty) {
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

    public JobRun withWorkerType(String workerType) {
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

    public JobRun withWorkerType(WorkerType workerType) {
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

    public JobRun withNumberOfWorkers(Integer numberOfWorkers) {
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

    public JobRun withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the log group for secure logging, that can be server-side encrypted in CloudWatch using KMS. This
     * name can be <code>/aws-glue/jobs/</code>, in which case the default encryption is <code>NONE</code>. If you add a
     * role name and SecurityConfiguration name (in other words,
     * <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>), then that security configuration will
     * be used to encrypt the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group for secure logging, that can be server-side encrypted in CloudWatch using KMS.
     *        This name can be <code>/aws-glue/jobs/</code>, in which case the default encryption is <code>NONE</code>.
     *        If you add a role name and SecurityConfiguration name (in other words,
     *        <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>), then that security configuration
     *        will be used to encrypt the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group for secure logging, that can be server-side encrypted in CloudWatch using KMS. This
     * name can be <code>/aws-glue/jobs/</code>, in which case the default encryption is <code>NONE</code>. If you add a
     * role name and SecurityConfiguration name (in other words,
     * <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>), then that security configuration will
     * be used to encrypt the log group.
     * </p>
     * 
     * @return The name of the log group for secure logging, that can be server-side encrypted in CloudWatch using KMS.
     *         This name can be <code>/aws-glue/jobs/</code>, in which case the default encryption is <code>NONE</code>.
     *         If you add a role name and SecurityConfiguration name (in other words,
     *         <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>), then that security
     *         configuration will be used to encrypt the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group for secure logging, that can be server-side encrypted in CloudWatch using KMS. This
     * name can be <code>/aws-glue/jobs/</code>, in which case the default encryption is <code>NONE</code>. If you add a
     * role name and SecurityConfiguration name (in other words,
     * <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>), then that security configuration will
     * be used to encrypt the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group for secure logging, that can be server-side encrypted in CloudWatch using KMS.
     *        This name can be <code>/aws-glue/jobs/</code>, in which case the default encryption is <code>NONE</code>.
     *        If you add a role name and SecurityConfiguration name (in other words,
     *        <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>), then that security configuration
     *        will be used to encrypt the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAttempt() != null)
            sb.append("Attempt: ").append(getAttempt()).append(",");
        if (getPreviousRunId() != null)
            sb.append("PreviousRunId: ").append(getPreviousRunId()).append(",");
        if (getTriggerName() != null)
            sb.append("TriggerName: ").append(getTriggerName()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getJobRunState() != null)
            sb.append("JobRunState: ").append(getJobRunState()).append(",");
        if (getArguments() != null)
            sb.append("Arguments: ").append(getArguments()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getPredecessorRuns() != null)
            sb.append("PredecessorRuns: ").append(getPredecessorRuns()).append(",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: ").append(getAllocatedCapacity()).append(",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime()).append(",");
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobRun == false)
            return false;
        JobRun other = (JobRun) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAttempt() == null ^ this.getAttempt() == null)
            return false;
        if (other.getAttempt() != null && other.getAttempt().equals(this.getAttempt()) == false)
            return false;
        if (other.getPreviousRunId() == null ^ this.getPreviousRunId() == null)
            return false;
        if (other.getPreviousRunId() != null && other.getPreviousRunId().equals(this.getPreviousRunId()) == false)
            return false;
        if (other.getTriggerName() == null ^ this.getTriggerName() == null)
            return false;
        if (other.getTriggerName() != null && other.getTriggerName().equals(this.getTriggerName()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getJobRunState() == null ^ this.getJobRunState() == null)
            return false;
        if (other.getJobRunState() != null && other.getJobRunState().equals(this.getJobRunState()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null && other.getArguments().equals(this.getArguments()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getPredecessorRuns() == null ^ this.getPredecessorRuns() == null)
            return false;
        if (other.getPredecessorRuns() != null && other.getPredecessorRuns().equals(this.getPredecessorRuns()) == false)
            return false;
        if (other.getAllocatedCapacity() == null ^ this.getAllocatedCapacity() == null)
            return false;
        if (other.getAllocatedCapacity() != null && other.getAllocatedCapacity().equals(this.getAllocatedCapacity()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
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
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAttempt() == null) ? 0 : getAttempt().hashCode());
        hashCode = prime * hashCode + ((getPreviousRunId() == null) ? 0 : getPreviousRunId().hashCode());
        hashCode = prime * hashCode + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getJobRunState() == null) ? 0 : getJobRunState().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getPredecessorRuns() == null) ? 0 : getPredecessorRuns().hashCode());
        hashCode = prime * hashCode + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        return hashCode;
    }

    @Override
    public JobRun clone() {
        try {
            return (JobRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JobRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
