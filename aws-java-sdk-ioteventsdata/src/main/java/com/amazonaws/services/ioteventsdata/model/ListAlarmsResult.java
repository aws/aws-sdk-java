/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListAlarms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAlarmsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each alarm.
     * </p>
     */
    private java.util.List<AlarmSummary> alarmSummaries;
    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each alarm.
     * </p>
     * 
     * @return A list that summarizes each alarm.
     */

    public java.util.List<AlarmSummary> getAlarmSummaries() {
        return alarmSummaries;
    }

    /**
     * <p>
     * A list that summarizes each alarm.
     * </p>
     * 
     * @param alarmSummaries
     *        A list that summarizes each alarm.
     */

    public void setAlarmSummaries(java.util.Collection<AlarmSummary> alarmSummaries) {
        if (alarmSummaries == null) {
            this.alarmSummaries = null;
            return;
        }

        this.alarmSummaries = new java.util.ArrayList<AlarmSummary>(alarmSummaries);
    }

    /**
     * <p>
     * A list that summarizes each alarm.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmSummaries(java.util.Collection)} or {@link #withAlarmSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param alarmSummaries
     *        A list that summarizes each alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmsResult withAlarmSummaries(AlarmSummary... alarmSummaries) {
        if (this.alarmSummaries == null) {
            setAlarmSummaries(new java.util.ArrayList<AlarmSummary>(alarmSummaries.length));
        }
        for (AlarmSummary ele : alarmSummaries) {
            this.alarmSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each alarm.
     * </p>
     * 
     * @param alarmSummaries
     *        A list that summarizes each alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmsResult withAlarmSummaries(java.util.Collection<AlarmSummary> alarmSummaries) {
        setAlarmSummaries(alarmSummaries);
        return this;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmsResult withNextToken(String nextToken) {
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
        if (getAlarmSummaries() != null)
            sb.append("AlarmSummaries: ").append(getAlarmSummaries()).append(",");
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

        if (obj instanceof ListAlarmsResult == false)
            return false;
        ListAlarmsResult other = (ListAlarmsResult) obj;
        if (other.getAlarmSummaries() == null ^ this.getAlarmSummaries() == null)
            return false;
        if (other.getAlarmSummaries() != null && other.getAlarmSummaries().equals(this.getAlarmSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAlarmSummaries() == null) ? 0 : getAlarmSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAlarmsResult clone() {
        try {
            return (ListAlarmsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
