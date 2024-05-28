/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a job definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Job" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name you assign to this job definition.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the job.
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
     * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The time and date that this job definition was created.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * The last point in time when this job definition was modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * An <code>ExecutionProperty</code> specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     */
    private ExecutionProperty executionProperty;
    /**
     * <p>
     * The <code>JobCommand</code> that runs this job.
     * </p>
     */
    private JobCommand command;
    /**
     * <p>
     * The default arguments for every run of this job, specified as name-value pairs.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that Glue itself
     * consumes.
     * </p>
     * <p>
     * Job arguments may be logged. Do not pass plaintext secrets as arguments. Retrieve secrets from a Glue Connection,
     * Secrets Manager or other secret management mechanism if you intend to keep them within the Job.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling Glue APIs in
     * Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the arguments you can provide to this field when configuring Spark jobs, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by Glue</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the arguments you can provide to this field when configuring Ray jobs, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/author-job-ray-job-parameters.html">Using job parameters in Ray
     * jobs</a> in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> defaultArguments;
    /**
     * <p>
     * Arguments for this job that are not overridden when providing job arguments in a job run, specified as name-value
     * pairs.
     * </p>
     */
    private java.util.Map<String, String> nonOverridableArguments;
    /**
     * <p>
     * The connections used for this job.
     * </p>
     */
    private ConnectionsList connections;
    /**
     * <p>
     * The maximum number of times to retry this job after a JobRun fails.
     * </p>
     */
    private Integer maxRetries;
    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of Glue data processing units (DPUs) allocated to runs of this job. You can allocate a minimum of 2
     * DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">Glue
     * pricing page</a>.
     * </p>
     * <p/>
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
     * For Glue version 1.0 or earlier jobs, using the standard worker type, the number of Glue data processing units
     * (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/"> Glue pricing page</a>.
     * </p>
     * <p>
     * For Glue version 2.0 or later jobs, you cannot specify a <code>Maximum capacity</code>. Instead, you should
     * specify a <code>Worker type</code> and the <code>Number of workers</code>.
     * </p>
     * <p>
     * Do not set <code>MaxCapacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a Python shell
     * job, an Apache Spark ETL job, or an Apache Spark streaming ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a Python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either 0.0625
     * or 1 DPU. The default is 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl") or Apache Spark streaming ETL
     * job (<code>JobCommand.Name</code>="gluestreaming"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs.
     * This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     */
    private Double maxCapacity;
    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X, G.8X or
     * G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB disk
     * (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB disk
     * (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web Services Regions: US East (Ohio),
     * US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Canada (Central), Europe (Frankfurt), Europe (Ireland), and Europe (Stockholm).
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB disk
     * (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web Services Regions as supported for the
     * <code>G.4X</code> worker type.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low volume
     * streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB disk
     * (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     * </p>
     * </li>
     * </ul>
     */
    private String workerType;
    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this job.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     */
    private NotificationProperty notificationProperty;
    /**
     * <p>
     * In Spark jobs, <code>GlueVersion</code> determines the versions of Apache Spark and Python that Glue available in
     * a job. The Python version indicates the version supported for jobs of type Spark.
     * </p>
     * <p>
     * Ray jobs should set <code>GlueVersion</code> to <code>4.0</code> or greater. However, the versions of Ray, Python
     * and additional libraries available in your Ray job are determined by the <code>Runtime</code> parameter of the
     * Job command.
     * </p>
     * <p>
     * For more information about the available Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Jobs that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     */
    private String glueVersion;
    /**
     * <p>
     * The representation of a directed acyclic graph on which both the Glue Studio visual component and Glue Studio
     * code generation is based.
     * </p>
     */
    private java.util.Map<String, CodeGenConfigurationNode> codeGenConfigurationNodes;
    /**
     * <p>
     * Indicates whether the job is run with a standard or flexible execution class. The standard execution class is
     * ideal for time-sensitive workloads that require fast job startup and dedicated resources.
     * </p>
     * <p>
     * The flexible execution class is appropriate for time-insensitive jobs whose start and completion times may vary.
     * </p>
     * <p>
     * Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     * <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark jobs.
     * </p>
     */
    private String executionClass;
    /**
     * <p>
     * The details for a source control configuration for a job, allowing synchronization of job artifacts to or from a
     * remote repository.
     * </p>
     */
    private SourceControlDetails sourceControlDetails;
    /**
     * <p>
     * This field specifies a day of the week and hour for a maintenance window for streaming jobs. Glue periodically
     * performs maintenance activities. During these maintenance windows, Glue will need to restart your streaming jobs.
     * </p>
     * <p>
     * Glue will restart the job within 3 hours of the specified maintenance window. For instance, if you set up the
     * maintenance window for Monday at 10:00AM GMT, your jobs will be restarted between 10:00AM GMT to 1:00PM GMT.
     * </p>
     */
    private String maintenanceWindow;

    /**
     * <p>
     * The name you assign to this job definition.
     * </p>
     * 
     * @param name
     *        The name you assign to this job definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you assign to this job definition.
     * </p>
     * 
     * @return The name you assign to this job definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you assign to this job definition.
     * </p>
     * 
     * @param name
     *        The name you assign to this job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the job.
     * </p>
     * 
     * @param description
     *        A description of the job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the job.
     * </p>
     * 
     * @return A description of the job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the job.
     * </p>
     * 
     * @param description
     *        A description of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDescription(String description) {
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

    public Job withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     * </p>
     * 
     * @param role
     *        The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     * </p>
     * 
     * @param role
     *        The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The time and date that this job definition was created.
     * </p>
     * 
     * @param createdOn
     *        The time and date that this job definition was created.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The time and date that this job definition was created.
     * </p>
     * 
     * @return The time and date that this job definition was created.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * The time and date that this job definition was created.
     * </p>
     * 
     * @param createdOn
     *        The time and date that this job definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * The last point in time when this job definition was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The last point in time when this job definition was modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The last point in time when this job definition was modified.
     * </p>
     * 
     * @return The last point in time when this job definition was modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The last point in time when this job definition was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The last point in time when this job definition was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * An <code>ExecutionProperty</code> specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @param executionProperty
     *        An <code>ExecutionProperty</code> specifying the maximum number of concurrent runs allowed for this job.
     */

    public void setExecutionProperty(ExecutionProperty executionProperty) {
        this.executionProperty = executionProperty;
    }

    /**
     * <p>
     * An <code>ExecutionProperty</code> specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @return An <code>ExecutionProperty</code> specifying the maximum number of concurrent runs allowed for this job.
     */

    public ExecutionProperty getExecutionProperty() {
        return this.executionProperty;
    }

    /**
     * <p>
     * An <code>ExecutionProperty</code> specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @param executionProperty
     *        An <code>ExecutionProperty</code> specifying the maximum number of concurrent runs allowed for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withExecutionProperty(ExecutionProperty executionProperty) {
        setExecutionProperty(executionProperty);
        return this;
    }

    /**
     * <p>
     * The <code>JobCommand</code> that runs this job.
     * </p>
     * 
     * @param command
     *        The <code>JobCommand</code> that runs this job.
     */

    public void setCommand(JobCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * The <code>JobCommand</code> that runs this job.
     * </p>
     * 
     * @return The <code>JobCommand</code> that runs this job.
     */

    public JobCommand getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The <code>JobCommand</code> that runs this job.
     * </p>
     * 
     * @param command
     *        The <code>JobCommand</code> that runs this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCommand(JobCommand command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The default arguments for every run of this job, specified as name-value pairs.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that Glue itself
     * consumes.
     * </p>
     * <p>
     * Job arguments may be logged. Do not pass plaintext secrets as arguments. Retrieve secrets from a Glue Connection,
     * Secrets Manager or other secret management mechanism if you intend to keep them within the Job.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling Glue APIs in
     * Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the arguments you can provide to this field when configuring Spark jobs, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by Glue</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the arguments you can provide to this field when configuring Ray jobs, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/author-job-ray-job-parameters.html">Using job parameters in Ray
     * jobs</a> in the developer guide.
     * </p>
     * 
     * @return The default arguments for every run of this job, specified as name-value pairs.</p>
     *         <p>
     *         You can specify arguments here that your own job-execution script consumes, as well as arguments that
     *         Glue itself consumes.
     *         </p>
     *         <p>
     *         Job arguments may be logged. Do not pass plaintext secrets as arguments. Retrieve secrets from a Glue
     *         Connection, Secrets Manager or other secret management mechanism if you intend to keep them within the
     *         Job.
     *         </p>
     *         <p>
     *         For information about how to specify and consume your own Job arguments, see the <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling Glue
     *         APIs in Python</a> topic in the developer guide.
     *         </p>
     *         <p>
     *         For information about the arguments you can provide to this field when configuring Spark jobs, see the <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *         Parameters Used by Glue</a> topic in the developer guide.
     *         </p>
     *         <p>
     *         For information about the arguments you can provide to this field when configuring Ray jobs, see <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/author-job-ray-job-parameters.html">Using job parameters
     *         in Ray jobs</a> in the developer guide.
     */

    public java.util.Map<String, String> getDefaultArguments() {
        return defaultArguments;
    }

    /**
     * <p>
     * The default arguments for every run of this job, specified as name-value pairs.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that Glue itself
     * consumes.
     * </p>
     * <p>
     * Job arguments may be logged. Do not pass plaintext secrets as arguments. Retrieve secrets from a Glue Connection,
     * Secrets Manager or other secret management mechanism if you intend to keep them within the Job.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling Glue APIs in
     * Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the arguments you can provide to this field when configuring Spark jobs, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by Glue</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the arguments you can provide to this field when configuring Ray jobs, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/author-job-ray-job-parameters.html">Using job parameters in Ray
     * jobs</a> in the developer guide.
     * </p>
     * 
     * @param defaultArguments
     *        The default arguments for every run of this job, specified as name-value pairs.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that Glue
     *        itself consumes.
     *        </p>
     *        <p>
     *        Job arguments may be logged. Do not pass plaintext secrets as arguments. Retrieve secrets from a Glue
     *        Connection, Secrets Manager or other secret management mechanism if you intend to keep them within the
     *        Job.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own Job arguments, see the <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the arguments you can provide to this field when configuring Spark jobs, see the <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by Glue</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the arguments you can provide to this field when configuring Ray jobs, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/author-job-ray-job-parameters.html">Using job parameters
     *        in Ray jobs</a> in the developer guide.
     */

    public void setDefaultArguments(java.util.Map<String, String> defaultArguments) {
        this.defaultArguments = defaultArguments;
    }

    /**
     * <p>
     * The default arguments for every run of this job, specified as name-value pairs.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script consumes, as well as arguments that Glue itself
     * consumes.
     * </p>
     * <p>
     * Job arguments may be logged. Do not pass plaintext secrets as arguments. Retrieve secrets from a Glue Connection,
     * Secrets Manager or other secret management mechanism if you intend to keep them within the Job.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling Glue APIs in
     * Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the arguments you can provide to this field when configuring Spark jobs, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special Parameters
     * Used by Glue</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the arguments you can provide to this field when configuring Ray jobs, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/author-job-ray-job-parameters.html">Using job parameters in Ray
     * jobs</a> in the developer guide.
     * </p>
     * 
     * @param defaultArguments
     *        The default arguments for every run of this job, specified as name-value pairs.</p>
     *        <p>
     *        You can specify arguments here that your own job-execution script consumes, as well as arguments that Glue
     *        itself consumes.
     *        </p>
     *        <p>
     *        Job arguments may be logged. Do not pass plaintext secrets as arguments. Retrieve secrets from a Glue
     *        Connection, Secrets Manager or other secret management mechanism if you intend to keep them within the
     *        Job.
     *        </p>
     *        <p>
     *        For information about how to specify and consume your own Job arguments, see the <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html">Calling Glue
     *        APIs in Python</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the arguments you can provide to this field when configuring Spark jobs, see the <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html">Special
     *        Parameters Used by Glue</a> topic in the developer guide.
     *        </p>
     *        <p>
     *        For information about the arguments you can provide to this field when configuring Ray jobs, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/author-job-ray-job-parameters.html">Using job parameters
     *        in Ray jobs</a> in the developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDefaultArguments(java.util.Map<String, String> defaultArguments) {
        setDefaultArguments(defaultArguments);
        return this;
    }

    /**
     * Add a single DefaultArguments entry
     *
     * @see Job#withDefaultArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Job addDefaultArgumentsEntry(String key, String value) {
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

    public Job clearDefaultArgumentsEntries() {
        this.defaultArguments = null;
        return this;
    }

    /**
     * <p>
     * Arguments for this job that are not overridden when providing job arguments in a job run, specified as name-value
     * pairs.
     * </p>
     * 
     * @return Arguments for this job that are not overridden when providing job arguments in a job run, specified as
     *         name-value pairs.
     */

    public java.util.Map<String, String> getNonOverridableArguments() {
        return nonOverridableArguments;
    }

    /**
     * <p>
     * Arguments for this job that are not overridden when providing job arguments in a job run, specified as name-value
     * pairs.
     * </p>
     * 
     * @param nonOverridableArguments
     *        Arguments for this job that are not overridden when providing job arguments in a job run, specified as
     *        name-value pairs.
     */

    public void setNonOverridableArguments(java.util.Map<String, String> nonOverridableArguments) {
        this.nonOverridableArguments = nonOverridableArguments;
    }

    /**
     * <p>
     * Arguments for this job that are not overridden when providing job arguments in a job run, specified as name-value
     * pairs.
     * </p>
     * 
     * @param nonOverridableArguments
     *        Arguments for this job that are not overridden when providing job arguments in a job run, specified as
     *        name-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withNonOverridableArguments(java.util.Map<String, String> nonOverridableArguments) {
        setNonOverridableArguments(nonOverridableArguments);
        return this;
    }

    /**
     * Add a single NonOverridableArguments entry
     *
     * @see Job#withNonOverridableArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Job addNonOverridableArgumentsEntry(String key, String value) {
        if (null == this.nonOverridableArguments) {
            this.nonOverridableArguments = new java.util.HashMap<String, String>();
        }
        if (this.nonOverridableArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.nonOverridableArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NonOverridableArguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job clearNonOverridableArgumentsEntries() {
        this.nonOverridableArguments = null;
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

    public Job withConnections(ConnectionsList connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry this job after a JobRun fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry this job after a JobRun fails.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job after a JobRun fails.
     * </p>
     * 
     * @return The maximum number of times to retry this job after a JobRun fails.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job after a JobRun fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry this job after a JobRun fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of Glue data processing units (DPUs) allocated to runs of this job. You can allocate a minimum of 2
     * DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">Glue
     * pricing page</a>.
     * </p>
     * <p/>
     * 
     * @param allocatedCapacity
     *        This field is deprecated. Use <code>MaxCapacity</code> instead.
     *        </p>
     *        <p>
     *        The number of Glue data processing units (DPUs) allocated to runs of this job. You can allocate a minimum
     *        of 2 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of
     *        compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">Glue pricing page</a>.
     *        </p>
     */
    @Deprecated
    public void setAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of Glue data processing units (DPUs) allocated to runs of this job. You can allocate a minimum of 2
     * DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">Glue
     * pricing page</a>.
     * </p>
     * <p/>
     * 
     * @return This field is deprecated. Use <code>MaxCapacity</code> instead.
     *         </p>
     *         <p>
     *         The number of Glue data processing units (DPUs) allocated to runs of this job. You can allocate a minimum
     *         of 2 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of
     *         compute capacity and 16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">Glue pricing page</a>.
     *         </p>
     */
    @Deprecated
    public Integer getAllocatedCapacity() {
        return this.allocatedCapacity;
    }

    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of Glue data processing units (DPUs) allocated to runs of this job. You can allocate a minimum of 2
     * DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a href="https://aws.amazon.com/glue/pricing/">Glue
     * pricing page</a>.
     * </p>
     * <p/>
     * 
     * @param allocatedCapacity
     *        This field is deprecated. Use <code>MaxCapacity</code> instead.
     *        </p>
     *        <p>
     *        The number of Glue data processing units (DPUs) allocated to runs of this job. You can allocate a minimum
     *        of 2 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of
     *        compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/">Glue pricing page</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Job withAllocatedCapacity(Integer allocatedCapacity) {
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

    public Job withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * For Glue version 1.0 or earlier jobs, using the standard worker type, the number of Glue data processing units
     * (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/"> Glue pricing page</a>.
     * </p>
     * <p>
     * For Glue version 2.0 or later jobs, you cannot specify a <code>Maximum capacity</code>. Instead, you should
     * specify a <code>Worker type</code> and the <code>Number of workers</code>.
     * </p>
     * <p>
     * Do not set <code>MaxCapacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a Python shell
     * job, an Apache Spark ETL job, or an Apache Spark streaming ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a Python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either 0.0625
     * or 1 DPU. The default is 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl") or Apache Spark streaming ETL
     * job (<code>JobCommand.Name</code>="gluestreaming"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs.
     * This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxCapacity
     *        For Glue version 1.0 or earlier jobs, using the standard worker type, the number of Glue data processing
     *        units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power
     *        that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/"> Glue pricing page</a>.</p>
     *        <p>
     *        For Glue version 2.0 or later jobs, you cannot specify a <code>Maximum capacity</code>. Instead, you
     *        should specify a <code>Worker type</code> and the <code>Number of workers</code>.
     *        </p>
     *        <p>
     *        Do not set <code>MaxCapacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *        </p>
     *        <p>
     *        The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a Python
     *        shell job, an Apache Spark ETL job, or an Apache Spark streaming ETL job:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify a Python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either
     *        0.0625 or 1 DPU. The default is 0.0625 DPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl") or Apache Spark
     *        streaming ETL job (<code>JobCommand.Name</code>="gluestreaming"), you can allocate from 2 to 100 DPUs. The
     *        default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     *        </p>
     *        </li>
     */

    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * For Glue version 1.0 or earlier jobs, using the standard worker type, the number of Glue data processing units
     * (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/"> Glue pricing page</a>.
     * </p>
     * <p>
     * For Glue version 2.0 or later jobs, you cannot specify a <code>Maximum capacity</code>. Instead, you should
     * specify a <code>Worker type</code> and the <code>Number of workers</code>.
     * </p>
     * <p>
     * Do not set <code>MaxCapacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a Python shell
     * job, an Apache Spark ETL job, or an Apache Spark streaming ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a Python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either 0.0625
     * or 1 DPU. The default is 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl") or Apache Spark streaming ETL
     * job (<code>JobCommand.Name</code>="gluestreaming"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs.
     * This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return For Glue version 1.0 or earlier jobs, using the standard worker type, the number of Glue data processing
     *         units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power
     *         that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/"> Glue pricing page</a>.</p>
     *         <p>
     *         For Glue version 2.0 or later jobs, you cannot specify a <code>Maximum capacity</code>. Instead, you
     *         should specify a <code>Worker type</code> and the <code>Number of workers</code>.
     *         </p>
     *         <p>
     *         Do not set <code>MaxCapacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *         </p>
     *         <p>
     *         The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a Python
     *         shell job, an Apache Spark ETL job, or an Apache Spark streaming ETL job:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When you specify a Python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either
     *         0.0625 or 1 DPU. The default is 0.0625 DPU.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl") or Apache Spark
     *         streaming ETL job (<code>JobCommand.Name</code>="gluestreaming"), you can allocate from 2 to 100 DPUs.
     *         The default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     *         </p>
     *         </li>
     */

    public Double getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * For Glue version 1.0 or earlier jobs, using the standard worker type, the number of Glue data processing units
     * (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of
     * 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/"> Glue pricing page</a>.
     * </p>
     * <p>
     * For Glue version 2.0 or later jobs, you cannot specify a <code>Maximum capacity</code>. Instead, you should
     * specify a <code>Worker type</code> and the <code>Number of workers</code>.
     * </p>
     * <p>
     * Do not set <code>MaxCapacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a Python shell
     * job, an Apache Spark ETL job, or an Apache Spark streaming ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a Python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either 0.0625
     * or 1 DPU. The default is 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl") or Apache Spark streaming ETL
     * job (<code>JobCommand.Name</code>="gluestreaming"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs.
     * This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxCapacity
     *        For Glue version 1.0 or earlier jobs, using the standard worker type, the number of Glue data processing
     *        units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power
     *        that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the <a
     *        href="https://aws.amazon.com/glue/pricing/"> Glue pricing page</a>.</p>
     *        <p>
     *        For Glue version 2.0 or later jobs, you cannot specify a <code>Maximum capacity</code>. Instead, you
     *        should specify a <code>Worker type</code> and the <code>Number of workers</code>.
     *        </p>
     *        <p>
     *        Do not set <code>MaxCapacity</code> if using <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *        </p>
     *        <p>
     *        The value that can be allocated for <code>MaxCapacity</code> depends on whether you are running a Python
     *        shell job, an Apache Spark ETL job, or an Apache Spark streaming ETL job:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify a Python shell job (<code>JobCommand.Name</code>="pythonshell"), you can allocate either
     *        0.0625 or 1 DPU. The default is 0.0625 DPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>="glueetl") or Apache Spark
     *        streaming ETL job (<code>JobCommand.Name</code>="gluestreaming"), you can allocate from 2 to 100 DPUs. The
     *        default is 10 DPUs. This job type cannot have a fractional DPU allocation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X, G.8X or
     * G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB disk
     * (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB disk
     * (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web Services Regions: US East (Ohio),
     * US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Canada (Central), Europe (Frankfurt), Europe (Ireland), and Europe (Stockholm).
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB disk
     * (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web Services Regions as supported for the
     * <code>G.4X</code> worker type.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low volume
     * streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB disk
     * (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X, G.8X
     *        or G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB disk
     *        (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for workloads
     *        such as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB
     *        disk (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for
     *        workloads such as data transforms, joins, and queries, to offers a scalable and cost effective way to run
     *        most jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB
     *        disk (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for
     *        jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries. This worker
     *        type is available only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web Services
     *        Regions: US East (Ohio), US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia Pacific
     *        (Sydney), Asia Pacific (Tokyo), Canada (Central), Europe (Frankfurt), Europe (Ireland), and Europe
     *        (Stockholm).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB
     *        disk (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for
     *        jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries. This worker
     *        type is available only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web Services
     *        Regions as supported for the <code>G.4X</code> worker type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB
     *        disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low
     *        volume streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB
     *        disk (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     *        </p>
     *        </li>
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X, G.8X or
     * G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB disk
     * (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB disk
     * (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web Services Regions: US East (Ohio),
     * US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Canada (Central), Europe (Frankfurt), Europe (Ireland), and Europe (Stockholm).
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB disk
     * (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web Services Regions as supported for the
     * <code>G.4X</code> worker type.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low volume
     * streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB disk
     * (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X,
     *         G.8X or G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB
     *         disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for
     *         workloads such as data transforms, joins, and queries, to offers a scalable and cost effective way to run
     *         most jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB
     *         disk (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for
     *         workloads such as data transforms, joins, and queries, to offers a scalable and cost effective way to run
     *         most jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB
     *         disk (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for
     *         jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries. This
     *         worker type is available only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web
     *         Services Regions: US East (Ohio), US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia
     *         Pacific (Sydney), Asia Pacific (Tokyo), Canada (Central), Europe (Frankfurt), Europe (Ireland), and
     *         Europe (Stockholm).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB
     *         disk (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for
     *         jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries. This
     *         worker type is available only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web
     *         Services Regions as supported for the <code>G.4X</code> worker type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB
     *         disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low
     *         volume streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB
     *         disk (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     *         </p>
     *         </li>
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X, G.8X or
     * G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB disk
     * (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB disk
     * (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web Services Regions: US East (Ohio),
     * US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Canada (Central), Europe (Frankfurt), Europe (Ireland), and Europe (Stockholm).
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB disk
     * (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web Services Regions as supported for the
     * <code>G.4X</code> worker type.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low volume
     * streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB disk
     * (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X, G.8X
     *        or G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB disk
     *        (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for workloads
     *        such as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB
     *        disk (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for
     *        workloads such as data transforms, joins, and queries, to offers a scalable and cost effective way to run
     *        most jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB
     *        disk (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for
     *        jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries. This worker
     *        type is available only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web Services
     *        Regions: US East (Ohio), US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia Pacific
     *        (Sydney), Asia Pacific (Tokyo), Canada (Central), Europe (Frankfurt), Europe (Ireland), and Europe
     *        (Stockholm).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB
     *        disk (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for
     *        jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries. This worker
     *        type is available only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web Services
     *        Regions as supported for the <code>G.4X</code> worker type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB
     *        disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low
     *        volume streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB
     *        disk (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public Job withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X, G.8X or
     * G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB disk
     * (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for workloads such
     * as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB disk
     * (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web Services Regions: US East (Ohio),
     * US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Canada (Central), Europe (Frankfurt), Europe (Ireland), and Europe (Stockholm).
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB disk
     * (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for jobs whose
     * workloads contain your most demanding transforms, aggregations, joins, and queries. This worker type is available
     * only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web Services Regions as supported for the
     * <code>G.4X</code> worker type.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB disk
     * (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low volume
     * streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB disk
     * (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a job runs. Accepts a value of G.1X, G.2X, G.4X, G.8X
     *        or G.025X for Spark jobs. Accepts the value Z.2X for Ray jobs.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPUs, 16 GB of memory) with 84GB disk
     *        (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for workloads
     *        such as data transforms, joins, and queries, to offers a scalable and cost effective way to run most jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPUs, 32 GB of memory) with 128GB
     *        disk (approximately 77GB free), and provides 1 executor per worker. We recommend this worker type for
     *        workloads such as data transforms, joins, and queries, to offers a scalable and cost effective way to run
     *        most jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.4X</code> worker type, each worker maps to 4 DPU (16 vCPUs, 64 GB of memory) with 256GB
     *        disk (approximately 235GB free), and provides 1 executor per worker. We recommend this worker type for
     *        jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries. This worker
     *        type is available only for Glue version 3.0 or later Spark ETL jobs in the following Amazon Web Services
     *        Regions: US East (Ohio), US East (N. Virginia), US West (Oregon), Asia Pacific (Singapore), Asia Pacific
     *        (Sydney), Asia Pacific (Tokyo), Canada (Central), Europe (Frankfurt), Europe (Ireland), and Europe
     *        (Stockholm).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.8X</code> worker type, each worker maps to 8 DPU (32 vCPUs, 128 GB of memory) with 512GB
     *        disk (approximately 487GB free), and provides 1 executor per worker. We recommend this worker type for
     *        jobs whose workloads contain your most demanding transforms, aggregations, joins, and queries. This worker
     *        type is available only for Glue version 3.0 or later Spark ETL jobs, in the same Amazon Web Services
     *        Regions as supported for the <code>G.4X</code> worker type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPUs, 4 GB of memory) with 84GB
     *        disk (approximately 34GB free), and provides 1 executor per worker. We recommend this worker type for low
     *        volume streaming jobs. This worker type is only available for Glue version 3.0 streaming jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>Z.2X</code> worker type, each worker maps to 2 M-DPU (8vCPUs, 64 GB of memory) with 128 GB
     *        disk (approximately 120GB free), and provides up to 8 Ray workers based on the autoscaler.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public Job withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * </p>
     * 
     * @return The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated when a job runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this job.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the <code>SecurityConfiguration</code> structure to be used with this job.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this job.
     * </p>
     * 
     * @return The name of the <code>SecurityConfiguration</code> structure to be used with this job.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this job.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the <code>SecurityConfiguration</code> structure to be used with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
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

    public Job withNotificationProperty(NotificationProperty notificationProperty) {
        setNotificationProperty(notificationProperty);
        return this;
    }

    /**
     * <p>
     * In Spark jobs, <code>GlueVersion</code> determines the versions of Apache Spark and Python that Glue available in
     * a job. The Python version indicates the version supported for jobs of type Spark.
     * </p>
     * <p>
     * Ray jobs should set <code>GlueVersion</code> to <code>4.0</code> or greater. However, the versions of Ray, Python
     * and additional libraries available in your Ray job are determined by the <code>Runtime</code> parameter of the
     * Job command.
     * </p>
     * <p>
     * For more information about the available Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Jobs that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * 
     * @param glueVersion
     *        In Spark jobs, <code>GlueVersion</code> determines the versions of Apache Spark and Python that Glue
     *        available in a job. The Python version indicates the version supported for jobs of type Spark. </p>
     *        <p>
     *        Ray jobs should set <code>GlueVersion</code> to <code>4.0</code> or greater. However, the versions of Ray,
     *        Python and additional libraries available in your Ray job are determined by the <code>Runtime</code>
     *        parameter of the Job command.
     *        </p>
     *        <p>
     *        For more information about the available Glue versions and corresponding Spark and Python versions, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     *        </p>
     *        <p>
     *        Jobs that are created without specifying a Glue version default to Glue 0.9.
     */

    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * In Spark jobs, <code>GlueVersion</code> determines the versions of Apache Spark and Python that Glue available in
     * a job. The Python version indicates the version supported for jobs of type Spark.
     * </p>
     * <p>
     * Ray jobs should set <code>GlueVersion</code> to <code>4.0</code> or greater. However, the versions of Ray, Python
     * and additional libraries available in your Ray job are determined by the <code>Runtime</code> parameter of the
     * Job command.
     * </p>
     * <p>
     * For more information about the available Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Jobs that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * 
     * @return In Spark jobs, <code>GlueVersion</code> determines the versions of Apache Spark and Python that Glue
     *         available in a job. The Python version indicates the version supported for jobs of type Spark. </p>
     *         <p>
     *         Ray jobs should set <code>GlueVersion</code> to <code>4.0</code> or greater. However, the versions of
     *         Ray, Python and additional libraries available in your Ray job are determined by the <code>Runtime</code>
     *         parameter of the Job command.
     *         </p>
     *         <p>
     *         For more information about the available Glue versions and corresponding Spark and Python versions, see
     *         <a href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer
     *         guide.
     *         </p>
     *         <p>
     *         Jobs that are created without specifying a Glue version default to Glue 0.9.
     */

    public String getGlueVersion() {
        return this.glueVersion;
    }

    /**
     * <p>
     * In Spark jobs, <code>GlueVersion</code> determines the versions of Apache Spark and Python that Glue available in
     * a job. The Python version indicates the version supported for jobs of type Spark.
     * </p>
     * <p>
     * Ray jobs should set <code>GlueVersion</code> to <code>4.0</code> or greater. However, the versions of Ray, Python
     * and additional libraries available in your Ray job are determined by the <code>Runtime</code> parameter of the
     * Job command.
     * </p>
     * <p>
     * For more information about the available Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Jobs that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * 
     * @param glueVersion
     *        In Spark jobs, <code>GlueVersion</code> determines the versions of Apache Spark and Python that Glue
     *        available in a job. The Python version indicates the version supported for jobs of type Spark. </p>
     *        <p>
     *        Ray jobs should set <code>GlueVersion</code> to <code>4.0</code> or greater. However, the versions of Ray,
     *        Python and additional libraries available in your Ray job are determined by the <code>Runtime</code>
     *        parameter of the Job command.
     *        </p>
     *        <p>
     *        For more information about the available Glue versions and corresponding Spark and Python versions, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     *        </p>
     *        <p>
     *        Jobs that are created without specifying a Glue version default to Glue 0.9.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withGlueVersion(String glueVersion) {
        setGlueVersion(glueVersion);
        return this;
    }

    /**
     * <p>
     * The representation of a directed acyclic graph on which both the Glue Studio visual component and Glue Studio
     * code generation is based.
     * </p>
     * 
     * @return The representation of a directed acyclic graph on which both the Glue Studio visual component and Glue
     *         Studio code generation is based.
     */

    public java.util.Map<String, CodeGenConfigurationNode> getCodeGenConfigurationNodes() {
        return codeGenConfigurationNodes;
    }

    /**
     * <p>
     * The representation of a directed acyclic graph on which both the Glue Studio visual component and Glue Studio
     * code generation is based.
     * </p>
     * 
     * @param codeGenConfigurationNodes
     *        The representation of a directed acyclic graph on which both the Glue Studio visual component and Glue
     *        Studio code generation is based.
     */

    public void setCodeGenConfigurationNodes(java.util.Map<String, CodeGenConfigurationNode> codeGenConfigurationNodes) {
        this.codeGenConfigurationNodes = codeGenConfigurationNodes;
    }

    /**
     * <p>
     * The representation of a directed acyclic graph on which both the Glue Studio visual component and Glue Studio
     * code generation is based.
     * </p>
     * 
     * @param codeGenConfigurationNodes
     *        The representation of a directed acyclic graph on which both the Glue Studio visual component and Glue
     *        Studio code generation is based.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCodeGenConfigurationNodes(java.util.Map<String, CodeGenConfigurationNode> codeGenConfigurationNodes) {
        setCodeGenConfigurationNodes(codeGenConfigurationNodes);
        return this;
    }

    /**
     * Add a single CodeGenConfigurationNodes entry
     *
     * @see Job#withCodeGenConfigurationNodes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Job addCodeGenConfigurationNodesEntry(String key, CodeGenConfigurationNode value) {
        if (null == this.codeGenConfigurationNodes) {
            this.codeGenConfigurationNodes = new java.util.HashMap<String, CodeGenConfigurationNode>();
        }
        if (this.codeGenConfigurationNodes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.codeGenConfigurationNodes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CodeGenConfigurationNodes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job clearCodeGenConfigurationNodesEntries() {
        this.codeGenConfigurationNodes = null;
        return this;
    }

    /**
     * <p>
     * Indicates whether the job is run with a standard or flexible execution class. The standard execution class is
     * ideal for time-sensitive workloads that require fast job startup and dedicated resources.
     * </p>
     * <p>
     * The flexible execution class is appropriate for time-insensitive jobs whose start and completion times may vary.
     * </p>
     * <p>
     * Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     * <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark jobs.
     * </p>
     * 
     * @param executionClass
     *        Indicates whether the job is run with a standard or flexible execution class. The standard execution class
     *        is ideal for time-sensitive workloads that require fast job startup and dedicated resources.</p>
     *        <p>
     *        The flexible execution class is appropriate for time-insensitive jobs whose start and completion times may
     *        vary.
     *        </p>
     *        <p>
     *        Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     *        <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark
     *        jobs.
     * @see ExecutionClass
     */

    public void setExecutionClass(String executionClass) {
        this.executionClass = executionClass;
    }

    /**
     * <p>
     * Indicates whether the job is run with a standard or flexible execution class. The standard execution class is
     * ideal for time-sensitive workloads that require fast job startup and dedicated resources.
     * </p>
     * <p>
     * The flexible execution class is appropriate for time-insensitive jobs whose start and completion times may vary.
     * </p>
     * <p>
     * Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     * <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark jobs.
     * </p>
     * 
     * @return Indicates whether the job is run with a standard or flexible execution class. The standard execution
     *         class is ideal for time-sensitive workloads that require fast job startup and dedicated resources.</p>
     *         <p>
     *         The flexible execution class is appropriate for time-insensitive jobs whose start and completion times
     *         may vary.
     *         </p>
     *         <p>
     *         Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     *         <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark
     *         jobs.
     * @see ExecutionClass
     */

    public String getExecutionClass() {
        return this.executionClass;
    }

    /**
     * <p>
     * Indicates whether the job is run with a standard or flexible execution class. The standard execution class is
     * ideal for time-sensitive workloads that require fast job startup and dedicated resources.
     * </p>
     * <p>
     * The flexible execution class is appropriate for time-insensitive jobs whose start and completion times may vary.
     * </p>
     * <p>
     * Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     * <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark jobs.
     * </p>
     * 
     * @param executionClass
     *        Indicates whether the job is run with a standard or flexible execution class. The standard execution class
     *        is ideal for time-sensitive workloads that require fast job startup and dedicated resources.</p>
     *        <p>
     *        The flexible execution class is appropriate for time-insensitive jobs whose start and completion times may
     *        vary.
     *        </p>
     *        <p>
     *        Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     *        <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark
     *        jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionClass
     */

    public Job withExecutionClass(String executionClass) {
        setExecutionClass(executionClass);
        return this;
    }

    /**
     * <p>
     * Indicates whether the job is run with a standard or flexible execution class. The standard execution class is
     * ideal for time-sensitive workloads that require fast job startup and dedicated resources.
     * </p>
     * <p>
     * The flexible execution class is appropriate for time-insensitive jobs whose start and completion times may vary.
     * </p>
     * <p>
     * Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     * <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark jobs.
     * </p>
     * 
     * @param executionClass
     *        Indicates whether the job is run with a standard or flexible execution class. The standard execution class
     *        is ideal for time-sensitive workloads that require fast job startup and dedicated resources.</p>
     *        <p>
     *        The flexible execution class is appropriate for time-insensitive jobs whose start and completion times may
     *        vary.
     *        </p>
     *        <p>
     *        Only jobs with Glue version 3.0 and above and command type <code>glueetl</code> will be allowed to set
     *        <code>ExecutionClass</code> to <code>FLEX</code>. The flexible execution class is available for Spark
     *        jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionClass
     */

    public Job withExecutionClass(ExecutionClass executionClass) {
        this.executionClass = executionClass.toString();
        return this;
    }

    /**
     * <p>
     * The details for a source control configuration for a job, allowing synchronization of job artifacts to or from a
     * remote repository.
     * </p>
     * 
     * @param sourceControlDetails
     *        The details for a source control configuration for a job, allowing synchronization of job artifacts to or
     *        from a remote repository.
     */

    public void setSourceControlDetails(SourceControlDetails sourceControlDetails) {
        this.sourceControlDetails = sourceControlDetails;
    }

    /**
     * <p>
     * The details for a source control configuration for a job, allowing synchronization of job artifacts to or from a
     * remote repository.
     * </p>
     * 
     * @return The details for a source control configuration for a job, allowing synchronization of job artifacts to or
     *         from a remote repository.
     */

    public SourceControlDetails getSourceControlDetails() {
        return this.sourceControlDetails;
    }

    /**
     * <p>
     * The details for a source control configuration for a job, allowing synchronization of job artifacts to or from a
     * remote repository.
     * </p>
     * 
     * @param sourceControlDetails
     *        The details for a source control configuration for a job, allowing synchronization of job artifacts to or
     *        from a remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withSourceControlDetails(SourceControlDetails sourceControlDetails) {
        setSourceControlDetails(sourceControlDetails);
        return this;
    }

    /**
     * <p>
     * This field specifies a day of the week and hour for a maintenance window for streaming jobs. Glue periodically
     * performs maintenance activities. During these maintenance windows, Glue will need to restart your streaming jobs.
     * </p>
     * <p>
     * Glue will restart the job within 3 hours of the specified maintenance window. For instance, if you set up the
     * maintenance window for Monday at 10:00AM GMT, your jobs will be restarted between 10:00AM GMT to 1:00PM GMT.
     * </p>
     * 
     * @param maintenanceWindow
     *        This field specifies a day of the week and hour for a maintenance window for streaming jobs. Glue
     *        periodically performs maintenance activities. During these maintenance windows, Glue will need to restart
     *        your streaming jobs.</p>
     *        <p>
     *        Glue will restart the job within 3 hours of the specified maintenance window. For instance, if you set up
     *        the maintenance window for Monday at 10:00AM GMT, your jobs will be restarted between 10:00AM GMT to
     *        1:00PM GMT.
     */

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    /**
     * <p>
     * This field specifies a day of the week and hour for a maintenance window for streaming jobs. Glue periodically
     * performs maintenance activities. During these maintenance windows, Glue will need to restart your streaming jobs.
     * </p>
     * <p>
     * Glue will restart the job within 3 hours of the specified maintenance window. For instance, if you set up the
     * maintenance window for Monday at 10:00AM GMT, your jobs will be restarted between 10:00AM GMT to 1:00PM GMT.
     * </p>
     * 
     * @return This field specifies a day of the week and hour for a maintenance window for streaming jobs. Glue
     *         periodically performs maintenance activities. During these maintenance windows, Glue will need to restart
     *         your streaming jobs.</p>
     *         <p>
     *         Glue will restart the job within 3 hours of the specified maintenance window. For instance, if you set up
     *         the maintenance window for Monday at 10:00AM GMT, your jobs will be restarted between 10:00AM GMT to
     *         1:00PM GMT.
     */

    public String getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * <p>
     * This field specifies a day of the week and hour for a maintenance window for streaming jobs. Glue periodically
     * performs maintenance activities. During these maintenance windows, Glue will need to restart your streaming jobs.
     * </p>
     * <p>
     * Glue will restart the job within 3 hours of the specified maintenance window. For instance, if you set up the
     * maintenance window for Monday at 10:00AM GMT, your jobs will be restarted between 10:00AM GMT to 1:00PM GMT.
     * </p>
     * 
     * @param maintenanceWindow
     *        This field specifies a day of the week and hour for a maintenance window for streaming jobs. Glue
     *        periodically performs maintenance activities. During these maintenance windows, Glue will need to restart
     *        your streaming jobs.</p>
     *        <p>
     *        Glue will restart the job within 3 hours of the specified maintenance window. For instance, if you set up
     *        the maintenance window for Monday at 10:00AM GMT, your jobs will be restarted between 10:00AM GMT to
     *        1:00PM GMT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withMaintenanceWindow(String maintenanceWindow) {
        setMaintenanceWindow(maintenanceWindow);
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
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getExecutionProperty() != null)
            sb.append("ExecutionProperty: ").append(getExecutionProperty()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getDefaultArguments() != null)
            sb.append("DefaultArguments: ").append(getDefaultArguments()).append(",");
        if (getNonOverridableArguments() != null)
            sb.append("NonOverridableArguments: ").append(getNonOverridableArguments()).append(",");
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
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: ").append(getNotificationProperty()).append(",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: ").append(getGlueVersion()).append(",");
        if (getCodeGenConfigurationNodes() != null)
            sb.append("CodeGenConfigurationNodes: ").append("***Sensitive Data Redacted***").append(",");
        if (getExecutionClass() != null)
            sb.append("ExecutionClass: ").append(getExecutionClass()).append(",");
        if (getSourceControlDetails() != null)
            sb.append("SourceControlDetails: ").append(getSourceControlDetails()).append(",");
        if (getMaintenanceWindow() != null)
            sb.append("MaintenanceWindow: ").append(getMaintenanceWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
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
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
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
        if (other.getNonOverridableArguments() == null ^ this.getNonOverridableArguments() == null)
            return false;
        if (other.getNonOverridableArguments() != null && other.getNonOverridableArguments().equals(this.getNonOverridableArguments()) == false)
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
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getCodeGenConfigurationNodes() == null ^ this.getCodeGenConfigurationNodes() == null)
            return false;
        if (other.getCodeGenConfigurationNodes() != null && other.getCodeGenConfigurationNodes().equals(this.getCodeGenConfigurationNodes()) == false)
            return false;
        if (other.getExecutionClass() == null ^ this.getExecutionClass() == null)
            return false;
        if (other.getExecutionClass() != null && other.getExecutionClass().equals(this.getExecutionClass()) == false)
            return false;
        if (other.getSourceControlDetails() == null ^ this.getSourceControlDetails() == null)
            return false;
        if (other.getSourceControlDetails() != null && other.getSourceControlDetails().equals(this.getSourceControlDetails()) == false)
            return false;
        if (other.getMaintenanceWindow() == null ^ this.getMaintenanceWindow() == null)
            return false;
        if (other.getMaintenanceWindow() != null && other.getMaintenanceWindow().equals(this.getMaintenanceWindow()) == false)
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
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getExecutionProperty() == null) ? 0 : getExecutionProperty().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getDefaultArguments() == null) ? 0 : getDefaultArguments().hashCode());
        hashCode = prime * hashCode + ((getNonOverridableArguments() == null) ? 0 : getNonOverridableArguments().hashCode());
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        hashCode = prime * hashCode + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode + ((getCodeGenConfigurationNodes() == null) ? 0 : getCodeGenConfigurationNodes().hashCode());
        hashCode = prime * hashCode + ((getExecutionClass() == null) ? 0 : getExecutionClass().hashCode());
        hashCode = prime * hashCode + ((getSourceControlDetails() == null) ? 0 : getSourceControlDetails().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindow() == null) ? 0 : getMaintenanceWindow().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
