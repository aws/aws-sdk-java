/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describe a Spot Instance request.
 * </p>
 */
public class SpotInstanceRequest implements Serializable {

    /**
     * The ID of the Spot Instance request.
     */
    private String spotInstanceRequestId;

    /**
     * The maximum hourly price for any Spot Instance launched to fulfill the
     * request.
     */
    private String spotPrice;

    /**
     * The Spot Instance request type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     */
    private String type;

    /**
     * The state of the Spot Instance request. Spot bid status information
     * can help you track your Spot Instance requests. For information, see
     * <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     * Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     */
    private String state;

    /**
     * The fault codes for the Spot Instance request, if any.
     */
    private SpotInstanceStateFault fault;

    /**
     * The status code and status message describing the Spot Instance
     * request.
     */
    private SpotInstanceStatus status;

    /**
     * The start date of the request. If this is a one-time request, the
     * request becomes active at this date and time and remains active until
     * all instances launch, the request expires, or the request is canceled.
     * If the request is persistent, the request becomes active at this date
     * and time and remains active until it expires or is canceled.
     */
    private java.util.Date validFrom;

    /**
     * The end date of the request. If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date is reached.
     */
    private java.util.Date validUntil;

    /**
     * The instance launch group. Launch groups are Spot Instances that
     * launch together and terminate together.
     */
    private String launchGroup;

    /**
     * The Availability Zone group. If you specify the same Availability Zone
     * group for all Spot Instance requests, all Spot Instances are launched
     * in the same Availability Zone.
     */
    private String availabilityZoneGroup;

    /**
     * Additional information for launching instances.
     */
    private LaunchSpecification launchSpecification;

    /**
     * The instance ID, if an instance has been launched to fulfill the Spot
     * Instance request.
     */
    private String instanceId;

    /**
     * The time stamp when the Spot Instance request was created.
     */
    private java.util.Date createTime;

    /**
     * The product description associated with the Spot Instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * Any tags assigned to the resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The Availability Zone in which the bid is launched.
     */
    private String launchedAvailabilityZone;

    /**
     * The ID of the Spot Instance request.
     *
     * @return The ID of the Spot Instance request.
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }
    
    /**
     * The ID of the Spot Instance request.
     *
     * @param spotInstanceRequestId The ID of the Spot Instance request.
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }
    
    /**
     * The ID of the Spot Instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestId The ID of the Spot Instance request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
        return this;
    }

    /**
     * The maximum hourly price for any Spot Instance launched to fulfill the
     * request.
     *
     * @return The maximum hourly price for any Spot Instance launched to fulfill the
     *         request.
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * The maximum hourly price for any Spot Instance launched to fulfill the
     * request.
     *
     * @param spotPrice The maximum hourly price for any Spot Instance launched to fulfill the
     *         request.
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * The maximum hourly price for any Spot Instance launched to fulfill the
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPrice The maximum hourly price for any Spot Instance launched to fulfill the
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * The Spot Instance request type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @return The Spot Instance request type.
     *
     * @see SpotInstanceType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The Spot Instance request type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The Spot Instance request type.
     *
     * @see SpotInstanceType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The Spot Instance request type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The Spot Instance request type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceType
     */
    public SpotInstanceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The Spot Instance request type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The Spot Instance request type.
     *
     * @see SpotInstanceType
     */
    public void setType(SpotInstanceType type) {
        this.type = type.toString();
    }
    
