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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an instance fleet, which is a group of EC2 instances that host a particular node type (master, core, or
 * task) in an Amazon EMR cluster. Instance fleets can consist of a mix of instance types and On-Demand and Spot
 * instances, which are provisioned to meet a defined target capacity.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A friendly name for the instance fleet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the instance fleet.
     * </p>
     */
    private InstanceFleetStatus status;
    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * </p>
     */
    private String instanceFleetType;
    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to
     * provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When an
     * On-Demand instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an
     * overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an
     * instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is
     * exceeded by 3 units. You can use <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot capacity
     * units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
     * <code>TargetSpotCapacity</code>. At least one of <code>TargetSpotCapacity</code> and
     * <code>TargetOnDemandCapacity</code> should be greater than 0. For a master instance fleet, only one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be specified, and its value must be
     * 1.
     * </p>
     * </note>
     */
    private Integer targetOnDemandCapacity;
    /**
     * <p>
     * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When a Spot
     * instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity. Amazon EMR
     * provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For
     * example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     * <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is exceeded by 3
     * units. You can use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot capacity units that have
     * been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> should be greater than 0. For a master
     * instance fleet, only one of <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be
     * specified, and its value must be 1.
     * </p>
     * </note>
     */
    private Integer targetSpotCapacity;
    /**
     * <p>
     * The number of On-Demand units that have been provisioned for the instance fleet to fulfill
     * <code>TargetOnDemandCapacity</code>. This provisioned capacity might be less than or greater than
     * <code>TargetOnDemandCapacity</code>.
     * </p>
     */
    private Integer provisionedOnDemandCapacity;
    /**
     * <p>
     * The number of Spot units that have been provisioned for this instance fleet to fulfill
     * <code>TargetSpotCapacity</code>. This provisioned capacity might be less than or greater than
     * <code>TargetSpotCapacity</code>.
     * </p>
     */
    private Integer provisionedSpotCapacity;
    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet. Up to five unique instance
     * specifications may be defined for each instance fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceTypeSpecification> instanceTypeSpecifications;
    /**
     * <p>
     * Describes the launch specification for an instance fleet.
     * </p>
     */
    private InstanceFleetProvisioningSpecifications launchSpecifications;

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @param id
     *        The unique identifier of the instance fleet.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @return The unique identifier of the instance fleet.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @param id
     *        The unique identifier of the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A friendly name for the instance fleet.
     * </p>
     * 
     * @param name
     *        A friendly name for the instance fleet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for the instance fleet.
     * </p>
     * 
     * @return A friendly name for the instance fleet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name for the instance fleet.
     * </p>
     * 
     * @param name
     *        A friendly name for the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the instance fleet.
     * </p>
     * 
     * @param status
     *        The current status of the instance fleet.
     */

    public void setStatus(InstanceFleetStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the instance fleet.
     * </p>
     * 
     * @return The current status of the instance fleet.
     */

    public InstanceFleetStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the instance fleet.
     * </p>
     * 
     * @param status
     *        The current status of the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withStatus(InstanceFleetStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * @see InstanceFleetType
     */

    public void setInstanceFleetType(String instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * </p>
     * 
     * @return The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * @see InstanceFleetType
     */

    public String getInstanceFleetType() {
        return this.instanceFleetType;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetType
     */

    public InstanceFleet withInstanceFleetType(String instanceFleetType) {
        setInstanceFleetType(instanceFleetType);
        return this;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * @see InstanceFleetType
     */

    public void setInstanceFleetType(InstanceFleetType instanceFleetType) {
        withInstanceFleetType(instanceFleetType);
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetType
     */

    public InstanceFleet withInstanceFleetType(InstanceFleetType instanceFleetType) {
        this.instanceFleetType = instanceFleetType.toString();
        return this;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to
     * provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When an
     * On-Demand instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an
     * overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an
     * instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is
     * exceeded by 3 units. You can use <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot capacity
     * units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
     * <code>TargetSpotCapacity</code>. At least one of <code>TargetSpotCapacity</code> and
     * <code>TargetOnDemandCapacity</code> should be greater than 0. For a master instance fleet, only one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be specified, and its value must be
     * 1.
     * </p>
     * </note>
     * 
     * @param targetOnDemandCapacity
     *        The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand
     *        instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand
     *        instances as specified by <a>InstanceTypeConfig</a>. Each instance configuration has a specified
     *        <code>WeightedCapacity</code>. When an On-Demand instance is provisioned, the
     *        <code>WeightedCapacity</code> units count toward the target capacity. Amazon EMR provisions instances
     *        until the target capacity is totally fulfilled, even if this results in an overage. For example, if there
     *        are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     *        <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is exceeded
     *        by 3 units. You can use <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot capacity
     *        units that have been provisioned for the instance fleet.</p> <note>
     *        <p>
     *        If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
     *        <code>TargetSpotCapacity</code>. At least one of <code>TargetSpotCapacity</code> and
     *        <code>TargetOnDemandCapacity</code> should be greater than 0. For a master instance fleet, only one of
     *        <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be specified, and its value
     *        must be 1.
     *        </p>
     */

    public void setTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to
     * provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When an
     * On-Demand instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an
     * overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an
     * instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is
     * exceeded by 3 units. You can use <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot capacity
     * units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
     * <code>TargetSpotCapacity</code>. At least one of <code>TargetSpotCapacity</code> and
     * <code>TargetOnDemandCapacity</code> should be greater than 0. For a master instance fleet, only one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be specified, and its value must be
     * 1.
     * </p>
     * </note>
     * 
     * @return The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand
     *         instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand
     *         instances as specified by <a>InstanceTypeConfig</a>. Each instance configuration has a specified
     *         <code>WeightedCapacity</code>. When an On-Demand instance is provisioned, the
     *         <code>WeightedCapacity</code> units count toward the target capacity. Amazon EMR provisions instances
     *         until the target capacity is totally fulfilled, even if this results in an overage. For example, if there
     *         are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     *         <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is
     *         exceeded by 3 units. You can use <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot
     *         capacity units that have been provisioned for the instance fleet.</p> <note>
     *         <p>
     *         If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
     *         <code>TargetSpotCapacity</code>. At least one of <code>TargetSpotCapacity</code> and
     *         <code>TargetOnDemandCapacity</code> should be greater than 0. For a master instance fleet, only one of
     *         <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be specified, and its value
     *         must be 1.
     *         </p>
     */

    public Integer getTargetOnDemandCapacity() {
        return this.targetOnDemandCapacity;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to
     * provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When an
     * On-Demand instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an
     * overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an
     * instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is
     * exceeded by 3 units. You can use <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot capacity
     * units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
     * <code>TargetSpotCapacity</code>. At least one of <code>TargetSpotCapacity</code> and
     * <code>TargetOnDemandCapacity</code> should be greater than 0. For a master instance fleet, only one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be specified, and its value must be
     * 1.
     * </p>
     * </note>
     * 
     * @param targetOnDemandCapacity
     *        The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand
     *        instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand
     *        instances as specified by <a>InstanceTypeConfig</a>. Each instance configuration has a specified
     *        <code>WeightedCapacity</code>. When an On-Demand instance is provisioned, the
     *        <code>WeightedCapacity</code> units count toward the target capacity. Amazon EMR provisions instances
     *        until the target capacity is totally fulfilled, even if this results in an overage. For example, if there
     *        are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     *        <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is exceeded
     *        by 3 units. You can use <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot capacity
     *        units that have been provisioned for the instance fleet.</p> <note>
     *        <p>
     *        If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
     *        <code>TargetSpotCapacity</code>. At least one of <code>TargetSpotCapacity</code> and
     *        <code>TargetOnDemandCapacity</code> should be greater than 0. For a master instance fleet, only one of
     *        <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be specified, and its value
     *        must be 1.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        setTargetOnDemandCapacity(targetOnDemandCapacity);
        return this;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When a Spot
     * instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity. Amazon EMR
     * provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For
     * example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     * <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is exceeded by 3
     * units. You can use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot capacity units that have
     * been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> should be greater than 0. For a master
     * instance fleet, only one of <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be
     * specified, and its value must be 1.
     * </p>
     * </note>
     * 
     * @param targetSpotCapacity
     *        The target capacity of Spot units for the instance fleet, which determines how many Spot instances to
     *        provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
     *        <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When
     *        a Spot instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity.
     *        Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an
     *        overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only
     *        provision an instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and
     *        the target capacity is exceeded by 3 units. You can use <a>InstanceFleet$ProvisionedSpotCapacity</a> to
     *        determine the Spot capacity units that have been provisioned for the instance fleet.</p> <note>
     *        <p>
     *        If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least
     *        one of <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> should be greater than 0.
     *        For a master instance fleet, only one of <code>TargetSpotCapacity</code> and
     *        <code>TargetOnDemandCapacity</code> can be specified, and its value must be 1.
     *        </p>
     */

    public void setTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When a Spot
     * instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity. Amazon EMR
     * provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For
     * example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     * <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is exceeded by 3
     * units. You can use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot capacity units that have
     * been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> should be greater than 0. For a master
     * instance fleet, only one of <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be
     * specified, and its value must be 1.
     * </p>
     * </note>
     * 
     * @return The target capacity of Spot units for the instance fleet, which determines how many Spot instances to
     *         provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
     *         <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>.
     *         When a Spot instance is provisioned, the <code>WeightedCapacity</code> units count toward the target
     *         capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this
     *         results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR
     *         can only provision an instance with a <code>WeightedCapacity</code> of 5 units, the instance is
     *         provisioned, and the target capacity is exceeded by 3 units. You can use
     *         <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot capacity units that have been
     *         provisioned for the instance fleet.</p> <note>
     *         <p>
     *         If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least
     *         one of <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> should be greater than 0.
     *         For a master instance fleet, only one of <code>TargetSpotCapacity</code> and
     *         <code>TargetOnDemandCapacity</code> can be specified, and its value must be 1.
     *         </p>
     */

    public Integer getTargetSpotCapacity() {
        return this.targetSpotCapacity;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When a Spot
     * instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity. Amazon EMR
     * provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For
     * example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     * <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and the target capacity is exceeded by 3
     * units. You can use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot capacity units that have
     * been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> should be greater than 0. For a master
     * instance fleet, only one of <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> can be
     * specified, and its value must be 1.
     * </p>
     * </note>
     * 
     * @param targetSpotCapacity
     *        The target capacity of Spot units for the instance fleet, which determines how many Spot instances to
     *        provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
     *        <a>InstanceTypeConfig</a>. Each instance configuration has a specified <code>WeightedCapacity</code>. When
     *        a Spot instance is provisioned, the <code>WeightedCapacity</code> units count toward the target capacity.
     *        Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an
     *        overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only
     *        provision an instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and
     *        the target capacity is exceeded by 3 units. You can use <a>InstanceFleet$ProvisionedSpotCapacity</a> to
     *        determine the Spot capacity units that have been provisioned for the instance fleet.</p> <note>
     *        <p>
     *        If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least
     *        one of <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code> should be greater than 0.
     *        For a master instance fleet, only one of <code>TargetSpotCapacity</code> and
     *        <code>TargetOnDemandCapacity</code> can be specified, and its value must be 1.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withTargetSpotCapacity(Integer targetSpotCapacity) {
        setTargetSpotCapacity(targetSpotCapacity);
        return this;
    }

    /**
     * <p>
     * The number of On-Demand units that have been provisioned for the instance fleet to fulfill
     * <code>TargetOnDemandCapacity</code>. This provisioned capacity might be less than or greater than
     * <code>TargetOnDemandCapacity</code>.
     * </p>
     * 
     * @param provisionedOnDemandCapacity
     *        The number of On-Demand units that have been provisioned for the instance fleet to fulfill
     *        <code>TargetOnDemandCapacity</code>. This provisioned capacity might be less than or greater than
     *        <code>TargetOnDemandCapacity</code>.
     */

    public void setProvisionedOnDemandCapacity(Integer provisionedOnDemandCapacity) {
        this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units that have been provisioned for the instance fleet to fulfill
     * <code>TargetOnDemandCapacity</code>. This provisioned capacity might be less than or greater than
     * <code>TargetOnDemandCapacity</code>.
     * </p>
     * 
     * @return The number of On-Demand units that have been provisioned for the instance fleet to fulfill
     *         <code>TargetOnDemandCapacity</code>. This provisioned capacity might be less than or greater than
     *         <code>TargetOnDemandCapacity</code>.
     */

    public Integer getProvisionedOnDemandCapacity() {
        return this.provisionedOnDemandCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units that have been provisioned for the instance fleet to fulfill
     * <code>TargetOnDemandCapacity</code>. This provisioned capacity might be less than or greater than
     * <code>TargetOnDemandCapacity</code>.
     * </p>
     * 
     * @param provisionedOnDemandCapacity
     *        The number of On-Demand units that have been provisioned for the instance fleet to fulfill
     *        <code>TargetOnDemandCapacity</code>. This provisioned capacity might be less than or greater than
     *        <code>TargetOnDemandCapacity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withProvisionedOnDemandCapacity(Integer provisionedOnDemandCapacity) {
        setProvisionedOnDemandCapacity(provisionedOnDemandCapacity);
        return this;
    }

    /**
     * <p>
     * The number of Spot units that have been provisioned for this instance fleet to fulfill
     * <code>TargetSpotCapacity</code>. This provisioned capacity might be less than or greater than
     * <code>TargetSpotCapacity</code>.
     * </p>
     * 
     * @param provisionedSpotCapacity
     *        The number of Spot units that have been provisioned for this instance fleet to fulfill
     *        <code>TargetSpotCapacity</code>. This provisioned capacity might be less than or greater than
     *        <code>TargetSpotCapacity</code>.
     */

    public void setProvisionedSpotCapacity(Integer provisionedSpotCapacity) {
        this.provisionedSpotCapacity = provisionedSpotCapacity;
    }

    /**
     * <p>
     * The number of Spot units that have been provisioned for this instance fleet to fulfill
     * <code>TargetSpotCapacity</code>. This provisioned capacity might be less than or greater than
     * <code>TargetSpotCapacity</code>.
     * </p>
     * 
     * @return The number of Spot units that have been provisioned for this instance fleet to fulfill
     *         <code>TargetSpotCapacity</code>. This provisioned capacity might be less than or greater than
     *         <code>TargetSpotCapacity</code>.
     */

    public Integer getProvisionedSpotCapacity() {
        return this.provisionedSpotCapacity;
    }

    /**
     * <p>
     * The number of Spot units that have been provisioned for this instance fleet to fulfill
     * <code>TargetSpotCapacity</code>. This provisioned capacity might be less than or greater than
     * <code>TargetSpotCapacity</code>.
     * </p>
     * 
     * @param provisionedSpotCapacity
     *        The number of Spot units that have been provisioned for this instance fleet to fulfill
     *        <code>TargetSpotCapacity</code>. This provisioned capacity might be less than or greater than
     *        <code>TargetSpotCapacity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withProvisionedSpotCapacity(Integer provisionedSpotCapacity) {
        setProvisionedSpotCapacity(provisionedSpotCapacity);
        return this;
    }

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet. Up to five unique instance
     * specifications may be defined for each instance fleet.
     * </p>
     * 
     * @return The specification for the instance types that comprise an instance fleet. Up to five unique instance
     *         specifications may be defined for each instance fleet.
     */

    public java.util.List<InstanceTypeSpecification> getInstanceTypeSpecifications() {
        if (instanceTypeSpecifications == null) {
            instanceTypeSpecifications = new com.amazonaws.internal.SdkInternalList<InstanceTypeSpecification>();
        }
        return instanceTypeSpecifications;
    }

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet. Up to five unique instance
     * specifications may be defined for each instance fleet.
     * </p>
     * 
     * @param instanceTypeSpecifications
     *        The specification for the instance types that comprise an instance fleet. Up to five unique instance
     *        specifications may be defined for each instance fleet.
     */

    public void setInstanceTypeSpecifications(java.util.Collection<InstanceTypeSpecification> instanceTypeSpecifications) {
        if (instanceTypeSpecifications == null) {
            this.instanceTypeSpecifications = null;
            return;
        }

        this.instanceTypeSpecifications = new com.amazonaws.internal.SdkInternalList<InstanceTypeSpecification>(instanceTypeSpecifications);
    }

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet. Up to five unique instance
     * specifications may be defined for each instance fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypeSpecifications(java.util.Collection)} or
     * {@link #withInstanceTypeSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceTypeSpecifications
     *        The specification for the instance types that comprise an instance fleet. Up to five unique instance
     *        specifications may be defined for each instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withInstanceTypeSpecifications(InstanceTypeSpecification... instanceTypeSpecifications) {
        if (this.instanceTypeSpecifications == null) {
            setInstanceTypeSpecifications(new com.amazonaws.internal.SdkInternalList<InstanceTypeSpecification>(instanceTypeSpecifications.length));
        }
        for (InstanceTypeSpecification ele : instanceTypeSpecifications) {
            this.instanceTypeSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet. Up to five unique instance
     * specifications may be defined for each instance fleet.
     * </p>
     * 
     * @param instanceTypeSpecifications
     *        The specification for the instance types that comprise an instance fleet. Up to five unique instance
     *        specifications may be defined for each instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withInstanceTypeSpecifications(java.util.Collection<InstanceTypeSpecification> instanceTypeSpecifications) {
        setInstanceTypeSpecifications(instanceTypeSpecifications);
        return this;
    }

    /**
     * <p>
     * Describes the launch specification for an instance fleet.
     * </p>
     * 
     * @param launchSpecifications
     *        Describes the launch specification for an instance fleet.
     */

    public void setLaunchSpecifications(InstanceFleetProvisioningSpecifications launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
    }

    /**
     * <p>
     * Describes the launch specification for an instance fleet.
     * </p>
     * 
     * @return Describes the launch specification for an instance fleet.
     */

    public InstanceFleetProvisioningSpecifications getLaunchSpecifications() {
        return this.launchSpecifications;
    }

    /**
     * <p>
     * Describes the launch specification for an instance fleet.
     * </p>
     * 
     * @param launchSpecifications
     *        Describes the launch specification for an instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleet withLaunchSpecifications(InstanceFleetProvisioningSpecifications launchSpecifications) {
        setLaunchSpecifications(launchSpecifications);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInstanceFleetType() != null)
            sb.append("InstanceFleetType: ").append(getInstanceFleetType()).append(",");
        if (getTargetOnDemandCapacity() != null)
            sb.append("TargetOnDemandCapacity: ").append(getTargetOnDemandCapacity()).append(",");
        if (getTargetSpotCapacity() != null)
            sb.append("TargetSpotCapacity: ").append(getTargetSpotCapacity()).append(",");
        if (getProvisionedOnDemandCapacity() != null)
            sb.append("ProvisionedOnDemandCapacity: ").append(getProvisionedOnDemandCapacity()).append(",");
        if (getProvisionedSpotCapacity() != null)
            sb.append("ProvisionedSpotCapacity: ").append(getProvisionedSpotCapacity()).append(",");
        if (getInstanceTypeSpecifications() != null)
            sb.append("InstanceTypeSpecifications: ").append(getInstanceTypeSpecifications()).append(",");
        if (getLaunchSpecifications() != null)
            sb.append("LaunchSpecifications: ").append(getLaunchSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleet == false)
            return false;
        InstanceFleet other = (InstanceFleet) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInstanceFleetType() == null ^ this.getInstanceFleetType() == null)
            return false;
        if (other.getInstanceFleetType() != null && other.getInstanceFleetType().equals(this.getInstanceFleetType()) == false)
            return false;
        if (other.getTargetOnDemandCapacity() == null ^ this.getTargetOnDemandCapacity() == null)
            return false;
        if (other.getTargetOnDemandCapacity() != null && other.getTargetOnDemandCapacity().equals(this.getTargetOnDemandCapacity()) == false)
            return false;
        if (other.getTargetSpotCapacity() == null ^ this.getTargetSpotCapacity() == null)
            return false;
        if (other.getTargetSpotCapacity() != null && other.getTargetSpotCapacity().equals(this.getTargetSpotCapacity()) == false)
            return false;
        if (other.getProvisionedOnDemandCapacity() == null ^ this.getProvisionedOnDemandCapacity() == null)
            return false;
        if (other.getProvisionedOnDemandCapacity() != null && other.getProvisionedOnDemandCapacity().equals(this.getProvisionedOnDemandCapacity()) == false)
            return false;
        if (other.getProvisionedSpotCapacity() == null ^ this.getProvisionedSpotCapacity() == null)
            return false;
        if (other.getProvisionedSpotCapacity() != null && other.getProvisionedSpotCapacity().equals(this.getProvisionedSpotCapacity()) == false)
            return false;
        if (other.getInstanceTypeSpecifications() == null ^ this.getInstanceTypeSpecifications() == null)
            return false;
        if (other.getInstanceTypeSpecifications() != null && other.getInstanceTypeSpecifications().equals(this.getInstanceTypeSpecifications()) == false)
            return false;
        if (other.getLaunchSpecifications() == null ^ this.getLaunchSpecifications() == null)
            return false;
        if (other.getLaunchSpecifications() != null && other.getLaunchSpecifications().equals(this.getLaunchSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInstanceFleetType() == null) ? 0 : getInstanceFleetType().hashCode());
        hashCode = prime * hashCode + ((getTargetOnDemandCapacity() == null) ? 0 : getTargetOnDemandCapacity().hashCode());
        hashCode = prime * hashCode + ((getTargetSpotCapacity() == null) ? 0 : getTargetSpotCapacity().hashCode());
        hashCode = prime * hashCode + ((getProvisionedOnDemandCapacity() == null) ? 0 : getProvisionedOnDemandCapacity().hashCode());
        hashCode = prime * hashCode + ((getProvisionedSpotCapacity() == null) ? 0 : getProvisionedSpotCapacity().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypeSpecifications() == null) ? 0 : getInstanceTypeSpecifications().hashCode());
        hashCode = prime * hashCode + ((getLaunchSpecifications() == null) ? 0 : getLaunchSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public InstanceFleet clone() {
        try {
            return (InstanceFleet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceFleetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
