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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the history of a specific alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/AlarmHistoryItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmHistoryItem implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The type of alarm history item.
     * </p>
     */
    private String historyItemType;
    /**
     * <p>
     * A summary of the alarm history, in text format.
     * </p>
     */
    private String historySummary;
    /**
     * <p>
     * Data about the alarm, in JSON format.
     * </p>
     */
    private String historyData;

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * 
     * @param alarmName
     *        The descriptive name for the alarm.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * 
     * @return The descriptive name for the alarm.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * 
     * @param alarmName
     *        The descriptive name for the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     * 
     * @param timestamp
     *        The time stamp for the alarm history item.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     * 
     * @return The time stamp for the alarm history item.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     * 
     * @param timestamp
     *        The time stamp for the alarm history item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm history item.
     * @see HistoryItemType
     */

    public void setHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @return The type of alarm history item.
     * @see HistoryItemType
     */

    public String getHistoryItemType() {
        return this.historyItemType;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm history item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryItemType
     */

    public AlarmHistoryItem withHistoryItemType(String historyItemType) {
        setHistoryItemType(historyItemType);
        return this;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm history item.
     * @see HistoryItemType
     */

    public void setHistoryItemType(HistoryItemType historyItemType) {
        withHistoryItemType(historyItemType);
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm history item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryItemType
     */

    public AlarmHistoryItem withHistoryItemType(HistoryItemType historyItemType) {
        this.historyItemType = historyItemType.toString();
        return this;
    }

    /**
     * <p>
     * A summary of the alarm history, in text format.
     * </p>
     * 
     * @param historySummary
     *        A summary of the alarm history, in text format.
     */

    public void setHistorySummary(String historySummary) {
        this.historySummary = historySummary;
    }

    /**
     * <p>
     * A summary of the alarm history, in text format.
     * </p>
     * 
     * @return A summary of the alarm history, in text format.
     */

    public String getHistorySummary() {
        return this.historySummary;
    }

    /**
     * <p>
     * A summary of the alarm history, in text format.
     * </p>
     * 
     * @param historySummary
     *        A summary of the alarm history, in text format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withHistorySummary(String historySummary) {
        setHistorySummary(historySummary);
        return this;
    }

    /**
     * <p>
     * Data about the alarm, in JSON format.
     * </p>
     * 
     * @param historyData
     *        Data about the alarm, in JSON format.
     */

    public void setHistoryData(String historyData) {
        this.historyData = historyData;
    }

    /**
     * <p>
     * Data about the alarm, in JSON format.
     * </p>
     * 
     * @return Data about the alarm, in JSON format.
     */

    public String getHistoryData() {
        return this.historyData;
    }

    /**
     * <p>
     * Data about the alarm, in JSON format.
     * </p>
     * 
     * @param historyData
     *        Data about the alarm, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withHistoryData(String historyData) {
        setHistoryData(historyData);
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
        if (getAlarmName() != null)
            sb.append("AlarmName: ").append(getAlarmName()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getHistoryItemType() != null)
            sb.append("HistoryItemType: ").append(getHistoryItemType()).append(",");
        if (getHistorySummary() != null)
            sb.append("HistorySummary: ").append(getHistorySummary()).append(",");
        if (getHistoryData() != null)
            sb.append("HistoryData: ").append(getHistoryData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmHistoryItem == false)
            return false;
        AlarmHistoryItem other = (AlarmHistoryItem) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getHistoryItemType() == null ^ this.getHistoryItemType() == null)
            return false;
        if (other.getHistoryItemType() != null && other.getHistoryItemType().equals(this.getHistoryItemType()) == false)
            return false;
        if (other.getHistorySummary() == null ^ this.getHistorySummary() == null)
            return false;
        if (other.getHistorySummary() != null && other.getHistorySummary().equals(this.getHistorySummary()) == false)
            return false;
        if (other.getHistoryData() == null ^ this.getHistoryData() == null)
            return false;
        if (other.getHistoryData() != null && other.getHistoryData().equals(this.getHistoryData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getHistoryItemType() == null) ? 0 : getHistoryItemType().hashCode());
        hashCode = prime * hashCode + ((getHistorySummary() == null) ? 0 : getHistorySummary().hashCode());
        hashCode = prime * hashCode + ((getHistoryData() == null) ? 0 : getHistoryData().hashCode());
        return hashCode;
    }

    @Override
    public AlarmHistoryItem clone() {
        try {
            return (AlarmHistoryItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