    /**
     * The Spot Instance request type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The Spot Instance request type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceType
     */
    public SpotInstanceRequest withType(SpotInstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The state of the Spot Instance request. Spot bid status information
     * can help you track your Spot Instance requests. For information, see
     * <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     * Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @return The state of the Spot Instance request. Spot bid status information
     *         can help you track your Spot Instance requests. For information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     *         Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *
     * @see SpotInstanceState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the Spot Instance request. Spot bid status information
     * can help you track your Spot Instance requests. For information, see
     * <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     * Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state The state of the Spot Instance request. Spot bid status information
     *         can help you track your Spot Instance requests. For information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     *         Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *
     * @see SpotInstanceState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the Spot Instance request. Spot bid status information
     * can help you track your Spot Instance requests. For information, see
     * <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     * Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state The state of the Spot Instance request. Spot bid status information
     *         can help you track your Spot Instance requests. For information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     *         Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceState
     */
    public SpotInstanceRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the Spot Instance request. Spot bid status information
     * can help you track your Spot Instance requests. For information, see
     * <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     * Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state The state of the Spot Instance request. Spot bid status information
     *         can help you track your Spot Instance requests. For information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     *         Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *
     * @see SpotInstanceState
     */
    public void setState(SpotInstanceState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the Spot Instance request. Spot bid status information
     * can help you track your Spot Instance requests. For information, see
     * <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     * Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state The state of the Spot Instance request. Spot bid status information
     *         can help you track your Spot Instance requests. For information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-bid-status.html">Tracking
     *         Spot Requests with Bid Status Codes</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceState
     */
    public SpotInstanceRequest withState(SpotInstanceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The fault codes for the Spot Instance request, if any.
     *
     * @return The fault codes for the Spot Instance request, if any.
     */
    public SpotInstanceStateFault getFault() {
        return fault;
    }
    
    /**
     * The fault codes for the Spot Instance request, if any.
     *
     * @param fault The fault codes for the Spot Instance request, if any.
     */
    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }
    
    /**
     * The fault codes for the Spot Instance request, if any.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fault The fault codes for the Spot Instance request, if any.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withFault(SpotInstanceStateFault fault) {
        this.fault = fault;
        return this;
    }

    /**
     * The status code and status message describing the Spot Instance
     * request.
     *
     * @return The status code and status message describing the Spot Instance
     *         request.
     */
    public SpotInstanceStatus getStatus() {
        return status;
    }
    
    /**
     * The status code and status message describing the Spot Instance
     * request.
     *
     * @param status The status code and status message describing the Spot Instance
     *         request.
     */
    public void setStatus(SpotInstanceStatus status) {
        this.status = status;
    }
    
    /**
     * The status code and status message describing the Spot Instance
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status code and status message describing the Spot Instance
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withStatus(SpotInstanceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * The start date of the request. If this is a one-time request, the
     * request becomes active at this date and time and remains active until
     * all instances launch, the request expires, or the request is canceled.
     * If the request is persistent, the request becomes active at this date
     * and time and remains active until it expires or is canceled.
     *
     * @return The start date of the request. If this is a one-time request, the
     *         request becomes active at this date and time and remains active until
     *         all instances launch, the request expires, or the request is canceled.
     *         If the request is persistent, the request becomes active at this date
     *         and time and remains active until it expires or is canceled.
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }
    
    /**
     * The start date of the request. If this is a one-time request, the
     * request becomes active at this date and time and remains active until
     * all instances launch, the request expires, or the request is canceled.
     * If the request is persistent, the request becomes active at this date
     * and time and remains active until it expires or is canceled.
     *
     * @param validFrom The start date of the request. If this is a one-time request, the
     *         request becomes active at this date and time and remains active until
     *         all instances launch, the request expires, or the request is canceled.
     *         If the request is persistent, the request becomes active at this date
     *         and time and remains active until it expires or is canceled.
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }
    
    /**
     * The start date of the request. If this is a one-time request, the
     * request becomes active at this date and time and remains active until
     * all instances launch, the request expires, or the request is canceled.
     * If the request is persistent, the request becomes active at this date
     * and time and remains active until it expires or is canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validFrom The start date of the request. If this is a one-time request, the
     *         request becomes active at this date and time and remains active until
     *         all instances launch, the request expires, or the request is canceled.
     *         If the request is persistent, the request becomes active at this date
     *         and time and remains active until it expires or is canceled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * The end date of the request. If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date is reached.
     *
     * @return The end date of the request. If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date is reached.
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }
    
    /**
     * The end date of the request. If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date is reached.
     *
     * @param validUntil The end date of the request. If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date is reached.
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }
    
    /**
     * The end date of the request. If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date is reached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validUntil The end date of the request. If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date is reached.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * The instance launch group. Launch groups are Spot Instances that
     * launch together and terminate together.
     *
     * @return The instance launch group. Launch groups are Spot Instances that
     *         launch together and terminate together.
     */
    public String getLaunchGroup() {
        return launchGroup;
    }
    
    /**
     * The instance launch group. Launch groups are Spot Instances that
     * launch together and terminate together.
     *
     * @param launchGroup The instance launch group. Launch groups are Spot Instances that
     *         launch together and terminate together.
     */
    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }
    
    /**
     * The instance launch group. Launch groups are Spot Instances that
     * launch together and terminate together.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchGroup The instance launch group. Launch groups are Spot Instances that
     *         launch together and terminate together.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
        return this;
    }

    /**
     * The Availability Zone group. If you specify the same Availability Zone
     * group for all Spot Instance requests, all Spot Instances are launched
     * in the same Availability Zone.
     *
     * @return The Availability Zone group. If you specify the same Availability Zone
     *         group for all Spot Instance requests, all Spot Instances are launched
     *         in the same Availability Zone.
     */
    public String getAvailabilityZoneGroup() {
        return availabilityZoneGroup;
    }
    
    /**
     * The Availability Zone group. If you specify the same Availability Zone
     * group for all Spot Instance requests, all Spot Instances are launched
     * in the same Availability Zone.
     *
     * @param availabilityZoneGroup The Availability Zone group. If you specify the same Availability Zone
     *         group for all Spot Instance requests, all Spot Instances are launched
     *         in the same Availability Zone.
     */
    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }
    
