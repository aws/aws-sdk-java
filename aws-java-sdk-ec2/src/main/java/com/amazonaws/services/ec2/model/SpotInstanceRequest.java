/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Spot instance request.
 * </p>
 */
public class SpotInstanceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Spot instance request.
     * </p>
     */
    private String spotInstanceRequestId;
    /**
     * <p>
     * The maximum hourly price (bid) for the Spot instance launched to fulfill the request.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The Spot instance request type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     * requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The fault codes for the Spot instance request, if any.
     * </p>
     */
    private SpotInstanceStateFault fault;
    /**
     * <p>
     * The status code and status message describing the Spot instance request.
     * </p>
     */
    private SpotInstanceStatus status;
    /**
     * <p>
     * The start date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The request becomes active at this date and
     * time.
     * </p>
     */
    private java.util.Date validFrom;
    /**
     * <p>
     * The end date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this is a one-time request, it remains active
     * until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date is reached.
     * </p>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * </p>
     */
    private String launchGroup;
    /**
     * <p>
     * The Availability Zone group. If you specify the same Availability Zone group for all Spot instance requests, all
     * Spot instances are launched in the same Availability Zone.
     * </p>
     */
    private String availabilityZoneGroup;
    /**
     * <p>
     * Additional information for launching instances.
     * </p>
     */
    private LaunchSpecification launchSpecification;
    /**
     * <p>
     * The instance ID, if an instance has been launched to fulfill the Spot instance request.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The date and time when the Spot instance request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The product description associated with the Spot instance.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The duration for the Spot instance, in minutes.
     * </p>
     */
    private Integer blockDurationMinutes;
    /**
     * <p>
     * If you specified a duration and your Spot instance request was fulfilled, this is the fixed hourly price in
     * effect for the Spot instance while it runs.
     * </p>
     */
    private String actualBlockHourlyPrice;
    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The Availability Zone in which the bid is launched.
     * </p>
     */
    private String launchedAvailabilityZone;

    /**
     * <p>
     * The ID of the Spot instance request.
     * </p>
     * 
     * @param spotInstanceRequestId
     *        The ID of the Spot instance request.
     */

    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }

    /**
     * <p>
     * The ID of the Spot instance request.
     * </p>
     * 
     * @return The ID of the Spot instance request.
     */

    public String getSpotInstanceRequestId() {
        return this.spotInstanceRequestId;
    }

    /**
     * <p>
     * The ID of the Spot instance request.
     * </p>
     * 
     * @param spotInstanceRequestId
     *        The ID of the Spot instance request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withSpotInstanceRequestId(String spotInstanceRequestId) {
        setSpotInstanceRequestId(spotInstanceRequestId);
        return this;
    }

    /**
     * <p>
     * The maximum hourly price (bid) for the Spot instance launched to fulfill the request.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price (bid) for the Spot instance launched to fulfill the request.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price (bid) for the Spot instance launched to fulfill the request.
     * </p>
     * 
     * @return The maximum hourly price (bid) for the Spot instance launched to fulfill the request.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price (bid) for the Spot instance launched to fulfill the request.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price (bid) for the Spot instance launched to fulfill the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * 
     * @param type
     *        The Spot instance request type.
     * @see SpotInstanceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * 
     * @return The Spot instance request type.
     * @see SpotInstanceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * 
     * @param type
     *        The Spot instance request type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceType
     */

    public SpotInstanceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * 
     * @param type
     *        The Spot instance request type.
     * @see SpotInstanceType
     */

    public void setType(SpotInstanceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * 
     * @param type
     *        The Spot instance request type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceType
     */

    public SpotInstanceRequest withType(SpotInstanceType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     * requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     *        requests. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see SpotInstanceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     * requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     *         requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see SpotInstanceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     * requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     *        requests. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceState
     */

    public SpotInstanceRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     * requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     *        requests. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see SpotInstanceState
     */

    public void setState(SpotInstanceState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     * requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the Spot instance request. Spot bid status information can help you track your Spot instance
     *        requests. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceState
     */

    public SpotInstanceRequest withState(SpotInstanceState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The fault codes for the Spot instance request, if any.
     * </p>
     * 
     * @param fault
     *        The fault codes for the Spot instance request, if any.
     */

    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }

    /**
     * <p>
     * The fault codes for the Spot instance request, if any.
     * </p>
     * 
     * @return The fault codes for the Spot instance request, if any.
     */

    public SpotInstanceStateFault getFault() {
        return this.fault;
    }

    /**
     * <p>
     * The fault codes for the Spot instance request, if any.
     * </p>
     * 
     * @param fault
     *        The fault codes for the Spot instance request, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withFault(SpotInstanceStateFault fault) {
        setFault(fault);
        return this;
    }

    /**
     * <p>
     * The status code and status message describing the Spot instance request.
     * </p>
     * 
     * @param status
     *        The status code and status message describing the Spot instance request.
     */

    public void setStatus(SpotInstanceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code and status message describing the Spot instance request.
     * </p>
     * 
     * @return The status code and status message describing the Spot instance request.
     */

    public SpotInstanceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status code and status message describing the Spot instance request.
     * </p>
     * 
     * @param status
     *        The status code and status message describing the Spot instance request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withStatus(SpotInstanceStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The start date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The request becomes active at this date and
     * time.
     * </p>
     * 
     * @param validFrom
     *        The start date of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The request becomes active at this date
     *        and time.
     */

    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The request becomes active at this date and
     * time.
     * </p>
     * 
     * @return The start date of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The request becomes active at this date
     *         and time.
     */

    public java.util.Date getValidFrom() {
        return this.validFrom;
    }

    /**
     * <p>
     * The start date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The request becomes active at this date and
     * time.
     * </p>
     * 
     * @param validFrom
     *        The start date of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The request becomes active at this date
     *        and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withValidFrom(java.util.Date validFrom) {
        setValidFrom(validFrom);
        return this;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this is a one-time request, it remains active
     * until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date is reached.
     * </p>
     * 
     * @param validUntil
     *        The end date of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this is a one-time request, it remains
     *        active until all instances launch, the request is canceled, or this date is reached. If the request is
     *        persistent, it remains active until it is canceled or this date is reached.
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this is a one-time request, it remains active
     * until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date is reached.
     * </p>
     * 
     * @return The end date of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this is a one-time request, it
     *         remains active until all instances launch, the request is canceled, or this date is reached. If the
     *         request is persistent, it remains active until it is canceled or this date is reached.
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this is a one-time request, it remains active
     * until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date is reached.
     * </p>
     * 
     * @param validUntil
     *        The end date of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). If this is a one-time request, it remains
     *        active until all instances launch, the request is canceled, or this date is reached. If the request is
     *        persistent, it remains active until it is canceled or this date is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
        return this;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * </p>
     * 
     * @param launchGroup
     *        The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     */

    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * </p>
     * 
     * @return The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     */

    public String getLaunchGroup() {
        return this.launchGroup;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * </p>
     * 
     * @param launchGroup
     *        The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withLaunchGroup(String launchGroup) {
        setLaunchGroup(launchGroup);
        return this;
    }

    /**
     * <p>
     * The Availability Zone group. If you specify the same Availability Zone group for all Spot instance requests, all
     * Spot instances are launched in the same Availability Zone.
     * </p>
     * 
     * @param availabilityZoneGroup
     *        The Availability Zone group. If you specify the same Availability Zone group for all Spot instance
     *        requests, all Spot instances are launched in the same Availability Zone.
     */

    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }

    /**
     * <p>
     * The Availability Zone group. If you specify the same Availability Zone group for all Spot instance requests, all
     * Spot instances are launched in the same Availability Zone.
     * </p>
     * 
     * @return The Availability Zone group. If you specify the same Availability Zone group for all Spot instance
     *         requests, all Spot instances are launched in the same Availability Zone.
     */

    public String getAvailabilityZoneGroup() {
        return this.availabilityZoneGroup;
    }

    /**
     * <p>
     * The Availability Zone group. If you specify the same Availability Zone group for all Spot instance requests, all
     * Spot instances are launched in the same Availability Zone.
     * </p>
     * 
     * @param availabilityZoneGroup
     *        The Availability Zone group. If you specify the same Availability Zone group for all Spot instance
     *        requests, all Spot instances are launched in the same Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        setAvailabilityZoneGroup(availabilityZoneGroup);
        return this;
    }

    /**
     * <p>
     * Additional information for launching instances.
     * </p>
     * 
     * @param launchSpecification
     *        Additional information for launching instances.
     */

    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * <p>
     * Additional information for launching instances.
     * </p>
     * 
     * @return Additional information for launching instances.
     */

    public LaunchSpecification getLaunchSpecification() {
        return this.launchSpecification;
    }

    /**
     * <p>
     * Additional information for launching instances.
     * </p>
     * 
     * @param launchSpecification
     *        Additional information for launching instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withLaunchSpecification(LaunchSpecification launchSpecification) {
        setLaunchSpecification(launchSpecification);
        return this;
    }

    /**
     * <p>
     * The instance ID, if an instance has been launched to fulfill the Spot instance request.
     * </p>
     * 
     * @param instanceId
     *        The instance ID, if an instance has been launched to fulfill the Spot instance request.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID, if an instance has been launched to fulfill the Spot instance request.
     * </p>
     * 
     * @return The instance ID, if an instance has been launched to fulfill the Spot instance request.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID, if an instance has been launched to fulfill the Spot instance request.
     * </p>
     * 
     * @param instanceId
     *        The instance ID, if an instance has been launched to fulfill the Spot instance request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The date and time when the Spot instance request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param createTime
     *        The date and time when the Spot instance request was created, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time when the Spot instance request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @return The date and time when the Spot instance request was created, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time when the Spot instance request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param createTime
     *        The date and time when the Spot instance request was created, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The product description associated with the Spot instance.
     * </p>
     * 
     * @param productDescription
     *        The product description associated with the Spot instance.
     * @see RIProductDescription
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The product description associated with the Spot instance.
     * </p>
     * 
     * @return The product description associated with the Spot instance.
     * @see RIProductDescription
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The product description associated with the Spot instance.
     * </p>
     * 
     * @param productDescription
     *        The product description associated with the Spot instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RIProductDescription
     */

    public SpotInstanceRequest withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The product description associated with the Spot instance.
     * </p>
     * 
     * @param productDescription
     *        The product description associated with the Spot instance.
     * @see RIProductDescription
     */

    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }

    /**
     * <p>
     * The product description associated with the Spot instance.
     * </p>
     * 
     * @param productDescription
     *        The product description associated with the Spot instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RIProductDescription
     */

    public SpotInstanceRequest withProductDescription(RIProductDescription productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The duration for the Spot instance, in minutes.
     * </p>
     * 
     * @param blockDurationMinutes
     *        The duration for the Spot instance, in minutes.
     */

    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    /**
     * <p>
     * The duration for the Spot instance, in minutes.
     * </p>
     * 
     * @return The duration for the Spot instance, in minutes.
     */

    public Integer getBlockDurationMinutes() {
        return this.blockDurationMinutes;
    }

    /**
     * <p>
     * The duration for the Spot instance, in minutes.
     * </p>
     * 
     * @param blockDurationMinutes
     *        The duration for the Spot instance, in minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withBlockDurationMinutes(Integer blockDurationMinutes) {
        setBlockDurationMinutes(blockDurationMinutes);
        return this;
    }

    /**
     * <p>
     * If you specified a duration and your Spot instance request was fulfilled, this is the fixed hourly price in
     * effect for the Spot instance while it runs.
     * </p>
     * 
     * @param actualBlockHourlyPrice
     *        If you specified a duration and your Spot instance request was fulfilled, this is the fixed hourly price
     *        in effect for the Spot instance while it runs.
     */

    public void setActualBlockHourlyPrice(String actualBlockHourlyPrice) {
        this.actualBlockHourlyPrice = actualBlockHourlyPrice;
    }

    /**
     * <p>
     * If you specified a duration and your Spot instance request was fulfilled, this is the fixed hourly price in
     * effect for the Spot instance while it runs.
     * </p>
     * 
     * @return If you specified a duration and your Spot instance request was fulfilled, this is the fixed hourly price
     *         in effect for the Spot instance while it runs.
     */

    public String getActualBlockHourlyPrice() {
        return this.actualBlockHourlyPrice;
    }

    /**
     * <p>
     * If you specified a duration and your Spot instance request was fulfilled, this is the fixed hourly price in
     * effect for the Spot instance while it runs.
     * </p>
     * 
     * @param actualBlockHourlyPrice
     *        If you specified a duration and your Spot instance request was fulfilled, this is the fixed hourly price
     *        in effect for the Spot instance while it runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withActualBlockHourlyPrice(String actualBlockHourlyPrice) {
        setActualBlockHourlyPrice(actualBlockHourlyPrice);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @return Any tags assigned to the resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the bid is launched.
     * </p>
     * 
     * @param launchedAvailabilityZone
     *        The Availability Zone in which the bid is launched.
     */

    public void setLaunchedAvailabilityZone(String launchedAvailabilityZone) {
        this.launchedAvailabilityZone = launchedAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the bid is launched.
     * </p>
     * 
     * @return The Availability Zone in which the bid is launched.
     */

    public String getLaunchedAvailabilityZone() {
        return this.launchedAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the bid is launched.
     * </p>
     * 
     * @param launchedAvailabilityZone
     *        The Availability Zone in which the bid is launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotInstanceRequest withLaunchedAvailabilityZone(String launchedAvailabilityZone) {
        setLaunchedAvailabilityZone(launchedAvailabilityZone);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSpotInstanceRequestId() != null)
            sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getFault() != null)
            sb.append("Fault: " + getFault() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getLaunchGroup() != null)
            sb.append("LaunchGroup: " + getLaunchGroup() + ",");
        if (getAvailabilityZoneGroup() != null)
            sb.append("AvailabilityZoneGroup: " + getAvailabilityZoneGroup() + ",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: " + getLaunchSpecification() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getBlockDurationMinutes() != null)
            sb.append("BlockDurationMinutes: " + getBlockDurationMinutes() + ",");
        if (getActualBlockHourlyPrice() != null)
            sb.append("ActualBlockHourlyPrice: " + getActualBlockHourlyPrice() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getLaunchedAvailabilityZone() != null)
            sb.append("LaunchedAvailabilityZone: " + getLaunchedAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotInstanceRequest == false)
            return false;
        SpotInstanceRequest other = (SpotInstanceRequest) obj;
        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null)
            return false;
        if (other.getSpotInstanceRequestId() != null && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getFault() == null ^ this.getFault() == null)
            return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getValidFrom() == null ^ this.getValidFrom() == null)
            return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getLaunchGroup() == null ^ this.getLaunchGroup() == null)
            return false;
        if (other.getLaunchGroup() != null && other.getLaunchGroup().equals(this.getLaunchGroup()) == false)
            return false;
        if (other.getAvailabilityZoneGroup() == null ^ this.getAvailabilityZoneGroup() == null)
            return false;
        if (other.getAvailabilityZoneGroup() != null && other.getAvailabilityZoneGroup().equals(this.getAvailabilityZoneGroup()) == false)
            return false;
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null)
            return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getBlockDurationMinutes() == null ^ this.getBlockDurationMinutes() == null)
            return false;
        if (other.getBlockDurationMinutes() != null && other.getBlockDurationMinutes().equals(this.getBlockDurationMinutes()) == false)
            return false;
        if (other.getActualBlockHourlyPrice() == null ^ this.getActualBlockHourlyPrice() == null)
            return false;
        if (other.getActualBlockHourlyPrice() != null && other.getActualBlockHourlyPrice().equals(this.getActualBlockHourlyPrice()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLaunchedAvailabilityZone() == null ^ this.getLaunchedAvailabilityZone() == null)
            return false;
        if (other.getLaunchedAvailabilityZone() != null && other.getLaunchedAvailabilityZone().equals(this.getLaunchedAvailabilityZone()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getBlockDurationMinutes() == null) ? 0 : getBlockDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getActualBlockHourlyPrice() == null) ? 0 : getActualBlockHourlyPrice().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAvailabilityZone() == null) ? 0 : getLaunchedAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public SpotInstanceRequest clone() {
        try {
            return (SpotInstanceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
