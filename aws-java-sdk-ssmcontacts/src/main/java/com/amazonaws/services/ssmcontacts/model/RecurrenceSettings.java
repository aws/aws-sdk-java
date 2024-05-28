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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about when an on-call rotation is in effect and how long the rotation period lasts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/RecurrenceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecurrenceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about on-call rotations that recur monthly.
     * </p>
     */
    private java.util.List<MonthlySetting> monthlySettings;
    /**
     * <p>
     * Information about on-call rotations that recur weekly.
     * </p>
     */
    private java.util.List<WeeklySetting> weeklySettings;
    /**
     * <p>
     * Information about on-call rotations that recur daily.
     * </p>
     */
    private java.util.List<HandOffTime> dailySettings;
    /**
     * <p>
     * The number of contacts, or shift team members designated to be on call concurrently during a shift. For example,
     * in an on-call schedule containing ten contacts, a value of <code>2</code> designates that two of them are on call
     * at any given time.
     * </p>
     */
    private Integer numberOfOnCalls;
    /**
     * <p>
     * Information about the days of the week included in on-call rotation coverage.
     * </p>
     */
    private java.util.Map<String, java.util.List<CoverageTime>> shiftCoverages;
    /**
     * <p>
     * The number of days, weeks, or months a single rotation lasts.
     * </p>
     */
    private Integer recurrenceMultiplier;

    /**
     * <p>
     * Information about on-call rotations that recur monthly.
     * </p>
     * 
     * @return Information about on-call rotations that recur monthly.
     */

    public java.util.List<MonthlySetting> getMonthlySettings() {
        return monthlySettings;
    }

    /**
     * <p>
     * Information about on-call rotations that recur monthly.
     * </p>
     * 
     * @param monthlySettings
     *        Information about on-call rotations that recur monthly.
     */

    public void setMonthlySettings(java.util.Collection<MonthlySetting> monthlySettings) {
        if (monthlySettings == null) {
            this.monthlySettings = null;
            return;
        }

        this.monthlySettings = new java.util.ArrayList<MonthlySetting>(monthlySettings);
    }

    /**
     * <p>
     * Information about on-call rotations that recur monthly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonthlySettings(java.util.Collection)} or {@link #withMonthlySettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param monthlySettings
     *        Information about on-call rotations that recur monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withMonthlySettings(MonthlySetting... monthlySettings) {
        if (this.monthlySettings == null) {
            setMonthlySettings(new java.util.ArrayList<MonthlySetting>(monthlySettings.length));
        }
        for (MonthlySetting ele : monthlySettings) {
            this.monthlySettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about on-call rotations that recur monthly.
     * </p>
     * 
     * @param monthlySettings
     *        Information about on-call rotations that recur monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withMonthlySettings(java.util.Collection<MonthlySetting> monthlySettings) {
        setMonthlySettings(monthlySettings);
        return this;
    }

    /**
     * <p>
     * Information about on-call rotations that recur weekly.
     * </p>
     * 
     * @return Information about on-call rotations that recur weekly.
     */

    public java.util.List<WeeklySetting> getWeeklySettings() {
        return weeklySettings;
    }

    /**
     * <p>
     * Information about on-call rotations that recur weekly.
     * </p>
     * 
     * @param weeklySettings
     *        Information about on-call rotations that recur weekly.
     */

    public void setWeeklySettings(java.util.Collection<WeeklySetting> weeklySettings) {
        if (weeklySettings == null) {
            this.weeklySettings = null;
            return;
        }

        this.weeklySettings = new java.util.ArrayList<WeeklySetting>(weeklySettings);
    }

    /**
     * <p>
     * Information about on-call rotations that recur weekly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWeeklySettings(java.util.Collection)} or {@link #withWeeklySettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param weeklySettings
     *        Information about on-call rotations that recur weekly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withWeeklySettings(WeeklySetting... weeklySettings) {
        if (this.weeklySettings == null) {
            setWeeklySettings(new java.util.ArrayList<WeeklySetting>(weeklySettings.length));
        }
        for (WeeklySetting ele : weeklySettings) {
            this.weeklySettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about on-call rotations that recur weekly.
     * </p>
     * 
     * @param weeklySettings
     *        Information about on-call rotations that recur weekly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withWeeklySettings(java.util.Collection<WeeklySetting> weeklySettings) {
        setWeeklySettings(weeklySettings);
        return this;
    }

    /**
     * <p>
     * Information about on-call rotations that recur daily.
     * </p>
     * 
     * @return Information about on-call rotations that recur daily.
     */

    public java.util.List<HandOffTime> getDailySettings() {
        return dailySettings;
    }

    /**
     * <p>
     * Information about on-call rotations that recur daily.
     * </p>
     * 
     * @param dailySettings
     *        Information about on-call rotations that recur daily.
     */

    public void setDailySettings(java.util.Collection<HandOffTime> dailySettings) {
        if (dailySettings == null) {
            this.dailySettings = null;
            return;
        }

        this.dailySettings = new java.util.ArrayList<HandOffTime>(dailySettings);
    }

    /**
     * <p>
     * Information about on-call rotations that recur daily.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDailySettings(java.util.Collection)} or {@link #withDailySettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dailySettings
     *        Information about on-call rotations that recur daily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withDailySettings(HandOffTime... dailySettings) {
        if (this.dailySettings == null) {
            setDailySettings(new java.util.ArrayList<HandOffTime>(dailySettings.length));
        }
        for (HandOffTime ele : dailySettings) {
            this.dailySettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about on-call rotations that recur daily.
     * </p>
     * 
     * @param dailySettings
     *        Information about on-call rotations that recur daily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withDailySettings(java.util.Collection<HandOffTime> dailySettings) {
        setDailySettings(dailySettings);
        return this;
    }

    /**
     * <p>
     * The number of contacts, or shift team members designated to be on call concurrently during a shift. For example,
     * in an on-call schedule containing ten contacts, a value of <code>2</code> designates that two of them are on call
     * at any given time.
     * </p>
     * 
     * @param numberOfOnCalls
     *        The number of contacts, or shift team members designated to be on call concurrently during a shift. For
     *        example, in an on-call schedule containing ten contacts, a value of <code>2</code> designates that two of
     *        them are on call at any given time.
     */

    public void setNumberOfOnCalls(Integer numberOfOnCalls) {
        this.numberOfOnCalls = numberOfOnCalls;
    }

    /**
     * <p>
     * The number of contacts, or shift team members designated to be on call concurrently during a shift. For example,
     * in an on-call schedule containing ten contacts, a value of <code>2</code> designates that two of them are on call
     * at any given time.
     * </p>
     * 
     * @return The number of contacts, or shift team members designated to be on call concurrently during a shift. For
     *         example, in an on-call schedule containing ten contacts, a value of <code>2</code> designates that two of
     *         them are on call at any given time.
     */

    public Integer getNumberOfOnCalls() {
        return this.numberOfOnCalls;
    }

    /**
     * <p>
     * The number of contacts, or shift team members designated to be on call concurrently during a shift. For example,
     * in an on-call schedule containing ten contacts, a value of <code>2</code> designates that two of them are on call
     * at any given time.
     * </p>
     * 
     * @param numberOfOnCalls
     *        The number of contacts, or shift team members designated to be on call concurrently during a shift. For
     *        example, in an on-call schedule containing ten contacts, a value of <code>2</code> designates that two of
     *        them are on call at any given time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withNumberOfOnCalls(Integer numberOfOnCalls) {
        setNumberOfOnCalls(numberOfOnCalls);
        return this;
    }

    /**
     * <p>
     * Information about the days of the week included in on-call rotation coverage.
     * </p>
     * 
     * @return Information about the days of the week included in on-call rotation coverage.
     */

    public java.util.Map<String, java.util.List<CoverageTime>> getShiftCoverages() {
        return shiftCoverages;
    }

    /**
     * <p>
     * Information about the days of the week included in on-call rotation coverage.
     * </p>
     * 
     * @param shiftCoverages
     *        Information about the days of the week included in on-call rotation coverage.
     */

    public void setShiftCoverages(java.util.Map<String, java.util.List<CoverageTime>> shiftCoverages) {
        this.shiftCoverages = shiftCoverages;
    }

    /**
     * <p>
     * Information about the days of the week included in on-call rotation coverage.
     * </p>
     * 
     * @param shiftCoverages
     *        Information about the days of the week included in on-call rotation coverage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withShiftCoverages(java.util.Map<String, java.util.List<CoverageTime>> shiftCoverages) {
        setShiftCoverages(shiftCoverages);
        return this;
    }

    /**
     * Add a single ShiftCoverages entry
     *
     * @see RecurrenceSettings#withShiftCoverages
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings addShiftCoveragesEntry(String key, java.util.List<CoverageTime> value) {
        if (null == this.shiftCoverages) {
            this.shiftCoverages = new java.util.HashMap<String, java.util.List<CoverageTime>>();
        }
        if (this.shiftCoverages.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.shiftCoverages.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ShiftCoverages.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings clearShiftCoveragesEntries() {
        this.shiftCoverages = null;
        return this;
    }

    /**
     * <p>
     * The number of days, weeks, or months a single rotation lasts.
     * </p>
     * 
     * @param recurrenceMultiplier
     *        The number of days, weeks, or months a single rotation lasts.
     */

    public void setRecurrenceMultiplier(Integer recurrenceMultiplier) {
        this.recurrenceMultiplier = recurrenceMultiplier;
    }

    /**
     * <p>
     * The number of days, weeks, or months a single rotation lasts.
     * </p>
     * 
     * @return The number of days, weeks, or months a single rotation lasts.
     */

    public Integer getRecurrenceMultiplier() {
        return this.recurrenceMultiplier;
    }

    /**
     * <p>
     * The number of days, weeks, or months a single rotation lasts.
     * </p>
     * 
     * @param recurrenceMultiplier
     *        The number of days, weeks, or months a single rotation lasts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurrenceSettings withRecurrenceMultiplier(Integer recurrenceMultiplier) {
        setRecurrenceMultiplier(recurrenceMultiplier);
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
        if (getMonthlySettings() != null)
            sb.append("MonthlySettings: ").append(getMonthlySettings()).append(",");
        if (getWeeklySettings() != null)
            sb.append("WeeklySettings: ").append(getWeeklySettings()).append(",");
        if (getDailySettings() != null)
            sb.append("DailySettings: ").append(getDailySettings()).append(",");
        if (getNumberOfOnCalls() != null)
            sb.append("NumberOfOnCalls: ").append(getNumberOfOnCalls()).append(",");
        if (getShiftCoverages() != null)
            sb.append("ShiftCoverages: ").append(getShiftCoverages()).append(",");
        if (getRecurrenceMultiplier() != null)
            sb.append("RecurrenceMultiplier: ").append(getRecurrenceMultiplier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecurrenceSettings == false)
            return false;
        RecurrenceSettings other = (RecurrenceSettings) obj;
        if (other.getMonthlySettings() == null ^ this.getMonthlySettings() == null)
            return false;
        if (other.getMonthlySettings() != null && other.getMonthlySettings().equals(this.getMonthlySettings()) == false)
            return false;
        if (other.getWeeklySettings() == null ^ this.getWeeklySettings() == null)
            return false;
        if (other.getWeeklySettings() != null && other.getWeeklySettings().equals(this.getWeeklySettings()) == false)
            return false;
        if (other.getDailySettings() == null ^ this.getDailySettings() == null)
            return false;
        if (other.getDailySettings() != null && other.getDailySettings().equals(this.getDailySettings()) == false)
            return false;
        if (other.getNumberOfOnCalls() == null ^ this.getNumberOfOnCalls() == null)
            return false;
        if (other.getNumberOfOnCalls() != null && other.getNumberOfOnCalls().equals(this.getNumberOfOnCalls()) == false)
            return false;
        if (other.getShiftCoverages() == null ^ this.getShiftCoverages() == null)
            return false;
        if (other.getShiftCoverages() != null && other.getShiftCoverages().equals(this.getShiftCoverages()) == false)
            return false;
        if (other.getRecurrenceMultiplier() == null ^ this.getRecurrenceMultiplier() == null)
            return false;
        if (other.getRecurrenceMultiplier() != null && other.getRecurrenceMultiplier().equals(this.getRecurrenceMultiplier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonthlySettings() == null) ? 0 : getMonthlySettings().hashCode());
        hashCode = prime * hashCode + ((getWeeklySettings() == null) ? 0 : getWeeklySettings().hashCode());
        hashCode = prime * hashCode + ((getDailySettings() == null) ? 0 : getDailySettings().hashCode());
        hashCode = prime * hashCode + ((getNumberOfOnCalls() == null) ? 0 : getNumberOfOnCalls().hashCode());
        hashCode = prime * hashCode + ((getShiftCoverages() == null) ? 0 : getShiftCoverages().hashCode());
        hashCode = prime * hashCode + ((getRecurrenceMultiplier() == null) ? 0 : getRecurrenceMultiplier().hashCode());
        return hashCode;
    }

    @Override
    public RecurrenceSettings clone() {
        try {
            return (RecurrenceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.RecurrenceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
