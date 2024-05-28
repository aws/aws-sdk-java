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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListMonitors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of monitor objects that you want to return with this call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The status of a monitor. This includes the status of the data processing for the monitor and the status of the
     * monitor itself.
     * </p>
     * <p>
     * For information about the statuses for a monitor, see <a
     * href="https://docs.aws.amazon.com/internet-monitor/latest/api/API_Monitor.html"> Monitor</a>.
     * </p>
     */
    private String monitorStatus;
    /**
     * <p>
     * A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list of
     * monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You configure
     * cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     */
    private Boolean includeLinkedAccounts;

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of monitor objects that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of monitor objects that you want to return with this call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of monitor objects that you want to return with this call.
     * </p>
     * 
     * @return The number of monitor objects that you want to return with this call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of monitor objects that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of monitor objects that you want to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The status of a monitor. This includes the status of the data processing for the monitor and the status of the
     * monitor itself.
     * </p>
     * <p>
     * For information about the statuses for a monitor, see <a
     * href="https://docs.aws.amazon.com/internet-monitor/latest/api/API_Monitor.html"> Monitor</a>.
     * </p>
     * 
     * @param monitorStatus
     *        The status of a monitor. This includes the status of the data processing for the monitor and the status of
     *        the monitor itself.</p>
     *        <p>
     *        For information about the statuses for a monitor, see <a
     *        href="https://docs.aws.amazon.com/internet-monitor/latest/api/API_Monitor.html"> Monitor</a>.
     */

    public void setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
    }

    /**
     * <p>
     * The status of a monitor. This includes the status of the data processing for the monitor and the status of the
     * monitor itself.
     * </p>
     * <p>
     * For information about the statuses for a monitor, see <a
     * href="https://docs.aws.amazon.com/internet-monitor/latest/api/API_Monitor.html"> Monitor</a>.
     * </p>
     * 
     * @return The status of a monitor. This includes the status of the data processing for the monitor and the status
     *         of the monitor itself.</p>
     *         <p>
     *         For information about the statuses for a monitor, see <a
     *         href="https://docs.aws.amazon.com/internet-monitor/latest/api/API_Monitor.html"> Monitor</a>.
     */

    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    /**
     * <p>
     * The status of a monitor. This includes the status of the data processing for the monitor and the status of the
     * monitor itself.
     * </p>
     * <p>
     * For information about the statuses for a monitor, see <a
     * href="https://docs.aws.amazon.com/internet-monitor/latest/api/API_Monitor.html"> Monitor</a>.
     * </p>
     * 
     * @param monitorStatus
     *        The status of a monitor. This includes the status of the data processing for the monitor and the status of
     *        the monitor itself.</p>
     *        <p>
     *        For information about the statuses for a monitor, see <a
     *        href="https://docs.aws.amazon.com/internet-monitor/latest/api/API_Monitor.html"> Monitor</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsRequest withMonitorStatus(String monitorStatus) {
        setMonitorStatus(monitorStatus);
        return this;
    }

    /**
     * <p>
     * A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list of
     * monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You configure
     * cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @param includeLinkedAccounts
     *        A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list
     *        of monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You configure
     *        cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *        Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public void setIncludeLinkedAccounts(Boolean includeLinkedAccounts) {
        this.includeLinkedAccounts = includeLinkedAccounts;
    }

    /**
     * <p>
     * A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list of
     * monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You configure
     * cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @return A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list
     *         of monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You
     *         configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *         Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public Boolean getIncludeLinkedAccounts() {
        return this.includeLinkedAccounts;
    }

    /**
     * <p>
     * A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list of
     * monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You configure
     * cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @param includeLinkedAccounts
     *        A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list
     *        of monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You configure
     *        cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *        Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsRequest withIncludeLinkedAccounts(Boolean includeLinkedAccounts) {
        setIncludeLinkedAccounts(includeLinkedAccounts);
        return this;
    }

    /**
     * <p>
     * A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list of
     * monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You configure
     * cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @return A boolean option that you can set to <code>TRUE</code> to include monitors for linked accounts in a list
     *         of monitors, when you've set up cross-account sharing in Amazon CloudWatch Internet Monitor. You
     *         configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *         Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public Boolean isIncludeLinkedAccounts() {
        return this.includeLinkedAccounts;
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getMonitorStatus() != null)
            sb.append("MonitorStatus: ").append(getMonitorStatus()).append(",");
        if (getIncludeLinkedAccounts() != null)
            sb.append("IncludeLinkedAccounts: ").append(getIncludeLinkedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMonitorsRequest == false)
            return false;
        ListMonitorsRequest other = (ListMonitorsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMonitorStatus() == null ^ this.getMonitorStatus() == null)
            return false;
        if (other.getMonitorStatus() != null && other.getMonitorStatus().equals(this.getMonitorStatus()) == false)
            return false;
        if (other.getIncludeLinkedAccounts() == null ^ this.getIncludeLinkedAccounts() == null)
            return false;
        if (other.getIncludeLinkedAccounts() != null && other.getIncludeLinkedAccounts().equals(this.getIncludeLinkedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getMonitorStatus() == null) ? 0 : getMonitorStatus().hashCode());
        hashCode = prime * hashCode + ((getIncludeLinkedAccounts() == null) ? 0 : getIncludeLinkedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitorsRequest clone() {
        return (ListMonitorsRequest) super.clone();
    }

}
