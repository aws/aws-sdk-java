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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateCampaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCampaignRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the campaign to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description of the campaign to help identify its purpose.
     * </p>
     */
    private String description;
    /**
     * <p>
     * (Optional) The Amazon Resource Name (ARN) of the signal catalog to associate with the campaign.
     * </p>
     */
    private String signalCatalogArn;
    /**
     * <p>
     * The ARN of the vehicle or fleet to deploy a campaign to.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * (Optional) The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified,
     * <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle
     * data won't be collected after the campaign expires.
     * </p>
     * <p>
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     * </p>
     */
    private java.util.Date expiryTime;
    /**
     * <p>
     * (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates the collection. If
     * it's not specified, <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     */
    private Long postTriggerCollectionDuration;
    /**
     * <p>
     * (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If you
     * want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified, <code>OFF</code>
     * is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     */
    private String diagnosticsMode;
    /**
     * <p>
     * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a connection
     * is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If you want to store
     * collected data when a vehicle loses connection with the cloud, use <code>TO_DISK</code>. If it's not specified,
     * <code>OFF</code> is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     */
    private String spoolingMode;
    /**
     * <p>
     * (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If you
     * don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * <p>
     * Default: <code>SNAPPY</code>
     * </p>
     */
    private String compression;
    /**
     * <p>
     * (Optional) A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet.
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's not specified,
     * <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * (Optional) A list of information about signals to collect.
     * </p>
     */
    private java.util.List<SignalInformation> signalsToCollect;
    /**
     * <p>
     * The data collection scheme associated with the campaign. You can specify a scheme that collects data based on
     * time or an event.
     * </p>
     */
    private CollectionScheme collectionScheme;
    /**
     * <p>
     * (Optional) A list of vehicle attributes to associate with a campaign.
     * </p>
     * <p>
     * Enrich the data with specified vehicle attributes. For example, add <code>make</code> and <code>model</code> to
     * the campaign, and Amazon Web Services IoT FleetWise will associate the data with those attributes as dimensions
     * in Amazon Timestream. You can then query the data against <code>make</code> and <code>model</code>.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     */
    private java.util.List<String> dataExtraDimensions;
    /**
     * <p>
     * Metadata that can be used to manage the campaign.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the campaign to create.
     * </p>
     * 
     * @param name
     *        The name of the campaign to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the campaign to create.
     * </p>
     * 
     * @return The name of the campaign to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the campaign to create.
     * </p>
     * 
     * @param name
     *        The name of the campaign to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description of the campaign to help identify its purpose.
     * </p>
     * 
     * @param description
     *        An optional description of the campaign to help identify its purpose.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the campaign to help identify its purpose.
     * </p>
     * 
     * @return An optional description of the campaign to help identify its purpose.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the campaign to help identify its purpose.
     * </p>
     * 
     * @param description
     *        An optional description of the campaign to help identify its purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * (Optional) The Amazon Resource Name (ARN) of the signal catalog to associate with the campaign.
     * </p>
     * 
     * @param signalCatalogArn
     *        (Optional) The Amazon Resource Name (ARN) of the signal catalog to associate with the campaign.
     */

    public void setSignalCatalogArn(String signalCatalogArn) {
        this.signalCatalogArn = signalCatalogArn;
    }

    /**
     * <p>
     * (Optional) The Amazon Resource Name (ARN) of the signal catalog to associate with the campaign.
     * </p>
     * 
     * @return (Optional) The Amazon Resource Name (ARN) of the signal catalog to associate with the campaign.
     */

    public String getSignalCatalogArn() {
        return this.signalCatalogArn;
    }

    /**
     * <p>
     * (Optional) The Amazon Resource Name (ARN) of the signal catalog to associate with the campaign.
     * </p>
     * 
     * @param signalCatalogArn
     *        (Optional) The Amazon Resource Name (ARN) of the signal catalog to associate with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withSignalCatalogArn(String signalCatalogArn) {
        setSignalCatalogArn(signalCatalogArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the vehicle or fleet to deploy a campaign to.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the vehicle or fleet to deploy a campaign to.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the vehicle or fleet to deploy a campaign to.
     * </p>
     * 
     * @return The ARN of the vehicle or fleet to deploy a campaign to.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of the vehicle or fleet to deploy a campaign to.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the vehicle or fleet to deploy a campaign to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * (Optional) The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified,
     * <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param startTime
     *        (Optional) The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified,
     *        <code>0</code> is used.</p>
     *        <p>
     *        Default: <code>0</code>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * (Optional) The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified,
     * <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @return (Optional) The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified,
     *         <code>0</code> is used.</p>
     *         <p>
     *         Default: <code>0</code>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * (Optional) The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified,
     * <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param startTime
     *        (Optional) The time, in milliseconds, to deliver a campaign after it was approved. If it's not specified,
     *        <code>0</code> is used.</p>
     *        <p>
     *        Default: <code>0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle
     * data won't be collected after the campaign expires.
     * </p>
     * <p>
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     * </p>
     * 
     * @param expiryTime
     *        (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time).
     *        Vehicle data won't be collected after the campaign expires. </p>
     *        <p>
     *        Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     */

    public void setExpiryTime(java.util.Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * <p>
     * (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle
     * data won't be collected after the campaign expires.
     * </p>
     * <p>
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     * </p>
     * 
     * @return (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time).
     *         Vehicle data won't be collected after the campaign expires. </p>
     *         <p>
     *         Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     */

    public java.util.Date getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * <p>
     * (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle
     * data won't be collected after the campaign expires.
     * </p>
     * <p>
     * Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     * </p>
     * 
     * @param expiryTime
     *        (Optional) The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time).
     *        Vehicle data won't be collected after the campaign expires. </p>
     *        <p>
     *        Default: 253402214400 (December 31, 9999, 00:00:00 UTC)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withExpiryTime(java.util.Date expiryTime) {
        setExpiryTime(expiryTime);
        return this;
    }

    /**
     * <p>
     * (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates the collection. If
     * it's not specified, <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param postTriggerCollectionDuration
     *        (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates the
     *        collection. If it's not specified, <code>0</code> is used.</p>
     *        <p>
     *        Default: <code>0</code>
     */

    public void setPostTriggerCollectionDuration(Long postTriggerCollectionDuration) {
        this.postTriggerCollectionDuration = postTriggerCollectionDuration;
    }

    /**
     * <p>
     * (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates the collection. If
     * it's not specified, <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @return (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates the
     *         collection. If it's not specified, <code>0</code> is used.</p>
     *         <p>
     *         Default: <code>0</code>
     */

    public Long getPostTriggerCollectionDuration() {
        return this.postTriggerCollectionDuration;
    }

    /**
     * <p>
     * (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates the collection. If
     * it's not specified, <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param postTriggerCollectionDuration
     *        (Optional) How long (in milliseconds) to collect raw data after a triggering event initiates the
     *        collection. If it's not specified, <code>0</code> is used.</p>
     *        <p>
     *        Default: <code>0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withPostTriggerCollectionDuration(Long postTriggerCollectionDuration) {
        setPostTriggerCollectionDuration(postTriggerCollectionDuration);
        return this;
    }

    /**
     * <p>
     * (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If you
     * want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified, <code>OFF</code>
     * is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     * 
     * @param diagnosticsMode
     *        (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If
     *        you want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified,
     *        <code>OFF</code> is used.</p>
     *        <p>
     *        Default: <code>OFF</code>
     * @see DiagnosticsMode
     */

    public void setDiagnosticsMode(String diagnosticsMode) {
        this.diagnosticsMode = diagnosticsMode;
    }

    /**
     * <p>
     * (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If you
     * want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified, <code>OFF</code>
     * is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     * 
     * @return (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If
     *         you want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified,
     *         <code>OFF</code> is used.</p>
     *         <p>
     *         Default: <code>OFF</code>
     * @see DiagnosticsMode
     */

    public String getDiagnosticsMode() {
        return this.diagnosticsMode;
    }

    /**
     * <p>
     * (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If you
     * want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified, <code>OFF</code>
     * is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     * 
     * @param diagnosticsMode
     *        (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If
     *        you want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified,
     *        <code>OFF</code> is used.</p>
     *        <p>
     *        Default: <code>OFF</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiagnosticsMode
     */

    public CreateCampaignRequest withDiagnosticsMode(String diagnosticsMode) {
        setDiagnosticsMode(diagnosticsMode);
        return this;
    }

    /**
     * <p>
     * (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If you
     * want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified, <code>OFF</code>
     * is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     * 
     * @param diagnosticsMode
     *        (Optional) Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise. If
     *        you want to send diagnostic trouble codes, use <code>SEND_ACTIVE_DTCS</code>. If it's not specified,
     *        <code>OFF</code> is used.</p>
     *        <p>
     *        Default: <code>OFF</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiagnosticsMode
     */

    public CreateCampaignRequest withDiagnosticsMode(DiagnosticsMode diagnosticsMode) {
        this.diagnosticsMode = diagnosticsMode.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a connection
     * is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If you want to store
     * collected data when a vehicle loses connection with the cloud, use <code>TO_DISK</code>. If it's not specified,
     * <code>OFF</code> is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     * 
     * @param spoolingMode
     *        (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a
     *        connection is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If
     *        you want to store collected data when a vehicle loses connection with the cloud, use <code>TO_DISK</code>.
     *        If it's not specified, <code>OFF</code> is used.</p>
     *        <p>
     *        Default: <code>OFF</code>
     * @see SpoolingMode
     */

    public void setSpoolingMode(String spoolingMode) {
        this.spoolingMode = spoolingMode;
    }

    /**
     * <p>
     * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a connection
     * is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If you want to store
     * collected data when a vehicle loses connection with the cloud, use <code>TO_DISK</code>. If it's not specified,
     * <code>OFF</code> is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     * 
     * @return (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a
     *         connection is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     *         If you want to store collected data when a vehicle loses connection with the cloud, use
     *         <code>TO_DISK</code>. If it's not specified, <code>OFF</code> is used.</p>
     *         <p>
     *         Default: <code>OFF</code>
     * @see SpoolingMode
     */

    public String getSpoolingMode() {
        return this.spoolingMode;
    }

    /**
     * <p>
     * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a connection
     * is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If you want to store
     * collected data when a vehicle loses connection with the cloud, use <code>TO_DISK</code>. If it's not specified,
     * <code>OFF</code> is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     * 
     * @param spoolingMode
     *        (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a
     *        connection is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If
     *        you want to store collected data when a vehicle loses connection with the cloud, use <code>TO_DISK</code>.
     *        If it's not specified, <code>OFF</code> is used.</p>
     *        <p>
     *        Default: <code>OFF</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpoolingMode
     */

    public CreateCampaignRequest withSpoolingMode(String spoolingMode) {
        setSpoolingMode(spoolingMode);
        return this;
    }

    /**
     * <p>
     * (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a connection
     * is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If you want to store
     * collected data when a vehicle loses connection with the cloud, use <code>TO_DISK</code>. If it's not specified,
     * <code>OFF</code> is used.
     * </p>
     * <p>
     * Default: <code>OFF</code>
     * </p>
     * 
     * @param spoolingMode
     *        (Optional) Whether to store collected data after a vehicle lost a connection with the cloud. After a
     *        connection is re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise. If
     *        you want to store collected data when a vehicle loses connection with the cloud, use <code>TO_DISK</code>.
     *        If it's not specified, <code>OFF</code> is used.</p>
     *        <p>
     *        Default: <code>OFF</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpoolingMode
     */

    public CreateCampaignRequest withSpoolingMode(SpoolingMode spoolingMode) {
        this.spoolingMode = spoolingMode.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If you
     * don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * <p>
     * Default: <code>SNAPPY</code>
     * </p>
     * 
     * @param compression
     *        (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If
     *        you don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code>
     *        is used. </p>
     *        <p>
     *        Default: <code>SNAPPY</code>
     * @see Compression
     */

    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * <p>
     * (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If you
     * don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * <p>
     * Default: <code>SNAPPY</code>
     * </p>
     * 
     * @return (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If
     *         you don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code>
     *         is used. </p>
     *         <p>
     *         Default: <code>SNAPPY</code>
     * @see Compression
     */

    public String getCompression() {
        return this.compression;
    }

    /**
     * <p>
     * (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If you
     * don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * <p>
     * Default: <code>SNAPPY</code>
     * </p>
     * 
     * @param compression
     *        (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If
     *        you don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code>
     *        is used. </p>
     *        <p>
     *        Default: <code>SNAPPY</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compression
     */

    public CreateCampaignRequest withCompression(String compression) {
        setCompression(compression);
        return this;
    }

    /**
     * <p>
     * (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If you
     * don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * <p>
     * Default: <code>SNAPPY</code>
     * </p>
     * 
     * @param compression
     *        (Optional) Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If
     *        you don't want to compress the signals, use <code>OFF</code>. If it's not specified, <code>SNAPPY</code>
     *        is used. </p>
     *        <p>
     *        Default: <code>SNAPPY</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compression
     */

    public CreateCampaignRequest withCompression(Compression compression) {
        this.compression = compression.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet.
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's not specified,
     * <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param priority
     *        (Optional) A number indicating the priority of one campaign over another campaign for a certain vehicle or
     *        fleet. A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's not
     *        specified, <code>0</code> is used. </p>
     *        <p>
     *        Default: <code>0</code>
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * (Optional) A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet.
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's not specified,
     * <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @return (Optional) A number indicating the priority of one campaign over another campaign for a certain vehicle
     *         or fleet. A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's
     *         not specified, <code>0</code> is used. </p>
     *         <p>
     *         Default: <code>0</code>
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * (Optional) A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet.
     * A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's not specified,
     * <code>0</code> is used.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param priority
     *        (Optional) A number indicating the priority of one campaign over another campaign for a certain vehicle or
     *        fleet. A campaign with the lowest value is deployed to vehicles before any other campaigns. If it's not
     *        specified, <code>0</code> is used. </p>
     *        <p>
     *        Default: <code>0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * (Optional) A list of information about signals to collect.
     * </p>
     * 
     * @return (Optional) A list of information about signals to collect.
     */

    public java.util.List<SignalInformation> getSignalsToCollect() {
        return signalsToCollect;
    }

    /**
     * <p>
     * (Optional) A list of information about signals to collect.
     * </p>
     * 
     * @param signalsToCollect
     *        (Optional) A list of information about signals to collect.
     */

    public void setSignalsToCollect(java.util.Collection<SignalInformation> signalsToCollect) {
        if (signalsToCollect == null) {
            this.signalsToCollect = null;
            return;
        }

        this.signalsToCollect = new java.util.ArrayList<SignalInformation>(signalsToCollect);
    }

    /**
     * <p>
     * (Optional) A list of information about signals to collect.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignalsToCollect(java.util.Collection)} or {@link #withSignalsToCollect(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param signalsToCollect
     *        (Optional) A list of information about signals to collect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withSignalsToCollect(SignalInformation... signalsToCollect) {
        if (this.signalsToCollect == null) {
            setSignalsToCollect(new java.util.ArrayList<SignalInformation>(signalsToCollect.length));
        }
        for (SignalInformation ele : signalsToCollect) {
            this.signalsToCollect.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) A list of information about signals to collect.
     * </p>
     * 
     * @param signalsToCollect
     *        (Optional) A list of information about signals to collect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withSignalsToCollect(java.util.Collection<SignalInformation> signalsToCollect) {
        setSignalsToCollect(signalsToCollect);
        return this;
    }

    /**
     * <p>
     * The data collection scheme associated with the campaign. You can specify a scheme that collects data based on
     * time or an event.
     * </p>
     * 
     * @param collectionScheme
     *        The data collection scheme associated with the campaign. You can specify a scheme that collects data based
     *        on time or an event.
     */

    public void setCollectionScheme(CollectionScheme collectionScheme) {
        this.collectionScheme = collectionScheme;
    }

    /**
     * <p>
     * The data collection scheme associated with the campaign. You can specify a scheme that collects data based on
     * time or an event.
     * </p>
     * 
     * @return The data collection scheme associated with the campaign. You can specify a scheme that collects data
     *         based on time or an event.
     */

    public CollectionScheme getCollectionScheme() {
        return this.collectionScheme;
    }

    /**
     * <p>
     * The data collection scheme associated with the campaign. You can specify a scheme that collects data based on
     * time or an event.
     * </p>
     * 
     * @param collectionScheme
     *        The data collection scheme associated with the campaign. You can specify a scheme that collects data based
     *        on time or an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withCollectionScheme(CollectionScheme collectionScheme) {
        setCollectionScheme(collectionScheme);
        return this;
    }

    /**
     * <p>
     * (Optional) A list of vehicle attributes to associate with a campaign.
     * </p>
     * <p>
     * Enrich the data with specified vehicle attributes. For example, add <code>make</code> and <code>model</code> to
     * the campaign, and Amazon Web Services IoT FleetWise will associate the data with those attributes as dimensions
     * in Amazon Timestream. You can then query the data against <code>make</code> and <code>model</code>.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     * 
     * @return (Optional) A list of vehicle attributes to associate with a campaign. </p>
     *         <p>
     *         Enrich the data with specified vehicle attributes. For example, add <code>make</code> and
     *         <code>model</code> to the campaign, and Amazon Web Services IoT FleetWise will associate the data with
     *         those attributes as dimensions in Amazon Timestream. You can then query the data against
     *         <code>make</code> and <code>model</code>.
     *         </p>
     *         <p>
     *         Default: An empty array
     */

    public java.util.List<String> getDataExtraDimensions() {
        return dataExtraDimensions;
    }

    /**
     * <p>
     * (Optional) A list of vehicle attributes to associate with a campaign.
     * </p>
     * <p>
     * Enrich the data with specified vehicle attributes. For example, add <code>make</code> and <code>model</code> to
     * the campaign, and Amazon Web Services IoT FleetWise will associate the data with those attributes as dimensions
     * in Amazon Timestream. You can then query the data against <code>make</code> and <code>model</code>.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     * 
     * @param dataExtraDimensions
     *        (Optional) A list of vehicle attributes to associate with a campaign. </p>
     *        <p>
     *        Enrich the data with specified vehicle attributes. For example, add <code>make</code> and
     *        <code>model</code> to the campaign, and Amazon Web Services IoT FleetWise will associate the data with
     *        those attributes as dimensions in Amazon Timestream. You can then query the data against <code>make</code>
     *        and <code>model</code>.
     *        </p>
     *        <p>
     *        Default: An empty array
     */

    public void setDataExtraDimensions(java.util.Collection<String> dataExtraDimensions) {
        if (dataExtraDimensions == null) {
            this.dataExtraDimensions = null;
            return;
        }

        this.dataExtraDimensions = new java.util.ArrayList<String>(dataExtraDimensions);
    }

    /**
     * <p>
     * (Optional) A list of vehicle attributes to associate with a campaign.
     * </p>
     * <p>
     * Enrich the data with specified vehicle attributes. For example, add <code>make</code> and <code>model</code> to
     * the campaign, and Amazon Web Services IoT FleetWise will associate the data with those attributes as dimensions
     * in Amazon Timestream. You can then query the data against <code>make</code> and <code>model</code>.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataExtraDimensions(java.util.Collection)} or {@link #withDataExtraDimensions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dataExtraDimensions
     *        (Optional) A list of vehicle attributes to associate with a campaign. </p>
     *        <p>
     *        Enrich the data with specified vehicle attributes. For example, add <code>make</code> and
     *        <code>model</code> to the campaign, and Amazon Web Services IoT FleetWise will associate the data with
     *        those attributes as dimensions in Amazon Timestream. You can then query the data against <code>make</code>
     *        and <code>model</code>.
     *        </p>
     *        <p>
     *        Default: An empty array
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withDataExtraDimensions(String... dataExtraDimensions) {
        if (this.dataExtraDimensions == null) {
            setDataExtraDimensions(new java.util.ArrayList<String>(dataExtraDimensions.length));
        }
        for (String ele : dataExtraDimensions) {
            this.dataExtraDimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) A list of vehicle attributes to associate with a campaign.
     * </p>
     * <p>
     * Enrich the data with specified vehicle attributes. For example, add <code>make</code> and <code>model</code> to
     * the campaign, and Amazon Web Services IoT FleetWise will associate the data with those attributes as dimensions
     * in Amazon Timestream. You can then query the data against <code>make</code> and <code>model</code>.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     * 
     * @param dataExtraDimensions
     *        (Optional) A list of vehicle attributes to associate with a campaign. </p>
     *        <p>
     *        Enrich the data with specified vehicle attributes. For example, add <code>make</code> and
     *        <code>model</code> to the campaign, and Amazon Web Services IoT FleetWise will associate the data with
     *        those attributes as dimensions in Amazon Timestream. You can then query the data against <code>make</code>
     *        and <code>model</code>.
     *        </p>
     *        <p>
     *        Default: An empty array
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withDataExtraDimensions(java.util.Collection<String> dataExtraDimensions) {
        setDataExtraDimensions(dataExtraDimensions);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the campaign.
     * </p>
     * 
     * @return Metadata that can be used to manage the campaign.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the campaign.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the campaign.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the campaign.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the campaign.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCampaignRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSignalCatalogArn() != null)
            sb.append("SignalCatalogArn: ").append(getSignalCatalogArn()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getExpiryTime() != null)
            sb.append("ExpiryTime: ").append(getExpiryTime()).append(",");
        if (getPostTriggerCollectionDuration() != null)
            sb.append("PostTriggerCollectionDuration: ").append(getPostTriggerCollectionDuration()).append(",");
        if (getDiagnosticsMode() != null)
            sb.append("DiagnosticsMode: ").append(getDiagnosticsMode()).append(",");
        if (getSpoolingMode() != null)
            sb.append("SpoolingMode: ").append(getSpoolingMode()).append(",");
        if (getCompression() != null)
            sb.append("Compression: ").append(getCompression()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getSignalsToCollect() != null)
            sb.append("SignalsToCollect: ").append(getSignalsToCollect()).append(",");
        if (getCollectionScheme() != null)
            sb.append("CollectionScheme: ").append(getCollectionScheme()).append(",");
        if (getDataExtraDimensions() != null)
            sb.append("DataExtraDimensions: ").append(getDataExtraDimensions()).append(",");
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

        if (obj instanceof CreateCampaignRequest == false)
            return false;
        CreateCampaignRequest other = (CreateCampaignRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSignalCatalogArn() == null ^ this.getSignalCatalogArn() == null)
            return false;
        if (other.getSignalCatalogArn() != null && other.getSignalCatalogArn().equals(this.getSignalCatalogArn()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null)
            return false;
        if (other.getExpiryTime() != null && other.getExpiryTime().equals(this.getExpiryTime()) == false)
            return false;
        if (other.getPostTriggerCollectionDuration() == null ^ this.getPostTriggerCollectionDuration() == null)
            return false;
        if (other.getPostTriggerCollectionDuration() != null
                && other.getPostTriggerCollectionDuration().equals(this.getPostTriggerCollectionDuration()) == false)
            return false;
        if (other.getDiagnosticsMode() == null ^ this.getDiagnosticsMode() == null)
            return false;
        if (other.getDiagnosticsMode() != null && other.getDiagnosticsMode().equals(this.getDiagnosticsMode()) == false)
            return false;
        if (other.getSpoolingMode() == null ^ this.getSpoolingMode() == null)
            return false;
        if (other.getSpoolingMode() != null && other.getSpoolingMode().equals(this.getSpoolingMode()) == false)
            return false;
        if (other.getCompression() == null ^ this.getCompression() == null)
            return false;
        if (other.getCompression() != null && other.getCompression().equals(this.getCompression()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSignalsToCollect() == null ^ this.getSignalsToCollect() == null)
            return false;
        if (other.getSignalsToCollect() != null && other.getSignalsToCollect().equals(this.getSignalsToCollect()) == false)
            return false;
        if (other.getCollectionScheme() == null ^ this.getCollectionScheme() == null)
            return false;
        if (other.getCollectionScheme() != null && other.getCollectionScheme().equals(this.getCollectionScheme()) == false)
            return false;
        if (other.getDataExtraDimensions() == null ^ this.getDataExtraDimensions() == null)
            return false;
        if (other.getDataExtraDimensions() != null && other.getDataExtraDimensions().equals(this.getDataExtraDimensions()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSignalCatalogArn() == null) ? 0 : getSignalCatalogArn().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        hashCode = prime * hashCode + ((getPostTriggerCollectionDuration() == null) ? 0 : getPostTriggerCollectionDuration().hashCode());
        hashCode = prime * hashCode + ((getDiagnosticsMode() == null) ? 0 : getDiagnosticsMode().hashCode());
        hashCode = prime * hashCode + ((getSpoolingMode() == null) ? 0 : getSpoolingMode().hashCode());
        hashCode = prime * hashCode + ((getCompression() == null) ? 0 : getCompression().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSignalsToCollect() == null) ? 0 : getSignalsToCollect().hashCode());
        hashCode = prime * hashCode + ((getCollectionScheme() == null) ? 0 : getCollectionScheme().hashCode());
        hashCode = prime * hashCode + ((getDataExtraDimensions() == null) ? 0 : getDataExtraDimensions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCampaignRequest clone() {
        return (CreateCampaignRequest) super.clone();
    }

}
