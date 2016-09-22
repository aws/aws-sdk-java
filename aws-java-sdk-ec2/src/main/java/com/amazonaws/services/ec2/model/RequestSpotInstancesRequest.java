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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RequestSpotInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for RequestSpotInstances.
 * </p>
 */
public class RequestSpotInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RequestSpotInstancesRequest> {

    /**
     * <p>
     * The maximum hourly price (bid) for any Spot instance launched to fulfill the request.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The maximum number of Spot instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     */
    private String type;
    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request becomes active at this date and time
     * and remains active until all instances launch, the request expires, or the request is canceled. If the request is
     * persistent, the request becomes active at this date and time and remains active until it expires or is canceled.
     * </p>
     * <p>
     * Default: The request is effective indefinitely.
     * </p>
     */
    private java.util.Date validFrom;
    /**
     * <p>
     * The end date of the request. If this is a one-time request, the request remains active until all instances
     * launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until
     * it is canceled or this date and time is reached.
     * </p>
     * <p>
     * Default: The request is effective indefinitely.
     * </p>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     */
    private String launchGroup;
    /**
     * <p>
     * The user-specified name for a logical grouping of bids.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request, all Spot instances in the request are
     * launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of
     * Availability Zone is not. The group applies only to bids for Spot Instances of the same instance type. Any
     * additional Spot instance requests that are specified with the same Availability Zone group name are launched in
     * that same Availability Zone, as long as at least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group that you specify for a new Spot instance
     * request (all instances are terminated, the bid is expired, or the bid falls below current market), then Amazon
     * EC2 launches the instance in any Availability Zone where the constraint can be met. Consequently, the subsequent
     * set of Spot instances could be placed in a different zone from the original request, even if you specified the
     * same Availability Zone group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     */
    private String availabilityZoneGroup;
    /**
     * <p>
     * The required duration for the Spot instances (also known as Spot blocks), in minutes. This value must be a
     * multiple of 60 (60, 120, 180, 240, 300, or 360).
     * </p>
     * <p>
     * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration
     * period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which
     * gives the instance a two-minute warning before it terminates.
     * </p>
     * <p>
     * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
     * </p>
     */
    private Integer blockDurationMinutes;

    private LaunchSpecification launchSpecification;

    /**
     * Default constructor for RequestSpotInstancesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public RequestSpotInstancesRequest() {
    }

    /**
     * Constructs a new RequestSpotInstancesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param spotPrice
     *        The maximum hourly price (bid) for any Spot instance launched to fulfill the request.
     */
    public RequestSpotInstancesRequest(String spotPrice) {
        setSpotPrice(spotPrice);
    }

    /**
     * <p>
     * The maximum hourly price (bid) for any Spot instance launched to fulfill the request.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price (bid) for any Spot instance launched to fulfill the request.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price (bid) for any Spot instance launched to fulfill the request.
     * </p>
     * 
     * @return The maximum hourly price (bid) for any Spot instance launched to fulfill the request.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price (bid) for any Spot instance launched to fulfill the request.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price (bid) for any Spot instance launched to fulfill the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of Spot instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param instanceCount
     *        The maximum number of Spot instances to launch.</p>
     *        <p>
     *        Default: 1
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The maximum number of Spot instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @return The maximum number of Spot instances to launch.</p>
     *         <p>
     *         Default: 1
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The maximum number of Spot instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param instanceCount
     *        The maximum number of Spot instances to launch.</p>
     *        <p>
     *        Default: 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @param type
     *        The Spot instance request type.</p>
     *        <p>
     *        Default: <code>one-time</code>
     * @see SpotInstanceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @return The Spot instance request type.</p>
     *         <p>
     *         Default: <code>one-time</code>
     * @see SpotInstanceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @param type
     *        The Spot instance request type.</p>
     *        <p>
     *        Default: <code>one-time</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceType
     */

    public RequestSpotInstancesRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @param type
     *        The Spot instance request type.</p>
     *        <p>
     *        Default: <code>one-time</code>
     * @see SpotInstanceType
     */

