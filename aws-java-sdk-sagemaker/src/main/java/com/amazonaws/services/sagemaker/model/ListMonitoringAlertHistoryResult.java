/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringAlertHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitoringAlertHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An alert history for a model monitoring schedule.
     * </p>
     */
    private java.util.List<MonitoringAlertHistorySummary> monitoringAlertHistory;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in the
     * subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An alert history for a model monitoring schedule.
     * </p>
     * 
     * @return An alert history for a model monitoring schedule.
     */

    public java.util.List<MonitoringAlertHistorySummary> getMonitoringAlertHistory() {
        return monitoringAlertHistory;
    }

    /**
     * <p>
     * An alert history for a model monitoring schedule.
     * </p>
     * 
     * @param monitoringAlertHistory
     *        An alert history for a model monitoring schedule.
     */

    public void setMonitoringAlertHistory(java.util.Collection<MonitoringAlertHistorySummary> monitoringAlertHistory) {
        if (monitoringAlertHistory == null) {
            this.monitoringAlertHistory = null;
            return;
        }

        this.monitoringAlertHistory = new java.util.ArrayList<MonitoringAlertHistorySummary>(monitoringAlertHistory);
    }

    /**
     * <p>
     * An alert history for a model monitoring schedule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoringAlertHistory(java.util.Collection)} or
     * {@link #withMonitoringAlertHistory(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param monitoringAlertHistory
     *        An alert history for a model monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringAlertHistoryResult withMonitoringAlertHistory(MonitoringAlertHistorySummary... monitoringAlertHistory) {
        if (this.monitoringAlertHistory == null) {
            setMonitoringAlertHistory(new java.util.ArrayList<MonitoringAlertHistorySummary>(monitoringAlertHistory.length));
        }
        for (MonitoringAlertHistorySummary ele : monitoringAlertHistory) {
            this.monitoringAlertHistory.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An alert history for a model monitoring schedule.
     * </p>
     * 
     * @param monitoringAlertHistory
     *        An alert history for a model monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringAlertHistoryResult withMonitoringAlertHistory(java.util.Collection<MonitoringAlertHistorySummary> monitoringAlertHistory) {
        setMonitoringAlertHistory(monitoringAlertHistory);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in the
     * subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in
     *        the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in the
     * subsequent request.
     * </p>
     * 
     * @return If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in
     *         the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in the
     * subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in
     *        the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringAlertHistoryResult withNextToken(String nextToken) {
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
        if (getMonitoringAlertHistory() != null)
            sb.append("MonitoringAlertHistory: ").append(getMonitoringAlertHistory()).append(",");
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

        if (obj instanceof ListMonitoringAlertHistoryResult == false)
            return false;
        ListMonitoringAlertHistoryResult other = (ListMonitoringAlertHistoryResult) obj;
        if (other.getMonitoringAlertHistory() == null ^ this.getMonitoringAlertHistory() == null)
            return false;
        if (other.getMonitoringAlertHistory() != null && other.getMonitoringAlertHistory().equals(this.getMonitoringAlertHistory()) == false)
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

        hashCode = prime * hashCode + ((getMonitoringAlertHistory() == null) ? 0 : getMonitoringAlertHistory().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitoringAlertHistoryResult clone() {
        try {
            return (ListMonitoringAlertHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
