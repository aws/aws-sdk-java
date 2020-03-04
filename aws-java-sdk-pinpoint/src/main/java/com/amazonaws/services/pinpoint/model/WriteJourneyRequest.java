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
 * Specifies the configuration and other settings for a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WriteJourneyRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteJourneyRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity
     * object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
     * An activity identifier can contain a maximum of 100 characters. The characters must be alphanumeric characters.
     * </p>
     */
    private java.util.Map<String, Activity> activities;
    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The messaging and entry limits for the journey.
     * </p>
     */
    private JourneyLimits limits;
    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the
     * schedule on each participant's local time, set this value to true.
     * </p>
     */
    private Boolean localTime;
    /**
     * <p>
     * The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be
     * alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain any
     * spaces.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send messages
     * to participants, if all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is later than or equal to the time specified by the
     * QuietTime.Start property for the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is earlier than or equal to the time specified by the
     * QuietTime.End property for the journey.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the participant will receive messages from the journey, even if
     * quiet time is enabled.
     * </p>
     */
    private QuietTime quietTime;
    /**
     * <p>
     * The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration in ISO
     * 8601 format.
     * </p>
     */
    private String refreshFrequency;
    /**
     * <p>
     * The schedule settings for the journey.
     * </p>
     */
    private JourneySchedule schedule;
    /**
     * <p>
     * The unique identifier for the first activity in the journey. The identifier for this activity can contain a
     * maximum of 128 characters. The characters must be alphanumeric characters.
     * </p>
     */
    private String startActivity;
    /**
     * <p>
     * The segment that defines which users are participants in the journey.
     * </p>
     */
    private StartCondition startCondition;
    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     * immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove
     * activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey. To
     * cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey State</link>
     * resource.
     * </p>
     */
    private String state;

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity
     * object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
     * An activity identifier can contain a maximum of 100 characters. The characters must be alphanumeric characters.
     * </p>
     * 
     * @return A map that contains a set of Activity objects, one object for each activity in the journey. For each
     *         Activity object, the key is the unique identifier (string) for an activity and the value is the settings
     *         for the activity. An activity identifier can contain a maximum of 100 characters. The characters must be
     *         alphanumeric characters.
     */

    public java.util.Map<String, Activity> getActivities() {
        return activities;
    }

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity
     * object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
     * An activity identifier can contain a maximum of 100 characters. The characters must be alphanumeric characters.
     * </p>
     * 
     * @param activities
     *        A map that contains a set of Activity objects, one object for each activity in the journey. For each
     *        Activity object, the key is the unique identifier (string) for an activity and the value is the settings
     *        for the activity. An activity identifier can contain a maximum of 100 characters. The characters must be
     *        alphanumeric characters.
     */

    public void setActivities(java.util.Map<String, Activity> activities) {
        this.activities = activities;
    }

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity
     * object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
     * An activity identifier can contain a maximum of 100 characters. The characters must be alphanumeric characters.
     * </p>
     * 
     * @param activities
     *        A map that contains a set of Activity objects, one object for each activity in the journey. For each
     *        Activity object, the key is the unique identifier (string) for an activity and the value is the settings
     *        for the activity. An activity identifier can contain a maximum of 100 characters. The characters must be
     *        alphanumeric characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withActivities(java.util.Map<String, Activity> activities) {
        setActivities(activities);
        return this;
    }

    /**
     * Add a single Activities entry
     *
     * @see WriteJourneyRequest#withActivities
     * @returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest addActivitiesEntry(String key, Activity value) {
        if (null == this.activities) {
            this.activities = new java.util.HashMap<String, Activity>();
        }
        if (this.activities.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.activities.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Activities.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest clearActivitiesEntries() {
        this.activities = null;
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the journey was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the journey was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the journey was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the journey was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was last modified.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the journey was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the journey was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The messaging and entry limits for the journey.
     * </p>
     * 
     * @param limits
     *        The messaging and entry limits for the journey.
     */

    public void setLimits(JourneyLimits limits) {
        this.limits = limits;
    }

    /**
     * <p>
     * The messaging and entry limits for the journey.
     * </p>
     * 
     * @return The messaging and entry limits for the journey.
     */

    public JourneyLimits getLimits() {
        return this.limits;
    }

    /**
     * <p>
     * The messaging and entry limits for the journey.
     * </p>
     * 
     * @param limits
     *        The messaging and entry limits for the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withLimits(JourneyLimits limits) {
        setLimits(limits);
        return this;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the
     * schedule on each participant's local time, set this value to true.
     * </p>
     * 
     * @param localTime
     *        Specifies whether the journey's scheduled start and end times use each participant's local time. To base
     *        the schedule on each participant's local time, set this value to true.
     */

    public void setLocalTime(Boolean localTime) {
        this.localTime = localTime;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the
     * schedule on each participant's local time, set this value to true.
     * </p>
     * 
     * @return Specifies whether the journey's scheduled start and end times use each participant's local time. To base
     *         the schedule on each participant's local time, set this value to true.
     */

    public Boolean getLocalTime() {
        return this.localTime;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the
     * schedule on each participant's local time, set this value to true.
     * </p>
     * 
     * @param localTime
     *        Specifies whether the journey's scheduled start and end times use each participant's local time. To base
     *        the schedule on each participant's local time, set this value to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withLocalTime(Boolean localTime) {
        setLocalTime(localTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the
     * schedule on each participant's local time, set this value to true.
     * </p>
     * 
     * @return Specifies whether the journey's scheduled start and end times use each participant's local time. To base
     *         the schedule on each participant's local time, set this value to true.
     */

    public Boolean isLocalTime() {
        return this.localTime;
    }

    /**
     * <p>
     * The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be
     * alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain any
     * spaces.
     * </p>
     * 
     * @param name
     *        The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be
     *        alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain
     *        any spaces.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be
     * alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain any
     * spaces.
     * </p>
     * 
     * @return The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be
     *         alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain
     *         any spaces.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be
     * alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain any
     * spaces.
     * </p>
     * 
     * @param name
     *        The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be
     *        alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain
     *        any spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send messages
     * to participants, if all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is later than or equal to the time specified by the
     * QuietTime.Start property for the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is earlier than or equal to the time specified by the
     * QuietTime.End property for the journey.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the participant will receive messages from the journey, even if
     * quiet time is enabled.
     * </p>
     * 
     * @param quietTime
     *        The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send
     *        messages to participants, if all the following conditions are met:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the participant's time zone is later than or equal to the time specified by the
     *        QuietTime.Start property for the journey.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the participant's time zone is earlier than or equal to the time specified by the
     *        QuietTime.End property for the journey.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of the preceding conditions isn't met, the participant will receive messages from the journey, even
     *        if quiet time is enabled.
     */

    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * <p>
     * The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send messages
     * to participants, if all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is later than or equal to the time specified by the
     * QuietTime.Start property for the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is earlier than or equal to the time specified by the
     * QuietTime.End property for the journey.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the participant will receive messages from the journey, even if
     * quiet time is enabled.
     * </p>
     * 
     * @return The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send
     *         messages to participants, if all the following conditions are met:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the participant's time zone is later than or equal to the time specified by the
     *         QuietTime.Start property for the journey.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the participant's time zone is earlier than or equal to the time specified by the
     *         QuietTime.End property for the journey.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of the preceding conditions isn't met, the participant will receive messages from the journey,
     *         even if quiet time is enabled.
     */

    public QuietTime getQuietTime() {
        return this.quietTime;
    }

    /**
     * <p>
     * The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send messages
     * to participants, if all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is later than or equal to the time specified by the
     * QuietTime.Start property for the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the participant's time zone is earlier than or equal to the time specified by the
     * QuietTime.End property for the journey.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the participant will receive messages from the journey, even if
     * quiet time is enabled.
     * </p>
     * 
     * @param quietTime
     *        The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send
     *        messages to participants, if all the following conditions are met:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the participant's time zone is later than or equal to the time specified by the
     *        QuietTime.Start property for the journey.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the participant's time zone is earlier than or equal to the time specified by the
     *        QuietTime.End property for the journey.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of the preceding conditions isn't met, the participant will receive messages from the journey, even
     *        if quiet time is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withQuietTime(QuietTime quietTime) {
        setQuietTime(quietTime);
        return this;
    }

    /**
     * <p>
     * The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration in ISO
     * 8601 format.
     * </p>
     * 
     * @param refreshFrequency
     *        The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration
     *        in ISO 8601 format.
     */

    public void setRefreshFrequency(String refreshFrequency) {
        this.refreshFrequency = refreshFrequency;
    }

    /**
     * <p>
     * The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration in ISO
     * 8601 format.
     * </p>
     * 
     * @return The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration
     *         in ISO 8601 format.
     */

    public String getRefreshFrequency() {
        return this.refreshFrequency;
    }

    /**
     * <p>
     * The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration in ISO
     * 8601 format.
     * </p>
     * 
     * @param refreshFrequency
     *        The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration
     *        in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withRefreshFrequency(String refreshFrequency) {
        setRefreshFrequency(refreshFrequency);
        return this;
    }

    /**
     * <p>
     * The schedule settings for the journey.
     * </p>
     * 
     * @param schedule
     *        The schedule settings for the journey.
     */

    public void setSchedule(JourneySchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule settings for the journey.
     * </p>
     * 
     * @return The schedule settings for the journey.
     */

    public JourneySchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule settings for the journey.
     * </p>
     * 
     * @param schedule
     *        The schedule settings for the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withSchedule(JourneySchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey. The identifier for this activity can contain a
     * maximum of 128 characters. The characters must be alphanumeric characters.
     * </p>
     * 
     * @param startActivity
     *        The unique identifier for the first activity in the journey. The identifier for this activity can contain
     *        a maximum of 128 characters. The characters must be alphanumeric characters.
     */

    public void setStartActivity(String startActivity) {
        this.startActivity = startActivity;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey. The identifier for this activity can contain a
     * maximum of 128 characters. The characters must be alphanumeric characters.
     * </p>
     * 
     * @return The unique identifier for the first activity in the journey. The identifier for this activity can contain
     *         a maximum of 128 characters. The characters must be alphanumeric characters.
     */

    public String getStartActivity() {
        return this.startActivity;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey. The identifier for this activity can contain a
     * maximum of 128 characters. The characters must be alphanumeric characters.
     * </p>
     * 
     * @param startActivity
     *        The unique identifier for the first activity in the journey. The identifier for this activity can contain
     *        a maximum of 128 characters. The characters must be alphanumeric characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withStartActivity(String startActivity) {
        setStartActivity(startActivity);
        return this;
    }

    /**
     * <p>
     * The segment that defines which users are participants in the journey.
     * </p>
     * 
     * @param startCondition
     *        The segment that defines which users are participants in the journey.
     */

    public void setStartCondition(StartCondition startCondition) {
        this.startCondition = startCondition;
    }

    /**
     * <p>
     * The segment that defines which users are participants in the journey.
     * </p>
     * 
     * @return The segment that defines which users are participants in the journey.
     */

    public StartCondition getStartCondition() {
        return this.startCondition;
    }

    /**
     * <p>
     * The segment that defines which users are participants in the journey.
     * </p>
     * 
     * @param startCondition
     *        The segment that defines which users are participants in the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteJourneyRequest withStartCondition(StartCondition startCondition) {
        setStartCondition(startCondition);
        return this;
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     * immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove
     * activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey. To
     * cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey State</link>
     * resource.
     * </p>
     * 
     * @param state
     *        The status of the journey. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DRAFT - Saves the journey and doesn't publish it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     *        immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or
     *        remove activities from it.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey.
     *        To cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey
     *        State</link> resource.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     * immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove
     * activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey. To
     * cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey State</link>
     * resource.
     * </p>
     * 
     * @return The status of the journey. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DRAFT - Saves the journey and doesn't publish it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     *         immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or
     *         remove activities from it.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey.
     *         To cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey
     *         State</link> resource.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     * immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove
     * activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey. To
     * cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey State</link>
     * resource.
     * </p>
     * 
     * @param state
     *        The status of the journey. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DRAFT - Saves the journey and doesn't publish it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     *        immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or
     *        remove activities from it.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey.
     *        To cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey
     *        State</link> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public WriteJourneyRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the journey. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - Saves the journey and doesn't publish it.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     * immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove
     * activities from it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey. To
     * cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey State</link>
     * resource.
     * </p>
     * 
     * @param state
     *        The status of the journey. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DRAFT - Saves the journey and doesn't publish it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running
     *        immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or
     *        remove activities from it.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey.
     *        To cancel a journey, use the <link linkend="apps-application-id-journeys-journey-id-state">Journey
     *        State</link> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public WriteJourneyRequest withState(State state) {
        this.state = state.toString();
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
        if (getActivities() != null)
            sb.append("Activities: ").append(getActivities()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLimits() != null)
            sb.append("Limits: ").append(getLimits()).append(",");
        if (getLocalTime() != null)
            sb.append("LocalTime: ").append(getLocalTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQuietTime() != null)
            sb.append("QuietTime: ").append(getQuietTime()).append(",");
        if (getRefreshFrequency() != null)
            sb.append("RefreshFrequency: ").append(getRefreshFrequency()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getStartActivity() != null)
            sb.append("StartActivity: ").append(getStartActivity()).append(",");
        if (getStartCondition() != null)
            sb.append("StartCondition: ").append(getStartCondition()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteJourneyRequest == false)
            return false;
        WriteJourneyRequest other = (WriteJourneyRequest) obj;
        if (other.getActivities() == null ^ this.getActivities() == null)
            return false;
        if (other.getActivities() != null && other.getActivities().equals(this.getActivities()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getLocalTime() == null ^ this.getLocalTime() == null)
            return false;
        if (other.getLocalTime() != null && other.getLocalTime().equals(this.getLocalTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQuietTime() == null ^ this.getQuietTime() == null)
            return false;
        if (other.getQuietTime() != null && other.getQuietTime().equals(this.getQuietTime()) == false)
            return false;
        if (other.getRefreshFrequency() == null ^ this.getRefreshFrequency() == null)
            return false;
        if (other.getRefreshFrequency() != null && other.getRefreshFrequency().equals(this.getRefreshFrequency()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStartActivity() == null ^ this.getStartActivity() == null)
            return false;
        if (other.getStartActivity() != null && other.getStartActivity().equals(this.getStartActivity()) == false)
            return false;
        if (other.getStartCondition() == null ^ this.getStartCondition() == null)
            return false;
        if (other.getStartCondition() != null && other.getStartCondition().equals(this.getStartCondition()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivities() == null) ? 0 : getActivities().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getLocalTime() == null) ? 0 : getLocalTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQuietTime() == null) ? 0 : getQuietTime().hashCode());
        hashCode = prime * hashCode + ((getRefreshFrequency() == null) ? 0 : getRefreshFrequency().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStartActivity() == null) ? 0 : getStartActivity().hashCode());
        hashCode = prime * hashCode + ((getStartCondition() == null) ? 0 : getStartCondition().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public WriteJourneyRequest clone() {
        try {
            return (WriteJourneyRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WriteJourneyRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
