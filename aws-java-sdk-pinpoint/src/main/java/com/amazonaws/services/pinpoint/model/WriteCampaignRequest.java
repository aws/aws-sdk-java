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
 * <p>
 * Specifies the configuration and other settings for a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WriteCampaignRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteCampaignRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign, in addition to the default treatment
     * for the campaign.
     * </p>
     */
    private java.util.List<WriteTreatmentResource> additionalTreatments;
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
     * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting this value
     * to false.
     * </p>
     */
    private Boolean isPaused;
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
     * The custom name of the campaign.
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
     * The unique identifier for the segment to associate with the campaign.
     * </p>
     */
    private String segmentId;
    /**
     * <p>
     * The version of the segment to associate with the campaign.
     * </p>
     */
    private Integer segmentVersion;
    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists
     * of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The custom description of a variation of the campaign to use for A/B testing.
     * </p>
     */
    private String treatmentDescription;
    /**
     * <p>
     * The custom name of a variation of the campaign to use for A/B testing.
     * </p>
     */
    private String treatmentName;

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign, in addition to the default treatment
     * for the campaign.
     * </p>
     * 
     * @return An array of requests that defines additional treatments for the campaign, in addition to the default
     *         treatment for the campaign.
     */

    public java.util.List<WriteTreatmentResource> getAdditionalTreatments() {
        return additionalTreatments;
    }

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign, in addition to the default treatment
     * for the campaign.
     * </p>
     * 
     * @param additionalTreatments
     *        An array of requests that defines additional treatments for the campaign, in addition to the default
     *        treatment for the campaign.
     */

    public void setAdditionalTreatments(java.util.Collection<WriteTreatmentResource> additionalTreatments) {
        if (additionalTreatments == null) {
            this.additionalTreatments = null;
            return;
        }

        this.additionalTreatments = new java.util.ArrayList<WriteTreatmentResource>(additionalTreatments);
    }

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign, in addition to the default treatment
     * for the campaign.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalTreatments(java.util.Collection)} or {@link #withAdditionalTreatments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalTreatments
     *        An array of requests that defines additional treatments for the campaign, in addition to the default
     *        treatment for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withAdditionalTreatments(WriteTreatmentResource... additionalTreatments) {
        if (this.additionalTreatments == null) {
            setAdditionalTreatments(new java.util.ArrayList<WriteTreatmentResource>(additionalTreatments.length));
        }
        for (WriteTreatmentResource ele : additionalTreatments) {
            this.additionalTreatments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of requests that defines additional treatments for the campaign, in addition to the default treatment
     * for the campaign.
     * </p>
     * 
     * @param additionalTreatments
     *        An array of requests that defines additional treatments for the campaign, in addition to the default
     *        treatment for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withAdditionalTreatments(java.util.Collection<WriteTreatmentResource> additionalTreatments) {
        setAdditionalTreatments(additionalTreatments);
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

    public WriteCampaignRequest withDescription(String description) {
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

    public WriteCampaignRequest withHoldoutPercent(Integer holdoutPercent) {
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

    public WriteCampaignRequest withHook(CampaignHook hook) {
        setHook(hook);
        return this;
    }

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting this value
     * to false.
     * </p>
     * 
     * @param isPaused
     *        Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting
     *        this value to false.
     */

    public void setIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
    }

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting this value
     * to false.
     * </p>
     * 
     * @return Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting
     *         this value to false.
     */

    public Boolean getIsPaused() {
        return this.isPaused;
    }

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting this value
     * to false.
     * </p>
     * 
     * @param isPaused
     *        Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting
     *        this value to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withIsPaused(Boolean isPaused) {
        setIsPaused(isPaused);
        return this;
    }

    /**
     * <p>
     * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting this value
     * to false.
     * </p>
     * 
     * @return Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting
     *         this value to false.
     */

    public Boolean isPaused() {
        return this.isPaused;
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

    public WriteCampaignRequest withLimits(CampaignLimits limits) {
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

    public WriteCampaignRequest withMessageConfiguration(MessageConfiguration messageConfiguration) {
        setMessageConfiguration(messageConfiguration);
        return this;
    }

    /**
     * <p>
     * The custom name of the campaign.
     * </p>
     * 
     * @param name
     *        The custom name of the campaign.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the campaign.
     * </p>
     * 
     * @return The custom name of the campaign.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name of the campaign.
     * </p>
     * 
     * @param name
     *        The custom name of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withName(String name) {
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

    public WriteCampaignRequest withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the segment to associate with the campaign.
     * </p>
     * 
     * @param segmentId
     *        The unique identifier for the segment to associate with the campaign.
     */

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment to associate with the campaign.
     * </p>
     * 
     * @return The unique identifier for the segment to associate with the campaign.
     */

    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment to associate with the campaign.
     * </p>
     * 
     * @param segmentId
     *        The unique identifier for the segment to associate with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withSegmentId(String segmentId) {
        setSegmentId(segmentId);
        return this;
    }

    /**
     * <p>
     * The version of the segment to associate with the campaign.
     * </p>
     * 
     * @param segmentVersion
     *        The version of the segment to associate with the campaign.
     */

    public void setSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    /**
     * <p>
     * The version of the segment to associate with the campaign.
     * </p>
     * 
     * @return The version of the segment to associate with the campaign.
     */

    public Integer getSegmentVersion() {
        return this.segmentVersion;
    }

    /**
     * <p>
     * The version of the segment to associate with the campaign.
     * </p>
     * 
     * @param segmentVersion
     *        The version of the segment to associate with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withSegmentVersion(Integer segmentVersion) {
        setSegmentVersion(segmentVersion);
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists
     * of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag
     *         consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists
     * of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag
     *        consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists
     * of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag
     *        consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public WriteCampaignRequest addTagsEntry(String key, String value) {
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

    public WriteCampaignRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign to use for A/B testing.
     * </p>
     * 
     * @param treatmentDescription
     *        The custom description of a variation of the campaign to use for A/B testing.
     */

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign to use for A/B testing.
     * </p>
     * 
     * @return The custom description of a variation of the campaign to use for A/B testing.
     */

    public String getTreatmentDescription() {
        return this.treatmentDescription;
    }

    /**
     * <p>
     * The custom description of a variation of the campaign to use for A/B testing.
     * </p>
     * 
     * @param treatmentDescription
     *        The custom description of a variation of the campaign to use for A/B testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withTreatmentDescription(String treatmentDescription) {
        setTreatmentDescription(treatmentDescription);
        return this;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign to use for A/B testing.
     * </p>
     * 
     * @param treatmentName
     *        The custom name of a variation of the campaign to use for A/B testing.
     */

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign to use for A/B testing.
     * </p>
     * 
     * @return The custom name of a variation of the campaign to use for A/B testing.
     */

    public String getTreatmentName() {
        return this.treatmentName;
    }

    /**
     * <p>
     * The custom name of a variation of the campaign to use for A/B testing.
     * </p>
     * 
     * @param treatmentName
     *        The custom name of a variation of the campaign to use for A/B testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteCampaignRequest withTreatmentName(String treatmentName) {
        setTreatmentName(treatmentName);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHoldoutPercent() != null)
            sb.append("HoldoutPercent: ").append(getHoldoutPercent()).append(",");
        if (getHook() != null)
            sb.append("Hook: ").append(getHook()).append(",");
        if (getIsPaused() != null)
            sb.append("IsPaused: ").append(getIsPaused()).append(",");
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTreatmentDescription() != null)
            sb.append("TreatmentDescription: ").append(getTreatmentDescription()).append(",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: ").append(getTreatmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteCampaignRequest == false)
            return false;
        WriteCampaignRequest other = (WriteCampaignRequest) obj;
        if (other.getAdditionalTreatments() == null ^ this.getAdditionalTreatments() == null)
            return false;
        if (other.getAdditionalTreatments() != null && other.getAdditionalTreatments().equals(this.getAdditionalTreatments()) == false)
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
        if (other.getIsPaused() == null ^ this.getIsPaused() == null)
            return false;
        if (other.getIsPaused() != null && other.getIsPaused().equals(this.getIsPaused()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalTreatments() == null) ? 0 : getAdditionalTreatments().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHoldoutPercent() == null) ? 0 : getHoldoutPercent().hashCode());
        hashCode = prime * hashCode + ((getHook() == null) ? 0 : getHook().hashCode());
        hashCode = prime * hashCode + ((getIsPaused() == null) ? 0 : getIsPaused().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode + ((getSegmentVersion() == null) ? 0 : getSegmentVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTreatmentDescription() == null) ? 0 : getTreatmentDescription().hashCode());
        hashCode = prime * hashCode + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        return hashCode;
    }

    @Override
    public WriteCampaignRequest clone() {
        try {
            return (WriteCampaignRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WriteCampaignRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
