/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateFleetRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateFleetRequest> {

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     * </p>
     */
    private SpotOptionsRequest spotOptions;
    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     */
    private OnDemandOptionsRequest onDemandOptions;
    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     */
    private String excessCapacityTerminationPolicy;
    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfigRequest> launchTemplateConfigs;
    /**
     * <p>
     * The <code>TotalTargetCapacity</code>, <code>OnDemandTargetCapacity</code>, <code>SpotTargetCapacity</code>, and
     * <code>DefaultCapacityType</code> structure.
     * </p>
     */
    private TargetCapacitySpecificationRequest targetCapacitySpecification;
    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     */
    private Boolean terminateInstancesWithExpiration;
    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired capacity, and
     * maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of <code>instant</code>
     * places a synchronous one-time request, and returns errors for any instances that could not be launched. A value
     * of <code>request</code> places an asynchronous one-time request without maintaining capacity or submitting
     * requests in alternative capacity pools if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the request
     * immediately.
     * </p>
     */
    private java.util.Date validFrom;
    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new EC2 Fleet requests are
     * placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
     * </p>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     */
    private Boolean replaceUnhealthyInstances;
    /**
     * <p>
     * The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code> must be
     * <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the tags in the <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template">launch
     * template</a>. For information about tagging after launch, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     * Resources</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     * </p>
     * 
     * @param spotOptions
     *        Describes the configuration of Spot Instances in an EC2 Fleet.
     */

    public void setSpotOptions(SpotOptionsRequest spotOptions) {
        this.spotOptions = spotOptions;
    }

    /**
     * <p>
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     * </p>
     * 
     * @return Describes the configuration of Spot Instances in an EC2 Fleet.
     */

    public SpotOptionsRequest getSpotOptions() {
        return this.spotOptions;
    }

    /**
     * <p>
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     * </p>
     * 
     * @param spotOptions
     *        Describes the configuration of Spot Instances in an EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withSpotOptions(SpotOptionsRequest spotOptions) {
        setSpotOptions(spotOptions);
        return this;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     * 
     * @param onDemandOptions
     *        The allocation strategy of On-Demand Instances in an EC2 Fleet.
     */

    public void setOnDemandOptions(OnDemandOptionsRequest onDemandOptions) {
        this.onDemandOptions = onDemandOptions;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     * 
     * @return The allocation strategy of On-Demand Instances in an EC2 Fleet.
     */

    public OnDemandOptionsRequest getOnDemandOptions() {
        return this.onDemandOptions;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     * 
     * @param onDemandOptions
     *        The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withOnDemandOptions(OnDemandOptionsRequest onDemandOptions) {
        setOnDemandOptions(onDemandOptions);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     * 
     * @return Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     *         decreased below the current size of the EC2 Fleet.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public CreateFleetRequest withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        setExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public CreateFleetRequest withExcessCapacityTerminationPolicy(FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     * 
     * @return The configuration for the EC2 Fleet.
     */

    public java.util.List<FleetLaunchTemplateConfigRequest> getLaunchTemplateConfigs() {
        if (launchTemplateConfigs == null) {
            launchTemplateConfigs = new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfigRequest>();
        }
        return launchTemplateConfigs;
    }

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     * 
     * @param launchTemplateConfigs
     *        The configuration for the EC2 Fleet.
     */

    public void setLaunchTemplateConfigs(java.util.Collection<FleetLaunchTemplateConfigRequest> launchTemplateConfigs) {
        if (launchTemplateConfigs == null) {
            this.launchTemplateConfigs = null;
            return;
        }

        this.launchTemplateConfigs = new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfigRequest>(launchTemplateConfigs);
    }

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchTemplateConfigs(java.util.Collection)} or
     * {@link #withLaunchTemplateConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param launchTemplateConfigs
     *        The configuration for the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLaunchTemplateConfigs(FleetLaunchTemplateConfigRequest... launchTemplateConfigs) {
        if (this.launchTemplateConfigs == null) {
            setLaunchTemplateConfigs(new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfigRequest>(launchTemplateConfigs.length));
        }
        for (FleetLaunchTemplateConfigRequest ele : launchTemplateConfigs) {
            this.launchTemplateConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration for the EC2 Fleet.
     * </p>
     * 
     * @param launchTemplateConfigs
     *        The configuration for the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLaunchTemplateConfigs(java.util.Collection<FleetLaunchTemplateConfigRequest> launchTemplateConfigs) {
        setLaunchTemplateConfigs(launchTemplateConfigs);
        return this;
    }

    /**
     * <p>
     * The <code>TotalTargetCapacity</code>, <code>OnDemandTargetCapacity</code>, <code>SpotTargetCapacity</code>, and
     * <code>DefaultCapacityType</code> structure.
     * </p>
     * 
     * @param targetCapacitySpecification
     *        The <code>TotalTargetCapacity</code>, <code>OnDemandTargetCapacity</code>, <code>SpotTargetCapacity</code>
     *        , and <code>DefaultCapacityType</code> structure.
     */

    public void setTargetCapacitySpecification(TargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
    }

    /**
     * <p>
     * The <code>TotalTargetCapacity</code>, <code>OnDemandTargetCapacity</code>, <code>SpotTargetCapacity</code>, and
     * <code>DefaultCapacityType</code> structure.
     * </p>
     * 
     * @return The <code>TotalTargetCapacity</code>, <code>OnDemandTargetCapacity</code>,
     *         <code>SpotTargetCapacity</code>, and <code>DefaultCapacityType</code> structure.
     */

    public TargetCapacitySpecificationRequest getTargetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }

    /**
     * <p>
     * The <code>TotalTargetCapacity</code>, <code>OnDemandTargetCapacity</code>, <code>SpotTargetCapacity</code>, and
     * <code>DefaultCapacityType</code> structure.
     * </p>
     * 
     * @param targetCapacitySpecification
     *        The <code>TotalTargetCapacity</code>, <code>OnDemandTargetCapacity</code>, <code>SpotTargetCapacity</code>
     *        , and <code>DefaultCapacityType</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTargetCapacitySpecification(TargetCapacitySpecificationRequest targetCapacitySpecification) {
        setTargetCapacitySpecification(targetCapacitySpecification);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     * 
     * @param terminateInstancesWithExpiration
     *        Indicates whether running instances should be terminated when the EC2 Fleet expires.
     */

    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     * 
     * @return Indicates whether running instances should be terminated when the EC2 Fleet expires.
     */

    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     * 
     * @param terminateInstancesWithExpiration
     *        Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        setTerminateInstancesWithExpiration(terminateInstancesWithExpiration);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     * 
     * @return Indicates whether running instances should be terminated when the EC2 Fleet expires.
     */

    public Boolean isTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired capacity, and
     * maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of <code>instant</code>
     * places a synchronous one-time request, and returns errors for any instances that could not be launched. A value
     * of <code>request</code> places an asynchronous one-time request without maintaining capacity or submitting
     * requests in alternative capacity pools if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired
     *        capacity, and maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of
     *        <code>instant</code> places a synchronous one-time request, and returns errors for any instances that
     *        could not be launched. A value of <code>request</code> places an asynchronous one-time request without
     *        maintaining capacity or submitting requests in alternative capacity pools if capacity is unavailable. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *        >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see FleetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired capacity, and
     * maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of <code>instant</code>
     * places a synchronous one-time request, and returns errors for any instances that could not be launched. A value
     * of <code>request</code> places an asynchronous one-time request without maintaining capacity or submitting
     * requests in alternative capacity pools if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired
     *         capacity, and maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of
     *         <code>instant</code> places a synchronous one-time request, and returns errors for any instances that
     *         could not be launched. A value of <code>request</code> places an asynchronous one-time request without
     *         maintaining capacity or submitting requests in alternative capacity pools if capacity is unavailable. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *         >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see FleetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired capacity, and
     * maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of <code>instant</code>
     * places a synchronous one-time request, and returns errors for any instances that could not be launched. A value
     * of <code>request</code> places an asynchronous one-time request without maintaining capacity or submitting
     * requests in alternative capacity pools if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired
     *        capacity, and maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of
     *        <code>instant</code> places a synchronous one-time request, and returns errors for any instances that
     *        could not be launched. A value of <code>request</code> places an asynchronous one-time request without
     *        maintaining capacity or submitting requests in alternative capacity pools if capacity is unavailable. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *        >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public CreateFleetRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired capacity, and
     * maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of <code>instant</code>
     * places a synchronous one-time request, and returns errors for any instances that could not be launched. A value
     * of <code>request</code> places an asynchronous one-time request without maintaining capacity or submitting
     * requests in alternative capacity pools if capacity is unavailable. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     * >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired
     *        capacity, and maintains it by replenishing interrupted Spot Instances (<code>maintain</code>). A value of
     *        <code>instant</code> places a synchronous one-time request, and returns errors for any instances that
     *        could not be launched. A value of <code>request</code> places an asynchronous one-time request without
     *        maintaining capacity or submitting requests in alternative capacity pools if capacity is unavailable. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-request-type"
     *        >EC2 Fleet Request Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public CreateFleetRequest withType(FleetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the request
     * immediately.
     * </p>
     * 
     * @param validFrom
     *        The start date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the
     *        request immediately.
     */

    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the request
     * immediately.
     * </p>
     * 
     * @return The start date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the
     *         request immediately.
     */

    public java.util.Date getValidFrom() {
        return this.validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the request
     * immediately.
     * </p>
     * 
     * @param validFrom
     *        The start date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the
     *        request immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withValidFrom(java.util.Date validFrom) {
        setValidFrom(validFrom);
        return this;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new EC2 Fleet requests are
     * placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
     * </p>
     * 
     * @param validUntil
     *        The end date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new EC2 Fleet requests
     *        are placed or able to fulfill the request. If no value is specified, the request remains until you cancel
     *        it.
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new EC2 Fleet requests are
     * placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
     * </p>
     * 
     * @return The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new EC2 Fleet requests
     *         are placed or able to fulfill the request. If no value is specified, the request remains until you cancel
     *         it.
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new EC2 Fleet requests are
     * placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
     * </p>
     * 
     * @param validUntil
     *        The end date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new EC2 Fleet requests
     *        are placed or able to fulfill the request. If no value is specified, the request remains until you cancel
     *        it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
        return this;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * 
     * @param replaceUnhealthyInstances
     *        Indicates whether EC2 Fleet should replace unhealthy instances.
     */

    public void setReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * 
     * @return Indicates whether EC2 Fleet should replace unhealthy instances.
     */

    public Boolean getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * 
     * @param replaceUnhealthyInstances
     *        Indicates whether EC2 Fleet should replace unhealthy instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        setReplaceUnhealthyInstances(replaceUnhealthyInstances);
        return this;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * 
     * @return Indicates whether EC2 Fleet should replace unhealthy instances.
     */

    public Boolean isReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }

    /**
     * <p>
     * The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code> must be
     * <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the tags in the <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template">launch
     * template</a>. For information about tagging after launch, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     * Resources</a>.
     * </p>
     * 
     * @return The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code>
     *         must be <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the
     *         tags in the <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *         >launch template</a>. For information about tagging after launch, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     *         Resources</a>.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code> must be
     * <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the tags in the <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template">launch
     * template</a>. For information about tagging after launch, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     * Resources</a>.
     * </p>
     * 
     * @param tagSpecifications
     *        The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code>
     *        must be <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the
     *        tags in the <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *        >launch template</a>. For information about tagging after launch, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     *        Resources</a>.
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
     * The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code> must be
     * <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the tags in the <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template">launch
     * template</a>. For information about tagging after launch, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     * Resources</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code>
     *        must be <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the
     *        tags in the <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *        >launch template</a>. For information about tagging after launch, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     *        Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code> must be
     * <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the tags in the <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template">launch
     * template</a>. For information about tagging after launch, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     * Resources</a>.
     * </p>
     * 
     * @param tagSpecifications
     *        The key-value pair for tagging the EC2 Fleet request on creation. The value for <code>ResourceType</code>
     *        must be <code>fleet</code>, otherwise the fleet request fails. To tag instances at launch, specify the
     *        tags in the <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template"
     *        >launch template</a>. For information about tagging after launch, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources">Tagging Your
     *        Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateFleetRequest> getDryRunRequest() {
        Request<CreateFleetRequest> request = new CreateFleetRequestMarshaller().marshall(this);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSpotOptions() != null)
            sb.append("SpotOptions: ").append(getSpotOptions()).append(",");
        if (getOnDemandOptions() != null)
            sb.append("OnDemandOptions: ").append(getOnDemandOptions()).append(",");
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: ").append(getExcessCapacityTerminationPolicy()).append(",");
        if (getLaunchTemplateConfigs() != null)
            sb.append("LaunchTemplateConfigs: ").append(getLaunchTemplateConfigs()).append(",");
        if (getTargetCapacitySpecification() != null)
            sb.append("TargetCapacitySpecification: ").append(getTargetCapacitySpecification()).append(",");
        if (getTerminateInstancesWithExpiration() != null)
            sb.append("TerminateInstancesWithExpiration: ").append(getTerminateInstancesWithExpiration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: ").append(getValidFrom()).append(",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: ").append(getValidUntil()).append(",");
        if (getReplaceUnhealthyInstances() != null)
            sb.append("ReplaceUnhealthyInstances: ").append(getReplaceUnhealthyInstances()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetRequest == false)
            return false;
        CreateFleetRequest other = (CreateFleetRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSpotOptions() == null ^ this.getSpotOptions() == null)
            return false;
        if (other.getSpotOptions() != null && other.getSpotOptions().equals(this.getSpotOptions()) == false)
            return false;
        if (other.getOnDemandOptions() == null ^ this.getOnDemandOptions() == null)
            return false;
        if (other.getOnDemandOptions() != null && other.getOnDemandOptions().equals(this.getOnDemandOptions()) == false)
            return false;
        if (other.getExcessCapacityTerminationPolicy() == null ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getLaunchTemplateConfigs() == null ^ this.getLaunchTemplateConfigs() == null)
            return false;
        if (other.getLaunchTemplateConfigs() != null && other.getLaunchTemplateConfigs().equals(this.getLaunchTemplateConfigs()) == false)
            return false;
        if (other.getTargetCapacitySpecification() == null ^ this.getTargetCapacitySpecification() == null)
            return false;
        if (other.getTargetCapacitySpecification() != null && other.getTargetCapacitySpecification().equals(this.getTargetCapacitySpecification()) == false)
            return false;
        if (other.getTerminateInstancesWithExpiration() == null ^ this.getTerminateInstancesWithExpiration() == null)
            return false;
        if (other.getTerminateInstancesWithExpiration() != null
                && other.getTerminateInstancesWithExpiration().equals(this.getTerminateInstancesWithExpiration()) == false)
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
        if (other.getReplaceUnhealthyInstances() == null ^ this.getReplaceUnhealthyInstances() == null)
            return false;
        if (other.getReplaceUnhealthyInstances() != null && other.getReplaceUnhealthyInstances().equals(this.getReplaceUnhealthyInstances()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSpotOptions() == null) ? 0 : getSpotOptions().hashCode());
        hashCode = prime * hashCode + ((getOnDemandOptions() == null) ? 0 : getOnDemandOptions().hashCode());
        hashCode = prime * hashCode + ((getExcessCapacityTerminationPolicy() == null) ? 0 : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateConfigs() == null) ? 0 : getLaunchTemplateConfigs().hashCode());
        hashCode = prime * hashCode + ((getTargetCapacitySpecification() == null) ? 0 : getTargetCapacitySpecification().hashCode());
        hashCode = prime * hashCode + ((getTerminateInstancesWithExpiration() == null) ? 0 : getTerminateInstancesWithExpiration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getReplaceUnhealthyInstances() == null) ? 0 : getReplaceUnhealthyInstances().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetRequest clone() {
        return (CreateFleetRequest) super.clone();
    }
}
