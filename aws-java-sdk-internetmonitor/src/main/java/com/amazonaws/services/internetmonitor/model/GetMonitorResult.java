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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMonitorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor.
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     * </p>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * The status of the monitor.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time when the monitor was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The last time that the monitor was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The health of the data processing for the monitor.
     * </p>
     */
    private String processingStatus;
    /**
     * <p>
     * Additional information about the health of the data processing for the monitor.
     * </p>
     */
    private String processingStatusInfo;
    /**
     * <p>
     * The tags that have been added to monitor.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where
     * clients access your application resources from and the ASN or network provider, such as an internet service
     * provider (ISP), that clients access the resources through. This limit can help control billing costs.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch User
     * Guide</i>.
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
     * The percentage of the internet-facing traffic for your application to monitor with this monitor. If you set a
     * city-networks maximum, that limit overrides the traffic percentage that you set.
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
     * The list of health event threshold configurations. The threshold percentage for a health score determines, along
     * with other configuration information, when Internet Monitor creates a health event when there's an internet issue
     * that affects your application end users.
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

    public GetMonitorResult withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitor.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param resources
     *        The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param resources
     *        The resources monitored by the monitor. Resources are listed by their Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The status of the monitor.
     * </p>
     * 
     * @param status
     *        The status of the monitor.
     * @see MonitorConfigState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the monitor.
     * </p>
     * 
     * @return The status of the monitor.
     * @see MonitorConfigState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the monitor.
     * </p>
     * 
     * @param status
     *        The status of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorConfigState
     */

    public GetMonitorResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the monitor.
     * </p>
     * 
     * @param status
     *        The status of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorConfigState
     */

    public GetMonitorResult withStatus(MonitorConfigState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time when the monitor was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the monitor was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the monitor was created.
     * </p>
     * 
     * @return The time when the monitor was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the monitor was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the monitor was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The last time that the monitor was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The last time that the monitor was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The last time that the monitor was modified.
     * </p>
     * 
     * @return The last time that the monitor was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The last time that the monitor was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The last time that the monitor was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The health of the data processing for the monitor.
     * </p>
     * 
     * @param processingStatus
     *        The health of the data processing for the monitor.
     * @see MonitorProcessingStatusCode
     */

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    /**
     * <p>
     * The health of the data processing for the monitor.
     * </p>
     * 
     * @return The health of the data processing for the monitor.
     * @see MonitorProcessingStatusCode
     */

    public String getProcessingStatus() {
        return this.processingStatus;
    }

    /**
     * <p>
     * The health of the data processing for the monitor.
     * </p>
     * 
     * @param processingStatus
     *        The health of the data processing for the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorProcessingStatusCode
     */

    public GetMonitorResult withProcessingStatus(String processingStatus) {
        setProcessingStatus(processingStatus);
        return this;
    }

    /**
     * <p>
     * The health of the data processing for the monitor.
     * </p>
     * 
     * @param processingStatus
     *        The health of the data processing for the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorProcessingStatusCode
     */

    public GetMonitorResult withProcessingStatus(MonitorProcessingStatusCode processingStatus) {
        this.processingStatus = processingStatus.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the health of the data processing for the monitor.
     * </p>
     * 
     * @param processingStatusInfo
     *        Additional information about the health of the data processing for the monitor.
     */

    public void setProcessingStatusInfo(String processingStatusInfo) {
        this.processingStatusInfo = processingStatusInfo;
    }

    /**
     * <p>
     * Additional information about the health of the data processing for the monitor.
     * </p>
     * 
     * @return Additional information about the health of the data processing for the monitor.
     */

    public String getProcessingStatusInfo() {
        return this.processingStatusInfo;
    }

    /**
     * <p>
     * Additional information about the health of the data processing for the monitor.
     * </p>
     * 
     * @param processingStatusInfo
     *        Additional information about the health of the data processing for the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withProcessingStatusInfo(String processingStatusInfo) {
        setProcessingStatusInfo(processingStatusInfo);
        return this;
    }

    /**
     * <p>
     * The tags that have been added to monitor.
     * </p>
     * 
     * @return The tags that have been added to monitor.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that have been added to monitor.
     * </p>
     * 
     * @param tags
     *        The tags that have been added to monitor.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that have been added to monitor.
     * </p>
     * 
     * @param tags
     *        The tags that have been added to monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetMonitorResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult addTagsEntry(String key, String value) {
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

    public GetMonitorResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where
     * clients access your application resources from and the ASN or network provider, such as an internet service
     * provider (ISP), that clients access the resources through. This limit can help control billing costs.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch User
     * Guide</i>.
     * </p>
     * 
     * @param maxCityNetworksToMonitor
     *        The maximum number of city-networks to monitor for your resources. A city-network is the location (city)
     *        where clients access your application resources from and the ASN or network provider, such as an internet
     *        service provider (ISP), that clients access the resources through. This limit can help control billing
     *        costs.</p>
     *        <p>
     *        To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing
     *        a city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch
     *        User Guide</i>.
     */

    public void setMaxCityNetworksToMonitor(Integer maxCityNetworksToMonitor) {
        this.maxCityNetworksToMonitor = maxCityNetworksToMonitor;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where
     * clients access your application resources from and the ASN or network provider, such as an internet service
     * provider (ISP), that clients access the resources through. This limit can help control billing costs.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch User
     * Guide</i>.
     * </p>
     * 
     * @return The maximum number of city-networks to monitor for your resources. A city-network is the location (city)
     *         where clients access your application resources from and the ASN or network provider, such as an internet
     *         service provider (ISP), that clients access the resources through. This limit can help control billing
     *         costs.</p>
     *         <p>
     *         To learn more, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing
     *         a city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch
     *         User Guide</i>.
     */

    public Integer getMaxCityNetworksToMonitor() {
        return this.maxCityNetworksToMonitor;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where
     * clients access your application resources from and the ASN or network provider, such as an internet service
     * provider (ISP), that clients access the resources through. This limit can help control billing costs.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch User
     * Guide</i>.
     * </p>
     * 
     * @param maxCityNetworksToMonitor
     *        The maximum number of city-networks to monitor for your resources. A city-network is the location (city)
     *        where clients access your application resources from and the ASN or network provider, such as an internet
     *        service provider (ISP), that clients access the resources through. This limit can help control billing
     *        costs.</p>
     *        <p>
     *        To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing
     *        a city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withMaxCityNetworksToMonitor(Integer maxCityNetworksToMonitor) {
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

    public GetMonitorResult withInternetMeasurementsLogDelivery(InternetMeasurementsLogDelivery internetMeasurementsLogDelivery) {
        setInternetMeasurementsLogDelivery(internetMeasurementsLogDelivery);
        return this;
    }

    /**
     * <p>
     * The percentage of the internet-facing traffic for your application to monitor with this monitor. If you set a
     * city-networks maximum, that limit overrides the traffic percentage that you set.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     * application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     * <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param trafficPercentageToMonitor
     *        The percentage of the internet-facing traffic for your application to monitor with this monitor. If you
     *        set a city-networks maximum, that limit overrides the traffic percentage that you set.</p>
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
     * The percentage of the internet-facing traffic for your application to monitor with this monitor. If you set a
     * city-networks maximum, that limit overrides the traffic percentage that you set.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     * application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     * <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The percentage of the internet-facing traffic for your application to monitor with this monitor. If you
     *         set a city-networks maximum, that limit overrides the traffic percentage that you set.</p>
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
     * The percentage of the internet-facing traffic for your application to monitor with this monitor. If you set a
     * city-networks maximum, that limit overrides the traffic percentage that you set.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     * application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     * <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param trafficPercentageToMonitor
     *        The percentage of the internet-facing traffic for your application to monitor with this monitor. If you
     *        set a city-networks maximum, that limit overrides the traffic percentage that you set.</p>
     *        <p>
     *        To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMTrafficPercentage.html">Choosing an
     *        application traffic percentage to monitor </a> in the Amazon CloudWatch Internet Monitor section of the
     *        <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withTrafficPercentageToMonitor(Integer trafficPercentageToMonitor) {
        setTrafficPercentageToMonitor(trafficPercentageToMonitor);
        return this;
    }

    /**
     * <p>
     * The list of health event threshold configurations. The threshold percentage for a health score determines, along
     * with other configuration information, when Internet Monitor creates a health event when there's an internet issue
     * that affects your application end users.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param healthEventsConfig
     *        The list of health event threshold configurations. The threshold percentage for a health score determines,
     *        along with other configuration information, when Internet Monitor creates a health event when there's an
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
     * The list of health event threshold configurations. The threshold percentage for a health score determines, along
     * with other configuration information, when Internet Monitor creates a health event when there's an internet issue
     * that affects your application end users.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The list of health event threshold configurations. The threshold percentage for a health score
     *         determines, along with other configuration information, when Internet Monitor creates a health event when
     *         there's an internet issue that affects your application end users.</p>
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
     * The list of health event threshold configurations. The threshold percentage for a health score determines, along
     * with other configuration information, when Internet Monitor creates a health event when there's an internet issue
     * that affects your application end users.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param healthEventsConfig
     *        The list of health event threshold configurations. The threshold percentage for a health score determines,
     *        along with other configuration information, when Internet Monitor creates a health event when there's an
     *        internet issue that affects your application end users.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
     *        > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMonitorResult withHealthEventsConfig(HealthEventsConfig healthEventsConfig) {
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
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getProcessingStatus() != null)
            sb.append("ProcessingStatus: ").append(getProcessingStatus()).append(",");
        if (getProcessingStatusInfo() != null)
            sb.append("ProcessingStatusInfo: ").append(getProcessingStatusInfo()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof GetMonitorResult == false)
            return false;
        GetMonitorResult other = (GetMonitorResult) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getProcessingStatus() == null ^ this.getProcessingStatus() == null)
            return false;
        if (other.getProcessingStatus() != null && other.getProcessingStatus().equals(this.getProcessingStatus()) == false)
            return false;
        if (other.getProcessingStatusInfo() == null ^ this.getProcessingStatusInfo() == null)
            return false;
        if (other.getProcessingStatusInfo() != null && other.getProcessingStatusInfo().equals(this.getProcessingStatusInfo()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getProcessingStatus() == null) ? 0 : getProcessingStatus().hashCode());
        hashCode = prime * hashCode + ((getProcessingStatusInfo() == null) ? 0 : getProcessingStatusInfo().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getMaxCityNetworksToMonitor() == null) ? 0 : getMaxCityNetworksToMonitor().hashCode());
        hashCode = prime * hashCode + ((getInternetMeasurementsLogDelivery() == null) ? 0 : getInternetMeasurementsLogDelivery().hashCode());
        hashCode = prime * hashCode + ((getTrafficPercentageToMonitor() == null) ? 0 : getTrafficPercentageToMonitor().hashCode());
        hashCode = prime * hashCode + ((getHealthEventsConfig() == null) ? 0 : getHealthEventsConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetMonitorResult clone() {
        try {
            return (GetMonitorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
