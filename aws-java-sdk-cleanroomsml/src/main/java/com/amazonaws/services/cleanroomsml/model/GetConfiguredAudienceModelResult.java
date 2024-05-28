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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfiguredAudienceModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model used for this configured audience model.
     * </p>
     */
    private String audienceModelArn;
    /**
     * <p>
     * The list of output sizes of audiences that can be created using this configured audience model. A request to
     * <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an <code>audienceSize</code>
     * selected from this list. You can use the <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience
     * sizes using the count of identifiers in the output. You can use the <code>Percentage</code> <a>AudienceSize</a>
     * to configure sizes in the range 1-100 percent.
     * </p>
     */
    private AudienceSizeConfig audienceSizeConfig;
    /**
     * <p>
     * Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience model.
     * </p>
     */
    private String childResourceTagOnCreatePolicy;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The time at which the configured audience model was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The description of the configured audience model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model.
     * </p>
     */
    private Integer minMatchingSeedSize;
    /**
     * <p>
     * The name of the configured audience model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The output configuration of the configured audience model
     * </p>
     */
    private ConfiguredAudienceModelOutputConfig outputConfig;
    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     */
    private java.util.List<String> sharedAudienceMetrics;
    /**
     * <p>
     * The status of the configured audience model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags that are associated to this configured audience model.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The most recent time at which the configured audience model was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model used for this configured audience model.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the audience model used for this configured audience model.
     */

    public void setAudienceModelArn(String audienceModelArn) {
        this.audienceModelArn = audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model used for this configured audience model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the audience model used for this configured audience model.
     */

    public String getAudienceModelArn() {
        return this.audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model used for this configured audience model.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the audience model used for this configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withAudienceModelArn(String audienceModelArn) {
        setAudienceModelArn(audienceModelArn);
        return this;
    }

    /**
     * <p>
     * The list of output sizes of audiences that can be created using this configured audience model. A request to
     * <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an <code>audienceSize</code>
     * selected from this list. You can use the <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience
     * sizes using the count of identifiers in the output. You can use the <code>Percentage</code> <a>AudienceSize</a>
     * to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @param audienceSizeConfig
     *        The list of output sizes of audiences that can be created using this configured audience model. A request
     *        to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     *        <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code>
     *        <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can
     *        use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     */

    public void setAudienceSizeConfig(AudienceSizeConfig audienceSizeConfig) {
        this.audienceSizeConfig = audienceSizeConfig;
    }

    /**
     * <p>
     * The list of output sizes of audiences that can be created using this configured audience model. A request to
     * <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an <code>audienceSize</code>
     * selected from this list. You can use the <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience
     * sizes using the count of identifiers in the output. You can use the <code>Percentage</code> <a>AudienceSize</a>
     * to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @return The list of output sizes of audiences that can be created using this configured audience model. A request
     *         to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     *         <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code>
     *         <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can
     *         use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     */

    public AudienceSizeConfig getAudienceSizeConfig() {
        return this.audienceSizeConfig;
    }

    /**
     * <p>
     * The list of output sizes of audiences that can be created using this configured audience model. A request to
     * <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an <code>audienceSize</code>
     * selected from this list. You can use the <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience
     * sizes using the count of identifiers in the output. You can use the <code>Percentage</code> <a>AudienceSize</a>
     * to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @param audienceSizeConfig
     *        The list of output sizes of audiences that can be created using this configured audience model. A request
     *        to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     *        <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code>
     *        <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can
     *        use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withAudienceSizeConfig(AudienceSizeConfig audienceSizeConfig) {
        setAudienceSizeConfig(audienceSizeConfig);
        return this;
    }

    /**
     * <p>
     * Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience model.
     * </p>
     * 
     * @param childResourceTagOnCreatePolicy
     *        Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience model.
     * @see TagOnCreatePolicy
     */

    public void setChildResourceTagOnCreatePolicy(String childResourceTagOnCreatePolicy) {
        this.childResourceTagOnCreatePolicy = childResourceTagOnCreatePolicy;
    }

    /**
     * <p>
     * Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience model.
     * </p>
     * 
     * @return Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience
     *         model.
     * @see TagOnCreatePolicy
     */

    public String getChildResourceTagOnCreatePolicy() {
        return this.childResourceTagOnCreatePolicy;
    }

    /**
     * <p>
     * Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience model.
     * </p>
     * 
     * @param childResourceTagOnCreatePolicy
     *        Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagOnCreatePolicy
     */

    public GetConfiguredAudienceModelResult withChildResourceTagOnCreatePolicy(String childResourceTagOnCreatePolicy) {
        setChildResourceTagOnCreatePolicy(childResourceTagOnCreatePolicy);
        return this;
    }

    /**
     * <p>
     * Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience model.
     * </p>
     * 
     * @param childResourceTagOnCreatePolicy
     *        Provides the <code>childResourceTagOnCreatePolicy</code> that was used for this configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagOnCreatePolicy
     */

    public GetConfiguredAudienceModelResult withChildResourceTagOnCreatePolicy(TagOnCreatePolicy childResourceTagOnCreatePolicy) {
        this.childResourceTagOnCreatePolicy = childResourceTagOnCreatePolicy.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The time at which the configured audience model was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the configured audience model was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the configured audience model was created.
     * </p>
     * 
     * @return The time at which the configured audience model was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the configured audience model was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the configured audience model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The description of the configured audience model.
     * </p>
     * 
     * @param description
     *        The description of the configured audience model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the configured audience model.
     * </p>
     * 
     * @return The description of the configured audience model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the configured audience model.
     * </p>
     * 
     * @param description
     *        The description of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model.
     * </p>
     * 
     * @param minMatchingSeedSize
     *        The minimum number of users from the seed audience that must match with users in the training data of the
     *        audience model.
     */

    public void setMinMatchingSeedSize(Integer minMatchingSeedSize) {
        this.minMatchingSeedSize = minMatchingSeedSize;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model.
     * </p>
     * 
     * @return The minimum number of users from the seed audience that must match with users in the training data of the
     *         audience model.
     */

    public Integer getMinMatchingSeedSize() {
        return this.minMatchingSeedSize;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model.
     * </p>
     * 
     * @param minMatchingSeedSize
     *        The minimum number of users from the seed audience that must match with users in the training data of the
     *        audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withMinMatchingSeedSize(Integer minMatchingSeedSize) {
        setMinMatchingSeedSize(minMatchingSeedSize);
        return this;
    }

    /**
     * <p>
     * The name of the configured audience model.
     * </p>
     * 
     * @param name
     *        The name of the configured audience model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configured audience model.
     * </p>
     * 
     * @return The name of the configured audience model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configured audience model.
     * </p>
     * 
     * @param name
     *        The name of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The output configuration of the configured audience model
     * </p>
     * 
     * @param outputConfig
     *        The output configuration of the configured audience model
     */

    public void setOutputConfig(ConfiguredAudienceModelOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The output configuration of the configured audience model
     * </p>
     * 
     * @return The output configuration of the configured audience model
     */

    public ConfiguredAudienceModelOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The output configuration of the configured audience model
     * </p>
     * 
     * @param outputConfig
     *        The output configuration of the configured audience model
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withOutputConfig(ConfiguredAudienceModelOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * 
     * @return Whether audience metrics are shared.
     * @see SharedAudienceMetrics
     */

    public java.util.List<String> getSharedAudienceMetrics() {
        return sharedAudienceMetrics;
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        Whether audience metrics are shared.
     * @see SharedAudienceMetrics
     */

    public void setSharedAudienceMetrics(java.util.Collection<String> sharedAudienceMetrics) {
        if (sharedAudienceMetrics == null) {
            this.sharedAudienceMetrics = null;
            return;
        }

        this.sharedAudienceMetrics = new java.util.ArrayList<String>(sharedAudienceMetrics);
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedAudienceMetrics(java.util.Collection)} or
     * {@link #withSharedAudienceMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        Whether audience metrics are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public GetConfiguredAudienceModelResult withSharedAudienceMetrics(String... sharedAudienceMetrics) {
        if (this.sharedAudienceMetrics == null) {
            setSharedAudienceMetrics(new java.util.ArrayList<String>(sharedAudienceMetrics.length));
        }
        for (String ele : sharedAudienceMetrics) {
            this.sharedAudienceMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        Whether audience metrics are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public GetConfiguredAudienceModelResult withSharedAudienceMetrics(java.util.Collection<String> sharedAudienceMetrics) {
        setSharedAudienceMetrics(sharedAudienceMetrics);
        return this;
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        Whether audience metrics are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public GetConfiguredAudienceModelResult withSharedAudienceMetrics(SharedAudienceMetrics... sharedAudienceMetrics) {
        java.util.ArrayList<String> sharedAudienceMetricsCopy = new java.util.ArrayList<String>(sharedAudienceMetrics.length);
        for (SharedAudienceMetrics value : sharedAudienceMetrics) {
            sharedAudienceMetricsCopy.add(value.toString());
        }
        if (getSharedAudienceMetrics() == null) {
            setSharedAudienceMetrics(sharedAudienceMetricsCopy);
        } else {
            getSharedAudienceMetrics().addAll(sharedAudienceMetricsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The status of the configured audience model.
     * </p>
     * 
     * @param status
     *        The status of the configured audience model.
     * @see ConfiguredAudienceModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the configured audience model.
     * </p>
     * 
     * @return The status of the configured audience model.
     * @see ConfiguredAudienceModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the configured audience model.
     * </p>
     * 
     * @param status
     *        The status of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredAudienceModelStatus
     */

    public GetConfiguredAudienceModelResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the configured audience model.
     * </p>
     * 
     * @param status
     *        The status of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredAudienceModelStatus
     */

    public GetConfiguredAudienceModelResult withStatus(ConfiguredAudienceModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags that are associated to this configured audience model.
     * </p>
     * 
     * @return The tags that are associated to this configured audience model.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are associated to this configured audience model.
     * </p>
     * 
     * @param tags
     *        The tags that are associated to this configured audience model.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that are associated to this configured audience model.
     * </p>
     * 
     * @param tags
     *        The tags that are associated to this configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetConfiguredAudienceModelResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult addTagsEntry(String key, String value) {
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

    public GetConfiguredAudienceModelResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The most recent time at which the configured audience model was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the configured audience model was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the configured audience model was updated.
     * </p>
     * 
     * @return The most recent time at which the configured audience model was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the configured audience model was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the configured audience model was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelResult withUpdateTime(java.util.Date updateTime) {
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
        if (getAudienceModelArn() != null)
            sb.append("AudienceModelArn: ").append(getAudienceModelArn()).append(",");
        if (getAudienceSizeConfig() != null)
            sb.append("AudienceSizeConfig: ").append(getAudienceSizeConfig()).append(",");
        if (getChildResourceTagOnCreatePolicy() != null)
            sb.append("ChildResourceTagOnCreatePolicy: ").append(getChildResourceTagOnCreatePolicy()).append(",");
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMinMatchingSeedSize() != null)
            sb.append("MinMatchingSeedSize: ").append(getMinMatchingSeedSize()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getSharedAudienceMetrics() != null)
            sb.append("SharedAudienceMetrics: ").append(getSharedAudienceMetrics()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GetConfiguredAudienceModelResult == false)
            return false;
        GetConfiguredAudienceModelResult other = (GetConfiguredAudienceModelResult) obj;
        if (other.getAudienceModelArn() == null ^ this.getAudienceModelArn() == null)
            return false;
        if (other.getAudienceModelArn() != null && other.getAudienceModelArn().equals(this.getAudienceModelArn()) == false)
            return false;
        if (other.getAudienceSizeConfig() == null ^ this.getAudienceSizeConfig() == null)
            return false;
        if (other.getAudienceSizeConfig() != null && other.getAudienceSizeConfig().equals(this.getAudienceSizeConfig()) == false)
            return false;
        if (other.getChildResourceTagOnCreatePolicy() == null ^ this.getChildResourceTagOnCreatePolicy() == null)
            return false;
        if (other.getChildResourceTagOnCreatePolicy() != null
                && other.getChildResourceTagOnCreatePolicy().equals(this.getChildResourceTagOnCreatePolicy()) == false)
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
        if (other.getMinMatchingSeedSize() == null ^ this.getMinMatchingSeedSize() == null)
            return false;
        if (other.getMinMatchingSeedSize() != null && other.getMinMatchingSeedSize().equals(this.getMinMatchingSeedSize()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getSharedAudienceMetrics() == null ^ this.getSharedAudienceMetrics() == null)
            return false;
        if (other.getSharedAudienceMetrics() != null && other.getSharedAudienceMetrics().equals(this.getSharedAudienceMetrics()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getAudienceModelArn() == null) ? 0 : getAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getAudienceSizeConfig() == null) ? 0 : getAudienceSizeConfig().hashCode());
        hashCode = prime * hashCode + ((getChildResourceTagOnCreatePolicy() == null) ? 0 : getChildResourceTagOnCreatePolicy().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMinMatchingSeedSize() == null) ? 0 : getMinMatchingSeedSize().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getSharedAudienceMetrics() == null) ? 0 : getSharedAudienceMetrics().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetConfiguredAudienceModelResult clone() {
        try {
            return (GetConfiguredAudienceModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