    /**
     * The Availability Zone group. If you specify the same Availability Zone
     * group for all Spot Instance requests, all Spot Instances are launched
     * in the same Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZoneGroup The Availability Zone group. If you specify the same Availability Zone
     *         group for all Spot Instance requests, all Spot Instances are launched
     *         in the same Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
        return this;
    }

    /**
     * Additional information for launching instances.
     *
     * @return Additional information for launching instances.
     */
    public LaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }
    
    /**
     * Additional information for launching instances.
     *
     * @param launchSpecification Additional information for launching instances.
     */
    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }
    
    /**
     * Additional information for launching instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchSpecification Additional information for launching instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * The instance ID, if an instance has been launched to fulfill the Spot
     * Instance request.
     *
     * @return The instance ID, if an instance has been launched to fulfill the Spot
     *         Instance request.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID, if an instance has been launched to fulfill the Spot
     * Instance request.
     *
     * @param instanceId The instance ID, if an instance has been launched to fulfill the Spot
     *         Instance request.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID, if an instance has been launched to fulfill the Spot
     * Instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID, if an instance has been launched to fulfill the Spot
     *         Instance request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The time stamp when the Spot Instance request was created.
     *
     * @return The time stamp when the Spot Instance request was created.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * The time stamp when the Spot Instance request was created.
     *
     * @param createTime The time stamp when the Spot Instance request was created.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * The time stamp when the Spot Instance request was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime The time stamp when the Spot Instance request was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * The product description associated with the Spot Instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @return The product description associated with the Spot Instance.
     *
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The product description associated with the Spot Instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The product description associated with the Spot Instance.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The product description associated with the Spot Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The product description associated with the Spot Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RIProductDescription
     */
    public SpotInstanceRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The product description associated with the Spot Instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The product description associated with the Spot Instance.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }
    
    /**
     * The product description associated with the Spot Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The product description associated with the Spot Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RIProductDescription
     */
    public SpotInstanceRequest withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * Any tags assigned to the resource.
     *
     * @return Any tags assigned to the resource.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the resource.
     *
     * @param tags Any tags assigned to the resource.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * The Availability Zone in which the bid is launched.
     *
     * @return The Availability Zone in which the bid is launched.
     */
    public String getLaunchedAvailabilityZone() {
        return launchedAvailabilityZone;
    }
    
    /**
     * The Availability Zone in which the bid is launched.
     *
     * @param launchedAvailabilityZone The Availability Zone in which the bid is launched.
     */
    public void setLaunchedAvailabilityZone(String launchedAvailabilityZone) {
        this.launchedAvailabilityZone = launchedAvailabilityZone;
    }
    
    /**
     * The Availability Zone in which the bid is launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchedAvailabilityZone The Availability Zone in which the bid is launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withLaunchedAvailabilityZone(String launchedAvailabilityZone) {
        this.launchedAvailabilityZone = launchedAvailabilityZone;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSpotInstanceRequestId() != null) sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId() + ",");
        if (getSpotPrice() != null) sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getFault() != null) sb.append("Fault: " + getFault() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getValidFrom() != null) sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null) sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getLaunchGroup() != null) sb.append("LaunchGroup: " + getLaunchGroup() + ",");
        if (getAvailabilityZoneGroup() != null) sb.append("AvailabilityZoneGroup: " + getAvailabilityZoneGroup() + ",");
        if (getLaunchSpecification() != null) sb.append("LaunchSpecification: " + getLaunchSpecification() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getLaunchedAvailabilityZone() != null) sb.append("LaunchedAvailabilityZone: " + getLaunchedAvailabilityZone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotInstanceRequestId() == null) ? 0 : getSpotInstanceRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode()); 
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchGroup() == null) ? 0 : getLaunchGroup().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZoneGroup() == null) ? 0 : getAvailabilityZoneGroup().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchedAvailabilityZone() == null) ? 0 : getLaunchedAvailabilityZone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotInstanceRequest == false) return false;
        SpotInstanceRequest other = (SpotInstanceRequest)obj;
        
        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null) return false;
        if (other.getSpotInstanceRequestId() != null && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false) return false; 
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null) return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getFault() == null ^ this.getFault() == null) return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getValidFrom() == null ^ this.getValidFrom() == null) return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false) return false; 
        if (other.getValidUntil() == null ^ this.getValidUntil() == null) return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false) return false; 
        if (other.getLaunchGroup() == null ^ this.getLaunchGroup() == null) return false;
        if (other.getLaunchGroup() != null && other.getLaunchGroup().equals(this.getLaunchGroup()) == false) return false; 
        if (other.getAvailabilityZoneGroup() == null ^ this.getAvailabilityZoneGroup() == null) return false;
        if (other.getAvailabilityZoneGroup() != null && other.getAvailabilityZoneGroup().equals(this.getAvailabilityZoneGroup()) == false) return false; 
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null) return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getLaunchedAvailabilityZone() == null ^ this.getLaunchedAvailabilityZone() == null) return false;
        if (other.getLaunchedAvailabilityZone() != null && other.getLaunchedAvailabilityZone().equals(this.getLaunchedAvailabilityZone()) == false) return false; 
        return true;
    }
    
}
    