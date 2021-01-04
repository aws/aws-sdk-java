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
 * <p>
 * This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation to create an
 * environment. For more information, see <a
 * href="https://docs.aws.amazon.com/mwaa/latest/userguide/get-started.html">Get started with Amazon Managed Workflows
 * for Apache Airflow</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Apache Airflow configuration setting you want to override in your environment. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Environment
     * configuration</a>.
     * </p>
     */
    private java.util.Map<String, String> airflowConfigurationOptions;
    /**
     * <p>
     * The Apache Airflow version you want to use for your environment.
     * </p>
     */
    private String airflowVersion;
    /**
     * <p>
     * The relative path to the DAG folder on your Amazon S3 storage bucket. For example, <code>dags</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     */
    private String dagS3Path;
    /**
     * <p>
     * The environment class you want to use for your environment. The environment class determines the size of the
     * containers and database used for your Apache Airflow services.
     * </p>
     */
    private String environmentClass;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role for your environment. An execution role is an AWS Identity
     * and Access Management (IAM) role that grants MWAA permission to access AWS services and resources used by your
     * environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. For more information, see
     * <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/manage-access.html">Managing access to Amazon Managed
     * Workflows for Apache Airflow</a>.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment. You can use an AWS
     * KMS key managed by MWAA, or a custom KMS key (advanced). For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html?icmpid=docs_console_unmapped#master_keys"
     * >Customer master keys (CMKs)</a> in the AWS KMS developer guide.
     * </p>
     */
    private String kmsKey;
    /**
     * <p>
     * The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     * </p>
     */
    private LoggingConfigurationInput loggingConfiguration;
    /**
     * <p>
     * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers and the Fargate containers that run your tasks up to the number you specify in this field. When there are
     * no more tasks running, and no more in the queue, MWAA disposes of the extra containers leaving the one worker
     * that is included with your environment.
     * </p>
     */
    private Integer maxWorkers;
    /**
     * <p>
     * The name of your MWAA environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The VPC networking components you want to use for your environment. At least two private subnet identifiers and
     * one VPC security group identifier are required to create an environment. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The <code>plugins.zip</code> file version you want to use.
     * </p>
     */
    private String pluginsS3ObjectVersion;
    /**
     * <p>
     * The relative path to the <code>plugins.zip</code> file on your Amazon S3 storage bucket. For example,
     * <code>plugins.zip</code>. If a relative path is provided in the request, then <code>PluginsS3ObjectVersion</code>
     * is required. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     */
    private String pluginsS3Path;
    /**
     * <p>
     * The <code>requirements.txt</code> file version you want to use.
     * </p>
     */
    private String requirementsS3ObjectVersion;
    /**
     * <p>
     * The relative path to the <code>requirements.txt</code> file on your Amazon S3 storage bucket. For example,
     * <code>requirements.txt</code>. If a relative path is provided in the request, then
     * <code>RequirementsS3ObjectVersion</code> is required. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     */
    private String requirementsS3Path;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example,
     * <code>arn:aws:s3:::airflow-mybucketname</code>.
     * </p>
     */
    private String sourceBucketArn;
    /**
     * <p>
     * The metadata tags you want to attach to your environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be accessed
     * over the Internet by users granted access in your IAM policy. A private network limits access of your Airflow UI
     * to users within your VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     */
    private String webserverAccessMode;
    /**
     * <p>
     * The day and time you want MWAA to start weekly maintenance updates on your environment.
     * </p>
     */
    private String weeklyMaintenanceWindowStart;

    /**
     * <p>
     * The Apache Airflow configuration setting you want to override in your environment. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Environment
     * configuration</a>.
     * </p>
     * 
     * @return The Apache Airflow configuration setting you want to override in your environment. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Environment
     *         configuration</a>.
     */

    public java.util.Map<String, String> getAirflowConfigurationOptions() {
        return airflowConfigurationOptions;
    }

    /**
     * <p>
     * The Apache Airflow configuration setting you want to override in your environment. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Environment
     * configuration</a>.
     * </p>
     * 
     * @param airflowConfigurationOptions
     *        The Apache Airflow configuration setting you want to override in your environment. For more information,
     *        see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Environment
     *        configuration</a>.
     */

    public void setAirflowConfigurationOptions(java.util.Map<String, String> airflowConfigurationOptions) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
    }

    /**
     * <p>
     * The Apache Airflow configuration setting you want to override in your environment. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Environment
     * configuration</a>.
     * </p>
     * 
     * @param airflowConfigurationOptions
     *        The Apache Airflow configuration setting you want to override in your environment. For more information,
     *        see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html">Environment
     *        configuration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withAirflowConfigurationOptions(java.util.Map<String, String> airflowConfigurationOptions) {
        setAirflowConfigurationOptions(airflowConfigurationOptions);
        return this;
    }

    /**
     * Add a single AirflowConfigurationOptions entry
     *
     * @see CreateEnvironmentRequest#withAirflowConfigurationOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest addAirflowConfigurationOptionsEntry(String key, String value) {
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

    public CreateEnvironmentRequest clearAirflowConfigurationOptionsEntries() {
        this.airflowConfigurationOptions = null;
        return this;
    }

    /**
     * <p>
     * The Apache Airflow version you want to use for your environment.
     * </p>
     * 
     * @param airflowVersion
     *        The Apache Airflow version you want to use for your environment.
     */

    public void setAirflowVersion(String airflowVersion) {
        this.airflowVersion = airflowVersion;
    }

    /**
     * <p>
     * The Apache Airflow version you want to use for your environment.
     * </p>
     * 
     * @return The Apache Airflow version you want to use for your environment.
     */

    public String getAirflowVersion() {
        return this.airflowVersion;
    }

    /**
     * <p>
     * The Apache Airflow version you want to use for your environment.
     * </p>
     * 
     * @param airflowVersion
     *        The Apache Airflow version you want to use for your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withAirflowVersion(String airflowVersion) {
        setAirflowVersion(airflowVersion);
        return this;
    }

    /**
     * <p>
     * The relative path to the DAG folder on your Amazon S3 storage bucket. For example, <code>dags</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param dagS3Path
     *        The relative path to the DAG folder on your Amazon S3 storage bucket. For example, <code>dags</code>. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *        Amazon MWAA</a>.
     */

    public void setDagS3Path(String dagS3Path) {
        this.dagS3Path = dagS3Path;
    }

    /**
     * <p>
     * The relative path to the DAG folder on your Amazon S3 storage bucket. For example, <code>dags</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @return The relative path to the DAG folder on your Amazon S3 storage bucket. For example, <code>dags</code>. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *         Amazon MWAA</a>.
     */

    public String getDagS3Path() {
        return this.dagS3Path;
    }

    /**
     * <p>
     * The relative path to the DAG folder on your Amazon S3 storage bucket. For example, <code>dags</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param dagS3Path
     *        The relative path to the DAG folder on your Amazon S3 storage bucket. For example, <code>dags</code>. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *        Amazon MWAA</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDagS3Path(String dagS3Path) {
        setDagS3Path(dagS3Path);
        return this;
    }

    /**
     * <p>
     * The environment class you want to use for your environment. The environment class determines the size of the
     * containers and database used for your Apache Airflow services.
     * </p>
     * 
     * @param environmentClass
     *        The environment class you want to use for your environment. The environment class determines the size of
     *        the containers and database used for your Apache Airflow services.
     */

    public void setEnvironmentClass(String environmentClass) {
        this.environmentClass = environmentClass;
    }

    /**
     * <p>
     * The environment class you want to use for your environment. The environment class determines the size of the
     * containers and database used for your Apache Airflow services.
     * </p>
     * 
     * @return The environment class you want to use for your environment. The environment class determines the size of
     *         the containers and database used for your Apache Airflow services.
     */

    public String getEnvironmentClass() {
        return this.environmentClass;
    }

    /**
     * <p>
     * The environment class you want to use for your environment. The environment class determines the size of the
     * containers and database used for your Apache Airflow services.
     * </p>
     * 
     * @param environmentClass
     *        The environment class you want to use for your environment. The environment class determines the size of
     *        the containers and database used for your Apache Airflow services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withEnvironmentClass(String environmentClass) {
        setEnvironmentClass(environmentClass);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role for your environment. An execution role is an AWS Identity
     * and Access Management (IAM) role that grants MWAA permission to access AWS services and resources used by your
     * environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. For more information, see
     * <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/manage-access.html">Managing access to Amazon Managed
     * Workflows for Apache Airflow</a>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role for your environment. An execution role is an AWS
     *        Identity and Access Management (IAM) role that grants MWAA permission to access AWS services and resources
     *        used by your environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/manage-access.html">Managing access to Amazon
     *        Managed Workflows for Apache Airflow</a>.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role for your environment. An execution role is an AWS Identity
     * and Access Management (IAM) role that grants MWAA permission to access AWS services and resources used by your
     * environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. For more information, see
     * <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/manage-access.html">Managing access to Amazon Managed
     * Workflows for Apache Airflow</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution role for your environment. An execution role is an AWS
     *         Identity and Access Management (IAM) role that grants MWAA permission to access AWS services and
     *         resources used by your environment. For example,
     *         <code>arn:aws:iam::123456789:role/my-execution-role</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/manage-access.html">Managing access to Amazon
     *         Managed Workflows for Apache Airflow</a>.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role for your environment. An execution role is an AWS Identity
     * and Access Management (IAM) role that grants MWAA permission to access AWS services and resources used by your
     * environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. For more information, see
     * <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/manage-access.html">Managing access to Amazon Managed
     * Workflows for Apache Airflow</a>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role for your environment. An execution role is an AWS
     *        Identity and Access Management (IAM) role that grants MWAA permission to access AWS services and resources
     *        used by your environment. For example, <code>arn:aws:iam::123456789:role/my-execution-role</code>. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/manage-access.html">Managing access to Amazon
     *        Managed Workflows for Apache Airflow</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment. You can use an AWS
     * KMS key managed by MWAA, or a custom KMS key (advanced). For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html?icmpid=docs_console_unmapped#master_keys"
     * >Customer master keys (CMKs)</a> in the AWS KMS developer guide.
     * </p>
     * 
     * @param kmsKey
     *        The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment. You can use
     *        an AWS KMS key managed by MWAA, or a custom KMS key (advanced). For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html?icmpid=docs_console_unmapped#master_keys"
     *        >Customer master keys (CMKs)</a> in the AWS KMS developer guide.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment. You can use an AWS
     * KMS key managed by MWAA, or a custom KMS key (advanced). For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html?icmpid=docs_console_unmapped#master_keys"
     * >Customer master keys (CMKs)</a> in the AWS KMS developer guide.
     * </p>
     * 
     * @return The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment. You can use
     *         an AWS KMS key managed by MWAA, or a custom KMS key (advanced). For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html?icmpid=docs_console_unmapped#master_keys"
     *         >Customer master keys (CMKs)</a> in the AWS KMS developer guide.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment. You can use an AWS
     * KMS key managed by MWAA, or a custom KMS key (advanced). For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html?icmpid=docs_console_unmapped#master_keys"
     * >Customer master keys (CMKs)</a> in the AWS KMS developer guide.
     * </p>
     * 
     * @param kmsKey
     *        The AWS Key Management Service (KMS) key to encrypt and decrypt the data in your environment. You can use
     *        an AWS KMS key managed by MWAA, or a custom KMS key (advanced). For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html?icmpid=docs_console_unmapped#master_keys"
     *        >Customer master keys (CMKs)</a> in the AWS KMS developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
        return this;
    }

    /**
     * <p>
     * The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param loggingConfiguration
     *        The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     */

    public void setLoggingConfiguration(LoggingConfigurationInput loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     */

    public LoggingConfigurationInput getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param loggingConfiguration
     *        The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withLoggingConfiguration(LoggingConfigurationInput loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers and the Fargate containers that run your tasks up to the number you specify in this field. When there are
     * no more tasks running, and no more in the queue, MWAA disposes of the extra containers leaving the one worker
     * that is included with your environment.
     * </p>
     * 
     * @param maxWorkers
     *        The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *        Airflow workers and the Fargate containers that run your tasks up to the number you specify in this field.
     *        When there are no more tasks running, and no more in the queue, MWAA disposes of the extra containers
     *        leaving the one worker that is included with your environment.
     */

    public void setMaxWorkers(Integer maxWorkers) {
        this.maxWorkers = maxWorkers;
    }

    /**
     * <p>
     * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers and the Fargate containers that run your tasks up to the number you specify in this field. When there are
     * no more tasks running, and no more in the queue, MWAA disposes of the extra containers leaving the one worker
     * that is included with your environment.
     * </p>
     * 
     * @return The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *         Airflow workers and the Fargate containers that run your tasks up to the number you specify in this
     *         field. When there are no more tasks running, and no more in the queue, MWAA disposes of the extra
     *         containers leaving the one worker that is included with your environment.
     */

    public Integer getMaxWorkers() {
        return this.maxWorkers;
    }

    /**
     * <p>
     * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow
     * workers and the Fargate containers that run your tasks up to the number you specify in this field. When there are
     * no more tasks running, and no more in the queue, MWAA disposes of the extra containers leaving the one worker
     * that is included with your environment.
     * </p>
     * 
     * @param maxWorkers
     *        The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache
     *        Airflow workers and the Fargate containers that run your tasks up to the number you specify in this field.
     *        When there are no more tasks running, and no more in the queue, MWAA disposes of the extra containers
     *        leaving the one worker that is included with your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withMaxWorkers(Integer maxWorkers) {
        setMaxWorkers(maxWorkers);
        return this;
    }

    /**
     * <p>
     * The name of your MWAA environment.
     * </p>
     * 
     * @param name
     *        The name of your MWAA environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of your MWAA environment.
     * </p>
     * 
     * @return The name of your MWAA environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of your MWAA environment.
     * </p>
     * 
     * @param name
     *        The name of your MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The VPC networking components you want to use for your environment. At least two private subnet identifiers and
     * one VPC security group identifier are required to create an environment. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     * 
     * @param networkConfiguration
     *        The VPC networking components you want to use for your environment. At least two private subnet
     *        identifiers and one VPC security group identifier are required to create an environment. For more
     *        information, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the
     *        VPC network for a MWAA environment</a>.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The VPC networking components you want to use for your environment. At least two private subnet identifiers and
     * one VPC security group identifier are required to create an environment. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     * 
     * @return The VPC networking components you want to use for your environment. At least two private subnet
     *         identifiers and one VPC security group identifier are required to create an environment. For more
     *         information, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the
     *         VPC network for a MWAA environment</a>.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The VPC networking components you want to use for your environment. At least two private subnet identifiers and
     * one VPC security group identifier are required to create an environment. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     * 
     * @param networkConfiguration
     *        The VPC networking components you want to use for your environment. At least two private subnet
     *        identifiers and one VPC security group identifier are required to create an environment. For more
     *        information, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the
     *        VPC network for a MWAA environment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The <code>plugins.zip</code> file version you want to use.
     * </p>
     * 
     * @param pluginsS3ObjectVersion
     *        The <code>plugins.zip</code> file version you want to use.
     */

    public void setPluginsS3ObjectVersion(String pluginsS3ObjectVersion) {
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
    }

    /**
     * <p>
     * The <code>plugins.zip</code> file version you want to use.
     * </p>
     * 
     * @return The <code>plugins.zip</code> file version you want to use.
     */

    public String getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion;
    }

    /**
     * <p>
     * The <code>plugins.zip</code> file version you want to use.
     * </p>
     * 
     * @param pluginsS3ObjectVersion
     *        The <code>plugins.zip</code> file version you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withPluginsS3ObjectVersion(String pluginsS3ObjectVersion) {
        setPluginsS3ObjectVersion(pluginsS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The relative path to the <code>plugins.zip</code> file on your Amazon S3 storage bucket. For example,
     * <code>plugins.zip</code>. If a relative path is provided in the request, then <code>PluginsS3ObjectVersion</code>
     * is required. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param pluginsS3Path
     *        The relative path to the <code>plugins.zip</code> file on your Amazon S3 storage bucket. For example,
     *        <code>plugins.zip</code>. If a relative path is provided in the request, then
     *        <code>PluginsS3ObjectVersion</code> is required. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *        Amazon MWAA</a>.
     */

    public void setPluginsS3Path(String pluginsS3Path) {
        this.pluginsS3Path = pluginsS3Path;
    }

    /**
     * <p>
     * The relative path to the <code>plugins.zip</code> file on your Amazon S3 storage bucket. For example,
     * <code>plugins.zip</code>. If a relative path is provided in the request, then <code>PluginsS3ObjectVersion</code>
     * is required. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @return The relative path to the <code>plugins.zip</code> file on your Amazon S3 storage bucket. For example,
     *         <code>plugins.zip</code>. If a relative path is provided in the request, then
     *         <code>PluginsS3ObjectVersion</code> is required. For more information, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *         Amazon MWAA</a>.
     */

    public String getPluginsS3Path() {
        return this.pluginsS3Path;
    }

    /**
     * <p>
     * The relative path to the <code>plugins.zip</code> file on your Amazon S3 storage bucket. For example,
     * <code>plugins.zip</code>. If a relative path is provided in the request, then <code>PluginsS3ObjectVersion</code>
     * is required. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param pluginsS3Path
     *        The relative path to the <code>plugins.zip</code> file on your Amazon S3 storage bucket. For example,
     *        <code>plugins.zip</code>. If a relative path is provided in the request, then
     *        <code>PluginsS3ObjectVersion</code> is required. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *        Amazon MWAA</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withPluginsS3Path(String pluginsS3Path) {
        setPluginsS3Path(pluginsS3Path);
        return this;
    }

    /**
     * <p>
     * The <code>requirements.txt</code> file version you want to use.
     * </p>
     * 
     * @param requirementsS3ObjectVersion
     *        The <code>requirements.txt</code> file version you want to use.
     */

    public void setRequirementsS3ObjectVersion(String requirementsS3ObjectVersion) {
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
    }

    /**
     * <p>
     * The <code>requirements.txt</code> file version you want to use.
     * </p>
     * 
     * @return The <code>requirements.txt</code> file version you want to use.
     */

    public String getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion;
    }

    /**
     * <p>
     * The <code>requirements.txt</code> file version you want to use.
     * </p>
     * 
     * @param requirementsS3ObjectVersion
     *        The <code>requirements.txt</code> file version you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withRequirementsS3ObjectVersion(String requirementsS3ObjectVersion) {
        setRequirementsS3ObjectVersion(requirementsS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The relative path to the <code>requirements.txt</code> file on your Amazon S3 storage bucket. For example,
     * <code>requirements.txt</code>. If a relative path is provided in the request, then
     * <code>RequirementsS3ObjectVersion</code> is required. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param requirementsS3Path
     *        The relative path to the <code>requirements.txt</code> file on your Amazon S3 storage bucket. For example,
     *        <code>requirements.txt</code>. If a relative path is provided in the request, then
     *        <code>RequirementsS3ObjectVersion</code> is required. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *        Amazon MWAA</a>.
     */

    public void setRequirementsS3Path(String requirementsS3Path) {
        this.requirementsS3Path = requirementsS3Path;
    }

    /**
     * <p>
     * The relative path to the <code>requirements.txt</code> file on your Amazon S3 storage bucket. For example,
     * <code>requirements.txt</code>. If a relative path is provided in the request, then
     * <code>RequirementsS3ObjectVersion</code> is required. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @return The relative path to the <code>requirements.txt</code> file on your Amazon S3 storage bucket. For
     *         example, <code>requirements.txt</code>. If a relative path is provided in the request, then
     *         <code>RequirementsS3ObjectVersion</code> is required. For more information, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *         Amazon MWAA</a>.
     */

    public String getRequirementsS3Path() {
        return this.requirementsS3Path;
    }

    /**
     * <p>
     * The relative path to the <code>requirements.txt</code> file on your Amazon S3 storage bucket. For example,
     * <code>requirements.txt</code>. If a relative path is provided in the request, then
     * <code>RequirementsS3ObjectVersion</code> is required. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param requirementsS3Path
     *        The relative path to the <code>requirements.txt</code> file on your Amazon S3 storage bucket. For example,
     *        <code>requirements.txt</code>. If a relative path is provided in the request, then
     *        <code>RequirementsS3ObjectVersion</code> is required. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html">Importing DAGs on
     *        Amazon MWAA</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withRequirementsS3Path(String requirementsS3Path) {
        setRequirementsS3Path(requirementsS3Path);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example,
     * <code>arn:aws:s3:::airflow-mybucketname</code>.
     * </p>
     * 
     * @param sourceBucketArn
     *        The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example,
     *        <code>arn:aws:s3:::airflow-mybucketname</code>.
     */

    public void setSourceBucketArn(String sourceBucketArn) {
        this.sourceBucketArn = sourceBucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example,
     * <code>arn:aws:s3:::airflow-mybucketname</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example,
     *         <code>arn:aws:s3:::airflow-mybucketname</code>.
     */

    public String getSourceBucketArn() {
        return this.sourceBucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example,
     * <code>arn:aws:s3:::airflow-mybucketname</code>.
     * </p>
     * 
     * @param sourceBucketArn
     *        The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example,
     *        <code>arn:aws:s3:::airflow-mybucketname</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withSourceBucketArn(String sourceBucketArn) {
        setSourceBucketArn(sourceBucketArn);
        return this;
    }

    /**
     * <p>
     * The metadata tags you want to attach to your environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a>.
     * </p>
     * 
     * @return The metadata tags you want to attach to your environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata tags you want to attach to your environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a>.
     * </p>
     * 
     * @param tags
     *        The metadata tags you want to attach to your environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata tags you want to attach to your environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a>.
     * </p>
     * 
     * @param tags
     *        The metadata tags you want to attach to your environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEnvironmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest addTagsEntry(String key, String value) {
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

    public CreateEnvironmentRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be accessed
     * over the Internet by users granted access in your IAM policy. A private network limits access of your Airflow UI
     * to users within your VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     * 
     * @param webserverAccessMode
     *        The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be
     *        accessed over the Internet by users granted access in your IAM policy. A private network limits access of
     *        your Airflow UI to users within your VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     *        environment</a>.
     * @see WebserverAccessMode
     */

    public void setWebserverAccessMode(String webserverAccessMode) {
        this.webserverAccessMode = webserverAccessMode;
    }

    /**
     * <p>
     * The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be accessed
     * over the Internet by users granted access in your IAM policy. A private network limits access of your Airflow UI
     * to users within your VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     * 
     * @return The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be
     *         accessed over the Internet by users granted access in your IAM policy. A private network limits access of
     *         your Airflow UI to users within your VPC. For more information, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a
     *         MWAA environment</a>.
     * @see WebserverAccessMode
     */

    public String getWebserverAccessMode() {
        return this.webserverAccessMode;
    }

    /**
     * <p>
     * The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be accessed
     * over the Internet by users granted access in your IAM policy. A private network limits access of your Airflow UI
     * to users within your VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     * 
     * @param webserverAccessMode
     *        The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be
     *        accessed over the Internet by users granted access in your IAM policy. A private network limits access of
     *        your Airflow UI to users within your VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     *        environment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebserverAccessMode
     */

    public CreateEnvironmentRequest withWebserverAccessMode(String webserverAccessMode) {
        setWebserverAccessMode(webserverAccessMode);
        return this;
    }

    /**
     * <p>
     * The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be accessed
     * over the Internet by users granted access in your IAM policy. A private network limits access of your Airflow UI
     * to users within your VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     * environment</a>.
     * </p>
     * 
     * @param webserverAccessMode
     *        The networking access of your Apache Airflow web server. A public network allows your Airflow UI to be
     *        accessed over the Internet by users granted access in your IAM policy. A private network limits access of
     *        your Airflow UI to users within your VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-mwaa.html">Creating the VPC network for a MWAA
     *        environment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebserverAccessMode
     */

    public CreateEnvironmentRequest withWebserverAccessMode(WebserverAccessMode webserverAccessMode) {
        this.webserverAccessMode = webserverAccessMode.toString();
        return this;
    }

    /**
     * <p>
     * The day and time you want MWAA to start weekly maintenance updates on your environment.
     * </p>
     * 
     * @param weeklyMaintenanceWindowStart
     *        The day and time you want MWAA to start weekly maintenance updates on your environment.
     */

    public void setWeeklyMaintenanceWindowStart(String weeklyMaintenanceWindowStart) {
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    /**
     * <p>
     * The day and time you want MWAA to start weekly maintenance updates on your environment.
     * </p>
     * 
     * @return The day and time you want MWAA to start weekly maintenance updates on your environment.
     */

    public String getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart;
    }

    /**
     * <p>
     * The day and time you want MWAA to start weekly maintenance updates on your environment.
     * </p>
     * 
     * @param weeklyMaintenanceWindowStart
     *        The day and time you want MWAA to start weekly maintenance updates on your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withWeeklyMaintenanceWindowStart(String weeklyMaintenanceWindowStart) {
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
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration()).append(",");
        if (getMaxWorkers() != null)
            sb.append("MaxWorkers: ").append(getMaxWorkers()).append(",");
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
        if (getSourceBucketArn() != null)
            sb.append("SourceBucketArn: ").append(getSourceBucketArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
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
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        if (other.getMaxWorkers() == null ^ this.getMaxWorkers() == null)
            return false;
        if (other.getMaxWorkers() != null && other.getMaxWorkers().equals(this.getMaxWorkers()) == false)
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
        if (other.getSourceBucketArn() == null ^ this.getSourceBucketArn() == null)
            return false;
        if (other.getSourceBucketArn() != null && other.getSourceBucketArn().equals(this.getSourceBucketArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMaxWorkers() == null) ? 0 : getMaxWorkers().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPluginsS3ObjectVersion() == null) ? 0 : getPluginsS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getPluginsS3Path() == null) ? 0 : getPluginsS3Path().hashCode());
        hashCode = prime * hashCode + ((getRequirementsS3ObjectVersion() == null) ? 0 : getRequirementsS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getRequirementsS3Path() == null) ? 0 : getRequirementsS3Path().hashCode());
        hashCode = prime * hashCode + ((getSourceBucketArn() == null) ? 0 : getSourceBucketArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWebserverAccessMode() == null) ? 0 : getWebserverAccessMode().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceWindowStart() == null) ? 0 : getWeeklyMaintenanceWindowStart().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
