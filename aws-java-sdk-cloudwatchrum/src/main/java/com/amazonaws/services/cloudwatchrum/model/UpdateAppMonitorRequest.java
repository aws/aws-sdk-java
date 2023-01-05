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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UpdateAppMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor. If you are using Amazon Cognito for
     * authorization, you must include this structure in your request, and it must include the ID of the Amazon Cognito
     * identity pool to use for authorization. If you don't include <code>AppMonitorConfiguration</code>, you must set
     * up your own authorization method. For more information, see <a
     * href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     * application to send data to Amazon Web Services</a>.
     * </p>
     */
    private AppMonitorConfiguration appMonitorConfiguration;
    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     */
    private CustomEvents customEvents;
    /**
     * <p>
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a
     * copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry
     * data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     * </p>
     */
    private Boolean cwLogEnabled;
    /**
     * <p>
     * The top-level internet domain name for which your application has administrative authority.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The name of the app monitor to update.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor. If you are using Amazon Cognito for
     * authorization, you must include this structure in your request, and it must include the ID of the Amazon Cognito
     * identity pool to use for authorization. If you don't include <code>AppMonitorConfiguration</code>, you must set
     * up your own authorization method. For more information, see <a
     * href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     * application to send data to Amazon Web Services</a>.
     * </p>
     * 
     * @param appMonitorConfiguration
     *        A structure that contains much of the configuration data for the app monitor. If you are using Amazon
     *        Cognito for authorization, you must include this structure in your request, and it must include the ID of
     *        the Amazon Cognito identity pool to use for authorization. If you don't include
     *        <code>AppMonitorConfiguration</code>, you must set up your own authorization method. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     *        application to send data to Amazon Web Services</a>.
     */

    public void setAppMonitorConfiguration(AppMonitorConfiguration appMonitorConfiguration) {
        this.appMonitorConfiguration = appMonitorConfiguration;
    }

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor. If you are using Amazon Cognito for
     * authorization, you must include this structure in your request, and it must include the ID of the Amazon Cognito
     * identity pool to use for authorization. If you don't include <code>AppMonitorConfiguration</code>, you must set
     * up your own authorization method. For more information, see <a
     * href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     * application to send data to Amazon Web Services</a>.
     * </p>
     * 
     * @return A structure that contains much of the configuration data for the app monitor. If you are using Amazon
     *         Cognito for authorization, you must include this structure in your request, and it must include the ID of
     *         the Amazon Cognito identity pool to use for authorization. If you don't include
     *         <code>AppMonitorConfiguration</code>, you must set up your own authorization method. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize
     *         your application to send data to Amazon Web Services</a>.
     */

    public AppMonitorConfiguration getAppMonitorConfiguration() {
        return this.appMonitorConfiguration;
    }

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor. If you are using Amazon Cognito for
     * authorization, you must include this structure in your request, and it must include the ID of the Amazon Cognito
     * identity pool to use for authorization. If you don't include <code>AppMonitorConfiguration</code>, you must set
     * up your own authorization method. For more information, see <a
     * href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     * application to send data to Amazon Web Services</a>.
     * </p>
     * 
     * @param appMonitorConfiguration
     *        A structure that contains much of the configuration data for the app monitor. If you are using Amazon
     *        Cognito for authorization, you must include this structure in your request, and it must include the ID of
     *        the Amazon Cognito identity pool to use for authorization. If you don't include
     *        <code>AppMonitorConfiguration</code>, you must set up your own authorization method. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     *        application to send data to Amazon Web Services</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppMonitorRequest withAppMonitorConfiguration(AppMonitorConfiguration appMonitorConfiguration) {
        setAppMonitorConfiguration(appMonitorConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @param customEvents
     *        Specifies whether this app monitor allows the web client to define and send custom events. The default is
     *        for custom events to be <code>DISABLED</code>.</p>
     *        <p>
     *        For more information about custom events, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html"
     *        >Send custom events</a>.
     */

    public void setCustomEvents(CustomEvents customEvents) {
        this.customEvents = customEvents;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @return Specifies whether this app monitor allows the web client to define and send custom events. The default is
     *         for custom events to be <code>DISABLED</code>.</p>
     *         <p>
     *         For more information about custom events, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html"
     *         >Send custom events</a>.
     */

    public CustomEvents getCustomEvents() {
        return this.customEvents;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @param customEvents
     *        Specifies whether this app monitor allows the web client to define and send custom events. The default is
     *        for custom events to be <code>DISABLED</code>.</p>
     *        <p>
     *        For more information about custom events, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html"
     *        >Send custom events</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppMonitorRequest withCustomEvents(CustomEvents customEvents) {
        setCustomEvents(customEvents);
        return this;
    }

    /**
     * <p>
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a
     * copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry
     * data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     * </p>
     * 
     * @param cwLogEnabled
     *        Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM
     *        sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep
     *        the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     */

    public void setCwLogEnabled(Boolean cwLogEnabled) {
        this.cwLogEnabled = cwLogEnabled;
    }

    /**
     * <p>
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a
     * copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry
     * data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     * </p>
     * 
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM
     *         sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep
     *         the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     */

    public Boolean getCwLogEnabled() {
        return this.cwLogEnabled;
    }

    /**
     * <p>
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a
     * copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry
     * data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     * </p>
     * 
     * @param cwLogEnabled
     *        Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM
     *        sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep
     *        the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppMonitorRequest withCwLogEnabled(Boolean cwLogEnabled) {
        setCwLogEnabled(cwLogEnabled);
        return this;
    }

    /**
     * <p>
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a
     * copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry
     * data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     * </p>
     * 
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM
     *         sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep
     *         the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     */

    public Boolean isCwLogEnabled() {
        return this.cwLogEnabled;
    }

    /**
     * <p>
     * The top-level internet domain name for which your application has administrative authority.
     * </p>
     * 
     * @param domain
     *        The top-level internet domain name for which your application has administrative authority.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The top-level internet domain name for which your application has administrative authority.
     * </p>
     * 
     * @return The top-level internet domain name for which your application has administrative authority.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The top-level internet domain name for which your application has administrative authority.
     * </p>
     * 
     * @param domain
     *        The top-level internet domain name for which your application has administrative authority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppMonitorRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The name of the app monitor to update.
     * </p>
     * 
     * @param name
     *        The name of the app monitor to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the app monitor to update.
     * </p>
     * 
     * @return The name of the app monitor to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the app monitor to update.
     * </p>
     * 
     * @param name
     *        The name of the app monitor to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppMonitorRequest withName(String name) {
        setName(name);
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
        if (getAppMonitorConfiguration() != null)
            sb.append("AppMonitorConfiguration: ").append(getAppMonitorConfiguration()).append(",");
        if (getCustomEvents() != null)
            sb.append("CustomEvents: ").append(getCustomEvents()).append(",");
        if (getCwLogEnabled() != null)
            sb.append("CwLogEnabled: ").append(getCwLogEnabled()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppMonitorRequest == false)
            return false;
        UpdateAppMonitorRequest other = (UpdateAppMonitorRequest) obj;
        if (other.getAppMonitorConfiguration() == null ^ this.getAppMonitorConfiguration() == null)
            return false;
        if (other.getAppMonitorConfiguration() != null && other.getAppMonitorConfiguration().equals(this.getAppMonitorConfiguration()) == false)
            return false;
        if (other.getCustomEvents() == null ^ this.getCustomEvents() == null)
            return false;
        if (other.getCustomEvents() != null && other.getCustomEvents().equals(this.getCustomEvents()) == false)
            return false;
        if (other.getCwLogEnabled() == null ^ this.getCwLogEnabled() == null)
            return false;
        if (other.getCwLogEnabled() != null && other.getCwLogEnabled().equals(this.getCwLogEnabled()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppMonitorConfiguration() == null) ? 0 : getAppMonitorConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomEvents() == null) ? 0 : getCustomEvents().hashCode());
        hashCode = prime * hashCode + ((getCwLogEnabled() == null) ? 0 : getCwLogEnabled().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppMonitorRequest clone() {
        return (UpdateAppMonitorRequest) super.clone();
    }

}
