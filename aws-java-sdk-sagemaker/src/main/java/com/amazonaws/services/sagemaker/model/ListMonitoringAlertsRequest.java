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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringAlerts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitoringAlertsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * If the result of the previous <code>ListMonitoringAlerts</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of alerts in the history, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to display. The default is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of a monitoring schedule.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     * 
     * @return The name of a monitoring schedule.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of a monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringAlertsRequest withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListMonitoringAlerts</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of alerts in the history, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListMonitoringAlerts</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of alerts in the history, use the token in the
     *        next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListMonitoringAlerts</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of alerts in the history, use the token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListMonitoringAlerts</code> request was truncated, the response
     *         includes a <code>NextToken</code>. To retrieve the next set of alerts in the history, use the token in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListMonitoringAlerts</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of alerts in the history, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListMonitoringAlerts</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of alerts in the history, use the token in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringAlertsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to display. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to display. The default is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to display. The default is 100.
     * </p>
     * 
     * @return The maximum number of results to display. The default is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to display. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to display. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringAlertsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: ").append(getMonitoringScheduleName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMonitoringAlertsRequest == false)
            return false;
        ListMonitoringAlertsRequest other = (ListMonitoringAlertsRequest) obj;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitoringAlertsRequest clone() {
        return (ListMonitoringAlertsRequest) super.clone();
    }

}
