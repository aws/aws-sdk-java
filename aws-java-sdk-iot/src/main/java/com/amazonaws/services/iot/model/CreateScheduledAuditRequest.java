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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScheduledAuditRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual
     * start time of each audit is determined by the system.
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is
     * required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not
     * have that many days, the audit takes place on the "LAST" day of the month.
     * </p>
     */
    private String dayOfMonth;
    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU",
     * "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     */
    private String dayOfWeek;
    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     */
    private java.util.List<String> targetCheckNames;
    /**
     * <p>
     * Metadata which can be used to manage the scheduled audit.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The name you want to give to the scheduled audit. (Max. 128 chars)
     * </p>
     */
    private String scheduledAuditName;

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual
     * start time of each audit is determined by the system.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The
     *        actual start time of each audit is determined by the system.
     * @see AuditFrequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual
     * start time of each audit is determined by the system.
     * </p>
     * 
     * @return How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The
     *         actual start time of each audit is determined by the system.
     * @see AuditFrequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual
     * start time of each audit is determined by the system.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The
     *        actual start time of each audit is determined by the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditFrequency
     */

    public CreateScheduledAuditRequest withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual
     * start time of each audit is determined by the system.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The
     *        actual start time of each audit is determined by the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditFrequency
     */

    public CreateScheduledAuditRequest withFrequency(AuditFrequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is
     * required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not
     * have that many days, the audit takes place on the "LAST" day of the month.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This
     *        field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the
     *        month does not have that many days, the audit takes place on the "LAST" day of the month.
     */

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is
     * required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not
     * have that many days, the audit takes place on the "LAST" day of the month.
     * </p>
     * 
     * @return The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This
     *         field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the
     *         month does not have that many days, the audit takes place on the "LAST" day of the month.
     */

    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is
     * required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not
     * have that many days, the audit takes place on the "LAST" day of the month.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This
     *        field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the
     *        month does not have that many days, the audit takes place on the "LAST" day of the month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledAuditRequest withDayOfMonth(String dayOfMonth) {
        setDayOfMonth(dayOfMonth);
        return this;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU",
     * "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED",
     *        "THU", "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or
     *        "BIWEEKLY".
     * @see DayOfWeek
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU",
     * "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * 
     * @return The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED",
     *         "THU", "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or
     *         "BIWEEKLY".
     * @see DayOfWeek
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU",
     * "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED",
     *        "THU", "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or
     *        "BIWEEKLY".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public CreateScheduledAuditRequest withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU",
     * "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED",
     *        "THU", "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or
     *        "BIWEEKLY".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public CreateScheduledAuditRequest withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     * 
     * @return Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     *         <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are
     *         enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     */

    public java.util.List<String> getTargetCheckNames() {
        return targetCheckNames;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     *        <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are
     *        enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     */

    public void setTargetCheckNames(java.util.Collection<String> targetCheckNames) {
        if (targetCheckNames == null) {
            this.targetCheckNames = null;
            return;
        }

        this.targetCheckNames = new java.util.ArrayList<String>(targetCheckNames);
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetCheckNames(java.util.Collection)} or {@link #withTargetCheckNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     *        <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are
     *        enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledAuditRequest withTargetCheckNames(String... targetCheckNames) {
        if (this.targetCheckNames == null) {
            setTargetCheckNames(new java.util.ArrayList<String>(targetCheckNames.length));
        }
        for (String ele : targetCheckNames) {
            this.targetCheckNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use
     *        <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are
     *        enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledAuditRequest withTargetCheckNames(java.util.Collection<String> targetCheckNames) {
        setTargetCheckNames(targetCheckNames);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the scheduled audit.
     * </p>
     * 
     * @return Metadata which can be used to manage the scheduled audit.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the scheduled audit.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the scheduled audit.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the scheduled audit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the scheduled audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledAuditRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the scheduled audit.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the scheduled audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledAuditRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name you want to give to the scheduled audit. (Max. 128 chars)
     * </p>
     * 
     * @param scheduledAuditName
     *        The name you want to give to the scheduled audit. (Max. 128 chars)
     */

    public void setScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
    }

    /**
     * <p>
     * The name you want to give to the scheduled audit. (Max. 128 chars)
     * </p>
     * 
     * @return The name you want to give to the scheduled audit. (Max. 128 chars)
     */

    public String getScheduledAuditName() {
        return this.scheduledAuditName;
    }

    /**
     * <p>
     * The name you want to give to the scheduled audit. (Max. 128 chars)
     * </p>
     * 
     * @param scheduledAuditName
     *        The name you want to give to the scheduled audit. (Max. 128 chars)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledAuditRequest withScheduledAuditName(String scheduledAuditName) {
        setScheduledAuditName(scheduledAuditName);
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
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth()).append(",");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek()).append(",");
        if (getTargetCheckNames() != null)
            sb.append("TargetCheckNames: ").append(getTargetCheckNames()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getScheduledAuditName() != null)
            sb.append("ScheduledAuditName: ").append(getScheduledAuditName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScheduledAuditRequest == false)
            return false;
        CreateScheduledAuditRequest other = (CreateScheduledAuditRequest) obj;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getTargetCheckNames() == null ^ this.getTargetCheckNames() == null)
            return false;
        if (other.getTargetCheckNames() != null && other.getTargetCheckNames().equals(this.getTargetCheckNames()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getScheduledAuditName() == null ^ this.getScheduledAuditName() == null)
            return false;
        if (other.getScheduledAuditName() != null && other.getScheduledAuditName().equals(this.getScheduledAuditName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getTargetCheckNames() == null) ? 0 : getTargetCheckNames().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getScheduledAuditName() == null) ? 0 : getScheduledAuditName().hashCode());
        return hashCode;
    }

    @Override
    public CreateScheduledAuditRequest clone() {
        return (CreateScheduledAuditRequest) super.clone();
    }

}
