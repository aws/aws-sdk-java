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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetCampaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCampaignResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the campaign.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The description of the campaign.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of a signal catalog.
     * </p>
     */
    private String signalCatalogArn;
    /**
     * <p>
     * The ARN of the vehicle or the fleet targeted by the campaign.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The state of the campaign. The status can be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>,
     * <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time, in milliseconds, to deliver a campaign after it was approved.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle data won't
     * be collected after the campaign expires.
     * </p>
     */
    private java.util.Date expiryTime;
    /**
     * <p>
     * How long (in seconds) to collect raw data after a triggering event initiates the collection.
     * </p>
     */
    private Long postTriggerCollectionDuration;
    /**
     * <p>
     * Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * </p>
     */
    private String diagnosticsMode;
    /**
     * <p>
     * Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     * re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * </p>
     */
    private String spoolingMode;
    /**
     * <p>
     * Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If <code>OFF</code> is
     * specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     */
    private String compression;
    /**
     * <p>
     * A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A campaign
     * with the lowest value is deployed to vehicles before any other campaigns.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * Information about a list of signals to collect data on.
     * </p>
     */
    private java.util.List<SignalInformation> signalsToCollect;
    /**
     * <p>
     * Information about the data collection scheme associated with the campaign.
     * </p>
     */
    private CollectionScheme collectionScheme;
    /**
     * <p>
     * A list of vehicle attributes associated with the campaign.
     * </p>
     */
    private java.util.List<String> dataExtraDimensions;
    /**
     * <p>
     * The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the campaign was modified.
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @param name
     *        The name of the campaign.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @return The name of the campaign.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @param name
     *        The name of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the campaign.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the campaign.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The description of the campaign.
     * </p>
     * 
     * @param description
     *        The description of the campaign.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the campaign.
     * </p>
     * 
     * @return The description of the campaign.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the campaign.
     * </p>
     * 
     * @param description
     *        The description of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of a signal catalog.
     * </p>
     * 
     * @param signalCatalogArn
     *        The ARN of a signal catalog.
     */

    public void setSignalCatalogArn(String signalCatalogArn) {
        this.signalCatalogArn = signalCatalogArn;
    }

    /**
     * <p>
     * The ARN of a signal catalog.
     * </p>
     * 
     * @return The ARN of a signal catalog.
     */

    public String getSignalCatalogArn() {
        return this.signalCatalogArn;
    }

    /**
     * <p>
     * The ARN of a signal catalog.
     * </p>
     * 
     * @param signalCatalogArn
     *        The ARN of a signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withSignalCatalogArn(String signalCatalogArn) {
        setSignalCatalogArn(signalCatalogArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the vehicle or the fleet targeted by the campaign.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the vehicle or the fleet targeted by the campaign.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the vehicle or the fleet targeted by the campaign.
     * </p>
     * 
     * @return The ARN of the vehicle or the fleet targeted by the campaign.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of the vehicle or the fleet targeted by the campaign.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the vehicle or the fleet targeted by the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The state of the campaign. The status can be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>,
     * <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * </p>
     * 
     * @param status
     *        The state of the campaign. The status can be one of: <code>CREATING</code>,
     *        <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * @see CampaignStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the campaign. The status can be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>,
     * <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * </p>
     * 
     * @return The state of the campaign. The status can be one of: <code>CREATING</code>,
     *         <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * @see CampaignStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the campaign. The status can be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>,
     * <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * </p>
     * 
     * @param status
     *        The state of the campaign. The status can be one of: <code>CREATING</code>,
     *        <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CampaignStatus
     */

    public GetCampaignResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the campaign. The status can be one of: <code>CREATING</code>, <code>WAITING_FOR_APPROVAL</code>,
     * <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * </p>
     * 
     * @param status
     *        The state of the campaign. The status can be one of: <code>CREATING</code>,
     *        <code>WAITING_FOR_APPROVAL</code>, <code>RUNNING</code>, and <code>SUSPENDED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CampaignStatus
     */

    public GetCampaignResult withStatus(CampaignStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds, to deliver a campaign after it was approved.
     * </p>
     * 
     * @param startTime
     *        The time, in milliseconds, to deliver a campaign after it was approved.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time, in milliseconds, to deliver a campaign after it was approved.
     * </p>
     * 
     * @return The time, in milliseconds, to deliver a campaign after it was approved.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time, in milliseconds, to deliver a campaign after it was approved.
     * </p>
     * 
     * @param startTime
     *        The time, in milliseconds, to deliver a campaign after it was approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle data won't
     * be collected after the campaign expires.
     * </p>
     * 
     * @param expiryTime
     *        The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle data
     *        won't be collected after the campaign expires.
     */

    public void setExpiryTime(java.util.Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * <p>
     * The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle data won't
     * be collected after the campaign expires.
     * </p>
     * 
     * @return The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle
     *         data won't be collected after the campaign expires.
     */

    public java.util.Date getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * <p>
     * The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle data won't
     * be collected after the campaign expires.
     * </p>
     * 
     * @param expiryTime
     *        The time the campaign expires, in seconds since epoch (January 1, 1970 at midnight UTC time). Vehicle data
     *        won't be collected after the campaign expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withExpiryTime(java.util.Date expiryTime) {
        setExpiryTime(expiryTime);
        return this;
    }

    /**
     * <p>
     * How long (in seconds) to collect raw data after a triggering event initiates the collection.
     * </p>
     * 
     * @param postTriggerCollectionDuration
     *        How long (in seconds) to collect raw data after a triggering event initiates the collection.
     */

    public void setPostTriggerCollectionDuration(Long postTriggerCollectionDuration) {
        this.postTriggerCollectionDuration = postTriggerCollectionDuration;
    }

    /**
     * <p>
     * How long (in seconds) to collect raw data after a triggering event initiates the collection.
     * </p>
     * 
     * @return How long (in seconds) to collect raw data after a triggering event initiates the collection.
     */

    public Long getPostTriggerCollectionDuration() {
        return this.postTriggerCollectionDuration;
    }

    /**
     * <p>
     * How long (in seconds) to collect raw data after a triggering event initiates the collection.
     * </p>
     * 
     * @param postTriggerCollectionDuration
     *        How long (in seconds) to collect raw data after a triggering event initiates the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withPostTriggerCollectionDuration(Long postTriggerCollectionDuration) {
        setPostTriggerCollectionDuration(postTriggerCollectionDuration);
        return this;
    }

    /**
     * <p>
     * Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * </p>
     * 
     * @param diagnosticsMode
     *        Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * @see DiagnosticsMode
     */

    public void setDiagnosticsMode(String diagnosticsMode) {
        this.diagnosticsMode = diagnosticsMode;
    }

    /**
     * <p>
     * Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * </p>
     * 
     * @return Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * @see DiagnosticsMode
     */

    public String getDiagnosticsMode() {
        return this.diagnosticsMode;
    }

    /**
     * <p>
     * Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * </p>
     * 
     * @param diagnosticsMode
     *        Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiagnosticsMode
     */

    public GetCampaignResult withDiagnosticsMode(String diagnosticsMode) {
        setDiagnosticsMode(diagnosticsMode);
        return this;
    }

    /**
     * <p>
     * Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * </p>
     * 
     * @param diagnosticsMode
     *        Option for a vehicle to send diagnostic trouble codes to Amazon Web Services IoT FleetWise.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiagnosticsMode
     */

    public GetCampaignResult withDiagnosticsMode(DiagnosticsMode diagnosticsMode) {
        this.diagnosticsMode = diagnosticsMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     * re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * </p>
     * 
     * @param spoolingMode
     *        Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     *        re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * @see SpoolingMode
     */

    public void setSpoolingMode(String spoolingMode) {
        this.spoolingMode = spoolingMode;
    }

    /**
     * <p>
     * Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     * re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * </p>
     * 
     * @return Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     *         re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * @see SpoolingMode
     */

    public String getSpoolingMode() {
        return this.spoolingMode;
    }

    /**
     * <p>
     * Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     * re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * </p>
     * 
     * @param spoolingMode
     *        Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     *        re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpoolingMode
     */

    public GetCampaignResult withSpoolingMode(String spoolingMode) {
        setSpoolingMode(spoolingMode);
        return this;
    }

    /**
     * <p>
     * Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     * re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * </p>
     * 
     * @param spoolingMode
     *        Whether to store collected data after a vehicle lost a connection with the cloud. After a connection is
     *        re-established, the data is automatically forwarded to Amazon Web Services IoT FleetWise.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpoolingMode
     */

    public GetCampaignResult withSpoolingMode(SpoolingMode spoolingMode) {
        this.spoolingMode = spoolingMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If <code>OFF</code> is
     * specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * 
     * @param compression
     *        Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If
     *        <code>OFF</code> is specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code>
     *        is used.
     * @see Compression
     */

    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * <p>
     * Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If <code>OFF</code> is
     * specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * 
     * @return Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If
     *         <code>OFF</code> is specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code>
     *         is used.
     * @see Compression
     */

    public String getCompression() {
        return this.compression;
    }

    /**
     * <p>
     * Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If <code>OFF</code> is
     * specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * 
     * @param compression
     *        Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If
     *        <code>OFF</code> is specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code>
     *        is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compression
     */

    public GetCampaignResult withCompression(String compression) {
        setCompression(compression);
        return this;
    }

    /**
     * <p>
     * Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If <code>OFF</code> is
     * specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code> is used.
     * </p>
     * 
     * @param compression
     *        Whether to compress signals before transmitting data to Amazon Web Services IoT FleetWise. If
     *        <code>OFF</code> is specified, the signals aren't compressed. If it's not specified, <code>SNAPPY</code>
     *        is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compression
     */

    public GetCampaignResult withCompression(Compression compression) {
        this.compression = compression.toString();
        return this;
    }

    /**
     * <p>
     * A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A campaign
     * with the lowest value is deployed to vehicles before any other campaigns.
     * </p>
     * 
     * @param priority
     *        A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A
     *        campaign with the lowest value is deployed to vehicles before any other campaigns.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A campaign
     * with the lowest value is deployed to vehicles before any other campaigns.
     * </p>
     * 
     * @return A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A
     *         campaign with the lowest value is deployed to vehicles before any other campaigns.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A campaign
     * with the lowest value is deployed to vehicles before any other campaigns.
     * </p>
     * 
     * @param priority
     *        A number indicating the priority of one campaign over another campaign for a certain vehicle or fleet. A
     *        campaign with the lowest value is deployed to vehicles before any other campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Information about a list of signals to collect data on.
     * </p>
     * 
     * @return Information about a list of signals to collect data on.
     */

    public java.util.List<SignalInformation> getSignalsToCollect() {
        return signalsToCollect;
    }

    /**
     * <p>
     * Information about a list of signals to collect data on.
     * </p>
     * 
     * @param signalsToCollect
     *        Information about a list of signals to collect data on.
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
     * Information about a list of signals to collect data on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignalsToCollect(java.util.Collection)} or {@link #withSignalsToCollect(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param signalsToCollect
     *        Information about a list of signals to collect data on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withSignalsToCollect(SignalInformation... signalsToCollect) {
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
     * Information about a list of signals to collect data on.
     * </p>
     * 
     * @param signalsToCollect
     *        Information about a list of signals to collect data on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withSignalsToCollect(java.util.Collection<SignalInformation> signalsToCollect) {
        setSignalsToCollect(signalsToCollect);
        return this;
    }

    /**
     * <p>
     * Information about the data collection scheme associated with the campaign.
     * </p>
     * 
     * @param collectionScheme
     *        Information about the data collection scheme associated with the campaign.
     */

    public void setCollectionScheme(CollectionScheme collectionScheme) {
        this.collectionScheme = collectionScheme;
    }

    /**
     * <p>
     * Information about the data collection scheme associated with the campaign.
     * </p>
     * 
     * @return Information about the data collection scheme associated with the campaign.
     */

    public CollectionScheme getCollectionScheme() {
        return this.collectionScheme;
    }

    /**
     * <p>
     * Information about the data collection scheme associated with the campaign.
     * </p>
     * 
     * @param collectionScheme
     *        Information about the data collection scheme associated with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withCollectionScheme(CollectionScheme collectionScheme) {
        setCollectionScheme(collectionScheme);
        return this;
    }

    /**
     * <p>
     * A list of vehicle attributes associated with the campaign.
     * </p>
     * 
     * @return A list of vehicle attributes associated with the campaign.
     */

    public java.util.List<String> getDataExtraDimensions() {
        return dataExtraDimensions;
    }

    /**
     * <p>
     * A list of vehicle attributes associated with the campaign.
     * </p>
     * 
     * @param dataExtraDimensions
     *        A list of vehicle attributes associated with the campaign.
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
     * A list of vehicle attributes associated with the campaign.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataExtraDimensions(java.util.Collection)} or {@link #withDataExtraDimensions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dataExtraDimensions
     *        A list of vehicle attributes associated with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withDataExtraDimensions(String... dataExtraDimensions) {
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
     * A list of vehicle attributes associated with the campaign.
     * </p>
     * 
     * @param dataExtraDimensions
     *        A list of vehicle attributes associated with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withDataExtraDimensions(java.util.Collection<String> dataExtraDimensions) {
        setDataExtraDimensions(dataExtraDimensions);
        return this;
    }

    /**
     * <p>
     * The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the campaign was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the campaign was modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The last time the campaign was modified.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The last time the campaign was modified.
     * </p>
     * 
     * @return The last time the campaign was modified.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The last time the campaign was modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The last time the campaign was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSignalCatalogArn() != null)
            sb.append("SignalCatalogArn: ").append(getSignalCatalogArn()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignResult == false)
            return false;
        GetCampaignResult other = (GetCampaignResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSignalCatalogArn() == null) ? 0 : getSignalCatalogArn().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public GetCampaignResult clone() {
        try {
            return (GetCampaignResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