    public void setType(SpotInstanceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The Spot instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @param type
     *        The Spot instance request type.</p>
     *        <p>
     *        Default: <code>one-time</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceType
     */

    public RequestSpotInstancesRequest withType(SpotInstanceType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request becomes active at this date and time
     * and remains active until all instances launch, the request expires, or the request is canceled. If the request is
     * persistent, the request becomes active at this date and time and remains active until it expires or is canceled.
     * </p>
     * <p>
     * Default: The request is effective indefinitely.
     * </p>
     * 
     * @param validFrom
     *        The start date of the request. If this is a one-time request, the request becomes active at this date and
     *        time and remains active until all instances launch, the request expires, or the request is canceled. If
     *        the request is persistent, the request becomes active at this date and time and remains active until it
     *        expires or is canceled.</p>
     *        <p>
     *        Default: The request is effective indefinitely.
     */

    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request becomes active at this date and time
     * and remains active until all instances launch, the request expires, or the request is canceled. If the request is
     * persistent, the request becomes active at this date and time and remains active until it expires or is canceled.
     * </p>
     * <p>
     * Default: The request is effective indefinitely.
     * </p>
     * 
     * @return The start date of the request. If this is a one-time request, the request becomes active at this date and
     *         time and remains active until all instances launch, the request expires, or the request is canceled. If
     *         the request is persistent, the request becomes active at this date and time and remains active until it
     *         expires or is canceled.</p>
     *         <p>
     *         Default: The request is effective indefinitely.
     */

    public java.util.Date getValidFrom() {
        return this.validFrom;
    }

    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request becomes active at this date and time
     * and remains active until all instances launch, the request expires, or the request is canceled. If the request is
     * persistent, the request becomes active at this date and time and remains active until it expires or is canceled.
     * </p>
     * <p>
     * Default: The request is effective indefinitely.
     * </p>
     * 
     * @param validFrom
     *        The start date of the request. If this is a one-time request, the request becomes active at this date and
     *        time and remains active until all instances launch, the request expires, or the request is canceled. If
     *        the request is persistent, the request becomes active at this date and time and remains active until it
     *        expires or is canceled.</p>
     *        <p>
     *        Default: The request is effective indefinitely.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withValidFrom(java.util.Date validFrom) {
        setValidFrom(validFrom);
        return this;
    }

    /**
     * <p>
     * The end date of the request. If this is a one-time request, the request remains active until all instances
     * launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until
     * it is canceled or this date and time is reached.
     * </p>
     * <p>
     * Default: The request is effective indefinitely.
     * </p>
     * 
     * @param validUntil
     *        The end date of the request. If this is a one-time request, the request remains active until all instances
     *        launch, the request is canceled, or this date is reached. If the request is persistent, it remains active
     *        until it is canceled or this date and time is reached.</p>
     *        <p>
     *        Default: The request is effective indefinitely.
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date of the request. If this is a one-time request, the request remains active until all instances
     * launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until
     * it is canceled or this date and time is reached.
     * </p>
     * <p>
     * Default: The request is effective indefinitely.
     * </p>
     * 
     * @return The end date of the request. If this is a one-time request, the request remains active until all
     *         instances launch, the request is canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date and time is reached.</p>
     *         <p>
     *         Default: The request is effective indefinitely.
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The end date of the request. If this is a one-time request, the request remains active until all instances
     * launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until
     * it is canceled or this date and time is reached.
     * </p>
     * <p>
     * Default: The request is effective indefinitely.
     * </p>
     * 
     * @param validUntil
     *        The end date of the request. If this is a one-time request, the request remains active until all instances
     *        launch, the request is canceled, or this date is reached. If the request is persistent, it remains active
     *        until it is canceled or this date and time is reached.</p>
     *        <p>
     *        Default: The request is effective indefinitely.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
        return this;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     * 
     * @param launchGroup
     *        The instance launch group. Launch groups are Spot instances that launch together and terminate
     *        together.</p>
     *        <p>
     *        Default: Instances are launched and terminated individually
     */

    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     * 
     * @return The instance launch group. Launch groups are Spot instances that launch together and terminate
     *         together.</p>
     *         <p>
     *         Default: Instances are launched and terminated individually
     */

    public String getLaunchGroup() {
        return this.launchGroup;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot instances that launch together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     * 
     * @param launchGroup
     *        The instance launch group. Launch groups are Spot instances that launch together and terminate
     *        together.</p>
     *        <p>
     *        Default: Instances are launched and terminated individually
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withLaunchGroup(String launchGroup) {
        setLaunchGroup(launchGroup);
        return this;
    }

    /**
     * <p>
     * The user-specified name for a logical grouping of bids.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request, all Spot instances in the request are
     * launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of
     * Availability Zone is not. The group applies only to bids for Spot Instances of the same instance type. Any
     * additional Spot instance requests that are specified with the same Availability Zone group name are launched in
     * that same Availability Zone, as long as at least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group that you specify for a new Spot instance
     * request (all instances are terminated, the bid is expired, or the bid falls below current market), then Amazon
     * EC2 launches the instance in any Availability Zone where the constraint can be met. Consequently, the subsequent
     * set of Spot instances could be placed in a different zone from the original request, even if you specified the
     * same Availability Zone group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     * 
     * @param availabilityZoneGroup
     *        The user-specified name for a logical grouping of bids.</p>
     *        <p>
     *        When you specify an Availability Zone group in a Spot Instance request, all Spot instances in the request
     *        are launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the
     *        choice of Availability Zone is not. The group applies only to bids for Spot Instances of the same instance
     *        type. Any additional Spot instance requests that are specified with the same Availability Zone group name
     *        are launched in that same Availability Zone, as long as at least one instance from the group is still
     *        active.
     *        </p>
     *        <p>
     *        If there is no active instance running in the Availability Zone group that you specify for a new Spot
     *        instance request (all instances are terminated, the bid is expired, or the bid falls below current
     *        market), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be met.
     *        Consequently, the subsequent set of Spot instances could be placed in a different zone from the original
     *        request, even if you specified the same Availability Zone group.
     *        </p>
     *        <p>
     *        Default: Instances are launched in any available Availability Zone.
     */

    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }

    /**
     * <p>
     * The user-specified name for a logical grouping of bids.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request, all Spot instances in the request are
     * launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of
     * Availability Zone is not. The group applies only to bids for Spot Instances of the same instance type. Any
     * additional Spot instance requests that are specified with the same Availability Zone group name are launched in
     * that same Availability Zone, as long as at least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group that you specify for a new Spot instance
     * request (all instances are terminated, the bid is expired, or the bid falls below current market), then Amazon
     * EC2 launches the instance in any Availability Zone where the constraint can be met. Consequently, the subsequent
     * set of Spot instances could be placed in a different zone from the original request, even if you specified the
     * same Availability Zone group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     * 
     * @return The user-specified name for a logical grouping of bids.</p>
     *         <p>
     *         When you specify an Availability Zone group in a Spot Instance request, all Spot instances in the request
     *         are launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the
     *         choice of Availability Zone is not. The group applies only to bids for Spot Instances of the same
     *         instance type. Any additional Spot instance requests that are specified with the same Availability Zone
     *         group name are launched in that same Availability Zone, as long as at least one instance from the group
     *         is still active.
     *         </p>
     *         <p>
     *         If there is no active instance running in the Availability Zone group that you specify for a new Spot
     *         instance request (all instances are terminated, the bid is expired, or the bid falls below current
     *         market), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be met.
     *         Consequently, the subsequent set of Spot instances could be placed in a different zone from the original
     *         request, even if you specified the same Availability Zone group.
     *         </p>
     *         <p>
     *         Default: Instances are launched in any available Availability Zone.
     */

    public String getAvailabilityZoneGroup() {
        return this.availabilityZoneGroup;
    }

    /**
     * <p>
     * The user-specified name for a logical grouping of bids.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request, all Spot instances in the request are
     * launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of
     * Availability Zone is not. The group applies only to bids for Spot Instances of the same instance type. Any
     * additional Spot instance requests that are specified with the same Availability Zone group name are launched in
     * that same Availability Zone, as long as at least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group that you specify for a new Spot instance
     * request (all instances are terminated, the bid is expired, or the bid falls below current market), then Amazon
     * EC2 launches the instance in any Availability Zone where the constraint can be met. Consequently, the subsequent
     * set of Spot instances could be placed in a different zone from the original request, even if you specified the
     * same Availability Zone group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     * 
     * @param availabilityZoneGroup
     *        The user-specified name for a logical grouping of bids.</p>
     *        <p>
     *        When you specify an Availability Zone group in a Spot Instance request, all Spot instances in the request
     *        are launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the
     *        choice of Availability Zone is not. The group applies only to bids for Spot Instances of the same instance
     *        type. Any additional Spot instance requests that are specified with the same Availability Zone group name
     *        are launched in that same Availability Zone, as long as at least one instance from the group is still
     *        active.
     *        </p>
     *        <p>
     *        If there is no active instance running in the Availability Zone group that you specify for a new Spot
     *        instance request (all instances are terminated, the bid is expired, or the bid falls below current
     *        market), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be met.
     *        Consequently, the subsequent set of Spot instances could be placed in a different zone from the original
     *        request, even if you specified the same Availability Zone group.
     *        </p>
     *        <p>
     *        Default: Instances are launched in any available Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        setAvailabilityZoneGroup(availabilityZoneGroup);
        return this;
    }

    /**
     * <p>
     * The required duration for the Spot instances (also known as Spot blocks), in minutes. This value must be a
     * multiple of 60 (60, 120, 180, 240, 300, or 360).
     * </p>
     * <p>
     * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration
     * period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which
     * gives the instance a two-minute warning before it terminates.
     * </p>
     * <p>
     * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
     * </p>
     * 
     * @param blockDurationMinutes
     *        The required duration for the Spot instances (also known as Spot blocks), in minutes. This value must be a
     *        multiple of 60 (60, 120, 180, 240, 300, or 360).</p>
     *        <p>
     *        The duration period starts as soon as your Spot instance receives its instance ID. At the end of the
     *        duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance
     *        termination notice, which gives the instance a two-minute warning before it terminates.
     *        </p>
     *        <p>
     *        Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
     */

    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    /**
     * <p>
     * The required duration for the Spot instances (also known as Spot blocks), in minutes. This value must be a
     * multiple of 60 (60, 120, 180, 240, 300, or 360).
     * </p>
     * <p>
     * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration
     * period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which
     * gives the instance a two-minute warning before it terminates.
     * </p>
     * <p>
     * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
     * </p>
     * 
     * @return The required duration for the Spot instances (also known as Spot blocks), in minutes. This value must be
     *         a multiple of 60 (60, 120, 180, 240, 300, or 360).</p>
     *         <p>
     *         The duration period starts as soon as your Spot instance receives its instance ID. At the end of the
     *         duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance
     *         termination notice, which gives the instance a two-minute warning before it terminates.
     *         </p>
     *         <p>
     *         Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
     */

    public Integer getBlockDurationMinutes() {
        return this.blockDurationMinutes;
    }

    /**
     * <p>
     * The required duration for the Spot instances (also known as Spot blocks), in minutes. This value must be a
     * multiple of 60 (60, 120, 180, 240, 300, or 360).
     * </p>
     * <p>
     * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration
     * period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which
     * gives the instance a two-minute warning before it terminates.
     * </p>
     * <p>
     * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
     * </p>
     * 
     * @param blockDurationMinutes
     *        The required duration for the Spot instances (also known as Spot blocks), in minutes. This value must be a
     *        multiple of 60 (60, 120, 180, 240, 300, or 360).</p>
     *        <p>
     *        The duration period starts as soon as your Spot instance receives its instance ID. At the end of the
     *        duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance
     *        termination notice, which gives the instance a two-minute warning before it terminates.
     *        </p>
     *        <p>
     *        Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withBlockDurationMinutes(Integer blockDurationMinutes) {
        setBlockDurationMinutes(blockDurationMinutes);
        return this;
    }

    /**
     * @param launchSpecification
     */

    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * @return
     */

    public LaunchSpecification getLaunchSpecification() {
        return this.launchSpecification;
    }

    /**
     * @param launchSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withLaunchSpecification(LaunchSpecification launchSpecification) {
        setLaunchSpecification(launchSpecification);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RequestSpotInstancesRequest> getDryRunRequest() {
        Request<RequestSpotInstancesRequest> request = new RequestSpotInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getLaunchGroup() != null)
            sb.append("LaunchGroup: " + getLaunchGroup() + ",");
        if (getAvailabilityZoneGroup() != null)
            sb.append("AvailabilityZoneGroup: " + getAvailabilityZoneGroup() + ",");
        if (getBlockDurationMinutes() != null)
            sb.append("BlockDurationMinutes: " + getBlockDurationMinutes() + ",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: " + getLaunchSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestSpotInstancesRequest == false)
            return false;
        RequestSpotInstancesRequest other = (RequestSpotInstancesRequest) obj;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        if (other.getBlockDurationMinutes() == null ^ this.getBlockDurationMinutes() == null)
            return false;
        if (other.getBlockDurationMinutes() != null && other.getBlockDurationMinutes().equals(this.getBlockDurationMinutes()) == false)
            return false;
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null)
            return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getLaunchGroup() == null) ? 0 : getLaunchGroup().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneGroup() == null) ? 0 : getAvailabilityZoneGroup().hashCode());
        hashCode = prime * hashCode + ((getBlockDurationMinutes() == null) ? 0 : getBlockDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode());
        return hashCode;
    }

    @Override
    public RequestSpotInstancesRequest clone() {
        return (RequestSpotInstancesRequest) super.clone();
    }
}
