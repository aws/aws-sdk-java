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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the scheduled audit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledAuditMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the scheduled audit.
     * </p>
     */
    private String scheduledAuditName;
    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     */
    private String scheduledAuditArn;
    /**
     * <p>
     * How often the scheduled audit takes place.
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * The day of the month on which the scheduled audit is run (if the <code>frequency</code> is "MONTHLY"). If days
     * 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the
     * month.
     * </p>
     */
    private String dayOfMonth;
    /**
     * <p>
     * The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     * "BIWEEKLY").
     * </p>
     */
    private String dayOfWeek;

    /**
     * <p>
     * The name of the scheduled audit.
     * </p>
     * 
     * @param scheduledAuditName
     *        The name of the scheduled audit.
     */

    public void setScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit.
     * </p>
     * 
     * @return The name of the scheduled audit.
     */

    public String getScheduledAuditName() {
        return this.scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit.
     * </p>
     * 
     * @param scheduledAuditName
     *        The name of the scheduled audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAuditMetadata withScheduledAuditName(String scheduledAuditName) {
        setScheduledAuditName(scheduledAuditName);
        return this;
    }

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     * 
     * @param scheduledAuditArn
     *        The ARN of the scheduled audit.
     */

    public void setScheduledAuditArn(String scheduledAuditArn) {
        this.scheduledAuditArn = scheduledAuditArn;
    }

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     * 
     * @return The ARN of the scheduled audit.
     */

    public String getScheduledAuditArn() {
        return this.scheduledAuditArn;
    }

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     * 
     * @param scheduledAuditArn
     *        The ARN of the scheduled audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAuditMetadata withScheduledAuditArn(String scheduledAuditArn) {
        setScheduledAuditArn(scheduledAuditArn);
        return this;
    }

    /**
     * <p>
     * How often the scheduled audit takes place.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place.
     * @see AuditFrequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * How often the scheduled audit takes place.
     * </p>
     * 
     * @return How often the scheduled audit takes place.
     * @see AuditFrequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * How often the scheduled audit takes place.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditFrequency
     */

    public ScheduledAuditMetadata withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * How often the scheduled audit takes place.
     * </p>
     * 
     * @param frequency
     *        How often the scheduled audit takes place.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditFrequency
     */

    public ScheduledAuditMetadata withFrequency(AuditFrequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit is run (if the <code>frequency</code> is "MONTHLY"). If days
     * 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the
     * month.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month on which the scheduled audit is run (if the <code>frequency</code> is "MONTHLY"). If
     *        days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST"
     *        day of the month.
     */

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit is run (if the <code>frequency</code> is "MONTHLY"). If days
     * 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the
     * month.
     * </p>
     * 
     * @return The day of the month on which the scheduled audit is run (if the <code>frequency</code> is "MONTHLY"). If
     *         days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST"
     *         day of the month.
     */

    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit is run (if the <code>frequency</code> is "MONTHLY"). If days
     * 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the
     * month.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month on which the scheduled audit is run (if the <code>frequency</code> is "MONTHLY"). If
     *        days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST"
     *        day of the month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledAuditMetadata withDayOfMonth(String dayOfMonth) {
        setDayOfMonth(dayOfMonth);
        return this;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     * "BIWEEKLY").
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     *        "BIWEEKLY").
     * @see DayOfWeek
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     * "BIWEEKLY").
     * </p>
     * 
     * @return The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     *         "BIWEEKLY").
     * @see DayOfWeek
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     * "BIWEEKLY").
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     *        "BIWEEKLY").
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public ScheduledAuditMetadata withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     * "BIWEEKLY").
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the scheduled audit is run (if the <code>frequency</code> is "WEEKLY" or
     *        "BIWEEKLY").
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public ScheduledAuditMetadata withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
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
        if (getScheduledAuditName() != null)
            sb.append("ScheduledAuditName: ").append(getScheduledAuditName()).append(",");
        if (getScheduledAuditArn() != null)
            sb.append("ScheduledAuditArn: ").append(getScheduledAuditArn()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth()).append(",");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledAuditMetadata == false)
            return false;
        ScheduledAuditMetadata other = (ScheduledAuditMetadata) obj;
        if (other.getScheduledAuditName() == null ^ this.getScheduledAuditName() == null)
            return false;
        if (other.getScheduledAuditName() != null && other.getScheduledAuditName().equals(this.getScheduledAuditName()) == false)
            return false;
        if (other.getScheduledAuditArn() == null ^ this.getScheduledAuditArn() == null)
            return false;
        if (other.getScheduledAuditArn() != null && other.getScheduledAuditArn().equals(this.getScheduledAuditArn()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledAuditName() == null) ? 0 : getScheduledAuditName().hashCode());
        hashCode = prime * hashCode + ((getScheduledAuditArn() == null) ? 0 : getScheduledAuditArn().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledAuditMetadata clone() {
        try {
            return (ScheduledAuditMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ScheduledAuditMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
