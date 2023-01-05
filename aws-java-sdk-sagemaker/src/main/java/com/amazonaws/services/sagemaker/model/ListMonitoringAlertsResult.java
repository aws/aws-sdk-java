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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringAlerts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitoringAlertsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     */
    private java.util.List<MonitoringAlertSummary> monitoringAlertSummaries;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in the
     * subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     * 
     * @return A JSON array where each element is a summary for a monitoring alert.
     */

    public java.util.List<MonitoringAlertSummary> getMonitoringAlertSummaries() {
        return monitoringAlertSummaries;
    }

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     * 
     * @param monitoringAlertSummaries
     *        A JSON array where each element is a summary for a monitoring alert.
     */

    public void setMonitoringAlertSummaries(java.util.Collection<MonitoringAlertSummary> monitoringAlertSummaries) {
        if (monitoringAlertSummaries == null) {
            this.monitoringAlertSummaries = null;
            return;
        }

        this.monitoringAlertSummaries = new java.util.ArrayList<MonitoringAlertSummary>(monitoringAlertSummaries);
    }

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoringAlertSummaries(java.util.Collection)} or
     * {@link #withMonitoringAlertSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param monitoringAlertSummaries
     *        A JSON array where each element is a summary for a monitoring alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringAlertsResult withMonitoringAlertSummaries(MonitoringAlertSummary... monitoringAlertSummaries) {
        if (this.monitoringAlertSummaries == null) {
            setMonitoringAlertSummaries(new java.util.ArrayList<MonitoringAlertSummary>(monitoringAlertSummaries.length));
        }
        for (MonitoringAlertSummary ele : monitoringAlertSummaries) {
            this.monitoringAlertSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     * 
     * @param monitoringAlertSummaries
     *        A JSON array where each element is a summary for a monitoring alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringAlertsResult withMonitoringAlertSummaries(java.util.Collection<MonitoringAlertSummary> monitoringAlertSummaries) {
        setMonitoringAlertSummaries(monitoringAlertSummaries);
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

    public ListMonitoringAlertsResult withNextToken(String nextToken) {
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
        if (getMonitoringAlertSummaries() != null)
            sb.append("MonitoringAlertSummaries: ").append(getMonitoringAlertSummaries()).append(",");
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

        if (obj instanceof ListMonitoringAlertsResult == false)
            return false;
        ListMonitoringAlertsResult other = (ListMonitoringAlertsResult) obj;
        if (other.getMonitoringAlertSummaries() == null ^ this.getMonitoringAlertSummaries() == null)
            return false;
        if (other.getMonitoringAlertSummaries() != null && other.getMonitoringAlertSummaries().equals(this.getMonitoringAlertSummaries()) == false)
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

        hashCode = prime * hashCode + ((getMonitoringAlertSummaries() == null) ? 0 : getMonitoringAlertSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitoringAlertsResult clone() {
        try {
            return (ListMonitoringAlertsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
