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
 * Provides information about the status, configuration, and other settings for a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity
     * object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
     * </p>
     */
    private java.util.Map<String, Activity> activities;
    /**
     * <p>
     * The unique identifier for the application that the journey applies to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The date, in ISO 8601 format, when the journey was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     */
    private String id;
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
     * Specifies whether the journey's scheduled start and end times use each participant's local time. If this value is
     * true, the schedule uses each participant's local time.
     * </p>
     */
    private Boolean localTime;
    /**
     * <p>
     * The name of the journey.
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
     * The unique identifier for the first activity in the journey.
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
     * The current status of the journey. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - The journey is being developed and hasn't been published yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey may
     * currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE, you can't
     * add, change, or remove activities from it.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The journey has been published and has finished running. All participants have entered the journey
     * and no participants are waiting to complete the journey or any activities in the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or remove
     * activities or segment settings from the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED - The journey has been published and has started running. It may have also passed its scheduled end time,
     * or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a journey's status is
     * CLOSED, you can't add participants to it, and no existing participants can enter the journey for the first time.
     * However, any existing participants who are currently waiting to start an activity may continue the journey.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * This object is not used or supported.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity
     * object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
     * </p>
     * 
     * @return A map that contains a set of Activity objects, one object for each activity in the journey. For each
     *         Activity object, the key is the unique identifier (string) for an activity and the value is the settings
     *         for the activity.
     */

    public java.util.Map<String, Activity> getActivities() {
        return activities;
    }

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity
     * object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
     * </p>
     * 
     * @param activities
     *        A map that contains a set of Activity objects, one object for each activity in the journey. For each
     *        Activity object, the key is the unique identifier (string) for an activity and the value is the settings
     *        for the activity.
     */

    public void setActivities(java.util.Map<String, Activity> activities) {
        this.activities = activities;
    }

    /**
     * <p>
     * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity
     * object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
     * </p>
     * 
     * @param activities
     *        A map that contains a set of Activity objects, one object for each activity in the journey. For each
     *        Activity object, the key is the unique identifier (string) for an activity and the value is the settings
     *        for the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse withActivities(java.util.Map<String, Activity> activities) {
        setActivities(activities);
        return this;
    }

    /**
     * Add a single Activities entry
     *
     * @see JourneyResponse#withActivities
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse addActivitiesEntry(String key, Activity value) {
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

    public JourneyResponse clearActivitiesEntries() {
        this.activities = null;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the application that the journey applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the journey applies to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the journey applies to.
     * </p>
     * 
     * @return The unique identifier for the application that the journey applies to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the journey applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the journey applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
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

    public JourneyResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     * 
     * @param id
     *        The unique identifier for the journey.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     * 
     * @return The unique identifier for the journey.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     * 
     * @param id
     *        The unique identifier for the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse withId(String id) {
        setId(id);
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

    public JourneyResponse withLastModifiedDate(String lastModifiedDate) {
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

    public JourneyResponse withLimits(JourneyLimits limits) {
        setLimits(limits);
        return this;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. If this value is
     * true, the schedule uses each participant's local time.
     * </p>
     * 
     * @param localTime
     *        Specifies whether the journey's scheduled start and end times use each participant's local time. If this
     *        value is true, the schedule uses each participant's local time.
     */

    public void setLocalTime(Boolean localTime) {
        this.localTime = localTime;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. If this value is
     * true, the schedule uses each participant's local time.
     * </p>
     * 
     * @return Specifies whether the journey's scheduled start and end times use each participant's local time. If this
     *         value is true, the schedule uses each participant's local time.
     */

    public Boolean getLocalTime() {
        return this.localTime;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. If this value is
     * true, the schedule uses each participant's local time.
     * </p>
     * 
     * @param localTime
     *        Specifies whether the journey's scheduled start and end times use each participant's local time. If this
     *        value is true, the schedule uses each participant's local time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse withLocalTime(Boolean localTime) {
        setLocalTime(localTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether the journey's scheduled start and end times use each participant's local time. If this value is
     * true, the schedule uses each participant's local time.
     * </p>
     * 
     * @return Specifies whether the journey's scheduled start and end times use each participant's local time. If this
     *         value is true, the schedule uses each participant's local time.
     */

    public Boolean isLocalTime() {
        return this.localTime;
    }

    /**
     * <p>
     * The name of the journey.
     * </p>
     * 
     * @param name
     *        The name of the journey.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the journey.
     * </p>
     * 
     * @return The name of the journey.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the journey.
     * </p>
     * 
     * @param name
     *        The name of the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse withName(String name) {
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

    public JourneyResponse withQuietTime(QuietTime quietTime) {
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

    public JourneyResponse withRefreshFrequency(String refreshFrequency) {
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

    public JourneyResponse withSchedule(JourneySchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey.
     * </p>
     * 
     * @param startActivity
     *        The unique identifier for the first activity in the journey.
     */

    public void setStartActivity(String startActivity) {
        this.startActivity = startActivity;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey.
     * </p>
     * 
     * @return The unique identifier for the first activity in the journey.
     */

    public String getStartActivity() {
        return this.startActivity;
    }

    /**
     * <p>
     * The unique identifier for the first activity in the journey.
     * </p>
     * 
     * @param startActivity
     *        The unique identifier for the first activity in the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse withStartActivity(String startActivity) {
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

    public JourneyResponse withStartCondition(StartCondition startCondition) {
        setStartCondition(startCondition);
        return this;
    }

    /**
     * <p>
     * The current status of the journey. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - The journey is being developed and hasn't been published yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey may
     * currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE, you can't
     * add, change, or remove activities from it.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The journey has been published and has finished running. All participants have entered the journey
     * and no participants are waiting to complete the journey or any activities in the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or remove
     * activities or segment settings from the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED - The journey has been published and has started running. It may have also passed its scheduled end time,
     * or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a journey's status is
     * CLOSED, you can't add participants to it, and no existing participants can enter the journey for the first time.
     * However, any existing participants who are currently waiting to start an activity may continue the journey.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current status of the journey. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DRAFT - The journey is being developed and hasn't been published yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey
     *        may currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE,
     *        you can't add, change, or remove activities from it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED - The journey has been published and has finished running. All participants have entered the
     *        journey and no participants are waiting to complete the journey or any activities in the journey.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or
     *        remove activities or segment settings from the journey.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CLOSED - The journey has been published and has started running. It may have also passed its scheduled end
     *        time, or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a
     *        journey's status is CLOSED, you can't add participants to it, and no existing participants can enter the
     *        journey for the first time. However, any existing participants who are currently waiting to start an
     *        activity may continue the journey.
     *        </p>
     *        </li>
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the journey. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - The journey is being developed and hasn't been published yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey may
     * currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE, you can't
     * add, change, or remove activities from it.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The journey has been published and has finished running. All participants have entered the journey
     * and no participants are waiting to complete the journey or any activities in the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or remove
     * activities or segment settings from the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED - The journey has been published and has started running. It may have also passed its scheduled end time,
     * or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a journey's status is
     * CLOSED, you can't add participants to it, and no existing participants can enter the journey for the first time.
     * However, any existing participants who are currently waiting to start an activity may continue the journey.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the journey. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DRAFT - The journey is being developed and hasn't been published yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey
     *         may currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE,
     *         you can't add, change, or remove activities from it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETED - The journey has been published and has finished running. All participants have entered the
     *         journey and no participants are waiting to complete the journey or any activities in the journey.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or
     *         remove activities or segment settings from the journey.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CLOSED - The journey has been published and has started running. It may have also passed its scheduled
     *         end time, or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a
     *         journey's status is CLOSED, you can't add participants to it, and no existing participants can enter the
     *         journey for the first time. However, any existing participants who are currently waiting to start an
     *         activity may continue the journey.
     *         </p>
     *         </li>
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current status of the journey. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - The journey is being developed and hasn't been published yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey may
     * currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE, you can't
     * add, change, or remove activities from it.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The journey has been published and has finished running. All participants have entered the journey
     * and no participants are waiting to complete the journey or any activities in the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or remove
     * activities or segment settings from the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED - The journey has been published and has started running. It may have also passed its scheduled end time,
     * or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a journey's status is
     * CLOSED, you can't add participants to it, and no existing participants can enter the journey for the first time.
     * However, any existing participants who are currently waiting to start an activity may continue the journey.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current status of the journey. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DRAFT - The journey is being developed and hasn't been published yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey
     *        may currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE,
     *        you can't add, change, or remove activities from it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED - The journey has been published and has finished running. All participants have entered the
     *        journey and no participants are waiting to complete the journey or any activities in the journey.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or
     *        remove activities or segment settings from the journey.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CLOSED - The journey has been published and has started running. It may have also passed its scheduled end
     *        time, or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a
     *        journey's status is CLOSED, you can't add participants to it, and no existing participants can enter the
     *        journey for the first time. However, any existing participants who are currently waiting to start an
     *        activity may continue the journey.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public JourneyResponse withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current status of the journey. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DRAFT - The journey is being developed and hasn't been published yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey may
     * currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE, you can't
     * add, change, or remove activities from it.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The journey has been published and has finished running. All participants have entered the journey
     * and no participants are waiting to complete the journey or any activities in the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or remove
     * activities or segment settings from the journey.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED - The journey has been published and has started running. It may have also passed its scheduled end time,
     * or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a journey's status is
     * CLOSED, you can't add participants to it, and no existing participants can enter the journey for the first time.
     * However, any existing participants who are currently waiting to start an activity may continue the journey.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current status of the journey. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DRAFT - The journey is being developed and hasn't been published yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey
     *        may currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE,
     *        you can't add, change, or remove activities from it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED - The journey has been published and has finished running. All participants have entered the
     *        journey and no participants are waiting to complete the journey or any activities in the journey.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or
     *        remove activities or segment settings from the journey.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CLOSED - The journey has been published and has started running. It may have also passed its scheduled end
     *        time, or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a
     *        journey's status is CLOSED, you can't add participants to it, and no existing participants can enter the
     *        journey for the first time. However, any existing participants who are currently waiting to start an
     *        activity may continue the journey.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public JourneyResponse withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * This object is not used or supported.
     * </p>
     * 
     * @return This object is not used or supported.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * This object is not used or supported.
     * </p>
     * 
     * @param tags
     *        This object is not used or supported.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * This object is not used or supported.
     * </p>
     * 
     * @param tags
     *        This object is not used or supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see JourneyResponse#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JourneyResponse addTagsEntry(String key, String value) {
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

    public JourneyResponse clearTagsEntries() {
        this.tags = null;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyResponse == false)
            return false;
        JourneyResponse other = (JourneyResponse) obj;
        if (other.getActivities() == null ^ this.getActivities() == null)
            return false;
        if (other.getActivities() != null && other.getActivities().equals(this.getActivities()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivities() == null) ? 0 : getActivities().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public JourneyResponse clone() {
        try {
            return (JourneyResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
