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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon MWAA environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/Environment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Environment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Airflow Configuration Options of the Amazon MWAA Environment.
     * </p>
     */
    private java.util.Map<String, String> airflowConfigurationOptions;
    /**
     * <p>
     * The AirflowV ersion of the Amazon MWAA Environment.
     * </p>
     */
    private String airflowVersion;
    /**
     * <p>
     * The ARN of the Amazon MWAA Environment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Created At date of the Amazon MWAA Environment.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Dags S3 Path of the Amazon MWAA Environment.
     * </p>
     */
    private String dagS3Path;
    /**
     * <p>
     * The Environment Class (size) of the Amazon MWAA Environment.
     * </p>
     */
    private String environmentClass;
    /**
     * <p>
     * The Execution Role ARN of the Amazon MWAA Environment.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The Kms Key of the Amazon MWAA Environment.
     * </p>
     */
    private String kmsKey;

    private LastUpdate lastUpdate;
    /**
     * <p>
     * The Logging Configuration of the Amazon MWAA Environment.
     * </p>
     */
    private LoggingConfiguration loggingConfiguration;
    /**
     * <p>
     * The Maximum Workers of the Amazon MWAA Environment.
     * </p>
     */
    private Integer maxWorkers;
    /**
     * <p>
     * The name of the Amazon MWAA Environment.
     * </p>
     */
    private String name;

    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The Plugins.zip S3 Object Version of the Amazon MWAA Environment.
     * </p>
     */
    private String pluginsS3ObjectVersion;
    /**
     * <p>
     * The Plugins.zip S3 Path of the Amazon MWAA Environment.
     * </p>
     */
    private String pluginsS3Path;
    /**
     * <p>
     * The Requirements.txt file S3 Object Version of the Amazon MWAA Environment.
     * </p>
     */
    private String requirementsS3ObjectVersion;
    /**
     * <p>
     * The Requirement.txt S3 Path of the Amazon MWAA Environment.
     * </p>
     */
    private String requirementsS3Path;
    /**
     * <p>
     * The Service Role ARN of the Amazon MWAA Environment.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The Source S3 Bucket ARN of the Amazon MWAA Environment.
     * </p>
     */
    private String sourceBucketArn;
    /**
     * <p>
     * The status of the Amazon MWAA Environment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Tags of the Amazon MWAA Environment.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * </p>
     */
    private String webserverAccessMode;
    /**
     * <p>
     * The Webserver URL of the Amazon MWAA Environment.
     * </p>
     */
    private String webserverUrl;
    /**
     * <p>
     * The Weekly Maintenance Window Start of the Amazon MWAA Environment.
     * </p>
     */
    private String weeklyMaintenanceWindowStart;

    /**
     * <p>
     * The Airflow Configuration Options of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Airflow Configuration Options of the Amazon MWAA Environment.
     */

    public java.util.Map<String, String> getAirflowConfigurationOptions() {
        return airflowConfigurationOptions;
    }

    /**
     * <p>
     * The Airflow Configuration Options of the Amazon MWAA Environment.
     * </p>
     * 
     * @param airflowConfigurationOptions
     *        The Airflow Configuration Options of the Amazon MWAA Environment.
     */

    public void setAirflowConfigurationOptions(java.util.Map<String, String> airflowConfigurationOptions) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
    }

    /**
     * <p>
     * The Airflow Configuration Options of the Amazon MWAA Environment.
     * </p>
     * 
     * @param airflowConfigurationOptions
     *        The Airflow Configuration Options of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withAirflowConfigurationOptions(java.util.Map<String, String> airflowConfigurationOptions) {
        setAirflowConfigurationOptions(airflowConfigurationOptions);
        return this;
    }

    /**
     * Add a single AirflowConfigurationOptions entry
     *
     * @see Environment#withAirflowConfigurationOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Environment addAirflowConfigurationOptionsEntry(String key, String value) {
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

    public Environment clearAirflowConfigurationOptionsEntries() {
        this.airflowConfigurationOptions = null;
        return this;
    }

    /**
     * <p>
     * The AirflowV ersion of the Amazon MWAA Environment.
     * </p>
     * 
     * @param airflowVersion
     *        The AirflowV ersion of the Amazon MWAA Environment.
     */

    public void setAirflowVersion(String airflowVersion) {
        this.airflowVersion = airflowVersion;
    }

    /**
     * <p>
     * The AirflowV ersion of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The AirflowV ersion of the Amazon MWAA Environment.
     */

    public String getAirflowVersion() {
        return this.airflowVersion;
    }

    /**
     * <p>
     * The AirflowV ersion of the Amazon MWAA Environment.
     * </p>
     * 
     * @param airflowVersion
     *        The AirflowV ersion of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withAirflowVersion(String airflowVersion) {
        setAirflowVersion(airflowVersion);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @param arn
     *        The ARN of the Amazon MWAA Environment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The ARN of the Amazon MWAA Environment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @param arn
     *        The ARN of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Created At date of the Amazon MWAA Environment.
     * </p>
     * 
     * @param createdAt
     *        The Created At date of the Amazon MWAA Environment.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Created At date of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Created At date of the Amazon MWAA Environment.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Created At date of the Amazon MWAA Environment.
     * </p>
     * 
     * @param createdAt
     *        The Created At date of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Dags S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @param dagS3Path
     *        The Dags S3 Path of the Amazon MWAA Environment.
     */

    public void setDagS3Path(String dagS3Path) {
        this.dagS3Path = dagS3Path;
    }

    /**
     * <p>
     * The Dags S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Dags S3 Path of the Amazon MWAA Environment.
     */

    public String getDagS3Path() {
        return this.dagS3Path;
    }

    /**
     * <p>
     * The Dags S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @param dagS3Path
     *        The Dags S3 Path of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withDagS3Path(String dagS3Path) {
        setDagS3Path(dagS3Path);
        return this;
    }

    /**
     * <p>
     * The Environment Class (size) of the Amazon MWAA Environment.
     * </p>
     * 
     * @param environmentClass
     *        The Environment Class (size) of the Amazon MWAA Environment.
     */

    public void setEnvironmentClass(String environmentClass) {
        this.environmentClass = environmentClass;
    }

    /**
     * <p>
     * The Environment Class (size) of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Environment Class (size) of the Amazon MWAA Environment.
     */

    public String getEnvironmentClass() {
        return this.environmentClass;
    }

    /**
     * <p>
     * The Environment Class (size) of the Amazon MWAA Environment.
     * </p>
     * 
     * @param environmentClass
     *        The Environment Class (size) of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withEnvironmentClass(String environmentClass) {
        setEnvironmentClass(environmentClass);
        return this;
    }

    /**
     * <p>
     * The Execution Role ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @param executionRoleArn
     *        The Execution Role ARN of the Amazon MWAA Environment.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Execution Role ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Execution Role ARN of the Amazon MWAA Environment.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Execution Role ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @param executionRoleArn
     *        The Execution Role ARN of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The Kms Key of the Amazon MWAA Environment.
     * </p>
     * 
     * @param kmsKey
     *        The Kms Key of the Amazon MWAA Environment.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The Kms Key of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Kms Key of the Amazon MWAA Environment.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The Kms Key of the Amazon MWAA Environment.
     * </p>
     * 
     * @param kmsKey
     *        The Kms Key of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
        return this;
    }

    /**
     * @param lastUpdate
     */

    public void setLastUpdate(LastUpdate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * @return
     */

    public LastUpdate getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * @param lastUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withLastUpdate(LastUpdate lastUpdate) {
        setLastUpdate(lastUpdate);
        return this;
    }

    /**
     * <p>
     * The Logging Configuration of the Amazon MWAA Environment.
     * </p>
     * 
     * @param loggingConfiguration
     *        The Logging Configuration of the Amazon MWAA Environment.
     */

    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * The Logging Configuration of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Logging Configuration of the Amazon MWAA Environment.
     */

    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * The Logging Configuration of the Amazon MWAA Environment.
     * </p>
     * 
     * @param loggingConfiguration
     *        The Logging Configuration of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * The Maximum Workers of the Amazon MWAA Environment.
     * </p>
     * 
     * @param maxWorkers
     *        The Maximum Workers of the Amazon MWAA Environment.
     */

    public void setMaxWorkers(Integer maxWorkers) {
        this.maxWorkers = maxWorkers;
    }

    /**
     * <p>
     * The Maximum Workers of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Maximum Workers of the Amazon MWAA Environment.
     */

    public Integer getMaxWorkers() {
        return this.maxWorkers;
    }

    /**
     * <p>
     * The Maximum Workers of the Amazon MWAA Environment.
     * </p>
     * 
     * @param maxWorkers
     *        The Maximum Workers of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withMaxWorkers(Integer maxWorkers) {
        setMaxWorkers(maxWorkers);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon MWAA Environment.
     * </p>
     * 
     * @param name
     *        The name of the Amazon MWAA Environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The name of the Amazon MWAA Environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon MWAA Environment.
     * </p>
     * 
     * @param name
     *        The name of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param networkConfiguration
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * @return
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @param networkConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The Plugins.zip S3 Object Version of the Amazon MWAA Environment.
     * </p>
     * 
     * @param pluginsS3ObjectVersion
     *        The Plugins.zip S3 Object Version of the Amazon MWAA Environment.
     */

    public void setPluginsS3ObjectVersion(String pluginsS3ObjectVersion) {
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
    }

    /**
     * <p>
     * The Plugins.zip S3 Object Version of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Plugins.zip S3 Object Version of the Amazon MWAA Environment.
     */

    public String getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion;
    }

    /**
     * <p>
     * The Plugins.zip S3 Object Version of the Amazon MWAA Environment.
     * </p>
     * 
     * @param pluginsS3ObjectVersion
     *        The Plugins.zip S3 Object Version of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withPluginsS3ObjectVersion(String pluginsS3ObjectVersion) {
        setPluginsS3ObjectVersion(pluginsS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The Plugins.zip S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @param pluginsS3Path
     *        The Plugins.zip S3 Path of the Amazon MWAA Environment.
     */

    public void setPluginsS3Path(String pluginsS3Path) {
        this.pluginsS3Path = pluginsS3Path;
    }

    /**
     * <p>
     * The Plugins.zip S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Plugins.zip S3 Path of the Amazon MWAA Environment.
     */

    public String getPluginsS3Path() {
        return this.pluginsS3Path;
    }

    /**
     * <p>
     * The Plugins.zip S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @param pluginsS3Path
     *        The Plugins.zip S3 Path of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withPluginsS3Path(String pluginsS3Path) {
        setPluginsS3Path(pluginsS3Path);
        return this;
    }

    /**
     * <p>
     * The Requirements.txt file S3 Object Version of the Amazon MWAA Environment.
     * </p>
     * 
     * @param requirementsS3ObjectVersion
     *        The Requirements.txt file S3 Object Version of the Amazon MWAA Environment.
     */

    public void setRequirementsS3ObjectVersion(String requirementsS3ObjectVersion) {
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
    }

    /**
     * <p>
     * The Requirements.txt file S3 Object Version of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Requirements.txt file S3 Object Version of the Amazon MWAA Environment.
     */

    public String getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion;
    }

    /**
     * <p>
     * The Requirements.txt file S3 Object Version of the Amazon MWAA Environment.
     * </p>
     * 
     * @param requirementsS3ObjectVersion
     *        The Requirements.txt file S3 Object Version of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withRequirementsS3ObjectVersion(String requirementsS3ObjectVersion) {
        setRequirementsS3ObjectVersion(requirementsS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The Requirement.txt S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @param requirementsS3Path
     *        The Requirement.txt S3 Path of the Amazon MWAA Environment.
     */

    public void setRequirementsS3Path(String requirementsS3Path) {
        this.requirementsS3Path = requirementsS3Path;
    }

    /**
     * <p>
     * The Requirement.txt S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Requirement.txt S3 Path of the Amazon MWAA Environment.
     */

    public String getRequirementsS3Path() {
        return this.requirementsS3Path;
    }

    /**
     * <p>
     * The Requirement.txt S3 Path of the Amazon MWAA Environment.
     * </p>
     * 
     * @param requirementsS3Path
     *        The Requirement.txt S3 Path of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withRequirementsS3Path(String requirementsS3Path) {
        setRequirementsS3Path(requirementsS3Path);
        return this;
    }

    /**
     * <p>
     * The Service Role ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @param serviceRoleArn
     *        The Service Role ARN of the Amazon MWAA Environment.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The Service Role ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Service Role ARN of the Amazon MWAA Environment.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The Service Role ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @param serviceRoleArn
     *        The Service Role ARN of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The Source S3 Bucket ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @param sourceBucketArn
     *        The Source S3 Bucket ARN of the Amazon MWAA Environment.
     */

    public void setSourceBucketArn(String sourceBucketArn) {
        this.sourceBucketArn = sourceBucketArn;
    }

    /**
     * <p>
     * The Source S3 Bucket ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Source S3 Bucket ARN of the Amazon MWAA Environment.
     */

    public String getSourceBucketArn() {
        return this.sourceBucketArn;
    }

    /**
     * <p>
     * The Source S3 Bucket ARN of the Amazon MWAA Environment.
     * </p>
     * 
     * @param sourceBucketArn
     *        The Source S3 Bucket ARN of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withSourceBucketArn(String sourceBucketArn) {
        setSourceBucketArn(sourceBucketArn);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon MWAA Environment.
     * </p>
     * 
     * @param status
     *        The status of the Amazon MWAA Environment.
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The status of the Amazon MWAA Environment.
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Amazon MWAA Environment.
     * </p>
     * 
     * @param status
     *        The status of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public Environment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon MWAA Environment.
     * </p>
     * 
     * @param status
     *        The status of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public Environment withStatus(EnvironmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Tags of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Tags of the Amazon MWAA Environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The Tags of the Amazon MWAA Environment.
     * </p>
     * 
     * @param tags
     *        The Tags of the Amazon MWAA Environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The Tags of the Amazon MWAA Environment.
     * </p>
     * 
     * @param tags
     *        The Tags of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Environment#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Environment addTagsEntry(String key, String value) {
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

    public Environment clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * </p>
     * 
     * @param webserverAccessMode
     *        The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * @see WebserverAccessMode
     */

    public void setWebserverAccessMode(String webserverAccessMode) {
        this.webserverAccessMode = webserverAccessMode;
    }

    /**
     * <p>
     * The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * </p>
     * 
     * @return The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * @see WebserverAccessMode
     */

    public String getWebserverAccessMode() {
        return this.webserverAccessMode;
    }

    /**
     * <p>
     * The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * </p>
     * 
     * @param webserverAccessMode
     *        The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebserverAccessMode
     */

    public Environment withWebserverAccessMode(String webserverAccessMode) {
        setWebserverAccessMode(webserverAccessMode);
        return this;
    }

    /**
     * <p>
     * The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * </p>
     * 
     * @param webserverAccessMode
     *        The Webserver Access Mode of the Amazon MWAA Environment (public or private only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebserverAccessMode
     */

    public Environment withWebserverAccessMode(WebserverAccessMode webserverAccessMode) {
        this.webserverAccessMode = webserverAccessMode.toString();
        return this;
    }

    /**
     * <p>
     * The Webserver URL of the Amazon MWAA Environment.
     * </p>
     * 
     * @param webserverUrl
     *        The Webserver URL of the Amazon MWAA Environment.
     */

    public void setWebserverUrl(String webserverUrl) {
        this.webserverUrl = webserverUrl;
    }

    /**
     * <p>
     * The Webserver URL of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Webserver URL of the Amazon MWAA Environment.
     */

    public String getWebserverUrl() {
        return this.webserverUrl;
    }

    /**
     * <p>
     * The Webserver URL of the Amazon MWAA Environment.
     * </p>
     * 
     * @param webserverUrl
     *        The Webserver URL of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withWebserverUrl(String webserverUrl) {
        setWebserverUrl(webserverUrl);
        return this;
    }

    /**
     * <p>
     * The Weekly Maintenance Window Start of the Amazon MWAA Environment.
     * </p>
     * 
     * @param weeklyMaintenanceWindowStart
     *        The Weekly Maintenance Window Start of the Amazon MWAA Environment.
     */

    public void setWeeklyMaintenanceWindowStart(String weeklyMaintenanceWindowStart) {
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    /**
     * <p>
     * The Weekly Maintenance Window Start of the Amazon MWAA Environment.
     * </p>
     * 
     * @return The Weekly Maintenance Window Start of the Amazon MWAA Environment.
     */

    public String getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart;
    }

    /**
     * <p>
     * The Weekly Maintenance Window Start of the Amazon MWAA Environment.
     * </p>
     * 
     * @param weeklyMaintenanceWindowStart
     *        The Weekly Maintenance Window Start of the Amazon MWAA Environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withWeeklyMaintenanceWindowStart(String weeklyMaintenanceWindowStart) {
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
            sb.append("AirflowConfigurationOptions: ").append(getAirflowConfigurationOptions()).append(",");
        if (getAirflowVersion() != null)
            sb.append("AirflowVersion: ").append(getAirflowVersion()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDagS3Path() != null)
            sb.append("DagS3Path: ").append(getDagS3Path()).append(",");
        if (getEnvironmentClass() != null)
            sb.append("EnvironmentClass: ").append(getEnvironmentClass()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getLastUpdate() != null)
            sb.append("LastUpdate: ").append(getLastUpdate()).append(",");
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
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getSourceBucketArn() != null)
            sb.append("SourceBucketArn: ").append(getSourceBucketArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWebserverAccessMode() != null)
            sb.append("WebserverAccessMode: ").append(getWebserverAccessMode()).append(",");
        if (getWebserverUrl() != null)
            sb.append("WebserverUrl: ").append(getWebserverUrl()).append(",");
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

        if (obj instanceof Environment == false)
            return false;
        Environment other = (Environment) obj;
        if (other.getAirflowConfigurationOptions() == null ^ this.getAirflowConfigurationOptions() == null)
            return false;
        if (other.getAirflowConfigurationOptions() != null && other.getAirflowConfigurationOptions().equals(this.getAirflowConfigurationOptions()) == false)
            return false;
        if (other.getAirflowVersion() == null ^ this.getAirflowVersion() == null)
            return false;
        if (other.getAirflowVersion() != null && other.getAirflowVersion().equals(this.getAirflowVersion()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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
        if (other.getLastUpdate() == null ^ this.getLastUpdate() == null)
            return false;
        if (other.getLastUpdate() != null && other.getLastUpdate().equals(this.getLastUpdate()) == false)
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
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getSourceBucketArn() == null ^ this.getSourceBucketArn() == null)
            return false;
        if (other.getSourceBucketArn() != null && other.getSourceBucketArn().equals(this.getSourceBucketArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWebserverAccessMode() == null ^ this.getWebserverAccessMode() == null)
            return false;
        if (other.getWebserverAccessMode() != null && other.getWebserverAccessMode().equals(this.getWebserverAccessMode()) == false)
            return false;
        if (other.getWebserverUrl() == null ^ this.getWebserverUrl() == null)
            return false;
        if (other.getWebserverUrl() != null && other.getWebserverUrl().equals(this.getWebserverUrl()) == false)
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
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDagS3Path() == null) ? 0 : getDagS3Path().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentClass() == null) ? 0 : getEnvironmentClass().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMaxWorkers() == null) ? 0 : getMaxWorkers().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPluginsS3ObjectVersion() == null) ? 0 : getPluginsS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getPluginsS3Path() == null) ? 0 : getPluginsS3Path().hashCode());
        hashCode = prime * hashCode + ((getRequirementsS3ObjectVersion() == null) ? 0 : getRequirementsS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getRequirementsS3Path() == null) ? 0 : getRequirementsS3Path().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSourceBucketArn() == null) ? 0 : getSourceBucketArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWebserverAccessMode() == null) ? 0 : getWebserverAccessMode().hashCode());
        hashCode = prime * hashCode + ((getWebserverUrl() == null) ? 0 : getWebserverUrl().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceWindowStart() == null) ? 0 : getWeeklyMaintenanceWindowStart().hashCode());
        return hashCode;
    }

    @Override
    public Environment clone() {
        try {
            return (Environment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mwaa.model.transform.EnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
