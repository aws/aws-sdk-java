/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UpdateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of key-value pairs containing the Apache Airflow configuration options you want to attach to your
     * environment. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Apache Airflow
     * configuration options</a>.
     * </p>
     */
    private java.util.Map<String, String> airflowConfigurationOptions;
    /**
     * <p>
     * The Apache Airflow version for your environment. For example, <code>v1.10.12</code>. If no value is specified,
     * defaults to the latest version. Valid values: <code>v1.10.12</code>.
     * </p>
     */
    private String airflowVersion;
    /**
     * <p>
     * The relative path to the DAGs folder on your Amazon S3 bucket. For example, <code>dags</code>. To learn more, see
     * <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html">Adding or updating
     * DAGs</a>.
     * </p>
     */
    private String dagS3Path;
    /**
     * <p>
     * The environment class type. Valid values: <code>mw1.small</code>, <code>mw1.medium</code>, <code>mw1.large</code>
     * . To learn more, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html">Amazon
     * MWAA environment class</a>.
     * </p>
     */
    private String environmentClass;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS resources in your
     * environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html">Amazon MWAA Execution role</a>.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * Defines the Apache Airflow logs to send to CloudWatch Logs: <code>DagProcessingLogs</code>,
     * <code>SchedulerLogs</code>, <code>TaskLogs</code>, <code>WebserverLogs</code>, <code>WorkerLogs</code>.
     * </p>
     */
    private LoggingConfigurationInput loggingConfiguration;
    /**
     * <p>
     * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers up to the number you specify in the <code>MaxWorkers</code> field. For example, <code>20</code>. When
     * there are no more tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the one
     * worker that is included with your environment, or the number you specify in <code>MinWorkers</code>.
     * </p>
     */
    private Integer maxWorkers;
    /**
     * <p>
     * The minimum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers up to the number you specify in the <code>MaxWorkers</code> field. When there are no more tasks running,
     * and no more in the queue, MWAA disposes of the extra workers leaving the worker count you specify in the
     * <code>MinWorkers</code> field. For example, <code>2</code>.
     * </p>
     */
    private Integer minWorkers;
    /**
     * <p>
     * The name of your Amazon MWAA environment. For example, <code>MyMWAAEnvironment</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The VPC networking components used to secure and enable network traffic between the AWS resources for your
     * environment. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html">About networking on Amazon
     * MWAA</a>.
     * </p>
     */
    private UpdateNetworkConfigurationInput networkConfiguration;
    /**
     * <p>
     * The version of the plugins.zip file on your Amazon S3 bucket. A version must be specified each time a plugins.zip
     * file is updated. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     * works</a>.
     * </p>
     */
    private String pluginsS3ObjectVersion;
    /**
     * <p>
     * The relative path to the <code>plugins.zip</code> file on your Amazon S3 bucket. For example,
     * <code>plugins.zip</code>. If specified, then the plugins.zip version is required. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html">Installing custom
     * plugins</a>.
     * </p>
     */
    private String pluginsS3Path;
    /**
     * <p>
     * The version of the requirements.txt file on your Amazon S3 bucket. A version must be specified each time a
     * requirements.txt file is updated. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     * works</a>.
     * </p>
     */
    private String requirementsS3ObjectVersion;
    /**
     * <p>
     * The relative path to the <code>requirements.txt</code> file on your Amazon S3 bucket. For example,
     * <code>requirements.txt</code>. If specified, then a file version is required. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html">Installing Python
     * dependencies</a>.
     * </p>
     */
    private String requirementsS3Path;
    /**
     * <p>
     * The number of Apache Airflow schedulers to run in your Amazon MWAA environment.
     * </p>
     */
    private Integer schedulers;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are stored. For
     * example, <code>arn:aws:s3:::my-airflow-bucket-unique-name</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html">Create an Amazon S3 bucket for
     * Amazon MWAA</a>.
     * </p>
     */
    private String sourceBucketArn;
    /**
     * <p>
     * The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow access
     * modes</a>.
     * </p>
     */
    private String webserverAccessMode;
    /**
     * <p>
     * The day and time of the week to start weekly maintenance updates of your environment in the following format:
     * <code>DAY:HH:MM</code>. For example: <code>TUE:03:30</code>. You can specify a start time in 30 minute increments
     * only. Supported input includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\\d|2[0-3]):(00|30)
     * </p>
     * </li>
     * </ul>
     */
    private String weeklyMaintenanceWindowStart;

    /**
     * <p>
     * A list of key-value pairs containing the Apache Airflow configuration options you want to attach to your
     * environment. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Apache Airflow
     * configuration options</a>.
     * </p>
     * 
     * @return A list of key-value pairs containing the Apache Airflow configuration options you want to attach to your
     *         environment. To learn more, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Apache Airflow
     *         configuration options</a>.
     */

    public java.util.Map<String, String> getAirflowConfigurationOptions() {
        return airflowConfigurationOptions;
    }

    /**
     * <p>
     * A list of key-value pairs containing the Apache Airflow configuration options you want to attach to your
     * environment. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Apache Airflow
     * configuration options</a>.
     * </p>
     * 
     * @param airflowConfigurationOptions
     *        A list of key-value pairs containing the Apache Airflow configuration options you want to attach to your
     *        environment. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Apache Airflow
     *        configuration options</a>.
     */

    public void setAirflowConfigurationOptions(java.util.Map<String, String> airflowConfigurationOptions) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
    }

    /**
     * <p>
     * A list of key-value pairs containing the Apache Airflow configuration options you want to attach to your
     * environment. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Apache Airflow
     * configuration options</a>.
     * </p>
     * 
     * @param airflowConfigurationOptions
     *        A list of key-value pairs containing the Apache Airflow configuration options you want to attach to your
     *        environment. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Apache Airflow
     *        configuration options</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withAirflowConfigurationOptions(java.util.Map<String, String> airflowConfigurationOptions) {
        setAirflowConfigurationOptions(airflowConfigurationOptions);
        return this;
    }

    /**
     * Add a single AirflowConfigurationOptions entry
     *
     * @see UpdateEnvironmentRequest#withAirflowConfigurationOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest addAirflowConfigurationOptionsEntry(String key, String value) {
        if (null == this.airflowConfigurationOptions) {
            this.airflowConfigurationOptions = new java.util.HashMap<String, String>();
        }
        if (this.airflowConfigurationOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.airflowConfigurationOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AirflowConfigurationOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest clearAirflowConfigurationOptionsEntries() {
        this.airflowConfigurationOptions = null;
        return this;
    }

    /**
     * <p>
     * The Apache Airflow version for your environment. For example, <code>v1.10.12</code>. If no value is specified,
     * defaults to the latest version. Valid values: <code>v1.10.12</code>.
     * </p>
     * 
     * @param airflowVersion
     *        The Apache Airflow version for your environment. For example, <code>v1.10.12</code>. If no value is
     *        specified, defaults to the latest version. Valid values: <code>v1.10.12</code>.
     */

    public void setAirflowVersion(String airflowVersion) {
        this.airflowVersion = airflowVersion;
    }

    /**
     * <p>
     * The Apache Airflow version for your environment. For example, <code>v1.10.12</code>. If no value is specified,
     * defaults to the latest version. Valid values: <code>v1.10.12</code>.
     * </p>
     * 
     * @return The Apache Airflow version for your environment. For example, <code>v1.10.12</code>. If no value is
     *         specified, defaults to the latest version. Valid values: <code>v1.10.12</code>.
     */

    public String getAirflowVersion() {
        return this.airflowVersion;
    }

    /**
     * <p>
     * The Apache Airflow version for your environment. For example, <code>v1.10.12</code>. If no value is specified,
     * defaults to the latest version. Valid values: <code>v1.10.12</code>.
     * </p>
     * 
     * @param airflowVersion
     *        The Apache Airflow version for your environment. For example, <code>v1.10.12</code>. If no value is
     *        specified, defaults to the latest version. Valid values: <code>v1.10.12</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withAirflowVersion(String airflowVersion) {
        setAirflowVersion(airflowVersion);
        return this;
    }

    /**
     * <p>
     * The relative path to the DAGs folder on your Amazon S3 bucket. For example, <code>dags</code>. To learn more, see
     * <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html">Adding or updating
     * DAGs</a>.
     * </p>
     * 
     * @param dagS3Path
     *        The relative path to the DAGs folder on your Amazon S3 bucket. For example, <code>dags</code>. To learn
     *        more, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html">Adding
     *        or updating DAGs</a>.
     */

    public void setDagS3Path(String dagS3Path) {
        this.dagS3Path = dagS3Path;
    }

    /**
     * <p>
     * The relative path to the DAGs folder on your Amazon S3 bucket. For example, <code>dags</code>. To learn more, see
     * <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html">Adding or updating
     * DAGs</a>.
     * </p>
     * 
     * @return The relative path to the DAGs folder on your Amazon S3 bucket. For example, <code>dags</code>. To learn
     *         more, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html">Adding
     *         or updating DAGs</a>.
     */

    public String getDagS3Path() {
        return this.dagS3Path;
    }

    /**
     * <p>
     * The relative path to the DAGs folder on your Amazon S3 bucket. For example, <code>dags</code>. To learn more, see
     * <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html">Adding or updating
     * DAGs</a>.
     * </p>
     * 
     * @param dagS3Path
     *        The relative path to the DAGs folder on your Amazon S3 bucket. For example, <code>dags</code>. To learn
     *        more, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-folder.html">Adding
     *        or updating DAGs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDagS3Path(String dagS3Path) {
        setDagS3Path(dagS3Path);
        return this;
    }

    /**
     * <p>
     * The environment class type. Valid values: <code>mw1.small</code>, <code>mw1.medium</code>, <code>mw1.large</code>
     * . To learn more, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html">Amazon
     * MWAA environment class</a>.
     * </p>
     * 
     * @param environmentClass
     *        The environment class type. Valid values: <code>mw1.small</code>, <code>mw1.medium</code>,
     *        <code>mw1.large</code>. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html">Amazon MWAA environment
     *        class</a>.
     */

    public void setEnvironmentClass(String environmentClass) {
        this.environmentClass = environmentClass;
    }

    /**
     * <p>
     * The environment class type. Valid values: <code>mw1.small</code>, <code>mw1.medium</code>, <code>mw1.large</code>
     * . To learn more, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html">Amazon
     * MWAA environment class</a>.
     * </p>
     * 
     * @return The environment class type. Valid values: <code>mw1.small</code>, <code>mw1.medium</code>,
     *         <code>mw1.large</code>. To learn more, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html">Amazon MWAA environment
     *         class</a>.
     */

    public String getEnvironmentClass() {
        return this.environmentClass;
    }

    /**
     * <p>
     * The environment class type. Valid values: <code>mw1.small</code>, <code>mw1.medium</code>, <code>mw1.large</code>
     * . To learn more, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html">Amazon
     * MWAA environment class</a>.
     * </p>
     * 
     * @param environmentClass
     *        The environment class type. Valid values: <code>mw1.small</code>, <code>mw1.medium</code>,
     *        <code>mw1.large</code>. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/environment-class.html">Amazon MWAA environment
     *        class</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEnvironmentClass(String environmentClass) {
        setEnvironmentClass(environmentClass);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS resources in your
     * environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html">Amazon MWAA Execution role</a>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS resources in
     *        your environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. To learn more,
     *        see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html">Amazon MWAA
     *        Execution role</a>.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS resources in your
     * environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html">Amazon MWAA Execution role</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS resources in
     *         your environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. To learn more,
     *         see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html">Amazon MWAA
     *         Execution role</a>.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS resources in your
     * environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html">Amazon MWAA Execution role</a>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access AWS resources in
     *        your environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. To learn more,
     *        see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html">Amazon MWAA
     *        Execution role</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * Defines the Apache Airflow logs to send to CloudWatch Logs: <code>DagProcessingLogs</code>,
     * <code>SchedulerLogs</code>, <code>TaskLogs</code>, <code>WebserverLogs</code>, <code>WorkerLogs</code>.
     * </p>
     * 
     * @param loggingConfiguration
     *        Defines the Apache Airflow logs to send to CloudWatch Logs: <code>DagProcessingLogs</code>,
     *        <code>SchedulerLogs</code>, <code>TaskLogs</code>, <code>WebserverLogs</code>, <code>WorkerLogs</code>.
     */

    public void setLoggingConfiguration(LoggingConfigurationInput loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * Defines the Apache Airflow logs to send to CloudWatch Logs: <code>DagProcessingLogs</code>,
     * <code>SchedulerLogs</code>, <code>TaskLogs</code>, <code>WebserverLogs</code>, <code>WorkerLogs</code>.
     * </p>
     * 
     * @return Defines the Apache Airflow logs to send to CloudWatch Logs: <code>DagProcessingLogs</code>,
     *         <code>SchedulerLogs</code>, <code>TaskLogs</code>, <code>WebserverLogs</code>, <code>WorkerLogs</code>.
     */

    public LoggingConfigurationInput getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * Defines the Apache Airflow logs to send to CloudWatch Logs: <code>DagProcessingLogs</code>,
     * <code>SchedulerLogs</code>, <code>TaskLogs</code>, <code>WebserverLogs</code>, <code>WorkerLogs</code>.
     * </p>
     * 
     * @param loggingConfiguration
     *        Defines the Apache Airflow logs to send to CloudWatch Logs: <code>DagProcessingLogs</code>,
     *        <code>SchedulerLogs</code>, <code>TaskLogs</code>, <code>WebserverLogs</code>, <code>WorkerLogs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withLoggingConfiguration(LoggingConfigurationInput loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers up to the number you specify in the <code>MaxWorkers</code> field. For example, <code>20</code>. When
     * there are no more tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the one
     * worker that is included with your environment, or the number you specify in <code>MinWorkers</code>.
     * </p>
     * 
     * @param maxWorkers
     *        The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *        Airflow workers up to the number you specify in the <code>MaxWorkers</code> field. For example,
     *        <code>20</code>. When there are no more tasks running, and no more in the queue, MWAA disposes of the
     *        extra workers leaving the one worker that is included with your environment, or the number you specify in
     *        <code>MinWorkers</code>.
     */

    public void setMaxWorkers(Integer maxWorkers) {
        this.maxWorkers = maxWorkers;
    }

    /**
     * <p>
     * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers up to the number you specify in the <code>MaxWorkers</code> field. For example, <code>20</code>. When
     * there are no more tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the one
     * worker that is included with your environment, or the number you specify in <code>MinWorkers</code>.
     * </p>
     * 
     * @return The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *         Airflow workers up to the number you specify in the <code>MaxWorkers</code> field. For example,
     *         <code>20</code>. When there are no more tasks running, and no more in the queue, MWAA disposes of the
     *         extra workers leaving the one worker that is included with your environment, or the number you specify in
     *         <code>MinWorkers</code>.
     */

    public Integer getMaxWorkers() {
        return this.maxWorkers;
    }

    /**
     * <p>
     * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers up to the number you specify in the <code>MaxWorkers</code> field. For example, <code>20</code>. When
     * there are no more tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the one
     * worker that is included with your environment, or the number you specify in <code>MinWorkers</code>.
     * </p>
     * 
     * @param maxWorkers
     *        The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *        Airflow workers up to the number you specify in the <code>MaxWorkers</code> field. For example,
     *        <code>20</code>. When there are no more tasks running, and no more in the queue, MWAA disposes of the
     *        extra workers leaving the one worker that is included with your environment, or the number you specify in
     *        <code>MinWorkers</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withMaxWorkers(Integer maxWorkers) {
        setMaxWorkers(maxWorkers);
        return this;
    }

    /**
     * <p>
     * The minimum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers up to the number you specify in the <code>MaxWorkers</code> field. When there are no more tasks running,
     * and no more in the queue, MWAA disposes of the extra workers leaving the worker count you specify in the
     * <code>MinWorkers</code> field. For example, <code>2</code>.
     * </p>
     * 
     * @param minWorkers
     *        The minimum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *        Airflow workers up to the number you specify in the <code>MaxWorkers</code> field. When there are no more
     *        tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the worker count you
     *        specify in the <code>MinWorkers</code> field. For example, <code>2</code>.
     */

    public void setMinWorkers(Integer minWorkers) {
        this.minWorkers = minWorkers;
    }

    /**
     * <p>
     * The minimum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers up to the number you specify in the <code>MaxWorkers</code> field. When there are no more tasks running,
     * and no more in the queue, MWAA disposes of the extra workers leaving the worker count you specify in the
     * <code>MinWorkers</code> field. For example, <code>2</code>.
     * </p>
     * 
     * @return The minimum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *         Airflow workers up to the number you specify in the <code>MaxWorkers</code> field. When there are no more
     *         tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the worker count you
     *         specify in the <code>MinWorkers</code> field. For example, <code>2</code>.
     */

    public Integer getMinWorkers() {
        return this.minWorkers;
    }

    /**
     * <p>
     * The minimum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers up to the number you specify in the <code>MaxWorkers</code> field. When there are no more tasks running,
     * and no more in the queue, MWAA disposes of the extra workers leaving the worker count you specify in the
     * <code>MinWorkers</code> field. For example, <code>2</code>.
     * </p>
     * 
     * @param minWorkers
     *        The minimum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *        Airflow workers up to the number you specify in the <code>MaxWorkers</code> field. When there are no more
     *        tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the worker count you
     *        specify in the <code>MinWorkers</code> field. For example, <code>2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withMinWorkers(Integer minWorkers) {
        setMinWorkers(minWorkers);
        return this;
    }

    /**
     * <p>
     * The name of your Amazon MWAA environment. For example, <code>MyMWAAEnvironment</code>.
     * </p>
     * 
     * @param name
     *        The name of your Amazon MWAA environment. For example, <code>MyMWAAEnvironment</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of your Amazon MWAA environment. For example, <code>MyMWAAEnvironment</code>.
     * </p>
     * 
     * @return The name of your Amazon MWAA environment. For example, <code>MyMWAAEnvironment</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of your Amazon MWAA environment. For example, <code>MyMWAAEnvironment</code>.
     * </p>
     * 
     * @param name
     *        The name of your Amazon MWAA environment. For example, <code>MyMWAAEnvironment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The VPC networking components used to secure and enable network traffic between the AWS resources for your
     * environment. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html">About networking on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param networkConfiguration
     *        The VPC networking components used to secure and enable network traffic between the AWS resources for your
     *        environment. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html">About networking on Amazon
     *        MWAA</a>.
     */

    public void setNetworkConfiguration(UpdateNetworkConfigurationInput networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The VPC networking components used to secure and enable network traffic between the AWS resources for your
     * environment. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html">About networking on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @return The VPC networking components used to secure and enable network traffic between the AWS resources for
     *         your environment. To learn more, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html">About networking on Amazon
     *         MWAA</a>.
     */

    public UpdateNetworkConfigurationInput getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The VPC networking components used to secure and enable network traffic between the AWS resources for your
     * environment. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html">About networking on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param networkConfiguration
     *        The VPC networking components used to secure and enable network traffic between the AWS resources for your
     *        environment. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html">About networking on Amazon
     *        MWAA</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withNetworkConfiguration(UpdateNetworkConfigurationInput networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The version of the plugins.zip file on your Amazon S3 bucket. A version must be specified each time a plugins.zip
     * file is updated. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     * works</a>.
     * </p>
     * 
     * @param pluginsS3ObjectVersion
     *        The version of the plugins.zip file on your Amazon S3 bucket. A version must be specified each time a
     *        plugins.zip file is updated. To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     *        works</a>.
     */

    public void setPluginsS3ObjectVersion(String pluginsS3ObjectVersion) {
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
    }

    /**
     * <p>
     * The version of the plugins.zip file on your Amazon S3 bucket. A version must be specified each time a plugins.zip
     * file is updated. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     * works</a>.
     * </p>
     * 
     * @return The version of the plugins.zip file on your Amazon S3 bucket. A version must be specified each time a
     *         plugins.zip file is updated. To learn more, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     *         works</a>.
     */

    public String getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion;
    }

    /**
     * <p>
     * The version of the plugins.zip file on your Amazon S3 bucket. A version must be specified each time a plugins.zip
     * file is updated. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     * works</a>.
     * </p>
     * 
     * @param pluginsS3ObjectVersion
     *        The version of the plugins.zip file on your Amazon S3 bucket. A version must be specified each time a
     *        plugins.zip file is updated. To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     *        works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withPluginsS3ObjectVersion(String pluginsS3ObjectVersion) {
        setPluginsS3ObjectVersion(pluginsS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The relative path to the <code>plugins.zip</code> file on your Amazon S3 bucket. For example,
     * <code>plugins.zip</code>. If specified, then the plugins.zip version is required. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html">Installing custom
     * plugins</a>.
     * </p>
     * 
     * @param pluginsS3Path
     *        The relative path to the <code>plugins.zip</code> file on your Amazon S3 bucket. For example,
     *        <code>plugins.zip</code>. If specified, then the plugins.zip version is required. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html">Installing
     *        custom plugins</a>.
     */

    public void setPluginsS3Path(String pluginsS3Path) {
        this.pluginsS3Path = pluginsS3Path;
    }

    /**
     * <p>
     * The relative path to the <code>plugins.zip</code> file on your Amazon S3 bucket. For example,
     * <code>plugins.zip</code>. If specified, then the plugins.zip version is required. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html">Installing custom
     * plugins</a>.
     * </p>
     * 
     * @return The relative path to the <code>plugins.zip</code> file on your Amazon S3 bucket. For example,
     *         <code>plugins.zip</code>. If specified, then the plugins.zip version is required. To learn more, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html">Installing
     *         custom plugins</a>.
     */

    public String getPluginsS3Path() {
        return this.pluginsS3Path;
    }

    /**
     * <p>
     * The relative path to the <code>plugins.zip</code> file on your Amazon S3 bucket. For example,
     * <code>plugins.zip</code>. If specified, then the plugins.zip version is required. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html">Installing custom
     * plugins</a>.
     * </p>
     * 
     * @param pluginsS3Path
     *        The relative path to the <code>plugins.zip</code> file on your Amazon S3 bucket. For example,
     *        <code>plugins.zip</code>. If specified, then the plugins.zip version is required. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import-plugins.html">Installing
     *        custom plugins</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withPluginsS3Path(String pluginsS3Path) {
        setPluginsS3Path(pluginsS3Path);
        return this;
    }

    /**
     * <p>
     * The version of the requirements.txt file on your Amazon S3 bucket. A version must be specified each time a
     * requirements.txt file is updated. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     * works</a>.
     * </p>
     * 
     * @param requirementsS3ObjectVersion
     *        The version of the requirements.txt file on your Amazon S3 bucket. A version must be specified each time a
     *        requirements.txt file is updated. To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     *        works</a>.
     */

    public void setRequirementsS3ObjectVersion(String requirementsS3ObjectVersion) {
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
    }

    /**
     * <p>
     * The version of the requirements.txt file on your Amazon S3 bucket. A version must be specified each time a
     * requirements.txt file is updated. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     * works</a>.
     * </p>
     * 
     * @return The version of the requirements.txt file on your Amazon S3 bucket. A version must be specified each time
     *         a requirements.txt file is updated. To learn more, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     *         works</a>.
     */

    public String getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion;
    }

    /**
     * <p>
     * The version of the requirements.txt file on your Amazon S3 bucket. A version must be specified each time a
     * requirements.txt file is updated. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     * works</a>.
     * </p>
     * 
     * @param requirementsS3ObjectVersion
     *        The version of the requirements.txt file on your Amazon S3 bucket. A version must be specified each time a
     *        requirements.txt file is updated. To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/versioning-workflows.html">How S3 Versioning
     *        works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withRequirementsS3ObjectVersion(String requirementsS3ObjectVersion) {
        setRequirementsS3ObjectVersion(requirementsS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The relative path to the <code>requirements.txt</code> file on your Amazon S3 bucket. For example,
     * <code>requirements.txt</code>. If specified, then a file version is required. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html">Installing Python
     * dependencies</a>.
     * </p>
     * 
     * @param requirementsS3Path
     *        The relative path to the <code>requirements.txt</code> file on your Amazon S3 bucket. For example,
     *        <code>requirements.txt</code>. If specified, then a file version is required. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html">Installing Python
     *        dependencies</a>.
     */

    public void setRequirementsS3Path(String requirementsS3Path) {
        this.requirementsS3Path = requirementsS3Path;
    }

    /**
     * <p>
     * The relative path to the <code>requirements.txt</code> file on your Amazon S3 bucket. For example,
     * <code>requirements.txt</code>. If specified, then a file version is required. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html">Installing Python
     * dependencies</a>.
     * </p>
     * 
     * @return The relative path to the <code>requirements.txt</code> file on your Amazon S3 bucket. For example,
     *         <code>requirements.txt</code>. If specified, then a file version is required. To learn more, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html">Installing Python
     *         dependencies</a>.
     */

    public String getRequirementsS3Path() {
        return this.requirementsS3Path;
    }

    /**
     * <p>
     * The relative path to the <code>requirements.txt</code> file on your Amazon S3 bucket. For example,
     * <code>requirements.txt</code>. If specified, then a file version is required. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html">Installing Python
     * dependencies</a>.
     * </p>
     * 
     * @param requirementsS3Path
     *        The relative path to the <code>requirements.txt</code> file on your Amazon S3 bucket. For example,
     *        <code>requirements.txt</code>. If specified, then a file version is required. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/working-dags-dependencies.html">Installing Python
     *        dependencies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withRequirementsS3Path(String requirementsS3Path) {
        setRequirementsS3Path(requirementsS3Path);
        return this;
    }

    /**
     * <p>
     * The number of Apache Airflow schedulers to run in your Amazon MWAA environment.
     * </p>
     * 
     * @param schedulers
     *        The number of Apache Airflow schedulers to run in your Amazon MWAA environment.
     */

    public void setSchedulers(Integer schedulers) {
        this.schedulers = schedulers;
    }

    /**
     * <p>
     * The number of Apache Airflow schedulers to run in your Amazon MWAA environment.
     * </p>
     * 
     * @return The number of Apache Airflow schedulers to run in your Amazon MWAA environment.
     */

    public Integer getSchedulers() {
        return this.schedulers;
    }

    /**
     * <p>
     * The number of Apache Airflow schedulers to run in your Amazon MWAA environment.
     * </p>
     * 
     * @param schedulers
     *        The number of Apache Airflow schedulers to run in your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withSchedulers(Integer schedulers) {
        setSchedulers(schedulers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are stored. For
     * example, <code>arn:aws:s3:::my-airflow-bucket-unique-name</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html">Create an Amazon S3 bucket for
     * Amazon MWAA</a>.
     * </p>
     * 
     * @param sourceBucketArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are
     *        stored. For example, <code>arn:aws:s3:::my-airflow-bucket-unique-name</code>. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html">Create an Amazon S3 bucket
     *        for Amazon MWAA</a>.
     */

    public void setSourceBucketArn(String sourceBucketArn) {
        this.sourceBucketArn = sourceBucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are stored. For
     * example, <code>arn:aws:s3:::my-airflow-bucket-unique-name</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html">Create an Amazon S3 bucket for
     * Amazon MWAA</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are
     *         stored. For example, <code>arn:aws:s3:::my-airflow-bucket-unique-name</code>. To learn more, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html">Create an Amazon S3 bucket
     *         for Amazon MWAA</a>.
     */

    public String getSourceBucketArn() {
        return this.sourceBucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are stored. For
     * example, <code>arn:aws:s3:::my-airflow-bucket-unique-name</code>. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html">Create an Amazon S3 bucket for
     * Amazon MWAA</a>.
     * </p>
     * 
     * @param sourceBucketArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are
     *        stored. For example, <code>arn:aws:s3:::my-airflow-bucket-unique-name</code>. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-s3-bucket.html">Create an Amazon S3 bucket
     *        for Amazon MWAA</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withSourceBucketArn(String sourceBucketArn) {
        setSourceBucketArn(sourceBucketArn);
        return this;
    }

    /**
     * <p>
     * The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow access
     * modes</a>.
     * </p>
     * 
     * @param webserverAccessMode
     *        The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow access
     *        modes</a>.
     * @see WebserverAccessMode
     */

    public void setWebserverAccessMode(String webserverAccessMode) {
        this.webserverAccessMode = webserverAccessMode;
    }

    /**
     * <p>
     * The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow access
     * modes</a>.
     * </p>
     * 
     * @return The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow
     *         access modes</a>.
     * @see WebserverAccessMode
     */

    public String getWebserverAccessMode() {
        return this.webserverAccessMode;
    }

    /**
     * <p>
     * The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow access
     * modes</a>.
     * </p>
     * 
     * @param webserverAccessMode
     *        The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow access
     *        modes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebserverAccessMode
     */

    public UpdateEnvironmentRequest withWebserverAccessMode(String webserverAccessMode) {
        setWebserverAccessMode(webserverAccessMode);
        return this;
    }

    /**
     * <p>
     * The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow access
     * modes</a>.
     * </p>
     * 
     * @param webserverAccessMode
     *        The Apache Airflow <i>Web server</i> access mode. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-networking.html">Apache Airflow access
     *        modes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebserverAccessMode
     */

    public UpdateEnvironmentRequest withWebserverAccessMode(WebserverAccessMode webserverAccessMode) {
        this.webserverAccessMode = webserverAccessMode.toString();
        return this;
    }

    /**
     * <p>
     * The day and time of the week to start weekly maintenance updates of your environment in the following format:
     * <code>DAY:HH:MM</code>. For example: <code>TUE:03:30</code>. You can specify a start time in 30 minute increments
     * only. Supported input includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\\d|2[0-3]):(00|30)
     * </p>
     * </li>
     * </ul>
     * 
     * @param weeklyMaintenanceWindowStart
     *        The day and time of the week to start weekly maintenance updates of your environment in the following
     *        format: <code>DAY:HH:MM</code>. For example: <code>TUE:03:30</code>. You can specify a start time in 30
     *        minute increments only. Supported input includes the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        MON|TUE|WED|THU|FRI|SAT|SUN:([01]\\d|2[0-3]):(00|30)
     *        </p>
     *        </li>
     */

    public void setWeeklyMaintenanceWindowStart(String weeklyMaintenanceWindowStart) {
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    /**
     * <p>
     * The day and time of the week to start weekly maintenance updates of your environment in the following format:
     * <code>DAY:HH:MM</code>. For example: <code>TUE:03:30</code>. You can specify a start time in 30 minute increments
     * only. Supported input includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\\d|2[0-3]):(00|30)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The day and time of the week to start weekly maintenance updates of your environment in the following
     *         format: <code>DAY:HH:MM</code>. For example: <code>TUE:03:30</code>. You can specify a start time in 30
     *         minute increments only. Supported input includes the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         MON|TUE|WED|THU|FRI|SAT|SUN:([01]\\d|2[0-3]):(00|30)
     *         </p>
     *         </li>
     */

    public String getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart;
    }

    /**
     * <p>
     * The day and time of the week to start weekly maintenance updates of your environment in the following format:
     * <code>DAY:HH:MM</code>. For example: <code>TUE:03:30</code>. You can specify a start time in 30 minute increments
     * only. Supported input includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MON|TUE|WED|THU|FRI|SAT|SUN:([01]\\d|2[0-3]):(00|30)
     * </p>
     * </li>
     * </ul>
     * 
     * @param weeklyMaintenanceWindowStart
     *        The day and time of the week to start weekly maintenance updates of your environment in the following
     *        format: <code>DAY:HH:MM</code>. For example: <code>TUE:03:30</code>. You can specify a start time in 30
     *        minute increments only. Supported input includes the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        MON|TUE|WED|THU|FRI|SAT|SUN:([01]\\d|2[0-3]):(00|30)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withWeeklyMaintenanceWindowStart(String weeklyMaintenanceWindowStart) {
        setWeeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart);
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
        if (getAirflowConfigurationOptions() != null)
            sb.append("AirflowConfigurationOptions: ").append("***Sensitive Data Redacted***").append(",");
        if (getAirflowVersion() != null)
            sb.append("AirflowVersion: ").append(getAirflowVersion()).append(",");
        if (getDagS3Path() != null)
            sb.append("DagS3Path: ").append(getDagS3Path()).append(",");
        if (getEnvironmentClass() != null)
            sb.append("EnvironmentClass: ").append(getEnvironmentClass()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration()).append(",");
        if (getMaxWorkers() != null)
            sb.append("MaxWorkers: ").append(getMaxWorkers()).append(",");
        if (getMinWorkers() != null)
            sb.append("MinWorkers: ").append(getMinWorkers()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getPluginsS3ObjectVersion() != null)
            sb.append("PluginsS3ObjectVersion: ").append(getPluginsS3ObjectVersion()).append(",");
        if (getPluginsS3Path() != null)
            sb.append("PluginsS3Path: ").append(getPluginsS3Path()).append(",");
        if (getRequirementsS3ObjectVersion() != null)
            sb.append("RequirementsS3ObjectVersion: ").append(getRequirementsS3ObjectVersion()).append(",");
        if (getRequirementsS3Path() != null)
            sb.append("RequirementsS3Path: ").append(getRequirementsS3Path()).append(",");
        if (getSchedulers() != null)
            sb.append("Schedulers: ").append(getSchedulers()).append(",");
        if (getSourceBucketArn() != null)
            sb.append("SourceBucketArn: ").append(getSourceBucketArn()).append(",");
        if (getWebserverAccessMode() != null)
            sb.append("WebserverAccessMode: ").append(getWebserverAccessMode()).append(",");
        if (getWeeklyMaintenanceWindowStart() != null)
            sb.append("WeeklyMaintenanceWindowStart: ").append(getWeeklyMaintenanceWindowStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentRequest == false)
            return false;
        UpdateEnvironmentRequest other = (UpdateEnvironmentRequest) obj;
        if (other.getAirflowConfigurationOptions() == null ^ this.getAirflowConfigurationOptions() == null)
            return false;
        if (other.getAirflowConfigurationOptions() != null && other.getAirflowConfigurationOptions().equals(this.getAirflowConfigurationOptions()) == false)
            return false;
        if (other.getAirflowVersion() == null ^ this.getAirflowVersion() == null)
            return false;
        if (other.getAirflowVersion() != null && other.getAirflowVersion().equals(this.getAirflowVersion()) == false)
            return false;
        if (other.getDagS3Path() == null ^ this.getDagS3Path() == null)
            return false;
        if (other.getDagS3Path() != null && other.getDagS3Path().equals(this.getDagS3Path()) == false)
            return false;
        if (other.getEnvironmentClass() == null ^ this.getEnvironmentClass() == null)
            return false;
        if (other.getEnvironmentClass() != null && other.getEnvironmentClass().equals(this.getEnvironmentClass()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        if (other.getMaxWorkers() == null ^ this.getMaxWorkers() == null)
            return false;
        if (other.getMaxWorkers() != null && other.getMaxWorkers().equals(this.getMaxWorkers()) == false)
            return false;
        if (other.getMinWorkers() == null ^ this.getMinWorkers() == null)
            return false;
        if (other.getMinWorkers() != null && other.getMinWorkers().equals(this.getMinWorkers()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getPluginsS3ObjectVersion() == null ^ this.getPluginsS3ObjectVersion() == null)
            return false;
        if (other.getPluginsS3ObjectVersion() != null && other.getPluginsS3ObjectVersion().equals(this.getPluginsS3ObjectVersion()) == false)
            return false;
        if (other.getPluginsS3Path() == null ^ this.getPluginsS3Path() == null)
            return false;
        if (other.getPluginsS3Path() != null && other.getPluginsS3Path().equals(this.getPluginsS3Path()) == false)
            return false;
        if (other.getRequirementsS3ObjectVersion() == null ^ this.getRequirementsS3ObjectVersion() == null)
            return false;
        if (other.getRequirementsS3ObjectVersion() != null && other.getRequirementsS3ObjectVersion().equals(this.getRequirementsS3ObjectVersion()) == false)
            return false;
        if (other.getRequirementsS3Path() == null ^ this.getRequirementsS3Path() == null)
            return false;
        if (other.getRequirementsS3Path() != null && other.getRequirementsS3Path().equals(this.getRequirementsS3Path()) == false)
            return false;
        if (other.getSchedulers() == null ^ this.getSchedulers() == null)
            return false;
        if (other.getSchedulers() != null && other.getSchedulers().equals(this.getSchedulers()) == false)
            return false;
        if (other.getSourceBucketArn() == null ^ this.getSourceBucketArn() == null)
            return false;
        if (other.getSourceBucketArn() != null && other.getSourceBucketArn().equals(this.getSourceBucketArn()) == false)
            return false;
        if (other.getWebserverAccessMode() == null ^ this.getWebserverAccessMode() == null)
            return false;
        if (other.getWebserverAccessMode() != null && other.getWebserverAccessMode().equals(this.getWebserverAccessMode()) == false)
            return false;
        if (other.getWeeklyMaintenanceWindowStart() == null ^ this.getWeeklyMaintenanceWindowStart() == null)
            return false;
        if (other.getWeeklyMaintenanceWindowStart() != null && other.getWeeklyMaintenanceWindowStart().equals(this.getWeeklyMaintenanceWindowStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAirflowConfigurationOptions() == null) ? 0 : getAirflowConfigurationOptions().hashCode());
        hashCode = prime * hashCode + ((getAirflowVersion() == null) ? 0 : getAirflowVersion().hashCode());
        hashCode = prime * hashCode + ((getDagS3Path() == null) ? 0 : getDagS3Path().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentClass() == null) ? 0 : getEnvironmentClass().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMaxWorkers() == null) ? 0 : getMaxWorkers().hashCode());
        hashCode = prime * hashCode + ((getMinWorkers() == null) ? 0 : getMinWorkers().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPluginsS3ObjectVersion() == null) ? 0 : getPluginsS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getPluginsS3Path() == null) ? 0 : getPluginsS3Path().hashCode());
        hashCode = prime * hashCode + ((getRequirementsS3ObjectVersion() == null) ? 0 : getRequirementsS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getRequirementsS3Path() == null) ? 0 : getRequirementsS3Path().hashCode());
        hashCode = prime * hashCode + ((getSchedulers() == null) ? 0 : getSchedulers().hashCode());
        hashCode = prime * hashCode + ((getSourceBucketArn() == null) ? 0 : getSourceBucketArn().hashCode());
        hashCode = prime * hashCode + ((getWebserverAccessMode() == null) ? 0 : getWebserverAccessMode().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceWindowStart() == null) ? 0 : getWeeklyMaintenanceWindowStart().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentRequest clone() {
        return (UpdateEnvironmentRequest) super.clone();
    }

}
