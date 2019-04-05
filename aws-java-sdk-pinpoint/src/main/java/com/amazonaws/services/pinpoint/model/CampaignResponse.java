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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Campaign definition
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignResponse implements Serializable, Cloneable, StructuredPojo {

    /** Treatments that are defined in addition to the default treatment. */
    private java.util.List<TreatmentResource> additionalTreatments;
    /** The ID of the application to which the campaign applies. */
    private String applicationId;
    /** The arn for the campaign. */
    private String arn;
    /** The date the campaign was created in ISO 8601 format. */
    private String creationDate;
    /** The status of the campaign's default treatment. Only present for A/B test campaigns. */
    private CampaignState defaultState;
    /** A description of the campaign. */
    private String description;
    /** The allocated percentage of end users who will not receive messages from this campaign. */
    private Integer holdoutPercent;
    /** Campaign hook information. */
    private CampaignHook hook;
    /** The unique campaign ID. */
    private String id;
    /**
     * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by
     * setting IsPaused to false.
     */
    private Boolean isPaused;
    /** The date the campaign was last updated in ISO 8601 format. */
    private String lastModifiedDate;
    /** The campaign limits settings. */
    private CampaignLimits limits;
    /** The message configuration settings. */
    private MessageConfiguration messageConfiguration;
    /** The custom name of the campaign. */
    private String name;
    /** The campaign schedule. */
    private Schedule schedule;
    /** The ID of the segment to which the campaign sends messages. */
    private String segmentId;
    /** The version of the segment to which the campaign sends messages. */
    private Integer segmentVersion;
    /**
     * The campaign status.
     * 
     * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
     */
    private CampaignState state;
    /** The Tags for the campaign. */
    private java.util.Map<String, String> tags;
    /** A custom description for the treatment. */
    private String treatmentDescription;
    /** The custom name of a variation of the campaign used for A/B testing. */
    private String treatmentName;
    /** The campaign version number. */
    private Integer version;

    /**
     * Treatments that are defined in addition to the default treatment.
     * 
     * @return Treatments that are defined in addition to the default treatment.
     */

    public java.util.List<TreatmentResource> getAdditionalTreatments() {
        return additionalTreatments;
    }

    /**
     * Treatments that are defined in addition to the default treatment.
     * 
     * @param additionalTreatments
     *        Treatments that are defined in addition to the default treatment.
     */

    public void setAdditionalTreatments(java.util.Collection<TreatmentResource> additionalTreatments) {
        if (additionalTreatments == null) {
            this.additionalTreatments = null;
            return;
        }

        this.additionalTreatments = new java.util.ArrayList<TreatmentResource>(additionalTreatments);
    }

    /**
     * Treatments that are defined in addition to the default treatment.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalTreatments(java.util.Collection)} or {@link #withAdditionalTreatments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalTreatments
     *        Treatments that are defined in addition to the default treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withAdditionalTreatments(TreatmentResource... additionalTreatments) {
        if (this.additionalTreatments == null) {
            setAdditionalTreatments(new java.util.ArrayList<TreatmentResource>(additionalTreatments.length));
        }
        for (TreatmentResource ele : additionalTreatments) {
            this.additionalTreatments.add(ele);
        }
        return this;
    }

    /**
     * Treatments that are defined in addition to the default treatment.
     * 
     * @param additionalTreatments
     *        Treatments that are defined in addition to the default treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withAdditionalTreatments(java.util.Collection<TreatmentResource> additionalTreatments) {
        setAdditionalTreatments(additionalTreatments);
        return this;
    }

    /**
     * The ID of the application to which the campaign applies.
     * 
     * @param applicationId
     *        The ID of the application to which the campaign applies.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application to which the campaign applies.
     * 
     * @return The ID of the application to which the campaign applies.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The ID of the application to which the campaign applies.
     * 
     * @param applicationId
     *        The ID of the application to which the campaign applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The arn for the campaign.
     * 
     * @param arn
     *        The arn for the campaign.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The arn for the campaign.
     * 
     * @return The arn for the campaign.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The arn for the campaign.
     * 
     * @param arn
     *        The arn for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The date the campaign was created in ISO 8601 format.
     * 
     * @param creationDate
     *        The date the campaign was created in ISO 8601 format.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date the campaign was created in ISO 8601 format.
     * 
     * @return The date the campaign was created in ISO 8601 format.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * The date the campaign was created in ISO 8601 format.
     * 
     * @param creationDate
     *        The date the campaign was created in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * The status of the campaign's default treatment. Only present for A/B test campaigns.
     * 
     * @param defaultState
     *        The status of the campaign's default treatment. Only present for A/B test campaigns.
     */

    public void setDefaultState(CampaignState defaultState) {
        this.defaultState = defaultState;
    }

    /**
     * The status of the campaign's default treatment. Only present for A/B test campaigns.
     * 
     * @return The status of the campaign's default treatment. Only present for A/B test campaigns.
     */

    public CampaignState getDefaultState() {
        return this.defaultState;
    }

    /**
     * The status of the campaign's default treatment. Only present for A/B test campaigns.
     * 
     * @param defaultState
     *        The status of the campaign's default treatment. Only present for A/B test campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withDefaultState(CampaignState defaultState) {
        setDefaultState(defaultState);
        return this;
    }

    /**
     * A description of the campaign.
     * 
     * @param description
     *        A description of the campaign.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description of the campaign.
     * 
     * @return A description of the campaign.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description of the campaign.
     * 
     * @param description
     *        A description of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The allocated percentage of end users who will not receive messages from this campaign.
     * 
     * @param holdoutPercent
     *        The allocated percentage of end users who will not receive messages from this campaign.
     */

    public void setHoldoutPercent(Integer holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
    }

    /**
     * The allocated percentage of end users who will not receive messages from this campaign.
     * 
     * @return The allocated percentage of end users who will not receive messages from this campaign.
     */

    public Integer getHoldoutPercent() {
        return this.holdoutPercent;
    }

    /**
     * The allocated percentage of end users who will not receive messages from this campaign.
     * 
     * @param holdoutPercent
     *        The allocated percentage of end users who will not receive messages from this campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withHoldoutPercent(Integer holdoutPercent) {
        setHoldoutPercent(holdoutPercent);
        return this;
    }

    /**
     * Campaign hook information.
     * 
     * @param hook
     *        Campaign hook information.
     */

    public void setHook(CampaignHook hook) {
        this.hook = hook;
    }

    /**
     * Campaign hook information.
     * 
     * @return Campaign hook information.
     */

    public CampaignHook getHook() {
        return this.hook;
    }

    /**
     * Campaign hook information.
     * 
     * @param hook
     *        Campaign hook information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withHook(CampaignHook hook) {
        setHook(hook);
        return this;
    }

    /**
     * The unique campaign ID.
     * 
     * @param id
     *        The unique campaign ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique campaign ID.
     * 
     * @return The unique campaign ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique campaign ID.
     * 
     * @param id
     *        The unique campaign ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by
     * setting IsPaused to false.
     * 
     * @param isPaused
     *        Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by
     *        setting IsPaused to false.
     */

    public void setIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
    }

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by
     * setting IsPaused to false.
     * 
     * @return Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it
     *         by setting IsPaused to false.
     */

    public Boolean getIsPaused() {
        return this.isPaused;
    }

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by
     * setting IsPaused to false.
     * 
     * @param isPaused
     *        Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by
     *        setting IsPaused to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withIsPaused(Boolean isPaused) {
        setIsPaused(isPaused);
        return this;
    }

    /**
     * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by
     * setting IsPaused to false.
     * 
     * @return Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it
     *         by setting IsPaused to false.
     */

    public Boolean isPaused() {
        return this.isPaused;
    }

    /**
     * The date the campaign was last updated in ISO 8601 format.
     * 
     * @param lastModifiedDate
     *        The date the campaign was last updated in ISO 8601 format.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date the campaign was last updated in ISO 8601 format.
     * 
     * @return The date the campaign was last updated in ISO 8601 format.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * The date the campaign was last updated in ISO 8601 format.
     * 
     * @param lastModifiedDate
     *        The date the campaign was last updated in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * The campaign limits settings.
     * 
     * @param limits
     *        The campaign limits settings.
     */

    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * The campaign limits settings.
     * 
     * @return The campaign limits settings.
     */

    public CampaignLimits getLimits() {
        return this.limits;
    }

    /**
     * The campaign limits settings.
     * 
     * @param limits
     *        The campaign limits settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withLimits(CampaignLimits limits) {
        setLimits(limits);
        return this;
    }

    /**
     * The message configuration settings.
     * 
     * @param messageConfiguration
     *        The message configuration settings.
     */

    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * The message configuration settings.
     * 
     * @return The message configuration settings.
     */

    public MessageConfiguration getMessageConfiguration() {
        return this.messageConfiguration;
    }

    /**
     * The message configuration settings.
     * 
     * @param messageConfiguration
     *        The message configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withMessageConfiguration(MessageConfiguration messageConfiguration) {
        setMessageConfiguration(messageConfiguration);
        return this;
    }

    /**
     * The custom name of the campaign.
     * 
     * @param name
     *        The custom name of the campaign.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The custom name of the campaign.
     * 
     * @return The custom name of the campaign.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The custom name of the campaign.
     * 
     * @param name
     *        The custom name of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The campaign schedule.
     * 
     * @param schedule
     *        The campaign schedule.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * The campaign schedule.
     * 
     * @return The campaign schedule.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * The campaign schedule.
     * 
     * @param schedule
     *        The campaign schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * The ID of the segment to which the campaign sends messages.
     * 
     * @param segmentId
     *        The ID of the segment to which the campaign sends messages.
     */

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * The ID of the segment to which the campaign sends messages.
     * 
     * @return The ID of the segment to which the campaign sends messages.
     */

    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * The ID of the segment to which the campaign sends messages.
     * 
     * @param segmentId
     *        The ID of the segment to which the campaign sends messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withSegmentId(String segmentId) {
        setSegmentId(segmentId);
        return this;
    }

    /**
     * The version of the segment to which the campaign sends messages.
     * 
     * @param segmentVersion
     *        The version of the segment to which the campaign sends messages.
     */

    public void setSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    /**
     * The version of the segment to which the campaign sends messages.
     * 
     * @return The version of the segment to which the campaign sends messages.
     */

    public Integer getSegmentVersion() {
        return this.segmentVersion;
    }

    /**
     * The version of the segment to which the campaign sends messages.
     * 
     * @param segmentVersion
     *        The version of the segment to which the campaign sends messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withSegmentVersion(Integer segmentVersion) {
        setSegmentVersion(segmentVersion);
        return this;
    }

    /**
     * The campaign status.
     * 
     * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
     * 
     * @param state
     *        The campaign status.
     * 
     *        An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
     */

    public void setState(CampaignState state) {
        this.state = state;
    }

    /**
     * The campaign status.
     * 
     * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
     * 
     * @return The campaign status.
     * 
     *         An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
     */

    public CampaignState getState() {
        return this.state;
    }

    /**
     * The campaign status.
     * 
     * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
     * 
     * @param state
     *        The campaign status.
     * 
     *        An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withState(CampaignState state) {
        setState(state);
        return this;
    }

    /**
     * The Tags for the campaign.
     * 
     * @return The Tags for the campaign.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The Tags for the campaign.
     * 
     * @param tags
     *        The Tags for the campaign.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The Tags for the campaign.
     * 
     * @param tags
     *        The Tags for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CampaignResponse addTagsEntry(String key, String value) {
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

    public CampaignResponse clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * A custom description for the treatment.
     * 
     * @param treatmentDescription
     *        A custom description for the treatment.
     */

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * A custom description for the treatment.
     * 
     * @return A custom description for the treatment.
     */

    public String getTreatmentDescription() {
        return this.treatmentDescription;
    }

    /**
     * A custom description for the treatment.
     * 
     * @param treatmentDescription
     *        A custom description for the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withTreatmentDescription(String treatmentDescription) {
        setTreatmentDescription(treatmentDescription);
        return this;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     * 
     * @param treatmentName
     *        The custom name of a variation of the campaign used for A/B testing.
     */

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     * 
     * @return The custom name of a variation of the campaign used for A/B testing.
     */

    public String getTreatmentName() {
        return this.treatmentName;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     * 
     * @param treatmentName
     *        The custom name of a variation of the campaign used for A/B testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withTreatmentName(String treatmentName) {
        setTreatmentName(treatmentName);
        return this;
    }

    /**
     * The campaign version number.
     * 
     * @param version
     *        The campaign version number.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * The campaign version number.
     * 
     * @return The campaign version number.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * The campaign version number.
     * 
     * @param version
     *        The campaign version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withVersion(Integer version) {
        setVersion(version);
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
        if (getAdditionalTreatments() != null)
            sb.append("AdditionalTreatments: ").append(getAdditionalTreatments()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDefaultState() != null)
            sb.append("DefaultState: ").append(getDefaultState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHoldoutPercent() != null)
            sb.append("HoldoutPercent: ").append(getHoldoutPercent()).append(",");
        if (getHook() != null)
            sb.append("Hook: ").append(getHook()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsPaused() != null)
            sb.append("IsPaused: ").append(getIsPaused()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLimits() != null)
            sb.append("Limits: ").append(getLimits()).append(",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: ").append(getMessageConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSegmentId() != null)
            sb.append("SegmentId: ").append(getSegmentId()).append(",");
        if (getSegmentVersion() != null)
            sb.append("SegmentVersion: ").append(getSegmentVersion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTreatmentDescription() != null)
            sb.append("TreatmentDescription: ").append(getTreatmentDescription()).append(",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: ").append(getTreatmentName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignResponse == false)
            return false;
        CampaignResponse other = (CampaignResponse) obj;
        if (other.getAdditionalTreatments() == null ^ this.getAdditionalTreatments() == null)
            return false;
        if (other.getAdditionalTreatments() != null && other.getAdditionalTreatments().equals(this.getAdditionalTreatments()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefaultState() == null ^ this.getDefaultState() == null)
            return false;
        if (other.getDefaultState() != null && other.getDefaultState().equals(this.getDefaultState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHoldoutPercent() == null ^ this.getHoldoutPercent() == null)
            return false;
        if (other.getHoldoutPercent() != null && other.getHoldoutPercent().equals(this.getHoldoutPercent()) == false)
            return false;
        if (other.getHook() == null ^ this.getHook() == null)
            return false;
        if (other.getHook() != null && other.getHook().equals(this.getHook()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsPaused() == null ^ this.getIsPaused() == null)
            return false;
        if (other.getIsPaused() != null && other.getIsPaused().equals(this.getIsPaused()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getMessageConfiguration() == null ^ this.getMessageConfiguration() == null)
            return false;
        if (other.getMessageConfiguration() != null && other.getMessageConfiguration().equals(this.getMessageConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getSegmentVersion() == null ^ this.getSegmentVersion() == null)
            return false;
        if (other.getSegmentVersion() != null && other.getSegmentVersion().equals(this.getSegmentVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTreatmentDescription() == null ^ this.getTreatmentDescription() == null)
            return false;
        if (other.getTreatmentDescription() != null && other.getTreatmentDescription().equals(this.getTreatmentDescription()) == false)
            return false;
        if (other.getTreatmentName() == null ^ this.getTreatmentName() == null)
            return false;
        if (other.getTreatmentName() != null && other.getTreatmentName().equals(this.getTreatmentName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalTreatments() == null) ? 0 : getAdditionalTreatments().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDefaultState() == null) ? 0 : getDefaultState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHoldoutPercent() == null) ? 0 : getHoldoutPercent().hashCode());
        hashCode = prime * hashCode + ((getHook() == null) ? 0 : getHook().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsPaused() == null) ? 0 : getIsPaused().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode + ((getSegmentVersion() == null) ? 0 : getSegmentVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTreatmentDescription() == null) ? 0 : getTreatmentDescription().hashCode());
        hashCode = prime * hashCode + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public CampaignResponse clone() {
        try {
            return (CampaignResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CampaignResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
