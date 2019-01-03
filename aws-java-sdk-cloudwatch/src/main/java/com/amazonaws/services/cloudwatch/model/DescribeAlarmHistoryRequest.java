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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarmHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alarm.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     */
    private String historyItemType;
    /**
     * <p>
     * The starting date to retrieve alarm history.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The ending date to retrieve alarm history.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * The maximum number of alarm history records to retrieve.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @return The name of the alarm.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmHistoryRequest withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm histories to retrieve.
     * @see HistoryItemType
     */

    public void setHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * 
     * @return The type of alarm histories to retrieve.
     * @see HistoryItemType
     */

    public String getHistoryItemType() {
        return this.historyItemType;
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm histories to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryItemType
     */

    public DescribeAlarmHistoryRequest withHistoryItemType(String historyItemType) {
        setHistoryItemType(historyItemType);
        return this;
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm histories to retrieve.
     * @see HistoryItemType
     */

    public void setHistoryItemType(HistoryItemType historyItemType) {
        withHistoryItemType(historyItemType);
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm histories to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryItemType
     */

    public DescribeAlarmHistoryRequest withHistoryItemType(HistoryItemType historyItemType) {
        this.historyItemType = historyItemType.toString();
        return this;
    }

    /**
     * <p>
     * The starting date to retrieve alarm history.
     * </p>
     * 
     * @param startDate
     *        The starting date to retrieve alarm history.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The starting date to retrieve alarm history.
     * </p>
     * 
     * @return The starting date to retrieve alarm history.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The starting date to retrieve alarm history.
     * </p>
     * 
     * @param startDate
     *        The starting date to retrieve alarm history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmHistoryRequest withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The ending date to retrieve alarm history.
     * </p>
     * 
     * @param endDate
     *        The ending date to retrieve alarm history.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The ending date to retrieve alarm history.
     * </p>
     * 
     * @return The ending date to retrieve alarm history.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The ending date to retrieve alarm history.
     * </p>
     * 
     * @param endDate
     *        The ending date to retrieve alarm history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmHistoryRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The maximum number of alarm history records to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of alarm history records to retrieve.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm history records to retrieve.
     * </p>
     * 
     * @return The maximum number of alarm history records to retrieve.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm history records to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of alarm history records to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmHistoryRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned by a previous call to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getHistoryItemType() != null)
            sb.append("HistoryItemType: ").append(getHistoryItemType()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmHistoryRequest == false)
            return false;
        DescribeAlarmHistoryRequest other = (DescribeAlarmHistoryRequest) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getHistoryItemType() == null ^ this.getHistoryItemType() == null)
            return false;
        if (other.getHistoryItemType() != null && other.getHistoryItemType().equals(this.getHistoryItemType()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getHistoryItemType() == null) ? 0 : getHistoryItemType().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmHistoryRequest clone() {
        return (DescribeAlarmHistoryRequest) super.clone();
    }

}
