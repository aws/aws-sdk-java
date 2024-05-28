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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     */
    private String linkedAccountId;

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @return The name of the monitor.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @param linkedAccountId
     *        The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *        Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *        Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public void setLinkedAccountId(String linkedAccountId) {
        this.linkedAccountId = linkedAccountId;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @return The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *         Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *         Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public String getLinkedAccountId() {
        return this.linkedAccountId;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @param linkedAccountId
     *        The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *        Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *        Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorRequest withLinkedAccountId(String linkedAccountId) {
        setLinkedAccountId(linkedAccountId);
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getLinkedAccountId() != null)
            sb.append("LinkedAccountId: ").append(getLinkedAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMonitorRequest == false)
            return false;
        GetMonitorRequest other = (GetMonitorRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getLinkedAccountId() == null ^ this.getLinkedAccountId() == null)
            return false;
        if (other.getLinkedAccountId() != null && other.getLinkedAccountId().equals(this.getLinkedAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getLinkedAccountId() == null) ? 0 : getLinkedAccountId().hashCode());
        return hashCode;
    }

    @Override
    public GetMonitorRequest clone() {
        return (GetMonitorRequest) super.clone();
    }

}
