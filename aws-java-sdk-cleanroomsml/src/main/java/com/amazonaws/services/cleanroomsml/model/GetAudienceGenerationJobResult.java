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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceGenerationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAudienceGenerationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job.
     * </p>
     */
    private String audienceGenerationJobArn;
    /**
     * <p>
     * The identifier of the collaboration that this audience generation job is associated with.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model used for this audience generation job.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The time at which the audience generation job was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes seed
     * users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first in the output.
     * Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the recipient of the audience will
     * know that the first <code>minimumSeedSize</code> count of users are from the seed.
     * </p>
     */
    private Boolean includeSeedInOutput;
    /**
     * <p>
     * The relevance scores for different audience sizes and the recall score of the generated audience.
     * </p>
     */
    private AudienceQualityMetrics metrics;
    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The seed audience that was used for this audience generation job. This field will be null if the account calling
     * the API is the account that started this audience generation job.
     * </p>
     */
    private AudienceGenerationJobDataSource seedAudience;
    /**
     * <p>
     * The AWS account that started this audience generation job.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Details about the status of the audience generation job.
     * </p>
     */
    private StatusDetails statusDetails;
    /**
     * <p>
     * The tags that are associated to this audience generation job.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The most recent time at which the audience generation job was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job.
     * </p>
     * 
     * @param audienceGenerationJobArn
     *        The Amazon Resource Name (ARN) of the audience generation job.
     */

    public void setAudienceGenerationJobArn(String audienceGenerationJobArn) {
        this.audienceGenerationJobArn = audienceGenerationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the audience generation job.
     */

    public String getAudienceGenerationJobArn() {
        return this.audienceGenerationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job.
     * </p>
     * 
     * @param audienceGenerationJobArn
     *        The Amazon Resource Name (ARN) of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withAudienceGenerationJobArn(String audienceGenerationJobArn) {
        setAudienceGenerationJobArn(audienceGenerationJobArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the collaboration that this audience generation job is associated with.
     * </p>
     * 
     * @param collaborationId
     *        The identifier of the collaboration that this audience generation job is associated with.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The identifier of the collaboration that this audience generation job is associated with.
     * </p>
     * 
     * @return The identifier of the collaboration that this audience generation job is associated with.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The identifier of the collaboration that this audience generation job is associated with.
     * </p>
     * 
     * @param collaborationId
     *        The identifier of the collaboration that this audience generation job is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model used for this audience generation job.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model used for this audience generation job.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model used for this audience generation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model used for this audience generation job.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model used for this audience generation job.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model used for this audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The time at which the audience generation job was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the audience generation job was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the audience generation job was created.
     * </p>
     * 
     * @return The time at which the audience generation job was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the audience generation job was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the audience generation job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @param description
     *        The description of the audience generation job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @return The description of the audience generation job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @param description
     *        The description of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes seed
     * users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first in the output.
     * Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the recipient of the audience will
     * know that the first <code>minimumSeedSize</code> count of users are from the seed.
     * </p>
     * 
     * @param includeSeedInOutput
     *        Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes
     *        seed users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first in
     *        the output. Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the recipient of
     *        the audience will know that the first <code>minimumSeedSize</code> count of users are from the seed.
     */

    public void setIncludeSeedInOutput(Boolean includeSeedInOutput) {
        this.includeSeedInOutput = includeSeedInOutput;
    }

    /**
     * <p>
     * Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes seed
     * users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first in the output.
     * Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the recipient of the audience will
     * know that the first <code>minimumSeedSize</code> count of users are from the seed.
     * </p>
     * 
     * @return Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes
     *         seed users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first
     *         in the output. Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the
     *         recipient of the audience will know that the first <code>minimumSeedSize</code> count of users are from
     *         the seed.
     */

    public Boolean getIncludeSeedInOutput() {
        return this.includeSeedInOutput;
    }

    /**
     * <p>
     * Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes seed
     * users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first in the output.
     * Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the recipient of the audience will
     * know that the first <code>minimumSeedSize</code> count of users are from the seed.
     * </p>
     * 
     * @param includeSeedInOutput
     *        Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes
     *        seed users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first in
     *        the output. Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the recipient of
     *        the audience will know that the first <code>minimumSeedSize</code> count of users are from the seed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withIncludeSeedInOutput(Boolean includeSeedInOutput) {
        setIncludeSeedInOutput(includeSeedInOutput);
        return this;
    }

    /**
     * <p>
     * Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes seed
     * users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first in the output.
     * Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the recipient of the audience will
     * know that the first <code>minimumSeedSize</code> count of users are from the seed.
     * </p>
     * 
     * @return Configure whether the seed users are included in the output audience. By default, Clean Rooms ML removes
     *         seed users from the output audience. If you specify <code>TRUE</code>, the seed users will appear first
     *         in the output. Clean Rooms ML does not explicitly reveal whether a user was in the seed, but the
     *         recipient of the audience will know that the first <code>minimumSeedSize</code> count of users are from
     *         the seed.
     */

    public Boolean isIncludeSeedInOutput() {
        return this.includeSeedInOutput;
    }

    /**
     * <p>
     * The relevance scores for different audience sizes and the recall score of the generated audience.
     * </p>
     * 
     * @param metrics
     *        The relevance scores for different audience sizes and the recall score of the generated audience.
     */

    public void setMetrics(AudienceQualityMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * The relevance scores for different audience sizes and the recall score of the generated audience.
     * </p>
     * 
     * @return The relevance scores for different audience sizes and the recall score of the generated audience.
     */

    public AudienceQualityMetrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * The relevance scores for different audience sizes and the recall score of the generated audience.
     * </p>
     * 
     * @param metrics
     *        The relevance scores for different audience sizes and the recall score of the generated audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withMetrics(AudienceQualityMetrics metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @param name
     *        The name of the audience generation job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @return The name of the audience generation job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @param name
     *        The name of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The seed audience that was used for this audience generation job. This field will be null if the account calling
     * the API is the account that started this audience generation job.
     * </p>
     * 
     * @param seedAudience
     *        The seed audience that was used for this audience generation job. This field will be null if the account
     *        calling the API is the account that started this audience generation job.
     */

    public void setSeedAudience(AudienceGenerationJobDataSource seedAudience) {
        this.seedAudience = seedAudience;
    }

    /**
     * <p>
     * The seed audience that was used for this audience generation job. This field will be null if the account calling
     * the API is the account that started this audience generation job.
     * </p>
     * 
     * @return The seed audience that was used for this audience generation job. This field will be null if the account
     *         calling the API is the account that started this audience generation job.
     */

    public AudienceGenerationJobDataSource getSeedAudience() {
        return this.seedAudience;
    }

    /**
     * <p>
     * The seed audience that was used for this audience generation job. This field will be null if the account calling
     * the API is the account that started this audience generation job.
     * </p>
     * 
     * @param seedAudience
     *        The seed audience that was used for this audience generation job. This field will be null if the account
     *        calling the API is the account that started this audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withSeedAudience(AudienceGenerationJobDataSource seedAudience) {
        setSeedAudience(seedAudience);
        return this;
    }

    /**
     * <p>
     * The AWS account that started this audience generation job.
     * </p>
     * 
     * @param startedBy
     *        The AWS account that started this audience generation job.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The AWS account that started this audience generation job.
     * </p>
     * 
     * @return The AWS account that started this audience generation job.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The AWS account that started this audience generation job.
     * </p>
     * 
     * @param startedBy
     *        The AWS account that started this audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     * 
     * @param status
     *        The status of the audience generation job.
     * @see AudienceGenerationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     * 
     * @return The status of the audience generation job.
     * @see AudienceGenerationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     * 
     * @param status
     *        The status of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceGenerationJobStatus
     */

    public GetAudienceGenerationJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the audience generation job.
     * </p>
     * 
     * @param status
     *        The status of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceGenerationJobStatus
     */

    public GetAudienceGenerationJobResult withStatus(AudienceGenerationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Details about the status of the audience generation job.
     * </p>
     * 
     * @param statusDetails
     *        Details about the status of the audience generation job.
     */

    public void setStatusDetails(StatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * Details about the status of the audience generation job.
     * </p>
     * 
     * @return Details about the status of the audience generation job.
     */

    public StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * Details about the status of the audience generation job.
     * </p>
     * 
     * @param statusDetails
     *        Details about the status of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withStatusDetails(StatusDetails statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The tags that are associated to this audience generation job.
     * </p>
     * 
     * @return The tags that are associated to this audience generation job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are associated to this audience generation job.
     * </p>
     * 
     * @param tags
     *        The tags that are associated to this audience generation job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that are associated to this audience generation job.
     * </p>
     * 
     * @param tags
     *        The tags that are associated to this audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAudienceGenerationJobResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult addTagsEntry(String key, String value) {
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

    public GetAudienceGenerationJobResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The most recent time at which the audience generation job was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the audience generation job was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the audience generation job was updated.
     * </p>
     * 
     * @return The most recent time at which the audience generation job was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the audience generation job was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the audience generation job was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceGenerationJobResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getAudienceGenerationJobArn() != null)
            sb.append("AudienceGenerationJobArn: ").append(getAudienceGenerationJobArn()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIncludeSeedInOutput() != null)
            sb.append("IncludeSeedInOutput: ").append(getIncludeSeedInOutput()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSeedAudience() != null)
            sb.append("SeedAudience: ").append(getSeedAudience()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAudienceGenerationJobResult == false)
            return false;
        GetAudienceGenerationJobResult other = (GetAudienceGenerationJobResult) obj;
        if (other.getAudienceGenerationJobArn() == null ^ this.getAudienceGenerationJobArn() == null)
            return false;
        if (other.getAudienceGenerationJobArn() != null && other.getAudienceGenerationJobArn().equals(this.getAudienceGenerationJobArn()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIncludeSeedInOutput() == null ^ this.getIncludeSeedInOutput() == null)
            return false;
        if (other.getIncludeSeedInOutput() != null && other.getIncludeSeedInOutput().equals(this.getIncludeSeedInOutput()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSeedAudience() == null ^ this.getSeedAudience() == null)
            return false;
        if (other.getSeedAudience() != null && other.getSeedAudience().equals(this.getSeedAudience()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudienceGenerationJobArn() == null) ? 0 : getAudienceGenerationJobArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIncludeSeedInOutput() == null) ? 0 : getIncludeSeedInOutput().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSeedAudience() == null) ? 0 : getSeedAudience().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetAudienceGenerationJobResult clone() {
        try {
            return (GetAudienceGenerationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
