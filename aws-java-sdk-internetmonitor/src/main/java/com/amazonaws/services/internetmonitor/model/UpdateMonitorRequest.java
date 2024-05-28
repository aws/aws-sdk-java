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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UpdateMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs). Resources can
     * be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.
     * </p>
     * <p>
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or you can
     * add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     * </p>
     * <note>
     * <p>
     * If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway attached
     * to it, to make sure that it has internet connectivity.
     * </p>
     * </note>
     */
    private java.util.List<String> resourcesToAdd;
    /**
     * <p>
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     */
    private java.util.List<String> resourcesToRemove;
    /**
     * <p>
     * The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code> API
     * call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are <i>not</i>
     * accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request.
     * You should not reuse the same client token for other API requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The maximum number of city-networks to monitor for your application. A city-network is the location (city) where
     * clients access your application resources from and the ASN or network provider, such as an internet service
     * provider (ISP), that clients access the resources through. Setting this limit can help control billing costs.
     * </p>
     */
    private Integer maxCityNetworksToMonitor;
    /**
     * <p>
     * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     * measurements are also published to Amazon CloudWatch Logs.
     * </p>
     */
    private InternetMeasurementsLogDelivery internetMeasurementsLogDelivery;
    /**
     * <p>
     * The percentage of the internet-facing traffic for your application that you want to monitor with this monitor. If
     * you set a city-networks maximum, that limit overrides the traffic percentage that you set.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     * application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     * <i>CloudWatch User Guide</i>.
     * </p>
     */
    private Integer trafficPercentageToMonitor;
    /**
     * <p>
     * The list of health score thresholds. A threshold percentage for health scores, along with other configuration
     * information, determines when Internet Monitor creates a health event when there's an internet issue that affects
     * your application end users.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private HealthEventsConfig healthEventsConfig;

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

    public UpdateMonitorRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs). Resources can
     * be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.
     * </p>
     * <p>
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or you can
     * add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     * </p>
     * <note>
     * <p>
     * If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway attached
     * to it, to make sure that it has internet connectivity.
     * </p>
     * </note>
     * 
     * @return The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     *         Resources can be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.</p>
     *         <p>
     *         You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or
     *         you can add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     *         </p>
     *         <note>
     *         <p>
     *         If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway
     *         attached to it, to make sure that it has internet connectivity.
     *         </p>
     */

    public java.util.List<String> getResourcesToAdd() {
        return resourcesToAdd;
    }

    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs). Resources can
     * be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.
     * </p>
     * <p>
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or you can
     * add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     * </p>
     * <note>
     * <p>
     * If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway attached
     * to it, to make sure that it has internet connectivity.
     * </p>
     * </note>
     * 
     * @param resourcesToAdd
     *        The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     *        Resources can be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.</p>
     *        <p>
     *        You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or
     *        you can add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     *        </p>
     *        <note>
     *        <p>
     *        If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway
     *        attached to it, to make sure that it has internet connectivity.
     *        </p>
     */

    public void setResourcesToAdd(java.util.Collection<String> resourcesToAdd) {
        if (resourcesToAdd == null) {
            this.resourcesToAdd = null;
            return;
        }

        this.resourcesToAdd = new java.util.ArrayList<String>(resourcesToAdd);
    }

    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs). Resources can
     * be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.
     * </p>
     * <p>
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or you can
     * add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     * </p>
     * <note>
     * <p>
     * If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway attached
     * to it, to make sure that it has internet connectivity.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcesToAdd(java.util.Collection)} or {@link #withResourcesToAdd(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourcesToAdd
     *        The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     *        Resources can be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.</p>
     *        <p>
     *        You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or
     *        you can add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     *        </p>
     *        <note>
     *        <p>
     *        If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway
     *        attached to it, to make sure that it has internet connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withResourcesToAdd(String... resourcesToAdd) {
        if (this.resourcesToAdd == null) {
            setResourcesToAdd(new java.util.ArrayList<String>(resourcesToAdd.length));
        }
        for (String ele : resourcesToAdd) {
            this.resourcesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs). Resources can
     * be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.
     * </p>
     * <p>
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or you can
     * add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     * </p>
     * <note>
     * <p>
     * If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway attached
     * to it, to make sure that it has internet connectivity.
     * </p>
     * </note>
     * 
     * @param resourcesToAdd
     *        The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     *        Resources can be VPCs, NLBs, Amazon CloudFront distributions, or Amazon WorkSpaces directories.</p>
     *        <p>
     *        You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces directories, or
     *        you can add NLBs. You can't add NLBs or WorkSpaces directories together with any other resources.
     *        </p>
     *        <note>
     *        <p>
     *        If you add only Amazon Virtual Private Clouds resources, at least one VPC must have an Internet Gateway
     *        attached to it, to make sure that it has internet connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withResourcesToAdd(java.util.Collection<String> resourcesToAdd) {
        setResourcesToAdd(resourcesToAdd);
        return this;
    }

    /**
     * <p>
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     */

    public java.util.List<String> getResourcesToRemove() {
        return resourcesToRemove;
    }

    /**
     * <p>
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param resourcesToRemove
     *        The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     */

    public void setResourcesToRemove(java.util.Collection<String> resourcesToRemove) {
        if (resourcesToRemove == null) {
            this.resourcesToRemove = null;
            return;
        }

        this.resourcesToRemove = new java.util.ArrayList<String>(resourcesToRemove);
    }

    /**
     * <p>
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcesToRemove(java.util.Collection)} or {@link #withResourcesToRemove(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourcesToRemove
     *        The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withResourcesToRemove(String... resourcesToRemove) {
        if (this.resourcesToRemove == null) {
            setResourcesToRemove(new java.util.ArrayList<String>(resourcesToRemove.length));
        }
        for (String ele : resourcesToRemove) {
            this.resourcesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param resourcesToRemove
     *        The resources to remove from a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withResourcesToRemove(java.util.Collection<String> resourcesToRemove) {
        setResourcesToRemove(resourcesToRemove);
        return this;
    }

    /**
     * <p>
     * The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code> API
     * call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are <i>not</i>
     * accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * </p>
     * 
     * @param status
     *        The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code>
     *        API call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are
     *        <i>not</i> accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * @see MonitorConfigState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code> API
     * call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are <i>not</i>
     * accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * </p>
     * 
     * @return The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code>
     *         API call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are
     *         <i>not</i> accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * @see MonitorConfigState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code> API
     * call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are <i>not</i>
     * accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * </p>
     * 
     * @param status
     *        The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code>
     *        API call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are
     *        <i>not</i> accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorConfigState
     */

    public UpdateMonitorRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code> API
     * call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are <i>not</i>
     * accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * </p>
     * 
     * @param status
     *        The status for a monitor. The accepted values for <code>Status</code> with the <code>UpdateMonitor</code>
     *        API call are the following: <code>ACTIVE</code> and <code>INACTIVE</code>. The following values are
     *        <i>not</i> accepted: <code>PENDING</code>, and <code>ERROR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorConfigState
     */

    public UpdateMonitorRequest withStatus(MonitorConfigState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API
     *        request. You should not reuse the same client token for other API requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @return A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API
     *         request. You should not reuse the same client token for other API requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API
     *        request. You should not reuse the same client token for other API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your application. A city-network is the location (city) where
     * clients access your application resources from and the ASN or network provider, such as an internet service
     * provider (ISP), that clients access the resources through. Setting this limit can help control billing costs.
     * </p>
     * 
     * @param maxCityNetworksToMonitor
     *        The maximum number of city-networks to monitor for your application. A city-network is the location (city)
     *        where clients access your application resources from and the ASN or network provider, such as an internet
     *        service provider (ISP), that clients access the resources through. Setting this limit can help control
     *        billing costs.
     */

    public void setMaxCityNetworksToMonitor(Integer maxCityNetworksToMonitor) {
        this.maxCityNetworksToMonitor = maxCityNetworksToMonitor;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your application. A city-network is the location (city) where
     * clients access your application resources from and the ASN or network provider, such as an internet service
     * provider (ISP), that clients access the resources through. Setting this limit can help control billing costs.
     * </p>
     * 
     * @return The maximum number of city-networks to monitor for your application. A city-network is the location
     *         (city) where clients access your application resources from and the ASN or network provider, such as an
     *         internet service provider (ISP), that clients access the resources through. Setting this limit can help
     *         control billing costs.
     */

    public Integer getMaxCityNetworksToMonitor() {
        return this.maxCityNetworksToMonitor;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your application. A city-network is the location (city) where
     * clients access your application resources from and the ASN or network provider, such as an internet service
     * provider (ISP), that clients access the resources through. Setting this limit can help control billing costs.
     * </p>
     * 
     * @param maxCityNetworksToMonitor
     *        The maximum number of city-networks to monitor for your application. A city-network is the location (city)
     *        where clients access your application resources from and the ASN or network provider, such as an internet
     *        service provider (ISP), that clients access the resources through. Setting this limit can help control
     *        billing costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withMaxCityNetworksToMonitor(Integer maxCityNetworksToMonitor) {
        setMaxCityNetworksToMonitor(maxCityNetworksToMonitor);
        return this;
    }

    /**
     * <p>
     * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     * measurements are also published to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param internetMeasurementsLogDelivery
     *        Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     *        measurements are also published to Amazon CloudWatch Logs.
     */

    public void setInternetMeasurementsLogDelivery(InternetMeasurementsLogDelivery internetMeasurementsLogDelivery) {
        this.internetMeasurementsLogDelivery = internetMeasurementsLogDelivery;
    }

    /**
     * <p>
     * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     * measurements are also published to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     *         measurements are also published to Amazon CloudWatch Logs.
     */

    public InternetMeasurementsLogDelivery getInternetMeasurementsLogDelivery() {
        return this.internetMeasurementsLogDelivery;
    }

    /**
     * <p>
     * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     * measurements are also published to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param internetMeasurementsLogDelivery
     *        Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     *        measurements are also published to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withInternetMeasurementsLogDelivery(InternetMeasurementsLogDelivery internetMeasurementsLogDelivery) {
        setInternetMeasurementsLogDelivery(internetMeasurementsLogDelivery);
        return this;
    }

    /**
     * <p>
     * The percentage of the internet-facing traffic for your application that you want to monitor with this monitor. If
     * you set a city-networks maximum, that limit overrides the traffic percentage that you set.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     * application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     * <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param trafficPercentageToMonitor
     *        The percentage of the internet-facing traffic for your application that you want to monitor with this
     *        monitor. If you set a city-networks maximum, that limit overrides the traffic percentage that you set.</p>
     *        <p>
     *        To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     *        application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     *        <i>CloudWatch User Guide</i>.
     */

    public void setTrafficPercentageToMonitor(Integer trafficPercentageToMonitor) {
        this.trafficPercentageToMonitor = trafficPercentageToMonitor;
    }

    /**
     * <p>
     * The percentage of the internet-facing traffic for your application that you want to monitor with this monitor. If
     * you set a city-networks maximum, that limit overrides the traffic percentage that you set.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     * application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     * <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The percentage of the internet-facing traffic for your application that you want to monitor with this
     *         monitor. If you set a city-networks maximum, that limit overrides the traffic percentage that you
     *         set.</p>
     *         <p>
     *         To learn more, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing
     *         an application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of
     *         the <i>CloudWatch User Guide</i>.
     */

    public Integer getTrafficPercentageToMonitor() {
        return this.trafficPercentageToMonitor;
    }

    /**
     * <p>
     * The percentage of the internet-facing traffic for your application that you want to monitor with this monitor. If
     * you set a city-networks maximum, that limit overrides the traffic percentage that you set.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     * application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     * <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param trafficPercentageToMonitor
     *        The percentage of the internet-facing traffic for your application that you want to monitor with this
     *        monitor. If you set a city-networks maximum, that limit overrides the traffic percentage that you set.</p>
     *        <p>
     *        To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     *        application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     *        <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withTrafficPercentageToMonitor(Integer trafficPercentageToMonitor) {
        setTrafficPercentageToMonitor(trafficPercentageToMonitor);
        return this;
    }

    /**
     * <p>
     * The list of health score thresholds. A threshold percentage for health scores, along with other configuration
     * information, determines when Internet Monitor creates a health event when there's an internet issue that affects
     * your application end users.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param healthEventsConfig
     *        The list of health score thresholds. A threshold percentage for health scores, along with other
     *        configuration information, determines when Internet Monitor creates a health event when there's an
     *        internet issue that affects your application end users.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     *        > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public void setHealthEventsConfig(HealthEventsConfig healthEventsConfig) {
        this.healthEventsConfig = healthEventsConfig;
    }

    /**
     * <p>
     * The list of health score thresholds. A threshold percentage for health scores, along with other configuration
     * information, determines when Internet Monitor creates a health event when there's an internet issue that affects
     * your application end users.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The list of health score thresholds. A threshold percentage for health scores, along with other
     *         configuration information, determines when Internet Monitor creates a health event when there's an
     *         internet issue that affects your application end users.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     *         > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public HealthEventsConfig getHealthEventsConfig() {
        return this.healthEventsConfig;
    }

    /**
     * <p>
     * The list of health score thresholds. A threshold percentage for health scores, along with other configuration
     * information, determines when Internet Monitor creates a health event when there's an internet issue that affects
     * your application end users.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param healthEventsConfig
     *        The list of health score thresholds. A threshold percentage for health scores, along with other
     *        configuration information, determines when Internet Monitor creates a health event when there's an
     *        internet issue that affects your application end users.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     *        > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withHealthEventsConfig(HealthEventsConfig healthEventsConfig) {
        setHealthEventsConfig(healthEventsConfig);
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
        if (getResourcesToAdd() != null)
            sb.append("ResourcesToAdd: ").append(getResourcesToAdd()).append(",");
        if (getResourcesToRemove() != null)
            sb.append("ResourcesToRemove: ").append(getResourcesToRemove()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getMaxCityNetworksToMonitor() != null)
            sb.append("MaxCityNetworksToMonitor: ").append(getMaxCityNetworksToMonitor()).append(",");
        if (getInternetMeasurementsLogDelivery() != null)
            sb.append("InternetMeasurementsLogDelivery: ").append(getInternetMeasurementsLogDelivery()).append(",");
        if (getTrafficPercentageToMonitor() != null)
            sb.append("TrafficPercentageToMonitor: ").append(getTrafficPercentageToMonitor()).append(",");
        if (getHealthEventsConfig() != null)
            sb.append("HealthEventsConfig: ").append(getHealthEventsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMonitorRequest == false)
            return false;
        UpdateMonitorRequest other = (UpdateMonitorRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getResourcesToAdd() == null ^ this.getResourcesToAdd() == null)
            return false;
        if (other.getResourcesToAdd() != null && other.getResourcesToAdd().equals(this.getResourcesToAdd()) == false)
            return false;
        if (other.getResourcesToRemove() == null ^ this.getResourcesToRemove() == null)
            return false;
        if (other.getResourcesToRemove() != null && other.getResourcesToRemove().equals(this.getResourcesToRemove()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getMaxCityNetworksToMonitor() == null ^ this.getMaxCityNetworksToMonitor() == null)
            return false;
        if (other.getMaxCityNetworksToMonitor() != null && other.getMaxCityNetworksToMonitor().equals(this.getMaxCityNetworksToMonitor()) == false)
            return false;
        if (other.getInternetMeasurementsLogDelivery() == null ^ this.getInternetMeasurementsLogDelivery() == null)
            return false;
        if (other.getInternetMeasurementsLogDelivery() != null
                && other.getInternetMeasurementsLogDelivery().equals(this.getInternetMeasurementsLogDelivery()) == false)
            return false;
        if (other.getTrafficPercentageToMonitor() == null ^ this.getTrafficPercentageToMonitor() == null)
            return false;
        if (other.getTrafficPercentageToMonitor() != null && other.getTrafficPercentageToMonitor().equals(this.getTrafficPercentageToMonitor()) == false)
            return false;
        if (other.getHealthEventsConfig() == null ^ this.getHealthEventsConfig() == null)
            return false;
        if (other.getHealthEventsConfig() != null && other.getHealthEventsConfig().equals(this.getHealthEventsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getResourcesToAdd() == null) ? 0 : getResourcesToAdd().hashCode());
        hashCode = prime * hashCode + ((getResourcesToRemove() == null) ? 0 : getResourcesToRemove().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getMaxCityNetworksToMonitor() == null) ? 0 : getMaxCityNetworksToMonitor().hashCode());
        hashCode = prime * hashCode + ((getInternetMeasurementsLogDelivery() == null) ? 0 : getInternetMeasurementsLogDelivery().hashCode());
        hashCode = prime * hashCode + ((getTrafficPercentageToMonitor() == null) ? 0 : getTrafficPercentageToMonitor().hashCode());
        hashCode = prime * hashCode + ((getHealthEventsConfig() == null) ? 0 : getHealthEventsConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMonitorRequest clone() {
        return (UpdateMonitorRequest) super.clone();
    }

}
