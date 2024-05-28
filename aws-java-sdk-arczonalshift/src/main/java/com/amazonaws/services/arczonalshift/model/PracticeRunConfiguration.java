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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've specified for a
 * practice run, as well as any blocked dates or blocked windows for the practice run.
 * </p>
 * <p>
 * You can update or delete a practice run configuration. Before you delete a practice run configuration, you must
 * disable zonal autoshift for the resource. A practice run configuration is required when zonal autoshift is enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/PracticeRunConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PracticeRunConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of one or more dates that you can specify when Amazon Web Services does not start practice runs for a
     * resource.
     * </p>
     * <p>
     * Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
     * </p>
     */
    private java.util.List<String> blockedDates;
    /**
     * <p>
     * An array of one or more windows of days and times that you can block Route 53 ARC from starting practice runs for
     * a resource.
     * </p>
     * <p>
     * Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by spaces. For
     * example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
     * </p>
     */
    private java.util.List<String> blockedWindows;
    /**
     * <p>
     * The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks practice runs
     * when the alarm is in an <code>ALARM</code> state.
     * </p>
     */
    private java.util.List<ControlCondition> blockingAlarms;
    /**
     * <p>
     * The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the alarm
     * is in an <code>ALARM</code> state.
     * </p>
     */
    private java.util.List<ControlCondition> outcomeAlarms;

    /**
     * <p>
     * An array of one or more dates that you can specify when Amazon Web Services does not start practice runs for a
     * resource.
     * </p>
     * <p>
     * Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
     * </p>
     * 
     * @return An array of one or more dates that you can specify when Amazon Web Services does not start practice runs
     *         for a resource.</p>
     *         <p>
     *         Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
     */

    public java.util.List<String> getBlockedDates() {
        return blockedDates;
    }

    /**
     * <p>
     * An array of one or more dates that you can specify when Amazon Web Services does not start practice runs for a
     * resource.
     * </p>
     * <p>
     * Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
     * </p>
     * 
     * @param blockedDates
     *        An array of one or more dates that you can specify when Amazon Web Services does not start practice runs
     *        for a resource.</p>
     *        <p>
     *        Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
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
     * An array of one or more dates that you can specify when Amazon Web Services does not start practice runs for a
     * resource.
     * </p>
     * <p>
     * Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedDates(java.util.Collection)} or {@link #withBlockedDates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blockedDates
     *        An array of one or more dates that you can specify when Amazon Web Services does not start practice runs
     *        for a resource.</p>
     *        <p>
     *        Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PracticeRunConfiguration withBlockedDates(String... blockedDates) {
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
     * An array of one or more dates that you can specify when Amazon Web Services does not start practice runs for a
     * resource.
     * </p>
     * <p>
     * Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
     * </p>
     * 
     * @param blockedDates
     *        An array of one or more dates that you can specify when Amazon Web Services does not start practice runs
     *        for a resource.</p>
     *        <p>
     *        Specify blocked dates, in UTC, in the format <code>YYYY-MM-DD</code>, separated by spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PracticeRunConfiguration withBlockedDates(java.util.Collection<String> blockedDates) {
        setBlockedDates(blockedDates);
        return this;
    }

    /**
     * <p>
     * An array of one or more windows of days and times that you can block Route 53 ARC from starting practice runs for
     * a resource.
     * </p>
     * <p>
     * Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by spaces. For
     * example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
     * </p>
     * 
     * @return An array of one or more windows of days and times that you can block Route 53 ARC from starting practice
     *         runs for a resource.</p>
     *         <p>
     *         Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by
     *         spaces. For example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
     */

    public java.util.List<String> getBlockedWindows() {
        return blockedWindows;
    }

    /**
     * <p>
     * An array of one or more windows of days and times that you can block Route 53 ARC from starting practice runs for
     * a resource.
     * </p>
     * <p>
     * Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by spaces. For
     * example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
     * </p>
     * 
     * @param blockedWindows
     *        An array of one or more windows of days and times that you can block Route 53 ARC from starting practice
     *        runs for a resource.</p>
     *        <p>
     *        Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by
     *        spaces. For example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
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
     * An array of one or more windows of days and times that you can block Route 53 ARC from starting practice runs for
     * a resource.
     * </p>
     * <p>
     * Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by spaces. For
     * example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedWindows(java.util.Collection)} or {@link #withBlockedWindows(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param blockedWindows
     *        An array of one or more windows of days and times that you can block Route 53 ARC from starting practice
     *        runs for a resource.</p>
     *        <p>
     *        Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by
     *        spaces. For example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PracticeRunConfiguration withBlockedWindows(String... blockedWindows) {
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
     * An array of one or more windows of days and times that you can block Route 53 ARC from starting practice runs for
     * a resource.
     * </p>
     * <p>
     * Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by spaces. For
     * example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
     * </p>
     * 
     * @param blockedWindows
     *        An array of one or more windows of days and times that you can block Route 53 ARC from starting practice
     *        runs for a resource.</p>
     *        <p>
     *        Specify the blocked windows in UTC, using the format <code>DAY:HH:MM-DAY:HH:MM</code>, separated by
     *        spaces. For example, <code>MON:18:30-MON:19:30 TUE:18:30-TUE:19:30</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PracticeRunConfiguration withBlockedWindows(java.util.Collection<String> blockedWindows) {
        setBlockedWindows(blockedWindows);
        return this;
    }

    /**
     * <p>
     * The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks practice runs
     * when the alarm is in an <code>ALARM</code> state.
     * </p>
     * 
     * @return The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks
     *         practice runs when the alarm is in an <code>ALARM</code> state.
     */

    public java.util.List<ControlCondition> getBlockingAlarms() {
        return blockingAlarms;
    }

    /**
     * <p>
     * The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks practice runs
     * when the alarm is in an <code>ALARM</code> state.
     * </p>
     * 
     * @param blockingAlarms
     *        The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks practice
     *        runs when the alarm is in an <code>ALARM</code> state.
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
     * The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks practice runs
     * when the alarm is in an <code>ALARM</code> state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockingAlarms(java.util.Collection)} or {@link #withBlockingAlarms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param blockingAlarms
     *        The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks practice
     *        runs when the alarm is in an <code>ALARM</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PracticeRunConfiguration withBlockingAlarms(ControlCondition... blockingAlarms) {
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
     * The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks practice runs
     * when the alarm is in an <code>ALARM</code> state.
     * </p>
     * 
     * @param blockingAlarms
     *        The <i>blocking alarm</i> for practice runs is an optional alarm that you can specify that blocks practice
     *        runs when the alarm is in an <code>ALARM</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PracticeRunConfiguration withBlockingAlarms(java.util.Collection<ControlCondition> blockingAlarms) {
        setBlockingAlarms(blockingAlarms);
        return this;
    }

    /**
     * <p>
     * The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the alarm
     * is in an <code>ALARM</code> state.
     * </p>
     * 
     * @return The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the
     *         alarm is in an <code>ALARM</code> state.
     */

    public java.util.List<ControlCondition> getOutcomeAlarms() {
        return outcomeAlarms;
    }

    /**
     * <p>
     * The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the alarm
     * is in an <code>ALARM</code> state.
     * </p>
     * 
     * @param outcomeAlarms
     *        The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the
     *        alarm is in an <code>ALARM</code> state.
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
     * The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the alarm
     * is in an <code>ALARM</code> state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomeAlarms(java.util.Collection)} or {@link #withOutcomeAlarms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outcomeAlarms
     *        The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the
     *        alarm is in an <code>ALARM</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PracticeRunConfiguration withOutcomeAlarms(ControlCondition... outcomeAlarms) {
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
     * The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the alarm
     * is in an <code>ALARM</code> state.
     * </p>
     * 
     * @param outcomeAlarms
     *        The <i>outcome alarm</i> for practice runs is an alarm that you specify that ends a practice run when the
     *        alarm is in an <code>ALARM</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PracticeRunConfiguration withOutcomeAlarms(java.util.Collection<ControlCondition> outcomeAlarms) {
        setOutcomeAlarms(outcomeAlarms);
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
            sb.append("OutcomeAlarms: ").append(getOutcomeAlarms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PracticeRunConfiguration == false)
            return false;
        PracticeRunConfiguration other = (PracticeRunConfiguration) obj;
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
        return hashCode;
    }

    @Override
    public PracticeRunConfiguration clone() {
        try {
            return (PracticeRunConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.arczonalshift.model.transform.PracticeRunConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
