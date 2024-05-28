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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata forms attached to the assets created by this data source.
     * </p>
     */
    private java.util.List<FormOutput> assetFormsOutput;
    /**
     * <p>
     * The configuration of the data source.
     * </p>
     */
    private DataSourceConfigurationOutput configuration;
    /**
     * <p>
     * The timestamp of when the data source was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the data source exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Specifies whether this data source is enabled or not.
     * </p>
     */
    private String enableSetting;
    /**
     * <p>
     * The ID of the environment where this data source creates and publishes assets,
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     */
    private DataSourceErrorMessage errorMessage;
    /**
     * <p>
     * The ID of the data source.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The number of assets created by the data source during its last run.
     * </p>
     */
    private Integer lastRunAssetCount;
    /**
     * <p>
     * The timestamp of the last run of the data source.
     * </p>
     */
    private java.util.Date lastRunAt;
    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     */
    private DataSourceErrorMessage lastRunErrorMessage;
    /**
     * <p>
     * The status of the last run of the data source.
     * </p>
     */
    private String lastRunStatus;
    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the project where the data source creates and publishes assets.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     */
    private Boolean publishOnImport;
    /**
     * <p>
     * The recommendation configuration of the data source.
     * </p>
     */
    private RecommendationConfiguration recommendation;
    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     */
    private ScheduleConfiguration schedule;
    /**
     * <p>
     * The status of the data source.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the data source.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The timestamp of when the data source was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The metadata forms attached to the assets created by this data source.
     * </p>
     * 
     * @return The metadata forms attached to the assets created by this data source.
     */

    public java.util.List<FormOutput> getAssetFormsOutput() {
        return assetFormsOutput;
    }

    /**
     * <p>
     * The metadata forms attached to the assets created by this data source.
     * </p>
     * 
     * @param assetFormsOutput
     *        The metadata forms attached to the assets created by this data source.
     */

    public void setAssetFormsOutput(java.util.Collection<FormOutput> assetFormsOutput) {
        if (assetFormsOutput == null) {
            this.assetFormsOutput = null;
            return;
        }

        this.assetFormsOutput = new java.util.ArrayList<FormOutput>(assetFormsOutput);
    }

    /**
     * <p>
     * The metadata forms attached to the assets created by this data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetFormsOutput(java.util.Collection)} or {@link #withAssetFormsOutput(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param assetFormsOutput
     *        The metadata forms attached to the assets created by this data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withAssetFormsOutput(FormOutput... assetFormsOutput) {
        if (this.assetFormsOutput == null) {
            setAssetFormsOutput(new java.util.ArrayList<FormOutput>(assetFormsOutput.length));
        }
        for (FormOutput ele : assetFormsOutput) {
            this.assetFormsOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata forms attached to the assets created by this data source.
     * </p>
     * 
     * @param assetFormsOutput
     *        The metadata forms attached to the assets created by this data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withAssetFormsOutput(java.util.Collection<FormOutput> assetFormsOutput) {
        setAssetFormsOutput(assetFormsOutput);
        return this;
    }

    /**
     * <p>
     * The configuration of the data source.
     * </p>
     * 
     * @param configuration
     *        The configuration of the data source.
     */

    public void setConfiguration(DataSourceConfigurationOutput configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the data source.
     * </p>
     * 
     * @return The configuration of the data source.
     */

    public DataSourceConfigurationOutput getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration of the data source.
     * </p>
     * 
     * @param configuration
     *        The configuration of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withConfiguration(DataSourceConfigurationOutput configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the data source was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the data source was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the data source was created.
     * </p>
     * 
     * @return The timestamp of when the data source was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the data source was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the data source was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @param description
     *        The description of the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @return The description of the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @param description
     *        The description of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the data source exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the data source exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the data source exists.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the data source exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the data source exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the data source exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Specifies whether this data source is enabled or not.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether this data source is enabled or not.
     * @see EnableSetting
     */

    public void setEnableSetting(String enableSetting) {
        this.enableSetting = enableSetting;
    }

    /**
     * <p>
     * Specifies whether this data source is enabled or not.
     * </p>
     * 
     * @return Specifies whether this data source is enabled or not.
     * @see EnableSetting
     */

    public String getEnableSetting() {
        return this.enableSetting;
    }

    /**
     * <p>
     * Specifies whether this data source is enabled or not.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether this data source is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnableSetting
     */

    public GetDataSourceResult withEnableSetting(String enableSetting) {
        setEnableSetting(enableSetting);
        return this;
    }

    /**
     * <p>
     * Specifies whether this data source is enabled or not.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether this data source is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnableSetting
     */

    public GetDataSourceResult withEnableSetting(EnableSetting enableSetting) {
        this.enableSetting = enableSetting.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the environment where this data source creates and publishes assets,
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment where this data source creates and publishes assets,
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment where this data source creates and publishes assets,
     * </p>
     * 
     * @return The ID of the environment where this data source creates and publishes assets,
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment where this data source creates and publishes assets,
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment where this data source creates and publishes assets,
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public void setErrorMessage(DataSourceErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @return Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public DataSourceErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withErrorMessage(DataSourceErrorMessage errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the data source.
     * </p>
     * 
     * @param id
     *        The ID of the data source.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the data source.
     * </p>
     * 
     * @return The ID of the data source.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the data source.
     * </p>
     * 
     * @param id
     *        The ID of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The number of assets created by the data source during its last run.
     * </p>
     * 
     * @param lastRunAssetCount
     *        The number of assets created by the data source during its last run.
     */

    public void setLastRunAssetCount(Integer lastRunAssetCount) {
        this.lastRunAssetCount = lastRunAssetCount;
    }

    /**
     * <p>
     * The number of assets created by the data source during its last run.
     * </p>
     * 
     * @return The number of assets created by the data source during its last run.
     */

    public Integer getLastRunAssetCount() {
        return this.lastRunAssetCount;
    }

    /**
     * <p>
     * The number of assets created by the data source during its last run.
     * </p>
     * 
     * @param lastRunAssetCount
     *        The number of assets created by the data source during its last run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withLastRunAssetCount(Integer lastRunAssetCount) {
        setLastRunAssetCount(lastRunAssetCount);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last run of the data source.
     * </p>
     * 
     * @param lastRunAt
     *        The timestamp of the last run of the data source.
     */

    public void setLastRunAt(java.util.Date lastRunAt) {
        this.lastRunAt = lastRunAt;
    }

    /**
     * <p>
     * The timestamp of the last run of the data source.
     * </p>
     * 
     * @return The timestamp of the last run of the data source.
     */

    public java.util.Date getLastRunAt() {
        return this.lastRunAt;
    }

    /**
     * <p>
     * The timestamp of the last run of the data source.
     * </p>
     * 
     * @param lastRunAt
     *        The timestamp of the last run of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withLastRunAt(java.util.Date lastRunAt) {
        setLastRunAt(lastRunAt);
        return this;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param lastRunErrorMessage
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public void setLastRunErrorMessage(DataSourceErrorMessage lastRunErrorMessage) {
        this.lastRunErrorMessage = lastRunErrorMessage;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @return Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public DataSourceErrorMessage getLastRunErrorMessage() {
        return this.lastRunErrorMessage;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param lastRunErrorMessage
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withLastRunErrorMessage(DataSourceErrorMessage lastRunErrorMessage) {
        setLastRunErrorMessage(lastRunErrorMessage);
        return this;
    }

    /**
     * <p>
     * The status of the last run of the data source.
     * </p>
     * 
     * @param lastRunStatus
     *        The status of the last run of the data source.
     * @see DataSourceRunStatus
     */

    public void setLastRunStatus(String lastRunStatus) {
        this.lastRunStatus = lastRunStatus;
    }

    /**
     * <p>
     * The status of the last run of the data source.
     * </p>
     * 
     * @return The status of the last run of the data source.
     * @see DataSourceRunStatus
     */

    public String getLastRunStatus() {
        return this.lastRunStatus;
    }

    /**
     * <p>
     * The status of the last run of the data source.
     * </p>
     * 
     * @param lastRunStatus
     *        The status of the last run of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public GetDataSourceResult withLastRunStatus(String lastRunStatus) {
        setLastRunStatus(lastRunStatus);
        return this;
    }

    /**
     * <p>
     * The status of the last run of the data source.
     * </p>
     * 
     * @param lastRunStatus
     *        The status of the last run of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public GetDataSourceResult withLastRunStatus(DataSourceRunStatus lastRunStatus) {
        this.lastRunStatus = lastRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the project where the data source creates and publishes assets.
     * </p>
     * 
     * @param projectId
     *        The ID of the project where the data source creates and publishes assets.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project where the data source creates and publishes assets.
     * </p>
     * 
     * @return The ID of the project where the data source creates and publishes assets.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project where the data source creates and publishes assets.
     * </p>
     * 
     * @param projectId
     *        The ID of the project where the data source creates and publishes assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     * 
     * @param publishOnImport
     *        Specifies whether the assets that this data source creates in the inventory are to be also automatically
     *        published to the catalog.
     */

    public void setPublishOnImport(Boolean publishOnImport) {
        this.publishOnImport = publishOnImport;
    }

    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     * 
     * @return Specifies whether the assets that this data source creates in the inventory are to be also automatically
     *         published to the catalog.
     */

    public Boolean getPublishOnImport() {
        return this.publishOnImport;
    }

    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     * 
     * @param publishOnImport
     *        Specifies whether the assets that this data source creates in the inventory are to be also automatically
     *        published to the catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withPublishOnImport(Boolean publishOnImport) {
        setPublishOnImport(publishOnImport);
        return this;
    }

    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     * 
     * @return Specifies whether the assets that this data source creates in the inventory are to be also automatically
     *         published to the catalog.
     */

    public Boolean isPublishOnImport() {
        return this.publishOnImport;
    }

    /**
     * <p>
     * The recommendation configuration of the data source.
     * </p>
     * 
     * @param recommendation
     *        The recommendation configuration of the data source.
     */

    public void setRecommendation(RecommendationConfiguration recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * The recommendation configuration of the data source.
     * </p>
     * 
     * @return The recommendation configuration of the data source.
     */

    public RecommendationConfiguration getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * The recommendation configuration of the data source.
     * </p>
     * 
     * @param recommendation
     *        The recommendation configuration of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withRecommendation(RecommendationConfiguration recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @param schedule
     *        The schedule of the data source runs.
     */

    public void setSchedule(ScheduleConfiguration schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @return The schedule of the data source runs.
     */

    public ScheduleConfiguration getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @param schedule
     *        The schedule of the data source runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withSchedule(ScheduleConfiguration schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @return The status of the data source.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public GetDataSourceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public GetDataSourceResult withStatus(DataSourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @return The type of the data source.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the data source was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the data source was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the data source was updated.
     * </p>
     * 
     * @return The timestamp of when the data source was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the data source was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the data source was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAssetFormsOutput() != null)
            sb.append("AssetFormsOutput: ").append(getAssetFormsOutput()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEnableSetting() != null)
            sb.append("EnableSetting: ").append(getEnableSetting()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastRunAssetCount() != null)
            sb.append("LastRunAssetCount: ").append(getLastRunAssetCount()).append(",");
        if (getLastRunAt() != null)
            sb.append("LastRunAt: ").append(getLastRunAt()).append(",");
        if (getLastRunErrorMessage() != null)
            sb.append("LastRunErrorMessage: ").append(getLastRunErrorMessage()).append(",");
        if (getLastRunStatus() != null)
            sb.append("LastRunStatus: ").append(getLastRunStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getPublishOnImport() != null)
            sb.append("PublishOnImport: ").append(getPublishOnImport()).append(",");
        if (getRecommendation() != null)
            sb.append("Recommendation: ").append(getRecommendation()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataSourceResult == false)
            return false;
        GetDataSourceResult other = (GetDataSourceResult) obj;
        if (other.getAssetFormsOutput() == null ^ this.getAssetFormsOutput() == null)
            return false;
        if (other.getAssetFormsOutput() != null && other.getAssetFormsOutput().equals(this.getAssetFormsOutput()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEnableSetting() == null ^ this.getEnableSetting() == null)
            return false;
        if (other.getEnableSetting() != null && other.getEnableSetting().equals(this.getEnableSetting()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastRunAssetCount() == null ^ this.getLastRunAssetCount() == null)
            return false;
        if (other.getLastRunAssetCount() != null && other.getLastRunAssetCount().equals(this.getLastRunAssetCount()) == false)
            return false;
        if (other.getLastRunAt() == null ^ this.getLastRunAt() == null)
            return false;
        if (other.getLastRunAt() != null && other.getLastRunAt().equals(this.getLastRunAt()) == false)
            return false;
        if (other.getLastRunErrorMessage() == null ^ this.getLastRunErrorMessage() == null)
            return false;
        if (other.getLastRunErrorMessage() != null && other.getLastRunErrorMessage().equals(this.getLastRunErrorMessage()) == false)
            return false;
        if (other.getLastRunStatus() == null ^ this.getLastRunStatus() == null)
            return false;
        if (other.getLastRunStatus() != null && other.getLastRunStatus().equals(this.getLastRunStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getPublishOnImport() == null ^ this.getPublishOnImport() == null)
            return false;
        if (other.getPublishOnImport() != null && other.getPublishOnImport().equals(this.getPublishOnImport()) == false)
            return false;
        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetFormsOutput() == null) ? 0 : getAssetFormsOutput().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEnableSetting() == null) ? 0 : getEnableSetting().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastRunAssetCount() == null) ? 0 : getLastRunAssetCount().hashCode());
        hashCode = prime * hashCode + ((getLastRunAt() == null) ? 0 : getLastRunAt().hashCode());
        hashCode = prime * hashCode + ((getLastRunErrorMessage() == null) ? 0 : getLastRunErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastRunStatus() == null) ? 0 : getLastRunStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getPublishOnImport() == null) ? 0 : getPublishOnImport().hashCode());
        hashCode = prime * hashCode + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSourceResult clone() {
        try {
            return (GetDataSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
