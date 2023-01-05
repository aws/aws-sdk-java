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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/CreateAppMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor. If you are using Amazon Cognito for
     * authorization, you must include this structure in your request, and it must include the ID of the Amazon Cognito
     * identity pool to use for authorization. If you don't include <code>AppMonitorConfiguration</code>, you must set
     * up your own authorization method. For more information, see <a
     * href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     * application to send data to Amazon Web Services</a>.
     * </p>
     * <p>
     * If you omit this argument, the sample rate used for RUM is set to 10% of the user sessions.
     * </p>
     */
    private AppMonitorConfiguration appMonitorConfiguration;
    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. If you omit this
     * parameter, custom events are <code>DISABLED</code>.
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
     * <p>
     * If you omit this parameter, the default is <code>false</code>.
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
     * A name for the app monitor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the app monitor.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can associate as many as 50 tags with an app monitor.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A structure that contains much of the configuration data for the app monitor. If you are using Amazon Cognito for
     * authorization, you must include this structure in your request, and it must include the ID of the Amazon Cognito
     * identity pool to use for authorization. If you don't include <code>AppMonitorConfiguration</code>, you must set
     * up your own authorization method. For more information, see <a
     * href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     * application to send data to Amazon Web Services</a>.
     * </p>
     * <p>
     * If you omit this argument, the sample rate used for RUM is set to 10% of the user sessions.
     * </p>
     * 
     * @param appMonitorConfiguration
     *        A structure that contains much of the configuration data for the app monitor. If you are using Amazon
     *        Cognito for authorization, you must include this structure in your request, and it must include the ID of
     *        the Amazon Cognito identity pool to use for authorization. If you don't include
     *        <code>AppMonitorConfiguration</code>, you must set up your own authorization method. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     *        application to send data to Amazon Web Services</a>.</p>
     *        <p>
     *        If you omit this argument, the sample rate used for RUM is set to 10% of the user sessions.
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
     * <p>
     * If you omit this argument, the sample rate used for RUM is set to 10% of the user sessions.
     * </p>
     * 
     * @return A structure that contains much of the configuration data for the app monitor. If you are using Amazon
     *         Cognito for authorization, you must include this structure in your request, and it must include the ID of
     *         the Amazon Cognito identity pool to use for authorization. If you don't include
     *         <code>AppMonitorConfiguration</code>, you must set up your own authorization method. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize
     *         your application to send data to Amazon Web Services</a>.</p>
     *         <p>
     *         If you omit this argument, the sample rate used for RUM is set to 10% of the user sessions.
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
     * <p>
     * If you omit this argument, the sample rate used for RUM is set to 10% of the user sessions.
     * </p>
     * 
     * @param appMonitorConfiguration
     *        A structure that contains much of the configuration data for the app monitor. If you are using Amazon
     *        Cognito for authorization, you must include this structure in your request, and it must include the ID of
     *        the Amazon Cognito identity pool to use for authorization. If you don't include
     *        <code>AppMonitorConfiguration</code>, you must set up your own authorization method. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/monitoring/CloudWatch-RUM-get-started-authorization.html">Authorize your
     *        application to send data to Amazon Web Services</a>.</p>
     *        <p>
     *        If you omit this argument, the sample rate used for RUM is set to 10% of the user sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppMonitorRequest withAppMonitorConfiguration(AppMonitorConfiguration appMonitorConfiguration) {
        setAppMonitorConfiguration(appMonitorConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. If you omit this
     * parameter, custom events are <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @param customEvents
     *        Specifies whether this app monitor allows the web client to define and send custom events. If you omit
     *        this parameter, custom events are <code>DISABLED</code>.</p>
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
     * Specifies whether this app monitor allows the web client to define and send custom events. If you omit this
     * parameter, custom events are <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @return Specifies whether this app monitor allows the web client to define and send custom events. If you omit
     *         this parameter, custom events are <code>DISABLED</code>.</p>
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
     * Specifies whether this app monitor allows the web client to define and send custom events. If you omit this
     * parameter, custom events are <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information about custom events, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html">Send
     * custom events</a>.
     * </p>
     * 
     * @param customEvents
     *        Specifies whether this app monitor allows the web client to define and send custom events. If you omit
     *        this parameter, custom events are <code>DISABLED</code>.</p>
     *        <p>
     *        For more information about custom events, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-custom-events.html"
     *        >Send custom events</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppMonitorRequest withCustomEvents(CustomEvents customEvents) {
        setCustomEvents(customEvents);
        return this;
    }

    /**
     * <p>
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a
     * copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry
     * data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     * </p>
     * <p>
     * If you omit this parameter, the default is <code>false</code>.
     * </p>
     * 
     * @param cwLogEnabled
     *        Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM
     *        sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep
     *        the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.</p>
     *        <p>
     *        If you omit this parameter, the default is <code>false</code>.
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
     * <p>
     * If you omit this parameter, the default is <code>false</code>.
     * </p>
     * 
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM
     *         sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep
     *         the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.</p>
     *         <p>
     *         If you omit this parameter, the default is <code>false</code>.
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
     * <p>
     * If you omit this parameter, the default is <code>false</code>.
     * </p>
     * 
     * @param cwLogEnabled
     *        Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM
     *        sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep
     *        the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.</p>
     *        <p>
     *        If you omit this parameter, the default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppMonitorRequest withCwLogEnabled(Boolean cwLogEnabled) {
        setCwLogEnabled(cwLogEnabled);
        return this;
    }

    /**
     * <p>
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a
     * copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry
     * data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.
     * </p>
     * <p>
     * If you omit this parameter, the default is <code>false</code>.
     * </p>
     * 
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM
     *         sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep
     *         the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges.</p>
     *         <p>
     *         If you omit this parameter, the default is <code>false</code>.
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

    public CreateAppMonitorRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * A name for the app monitor.
     * </p>
     * 
     * @param name
     *        A name for the app monitor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the app monitor.
     * </p>
     * 
     * @return A name for the app monitor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the app monitor.
     * </p>
     * 
     * @param name
     *        A name for the app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppMonitorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the app monitor.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can associate as many as 50 tags with an app monitor.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @return Assigns one or more tags (key-value pairs) to the app monitor.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *         by granting a user permission to access or change only resources with certain tag values.
     *         </p>
     *         <p>
     *         Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *         characters.
     *         </p>
     *         <p>
     *         You can associate as many as 50 tags with an app monitor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the app monitor.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can associate as many as 50 tags with an app monitor.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the app monitor.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *        characters.
     *        </p>
     *        <p>
     *        You can associate as many as 50 tags with an app monitor.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
     *        Amazon Web Services resources</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the app monitor.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can associate as many as 50 tags with an app monitor.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the app monitor.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *        characters.
     *        </p>
     *        <p>
     *        You can associate as many as 50 tags with an app monitor.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
     *        Amazon Web Services resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppMonitorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAppMonitorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppMonitorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppMonitorRequest clearTagsEntries() {
        this.tags = null;
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
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppMonitorRequest == false)
            return false;
        CreateAppMonitorRequest other = (CreateAppMonitorRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppMonitorRequest clone() {
        return (CreateAppMonitorRequest) super.clone();
    }

}
