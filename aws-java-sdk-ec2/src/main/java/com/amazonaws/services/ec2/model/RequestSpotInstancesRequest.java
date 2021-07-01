/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RequestSpotInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for RequestSpotInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestSpotInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RequestSpotInstancesRequest> {

    /**
     * <p>
     * The user-specified name for a logical grouping of requests.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request are
     * launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of
     * Availability Zone is not. The group applies only to requests for Spot Instances of the same instance type. Any
     * additional Spot Instance requests that are specified with the same Availability Zone group name are launched in
     * that same Availability Zone, as long as at least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group that you specify for a new Spot Instance
     * request (all instances are terminated, the request is expired, or the maximum price you specified falls below
     * current Spot price), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be
     * met. Consequently, the subsequent set of Spot Instances could be placed in a different zone from the original
     * request, even if you specified the same Availability Zone group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     */
    private String availabilityZoneGroup;
    /**
     * <p>
     * Deprecated.
     * </p>
     */
    private Integer blockDurationMinutes;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The maximum number of Spot Instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     */
    private String launchGroup;
    /**
     * <p>
     * The launch specification.
     * </p>
     */
    private LaunchSpecification launchSpecification;
    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The Spot Instance request type.
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
     * The specified start date and time cannot be equal to the current date and time. You must specify a start date and
     * time that occurs after the current date and time.
     * </p>
     */
    private java.util.Date validFrom;
    /**
     * <p>
     * The end date of the request, in UTC format (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is reached.
     * Otherwise, the request remains active until you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a one-time request, the request remains active until all instances launch, the request is canceled, or the
     * <code>ValidUntil</code> date and time is reached. By default, the request is valid for 7 days from the date the
     * request was created.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * The key-value pair for tagging the Spot Instance request on creation. The value for <code>ResourceType</code>
     * must be <code>spot-instances-request</code>, otherwise the Spot Instance request fails. To tag the Spot Instance
     * request after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     */
    private String instanceInterruptionBehavior;

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
     *        The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand
     *        price.
     */
    public RequestSpotInstancesRequest(String spotPrice) {
        setSpotPrice(spotPrice);
    }

    /**
     * <p>
     * The user-specified name for a logical grouping of requests.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request are
     * launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of
     * Availability Zone is not. The group applies only to requests for Spot Instances of the same instance type. Any
     * additional Spot Instance requests that are specified with the same Availability Zone group name are launched in
     * that same Availability Zone, as long as at least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group that you specify for a new Spot Instance
     * request (all instances are terminated, the request is expired, or the maximum price you specified falls below
     * current Spot price), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be
     * met. Consequently, the subsequent set of Spot Instances could be placed in a different zone from the original
     * request, even if you specified the same Availability Zone group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     * 
     * @param availabilityZoneGroup
     *        The user-specified name for a logical grouping of requests.</p>
     *        <p>
     *        When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request
     *        are launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the
     *        choice of Availability Zone is not. The group applies only to requests for Spot Instances of the same
     *        instance type. Any additional Spot Instance requests that are specified with the same Availability Zone
     *        group name are launched in that same Availability Zone, as long as at least one instance from the group is
     *        still active.
     *        </p>
     *        <p>
     *        If there is no active instance running in the Availability Zone group that you specify for a new Spot
     *        Instance request (all instances are terminated, the request is expired, or the maximum price you specified
     *        falls below current Spot price), then Amazon EC2 launches the instance in any Availability Zone where the
     *        constraint can be met. Consequently, the subsequent set of Spot Instances could be placed in a different
     *        zone from the original request, even if you specified the same Availability Zone group.
     *        </p>
     *        <p>
     *        Default: Instances are launched in any available Availability Zone.
     */

    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }

    /**
     * <p>
     * The user-specified name for a logical grouping of requests.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request are
     * launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of
     * Availability Zone is not. The group applies only to requests for Spot Instances of the same instance type. Any
     * additional Spot Instance requests that are specified with the same Availability Zone group name are launched in
     * that same Availability Zone, as long as at least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group that you specify for a new Spot Instance
     * request (all instances are terminated, the request is expired, or the maximum price you specified falls below
     * current Spot price), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be
     * met. Consequently, the subsequent set of Spot Instances could be placed in a different zone from the original
     * request, even if you specified the same Availability Zone group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     * 
     * @return The user-specified name for a logical grouping of requests.</p>
     *         <p>
     *         When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request
     *         are launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the
     *         choice of Availability Zone is not. The group applies only to requests for Spot Instances of the same
     *         instance type. Any additional Spot Instance requests that are specified with the same Availability Zone
     *         group name are launched in that same Availability Zone, as long as at least one instance from the group
     *         is still active.
     *         </p>
     *         <p>
     *         If there is no active instance running in the Availability Zone group that you specify for a new Spot
     *         Instance request (all instances are terminated, the request is expired, or the maximum price you
     *         specified falls below current Spot price), then Amazon EC2 launches the instance in any Availability Zone
     *         where the constraint can be met. Consequently, the subsequent set of Spot Instances could be placed in a
     *         different zone from the original request, even if you specified the same Availability Zone group.
     *         </p>
     *         <p>
     *         Default: Instances are launched in any available Availability Zone.
     */

    public String getAvailabilityZoneGroup() {
        return this.availabilityZoneGroup;
    }

    /**
     * <p>
     * The user-specified name for a logical grouping of requests.
     * </p>
     * <p>
     * When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request are
     * launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of
     * Availability Zone is not. The group applies only to requests for Spot Instances of the same instance type. Any
     * additional Spot Instance requests that are specified with the same Availability Zone group name are launched in
     * that same Availability Zone, as long as at least one instance from the group is still active.
     * </p>
     * <p>
     * If there is no active instance running in the Availability Zone group that you specify for a new Spot Instance
     * request (all instances are terminated, the request is expired, or the maximum price you specified falls below
     * current Spot price), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be
     * met. Consequently, the subsequent set of Spot Instances could be placed in a different zone from the original
     * request, even if you specified the same Availability Zone group.
     * </p>
     * <p>
     * Default: Instances are launched in any available Availability Zone.
     * </p>
     * 
     * @param availabilityZoneGroup
     *        The user-specified name for a logical grouping of requests.</p>
     *        <p>
     *        When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request
     *        are launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the
     *        choice of Availability Zone is not. The group applies only to requests for Spot Instances of the same
     *        instance type. Any additional Spot Instance requests that are specified with the same Availability Zone
     *        group name are launched in that same Availability Zone, as long as at least one instance from the group is
     *        still active.
     *        </p>
     *        <p>
     *        If there is no active instance running in the Availability Zone group that you specify for a new Spot
     *        Instance request (all instances are terminated, the request is expired, or the maximum price you specified
     *        falls below current Spot price), then Amazon EC2 launches the instance in any Availability Zone where the
     *        constraint can be met. Consequently, the subsequent set of Spot Instances could be placed in a different
     *        zone from the original request, even if you specified the same Availability Zone group.
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
     * Deprecated.
     * </p>
     * 
     * @param blockDurationMinutes
     *        Deprecated.
     */

    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @return Deprecated.
     */

    public Integer getBlockDurationMinutes() {
        return this.blockDurationMinutes;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @param blockDurationMinutes
     *        Deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withBlockDurationMinutes(Integer blockDurationMinutes) {
        setBlockDurationMinutes(blockDurationMinutes);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of Spot Instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param instanceCount
     *        The maximum number of Spot Instances to launch.</p>
     *        <p>
     *        Default: 1
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The maximum number of Spot Instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @return The maximum number of Spot Instances to launch.</p>
     *         <p>
     *         Default: 1
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The maximum number of Spot Instances to launch.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param instanceCount
     *        The maximum number of Spot Instances to launch.</p>
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
     * The instance launch group. Launch groups are Spot Instances that launch together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     * 
     * @param launchGroup
     *        The instance launch group. Launch groups are Spot Instances that launch together and terminate
     *        together.</p>
     *        <p>
     *        Default: Instances are launched and terminated individually
     */

    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     * 
     * @return The instance launch group. Launch groups are Spot Instances that launch together and terminate
     *         together.</p>
     *         <p>
     *         Default: Instances are launched and terminated individually
     */

    public String getLaunchGroup() {
        return this.launchGroup;
    }

    /**
     * <p>
     * The instance launch group. Launch groups are Spot Instances that launch together and terminate together.
     * </p>
     * <p>
     * Default: Instances are launched and terminated individually
     * </p>
     * 
     * @param launchGroup
     *        The instance launch group. Launch groups are Spot Instances that launch together and terminate
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
     * The launch specification.
     * </p>
     * 
     * @param launchSpecification
     *        The launch specification.
     */

    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     * 
     * @return The launch specification.
     */

    public LaunchSpecification getLaunchSpecification() {
        return this.launchSpecification;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     * 
     * @param launchSpecification
     *        The launch specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withLaunchSpecification(LaunchSpecification launchSpecification) {
        setLaunchSpecification(launchSpecification);
        return this;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand
     *        price.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
     * </p>
     * 
     * @return The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand
     *         price.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand
     *        price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @param type
     *        The Spot Instance request type.</p>
     *        <p>
     *        Default: <code>one-time</code>
     * @see SpotInstanceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @return The Spot Instance request type.</p>
     *         <p>
     *         Default: <code>one-time</code>
     * @see SpotInstanceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @param type
     *        The Spot Instance request type.</p>
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
     * The Spot Instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @param type
     *        The Spot Instance request type.</p>
     *        <p>
     *        Default: <code>one-time</code>
     * @see SpotInstanceType
     */

    public void setType(SpotInstanceType type) {
        withType(type);
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Default: <code>one-time</code>
     * </p>
     * 
     * @param type
     *        The Spot Instance request type.</p>
     *        <p>
     *        Default: <code>one-time</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceType
     */

    public RequestSpotInstancesRequest withType(SpotInstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start date of the request. If this is a one-time request, the request becomes active at this date and time
     * and remains active until all instances launch, the request expires, or the request is canceled. If the request is
     * persistent, the request becomes active at this date and time and remains active until it expires or is canceled.
     * </p>
     * <p>
     * The specified start date and time cannot be equal to the current date and time. You must specify a start date and
     * time that occurs after the current date and time.
     * </p>
     * 
     * @param validFrom
     *        The start date of the request. If this is a one-time request, the request becomes active at this date and
     *        time and remains active until all instances launch, the request expires, or the request is canceled. If
     *        the request is persistent, the request becomes active at this date and time and remains active until it
     *        expires or is canceled.</p>
     *        <p>
     *        The specified start date and time cannot be equal to the current date and time. You must specify a start
     *        date and time that occurs after the current date and time.
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
     * The specified start date and time cannot be equal to the current date and time. You must specify a start date and
     * time that occurs after the current date and time.
     * </p>
     * 
     * @return The start date of the request. If this is a one-time request, the request becomes active at this date and
     *         time and remains active until all instances launch, the request expires, or the request is canceled. If
     *         the request is persistent, the request becomes active at this date and time and remains active until it
     *         expires or is canceled.</p>
     *         <p>
     *         The specified start date and time cannot be equal to the current date and time. You must specify a start
     *         date and time that occurs after the current date and time.
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
     * The specified start date and time cannot be equal to the current date and time. You must specify a start date and
     * time that occurs after the current date and time.
     * </p>
     * 
     * @param validFrom
     *        The start date of the request. If this is a one-time request, the request becomes active at this date and
     *        time and remains active until all instances launch, the request expires, or the request is canceled. If
     *        the request is persistent, the request becomes active at this date and time and remains active until it
     *        expires or is canceled.</p>
     *        <p>
     *        The specified start date and time cannot be equal to the current date and time. You must specify a start
     *        date and time that occurs after the current date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withValidFrom(java.util.Date validFrom) {
        setValidFrom(validFrom);
        return this;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is reached.
     * Otherwise, the request remains active until you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a one-time request, the request remains active until all instances launch, the request is canceled, or the
     * <code>ValidUntil</code> date and time is reached. By default, the request is valid for 7 days from the date the
     * request was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validUntil
     *        The end date of the request, in UTC format
     *        (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is
     *        reached. Otherwise, the request remains active until you cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a one-time request, the request remains active until all instances launch, the request is canceled, or
     *        the <code>ValidUntil</code> date and time is reached. By default, the request is valid for 7 days from the
     *        date the request was created.
     *        </p>
     *        </li>
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is reached.
     * Otherwise, the request remains active until you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a one-time request, the request remains active until all instances launch, the request is canceled, or the
     * <code>ValidUntil</code> date and time is reached. By default, the request is valid for 7 days from the date the
     * request was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The end date of the request, in UTC format
     *         (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is
     *         reached. Otherwise, the request remains active until you cancel it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For a one-time request, the request remains active until all instances launch, the request is canceled,
     *         or the <code>ValidUntil</code> date and time is reached. By default, the request is valid for 7 days from
     *         the date the request was created.
     *         </p>
     *         </li>
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The end date of the request, in UTC format (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is reached.
     * Otherwise, the request remains active until you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a one-time request, the request remains active until all instances launch, the request is canceled, or the
     * <code>ValidUntil</code> date and time is reached. By default, the request is valid for 7 days from the date the
     * request was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validUntil
     *        The end date of the request, in UTC format
     *        (<i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a persistent request, the request remains active until the <code>ValidUntil</code> date and time is
     *        reached. Otherwise, the request remains active until you cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a one-time request, the request remains active until all instances launch, the request is canceled, or
     *        the <code>ValidUntil</code> date and time is reached. By default, the request is valid for 7 days from the
     *        date the request was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
        return this;
    }

    /**
     * <p>
     * The key-value pair for tagging the Spot Instance request on creation. The value for <code>ResourceType</code>
     * must be <code>spot-instances-request</code>, otherwise the Spot Instance request fails. To tag the Spot Instance
     * request after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     * 
     * @return The key-value pair for tagging the Spot Instance request on creation. The value for
     *         <code>ResourceType</code> must be <code>spot-instances-request</code>, otherwise the Spot Instance
     *         request fails. To tag the Spot Instance request after it has been created, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The key-value pair for tagging the Spot Instance request on creation. The value for <code>ResourceType</code>
     * must be <code>spot-instances-request</code>, otherwise the Spot Instance request fails. To tag the Spot Instance
     * request after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     * 
     * @param tagSpecifications
     *        The key-value pair for tagging the Spot Instance request on creation. The value for
     *        <code>ResourceType</code> must be <code>spot-instances-request</code>, otherwise the Spot Instance request
     *        fails. To tag the Spot Instance request after it has been created, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The key-value pair for tagging the Spot Instance request on creation. The value for <code>ResourceType</code>
     * must be <code>spot-instances-request</code>, otherwise the Spot Instance request fails. To tag the Spot Instance
     * request after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The key-value pair for tagging the Spot Instance request on creation. The value for
     *        <code>ResourceType</code> must be <code>spot-instances-request</code>, otherwise the Spot Instance request
     *        fails. To tag the Spot Instance request after it has been created, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pair for tagging the Spot Instance request on creation. The value for <code>ResourceType</code>
     * must be <code>spot-instances-request</code>, otherwise the Spot Instance request fails. To tag the Spot Instance
     * request after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     * 
     * @param tagSpecifications
     *        The key-value pair for tagging the Spot Instance request on creation. The value for
     *        <code>ResourceType</code> must be <code>spot-instances-request</code>, otherwise the Spot Instance request
     *        fails. To tag the Spot Instance request after it has been created, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotInstancesRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see InstanceInterruptionBehavior
     */

    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @return The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see InstanceInterruptionBehavior
     */

    public String getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceInterruptionBehavior
     */

    public RequestSpotInstancesRequest withInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        setInstanceInterruptionBehavior(instanceInterruptionBehavior);
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see InstanceInterruptionBehavior
     */

    public void setInstanceInterruptionBehavior(InstanceInterruptionBehavior instanceInterruptionBehavior) {
        withInstanceInterruptionBehavior(instanceInterruptionBehavior);
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceInterruptionBehavior
     */

    public RequestSpotInstancesRequest withInstanceInterruptionBehavior(InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
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
        if (getAvailabilityZoneGroup() != null)
            sb.append("AvailabilityZoneGroup: ").append(getAvailabilityZoneGroup()).append(",");
        if (getBlockDurationMinutes() != null)
            sb.append("BlockDurationMinutes: ").append(getBlockDurationMinutes()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getLaunchGroup() != null)
            sb.append("LaunchGroup: ").append(getLaunchGroup()).append(",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: ").append(getLaunchSpecification()).append(",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: ").append(getSpotPrice()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: ").append(getValidFrom()).append(",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: ").append(getValidUntil()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getInstanceInterruptionBehavior() != null)
            sb.append("InstanceInterruptionBehavior: ").append(getInstanceInterruptionBehavior());
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
        if (other.getAvailabilityZoneGroup() == null ^ this.getAvailabilityZoneGroup() == null)
            return false;
        if (other.getAvailabilityZoneGroup() != null && other.getAvailabilityZoneGroup().equals(this.getAvailabilityZoneGroup()) == false)
            return false;
        if (other.getBlockDurationMinutes() == null ^ this.getBlockDurationMinutes() == null)
            return false;
        if (other.getBlockDurationMinutes() != null && other.getBlockDurationMinutes().equals(this.getBlockDurationMinutes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getLaunchGroup() == null ^ this.getLaunchGroup() == null)
            return false;
        if (other.getLaunchGroup() != null && other.getLaunchGroup().equals(this.getLaunchGroup()) == false)
            return false;
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null)
            return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
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
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getInstanceInterruptionBehavior() == null ^ this.getInstanceInterruptionBehavior() == null)
            return false;
        if (other.getInstanceInterruptionBehavior() != null && other.getInstanceInterruptionBehavior().equals(this.getInstanceInterruptionBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZoneGroup() == null) ? 0 : getAvailabilityZoneGroup().hashCode());
        hashCode = prime * hashCode + ((getBlockDurationMinutes() == null) ? 0 : getBlockDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getLaunchGroup() == null) ? 0 : getLaunchGroup().hashCode());
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getInstanceInterruptionBehavior() == null) ? 0 : getInstanceInterruptionBehavior().hashCode());
        return hashCode;
    }

    @Override
    public RequestSpotInstancesRequest clone() {
        return (RequestSpotInstancesRequest) super.clone();
    }
}
