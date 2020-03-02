/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAlarms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAlarmsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Specify an alarm name to return information about a specific alarm.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetAlarms</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     */
    private String pageToken;
    /**
     * <p>
     * The name of the Lightsail resource being monitored by the alarm.
     * </p>
     * <p>
     * Specify a monitored resource name to return information about all alarms for a specific resource.
     * </p>
     */
    private String monitoredResourceName;

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Specify an alarm name to return information about a specific alarm.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm.</p>
     *        <p>
     *        Specify an alarm name to return information about a specific alarm.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Specify an alarm name to return information about a specific alarm.
     * </p>
     * 
     * @return The name of the alarm.</p>
     *         <p>
     *         Specify an alarm name to return information about a specific alarm.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Specify an alarm name to return information about a specific alarm.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm.</p>
     *        <p>
     *        Specify an alarm name to return information about a specific alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAlarmsRequest withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetAlarms</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetAlarms</code> request. If your results are paginated, the
     *        response will return a next page token that you can specify as the page token in a subsequent request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetAlarms</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         To get a page token, perform an initial <code>GetAlarms</code> request. If your results are paginated,
     *         the response will return a next page token that you can specify as the page token in a subsequent
     *         request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetAlarms</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetAlarms</code> request. If your results are paginated, the
     *        response will return a next page token that you can specify as the page token in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAlarmsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
        return this;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored by the alarm.
     * </p>
     * <p>
     * Specify a monitored resource name to return information about all alarms for a specific resource.
     * </p>
     * 
     * @param monitoredResourceName
     *        The name of the Lightsail resource being monitored by the alarm.</p>
     *        <p>
     *        Specify a monitored resource name to return information about all alarms for a specific resource.
     */

    public void setMonitoredResourceName(String monitoredResourceName) {
        this.monitoredResourceName = monitoredResourceName;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored by the alarm.
     * </p>
     * <p>
     * Specify a monitored resource name to return information about all alarms for a specific resource.
     * </p>
     * 
     * @return The name of the Lightsail resource being monitored by the alarm.</p>
     *         <p>
     *         Specify a monitored resource name to return information about all alarms for a specific resource.
     */

    public String getMonitoredResourceName() {
        return this.monitoredResourceName;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored by the alarm.
     * </p>
     * <p>
     * Specify a monitored resource name to return information about all alarms for a specific resource.
     * </p>
     * 
     * @param monitoredResourceName
     *        The name of the Lightsail resource being monitored by the alarm.</p>
     *        <p>
     *        Specify a monitored resource name to return information about all alarms for a specific resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAlarmsRequest withMonitoredResourceName(String monitoredResourceName) {
        setMonitoredResourceName(monitoredResourceName);
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
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken()).append(",");
        if (getMonitoredResourceName() != null)
            sb.append("MonitoredResourceName: ").append(getMonitoredResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAlarmsRequest == false)
            return false;
        GetAlarmsRequest other = (GetAlarmsRequest) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getMonitoredResourceName() == null ^ this.getMonitoredResourceName() == null)
            return false;
        if (other.getMonitoredResourceName() != null && other.getMonitoredResourceName().equals(this.getMonitoredResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getMonitoredResourceName() == null) ? 0 : getMonitoredResourceName().hashCode());
        return hashCode;
    }

    @Override
    public GetAlarmsRequest clone() {
        return (GetAlarmsRequest) super.clone();
    }

}
