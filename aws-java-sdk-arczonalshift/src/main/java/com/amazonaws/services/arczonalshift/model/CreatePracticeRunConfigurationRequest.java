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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CreatePracticeRunConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePracticeRunConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar dates.
     * </p>
     * <p>
     * The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times for
     * practice runs are in UTC. Separate multiple blocked dates with spaces.
     * </p>
     * <p>
     * For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want practice
     * runs to shift traffic away at that time, you could set a blocked date for <code>2024-05-01</code>.
     * </p>
     */
    private java.util.List<String> blockedDates;
    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and times.
     * </p>
     * <p>
     * The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates and
     * times for practice runs are in UTC. Also, be aware of potential time adjustments that might be required for
     * daylight saving time differences. Separate multiple blocked windows with spaces.
     * </p>
     * <p>
     * For example, say you run business report summaries three days a week. For this scenario, you might set the
     * following recurring days and times as blocked windows, for example:
     * <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     * </p>
     */
    private java.util.List<String> blockedWindows;
    /**
     * <p>
     * An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks Route 53 ARC
     * from starting practice run zonal shifts, and ends a practice run that's in progress, when the alarm is in an
     * <code>ALARM</code> state.
     * </p>
     */
    private java.util.List<ControlCondition> blockingAlarms;
    /**
     * <p>
     * The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that ends a
     * practice run when the alarm is in an <code>ALARM</code> state.
     * </p>
     * <p>
     * Configure the alarm to monitor the health of your application when traffic is shifted away from an Availability
     * Zone during each weekly practice run. You should configure the alarm to go into an <code>ALARM</code> state if
     * your application is impacted by the zonal shift, and you want to stop the zonal shift, to let traffic for the
     * resource return to the Availability Zone.
     * </p>
     */
    private java.util.List<ControlCondition> outcomeAlarms;
    /**
     * <p>
     * The identifier of the resource to shift away traffic for when a practice run starts a zonal shift. The identifier
     * is the Amazon Resource Name (ARN) for the resource.
     * </p>
     * <p>
     * At this time, supported resources are Network Load Balancers and Application Load Balancers with cross-zone load
     * balancing turned off.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar dates.
     * </p>
     * <p>
     * The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times for
     * practice runs are in UTC. Separate multiple blocked dates with spaces.
     * </p>
     * <p>
     * For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want practice
     * runs to shift traffic away at that time, you could set a blocked date for <code>2024-05-01</code>.
     * </p>
     * 
     * @return Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar
     *         dates.</p>
     *         <p>
     *         The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times
     *         for practice runs are in UTC. Separate multiple blocked dates with spaces.
     *         </p>
     *         <p>
     *         For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want
     *         practice runs to shift traffic away at that time, you could set a blocked date for
     *         <code>2024-05-01</code>.
     */

    public java.util.List<String> getBlockedDates() {
        return blockedDates;
    }

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar dates.
     * </p>
     * <p>
     * The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times for
     * practice runs are in UTC. Separate multiple blocked dates with spaces.
     * </p>
     * <p>
     * For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want practice
     * runs to shift traffic away at that time, you could set a blocked date for <code>2024-05-01</code>.
     * </p>
     * 
     * @param blockedDates
     *        Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar
     *        dates.</p>
     *        <p>
     *        The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times
     *        for practice runs are in UTC. Separate multiple blocked dates with spaces.
     *        </p>
     *        <p>
     *        For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want
     *        practice runs to shift traffic away at that time, you could set a blocked date for <code>2024-05-01</code>.
     */

    public void setBlockedDates(java.util.Collection<String> blockedDates) {
        if (blockedDates == null) {
            this.blockedDates = null;
            return;
        }

        this.blockedDates = new java.util.ArrayList<String>(blockedDates);
    }

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar dates.
     * </p>
     * <p>
     * The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times for
     * practice runs are in UTC. Separate multiple blocked dates with spaces.
     * </p>
     * <p>
     * For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want practice
     * runs to shift traffic away at that time, you could set a blocked date for <code>2024-05-01</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedDates(java.util.Collection)} or {@link #withBlockedDates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blockedDates
     *        Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar
     *        dates.</p>
     *        <p>
     *        The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times
     *        for practice runs are in UTC. Separate multiple blocked dates with spaces.
     *        </p>
     *        <p>
     *        For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want
     *        practice runs to shift traffic away at that time, you could set a blocked date for <code>2024-05-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withBlockedDates(String... blockedDates) {
        if (this.blockedDates == null) {
            setBlockedDates(new java.util.ArrayList<String>(blockedDates.length));
        }
        for (String ele : blockedDates) {
            this.blockedDates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar dates.
     * </p>
     * <p>
     * The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times for
     * practice runs are in UTC. Separate multiple blocked dates with spaces.
     * </p>
     * <p>
     * For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want practice
     * runs to shift traffic away at that time, you could set a blocked date for <code>2024-05-01</code>.
     * </p>
     * 
     * @param blockedDates
     *        Optionally, you can block Route 53 ARC from starting practice runs for a resource on specific calendar
     *        dates.</p>
     *        <p>
     *        The format for blocked dates is: YYYY-MM-DD. Keep in mind, when you specify dates, that dates and times
     *        for practice runs are in UTC. Separate multiple blocked dates with spaces.
     *        </p>
     *        <p>
     *        For example, if you have an application update scheduled to launch on May 1, 2024, and you don't want
     *        practice runs to shift traffic away at that time, you could set a blocked date for <code>2024-05-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withBlockedDates(java.util.Collection<String> blockedDates) {
        setBlockedDates(blockedDates);
        return this;
    }

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and times.
     * </p>
     * <p>
     * The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates and
     * times for practice runs are in UTC. Also, be aware of potential time adjustments that might be required for
     * daylight saving time differences. Separate multiple blocked windows with spaces.
     * </p>
     * <p>
     * For example, say you run business report summaries three days a week. For this scenario, you might set the
     * following recurring days and times as blocked windows, for example:
     * <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     * </p>
     * 
     * @return Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and
     *         times. </p>
     *         <p>
     *         The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates
     *         and times for practice runs are in UTC. Also, be aware of potential time adjustments that might be
     *         required for daylight saving time differences. Separate multiple blocked windows with spaces.
     *         </p>
     *         <p>
     *         For example, say you run business report summaries three days a week. For this scenario, you might set
     *         the following recurring days and times as blocked windows, for example:
     *         <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     */

    public java.util.List<String> getBlockedWindows() {
        return blockedWindows;
    }

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and times.
     * </p>
     * <p>
     * The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates and
     * times for practice runs are in UTC. Also, be aware of potential time adjustments that might be required for
     * daylight saving time differences. Separate multiple blocked windows with spaces.
     * </p>
     * <p>
     * For example, say you run business report summaries three days a week. For this scenario, you might set the
     * following recurring days and times as blocked windows, for example:
     * <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     * </p>
     * 
     * @param blockedWindows
     *        Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and times.
     *        </p>
     *        <p>
     *        The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates
     *        and times for practice runs are in UTC. Also, be aware of potential time adjustments that might be
     *        required for daylight saving time differences. Separate multiple blocked windows with spaces.
     *        </p>
     *        <p>
     *        For example, say you run business report summaries three days a week. For this scenario, you might set the
     *        following recurring days and times as blocked windows, for example:
     *        <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     */

    public void setBlockedWindows(java.util.Collection<String> blockedWindows) {
        if (blockedWindows == null) {
            this.blockedWindows = null;
            return;
        }

        this.blockedWindows = new java.util.ArrayList<String>(blockedWindows);
    }

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and times.
     * </p>
     * <p>
     * The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates and
     * times for practice runs are in UTC. Also, be aware of potential time adjustments that might be required for
     * daylight saving time differences. Separate multiple blocked windows with spaces.
     * </p>
     * <p>
     * For example, say you run business report summaries three days a week. For this scenario, you might set the
     * following recurring days and times as blocked windows, for example:
     * <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedWindows(java.util.Collection)} or {@link #withBlockedWindows(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param blockedWindows
     *        Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and times.
     *        </p>
     *        <p>
     *        The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates
     *        and times for practice runs are in UTC. Also, be aware of potential time adjustments that might be
     *        required for daylight saving time differences. Separate multiple blocked windows with spaces.
     *        </p>
     *        <p>
     *        For example, say you run business report summaries three days a week. For this scenario, you might set the
     *        following recurring days and times as blocked windows, for example:
     *        <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withBlockedWindows(String... blockedWindows) {
        if (this.blockedWindows == null) {
            setBlockedWindows(new java.util.ArrayList<String>(blockedWindows.length));
        }
        for (String ele : blockedWindows) {
            this.blockedWindows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and times.
     * </p>
     * <p>
     * The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates and
     * times for practice runs are in UTC. Also, be aware of potential time adjustments that might be required for
     * daylight saving time differences. Separate multiple blocked windows with spaces.
     * </p>
     * <p>
     * For example, say you run business report summaries three days a week. For this scenario, you might set the
     * following recurring days and times as blocked windows, for example:
     * <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     * </p>
     * 
     * @param blockedWindows
     *        Optionally, you can block Route 53 ARC from starting practice runs for specific windows of days and times.
     *        </p>
     *        <p>
     *        The format for blocked windows is: DAY:HH:SS-DAY:HH:SS. Keep in mind, when you specify dates, that dates
     *        and times for practice runs are in UTC. Also, be aware of potential time adjustments that might be
     *        required for daylight saving time differences. Separate multiple blocked windows with spaces.
     *        </p>
     *        <p>
     *        For example, say you run business report summaries three days a week. For this scenario, you might set the
     *        following recurring days and times as blocked windows, for example:
     *        <code>MON-20:30-21:30 WED-20:30-21:30 FRI-20:30-21:30</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withBlockedWindows(java.util.Collection<String> blockedWindows) {
        setBlockedWindows(blockedWindows);
        return this;
    }

    /**
     * <p>
     * An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks Route 53 ARC
     * from starting practice run zonal shifts, and ends a practice run that's in progress, when the alarm is in an
     * <code>ALARM</code> state.
     * </p>
     * 
     * @return An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks
     *         Route 53 ARC from starting practice run zonal shifts, and ends a practice run that's in progress, when
     *         the alarm is in an <code>ALARM</code> state.
     */

    public java.util.List<ControlCondition> getBlockingAlarms() {
        return blockingAlarms;
    }

    /**
     * <p>
     * An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks Route 53 ARC
     * from starting practice run zonal shifts, and ends a practice run that's in progress, when the alarm is in an
     * <code>ALARM</code> state.
     * </p>
     * 
     * @param blockingAlarms
     *        An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks Route
     *        53 ARC from starting practice run zonal shifts, and ends a practice run that's in progress, when the alarm
     *        is in an <code>ALARM</code> state.
     */

    public void setBlockingAlarms(java.util.Collection<ControlCondition> blockingAlarms) {
        if (blockingAlarms == null) {
            this.blockingAlarms = null;
            return;
        }

        this.blockingAlarms = new java.util.ArrayList<ControlCondition>(blockingAlarms);
    }

    /**
     * <p>
     * An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks Route 53 ARC
     * from starting practice run zonal shifts, and ends a practice run that's in progress, when the alarm is in an
     * <code>ALARM</code> state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockingAlarms(java.util.Collection)} or {@link #withBlockingAlarms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param blockingAlarms
     *        An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks Route
     *        53 ARC from starting practice run zonal shifts, and ends a practice run that's in progress, when the alarm
     *        is in an <code>ALARM</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withBlockingAlarms(ControlCondition... blockingAlarms) {
        if (this.blockingAlarms == null) {
            setBlockingAlarms(new java.util.ArrayList<ControlCondition>(blockingAlarms.length));
        }
        for (ControlCondition ele : blockingAlarms) {
            this.blockingAlarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks Route 53 ARC
     * from starting practice run zonal shifts, and ends a practice run that's in progress, when the alarm is in an
     * <code>ALARM</code> state.
     * </p>
     * 
     * @param blockingAlarms
     *        An Amazon CloudWatch alarm that you can specify for zonal autoshift practice runs. This alarm blocks Route
     *        53 ARC from starting practice run zonal shifts, and ends a practice run that's in progress, when the alarm
     *        is in an <code>ALARM</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withBlockingAlarms(java.util.Collection<ControlCondition> blockingAlarms) {
        setBlockingAlarms(blockingAlarms);
        return this;
    }

    /**
     * <p>
     * The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that ends a
     * practice run when the alarm is in an <code>ALARM</code> state.
     * </p>
     * <p>
     * Configure the alarm to monitor the health of your application when traffic is shifted away from an Availability
     * Zone during each weekly practice run. You should configure the alarm to go into an <code>ALARM</code> state if
     * your application is impacted by the zonal shift, and you want to stop the zonal shift, to let traffic for the
     * resource return to the Availability Zone.
     * </p>
     * 
     * @return The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that
     *         ends a practice run when the alarm is in an <code>ALARM</code> state.</p>
     *         <p>
     *         Configure the alarm to monitor the health of your application when traffic is shifted away from an
     *         Availability Zone during each weekly practice run. You should configure the alarm to go into an
     *         <code>ALARM</code> state if your application is impacted by the zonal shift, and you want to stop the
     *         zonal shift, to let traffic for the resource return to the Availability Zone.
     */

    public java.util.List<ControlCondition> getOutcomeAlarms() {
        return outcomeAlarms;
    }

    /**
     * <p>
     * The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that ends a
     * practice run when the alarm is in an <code>ALARM</code> state.
     * </p>
     * <p>
     * Configure the alarm to monitor the health of your application when traffic is shifted away from an Availability
     * Zone during each weekly practice run. You should configure the alarm to go into an <code>ALARM</code> state if
     * your application is impacted by the zonal shift, and you want to stop the zonal shift, to let traffic for the
     * resource return to the Availability Zone.
     * </p>
     * 
     * @param outcomeAlarms
     *        The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that
     *        ends a practice run when the alarm is in an <code>ALARM</code> state.</p>
     *        <p>
     *        Configure the alarm to monitor the health of your application when traffic is shifted away from an
     *        Availability Zone during each weekly practice run. You should configure the alarm to go into an
     *        <code>ALARM</code> state if your application is impacted by the zonal shift, and you want to stop the
     *        zonal shift, to let traffic for the resource return to the Availability Zone.
     */

    public void setOutcomeAlarms(java.util.Collection<ControlCondition> outcomeAlarms) {
        if (outcomeAlarms == null) {
            this.outcomeAlarms = null;
            return;
        }

        this.outcomeAlarms = new java.util.ArrayList<ControlCondition>(outcomeAlarms);
    }

    /**
     * <p>
     * The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that ends a
     * practice run when the alarm is in an <code>ALARM</code> state.
     * </p>
     * <p>
     * Configure the alarm to monitor the health of your application when traffic is shifted away from an Availability
     * Zone during each weekly practice run. You should configure the alarm to go into an <code>ALARM</code> state if
     * your application is impacted by the zonal shift, and you want to stop the zonal shift, to let traffic for the
     * resource return to the Availability Zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomeAlarms(java.util.Collection)} or {@link #withOutcomeAlarms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outcomeAlarms
     *        The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that
     *        ends a practice run when the alarm is in an <code>ALARM</code> state.</p>
     *        <p>
     *        Configure the alarm to monitor the health of your application when traffic is shifted away from an
     *        Availability Zone during each weekly practice run. You should configure the alarm to go into an
     *        <code>ALARM</code> state if your application is impacted by the zonal shift, and you want to stop the
     *        zonal shift, to let traffic for the resource return to the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withOutcomeAlarms(ControlCondition... outcomeAlarms) {
        if (this.outcomeAlarms == null) {
            setOutcomeAlarms(new java.util.ArrayList<ControlCondition>(outcomeAlarms.length));
        }
        for (ControlCondition ele : outcomeAlarms) {
            this.outcomeAlarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that ends a
     * practice run when the alarm is in an <code>ALARM</code> state.
     * </p>
     * <p>
     * Configure the alarm to monitor the health of your application when traffic is shifted away from an Availability
     * Zone during each weekly practice run. You should configure the alarm to go into an <code>ALARM</code> state if
     * your application is impacted by the zonal shift, and you want to stop the zonal shift, to let traffic for the
     * resource return to the Availability Zone.
     * </p>
     * 
     * @param outcomeAlarms
     *        The <i>outcome alarm</i> for practice runs is a required Amazon CloudWatch alarm that you specify that
     *        ends a practice run when the alarm is in an <code>ALARM</code> state.</p>
     *        <p>
     *        Configure the alarm to monitor the health of your application when traffic is shifted away from an
     *        Availability Zone during each weekly practice run. You should configure the alarm to go into an
     *        <code>ALARM</code> state if your application is impacted by the zonal shift, and you want to stop the
     *        zonal shift, to let traffic for the resource return to the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withOutcomeAlarms(java.util.Collection<ControlCondition> outcomeAlarms) {
        setOutcomeAlarms(outcomeAlarms);
        return this;
    }

    /**
     * <p>
     * The identifier of the resource to shift away traffic for when a practice run starts a zonal shift. The identifier
     * is the Amazon Resource Name (ARN) for the resource.
     * </p>
     * <p>
     * At this time, supported resources are Network Load Balancers and Application Load Balancers with cross-zone load
     * balancing turned off.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier of the resource to shift away traffic for when a practice run starts a zonal shift. The
     *        identifier is the Amazon Resource Name (ARN) for the resource.</p>
     *        <p>
     *        At this time, supported resources are Network Load Balancers and Application Load Balancers with
     *        cross-zone load balancing turned off.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the resource to shift away traffic for when a practice run starts a zonal shift. The identifier
     * is the Amazon Resource Name (ARN) for the resource.
     * </p>
     * <p>
     * At this time, supported resources are Network Load Balancers and Application Load Balancers with cross-zone load
     * balancing turned off.
     * </p>
     * 
     * @return The identifier of the resource to shift away traffic for when a practice run starts a zonal shift. The
     *         identifier is the Amazon Resource Name (ARN) for the resource.</p>
     *         <p>
     *         At this time, supported resources are Network Load Balancers and Application Load Balancers with
     *         cross-zone load balancing turned off.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the resource to shift away traffic for when a practice run starts a zonal shift. The identifier
     * is the Amazon Resource Name (ARN) for the resource.
     * </p>
     * <p>
     * At this time, supported resources are Network Load Balancers and Application Load Balancers with cross-zone load
     * balancing turned off.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier of the resource to shift away traffic for when a practice run starts a zonal shift. The
     *        identifier is the Amazon Resource Name (ARN) for the resource.</p>
     *        <p>
     *        At this time, supported resources are Network Load Balancers and Application Load Balancers with
     *        cross-zone load balancing turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getBlockedDates() != null)
            sb.append("BlockedDates: ").append(getBlockedDates()).append(",");
        if (getBlockedWindows() != null)
            sb.append("BlockedWindows: ").append(getBlockedWindows()).append(",");
        if (getBlockingAlarms() != null)
            sb.append("BlockingAlarms: ").append(getBlockingAlarms()).append(",");
        if (getOutcomeAlarms() != null)
            sb.append("OutcomeAlarms: ").append(getOutcomeAlarms()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePracticeRunConfigurationRequest == false)
            return false;
        CreatePracticeRunConfigurationRequest other = (CreatePracticeRunConfigurationRequest) obj;
        if (other.getBlockedDates() == null ^ this.getBlockedDates() == null)
            return false;
        if (other.getBlockedDates() != null && other.getBlockedDates().equals(this.getBlockedDates()) == false)
            return false;
        if (other.getBlockedWindows() == null ^ this.getBlockedWindows() == null)
            return false;
        if (other.getBlockedWindows() != null && other.getBlockedWindows().equals(this.getBlockedWindows()) == false)
            return false;
        if (other.getBlockingAlarms() == null ^ this.getBlockingAlarms() == null)
            return false;
        if (other.getBlockingAlarms() != null && other.getBlockingAlarms().equals(this.getBlockingAlarms()) == false)
            return false;
        if (other.getOutcomeAlarms() == null ^ this.getOutcomeAlarms() == null)
            return false;
        if (other.getOutcomeAlarms() != null && other.getOutcomeAlarms().equals(this.getOutcomeAlarms()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockedDates() == null) ? 0 : getBlockedDates().hashCode());
        hashCode = prime * hashCode + ((getBlockedWindows() == null) ? 0 : getBlockedWindows().hashCode());
        hashCode = prime * hashCode + ((getBlockingAlarms() == null) ? 0 : getBlockingAlarms().hashCode());
        hashCode = prime * hashCode + ((getOutcomeAlarms() == null) ? 0 : getOutcomeAlarms().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreatePracticeRunConfigurationRequest clone() {
        return (CreatePracticeRunConfigurationRequest) super.clone();
    }

}
