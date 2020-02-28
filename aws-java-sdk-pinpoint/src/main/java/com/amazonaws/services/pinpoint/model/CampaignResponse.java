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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the status, configuration, and other settings for a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of responses, one for each treatment that you defined for the campaign, in addition to the default
     * treatment.
     * </p>
     */
    private java.util.List<TreatmentResource> additionalTreatments;
    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date, in ISO 8601 format, when the campaign was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The current status of the campaign's default treatment. This value exists only for campaigns that have more than
     * one treatment, to support A/B testing.
     * </p>
     */
    private CampaignState defaultState;
    /**
     * <p>
     * The custom description of the campaign.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
     * </p>
     */
    private Integer holdoutPercent;
    /**
     * <p>
     * The settings for the AWS Lambda function to use as a code hook for the campaign.
     * </p>
     */
    private CampaignHook hook;
    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this
     * value to false.
     * </p>
     */
    private Boolean isPaused;
    /**
     * <p>
     * The date, in ISO 8601 format, when the campaign was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The messaging limits for the campaign.
     * </p>
     */
    private CampaignLimits limits;
    /**
     * <p>
     * The message configuration settings for the campaign.
     * </p>
     */
    private MessageConfiguration messageConfiguration;
    /**
     * <p>
     * The name of the campaign.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The schedule settings for the campaign.
     * </p>
     */
    private Schedule schedule;
    /**
     * <p>
     * The unique identifier for the segment that's associated with the campaign.
     * </p>
     */
    private String segmentId;
    /**
     * <p>
     * The version number of the segment that's associated with the campaign.
     * </p>
     */
    private Integer segmentVersion;
    /**
     * <p>
     * The current status of the campaign.
     * </p>
     */
    private CampaignState state;
    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign. Each
     * tag consists of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The message template that’s used for the campaign.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;
    /**
     * <p>
     * The custom description of a variation of the campaign that's used for A/B testing.
     * </p>
     */
    private String treatmentDescription;
    /**
     * <p>
     * The custom name of a variation of the campaign that's used for A/B testing.
     * </p>
     */
    private String treatmentName;
    /**
     * <p>
     * The version number of the campaign.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * An array of responses, one for each treatment that you defined for the campaign, in addition to the default
     * treatment.
     * </p>
     * 
     * @return An array of responses, one for each treatment that you defined for the campaign, in addition to the
     *         default treatment.
     */

    public java.util.List<TreatmentResource> getAdditionalTreatments() {
        return additionalTreatments;
    }

    /**
     * <p>
     * An array of responses, one for each treatment that you defined for the campaign, in addition to the default
     * treatment.
     * </p>
     * 
     * @param additionalTreatments
     *        An array of responses, one for each treatment that you defined for the campaign, in addition to the
     *        default treatment.
     */

    public void setAdditionalTreatments(java.util.Collection<TreatmentResource> additionalTreatments) {
        if (additionalTreatments == null) {
            this.additionalTreatments = null;
            return;
        }

        this.additionalTreatments = new java.util.ArrayList<TreatmentResource>(additionalTreatments);
    }

    /**
     * <p>
     * An array of responses, one for each treatment that you defined for the campaign, in addition to the default
     * treatment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalTreatments(java.util.Collection)} or {@link #withAdditionalTreatments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalTreatments
     *        An array of responses, one for each treatment that you defined for the campaign, in addition to the
     *        default treatment.
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
     * <p>
     * An array of responses, one for each treatment that you defined for the campaign, in addition to the default
     * treatment.
     * </p>
     * 
     * @param additionalTreatments
     *        An array of responses, one for each treatment that you defined for the campaign, in addition to the
     *        default treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withAdditionalTreatments(java.util.Collection<TreatmentResource> additionalTreatments) {
        setAdditionalTreatments(additionalTreatments);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the campaign applies to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     * 
     * @return The unique identifier for the application that the campaign applies to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the campaign applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the campaign.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the campaign.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the campaign was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the campaign was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the campaign was created.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the campaign was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the campaign was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the campaign was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The current status of the campaign's default treatment. This value exists only for campaigns that have more than
     * one treatment, to support A/B testing.
     * </p>
     * 
     * @param defaultState
     *        The current status of the campaign's default treatment. This value exists only for campaigns that have
     *        more than one treatment, to support A/B testing.
     */

    public void setDefaultState(CampaignState defaultState) {
        this.defaultState = defaultState;
    }

    /**
     * <p>
     * The current status of the campaign's default treatment. This value exists only for campaigns that have more than
     * one treatment, to support A/B testing.
     * </p>
     * 
     * @return The current status of the campaign's default treatment. This value exists only for campaigns that have
     *         more than one treatment, to support A/B testing.
     */

    public CampaignState getDefaultState() {
        return this.defaultState;
    }

    /**
     * <p>
     * The current status of the campaign's default treatment. This value exists only for campaigns that have more than
     * one treatment, to support A/B testing.
     * </p>
     * 
     * @param defaultState
     *        The current status of the campaign's default treatment. This value exists only for campaigns that have
     *        more than one treatment, to support A/B testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withDefaultState(CampaignState defaultState) {
        setDefaultState(defaultState);
        return this;
    }

    /**
     * <p>
     * The custom description of the campaign.
     * </p>
     * 
     * @param description
     *        The custom description of the campaign.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the campaign.
     * </p>
     * 
     * @return The custom description of the campaign.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the campaign.
     * </p>
     * 
     * @param description
     *        The custom description of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
     * </p>
     * 
     * @param holdoutPercent
     *        The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
     */

    public void setHoldoutPercent(Integer holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
     * </p>
     * 
     * @return The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
     */

    public Integer getHoldoutPercent() {
        return this.holdoutPercent;
    }

    /**
     * <p>
     * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
     * </p>
     * 
     * @param holdoutPercent
     *        The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withHoldoutPercent(Integer holdoutPercent) {
        setHoldoutPercent(holdoutPercent);
        return this;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use as a code hook for the campaign.
     * </p>
     * 
     * @param hook
     *        The settings for the AWS Lambda function to use as a code hook for the campaign.
     */

    public void setHook(CampaignHook hook) {
        this.hook = hook;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use as a code hook for the campaign.
     * </p>
     * 
     * @return The settings for the AWS Lambda function to use as a code hook for the campaign.
     */

    public CampaignHook getHook() {
        return this.hook;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use as a code hook for the campaign.
     * </p>
     * 
     * @param hook
     *        The settings for the AWS Lambda function to use as a code hook for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withHook(CampaignHook hook) {
        setHook(hook);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     * 
     * @param id
     *        The unique identifier for the campaign.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     * 
     * @return The unique identifier for the campaign.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     * 
     * @param id
     *        The unique identifier for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this
     * value to false.
     * </p>
     * 
     * @param isPaused
     *        Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing
     *        this value to false.
     */

    public void setIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
    }

    /**
     * <p>
     * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this
     * value to false.
     * </p>
     * 
     * @return Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing
     *         this value to false.
     */

    public Boolean getIsPaused() {
        return this.isPaused;
    }

    /**
     * <p>
     * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this
     * value to false.
     * </p>
     * 
     * @param isPaused
     *        Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing
     *        this value to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withIsPaused(Boolean isPaused) {
        setIsPaused(isPaused);
        return this;
    }

    /**
     * <p>
     * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this
     * value to false.
     * </p>
     * 
     * @return Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing
     *         this value to false.
     */

    public Boolean isPaused() {
        return this.isPaused;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the campaign was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the campaign was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the campaign was last modified.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the campaign was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the campaign was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the campaign was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The messaging limits for the campaign.
     * </p>
     * 
     * @param limits
     *        The messaging limits for the campaign.
     */

    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * <p>
     * The messaging limits for the campaign.
     * </p>
     * 
     * @return The messaging limits for the campaign.
     */

    public CampaignLimits getLimits() {
        return this.limits;
    }

    /**
     * <p>
     * The messaging limits for the campaign.
     * </p>
     * 
     * @param limits
     *        The messaging limits for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withLimits(CampaignLimits limits) {
        setLimits(limits);
        return this;
    }

    /**
     * <p>
     * The message configuration settings for the campaign.
     * </p>
     * 
     * @param messageConfiguration
     *        The message configuration settings for the campaign.
     */

    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * <p>
     * The message configuration settings for the campaign.
     * </p>
     * 
     * @return The message configuration settings for the campaign.
     */

    public MessageConfiguration getMessageConfiguration() {
        return this.messageConfiguration;
    }

    /**
     * <p>
     * The message configuration settings for the campaign.
     * </p>
     * 
     * @param messageConfiguration
     *        The message configuration settings for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withMessageConfiguration(MessageConfiguration messageConfiguration) {
        setMessageConfiguration(messageConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @param name
     *        The name of the campaign.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @return The name of the campaign.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @param name
     *        The name of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The schedule settings for the campaign.
     * </p>
     * 
     * @param schedule
     *        The schedule settings for the campaign.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule settings for the campaign.
     * </p>
     * 
     * @return The schedule settings for the campaign.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule settings for the campaign.
     * </p>
     * 
     * @param schedule
     *        The schedule settings for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the segment that's associated with the campaign.
     * </p>
     * 
     * @param segmentId
     *        The unique identifier for the segment that's associated with the campaign.
     */

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment that's associated with the campaign.
     * </p>
     * 
     * @return The unique identifier for the segment that's associated with the campaign.
     */

    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment that's associated with the campaign.
     * </p>
     * 
     * @param segmentId
     *        The unique identifier for the segment that's associated with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withSegmentId(String segmentId) {
        setSegmentId(segmentId);
        return this;
    }

    /**
     * <p>
     * The version number of the segment that's associated with the campaign.
     * </p>
     * 
     * @param segmentVersion
     *        The version number of the segment that's associated with the campaign.
     */

    public void setSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    /**
     * <p>
     * The version number of the segment that's associated with the campaign.
     * </p>
     * 
     * @return The version number of the segment that's associated with the campaign.
     */

    public Integer getSegmentVersion() {
        return this.segmentVersion;
    }

    /**
     * <p>
     * The version number of the segment that's associated with the campaign.
     * </p>
     * 
     * @param segmentVersion
     *        The version number of the segment that's associated with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withSegmentVersion(Integer segmentVersion) {
        setSegmentVersion(segmentVersion);
        return this;
    }

    /**
     * <p>
     * The current status of the campaign.
     * </p>
     * 
     * @param state
     *        The current status of the campaign.
     */

    public void setState(CampaignState state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the campaign.
     * </p>
     * 
     * @return The current status of the campaign.
     */

    public CampaignState getState() {
        return this.state;
    }

    /**
     * <p>
     * The current status of the campaign.
     * </p>
     * 
     * @param state
     *        The current status of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withState(CampaignState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign. Each
     * tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign.
     *         Each tag consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign. Each
     * tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign.
     *        Each tag consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign. Each
     * tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign.
     *        Each tag consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CampaignResponse#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * <p>
     * The message template that’s used for the campaign.
     * </p>
     * 
     * @param templateConfiguration
     *        The message template that’s used for the campaign.
     */

    public void setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * The message template that’s used for the campaign.
     * </p>
     * 
     * @return The message template that’s used for the campaign.
     */

    public TemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * <p>
     * The message template that’s used for the campaign.
     * </p>
     * 
     * @param templateConfiguration
     *        The message template that’s used for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        setTemplateConfiguration(templateConfiguration);
        return this;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign that's used for A/B testing.
     * </p>
     * 
     * @param treatmentDescription
     *        The custom description of a variation of the campaign that's used for A/B testing.
     */

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign that's used for A/B testing.
     * </p>
     * 
     * @return The custom description of a variation of the campaign that's used for A/B testing.
     */

    public String getTreatmentDescription() {
        return this.treatmentDescription;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign that's used for A/B testing.
     * </p>
     * 
     * @param treatmentDescription
     *        The custom description of a variation of the campaign that's used for A/B testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withTreatmentDescription(String treatmentDescription) {
        setTreatmentDescription(treatmentDescription);
        return this;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign that's used for A/B testing.
     * </p>
     * 
     * @param treatmentName
     *        The custom name of a variation of the campaign that's used for A/B testing.
     */

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign that's used for A/B testing.
     * </p>
     * 
     * @return The custom name of a variation of the campaign that's used for A/B testing.
     */

    public String getTreatmentName() {
        return this.treatmentName;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign that's used for A/B testing.
     * </p>
     * 
     * @param treatmentName
     *        The custom name of a variation of the campaign that's used for A/B testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignResponse withTreatmentName(String treatmentName) {
        setTreatmentName(treatmentName);
        return this;
    }

    /**
     * <p>
     * The version number of the campaign.
     * </p>
     * 
     * @param version
     *        The version number of the campaign.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the campaign.
     * </p>
     * 
     * @return The version number of the campaign.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the campaign.
     * </p>
     * 
     * @param version
     *        The version number of the campaign.
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
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: ").append(getTemplateConfiguration()).append(",");
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
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
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
