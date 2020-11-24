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
     * The Airflow Configuration Options to update of your Amazon MWAA environment.
     * </p>
     */
    private java.util.Map<String, String> airflowConfigurationOptions;
    /**
     * <p>
     * The Airflow Version to update of your Amazon MWAA environment.
     * </p>
     */
    private String airflowVersion;
    /**
     * <p>
     * The Dags folder S3 Path to update of your Amazon MWAA environment.
     * </p>
     */
    private String dagS3Path;
    /**
     * <p>
     * The Environment Class to update of your Amazon MWAA environment.
     * </p>
     */
    private String environmentClass;
    /**
     * <p>
     * The Executio Role ARN to update of your Amazon MWAA environment.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The Logging Configuration to update of your Amazon MWAA environment.
     * </p>
     */
    private LoggingConfigurationInput loggingConfiguration;
    /**
     * <p>
     * The Maximum Workers to update of your Amazon MWAA environment.
     * </p>
     */
    private Integer maxWorkers;
    /**
     * <p>
     * The name of your Amazon MWAA environment that you wish to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Network Configuration to update of your Amazon MWAA environment.
     * </p>
     */
    private UpdateNetworkConfigurationInput networkConfiguration;
    /**
     * <p>
     * The Plugins.zip S3 Object Version to update of your Amazon MWAA environment.
     * </p>
     */
    private String pluginsS3ObjectVersion;
    /**
     * <p>
     * The Plugins.zip S3 Path to update of your Amazon MWAA environment.
     * </p>
     */
    private String pluginsS3Path;
    /**
     * <p>
     * The Requirements.txt S3 ObjectV ersion to update of your Amazon MWAA environment.
     * </p>
     */
    private String requirementsS3ObjectVersion;
    /**
     * <p>
     * The Requirements.txt S3 Path to update of your Amazon MWAA environment.
     * </p>
     */
    private String requirementsS3Path;
    /**
     * <p>
     * The S3 Source Bucket ARN to update of your Amazon MWAA environment.
     * </p>
     */
    private String sourceBucketArn;
    /**
     * <p>
     * The Webserver Access Mode to update of your Amazon MWAA environment.
     * </p>
     */
    private String webserverAccessMode;
    /**
     * <p>
     * The Weekly Maintenance Window Start to update of your Amazon MWAA environment.
     * </p>
     */
    private String weeklyMaintenanceWindowStart;

    /**
     * <p>
     * The Airflow Configuration Options to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Airflow Configuration Options to update of your Amazon MWAA environment.
     */

    public java.util.Map<String, String> getAirflowConfigurationOptions() {
        return airflowConfigurationOptions;
    }

    /**
     * <p>
     * The Airflow Configuration Options to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param airflowConfigurationOptions
     *        The Airflow Configuration Options to update of your Amazon MWAA environment.
     */

    public void setAirflowConfigurationOptions(java.util.Map<String, String> airflowConfigurationOptions) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
    }

    /**
     * <p>
     * The Airflow Configuration Options to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param airflowConfigurationOptions
     *        The Airflow Configuration Options to update of your Amazon MWAA environment.
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
     * The Airflow Version to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param airflowVersion
     *        The Airflow Version to update of your Amazon MWAA environment.
     */

    public void setAirflowVersion(String airflowVersion) {
        this.airflowVersion = airflowVersion;
    }

    /**
     * <p>
     * The Airflow Version to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Airflow Version to update of your Amazon MWAA environment.
     */

    public String getAirflowVersion() {
        return this.airflowVersion;
    }

    /**
     * <p>
     * The Airflow Version to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param airflowVersion
     *        The Airflow Version to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withAirflowVersion(String airflowVersion) {
        setAirflowVersion(airflowVersion);
        return this;
    }

    /**
     * <p>
     * The Dags folder S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param dagS3Path
     *        The Dags folder S3 Path to update of your Amazon MWAA environment.
     */

    public void setDagS3Path(String dagS3Path) {
        this.dagS3Path = dagS3Path;
    }

    /**
     * <p>
     * The Dags folder S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Dags folder S3 Path to update of your Amazon MWAA environment.
     */

    public String getDagS3Path() {
        return this.dagS3Path;
    }

    /**
     * <p>
     * The Dags folder S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param dagS3Path
     *        The Dags folder S3 Path to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDagS3Path(String dagS3Path) {
        setDagS3Path(dagS3Path);
        return this;
    }

    /**
     * <p>
     * The Environment Class to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param environmentClass
     *        The Environment Class to update of your Amazon MWAA environment.
     */

    public void setEnvironmentClass(String environmentClass) {
        this.environmentClass = environmentClass;
    }

    /**
     * <p>
     * The Environment Class to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Environment Class to update of your Amazon MWAA environment.
     */

    public String getEnvironmentClass() {
        return this.environmentClass;
    }

    /**
     * <p>
     * The Environment Class to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param environmentClass
     *        The Environment Class to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEnvironmentClass(String environmentClass) {
        setEnvironmentClass(environmentClass);
        return this;
    }

    /**
     * <p>
     * The Executio Role ARN to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param executionRoleArn
     *        The Executio Role ARN to update of your Amazon MWAA environment.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Executio Role ARN to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Executio Role ARN to update of your Amazon MWAA environment.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Executio Role ARN to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param executionRoleArn
     *        The Executio Role ARN to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The Logging Configuration to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param loggingConfiguration
     *        The Logging Configuration to update of your Amazon MWAA environment.
     */

    public void setLoggingConfiguration(LoggingConfigurationInput loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * The Logging Configuration to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Logging Configuration to update of your Amazon MWAA environment.
     */

    public LoggingConfigurationInput getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * The Logging Configuration to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param loggingConfiguration
     *        The Logging Configuration to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withLoggingConfiguration(LoggingConfigurationInput loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * The Maximum Workers to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param maxWorkers
     *        The Maximum Workers to update of your Amazon MWAA environment.
     */

    public void setMaxWorkers(Integer maxWorkers) {
        this.maxWorkers = maxWorkers;
    }

    /**
     * <p>
     * The Maximum Workers to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Maximum Workers to update of your Amazon MWAA environment.
     */

    public Integer getMaxWorkers() {
        return this.maxWorkers;
    }

    /**
     * <p>
     * The Maximum Workers to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param maxWorkers
     *        The Maximum Workers to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withMaxWorkers(Integer maxWorkers) {
        setMaxWorkers(maxWorkers);
        return this;
    }

    /**
     * <p>
     * The name of your Amazon MWAA environment that you wish to update.
     * </p>
     * 
     * @param name
     *        The name of your Amazon MWAA environment that you wish to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of your Amazon MWAA environment that you wish to update.
     * </p>
     * 
     * @return The name of your Amazon MWAA environment that you wish to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of your Amazon MWAA environment that you wish to update.
     * </p>
     * 
     * @param name
     *        The name of your Amazon MWAA environment that you wish to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Network Configuration to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param networkConfiguration
     *        The Network Configuration to update of your Amazon MWAA environment.
     */

    public void setNetworkConfiguration(UpdateNetworkConfigurationInput networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The Network Configuration to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Network Configuration to update of your Amazon MWAA environment.
     */

    public UpdateNetworkConfigurationInput getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The Network Configuration to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param networkConfiguration
     *        The Network Configuration to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withNetworkConfiguration(UpdateNetworkConfigurationInput networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The Plugins.zip S3 Object Version to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param pluginsS3ObjectVersion
     *        The Plugins.zip S3 Object Version to update of your Amazon MWAA environment.
     */

    public void setPluginsS3ObjectVersion(String pluginsS3ObjectVersion) {
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
    }

    /**
     * <p>
     * The Plugins.zip S3 Object Version to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Plugins.zip S3 Object Version to update of your Amazon MWAA environment.
     */

    public String getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion;
    }

    /**
     * <p>
     * The Plugins.zip S3 Object Version to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param pluginsS3ObjectVersion
     *        The Plugins.zip S3 Object Version to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withPluginsS3ObjectVersion(String pluginsS3ObjectVersion) {
        setPluginsS3ObjectVersion(pluginsS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The Plugins.zip S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param pluginsS3Path
     *        The Plugins.zip S3 Path to update of your Amazon MWAA environment.
     */

    public void setPluginsS3Path(String pluginsS3Path) {
        this.pluginsS3Path = pluginsS3Path;
    }

    /**
     * <p>
     * The Plugins.zip S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Plugins.zip S3 Path to update of your Amazon MWAA environment.
     */

    public String getPluginsS3Path() {
        return this.pluginsS3Path;
    }

    /**
     * <p>
     * The Plugins.zip S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param pluginsS3Path
     *        The Plugins.zip S3 Path to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withPluginsS3Path(String pluginsS3Path) {
        setPluginsS3Path(pluginsS3Path);
        return this;
    }

    /**
     * <p>
     * The Requirements.txt S3 ObjectV ersion to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param requirementsS3ObjectVersion
     *        The Requirements.txt S3 ObjectV ersion to update of your Amazon MWAA environment.
     */

    public void setRequirementsS3ObjectVersion(String requirementsS3ObjectVersion) {
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
    }

    /**
     * <p>
     * The Requirements.txt S3 ObjectV ersion to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Requirements.txt S3 ObjectV ersion to update of your Amazon MWAA environment.
     */

    public String getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion;
    }

    /**
     * <p>
     * The Requirements.txt S3 ObjectV ersion to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param requirementsS3ObjectVersion
     *        The Requirements.txt S3 ObjectV ersion to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withRequirementsS3ObjectVersion(String requirementsS3ObjectVersion) {
        setRequirementsS3ObjectVersion(requirementsS3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The Requirements.txt S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param requirementsS3Path
     *        The Requirements.txt S3 Path to update of your Amazon MWAA environment.
     */

    public void setRequirementsS3Path(String requirementsS3Path) {
        this.requirementsS3Path = requirementsS3Path;
    }

    /**
     * <p>
     * The Requirements.txt S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Requirements.txt S3 Path to update of your Amazon MWAA environment.
     */

    public String getRequirementsS3Path() {
        return this.requirementsS3Path;
    }

    /**
     * <p>
     * The Requirements.txt S3 Path to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param requirementsS3Path
     *        The Requirements.txt S3 Path to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withRequirementsS3Path(String requirementsS3Path) {
        setRequirementsS3Path(requirementsS3Path);
        return this;
    }

    /**
     * <p>
     * The S3 Source Bucket ARN to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param sourceBucketArn
     *        The S3 Source Bucket ARN to update of your Amazon MWAA environment.
     */

    public void setSourceBucketArn(String sourceBucketArn) {
        this.sourceBucketArn = sourceBucketArn;
    }

    /**
     * <p>
     * The S3 Source Bucket ARN to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The S3 Source Bucket ARN to update of your Amazon MWAA environment.
     */

    public String getSourceBucketArn() {
        return this.sourceBucketArn;
    }

    /**
     * <p>
     * The S3 Source Bucket ARN to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param sourceBucketArn
     *        The S3 Source Bucket ARN to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withSourceBucketArn(String sourceBucketArn) {
        setSourceBucketArn(sourceBucketArn);
        return this;
    }

    /**
     * <p>
     * The Webserver Access Mode to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param webserverAccessMode
     *        The Webserver Access Mode to update of your Amazon MWAA environment.
     * @see WebserverAccessMode
     */

    public void setWebserverAccessMode(String webserverAccessMode) {
        this.webserverAccessMode = webserverAccessMode;
    }

    /**
     * <p>
     * The Webserver Access Mode to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Webserver Access Mode to update of your Amazon MWAA environment.
     * @see WebserverAccessMode
     */

    public String getWebserverAccessMode() {
        return this.webserverAccessMode;
    }

    /**
     * <p>
     * The Webserver Access Mode to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param webserverAccessMode
     *        The Webserver Access Mode to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebserverAccessMode
     */

    public UpdateEnvironmentRequest withWebserverAccessMode(String webserverAccessMode) {
        setWebserverAccessMode(webserverAccessMode);
        return this;
    }

    /**
     * <p>
     * The Webserver Access Mode to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param webserverAccessMode
     *        The Webserver Access Mode to update of your Amazon MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebserverAccessMode
     */

    public UpdateEnvironmentRequest withWebserverAccessMode(WebserverAccessMode webserverAccessMode) {
        this.webserverAccessMode = webserverAccessMode.toString();
        return this;
    }

    /**
     * <p>
     * The Weekly Maintenance Window Start to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param weeklyMaintenanceWindowStart
     *        The Weekly Maintenance Window Start to update of your Amazon MWAA environment.
     */

    public void setWeeklyMaintenanceWindowStart(String weeklyMaintenanceWindowStart) {
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    /**
     * <p>
     * The Weekly Maintenance Window Start to update of your Amazon MWAA environment.
     * </p>
     * 
     * @return The Weekly Maintenance Window Start to update of your Amazon MWAA environment.
     */

    public String getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart;
    }

    /**
     * <p>
     * The Weekly Maintenance Window Start to update of your Amazon MWAA environment.
     * </p>
     * 
     * @param weeklyMaintenanceWindowStart
     *        The Weekly Maintenance Window Start to update of your Amazon MWAA environment.
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPluginsS3ObjectVersion() == null) ? 0 : getPluginsS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getPluginsS3Path() == null) ? 0 : getPluginsS3Path().hashCode());
        hashCode = prime * hashCode + ((getRequirementsS3ObjectVersion() == null) ? 0 : getRequirementsS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getRequirementsS3Path() == null) ? 0 : getRequirementsS3Path().hashCode());
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
